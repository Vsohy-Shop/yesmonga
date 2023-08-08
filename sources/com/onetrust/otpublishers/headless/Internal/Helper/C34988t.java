package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.measurement.api.C30638a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Network.C35001a;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35011a;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.C12983b;
import retrofit2.C13008d;
import retrofit2.C13091w;
import retrofit2.C13092x;
import retrofit2.converter.scalars.C13006c;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.t */
public class C34988t {

    /* renamed from: a */
    public final Context f85112a;

    /* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.t$a */
    public class C34989a implements C13008d<String> {
        public C34989a() {
        }

        /* renamed from: a */
        public void mo30434a(C12983b<String> bVar, Throwable th) {
            OTLogger.m143457l("GoogleVendorHelper", "Google Vendor list Api Failed :  " + th.getMessage());
        }

        /* renamed from: b */
        public void mo30435b(@C0359n0 C12983b<String> bVar, @C0359n0 C13091w<String> wVar) {
            OTLogger.m143458m("GoogleVendorHelper", "Google Vendor list Api Success : " + wVar.mo30572a());
            C34988t.this.mo103857g(wVar.mo30578i().receivedResponseAtMillis(), wVar.mo30578i().sentRequestAtMillis());
            C34988t tVar = C34988t.this;
            tVar.mo103859i(tVar.f85112a, wVar.mo30572a());
        }
    }

    public C34988t(@C0359n0 Context context) {
        this.f85112a = context;
    }

    @C0359n0
    /* renamed from: e */
    public static StringBuilder m143355e(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONArray jSONArray, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if ("1".equalsIgnoreCase(jSONObject.getJSONObject(string).getString(OTVendorUtils.CONSENT_TYPE))) {
                if (!z) {
                    sb.append(".");
                }
                sb.append(string);
                z = false;
            }
        }
        return sb;
    }

    /* renamed from: n */
    public static void m143356n(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        OTLogger.m143447b("GoogleVendorHelper", "domain id contains overridden vendors");
        JSONArray names = jSONObject2.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                m143359t(jSONObject, jSONObject2, names.getString(i));
            }
        }
    }

    /* renamed from: o */
    public static void m143357o(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        JSONArray names = jSONObject2.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                m143358p(jSONObject, jSONObject2, str, jSONObject2.getJSONObject(string), string);
            }
        }
    }

    /* renamed from: p */
    public static void m143358p(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str, @C0359n0 JSONObject jSONObject3, @C0359n0 String str2) {
        if (jSONObject.has(str2)) {
            jSONObject3.put(OTVendorUtils.CONSENT_TYPE, jSONObject.getJSONObject(str2).getInt(OTVendorUtils.CONSENT_TYPE));
        } else {
            jSONObject3.put(OTVendorUtils.CONSENT_TYPE, str);
        }
        jSONObject2.put(str2, jSONObject3);
    }

    /* renamed from: t */
    public static void m143359t(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject.has(str) && !jSONObject2.getJSONObject(str).getBoolean(C30638a.C30639a.f73205n)) {
            jSONObject.remove(str);
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo103853b(@C0359n0 Context context) {
        JSONObject Q = new C35015e(context).mo103982Q();
        if (!Q.has("preferenceCenterData")) {
            return "";
        }
        JSONObject jSONObject = Q.getJSONObject("preferenceCenterData");
        if (!jSONObject.has("googleVendors")) {
            return "";
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("googleVendors");
        return jSONObject2.has(OTVendorListMode.GENERAL) ? jSONObject2.getJSONObject(OTVendorListMode.GENERAL).getString("text") : "";
    }

    @C0359n0
    /* renamed from: c */
    public String mo103854c(@C0363p0 JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("vendorListVersion")) ? "1" : jSONObject.getString("vendorListVersion");
    }

    @C0363p0
    /* renamed from: d */
    public String mo103855d(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        String str = null;
        if (jSONObject.has("GoogleData")) {
            String string = jSONObject.getString("GoogleData");
            if (!C35020d.m143605J(string)) {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has("googleVendorListUrl")) {
                    str = jSONObject2.getString("googleVendorListUrl");
                }
            }
            mo103861k(sharedPreferences, string, "OT_GOOGLE_VENDOR_DATA");
        }
        return str;
    }

    /* renamed from: f */
    public void mo103856f() {
        new C35011a(this.f85112a).mo103957a(OTIABTCFKeys.IABTCF_ADD_TL_CONSENT, "");
        mo103861k(new C35014d(this.f85112a, "OTT_DEFAULT_USER").mo103965b(), "", "OT_GOOGLE_VENDOR_DATA");
        mo103861k(new C35014d(this.f85112a, "OTT_DEFAULT_USER").mo103965b(), "", "OT_GOOGLE_GVL_COMPLETE_OBJECT");
        mo103861k(new C35014d(this.f85112a, "OTT_DEFAULT_USER").mo103965b(), "", "OT_GOOGLE_ACTIVE_VENDOR_LIST");
    }

    @C0344h1
    /* renamed from: g */
    public void mo103857g(long j, long j2) {
        OTLogger.m143460o("GoogleVendorHelper", "Google vendor api response time : " + j + "," + j2);
        new UIUtils().mo104276n(j, j2, 3);
    }

    /* renamed from: h */
    public final void mo103858h(@C0359n0 Context context, @C0359n0 C35014d dVar, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        try {
            if (jSONObject2.has("vendors")) {
                jSONObject2 = jSONObject2.getJSONObject("vendors");
                JSONObject z = new C35015e(context).mo104014z();
                JSONObject jSONObject3 = new JSONObject();
                if (z.has("OverridenGoogleVendors") && !z.isNull("OverridenGoogleVendors")) {
                    jSONObject3 = z.getJSONObject("OverridenGoogleVendors");
                }
                String str = "opt-out".equals(z.has("VendorConsentModel") ? z.getString("VendorConsentModel") : "") ? "1" : "0";
                m143356n(jSONObject2, jSONObject3);
                m143357o(jSONObject, jSONObject2, str);
                mo103861k(dVar.mo103965b(), jSONObject2.toString(), "OT_GOOGLE_ACTIVE_VENDOR_LIST");
            }
        } catch (JSONException e) {
            OTLogger.m143457l("GoogleVendorHelper", "error on parsing google vendors, error = " + e.getMessage());
        }
    }

    @C0344h1
    /* renamed from: i */
    public void mo103859i(@C0359n0 Context context, @C0363p0 String str) {
        JSONObject jSONObject;
        OTLogger.m143447b("GoogleVendorHelper", "Parsing Google vendor list.");
        if (!C35020d.m143605J(str)) {
            C35014d dVar = new C35014d(context, "OTT_DEFAULT_USER");
            String string = dVar.mo103965b().getString("OT_GOOGLE_ACTIVE_VENDOR_LIST", (String) null);
            JSONObject jSONObject2 = new JSONObject();
            if (!C35020d.m143605J(string)) {
                try {
                    jSONObject2 = new JSONObject(string);
                } catch (JSONException e) {
                    OTLogger.m143457l("GoogleVendorHelper", "Error on parsing google vendors on savedGoogleActiveVendorList, error = " + e.getMessage());
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject = new JSONObject(str);
                try {
                    mo103861k(dVar.mo103965b(), jSONObject.toString(), "OT_GOOGLE_GVL_COMPLETE_OBJECT");
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject3 = jSONObject;
                }
            } catch (JSONException e3) {
                e = e3;
                OTLogger.m143457l("GoogleVendorHelper", "Error on parsing google vendors on newGoogleActiveVendorList, error = " + e.getMessage());
                jSONObject = jSONObject3;
                mo103858h(context, dVar, jSONObject2, jSONObject);
            }
            mo103858h(context, dVar, jSONObject2, jSONObject);
        }
    }

    /* renamed from: j */
    public void mo103860j(@C0359n0 SharedPreferences sharedPreferences, @C0359n0 C35015e eVar, boolean z) {
        JSONObject h = eVar.mo103997h();
        if (h != null) {
            try {
                m143357o(new JSONObject(), h, z ? "1" : "0");
                mo103861k(sharedPreferences, h.toString(), "OT_GOOGLE_ACTIVE_VENDOR_LIST");
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleVendorHelper", "Error in updating google vendor status. Error message : " + e.getMessage());
            }
        }
    }

    @C0344h1
    /* renamed from: k */
    public void mo103861k(@C0359n0 SharedPreferences sharedPreferences, @C0363p0 String str, @C0359n0 String str2) {
        sharedPreferences.edit().putString(str2, str).apply();
    }

    /* renamed from: l */
    public void mo103862l(@C0359n0 C35015e eVar) {
        if (eVar.mo103992c()) {
            mo103866s(eVar.mo103997h(), eVar.mo103971F());
        }
    }

    /* renamed from: m */
    public void mo103863m(@C0359n0 String str) {
        OTLogger.m143447b("GoogleVendorHelper", "Google Vendor list Api called ");
        ((C35001a) new C13092x.C13094b().mo30599c("https://geolocation.1trust.app/").mo30598b(C13006c.m56324f()).mo30606j(new OkHttpClient.Builder().build()).mo30602f().mo30586g(C35001a.class)).mo103939d(str).mo30458k1(new C34989a());
    }

    @C0359n0
    /* renamed from: q */
    public String mo103864q(@C0359n0 JSONObject jSONObject) {
        return jSONObject.has("PCIABVendorsText") ? jSONObject.getString("PCIABVendorsText") : jSONObject.has("PCenterVendorsListText") ? jSONObject.getString("PCenterVendorsListText") : "";
    }

    /* renamed from: r */
    public void mo103865r() {
        OTLogger.m143447b("GoogleVendorHelper", "Resetting user consent on Google vendor list.");
        C35014d dVar = new C35014d(this.f85112a, "OTT_DEFAULT_USER");
        JSONObject jSONObject = new JSONObject();
        String string = dVar.mo103965b().getString("OT_GOOGLE_GVL_COMPLETE_OBJECT", (String) null);
        JSONObject jSONObject2 = new JSONObject();
        if (!C35020d.m143605J(string)) {
            try {
                jSONObject2 = new JSONObject(string);
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleVendorHelper", "Error on parsing google vendors on clearUserConsent, error = " + e.getMessage());
            }
            mo103858h(this.f85112a, dVar, jSONObject, jSONObject2);
        }
    }

    /* renamed from: s */
    public final void mo103866s(@C0363p0 JSONObject jSONObject, @C0363p0 JSONObject jSONObject2) {
        if (jSONObject == null) {
            try {
                OTLogger.m143461p("GoogleVendorHelper", "Google additional string not generated: Google vendor data is null");
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleVendorHelper", "Error on parsing google vendor status.Error message = " + e.getMessage());
            }
        } else {
            String str = "" + mo103854c(jSONObject2) + "~";
            JSONArray names = jSONObject.names();
            if (names != null) {
                str = m143355e(jSONObject, str, names, true).toString();
            }
            new C35011a(this.f85112a).mo103957a(OTIABTCFKeys.IABTCF_ADD_TL_CONSENT, str);
            OTLogger.m143458m("GoogleVendorHelper", "Google consent string, IABTCF_AddtlConsent = " + str);
        }
    }

    /* renamed from: u */
    public boolean mo103867u(@C0359n0 JSONObject jSONObject) {
        if (!jSONObject.has("preferenceCenterData")) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("preferenceCenterData");
        if (!jSONObject2.has("googleVendors")) {
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("googleVendors");
        if (jSONObject3.has(OTVendorListMode.GENERAL)) {
            return jSONObject3.getJSONObject(OTVendorListMode.GENERAL).getBoolean(C9874a.f27048E);
        }
        return false;
    }
}
