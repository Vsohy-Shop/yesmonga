package com.onetrust.otpublishers.headless.Internal.Models;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Models.d */
public class C35000d {

    /* renamed from: a */
    public Context f85138a;

    /* renamed from: b */
    public SharedPreferences f85139b;

    public C35000d(@C0359n0 Context context) {
        this.f85138a = context;
        this.f85139b = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
    }

    /* renamed from: g */
    public static boolean m143478g(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("ShowAlertNotice")) {
            if (jSONObject.getBoolean("ShowAlertNotice")) {
                OTLogger.m143458m("ShowBanner", "Geolocation Status: Show Banner is enabled for current geolocation rule.");
                return true;
            }
            OTLogger.m143458m("ShowBanner", "Geolocation Status: Show Banner is disabled for current geolocation rule.");
        }
        return false;
    }

    /* renamed from: a */
    public long mo103930a() {
        String string = this.f85139b.getString("OTT_LAST_GIVEN_CONSENT", "0");
        if (C35020d.m143605J(string)) {
            return 0;
        }
        return Long.parseLong(string);
    }

    @C0359n0
    /* renamed from: b */
    public String mo103931b(@C0363p0 String str) {
        if (str != null && !C35020d.m143605J(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("LastReconsentDate")) {
                    String obj = !jSONObject.isNull("LastReconsentDate") ? jSONObject.get("LastReconsentDate").toString() : "";
                    if (!C35020d.m143605J(obj) || !jSONObject.isNull("LastReconsentDate")) {
                        return obj;
                    }
                }
            } catch (JSONException e) {
                OTLogger.m143458m("ShowBanner", "Error on get re-consent date, msg = " + e.getMessage());
            }
        }
        return "0";
    }

    /* renamed from: c */
    public boolean mo103932c(@C0359n0 JSONObject jSONObject) {
        String str;
        if (!jSONObject.has("LastReconsentDate")) {
            return false;
        }
        String obj = !jSONObject.isNull("LastReconsentDate") ? jSONObject.get("LastReconsentDate").toString() : null;
        if (!C35020d.m143605J(obj) && !jSONObject.isNull("LastReconsentDate")) {
            long parseLong = Long.parseLong(obj);
            long a = mo103930a();
            long d = mo103933d();
            if (a != 0 && parseLong > a) {
                str = "Reconsent Status: Show Banner is enabled for current geolocation rule and user consent is older than lastReconsentDateFromServer";
            } else if (d != -1 && parseLong > d) {
                str = "Reconsent Status: Show Banner is enabled for current geolocation rule and previous lastReconsentDateFromServer is older than lastReconsentDateFromServer";
            }
            OTLogger.m143458m("ShowBanner", str);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public long mo103933d() {
        String string = this.f85139b.getString("OTT_LAST_RE_CONSENT_DATE", String.valueOf(-1));
        if (!C35020d.m143605J(string)) {
            return Long.parseLong(string);
        }
        OTLogger.m143458m("ShowBanner", "Last re-consent date not initialized, it will be set once OT SDK initialized.");
        return -1;
    }

    /* renamed from: e */
    public void mo103934e(@C0359n0 String str) {
        this.f85139b.edit().putString("OTT_LAST_RE_CONSENT_DATE", str).apply();
    }

    /* renamed from: f */
    public void mo103935f(@C0359n0 JSONObject jSONObject) {
        if (mo103933d() == -1) {
            String obj = !jSONObject.isNull("LastReconsentDate") ? jSONObject.get("LastReconsentDate").toString() : "";
            OTLogger.m143458m("ShowBanner", "Initializing the last re-consent date to - " + obj);
            if (C35020d.m143605J(obj) || jSONObject.isNull("LastReconsentDate")) {
                mo103934e("0");
            } else {
                mo103934e(obj);
            }
        }
    }

    /* renamed from: h */
    public boolean mo103936h(@C0363p0 JSONObject jSONObject) {
        String H = new C35015e(this.f85138a).mo103973H();
        if (H != null && !C35020d.m143605J(H)) {
            JSONObject jSONObject2 = new JSONObject(H);
            if (!m143478g(jSONObject2)) {
                return false;
            }
            if (mo103932c(jSONObject2)) {
                return true;
            }
            if (C35020d.m143626u(jSONObject, new C35015e(this.f85138a).mo103979N())) {
                new C34970d(this.f85138a).mo103699p(jSONObject2.getJSONArray("Groups"), false, new JSONObject());
                OTLogger.m143458m("ShowBanner", "Enabled auto re-consent because the last given consent has been expired.");
                return true;
            }
            long U = new C35015e(this.f85138a).mo103986U();
            C35020d dVar = new C35020d();
            if (C35020d.m143627v(dVar.mo104023S(this.f85138a), jSONObject, U)) {
                new C34970d(this.f85138a).mo103699p(jSONObject2.getJSONArray("Groups"), false, new JSONObject());
                OTLogger.m143458m("ShowBanner", "Enabled auto re-consent because the last given consent has been expired for IAB tcstring.");
                return true;
            }
            boolean d = new C35015e(this.f85138a).mo103993d();
            if (!d) {
                OTLogger.m143458m("ShowBanner", "Saved isServiceSpecific = " + d);
                new C34970d(this.f85138a).mo103699p(jSONObject2.getJSONArray("Groups"), false, new JSONObject());
                OTLogger.m143461p("ShowBanner", "Enabling Re-consent as last user consent was computed with isServiceSpecific value as FALSE, which is no longer valid");
                return true;
            }
            boolean t = C35020d.m143625t(new C35014d(this.f85138a, "OTT_DEFAULT_USER").mo103965b().getString("OTT_PROFILE_ALL_PURPOSES_UPDATED_AFTER_SYNC", C13758b.f33438c), false);
            OTLogger.m143458m("ShowBanner", "Saved allPurposesUpdatedAfterSync = " + t);
            if (t) {
                return false;
            }
            if (mo103930a() == 0) {
                return true;
            }
            if (dVar.mo104023S(this.f85138a) && C35020d.m143605J(dVar.mo104017D(this.f85138a))) {
                OTLogger.m143458m("ShowBanner", "IAB region: Showing Banner as user has not given consent in IAB region previously");
                return true;
            }
        }
        return false;
    }
}
