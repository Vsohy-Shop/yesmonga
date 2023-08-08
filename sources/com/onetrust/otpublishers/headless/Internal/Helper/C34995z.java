package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.z */
public class C34995z {
    /* renamed from: a */
    public static void m143444a(@C0359n0 JSONArray jSONArray, SharedPreferences sharedPreferences) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONObject.put(jSONArray.optJSONObject(i).optString("CustomGroupId"), jSONArray.optJSONObject(i).optString("Type"));
                if (jSONArray.optJSONObject(i).has("SubGroups")) {
                    m143445b(jSONObject, jSONArray.optJSONObject(i).optJSONArray("SubGroups"));
                }
            }
            OTLogger.m143447b("OTTemplateUtils", "Groups configured: " + jSONObject);
            sharedPreferences.edit().putString("OT_GROUP_ID_OBJECT", jSONObject.toString()).apply();
        } catch (JSONException e) {
            OTLogger.m143457l("OTTemplateUtils", "Error while saving groups in template,err: " + e);
        }
    }

    /* renamed from: b */
    public static void m143445b(@C0359n0 JSONObject jSONObject, @C0363p0 JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONObject.put(jSONArray.optJSONObject(i).optString("CustomGroupId"), jSONArray.optJSONObject(i).optString("Type"));
            }
        }
    }
}
