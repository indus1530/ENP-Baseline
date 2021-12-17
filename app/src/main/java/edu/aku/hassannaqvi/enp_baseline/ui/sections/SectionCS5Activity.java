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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionCs5Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionCS5Activity extends AppCompatActivity {
    private static final String TAG = "SectionCS5Activity";
    ActivitySectionCs5Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs5);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        child.setCs5q01(MainApp.ageOfIndexChild < 2 ? "1" : "2");

        if (MainApp.superuser) {
            bi.btnContinue.setText("Review Next");
        }
        bi.setChild(child);

        bi.cs5inst1.setText(String.format(getResources().getString(R.string.cs5inst1), selectedChildName));
        bi.cs5q02info.setText(String.format(getResources().getString(R.string.cs5q02info), selectedChildName));
        bi.cs5q03info.setText(String.format(getResources().getString(R.string.cs5q03info), selectedChildName));
        bi.cs5q04info.setText(String.format(getResources().getString(R.string.cs5q04info), selectedChildName));
        bi.cs5inst2.setText(String.format(getResources().getString(R.string.cs5inst2), selectedChildName));
        bi.cs5q06ainfo.setText(String.format(getResources().getString(R.string.cs5q06ainfo), selectedChildName));
        bi.cs5q06binfo.setText(String.format(getResources().getString(R.string.cs5q06binfo), selectedChildName));
        bi.cs5q08ainfo.setText(String.format(getResources().getString(R.string.cs5q08ainfo), selectedChildName));
        bi.cs5q08binfo.setText(String.format(getResources().getString(R.string.cs5q08binfo), selectedChildName));
        bi.cs5q10info.setText(String.format(getResources().getString(R.string.cs5q10info), selectedChildName));
        bi.cs5q11info.setText(String.format(getResources().getString(R.string.cs5q11info), selectedChildName));
        bi.cs5q12info.setText(String.format(getResources().getString(R.string.cs5q12info), selectedChildName));
        bi.cs5q13info.setText(String.format(getResources().getString(R.string.cs5q13info), selectedChildName));
        bi.cs5q14info.setText(String.format(getResources().getString(R.string.cs5q14info), selectedChildName));
        bi.cs5q15info.setText(String.format(getResources().getString(R.string.cs5q15info), selectedChildName));
        bi.cs5q16info.setText(String.format(getResources().getString(R.string.cs5q16info), selectedChildName));
        bi.cs5q17info.setText(String.format(getResources().getString(R.string.cs5q17info), selectedChildName));
        bi.cs5q18info.setText(String.format(getResources().getString(R.string.cs5q18info), selectedChildName));
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SC5, child.sC5toString());
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
            startActivity(new Intent(this, SectionDS1Activity.class));
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