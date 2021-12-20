package edu.aku.hassannaqvi.enp_baseline.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.enp_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.enp_baseline.BR;
import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;


public class FamilyMembers extends BaseObservable implements Observable {

    private final String TAG = "FamilyMembers";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
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

    // FIELD VARIABLES
    private String sa2name = _EMPTY_;
    private String a201 = _EMPTY_;
    private String a202 = _EMPTY_;
    private String a203 = _EMPTY_;
    private String a20396x = _EMPTY_;
    private String a204 = _EMPTY_;
    private String a205d = _EMPTY_;
    private String a205m = _EMPTY_;
    private String a205y = _EMPTY_;
    private String a206 = _EMPTY_;
    private String a206y = _EMPTY_;
    private String a206yx = _EMPTY_;
    private String a206m = _EMPTY_;
    private String a206mx = _EMPTY_;
    private String a206d = _EMPTY_;
    private String a206dx = _EMPTY_;
    private String a206998 = _EMPTY_;
    private String a207 = _EMPTY_;
    private String a20701 = _EMPTY_;
    private String a20702 = _EMPTY_;
    private String a20703 = _EMPTY_;
    private String a20704 = _EMPTY_;
    private String a20705 = _EMPTY_;
    private String a20796 = _EMPTY_;
    private String a20796x = _EMPTY_;
    private String a208 = _EMPTY_;
    private String a209 = _EMPTY_;
    private String a210 = _EMPTY_;
    private String a211 = _EMPTY_;
    private String a212 = _EMPTY_;
    private String a21296x = _EMPTY_;

    private String hl1 = _EMPTY_;
    private String hl2 = _EMPTY_;
    private String hl3 = _EMPTY_;
    private String hl4 = _EMPTY_;
    private String hl5d = _EMPTY_;
    private String hl5m = _EMPTY_;
    private String hl5y = _EMPTY_;
    private String hl6y = _EMPTY_;
    private String hl6m = _EMPTY_;
    private String hl7 = _EMPTY_;
    private String hl8 = _EMPTY_;
    private String hl9 = _EMPTY_;
    private String hl10 = _EMPTY_;
    private String hl11 = _EMPTY_;
    private String hl12 = _EMPTY_;
    private String hl1296x = _EMPTY_;
    private String hl13 = _EMPTY_;


    private boolean expanded;
    private boolean mwra;
    private long ageInMonths;
    private String indexed = _EMPTY_;
    private String memCate = _EMPTY_;

    public FamilyMembers() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setpsuCode(MainApp.form.getPsuCode());
        setHhid(MainApp.form.getHhid());
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getpsuCode() {
        return psuCode;
    }

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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


    @Bindable
    public String getSa2name() {
        return sa2name;
    }

    public void setSa2name(String sa2name) {
        this.sa2name = sa2name;
        notifyPropertyChanged(BR.sa2name);
    }

    @Bindable
    public String getA201() {
        return a201;
    }

    public void setA201(String a201) {
        this.a201 = a201;
        notifyPropertyChanged(BR.a201);
    }

    @Bindable
    public String getA202() {
        return a202;
    }

    public void setA202(String a202) {
        this.a202 = a202;
        notifyPropertyChanged(BR.a202);
    }

    @Bindable
    public String getA203() {
        return a203;
    }

    public void setA203(String a203) {
        this.a203 = a203;
        notifyPropertyChanged(BR.a203);
    }

    @Bindable
    public String getA20396x() {
        return a20396x;
    }

    public void setA20396x(String a20396x) {
        this.a20396x = a20396x;
        notifyPropertyChanged(BR.a20396x);
    }

    @Bindable
    public String getA204() {
        return a204;
    }

    public void setA204(String a204) {
        this.a204 = a204;
        notifyPropertyChanged(BR.a204);
    }

    @Bindable
    public String getA205d() {
        return a205d;
    }

    public void setA205d(String a205d) {
        this.a205d = a205d;
        CaluculateAge();
        notifyPropertyChanged(BR.a205d);
    }

    @Bindable
    public String getA205m() {
        return a205m;
    }

    public void setA205m(String a205m) {
        this.a205m = a205m;
        if (a205m.equals("98")) {
            setA205d("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.a205m);
    }

    @Bindable
    public String getA205y() {
        return a205y;
    }

    public void setA205y(String a205y) {
        this.a205y = a205y;
        if (a205y.equals("9998")) {
            setA205m("98");
            setA205m("");
            setA205y("");
        }
        // Calculate age
        CaluculateAge();
        notifyPropertyChanged(BR.a205y);
    }

    @Bindable
    public String getA206() {
        return a206;
    }

    public void setA206(String a206) {
        this.a206 = a206;
        notifyPropertyChanged(BR.a206);
    }

    @Bindable
    public String getA206y() {
        return a206y;
    }

    public void setA206y(String a206y) {
        this.a206y = a206y;
        notifyPropertyChanged(BR.a206y);
    }

    @Bindable
    public String getA206yx() {
        return a206yx;
    }

    public void setA206yx(String a206yx) {
        this.a206yx = a206yx;
        notifyPropertyChanged(BR.a206yx);
    }

    @Bindable
    public String getA206m() {
        return a206m;
    }

    public void setA206m(String a206m) {
        this.a206m = a206m;
        notifyPropertyChanged(BR.a206m);
    }

    @Bindable
    public String getA206mx() {
        return a206mx;
    }

    public void setA206mx(String a206mx) {
        this.a206mx = a206mx;
        notifyPropertyChanged(BR.a206mx);
    }

    @Bindable
    public String getA206d() {
        return a206d;
    }

    public void setA206d(String a206d) {
        this.a206d = a206d;
        notifyPropertyChanged(BR.a206d);
    }

    @Bindable
    public String getA206dx() {
        return a206dx;
    }

    public void setA206dx(String a206dx) {
        this.a206dx = a206dx;
        notifyPropertyChanged(BR.a206dx);
    }

    @Bindable
    public String getA206998() {
        return a206998;
    }

    public void setA206998(String a206998) {
        this.a206998 = a206998;
        notifyPropertyChanged(BR.a206998);
    }

    @Bindable
    public String getA207() {
        return a207;
    }

    public void setA207(String a207) {
        this.a207 = a207;
        notifyPropertyChanged(BR.a207);
    }

    @Bindable
    public String getA20701() {
        return a20701;
    }

    public void setA20701(String a20701) {
        this.a20701 = a20701;
        notifyPropertyChanged(BR.a20701);
    }

    @Bindable
    public String getA20702() {
        return a20702;
    }

    public void setA20702(String a20702) {
        this.a20702 = a20702;
        notifyPropertyChanged(BR.a20702);
    }

    @Bindable
    public String getA20703() {
        return a20703;
    }

    public void setA20703(String a20703) {
        this.a20703 = a20703;
        notifyPropertyChanged(BR.a20703);
    }

    @Bindable
    public String getA20704() {
        return a20704;
    }

    public void setA20704(String a20704) {
        this.a20704 = a20704;
        notifyPropertyChanged(BR.a20704);
    }

    @Bindable
    public String getA20705() {
        return a20705;
    }

    public void setA20705(String a20705) {
        this.a20705 = a20705;
        notifyPropertyChanged(BR.a20705);
    }

    @Bindable
    public String getA20796() {
        return a20796;
    }

    public void setA20796(String a20796) {
        this.a20796 = a20796;
        notifyPropertyChanged(BR.a20796);
    }

    @Bindable
    public String getA20796x() {
        return a20796x;
    }

    public void setA20796x(String a20796x) {
        this.a20796x = a20796x;
        notifyPropertyChanged(BR.a20796x);
    }

    @Bindable
    public String getA208() {
        return a208;
    }

    public void setA208(String a208) {
        this.a208 = a208;
        notifyPropertyChanged(BR.a208);
    }

    @Bindable
    public String getA209() {
        return a209;
    }

    public void setA209(String a209) {
        this.a209 = a209;
        notifyPropertyChanged(BR.a209);
    }

    @Bindable
    public String getA210() {
        return a210;
    }

    public void setA210(String a210) {
        this.a210 = a210;
        notifyPropertyChanged(BR.a210);
    }

    @Bindable
    public String getA211() {
        return a211;
    }

    public void setA211(String a211) {
        this.a211 = a211;
        notifyPropertyChanged(BR.a211);
    }

    @Bindable
    public String getA212() {
        return a212;
    }

    public void setA212(String a212) {
        this.a212 = a212;
        notifyPropertyChanged(BR.a212);
    }

    @Bindable
    public String getA21296x() {
        return a21296x;
    }

    public void setA21296x(String a21296x) {
        this.a21296x = a21296x;
        notifyPropertyChanged(BR.a21296x);
    }


    @Bindable
    public String getHl1() {
        return hl1;
    }

    public void setHl1(String hl1) {
        this.hl1 = hl1;
        this.sno = hl1;
        notifyPropertyChanged(BR.hl1);
    }

    @Bindable
    public String getHl2() {
        return hl2;
    }

    public void setHl2(String hl2) {
        this.hl2 = hl2;
        notifyPropertyChanged(BR.hl2);
    }

    @Bindable
    public String getHl3() {
        return hl3;
    }

    public void setHl3(String hl3) {
        this.hl3 = hl3;
        notifyPropertyChanged(BR.hl3);
    }

    @Bindable
    public String getHl4() {
        return hl4;
    }

    public void setHl4(String hl4) {
        this.hl4 = hl4;
        updateMemCategory();
        notifyPropertyChanged(BR.hl4);
    }

    @Bindable
    public String getHl5d() {
        return hl5d;
    }

    public void setHl5d(String hl5d) {
        this.hl5d = hl5d;
        CaluculateAge();
        notifyPropertyChanged(BR.hl5d);
    }

    @Bindable
    public String getHl5m() {
        return hl5m;
    }

    public void setHl5m(String hl5m) {
        this.hl5m = hl5m;
        if (hl5m.equals("98")) {
            setHl5d("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.hl5m);
    }

    @Bindable
    public String getHl5y() {
        return hl5y;
    }

    public void setHl5y(String hl5y) {
        this.hl5y = hl5y;
        if (hl5y.equals("9998")) {
            setHl5m("98");
            setHl6m("");
            setHl6y("");
        }
        // Calculate age
        CaluculateAge();
        notifyPropertyChanged(BR.hl5y);
    }

    @Bindable
    public String getHl6y() {
        return hl6y;
    }

    public void setHl6y(@NonNull String hl6y) {
        this.hl6y = hl6y;
        setHl7(hl6y.length() > 0 ? Integer.parseInt(hl6y) < 13 ? "" : this.hl7 : this.hl7);
        setHl11(hl6y.length() > 0 ? Integer.parseInt(hl6y) < 3 ? "" : this.hl11 : this.hl11);
        setHl12(hl6y.length() > 0 ? Integer.parseInt(hl6y) < 10 ? "" : this.hl12 : this.hl12);
        updateMemCategory();

        notifyPropertyChanged(BR.hl6y);
    }

    @Bindable
    public String getHl6m() {
        return hl6m;
    }

    public void setHl6m(String hl6m) {
        this.hl6m = hl6m;
        notifyPropertyChanged(BR.hl6m);
    }

    @Bindable
    public String getHl7() {
        return hl7;
    }

    public void setHl7(String hl7) {
        this.hl7 = hl7;
//        setHl7(hl7.equals("") ? "99" : this.hl7);
        updateMemCategory();

        notifyPropertyChanged(BR.hl7);
    }

    @Bindable
    public String getHl8() {
        return hl8;
    }

    public void setHl8(String hl8) {
        this.hl8 = hl8;
        updateMemCategory();
        notifyPropertyChanged(BR.hl8);
    }

    @Bindable
    public String getHl9() {
        return hl9;
    }

    public void setHl9(String hl9) {
        this.hl9 = hl9;
        notifyPropertyChanged(BR.hl9);
    }

    @Bindable
    public String getHl10() {
        return hl10;
    }

    public void setHl10(String hl10) {
        this.hl10 = hl10;
        updateMemCategory();
        notifyPropertyChanged(BR.hl10);
    }

    @Bindable
    public String getHl11() {
        return hl11;
    }

    public void setHl11(String hl11) {
        this.hl11 = hl11;
        notifyPropertyChanged(BR.hl11);
    }

    @Bindable
    public String getHl12() {
        return hl12;
    }

    public void setHl12(String hl12) {
        this.hl12 = hl12;
        setHl1296x(hl12.equals("96") ? this.hl1296x : "");
        notifyPropertyChanged(BR.hl12);
    }

    @Bindable
    public String getHl1296x() {
        return hl1296x;
    }

    public void setHl1296x(String hl1296x) {
        this.hl1296x = hl1296x;
        notifyPropertyChanged(BR.hl1296x);
    }

    @Bindable
    public String getHl13() {
        return hl13;
    }

    public void setHl13(String hl13) {
        this.hl13 = hl13;
        notifyPropertyChanged(BR.hl13);
    }

    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyPropertyChanged(BR.mwra);
    }

    public String getMemCate() {
        return memCate;
    }

    public void setMemCate(String memCate) {
        this.memCate = memCate;
        // notifyPropertyChanged(BR.memCate);
    }

    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }

    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SNO));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_INDEXED));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED_DATE));

        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SA2)));
        updateMemCategory();

        return this;
    }

    public void sA2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sa2name = json.getString("sa2name");
            this.a201 = json.getString("a201");
            this.a202 = json.getString("a202");
            this.a203 = json.getString("a203");
            this.a20396x = json.getString("a20396x");
            this.a204 = json.getString("a204");
            this.a205d = json.getString("a205d");
            this.a205m = json.getString("a205m");
            this.a205y = json.getString("a205y");
            this.a206 = json.getString("a206");
            this.a206y = json.getString("a206y");
            this.a206yx = json.getString("a206yx");
            this.a206m = json.getString("a206m");
            this.a206mx = json.getString("a206mx");
            this.a206d = json.getString("a206d");
            this.a206dx = json.getString("a206dx");
            this.a206998 = json.getString("a206998");
            this.a207 = json.getString("a207");
            this.a20701 = json.getString("a20701");
            this.a20702 = json.getString("a20702");
            this.a20703 = json.getString("a20703");
            this.a20704 = json.getString("a20704");
            this.a20705 = json.getString("a20705");
            this.a20796 = json.getString("a20796");
            this.a20796x = json.getString("a20796x");
            this.a208 = json.getString("a208");
            this.a209 = json.getString("a209");
            this.a210 = json.getString("a210");
            this.a211 = json.getString("a211");
            this.a212 = json.getString("a212");
            this.a21296x = json.getString("a21296x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FamilyMembersTable.COLUMN_ID, this.id);
        json.put(FamilyMembersTable.COLUMN_UID, this.uid);
        json.put(FamilyMembersTable.COLUMN_UUID, this.uuid);
        json.put(FamilyMembersTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FamilyMembersTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FamilyMembersTable.COLUMN_HHID, this.hhid);
        json.put(FamilyMembersTable.COLUMN_INDEXED, this.indexed);
        json.put(FamilyMembersTable.COLUMN_SNO, this.sno);
        json.put(FamilyMembersTable.COLUMN_USERNAME, this.userName);
        json.put(FamilyMembersTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FamilyMembersTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FamilyMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FamilyMembersTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FamilyMembersTable.COLUMN_SYNCED, this.synced);
        json.put(FamilyMembersTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(FamilyMembersTable.COLUMN_APPVERSION, this.appver);

        json.put(FamilyMembersTable.COLUMN_SA2, new JSONObject(sA2toString()));
        return json;
    }

    public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("sa2name", sa2name)
                .put("a201", a201)
                .put("a202", a202)
                .put("a203", a203)
                .put("a20396x", a20396x)
                .put("a204", a204)
                .put("a205d", a205d)
                .put("a205m", a205m)
                .put("a205y", a205y)
                .put("a206", a206)
                .put("a206y", a206y)
                .put("a206yx", a206yx)
                .put("a206m", a206m)
                .put("a206mx", a206mx)
                .put("a206d", a206d)
                .put("a206dx", a206dx)
                .put("a206998", a206998)
                .put("a207", a207)
                .put("a20701", a20701)
                .put("a20702", a20702)
                .put("a20703", a20703)
                .put("a20704", a20704)
                .put("a20705", a20705)
                .put("a20796", a20796)
                .put("a20796x", a20796x)
                .put("a208", a208)
                .put("a209", a209)
                .put("a210", a210)
                .put("a211", a211)
                .put("a212", a212)
                .put("a21296x", a21296x);
        return json.toString();
    }

    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.a205y + "-" + this.a205m + "-" + this.a205d);

        if (!this.a205y.equals("") && !this.a205y.equals("9998") && !this.a205m.equals("") && !this.a205d.equals("")) {

            if ((Integer.parseInt(this.a205m) > 12 && !this.a205m.equals("98")) || (Integer.parseInt(this.a205d) > 31 && !this.a205d.equals("98")) || Integer.parseInt(this.a205y) < 1920) {
                setHl6y("");
                setHl6m("");
                this.ageInMonths = 0;
                return;
            }


            // set current Date
            int curDay = !MainApp.form.getAs1q15d().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15d()) : 15;
            int curMonth = !MainApp.form.getAs1q15m().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15m()) : 6;
            int curYear = Integer.parseInt(MainApp.form.getAs1q15y());
            Calendar cur = Calendar.getInstance();


            // set Date of birth
            int day = !this.a205d.equals("98") ? Integer.parseInt(this.a205d) : 15;
            int month = !this.a205m.equals("98") ? Integer.parseInt(this.a205m) : 6;
            int year = Integer.parseInt(this.a205y);
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
//             String todayDate = df.format(Calendar.getInstance().getTime());


            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                cur.setTime(df.parse(curYear + " " + curMonth + " " + curDay));

/*                System.out.println(df.format("Current: " + cur.getTime()));
                System.out.println(df.format("DOB: " + cal.getTime()));*/


                //long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                long millis = cur.getTimeInMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                this.ageInMonths = MILLISECONDS.toDays(millis) / 30;
                long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/

                setHl6y(String.valueOf(tYear));
                setHl6m(String.valueOf(tMonth));
                if (tYear < 0)
                    setHl6y("");
                //setAge(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        }
    }

    /**
     * Memeber Categories:
     * 1 = MWRA
     * 2 = Child
     * 3 = Adol Male // not used in this project
     * 4 = Adol Female
     */
    private void updateMemCategory() {
        if (hl4.equals("") || hl6y.equals("") || hl7.equals("") || !hl10.equals("1")) return;
        String memGender = getHl4();
        String memMaritalStatus = getHl7();
        int memAge = Integer.parseInt(getHl6y());

        // MWRA
        if (memGender.equals("2")                // Female
                && memAge >= 15 && memAge <= 49   // 15 to 49 year old
                && !memMaritalStatus.equals("5")
        ) {
            setMemCate("1");
        }

        // Child
        if (memAge < 5
                && !hl8.equals("") && !hl8.equals("97")
        ) {
            setMemCate("2");
        }

        // Adolescent Male
        if (memGender.equals("1")
                && memAge >= 15 && memAge <= 19   // 15 to 49 year old
                && (memMaritalStatus.equals("5") || memMaritalStatus.equals("97"))
        ) {
            setMemCate("3");
        }

        // Adolescent Female

        if (memGender.equals("2")
                && memAge >= 15 && memAge <= 19   // 15 to 49 year old
                && (memMaritalStatus.equals("5") || memMaritalStatus.equals("97"))
        ) {
            setMemCate("4");
        }
    }
}
