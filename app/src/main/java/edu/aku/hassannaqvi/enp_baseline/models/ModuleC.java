package edu.aku.hassannaqvi.enp_baseline.models;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.enp_baseline.BR;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;


public class ModuleC extends BaseObservable implements Observable {

    private final String TAG = "ModuleC";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String entryType = _EMPTY_;

    // FIELD VARIABLES
    private String c101 = _EMPTY_;
    private String c102 = _EMPTY_;
    private String c103 = _EMPTY_;
    private String c104 = _EMPTY_;
    private String c105 = _EMPTY_;
    private String c10501x = _EMPTY_;
    private String c106 = _EMPTY_;
    private String c107 = _EMPTY_;
    private String c108 = _EMPTY_;
    private String c109 = _EMPTY_;
    private String c110 = _EMPTY_;
    private String c111 = _EMPTY_;
    private String c112wk = _EMPTY_;
    private String c112mm = _EMPTY_;
    private String c113dd = _EMPTY_;
    private String c113mm = _EMPTY_;
    private String c113yy = _EMPTY_;
    private String c114 = _EMPTY_;
    private String c115 = _EMPTY_;
    private String c11501 = _EMPTY_;
    private String c11502 = _EMPTY_;
    private String c11503 = _EMPTY_;
    private String c11504 = _EMPTY_;
    private String c11505 = _EMPTY_;
    private String c11506 = _EMPTY_;
    private String c11507 = _EMPTY_;
    private String c11508 = _EMPTY_;
    private String c11596 = _EMPTY_;
    private String c11596x = _EMPTY_;
    private String c116 = _EMPTY_;
    private String c116wk = _EMPTY_;
    private String c116wkx = _EMPTY_;
    private String c116mm = _EMPTY_;
    private String c116mmx = _EMPTY_;
    private String c117 = _EMPTY_;
    private String c11701 = _EMPTY_;
    private String c11702 = _EMPTY_;
    private String c11702x = _EMPTY_;
    private String c11703 = _EMPTY_;
    private String c11703x = _EMPTY_;
    private String c11796 = _EMPTY_;
    private String c11796x = _EMPTY_;
    private String c118 = _EMPTY_;
    private String c119 = _EMPTY_;
    private String c11996x = _EMPTY_;
    private String c119a = _EMPTY_;
    private String c119b = _EMPTY_;
    private String c119c = _EMPTY_;
    private String c119d = _EMPTY_;
    private String c119e = _EMPTY_;
    private String c119f = _EMPTY_;
    private String c119g = _EMPTY_;
    private String c119h = _EMPTY_;
    private String c11998 = _EMPTY_;
    private String c120 = _EMPTY_;
    private String c121 = _EMPTY_;
    private String c122 = _EMPTY_;
    private String c12201 = _EMPTY_;
    private String c12202 = _EMPTY_;
    private String c12203 = _EMPTY_;
    private String c12204 = _EMPTY_;
    private String c12205 = _EMPTY_;
    private String c12206 = _EMPTY_;
    private String c12207 = _EMPTY_;
    private String c12208 = _EMPTY_;
    private String c12296 = _EMPTY_;
    private String c12296x = _EMPTY_;
    private String c123 = _EMPTY_;
    private String c12301 = _EMPTY_;
    private String c12302 = _EMPTY_;
    private String c12396 = _EMPTY_;
    private String c12396x = _EMPTY_;
    private String c124 = _EMPTY_;
    private String c125 = _EMPTY_;
    private String c126 = _EMPTY_;
    private String c127 = _EMPTY_;
    private String c128 = _EMPTY_;
    private String c12801 = _EMPTY_;
    private String c12802 = _EMPTY_;
    private String c12896 = _EMPTY_;
    private String c12896x = _EMPTY_;
    private String c129 = _EMPTY_;
    private String c130s = _EMPTY_;
    private String c130c = _EMPTY_;
    private String c131 = _EMPTY_;
    private String c13196x = _EMPTY_;
    private String c132 = _EMPTY_;
    private String c133 = _EMPTY_;
    private String c133n = _EMPTY_;
    private String c133nx = _EMPTY_;
    private String c133998 = _EMPTY_;
    private String c201 = _EMPTY_;
    private String c202 = _EMPTY_;
    private String c20201 = _EMPTY_;
    private String c20202 = _EMPTY_;
    private String c20203 = _EMPTY_;
    private String c20204 = _EMPTY_;
    private String c20205 = _EMPTY_;
    private String c20206 = _EMPTY_;
    private String c20207 = _EMPTY_;
    private String c20208 = _EMPTY_;
    private String c20296 = _EMPTY_;
    private String c20296x = _EMPTY_;
    private String c203 = _EMPTY_;
    private String c20301 = _EMPTY_;
    private String c20302 = _EMPTY_;
    private String c20303 = _EMPTY_;
    private String c20304 = _EMPTY_;
    private String c20304x = _EMPTY_;
    private String c20305 = _EMPTY_;
    private String c20305x = _EMPTY_;
    private String c20396 = _EMPTY_;
    private String c20396x = _EMPTY_;
    private String c204 = _EMPTY_;
    private String c20401x = _EMPTY_;
    private String c20402x = _EMPTY_;
    private String c205 = _EMPTY_;
    private String c20501x = _EMPTY_;
    private String c206 = _EMPTY_;
    private String c20602 = _EMPTY_;
    private String c20603 = _EMPTY_;
    private String c20604 = _EMPTY_;
    private String c20605 = _EMPTY_;
    private String c20606 = _EMPTY_;
    private String c20607 = _EMPTY_;
    private String c20608 = _EMPTY_;
    private String c20697 = _EMPTY_;
    private String c206oth = _EMPTY_;
    private String c20696x = _EMPTY_;
    private String c207 = _EMPTY_;
    private String c208 = _EMPTY_;
    private String c209 = _EMPTY_;
    private String c20901 = _EMPTY_;
    private String c20902 = _EMPTY_;
    private String c20903 = _EMPTY_;
    private String c20904 = _EMPTY_;
    private String c20905 = _EMPTY_;
    private String c20906 = _EMPTY_;
    private String c20907 = _EMPTY_;
    private String c20908 = _EMPTY_;
    private String c20996 = _EMPTY_;
    private String c20996x = _EMPTY_;
    private String c210 = _EMPTY_;
    private String c21001 = _EMPTY_;
    private String c21001x = _EMPTY_;
    private String c21002 = _EMPTY_;
    private String c21002x = _EMPTY_;
    private String c21096 = _EMPTY_;
    private String c21096x = _EMPTY_;
    private String c211 = _EMPTY_;
    private String c212 = _EMPTY_;
    private String c213 = _EMPTY_;
    private String c214 = _EMPTY_;
    private String c215 = _EMPTY_;
    private String c21501 = _EMPTY_;
    private String c21501x = _EMPTY_;
    private String c21502 = _EMPTY_;
    private String c21502x = _EMPTY_;
    private String c21596 = _EMPTY_;
    private String c21596x = _EMPTY_;
    private String c216 = _EMPTY_;
    private String c217 = _EMPTY_;
    private String c21701x = _EMPTY_;
    private String c21702x = _EMPTY_;
    private String c218 = _EMPTY_;
    private String c21896x = _EMPTY_;
    private String c219 = _EMPTY_;
    private String c220 = _EMPTY_;
    private String c221n = _EMPTY_;
    private String c301 = _EMPTY_;
    private String c30196x = _EMPTY_;
    private String c302 = _EMPTY_;
    private String c30204x = _EMPTY_;
    private String c30205x = _EMPTY_;
    private String c30296x = _EMPTY_;
    private String c303 = _EMPTY_;
    private String c304 = _EMPTY_;
    private String c305 = _EMPTY_;
    private String c306 = _EMPTY_;
    private String c30601x = _EMPTY_;
    private String c30602x = _EMPTY_;
    private String c307 = _EMPTY_;
    private String c308 = _EMPTY_;
    private String c309 = _EMPTY_;
    private String c310 = _EMPTY_;
    private String c310hx = _EMPTY_;
    private String c311 = _EMPTY_;
    private String c31101 = _EMPTY_;
    private String c311h = _EMPTY_;
    private String c311hx = _EMPTY_;
    private String c311d = _EMPTY_;
    private String c311dx = _EMPTY_;
    private String c312 = _EMPTY_;
    private String c313 = _EMPTY_;
    private String c31396x = _EMPTY_;
    private String c314 = _EMPTY_;
    private String c31401x = _EMPTY_;
    private String c31402x = _EMPTY_;
    private String c31496x = _EMPTY_;
    private String c315 = _EMPTY_;
    private String c316 = _EMPTY_;
    private String c31601 = _EMPTY_;
    private String c31602 = _EMPTY_;
    private String c31603 = _EMPTY_;
    private String c31604 = _EMPTY_;
    private String c31605 = _EMPTY_;
    private String c31606 = _EMPTY_;
    private String c31607 = _EMPTY_;
    private String c31608 = _EMPTY_;
    private String c31696 = _EMPTY_;
    private String c31696x = _EMPTY_;
    private String c317 = _EMPTY_;
    private String c317hx = _EMPTY_;
    private String c317dx = _EMPTY_;
    private String c317wx = _EMPTY_;
    private String c318 = _EMPTY_;
    private String c319 = _EMPTY_;
    private String c31901 = _EMPTY_;
    private String c31902 = _EMPTY_;
    private String c31903 = _EMPTY_;
    private String c31904 = _EMPTY_;
    private String c31905 = _EMPTY_;
    private String c31906 = _EMPTY_;
    private String c31907 = _EMPTY_;
    private String c31908 = _EMPTY_;
    private String c31909 = _EMPTY_;
    private String c31996 = _EMPTY_;
    private String c31996x = _EMPTY_;
    private String c320 = _EMPTY_;
    private String c321 = _EMPTY_;
    private String c32101 = _EMPTY_;
    private String c32102 = _EMPTY_;
    private String c32103 = _EMPTY_;
    private String c32104 = _EMPTY_;
    private String c32105 = _EMPTY_;
    private String c32106 = _EMPTY_;
    private String c32107 = _EMPTY_;
    private String c32108 = _EMPTY_;
    private String c32196 = _EMPTY_;
    private String c32196x = _EMPTY_;
    private String c322 = _EMPTY_;
    private String c322h = _EMPTY_;
    private String c322hx = _EMPTY_;
    private String c322d = _EMPTY_;
    private String c322dx = _EMPTY_;
    private String c322w = _EMPTY_;
    private String c322wx = _EMPTY_;
    private String c322998 = _EMPTY_;
    private String c323 = _EMPTY_;
    private String c324 = _EMPTY_;
    private String c32401 = _EMPTY_;
    private String c32402 = _EMPTY_;
    private String c32403 = _EMPTY_;
    private String c32404 = _EMPTY_;
    private String c32405 = _EMPTY_;
    private String c32496 = _EMPTY_;
    private String c32496x = _EMPTY_;
    private String c325 = _EMPTY_;
    private String c326 = _EMPTY_;
    private String c32601x = _EMPTY_;
    private String c32602x = _EMPTY_;
    private String c327 = _EMPTY_;
    private String c32701x = _EMPTY_;
    private String c32702x = _EMPTY_;
    private String c328 = _EMPTY_;
    private String c32896x = _EMPTY_;
    private String c329 = _EMPTY_;
    private String c330 = _EMPTY_;
    private String c331 = _EMPTY_;
    private String c33101 = _EMPTY_;
    private String c33102 = _EMPTY_;
    private String c33103 = _EMPTY_;
    private String c33104 = _EMPTY_;
    private String c33105 = _EMPTY_;
    private String c33106 = _EMPTY_;
    private String c33107 = _EMPTY_;
    private String c33108 = _EMPTY_;
    private String c33109 = _EMPTY_;
    private String c33110 = _EMPTY_;
    private String c33111 = _EMPTY_;
    private String c33112 = _EMPTY_;
    private String c33113 = _EMPTY_;
    private String c33114 = _EMPTY_;
    private String c33115 = _EMPTY_;
    private String c33116 = _EMPTY_;
    private String c33196 = _EMPTY_;
    private String c33196x = _EMPTY_;
    private String c401 = _EMPTY_;
    private String c402 = _EMPTY_;
    private String c40296x = _EMPTY_;
    private String c403 = _EMPTY_;
    private String c40301 = _EMPTY_;
    private String c40302 = _EMPTY_;
    private String c40303 = _EMPTY_;
    private String c40304 = _EMPTY_;
    private String c40305 = _EMPTY_;
    private String c40306 = _EMPTY_;
    private String c40307 = _EMPTY_;
    private String c40308 = _EMPTY_;
    private String c40309 = _EMPTY_;
    private String c40310 = _EMPTY_;
    private String c40311 = _EMPTY_;
    private String c40396 = _EMPTY_;
    private String c40396x = _EMPTY_;
    private String c404 = _EMPTY_;
    private String c40401x = _EMPTY_;
    private String c405 = _EMPTY_;
    private String c406 = _EMPTY_;
    private String c40696x = _EMPTY_;
    private String c501 = _EMPTY_;
    private String c5011 = _EMPTY_;
    private String c5012 = _EMPTY_;
    private String c5013 = _EMPTY_;
    private String c502 = _EMPTY_;
    private String c5021 = _EMPTY_;
    private String c5022 = _EMPTY_;
    private String c5023 = _EMPTY_;
    private String c503 = _EMPTY_;
    private String c5031 = _EMPTY_;
    private String c5032 = _EMPTY_;
    private String c5033 = _EMPTY_;
    private String c504 = _EMPTY_;
    private String c50496x = _EMPTY_;
    private String c5041 = _EMPTY_;
    private String c5042 = _EMPTY_;
    private String c5043 = _EMPTY_;
    private String c505 = _EMPTY_;
    private String c50596x = _EMPTY_;
    private String c60101 = _EMPTY_;
    private String c60102 = _EMPTY_;
    private String c60103 = _EMPTY_;
    private String c60104 = _EMPTY_;
    private String c60105 = _EMPTY_;
    private String c60106 = _EMPTY_;
    private String c60107 = _EMPTY_;
    private String c60197 = _EMPTY_;
    private String c60201 = _EMPTY_;
    private String c60202 = _EMPTY_;
    private String c60203 = _EMPTY_;
    private String c60204 = _EMPTY_;
    private String c60205 = _EMPTY_;
    private String c60206 = _EMPTY_;
    private String c60207 = _EMPTY_;
    private String c60297 = _EMPTY_;
    private String c60301 = _EMPTY_;
    private String c60302 = _EMPTY_;
    private String c60303 = _EMPTY_;
    private String c60304 = _EMPTY_;
    private String c60305 = _EMPTY_;
    private String c60306 = _EMPTY_;
    private String c60307 = _EMPTY_;
    private String c60397 = _EMPTY_;
    private String c60401 = _EMPTY_;
    private String c60402 = _EMPTY_;
    private String c60403 = _EMPTY_;
    private String c60404 = _EMPTY_;
    private String c60405 = _EMPTY_;
    private String c60406 = _EMPTY_;
    private String c60407 = _EMPTY_;
    private String c60497 = _EMPTY_;
    private String c60501 = _EMPTY_;
    private String c60502 = _EMPTY_;
    private String c60503 = _EMPTY_;
    private String c60504 = _EMPTY_;
    private String c60505 = _EMPTY_;
    private String c60506 = _EMPTY_;
    private String c60507 = _EMPTY_;
    private String c60597 = _EMPTY_;
    private String c60601 = _EMPTY_;
    private String c60602 = _EMPTY_;
    private String c60603 = _EMPTY_;
    private String c60604 = _EMPTY_;
    private String c60605 = _EMPTY_;
    private String c60606 = _EMPTY_;
    private String c60607 = _EMPTY_;
    private String c60697 = _EMPTY_;
    private String c60701 = _EMPTY_;
    private String c60702 = _EMPTY_;
    private String c60703 = _EMPTY_;
    private String c60704 = _EMPTY_;
    private String c60705 = _EMPTY_;
    private String c60706 = _EMPTY_;
    private String c60707 = _EMPTY_;
    private String c60797 = _EMPTY_;
    private String c60801 = _EMPTY_;
    private String c60802 = _EMPTY_;
    private String c60803 = _EMPTY_;
    private String c60804 = _EMPTY_;
    private String c60805 = _EMPTY_;
    private String c60806 = _EMPTY_;
    private String c60807 = _EMPTY_;
    private String c60897 = _EMPTY_;
    private String c60901 = _EMPTY_;
    private String c60902 = _EMPTY_;
    private String c60903 = _EMPTY_;
    private String c60904 = _EMPTY_;
    private String c60905 = _EMPTY_;
    private String c60906 = _EMPTY_;
    private String c60907 = _EMPTY_;
    private String c60997 = _EMPTY_;
    private String c61001 = _EMPTY_;
    private String c61002 = _EMPTY_;
    private String c61003 = _EMPTY_;
    private String c61004 = _EMPTY_;
    private String c61005 = _EMPTY_;
    private String c61006 = _EMPTY_;
    private String c61007 = _EMPTY_;
    private String c61097 = _EMPTY_;


    public ModuleC() {

/*        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());*/

    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);
        setEntryType(String.valueOf(MainApp.entryType));

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
        notifyPropertyChanged(BR.psuCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
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

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

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


    public ModuleC Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));

        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA2)));
        sC3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3)));
        sC4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4)));
        sC5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5)));
        sC6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5)));
        return this;
    }

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
            this.c104 = json.getString("c104");
            this.c105 = json.getString("c105");
            this.c10501x = json.getString("c10501x");
            this.c106 = json.getString("c106");
            this.c107 = json.getString("c107");
            this.c108 = json.getString("c108");
            this.c109 = json.getString("c109");
            this.c110 = json.getString("c110");
            this.c111 = json.getString("c111");
            this.c112wk = json.getString("c112wk");
            this.c112mm = json.getString("c112mm");
            this.c113dd = json.getString("c113dd");
            this.c113mm = json.getString("c113mm");
            this.c113yy = json.getString("c113yy");
            this.c114 = json.getString("c114");
            this.c115 = json.getString("c115");
            this.c11501 = json.getString("c11501");
            this.c11502 = json.getString("c11502");
            this.c11503 = json.getString("c11503");
            this.c11504 = json.getString("c11504");
            this.c11505 = json.getString("c11505");
            this.c11506 = json.getString("c11506");
            this.c11507 = json.getString("c11507");
            this.c11508 = json.getString("c11508");
            this.c11596 = json.getString("c11596");
            this.c11596x = json.getString("c11596x");
            this.c116 = json.getString("c116");
            this.c116wk = json.getString("c116wk");
            this.c116wkx = json.getString("c116wkx");
            this.c116mm = json.getString("c116mm");
            this.c116mmx = json.getString("c116mmx");
            this.c117 = json.getString("c117");
            this.c11701 = json.getString("c11701");
            this.c11702 = json.getString("c11702");
            this.c11702x = json.getString("c11702x");
            this.c11703 = json.getString("c11703");
            this.c11703x = json.getString("c11703x");
            this.c11796 = json.getString("c11796");
            this.c11796x = json.getString("c11796x");
            this.c118 = json.getString("c118");
            this.c119 = json.getString("c119");
            this.c11996x = json.getString("c11996x");
            this.c119a = json.getString("c119a");
            this.c119b = json.getString("c119b");
            this.c119c = json.getString("c119c");
            this.c119d = json.getString("c119d");
            this.c119e = json.getString("c119e");
            this.c119f = json.getString("c119f");
            this.c119g = json.getString("c119g");
            this.c119h = json.getString("c119h");
            this.c11998 = json.getString("c11998");
            this.c120 = json.getString("c120");
            this.c121 = json.getString("c121");
            this.c122 = json.getString("c122");
            this.c12201 = json.getString("c12201");
            this.c12202 = json.getString("c12202");
            this.c12203 = json.getString("c12203");
            this.c12204 = json.getString("c12204");
            this.c12205 = json.getString("c12205");
            this.c12206 = json.getString("c12206");
            this.c12207 = json.getString("c12207");
            this.c12208 = json.getString("c12208");
            this.c12296 = json.getString("c12296");
            this.c12296x = json.getString("c12296x");
            this.c123 = json.getString("c123");
            this.c12301 = json.getString("c12301");
            this.c12302 = json.getString("c12302");
            this.c12396 = json.getString("c12396");
            this.c12396x = json.getString("c12396x");
            this.c124 = json.getString("c124");
            this.c125 = json.getString("c125");
            this.c126 = json.getString("c126");
            this.c127 = json.getString("c127");
            this.c128 = json.getString("c128");
            this.c12801 = json.getString("c12801");
            this.c12802 = json.getString("c12802");
            this.c12896 = json.getString("c12896");
            this.c12896x = json.getString("c12896x");
            this.c129 = json.getString("c129");
            this.c130s = json.getString("c130s");
            this.c130c = json.getString("c130c");
            this.c131 = json.getString("c131");
            this.c13196x = json.getString("c13196x");
            this.c132 = json.getString("c132");
            this.c133 = json.getString("c133");
            this.c133n = json.getString("c133n");
            this.c133nx = json.getString("c133nx");
            this.c133998 = json.getString("c133998");
        }
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c20201 = json.getString("c20201");
            this.c20202 = json.getString("c20202");
            this.c20203 = json.getString("c20203");
            this.c20204 = json.getString("c20204");
            this.c20205 = json.getString("c20205");
            this.c20206 = json.getString("c20206");
            this.c20207 = json.getString("c20207");
            this.c20208 = json.getString("c20208");
            this.c20296 = json.getString("c20296");
            this.c20296x = json.getString("c20296x");
            this.c203 = json.getString("c203");
            this.c20301 = json.getString("c20301");
            this.c20302 = json.getString("c20302");
            this.c20303 = json.getString("c20303");
            this.c20304 = json.getString("c20304");
            this.c20304x = json.getString("c20304x");
            this.c20305 = json.getString("c20305");
            this.c20305x = json.getString("c20305x");
            this.c20396 = json.getString("c20396");
            this.c20396x = json.getString("c20396x");
            this.c204 = json.getString("c204");
            this.c20401x = json.getString("c20401x");
            this.c20402x = json.getString("c20402x");
            this.c205 = json.getString("c205");
            this.c20501x = json.getString("c20501x");
            this.c206 = json.getString("c206");
            this.c20602 = json.getString("c20602");
            this.c20603 = json.getString("c20603");
            this.c20604 = json.getString("c20604");
            this.c20605 = json.getString("c20605");
            this.c20606 = json.getString("c20606");
            this.c20607 = json.getString("c20607");
            this.c20608 = json.getString("c20608");
            this.c20697 = json.getString("c20697");
            this.c206oth = json.getString("c206oth");
            this.c20696x = json.getString("c20696x");
            this.c207 = json.getString("c207");
            this.c208 = json.getString("c208");
            this.c209 = json.getString("c209");
            this.c20901 = json.getString("c20901");
            this.c20902 = json.getString("c20902");
            this.c20903 = json.getString("c20903");
            this.c20904 = json.getString("c20904");
            this.c20905 = json.getString("c20905");
            this.c20906 = json.getString("c20906");
            this.c20907 = json.getString("c20907");
            this.c20908 = json.getString("c20908");
            this.c20996 = json.getString("c20996");
            this.c20996x = json.getString("c20996x");
            this.c210 = json.getString("c210");
            this.c21001 = json.getString("c21001");
            this.c21001x = json.getString("c21001x");
            this.c21002 = json.getString("c21002");
            this.c21002x = json.getString("c21002x");
            this.c21096 = json.getString("c21096");
            this.c21096x = json.getString("c21096x");
            this.c211 = json.getString("c211");
            this.c212 = json.getString("c212");
            this.c213 = json.getString("c213");
            this.c214 = json.getString("c214");
            this.c215 = json.getString("c215");
            this.c21501 = json.getString("c21501");
            this.c21501x = json.getString("c21501x");
            this.c21502 = json.getString("c21502");
            this.c21502x = json.getString("c21502x");
            this.c21596 = json.getString("c21596");
            this.c21596x = json.getString("c21596x");
            this.c216 = json.getString("c216");
            this.c217 = json.getString("c217");
            this.c21701x = json.getString("c21701x");
            this.c21702x = json.getString("c21702x");
            this.c218 = json.getString("c218");
            this.c21896x = json.getString("c21896x");
            this.c219 = json.getString("c219");
            this.c220 = json.getString("c220");
            this.c221n = json.getString("c221n");
        }
    }

    public void sC3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c301 = json.getString("c301");
            this.c30196x = json.getString("c30196x");
            this.c302 = json.getString("c302");
            this.c30204x = json.getString("c30204x");
            this.c30205x = json.getString("c30205x");
            this.c30296x = json.getString("c30296x");
            this.c303 = json.getString("c303");
            this.c304 = json.getString("c304");
            this.c305 = json.getString("c305");
            this.c306 = json.getString("c306");
            this.c30601x = json.getString("c30601x");
            this.c30602x = json.getString("c30602x");
            this.c307 = json.getString("c307");
            this.c308 = json.getString("c308");
            this.c309 = json.getString("c309");
            this.c310 = json.getString("c310");
            this.c310hx = json.getString("c310hx");
            this.c311 = json.getString("c311");
            this.c31101 = json.getString("c31101");
            this.c311h = json.getString("c311h");
            this.c311hx = json.getString("c311hx");
            this.c311d = json.getString("c311d");
            this.c311dx = json.getString("c311dx");
            this.c312 = json.getString("c312");
            this.c313 = json.getString("c313");
            this.c31396x = json.getString("c31396x");
            this.c314 = json.getString("c314");
            this.c31401x = json.getString("c31401x");
            this.c31402x = json.getString("c31402x");
            this.c31496x = json.getString("c31496x");
            this.c315 = json.getString("c315");
            this.c316 = json.getString("c316");
            this.c31601 = json.getString("c31601");
            this.c31602 = json.getString("c31602");
            this.c31603 = json.getString("c31603");
            this.c31604 = json.getString("c31604");
            this.c31605 = json.getString("c31605");
            this.c31606 = json.getString("c31606");
            this.c31607 = json.getString("c31607");
            this.c31608 = json.getString("c31608");
            this.c31696 = json.getString("c31696");
            this.c31696x = json.getString("c31696x");
            this.c317 = json.getString("c317");
            this.c317hx = json.getString("c317hx");
            this.c317dx = json.getString("c317dx");
            this.c317wx = json.getString("c317wx");
            this.c318 = json.getString("c318");
            this.c319 = json.getString("c319");
            this.c31901 = json.getString("c31901");
            this.c31902 = json.getString("c31902");
            this.c31903 = json.getString("c31903");
            this.c31904 = json.getString("c31904");
            this.c31905 = json.getString("c31905");
            this.c31906 = json.getString("c31906");
            this.c31907 = json.getString("c31907");
            this.c31908 = json.getString("c31908");
            this.c31909 = json.getString("c31909");
            this.c31996 = json.getString("c31996");
            this.c31996x = json.getString("c31996x");
            this.c320 = json.getString("c320");
            this.c321 = json.getString("c321");
            this.c32101 = json.getString("c32101");
            this.c32102 = json.getString("c32102");
            this.c32103 = json.getString("c32103");
            this.c32104 = json.getString("c32104");
            this.c32105 = json.getString("c32105");
            this.c32106 = json.getString("c32106");
            this.c32107 = json.getString("c32107");
            this.c32108 = json.getString("c32108");
            this.c32196 = json.getString("c32196");
            this.c32196x = json.getString("c32196x");
            this.c322 = json.getString("c322");
            this.c322h = json.getString("c322h");
            this.c322hx = json.getString("c322hx");
            this.c322d = json.getString("c322d");
            this.c322dx = json.getString("c322dx");
            this.c322w = json.getString("c322w");
            this.c322wx = json.getString("c322wx");
            this.c322998 = json.getString("c322998");
            this.c323 = json.getString("c323");
            this.c324 = json.getString("c324");
            this.c32401 = json.getString("c32401");
            this.c32402 = json.getString("c32402");
            this.c32403 = json.getString("c32403");
            this.c32404 = json.getString("c32404");
            this.c32405 = json.getString("c32405");
            this.c32496 = json.getString("c32496");
            this.c32496x = json.getString("c32496x");
            this.c325 = json.getString("c325");
            this.c326 = json.getString("c326");
            this.c32601x = json.getString("c32601x");
            this.c32602x = json.getString("c32602x");
            this.c327 = json.getString("c327");
            this.c32701x = json.getString("c32701x");
            this.c32702x = json.getString("c32702x");
            this.c328 = json.getString("c328");
            this.c32896x = json.getString("c32896x");
            this.c329 = json.getString("c329");
            this.c330 = json.getString("c330");
            this.c331 = json.getString("c331");
            this.c33101 = json.getString("c33101");
            this.c33102 = json.getString("c33102");
            this.c33103 = json.getString("c33103");
            this.c33104 = json.getString("c33104");
            this.c33105 = json.getString("c33105");
            this.c33106 = json.getString("c33106");
            this.c33107 = json.getString("c33107");
            this.c33108 = json.getString("c33108");
            this.c33109 = json.getString("c33109");
            this.c33110 = json.getString("c33110");
            this.c33111 = json.getString("c33111");
            this.c33112 = json.getString("c33112");
            this.c33113 = json.getString("c33113");
            this.c33114 = json.getString("c33114");
            this.c33115 = json.getString("c33115");
            this.c33116 = json.getString("c33116");
            this.c33196 = json.getString("c33196");
            this.c33196x = json.getString("c33196x");
        }
    }

    public void sC4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c401 = json.getString("c401");
            this.c402 = json.getString("c402");
            this.c40296x = json.getString("c40296x");
            this.c403 = json.getString("c403");
            this.c40301 = json.getString("c40301");
            this.c40302 = json.getString("c40302");
            this.c40303 = json.getString("c40303");
            this.c40304 = json.getString("c40304");
            this.c40305 = json.getString("c40305");
            this.c40306 = json.getString("c40306");
            this.c40307 = json.getString("c40307");
            this.c40308 = json.getString("c40308");
            this.c40309 = json.getString("c40309");
            this.c40310 = json.getString("c40310");
            this.c40311 = json.getString("c40311");
            this.c40396 = json.getString("c40396");
            this.c40396x = json.getString("c40396x");
            this.c404 = json.getString("c404");
            this.c40401x = json.getString("c40401x");
            this.c405 = json.getString("c405");
            this.c406 = json.getString("c406");
            this.c40696x = json.getString("c40696x");
        }
    }

    public void sC5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c501 = json.getString("c501");
            this.c5011 = json.getString("c5011");
            this.c5012 = json.getString("c5012");
            this.c5013 = json.getString("c5013");
            this.c502 = json.getString("c502");
            this.c5021 = json.getString("c5021");
            this.c5022 = json.getString("c5022");
            this.c5023 = json.getString("c5023");
            this.c503 = json.getString("c503");
            this.c5031 = json.getString("c5031");
            this.c5032 = json.getString("c5032");
            this.c5033 = json.getString("c5033");
            this.c504 = json.getString("c504");
            this.c50496x = json.getString("c50496x");
            this.c5041 = json.getString("c5041");
            this.c5042 = json.getString("c5042");
            this.c5043 = json.getString("c5043");
            this.c505 = json.getString("c505");
            this.c50596x = json.getString("c50596x");
        }
    }

    public void sC6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c60101 = json.getString("c60101");
            this.c60102 = json.getString("c60102");
            this.c60103 = json.getString("c60103");
            this.c60104 = json.getString("c60104");
            this.c60105 = json.getString("c60105");
            this.c60106 = json.getString("c60106");
            this.c60107 = json.getString("c60107");
            this.c60197 = json.getString("c60197");
            this.c60201 = json.getString("c60201");
            this.c60202 = json.getString("c60202");
            this.c60203 = json.getString("c60203");
            this.c60204 = json.getString("c60204");
            this.c60205 = json.getString("c60205");
            this.c60206 = json.getString("c60206");
            this.c60207 = json.getString("c60207");
            this.c60297 = json.getString("c60297");
            this.c60301 = json.getString("c60301");
            this.c60302 = json.getString("c60302");
            this.c60303 = json.getString("c60303");
            this.c60304 = json.getString("c60304");
            this.c60305 = json.getString("c60305");
            this.c60306 = json.getString("c60306");
            this.c60307 = json.getString("c60307");
            this.c60397 = json.getString("c60397");
            this.c60401 = json.getString("c60401");
            this.c60402 = json.getString("c60402");
            this.c60403 = json.getString("c60403");
            this.c60404 = json.getString("c60404");
            this.c60405 = json.getString("c60405");
            this.c60406 = json.getString("c60406");
            this.c60407 = json.getString("c60407");
            this.c60497 = json.getString("c60497");
            this.c60501 = json.getString("c60501");
            this.c60502 = json.getString("c60502");
            this.c60503 = json.getString("c60503");
            this.c60504 = json.getString("c60504");
            this.c60505 = json.getString("c60505");
            this.c60506 = json.getString("c60506");
            this.c60507 = json.getString("c60507");
            this.c60597 = json.getString("c60597");
            this.c60601 = json.getString("c60601");
            this.c60602 = json.getString("c60602");
            this.c60603 = json.getString("c60603");
            this.c60604 = json.getString("c60604");
            this.c60605 = json.getString("c60605");
            this.c60606 = json.getString("c60606");
            this.c60607 = json.getString("c60607");
            this.c60697 = json.getString("c60697");
            this.c60701 = json.getString("c60701");
            this.c60702 = json.getString("c60702");
            this.c60703 = json.getString("c60703");
            this.c60704 = json.getString("c60704");
            this.c60705 = json.getString("c60705");
            this.c60706 = json.getString("c60706");
            this.c60707 = json.getString("c60707");
            this.c60797 = json.getString("c60797");
            this.c60801 = json.getString("c60801");
            this.c60802 = json.getString("c60802");
            this.c60803 = json.getString("c60803");
            this.c60804 = json.getString("c60804");
            this.c60805 = json.getString("c60805");
            this.c60806 = json.getString("c60806");
            this.c60807 = json.getString("c60807");
            this.c60897 = json.getString("c60897");
            this.c60901 = json.getString("c60901");
            this.c60902 = json.getString("c60902");
            this.c60903 = json.getString("c60903");
            this.c60904 = json.getString("c60904");
            this.c60905 = json.getString("c60905");
            this.c60906 = json.getString("c60906");
            this.c60907 = json.getString("c60907");
            this.c60997 = json.getString("c60997");
            this.c61001 = json.getString("c61001");
            this.c61002 = json.getString("c61002");
            this.c61003 = json.getString("c61003");
            this.c61004 = json.getString("c61004");
            this.c61005 = json.getString("c61005");
            this.c61006 = json.getString("c61006");
            this.c61007 = json.getString("c61007");
            this.c61097 = json.getString("c61097");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sC1toString()));
        json.put(FormsTable.COLUMN_SA2, new JSONObject(sC2toString()));
        json.put(FormsTable.COLUMN_SA3, new JSONObject(sC3toString()));
        json.put(FormsTable.COLUMN_SA4, new JSONObject(sC4toString()));
        json.put(FormsTable.COLUMN_SA5, new JSONObject(sC5toString()));
        json.put(FormsTable.COLUMN_SA5, new JSONObject(sC6toString()));
        return json;
    }

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();
        json.put("c101", c101)
                .put("c102", c102)
                .put("c103", c103)
                .put("c104", c104)
                .put("c105", c105)
                .put("c10501x", c10501x)
                .put("c106", c106)
                .put("c107", c107)
                .put("c108", c108)
                .put("c109", c109)
                .put("c110", c110)
                .put("c111", c111)
                .put("c112wk", c112wk)
                .put("c112mm", c112mm)
                .put("c113dd", c113dd)
                .put("c113mm", c113mm)
                .put("c113yy", c113yy)
                .put("c114", c114)
                .put("c115", c115)
                .put("c11501", c11501)
                .put("c11502", c11502)
                .put("c11503", c11503)
                .put("c11504", c11504)
                .put("c11505", c11505)
                .put("c11506", c11506)
                .put("c11507", c11507)
                .put("c11508", c11508)
                .put("c11596", c11596)
                .put("c11596x", c11596x)
                .put("c116", c116)
                .put("c116wk", c116wk)
                .put("c116wkx", c116wkx)
                .put("c116mm", c116mm)
                .put("c116mmx", c116mmx)
                .put("c117", c117)
                .put("c11701", c11701)
                .put("c11702", c11702)
                .put("c11702x", c11702x)
                .put("c11703", c11703)
                .put("c11703x", c11703x)
                .put("c11796", c11796)
                .put("c11796x", c11796x)
                .put("c118", c118)
                .put("c119", c119)
                .put("c11996x", c11996x)
                .put("c119a", c119a)
                .put("c119b", c119b)
                .put("c119c", c119c)
                .put("c119d", c119d)
                .put("c119e", c119e)
                .put("c119f", c119f)
                .put("c119g", c119g)
                .put("c119h", c119h)
                .put("c11998", c11998)
                .put("c120", c120)
                .put("c121", c121)
                .put("c122", c122)
                .put("c12201", c12201)
                .put("c12202", c12202)
                .put("c12203", c12203)
                .put("c12204", c12204)
                .put("c12205", c12205)
                .put("c12206", c12206)
                .put("c12207", c12207)
                .put("c12208", c12208)
                .put("c12296", c12296)
                .put("c12296x", c12296x)
                .put("c123", c123)
                .put("c12301", c12301)
                .put("c12302", c12302)
                .put("c12396", c12396)
                .put("c12396x", c12396x)
                .put("c124", c124)
                .put("c125", c125)
                .put("c126", c126)
                .put("c127", c127)
                .put("c128", c128)
                .put("c12801", c12801)
                .put("c12802", c12802)
                .put("c12896", c12896)
                .put("c12896x", c12896x)
                .put("c129", c129)
                .put("c130s", c130s)
                .put("c130c", c130c)
                .put("c131", c131)
                .put("c13196x", c13196x)
                .put("c132", c132)
                .put("c133", c133)
                .put("c133n", c133n)
                .put("c133nx", c133nx)
                .put("c133998", c133998);
        return json.toString();
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();
        json.put("c201", c201)
                .put("c202", c202)
                .put("c20201", c20201)
                .put("c20202", c20202)
                .put("c20203", c20203)
                .put("c20204", c20204)
                .put("c20205", c20205)
                .put("c20206", c20206)
                .put("c20207", c20207)
                .put("c20208", c20208)
                .put("c20296", c20296)
                .put("c20296x", c20296x)
                .put("c203", c203)
                .put("c20301", c20301)
                .put("c20302", c20302)
                .put("c20303", c20303)
                .put("c20304", c20304)
                .put("c20304x", c20304x)
                .put("c20305", c20305)
                .put("c20305x", c20305x)
                .put("c20396", c20396)
                .put("c20396x", c20396x)
                .put("c204", c204)
                .put("c20401x", c20401x)
                .put("c20402x", c20402x)
                .put("c205", c205)
                .put("c20501x", c20501x)
                .put("c206", c206)
                .put("c20602", c20602)
                .put("c20603", c20603)
                .put("c20604", c20604)
                .put("c20605", c20605)
                .put("c20606", c20606)
                .put("c20607", c20607)
                .put("c20608", c20608)
                .put("c20697", c20697)
                .put("c206oth", c206oth)
                .put("c20696x", c20696x)
                .put("c207", c207)
                .put("c208", c208)
                .put("c209", c209)
                .put("c20901", c20901)
                .put("c20902", c20902)
                .put("c20903", c20903)
                .put("c20904", c20904)
                .put("c20905", c20905)
                .put("c20906", c20906)
                .put("c20907", c20907)
                .put("c20908", c20908)
                .put("c20996", c20996)
                .put("c20996x", c20996x)
                .put("c210", c210)
                .put("c21001", c21001)
                .put("c21001x", c21001x)
                .put("c21002", c21002)
                .put("c21002x", c21002x)
                .put("c21096", c21096)
                .put("c21096x", c21096x)
                .put("c211", c211)
                .put("c212", c212)
                .put("c213", c213)
                .put("c214", c214)
                .put("c215", c215)
                .put("c21501", c21501)
                .put("c21501x", c21501x)
                .put("c21502", c21502)
                .put("c21502x", c21502x)
                .put("c21596", c21596)
                .put("c21596x", c21596x)
                .put("c216", c216)
                .put("c217", c217)
                .put("c21701x", c21701x)
                .put("c21702x", c21702x)
                .put("c218", c218)
                .put("c21896x", c21896x)
                .put("c219", c219)
                .put("c220", c220)
                .put("c221n", c221n);
        return json.toString();
    }

    public String sC3toString() throws JSONException {
        Log.d(TAG, "sC3toString: ");
        JSONObject json = new JSONObject();
        json
                .put("c301", c301)
                .put("c30196x", c30196x)
                .put("c302", c302)
                .put("c30204x", c30204x)
                .put("c30205x", c30205x)
                .put("c30296x", c30296x)
                .put("c303", c303)
                .put("c304", c304)
                .put("c305", c305)
                .put("c306", c306)
                .put("c30601x", c30601x)
                .put("c30602x", c30602x)
                .put("c307", c307)
                .put("c308", c308)
                .put("c309", c309)
                .put("c310", c310)
                .put("c310hx", c310hx)
                .put("c311", c311)
                .put("c31101", c31101)
                .put("c311h", c311h)
                .put("c311hx", c311hx)
                .put("c311d", c311d)
                .put("c311dx", c311dx)
                .put("c312", c312)
                .put("c313", c313)
                .put("c31396x", c31396x)
                .put("c314", c314)
                .put("c31401x", c31401x)
                .put("c31402x", c31402x)
                .put("c31496x", c31496x)
                .put("c315", c315)
                .put("c316", c316)
                .put("c31601", c31601)
                .put("c31602", c31602)
                .put("c31603", c31603)
                .put("c31604", c31604)
                .put("c31605", c31605)
                .put("c31606", c31606)
                .put("c31607", c31607)
                .put("c31608", c31608)
                .put("c31696", c31696)
                .put("c31696x", c31696x)
                .put("c317", c317)
                .put("c317hx", c317hx)
                .put("c317dx", c317dx)
                .put("c317wx", c317wx)
                .put("c318", c318)
                .put("c319", c319)
                .put("c31901", c31901)
                .put("c31902", c31902)
                .put("c31903", c31903)
                .put("c31904", c31904)
                .put("c31905", c31905)
                .put("c31906", c31906)
                .put("c31907", c31907)
                .put("c31908", c31908)
                .put("c31909", c31909)
                .put("c31996", c31996)
                .put("c31996x", c31996x)
                .put("c320", c320)
                .put("c321", c321)
                .put("c32101", c32101)
                .put("c32102", c32102)
                .put("c32103", c32103)
                .put("c32104", c32104)
                .put("c32105", c32105)
                .put("c32106", c32106)
                .put("c32107", c32107)
                .put("c32108", c32108)
                .put("c32196", c32196)
                .put("c32196x", c32196x)
                .put("c322", c322)
                .put("c322h", c322h)
                .put("c322hx", c322hx)
                .put("c322d", c322d)
                .put("c322dx", c322dx)
                .put("c322w", c322w)
                .put("c322wx", c322wx)
                .put("c322998", c322998)
                .put("c323", c323)
                .put("c324", c324)
                .put("c32401", c32401)
                .put("c32402", c32402)
                .put("c32403", c32403)
                .put("c32404", c32404)
                .put("c32405", c32405)
                .put("c32496", c32496)
                .put("c32496x", c32496x)
                .put("c325", c325)
                .put("c326", c326)
                .put("c32601x", c32601x)
                .put("c32602x", c32602x)
                .put("c327", c327)
                .put("c32701x", c32701x)
                .put("c32702x", c32702x)
                .put("c328", c328)
                .put("c32896x", c32896x)
                .put("c329", c329)
                .put("c330", c330)
                .put("c331", c331)
                .put("c33101", c33101)
                .put("c33102", c33102)
                .put("c33103", c33103)
                .put("c33104", c33104)
                .put("c33105", c33105)
                .put("c33106", c33106)
                .put("c33107", c33107)
                .put("c33108", c33108)
                .put("c33109", c33109)
                .put("c33110", c33110)
                .put("c33111", c33111)
                .put("c33112", c33112)
                .put("c33113", c33113)
                .put("c33114", c33114)
                .put("c33115", c33115)
                .put("c33116", c33116)
                .put("c33196", c33196)
                .put("c33196x", c33196x);
        return json.toString();
    }

    public String sC4toString() throws JSONException {
        Log.d(TAG, "sC4toString: ");
        JSONObject json = new JSONObject();
        json.put("c401", c401)
                .put("c402", c402)
                .put("c40296x", c40296x)
                .put("c403", c403)
                .put("c40301", c40301)
                .put("c40302", c40302)
                .put("c40303", c40303)
                .put("c40304", c40304)
                .put("c40305", c40305)
                .put("c40306", c40306)
                .put("c40307", c40307)
                .put("c40308", c40308)
                .put("c40309", c40309)
                .put("c40310", c40310)
                .put("c40311", c40311)
                .put("c40396", c40396)
                .put("c40396x", c40396x)
                .put("c404", c404)
                .put("c40401x", c40401x)
                .put("c405", c405)
                .put("c406", c406)
                .put("c40696x", c40696x);
        return json.toString();
    }

    public String sC5toString() throws JSONException {
        Log.d(TAG, "sC5toString: ");
        JSONObject json = new JSONObject();
        json.put("c501", c501)
                .put("c5011", c5011)
                .put("c5012", c5012)
                .put("c5013", c5013)
                .put("c502", c502)
                .put("c5021", c5021)
                .put("c5022", c5022)
                .put("c5023", c5023)
                .put("c503", c503)
                .put("c5031", c5031)
                .put("c5032", c5032)
                .put("c5033", c5033)
                .put("c504", c504)
                .put("c50496x", c50496x)
                .put("c5041", c5041)
                .put("c5042", c5042)
                .put("c5043", c5043)
                .put("c505", c505)
                .put("c50596x", c50596x);
        return json.toString();
    }

    public String sC6toString() throws JSONException {
        Log.d(TAG, "sC6toString: ");
        JSONObject json = new JSONObject();
        json.put("c60101", c60101)
                .put("c60102", c60102)
                .put("c60103", c60103)
                .put("c60104", c60104)
                .put("c60105", c60105)
                .put("c60106", c60106)
                .put("c60107", c60107)
                .put("c60197", c60197)
                .put("c60201", c60201)
                .put("c60202", c60202)
                .put("c60203", c60203)
                .put("c60204", c60204)
                .put("c60205", c60205)
                .put("c60206", c60206)
                .put("c60207", c60207)
                .put("c60297", c60297)
                .put("c60301", c60301)
                .put("c60302", c60302)
                .put("c60303", c60303)
                .put("c60304", c60304)
                .put("c60305", c60305)
                .put("c60306", c60306)
                .put("c60307", c60307)
                .put("c60397", c60397)
                .put("c60401", c60401)
                .put("c60402", c60402)
                .put("c60403", c60403)
                .put("c60404", c60404)
                .put("c60405", c60405)
                .put("c60406", c60406)
                .put("c60407", c60407)
                .put("c60497", c60497)
                .put("c60501", c60501)
                .put("c60502", c60502)
                .put("c60503", c60503)
                .put("c60504", c60504)
                .put("c60505", c60505)
                .put("c60506", c60506)
                .put("c60507", c60507)
                .put("c60597", c60597)
                .put("c60601", c60601)
                .put("c60602", c60602)
                .put("c60603", c60603)
                .put("c60604", c60604)
                .put("c60605", c60605)
                .put("c60606", c60606)
                .put("c60607", c60607)
                .put("c60697", c60697)
                .put("c60701", c60701)
                .put("c60702", c60702)
                .put("c60703", c60703)
                .put("c60704", c60704)
                .put("c60705", c60705)
                .put("c60706", c60706)
                .put("c60707", c60707)
                .put("c60797", c60797)
                .put("c60801", c60801)
                .put("c60802", c60802)
                .put("c60803", c60803)
                .put("c60804", c60804)
                .put("c60805", c60805)
                .put("c60806", c60806)
                .put("c60807", c60807)
                .put("c60897", c60897)
                .put("c60901", c60901)
                .put("c60902", c60902)
                .put("c60903", c60903)
                .put("c60904", c60904)
                .put("c60905", c60905)
                .put("c60906", c60906)
                .put("c60907", c60907)
                .put("c60997", c60997)
                .put("c61001", c61001)
                .put("c61002", c61002)
                .put("c61003", c61003)
                .put("c61004", c61004)
                .put("c61005", c61005)
                .put("c61006", c61006)
                .put("c61007", c61007)
                .put("c61097", c61097);
        return json.toString();
    }


}
