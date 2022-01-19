package edu.aku.hassannaqvi.enp_baseline.ui.sections;


import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.rcpt;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionB2Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;



public class SectionB2Activity extends AppCompatActivity {

    private static final String TAG = "SectionB2Activity";
    ActivitySectionB2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b2);
        bi.setRcpt(rcpt);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);

        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");

    }

    private void setupSkips() {
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_SB2, rcpt.sB2toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionC1Activity.class));
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
        if (!rcpt.getB202w().isEmpty() && !rcpt.getB202m().isEmpty() && !rcpt.getB202y().isEmpty()) {
            if (Integer.parseInt(rcpt.getB202w()) + Integer.parseInt(rcpt.getB202m()) + Integer.parseInt(rcpt.getB202y()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b202w, "All Values Can't be zero");
        }
        if (!rcpt.getB204w().isEmpty() && !rcpt.getB204m().isEmpty()) {
            if (Integer.parseInt(rcpt.getB204w()) + Integer.parseInt(rcpt.getB204m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b204w, "All Values Can't be zero");
        }
        if (!rcpt.getB21201().isEmpty() && !rcpt.getB21202().isEmpty()) {
            if (Integer.parseInt(rcpt.getB21201()) + Integer.parseInt(rcpt.getB21202()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b21101, "All Values Can't be zero");
        }
        if (!rcpt.getB222h().isEmpty() && !rcpt.getB222m().isEmpty()) {
            if (Integer.parseInt(rcpt.getB222h()) + Integer.parseInt(rcpt.getB222m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b222h, "All Values Can't be zero");
        }
        return true;
    }

}