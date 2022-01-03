package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.familyMember;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionA2Binding;

public class SectionA2Activity extends AppCompatActivity {

    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        bi.setFamilymember(familyMember);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);


    }
}