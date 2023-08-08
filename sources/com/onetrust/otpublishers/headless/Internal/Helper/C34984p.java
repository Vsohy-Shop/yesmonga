package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.p */
public class C34984p {

    /* renamed from: a */
    public JSONObject f85107a;

    public C34984p(@C0359n0 JSONObject jSONObject) {
        new JSONObject();
        this.f85107a = jSONObject;
    }

    @C0359n0
    /* renamed from: a */
    public JSONObject mo103838a() {
        return this.f85107a;
    }

    @C0363p0
    /* renamed from: b */
    public JSONObject mo103839b(boolean z) {
        JSONArray names = this.f85107a.names();
        if (C35017a.m143592b(names)) {
            return null;
        }
        for (int i = 0; i < names.length(); i++) {
            mo103841d(names.getString(i), z);
        }
        return this.f85107a;
    }

    /* renamed from: c */
    public void mo103840c(SharedPreferences sharedPreferences) {
        OTLogger.m143458m("GeneralVendors", "General Vendors saved as " + this.f85107a);
        sharedPreferences.edit().putString("OT_GENERAL_VENDORS", this.f85107a.toString()).apply();
    }

    /* renamed from: d */
    public void mo103841d(@C0359n0 String str, boolean z) {
        StringBuilder sb;
        if (this.f85107a.has(str)) {
            try {
                JSONObject jSONObject = this.f85107a.getJSONObject(str);
                if (-1 != jSONObject.optInt(OTVendorUtils.CONSENT_TYPE, -1)) {
                    jSONObject.put(OTVendorUtils.CONSENT_TYPE, z ? 1 : 0);
                    OTLogger.m143458m("GeneralVendors", "Consent updated for Vendor: " + str + " as " + z);
                }
            } catch (JSONException e) {
                sb = new StringBuilder();
                sb.append("error while updating Vendor status:");
                sb.append(e);
            }
        } else {
            sb = new StringBuilder();
            sb.append("Given Vendor ID ");
            sb.append(str);
            sb.append(" does not match with any existing vendors. Please check and pass the correct Vendor ID");
            OTLogger.m143457l("GeneralVendors", sb.toString());
        }
    }

    /* renamed from: e */
    public void mo103842e(JSONObject jSONObject) {
        this.f85107a = jSONObject;
    }
}
