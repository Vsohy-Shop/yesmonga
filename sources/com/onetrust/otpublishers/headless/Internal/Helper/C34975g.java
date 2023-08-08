package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.firebase.installations.local.C33093b;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABCCPAKeys;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.g */
public class C34975g {

    /* renamed from: a */
    public Context f85087a;

    public C34975g(@C0359n0 Context context) {
        this.f85087a = context;
    }

    /* renamed from: g */
    public static void m143211g(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 Object obj, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject2.has("SubGroups")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("SubGroups");
            m143212i(jSONObject, str, obj, jSONObject2);
            for (int i = 0; i < jSONArray.length(); i++) {
                m143212i(jSONObject, str, obj, jSONArray.getJSONObject(i));
            }
            return;
        }
        m143212i(jSONObject, str, obj, jSONObject2);
    }

    /* renamed from: i */
    public static void m143212i(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 Object obj, @C0359n0 JSONObject jSONObject2) {
        if (str.equals(jSONObject2.getString("CustomGroupId")) && "COOKIE".equals(jSONObject2.getString("Type")) && !jSONObject2.getBoolean("IsIabPurpose")) {
            jSONObject.put(str, obj);
        }
    }

    @C0359n0
    /* renamed from: a */
    public String mo103738a() {
        boolean z;
        if (!"0".equals(new C35015e(this.f85087a).mo103979N())) {
            z = true;
        } else {
            OTLogger.m143447b("WebviewConsentHelper", "WebviewConsent : user is not interacted, returning default ccpa, groups values. ");
            z = false;
        }
        return mo103742e(z);
    }

    @C0359n0
    /* renamed from: b */
    public String mo103739b(@C0359n0 Long l) {
        return new C35020d().mo104027e(l.longValue(), false, DesugarTimeZone.getTimeZone(C28932h.f70913W));
    }

    @C0359n0
    /* renamed from: c */
    public String mo103740c(@C0359n0 String str, @C0359n0 JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject(str);
        OTLogger.m143447b("WebviewConsentHelper", "OTSDK consented group and status = " + str);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                mo103743f(jSONArray, jSONObject2, next, jSONObject.get(next));
            } catch (JSONException e) {
                OTLogger.m143457l("WebviewConsentHelper", "Error on parsing. Error msg = " + e.getMessage());
            }
        }
        return jSONObject2.toString();
    }

    @C0344h1
    @C0359n0
    /* renamed from: d */
    public String mo103741d(@C0359n0 JSONObject jSONObject) {
        return "var OTExternalConsent = " + jSONObject.toString();
    }

    @C0359n0
    /* renamed from: e */
    public final String mo103742e(boolean z) {
        String d = mo103741d(mo103744h(z));
        OTLogger.m143447b("WebviewConsentHelper", "ConsentForWebView :" + d);
        return d;
    }

    /* renamed from: f */
    public final void mo103743f(@C0359n0 JSONArray jSONArray, JSONObject jSONObject, @C0359n0 String str, @C0359n0 Object obj) {
        for (int i = 0; i < jSONArray.length(); i++) {
            m143211g(jSONObject, str, obj, jSONArray.getJSONObject(i));
        }
    }

    @C0344h1
    @C0359n0
    /* renamed from: h */
    public JSONObject mo103744h(boolean z) {
        C35020d dVar = new C35020d();
        JSONObject jSONObject = new JSONObject();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f85087a);
        try {
            String y = dVar.mo104032y(this.f85087a);
            JSONObject preferenceCenterData = new OTPublishersHeadlessSDK(this.f85087a).getPreferenceCenterData();
            if (preferenceCenterData == null) {
                OTLogger.m143461p("WebviewConsentHelper", "Consent for WebView: No app data found, returning empty JSON.");
                return jSONObject;
            }
            jSONObject.put(CancelSchedulesAction.f23547k, mo103740c(y, preferenceCenterData.getJSONArray("Groups")).replace(C33093b.f80281i, "").replace("}", "").replace("\"", ""));
            jSONObject.put("USPrivacy", defaultSharedPreferences.getString(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING, ""));
            if (z) {
                jSONObject.put("consentedDate", mo103739b(Long.valueOf(new C35015e(this.f85087a).mo103979N())));
                jSONObject.put("addtlString", defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_ADD_TL_CONSENT, ""));
                jSONObject.put("tcString", dVar.mo104017D(this.f85087a));
            } else {
                jSONObject.put("consentedDate", "");
                jSONObject.put("addtlString", "");
                jSONObject.put("tcString", "");
            }
            return jSONObject;
        } catch (JSONException e) {
            OTLogger.m143457l("WebviewConsentHelper", "Error on constructing webviewConsentObject. Error msg = " + e.getMessage());
        }
    }
}
