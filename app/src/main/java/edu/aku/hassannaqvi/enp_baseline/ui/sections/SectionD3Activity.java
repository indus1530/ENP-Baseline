package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.modd;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionD3Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionD3Activity extends AppCompatActivity {

    private static final String TAG = "SectionD3Activity";
    ActivitySectionD3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d3);
        bi.setForm(modd);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);

        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {
        setDefault(bi.d30501d, bi.d30501m, bi.d30501y);
        setDefault(bi.d30502d, bi.d30502m, bi.d30502y);
        setDefault(bi.d30503d, bi.d30503m, bi.d30503y);
        setDefault(bi.d30504d, bi.d30504m, bi.d30504y);
        setDefault(bi.d30505d, bi.d30505m, bi.d30505y);
        setDefault(bi.d30506d, bi.d30506m, bi.d30506y);
        setDefault(bi.d30507d, bi.d30507m, bi.d30507y);
        setDefault(bi.d30508d, bi.d30508m, bi.d30508y);
        setDefault(bi.d30509d, bi.d30509m, bi.d30509y);
        setDefault(bi.d30510d, bi.d30510m, bi.d30510y);
        setDefault(bi.d30511d, bi.d30511m, bi.d30511y);
        setDefault(bi.d30512d, bi.d30512m, bi.d30512y);
        setDefault(bi.d30513d, bi.d30513m, bi.d30513y);
        setDefault(bi.d30514d, bi.d30514m, bi.d30514y);
        setDefault(bi.d30515d, bi.d30515m, bi.d30515y);
        setDefault(bi.d30516d, bi.d30516m, bi.d30516y);
    }


    private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
        day.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (day.getText().toString().isEmpty()) return;
                mon.setEnabled(true);
                year.setEnabled(true);
                if (Integer.parseInt(day.getText().toString()) == 44) {
                    day.setRangedefaultvalue(44f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 66) {
                    day.setRangedefaultvalue(66f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 88) {
                    day.setRangedefaultvalue(88f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 97) {
                    day.setRangedefaultvalue(97f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    private boolean updateDB() {
        /*if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SB42, mwra.sB42toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionD4Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean validateDatesBCG(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;
        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() >= baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean validateDates(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;

        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() > baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {

        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (modd.getD302().equals("1")) {
            // Only set once
            // IM04 - DOB
            String dobDate = modd.getD304y()
                    + "-" + modd.getD304m()
                    + "-" + modd.getD304d();

            //D30501
            String d30501date = modd.getD30501y()
                    + "-" + modd.getD30501m()
                    + "-" + modd.getD30501d();
            if (!validateDatesBCG(dobDate, d30501date)) {
                return Validator.emptyCustomTextBox(this, bi.d30501y, "Vaccine Date Should be Greater Than DOB");
            }

            //D30502
            String d30502date = modd.getD30502y()
                    + "-" + modd.getD30502m()
                    + "-" + modd.getD30502d();
            if (!validateDatesBCG(dobDate, d30502date)) {
                return Validator.emptyCustomTextBox(this, bi.d30502y, "Vaccine Date Should be Greater Than DOB");
            }


            //week6
            String week6 = modd.getD30501y()
                    + "-" + modd.getD30501m()
                    + "-" + modd.getD30501d();

            // D30503
            String d30503date = modd.getD30503y()
                    + "-" + modd.getD30503m()
                    + "-" + modd.getD30503d();
            if (!validateDates(week6, d30503date)) {
                return Validator.emptyCustomTextBox(this, bi.d30503y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30504
            String d30504date = modd.getD30504y()
                    + "-" + modd.getD30504m()
                    + "-" + modd.getD30504d();
            if (!validateDates(week6, d30504date)) {
                return Validator.emptyCustomTextBox(this, bi.d30504y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30505
            String d30505date = modd.getD30505y()
                    + "-" + modd.getD30505m()
                    + "-" + modd.getD30505d();
            if (!validateDates(week6, d30505date)) {
                return Validator.emptyCustomTextBox(this, bi.d30505y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30506
            String d30506date = modd.getD30506y()
                    + "-" + modd.getD30506m()
                    + "-" + modd.getD30506d();
            if (!validateDates(week6, d30506date)) {
                return Validator.emptyCustomTextBox(this, bi.d30506y, "Vaccine Date Should be Greater Than BCG");
            }


            //week10
            String week10 = modd.getD30506y()
                    + "-" + modd.getD30506m()
                    + "-" + modd.getD30506d();

            // D30507
            String d30507date = modd.getD30507y()
                    + "-" + modd.getD30507m()
                    + "-" + modd.getD30507d();
            if (!validateDates(week10, d30507date)) {
                return Validator.emptyCustomTextBox(this, bi.d30507y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30508
            String d30508date = modd.getD30508y()
                    + "-" + modd.getD30508m()
                    + "-" + modd.getD30508d();
            if (!validateDates(week10, d30508date)) {
                return Validator.emptyCustomTextBox(this, bi.d30508y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30509
            String d30509date = modd.getD30509y()
                    + "-" + modd.getD30509m()
                    + "-" + modd.getD30509d();
            if (!validateDates(week10, d30509date)) {
                return Validator.emptyCustomTextBox(this, bi.d30509y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30510
            String d30510date = modd.getD30510y()
                    + "-" + modd.getD30510m()
                    + "-" + modd.getD30510d();
            if (!validateDates(week10, d30510date)) {
                return Validator.emptyCustomTextBox(this, bi.d30510y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }


            //week14
            String week14 = modd.getD30510y()
                    + "-" + modd.getD30510m()
                    + "-" + modd.getD30510d();

            // D30511
            String d30511date = modd.getD30511y()
                    + "-" + modd.getD30511m()
                    + "-" + modd.getD30511d();
            if (!validateDates(week14, d30511date)) {
                return Validator.emptyCustomTextBox(this, bi.d30511y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30512
            String d30512date = modd.getD30512y()
                    + "-" + modd.getD30512m()
                    + "-" + modd.getD30512d();
            if (!validateDates(week14, d30512date)) {
                return Validator.emptyCustomTextBox(this, bi.d30512y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30513
            String d30513date = modd.getD30513y()
                    + "-" + modd.getD30513m()
                    + "-" + modd.getD30513d();
            if (!validateDates(week14, d30513date)) {
                return Validator.emptyCustomTextBox(this, bi.d30513y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30514
            String d30514date = modd.getD30514y()
                    + "-" + modd.getD30514m()
                    + "-" + modd.getD30514d();
            if (!validateDates(week14, d30514date)) {
                return Validator.emptyCustomTextBox(this, bi.d30514y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }


            //month9
            String month9 = modd.getD30514y()
                    + "-" + modd.getD30514m()
                    + "-" + modd.getD30514d();

            // D30515
            String d30515date = modd.getD30515y()
                    + "-" + modd.getD30515m()
                    + "-" + modd.getD30515d();
            if (!validateDates(month9, d30515date)) {
                return Validator.emptyCustomTextBox(this, bi.d30515y, "Vaccine Date Should be Greater Than 14 Week Vaccine date");
            }


            //month15
            String month15 = modd.getD30515y()
                    + "-" + modd.getD30515m()
                    + "-" + modd.getD30515d();

            // D30516
            String d30516date = modd.getD30516y()
                    + "-" + modd.getD30516m()
                    + "-" + modd.getD30516d();
            if (!validateDates(month15, d30516date)) {
                return Validator.emptyCustomTextBox(this, bi.d30516y, "Vaccine Date Should be Greater Than NINE MONTH Vaccine date");
            }
        }
        return true;
    }


}