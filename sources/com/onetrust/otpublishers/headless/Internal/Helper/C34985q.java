package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.DataModel.OTGeolocationModel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.q */
public class C34985q {

    /* renamed from: a */
    public C35014d f85108a;

    public C34985q(@C0359n0 Context context) {
        this.f85108a = new C35014d(context, "OTT_DEFAULT_USER");
    }

    @C0363p0
    /* renamed from: a */
    public OTGeolocationModel mo103843a(int i) {
        OTGeolocationModel e = mo103847e(i);
        return e == null ? mo103847e(1) : e;
    }

    @C0363p0
    /* renamed from: b */
    public OTGeolocationModel mo103844b(int i, @C0359n0 String str, @C0359n0 String str2) {
        SharedPreferences.Editor edit;
        String jSONObject;
        String str3;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("country", str);
        jSONObject2.put("state", str2);
        if (i == 1) {
            edit = this.f85108a.mo103965b().edit();
            jSONObject = jSONObject2.toString();
            str3 = "OTT_USER_CONSENT_LOCATION";
        } else if (i == 2) {
            edit = this.f85108a.mo103965b().edit();
            jSONObject = jSONObject2.toString();
            str3 = "OT_DATA_DOWNLOADED_GEO_LOCATION";
        } else {
            if (i == 3) {
                edit = this.f85108a.mo103965b().edit();
                jSONObject = jSONObject2.toString();
                str3 = "OT_CONSENTED_LOCATION";
            }
            return mo103845c(jSONObject2.toString());
        }
        edit.putString(str3, jSONObject).apply();
        return mo103845c(jSONObject2.toString());
    }

    @C0363p0
    /* renamed from: c */
    public OTGeolocationModel mo103845c(@C0363p0 String str) {
        if (C35020d.m143605J(str)) {
            return null;
        }
        OTGeolocationModel oTGeolocationModel = new OTGeolocationModel();
        try {
            JSONObject jSONObject = new JSONObject(str);
            oTGeolocationModel.country = jSONObject.optString("country");
            oTGeolocationModel.state = jSONObject.optString("state");
        } catch (JSONException e) {
            OTLogger.m143457l("GLDataHandler", "error in formatting ott data with err = " + e.getMessage());
        }
        return oTGeolocationModel;
    }

    /* renamed from: d */
    public boolean mo103846d() {
        OTGeolocationModel e = mo103847e(2);
        if (e == null) {
            return false;
        }
        mo103844b(3, e.country, e.state);
        OTLogger.m143458m("GLDataHandler", "Consent given location saved as country:" + e.country + " state:" + e.state);
        return true;
    }

    @C0363p0
    /* renamed from: e */
    public OTGeolocationModel mo103847e(int i) {
        SharedPreferences b;
        String str;
        String str2 = "";
        if (i == 1) {
            b = this.f85108a.mo103965b();
            str = "OTT_USER_CONSENT_LOCATION";
        } else if (i == 2) {
            b = this.f85108a.mo103965b();
            str = "OT_DATA_DOWNLOADED_GEO_LOCATION";
        } else {
            if (i == 3) {
                b = this.f85108a.mo103965b();
                str = "OT_CONSENTED_LOCATION";
            }
            return mo103845c(str2);
        }
        str2 = b.getString(str, str2);
        return mo103845c(str2);
    }
}
