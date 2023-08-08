package com.onetrust.otpublishers.headless.Internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.a */
public class C35017a {
    /* renamed from: b */
    public static boolean m143592b(@C0363p0 JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* renamed from: c */
    public static boolean m143593c(@C0363p0 JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* renamed from: a */
    public void mo104016a(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject2.has(str)) {
            try {
                jSONObject.put(str, jSONObject2.optString(str));
            } catch (JSONException e) {
                OTLogger.m143457l("JSONUtils", "Error in parsing data. key = " + str + "Error message : " + e.getMessage());
            }
        }
    }
}
