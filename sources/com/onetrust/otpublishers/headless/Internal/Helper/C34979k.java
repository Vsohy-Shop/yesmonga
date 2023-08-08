package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.k */
public class C34979k {
    /* renamed from: a */
    public static int m143254a(@C0359n0 JSONObject jSONObject, int i, @C0359n0 JSONObject jSONObject2, boolean z, @C0363p0 C34990u uVar, @C0363p0 C35014d dVar) {
        JSONArray jSONArray = jSONObject2.getJSONArray("SubGroups");
        int i2 = 0;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            int b = m143255b(jSONObject, jSONArray.getJSONObject(i3).getString("CustomGroupId"), z, uVar, dVar);
            if (b == 0) {
                return 0;
            }
            if (b < 0) {
                i2++;
            }
        }
        if (i2 == jSONArray.length()) {
            return i;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m143255b(@C0359n0 JSONObject jSONObject, @C0359n0 String str, boolean z, @C0363p0 C34990u uVar, @C0363p0 C35014d dVar) {
        if (z && uVar != null && dVar != null) {
            return uVar.mo103873a(C34990u.m143387y(str), "purposeLegitimateInterests", C30638a.C30639a.f73205n, dVar, false);
        } else if (jSONObject.has(str)) {
            return jSONObject.getInt(str);
        } else {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m143256c(int i, int i2, @C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("purposeLegitimateInterests")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("purposeLegitimateInterests");
            if (i >= 0 && i != i2) {
                jSONObject2.put(C34990u.m143387y(str), i2);
                jSONObject.put("purposeLegitimateInterests", jSONObject2);
                OTLogger.m143447b("OneTrust", "setting LI status of " + str + " to " + i2 + "as per status configured for its subgroups");
            }
        }
    }

    /* renamed from: g */
    public static void m143257g(@C0359n0 JSONObject jSONObject, @C0359n0 C35014d dVar) {
        dVar.mo103965b().edit().putString("OTT_CONSENT_STATUS", jSONObject.toString()).apply();
    }

    /* renamed from: h */
    public static void m143258h(@C0359n0 JSONObject jSONObject, @C0359n0 String str, int i, int i2) {
        if (i2 >= 0 && i2 != i) {
            jSONObject.put(str, i);
            OTLogger.m143447b("OneTrust", "setting consent status of " + str + " to " + i + "as per status configured for its subgroups");
        }
    }

    /* renamed from: i */
    public static boolean m143259i(@C0363p0 JSONObject jSONObject, boolean z) {
        return jSONObject != null ? jSONObject.getBoolean("PAllowLI") : z;
    }

    /* renamed from: d */
    public void mo103772d(@C0359n0 String str, boolean z, @C0363p0 JSONObject jSONObject, @C0359n0 C35014d dVar, @C0359n0 Context context) {
        try {
            JSONObject jSONObject2 = new JSONObject(dVar.mo103965b().getString("OTT_CONSENT_STATUS", C28819e.f70617a));
            JSONArray jSONArray = new JSONObject(str).getJSONArray("Groups");
            boolean i = m143259i(jSONObject, false);
            if (jSONArray != null && jSONArray.length() > 0) {
                mo103774f(jSONArray, jSONObject2);
                if (z && i) {
                    mo103773e(jSONArray, new C34990u(context), dVar);
                }
            }
            m143257g(jSONObject2, dVar);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while setting default status of parent category,err: " + e.toString());
        }
    }

    /* renamed from: e */
    public void mo103773e(@C0359n0 JSONArray jSONArray, @C0359n0 C34990u uVar, @C0359n0 C35014d dVar) {
        try {
            String string = dVar.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
            JSONObject jSONObject = new JSONObject();
            if (!C35020d.m143605J(string)) {
                jSONObject = new JSONObject(string);
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("SubGroups")) {
                    String string2 = jSONObject2.getString("CustomGroupId");
                    int a = uVar.mo103873a(C34990u.m143387y(string2), "purposeLegitimateInterests", C30638a.C30639a.f73205n, dVar, false);
                    m143256c(a, m143254a(new JSONObject(), a, jSONObject2, true, uVar, dVar), string2, jSONObject);
                }
            }
            dVar.mo103965b().edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", jSONObject.toString()).apply();
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while setting default LI status of parent category,err: " + e.toString());
        }
    }

    /* renamed from: f */
    public void mo103774f(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("SubGroups") && !jSONObject2.getString(PersistedInstallation.f80251i).contains("always")) {
                    String string = jSONObject2.getString("CustomGroupId");
                    int i2 = jSONObject.getInt(string);
                    m143258h(jSONObject, string, m143254a(jSONObject, i2, jSONObject2, false, (C34990u) null, (C35014d) null), i2);
                }
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while setting default consent status of parent category,err: " + e.toString());
                return;
            }
        }
    }
}
