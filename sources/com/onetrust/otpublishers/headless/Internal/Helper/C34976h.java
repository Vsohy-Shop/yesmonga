package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.google.android.gms.common.C40928r;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;
import com.onetrust.otpublishers.headless.Public.Response.OTResponseType;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.h */
public class C34976h {
    /* renamed from: a */
    public static OTResponse m143220a(@C0359n0 String str, String str2, String str3) {
        if (C35020d.m143605J(str)) {
            return new OTResponse(OTResponseType.OT_ERROR, 2, str3.replace("SDK_VERSION", str2), "");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("culture") && jSONObject.has("domain")) {
                if (jSONObject.has(C40928r.f104100a)) {
                    return null;
                }
            }
            OTLogger.m143457l("OneTrust", "SDK Initialization failed, Cannot parse the data received from Server because it is corrupted");
            return new OTResponse(OTResponseType.OT_ERROR, 7, "SDK Initialization failed, Cannot parse the data received from Server because it is corrupted", "");
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "SDK Initialization failed, Cannot parse the data received from Server because it is corrupted" + e.toString());
            return new OTResponse(OTResponseType.OT_ERROR, 7, "SDK Initialization failed, Cannot parse the data received from Server because it is corrupted", "");
        }
    }

    @C0376v0(api = 19)
    /* renamed from: e */
    public static void m143221e(@C0359n0 String str, JSONArray jSONArray, int i) {
        Locale locale = Locale.ENGLISH;
        if (str.toLowerCase(locale).equals(jSONArray.getJSONObject(i).getString("Id").toLowerCase(locale))) {
            jSONArray.remove(i);
        }
    }

    @C0376v0(api = 19)
    /* renamed from: g */
    public static void m143222g(@C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray l = m143225l(jSONObject, jSONArray);
            JSONArray l2 = m143225l(jSONObject2, jSONArray2);
            for (int i = 0; i < l.length(); i++) {
                m143221e(str, l, i);
                m143221e(str, l2, i);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "exception while removing no toggle purposes from saved Consent data" + e.toString());
        }
    }

    @C0376v0(api = 19)
    /* renamed from: i */
    public static void m143223i(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str, @C0359n0 JSONArray jSONArray) {
        if (jSONObject2.has(str)) {
            String string = jSONObject2.getString(str);
            jSONObject2.remove(str);
            if (jSONObject.has(string)) {
                jSONObject.remove(string);
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                if (string.equals(jSONArray.getString(i))) {
                    jSONArray.remove(i);
                }
            }
        }
    }

    /* renamed from: k */
    public static boolean m143224k(@C0359n0 JSONObject jSONObject, boolean z) {
        if (!jSONObject.optBoolean("IsIabPurpose") || !jSONObject.optString(PersistedInstallation.f80251i, "").contains("always")) {
            return !z ? jSONObject.optBoolean("HasConsentOptOut") : jSONObject.optBoolean("HasConsentOptOut") || jSONObject.optBoolean("HasLegIntOptOut");
        }
        return true;
    }

    /* renamed from: l */
    public static JSONArray m143225l(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray) {
        return jSONObject.has("consentPayload") ? jSONObject.getJSONObject("consentPayload").getJSONArray("purposes") : jSONArray;
    }

    @C0359n0
    /* renamed from: b */
    public String mo103745b(@C0359n0 C35014d dVar) {
        String string = dVar.mo103965b().getString("OT_TEMPLATE_TYPE", "");
        return string == null ? "" : string;
    }

    @C0376v0(api = 19)
    /* renamed from: c */
    public void mo103746c(SharedPreferences sharedPreferences, boolean z, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, boolean z2) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        JSONArray jSONArray3 = jSONArray;
        if (!z || !z2 || C35017a.m143592b(jSONArray)) {
            OTLogger.m143447b("OneTrust", "No changes in purpose toggle configurations found");
            return;
        }
        String string = sharedPreferences2.getString("OTT_CONSENT_STATUS", C28819e.f70617a);
        String string2 = sharedPreferences2.getString("OTT_INTERNAL_PURPOSE_GROUP_MAP", C28819e.f70617a);
        String string3 = sharedPreferences2.getString("OTT_CONSENTABLE_PARENT_GROUPS", C28819e.f70617a);
        String string4 = sharedPreferences2.getString("OTT_CONSENT_LOG_DATA", C28819e.f70617a);
        String string5 = sharedPreferences2.getString("OT_CL_DEFAULT_PAYLOAD", C28819e.f70617a);
        try {
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = new JSONObject(string2);
            JSONArray jSONArray4 = new JSONArray(string3);
            JSONObject jSONObject3 = new JSONObject(string4);
            JSONObject jSONObject4 = new JSONObject(string5);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string6 = jSONArray3.getString(i2);
                m143223i(jSONObject, jSONObject2, string6, jSONArray4);
                m143222g(string6, jSONObject3, jSONObject4);
            }
            while (i < jSONArray2.length()) {
                String string7 = jSONArray3.getString(i);
                m143223i(jSONObject, jSONObject2, string7, jSONArray4);
                try {
                    mo103748f(string7, jSONObject3);
                    i++;
                } catch (JSONException e) {
                    e = e;
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("OTT_CONSENT_STATUS", jSONObject.toString());
            edit.putString("OTT_INTERNAL_PURPOSE_GROUP_MAP", jSONObject2.toString());
            edit.putString("OTT_PARENT_GROUPS", jSONArray4.toString());
            edit.putString("OTT_CONSENT_LOG_DATA", jSONObject3.toString());
            edit.putString("OT_CL_DEFAULT_PAYLOAD", jSONObject4.toString());
            edit.apply();
        } catch (JSONException e2) {
            e = e2;
            OTLogger.m143457l("OneTrust", "exception while removing no toggle purposes from saved Data " + e.toString());
        }
    }

    /* renamed from: d */
    public void mo103747d(@C0359n0 String str, @C0359n0 C35014d dVar) {
        dVar.mo103965b().edit().putString("OT_TEMPLATE_TYPE", str).apply();
    }

    @C0344h1
    /* renamed from: f */
    public void mo103748f(@C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        try {
            JSONArray l = m143225l(jSONObject, new JSONArray());
            for (int i = 0; i < l.length(); i++) {
                if (str.equalsIgnoreCase(l.getJSONObject(i).getString("Id"))) {
                    l.getJSONObject(i).put("TransactionType", "OPT_OUT");
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "exception while changing no  LI toggle purposes from saved Consent data" + e.toString());
        }
    }

    /* renamed from: h */
    public void mo103749h(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray) {
        if (!jSONObject.getBoolean("HasConsentOptOut")) {
            jSONArray.put(jSONObject.getString("PurposeId"));
        }
    }

    /* renamed from: j */
    public boolean mo103750j(@C0359n0 JSONObject jSONObject) {
        return jSONObject.optString("IabType").equals("IAB2");
    }

    /* renamed from: m */
    public boolean mo103751m(@C0359n0 C35014d dVar) {
        return "IAB2".equalsIgnoreCase(mo103745b(dVar));
    }
}
