package edu.aku.hassannaqvi.enp_baseline.ui.sections;


import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.adolListAll;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.ladol;

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
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts.LateAdolescentTable;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionEs1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionES1Activity extends AppCompatActivity {
    private static final String TAG = "SectionES1Activity";
    ActivitySectionEs1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> adolNames, adolCodes, adolAges, adolFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_es1);
        bi.setLadol(MainApp.ladol);
        bi.age.setText(getIntent().getStringExtra("age"));
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        //populateSpinner();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }


   /* private void populateSpinner() {

        // Populate Provinces

        adolNames = new ArrayList<>();
        adolCodes = new ArrayList<>();
        adolAges = new ArrayList<>();
        adolFmUID = new ArrayList<>();

        adolNames.add("...");
        adolCodes.add("");
        adolAges.add("");
        adolFmUID.add("");

        for (Integer a : adolListAll) {

            adolNames.add(MainApp.familyList.get(a - 1).getHl2());
            adolCodes.add(MainApp.familyList.get(a - 1).getHl1());
            adolAges.add(MainApp.familyList.get(a - 1).getHl6y());
            adolFmUID.add(MainApp.familyList.get(a - 1).getUid());


        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionES1Activity.this,
                R.layout.custom_spinner, adolNames);

        bi.es1resp.setAdapter(adapter);
 *//*       bi.es1resp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ladol.setEs1respline(adolCodes.get(bi.es1resp.getSelectedItemPosition()));
                ladol.setFmuid(adolFmUID.get(bi.es1resp.getSelectedItemPosition()));
                bi.age.setText(adolAges.get(bi.es1resp.getSelectedItemPosition()));
                if (position == 0) return;
                if (Integer.parseInt(adolAges.get(bi.es1resp.getSelectedItemPosition())) >= 18) {
                    bi.fldGrpCVes1cons.setVisibility(View.GONE);
                    ladol.setEs1cons("99");
                } else {
                    bi.fldGrpCVes1cons.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*//*
        bi.es1resp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //ladol = new LateAdolescent();
                // bi.age.setText("");
                // bi.es1respline.setText("");
                bi.age.setText(adolAges.get(bi.es1resp.getSelectedItemPosition()));

                //  if (position == 0) return;
                try {
                    MainApp.ladol = db.getLateAdolByUUID(adolFmUID.get(bi.es1resp.getSelectedItemPosition()));
                    //  ladol.notifyChange();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionES1Activity.this, "JSONException(LateAdolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }

                if (ladol.getUid().equals("")) {
                    ladol.setEs1resp(adolNames.get(bi.es1resp.getSelectedItemPosition()));
                    ladol.setEs1respline(adolCodes.get(bi.es1resp.getSelectedItemPosition()));
                    ladol.setFmuid(adolFmUID.get(bi.es1resp.getSelectedItemPosition()));
                    //ladol.notifyChange();
                }
                bi.setLadol(ladol);
*//*                if (Integer.parseInt(adolAges.get(bi.es1resp.getSelectedItemPosition())) >= 18) {
                    bi.fldGrpCVes1cons.setVisibility(View.GONE);
                    ladol.setEs1cons("99");
                } else {
                    bi.fldGrpCVes1cons.setVisibility(View.VISIBLE);
                }*//*
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }*/

    private boolean insertNewRecord() {

        if (!ladol.getUid().equals("") || MainApp.superuser) return true;

        ladol.populateMeta();


        long rowId = 0;
        try {
            rowId = db.addAdolescent(ladol);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        ladol.setId(String.valueOf(rowId));
        if (rowId > 0) {
            ladol.setUid(ladol.getDeviceId() + ladol.getId());
            db.updatesAdolColumn(LateAdolescentTable.COLUMN_UID, ladol.getUid());
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
            updcount = db.updatesAdolColumn(TableContracts.LateAdolescentTable.COLUMN_SE1, ladol.sE1toString());
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
            //  adolListAll.remove(bi.es1resp.getSelectedItemPosition() - 1);

            finish();
            if (ladol.getEs1cons().equals("2") || ladol.getEs1cons1().equals("2")) {
//                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

                if (adolListAll.size() > 0) {
                    startActivity(new Intent(this, AdolSelectionActivity.class));
                } else {
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }
            } else {
                startActivity(new Intent(this, SectionES2Activity.class));
            }


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