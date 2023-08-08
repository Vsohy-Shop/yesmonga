package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTGeolocationModel;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABCCPAKeys;
import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import com.urbanairship.AirshipConfigOptions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.j */
public class C34978j {

    /* renamed from: a */
    public Context f85089a;

    /* renamed from: b */
    public C35014d f85090b;

    /* renamed from: c */
    public SharedPreferences f85091c;

    public C34978j(@C0359n0 Context context) {
        this.f85089a = context;
        this.f85091c = PreferenceManager.getDefaultSharedPreferences(context);
        this.f85090b = new C35014d(context, "OTT_DEFAULT_USER");
    }

    /* renamed from: i */
    public static boolean m143239i(@C0359n0 OTGeolocationModel oTGeolocationModel, @C0359n0 String str, boolean z) {
        String str2 = oTGeolocationModel.country;
        String str3 = oTGeolocationModel.state;
        OTLogger.m143447b("IABCCPA_Consent", "bannerLoaded country = " + str2 + " state = " + str3);
        if (C35020d.m143605J(str2)) {
            return z;
        }
        OTLogger.m143458m("IABCCPA_Consent", "Initialized location for CCPA = " + str);
        if ((!OTCCPAGeolocationConstants.f85214CA.equalsIgnoreCase(str) || (AirshipConfigOptions.f87117e0.equalsIgnoreCase(str2) && "CA".equalsIgnoreCase(str3))) && (!OTCCPAGeolocationConstants.f85215US.equalsIgnoreCase(str) || AirshipConfigOptions.f87117e0.equalsIgnoreCase(str2))) {
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public final StringBuilder mo103758a(boolean z) {
        StringBuilder sb = new StringBuilder("1---");
        char c = 'Y';
        sb.setCharAt(1, this.f85090b.mo103965b().getBoolean("OTT_EXPLICIT_NOTICE", false) ? 'Y' : 'N');
        sb.setCharAt(3, this.f85090b.mo103965b().getBoolean("OTT_AGREEMENT_TERMS_APPLIES", false) ? 'Y' : 'N');
        if (!new C35015e(this.f85089a).mo104008t(mo103768l())) {
            if (z) {
                c = 'N';
            }
            sb.setCharAt(2, c);
        } else {
            sb.setCharAt(2, 'N');
        }
        return sb;
    }

    /* renamed from: b */
    public final JSONArray mo103759b(@C0359n0 SharedPreferences sharedPreferences, @C0359n0 String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                if (new C35015e(this.f85089a).mo104005q(jSONArray.get(i).toString()) || C35020d.m143604G(jSONArray.get(i).toString(), sharedPreferences.getString("OT_UI_VALID_GROUP_IDS", ""))) {
                    jSONArray2.put(jSONArray.get(i).toString());
                }
            }
            OTLogger.m143447b("IABCCPA_Consent", "Groups belong to CCPA category : " + jSONArray2);
            return jSONArray2;
        } catch (JSONException e) {
            OTLogger.m143457l("IABCCPA_Consent", "Error while fetching CCPA groups, err : " + e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public void mo103760c() {
        if (this.f85091c.contains(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING)) {
            this.f85091c.edit().remove(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING).apply();
            OTLogger.m143458m("IABCCPA_Consent", "CCPA String deleted");
        }
    }

    /* renamed from: d */
    public void mo103761d(@C0359n0 String str) {
        if (!this.f85091c.getString(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING, "").equals(str)) {
            this.f85091c.edit().putString(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING, str).apply();
            OTLogger.m143458m("IABCCPA_Consent", "Resetting CCPA String on template change");
        }
    }

    /* renamed from: e */
    public void mo103762e(@C0359n0 String str, @C0359n0 String str2, boolean z, boolean z2) {
        mo103769m();
        if (C35020d.m143605J(str)) {
            return;
        }
        if (C35020d.m143604G(str, this.f85090b.mo103965b().getString("OT_UI_VALID_GROUP_IDS", ""))) {
            SharedPreferences.Editor edit = this.f85090b.mo103965b().edit();
            edit.putString("OT_CCPA_CATEGORY_ID", str);
            edit.putString("OTT_CCPA_GEOLOCATIONS", str2);
            edit.putBoolean("OTT_EXPLICIT_NOTICE", z2);
            edit.putBoolean("OTT_AGREEMENT_TERMS_APPLIES", z);
            edit.apply();
            boolean z3 = true;
            if (new C35015e(this.f85089a).mo103996g(str) != 1) {
                z3 = false;
            }
            mo103764g(z3, false);
            return;
        }
        OTLogger.m143461p("OneTrust", "Invalid CCPA configuration. Please assign SDKs to the CCPA category or its subgroups.");
    }

    /* renamed from: f */
    public void mo103763f(@C0359n0 JSONObject jSONObject) {
        String str;
        String optString = jSONObject.optString("parentCCPACategory", "");
        String optString2 = jSONObject.optString("ccpaGeo", "");
        boolean optBoolean = jSONObject.optBoolean("ccpaLspa", false);
        boolean optBoolean2 = jSONObject.optBoolean("ccpaExpNotice", false);
        if (jSONObject.optBoolean("computeCCPA", false)) {
            new C34978j(this.f85089a).mo103762e(optString, optString2, optBoolean, optBoolean2);
        } else {
            mo103761d("1---");
            String string = this.f85090b.mo103965b().getString("OT_DATA_DOWNLOADED_GEO_LOCATION", "");
            if (C35020d.m143605J(optString)) {
                str = "Compute CCPA disabled for this template from OneTrust UI";
            } else {
                OTGeolocationModel c = new C34985q(this.f85089a).mo103845c(string);
                if (!"all".equalsIgnoreCase(optString2) && (C35020d.m143605J(optString2) || c == null || !c.compareLocation(optString2))) {
                    str = "CCPA string not updated for location " + optString2 + " as user's location " + string + " is out of ccpa configured region";
                }
            }
            OTLogger.m143461p("OneTrust", str);
        }
        if (!C35020d.m143605J(mo103768l())) {
            mo103771o();
        }
    }

    /* renamed from: g */
    public void mo103764g(boolean z, boolean z2) {
        if (!mo103770n()) {
            OTLogger.m143461p("IABCCPA_Consent", "Update called without initializing CCPA");
            return;
        }
        OTGeolocationModel a = new C34985q(this.f85089a).mo103843a(2);
        String string = this.f85090b.mo103965b().getString("OTT_CCPA_GEOLOCATIONS", "all");
        boolean z3 = true;
        if (!"all".equalsIgnoreCase(string)) {
            if (a != null) {
                z3 = m143239i(a, string, true);
            } else {
                OTLogger.m143457l("IABCCPA_Consent", "Geolocation data is not available");
            }
        }
        if (!z3) {
            OTLogger.m143458m("IABCCPA_Consent", "CCPA not updated for the location = " + string + " . Banner loaded location = " + a);
            return;
        }
        String l = mo103768l();
        if (TextUtils.isEmpty(l)) {
            OTLogger.m143461p("IABCCPA_Consent", "CCPA Parent ID not found. Please configure CCPA Parent and its subgroups in OneTrust UI");
            return;
        }
        mo103767k(mo103758a(z).toString());
        mo103765h(z, z2, l);
    }

    /* renamed from: h */
    public final void mo103765h(boolean z, boolean z2, @C0359n0 String str) {
        String str2;
        if (z2) {
            JSONArray j = mo103766j();
            if (j == null || j.length() == 0) {
                str2 = "Subgroups belong to CCPA category not found";
            } else {
                try {
                    new C34982n(this.f85089a).mo103815g(j, str, z);
                    return;
                } catch (JSONException e) {
                    str2 = "Could not update the consent for CCPA groups, err : " + e.getMessage();
                }
            }
            OTLogger.m143457l("IABCCPA_Consent", str2);
        }
    }

    @C0363p0
    /* renamed from: j */
    public JSONArray mo103766j() {
        JSONArray b;
        SharedPreferences b2 = new C35014d(this.f85089a, "OTT_DEFAULT_USER").mo103965b();
        String string = b2.getString("OTT_CCPA_CUSTOM_GROUP_IDS", "");
        if (C35020d.m143605J(string) || (b = mo103759b(b2, string)) == null) {
            return null;
        }
        return b;
    }

    /* renamed from: k */
    public void mo103767k(@C0359n0 String str) {
        this.f85091c.edit().putString(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING, str).apply();
        OTLogger.m143458m("IABCCPA_Consent", "IAB CCPA string set with value = " + str);
    }

    @C0359n0
    /* renamed from: l */
    public String mo103768l() {
        return new C35014d(this.f85089a, "OTT_DEFAULT_USER").mo103965b().getString("OT_CCPA_CATEGORY_ID", "");
    }

    /* renamed from: m */
    public void mo103769m() {
        if (!mo103770n()) {
            this.f85091c.edit().putString(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING, "1---").apply();
            OTLogger.m143458m("IABCCPA_Consent", "CCPA initialized? = " + this.f85091c.contains(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING));
        }
    }

    /* renamed from: n */
    public boolean mo103770n() {
        return this.f85091c.contains(OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING);
    }

    /* renamed from: o */
    public void mo103771o() {
        new JSONArray();
        String l = mo103768l();
        try {
            JSONObject jSONObject = new JSONObject(this.f85090b.mo103965b().getString("OTT_PARENT_GROUPS", ""));
            if (jSONObject.has(l)) {
                JSONArray jSONArray = jSONObject.getJSONArray(l);
                this.f85090b.mo103965b().edit().putString("OTT_CCPA_CUSTOM_GROUP_IDS", jSONArray.toString()).apply();
            }
        } catch (JSONException e) {
            OTLogger.m143457l("IABCCPA_Consent", "Error when CCPA subgroups are fetched, err : " + e.getMessage());
        }
    }
}
