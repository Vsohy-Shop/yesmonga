package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.remoteconfig.C33584t;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.urbanairship.automation.C8970v;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.v */
public class C34991v {

    /* renamed from: a */
    public final SharedPreferences f85115a;

    /* renamed from: b */
    public final Context f85116b;

    /* renamed from: c */
    public final C35015e f85117c;

    /* renamed from: d */
    public final C35014d f85118d;

    public C34991v(@C0359n0 Context context) {
        this.f85116b = context;
        this.f85117c = new C35015e(context);
        this.f85118d = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85115a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: a */
    public static int m143410a(@C0363p0 String str, int i, int i2) {
        if (str == null || C35020d.m143605J(str) || i <= 0 || i > i2) {
            return 0;
        }
        return Integer.parseInt(String.valueOf(str.charAt(i - 1)));
    }

    /* renamed from: e */
    public static void m143411e(@C0363p0 String str, JSONObject jSONObject, int i, int i2, int i3) {
        while (i <= i3) {
            jSONObject.put(String.valueOf(i), m143410a(str, i, i2));
            i++;
        }
    }

    /* renamed from: g */
    public static void m143412g(@C0359n0 JSONObject jSONObject, @C0359n0 SharedPreferences.Editor editor) {
        if (jSONObject.has("publisher")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("publisher");
            if (jSONObject2.has("restrictions")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("restrictions");
                for (int i = 1; i <= 10; i++) {
                    String valueOf = String.valueOf(i);
                    m143416o(jSONObject3, editor, valueOf, OTIABTCFKeys.IABTCF_PUBLISHERRESTRICTIONS + valueOf);
                }
            }
            m143416o(jSONObject2, editor, "consents", OTIABTCFKeys.IABTCF_PUBLISHERCONSENT);
            m143416o(jSONObject2, editor, "legitimateInterests", OTIABTCFKeys.IABTCF_PUBLISHERLEGITIMATEINTERESTS);
            if (jSONObject2.has("customPurpose")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("customPurpose");
                m143416o(jSONObject4, editor, "consents", OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESCONSENTS);
                m143416o(jSONObject4, editor, "legitimateInterests", OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESLEGITIMATEINTERESTS);
            }
        }
    }

    /* renamed from: h */
    public static void m143413h(@C0359n0 JSONObject jSONObject, @C0359n0 SharedPreferences.Editor editor, @C0359n0 String str, @C0359n0 String str2) {
        if (jSONObject.has(str)) {
            editor.putInt(str2, jSONObject.getBoolean(str) ? 1 : 0);
        }
    }

    /* renamed from: k */
    public static boolean m143414k(@C0363p0 String str, int i, @C0359n0 JSONObject jSONObject, int i2, @C0359n0 String str2) {
        int a;
        int optInt = jSONObject.optInt(str2, -1);
        if (optInt < 0 || (a = m143410a(str, i2, i)) == optInt) {
            return false;
        }
        jSONObject.put(str2, a);
        return true;
    }

    /* renamed from: n */
    public static void m143415n(@C0359n0 JSONObject jSONObject, @C0359n0 SharedPreferences.Editor editor, @C0359n0 String str, @C0359n0 String str2) {
        if (jSONObject.has(str)) {
            editor.putInt(str2, jSONObject.getInt(str));
        }
    }

    /* renamed from: o */
    public static void m143416o(@C0359n0 JSONObject jSONObject, @C0359n0 SharedPreferences.Editor editor, @C0359n0 String str, @C0359n0 String str2) {
        if (jSONObject.has(str)) {
            editor.putString(str2, jSONObject.getString(str));
        }
    }

    /* renamed from: b */
    public void mo103890b() {
        String H = new C35015e(this.f85116b).mo103973H();
        if (H != null && !C35020d.m143605J(H)) {
            JSONObject jSONObject = new JSONObject(H);
            if (new C35000d(this.f85116b).mo103932c(jSONObject)) {
                new C34970d(this.f85116b).mo103699p(jSONObject.getJSONArray("Groups"), false, new JSONObject());
            }
        }
    }

    /* renamed from: c */
    public void mo103891c(@C0363p0 String str, @C0363p0 String str2) {
        int b = C35020d.m143612b(str, -1);
        int b2 = C35020d.m143612b(str2, -1);
        JSONObject b3 = this.f85117c.mo103991b();
        if (b3 == null) {
            OTLogger.m143458m("IABTCStringParser", "Empty vendor array, not updating the vendor status. Vendor status will be updated once vendor details fetched.");
            return;
        }
        Iterator<String> keys = b3.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject = b3.getJSONObject(next);
            int i = jSONObject.getInt("id");
            boolean k = m143414k(str, b, jSONObject, i, OTVendorUtils.CONSENT_TYPE);
            boolean k2 = m143414k(str2, b2, jSONObject, i, OTVendorUtils.LEGITIMATE_CONSENT_TYPE);
            if (k || k2) {
                b3.put(next, jSONObject);
                z = true;
            }
        }
        mo103894i(z, b3);
    }

    /* renamed from: d */
    public void mo103892d(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        int i = -1;
        int length = (str == null || C35020d.m143605J(str)) ? -1 : str.length();
        int length2 = (str2 == null || C35020d.m143605J(str2)) ? -1 : str2.length();
        if (str3 != null && !C35020d.m143605J(str3)) {
            i = str3.length();
        }
        JSONObject I = this.f85117c.mo103974I();
        if (I == null) {
            I = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        m143411e(str, jSONObject, 1, length, 10);
        m143411e(str2, jSONObject2, 2, length2, 10);
        m143411e(str3, jSONObject3, 1, i, 2);
        I.put("purposes", jSONObject);
        I.put("purposeLegitimateInterests", jSONObject2);
        I.put("special_feature_opt_ins", jSONObject3);
        this.f85118d.mo103965b().edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", I.toString()).apply();
    }

    @C0344h1
    /* renamed from: f */
    public void mo103893f(@C0359n0 JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SharedPreferences.Editor edit = this.f85115a.edit();
        m143415n(jSONObject, edit, "cmpId", OTIABTCFKeys.IABTCF_CMPSDKID);
        m143415n(jSONObject, edit, "cmpVersion", OTIABTCFKeys.IABTCF_CMPSDKVERSION);
        m143415n(jSONObject, edit, "tcfPolicyVersion", OTIABTCFKeys.IABTCF_POLICYVERSION);
        m143413h(jSONObject, edit, "useNonStandardStacks", OTIABTCFKeys.IABTCF_USENONSTANDARDSTACKS);
        m143413h(jSONObject, edit, "gdprApplies", OTIABTCFKeys.IABTCF_GDPRAPPLIES);
        m143413h(jSONObject, edit, "purposeOneTreatment", OTIABTCFKeys.IABTCF_PURPOSEONETREATMENT);
        m143416o(jSONObject, edit, "publisherCC", OTIABTCFKeys.IABTCF_PUBLISHERCC);
        m143416o(jSONObject, edit, "tcString", OTIABTCFKeys.IABTCF_TCSTRING);
        String str6 = null;
        if (jSONObject.has("specialFeatureOptins")) {
            str = jSONObject.getString("specialFeatureOptins");
            edit.putString(OTIABTCFKeys.IABTCF_SPECIALFEATURESOPTINS, str);
        } else {
            str = null;
        }
        if (jSONObject.has("purpose")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("purpose");
            if (jSONObject2.has("consents")) {
                str2 = jSONObject2.getString("consents");
                edit.putString(OTIABTCFKeys.IABTCF_PURPOSECONSENTS, str2);
            } else {
                str2 = null;
            }
            if (jSONObject2.has("legitimateInterests")) {
                str3 = jSONObject2.getString("legitimateInterests");
                edit.putString(OTIABTCFKeys.IABTCF_PURPOSELEGITIMATEINTERESTS, str3);
            } else {
                str3 = null;
            }
        } else {
            str3 = null;
            str2 = null;
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_VENDOR)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_VENDOR);
            if (jSONObject3.has("consents")) {
                str5 = jSONObject3.getString("consents");
                edit.putString(OTIABTCFKeys.IABTCF_VENDORCONSENTS, str5);
            } else {
                str5 = null;
            }
            if (jSONObject3.has("legitimateInterests")) {
                str6 = jSONObject3.getString("legitimateInterests");
                edit.putString(OTIABTCFKeys.IABTCF_VENDORLEGITIMATEINTERESTS, jSONObject3.getString("legitimateInterests"));
            }
            String str7 = str5;
            str4 = str6;
            str6 = str7;
        } else {
            str4 = null;
        }
        m143412g(jSONObject, edit);
        edit.apply();
        mo103897m(jSONObject);
        mo103891c(str6, str4);
        mo103892d(str2, str3, str);
        if (jSONObject.has("isServiceSpecific")) {
            boolean z = jSONObject.getBoolean("isServiceSpecific");
            OTLogger.m143447b("IABTCStringParser", "saving IsServiceSpecific value: " + z);
            new C35014d(this.f85116b, "OTT_DEFAULT_USER").mo103965b().edit().putBoolean("isServiceSpecific", z).apply();
        }
        mo103890b();
    }

    /* renamed from: i */
    public final void mo103894i(boolean z, @C0359n0 JSONObject jSONObject) {
        if (z) {
            this.f85118d.mo103965b().edit().putString("OT_IAB_ACTIVE_VENDORLIST", jSONObject.toString()).apply();
        }
    }

    /* renamed from: j */
    public boolean mo103895j(@C0359n0 String str) {
        if ("IAB2".equalsIgnoreCase(str) && this.f85117c.mo103977L() == 2) {
            return this.f85117c.mo103994e();
        }
        return false;
    }

    @C0359n0
    /* renamed from: l */
    public final JSONObject mo103896l() {
        JSONObject jSONObject = new JSONObject();
        JSONObject S = this.f85117c.mo103984S();
        if (!S.has(C33584t.f81711k)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = S.getJSONObject(C33584t.f81711k);
        return jSONObject2.has("syncGroups") ? jSONObject2.getJSONObject("syncGroups") : jSONObject;
    }

    @C0344h1
    /* renamed from: m */
    public void mo103897m(@C0359n0 JSONObject jSONObject) {
        try {
            if (jSONObject.has(C8970v.f24102m)) {
                this.f85117c.mo104012x(jSONObject.getString(C8970v.f24102m));
            }
            if (jSONObject.has("lastUpdated")) {
                this.f85117c.mo103966A(jSONObject.getString("lastUpdated"));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("IABTCStringParser", "Error on saving tcstring created and updated date. Error msg = " + e.getMessage());
        }
    }

    /* renamed from: p */
    public boolean mo103898p() {
        String T = this.f85117c.mo103985T();
        if (C35020d.m143605J(T)) {
            return false;
        }
        JSONObject l = mo103896l();
        if (l.has(T)) {
            return l.getJSONObject(T).has("tcStringV2Decoded");
        }
        return false;
    }

    /* renamed from: q */
    public void mo103899q() {
        String T = this.f85117c.mo103985T();
        if (!C35020d.m143605J(T)) {
            JSONObject l = mo103896l();
            if (l.has(T)) {
                JSONObject jSONObject = l.getJSONObject(T);
                if (jSONObject.has("tcStringV2Decoded")) {
                    mo103893f(jSONObject.getJSONObject("tcStringV2Decoded"));
                }
            }
        }
    }
}
