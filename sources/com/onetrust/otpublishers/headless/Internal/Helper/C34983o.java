package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35114n;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.o */
public class C34983o {

    /* renamed from: a */
    public String f85103a;

    /* renamed from: b */
    public String f85104b;

    /* renamed from: c */
    public String f85105c;

    /* renamed from: d */
    public Context f85106d;

    public C34983o(@C0359n0 Context context) {
        this.f85106d = context;
    }

    @C0344h1
    /* renamed from: a */
    public static int m143324a(@C0363p0 JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return m143325b(z, -1);
        }
        boolean z2 = true;
        if (!(jSONObject.optInt(OTVendorUtils.CONSENT_TYPE) == -1) || !z) {
            z2 = false;
        }
        return m143325b(z2, jSONObject.optInt(OTVendorUtils.CONSENT_TYPE));
    }

    /* renamed from: b */
    public static int m143325b(boolean z, int i) {
        if (z) {
            return 1;
        }
        return i;
    }

    @C0363p0
    @C0344h1
    /* renamed from: d */
    public static JSONObject m143326d(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2) {
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        JSONArray names = jSONObject.names();
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(names.getString(i));
            if (!C35017a.m143593c(jSONObject2) && jSONObject2.getString("Id").equalsIgnoreCase(str2)) {
                return jSONObject2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m143327e(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject) {
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("Groups");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                if (!C35017a.m143592b(jSONObject2.getJSONArray("GeneralVendorsIds"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("GeneralVendors", "error while filtering groups: " + e);
        }
    }

    /* renamed from: g */
    public static void m143328g(boolean z, @C0359n0 JSONObject jSONObject, @C0359n0 C35015e eVar) {
        try {
            JSONArray names = jSONObject.names();
            if (!C35017a.m143592b(names)) {
                JSONObject a = eVar.f85172b.mo103958a();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                    jSONObject2.put(OTVendorUtils.CONSENT_TYPE, m143324a(m143326d(a, string, jSONObject2.getString("Id")), z));
                }
                OTLogger.m143458m("GeneralVendors", "General Vendors saved as " + jSONObject);
                eVar.f85172b.mo103959c(jSONObject.toString());
            }
        } catch (JSONException e) {
            OTLogger.m143457l("GeneralVendors", "error while parsing General Vendor data: " + e);
        }
    }

    /* renamed from: h */
    public static void m143329h(boolean z, boolean z2, @C0359n0 C35015e eVar) {
        String str;
        boolean g = eVar.f85172b.mo103962g();
        boolean h = eVar.f85172b.mo103963h();
        if (g && h) {
            JSONObject b = new C34984p(eVar.f85172b.mo103958a()).mo103839b(z);
            if (z2) {
                OTLogger.m143458m("GeneralVendors", "General Vendors saved as :" + b);
                return;
            } else if (b != null) {
                eVar.f85172b.mo103959c(b.toString());
                str = "General Vendors saved as :" + b;
            } else {
                return;
            }
        } else if (!h) {
            str = "General Vendors consent not saved : Vendor Opt-out disabled from admin settings";
        } else {
            OTLogger.m143447b("GeneralVendors", "General Vendors consent not saved : No Vendors configured");
            return;
        }
        OTLogger.m143458m("GeneralVendors", str);
    }

    /* renamed from: c */
    public JSONArray mo103832c() {
        JSONArray jSONArray = new JSONArray();
        JSONObject z = new C35015e(this.f85106d).mo104014z();
        if (!C35017a.m143593c(z) && z.has("Groups")) {
            m143327e(jSONArray, z);
        }
        OTLogger.m143458m("GeneralVendors", "General Vendor Linked Groups on Filter: " + jSONArray);
        return jSONArray;
    }

    /* renamed from: f */
    public void mo103833f(@C0359n0 JSONObject jSONObject, C35015e eVar) {
        if (C35017a.m143593c(jSONObject)) {
            OTLogger.m143447b("OneTrust", "Cannot parse General Vendor data because data is corrupt");
            return;
        }
        JSONObject C = new C35114n(this.f85106d).mo104791C();
        if (C.has("generalVendors")) {
            JSONObject jSONObject2 = C.getJSONObject("generalVendors");
            if (jSONObject2.has(OTVendorListMode.GENERAL)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(OTVendorListMode.GENERAL);
                boolean optBoolean = jSONObject3.optBoolean(C9874a.f27048E);
                eVar.f85172b.mo103960e(optBoolean);
                OTLogger.m143447b("GeneralVendors", "General Vendors configured : " + optBoolean);
                JSONObject optJSONObject = jSONObject2.optJSONObject("vendorDetails");
                if (optBoolean && !C35017a.m143593c(optJSONObject)) {
                    boolean optBoolean2 = jSONObject3.optBoolean("vendorLevelOptOut");
                    eVar.f85172b.mo103961f(optBoolean2);
                    OTLogger.m143447b("GeneralVendors", "General Vendors toggle configured : " + optBoolean2);
                    m143328g(optBoolean2, optJSONObject, eVar);
                }
            }
        }
    }

    /* renamed from: i */
    public String mo103834i() {
        return this.f85104b;
    }

    @C0359n0
    /* renamed from: j */
    public C34983o mo103835j() {
        try {
            JSONObject C = new C35114n(this.f85106d).mo104791C();
            if (C.has("generalVendors")) {
                JSONObject jSONObject = C.getJSONObject("generalVendors");
                if (jSONObject.has(OTVendorListMode.GENERAL)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
                    this.f85103a = jSONObject2.optString("text");
                    this.f85105c = jSONObject2.optString("vendorListPrivacyPolicyText");
                    this.f85104b = jSONObject2.optString("vendorListLabelText");
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("GeneralVendors", "Error while parsing General Vendor labels:" + e);
        }
        return this;
    }

    /* renamed from: k */
    public String mo103836k() {
        return this.f85105c;
    }

    /* renamed from: l */
    public String mo103837l() {
        return this.f85103a;
    }
}
