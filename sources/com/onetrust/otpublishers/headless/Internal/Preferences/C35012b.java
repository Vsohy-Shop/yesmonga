package com.onetrust.otpublishers.headless.Internal.Preferences;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Preferences.b */
public class C35012b {

    /* renamed from: a */
    public C35014d f85169a;

    public C35012b(C35014d dVar) {
        this.f85169a = dVar;
    }

    @C0359n0
    /* renamed from: b */
    public static JSONObject m143531b(@C0359n0 Map<String, String> map, @C0363p0 JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            return new JSONObject();
        }
        if (map.isEmpty()) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < names.length(); i++) {
            try {
                String string = names.getString(i);
                m143532d(map, jSONObject2, string, jSONObject.getJSONObject(string));
            } catch (JSONException e) {
                OTLogger.m143457l("GeneralVendors", "General Vendor: error on filtering" + e);
            }
        }
        OTLogger.m143458m("GeneralVendors", "General Vendor: filtered vendors:" + jSONObject2);
        return jSONObject2;
    }

    /* renamed from: d */
    public static void m143532d(@C0359n0 Map<String, String> map, JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (!C35017a.m143593c(jSONObject2) && jSONObject2.has("CookiesCategoryIds")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("CookiesCategoryIds");
            boolean z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                if (map.containsKey(jSONArray.getString(i).trim())) {
                    z = true;
                }
            }
            if (z) {
                jSONObject.put(str, jSONObject2);
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public JSONObject mo103958a() {
        String string = this.f85169a.mo103965b().getString("OT_GENERAL_VENDORS", "");
        if (!C35020d.m143605J(string)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                OTLogger.m143447b("GeneralVendors", "Something went wrong while parsing savedGeneral Vendors: " + e);
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public void mo103959c(@C0363p0 String str) {
        this.f85169a.mo103965b().edit().putString("OT_GENERAL_VENDORS", str).apply();
    }

    /* renamed from: e */
    public void mo103960e(boolean z) {
        this.f85169a.mo103965b().edit().putBoolean("OT_GENERAL_VENDORS_CONFIGURED", z).apply();
    }

    /* renamed from: f */
    public void mo103961f(boolean z) {
        this.f85169a.mo103965b().edit().putBoolean("OT_GENERAL_VENDORS_TOGGLE_CONFIGURED", z).apply();
    }

    /* renamed from: g */
    public boolean mo103962g() {
        return this.f85169a.mo103965b().getBoolean("OT_GENERAL_VENDORS_CONFIGURED", false);
    }

    /* renamed from: h */
    public boolean mo103963h() {
        return this.f85169a.mo103965b().getBoolean("OT_GENERAL_VENDORS_TOGGLE_CONFIGURED", false);
    }
}
