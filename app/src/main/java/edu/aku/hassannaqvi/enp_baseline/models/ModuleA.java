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


public class ModuleA extends BaseObservable implements Observable {

    private final String TAG = "ModuleA";
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
    private String a101 = _EMPTY_;
    private String a102 = _EMPTY_;
    private String a103 = _EMPTY_;
    private String a104 = _EMPTY_;
    private String a105 = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;
    private String a108d = _EMPTY_;
    private String a108m = _EMPTY_;
    private String a108y = _EMPTY_;
    private String a109 = _EMPTY_;
    private String a110 = _EMPTY_;
    private String a111 = _EMPTY_;
    private String a112 = _EMPTY_;
    private String a113 = _EMPTY_;
    private String a114 = _EMPTY_;
    private String a115h = _EMPTY_;
    private String a115m = _EMPTY_;
    private String a116h = _EMPTY_;
    private String a116m = _EMPTY_;
    private String a117 = _EMPTY_;
    private String a118 = _EMPTY_;
    private String a301 = _EMPTY_;
    private String a30196x = _EMPTY_;
    private String a302 = _EMPTY_;
    private String a30296x = _EMPTY_;
    private String a303 = _EMPTY_;
    private String a30396x = _EMPTY_;
    private String a304t3 = _EMPTY_;
    private String a305 = _EMPTY_;
    private String a306 = _EMPTY_;
    private String a30601 = _EMPTY_;
    private String a30602 = _EMPTY_;
    private String a30603 = _EMPTY_;
    private String a30604 = _EMPTY_;
    private String a30605 = _EMPTY_;
    private String a30606 = _EMPTY_;
    private String a30696 = _EMPTY_;
    private String a30696x = _EMPTY_;
    private String a307 = _EMPTY_;
    private String a30796x = _EMPTY_;
    private String a308 = _EMPTY_;
    private String a309 = _EMPTY_;
    private String a310 = _EMPTY_;
    private String a31096x = _EMPTY_;
    private String a31101 = _EMPTY_;
    private String a31102 = _EMPTY_;
    private String a31103 = _EMPTY_;
    private String a31104 = _EMPTY_;
    private String a31105 = _EMPTY_;
    private String a31106 = _EMPTY_;
    private String a31107 = _EMPTY_;
    private String a31108 = _EMPTY_;
    private String a31109 = _EMPTY_;
    private String a31110 = _EMPTY_;
    private String a31111 = _EMPTY_;
    private String a31112 = _EMPTY_;
    private String a31113 = _EMPTY_;
    private String a31114 = _EMPTY_;
    private String a31115 = _EMPTY_;
    private String a31116 = _EMPTY_;
    private String a31117 = _EMPTY_;
    private String a31118 = _EMPTY_;
    private String a31119 = _EMPTY_;
    private String a31201 = _EMPTY_;
    private String a31202 = _EMPTY_;
    private String a31203 = _EMPTY_;
    private String a31204 = _EMPTY_;
    private String a31205 = _EMPTY_;
    private String a31206 = _EMPTY_;
    private String a31207 = _EMPTY_;
    private String a31208 = _EMPTY_;
    private String a313 = _EMPTY_;
    private String a31396x = _EMPTY_;
    private String a314 = _EMPTY_;
    private String a315 = _EMPTY_;
    private String a31596x = _EMPTY_;
    private String a316 = _EMPTY_;
    private String a31696x = _EMPTY_;
    private String a317 = _EMPTY_;
    private String a31796x = _EMPTY_;
    private String a318 = _EMPTY_;
    private String a319 = _EMPTY_;
    private String a320 = _EMPTY_;
    private String a32001x = _EMPTY_;
    private String a32002x = _EMPTY_;
    private String a32003x = _EMPTY_;
    private String a32096x = _EMPTY_;
    private String a321 = _EMPTY_;
    private String a322 = _EMPTY_;
    private String a32201x = _EMPTY_;
    private String a32202x = _EMPTY_;
    private String a32203x = _EMPTY_;
    private String a32204x = _EMPTY_;
    private String a32205x = _EMPTY_;
    private String a32206x = _EMPTY_;
    private String a32207x = _EMPTY_;
    private String a401 = _EMPTY_;
    private String a402 = _EMPTY_;
    private String a403 = _EMPTY_;
    private String a40301 = _EMPTY_;
    private String a40302 = _EMPTY_;
    private String a40303 = _EMPTY_;
    private String a40304 = _EMPTY_;
    private String a40305 = _EMPTY_;
    private String a404 = _EMPTY_;
    private String a405 = _EMPTY_;
    private String a40501 = _EMPTY_;
    private String a40502 = _EMPTY_;
    private String a40503 = _EMPTY_;
    private String a40504 = _EMPTY_;
    private String a40505 = _EMPTY_;
    private String a406 = _EMPTY_;
    private String a40601 = _EMPTY_;
    private String a40602 = _EMPTY_;
    private String a40603 = _EMPTY_;
    private String a40604 = _EMPTY_;
    private String a40605 = _EMPTY_;
    private String a40606 = _EMPTY_;
    private String a40607 = _EMPTY_;
    private String a40608 = _EMPTY_;
    private String a40609 = _EMPTY_;
    private String a40696 = _EMPTY_;
    private String a40696x = _EMPTY_;
    private String a501 = _EMPTY_;
    private String a502 = _EMPTY_;
    private String a503 = _EMPTY_;
    private String a504 = _EMPTY_;
    private String a505 = _EMPTY_;
    private String a506 = _EMPTY_;
    private String a507 = _EMPTY_;
    private String a508 = _EMPTY_;


    public ModuleA() {

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
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
        notifyPropertyChanged(BR.a104);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA108d() {
        return a108d;
    }

    public void setA108d(String a108d) {
        this.a108d = a108d;
        notifyPropertyChanged(BR.a108d);
    }

    @Bindable
    public String getA108m() {
        return a108m;
    }

    public void setA108m(String a108m) {
        this.a108m = a108m;
        notifyPropertyChanged(BR.a108m);
    }

    @Bindable
    public String getA108y() {
        return a108y;
    }

    public void setA108y(String a108y) {
        this.a108y = a108y;
        notifyPropertyChanged(BR.a108y);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111() {
        return a111;
    }

    public void setA111(String a111) {
        this.a111 = a111;
        notifyPropertyChanged(BR.a111);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        notifyPropertyChanged(BR.a113);
    }

    @Bindable
    public String getA114() {
        return a114;
    }

    public void setA114(String a114) {
        this.a114 = a114;
        notifyPropertyChanged(BR.a114);
    }

    @Bindable
    public String getA115h() {
        return a115h;
    }

    public void setA115h(String a115h) {
        this.a115h = a115h;
        notifyPropertyChanged(BR.a115h);
    }

    @Bindable
    public String getA115m() {
        return a115m;
    }

    public void setA115m(String a115m) {
        this.a115m = a115m;
        notifyPropertyChanged(BR.a115m);
    }

    @Bindable
    public String getA116h() {
        return a116h;
    }

    public void setA116h(String a116h) {
        this.a116h = a116h;
        notifyPropertyChanged(BR.a116h);
    }

    @Bindable
    public String getA116m() {
        return a116m;
    }

    public void setA116m(String a116m) {
        this.a116m = a116m;
        notifyPropertyChanged(BR.a116m);
    }

    @Bindable
    public String getA117() {
        return a117;
    }

    public void setA117(String a117) {
        this.a117 = a117;
        notifyPropertyChanged(BR.a117);
    }

    @Bindable
    public String getA118() {
        return a118;
    }

    public void setA118(String a118) {
        this.a118 = a118;
        notifyPropertyChanged(BR.a118);
    }

    @Bindable
    public String getA301() {
        return a301;
    }

    public void setA301(String a301) {
        this.a301 = a301;
        notifyPropertyChanged(BR.a301);
    }

    @Bindable
    public String getA30196x() {
        return a30196x;
    }

    public void setA30196x(String a30196x) {
        this.a30196x = a30196x;
        notifyPropertyChanged(BR.a30196x);
    }

    @Bindable
    public String getA302() {
        return a302;
    }

    public void setA302(String a302) {
        this.a302 = a302;
        notifyPropertyChanged(BR.a302);
    }

    @Bindable
    public String getA30296x() {
        return a30296x;
    }

    public void setA30296x(String a30296x) {
        this.a30296x = a30296x;
        notifyPropertyChanged(BR.a30296x);
    }

    @Bindable
    public String getA303() {
        return a303;
    }

    public void setA303(String a303) {
        this.a303 = a303;
        notifyPropertyChanged(BR.a303);
    }

    @Bindable
    public String getA30396x() {
        return a30396x;
    }

    public void setA30396x(String a30396x) {
        this.a30396x = a30396x;
        notifyPropertyChanged(BR.a30396x);
    }

    @Bindable
    public String getA304t3() {
        return a304t3;
    }

    public void setA304t3(String a304t3) {
        this.a304t3 = a304t3;
        notifyPropertyChanged(BR.a304t3);
    }

    @Bindable
    public String getA305() {
        return a305;
    }

    public void setA305(String a305) {
        this.a305 = a305;
        notifyPropertyChanged(BR.a305);
    }

    @Bindable
    public String getA306() {
        return a306;
    }

    public void setA306(String a306) {
        this.a306 = a306;
        notifyPropertyChanged(BR.a306);
    }

    @Bindable
    public String getA30601() {
        return a30601;
    }

    public void setA30601(String a30601) {
        this.a30601 = a30601;
        notifyPropertyChanged(BR.a30601);
    }

    @Bindable
    public String getA30602() {
        return a30602;
    }

    public void setA30602(String a30602) {
        this.a30602 = a30602;
        notifyPropertyChanged(BR.a30602);
    }

    @Bindable
    public String getA30603() {
        return a30603;
    }

    public void setA30603(String a30603) {
        this.a30603 = a30603;
        notifyPropertyChanged(BR.a30603);
    }

    @Bindable
    public String getA30604() {
        return a30604;
    }

    public void setA30604(String a30604) {
        this.a30604 = a30604;
        notifyPropertyChanged(BR.a30604);
    }

    @Bindable
    public String getA30605() {
        return a30605;
    }

    public void setA30605(String a30605) {
        this.a30605 = a30605;
        notifyPropertyChanged(BR.a30605);
    }

    @Bindable
    public String getA30606() {
        return a30606;
    }

    public void setA30606(String a30606) {
        this.a30606 = a30606;
        notifyPropertyChanged(BR.a30606);
    }

    @Bindable
    public String getA30696() {
        return a30696;
    }

    public void setA30696(String a30696) {
        this.a30696 = a30696;
        notifyPropertyChanged(BR.a30696);
    }

    @Bindable
    public String getA30696x() {
        return a30696x;
    }

    public void setA30696x(String a30696x) {
        this.a30696x = a30696x;
        notifyPropertyChanged(BR.a30696x);
    }

    @Bindable
    public String getA307() {
        return a307;
    }

    public void setA307(String a307) {
        this.a307 = a307;
        notifyPropertyChanged(BR.a307);
    }

    @Bindable
    public String getA30796x() {
        return a30796x;
    }

    public void setA30796x(String a30796x) {
        this.a30796x = a30796x;
        notifyPropertyChanged(BR.a30796x);
    }

    @Bindable
    public String getA308() {
        return a308;
    }

    public void setA308(String a308) {
        this.a308 = a308;
        notifyPropertyChanged(BR.a308);
    }

    @Bindable
    public String getA309() {
        return a309;
    }

    public void setA309(String a309) {
        this.a309 = a309;
        notifyPropertyChanged(BR.a309);
    }

    @Bindable
    public String getA310() {
        return a310;
    }

    public void setA310(String a310) {
        this.a310 = a310;
        notifyPropertyChanged(BR.a310);
    }

    @Bindable
    public String getA31096x() {
        return a31096x;
    }

    public void setA31096x(String a31096x) {
        this.a31096x = a31096x;
        notifyPropertyChanged(BR.a31096x);
    }

    @Bindable
    public String getA31101() {
        return a31101;
    }

    public void setA31101(String a31101) {
        this.a31101 = a31101;
        notifyPropertyChanged(BR.a31101);
    }

    @Bindable
    public String getA31102() {
        return a31102;
    }

    public void setA31102(String a31102) {
        this.a31102 = a31102;
        notifyPropertyChanged(BR.a31102);
    }

    @Bindable
    public String getA31103() {
        return a31103;
    }

    public void setA31103(String a31103) {
        this.a31103 = a31103;
        notifyPropertyChanged(BR.a31103);
    }

    @Bindable
    public String getA31104() {
        return a31104;
    }

    public void setA31104(String a31104) {
        this.a31104 = a31104;
        notifyPropertyChanged(BR.a31104);
    }

    @Bindable
    public String getA31105() {
        return a31105;
    }

    public void setA31105(String a31105) {
        this.a31105 = a31105;
        notifyPropertyChanged(BR.a31105);
    }

    @Bindable
    public String getA31106() {
        return a31106;
    }

    public void setA31106(String a31106) {
        this.a31106 = a31106;
        notifyPropertyChanged(BR.a31106);
    }

    @Bindable
    public String getA31107() {
        return a31107;
    }

    public void setA31107(String a31107) {
        this.a31107 = a31107;
        notifyPropertyChanged(BR.a31107);
    }

    @Bindable
    public String getA31108() {
        return a31108;
    }

    public void setA31108(String a31108) {
        this.a31108 = a31108;
        notifyPropertyChanged(BR.a31108);
    }

    @Bindable
    public String getA31109() {
        return a31109;
    }

    public void setA31109(String a31109) {
        this.a31109 = a31109;
        notifyPropertyChanged(BR.a31109);
    }

    @Bindable
    public String getA31110() {
        return a31110;
    }

    public void setA31110(String a31110) {
        this.a31110 = a31110;
        notifyPropertyChanged(BR.a31110);
    }

    @Bindable
    public String getA31111() {
        return a31111;
    }

    public void setA31111(String a31111) {
        this.a31111 = a31111;
        notifyPropertyChanged(BR.a31111);
    }

    @Bindable
    public String getA31112() {
        return a31112;
    }

    public void setA31112(String a31112) {
        this.a31112 = a31112;
        notifyPropertyChanged(BR.a31112);
    }

    @Bindable
    public String getA31113() {
        return a31113;
    }

    public void setA31113(String a31113) {
        this.a31113 = a31113;
        notifyPropertyChanged(BR.a31113);
    }

    @Bindable
    public String getA31114() {
        return a31114;
    }

    public void setA31114(String a31114) {
        this.a31114 = a31114;
        notifyPropertyChanged(BR.a31114);
    }

    @Bindable
    public String getA31115() {
        return a31115;
    }

    public void setA31115(String a31115) {
        this.a31115 = a31115;
        notifyPropertyChanged(BR.a31115);
    }

    @Bindable
    public String getA31116() {
        return a31116;
    }

    public void setA31116(String a31116) {
        this.a31116 = a31116;
        notifyPropertyChanged(BR.a31116);
    }

    @Bindable
    public String getA31117() {
        return a31117;
    }

    public void setA31117(String a31117) {
        this.a31117 = a31117;
        notifyPropertyChanged(BR.a31117);
    }

    @Bindable
    public String getA31118() {
        return a31118;
    }

    public void setA31118(String a31118) {
        this.a31118 = a31118;
        notifyPropertyChanged(BR.a31118);
    }

    @Bindable
    public String getA31119() {
        return a31119;
    }

    public void setA31119(String a31119) {
        this.a31119 = a31119;
        notifyPropertyChanged(BR.a31119);
    }

    @Bindable
    public String getA31201() {
        return a31201;
    }

    public void setA31201(String a31201) {
        this.a31201 = a31201;
        notifyPropertyChanged(BR.a31201);
    }

    @Bindable
    public String getA31202() {
        return a31202;
    }

    public void setA31202(String a31202) {
        this.a31202 = a31202;
        notifyPropertyChanged(BR.a31202);
    }

    @Bindable
    public String getA31203() {
        return a31203;
    }

    public void setA31203(String a31203) {
        this.a31203 = a31203;
        notifyPropertyChanged(BR.a31203);
    }

    @Bindable
    public String getA31204() {
        return a31204;
    }

    public void setA31204(String a31204) {
        this.a31204 = a31204;
        notifyPropertyChanged(BR.a31204);
    }

    @Bindable
    public String getA31205() {
        return a31205;
    }

    public void setA31205(String a31205) {
        this.a31205 = a31205;
        notifyPropertyChanged(BR.a31205);
    }

    @Bindable
    public String getA31206() {
        return a31206;
    }

    public void setA31206(String a31206) {
        this.a31206 = a31206;
        notifyPropertyChanged(BR.a31206);
    }

    @Bindable
    public String getA31207() {
        return a31207;
    }

    public void setA31207(String a31207) {
        this.a31207 = a31207;
        notifyPropertyChanged(BR.a31207);
    }

    @Bindable
    public String getA31208() {
        return a31208;
    }

    public void setA31208(String a31208) {
        this.a31208 = a31208;
        notifyPropertyChanged(BR.a31208);
    }

    @Bindable
    public String getA313() {
        return a313;
    }

    public void setA313(String a313) {
        this.a313 = a313;
        notifyPropertyChanged(BR.a313);
    }

    @Bindable
    public String getA31396x() {
        return a31396x;
    }

    public void setA31396x(String a31396x) {
        this.a31396x = a31396x;
        notifyPropertyChanged(BR.a31396x);
    }

    @Bindable
    public String getA314() {
        return a314;
    }

    public void setA314(String a314) {
        this.a314 = a314;
        notifyPropertyChanged(BR.a314);
    }

    @Bindable
    public String getA315() {
        return a315;
    }

    public void setA315(String a315) {
        this.a315 = a315;
        notifyPropertyChanged(BR.a315);
    }

    @Bindable
    public String getA31596x() {
        return a31596x;
    }

    public void setA31596x(String a31596x) {
        this.a31596x = a31596x;
        notifyPropertyChanged(BR.a31596x);
    }

    @Bindable
    public String getA316() {
        return a316;
    }

    public void setA316(String a316) {
        this.a316 = a316;
        notifyPropertyChanged(BR.a316);
    }

    @Bindable
    public String getA31696x() {
        return a31696x;
    }

    public void setA31696x(String a31696x) {
        this.a31696x = a31696x;
        notifyPropertyChanged(BR.a31696x);
    }

    @Bindable
    public String getA317() {
        return a317;
    }

    public void setA317(String a317) {
        this.a317 = a317;
        notifyPropertyChanged(BR.a317);
    }

    @Bindable
    public String getA31796x() {
        return a31796x;
    }

    public void setA31796x(String a31796x) {
        this.a31796x = a31796x;
        notifyPropertyChanged(BR.a31796x);
    }

    @Bindable
    public String getA318() {
        return a318;
    }

    public void setA318(String a318) {
        this.a318 = a318;
        notifyPropertyChanged(BR.a318);
    }

    @Bindable
    public String getA319() {
        return a319;
    }

    public void setA319(String a319) {
        this.a319 = a319;
        notifyPropertyChanged(BR.a319);
    }

    @Bindable
    public String getA320() {
        return a320;
    }

    public void setA320(String a320) {
        this.a320 = a320;
        notifyPropertyChanged(BR.a320);
    }

    @Bindable
    public String getA32001x() {
        return a32001x;
    }

    public void setA32001x(String a32001x) {
        this.a32001x = a32001x;
        notifyPropertyChanged(BR.a32001x);
    }

    @Bindable
    public String getA32002x() {
        return a32002x;
    }

    public void setA32002x(String a32002x) {
        this.a32002x = a32002x;
        notifyPropertyChanged(BR.a32002x);
    }

    @Bindable
    public String getA32003x() {
        return a32003x;
    }

    public void setA32003x(String a32003x) {
        this.a32003x = a32003x;
        notifyPropertyChanged(BR.a32003x);
    }

    @Bindable
    public String getA32096x() {
        return a32096x;
    }

    public void setA32096x(String a32096x) {
        this.a32096x = a32096x;
        notifyPropertyChanged(BR.a32096x);
    }

    @Bindable
    public String getA321() {
        return a321;
    }

    public void setA321(String a321) {
        this.a321 = a321;
        notifyPropertyChanged(BR.a321);
    }

    @Bindable
    public String getA322() {
        return a322;
    }

    public void setA322(String a322) {
        this.a322 = a322;
        notifyPropertyChanged(BR.a322);
    }

    @Bindable
    public String getA32201x() {
        return a32201x;
    }

    public void setA32201x(String a32201x) {
        this.a32201x = a32201x;
        notifyPropertyChanged(BR.a32201x);
    }

    @Bindable
    public String getA32202x() {
        return a32202x;
    }

    public void setA32202x(String a32202x) {
        this.a32202x = a32202x;
        notifyPropertyChanged(BR.a32202x);
    }

    @Bindable
    public String getA32203x() {
        return a32203x;
    }

    public void setA32203x(String a32203x) {
        this.a32203x = a32203x;
        notifyPropertyChanged(BR.a32203x);
    }

    @Bindable
    public String getA32204x() {
        return a32204x;
    }

    public void setA32204x(String a32204x) {
        this.a32204x = a32204x;
        notifyPropertyChanged(BR.a32204x);
    }

    @Bindable
    public String getA32205x() {
        return a32205x;
    }

    public void setA32205x(String a32205x) {
        this.a32205x = a32205x;
        notifyPropertyChanged(BR.a32205x);
    }

    @Bindable
    public String getA32206x() {
        return a32206x;
    }

    public void setA32206x(String a32206x) {
        this.a32206x = a32206x;
        notifyPropertyChanged(BR.a32206x);
    }

    @Bindable
    public String getA32207x() {
        return a32207x;
    }

    public void setA32207x(String a32207x) {
        this.a32207x = a32207x;
        notifyPropertyChanged(BR.a32207x);
    }

    @Bindable
    public String getA401() {
        return a401;
    }

    public void setA401(String a401) {
        this.a401 = a401;
        notifyPropertyChanged(BR.a401);
    }

    @Bindable
    public String getA402() {
        return a402;
    }

    public void setA402(String a402) {
        this.a402 = a402;
        notifyPropertyChanged(BR.a402);
    }

    @Bindable
    public String getA403() {
        return a403;
    }

    public void setA403(String a403) {
        this.a403 = a403;
        notifyPropertyChanged(BR.a403);
    }

    @Bindable
    public String getA40301() {
        return a40301;
    }

    public void setA40301(String a40301) {
        this.a40301 = a40301;
        notifyPropertyChanged(BR.a40301);
    }

    @Bindable
    public String getA40302() {
        return a40302;
    }

    public void setA40302(String a40302) {
        this.a40302 = a40302;
        notifyPropertyChanged(BR.a40302);
    }

    @Bindable
    public String getA40303() {
        return a40303;
    }

    public void setA40303(String a40303) {
        this.a40303 = a40303;
        notifyPropertyChanged(BR.a40303);
    }

    @Bindable
    public String getA40304() {
        return a40304;
    }

    public void setA40304(String a40304) {
        this.a40304 = a40304;
        notifyPropertyChanged(BR.a40304);
    }

    @Bindable
    public String getA40305() {
        return a40305;
    }

    public void setA40305(String a40305) {
        this.a40305 = a40305;
        notifyPropertyChanged(BR.a40305);
    }

    @Bindable
    public String getA404() {
        return a404;
    }

    public void setA404(String a404) {
        this.a404 = a404;
        notifyPropertyChanged(BR.a404);
    }

    @Bindable
    public String getA405() {
        return a405;
    }

    public void setA405(String a405) {
        this.a405 = a405;
        notifyPropertyChanged(BR.a405);
    }

    @Bindable
    public String getA40501() {
        return a40501;
    }

    public void setA40501(String a40501) {
        this.a40501 = a40501;
        notifyPropertyChanged(BR.a40501);
    }

    @Bindable
    public String getA40502() {
        return a40502;
    }

    public void setA40502(String a40502) {
        this.a40502 = a40502;
        notifyPropertyChanged(BR.a40502);
    }

    @Bindable
    public String getA40503() {
        return a40503;
    }

    public void setA40503(String a40503) {
        this.a40503 = a40503;
        notifyPropertyChanged(BR.a40503);
    }

    @Bindable
    public String getA40504() {
        return a40504;
    }

    public void setA40504(String a40504) {
        this.a40504 = a40504;
        notifyPropertyChanged(BR.a40504);
    }

    @Bindable
    public String getA40505() {
        return a40505;
    }

    public void setA40505(String a40505) {
        this.a40505 = a40505;
        notifyPropertyChanged(BR.a40505);
    }

    @Bindable
    public String getA406() {
        return a406;
    }

    public void setA406(String a406) {
        this.a406 = a406;
        notifyPropertyChanged(BR.a406);
    }

    @Bindable
    public String getA40601() {
        return a40601;
    }

    public void setA40601(String a40601) {
        this.a40601 = a40601;
        notifyPropertyChanged(BR.a40601);
    }

    @Bindable
    public String getA40602() {
        return a40602;
    }

    public void setA40602(String a40602) {
        this.a40602 = a40602;
        notifyPropertyChanged(BR.a40602);
    }

    @Bindable
    public String getA40603() {
        return a40603;
    }

    public void setA40603(String a40603) {
        this.a40603 = a40603;
        notifyPropertyChanged(BR.a40603);
    }

    @Bindable
    public String getA40604() {
        return a40604;
    }

    public void setA40604(String a40604) {
        this.a40604 = a40604;
        notifyPropertyChanged(BR.a40604);
    }

    @Bindable
    public String getA40605() {
        return a40605;
    }

    public void setA40605(String a40605) {
        this.a40605 = a40605;
        notifyPropertyChanged(BR.a40605);
    }

    @Bindable
    public String getA40606() {
        return a40606;
    }

    public void setA40606(String a40606) {
        this.a40606 = a40606;
        notifyPropertyChanged(BR.a40606);
    }

    @Bindable
    public String getA40607() {
        return a40607;
    }

    public void setA40607(String a40607) {
        this.a40607 = a40607;
        notifyPropertyChanged(BR.a40607);
    }

    @Bindable
    public String getA40608() {
        return a40608;
    }

    public void setA40608(String a40608) {
        this.a40608 = a40608;
        notifyPropertyChanged(BR.a40608);
    }

    @Bindable
    public String getA40609() {
        return a40609;
    }

    public void setA40609(String a40609) {
        this.a40609 = a40609;
        notifyPropertyChanged(BR.a40609);
    }

    @Bindable
    public String getA40696() {
        return a40696;
    }

    public void setA40696(String a40696) {
        this.a40696 = a40696;
        notifyPropertyChanged(BR.a40696);
    }

    @Bindable
    public String getA40696x() {
        return a40696x;
    }

    public void setA40696x(String a40696x) {
        this.a40696x = a40696x;
        notifyPropertyChanged(BR.a40696x);
    }

    @Bindable
    public String getA501() {
        return a501;
    }

    public void setA501(String a501) {
        this.a501 = a501;
        notifyPropertyChanged(BR.a501);
    }

    @Bindable
    public String getA502() {
        return a502;
    }

    public void setA502(String a502) {
        this.a502 = a502;
        notifyPropertyChanged(BR.a502);
    }

    @Bindable
    public String getA503() {
        return a503;
    }

    public void setA503(String a503) {
        this.a503 = a503;
        notifyPropertyChanged(BR.a503);
    }

    @Bindable
    public String getA504() {
        return a504;
    }

    public void setA504(String a504) {
        this.a504 = a504;
        notifyPropertyChanged(BR.a504);
    }

    @Bindable
    public String getA505() {
        return a505;
    }

    public void setA505(String a505) {
        this.a505 = a505;
        notifyPropertyChanged(BR.a505);
    }

    @Bindable
    public String getA506() {
        return a506;
    }

    public void setA506(String a506) {
        this.a506 = a506;
        notifyPropertyChanged(BR.a506);
    }

    @Bindable
    public String getA507() {
        return a507;
    }

    public void setA507(String a507) {
        this.a507 = a507;
        notifyPropertyChanged(BR.a507);
    }

    @Bindable
    public String getA508() {
        return a508;
    }

    public void setA508(String a508) {
        this.a508 = a508;
        notifyPropertyChanged(BR.a508);
    }


    public ModuleA Hydrate(Cursor cursor) throws JSONException {
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

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sA3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3)));
        sA4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4)));
        sA5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5)));
        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a101 = json.getString("a101");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104 = json.getString("a104");
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a108d = json.getString("a108d");
            this.a108m = json.getString("a108m");
            this.a108y = json.getString("a108y");
            this.a109 = json.getString("a109");
            this.a110 = json.getString("a110");
            this.a111 = json.getString("a111");
            this.a112 = json.getString("a112");
            this.a113 = json.getString("a113");
            this.a114 = json.getString("a114");
            this.a115h = json.getString("a115h");
            this.a115m = json.getString("a115m");
            this.a116h = json.getString("a116h");
            this.a116m = json.getString("a116m");
            this.a117 = json.getString("a117");
            this.a118 = json.getString("a118");
        }
    }

    public void sA3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a301 = json.getString("a301");
            this.a30196x = json.getString("a30196x");
            this.a302 = json.getString("a302");
            this.a30296x = json.getString("a30296x");
            this.a303 = json.getString("a303");
            this.a30396x = json.getString("a30396x");
            this.a304t3 = json.getString("a304t3");
            this.a305 = json.getString("a305");
            this.a306 = json.getString("a306");
            this.a30601 = json.getString("a30601");
            this.a30602 = json.getString("a30602");
            this.a30603 = json.getString("a30603");
            this.a30604 = json.getString("a30604");
            this.a30605 = json.getString("a30605");
            this.a30606 = json.getString("a30606");
            this.a30696 = json.getString("a30696");
            this.a30696x = json.getString("a30696x");
            this.a307 = json.getString("a307");
            this.a30796x = json.getString("a30796x");
            this.a308 = json.getString("a308");
            this.a309 = json.getString("a309");
            this.a310 = json.getString("a310");
            this.a31096x = json.getString("a31096x");
            this.a31101 = json.getString("a31101");
            this.a31102 = json.getString("a31102");
            this.a31103 = json.getString("a31103");
            this.a31104 = json.getString("a31104");
            this.a31105 = json.getString("a31105");
            this.a31106 = json.getString("a31106");
            this.a31107 = json.getString("a31107");
            this.a31108 = json.getString("a31108");
            this.a31109 = json.getString("a31109");
            this.a31110 = json.getString("a31110");
            this.a31111 = json.getString("a31111");
            this.a31112 = json.getString("a31112");
            this.a31113 = json.getString("a31113");
            this.a31114 = json.getString("a31114");
            this.a31115 = json.getString("a31115");
            this.a31116 = json.getString("a31116");
            this.a31117 = json.getString("a31117");
            this.a31118 = json.getString("a31118");
            this.a31119 = json.getString("a31119");
            this.a31201 = json.getString("a31201");
            this.a31202 = json.getString("a31202");
            this.a31203 = json.getString("a31203");
            this.a31204 = json.getString("a31204");
            this.a31205 = json.getString("a31205");
            this.a31206 = json.getString("a31206");
            this.a31207 = json.getString("a31207");
            this.a31208 = json.getString("a31208");
            this.a313 = json.getString("a313");
            this.a31396x = json.getString("a31396x");
            this.a314 = json.getString("a314");
            this.a315 = json.getString("a315");
            this.a31596x = json.getString("a31596x");
            this.a316 = json.getString("a316");
            this.a31696x = json.getString("a31696x");
            this.a317 = json.getString("a317");
            this.a31796x = json.getString("a31796x");
            this.a318 = json.getString("a318");
            this.a319 = json.getString("a319");
            this.a320 = json.getString("a320");
            this.a32001x = json.getString("a32001x");
            this.a32002x = json.getString("a32002x");
            this.a32003x = json.getString("a32003x");
            this.a32096x = json.getString("a32096x");
            this.a321 = json.getString("a321");
            this.a322 = json.getString("a322");
            this.a32201x = json.getString("a32201x");
            this.a32202x = json.getString("a32202x");
            this.a32203x = json.getString("a32203x");
            this.a32204x = json.getString("a32204x");
            this.a32205x = json.getString("a32205x");
            this.a32206x = json.getString("a32206x");
            this.a32207x = json.getString("a32207x");
        }
    }

    public void sA4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a401 = json.getString("a401");
            this.a402 = json.getString("a402");
            this.a403 = json.getString("a403");
            this.a40301 = json.getString("a40301");
            this.a40302 = json.getString("a40302");
            this.a40303 = json.getString("a40303");
            this.a40304 = json.getString("a40304");
            this.a40305 = json.getString("a40305");
            this.a404 = json.getString("a404");
            this.a405 = json.getString("a405");
            this.a40501 = json.getString("a40501");
            this.a40502 = json.getString("a40502");
            this.a40503 = json.getString("a40503");
            this.a40504 = json.getString("a40504");
            this.a40505 = json.getString("a40505");
            this.a406 = json.getString("a406");
            this.a40601 = json.getString("a40601");
            this.a40602 = json.getString("a40602");
            this.a40603 = json.getString("a40603");
            this.a40604 = json.getString("a40604");
            this.a40605 = json.getString("a40605");
            this.a40606 = json.getString("a40606");
            this.a40607 = json.getString("a40607");
            this.a40608 = json.getString("a40608");
            this.a40609 = json.getString("a40609");
            this.a40696 = json.getString("a40696");
            this.a40696x = json.getString("a40696x");
        }
    }

    public void sA5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a501 = json.getString("a501");
            this.a502 = json.getString("a502");
            this.a503 = json.getString("a503");
            this.a504 = json.getString("a504");
            this.a505 = json.getString("a505");
            this.a506 = json.getString("a506");
            this.a507 = json.getString("a507");
            this.a508 = json.getString("a508");
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
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
        json.put(FormsTable.COLUMN_SA3, new JSONObject(sA3toString()));
        json.put(FormsTable.COLUMN_SA4, new JSONObject(sA4toString()));
        json.put(FormsTable.COLUMN_SA5, new JSONObject(sA5toString()));
        return json;
    }

    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("a101", a101)
                .put("a102", a102)
                .put("a103", a103)
                .put("a104", a104)
                .put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a108d", a108d)
                .put("a108m", a108m)
                .put("a108y", a108y)
                .put("a109", a109)
                .put("a110", a110)
                .put("a111", a111)
                .put("a112", a112)
                .put("a113", a113)
                .put("a114", a114)
                .put("a115h", a115h)
                .put("a115m", a115m)
                .put("a116h", a116h)
                .put("a116m", a116m)
                .put("a117", a117)
                .put("a118", a118);
        return json.toString();
    }

    public String sA3toString() throws JSONException {
        Log.d(TAG, "sA3toString: ");
        JSONObject json = new JSONObject();
        json.put("a301", a301)
                .put("a30196x", a30196x)
                .put("a302", a302)
                .put("a30296x", a30296x)
                .put("a303", a303)
                .put("a30396x", a30396x)
                .put("a304t3", a304t3)
                .put("a305", a305)
                .put("a306", a306)
                .put("a30601", a30601)
                .put("a30602", a30602)
                .put("a30603", a30603)
                .put("a30604", a30604)
                .put("a30605", a30605)
                .put("a30606", a30606)
                .put("a30696", a30696)
                .put("a30696x", a30696x)
                .put("a307", a307)
                .put("a30796x", a30796x)
                .put("a308", a308)
                .put("a309", a309)
                .put("a310", a310)
                .put("a31096x", a31096x)
                .put("a31101", a31101)
                .put("a31102", a31102)
                .put("a31103", a31103)
                .put("a31104", a31104)
                .put("a31105", a31105)
                .put("a31106", a31106)
                .put("a31107", a31107)
                .put("a31108", a31108)
                .put("a31109", a31109)
                .put("a31110", a31110)
                .put("a31111", a31111)
                .put("a31112", a31112)
                .put("a31113", a31113)
                .put("a31114", a31114)
                .put("a31115", a31115)
                .put("a31116", a31116)
                .put("a31117", a31117)
                .put("a31118", a31118)
                .put("a31119", a31119)
                .put("a31201", a31201)
                .put("a31202", a31202)
                .put("a31203", a31203)
                .put("a31204", a31204)
                .put("a31205", a31205)
                .put("a31206", a31206)
                .put("a31207", a31207)
                .put("a31208", a31208)
                .put("a313", a313)
                .put("a31396x", a31396x)
                .put("a314", a314)
                .put("a315", a315)
                .put("a31596x", a31596x)
                .put("a316", a316)
                .put("a31696x", a31696x)
                .put("a317", a317)
                .put("a31796x", a31796x)
                .put("a318", a318)
                .put("a319", a319)
                .put("a320", a320)
                .put("a32001x", a32001x)
                .put("a32002x", a32002x)
                .put("a32003x", a32003x)
                .put("a32096x", a32096x)
                .put("a321", a321)
                .put("a322", a322)
                .put("a32201x", a32201x)
                .put("a32202x", a32202x)
                .put("a32203x", a32203x)
                .put("a32204x", a32204x)
                .put("a32205x", a32205x)
                .put("a32206x", a32206x)
                .put("a32207x", a32207x);
        return json.toString();
    }

    public String sA4toString() throws JSONException {
        Log.d(TAG, "sA4toString: ");
        JSONObject json = new JSONObject();
        json.put("a401", a401)
                .put("a402", a402)
                .put("a403", a403)
                .put("a40301", a40301)
                .put("a40302", a40302)
                .put("a40303", a40303)
                .put("a40304", a40304)
                .put("a40305", a40305)
                .put("a404", a404)
                .put("a405", a405)
                .put("a40501", a40501)
                .put("a40502", a40502)
                .put("a40503", a40503)
                .put("a40504", a40504)
                .put("a40505", a40505)
                .put("a406", a406)
                .put("a40601", a40601)
                .put("a40602", a40602)
                .put("a40603", a40603)
                .put("a40604", a40604)
                .put("a40605", a40605)
                .put("a40606", a40606)
                .put("a40607", a40607)
                .put("a40608", a40608)
                .put("a40609", a40609)
                .put("a40696", a40696)
                .put("a40696x", a40696x);
        return json.toString();
    }

    public String sA5toString() throws JSONException {
        Log.d(TAG, "sA5toString: ");
        JSONObject json = new JSONObject();
        json.put("a501", a501)
                .put("a502", a502)
                .put("a503", a503)
                .put("a504", a504)
                .put("a505", a505)
                .put("a506", a506)
                .put("a507", a507)
                .put("a508", a508);
        return json.toString();
    }


}
