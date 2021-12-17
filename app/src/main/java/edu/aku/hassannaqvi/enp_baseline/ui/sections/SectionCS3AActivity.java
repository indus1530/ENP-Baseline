package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.selectedChildName;

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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionCs3aBinding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionCS3AActivity extends AppCompatActivity {
    private static final String TAG = "SectionCS3AActivity";
    ActivitySectionCs3aBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs3a);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        if (MainApp.superuser) {
            bi.btnContinue.setText("Review Next");
        }

        bi.cs3aq01info.setText(String.format(getResources().getString(R.string.cs3aq01info), selectedChildName));
        bi.cs3aq02info.setText(String.format(getResources().getString(R.string.cs3aq02info), selectedChildName));
        bi.cs3aq03info.setText(String.format(getResources().getString(R.string.cs3aq03info), selectedChildName));
        bi.cs3aq04info.setText(String.format(getResources().getString(R.string.cs3aq04info), selectedChildName));
        bi.setChild(child);
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SC31, child.sC31toString());
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
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionCS3BActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}