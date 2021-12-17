package edu.aku.hassannaqvi.enp_baseline.models;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.enp_baseline.BR;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;

public class LateAdolescent extends BaseObservable {
    private final String TAG = "LateAdolescent";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String snoAdol = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String hhid = _EMPTY_;
    private String indexed = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    // Section Variables
    private String es1resp = _EMPTY_;
    private String es1respline = _EMPTY_;
    private String es1cons = _EMPTY_;
    private String es1cons1 = _EMPTY_;
    private String es1q1 = _EMPTY_;
    private String es1q196x = _EMPTY_;
    private String es1q2 = _EMPTY_;
    private String es1q3 = _EMPTY_;
    private String es1q4 = _EMPTY_;
    private String es1q405 = _EMPTY_;
    private String es1q406 = _EMPTY_;
    private String es1q407 = _EMPTY_;
    private String es1q408 = _EMPTY_;
    private String es1q409 = _EMPTY_;
    private String es1q496 = _EMPTY_;
    private String es1q496x = _EMPTY_;
    private String es1q5 = _EMPTY_;
    private String es1q6 = _EMPTY_;
    private String es1q7 = _EMPTY_;
    private String es1q8a = _EMPTY_;
    private String es1q8b = _EMPTY_;
    private String es1q8c = _EMPTY_;
    private String es1q9a = _EMPTY_;
    private String es1q9b = _EMPTY_;
    private String es1q9c = _EMPTY_;
    private String es2q1 = _EMPTY_;
    private String es2q2 = _EMPTY_;
    private String es2q3 = _EMPTY_;
    private String es2q4 = _EMPTY_;
    private String es2q5 = _EMPTY_;
    private String es2q6 = _EMPTY_;
    private String es2q7 = _EMPTY_;
    private String es2q8 = _EMPTY_;
    private String es2q9 = _EMPTY_;
    private String es2q10 = _EMPTY_;
    private String es2q196x = _EMPTY_;
    private String es3q1 = _EMPTY_;
    private String es3q201 = _EMPTY_;
    private String es3q202 = _EMPTY_;
    private String es3q203 = _EMPTY_;
    private String es3q204 = _EMPTY_;
    private String es3q205 = _EMPTY_;
    private String es3q206 = _EMPTY_;
    private String es3q207 = _EMPTY_;
    private String es3q208 = _EMPTY_;
    private String es3q296 = _EMPTY_;
    private String es3q296x = _EMPTY_;
    private String es3q297 = _EMPTY_;
    private String es3q3 = _EMPTY_;
    private String es3q396x = _EMPTY_;
    private String es3q4 = _EMPTY_;
    private String es3q5 = _EMPTY_;
    private String es3q501 = _EMPTY_;
    private String es3q502 = _EMPTY_;
    private String es3q503 = _EMPTY_;
    private String es3q504 = _EMPTY_;
    private String es3q505 = _EMPTY_;
    private String es3q506 = _EMPTY_;
    private String es3q507 = _EMPTY_;
    private String es3q596 = _EMPTY_;
    private String es3q596x = _EMPTY_;
    private String es3q6 = _EMPTY_;
    private String es3q7 = _EMPTY_;
    private String es3q8 = _EMPTY_;
    private String es3q9 = _EMPTY_;
    private String es3q901 = _EMPTY_;
    private String es3q902 = _EMPTY_;
    private String es3q903 = _EMPTY_;
    private String es3q904 = _EMPTY_;
    private String es3q905 = _EMPTY_;
    private String es3q906 = _EMPTY_;
    private String es3q907 = _EMPTY_;
    private String es3q908 = _EMPTY_;
    private String es3q996 = _EMPTY_;
    private String es3q996x = _EMPTY_;
    private String es3q998 = _EMPTY_;
    private String es3q10 = _EMPTY_;
    private String es3q1001 = _EMPTY_;
    private String es3q1002 = _EMPTY_;
    private String es3q1003 = _EMPTY_;
    private String es3q1004 = _EMPTY_;
    private String es3q1005 = _EMPTY_;
    private String es3q1006 = _EMPTY_;
    private String es3q1007 = _EMPTY_;
    private String es3q1008 = _EMPTY_;
    private String es3q196 = _EMPTY_;
    private String es3q196x = _EMPTY_;
    private String es3q1098 = _EMPTY_;
    private String es3q11 = _EMPTY_;
    private String es3q1106x = _EMPTY_;
    private String es3q12 = _EMPTY_;
    private String es3q13 = _EMPTY_;
    private String es3q14 = _EMPTY_;
    private String es4q1 = _EMPTY_;
    private String es4q101 = _EMPTY_;
    private String es4q102 = _EMPTY_;
    private String es4q103 = _EMPTY_;
    private String es4q104 = _EMPTY_;
    private String es4q105 = _EMPTY_;
    private String es4q106 = _EMPTY_;
    private String es4q107 = _EMPTY_;
    private String es4q196 = _EMPTY_;
    private String es4q196x = _EMPTY_;
    private String es4q197 = _EMPTY_;
    private String es4q198 = _EMPTY_;
    private String es4q2 = _EMPTY_;
    private String es4q3 = _EMPTY_;
    private String es4q301 = _EMPTY_;
    private String es4q302 = _EMPTY_;
    private String es4q303 = _EMPTY_;
    private String es4q304 = _EMPTY_;
    private String es4q305 = _EMPTY_;
    private String es4q306 = _EMPTY_;
    private String es4q307 = _EMPTY_;
    private String es4q396 = _EMPTY_;
    private String es4q396x = _EMPTY_;
    private String es4q398 = _EMPTY_;
    private String es4q4 = _EMPTY_;
    private String es4q401 = _EMPTY_;
    private String es4q402 = _EMPTY_;
    private String es4q403 = _EMPTY_;
    private String es4q404 = _EMPTY_;
    private String es4q496 = _EMPTY_;
    private String es4q496x = _EMPTY_;
    private String es4q498 = _EMPTY_;
    private String es4q5 = _EMPTY_;
    private String es4q501 = _EMPTY_;
    private String es4q502 = _EMPTY_;
    private String es4q503 = _EMPTY_;
    private String es4q504 = _EMPTY_;
    private String es4q505 = _EMPTY_;
    private String es4q506 = _EMPTY_;
    private String es4q507 = _EMPTY_;
    private String es4q508 = _EMPTY_;
    private String es4q509 = _EMPTY_;
    private String es4q596 = _EMPTY_;
    private String es4q596x = _EMPTY_;
    private String es4q598 = _EMPTY_;
    private String es4q6 = _EMPTY_;
    private String es4q601 = _EMPTY_;
    private String es4q602 = _EMPTY_;
    private String es4q603 = _EMPTY_;
    private String es4q604 = _EMPTY_;
    private String es4q605 = _EMPTY_;
    private String es4q696 = _EMPTY_;
    private String es4q696x = _EMPTY_;
    private String es4q698 = _EMPTY_;
    private String es4q7 = _EMPTY_;
    private String es4q8 = _EMPTY_;
    private String es4q801 = _EMPTY_;
    private String es4q802 = _EMPTY_;
    private String es4q803 = _EMPTY_;
    private String es4q804 = _EMPTY_;
    private String es4q805 = _EMPTY_;
    private String es4q806 = _EMPTY_;
    private String es4q807 = _EMPTY_;
    private String es4q808 = _EMPTY_;
    private String es4q809 = _EMPTY_;
    private String es4q8010 = _EMPTY_;
    private String es4q8011 = _EMPTY_;
    private String es4q8012 = _EMPTY_;
    private String es4q8013 = _EMPTY_;
    private String es4q8014 = _EMPTY_;
    private String es4q8015 = _EMPTY_;
    private String es4q8016 = _EMPTY_;
    private String es4q8017 = _EMPTY_;
    private String es4q8018 = _EMPTY_;
    private String es4q866 = _EMPTY_;
    private String es4q896 = _EMPTY_;
    private String es4q896x = _EMPTY_;

    public void LateAdolescent() {


    }

    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        /*setSnoAdolFem(selectedAdolFemale);
        setSnoAdol(selectedAdolMale);*/
        // setFmuid(); // set in Activity
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //public String getCluster() {
    //  return cluster;
    //}

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    //public void setCluster(String cluster) {
    //  this.cluster = cluster;
    // }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getpsuCode() {
        return psuCode;
    }

    private void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }


    public String getSnoAdol() {
        return snoAdol;
    }

    public void setSnoAdol(String snoAdol) {
        this.snoAdol = snoAdol;
    }


    @Bindable
    public String getEs1resp() {
        return es1resp;
    }

    public void setEs1resp(String es1resp) {
        this.es1resp = es1resp;
        notifyPropertyChanged(BR.es1resp);
    }

    @Bindable
    public String getEs1respline() {
        return es1respline;
    }

    public void setEs1respline(String es1respline) {
        this.es1respline = es1respline;
        setEs1cons("");
        notifyPropertyChanged(BR.es1respline);
    }

    @Bindable
    public String getEs1cons() {
        return es1cons;
    }

    public void setEs1cons(String es1cons) {
        this.es1cons = es1cons;
        setEs1cons1(es1cons.equals("2") ? "" : this.es1cons1);
        setEs1q1(es1cons.equals("2") ? "" : this.es1q1);
        setEs1q2(es1cons.equals("2") ? "" : this.es1q2);
        setEs1q3(es1cons.equals("2") ? "" : this.es1q3);
        setEs1q405(es1cons.equals("2") ? "" : this.es1q405);
        setEs1q406(es1cons.equals("2") ? "" : this.es1q406);
        setEs1q407(es1cons.equals("2") ? "" : this.es1q407);
        setEs1q408(es1cons.equals("2") ? "" : this.es1q408);
        setEs1q409(es1cons.equals("2") ? "" : this.es1q409);
        setEs1q496(es1cons.equals("2") ? "" : this.es1q496);
        setEs1q496x(es1cons.equals("2") ? "" : this.es1q496x);
        setEs1q5(es1cons.equals("2") ? "" : this.es1q5);
        setEs1q6(es1cons.equals("2") ? "" : this.es1q6);
        setEs1q7(es1cons.equals("2") ? "" : this.es1q7);
        setEs1q8a(es1cons.equals("2") ? "" : this.es1q8a);
        setEs1q8b(es1cons.equals("2") ? "" : this.es1q8b);
        setEs1q8c(es1cons.equals("2") ? "" : this.es1q8c);
        setEs1q9a(es1cons.equals("2") ? "" : this.es1q9a);
        setEs1q9b(es1cons.equals("2") ? "" : this.es1q9b);
        setEs1q9c(es1cons.equals("2") ? "" : this.es1q9c);
        notifyPropertyChanged(BR.es1cons);
    }

    @Bindable
    public String getEs1cons1() {
        return es1cons1;
    }

    public void setEs1cons1(String es1cons1) {
        this.es1cons1 = es1cons1;
        setEs1q1(es1cons1.equals("2") ? "" : this.es1q1);
        setEs1q2(es1cons1.equals("2") ? "" : this.es1q2);
        setEs1q3(es1cons1.equals("2") ? "" : this.es1q3);
        setEs1q405(es1cons1.equals("2") ? "" : this.es1q405);
        setEs1q406(es1cons1.equals("2") ? "" : this.es1q406);
        setEs1q407(es1cons1.equals("2") ? "" : this.es1q407);
        setEs1q408(es1cons1.equals("2") ? "" : this.es1q408);
        setEs1q409(es1cons1.equals("2") ? "" : this.es1q409);
        setEs1q496(es1cons1.equals("2") ? "" : this.es1q496);
        setEs1q496x(es1cons1.equals("2") ? "" : this.es1q496x);
        setEs1q5(es1cons1.equals("2") ? "" : this.es1q5);
        setEs1q6(es1cons1.equals("2") ? "" : this.es1q6);
        setEs1q7(es1cons1.equals("2") ? "" : this.es1q7);
        setEs1q8a(es1cons1.equals("2") ? "" : this.es1q8a);
        setEs1q8b(es1cons1.equals("2") ? "" : this.es1q8b);
        setEs1q8c(es1cons1.equals("2") ? "" : this.es1q8c);
        setEs1q9a(es1cons1.equals("2") ? "" : this.es1q9a);
        setEs1q9b(es1cons1.equals("2") ? "" : this.es1q9b);
        setEs1q9c(es1cons1.equals("2") ? "" : this.es1q9c);
        notifyPropertyChanged(BR.es1cons1);
    }

    @Bindable
    public String getEs1q1() {
        return es1q1;
    }

    public void setEs1q1(String es1q1) {
        this.es1q1 = es1q1;
        setEs1q196x(es1q1.equals("96") ? this.es1q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es1q1);
    }

    @Bindable
    public String getEs1q196x() {
        return es1q196x;
    }

    public void setEs1q196x(String es1q196x) {
        this.es1q196x = es1q196x;
        notifyPropertyChanged(BR.es1q196x);
    }

    @Bindable
    public String getEs1q2() {
        return es1q2;
    }

    public void setEs1q2(String es1q2) {
        this.es1q2 = es1q2;
        setEs1q3(es1q2.equals("97") ? this.es1q3 : "");
        setEs1q405(es1q2.equals("97") ? this.es1q405 : "");
        setEs1q406(es1q2.equals("97") ? this.es1q406 : "");
        setEs1q407(es1q2.equals("97") ? this.es1q407 : "");
        setEs1q408(es1q2.equals("97") ? this.es1q408 : "");
        setEs1q409(es1q2.equals("97") ? this.es1q409 : "");
        setEs1q496(es1q2.equals("97") ? this.es1q496 : "");
        setEs1q496x(es1q2.equals("97") ? this.es1q496x : "");
        setEs1q5(es1q2.equals("97") ? this.es1q5 : "");
        setEs1q6(es1q2.equals("97") ? this.es1q6 : "");

        notifyPropertyChanged(BR.es1q2);
    }

    @Bindable
    public String getEs1q3() {
        return es1q3;
    }

    public void setEs1q3(String es1q3) {
        this.es1q3 = es1q3;
        notifyPropertyChanged(BR.es1q3);
    }

    @Bindable
    public String getEs1q4() {
        return es1q4;
    }

    public void setEs1q4(String es1q4) {
        this.es1q4 = es1q4;
        notifyPropertyChanged(BR.es1q4);
    }

    @Bindable
    public String getEs1q405() {
        return es1q405;
    }

    public void setEs1q405(String es1q405) {
        if (this.es1q405.equals(es1q405)) return; // for all checkboxes
        this.es1q405 = es1q405;
        notifyPropertyChanged(BR.es1q405);
    }

    @Bindable
    public String getEs1q406() {
        return es1q406;
    }

    public void setEs1q406(String es1q406) {
        if (this.es1q406.equals(es1q406)) return; // for all checkboxes
        this.es1q406 = es1q406;
        notifyPropertyChanged(BR.es1q406);
    }

    @Bindable
    public String getEs1q407() {
        return es1q407;
    }

    public void setEs1q407(String es1q407) {
        if (this.es1q407.equals(es1q407)) return; // for all checkboxes
        this.es1q407 = es1q407;
        notifyPropertyChanged(BR.es1q407);
    }

    @Bindable
    public String getEs1q408() {
        return es1q408;
    }

    public void setEs1q408(String es1q408) {
        if (this.es1q408.equals(es1q408)) return; // for all checkboxes
        this.es1q408 = es1q408;
        notifyPropertyChanged(BR.es1q408);
    }

    @Bindable
    public String getEs1q409() {
        return es1q409;
    }

    public void setEs1q409(String es1q409) {
        if (this.es1q409.equals(es1q409)) return; // for all checkboxes
        this.es1q409 = es1q409;
        notifyPropertyChanged(BR.es1q409);
    }

    @Bindable
    public String getEs1q496() {
        return es1q496;
    }

    public void setEs1q496(String es1q496) {
        if (this.es1q496.equals(es1q496)) return; // for all checkboxes
        this.es1q496 = es1q496;
        setEs1q496x(es1q496.equals("96") ? this.es1q496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es1q496);
    }

    @Bindable
    public String getEs1q496x() {
        return es1q496x;
    }

    public void setEs1q496x(String es1q496x) {
        this.es1q496x = es1q496x;
        notifyPropertyChanged(BR.es1q496x);
    }

    @Bindable
    public String getEs1q5() {
        return es1q5;
    }

    public void setEs1q5(String es1q5) {
        this.es1q5 = es1q5;
        notifyPropertyChanged(BR.es1q5);
    }

    @Bindable
    public String getEs1q6() {
        return es1q6;
    }

    public void setEs1q6(String es1q6) {
        this.es1q6 = es1q6;
        notifyPropertyChanged(BR.es1q6);
    }

    @Bindable
    public String getEs1q7() {
        return es1q7;
    }

    public void setEs1q7(String es1q7) {
        this.es1q7 = es1q7;
        setEs1q8a(es1q7.equals("2") ? "" : this.es1q8a);
        setEs1q8b(es1q7.equals("2") ? "" : this.es1q8b);
        setEs1q8c(es1q7.equals("2") ? "" : this.es1q8c);
        notifyPropertyChanged(BR.es1q7);
    }

    @Bindable
    public String getEs1q8a() {
        return es1q8a;
    }

    public void setEs1q8a(String es1q8a) {
        this.es1q8a = es1q8a;
        notifyPropertyChanged(BR.es1q8a);
    }

    @Bindable
    public String getEs1q8b() {
        return es1q8b;
    }

    public void setEs1q8b(String es1q8b) {
        this.es1q8b = es1q8b;
        notifyPropertyChanged(BR.es1q8b);
    }

    @Bindable
    public String getEs1q8c() {
        return es1q8c;
    }

    public void setEs1q8c(String es1q8c) {
        this.es1q8c = es1q8c;
        notifyPropertyChanged(BR.es1q8c);
    }

    @Bindable
    public String getEs1q9a() {
        return es1q9a;
    }

    public void setEs1q9a(String es1q9a) {
        this.es1q9a = es1q9a;
        notifyPropertyChanged(BR.es1q9a);
    }

    @Bindable
    public String getEs1q9b() {
        return es1q9b;
    }

    public void setEs1q9b(String es1q9b) {
        this.es1q9b = es1q9b;
        notifyPropertyChanged(BR.es1q9b);
    }

    @Bindable
    public String getEs1q9c() {
        return es1q9c;
    }

    public void setEs1q9c(String es1q9c) {
        this.es1q9c = es1q9c;
        notifyPropertyChanged(BR.es1q9c);
    }

    @Bindable
    public String getEs2q1() {
        return es2q1;
    }

    public void setEs2q1(String es2q1) {
        this.es2q1 = es2q1;
        notifyPropertyChanged(BR.es2q1);
    }

    @Bindable
    public String getEs2q2() {
        return es2q2;
    }

    public void setEs2q2(String es2q2) {
        this.es2q2 = es2q2;
        notifyPropertyChanged(BR.es2q2);
    }

    @Bindable
    public String getEs2q3() {
        return es2q3;
    }

    public void setEs2q3(String es2q3) {
        this.es2q3 = es2q3;
        notifyPropertyChanged(BR.es2q3);
    }

    @Bindable
    public String getEs2q4() {
        return es2q4;
    }

    public void setEs2q4(String es2q4) {
        this.es2q4 = es2q4;
        notifyPropertyChanged(BR.es2q4);
    }

    @Bindable
    public String getEs2q5() {
        return es2q5;
    }

    public void setEs2q5(String es2q5) {
        this.es2q5 = es2q5;
        notifyPropertyChanged(BR.es2q5);
    }

    @Bindable
    public String getEs2q6() {
        return es2q6;
    }

    public void setEs2q6(String es2q6) {
        this.es2q6 = es2q6;
        notifyPropertyChanged(BR.es2q6);
    }

    @Bindable
    public String getEs2q7() {
        return es2q7;
    }

    public void setEs2q7(String es2q7) {
        this.es2q7 = es2q7;
        setEs2q8(es2q7.equals("1") ? "" : this.es2q8);
        notifyPropertyChanged(BR.es2q7);
    }

    @Bindable
    public String getEs2q8() {
        return es2q8;
    }

    public void setEs2q8(String es2q8) {
        this.es2q8 = es2q8;
        notifyPropertyChanged(BR.es2q8);
    }

    @Bindable
    public String getEs2q9() {
        return es2q9;
    }

    public void setEs2q9(String es2q9) {
        this.es2q9 = es2q9;
        notifyPropertyChanged(BR.es2q9);
    }

    @Bindable
    public String getEs2q10() {
        return es2q10;
    }

    public void setEs2q10(String es2q10) {
        this.es2q10 = es2q10;
        setEs2q196x(es2q10.equals("96") ? this.es2q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es2q10);
    }

    @Bindable
    public String getEs2q196x() {
        return es2q196x;
    }

    public void setEs2q196x(String es2q196x) {
        this.es2q196x = es2q196x;
        notifyPropertyChanged(BR.es2q196x);
    }

    @Bindable
    public String getEs3q1() {
        return es3q1;
    }

    public void setEs3q1(String es3q1) {
        this.es3q1 = es3q1;
        setEs3q201(es3q1.equals("2") ? "" : this.es3q201);
        setEs3q202(es3q1.equals("2") ? "" : this.es3q202);
        setEs3q203(es3q1.equals("2") ? "" : this.es3q203);
        setEs3q204(es3q1.equals("2") ? "" : this.es3q204);
        setEs3q205(es3q1.equals("2") ? "" : this.es3q205);
        setEs3q206(es3q1.equals("2") ? "" : this.es3q206);
        setEs3q207(es3q1.equals("2") ? "" : this.es3q207);
        setEs3q208(es3q1.equals("2") ? "" : this.es3q208);
        setEs3q296(es3q1.equals("2") ? "" : this.es3q296);
        setEs3q297(es3q1.equals("2") ? "" : this.es3q297);
        notifyPropertyChanged(BR.es3q1);
    }

    @Bindable
    public String getEs3q201() {
        return es3q201;
    }

    public void setEs3q201(String es3q201) {
        if (this.es3q201.equals(es3q201)) return; // for all checkboxes
        this.es3q201 = es3q201;
        notifyPropertyChanged(BR.es3q201);
    }

    @Bindable
    public String getEs3q202() {
        return es3q202;
    }

    public void setEs3q202(String es3q202) {
        if (this.es3q202.equals(es3q202)) return; // for all checkboxes
        this.es3q202 = es3q202;
        notifyPropertyChanged(BR.es3q202);
    }

    @Bindable
    public String getEs3q203() {
        return es3q203;
    }

    public void setEs3q203(String es3q203) {
        if (this.es3q203.equals(es3q203)) return; // for all checkboxes
        this.es3q203 = es3q203;
        notifyPropertyChanged(BR.es3q203);
    }

    @Bindable
    public String getEs3q204() {
        return es3q204;
    }

    public void setEs3q204(String es3q204) {
        if (this.es3q204.equals(es3q204)) return; // for all checkboxes
        this.es3q204 = es3q204;
        notifyPropertyChanged(BR.es3q204);
    }

    @Bindable
    public String getEs3q205() {
        return es3q205;
    }

    public void setEs3q205(String es3q205) {
        if (this.es3q205.equals(es3q205)) return; // for all checkboxes
        this.es3q205 = es3q205;
        notifyPropertyChanged(BR.es3q205);
    }

    @Bindable
    public String getEs3q206() {
        return es3q206;
    }

    public void setEs3q206(String es3q206) {
        if (this.es3q206.equals(es3q206)) return; // for all checkboxes
        this.es3q206 = es3q206;
        notifyPropertyChanged(BR.es3q206);
    }

    @Bindable
    public String getEs3q207() {
        return es3q207;
    }

    public void setEs3q207(String es3q207) {
        if (this.es3q207.equals(es3q207)) return; // for all checkboxes
        this.es3q207 = es3q207;
        notifyPropertyChanged(BR.es3q207);
    }

    @Bindable
    public String getEs3q208() {
        return es3q208;
    }

    public void setEs3q208(String es3q208) {
        if (this.es3q208.equals(es3q208)) return; // for all checkboxes
        this.es3q208 = es3q208;
        notifyPropertyChanged(BR.es3q208);
    }

    @Bindable
    public String getEs3q296() {
        return es3q296;
    }

    public void setEs3q296(String es3q296) {
        if (this.es3q296.equals(es3q296)) return; // for all checkboxes
        this.es3q296 = es3q296;
        setEs3q296x(es3q296.equals("96") ? this.es3q296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q296);
    }

    @Bindable
    public String getEs3q296x() {
        return es3q296x;
    }

    public void setEs3q296x(String es3q296x) {
        this.es3q296x = es3q296x;
        notifyPropertyChanged(BR.es3q296x);
    }

    @Bindable
    public String getEs3q297() {
        return es3q297;
    }

    public void setEs3q297(String es3q297) {
        if (this.es3q297.equals(es3q297)) return; // for all checkboxes
        this.es3q297 = es3q297;
        setEs3q201(es3q297.equals("97") ? "" : this.es3q201);
        setEs3q202(es3q297.equals("97") ? "" : this.es3q202);
        setEs3q203(es3q297.equals("97") ? "" : this.es3q203);
        setEs3q204(es3q297.equals("97") ? "" : this.es3q204);
        setEs3q205(es3q297.equals("97") ? "" : this.es3q205);
        setEs3q206(es3q297.equals("97") ? "" : this.es3q206);
        setEs3q207(es3q297.equals("97") ? "" : this.es3q207);
        setEs3q208(es3q297.equals("97") ? "" : this.es3q208);
        setEs3q296(es3q297.equals("97") ? "" : this.es3q296);
        notifyPropertyChanged(BR.es3q297);
    }

    @Bindable
    public String getEs3q3() {
        return es3q3;
    }

    public void setEs3q3(String es3q3) {
        this.es3q3 = es3q3;
        setEs3q396x(es3q3.equals("96") ? this.es3q396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q3);
    }

    @Bindable
    public String getEs3q396x() {
        return es3q396x;
    }

    public void setEs3q396x(String es3q396x) {
        this.es3q396x = es3q396x;
        notifyPropertyChanged(BR.es3q396x);
    }

    @Bindable
    public String getEs3q4() {
        return es3q4;
    }

    public void setEs3q4(String es3q4) {
        this.es3q4 = es3q4;
        setEs3q501(es3q4.equals("2") ? "" : this.es3q501);
        setEs3q502(es3q4.equals("2") ? "" : this.es3q502);
        setEs3q503(es3q4.equals("2") ? "" : this.es3q503);
        setEs3q504(es3q4.equals("2") ? "" : this.es3q504);
        setEs3q505(es3q4.equals("2") ? "" : this.es3q505);
        setEs3q506(es3q4.equals("2") ? "" : this.es3q506);
        setEs3q507(es3q4.equals("2") ? "" : this.es3q507);
        setEs3q596(es3q4.equals("2") ? "" : this.es3q596);
        setEs3q596x(es3q4.equals("2") ? "" : this.es3q596x);
        setEs3q6(es3q4.equals("2") ? "" : this.es3q6);
        notifyPropertyChanged(BR.es3q4);
    }

    @Bindable
    public String getEs3q5() {
        return es3q5;
    }

    public void setEs3q5(String es3q5) {
        this.es3q5 = es3q5;
        notifyPropertyChanged(BR.es3q5);
    }

    @Bindable
    public String getEs3q501() {
        return es3q501;
    }

    public void setEs3q501(String es3q501) {
        if (this.es3q501.equals(es3q501)) return; // for all checkboxes
        this.es3q501 = es3q501;
        notifyPropertyChanged(BR.es3q501);
    }

    @Bindable
    public String getEs3q502() {
        return es3q502;
    }

    public void setEs3q502(String es3q502) {
        if (this.es3q502.equals(es3q502)) return; // for all checkboxes
        this.es3q502 = es3q502;
        notifyPropertyChanged(BR.es3q502);
    }

    @Bindable
    public String getEs3q503() {
        return es3q503;
    }

    public void setEs3q503(String es3q503) {
        if (this.es3q503.equals(es3q503)) return; // for all checkboxes
        this.es3q503 = es3q503;
        notifyPropertyChanged(BR.es3q503);
    }

    @Bindable
    public String getEs3q504() {
        return es3q504;
    }

    public void setEs3q504(String es3q504) {
        if (this.es3q504.equals(es3q504)) return; // for all checkboxes
        this.es3q504 = es3q504;
        notifyPropertyChanged(BR.es3q504);
    }

    @Bindable
    public String getEs3q505() {
        return es3q505;
    }

    public void setEs3q505(String es3q505) {
        if (this.es3q505.equals(es3q505)) return; // for all checkboxes
        this.es3q505 = es3q505;
        notifyPropertyChanged(BR.es3q505);
    }

    @Bindable
    public String getEs3q506() {
        return es3q506;
    }

    public void setEs3q506(String es3q506) {
        if (this.es3q506.equals(es3q506)) return; // for all checkboxes
        this.es3q506 = es3q506;
        notifyPropertyChanged(BR.es3q506);
    }

    @Bindable
    public String getEs3q507() {
        return es3q507;
    }

    public void setEs3q507(String es3q507) {
        if (this.es3q507.equals(es3q507)) return; // for all checkboxes
        this.es3q507 = es3q507;
        notifyPropertyChanged(BR.es3q507);
    }

    @Bindable
    public String getEs3q596() {
        return es3q596;
    }

    public void setEs3q596(String es3q596) {
        if (this.es3q596.equals(es3q596)) return; // for all checkboxes
        this.es3q596 = es3q596;
        setEs3q596x(es3q596.equals("96") ? this.es3q596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q596);
    }

    @Bindable
    public String getEs3q596x() {
        return es3q596x;
    }

    public void setEs3q596x(String es3q596x) {
        this.es3q596x = es3q596x;
        notifyPropertyChanged(BR.es3q596x);
    }

    @Bindable
    public String getEs3q6() {
        return es3q6;
    }

    public void setEs3q6(String es3q6) {
        this.es3q6 = es3q6;
        notifyPropertyChanged(BR.es3q6);
    }

    @Bindable
    public String getEs3q7() {
        return es3q7;
    }

    public void setEs3q7(String es3q7) {
        this.es3q7 = es3q7;
        setEs3q8(es3q7.equals("2") ? "" : this.es3q8);
        notifyPropertyChanged(BR.es3q7);
    }

    @Bindable
    public String getEs3q8() {
        return es3q8;
    }

    public void setEs3q8(String es3q8) {
        this.es3q8 = es3q8;
        notifyPropertyChanged(BR.es3q8);
    }

    @Bindable
    public String getEs3q9() {
        return es3q9;
    }

    public void setEs3q9(String es3q9) {
        this.es3q9 = es3q9;
        notifyPropertyChanged(BR.es3q9);
    }

    @Bindable
    public String getEs3q901() {
        return es3q901;
    }

    public void setEs3q901(String es3q901) {
        if (this.es3q901.equals(es3q901)) return; // for all checkboxes
        this.es3q901 = es3q901;
        notifyPropertyChanged(BR.es3q901);
    }

    @Bindable
    public String getEs3q902() {
        return es3q902;
    }

    public void setEs3q902(String es3q902) {
        if (this.es3q902.equals(es3q902)) return; // for all checkboxes
        this.es3q902 = es3q902;
        notifyPropertyChanged(BR.es3q902);
    }

    @Bindable
    public String getEs3q903() {
        return es3q903;
    }

    public void setEs3q903(String es3q903) {
        if (this.es3q596.equals(es3q596)) return; // for all checkboxes
        this.es3q903 = es3q903;
        notifyPropertyChanged(BR.es3q903);
    }

    @Bindable
    public String getEs3q904() {
        return es3q904;
    }

    public void setEs3q904(String es3q904) {
        if (this.es3q904.equals(es3q904)) return; // for all checkboxes
        this.es3q904 = es3q904;
        notifyPropertyChanged(BR.es3q904);
    }

    @Bindable
    public String getEs3q905() {
        return es3q905;
    }

    public void setEs3q905(String es3q905) {
        if (this.es3q905.equals(es3q905)) return; // for all checkboxes
        this.es3q905 = es3q905;
        notifyPropertyChanged(BR.es3q905);
    }

    @Bindable
    public String getEs3q906() {
        return es3q906;
    }

    public void setEs3q906(String es3q906) {
        if (this.es3q906.equals(es3q906)) return; // for all checkboxes
        this.es3q906 = es3q906;
        notifyPropertyChanged(BR.es3q906);
    }

    @Bindable
    public String getEs3q907() {
        return es3q907;
    }

    public void setEs3q907(String es3q907) {
        if (this.es3q907.equals(es3q907)) return; // for all checkboxes
        this.es3q907 = es3q907;
        notifyPropertyChanged(BR.es3q907);
    }

    @Bindable
    public String getEs3q908() {
        return es3q908;
    }

    public void setEs3q908(String es3q908) {
        if (this.es3q908.equals(es3q908)) return; // for all checkboxes
        this.es3q908 = es3q908;
        notifyPropertyChanged(BR.es3q908);
    }

    @Bindable
    public String getEs3q996() {
        return es3q996;
    }

    public void setEs3q996(String es3q996) {
        if (this.es3q996.equals(es3q996)) return; // for all checkboxes
        this.es3q996 = es3q996;
        setEs3q996x(es3q996.equals("96") ? this.es3q996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q996);
    }

    @Bindable
    public String getEs3q996x() {
        return es3q996x;
    }

    public void setEs3q996x(String es3q996x) {
        this.es3q996x = es3q996x;
        notifyPropertyChanged(BR.es3q996x);
    }

    @Bindable
    public String getEs3q998() {
        return es3q998;
    }

    public void setEs3q998(String es3q998) {
        if (this.es3q998.equals(es3q998)) return; // for all checkboxes
        this.es3q998 = es3q998;
        setEs3q901(es3q998.equals("98") ? "" : this.es3q901);
        setEs3q902(es3q998.equals("98") ? "" : this.es3q902);
        setEs3q903(es3q998.equals("98") ? "" : this.es3q903);
        setEs3q904(es3q998.equals("98") ? "" : this.es3q904);
        setEs3q905(es3q998.equals("98") ? "" : this.es3q905);
        setEs3q906(es3q998.equals("98") ? "" : this.es3q906);
        setEs3q907(es3q998.equals("98") ? "" : this.es3q907);
        setEs3q908(es3q998.equals("98") ? "" : this.es3q908);
        setEs3q996(es3q998.equals("98") ? "" : this.es3q996);
        setEs3q996x(es3q998.equals("98") ? "" : this.es3q996x);
        notifyPropertyChanged(BR.es3q998);
    }

    @Bindable
    public String getEs3q10() {
        return es3q10;
    }

    public void setEs3q10(String es3q10) {
        this.es3q10 = es3q10;
        notifyPropertyChanged(BR.es3q10);
    }

    @Bindable
    public String getEs3q1001() {
        return es3q1001;
    }

    public void setEs3q1001(String es3q1001) {
        if (this.es3q1001.equals(es3q1001)) return; // for all checkboxes
        this.es3q1001 = es3q1001;
        notifyPropertyChanged(BR.es3q1001);
    }

    @Bindable
    public String getEs3q1002() {
        return es3q1002;
    }

    public void setEs3q1002(String es3q1002) {
        if (this.es3q1002.equals(es3q1002)) return; // for all checkboxes
        this.es3q1002 = es3q1002;
        notifyPropertyChanged(BR.es3q1002);
    }

    @Bindable
    public String getEs3q1003() {
        return es3q1003;
    }

    public void setEs3q1003(String es3q1003) {
        if (this.es3q1003.equals(es3q1003)) return; // for all checkboxes
        this.es3q1003 = es3q1003;
        notifyPropertyChanged(BR.es3q1003);
    }

    @Bindable
    public String getEs3q1004() {
        return es3q1004;
    }

    public void setEs3q1004(String es3q1004) {
        if (this.es3q1004.equals(es3q1004)) return; // for all checkboxes
        this.es3q1004 = es3q1004;
        notifyPropertyChanged(BR.es3q1004);
    }

    @Bindable
    public String getEs3q1005() {
        return es3q1005;
    }

    public void setEs3q1005(String es3q1005) {
        if (this.es3q1005.equals(es3q1005)) return; // for all checkboxes
        this.es3q1005 = es3q1005;
        notifyPropertyChanged(BR.es3q1005);
    }

    @Bindable
    public String getEs3q1006() {
        return es3q1006;
    }

    public void setEs3q1006(String es3q1006) {
        if (this.es3q1006.equals(es3q1006)) return; // for all checkboxes
        this.es3q1006 = es3q1006;
        notifyPropertyChanged(BR.es3q1006);
    }

    @Bindable
    public String getEs3q1007() {
        return es3q1007;
    }

    public void setEs3q1007(String es3q1007) {
        if (this.es3q998.equals(es3q1007)) return; // for all checkboxes
        this.es3q1007 = es3q1007;
        notifyPropertyChanged(BR.es3q1007);
    }

    @Bindable
    public String getEs3q1008() {
        return es3q1008;
    }

    public void setEs3q1008(String es3q1008) {
        if (this.es3q1008.equals(es3q1008)) return; // for all checkboxes
        this.es3q1008 = es3q1008;
        notifyPropertyChanged(BR.es3q1008);
    }

    @Bindable
    public String getEs3q196() {
        return es3q196;
    }

    public void setEs3q196(String es3q196) {
        if (this.es3q196.equals(es3q196)) return; // for all checkboxes
        this.es3q196 = es3q196;
        setEs3q196x(es3q196.equals("96") ? this.es3q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q196);
    }

    @Bindable
    public String getEs3q196x() {
        return es3q196x;
    }

    public void setEs3q196x(String es3q196x) {
        this.es3q196x = es3q196x;
        notifyPropertyChanged(BR.es3q196x);
    }

    @Bindable
    public String getEs3q1098() {
        return es3q1098;
    }

    public void setEs3q1098(String es3q1098) {
        if (this.es3q1098.equals(es3q1098)) return; // for all checkboxes
        this.es3q1098 = es3q1098;
        setEs3q1001(es3q1098.equals("98") ? "" : this.es3q1001);
        setEs3q1002(es3q1098.equals("98") ? "" : this.es3q1002);
        setEs3q1003(es3q1098.equals("98") ? "" : this.es3q1003);
        setEs3q1004(es3q1098.equals("98") ? "" : this.es3q1004);
        setEs3q1005(es3q1098.equals("98") ? "" : this.es3q1005);
        setEs3q1006(es3q1098.equals("98") ? "" : this.es3q1006);
        setEs3q1007(es3q1098.equals("98") ? "" : this.es3q1007);
        setEs3q1008(es3q1098.equals("98") ? "" : this.es3q1008);
        setEs3q196(es3q1098.equals("98") ? "" : this.es3q196);
        setEs3q196x(es3q1098.equals("98") ? "" : this.es3q196x);
        notifyPropertyChanged(BR.es3q1098);
    }

    @Bindable
    public String getEs3q11() {
        return es3q11;
    }

    public void setEs3q11(String es3q11) {
        this.es3q11 = es3q11;
        setEs3q1106x(es3q11.equals("96") ? this.es3q1106x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es3q11);
    }

    @Bindable
    public String getEs3q1106x() {
        return es3q1106x;
    }

    public void setEs3q1106x(String es3q1106x) {
        this.es3q1106x = es3q1106x;
        notifyPropertyChanged(BR.es3q1106x);
    }

    @Bindable
    public String getEs3q12() {
        return es3q12;
    }

    public void setEs3q12(String es3q12) {
        this.es3q12 = es3q12;
        notifyPropertyChanged(BR.es3q12);
    }

    @Bindable
    public String getEs3q13() {
        return es3q13;
    }

    public void setEs3q13(String es3q13) {
        this.es3q13 = es3q13;
        notifyPropertyChanged(BR.es3q13);
    }

    @Bindable
    public String getEs3q14() {
        return es3q14;
    }

    public void setEs3q14(String es3q14) {
        this.es3q14 = es3q14;
        notifyPropertyChanged(BR.es3q14);
    }

    @Bindable
    public String getEs4q1() {
        return es4q1;
    }

    public void setEs4q1(String es4q1) {
        this.es4q1 = es4q1;
        notifyPropertyChanged(BR.es4q1);
    }

    @Bindable
    public String getEs4q101() {
        return es4q101;
    }

    public void setEs4q101(String es4q101) {
        if (this.es4q101.equals(es4q101)) return; // for all checkboxes
        this.es4q101 = es4q101;
        notifyPropertyChanged(BR.es4q101);
    }

    @Bindable
    public String getEs4q102() {
        return es4q102;
    }

    public void setEs4q102(String es4q102) {
        if (this.es4q102.equals(es4q102)) return; // for all checkboxes
        this.es4q102 = es4q102;
        notifyPropertyChanged(BR.es4q102);
    }

    @Bindable
    public String getEs4q103() {
        return es4q103;
    }

    public void setEs4q103(String es4q103) {
        if (this.es4q103.equals(es4q103)) return; // for all checkboxes
        this.es4q103 = es4q103;
        notifyPropertyChanged(BR.es4q103);
    }

    @Bindable
    public String getEs4q104() {
        return es4q104;
    }

    public void setEs4q104(String es4q104) {
        if (this.es4q104.equals(es4q104)) return; // for all checkboxes
        this.es4q104 = es4q104;
        notifyPropertyChanged(BR.es4q104);
    }

    @Bindable
    public String getEs4q105() {
        return es4q105;
    }

    public void setEs4q105(String es4q105) {
        if (this.es4q105.equals(es4q105)) return; // for all checkboxes
        this.es4q105 = es4q105;
        notifyPropertyChanged(BR.es4q105);
    }

    @Bindable
    public String getEs4q106() {
        return es4q106;
    }

    public void setEs4q106(String es4q106) {
        if (this.es4q106.equals(es4q106)) return; // for all checkboxes
        this.es4q106 = es4q106;
        notifyPropertyChanged(BR.es4q106);
    }

    @Bindable
    public String getEs4q107() {
        return es4q107;
    }

    public void setEs4q107(String es4q107) {
        if (this.es4q107.equals(es4q107)) return; // for all checkboxes
        this.es4q107 = es4q107;
        notifyPropertyChanged(BR.es4q107);
    }

    @Bindable
    public String getEs4q196() {
        return es4q196;
    }

    public void setEs4q196(String es4q196) {
        if (this.es4q196.equals(es4q196)) return; // for all checkboxes
        this.es4q196 = es4q196;
        setEs4q196x(es4q196.equals("96") ? this.es4q196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q196);
    }

    @Bindable
    public String getEs4q196x() {
        return es4q196x;
    }

    public void setEs4q196x(String es4q196x) {
        this.es4q196x = es4q196x;
        notifyPropertyChanged(BR.es4q196x);
    }

    @Bindable
    public String getEs4q197() {
        return es4q197;
    }

    public void setEs4q197(String es4q197) {
        if (this.es4q197.equals(es4q197)) return; // for all checkboxes
        this.es4q197 = es4q197;
        setEs4q101(es4q197.equals("97") ? "" : this.es4q101);
        setEs4q102(es4q197.equals("97") ? "" : this.es4q102);
        setEs4q103(es4q197.equals("97") ? "" : this.es4q103);
        setEs4q104(es4q197.equals("97") ? "" : this.es4q104);
        setEs4q105(es4q197.equals("97") ? "" : this.es4q105);
        setEs4q106(es4q197.equals("97") ? "" : this.es4q106);
        setEs4q107(es4q197.equals("97") ? "" : this.es4q107);
        setEs4q196(es4q197.equals("97") ? "" : this.es4q196);
        setEs4q198(es4q197.equals("97") ? "" : this.es4q198);
        notifyPropertyChanged(BR.es4q197);
    }

    @Bindable
    public String getEs4q198() {
        return es4q198;
    }

    public void setEs4q198(String es4q198) {
        if (this.es4q198.equals(es4q198)) return; // for all checkboxes
        this.es4q198 = es4q198;
        setEs4q101(es4q198.equals("98") ? "" : this.es4q101);
        setEs4q102(es4q198.equals("98") ? "" : this.es4q102);
        setEs4q103(es4q198.equals("98") ? "" : this.es4q103);
        setEs4q104(es4q198.equals("98") ? "" : this.es4q104);
        setEs4q105(es4q198.equals("98") ? "" : this.es4q105);
        setEs4q106(es4q198.equals("98") ? "" : this.es4q106);
        setEs4q107(es4q198.equals("98") ? "" : this.es4q107);
        setEs4q196(es4q198.equals("98") ? "" : this.es4q196);
        setEs4q197(es4q198.equals("98") ? "" : this.es4q197);
        notifyPropertyChanged(BR.es4q198);
    }

    @Bindable
    public String getEs4q2() {
        return es4q2;
    }

    public void setEs4q2(String es4q2) {
        this.es4q2 = es4q2;
        setEs4q301(es4q2.equals("2") ? "" : this.es4q301);
        setEs4q302(es4q2.equals("2") ? "" : this.es4q302);
        setEs4q303(es4q2.equals("2") ? "" : this.es4q303);
        setEs4q304(es4q2.equals("2") ? "" : this.es4q304);
        setEs4q305(es4q2.equals("2") ? "" : this.es4q305);
        setEs4q306(es4q2.equals("2") ? "" : this.es4q306);
        setEs4q307(es4q2.equals("2") ? "" : this.es4q307);
        setEs4q396(es4q2.equals("2") ? "" : this.es4q396);
        setEs4q398(es4q2.equals("2") ? "" : this.es4q398);
        setEs4q401(es4q2.equals("2") ? "" : this.es4q401);
        setEs4q402(es4q2.equals("2") ? "" : this.es4q402);
        setEs4q403(es4q2.equals("2") ? "" : this.es4q403);
        setEs4q404(es4q2.equals("2") ? "" : this.es4q404);
        setEs4q496(es4q2.equals("2") ? "" : this.es4q496);
        setEs4q498(es4q2.equals("2") ? "" : this.es4q498);
        notifyPropertyChanged(BR.es4q2);
    }

    @Bindable
    public String getEs4q3() {
        return es4q3;
    }

    public void setEs4q3(String es4q3) {
        this.es4q3 = es4q3;
        notifyPropertyChanged(BR.es4q3);
    }

    @Bindable
    public String getEs4q301() {
        return es4q301;
    }

    public void setEs4q301(String es4q301) {
        if (this.es4q301.equals(es4q301)) return; // for all checkboxes
        this.es4q301 = es4q301;
        notifyPropertyChanged(BR.es4q301);
    }

    @Bindable
    public String getEs4q302() {
        return es4q302;
    }

    public void setEs4q302(String es4q302) {
        if (this.es4q302.equals(es4q302)) return; // for all checkboxes
        this.es4q302 = es4q302;
        notifyPropertyChanged(BR.es4q302);
    }

    @Bindable
    public String getEs4q303() {
        return es4q303;
    }

    public void setEs4q303(String es4q303) {
        if (this.es4q303.equals(es4q303)) return; // for all checkboxes
        this.es4q303 = es4q303;
        notifyPropertyChanged(BR.es4q303);
    }

    @Bindable
    public String getEs4q304() {
        return es4q304;
    }

    public void setEs4q304(String es4q304) {
        if (this.es4q304.equals(es4q304)) return; // for all checkboxes
        this.es4q304 = es4q304;
        notifyPropertyChanged(BR.es4q304);
    }

    @Bindable
    public String getEs4q305() {
        return es4q305;
    }

    public void setEs4q305(String es4q305) {
        if (this.es4q305.equals(es4q305)) return; // for all checkboxes
        this.es4q305 = es4q305;
        notifyPropertyChanged(BR.es4q305);
    }

    @Bindable
    public String getEs4q306() {
        return es4q306;
    }

    public void setEs4q306(String es4q306) {
        if (this.es4q306.equals(es4q306)) return; // for all checkboxes
        this.es4q306 = es4q306;
        notifyPropertyChanged(BR.es4q306);
    }

    @Bindable
    public String getEs4q307() {
        return es4q307;
    }

    public void setEs4q307(String es4q307) {
        if (this.es4q307.equals(es4q307)) return; // for all checkboxes
        this.es4q307 = es4q307;
        notifyPropertyChanged(BR.es4q307);
    }

    @Bindable
    public String getEs4q396() {
        return es4q396;
    }

    public void setEs4q396(String es4q396) {
        if (this.es4q396.equals(es4q396)) return; // for all checkboxes
        this.es4q396 = es4q396;
        setEs4q396x(es4q396.equals("96") ? this.es4q396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q396);
    }

    @Bindable
    public String getEs4q396x() {
        return es4q396x;
    }

    public void setEs4q396x(String es4q396x) {
        this.es4q396x = es4q396x;
        notifyPropertyChanged(BR.es4q396x);
    }

    @Bindable
    public String getEs4q398() {
        return es4q398;
    }

    public void setEs4q398(String es4q398) {
        if (this.es4q398.equals(es4q398)) return; // for all checkboxes
        this.es4q398 = es4q398;
        setEs4q301(es4q398.equals("98") ? "" : this.es4q301);
        setEs4q302(es4q398.equals("98") ? "" : this.es4q302);
        setEs4q303(es4q398.equals("98") ? "" : this.es4q303);
        setEs4q304(es4q398.equals("98") ? "" : this.es4q304);
        setEs4q305(es4q398.equals("98") ? "" : this.es4q305);
        setEs4q306(es4q398.equals("98") ? "" : this.es4q306);
        setEs4q307(es4q398.equals("98") ? "" : this.es4q307);
        setEs4q396(es4q398.equals("98") ? "" : this.es4q396);
        notifyPropertyChanged(BR.es4q398);
    }

    @Bindable
    public String getEs4q4() {
        return es4q4;
    }

    public void setEs4q4(String es4q4) {
        this.es4q4 = es4q4;
        notifyPropertyChanged(BR.es4q4);
    }

    @Bindable
    public String getEs4q401() {
        return es4q401;
    }

    public void setEs4q401(String es4q401) {
        if (this.es4q401.equals(es4q401)) return; // for all checkboxes
        this.es4q401 = es4q401;
        notifyPropertyChanged(BR.es4q401);
    }

    @Bindable
    public String getEs4q402() {
        return es4q402;
    }

    public void setEs4q402(String es4q402) {
        if (this.es4q402.equals(es4q402)) return; // for all checkboxes
        this.es4q402 = es4q402;
        notifyPropertyChanged(BR.es4q402);
    }

    @Bindable
    public String getEs4q403() {
        return es4q403;
    }

    public void setEs4q403(String es4q403) {
        if (this.es4q403.equals(es4q403)) return; // for all checkboxes
        this.es4q403 = es4q403;
        notifyPropertyChanged(BR.es4q403);
    }

    @Bindable
    public String getEs4q404() {
        return es4q404;
    }

    public void setEs4q404(String es4q404) {
        if (this.es4q404.equals(es4q404)) return; // for all checkboxes
        this.es4q404 = es4q404;
        notifyPropertyChanged(BR.es4q404);
    }

    @Bindable
    public String getEs4q496() {
        return es4q496;
    }

    public void setEs4q496(String es4q496) {
        if (this.es4q496.equals(es4q496)) return; // for all checkboxes
        this.es4q496 = es4q496;
        setEs4q496x(es4q496.equals("96") ? this.es4q496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q496);
    }

    @Bindable
    public String getEs4q496x() {
        return es4q496x;
    }

    public void setEs4q496x(String es4q496x) {
        this.es4q496x = es4q496x;
        notifyPropertyChanged(BR.es4q496x);
    }

    @Bindable
    public String getEs4q498() {
        return es4q498;
    }

    public void setEs4q498(String es4q498) {
        if (this.es4q498.equals(es4q498)) return; // for all checkboxes
        this.es4q498 = es4q498;
        setEs4q401(es4q498.equals("98") ? "" : this.es4q401);
        setEs4q402(es4q498.equals("98") ? "" : this.es4q402);
        setEs4q403(es4q498.equals("98") ? "" : this.es4q403);
        setEs4q404(es4q498.equals("98") ? "" : this.es4q404);
        setEs4q496(es4q498.equals("98") ? "" : this.es4q496);
        notifyPropertyChanged(BR.es4q498);
    }

    @Bindable
    public String getEs4q5() {
        return es4q5;
    }

    public void setEs4q5(String es4q5) {
        this.es4q5 = es4q5;
        notifyPropertyChanged(BR.es4q5);
    }

    @Bindable
    public String getEs4q501() {
        return es4q501;
    }

    public void setEs4q501(String es4q501) {
        if (this.es4q501.equals(es4q501)) return; // for all checkboxes
        this.es4q501 = es4q501;
        notifyPropertyChanged(BR.es4q501);
    }

    @Bindable
    public String getEs4q502() {
        return es4q502;
    }

    public void setEs4q502(String es4q502) {
        if (this.es4q502.equals(es4q502)) return; // for all checkboxes
        this.es4q502 = es4q502;
        notifyPropertyChanged(BR.es4q502);
    }

    @Bindable
    public String getEs4q503() {
        return es4q503;
    }

    public void setEs4q503(String es4q503) {
        if (this.es4q503.equals(es4q503)) return; // for all checkboxes
        this.es4q503 = es4q503;
        notifyPropertyChanged(BR.es4q503);
    }

    @Bindable
    public String getEs4q504() {
        return es4q504;
    }

    public void setEs4q504(String es4q504) {
        if (this.es4q504.equals(es4q504)) return; // for all checkboxes
        this.es4q504 = es4q504;
        notifyPropertyChanged(BR.es4q504);
    }

    @Bindable
    public String getEs4q505() {
        return es4q505;
    }

    public void setEs4q505(String es4q505) {
        if (this.es4q505.equals(es4q505)) return; // for all checkboxes
        this.es4q505 = es4q505;
        notifyPropertyChanged(BR.es4q505);
    }

    @Bindable
    public String getEs4q506() {
        return es4q506;
    }

    public void setEs4q506(String es4q506) {
        if (this.es4q506.equals(es4q506)) return; // for all checkboxes
        this.es4q506 = es4q506;
        notifyPropertyChanged(BR.es4q506);
    }

    @Bindable
    public String getEs4q507() {
        return es4q507;
    }

    public void setEs4q507(String es4q507) {
        if (this.es4q507.equals(es4q507)) return; // for all checkboxes
        this.es4q507 = es4q507;
        notifyPropertyChanged(BR.es4q507);
    }

    @Bindable
    public String getEs4q508() {
        return es4q508;
    }

    public void setEs4q508(String es4q508) {
        if (this.es4q508.equals(es4q508)) return; // for all checkboxes
        this.es4q508 = es4q508;
        notifyPropertyChanged(BR.es4q508);
    }

    @Bindable
    public String getEs4q509() {
        return es4q509;
    }

    public void setEs4q509(String es4q509) {
        if (this.es4q509.equals(es4q509)) return; // for all checkboxes
        this.es4q509 = es4q509;
        notifyPropertyChanged(BR.es4q509);
    }

    @Bindable
    public String getEs4q596() {
        return es4q596;
    }

    public void setEs4q596(String es4q596) {
        if (this.es4q596.equals(es4q596)) return; // for all checkboxes
        this.es4q596 = es4q596;
        setEs4q596x(es4q596.equals("96") ? this.es4q596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q596);
    }

    @Bindable
    public String getEs4q596x() {
        return es4q596x;
    }

    public void setEs4q596x(String es4q596x) {
        this.es4q596x = es4q596x;
        notifyPropertyChanged(BR.es4q596x);
    }

    @Bindable
    public String getEs4q598() {
        return es4q598;
    }

    public void setEs4q598(String es4q598) {
        if (this.es4q598.equals(es4q598)) return; // for all checkboxes
        this.es4q598 = es4q598;
        setEs4q501(es4q598.equals("98") ? "" : this.es4q501);
        setEs4q502(es4q598.equals("98") ? "" : this.es4q502);
        setEs4q503(es4q598.equals("98") ? "" : this.es4q503);
        setEs4q504(es4q598.equals("98") ? "" : this.es4q504);
        setEs4q505(es4q598.equals("98") ? "" : this.es4q505);
        setEs4q506(es4q598.equals("98") ? "" : this.es4q506);
        setEs4q507(es4q598.equals("98") ? "" : this.es4q507);
        setEs4q508(es4q598.equals("98") ? "" : this.es4q508);
        setEs4q509(es4q598.equals("98") ? "" : this.es4q509);
        setEs4q596(es4q598.equals("98") ? "" : this.es4q596);
        notifyPropertyChanged(BR.es4q598);
    }

    @Bindable
    public String getEs4q6() {
        return es4q6;
    }

    public void setEs4q6(String es4q6) {
        this.es4q6 = es4q6;
        notifyPropertyChanged(BR.es4q6);
    }

    @Bindable
    public String getEs4q601() {
        return es4q601;
    }

    public void setEs4q601(String es4q601) {
        if (this.es4q601.equals(es4q601)) return; // for all checkboxes
        this.es4q601 = es4q601;
        notifyPropertyChanged(BR.es4q601);
    }

    @Bindable
    public String getEs4q602() {
        return es4q602;
    }

    public void setEs4q602(String es4q602) {
        if (this.es4q602.equals(es4q602)) return; // for all checkboxes
        this.es4q602 = es4q602;
        notifyPropertyChanged(BR.es4q602);
    }

    @Bindable
    public String getEs4q603() {
        return es4q603;
    }

    public void setEs4q603(String es4q603) {
        if (this.es4q603.equals(es4q603)) return; // for all checkboxes
        this.es4q603 = es4q603;
        notifyPropertyChanged(BR.es4q603);
    }

    @Bindable
    public String getEs4q604() {
        return es4q604;
    }

    public void setEs4q604(String es4q604) {
        if (this.es4q604.equals(es4q604)) return; // for all checkboxes
        this.es4q604 = es4q604;
        notifyPropertyChanged(BR.es4q604);
    }

    @Bindable
    public String getEs4q605() {
        return es4q605;
    }

    public void setEs4q605(String es4q605) {
        if (this.es4q605.equals(es4q605)) return; // for all checkboxes
        this.es4q605 = es4q605;
        notifyPropertyChanged(BR.es4q605);
    }

    @Bindable
    public String getEs4q696() {
        return es4q696;
    }

    public void setEs4q696(String es4q696) {
        if (this.es4q696.equals(es4q696)) return; // for all checkboxes
        this.es4q696 = es4q696;
        setEs4q696x(es4q696.equals("96") ? this.es4q696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q696);
    }

    @Bindable
    public String getEs4q696x() {
        return es4q696x;
    }

    public void setEs4q696x(String es4q696x) {
        this.es4q696x = es4q696x;
        notifyPropertyChanged(BR.es4q696x);
    }

    @Bindable
    public String getEs4q698() {
        return es4q698;
    }

    public void setEs4q698(String es4q698) {
        if (this.es4q698.equals(es4q698)) return; // for all checkboxes
        this.es4q698 = es4q698;
        setEs4q601(es4q698.equals("98") ? "" : this.es4q601);
        setEs4q602(es4q698.equals("98") ? "" : this.es4q602);
        setEs4q603(es4q698.equals("98") ? "" : this.es4q603);
        setEs4q604(es4q698.equals("98") ? "" : this.es4q604);
        setEs4q605(es4q698.equals("98") ? "" : this.es4q605);
        setEs4q696(es4q698.equals("98") ? "" : this.es4q696);
        notifyPropertyChanged(BR.es4q698);
    }

    @Bindable
    public String getEs4q7() {
        return es4q7;
    }

    public void setEs4q7(String es4q7) {
        this.es4q7 = es4q7;
        setEs4q801(es4q7.equals("2") ? "" : this.es4q801);
        setEs4q802(es4q7.equals("2") ? "" : this.es4q802);
        setEs4q803(es4q7.equals("2") ? "" : this.es4q803);
        setEs4q804(es4q7.equals("2") ? "" : this.es4q804);
        setEs4q805(es4q7.equals("2") ? "" : this.es4q805);
        setEs4q806(es4q7.equals("2") ? "" : this.es4q806);
        setEs4q807(es4q7.equals("2") ? "" : this.es4q807);
        setEs4q808(es4q7.equals("2") ? "" : this.es4q808);
        setEs4q809(es4q7.equals("2") ? "" : this.es4q809);
        setEs4q8010(es4q7.equals("2") ? "" : this.es4q8010);
        setEs4q8011(es4q7.equals("2") ? "" : this.es4q8011);
        setEs4q8012(es4q7.equals("2") ? "" : this.es4q8012);
        setEs4q8013(es4q7.equals("2") ? "" : this.es4q8013);
        setEs4q8014(es4q7.equals("2") ? "" : this.es4q8014);
        setEs4q8015(es4q7.equals("2") ? "" : this.es4q8015);
        setEs4q8016(es4q7.equals("2") ? "" : this.es4q8016);
        setEs4q8017(es4q7.equals("2") ? "" : this.es4q8017);
        setEs4q8018(es4q7.equals("2") ? "" : this.es4q8018);
        setEs4q866(es4q7.equals("2") ? "" : this.es4q866);
        setEs4q896(es4q7.equals("2") ? "" : this.es4q896);
        notifyPropertyChanged(BR.es4q7);
    }

    @Bindable
    public String getEs4q8() {
        return es4q8;
    }

    public void setEs4q8(String es4q8) {
        this.es4q8 = es4q8;
        notifyPropertyChanged(BR.es4q8);
    }

    @Bindable
    public String getEs4q801() {
        return es4q801;
    }

    public void setEs4q801(String es4q801) {
        if (this.es4q801.equals(es4q801)) return; // for all checkboxes
        this.es4q801 = es4q801;
        notifyPropertyChanged(BR.es4q801);
    }

    @Bindable
    public String getEs4q802() {
        return es4q802;
    }

    public void setEs4q802(String es4q802) {
        if (this.es4q802.equals(es4q802)) return; // for all checkboxes
        this.es4q802 = es4q802;
        notifyPropertyChanged(BR.es4q802);
    }

    @Bindable
    public String getEs4q803() {
        return es4q803;
    }

    public void setEs4q803(String es4q803) {
        if (this.es4q803.equals(es4q803)) return; // for all checkboxes
        this.es4q803 = es4q803;
        notifyPropertyChanged(BR.es4q803);
    }

    @Bindable
    public String getEs4q804() {
        return es4q804;
    }

    public void setEs4q804(String es4q804) {
        if (this.es4q804.equals(es4q804)) return; // for all checkboxes
        this.es4q804 = es4q804;
        notifyPropertyChanged(BR.es4q804);
    }

    @Bindable
    public String getEs4q805() {
        return es4q805;
    }

    public void setEs4q805(String es4q805) {
        if (this.es4q805.equals(es4q805)) return; // for all checkboxes
        this.es4q805 = es4q805;
        notifyPropertyChanged(BR.es4q805);
    }

    @Bindable
    public String getEs4q806() {
        return es4q806;
    }

    public void setEs4q806(String es4q806) {
        if (this.es4q806.equals(es4q806)) return; // for all checkboxes
        this.es4q806 = es4q806;
        notifyPropertyChanged(BR.es4q806);
    }

    @Bindable
    public String getEs4q807() {
        return es4q807;
    }

    public void setEs4q807(String es4q807) {
        if (this.es4q807.equals(es4q807)) return; // for all checkboxes
        this.es4q807 = es4q807;
        notifyPropertyChanged(BR.es4q807);
    }

    @Bindable
    public String getEs4q808() {
        return es4q808;
    }

    public void setEs4q808(String es4q808) {
        if (this.es4q808.equals(es4q808)) return; // for all checkboxes
        this.es4q808 = es4q808;
        notifyPropertyChanged(BR.es4q808);
    }

    @Bindable
    public String getEs4q809() {
        return es4q809;
    }

    public void setEs4q809(String es4q809) {
        if (this.es4q809.equals(es4q809)) return; // for all checkboxes
        this.es4q809 = es4q809;
        notifyPropertyChanged(BR.es4q809);
    }

    @Bindable
    public String getEs4q8010() {
        return es4q8010;
    }

    public void setEs4q8010(String es4q8010) {
        if (this.es4q8010.equals(es4q8010)) return; // for all checkboxes
        this.es4q8010 = es4q8010;
        notifyPropertyChanged(BR.es4q8010);
    }

    @Bindable
    public String getEs4q8011() {
        return es4q8011;
    }

    public void setEs4q8011(String es4q8011) {
        if (this.es4q8011.equals(es4q8011)) return; // for all checkboxes
        this.es4q8011 = es4q8011;
        notifyPropertyChanged(BR.es4q8011);
    }

    @Bindable
    public String getEs4q8012() {
        return es4q8012;
    }

    public void setEs4q8012(String es4q8012) {
        if (this.es4q8012.equals(es4q8012)) return; // for all checkboxes
        this.es4q8012 = es4q8012;
        notifyPropertyChanged(BR.es4q8012);
    }

    @Bindable
    public String getEs4q8013() {
        return es4q8013;
    }

    public void setEs4q8013(String es4q8013) {
        if (this.es4q8013.equals(es4q8013)) return; // for all checkboxes
        this.es4q8013 = es4q8013;
        notifyPropertyChanged(BR.es4q8013);
    }

    @Bindable
    public String getEs4q8014() {
        return es4q8014;
    }

    public void setEs4q8014(String es4q8014) {
        if (this.es4q8014.equals(es4q8014)) return; // for all checkboxes
        this.es4q8014 = es4q8014;
        notifyPropertyChanged(BR.es4q8014);
    }

    @Bindable
    public String getEs4q8015() {
        return es4q8015;
    }

    public void setEs4q8015(String es4q8015) {
        if (this.es4q8015.equals(es4q8015)) return; // for all checkboxes
        this.es4q8015 = es4q8015;
        notifyPropertyChanged(BR.es4q8015);
    }

    @Bindable
    public String getEs4q8016() {
        return es4q8016;
    }

    public void setEs4q8016(String es4q8016) {
        if (this.es4q8016.equals(es4q8016)) return; // for all checkboxes
        this.es4q8016 = es4q8016;
        notifyPropertyChanged(BR.es4q8016);
    }

    @Bindable
    public String getEs4q8017() {
        return es4q8017;
    }

    public void setEs4q8017(String es4q8017) {
        if (this.es4q8017.equals(es4q8017)) return; // for all checkboxes
        this.es4q8017 = es4q8017;
        notifyPropertyChanged(BR.es4q8017);
    }

    @Bindable
    public String getEs4q8018() {
        return es4q8018;
    }

    public void setEs4q8018(String es4q8018) {
        if (this.es4q8018.equals(es4q8018)) return; // for all checkboxes
        this.es4q8018 = es4q8018;
        notifyPropertyChanged(BR.es4q8018);
    }

    @Bindable
    public String getEs4q866() {
        return es4q866;
    }

    public void setEs4q866(String es4q866) {
        if (this.es4q866.equals(es4q866)) return; // for all checkboxes
        this.es4q866 = es4q866;
        setEs4q801(es4q866.equals("66") ? "" : this.es4q801);
        setEs4q802(es4q866.equals("66") ? "" : this.es4q802);
        setEs4q803(es4q866.equals("66") ? "" : this.es4q803);
        setEs4q804(es4q866.equals("66") ? "" : this.es4q804);
        setEs4q805(es4q866.equals("66") ? "" : this.es4q805);
        setEs4q806(es4q866.equals("66") ? "" : this.es4q806);
        setEs4q807(es4q866.equals("66") ? "" : this.es4q807);
        setEs4q808(es4q866.equals("66") ? "" : this.es4q808);
        setEs4q809(es4q866.equals("66") ? "" : this.es4q809);
        setEs4q8010(es4q866.equals("66") ? "" : this.es4q8010);
        setEs4q8011(es4q866.equals("66") ? "" : this.es4q8011);
        setEs4q8012(es4q866.equals("66") ? "" : this.es4q8012);
        setEs4q8013(es4q866.equals("66") ? "" : this.es4q8013);
        setEs4q8014(es4q866.equals("66") ? "" : this.es4q8014);
        setEs4q8015(es4q866.equals("66") ? "" : this.es4q8015);
        setEs4q8016(es4q866.equals("66") ? "" : this.es4q8016);
        setEs4q8017(es4q866.equals("66") ? "" : this.es4q8017);
        setEs4q8018(es4q866.equals("66") ? "" : this.es4q8018);
        setEs4q896(es4q866.equals("66") ? "" : this.es4q896);
        notifyPropertyChanged(BR.es4q866);
    }

    @Bindable
    public String getEs4q896() {
        return es4q896;
    }

    public void setEs4q896(String es4q896) {
        if (this.es4q896.equals(es4q896)) return; // for all checkboxes
        this.es4q896 = es4q896;
        setEs4q896x(es4q896.equals("96") ? this.es4q896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.es4q896);
    }

    @Bindable
    public String getEs4q896x() {
        return es4q896x;
    }

    public void setEs4q896x(String es4q896x) {
        this.es4q896x = es4q896x;
        notifyPropertyChanged(BR.es4q896x);
    }


    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es1resp = json.getString("es1resp");
            this.es1respline = json.getString("es1respline");
            this.es1cons = json.getString("es1cons");
            this.es1cons1 = json.getString("es1cons1");
            this.es1q1 = json.getString("es1q1");
            this.es1q196x = json.getString("es1q196x");
            this.es1q2 = json.getString("es1q2");
            this.es1q3 = json.getString("es1q3");
            this.es1q4 = json.getString("es1q4");
            this.es1q405 = json.getString("es1q405");
            this.es1q406 = json.getString("es1q406");
            this.es1q407 = json.getString("es1q407");
            this.es1q408 = json.getString("es1q408");
            this.es1q409 = json.getString("es1q409");
            this.es1q496 = json.getString("es1q496");
            this.es1q496x = json.getString("es1q496x");
            this.es1q5 = json.getString("es1q5");
            this.es1q6 = json.getString("es1q6");
            this.es1q7 = json.getString("es1q7");
            this.es1q8a = json.getString("es1q8a");
            this.es1q8b = json.getString("es1q8b");
            this.es1q8c = json.getString("es1q8c");
            this.es1q9a = json.getString("es1q9a");
            this.es1q9b = json.getString("es1q9b");
            this.es1q9c = json.getString("es1q9c");
        }
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es2q1 = json.getString("es2q1");
            this.es2q2 = json.getString("es2q2");
            this.es2q3 = json.getString("es2q3");
            this.es2q4 = json.getString("es2q4");
            this.es2q5 = json.getString("es2q5");
            this.es2q6 = json.getString("es2q6");
            this.es2q7 = json.getString("es2q7");
            this.es2q8 = json.getString("es2q8");
            this.es2q9 = json.getString("es2q9");
            this.es2q10 = json.getString("es2q10");
            this.es2q196x = json.getString("es2q196x");
        }
    }

    public void sE3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es3q1 = json.getString("es3q1");
            this.es3q201 = json.getString("es3q201");
            this.es3q202 = json.getString("es3q202");
            this.es3q203 = json.getString("es3q203");
            this.es3q204 = json.getString("es3q204");
            this.es3q204 = json.getString("es3q204");
            this.es3q206 = json.getString("es3q206");
            this.es3q207 = json.getString("es3q207");
            this.es3q208 = json.getString("es3q208");
            this.es3q296 = json.getString("es3q296");
            this.es3q296x = json.getString("es3q296x");
            this.es3q297 = json.getString("es3q297");
            this.es3q3 = json.getString("es3q3");
            this.es3q396x = json.getString("es3q396x");
            this.es3q4 = json.getString("es3q4");
            this.es3q5 = json.getString("es3q5");
            this.es3q501 = json.getString("es3q501");
            this.es3q502 = json.getString("es3q502");
            this.es3q503 = json.getString("es3q503");
            this.es3q504 = json.getString("es3q504");
            this.es3q505 = json.getString("es3q505");
            this.es3q506 = json.getString("es3q506");
            this.es3q507 = json.getString("es3q507");
            this.es3q596 = json.getString("es3q596");
            this.es3q596x = json.getString("es3q596x");
            this.es3q6 = json.getString("es3q6");
            this.es3q7 = json.getString("es3q7");
            this.es3q8 = json.getString("es3q8");
            this.es3q9 = json.getString("es3q9");
            this.es3q901 = json.getString("es3q901");
            this.es3q902 = json.getString("es3q902");
            this.es3q903 = json.getString("es3q903");
            this.es3q904 = json.getString("es3q904");
            this.es3q905 = json.getString("es3q905");
            this.es3q906 = json.getString("es3q906");
            this.es3q907 = json.getString("es3q907");
            this.es3q908 = json.getString("es3q908");
            this.es3q996 = json.getString("es3q996");
            this.es3q996x = json.getString("es3q996x");
            this.es3q998 = json.getString("es3q998");
            this.es3q10 = json.getString("es3q10");
            this.es3q1001 = json.getString("es3q1001");
            this.es3q1002 = json.getString("es3q1002");
            this.es3q1003 = json.getString("es3q1003");
            this.es3q1004 = json.getString("es3q1004");
            this.es3q1005 = json.getString("es3q1005");
            this.es3q1006 = json.getString("es3q1006");
            this.es3q1007 = json.getString("es3q1007");
            this.es3q1008 = json.getString("es3q1008");
            this.es3q196 = json.getString("es3q196");
            this.es3q196x = json.getString("es3q196x");
            this.es3q1098 = json.getString("es3q1098");
            this.es3q11 = json.getString("es3q11");
            this.es3q1106x = json.getString("es3q1106x");
            this.es3q12 = json.getString("es3q12");
            this.es3q13 = json.getString("es3q13");
            this.es3q14 = json.getString("es3q14");
        }
    }

    public void sE4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.es4q1 = json.getString("es4q1");
            this.es4q101 = json.getString("es4q101");
            this.es4q102 = json.getString("es4q102");
            this.es4q103 = json.getString("es4q103");
            this.es4q104 = json.getString("es4q104");
            this.es4q105 = json.getString("es4q105");
            this.es4q106 = json.getString("es4q106");
            this.es4q107 = json.getString("es4q107");
            this.es4q196 = json.getString("es4q196");
            this.es4q196x = json.getString("es4q196x");
            this.es4q197 = json.getString("es4q197");
            this.es4q198 = json.getString("es4q198");
            this.es4q2 = json.getString("es4q2");
            this.es4q3 = json.getString("es4q3");
            this.es4q301 = json.getString("es4q301");
            this.es4q302 = json.getString("es4q302");
            this.es4q303 = json.getString("es4q303");
            this.es4q304 = json.getString("es4q304");
            this.es4q305 = json.getString("es4q305");
            this.es4q306 = json.getString("es4q306");
            this.es4q307 = json.getString("es4q307");
            this.es4q396 = json.getString("es4q396");
            this.es4q396x = json.getString("es4q396x");
            this.es4q398 = json.getString("es4q398");
            this.es4q4 = json.getString("es4q4");
            this.es4q401 = json.getString("es4q401");
            this.es4q402 = json.getString("es4q402");
            this.es4q403 = json.getString("es4q403");
            this.es4q404 = json.getString("es4q404");
            this.es4q496 = json.getString("es4q496");
            this.es4q496x = json.getString("es4q496x");
            this.es4q498 = json.getString("es4q498");
            this.es4q5 = json.getString("es4q5");
            this.es4q501 = json.getString("es4q501");
            this.es4q502 = json.getString("es4q502");
            this.es4q503 = json.getString("es4q503");
            this.es4q504 = json.getString("es4q504");
            this.es4q505 = json.getString("es4q505");
            this.es4q506 = json.getString("es4q506");
            this.es4q507 = json.getString("es4q507");
            this.es4q508 = json.getString("es4q508");
            this.es4q509 = json.getString("es4q509");
            this.es4q596 = json.getString("es4q596");
            this.es4q596x = json.getString("es4q596x");
            this.es4q598 = json.getString("es4q598");
            this.es4q6 = json.getString("es4q6");
            this.es4q601 = json.getString("es4q601");
            this.es4q602 = json.getString("es4q602");
            this.es4q603 = json.getString("es4q603");
            this.es4q604 = json.getString("es4q604");
            this.es4q605 = json.getString("es4q605");
            this.es4q696 = json.getString("es4q696");
            this.es4q696x = json.getString("es4q696x");
            this.es4q698 = json.getString("es4q698");
            this.es4q7 = json.getString("es4q7");
            this.es4q8 = json.getString("es4q8");
            this.es4q801 = json.getString("es4q801");
            this.es4q802 = json.getString("es4q802");
            this.es4q803 = json.getString("es4q803");
            this.es4q804 = json.getString("es4q804");
            this.es4q805 = json.getString("es4q805");
            this.es4q806 = json.getString("es4q806");
            this.es4q807 = json.getString("es4q807");
            this.es4q808 = json.getString("es4q808");
            this.es4q809 = json.getString("es4q809");
            this.es4q8010 = json.getString("es4q8010");
            this.es4q8011 = json.getString("es4q8011");
            this.es4q8012 = json.getString("es4q8012");
            this.es4q8013 = json.getString("es4q8013");
            this.es4q8014 = json.getString("es4q8014");
            this.es4q8015 = json.getString("es4q8015");
            this.es4q8016 = json.getString("es4q8016");
            this.es4q8017 = json.getString("es4q8017");
            this.es4q8018 = json.getString("es4q8018");
            this.es4q866 = json.getString("es4q866");
            this.es4q896 = json.getString("es4q896");
            this.es4q896x = json.getString("es4q896x");
        }
    }


    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("es1resp", es1resp)
                .put("es1respline", es1respline)
                .put("es1cons", es1cons)
                .put("es1cons1", es1cons1)
                .put("es1q1", es1q1)
                .put("es1q196x", es1q196x)
                .put("es1q2", es1q2)
                .put("es1q3", es1q3)
                .put("es1q4", es1q4)
                .put("es1q405", es1q405)
                .put("es1q406", es1q406)
                .put("es1q407", es1q407)
                .put("es1q408", es1q408)
                .put("es1q409", es1q409)
                .put("es1q496", es1q496)
                .put("es1q496x", es1q496x)
                .put("es1q5", es1q5)
                .put("es1q6", es1q6)
                .put("es1q7", es1q7)
                .put("es1q8a", es1q8a)
                .put("es1q8b", es1q8b)
                .put("es1q8c", es1q8c)
                .put("es1q9a", es1q9a)
                .put("es1q9b", es1q9b)
                .put("es1q9c", es1q9c);
        return json.toString();
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json.put("es2q1", es2q1)
                .put("es2q2", es2q2)
                .put("es2q3", es2q3)
                .put("es2q4", es2q4)
                .put("es2q5", es2q5)
                .put("es2q6", es2q6)
                .put("es2q7", es2q7)
                .put("es2q8", es2q8)
                .put("es2q9", es2q9)
                .put("es2q10", es2q10)
                .put("es2q196x", es2q196x);
        return json.toString();
    }

    public String sE3toString() throws JSONException {
        Log.d(TAG, "sE3toString: ");
        JSONObject json = new JSONObject();
        json.put("es3q1", es3q1)
                .put("es3q201", es3q201)
                .put("es3q202", es3q202)
                .put("es3q203", es3q203)
                .put("es3q204", es3q204)
                .put("es3q205", es3q205)
                .put("es3q206", es3q206)
                .put("es3q207", es3q207)
                .put("es3q208", es3q208)
                .put("es3q296", es3q296)
                .put("es3q296x", es3q296x)
                .put("es3q297", es3q297)
                .put("es3q3", es3q3)
                .put("es3q396x", es3q396x)
                .put("es3q4", es3q4)
                .put("es3q5", es3q5)
                .put("es3q501", es3q501)
                .put("es3q502", es3q502)
                .put("es3q503", es3q503)
                .put("es3q504", es3q504)
                .put("es3q505", es3q505)
                .put("es3q506", es3q506)
                .put("es3q507", es3q507)
                .put("es3q596", es3q596)
                .put("es3q596x", es3q596x)
                .put("es3q6", es3q6)
                .put("es3q7", es3q7)
                .put("es3q8", es3q8)
                .put("es3q9", es3q9)
                .put("es3q901", es3q901)
                .put("es3q902", es3q902)
                .put("es3q903", es3q903)
                .put("es3q904", es3q904)
                .put("es3q905", es3q905)
                .put("es3q906", es3q906)
                .put("es3q907", es3q907)
                .put("es3q908", es3q908)
                .put("es3q996", es3q996)
                .put("es3q996x", es3q996x)
                .put("es3q998", es3q998)
                .put("es3q10", es3q10)
                .put("es3q1001", es3q1001)
                .put("es3q1002", es3q1002)
                .put("es3q1003", es3q1003)
                .put("es3q1004", es3q1004)
                .put("es3q1005", es3q1005)
                .put("es3q1006", es3q1006)
                .put("es3q1007", es3q1007)
                .put("es3q1008", es3q1008)
                .put("es3q196", es3q196)
                .put("es3q196x", es3q196x)
                .put("es3q1098", es3q1098)
                .put("es3q11", es3q11)
                .put("es3q1106x", es3q1106x)
                .put("es3q12", es3q12)
                .put("es3q13", es3q13)
                .put("es3q14", es3q14);
        return json.toString();
    }

    public String sE4toString() throws JSONException {
        Log.d(TAG, "sE4toString: ");
        JSONObject json = new JSONObject();
        json.put("es4q1", es4q1)
                .put("es4q101", es4q101)
                .put("es4q102", es4q102)
                .put("es4q103", es4q103)
                .put("es4q104", es4q104)
                .put("es4q105", es4q105)
                .put("es4q106", es4q106)
                .put("es4q107", es4q107)
                .put("es4q196", es4q196)
                .put("es4q196x", es4q196x)
                .put("es4q197", es4q197)
                .put("es4q198", es4q198)
                .put("es4q2", es4q2)
                .put("es4q3", es4q3)
                .put("es4q301", es4q301)
                .put("es4q302", es4q302)
                .put("es4q303", es4q303)
                .put("es4q304", es4q304)
                .put("es4q305", es4q305)
                .put("es4q306", es4q306)
                .put("es4q307", es4q307)
                .put("es4q396", es4q396)
                .put("es4q396x", es4q396x)
                .put("es4q398", es4q398)
                .put("es4q4", es4q4)
                .put("es4q401", es4q401)
                .put("es4q402", es4q402)
                .put("es4q403", es4q403)
                .put("es4q404", es4q404)
                .put("es4q496", es4q496)
                .put("es4q496x", es4q496x)
                .put("es4q498", es4q498)
                .put("es4q5", es4q5)
                .put("es4q501", es4q501)
                .put("es4q502", es4q502)
                .put("es4q503", es4q503)
                .put("es4q504", es4q504)
                .put("es4q505", es4q505)
                .put("es4q506", es4q506)
                .put("es4q507", es4q507)
                .put("es4q508", es4q508)
                .put("es4q509", es4q509)
                .put("es4q596", es4q596)
                .put("es4q596x", es4q596x)
                .put("es4q598", es4q598)
                .put("es4q6", es4q6)
                .put("es4q601", es4q601)
                .put("es4q602", es4q602)
                .put("es4q603", es4q603)
                .put("es4q604", es4q604)
                .put("es4q605", es4q605)
                .put("es4q696", es4q696)
                .put("es4q696x", es4q696x)
                .put("es4q698", es4q698)
                .put("es4q7", es4q7)
                .put("es4q8", es4q8)
                .put("es4q801", es4q801)
                .put("es4q802", es4q802)
                .put("es4q803", es4q803)
                .put("es4q804", es4q804)
                .put("es4q805", es4q805)
                .put("es4q806", es4q806)
                .put("es4q807", es4q807)
                .put("es4q808", es4q808)
                .put("es4q809", es4q809)
                .put("es4q8010", es4q8010)
                .put("es4q8011", es4q8011)
                .put("es4q8012", es4q8012)
                .put("es4q8013", es4q8013)
                .put("es4q8014", es4q8014)
                .put("es4q8015", es4q8015)
                .put("es4q8016", es4q8016)
                .put("es4q8017", es4q8017)
                .put("es4q8018", es4q8018)
                .put("es4q866", es4q866)
                .put("es4q896", es4q896)
                .put("es4q896x", es4q896x);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.LateAdolescentTable.COLUMN_ID, this.id);
        json.put(TableContracts.LateAdolescentTable.COLUMN_UID, this.uid);
        json.put(TableContracts.LateAdolescentTable.COLUMN_SNO_ADOL, this.snoAdol);
        json.put(TableContracts.LateAdolescentTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.LateAdolescentTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.LateAdolescentTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.LateAdolescentTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.LateAdolescentTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.LateAdolescentTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.LateAdolescentTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.LateAdolescentTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.LateAdolescentTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.LateAdolescentTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.LateAdolescentTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.LateAdolescentTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.LateAdolescentTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.LateAdolescentTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.LateAdolescentTable.COLUMN_SE1, new JSONObject(sE1toString()));
        json.put(TableContracts.LateAdolescentTable.COLUMN_SE2, new JSONObject(sE2toString()));
        json.put(TableContracts.LateAdolescentTable.COLUMN_SE3, new JSONObject(sE3toString()));
        json.put(TableContracts.LateAdolescentTable.COLUMN_SE4, new JSONObject(sE4toString()));
        return json;
    }

    public LateAdolescent Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_UUID));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_HHID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_INDEXED));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_PROJECT_NAME));
        this.snoAdol = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SNO_ADOL));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_FMUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SYNCED_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SE1)));
        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SE2)));
        sE3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SE3)));
        sE4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LateAdolescentTable.COLUMN_SE4)));
        return this;
    }


}
