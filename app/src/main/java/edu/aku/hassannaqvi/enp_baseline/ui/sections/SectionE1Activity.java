package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.mode;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionE1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionE1Activity extends AppCompatActivity {

    private static final String TAG = "SectionE1Activity";
    ActivitySectionE1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1);
        bi.setForm(mode);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {

        bi.e103.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.e103.getText().toString().isEmpty()) return;
                bi.e104.setMinvalue(Integer.parseInt(bi.e104.getText().toString()));
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
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionE2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!mode.getE107w().isEmpty() && !mode.getE107m().isEmpty()) {
            if (Integer.parseInt(mode.getE107w()) + Integer.parseInt(mode.getE107m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.e107w, "All Values Can't be zero");
        }
        if (!mode.getE111w().isEmpty() && !mode.getE111m().isEmpty()) {
            if (Integer.parseInt(mode.getE111w()) + Integer.parseInt(mode.getE111m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.e111w, "All Values Can't be zero");
        }
        return true;
    }
}