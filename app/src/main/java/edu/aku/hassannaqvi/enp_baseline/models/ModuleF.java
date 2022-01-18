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


public class ModuleF extends BaseObservable implements Observable {

    private final String TAG = "ModuleF";
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
    private String f101name = _EMPTY_;
    private String f101 = _EMPTY_;
    private String f102 = _EMPTY_;
    private String f103 = _EMPTY_;
    private String f10401 = _EMPTY_;
    private String f10402 = _EMPTY_;
    private String f10403 = _EMPTY_;
    private String f104m = _EMPTY_;
    private String f10501 = _EMPTY_;
    private String f10502 = _EMPTY_;
    private String f10503 = _EMPTY_;
    private String f105m = _EMPTY_;
    private String f10601 = _EMPTY_;
    private String f10602 = _EMPTY_;
    private String f10603 = _EMPTY_;
    private String f106m = _EMPTY_;
    private String f107 = _EMPTY_;
    private String f108 = _EMPTY_;
    private String f109 = _EMPTY_;
    private String f201name = _EMPTY_;
    private String f201 = _EMPTY_;
    private String f202 = _EMPTY_;
    private String f20301 = _EMPTY_;
    private String f20302 = _EMPTY_;
    private String f20303 = _EMPTY_;
    private String f203m = _EMPTY_;
    private String f20401 = _EMPTY_;
    private String f20402 = _EMPTY_;
    private String f20403 = _EMPTY_;
    private String f204m = _EMPTY_;
    private String f205 = _EMPTY_;
    private String f206 = _EMPTY_;
    private String f207 = _EMPTY_;
    private String istf01 = _EMPTY_;
    private String istf02 = _EMPTY_;
    private String istf0296x = _EMPTY_;


    public ModuleF() {

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


    @Bindable
    public String getF101name() {
        return f101name;
    }

    public void setF101name(String f101name) {
        this.f101name = f101name;
        notifyPropertyChanged(BR.f101name);
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF10401() {
        return f10401;
    }

    public void setF10401(String f10401) {
        this.f10401 = f10401;
        if (f10401.length() > 0 && this.f10402.length() > 0) {
            setF10403((Float.parseFloat(f10401) - Float.parseFloat(this.f10402) >= 0.5)
                    || (Float.parseFloat(f10401) - Float.parseFloat(this.f10402) <= -0.5) ? this.f10403 : "");
            setF104m((Float.parseFloat(f10401) - Float.parseFloat(this.f10402) >= 0.5)
                    || (Float.parseFloat(f10401) - Float.parseFloat(this.f10402) <= -0.5) ? this.f104m : "");
        }
        notifyPropertyChanged(BR.f10401);
    }

    @Bindable
    public String getF10402() {
        return f10402;
    }

    public void setF10402(String f10402) {
        this.f10402 = f10402;
        if (this.f10401.length() > 0 && f10402.length() > 0) {
            setF10403((Float.parseFloat(this.f10401) - Float.parseFloat(f10402) >= 0.5)
                    || (Float.parseFloat(this.f10401) - Float.parseFloat(f10402) <= -0.5) ? this.f10403 : "");
            setF104m((Float.parseFloat(this.f10401) - Float.parseFloat(f10402) >= 0.5)
                    || (Float.parseFloat(this.f10401) - Float.parseFloat(f10402) <= -0.5) ? this.f104m : "");
        }
        notifyPropertyChanged(BR.f10402);
    }

    @Bindable
    public String getF10403() {
        return f10403;
    }

    public void setF10403(String f10403) {
        this.f10403 = f10403;
        notifyPropertyChanged(BR.f10403);
    }

    @Bindable
    public String getF104m() {
        return f104m;
    }

    public void setF104m(String f104m) {
        this.f104m = f104m;
        notifyPropertyChanged(BR.f104m);
    }

    @Bindable
    public String getF10501() {
        return f10501;
    }

    public void setF10501(String f10501) {
        this.f10501 = f10501;
        if (f10501.length() > 0 && this.f10502.length() > 0) {
            setF10503((Float.parseFloat(f10501) - Float.parseFloat(this.f10502) >= 0.5)
                    || (Float.parseFloat(f10501) - Float.parseFloat(this.f10502) <= -0.5) ? this.f10503 : "");
            setF105m((Float.parseFloat(f10501) - Float.parseFloat(this.f10502) >= 0.5)
                    || (Float.parseFloat(f10501) - Float.parseFloat(this.f10502) <= -0.5) ? this.f105m : "");
        }
        notifyPropertyChanged(BR.f10501);
    }

    @Bindable
    public String getF10502() {
        return f10502;
    }

    public void setF10502(String f10502) {
        this.f10502 = f10502;
        if (this.f10501.length() > 0 && f10502.length() > 0) {
            setF10503((Float.parseFloat(this.f10501) - Float.parseFloat(f10502) >= 0.5)
                    || (Float.parseFloat(this.f10501) - Float.parseFloat(f10502) <= -0.5) ? this.f10503 : "");
            setF105m((Float.parseFloat(this.f10501) - Float.parseFloat(f10502) >= 0.5)
                    || (Float.parseFloat(this.f10501) - Float.parseFloat(f10502) <= -0.5) ? this.f105m : "");
        }
        notifyPropertyChanged(BR.f10502);
    }

    @Bindable
    public String getF10503() {
        return f10503;
    }

    public void setF10503(String f10503) {
        this.f10503 = f10503;
        notifyPropertyChanged(BR.f10503);
    }

    @Bindable
    public String getF105m() {
        return f105m;
    }

    public void setF105m(String f105m) {
        this.f105m = f105m;
        notifyPropertyChanged(BR.f105m);
    }

    @Bindable
    public String getF10601() {
        return f10601;
    }

    public void setF10601(String f10601) {
        this.f10601 = f10601;
        if (f10601.length() > 0 && this.f10602.length() > 0) {
            setF10603((Float.parseFloat(f10601) - Float.parseFloat(this.f10602) >= 0.5)
                    || (Float.parseFloat(f10601) - Float.parseFloat(this.f10602) <= -0.5) ? this.f10603 : "");
            setF106m((Float.parseFloat(f10601) - Float.parseFloat(this.f10602) >= 0.5)
                    || (Float.parseFloat(f10601) - Float.parseFloat(this.f10602) <= -0.5) ? this.f106m : "");
        }
        notifyPropertyChanged(BR.f10601);
    }

    @Bindable
    public String getF10602() {
        return f10602;
    }

    public void setF10602(String f10602) {
        this.f10602 = f10602;
        if (this.f10601.length() > 0 && f10602.length() > 0) {
            setF10603((Float.parseFloat(this.f10601) - Float.parseFloat(f10602) >= 0.5)
                    || (Float.parseFloat(this.f10601) - Float.parseFloat(f10602) <= -0.5) ? this.f10603 : "");
            setF106m((Float.parseFloat(this.f10601) - Float.parseFloat(f10602) >= 0.5)
                    || (Float.parseFloat(this.f10601) - Float.parseFloat(f10602) <= -0.5) ? this.f106m : "");
        }
        notifyPropertyChanged(BR.f10602);
    }

    @Bindable
    public String getF10603() {
        return f10603;
    }

    public void setF10603(String f10603) {
        this.f10603 = f10603;
        notifyPropertyChanged(BR.f10603);
    }

    @Bindable
    public String getF106m() {
        return f106m;
    }

    public void setF106m(String f106m) {
        this.f106m = f106m;
        notifyPropertyChanged(BR.f106m);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF109() {
        return f109;
    }

    public void setF109(String f109) {
        this.f109 = f109;
        notifyPropertyChanged(BR.f109);
    }

    @Bindable
    public String getF201name() {
        return f201name;
    }

    public void setF201name(String f201name) {
        this.f201name = f201name;
        notifyPropertyChanged(BR.f201name);
    }

    @Bindable
    public String getF201() {
        return f201;
    }

    public void setF201(String f201) {
        this.f201 = f201;
        notifyPropertyChanged(BR.f201);
    }

    @Bindable
    public String getF202() {
        return f202;
    }

    public void setF202(String f202) {
        this.f202 = f202;
        notifyPropertyChanged(BR.f202);
    }

    @Bindable
    public String getF20301() {
        return f20301;
    }

    public void setF20301(String f20301) {
        this.f20301 = f20301;
        if (f20301.length() > 0 && this.f20302.length() > 0) {
            setF20303((Float.parseFloat(f20301) - Float.parseFloat(this.f20302) >= 1)
                    || (Float.parseFloat(f20301) - Float.parseFloat(this.f20302) <= -1) ? this.f20303 : "");
            setF203m((Float.parseFloat(f20301) - Float.parseFloat(this.f20302) >= 1)
                    || (Float.parseFloat(f20301) - Float.parseFloat(this.f20302) <= -1) ? this.f203m : "");
        }
        notifyPropertyChanged(BR.f20301);
    }

    @Bindable
    public String getF20302() {
        return f20302;
    }

    public void setF20302(String f20302) {
        this.f20302 = f20302;
        if (this.f20301.length() > 0 && f20302.length() > 0) {
            setF20303((Float.parseFloat(this.f20301) - Float.parseFloat(f20302) >= 0.5)
                    || (Float.parseFloat(this.f20301) - Float.parseFloat(f20302) <= -0.5) ? this.f20303 : "");
            setF203m((Float.parseFloat(this.f20301) - Float.parseFloat(f20302) >= 0.5)
                    || (Float.parseFloat(this.f20301) - Float.parseFloat(f20302) <= -0.5) ? this.f203m : "");
        }
        notifyPropertyChanged(BR.f20302);
    }

    @Bindable
    public String getF20303() {
        return f20303;
    }

    public void setF20303(String f20303) {
        this.f20303 = f20303;
        notifyPropertyChanged(BR.f20303);
    }

    @Bindable
    public String getF203m() {
        return f203m;
    }

    public void setF203m(String f203m) {
        this.f203m = f203m;
        notifyPropertyChanged(BR.f203m);
    }

    @Bindable
    public String getF20401() {
        return f20401;
    }

    public void setF20401(String f20401) {
        this.f20401 = f20401;
        if (f20401.length() > 0 && this.f20402.length() > 0) {
            setF20403((Float.parseFloat(f20401) - Float.parseFloat(this.f20402) >= 1)
                    || (Float.parseFloat(f20401) - Float.parseFloat(this.f20402) <= -1) ? this.f20403 : "");
            setF204m((Float.parseFloat(f20401) - Float.parseFloat(this.f20402) >= 1)
                    || (Float.parseFloat(f20401) - Float.parseFloat(this.f20402) <= -1) ? this.f204m : "");
        }
        notifyPropertyChanged(BR.f20401);
    }

    @Bindable
    public String getF20402() {
        return f20402;
    }

    public void setF20402(String f20402) {
        this.f20402 = f20402;
        if (this.f20401.length() > 0 && f20402.length() > 0) {
            setF20403((Float.parseFloat(this.f20401) - Float.parseFloat(f20402) >= 1)
                    || (Float.parseFloat(this.f20401) - Float.parseFloat(f20402) <= -1) ? this.f20403 : "");
            setF204m((Float.parseFloat(this.f20401) - Float.parseFloat(f20402) >= 1)
                    || (Float.parseFloat(this.f20401) - Float.parseFloat(f20402) <= -1) ? this.f204m : "");
        }
        notifyPropertyChanged(BR.f20402);
    }

    @Bindable
    public String getF20403() {
        return f20403;
    }

    public void setF20403(String f20403) {
        this.f20403 = f20403;
        notifyPropertyChanged(BR.f20403);
    }

    @Bindable
    public String getF204m() {
        return f204m;
    }

    public void setF204m(String f204m) {
        this.f204m = f204m;
        notifyPropertyChanged(BR.f204m);
    }

    @Bindable
    public String getF205() {
        return f205;
    }

    public void setF205(String f205) {
        this.f205 = f205;
        notifyPropertyChanged(BR.f205);
    }

    @Bindable
    public String getF206() {
        return f206;
    }

    public void setF206(String f206) {
        this.f206 = f206;
        notifyPropertyChanged(BR.f206);
    }

    @Bindable
    public String getF207() {
        return f207;
    }

    public void setF207(String f207) {
        this.f207 = f207;
        notifyPropertyChanged(BR.f207);
    }

    @Bindable
    public String getIstf01() {
        return istf01;
    }

    public void setIstf01(String istf01) {
        this.istf01 = istf01;
        setIstf02(istf02.equals("2") ? this.istf02 : "");
        notifyPropertyChanged(BR.istf01);
    }

    @Bindable
    public String getIstf02() {
        return istf02;
    }

    public void setIstf02(String istf02) {
        this.istf02 = istf02;
        setIstf0296x(istf02.equals("96") ? this.istf0296x : "");
        notifyPropertyChanged(BR.istf02);
    }

    @Bindable
    public String getIstf0296x() {
        return istf0296x;
    }

    public void setIstf0296x(String istf0296x) {
        this.istf0296x = istf0296x;
        notifyPropertyChanged(BR.istf0296x);
    }


    public ModuleF Hydrate(Cursor cursor) throws JSONException {
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

        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA2)));
        return this;
    }

    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f101name = json.getString("f101name");
            this.f101 = json.getString("f101");
            this.f102 = json.getString("f102");
            this.f103 = json.getString("f103");
            this.f10401 = json.getString("f10401");
            this.f10402 = json.getString("f10402");
            this.f10403 = json.getString("f10403");
            this.f104m = json.getString("f104m");
            this.f10501 = json.getString("f10501");
            this.f10502 = json.getString("f10502");
            this.f10503 = json.getString("f10503");
            this.f105m = json.getString("f105m");
            this.f10601 = json.getString("f10601");
            this.f10602 = json.getString("f10602");
            this.f10603 = json.getString("f10603");
            this.f106m = json.getString("f106m");
            this.f107 = json.getString("f107");
            this.f108 = json.getString("f108");
            this.f109 = json.getString("f109");
        }
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f201name = json.getString("f201name");
            this.f201 = json.getString("f201");
            this.f202 = json.getString("f202");
            this.f20301 = json.getString("f20301");
            this.f20302 = json.getString("f20302");
            this.f20303 = json.getString("f20303");
            this.f203m = json.getString("f203m");
            this.f20401 = json.getString("f20401");
            this.f20402 = json.getString("f20402");
            this.f20403 = json.getString("f20403");
            this.f204m = json.getString("f204m");
            this.f205 = json.getString("f205");
            this.f206 = json.getString("f206");
            this.f207 = json.getString("f207");
            this.istf01 = json.getString("istf01");
            this.istf02 = json.getString("istf02");
            this.istf0296x = json.getString("istf0296x");
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
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sF1toString()));
        json.put(FormsTable.COLUMN_SA2, new JSONObject(sF2toString()));
        return json;
    }

    public String sF1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("f101name", f101name)
                .put("f101", f101)
                .put("f102", f102)
                .put("f103", f103)
                .put("f10401", f10401)
                .put("f10402", f10402)
                .put("f10403", f10403)
                .put("f104m", f104m)
                .put("f10501", f10501)
                .put("f10502", f10502)
                .put("f10503", f10503)
                .put("f105m", f105m)
                .put("f10601", f10601)
                .put("f10602", f10602)
                .put("f10603", f10603)
                .put("f106m", f106m)
                .put("f107", f107)
                .put("f108", f108)
                .put("f109", f109);
        return json.toString();
    }

    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f201name", f201name)
                .put("f201", f201)
                .put("f202", f202)
                .put("f20301", f20301)
                .put("f20302", f20302)
                .put("f20303", f20303)
                .put("f203m", f203m)
                .put("f20401", f20401)
                .put("f20402", f20402)
                .put("f20403", f20403)
                .put("f204m", f204m)
                .put("f205", f205)
                .put("f206", f206)
                .put("f207", f207)
                .put("istf01", istf01)
                .put("istf02", istf02)
                .put("istf0296x", istf0296x);
        return json.toString();
    }


}
