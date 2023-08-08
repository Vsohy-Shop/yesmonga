package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.l */
public class C34980l {

    /* renamed from: a */
    public final Context f85092a;

    /* renamed from: b */
    public final SharedPreferences f85093b;

    public C34980l(@C0359n0 Context context) {
        this.f85092a = context;
        this.f85093b = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
    }

    /* renamed from: a */
    public static String m143263a(int i) {
        return i <= 0 ? "OPT_OUT" : "CONFIRMED";
    }

    /* renamed from: b */
    public void mo103775b(@C0359n0 JSONObject jSONObject) {
        try {
            new C35006f(this.f85092a).mo103950r("https://cookies2-ds.dev.otdev.org/request/v1/", jSONObject.getString("consentApi"), jSONObject.getJSONObject("consentPayload").toString(), 3);
            OTLogger.m143458m("GoogleAdInfo", "GoogleAd consent obj" + jSONObject.getJSONObject("consentPayload").toString());
        } catch (JSONException e) {
            OTLogger.m143457l("GoogleAdInfo", "Error while logging consent for GoogleAd." + e.getMessage());
        }
    }

    @C0344h1
    /* renamed from: c */
    public void mo103776c(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, int i, String str) {
        if (jSONObject.has(str)) {
            jSONArray.getJSONObject(i).put("TransactionType", m143263a(jSONObject.getInt(str)));
        } else if (!new C35015e(this.f85092a).mo104008t(str)) {
            jSONArray.getJSONObject(i).put("TransactionType", m143263a(new C35015e(this.f85092a).mo103996g(str)));
        }
    }

    @C0344h1
    /* renamed from: d */
    public void mo103777d(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONObject2.optString(jSONArray.getJSONObject(i).getString("Id"));
            if (!C35020d.m143605J(optString)) {
                mo103776c(jSONObject, jSONArray, i, optString);
            } else {
                OTLogger.m143447b("ConsentLogging", "always active purpose not updated");
            }
        }
    }

    /* renamed from: e */
    public void mo103778e(@C0359n0 JSONObject jSONObject, boolean z) {
        String string = this.f85093b.getString("OTT_CONSENT_LOG_DATA", "");
        String string2 = this.f85093b.getString("OT_CL_DEFAULT_PAYLOAD", "");
        if (C35020d.m143605J(string)) {
            OTLogger.m143461p("ConsentLogging", "consentLogging not initialized.");
        } else if (!z || !new OTPublishersHeadlessSDK(this.f85092a).shouldShowBanner()) {
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                if (mo103779f(jSONObject2, jSONObject, z)) {
                    new C34981m(this.f85092a).mo103786f(jSONObject2);
                    String string3 = jSONObject2.getString("consentApi");
                    String jSONObject3 = jSONObject2.getJSONObject("consentPayload").toString();
                    OTLogger.m143458m("ConsentLogging", "payloadObj" + jSONObject3);
                    OTLogger.m143458m("ConsentLogging", "consent obj" + jSONObject2);
                    new C35006f(this.f85092a).mo103950r("https://cookies2-ds.dev.otdev.org/request/v1/", string3, jSONObject3, 1);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("ConsentLogging", "error in reading old consent data. error - " + e.getMessage());
            }
        } else {
            try {
                if (!C35020d.m143605J(string2)) {
                    JSONObject jSONObject4 = new JSONObject(string2);
                    OTLogger.m143458m("ConsentLogging", "payloadObj default" + jSONObject4.getJSONObject("consentPayload"));
                    OTLogger.m143458m("ConsentLogging", "consent obj default" + jSONObject4);
                    new C35006f(this.f85092a).mo103950r("https://cookies2-ds.dev.otdev.org/request/v1/", jSONObject4.getString("consentApi"), jSONObject4.getJSONObject("consentPayload").toString(), 1);
                    return;
                }
                OTLogger.m143461p("ConsentLogging", "consentLogging not initialized.");
            } catch (JSONException e2) {
                OTLogger.m143461p("ConsentLogging", "Error while logging consent for default values." + e2.getMessage());
            }
        }
    }

    /* renamed from: f */
    public final boolean mo103779f(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, boolean z) {
        String str;
        String optString = jSONObject.optString("consentPayload");
        if (C35020d.m143605J(optString)) {
            str = "Created consent logging template contains no payload";
        } else {
            JSONObject jSONObject3 = new JSONObject(optString);
            String optString2 = jSONObject3.optString("purposes");
            if (C35020d.m143605J(optString2)) {
                str = "Created consent logging template contains no purpose";
            } else {
                JSONObject jSONObject4 = new JSONObject(this.f85093b.getString("OTT_INTERNAL_PURPOSE_GROUP_MAP", ""));
                JSONArray jSONArray = new JSONArray(optString2);
                if (!z) {
                    mo103777d(jSONObject2, jSONObject4, jSONArray);
                }
                jSONObject3.put("purposes", jSONArray);
                jSONObject.put("consentPayload", jSONObject3);
                return true;
            }
        }
        OTLogger.m143458m("ConsentLogging", str);
        return false;
    }

    /* renamed from: g */
    public void mo103780g(@C0359n0 JSONObject jSONObject) {
        try {
            new C35006f(this.f85092a).mo103950r("https://cookies2-ds.dev.otdev.org/request/v1/", jSONObject.getString("consentApi"), jSONObject.getJSONObject("consentPayload").toString(), 2);
            OTLogger.m143458m("ConsentLogging", "ucp consent obj" + jSONObject.getJSONObject("consentPayload").toString());
        } catch (JSONException e) {
            OTLogger.m143461p("ConsentLogging", "Error while logging consent for UCP." + e.getMessage());
        }
    }
}
