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


public class ModuleB extends BaseObservable implements Observable {

    private final String TAG = "ModuleB";
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
    private String b101 = _EMPTY_;
    private String b102 = _EMPTY_;
    private String b103 = _EMPTY_;
    private String b104 = _EMPTY_;
    private String b10498 = _EMPTY_;
    private String b104y = _EMPTY_;
    private String b104m = _EMPTY_;
    private String b104w = _EMPTY_;
    private String b105 = _EMPTY_;
    private String b10598 = _EMPTY_;
    private String b105d = _EMPTY_;
    private String b105w = _EMPTY_;
    private String b105m = _EMPTY_;
    private String b106 = _EMPTY_;
    private String b10698 = _EMPTY_;
    private String b10601 = _EMPTY_;
    private String b107 = _EMPTY_;
    private String b10796x = _EMPTY_;
    private String b108 = _EMPTY_;
    private String b10898 = _EMPTY_;
    private String b10801 = _EMPTY_;
    private String b109 = _EMPTY_;
    private String b10901 = _EMPTY_;
    private String b10902 = _EMPTY_;
    private String b10903 = _EMPTY_;
    private String b10904 = _EMPTY_;
    private String b10996 = _EMPTY_;
    private String b10996x = _EMPTY_;
    private String b110 = _EMPTY_;
    private String b11001 = _EMPTY_;
    private String b11002 = _EMPTY_;
    private String b11003 = _EMPTY_;
    private String b11004 = _EMPTY_;
    private String b11096 = _EMPTY_;
    private String b11096x = _EMPTY_;
    private String b111 = _EMPTY_;
    private String b11101 = _EMPTY_;
    private String b11102 = _EMPTY_;
    private String b11103 = _EMPTY_;
    private String b11104 = _EMPTY_;
    private String b11196 = _EMPTY_;
    private String b11196x = _EMPTY_;
    private String b112 = _EMPTY_;
    private String b11201 = _EMPTY_;
    private String b11202 = _EMPTY_;
    private String b11203 = _EMPTY_;
    private String b11204 = _EMPTY_;
    private String b11205 = _EMPTY_;
    private String b11206 = _EMPTY_;
    private String b11296 = _EMPTY_;
    private String b11296x = _EMPTY_;
    private String b11298 = _EMPTY_;
    private String b113 = _EMPTY_;
    private String b11396x = _EMPTY_;
    private String b114 = _EMPTY_;
    private String b11496x = _EMPTY_;
    private String b115 = _EMPTY_;
    private String b11501ax = _EMPTY_;
    private String b11501bx = _EMPTY_;
    private String b116 = _EMPTY_;
    private String b11601x = _EMPTY_;
    private String b117 = _EMPTY_;
    private String b118 = _EMPTY_;
    private String b119 = _EMPTY_;
    private String b120 = _EMPTY_;


    public ModuleB() {

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
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB103() {
        return b103;
    }

    public void setB103(String b103) {
        this.b103 = b103;
        notifyPropertyChanged(BR.b103);
    }

    @Bindable
    public String getB104() {
        return b104;
    }

    public void setB104(String b104) {
        this.b104 = b104;
        notifyPropertyChanged(BR.b104);
    }

    @Bindable
    public String getB10498() {
        return b10498;
    }

    public void setB10498(String b10498) {
        this.b10498 = b10498;
        notifyPropertyChanged(BR.b10498);
    }

    @Bindable
    public String getB104y() {
        return b104y;
    }

    public void setB104y(String b104y) {
        this.b104y = b104y;
        notifyPropertyChanged(BR.b104y);
    }

    @Bindable
    public String getB104m() {
        return b104m;
    }

    public void setB104m(String b104m) {
        this.b104m = b104m;
        notifyPropertyChanged(BR.b104m);
    }

    @Bindable
    public String getB104w() {
        return b104w;
    }

    public void setB104w(String b104w) {
        this.b104w = b104w;
        notifyPropertyChanged(BR.b104w);
    }

    @Bindable
    public String getB105() {
        return b105;
    }

    public void setB105(String b105) {
        this.b105 = b105;
        notifyPropertyChanged(BR.b105);
    }

    @Bindable
    public String getB10598() {
        return b10598;
    }

    public void setB10598(String b10598) {
        this.b10598 = b10598;
        notifyPropertyChanged(BR.b10598);
    }

    @Bindable
    public String getB105d() {
        return b105d;
    }

    public void setB105d(String b105d) {
        this.b105d = b105d;
        notifyPropertyChanged(BR.b105d);
    }

    @Bindable
    public String getB105w() {
        return b105w;
    }

    public void setB105w(String b105w) {
        this.b105w = b105w;
        notifyPropertyChanged(BR.b105w);
    }

    @Bindable
    public String getB105m() {
        return b105m;
    }

    public void setB105m(String b105m) {
        this.b105m = b105m;
        notifyPropertyChanged(BR.b105m);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB10698() {
        return b10698;
    }

    public void setB10698(String b10698) {
        this.b10698 = b10698;
        notifyPropertyChanged(BR.b10698);
    }

    @Bindable
    public String getB10601() {
        return b10601;
    }

    public void setB10601(String b10601) {
        this.b10601 = b10601;
        notifyPropertyChanged(BR.b10601);
    }

    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB10796x() {
        return b10796x;
    }

    public void setB10796x(String b10796x) {
        this.b10796x = b10796x;
        notifyPropertyChanged(BR.b10796x);
    }

    @Bindable
    public String getB108() {
        return b108;
    }

    public void setB108(String b108) {
        this.b108 = b108;
        notifyPropertyChanged(BR.b108);
    }

    @Bindable
    public String getB10898() {
        return b10898;
    }

    public void setB10898(String b10898) {
        this.b10898 = b10898;
        notifyPropertyChanged(BR.b10898);
    }

    @Bindable
    public String getB10801() {
        return b10801;
    }

    public void setB10801(String b10801) {
        this.b10801 = b10801;
        notifyPropertyChanged(BR.b10801);
    }

    @Bindable
    public String getB109() {
        return b109;
    }

    public void setB109(String b109) {
        this.b109 = b109;
        notifyPropertyChanged(BR.b109);
    }

    @Bindable
    public String getB10901() {
        return b10901;
    }

    public void setB10901(String b10901) {
        this.b10901 = b10901;
        notifyPropertyChanged(BR.b10901);
    }

    @Bindable
    public String getB10902() {
        return b10902;
    }

    public void setB10902(String b10902) {
        this.b10902 = b10902;
        notifyPropertyChanged(BR.b10902);
    }

    @Bindable
    public String getB10903() {
        return b10903;
    }

    public void setB10903(String b10903) {
        this.b10903 = b10903;
        notifyPropertyChanged(BR.b10903);
    }

    @Bindable
    public String getB10904() {
        return b10904;
    }

    public void setB10904(String b10904) {
        this.b10904 = b10904;
        notifyPropertyChanged(BR.b10904);
    }

    @Bindable
    public String getB10996() {
        return b10996;
    }

    public void setB10996(String b10996) {
        this.b10996 = b10996;
        notifyPropertyChanged(BR.b10996);
    }

    @Bindable
    public String getB10996x() {
        return b10996x;
    }

    public void setB10996x(String b10996x) {
        this.b10996x = b10996x;
        notifyPropertyChanged(BR.b10996x);
    }

    @Bindable
    public String getB110() {
        return b110;
    }

    public void setB110(String b110) {
        this.b110 = b110;
        notifyPropertyChanged(BR.b110);
    }

    @Bindable
    public String getB11001() {
        return b11001;
    }

    public void setB11001(String b11001) {
        this.b11001 = b11001;
        notifyPropertyChanged(BR.b11001);
    }

    @Bindable
    public String getB11002() {
        return b11002;
    }

    public void setB11002(String b11002) {
        this.b11002 = b11002;
        notifyPropertyChanged(BR.b11002);
    }

    @Bindable
    public String getB11003() {
        return b11003;
    }

    public void setB11003(String b11003) {
        this.b11003 = b11003;
        notifyPropertyChanged(BR.b11003);
    }

    @Bindable
    public String getB11004() {
        return b11004;
    }

    public void setB11004(String b11004) {
        this.b11004 = b11004;
        notifyPropertyChanged(BR.b11004);
    }

    @Bindable
    public String getB11096() {
        return b11096;
    }

    public void setB11096(String b11096) {
        this.b11096 = b11096;
        notifyPropertyChanged(BR.b11096);
    }

    @Bindable
    public String getB11096x() {
        return b11096x;
    }

    public void setB11096x(String b11096x) {
        this.b11096x = b11096x;
        notifyPropertyChanged(BR.b11096x);
    }

    @Bindable
    public String getB111() {
        return b111;
    }

    public void setB111(String b111) {
        this.b111 = b111;
        notifyPropertyChanged(BR.b111);
    }

    @Bindable
    public String getB11101() {
        return b11101;
    }

    public void setB11101(String b11101) {
        this.b11101 = b11101;
        notifyPropertyChanged(BR.b11101);
    }

    @Bindable
    public String getB11102() {
        return b11102;
    }

    public void setB11102(String b11102) {
        this.b11102 = b11102;
        notifyPropertyChanged(BR.b11102);
    }

    @Bindable
    public String getB11103() {
        return b11103;
    }

    public void setB11103(String b11103) {
        this.b11103 = b11103;
        notifyPropertyChanged(BR.b11103);
    }

    @Bindable
    public String getB11104() {
        return b11104;
    }

    public void setB11104(String b11104) {
        this.b11104 = b11104;
        notifyPropertyChanged(BR.b11104);
    }

    @Bindable
    public String getB11196() {
        return b11196;
    }

    public void setB11196(String b11196) {
        this.b11196 = b11196;
        notifyPropertyChanged(BR.b11196);
    }

    @Bindable
    public String getB11196x() {
        return b11196x;
    }

    public void setB11196x(String b11196x) {
        this.b11196x = b11196x;
        notifyPropertyChanged(BR.b11196x);
    }

    @Bindable
    public String getB112() {
        return b112;
    }

    public void setB112(String b112) {
        this.b112 = b112;
        notifyPropertyChanged(BR.b112);
    }

    @Bindable
    public String getB11201() {
        return b11201;
    }

    public void setB11201(String b11201) {
        this.b11201 = b11201;
        notifyPropertyChanged(BR.b11201);
    }

    @Bindable
    public String getB11202() {
        return b11202;
    }

    public void setB11202(String b11202) {
        this.b11202 = b11202;
        notifyPropertyChanged(BR.b11202);
    }

    @Bindable
    public String getB11203() {
        return b11203;
    }

    public void setB11203(String b11203) {
        this.b11203 = b11203;
        notifyPropertyChanged(BR.b11203);
    }

    @Bindable
    public String getB11204() {
        return b11204;
    }

    public void setB11204(String b11204) {
        this.b11204 = b11204;
        notifyPropertyChanged(BR.b11204);
    }

    @Bindable
    public String getB11205() {
        return b11205;
    }

    public void setB11205(String b11205) {
        this.b11205 = b11205;
        notifyPropertyChanged(BR.b11205);
    }

    @Bindable
    public String getB11206() {
        return b11206;
    }

    public void setB11206(String b11206) {
        this.b11206 = b11206;
        notifyPropertyChanged(BR.b11206);
    }

    @Bindable
    public String getB11296() {
        return b11296;
    }

    public void setB11296(String b11296) {
        this.b11296 = b11296;
        notifyPropertyChanged(BR.b11296);
    }

    @Bindable
    public String getB11296x() {
        return b11296x;
    }

    public void setB11296x(String b11296x) {
        this.b11296x = b11296x;
        notifyPropertyChanged(BR.b11296x);
    }

    @Bindable
    public String getB11298() {
        return b11298;
    }

    public void setB11298(String b11298) {
        this.b11298 = b11298;
        notifyPropertyChanged(BR.b11298);
    }

    @Bindable
    public String getB113() {
        return b113;
    }

    public void setB113(String b113) {
        this.b113 = b113;
        notifyPropertyChanged(BR.b113);
    }

    @Bindable
    public String getB11396x() {
        return b11396x;
    }

    public void setB11396x(String b11396x) {
        this.b11396x = b11396x;
        notifyPropertyChanged(BR.b11396x);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB11496x() {
        return b11496x;
    }

    public void setB11496x(String b11496x) {
        this.b11496x = b11496x;
        notifyPropertyChanged(BR.b11496x);
    }

    @Bindable
    public String getB115() {
        return b115;
    }

    public void setB115(String b115) {
        this.b115 = b115;
        notifyPropertyChanged(BR.b115);
    }

    @Bindable
    public String getB11501ax() {
        return b11501ax;
    }

    public void setB11501ax(String b11501ax) {
        this.b11501ax = b11501ax;
        notifyPropertyChanged(BR.b11501ax);
    }

    @Bindable
    public String getB11501bx() {
        return b11501bx;
    }

    public void setB11501bx(String b11501bx) {
        this.b11501bx = b11501bx;
        notifyPropertyChanged(BR.b11501bx);
    }

    @Bindable
    public String getB116() {
        return b116;
    }

    public void setB116(String b116) {
        this.b116 = b116;
        notifyPropertyChanged(BR.b116);
    }

    @Bindable
    public String getB11601x() {
        return b11601x;
    }

    public void setB11601x(String b11601x) {
        this.b11601x = b11601x;
        notifyPropertyChanged(BR.b11601x);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        notifyPropertyChanged(BR.b117);
    }

    @Bindable
    public String getB118() {
        return b118;
    }

    public void setB118(String b118) {
        this.b118 = b118;
        notifyPropertyChanged(BR.b118);
    }

    @Bindable
    public String getB119() {
        return b119;
    }

    public void setB119(String b119) {
        this.b119 = b119;
        notifyPropertyChanged(BR.b119);
    }

    @Bindable
    public String getB120() {
        return b120;
    }

    public void setB120(String b120) {
        this.b120 = b120;
        notifyPropertyChanged(BR.b120);
    }


    public ModuleB Hydrate(Cursor cursor) throws JSONException {
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

        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        return this;
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b103 = json.getString("b103");
            this.b104 = json.getString("b104");
            this.b10498 = json.getString("b10498");
            this.b104y = json.getString("b104y");
            this.b104m = json.getString("b104m");
            this.b104w = json.getString("b104w");
            this.b105 = json.getString("b105");
            this.b10598 = json.getString("b10598");
            this.b105d = json.getString("b105d");
            this.b105w = json.getString("b105w");
            this.b105m = json.getString("b105m");
            this.b106 = json.getString("b106");
            this.b10698 = json.getString("b10698");
            this.b10601 = json.getString("b10601");
            this.b107 = json.getString("b107");
            this.b10796x = json.getString("b10796x");
            this.b108 = json.getString("b108");
            this.b10898 = json.getString("b10898");
            this.b10801 = json.getString("b10801");
            this.b109 = json.getString("b109");
            this.b10901 = json.getString("b10901");
            this.b10902 = json.getString("b10902");
            this.b10903 = json.getString("b10903");
            this.b10904 = json.getString("b10904");
            this.b10996 = json.getString("b10996");
            this.b10996x = json.getString("b10996x");
            this.b110 = json.getString("b110");
            this.b11001 = json.getString("b11001");
            this.b11002 = json.getString("b11002");
            this.b11003 = json.getString("b11003");
            this.b11004 = json.getString("b11004");
            this.b11096 = json.getString("b11096");
            this.b11096x = json.getString("b11096x");
            this.b111 = json.getString("b111");
            this.b11101 = json.getString("b11101");
            this.b11102 = json.getString("b11102");
            this.b11103 = json.getString("b11103");
            this.b11104 = json.getString("b11104");
            this.b11196 = json.getString("b11196");
            this.b11196x = json.getString("b11196x");
            this.b112 = json.getString("b112");
            this.b11201 = json.getString("b11201");
            this.b11202 = json.getString("b11202");
            this.b11203 = json.getString("b11203");
            this.b11204 = json.getString("b11204");
            this.b11205 = json.getString("b11205");
            this.b11206 = json.getString("b11206");
            this.b11296 = json.getString("b11296");
            this.b11296x = json.getString("b11296x");
            this.b11298 = json.getString("b11298");
            this.b113 = json.getString("b113");
            this.b11396x = json.getString("b11396x");
            this.b114 = json.getString("b114");
            this.b11496x = json.getString("b11496x");
            this.b115 = json.getString("b115");
            this.b11501ax = json.getString("b11501ax");
            this.b11501bx = json.getString("b11501bx");
            this.b116 = json.getString("b116");
            this.b11601x = json.getString("b11601x");
            this.b117 = json.getString("b117");
            this.b118 = json.getString("b118");
            this.b119 = json.getString("b119");
            this.b120 = json.getString("b120");
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
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sB1toString()));
        return json;
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sB1toString: ");
        JSONObject json = new JSONObject();
        json.put("b101", b101)
                .put("b102", b102)
                .put("b103", b103)
                .put("b104", b104)
                .put("b10498", b10498)
                .put("b104y", b104y)
                .put("b104m", b104m)
                .put("b104w", b104w)
                .put("b105", b105)
                .put("b10598", b10598)
                .put("b105d", b105d)
                .put("b105w", b105w)
                .put("b105m", b105m)
                .put("b106", b106)
                .put("b10698", b10698)
                .put("b10601", b10601)
                .put("b107", b107)
                .put("b10796x", b10796x)
                .put("b108", b108)
                .put("b10898", b10898)
                .put("b10801", b10801)
                .put("b109", b109)
                .put("b10901", b10901)
                .put("b10902", b10902)
                .put("b10903", b10903)
                .put("b10904", b10904)
                .put("b10996", b10996)
                .put("b10996x", b10996x)
                .put("b110", b110)
                .put("b11001", b11001)
                .put("b11002", b11002)
                .put("b11003", b11003)
                .put("b11004", b11004)
                .put("b11096", b11096)
                .put("b11096x", b11096x)
                .put("b111", b111)
                .put("b11101", b11101)
                .put("b11102", b11102)
                .put("b11103", b11103)
                .put("b11104", b11104)
                .put("b11196", b11196)
                .put("b11196x", b11196x)
                .put("b112", b112)
                .put("b11201", b11201)
                .put("b11202", b11202)
                .put("b11203", b11203)
                .put("b11204", b11204)
                .put("b11205", b11205)
                .put("b11206", b11206)
                .put("b11296", b11296)
                .put("b11296x", b11296x)
                .put("b11298", b11298)
                .put("b113", b113)
                .put("b11396x", b11396x)
                .put("b114", b114)
                .put("b11496x", b11496x)
                .put("b115", b115)
                .put("b11501ax", b11501ax)
                .put("b11501bx", b11501bx)
                .put("b116", b116)
                .put("b11601x", b11601x)
                .put("b117", b117)
                .put("b118", b118)
                .put("b119", b119)
                .put("b120", b120);
        return json.toString();
    }


}
