package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.adolListAll;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.mwra;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.preg1st;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.recipient;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionC1Binding;
import edu.aku.hassannaqvi.enp_baseline.models.MWRA;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionC1Activity extends AppCompatActivity {


    private static final String TAG = "SectionC1Activity";
    ActivitySectionC1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        try {
            MainApp.mwra = db.getMwraByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (MainApp.mwra == null) MainApp.mwra = new MWRA();
        bi.setMwra(MainApp.mwra);
        mwra.setC103(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getA201());
        mwra.setC101(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getA202());
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");


        for (Integer a : recipient) {

            if (!MainApp.familyList.get(a - 1).getIndexed().equals("")) {
                adolListAll.add(a);
            }

        }
        for (Integer a : preg1st) {

            if (!MainApp.familyList.get(a - 1).getIndexed().equals("")) {
                adolListAll.add(a);
            }

        }
        bi.c104.setMaxvalue(Float.parseFloat(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getA206y()));
    }


    private void setupSkips() {

        bi.c104.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.c104.getText().toString().isEmpty()) return;
                bi.c110.setMinvalue(Float.parseFloat(bi.c104.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.c106.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.c106.getText().toString().isEmpty()) return;
                bi.c107.setMaxvalue(Float.parseFloat(bi.c106.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.c107.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.c107.getText().toString().isEmpty()) return;
                bi.c108.setMaxvalue(Float.parseFloat(bi.c107.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }


    private boolean insertNewRecord() {
        if (!mwra.getUid().equals("") || MainApp.superuser) return true;
        mwra.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addMWRA(mwra);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        mwra.setId(String.valueOf(rowId));
        if (rowId > 0) {
            mwra.setUid(mwra.getDeviceId() + mwra.getId());
            db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_UID, mwra.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SC1, mwra.sC1toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionC2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }



    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!mwra.getC112wk().isEmpty() && !mwra.getC112mm().isEmpty()) {
            if (Integer.parseInt(mwra.getC112wk()) + Integer.parseInt(mwra.getC112mm()) == 0)
                return Validator.emptyCustomTextBox(this, bi.c112wk, "All Values Can't be zero");
        }
        if (!mwra.getC116w().isEmpty() && !mwra.getC116m().isEmpty()) {
            if (Integer.parseInt(mwra.getC116w()) + Integer.parseInt(mwra.getC116m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.c116w, "All Values Can't be zero");
        }
        return true;
    }
}