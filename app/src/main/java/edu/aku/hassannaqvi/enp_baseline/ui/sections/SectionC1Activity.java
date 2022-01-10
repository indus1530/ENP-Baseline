package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.modc;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionC1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionC1Activity extends AppCompatActivity {


    private static final String TAG = "SectionC1Activity";
    ActivitySectionC1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        bi.setModc(modc);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);

        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
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


    private boolean updateDB() {
        /*if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SB42, mwra.sB42toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionC2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!modc.getC112wk().isEmpty() && !modc.getC112mm().isEmpty()) {
            if (Integer.parseInt(modc.getC112wk()) + Integer.parseInt(modc.getC112mm()) == 0)
                return Validator.emptyCustomTextBox(this, bi.c112wk, "All Values Can't be zero");
        }
        if (!modc.getC116w().isEmpty() && !modc.getC116m().isEmpty()) {
            if (Integer.parseInt(modc.getC116w()) + Integer.parseInt(modc.getC116m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.c116w, "All Values Can't be zero");
        }
        return true;
    }
}