package edu.aku.hassannaqvi.enp_baseline.ui.sections;


import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.rcpt;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionB1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionB1Activity extends AppCompatActivity {


    private static final String TAG = "SectionB1Activity";
    ActivitySectionB1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b1);
        bi.setRcpt(rcpt);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        rcpt.setB101(String.valueOf(MainApp.bCount + 1));
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }


    private boolean insertNewRecord() {
        if (!rcpt.getUid().equals("") || MainApp.superuser) return true;
        MainApp.rcpt.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addRecipient(MainApp.rcpt);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.rcpt.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.rcpt.setUid(MainApp.rcpt.getDeviceId() + MainApp.rcpt.getId());
            db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_UID, rcpt.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_SB1, rcpt.sB1toString());
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
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionB2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!rcpt.getB104y().isEmpty() && !rcpt.getB104m().isEmpty() && !rcpt.getB104w().isEmpty()) {
            if (Integer.parseInt(rcpt.getB104y()) + Integer.parseInt(rcpt.getB104m()) + Integer.parseInt(rcpt.getB104w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b104y, "All Values Can't be zero");
        }
        if (!rcpt.getB105y().isEmpty() && !rcpt.getB105m().isEmpty() && !rcpt.getB105w().isEmpty()) {
            if (Integer.parseInt(rcpt.getB105y()) + Integer.parseInt(rcpt.getB105m()) + Integer.parseInt(rcpt.getB105w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b105y, "All Values Can't be zero");
        }
        if (!rcpt.getB115h().isEmpty() && !rcpt.getB115m().isEmpty()) {
            if (Integer.parseInt(rcpt.getB115h()) + Integer.parseInt(rcpt.getB115m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b115h, "All Values Can't be zero");
        }
        return true;
    }
}