package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.e */
public class C34972e {
    /* renamed from: c */
    public static void m143175c(@C0359n0 C35014d dVar, @C0359n0 JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject.has("IabV2Data") && (optJSONObject = jSONObject.optJSONObject("IabV2Data")) != null && optJSONObject.has("vendorListVersion")) {
            dVar.mo103965b().edit().putInt("OT_DOMAIN_DATA_IAB_VENDOR_LIST_VERSION", Integer.parseInt(optJSONObject.optString("vendorListVersion"))).apply();
        }
    }

    /* renamed from: f */
    public static void m143176f(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        String str2;
        OTLogger.m143460o("VendorUtils", "getting details of " + str + "from GVL");
        JSONArray jSONArray = new JSONArray();
        if (str.equals("legIntPurposes") || str.equals("flexiblePurposes")) {
            OTLogger.m143460o("VendorUtils", "contains legIntPurposes/flexiblePurposes details");
            str2 = "purposes";
        } else {
            str2 = str;
        }
        for (int i = 0; i < jSONObject2.getJSONArray(str).length(); i++) {
            jSONArray.put(jSONObject.getJSONObject(str2).get(jSONObject2.getJSONArray(str).get(i).toString()));
        }
        jSONObject2.put(str, jSONArray);
    }

    /* renamed from: h */
    public static boolean m143177h(@C0359n0 JSONObject jSONObject, int i, int i2) {
        return Integer.parseInt(jSONObject.getJSONObject(jSONObject.names().get(i).toString()).getString("iab2GVLVersion")) <= i2;
    }

    @C0363p0
    /* renamed from: a */
    public JSONObject mo103717a(@C0359n0 Context context, int i, @C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        C35015e eVar = new C35015e(context);
        String K = eVar.mo103976K();
        boolean g = mo103721g(eVar.mo104014z());
        if (C35020d.m143605J(K)) {
            mo103720e(eVar.mo104014z(), eVar);
            K = eVar.mo103976K();
        }
        if (!C35020d.m143605J(K)) {
            try {
                JSONObject jSONObject3 = new JSONObject(K);
                if (jSONObject2.getJSONArray("purposes").length() > 0) {
                    m143176f(jSONObject3, jSONObject2, "purposes");
                }
                if (jSONObject2.getJSONArray("legIntPurposes").length() > 0 && g) {
                    m143176f(jSONObject3, jSONObject2, "legIntPurposes");
                } else if (!g) {
                    jSONObject2.put("legIntPurposes", new JSONArray());
                }
                if (jSONObject2.getJSONArray("specialFeatures").length() > 0) {
                    m143176f(jSONObject3, jSONObject2, "specialFeatures");
                }
                if (jSONObject2.getJSONArray("specialPurposes").length() > 0) {
                    m143176f(jSONObject3, jSONObject2, "specialPurposes");
                }
                if (jSONObject2.getJSONArray("features").length() > 0) {
                    m143176f(jSONObject3, jSONObject2, "features");
                }
                if (jSONObject2.getJSONArray("flexiblePurposes").length() > 0) {
                    m143176f(jSONObject3, jSONObject2, "flexiblePurposes");
                }
                OTLogger.m143458m("VendorUtils", "Vendor details for ID " + i + " : " + jSONObject2);
                return jSONObject2;
            } catch (Exception e) {
                OTLogger.m143457l("VendorUtils", "Could not fetch Vendor details for ID " + i + " : " + e.getMessage());
                return null;
            }
        } else {
            OTLogger.m143461p("VendorUtils", "Empty Vendor List to fetch Details");
            return null;
        }
    }

    @C0359n0
    /* renamed from: b */
    public JSONObject mo103718b(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("id", str);
        jSONObject2.put("name", str2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    /* renamed from: d */
    public void mo103719d(@C0359n0 C35015e eVar, @C0359n0 JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
            if (jSONObject6.getBoolean("IsIabPurpose")) {
                String y = C34990u.m143387y(jSONObject6.getString("CustomGroupId"));
                String string = jSONObject6.getString("Type");
                String string2 = jSONObject6.getString("GroupName");
                if (string.equals("IAB2_PURPOSE")) {
                    jSONObject4 = mo103718b(jSONObject4, y, string2);
                }
                if (string.equals("IAB2_FEATURE")) {
                    jSONObject2 = mo103718b(jSONObject2, y, string2);
                }
                if (string.equals("IAB2_SPL_PURPOSE")) {
                    jSONObject5 = mo103718b(jSONObject5, y, string2);
                }
                if (string.equals("IAB2_SPL_FEATURE")) {
                    jSONObject3 = mo103718b(jSONObject3, y, string2);
                }
            }
        }
        jSONObject.put("features", jSONObject2);
        jSONObject.put("purposes", jSONObject4);
        jSONObject.put("specialFeatures", jSONObject3);
        jSONObject.put("specialPurposes", jSONObject5);
        eVar.mo103970E(jSONObject.toString());
    }

    /* renamed from: e */
    public void mo103720e(@C0363p0 JSONObject jSONObject, @C0359n0 C35015e eVar) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("Groups");
                if (!C35017a.m143592b(jSONArray)) {
                    mo103719d(eVar, jSONArray);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("VendorUtils", "error while constructing IAB purposes object, err:" + e.toString());
            }
        }
    }

    /* renamed from: g */
    public boolean mo103721g(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.isNull("LegIntSettings") || !jSONObject.getJSONObject("LegIntSettings").has("PAllowLI")) {
            return true;
        }
        return jSONObject.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
    }
}
