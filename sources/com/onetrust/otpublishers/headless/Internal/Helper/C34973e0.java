package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.e0 */
public class C34973e0 {
    /* renamed from: a */
    public static int m143183a(@C0359n0 String str) {
        return ("ACTIVE".equalsIgnoreCase(str) || "OPT_IN".equalsIgnoreCase(str)) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m143184b(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        if (jSONObject.has(str)) {
            return m143183a(jSONObject.optJSONObject(str).optString("userConsentStatus"));
        }
        return -1;
    }

    /* renamed from: c */
    public static void m143185c(C35014d dVar, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3) {
        SharedPreferences.Editor edit = dVar.mo103965b().edit();
        edit.putString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", String.valueOf(jSONObject));
        edit.putString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", String.valueOf(jSONObject2));
        edit.putString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", String.valueOf(jSONObject3));
        edit.apply();
    }

    /* renamed from: d */
    public static boolean m143186d(boolean z, @C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, String str3, String str4) {
        if (str3.equalsIgnoreCase(str4)) {
            if (!z) {
                str = str2;
            }
            jSONObject.put("userConsentStatus", str);
            return true;
        }
        OTLogger.m143461p("UCPurposesDataHandler", "Invalid ID passed to update UCP Consent values");
        return false;
    }

    /* renamed from: e */
    public static boolean m143187e(boolean z, @C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, JSONObject jSONObject2, String str3) {
        if (jSONObject2.has(str3)) {
            if (!z) {
                str = str2;
            }
            jSONObject.put("userConsentStatus", str);
            return true;
        }
        OTLogger.m143461p("UCPurposesDataHandler", "Invalid ID passed to update UCP Consent values");
        return false;
    }
}
