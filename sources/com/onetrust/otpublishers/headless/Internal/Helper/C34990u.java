package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.u */
public class C34990u {

    /* renamed from: a */
    public Context f85114a;

    public C34990u(@C0359n0 Context context) {
        this.f85114a = context;
    }

    /* renamed from: A */
    public static boolean m143377A(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        if (!jSONObject2.has("disabledCP") || !jSONObject.has("purposes")) {
            z = false;
        } else {
            JSONArray jSONArray = jSONObject2.getJSONArray("disabledCP");
            JSONArray jSONArray2 = jSONObject.getJSONArray("purposes");
            z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                int c = C35020d.m143613c(jSONArray2, jSONArray.getInt(i));
                if (c > -1) {
                    jSONArray2 = m143380g(jSONArray2, c);
                    z = true;
                }
            }
            if (z) {
                jSONObject.put("purposes", jSONArray2);
            }
        }
        if (!jSONObject2.has("disabledLIP") || !jSONObject.has("legIntPurposes")) {
            z2 = false;
        } else {
            JSONArray jSONArray3 = jSONObject2.getJSONArray("disabledLIP");
            JSONArray jSONArray4 = jSONObject.getJSONArray("legIntPurposes");
            z2 = false;
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                int c2 = C35020d.m143613c(jSONArray4, jSONArray3.getInt(i2));
                if (c2 > -1) {
                    jSONArray4 = m143380g(jSONArray4, c2);
                    z2 = true;
                }
            }
            if (z2) {
                jSONObject.put("legIntPurposes", jSONArray4);
            }
        }
        return z || z2;
    }

    @C0363p0
    /* renamed from: D */
    public static String m143378D(@C0359n0 String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1707240697:
                if (str.equals("IAB2_PURPOSE")) {
                    c = 0;
                    break;
                }
                break;
            case -311964241:
                if (str.equals("IAB2_SPL_FEATURE")) {
                    c = 1;
                    break;
                }
                break;
            case 304857777:
                if (str.equals("IAB2_STACK")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "purposes";
            case 1:
                return "special_feature_opt_ins";
            case 2:
                return "stacks";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static int m143379b(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, String str, String str2, String str3, int i) {
        if (!jSONObject2.getJSONObject(str).getBoolean(str2) || jSONObject.getJSONObject(str).getJSONArray(str3).length() <= 0) {
            return -1;
        }
        return i;
    }

    @C0359n0
    /* renamed from: g */
    public static JSONArray m143380g(@C0359n0 JSONArray jSONArray, int i) {
        jSONArray.remove(i);
        return jSONArray;
    }

    /* renamed from: k */
    public static void m143381k(@C0359n0 C35014d dVar, @C0359n0 JSONObject jSONObject) {
        if (C35020d.m143605J(dVar.mo103965b().getString("OT_IAB_DEFAULT_AVL", ""))) {
            dVar.mo103965b().edit().putString("OT_IAB_DEFAULT_AVL", jSONObject.toString()).apply();
        }
    }

    /* renamed from: m */
    public static void m143382m(@C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        OTLogger.m143458m("IABHelper", str);
        JSONArray names = jSONObject.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                try {
                    String string = names.getString(i);
                    OTLogger.m143458m("IABHelper", string + ": " + jSONObject.getString(string));
                } catch (JSONException e) {
                    OTLogger.m143461p("IABHelper", "error while logging IAB encoder details : " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: n */
    public static void m143383n(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
        if (jSONObject2.has(str3)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(str3);
            if (C35020d.m143613c(jSONArray, Integer.parseInt(str)) == -1) {
                jSONArray.put(str);
                jSONObject2.put(str3, jSONArray);
                jSONObject.put(str2, jSONObject2);
            }
        }
    }

    /* renamed from: o */
    public static void m143384o(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (m143377A(jSONObject3, jSONObject2)) {
            jSONObject.put(str, jSONObject3);
        }
    }

    /* renamed from: v */
    public static void m143385v(@C0359n0 JSONObject jSONObject, boolean z, int i, @C0359n0 String str) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (z) {
            jSONObject2.put(OTVendorUtils.LEGITIMATE_CONSENT_TYPE, i);
        } else {
            jSONObject2.put(OTVendorUtils.LEGITIMATE_CONSENT_TYPE, -1);
        }
    }

    /* renamed from: x */
    public static int m143386x(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, int i) {
        if (jSONObject2.getJSONObject(str).has(str2)) {
            return jSONObject2.getJSONObject(str).getInt(str2);
        }
        if (jSONObject.getJSONObject(str).getJSONArray(str3).length() > 0) {
            return i;
        }
        return -1;
    }

    @C0359n0
    /* renamed from: y */
    public static String m143387y(@C0359n0 String str) {
        try {
            return str.contains(C32920e.f79928l) ? str.split(C32920e.f79928l)[1] : "";
        } catch (Exception e) {
            OTLogger.m143457l("IABHelper", "error while getting the iab group id " + e.getMessage());
            return "";
        }
    }

    @C0363p0
    /* renamed from: B */
    public String mo103868B(@C0359n0 String str) {
        try {
            JSONObject jSONObject = new JSONObject(new C35014d(this.f85114a, "OTT_DEFAULT_USER").mo103965b().getString("OT_IAB_PURPOSE_TYPES", ""));
            if (jSONObject.has(str)) {
                OTLogger.m143447b("IABHelper", "IAB type of " + str + ": " + jSONObject.getString(str));
                return jSONObject.getString(str);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("IABHelper", "Error while getting IAB type of updated group : " + e.getMessage());
        }
        return "";
    }

    /* renamed from: C */
    public JSONArray mo103869C(@C0359n0 JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < jSONObject.length()) {
            try {
                if (jSONObject.getInt(jSONObject.names().get(i).toString()) != 0) {
                    jSONArray.put(Integer.parseInt(jSONObject.names().get(i).toString()));
                }
                i++;
            } catch (Exception e) {
                OTLogger.m143457l("IABHelper", "error in getting specialFeatureOptIns ids : " + e.getMessage());
            }
        }
        OTLogger.m143447b("IABHelper", "specialFeatureOptIns consent " + jSONArray.toString());
        return jSONArray;
    }

    @C0359n0
    /* renamed from: E */
    public String mo103870E(@C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        String str = "en";
        if (!jSONObject.has("Language") || jSONObject.isNull("Language")) {
            return str;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("Language");
        } catch (JSONException e) {
            OTLogger.m143457l("IABHelper", "Error while getting lang, err" + e.toString());
        }
        if (!C35020d.m143605J(jSONObject2.optString("Culture"))) {
            str = jSONObject2.optString("Culture");
        }
        return (str.length() <= 2 || !str.contains("-")) ? str : str.split("-")[0].toLowerCase(Locale.ENGLISH);
    }

    @C0344h1
    /* renamed from: F */
    public int mo103871F(@C0363p0 String str) {
        OTLogger.m143447b("IABHelper", "active vendorList = " + str);
        int i = 0;
        if (C35020d.m143605J(str)) {
            return 0;
        }
        JSONArray names = new JSONObject(str).names();
        if (names != null) {
            int i2 = 0;
            while (i < names.length()) {
                int parseInt = Integer.parseInt(names.getString(i));
                if (parseInt > i2) {
                    i2 = parseInt;
                }
                i++;
            }
            i = i2;
        }
        OTLogger.m143458m("IABHelper", "maximumVendorId = " + i);
        return i;
    }

    /* renamed from: G */
    public boolean mo103872G(@C0359n0 String str) {
        boolean z = false;
        if (!C35020d.m143605J(mo103868B(str)) && (mo103868B(str).equals("purposes") || mo103868B(str).equals("special_feature_opt_ins"))) {
            z = true;
        }
        OTLogger.m143447b("IABHelper", "IAB group " + str + " : " + z);
        return z;
    }

    /* renamed from: a */
    public int mo103873a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 C35014d dVar, boolean z) {
        boolean z2;
        String string = dVar.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
        try {
            z2 = new C35000d(this.f85114a).mo103932c(new C35015e(this.f85114a).mo104014z());
        } catch (JSONException e) {
            OTLogger.m143447b("IABHelper", "error on checking reconsent for IAB status, " + e.toString());
            z2 = false;
        }
        boolean equalsIgnoreCase = C30638a.C30639a.f73205n.equalsIgnoreCase(str3);
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getJSONObject(str2).has(str)) {
                return !z2 ? jSONObject.getJSONObject(str2).getInt(str) : equalsIgnoreCase;
            }
            if (!z) {
                return -1;
            }
            return equalsIgnoreCase;
        } catch (JSONException e2) {
            OTLogger.m143447b("IABHelper", "unable to get iab consent status" + e2.toString());
            return equalsIgnoreCase ? 1 : 0;
        }
    }

    /* renamed from: c */
    public String mo103874c() {
        String str;
        String string = new C35014d(this.f85114a, "OTT_DEFAULT_USER").mo103965b().getString("OT_IAB_ACTIVE_VENDORLIST", "");
        if (!C35020d.m143605J(string)) {
            str = "Saved IAB Active Vendor List : " + string;
        } else {
            str = "Vendor List is empty";
        }
        OTLogger.m143447b("IABHelper", str);
        return string;
    }

    @C0359n0
    /* renamed from: d */
    public Date mo103875d(@C0359n0 C35014d dVar) {
        Date h = C35020d.m143617h((Date) null);
        SharedPreferences.Editor edit = dVar.mo103965b().edit();
        edit.putString("OT_IAB_TCStr_LastUpdated", h.toString());
        edit.putLong("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS", h.getTime()).apply();
        OTLogger.m143447b("IABHelper", "Tc string updating date timestamp = " + h.getTime());
        return h;
    }

    @C0359n0
    /* renamed from: e */
    public Date mo103876e(@C0359n0 C35014d dVar, @C0363p0 Date date) {
        if (date == null) {
            date = C35020d.m143617h((Date) null);
        }
        SharedPreferences.Editor edit = dVar.mo103965b().edit();
        edit.putString("OT_IAB_TCStr_Created", date.toString());
        edit.putLong("OT_IAB_TC_STR_CREATED_IN_MILLISECONDS", date.getTime()).apply();
        OTLogger.m143447b("IABHelper", "Tc string Created date timestamp = " + date.getTime());
        return date;
    }

    /* renamed from: f */
    public JSONArray mo103877f(@C0359n0 String str) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            boolean g = new C34972e().mo103721g(new C35015e(this.f85114a).mo104014z());
            JSONObject jSONObject = new JSONObject(mo103874c());
            for (int i = 0; i < jSONObject.length(); i++) {
                String obj = jSONObject.names().get(i).toString();
                mo103881l(str, jSONArray, jSONArray2, jSONObject.getJSONObject(obj), obj, g);
            }
        } catch (Exception e) {
            OTLogger.m143457l("IABHelper", "error in getting vendor ids : " + e.getMessage());
        }
        OTLogger.m143447b("IABHelper", "vendor consent " + jSONArray.toString() + "vendor legInt " + jSONArray2.toString());
        return C35020d.m143605J(str) ? jSONArray : jSONArray2;
    }

    /* renamed from: h */
    public JSONArray mo103878h(@C0359n0 JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < jSONObject.length()) {
            try {
                if (jSONObject.getInt(jSONObject.names().get(i).toString()) != 0) {
                    jSONArray.put(Integer.parseInt(jSONObject.names().get(i).toString()));
                }
                i++;
            } catch (Exception e) {
                OTLogger.m143457l("IABHelper", "error in getting purpose ids : " + e.getMessage());
            }
        }
        OTLogger.m143447b("IABHelper", "purposes consent " + jSONArray.toString());
        return jSONArray;
    }

    /* renamed from: i */
    public JSONObject mo103879i(@C0359n0 Context context) {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Context context2;
        Context context3 = context;
        try {
            C35014d dVar = new C35014d(context3, "OTT_DEFAULT_USER");
            int i = dVar.mo103965b().getInt("OT_IAB_TCFPOLICY_VERSION", 0);
            int i2 = dVar.mo103965b().getInt("OT_DOMAIN_DATA_IAB_VENDOR_LIST_VERSION", 0);
            int i3 = dVar.mo103965b().getInt("OT_IAB_PURPOSEONETREATMENT", 1);
            Date d = mo103875d(dVar);
            Date e = mo103876e(dVar, d);
            String str2 = "IABHelper";
            try {
                JSONObject jSONObject3 = new JSONObject(dVar.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", ""));
                C35015e eVar = new C35015e(context3);
                JSONObject D = eVar.mo103969D();
                if (i2 == 0) {
                    C34972e.m143175c(dVar, D);
                    i2 = dVar.mo103965b().getInt("OT_DOMAIN_DATA_IAB_VENDOR_LIST_VERSION", 0);
                }
                JSONObject z = eVar.mo104014z();
                String E = mo103870E(z);
                jSONObject = new JSONObject();
                if (z.has("publisher")) {
                    JSONObject jSONObject4 = z.getJSONObject("publisher");
                    if (jSONObject4.has("restrictions")) {
                        jSONObject = jSONObject4.getJSONObject("restrictions");
                    }
                }
                jSONObject2 = new JSONObject();
                jSONObject2.put("Version", 2);
                jSONObject2.put("Created", e);
                jSONObject2.put("LastUpdated", d);
                jSONObject2.put("CmpId", Integer.parseInt(D.getJSONObject("IabV2Data").getString("cmpId")));
                jSONObject2.put("CmpVersion", Integer.parseInt(D.getJSONObject("IabV2Data").getString("cmpVersion")));
                jSONObject2.put("ConsentScreen", Integer.parseInt(D.getJSONObject("IabV2Data").getString("consentScreen")));
                jSONObject2.put("ConsentLanguage", E);
                jSONObject2.put("PublisherCC", D.optString("PublisherCC"));
                jSONObject2.put("VendorListVersion", i2);
                jSONObject2.put("TcfPolicyVersion", i);
                jSONObject2.put("PurposesConsent", mo103878h(jSONObject3.getJSONObject("purposes")));
                jSONObject2.put("PurposesLITransparency", mo103889z(jSONObject3.getJSONObject("purposeLegitimateInterests")));
                jSONObject2.put("SpecialFeatureOptins", mo103869C(jSONObject3.getJSONObject("special_feature_opt_ins")));
                jSONObject2.put("VendorConsents", mo103877f(""));
                jSONObject2.put("VendorLegitimateInterest", mo103877f("legInt"));
                jSONObject2.put("OOBVendorsAllowed", new JSONArray());
                jSONObject2.put("DisclosedVendors", new JSONArray());
                jSONObject2.put("AllowedVendors", new JSONArray());
                jSONObject2.put("NumCustomPurposes", 0);
                jSONObject2.put("CustomPurposesConsent", new JSONArray());
                jSONObject2.put("CustomPurposesLITransparency", new JSONArray());
                jSONObject2.put("PurposeOneTreatment", i3);
                jSONObject2.put("IsServiceSpecific", 1);
                jSONObject2.put("UseNonStandardStacks", 0);
                context2 = context;
                jSONObject2.put("gdprApplies", new C35020d().mo104023S(context2) ? 1 : 0);
                str = str2;
            } catch (Exception e2) {
                e = e2;
                str = str2;
                OTLogger.m143457l(str, "error while constructing IAB encoder input " + e.getMessage());
                return null;
            }
            try {
                OTLogger.m143458m(str, "PublisherRestrictions = " + jSONObject);
                jSONObject2.put("PublisherRestrictions", jSONObject);
                int F = mo103871F(mo103874c());
                OTLogger.m143458m(str, "maxVendorIDFromVendorList = " + F);
                jSONObject2.put("maxVendorIDFromVendorList", F);
                m143382m("IAB Encoder Input : ", jSONObject2);
                String g = C34969c0.m143069b().mo103651g(jSONObject2, context2);
                OTLogger.m143458m(str, "IAB Encoded String : " + g);
                m143382m("IAB Encoded Output : ", C34969c0.m143069b().mo103655t(context2));
                return null;
            } catch (Exception e3) {
                e = e3;
                OTLogger.m143457l(str, "error while constructing IAB encoder input " + e.getMessage());
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            str = "IABHelper";
            OTLogger.m143457l(str, "error while constructing IAB encoder input " + e.getMessage());
            return null;
        }
    }

    /* renamed from: j */
    public void mo103880j(@C0359n0 Context context, @C0359n0 String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int i;
        Context context2 = context;
        OTLogger.m143447b("IABHelper", "parsing vendor list");
        C35014d dVar = new C35014d(context2, "OTT_DEFAULT_USER");
        try {
            JSONObject jSONObject4 = new JSONObject(str);
            int i2 = jSONObject4.getInt("tcfPolicyVersion");
            C34972e.m143175c(dVar, new C35015e(context2).mo103969D());
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject4.getJSONObject("vendors");
            JSONObject jSONObject7 = jSONObject5;
            int i3 = i2;
            int i4 = 0;
            int i5 = dVar.mo103965b().getInt("OT_DOMAIN_DATA_IAB_VENDOR_LIST_VERSION", 0);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = jSONObject4;
            while (i4 < jSONObject6.length()) {
                if (C34972e.m143177h(jSONObject6, i4, i5)) {
                    i = i5;
                    jSONObject8.put(jSONObject6.names().get(i4).toString(), jSONObject6.getJSONObject(jSONObject6.names().get(i4).toString()));
                } else {
                    i = i5;
                }
                i4++;
                i5 = i;
            }
            String string = dVar.mo103965b().getString("OT_IAB_ACTIVE_VENDORLIST", "");
            JSONObject z = new C35015e(context2).mo104014z();
            boolean z2 = (!z.has("LegIntSettings") || z.isNull("LegIntSettings")) ? false : z.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
            if (C35020d.m143605J(string) || new OTPublishersHeadlessSDK(context2).shouldShowBanner()) {
                dVar.mo103965b().edit().putString("OT_IAB_DEFAULT_AVL", "").apply();
                jSONObject = jSONObject7;
            } else {
                jSONObject = new JSONObject(string);
            }
            JSONObject jSONObject10 = z.getJSONObject("OverriddenVendors");
            String string2 = z.getString("VendorConsentModel");
            JSONObject jSONObject11 = new JSONObject();
            if (z.has("publisher")) {
                JSONObject jSONObject12 = z.getJSONObject("publisher");
                if (jSONObject12.has("restrictions")) {
                    jSONObject11 = jSONObject12.getJSONObject("restrictions");
                }
            }
            OTLogger.m143458m("IABHelper", "IAB TCF Active Vendor list : " + jSONObject8.length() + " " + jSONObject8);
            mo103882p(jSONObject11, jSONObject8);
            OTLogger.m143458m("IABHelper", "IAB TCF Active Vendor list,  applied publisher restriction : " + jSONObject8.length() + " " + jSONObject8);
            if (jSONObject10.length() > 0) {
                OTLogger.m143447b("IABHelper", "domain id contains overridden vendors");
                JSONArray names = jSONObject10.names();
                if (names != null) {
                    mo103883q(jSONObject8, jSONObject10, names);
                    jSONObject3 = jSONObject8;
                    mo103885s(jSONObject8, jSONObject, jSONObject10, string2, z2);
                } else {
                    jSONObject3 = jSONObject8;
                }
                OTLogger.m143458m("IABHelper", "IAB TCF Active Vendor list, applied overridden  vendors rules : " + jSONObject3.length() + " " + jSONObject3);
                OTLogger.m143458m("IABHelper", "IAB TCF Active Vendor list,  applied toggle state : " + jSONObject3.length() + " " + jSONObject3);
                dVar.mo103965b().edit().putString("OT_IAB_ACTIVE_VENDORLIST", jSONObject3.toString()).apply();
                jSONObject2 = jSONObject3;
            } else {
                OTLogger.m143447b("IABHelper", "domain id using global vendor list");
                String str2 = string2;
                jSONObject2 = jSONObject8;
                mo103885s(jSONObject8, jSONObject, jSONObject10, str2, z2);
                OTLogger.m143458m("IABHelper", "IAB TCF Active Vendor list : " + jSONObject2.length() + " " + jSONObject2.toString());
                dVar.mo103965b().edit().putString("OT_IAB_ACTIVE_VENDORLIST", jSONObject2.toString()).apply();
            }
            m143381k(dVar, jSONObject2);
            dVar.mo103965b().edit().putString("OT_IAB_GLOBAL_VENDORLIST", jSONObject9.toString()).apply();
            dVar.mo103965b().edit().putInt("OT_IAB_TCFPOLICY_VERSION", i3).apply();
            C35015e eVar = new C35015e(dVar);
            C34991v vVar = new C34991v(context2);
            boolean z3 = vVar.mo103895j(eVar.mo103987V()) && vVar.mo103898p();
            boolean z4 = eVar.mo103981P() == 6;
            boolean w = eVar.mo104011w();
            if ((z3 && !w) || z4) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                String string3 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_VENDORCONSENTS, "");
                String string4 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_VENDORLEGITIMATEINTERESTS, "");
                OTLogger.m143447b("IABHelper", "Updating vendor array with status, vendorConsent = " + string3 + " , vendorLegitimateConsent = " + string4);
                vVar.mo103891c(string3, string4);
                vVar.mo103890b();
                if (z4) {
                    eVar.mo104003o(3);
                }
            }
        } catch (Exception e) {
            OTLogger.m143457l("IABHelper", "error while parsing Global vendor list : " + e.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo103881l(@C0359n0 String str, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject, @C0359n0 String str2, boolean z) {
        if (C35020d.m143605J(str)) {
            if (jSONObject.getInt(OTVendorUtils.CONSENT_TYPE) == 1) {
                jSONArray.put(Integer.parseInt(str2));
            }
        } else if (jSONObject.getInt(OTVendorUtils.LEGITIMATE_CONSENT_TYPE) == 1 || mo103888w(jSONObject, z)) {
            jSONArray2.put(Integer.parseInt(str2));
        }
    }

    /* renamed from: p */
    public final void mo103882p(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject.length() > 0) {
            OTLogger.m143447b("IABHelper", "domain id contains publisher restriction.");
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (int i = 0; i < names.length(); i++) {
                    mo103884r(jSONObject, jSONObject2, names, i);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo103883q(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (jSONObject.has(string)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(string);
                if (!jSONObject3.getBoolean(C30638a.C30639a.f73205n)) {
                    jSONObject.remove(string);
                } else {
                    m143384o(jSONObject, string, jSONObject3);
                }
            }
        }
    }

    @C0344h1
    /* renamed from: r */
    public void mo103884r(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray, int i) {
        JSONArray names;
        String str;
        String string = jSONArray.getString(i);
        JSONObject jSONObject3 = jSONObject.getJSONObject(string);
        if (jSONObject3.length() != 0 && (names = jSONObject3.names()) != null) {
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string2 = names.getString(i2);
                int i3 = jSONObject3.getInt(string2);
                if (i3 != 0) {
                    if (i3 == 1) {
                        if (jSONObject2.has(string2)) {
                            str = "purposes";
                        }
                    } else if (i3 == 2) {
                        str = "legIntPurposes";
                    }
                    m143383n(jSONObject2, string, string2, str);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo103885s(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str, boolean z) {
        JSONArray names;
        StringBuilder sb = new StringBuilder();
        sb.append("saved vendors");
        JSONObject jSONObject4 = jSONObject2;
        sb.append(jSONObject2);
        OTLogger.m143458m("IABHelper", sb.toString());
        OTLogger.m143458m("IABHelper", "overridden vendors" + jSONObject3);
        for (int i = 0; i < jSONObject.length() && (names = jSONObject.names()) != null; i++) {
            String obj = names.get(i).toString();
            JSONObject jSONObject5 = jSONObject;
            JSONObject jSONObject6 = jSONObject2;
            JSONObject jSONObject7 = jSONObject3;
            String str2 = str;
            boolean z2 = z;
            mo103886t(jSONObject5, jSONObject6, jSONObject7, str2, z2, -1, -1, obj);
            mo103887u(jSONObject5, jSONObject6, jSONObject7, str2, z2, obj);
        }
    }

    @C0344h1
    /* renamed from: t */
    public void mo103886t(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str, boolean z, int i, int i2, String str2) {
        int i3;
        int i4;
        JSONObject jSONObject4 = jSONObject;
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = jSONObject3;
        String str3 = str2;
        if (jSONObject3.has(str3)) {
            OTLogger.m143447b("IABHelper", "adding toggle status ");
            if (!jSONObject2.has(str3)) {
                String str4 = str;
                JSONObject jSONObject7 = jSONObject;
                JSONObject jSONObject8 = jSONObject3;
                String str5 = str2;
                i3 = m143379b(jSONObject7, jSONObject8, str5, OTVendorUtils.CONSENT_TYPE, "purposes", str.equals("opt-out") ? 1 : 0);
                i4 = m143379b(jSONObject7, jSONObject8, str5, "legInt", "legIntPurposes", 1);
            } else {
                int i5 = jSONObject3.getJSONObject(str3).getBoolean(OTVendorUtils.CONSENT_TYPE) ? jSONObject2.getJSONObject(str3).getInt(OTVendorUtils.CONSENT_TYPE) : i;
                i4 = jSONObject3.getJSONObject(str3).getBoolean("legInt") ? jSONObject2.getJSONObject(str3).getInt(OTVendorUtils.LEGITIMATE_CONSENT_TYPE) : i2;
                i3 = i5;
            }
            jSONObject.getJSONObject(str3).put(OTVendorUtils.CONSENT_TYPE, i3);
            m143385v(jSONObject, z, i4, str3);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0344h1
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103887u(@androidx.annotation.C0359n0 org.json.JSONObject r11, @androidx.annotation.C0359n0 org.json.JSONObject r12, @androidx.annotation.C0359n0 org.json.JSONObject r13, @androidx.annotation.C0359n0 java.lang.String r14, boolean r15, java.lang.String r16) {
        /*
            r10 = this;
            r6 = r11
            r0 = r13
            r7 = r16
            boolean r0 = r13.has(r7)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "opt-out"
            r1 = r14
            boolean r5 = r14.equals(r0)
            r8 = r12
            boolean r0 = r12.has(r7)
            if (r0 != 0) goto L_0x003d
            org.json.JSONObject r0 = r11.getJSONObject(r7)
            java.lang.String r1 = "purposes"
            org.json.JSONArray r0 = r0.getJSONArray(r1)
            int r0 = r0.length()
            r1 = -1
            if (r0 <= 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r5 = r1
        L_0x002b:
            org.json.JSONObject r0 = r11.getJSONObject(r7)
            java.lang.String r2 = "legIntPurposes"
            org.json.JSONArray r0 = r0.getJSONArray(r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0053
            r1 = 1
            goto L_0x0053
        L_0x003d:
            java.lang.String r3 = "consent"
            java.lang.String r4 = "purposes"
            r0 = r11
            r1 = r12
            r2 = r16
            int r9 = m143386x(r0, r1, r2, r3, r4, r5)
            java.lang.String r3 = "legIntStatus"
            java.lang.String r4 = "legIntPurposes"
            r5 = 1
            int r1 = m143386x(r0, r1, r2, r3, r4, r5)
            r5 = r9
        L_0x0053:
            org.json.JSONObject r0 = r11.getJSONObject(r7)
            java.lang.String r2 = "consent"
            r0.put(r2, r5)
            r0 = r15
            m143385v(r11, r15, r1, r7)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.C34990u.mo103887u(org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: w */
    public boolean mo103888w(@C0359n0 JSONObject jSONObject, boolean z) {
        return jSONObject.getJSONArray("purposes").length() == 0 && jSONObject.getJSONArray("legIntPurposes").length() == 0 && jSONObject.getJSONArray("specialPurposes").length() > 0 && z;
    }

    /* renamed from: z */
    public JSONArray mo103889z(@C0359n0 JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < jSONObject.length()) {
            try {
                if (jSONObject.getInt(jSONObject.names().get(i).toString()) != 0) {
                    jSONArray.put(Integer.parseInt(jSONObject.names().get(i).toString()));
                }
                i++;
            } catch (Exception e) {
                OTLogger.m143457l("IABHelper", "error in getting legInt ids : " + e.getMessage());
            }
        }
        OTLogger.m143447b("IABHelper", "legInt consent " + jSONArray.toString());
        return jSONArray;
    }
}
