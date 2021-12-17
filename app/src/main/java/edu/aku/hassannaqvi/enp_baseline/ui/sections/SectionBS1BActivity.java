package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.pregnancy;

import android.content.Intent;
import android.os.Bundle;
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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionBs1bBinding;
import edu.aku.hassannaqvi.enp_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionBS1BActivity extends AppCompatActivity {

    private static final String TAG = "PregnancyActivity";
    ActivitySectionBs1bBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_bs1b);
        db = MainApp.appInfo.getDbHelper();
        //MainApp.preg_count++;
        try {
            MainApp.pregnancy = db.getPregByUUid(String.valueOf(++MainApp.preg_count));
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Pregnancy): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        // DB returning pregnancy object thus not required
        // if (pregnancy == null) MainApp.pregnancy = new Pregnancy();
        bi.setPreg(MainApp.pregnancy);
        bi.sno.setText("Pregnancy: " + MainApp.preg_count + " of " + MainApp.mwra.getBs1q6());
        pregnancy.setSno(String.valueOf(MainApp.preg_count));
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {

        bi.bs1q7p1g.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.bs1q7p1g01) {
                bi.bs1q7p1b.setMinvalue(2f);
                bi.bs1q7p1b.setMaxvalue(8f);
            } else if (checkedId == R.id.bs1q7p1g02) {
                bi.bs1q7p1b.setMinvalue(0f);
                bi.bs1q7p1b.setMaxvalue(1f);
            }
        });
    }


    private boolean insertNewRecord() {
        if (!pregnancy.getUid().equals("") || MainApp.superuser) return true;
        MainApp.pregnancy.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPregnancy(pregnancy);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        pregnancy.setId(String.valueOf(rowId));
        if (rowId > 0) {
            pregnancy.setUid(pregnancy.getDeviceId() + pregnancy.getId());
            db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_UID, pregnancy.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        if (MainApp.superuser) return true;

        long updcount = 0;
        try {
            updcount = db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_SB1, pregnancy.sB1toString());
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
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            MainApp.pregnancy = new Pregnancy();
            finish();


            if (MainApp.totalPreg > MainApp.preg_count) {

              /*  pregnancy.setBs1q7p1g(null);
                pregnancy.setBs1q7p1d(null);
                pregnancy.setBs1q7p1d96x(null);
                pregnancy.setBs1q7p1b(null);*/
                startActivity(new Intent(this, SectionBS1BActivity.class));
            } else {
                startActivity(new Intent(this, SectionBS1CActivity.class));
            }
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}