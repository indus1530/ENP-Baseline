package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.form;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionA3Binding;

public class SectionA3Activity extends AppCompatActivity {

    ActivitySectionA3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a3);
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
    }
}