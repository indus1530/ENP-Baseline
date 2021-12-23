package edu.aku.hassannaqvi.enp_baseline;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.AndroidManager;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.enp_baseline.models.Child;
import edu.aku.hassannaqvi.enp_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.enp_baseline.models.Form;
import edu.aku.hassannaqvi.enp_baseline.models.LateAdolescent;
import edu.aku.hassannaqvi.enp_baseline.models.MWRA;
import edu.aku.hassannaqvi.enp_baseline.models.MotherKAP;
import edu.aku.hassannaqvi.enp_baseline.ui.IdentificationActivity;
import edu.aku.hassannaqvi.enp_baseline.ui.SyncActivity;
import edu.aku.hassannaqvi.enp_baseline.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.enp_baseline.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.enp_baseline.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.enp_baseline.ui.sections.ConsentActivity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
            case R.id.startDataEntry:

                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
        /*    case R.id.openAnthro:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;*/
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAS1Activity.class));
                break;
            case R.id.seca2:
                MainApp.familyMember = new FamilyMembers();
                startActivity(new Intent(this, SectionAS2Activity.class));
                break;

            case R.id.seca3:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS1AActivity.class));
                break;
            case R.id.secb1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS2Activity.class));
                break;
            case R.id.secc1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS3Activity.class));
                break;
            case R.id.secc2:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS4AActivity.class));
                break;
            case R.id.secd1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS4BActivity.class));
                break;
            case R.id.sece1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS5Activity.class));
                break;
            case R.id.secf1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS6Activity.class));
                break;
            case R.id.secf2:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionBS7Activity.class));
                break;
            case R.id.secf3:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS1AActivity.class));
                break;
            case R.id.secg1:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS2Activity.class));
                break;
            case R.id.secg2:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS3AActivity.class));
                break;
            case R.id.secg3:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS3BActivity.class));
                break;
            case R.id.secg4:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS4Activity.class));
                break;
            case R.id.secg5:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionCS5Activity.class));
                break;
            case R.id.secg6:
                MainApp.motherKAP = new MotherKAP();
                startActivity(new Intent(this, SectionDS1Activity.class));
                break;
            case R.id.secg7:
                MainApp.motherKAP = new MotherKAP();
                startActivity(new Intent(this, SectionDS2Activity.class));
                break;
            case R.id.d3:
                MainApp.motherKAP = new MotherKAP();
                startActivity(new Intent(this, SectionDS3Activity.class));
                break;
            case R.id.e1:
                MainApp.ladol = new LateAdolescent();
                startActivity(new Intent(this, SectionES1Activity.class));
                break;
            case R.id.e2:
                MainApp.ladol = new LateAdolescent();
                startActivity(new Intent(this, SectionES2Activity.class));
                break;
            case R.id.e3:
                MainApp.ladol = new LateAdolescent();
                startActivity(new Intent(this, SectionES3Activity.class));
                break;
            case R.id.e4:
                MainApp.ladol = new LateAdolescent();
                startActivity(new Intent(this, SectionES4Activity.class));
                break;
            case R.id.con:
                MainApp.form = new Form();
                startActivity(new Intent(this, ConsentActivity.class));
                break;
            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

}