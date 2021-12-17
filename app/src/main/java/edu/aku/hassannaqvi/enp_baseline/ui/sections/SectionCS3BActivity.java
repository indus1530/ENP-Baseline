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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionCs3bBinding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionCS3BActivity extends AppCompatActivity {
    private static final String TAG = "SectionCS3BActivity";
    ActivitySectionCs3bBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs3b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        child.setCs3bq04(MainApp.ageOfIndexChild < 2 ? "1" : "2");
        child.setCs3bq06(MainApp.ageOfIndexChild < 3 ? "1" : "2");

        bi.setChild(child);
        if (MainApp.superuser) {
            bi.btnContinue.setText("Review Next");
        }


        bi.cs3bq01info.setText(String.format(getResources().getString(R.string.cs3bq01info), selectedChildName));
        bi.cs3bq02t1.setText(String.format(getResources().getString(R.string.cs3bq02t1), selectedChildName));
        bi.cs3bq03info.setText(String.format(getResources().getString(R.string.cs3bq03info), selectedChildName));
        bi.cs3bq05t1.setText(String.format(getResources().getString(R.string.cs3bq05t1), selectedChildName));
        bi.cs3bq05t3.setText(String.format(getResources().getString(R.string.cs3bq05t3), selectedChildName));
        bi.cs3bq05ainfo.setText(String.format(getResources().getString(R.string.cs3bq05ainfo), selectedChildName));
        bi.cs3bq05ainfo.setText(String.format(getResources().getString(R.string.cs3bq05ainfo), selectedChildName));
        bi.cs3bq05binfo.setText(String.format(getResources().getString(R.string.cs3bq05binfo), selectedChildName));
        bi.cs3bq05cinfo.setText(String.format(getResources().getString(R.string.cs3bq05cinfo), selectedChildName));
        bi.cs3bq05dinfo.setText(String.format(getResources().getString(R.string.cs3bq05dinfo), selectedChildName));
        bi.cs3bq05einfo.setText(String.format(getResources().getString(R.string.cs3bq05einfo), selectedChildName));
        bi.cs3bq05finfo.setText(String.format(getResources().getString(R.string.cs3bq05finfo), selectedChildName));
        bi.cs3bq07t.setText(String.format(getResources().getString(R.string.cs3bq07t), selectedChildName));
        bi.cs3bq07info.setText(String.format(getResources().getString(R.string.cs3bq07info), selectedChildName));
        bi.cs3bq08info.setText(String.format(getResources().getString(R.string.cs3bq08info), selectedChildName));
        bi.cs3bq09info.setText(String.format(getResources().getString(R.string.cs3bq09info), selectedChildName));
        bi.cs3bq10info.setText(String.format(getResources().getString(R.string.cs3bq10info), selectedChildName));
        bi.cs3bq11info.setText(String.format(getResources().getString(R.string.cs3bq11info), selectedChildName));
        bi.cs3bq12info.setText(String.format(getResources().getString(R.string.cs3bq12info), selectedChildName));
        bi.cs3bq13info.setText(String.format(getResources().getString(R.string.cs3bq13info), selectedChildName));
        bi.cs3bq14info.setText(String.format(getResources().getString(R.string.cs3bq14info), selectedChildName));
        bi.cs3bq15info.setText(String.format(getResources().getString(R.string.cs3bq15info), selectedChildName));
        bi.cs3bq16info.setText(String.format(getResources().getString(R.string.cs3bq16info), selectedChildName));

    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SC32, child.sC32toString());
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
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionCS4Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}