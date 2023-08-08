package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40928r;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C34997a;
import com.onetrust.otpublishers.headless.Internal.Models.C34998b;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.f */
public class C34974f {

    /* renamed from: a */
    public C35014d f85086a;

    public C34974f(@C0359n0 C35014d dVar) {
        this.f85086a = dVar;
    }

    @C0359n0
    /* renamed from: a */
    public static String m143188a(@C0359n0 Context context) {
        C34981m mVar = new C34981m(context);
        if (!C35020d.m143605J(mVar.mo103790j())) {
            return mVar.mo103790j();
        }
        String uuid = UUID.randomUUID().toString();
        mVar.mo103788h(uuid);
        mVar.mo103782b(1);
        return uuid;
    }

    @C0363p0
    /* renamed from: c */
    public static JSONObject m143189c(@C0359n0 JSONObject jSONObject) {
        if (!jSONObject.has("googleAd")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("googleAd");
        if (jSONObject2.has(OTVendorListMode.GENERAL)) {
            return jSONObject2.getJSONObject(OTVendorListMode.GENERAL);
        }
        return null;
    }

    /* renamed from: g */
    public static void m143190g(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONArray.getJSONObject(i).has("SubGroups")) {
            jSONArray.getJSONObject(i).getJSONArray("SubGroups").put(jSONObject);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject);
        jSONArray.getJSONObject(i).put("SubGroups", jSONArray2);
    }

    /* renamed from: h */
    public static void m143191h(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i, boolean z) {
        if ((jSONObject.getBoolean("IsIabPurpose") && jSONObject.getBoolean("ShowInPopup") && C34976h.m143224k(jSONObject, z)) || jSONObject.getJSONArray("FirstPartyCookies").length() > 0) {
            m143190g(jSONArray, jSONObject, i);
        }
    }

    /* renamed from: j */
    public static void m143192j(@C0359n0 JSONObject jSONObject, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ucPurposesData");
            C34964a ucpHandler = oTPublishersHeadlessSDK.getUcpHandler();
            ucpHandler.mo103600M(jSONObject2);
            ucpHandler.mo103592E();
        } catch (JSONException e) {
            OTLogger.m143457l("AppDataParser", "Error in parseUCPData :" + e.getMessage());
        }
    }

    /* renamed from: o */
    public static void m143193o(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject, @C0359n0 C34988t tVar, boolean z2, boolean z3) {
        if (z2) {
            String d = tVar.mo103855d(z, sharedPreferences, jSONObject);
            if (!C35020d.m143605J(d) && z3) {
                OTLogger.m143447b("AppDataParser", "IAB template and google vendors enabled, fetching global google vendors from url : " + d);
                tVar.mo103863m(d);
            }
        } else if (z3) {
            tVar.mo103856f();
        }
    }

    @C0363p0
    /* renamed from: r */
    public static JSONObject m143194r(@C0359n0 JSONObject jSONObject) {
        JSONObject c;
        try {
            if (!jSONObject.has("prompts") || (c = m143189c(jSONObject.getJSONObject("prompts"))) == null) {
                return null;
            }
            return c;
        } catch (JSONException e) {
            OTLogger.m143458m("AppDataParser", "Error in  parse GoogleAddGeneralData , message = " + e.getMessage());
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public String mo103722b(@C0359n0 String str) {
        if (C35020d.m143605J(str)) {
            return "";
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("culture");
            if (optJSONObject.has("OTTData")) {
                return optJSONObject.optJSONObject("OTTData").toString();
            }
            return null;
        } catch (JSONException e) {
            OTLogger.m143457l("AppDataParser", "error while parsing OTT data, err : " + e.getMessage());
            return "";
        }
    }

    @C0359n0
    /* renamed from: d */
    public JSONObject mo103723d(@C0359n0 JSONObject jSONObject, boolean z) {
        try {
            if (jSONObject.getJSONObject("culture").has("DomainData") && jSONObject.getJSONObject("culture").getJSONObject("DomainData").has("Groups")) {
                mo103734t(jSONObject, z);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("AppDataParser", "error while formatting groups with err = " + e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: e */
    public void mo103724e(@C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(C40928r.f104100a)) {
            sharedPreferences.edit().putString("OT_PROFILE_DATA", jSONObject.getJSONObject(C40928r.f104100a).toString()).apply();
        }
    }

    /* renamed from: f */
    public void mo103725f(@C0359n0 String str, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("culture")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("culture");
                if (jSONObject2.has("MobileData")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("MobileData");
                    mo103736v(jSONObject3);
                    m143192j(jSONObject3, oTPublishersHeadlessSDK);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143458m("AppDataParser", "Error in parseMobileData , message = " + e.getMessage());
        }
    }

    /* renamed from: i */
    public final void mo103726i(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 String str, boolean z) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (str.equals(jSONArray.getJSONObject(i).optString("CustomGroupId"))) {
                    m143191h(jSONArray, jSONObject, i, z);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("AppDataParser", "error while moving subgroups with err = " + e.getMessage());
            }
        }
    }

    /* renamed from: k */
    public void mo103727k(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, @C0359n0 Context context) {
        String str;
        C34997a aVar = new C34997a();
        C34998b bVar = new C34998b();
        if (jSONObject.getJSONObject("culture").getJSONObject("CommonData").has("ConsentIntegration")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("culture").getJSONObject("CommonData").getJSONObject("ConsentIntegration");
            if (jSONObject2.optString("ConsentApi") != null) {
                bVar.mo103921b(m143188a(context));
                bVar.mo103922c(jSONArray);
                bVar.mo103924e(jSONObject2.optString("RequestInformation"));
                aVar.mo103918c(jSONObject2.optString("ConsentApi"));
                aVar.mo103917b(bVar);
                try {
                    new C34981m(context).mo103784d(aVar);
                } catch (Exception unused) {
                    str = "could not construct consent logging data";
                }
            } else {
                str = "error while constructing consent payload";
                OTLogger.m143458m("AppDataParser", str);
            }
        }
    }

    /* renamed from: l */
    public void mo103728l(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("CommonData")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("CommonData");
            sharedPreferences.edit().putString("OTT_CULTURE_COMMON_DATA", jSONObject2.toString()).apply();
            mo103732q(z, "common data : ", jSONObject2.toString());
        }
    }

    /* renamed from: m */
    public void mo103729m(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject, @C0359n0 Context context, C35015e eVar) {
        if (jSONObject.has("MobileData")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("MobileData");
            sharedPreferences.edit().putString("OT_MOBILE_DATA", jSONObject2.toString()).apply();
            new C34983o(context).mo103833f(jSONObject2, eVar);
            mo103732q(z, "mobile data json : ", jSONObject2.toString());
        }
    }

    /* renamed from: n */
    public void mo103730n(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject, @C0359n0 Context context, @C0359n0 C35015e eVar, boolean z2) {
        if (jSONObject.has("domain")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("domain");
            sharedPreferences.edit().putString("OTT_DOMAIN_DATA", jSONObject2.toString()).apply();
            mo103732q(z, "domain info : ", jSONObject.getJSONObject("domain").toString());
            mo103737w(z, sharedPreferences, jSONObject2);
            mo103735u(z, sharedPreferences, jSONObject2);
            C34988t tVar = new C34988t(context);
            boolean u = tVar.mo103867u(eVar.mo103982Q());
            OTLogger.m143447b("AppDataParser", "Is google vendors enabled ? = " + u);
            this.f85086a.mo103965b().edit().putBoolean("OT_GOOGLE_VENDORS_ENABLED_STATE", u).apply();
            m143193o(z, sharedPreferences, jSONObject2, tVar, u, z2);
        }
    }

    /* renamed from: p */
    public void mo103731p(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject, @C0359n0 C35000d dVar) {
        if (jSONObject.has("DomainData")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("DomainData");
            mo103732q(z, "culture data : ", jSONObject2.toString());
            sharedPreferences.edit().putString("OTT_CULTURE_DOMAIN_DATA", jSONObject2.toString()).apply();
            if (jSONObject2.has("LastReconsentDate")) {
                dVar.mo103935f(jSONObject2);
            }
        }
    }

    /* renamed from: q */
    public void mo103732q(boolean z, @C0359n0 String str, @C0359n0 String str2) {
        if (z) {
            OTLogger.m143447b("AppDataParser", str + str2);
        }
    }

    /* renamed from: s */
    public void mo103733s(@C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("status")) {
            sharedPreferences.edit().putString("OT_API_FETCH_STATUS_DATA", jSONObject.getJSONObject("status").toString()).apply();
        }
    }

    /* renamed from: t */
    public final void mo103734t(@C0359n0 JSONObject jSONObject, boolean z) {
        JSONArray jSONArray = jSONObject.getJSONObject("culture").getJSONObject("DomainData").getJSONArray("Groups");
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!jSONArray.getJSONObject(i).getString("Parent").isEmpty()) {
                mo103726i(jSONArray, jSONArray.getJSONObject(i), jSONArray.getJSONObject(i).getString("Parent"), z);
            }
        }
    }

    /* renamed from: u */
    public final void mo103735u(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("ScriptType")) {
            String string = jSONObject.getString("ScriptType");
            sharedPreferences.edit().putString("OT_SCRIPT_TYPE", string).apply();
            mo103732q(z, "SCRIPT_TYPE ", string);
        }
    }

    /* renamed from: v */
    public final void mo103736v(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("CustomJSON")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("CustomJSON");
            if (jSONObject2.has("OverrideTheme")) {
                String string = jSONObject2.getString("OverrideTheme");
                OTLogger.m143458m("AppDataParser", "Mobile data, override theme = " + string);
                new C35020d().mo104031o(this.f85086a, string);
            }
        }
    }

    /* renamed from: w */
    public final void mo103737w(boolean z, @C0359n0 SharedPreferences sharedPreferences, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("SyncGroupId") && !jSONObject.isNull("SyncGroupId")) {
            mo103732q(z, "Sync groupID : ", jSONObject.get("SyncGroupId").toString());
            sharedPreferences.edit().putString("OT_SYNC_GROUP_ID", jSONObject.get("SyncGroupId").toString()).apply();
        }
    }
}
