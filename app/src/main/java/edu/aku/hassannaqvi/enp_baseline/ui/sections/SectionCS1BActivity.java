package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.childOfSelectedMWRAList;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.ecdInfo;

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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionCs1BBinding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionCS1BActivity extends AppCompatActivity {

    private static final String TAG = "SectionCS1Bctivity";
    ActivitySectionCs1BBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
//        child_count = getIntent().getExtras().getInt("ecdCount");
        // MainApp.ecdCount++;
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cs1_b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;


//        if (MainApp.mwra == null) MainApp.mwra = new MWRA();

        Integer childSno = childOfSelectedMWRAList.get(0);
        String childName = MainApp.familyList.get(childSno - 1).getHl2();
        try {
            // ecdInfo = db.getECDataByUUid(++MainApp.ecdCount);
            ecdInfo = db.getECDataByUUid(childSno);
            ecdInfo.notifyChange();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ECDInfo): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (ecdInfo.getUid().equals("")) {
            ecdInfo.setCs1q02c1(String.valueOf(childSno));
            ecdInfo.setCs1q02c1n(String.valueOf(childName));
        }
        bi.setEcdInfo(ecdInfo);

        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }
/*

    private void populateSpinner() {

        // Populate Children of selectedMWRA
        childNames = new ArrayList<>();
        ChildSno = new ArrayList<>();

        childNames.add("...");
        ChildSno.add("...");

        for (FamilyMembers child : MainApp.familyList) {

            if(child.getHl8().equals(MainApp.selectedMWRA)) {
                childNames.add(child.getHl2());
                ChildSno.add(child.getHl1());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionCS1BActivity.this,
                R.layout.custom_spinner, childNames);

        bi.cs1q02c1n.setAdapter(adapter);

        bi.cs1q02c1n.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.cs1q02c1.setText(null);

                if (position == 0) return;

                bi.cs1q02c1.setText(ChildSno.get(position-1));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
*/

    private boolean insertNewRecord() {
        if (!ecdInfo.getUid().equals("") || MainApp.superuser) return true;
        MainApp.ecdInfo.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addEcdInfo(ecdInfo);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ecdInfo.setId(String.valueOf(rowId));
        if (rowId > 0) {
            ecdInfo.setUid(ecdInfo.getDeviceId() + ecdInfo.getId());
            db.updatesECDColumn(TableContracts.ECDInfoTable.COLUMN_UID, ecdInfo.getUid());
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
            updcount = db.updatesECDColumn(TableContracts.ECDInfoTable.COLUMN_ECDINFO, ecdInfo.ecdInfotoString());
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
        saveDraft();
        if (updateDB()) {
            childOfSelectedMWRAList.remove(0);
            finish();
            Log.d(TAG, "btnContinue: " + childOfSelectedMWRAList.size());
            if (childOfSelectedMWRAList.size() > 0) {
                startActivity(new Intent(this, SectionCS1BActivity.class));
            } else {
                startActivity(new Intent(this, SectionCS1CActivity.class));
            }

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