package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.modc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionC1Binding;

public class SectionC1Activity extends AppCompatActivity {

    ActivitySectionC1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c1);
        bi.setModc(modc);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
    }
}