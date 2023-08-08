package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Preferences.e */
public class C35015e {

    /* renamed from: a */
    public final C35014d f85171a;

    /* renamed from: b */
    public C35012b f85172b;

    public C35015e(@C0359n0 Context context) {
        C35014d dVar = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85171a = dVar;
        this.f85172b = new C35012b(dVar);
    }

    /* renamed from: j */
    public static void m143541j(@C0359n0 Map<String, String> map, @C0359n0 Map<String, List<String>> map2, @C0359n0 String str) {
        String str2 = map.get(str);
        if (str2 != null && !C35020d.m143605J(str2)) {
            if (map2.get(str2) == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                map2.put(str2, arrayList);
                return;
            }
            List list = map2.get(str2);
            Objects.requireNonNull(list);
            list.add(str);
        }
    }

    /* renamed from: A */
    public void mo103966A(@C0359n0 String str) {
        Date g = C35020d.m143616g(str, ConfigFetchHttpClient.f81531o);
        if (g != null) {
            this.f85171a.mo103965b().edit().putLong("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS", g.getTime()).apply();
            OTLogger.m143460o("TCStringDate", "Updating tc string updated date from profile sync value,Date = " + str + " , milliseconds = " + g.getTime());
        }
    }

    @C0359n0
    /* renamed from: B */
    public String mo103967B() {
        String string = this.f85171a.mo103965b().getString("OTT_DATA_SUBJECT_IDENTIFIER", "");
        return string == null ? "" : string;
    }

    /* renamed from: C */
    public void mo103968C(@C0359n0 String str) {
        this.f85171a.mo103965b().edit().putString("OTT_DATA_SUBJECT_IDENTIFIER", str).apply();
    }

    /* renamed from: D */
    public JSONObject mo103969D() {
        String string = this.f85171a.mo103965b().getString("OTT_DOMAIN_DATA", "");
        if (!C35020d.m143605J(string)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while returning domain data, err: " + e.getMessage());
            }
        }
        return new JSONObject();
    }

    /* renamed from: E */
    public void mo103970E(@C0359n0 String str) {
        this.f85171a.mo103965b().edit().putString("OT_IAB_PURPOSES_TRANSLATED", str).apply();
    }

    @C0363p0
    /* renamed from: F */
    public JSONObject mo103971F() {
        try {
            String string = this.f85171a.mo103965b().getString("OT_GOOGLE_VENDOR_DATA", (String) null);
            if (!C35020d.m143605J(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while getting culture data json on getGoogleVendorsData, err: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: G */
    public void mo103972G(@C0359n0 String str) {
        OTLogger.m143458m("OTSPUtils", "Updating consent given time, timeStamp = " + str);
        this.f85171a.mo103965b().edit().putString("OTT_LAST_GIVEN_CONSENT", str).apply();
    }

    @C0359n0
    /* renamed from: H */
    public String mo103973H() {
        try {
            JSONObject z = mo104014z();
            return z.length() > 0 ? z.toString() : "";
        } catch (Exception e) {
            OTLogger.m143447b("OneTrust", "empty data as SDK not yet initialized " + e.getMessage());
            return "";
        }
    }

    @C0363p0
    /* renamed from: I */
    public JSONObject mo103974I() {
        String string = this.f85171a.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
        if (!C35020d.m143605J(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    @C0359n0
    /* renamed from: J */
    public String mo103975J() {
        return this.f85171a.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
    }

    @C0359n0
    /* renamed from: K */
    public String mo103976K() {
        return this.f85171a.mo103965b().getString("OT_IAB_PURPOSES_TRANSLATED", "");
    }

    /* renamed from: L */
    public int mo103977L() {
        return this.f85171a.mo103965b().getInt("OTT_DATA_SUBJECT_IDENTIFIER_TYPE", 1);
    }

    @C0359n0
    /* renamed from: M */
    public String mo103978M() {
        return this.f85171a.mo103965b().getString("OT_IS_LIMIT_AD_TRACKING_ENABLED", "");
    }

    @C0359n0
    /* renamed from: N */
    public String mo103979N() {
        return this.f85171a.mo103965b().getString("OTT_LAST_GIVEN_CONSENT", "0");
    }

    /* renamed from: O */
    public long mo103980O() {
        String string = this.f85171a.mo103965b().getString("OTT_LAST_GIVEN_CONSENT", "0");
        if (C35020d.m143605J(string)) {
            return 0;
        }
        return Long.parseLong(string);
    }

    /* renamed from: P */
    public int mo103981P() {
        return this.f85171a.mo103965b().getInt("OT_MIGRATION_STATUS", 5);
    }

    @C0359n0
    /* renamed from: Q */
    public JSONObject mo103982Q() {
        try {
            String string = this.f85171a.mo103965b().getString("OT_MOBILE_DATA", "");
            if (!C35020d.m143605J(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while getting mobile data json, err: " + e.getMessage());
        }
        return new JSONObject();
    }

    @C0359n0
    /* renamed from: R */
    public JSONArray mo103983R() {
        JSONArray jSONArray = new JSONArray();
        String string = this.f85171a.mo103965b().getString("OTT_PC_DATA", (String) null);
        if (C35020d.m143605J(string)) {
            return jSONArray;
        }
        try {
            return new JSONObject(string).getJSONArray("Groups");
        } catch (JSONException e) {
            OTLogger.m143457l("OTSPUtils", "Error on getting pc group array, message = " + e.getMessage());
            return jSONArray;
        }
    }

    @C0359n0
    /* renamed from: S */
    public JSONObject mo103984S() {
        try {
            String string = this.f85171a.mo103965b().getString("OT_PROFILE_DATA", "");
            if (!C35020d.m143605J(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while getting profile data json, err: " + e.getMessage());
        }
        return new JSONObject();
    }

    @C0359n0
    /* renamed from: T */
    public String mo103985T() {
        String string = this.f85171a.mo103965b().getString("OT_SYNC_GROUP_ID", "");
        return C35020d.m143605J(string) ? "" : string;
    }

    /* renamed from: U */
    public long mo103986U() {
        if (this.f85171a.mo103965b().contains("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS")) {
            return this.f85171a.mo103965b().getLong("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS", -1);
        }
        return -1;
    }

    @C0359n0
    /* renamed from: V */
    public String mo103987V() {
        String string = this.f85171a.mo103965b().getString("OT_TEMPLATE_TYPE", "");
        return string == null ? "" : string;
    }

    @C0359n0
    /* renamed from: W */
    public String mo103988W() {
        return this.f85171a.mo103965b().getString("DOMAIN_PARENT_ID_MAP", "");
    }

    @C0359n0
    /* renamed from: X */
    public String mo103989X() {
        return this.f85171a.mo103965b().getString("OTT_PARENT_CHILD_GROUPS", "");
    }

    /* renamed from: a */
    public int mo103990a() {
        OTLogger.m143458m("OneTrust", "ui type " + this.f85171a.mo103965b().getInt("OT_UI_MODE_TYPE", 102));
        return this.f85171a.mo103965b().getInt("OT_UI_MODE_TYPE", 102);
    }

    @C0363p0
    /* renamed from: b */
    public JSONObject mo103991b() {
        String string = this.f85171a.mo103965b().getString("OT_IAB_ACTIVE_VENDORLIST", (String) null);
        if (!C35020d.m143605J(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo103992c() {
        return this.f85171a.mo103965b().getBoolean("OT_GOOGLE_VENDORS_ENABLED_STATE", false);
    }

    /* renamed from: d */
    public boolean mo103993d() {
        return this.f85171a.mo103965b().getBoolean("isServiceSpecific", true);
    }

    /* renamed from: e */
    public boolean mo103994e() {
        return C35020d.m143625t(this.f85171a.mo103965b().getString("OTT_PROFILE_SYNC_PROFILE_STRING", (String) null), false);
    }

    @C0363p0
    /* renamed from: f */
    public JSONObject mo103995f() {
        String string = this.f85171a.mo103965b().getString("OTT_PC_DATA", (String) null);
        if (!C35020d.m143605J(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    /* renamed from: g */
    public int mo103996g(@C0359n0 String str) {
        String str2;
        JSONObject jSONObject;
        String string = this.f85171a.mo103965b().getString("OTT_CONSENT_STATUS", "");
        if (mo104008t(str)) {
            return 1;
        }
        if (!C35020d.m143605J(string)) {
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            try {
                jSONObject = new JSONObject(string.toLowerCase(locale));
                try {
                    if (jSONObject.has(lowerCase)) {
                        return jSONObject.getInt(lowerCase);
                    }
                    return -1;
                } catch (JSONException unused) {
                    str2 = "error in json parsing for customGroup Value = " + jSONObject;
                    OTLogger.m143458m("OTSPUtils", str2);
                    return -1;
                }
            } catch (JSONException unused2) {
                jSONObject = null;
                str2 = "error in json parsing for customGroup Value = " + jSONObject;
                OTLogger.m143458m("OTSPUtils", str2);
                return -1;
            }
        } else {
            str2 = "customGroup Value not set.";
            OTLogger.m143458m("OTSPUtils", str2);
            return -1;
        }
    }

    @C0363p0
    /* renamed from: h */
    public JSONObject mo103997h() {
        try {
            String string = this.f85171a.mo103965b().getString("OT_GOOGLE_ACTIVE_VENDOR_LIST", (String) null);
            if (!C35020d.m143605J(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while getting culture data json on getActiveGoogleVendors, err: " + e.getMessage());
        }
        return null;
    }

    /* renamed from: i */
    public void mo103998i(int i) {
        this.f85171a.mo103965b().edit().putInt("OTT_DATA_SUBJECT_IDENTIFIER_TYPE", i).apply();
    }

    /* renamed from: k */
    public void mo103999k(@C0359n0 JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                hashMap.put(jSONObject.getString("CustomGroupId"), jSONObject.has("Parent") ? jSONObject.getString("Parent") : "");
            } catch (JSONException e) {
                OTLogger.m143457l("OTSPUtils", "JSON exception = " + e.toString());
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            if (!C35020d.m143605J(str)) {
                m143541j(hashMap, hashMap2, str);
            }
        }
        JSONObject jSONObject2 = new JSONObject(hashMap2);
        JSONObject jSONObject3 = new JSONObject(hashMap);
        this.f85171a.mo103965b().edit().putString("DOMAIN_PARENT_ID_MAP", jSONObject3.toString()).apply();
        this.f85171a.mo103965b().edit().putString("OTT_PARENT_GROUPS", jSONObject2.toString()).apply();
        this.f85171a.mo103965b().edit().putString("OTT_PARENT_CHILD_GROUPS", jSONObject2.toString()).apply();
        OTLogger.m143458m("OTSPUtils", "parent groups : " + jSONObject2.toString());
        OTLogger.m143458m("OTSPUtils", "parent map = " + jSONObject3.toString());
    }

    /* renamed from: l */
    public void mo104000l(boolean z) {
        this.f85171a.mo103965b().edit().putBoolean("OT_PROFILE_SYNC_IAB_CONSENT_EXPIRED", z).apply();
    }

    /* renamed from: m */
    public boolean mo104001m(@C0359n0 String str, @C0363p0 String str2) {
        String str3;
        JSONObject jSONObject;
        if (str2 == null || C35020d.m143605J(str2)) {
            str3 = "customGroup Value not set.";
        } else {
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            try {
                jSONObject = new JSONObject(str2.toLowerCase(locale));
                try {
                    return jSONObject.has(lowerCase);
                } catch (JSONException unused) {
                    str3 = "error in json parsing for customGroup Value = " + jSONObject;
                    OTLogger.m143458m("OTSPUtils", str3);
                    return false;
                }
            } catch (JSONException unused2) {
                jSONObject = null;
                str3 = "error in json parsing for customGroup Value = " + jSONObject;
                OTLogger.m143458m("OTSPUtils", str3);
                return false;
            }
        }
        OTLogger.m143458m("OTSPUtils", str3);
        return false;
    }

    @C0359n0
    /* renamed from: n */
    public String mo104002n() {
        return this.f85171a.mo103965b().getString("OTT_DOMAIN", "");
    }

    /* renamed from: o */
    public void mo104003o(int i) {
        this.f85171a.mo103965b().edit().putInt("OT_MIGRATION_STATUS", i).apply();
    }

    /* renamed from: p */
    public void mo104004p(boolean z) {
        this.f85171a.mo103965b().edit().putBoolean("OT_CONSENT_LOG_ENABLED", z).apply();
    }

    /* renamed from: q */
    public boolean mo104005q(@C0359n0 String str) {
        return mo104001m(str, this.f85171a.mo103965b().getString("OTT_CONSENT_STATUS", ""));
    }

    @C0359n0
    /* renamed from: r */
    public JSONObject mo104006r() {
        String string = this.f85171a.mo103965b().getString("OTT_CULTURE_COMMON_DATA", "");
        if (!C35020d.m143605J(string)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while returning common data, err: " + e.getMessage());
            }
        }
        return new JSONObject();
    }

    /* renamed from: s */
    public void mo104007s(int i) {
        this.f85171a.mo103965b().edit().putInt("OT_UI_MODE_TYPE", i).apply();
    }

    /* renamed from: t */
    public boolean mo104008t(@C0359n0 String str) {
        String string = this.f85171a.mo103965b().getString("OTT_ALWAYS_ACTIVE_GROUPS", "");
        if (C35020d.m143605J(string)) {
            return false;
        }
        try {
            Locale locale = Locale.ENGLISH;
            return new JSONObject(string.toLowerCase(locale)).has(str.toLowerCase(locale));
        } catch (Exception e) {
            OTLogger.m143457l("OTSPUtils", "Error in getting always active groups " + e.getMessage());
            return false;
        }
    }

    /* renamed from: u */
    public boolean mo104009u(boolean z) {
        StringBuilder sb;
        String str;
        String M = mo103978M();
        if (C35020d.m143605J(M)) {
            mo104010v(C35019c.m143596a(z));
            sb = new StringBuilder();
            str = "Saving Google Ad isLimitAdTrackingEnabled, value = ";
        } else if (C35019c.m143597b(M) != z) {
            mo104010v(C35019c.m143596a(z));
            sb = new StringBuilder();
            str = "Updating Google Ad isLimitAdTrackingEnabled, value = ";
        } else {
            OTLogger.m143458m("GoogleAdInfo", "Google Ad isLimitAdTrackingEnabled status not changed.");
            return false;
        }
        sb.append(str);
        sb.append(z);
        OTLogger.m143458m("GoogleAdInfo", sb.toString());
        return true;
    }

    /* renamed from: v */
    public final void mo104010v(@C0359n0 String str) {
        this.f85171a.mo103965b().edit().putString("OT_IS_LIMIT_AD_TRACKING_ENABLED", str).apply();
    }

    /* renamed from: w */
    public boolean mo104011w() {
        return this.f85171a.mo103965b().getBoolean("OT_PROFILE_SYNC_IAB_CONSENT_EXPIRED", false);
    }

    /* renamed from: x */
    public void mo104012x(@C0359n0 String str) {
        Date g = C35020d.m143616g(str, ConfigFetchHttpClient.f81531o);
        if (g != null) {
            this.f85171a.mo103965b().edit().putLong("OT_IAB_TC_STR_CREATED_IN_MILLISECONDS", g.getTime()).apply();
            OTLogger.m143460o("TCStringDate", "Updating tc string Created date from profile sync value,Date = " + str + " , milliseconds = " + g.getTime());
        }
    }

    /* renamed from: y */
    public boolean mo104013y() {
        return this.f85171a.mo103965b().getBoolean("OT_CONSENT_LOG_ENABLED", true);
    }

    @C0359n0
    /* renamed from: z */
    public JSONObject mo104014z() {
        String string = this.f85171a.mo103965b().getString("OTT_CULTURE_DOMAIN_DATA", "");
        if (!C35020d.m143605J(string)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while returning culture domain data, err: " + e.getMessage());
            }
        }
        return new JSONObject();
    }

    public C35015e(@C0359n0 C35014d dVar) {
        this.f85171a = dVar;
        this.f85172b = new C35012b(dVar);
    }
}
