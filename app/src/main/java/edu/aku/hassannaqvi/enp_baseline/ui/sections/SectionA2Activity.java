package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.mwra;

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
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionA2Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionA2Activity extends AppCompatActivity {

    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        bi.setFamilymember(familyMember);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);


    }
}