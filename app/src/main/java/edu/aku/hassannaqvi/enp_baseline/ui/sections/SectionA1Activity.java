package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.form;
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

import org.json.JSONException;

import java.util.Calendar;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionA1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;
import edu.aku.hassannaqvi.enp_baseline.ui.lists.FamilyMembersListActivity;

public class SectionA1Activity extends AppCompatActivity {
    private static final String TAG = "SectionA1Activity";
    ActivitySectionA1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a1);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }


    private void setupSkips() {

        bi.a108y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.a108y.getText().toString().isEmpty()) return;
                bi.a108d.setMinvalue(Integer.parseInt(bi.a108y.getText().toString()) == 2021 ? 10f : 1f);
                bi.a108m.setMinvalue(Integer.parseInt(bi.a108y.getText().toString()) == 2021 ? 12f : 1f);
                bi.a108d.setMaxvalue(Integer.parseInt(bi.a108y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
                bi.a108m.setMaxvalue(Integer.parseInt(bi.a108y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    private boolean insertNewRecord() {
        if (!MainApp.form.getUid().equals("") || MainApp.superuser) return true;

        MainApp.form.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addForm(MainApp.form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.form.setUid(MainApp.form.getDeviceId() + MainApp.form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, MainApp.form.getUid());
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
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA1, MainApp.form.sA1toString());
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
            Intent i;
            if (form.getA112().equals("2")
                    || form.getA113().equals("2")
                    || form.getA114().equals("2")) {
                i = new Intent(this, EndingActivity.class).putExtra("complete", false);
            } else {
                i = new Intent(this, FamilyMembersListActivity.class);
            }
            finish();
            startActivity(i);
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