package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.C0359n0;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.google.android.material.badge.C31132a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.c0 */
public class C34969c0 {

    /* renamed from: a */
    public static C34969c0 f85072a;

    /* renamed from: b */
    public static ArrayList<String> f85073b;

    /* renamed from: a */
    public static int m143068a(JSONArray jSONArray) {
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                if (jSONArray.getInt(i2) > i) {
                    i = jSONArray.getInt(i2);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("TCF2Encoder", "error while getting max int : " + e.getMessage());
            }
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized C34969c0 m143069b() {
        C34969c0 c0Var;
        synchronized (C34969c0.class) {
            if (f85072a == null) {
                f85072a = new C34969c0();
                f85073b = new ArrayList<>(Arrays.asList(new String[]{"IABTCF_CmpSdkID.int", "IABTCF_CmpSdkVersion.int", "IABTCF_PolicyVersion.int", "IABTCF_gdprApplies.int", "IABTCF_PublisherCC.string", "IABTCF_PurposeOneTreatment.int", "IABTCF_UseNonStandardStacks.int", "IABTCF_TCString.string", "IABTCF_VendorConsents.string", "IABTCF_VendorLegitimateInterests.string", "IABTCF_PurposeConsents.string", "IABTCF_PurposeLegitimateInterests.string", "IABTCF_SpecialFeaturesOptIns.string", "IABTCF_PublisherConsent.string", "IABTCF_PublisherLegitimateInterests.string", "IABTCF_PublisherCustomPurposesConsents.string", "IABTCF_PublisherCustomPurposesLegitimateInterests.string", "IABTCF_PublisherRestrictions1.string", "IABTCF_PublisherRestrictions2.string", "IABTCF_PublisherRestrictions3.string", "IABTCF_PublisherRestrictions4.string", "IABTCF_PublisherRestrictions5.string", "IABTCF_PublisherRestrictions6.string", "IABTCF_PublisherRestrictions7.string", "IABTCF_PublisherRestrictions8.string", "IABTCF_PublisherRestrictions9.string", "IABTCF_PublisherRestrictions10.string"}));
            }
            c0Var = f85072a;
        }
        return c0Var;
    }

    /* renamed from: c */
    public static String m143070c(Integer num, Integer num2) {
        String binaryString = Integer.toBinaryString(num.intValue());
        StringBuilder sb = new StringBuilder();
        for (int intValue = num2.intValue() - binaryString.length(); intValue > 0; intValue--) {
            sb.append('0');
        }
        sb.append(binaryString);
        return sb.toString();
    }

    @C0359n0
    /* renamed from: d */
    public static String m143071d(Long l, Integer num) {
        String binaryString = Long.toBinaryString(l.longValue());
        StringBuilder sb = new StringBuilder();
        for (int intValue = num.intValue() - binaryString.length(); intValue > 0; intValue--) {
            sb.append('0');
        }
        sb.append(binaryString);
        return sb.toString();
    }

    /* renamed from: e */
    public static String m143072e(String str) {
        int length = str.length() % 8;
        if (length > 0) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 8 - length; i > 0; i--) {
                sb.append('0');
            }
            str = sb.toString();
        }
        int length2 = str.length() / 8;
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = i2 * 8;
            bArr[i2] = Integer.valueOf(Integer.parseInt(str.substring(i3, i3 + 8), 2)).byteValue();
        }
        return new String(Base64.encode(bArr, 2)).replace(C31132a.f74628J0, "-").replace("/", C32920e.f79928l).replace("=", "");
    }

    @C0359n0
    /* renamed from: f */
    public static String m143073f(@C0359n0 Date date, @C0359n0 Integer num) {
        return m143071d(Long.valueOf(date.getTime() / 100), num);
    }

    /* renamed from: i */
    public static JSONArray m143074i(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            int length = jSONObject.length();
            for (int i = 0; i < length; i++) {
                String string = jSONObject.names().getString(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("purposeID", string);
                jSONObject2.put("0", new JSONArray());
                jSONObject2.put("1", new JSONArray());
                jSONObject2.put("2", new JSONArray());
                JSONObject jSONObject3 = (JSONObject) jSONObject.get(string);
                for (int i2 = 0; i2 < jSONObject3.length(); i2++) {
                    String string2 = jSONObject3.names().getString(i2);
                    jSONObject2.getJSONArray(jSONObject3.getString(string2)).put(Integer.valueOf(string2));
                }
                jSONArray2.put(jSONObject2);
            }
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                m143078n(jSONArray, jSONObject4, jSONObject4.getString("purposeID"));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("TCF2Encoder", "error while organizePublisherRestrictions : " + e.getMessage());
        }
        return jSONArray;
    }

    /* renamed from: k */
    public static void m143075k(SharedPreferences.Editor editor) {
        editor.remove("IABTCF_PublisherRestrictions1");
        editor.remove("IABTCF_PublisherRestrictions2");
        editor.remove("IABTCF_PublisherRestrictions3");
        editor.remove("IABTCF_PublisherRestrictions4");
        editor.remove("IABTCF_PublisherRestrictions5");
        editor.remove("IABTCF_PublisherRestrictions6");
        editor.remove("IABTCF_PublisherRestrictions7");
        editor.remove("IABTCF_PublisherRestrictions8");
        editor.remove("IABTCF_PublisherRestrictions9");
        editor.remove("IABTCF_PublisherRestrictions10");
        editor.apply();
    }

    /* renamed from: l */
    public static void m143076l(@C0359n0 ArrayList<String> arrayList, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < jSONObject.length(); i++) {
            String string = jSONObject.names().getString(i);
            String string2 = jSONObject.getString(string);
            int parseInt = Integer.parseInt(string) - 1;
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                arrayList.set(parseInt, string2);
            }
        }
    }

    /* renamed from: m */
    public static void m143077m(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        jSONArray2.put(m143070c(Integer.valueOf(jSONObject.getString("purposeID")), 6));
                        jSONArray2.put(m143070c(Integer.valueOf(jSONObject.getInt("restrictionType")), 2));
                        JSONArray jSONArray3 = jSONObject.getJSONArray("vendors");
                        jSONArray2.put(m143070c(Integer.valueOf(jSONArray3.length()), 12));
                        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                            jSONArray2.put(m143070c(0, 1));
                            jSONArray2.put(m143070c(Integer.valueOf(jSONArray3.getInt(i2)), 16));
                        }
                    }
                }
            } catch (JSONException e) {
                OTLogger.m143457l("TCF2Encoder", "error while encodePublisherRestrictionsWithData : " + e.getMessage());
            }
        }
    }

    /* renamed from: n */
    public static void m143078n(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        for (int i = 0; i < 3; i++) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(String.valueOf(i));
            if (jSONArray2.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("purposeID", str);
                jSONObject2.put("restrictionType", i);
                jSONObject2.put("vendors", jSONArray2);
                jSONArray.put(jSONObject2);
            }
        }
    }

    /* renamed from: o */
    public static void m143079o(JSONObject jSONObject, int i, SharedPreferences.Editor editor) {
        try {
            m143075k(editor);
            int length = jSONObject.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONObject.names().getString(i2);
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(C32920e.f79928l);
                }
                m143076l(arrayList, (JSONObject) jSONObject.get(string));
                editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERRESTRICTIONS + string, TextUtils.join("", arrayList));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("TCF2Encoder", "error while write_IABTCF_PublisherRestrictions_toDisk : " + e.getMessage());
        } catch (Exception e2) {
            OTLogger.m143458m("error while write_IABTCF_PublisherRestrictions_toDisk ex: ", e2.toString());
        }
    }

    /* renamed from: p */
    public static boolean m143080p(JSONArray jSONArray, Integer num) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                if (jSONArray.getInt(i) == num.intValue()) {
                    return true;
                }
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("TCF2Encoder", "error while getting Array Integer : " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: q */
    public static String m143081q(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"A", EnergyLabelKt.f67707e, EnergyLabelKt.f67708f, EnergyLabelKt.f67709g, "E", EnergyLabelKt.f67711i, EnergyLabelKt.f67712j, "H", "I", "J", "K", C37106a.f92899d, "M", "N", "O", "P", "Q", "R", C19135a.f48823R4, C19135a.f48928d5, C37106a.f92903h, C19135a.f48877X4, C19135a.f48841T4, "X", "Y", "Z"}));
        for (int i = 0; i < upperCase.length(); i++) {
            sb.append(m143070c(Integer.valueOf(arrayList.indexOf(String.valueOf(upperCase.charAt(i)))), 6));
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m143082r(JSONArray jSONArray, Integer num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < num.intValue()) {
            i++;
            sb.append(m143080p(jSONArray, Integer.valueOf(i)) ? "1" : "0");
        }
        return sb.toString();
    }

    /* renamed from: g */
    public String mo103651g(JSONObject jSONObject, Context context) {
        SharedPreferences.Editor editor = null;
        try {
            editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
            String str = mo103652h(jSONObject, editor) + "." + mo103654s(jSONObject, editor);
            editor.putString(OTIABTCFKeys.IABTCF_TCSTRING, str);
            editor.apply();
            return str;
        } catch (Throwable th) {
            if (editor != null) {
                editor.apply();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final String mo103652h(JSONObject jSONObject, SharedPreferences.Editor editor) {
        editor.putInt(OTIABTCFKeys.IABTCF_GDPRAPPLIES, jSONObject.getInt("gdprApplies"));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("Version")), 6));
        jSONArray.put(m143073f((Date) jSONObject.get("Created"), 36));
        jSONArray.put(m143073f((Date) jSONObject.get("LastUpdated"), 36));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("CmpId")), 12));
        editor.putInt(OTIABTCFKeys.IABTCF_CMPSDKID, jSONObject.getInt("CmpId"));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("CmpVersion")), 12));
        editor.putInt(OTIABTCFKeys.IABTCF_CMPSDKVERSION, jSONObject.getInt("CmpVersion"));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("ConsentScreen")), 6));
        jSONArray.put(m143081q(jSONObject.getString("ConsentLanguage")));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("VendorListVersion")), 12));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("TcfPolicyVersion")), 6));
        editor.putInt(OTIABTCFKeys.IABTCF_POLICYVERSION, jSONObject.getInt("TcfPolicyVersion"));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("IsServiceSpecific")), 1));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("UseNonStandardStacks")), 1));
        editor.putInt(OTIABTCFKeys.IABTCF_USENONSTANDARDSTACKS, jSONObject.getInt("UseNonStandardStacks"));
        jSONArray.put(m143082r(jSONObject.getJSONArray("SpecialFeatureOptins"), 12));
        editor.putString(OTIABTCFKeys.IABTCF_SPECIALFEATURESOPTINS, jSONArray.getString(jSONArray.length() - 1));
        jSONArray.put(m143082r(jSONObject.getJSONArray("PurposesConsent"), 24));
        editor.putString(OTIABTCFKeys.IABTCF_PURPOSECONSENTS, jSONArray.getString(jSONArray.length() - 1));
        editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCONSENT, jSONArray.getString(jSONArray.length() - 1));
        jSONArray.put(m143082r(jSONObject.getJSONArray("PurposesLITransparency"), 24));
        editor.putString(OTIABTCFKeys.IABTCF_PURPOSELEGITIMATEINTERESTS, jSONArray.getString(jSONArray.length() - 1));
        editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERLEGITIMATEINTERESTS, jSONArray.getString(jSONArray.length() - 1));
        jSONArray.put(m143070c(Integer.valueOf(jSONObject.getInt("PurposeOneTreatment")), 1));
        editor.putInt(OTIABTCFKeys.IABTCF_PURPOSEONETREATMENT, jSONObject.getInt("PurposeOneTreatment"));
        jSONArray.put(m143081q(jSONObject.getString("PublisherCC")));
        editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCC, jSONObject.getString("PublisherCC"));
        Integer valueOf = Integer.valueOf(m143068a(jSONObject.getJSONArray("VendorConsents")));
        jSONArray.put(m143070c(valueOf, 16));
        jSONArray.put(m143070c(0, 1));
        jSONArray.put(m143082r(jSONObject.getJSONArray("VendorConsents"), valueOf));
        editor.putString(OTIABTCFKeys.IABTCF_VENDORCONSENTS, jSONArray.getString(jSONArray.length() - 1));
        Integer valueOf2 = Integer.valueOf(m143068a(jSONObject.getJSONArray("VendorLegitimateInterest")));
        jSONArray.put(m143070c(valueOf2, 16));
        jSONArray.put(m143070c(0, 1));
        jSONArray.put(m143082r(jSONObject.getJSONArray("VendorLegitimateInterest"), valueOf2));
        editor.putString(OTIABTCFKeys.IABTCF_VENDORLEGITIMATEINTERESTS, jSONArray.getString(jSONArray.length() - 1));
        JSONArray i = m143074i(jSONObject.getJSONObject("PublisherRestrictions"));
        jSONArray.put(m143070c(Integer.valueOf(i.length()), 12));
        if (i.length() > 0) {
            m143077m(i, jSONArray);
        }
        m143079o(jSONObject.getJSONObject("PublisherRestrictions"), jSONObject.getInt("maxVendorIDFromVendorList"), editor);
        return m143072e(jSONArray.toString().replace(",", "").replace("\"", "").replace("[", "").replace("]", ""));
    }

    /* renamed from: j */
    public void mo103653j(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        Iterator<String> it = f85073b.iterator();
        String str = "";
        while (it.hasNext()) {
            String next = it.next();
            String str2 = ".int";
            if (!next.endsWith(str2)) {
                str2 = ".string";
                if (!next.endsWith(str2)) {
                    edit.remove(str);
                }
            }
            str = next.replace(str2, "");
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: s */
    public final String mo103654s(JSONObject jSONObject, SharedPreferences.Editor editor) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m143070c(3, 3));
        jSONArray.put(m143082r(jSONObject.getJSONArray("PurposesConsent"), 24));
        jSONArray.put(m143082r(jSONObject.getJSONArray("PurposesLITransparency"), 24));
        int i = jSONObject.getInt("NumCustomPurposes");
        jSONArray.put(m143070c(Integer.valueOf(i), 6));
        if (i > 0) {
            jSONArray.put(m143082r(jSONObject.getJSONArray("CustomPurposesConsent"), Integer.valueOf(i)));
            editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESCONSENTS, jSONArray.getString(jSONArray.length() - 1));
            jSONArray.put(m143082r(jSONObject.getJSONArray("CustomPurposesLITransparency"), Integer.valueOf(i)));
            editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESLEGITIMATEINTERESTS, jSONArray.getString(jSONArray.length() - 1));
        } else {
            editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESCONSENTS, "");
            editor.putString(OTIABTCFKeys.IABTCF_PUBLISHERCUSTOMPURPOSESLEGITIMATEINTERESTS, "");
        }
        return m143072e(jSONArray.toString().replace(",", "").replace("\"", "").replace("[", "").replace("]", ""));
    }

    /* renamed from: t */
    public JSONObject mo103655t(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = f85073b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                if (next.endsWith(".int")) {
                    String replace = next.replace(".int", "");
                    jSONObject.put(replace, defaultSharedPreferences.getInt(replace, -1));
                } else if (next.endsWith(".string")) {
                    String replace2 = next.replace(".string", "");
                    jSONObject.put(replace2, defaultSharedPreferences.getString(replace2, ""));
                }
            } catch (JSONException e) {
                OTLogger.m143457l("TCF2Encoder", "error while getting all string : " + e.getMessage());
            }
        }
        return jSONObject;
    }
}
