package com.onetrust.otpublishers.headless.Internal;

import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.browser.customtabs.C0912d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.onetrust.otpublishers.headless.Internal.Helper.C34965a0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34969c0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34978j;
import com.onetrust.otpublishers.headless.Internal.Helper.C34981m;
import com.onetrust.otpublishers.headless.Internal.Helper.C34993x;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35013c;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTProfileSyncParams;
import com.onetrust.otpublishers.headless.Public.DataModel.OTSdkParams;
import com.onetrust.otpublishers.headless.Public.DataModel.OTUXParams;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTThemeConstants;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35081h;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35192b0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35201e0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35206f1;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35213h0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35217j;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35221k0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35249x0;
import com.onetrust.otpublishers.headless.p052UI.fragment.OTSDKListFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.d */
public class C35020d {
    /* renamed from: A */
    public static JSONArray m143599A(@C0359n0 JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != i) {
                jSONArray2.put(jSONArray.get(i2));
            }
        }
        return jSONArray2;
    }

    /* renamed from: B */
    public static void m143600B(@C0359n0 Context context, @C0359n0 String str) {
        String str2;
        try {
            new C0912d.C0913a().mo3920d().mo3916c(context, Uri.parse(str));
            return;
        } catch (ActivityNotFoundException unused) {
            str2 = "Could not load the url : URL passed may be invalid " + str;
        } catch (Exception unused2) {
            str2 = "Could not find class androidx.browser.customtabs.CustomTabsIntent$Builder, add implementation 'androidx.browser:browser:{version}' to gradle file";
        }
        OTLogger.m143457l("OneTrust", str2);
    }

    /* renamed from: C */
    public static boolean m143601C(@C0359n0 String str, @C0359n0 String str2) {
        return str.trim().equals(str2.trim());
    }

    @C0363p0
    /* renamed from: E */
    public static JSONObject m143602E(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            OTLogger.m143457l("OTUtils", "Error in converting stringJSONObjectValue : " + str + " to JSONObject. Error msg = " + e.getMessage());
            return null;
        }
    }

    /* renamed from: F */
    public static void m143603F(@C0359n0 Context context, @C0359n0 String str) {
        SharedPreferences.Editor edit = new C35013c(context).mo103965b().edit();
        edit.putString("OT_UX_SDK_THEME", str);
        edit.apply();
    }

    /* renamed from: G */
    public static boolean m143604G(@C0359n0 String str, @C0363p0 String str2) {
        if (!m143605J(str2)) {
            return new JSONObject(str2.toLowerCase()).has(str.toLowerCase());
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m143605J(@C0363p0 String str) {
        return str == null || str.length() == 0;
    }

    @C0359n0
    /* renamed from: K */
    public static OTSdkParams m143606K(@C0359n0 Context context) {
        SharedPreferences b = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
        String string = b.getString("OTT_SDK_API_VERSION", (String) null);
        String string2 = b.getString("OTT_REGION_CODE", (String) null);
        String string3 = b.getString("OTT_COUNTRY_CODE", (String) null);
        String string4 = b.getString("OTT_CREATE_CONSENT_PROFILE_STRING", (String) null);
        String string5 = b.getString("OTT_PROFILE_SYNC_PROFILE_STRING", (String) null);
        String string6 = b.getString("OTT_DATA_SUBJECT_IDENTIFIER", (String) null);
        String string7 = b.getString("OTT_PROFILE_SYNC_PROFILE_AUTH", (String) null);
        String string8 = b.getString("OTT_PROFILE_TENANT_ID", (String) null);
        String string9 = b.getString("OTT_PROFILE_SYNC_GROUP_ID", (String) null);
        OTProfileSyncParams.OTProfileSyncParamsBuilder newInstance = OTProfileSyncParams.OTProfileSyncParamsBuilder.newInstance();
        if (string5 != null) {
            newInstance = newInstance.setSyncProfile(string5);
        }
        if (string6 != null) {
            newInstance = newInstance.setIdentifier(string6);
        }
        if (string7 != null) {
            newInstance = newInstance.setSyncProfileAuth(string7);
        }
        if (string8 != null) {
            newInstance = newInstance.setTenantId(string8);
        }
        if (string9 != null) {
            newInstance = newInstance.setSyncGroupId(string9);
        }
        OTSdkParams.SdkParamsBuilder profileSyncParams = OTSdkParams.SdkParamsBuilder.newInstance().setProfileSyncParams(newInstance.build());
        if (string4 != null) {
            profileSyncParams = profileSyncParams.shouldCreateProfile(string4);
        }
        if (string != null) {
            profileSyncParams = profileSyncParams.setAPIVersion(string);
        }
        if (string2 != null) {
            profileSyncParams = profileSyncParams.setOTRegionCode(string2);
        }
        if (string3 != null) {
            profileSyncParams = profileSyncParams.setOTCountryCode(string3);
        }
        return profileSyncParams.build();
    }

    /* renamed from: N */
    public static boolean m143607N(@C0363p0 String str) {
        if (m143605J(str) || str.length() == 3) {
            return false;
        }
        return m143610R(str);
    }

    @C0359n0
    /* renamed from: P */
    public static SimpleDateFormat m143608P(String str) {
        return new SimpleDateFormat(str, Locale.getDefault(Locale.Category.FORMAT));
    }

    /* renamed from: Q */
    public static boolean m143609Q(@C0359n0 Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo == null) {
                return false;
            }
            boolean w = m143628w(packageInfo.requestedPermissions, "com.google.android.gms.permission.AD_ID");
            OTLogger.m143447b("GoogleAdInfo", "Is appRequestedGoogleAdPermission = " + w);
            return w;
        } catch (PackageManager.NameNotFoundException e) {
            OTLogger.m143457l("GoogleAdInfo", "Issue on reading PackageInfo for google ad permission. Error = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: R */
    public static boolean m143610R(@C0359n0 String str) {
        HashSet hashSet = new HashSet(Arrays.asList(Locale.getISOLanguages()));
        HashSet hashSet2 = new HashSet(Arrays.asList(Locale.getISOCountries()));
        HashSet hashSet3 = new HashSet(Arrays.asList(m143629x()));
        if (!str.contains("-")) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            return hashSet3.contains(lowerCase) || hashSet.contains(lowerCase);
        }
        try {
            String str2 = str.split("-")[1];
            Locale locale = Locale.ENGLISH;
            return hashSet.contains(str.split("-")[0].toLowerCase(locale)) && hashSet2.contains(str2.toUpperCase(locale));
        } catch (ArrayIndexOutOfBoundsException e) {
            OTLogger.m143447b("OTUtils", "Exception while validating language code, err: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: V */
    public static void m143611V(@C0359n0 Context context) {
        int i;
        C35015e eVar = new C35015e(context);
        if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
            OTLogger.m143458m("OneTrust", "SDK rendering on TV device");
            i = 101;
        } else {
            OTLogger.m143458m("OneTrust", "SDK rendering on mobile device");
            i = 102;
        }
        eVar.mo104007s(i);
    }

    /* renamed from: b */
    public static int m143612b(@C0363p0 String str, int i) {
        return !m143605J(str) ? str.length() : i;
    }

    /* renamed from: c */
    public static int m143613c(@C0359n0 JSONArray jSONArray, int i) {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (i == jSONArray.getInt(i2)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static Boolean m143614d(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4) {
        String str5 = str3.trim() + str4.trim();
        String str6 = str.trim() + str2.trim();
        OTLogger.m143458m("OTUtils", "OTT data parameters" + str5 + "," + str6);
        return Boolean.valueOf(!str5.equals(str6));
    }

    @C0363p0
    /* renamed from: f */
    public static Date m143615f(@C0359n0 String str) {
        try {
            return new Date(str);
        } catch (Exception e) {
            OTLogger.m143457l("OTUtils", "Error on converting tc string date on update, message = " + e.getMessage());
            return null;
        }
    }

    @C0363p0
    /* renamed from: g */
    public static Date m143616g(@C0359n0 String str, @C0359n0 String str2) {
        StringBuilder sb;
        String str3;
        try {
            return new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            e = e;
            sb = new StringBuilder();
            str3 = "Error on converting tc string date, message = ";
            sb.append(str3);
            sb.append(e.getMessage());
            OTLogger.m143457l("OTUtils", sb.toString());
            return null;
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder();
            str3 = "Error on converting date. Error msg = ";
            sb.append(str3);
            sb.append(e.getMessage());
            OTLogger.m143457l("OTUtils", sb.toString());
            return null;
        }
    }

    @C0359n0
    /* renamed from: h */
    public static Date m143617h(@C0363p0 Date date) {
        if (date == null) {
            date = new Date();
        }
        return new Date(date.getTime() - (date.getTime() % 86400000));
    }

    /* renamed from: j */
    public static void m143618j(@C0359n0 Context context, @C0359n0 C35014d dVar, @C0363p0 OTSdkParams oTSdkParams) {
        C35020d dVar2 = new C35020d();
        SharedPreferences.Editor edit = dVar.mo103965b().edit();
        if (oTSdkParams != null) {
            if (oTSdkParams.getCreateProfile() != null) {
                edit.putString("OTT_CREATE_CONSENT_PROFILE_STRING", oTSdkParams.getCreateProfile());
            }
            if (oTSdkParams.getOTCountryCode() != null) {
                edit.putString("OTT_COUNTRY_CODE", oTSdkParams.getOTCountryCode());
            }
            if (oTSdkParams.getOTRegionCode() != null) {
                edit.putString("OTT_REGION_CODE", oTSdkParams.getOTRegionCode());
            }
            if (oTSdkParams.getOTSdkAPIVersion() != null) {
                edit.putString("OTT_SDK_API_VERSION", oTSdkParams.getOTSdkAPIVersion());
            }
            edit.putString("OTT_BANNER_POSITION", oTSdkParams.getOtBannerHeight() != null ? oTSdkParams.getOtBannerHeight() : "");
            dVar2.mo104030n(context, oTSdkParams.getSyncWebSDKConsent());
            OTProfileSyncParams otProfileSyncParams = oTSdkParams.getOtProfileSyncParams();
            if (otProfileSyncParams != null) {
                if (otProfileSyncParams.getSyncProfile() != null) {
                    edit.putString("OTT_PROFILE_SYNC_PROFILE_STRING", otProfileSyncParams.getSyncProfile());
                }
                dVar2.mo104019I(context, otProfileSyncParams.getIdentifier());
                if (otProfileSyncParams.getSyncProfileAuth() != null) {
                    edit.putString("OTT_PROFILE_SYNC_PROFILE_AUTH", otProfileSyncParams.getSyncProfileAuth());
                }
                if (otProfileSyncParams.getTenantId() != null) {
                    edit.putString("OTT_PROFILE_TENANT_ID", otProfileSyncParams.getTenantId());
                }
                if (otProfileSyncParams.getSyncGroupId() != null) {
                    edit.putString("OTT_PROFILE_SYNC_GROUP_ID", otProfileSyncParams.getSyncGroupId());
                }
                OTLogger.m143447b("OTUtils", "OTSync Profile params : " + otProfileSyncParams.toString());
            }
            OTUXParams oTUXParams = oTSdkParams.getOTUXParams();
            if (oTUXParams != null) {
                if (oTUXParams.getUxParam() != null) {
                    m143620m(context, oTUXParams.getUxParam());
                }
                if (oTUXParams.getOTSDKTheme() != null) {
                    m143603F(context, oTUXParams.getOTSDKTheme());
                }
            }
        }
        edit.apply();
        OTLogger.m143458m("OTUtils", "saving OTSDK parameters to preferences");
    }

    /* renamed from: l */
    public static void m143619l(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0363p0 OTSdkParams oTSdkParams, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        String str4;
        C35014d dVar = new C35014d(context, "OTT_DEFAULT_USER");
        String string = dVar.mo103965b().getString("OTT_BLOBLOCATION", "");
        String string2 = dVar.mo103965b().getString("OTT_DOMAIN", "");
        String string3 = dVar.mo103965b().getString("OTT_LANG_CODE", "");
        Boolean d = m143614d(str, str2, string, string2);
        if (!m143605J(string) || !m143605J(string2) || !m143605J(string3)) {
            if (d.booleanValue()) {
                dVar.mo103964a();
                new C34978j(context).mo103760c();
                oTPublishersHeadlessSDK.reInitiateLocalVariable();
                m143621p(dVar, str, str2, str3);
                str4 = "OTT data parameters changed";
            } else {
                str4 = "OTT data parameters not changed";
            }
            OTLogger.m143458m("OTUtils", str4);
        } else {
            m143621p(dVar, str, str2, str3);
        }
        m143618j(context, dVar, oTSdkParams);
    }

    /* renamed from: m */
    public static void m143620m(@C0359n0 Context context, @C0359n0 JSONObject jSONObject) {
        SharedPreferences.Editor edit = new C35013c(context).mo103965b().edit();
        edit.putString("OTT_UX_PARAMS_JSON", jSONObject.toString());
        edit.apply();
    }

    /* renamed from: p */
    public static void m143621p(@C0359n0 C35014d dVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        SharedPreferences.Editor edit = dVar.mo103965b().edit();
        edit.putString("OTT_BLOBLOCATION", str);
        edit.putString("OTT_DOMAIN", str2);
        edit.putString("OTT_LANG_CODE", str3);
        edit.apply();
        OTLogger.m143458m("OTUtils", "saving init parameters to preferences");
    }

    /* renamed from: q */
    public static boolean m143622q(Fragment fragment, @C0359n0 String str) {
        if (str.equals("LAYER_1")) {
            return (fragment instanceof C35217j) || (fragment instanceof C35201e0) || (fragment instanceof C35081h);
        }
        if (str.equals("LAYER_2")) {
            return (fragment instanceof C35192b0) || (fragment instanceof C35249x0);
        }
        if (str.equals("LAYER_3")) {
            return (fragment instanceof C35206f1) || (fragment instanceof OTSDKListFragment) || (fragment instanceof C35213h0) || (fragment instanceof C35221k0);
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m143623r(@C0359n0 C19232h hVar) {
        return m143624s(hVar, OTFragmentTags.OT_BANNER_FRAGMENT_TAG) || m143624s(hVar, OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG) || m143624s(hVar, OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG);
    }

    /* renamed from: s */
    public static boolean m143624s(@C0359n0 C19232h hVar, @C0359n0 String str) {
        Fragment s0 = hVar.mo57175g0().mo56903s0(str);
        return m143622q(s0, "LAYER_1") || m143622q(s0, "LAYER_2") || m143622q(s0, "LAYER_3");
    }

    /* renamed from: t */
    public static boolean m143625t(@C0363p0 String str, boolean z) {
        return m143605J(str) ? z : Boolean.parseBoolean(str);
    }

    /* renamed from: u */
    public static boolean m143626u(@C0363p0 JSONObject jSONObject, @C0363p0 String str) {
        if (str == null || m143605J(str) || "0".equals(str)) {
            return false;
        }
        return jSONObject != null && jSONObject.has("ReconsentFrequencyDays") && ((int) TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - Long.parseLong(str))) >= jSONObject.optInt("ReconsentFrequencyDays", 0);
    }

    /* renamed from: v */
    public static boolean m143627v(boolean z, @C0363p0 JSONObject jSONObject, long j) {
        if (z && -1 != j) {
            int days = (int) TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j);
            if (jSONObject != null && jSONObject.has("IABReconsentFrequencyDays")) {
                try {
                    return days > jSONObject.getInt("IABReconsentFrequencyDays");
                } catch (JSONException e) {
                    OTLogger.m143457l("OTUtils", "Error on getting IAB reconsent frequency days,  message = " + e.getMessage());
                }
            }
        }
        return false;
    }

    @C0344h1
    /* renamed from: w */
    public static boolean m143628w(@C0363p0 String[] strArr, @C0359n0 String str) {
        if (strArr == null) {
            OTLogger.m143447b("OTUtils", "App requestedPermissionsList is empty.");
            return false;
        }
        for (String equalsIgnoreCase : strArr) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static String[] m143629x() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        String[] strArr = new String[(availableLocales.length + 1)];
        for (int i = 0; i < availableLocales.length; i++) {
            strArr[i] = availableLocales[i].toString().replace(C32920e.f79928l, "-").trim();
        }
        return strArr;
    }

    @C0363p0
    /* renamed from: z */
    public static String m143630z(@C0359n0 String str) {
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
            case 446779351:
                if (str.equals("IAB2_SPL_PURPOSE")) {
                    c = 3;
                    break;
                }
                break;
            case 1828983007:
                if (str.equals("IAB2_FEATURE")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "purposes";
            case 1:
                return "specialFeatures";
            case 2:
                return "stacks";
            case 3:
                return "specialPurposes";
            case 4:
                return "features";
            default:
                return null;
        }
    }

    @C0359n0
    /* renamed from: D */
    public String mo104017D(@C0359n0 Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(OTIABTCFKeys.IABTCF_TCSTRING, "");
        return m143605J(string) ? "" : string;
    }

    @C0363p0
    /* renamed from: H */
    public String mo104018H(@C0359n0 Context context) {
        return new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getString("OT_MOBILE_DATA_OVERRIDE_THEME", (String) null);
    }

    /* renamed from: I */
    public boolean mo104019I(@C0359n0 Context context, @C0363p0 String str) {
        if (str == null) {
            OTLogger.m143458m("OTUtils", "setDataSubjectIdentifier: Pass a valid identifier.");
            return false;
        }
        C34981m mVar = new C34981m(context);
        if (str.isEmpty()) {
            str = UUID.randomUUID().toString();
            OTLogger.m143458m("OTUtils", "Generated identifier = " + str);
            mVar.mo103782b(1);
        } else {
            mVar.mo103782b(2);
        }
        mVar.mo103788h(str);
        mVar.mo103791k();
        return true;
    }

    /* renamed from: L */
    public boolean mo104020L(@C0363p0 String str) {
        return str == null;
    }

    @C0359n0
    /* renamed from: M */
    public String mo104021M(@C0359n0 Context context) {
        String string = new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getString("OT_SCRIPT_TYPE", "");
        return m143605J(string) ? "" : string;
    }

    @C0359n0
    /* renamed from: O */
    public String mo104022O(@C0359n0 Context context) {
        String string = new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getString("OT_SYNC_GROUP_ID", "");
        return m143605J(string) ? "" : string;
    }

    /* renamed from: S */
    public boolean mo104023S(@C0359n0 Context context) {
        return new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getBoolean("IS_IAB2_TEMPLATE", false);
    }

    /* renamed from: T */
    public boolean mo104024T(@C0359n0 Context context) {
        boolean equalsIgnoreCase = OTThemeConstants.OT_THEME_APP_COMPACT_LIGHT_NO_ACTION_BAR.equalsIgnoreCase(new C34965a0().mo103629a(context));
        String H = mo104018H(context);
        if (m143605J(H)) {
            return equalsIgnoreCase;
        }
        OTLogger.m143447b("OTUtils", "Mobile data, overrideTheme = " + H);
        if (OTThemeConstants.NO_SDK_THEME_OVERRIDE.equalsIgnoreCase(H)) {
            return false;
        }
        if (OTThemeConstants.OT_THEME_APP_COMPACT_LIGHT_NO_ACTION_BAR.equalsIgnoreCase(H)) {
            return true;
        }
        return equalsIgnoreCase;
    }

    /* renamed from: U */
    public void mo104025U(Context context) {
        mo104029k(context, "OTT_DEFAULT_USER");
        new C34978j(context).mo103760c();
        if (!m143605J(C34969c0.m143069b().mo103655t(context).toString())) {
            C34969c0.m143069b().mo103653j(context);
        }
        mo104028i(context, -1);
    }

    @C0359n0
    /* renamed from: a */
    public int mo104026a(@C0359n0 Context context) {
        return new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getInt("OneTrustBannerShownToUser", -1);
    }

    @C0359n0
    /* renamed from: e */
    public String mo104027e(long j, boolean z, @C0359n0 TimeZone timeZone) {
        SimpleDateFormat P = m143608P(!z ? "EEE, dd MMM yyyy HH:mm:ss z" : "yyyy-MM-dd HH:mm:ss");
        P.setTimeZone(timeZone);
        Date date = new Date();
        date.setTime(j);
        return P.format(date);
    }

    @C0359n0
    /* renamed from: i */
    public void mo104028i(@C0359n0 Context context, int i) {
        new C35014d(context, "OTT_DEFAULT_USER").mo103965b().edit().putInt("OneTrustBannerShownToUser", i).apply();
    }

    /* renamed from: k */
    public void mo104029k(@C0359n0 Context context, @C0359n0 String str) {
        new C35014d(context, str).mo103964a();
    }

    /* renamed from: n */
    public void mo104030n(@C0359n0 Context context, boolean z) {
        C35015e eVar = new C35015e(context);
        if (!z) {
            eVar.mo104003o(5);
            OTLogger.m143458m("OTUtils", "syncWebSDKConsent Disabled.");
        } else if (!m143601C(eVar.mo104002n(), new C34993x(context).mo103911j())) {
            eVar.mo104003o(4);
            OTLogger.m143461p("OneTrust", "No data found in Web SDK for the domain id passed. Hence cannot sync Web SDK consent data. \nTo sync Web SDK consent data, please pass same appID as Web SDK.");
        } else if (eVar.mo103981P() != 3) {
            eVar.mo104003o(0);
            OTLogger.m143458m("OneTrust", "Configured for Syncing data from Web SDK");
        }
    }

    /* renamed from: o */
    public void mo104031o(@C0359n0 C35014d dVar, @C0359n0 String str) {
        dVar.mo103965b().edit().putString("OT_MOBILE_DATA_OVERRIDE_THEME", str).apply();
    }

    @C0359n0
    /* renamed from: y */
    public String mo104032y(@C0359n0 Context context) {
        return new C35014d(context, "OTT_DEFAULT_USER").mo103965b().getString("OTT_CONSENT_STATUS", "");
    }
}
