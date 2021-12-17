package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.childOfSelectedMWRAList;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionCs1ABinding;
import edu.aku.hassannaqvi.enp_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;


public class SectionCS1AActivity extends AppCompatActivity {
    private static final String TAG = "SectionCS1AActivity";
    ActivitySectionCs1ABinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs1_a);
        db = MainApp.appInfo.dbHelper;
        try {
            MainApp.child = db.getChildByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

//        if (MainApp.mwra == null) MainApp.mwra = new MWRA();

        child.setCs1q0101(MainApp.mwra.getBs1resp());
        child.setCs1q0102(MainApp.mwra.getBs1respline());

        bi.setChild(child);
        setSupportActionBar(bi.toolbar);


        childOfSelectedMWRAList = new ArrayList<>();
        for (FamilyMembers child : MainApp.familyList) {
            Log.d(TAG, "onCreate: childmsno " + child.getHl8() + " fmsno: " + (Integer.parseInt(MainApp.selectedMWRA) + 1));

            int motherSno = Integer.parseInt(child.getHl8());
            int selectedMwraSno = Integer.parseInt(MainApp.selectedMWRA) + 1;

            // All children for EDC, Available or Not
            // Removed Condition: && child.getHl10().equals("1")
            if (motherSno == selectedMwraSno && Integer.parseInt(child.getHl6y()) < 5) {
                childOfSelectedMWRAList.add(Integer.valueOf(child.getHl1()));
            }
        }

        child.setCs1q02(String.valueOf(childOfSelectedMWRAList.size()));

        // Mother's Name as Respondent
        /*bi.cs1q0101.setText(MainApp.mwra.getBs1resp());
        bi.cs1q0102.setText(MainApp.mwra.getBs1respline());*/
        //   child = new Child();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }


    private boolean insertNewRecord() {
        if (!child.getUid().equals("") || MainApp.superuser) return true;
        child.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChild(child);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        child.setId(String.valueOf(rowId));
        if (rowId > 0) {
            child.setUid(child.getDeviceId() + child.getId());
            db.updatesChildColumn(TableContracts.ChildTable.COLUMN_UID, child.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SC1, child.sC1toString());
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
            finish();
            //startActivity(new Intent(this, SectionCS2Activity.class).putExtra("complete", true));
            startActivity(new Intent(this, SectionCS1BActivity.class));

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