package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.google.android.gms.common.C40928r;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35016f;
import com.onetrust.otpublishers.headless.Public.OTCallback;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35067a;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35068b;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35262g;
import com.urbanairship.PreferenceDataDatabase;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.d */
public class C34970d {

    /* renamed from: a */
    public Context f85074a;

    /* renamed from: b */
    public final C35014d f85075b;

    /* renamed from: c */
    public final C35015e f85076c;

    /* renamed from: d */
    public final C35000d f85077d;

    /* renamed from: e */
    public boolean f85078e = false;

    /* renamed from: f */
    public JSONArray f85079f;

    /* renamed from: g */
    public JSONArray f85080g;

    /* renamed from: h */
    public boolean f85081h;

    /* renamed from: i */
    public C34976h f85082i = new C34976h();

    public C34970d(@C0359n0 Context context) {
        this.f85074a = context;
        this.f85075b = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85076c = new C35015e(context);
        this.f85077d = new C35000d(context);
    }

    /* renamed from: A */
    public static void m143088A(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject2.has(str)) {
            try {
                jSONObject.put(str, jSONObject2.getBoolean(str));
            } catch (JSONException e) {
                OTLogger.m143457l("OTData", "Error in appending pc boolean data. key = " + str + "Error message : " + e.getMessage());
            }
        }
    }

    /* renamed from: D */
    public static void m143089D(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str) {
        m143092W(jSONObject, jSONObject3, jSONObject2, str);
        if (jSONObject2.has("SubGroups")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("SubGroups");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                m143092W(jSONObject, jSONObject3, jSONObject4, jSONObject4.getString("CustomGroupId"));
            }
        }
    }

    /* renamed from: N */
    public static boolean m143090N(@C0359n0 JSONArray jSONArray, @C0359n0 String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("Id") && str.equalsIgnoreCase(jSONObject.getString("Id"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public static void m143091V(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject2.has(str)) {
            try {
                jSONObject.put(str, jSONObject2.getInt(str));
            } catch (JSONException e) {
                OTLogger.m143457l("OTData", "Error in appending pc int data key. key = " + str + "Error message : " + e.getMessage());
            }
        }
    }

    /* renamed from: W */
    public static void m143092W(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str) {
        jSONObject.put(str.toLowerCase(Locale.ENGLISH), -1);
        if (jSONObject3.getString(PersistedInstallation.f80251i).contains("always")) {
            jSONObject2.put(str, jSONObject3.getString(PersistedInstallation.f80251i));
        }
    }

    /* renamed from: X */
    public static boolean m143093X(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        return !jSONObject2.has(jSONObject.optString("CustomGroupId")) && !jSONObject.getBoolean("IsIabPurpose") && !jSONObject.getString(PersistedInstallation.f80251i).contains("always") && jSONObject.getJSONArray("FirstPartyCookies").length() > 0;
    }

    /* renamed from: b0 */
    public static void m143094b0(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject2.has(str)) {
            try {
                jSONObject.put(str, jSONObject2.getString(str));
            } catch (JSONException e) {
                OTLogger.m143457l("OTData", "Error in appending pc data key. key = " + str + "Error message : " + e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public static void m143095g(@C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        boolean equals = str.equals("purposeLegitimateInterests");
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        JSONArray names = jSONObject2.names();
        if (names != null) {
            for (int i = 0; i < jSONObject2.length(); i++) {
                jSONObject2.put(names.getString(i), equals ? 1 : 0);
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    /* renamed from: h */
    public static void m143096h(@C0359n0 JSONArray jSONArray, @C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < jSONObject.getJSONArray("SubGroups").length(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONArray("SubGroups").getJSONObject(i);
            if (jSONObject2.getString("CustomGroupId").equals(str)) {
                for (int i2 = 0; i2 < jSONObject2.getJSONArray("FirstPartyCookies").length(); i2++) {
                    m143097i(jSONArray, jSONObject2.getJSONArray("FirstPartyCookies"), i2);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m143097i(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C13758b.f33475u0, jSONArray2.getJSONObject(i).getString(C13758b.f33475u0));
        jSONObject.put("SdkId", jSONArray2.getJSONObject(i).getString("SdkId"));
        jSONObject.put("Description", jSONArray2.getJSONObject(i).getString("Description"));
        jSONArray.put(jSONObject);
    }

    /* renamed from: i0 */
    public static void m143098i0(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, String str) {
        jSONObject.put(str, jSONObject2.getString(PersistedInstallation.f80251i).equals("inactive") ^ true ? 1 : 0);
    }

    /* renamed from: k */
    public static void m143099k(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject, OTPublishersHeadlessSDK oTPublishersHeadlessSDK, int i, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray3) {
        String str;
        if (!C35020d.m143605J(jSONArray2.getJSONObject(i).optString("PurposeId"))) {
            jSONObject2.put("Id", jSONArray2.getJSONObject(i).optString("PurposeId"));
            String str2 = "NOTGIVEN";
            jSONObject2.put("TransactionType", oTPublishersHeadlessSDK.getConsentStatusForGroupId(jSONArray2.getJSONObject(i).optString("CustomGroupId"), jSONArray2.getJSONObject(i).getString(PersistedInstallation.f80251i)) == 0 ? str2 : "CONFIRMED");
            jSONArray.put(jSONObject2);
            str = jSONArray2.getJSONObject(i).optString("PurposeId");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("Id", jSONArray2.getJSONObject(i).optString("PurposeId"));
            if (!jSONArray2.getJSONObject(i).getString(PersistedInstallation.f80251i).equals("inactive")) {
                str2 = "CONFIRMED";
            }
            jSONObject3.put("TransactionType", str2);
            jSONArray3.put(jSONObject3);
        } else {
            str = "OT_PURPOSE_ID_" + i;
        }
        jSONObject.put(str, jSONArray2.getJSONObject(i).getString("CustomGroupId"));
    }

    /* renamed from: o */
    public static void m143100o(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray2, int i) {
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            if (jSONArray2.getString(i2).equals(jSONArray.getJSONObject(i).optString("CustomGroupId")) && !jSONObject.has(jSONArray.getJSONObject(i).optString("CustomGroupId"))) {
                m143098i0(jSONObject, jSONArray.getJSONObject(i), jSONArray2.getString(i2));
            }
        }
    }

    /* renamed from: q */
    public static void m143101q(@C0359n0 JSONObject jSONObject, @C0359n0 C34964a aVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (str3.equals(str2) && jSONObject.has(str2)) {
            aVar.mo103608e(str, str2, true);
        }
    }

    /* renamed from: r */
    public static void m143102r(@C0359n0 JSONObject jSONObject, @C0359n0 C34964a aVar, @C0359n0 String str, @C0359n0 JSONArray jSONArray, @C0359n0 String str2) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.getJSONObject(i).getString("purposeTopicId").equals(str2) && jSONObject.has(str2)) {
                aVar.mo103626x(str2, str, true);
            }
        }
    }

    /* renamed from: s */
    public static void m143103s(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 C34964a aVar, @C0359n0 String str2, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            JSONArray t = aVar.mo103622t(str2);
            for (int i2 = 0; i2 < t.length(); i2++) {
                m143101q(jSONObject, aVar, str2, optString + str + str2, t.getJSONObject(i2).getString("purposeOptionsId"));
            }
        }
    }

    /* renamed from: t */
    public static void m143104t(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2) {
        int i;
        if (jSONObject.has(str)) {
            if ("OPT_OUT".equalsIgnoreCase(str2) || "PENDING".equalsIgnoreCase(str2) || "EXPIRED".equalsIgnoreCase(str2) || "WITHDRAWN".equalsIgnoreCase(str2)) {
                OTLogger.m143458m("OTData", "Parent status setting to 0, groupID = " + str);
                i = 0;
            } else if ("ACTIVE".equalsIgnoreCase(str2)) {
                OTLogger.m143458m("OTData", "Parent status setting to 1, groupID = " + str);
                i = 1;
            } else {
                return;
            }
            jSONObject.put(str, i);
        }
    }

    /* renamed from: u */
    public static void m143105u(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        int i;
        if ("OPT_OUT".equalsIgnoreCase(str2) || "PENDING".equalsIgnoreCase(str2) || "EXPIRED".equalsIgnoreCase(str2) || "WITHDRAWN".equalsIgnoreCase(str2)) {
            OTLogger.m143458m("OTData", "Status setting to 0, groupID = " + str3 + " purposeID = " + str);
            i = 0;
        } else if ("ACTIVE".equalsIgnoreCase(str2)) {
            OTLogger.m143458m("OTData", "Status setting to 1, groupID = " + str3 + " purposeID = " + str);
            i = 1;
        } else {
            return;
        }
        jSONObject.put(str3, i);
    }

    /* renamed from: v */
    public static void m143106v(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONArray jSONArray, @C0359n0 C34964a aVar) {
        aVar.mo103601N(str);
        if (jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                m143102r(jSONObject, aVar, optString, aVar.mo103591D(str), optString + str);
            }
        }
    }

    /* renamed from: w */
    public static void m143107w(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2) {
        if (!jSONObject2.optString(PersistedInstallation.f80251i).contains("always")) {
            jSONObject.put(jSONObject2.optString("PurposeId"), str);
        }
    }

    /* renamed from: x */
    public static void m143108x(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2, @C0359n0 C34964a aVar, @C0359n0 String str2) {
        JSONArray c = aVar.mo103606c(str);
        for (int i = 0; i < c.length(); i++) {
            if (c.getJSONObject(i).getString("id").equals(str2) && str.equals(c.getJSONObject(i).getString("purposeId"))) {
                JSONArray jSONArray = new JSONArray(jSONObject2.getString(str2));
                if (jSONArray.length() > 0) {
                    m143103s(jSONObject, str, aVar, str2, jSONArray);
                }
            }
        }
    }

    /* renamed from: z */
    public static void m143109z(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject2.has("IsIabEnabled") && jSONObject2.has("IabType")) {
            jSONObject.put("IsIabEnabled", jSONObject2.getBoolean("IsIabEnabled"));
            jSONObject.put("IabType", jSONObject2.getString("IabType"));
            if (jSONObject2.getBoolean("IsIabEnabled") && !"".equals(jSONObject2.getString("IabType"))) {
                m143094b0(jSONObject, jSONObject2, "BannerDPDTitle");
                if (jSONObject2.has("BannerDPDDescription") && !jSONObject2.isNull("BannerDPDDescription")) {
                    jSONObject.put("BannerDPDDescription", jSONObject2.get("BannerDPDDescription").toString());
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo103656B(JSONObject jSONObject, JSONObject jSONObject2, String str, C34990u uVar, String str2) {
        if (jSONObject2.getBoolean("HasConsentOptOut")) {
            jSONObject.put(str2, uVar.mo103873a(str2, str, jSONObject2.getString(PersistedInstallation.f80251i), this.f85075b, true));
        }
    }

    /* renamed from: C */
    public final void mo103657C(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject3, boolean z, @C0359n0 JSONObject jSONObject4) {
        if (jSONObject3.has("CustomGroupId")) {
            String string = jSONObject3.getString("CustomGroupId");
            if (!C35020d.m143605J(string)) {
                m143089D(jSONObject, jSONObject3, jSONObject4, string);
                if (z) {
                    mo103705y(jSONObject2, jSONArray, jSONArray2, jSONObject3, string);
                }
            }
        }
    }

    @C0344h1
    /* renamed from: E */
    public void mo103658E(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str, @C0359n0 String str2, @C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject4) {
        if (jSONObject.has(str)) {
            C34964a aVar = new C34964a(this.f85074a);
            aVar.mo103610g(str, str2.equals("ACTIVE"));
            m143106v(jSONObject2, str, jSONArray, aVar);
            if (jSONObject4.length() > 0) {
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    aVar.mo103599L(next);
                    m143108x(jSONObject3, str, jSONObject4, aVar, next);
                }
            }
        }
    }

    /* renamed from: F */
    public void mo103659F(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 JSONArray jSONArray) {
        jSONObject.getJSONObject("consentPayload").put("purposes", jSONArray);
        jSONObject2.getJSONObject("consentPayload").put("purposes", jSONArray);
        this.f85075b.mo103965b().edit().putString("OTT_CONSENT_LOG_DATA", jSONObject.toString()).apply();
        this.f85075b.mo103965b().edit().putString("OT_CL_DEFAULT_PAYLOAD", jSONObject2.toString()).apply();
        this.f85075b.mo103965b().edit().putString("OTT_INTERNAL_PURPOSE_GROUP_MAP", jSONObject3.toString()).apply();
    }

    /* renamed from: G */
    public final void mo103660G(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, boolean z) {
        if (z) {
            mo103688h0(jSONObject, jSONObject2);
            try {
                mo103703s0(jSONObject);
            } catch (Exception e) {
                OTLogger.m143457l("OTData", "UCP profile sync, error message = " + e.getMessage());
            }
        }
    }

    /* renamed from: H */
    public final void mo103661H(@C0359n0 JSONObject jSONObject, boolean z, @C0359n0 JSONArray jSONArray) {
        try {
            if (z != this.f85075b.mo103965b().getBoolean("IS_IAB2_TEMPLATE", false)) {
                new C34981m(this.f85074a).mo103781a();
                new C34981m(this.f85074a).mo103787g();
            }
            new C34974f(this.f85075b).mo103727k(jSONObject, jSONArray, this.f85074a);
        } catch (Exception e) {
            OTLogger.m143457l("OTData", "could not parse consent logging data. Error message = " + e.getMessage());
        }
    }

    /* renamed from: I */
    public final void mo103662I(boolean z, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONArray jSONArray3, @C0359n0 JSONObject jSONObject, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 JSONObject jSONObject4, @C0359n0 JSONObject jSONObject5, @C0359n0 JSONObject jSONObject6, int i, @C0359n0 JSONObject jSONObject7, @C0359n0 JSONObject jSONObject8) {
        JSONObject jSONObject9 = jSONObject6;
        JSONObject jSONObject10 = jSONObject8;
        if (jSONObject10.getBoolean("IsIabPurpose") || jSONObject10.getString(PersistedInstallation.f80251i).contains("always") || jSONObject10.getJSONArray("FirstPartyCookies").length() <= 0) {
            if (!jSONObject10.getBoolean("IsIabPurpose")) {
                return;
            }
            if (!C34976h.m143224k(jSONObject10, this.f85081h)) {
                this.f85079f.put(jSONObject10.optString("PurposeId"));
                return;
            }
            String D = C34990u.m143378D(jSONObject10.optString("Type"));
            C34990u uVar = new C34990u(this.f85074a);
            if (!C35020d.m143605J(D)) {
                String y = C34990u.m143387y(jSONObject10.getString("CustomGroupId"));
                if (D.equals("purposes") && jSONObject10.getBoolean("ShowInPopup")) {
                    C34990u uVar2 = uVar;
                    String str = y;
                    mo103656B(jSONObject2, jSONObject8, D, uVar2, str);
                    jSONObject9.put(jSONObject10.getString("CustomGroupId"), D);
                    mo103670R(y);
                    mo103663J(z, jSONObject5, jSONObject8, uVar2, str);
                    m143099k(jSONArray, jSONArray3, jSONObject, oTPublishersHeadlessSDK, i, jSONObject7, jSONArray2);
                    new C34976h().mo103749h(jSONObject10, this.f85080g);
                    return;
                } else if (!D.equals("special_feature_opt_ins") || !jSONObject10.getBoolean("ShowInPopup")) {
                    String str2 = y;
                    if (D.equals("stacks")) {
                        JSONObject jSONObject11 = jSONObject4;
                        jSONObject11.put(str2, uVar.mo103873a(str2, D, jSONObject10.getString(PersistedInstallation.f80251i), this.f85075b, true));
                        return;
                    }
                    return;
                } else {
                    String str3 = y;
                    JSONObject jSONObject12 = jSONObject3;
                    jSONObject12.put(str3, uVar.mo103873a(y, D, jSONObject10.getString(PersistedInstallation.f80251i), this.f85075b, true));
                    jSONObject9.put(jSONObject10.getString("CustomGroupId"), D);
                }
            } else {
                return;
            }
        }
        m143099k(jSONArray, jSONArray3, jSONObject, oTPublishersHeadlessSDK, i, jSONObject7, jSONArray2);
    }

    /* renamed from: J */
    public final void mo103663J(boolean z, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 C34990u uVar, String str) {
        if (jSONObject2.getBoolean("HasLegIntOptOut") && z) {
            jSONObject.put(str, uVar.mo103873a(str, "purposeLegitimateInterests", jSONObject2.getBoolean("HasLegIntOptOut") ? C30638a.C30639a.f73205n : "inactive", this.f85075b, true));
        }
    }

    /* renamed from: K */
    public final boolean mo103664K(@C0359n0 String str, @C0363p0 OTCallback oTCallback, @C0359n0 OTResponse oTResponse) {
        boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("domain")) {
                this.f85082i.mo103747d(jSONObject.getJSONObject("domain").getJSONObject("ruleDetails").optString("type", ""), this.f85075b);
            }
            if (jSONObject.has("culture")) {
                z = mo103667O(jSONObject, oTCallback, oTResponse);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("culture");
            if (jSONObject2.has("MobileData")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("MobileData");
                if (this.f85082i.mo103751m(this.f85075b) && !jSONObject3.optJSONObject("ccpaData").optBoolean("computeCCPA")) {
                    new C34978j(this.f85074a).mo103761d("1---");
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "error in formatting ott data with err = " + e.getMessage());
        }
        return z;
    }

    /* renamed from: L */
    public boolean mo103665L(@C0359n0 String str, @C0363p0 OTCallback oTCallback, @C0359n0 OTResponse oTResponse, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        new C35016f(this.f85074a).mo104015a();
        C34974f fVar = new C34974f(this.f85075b);
        boolean z = true;
        mo103671S(str, true);
        if (this.f85076c.f85172b.mo103962g()) {
            OTLogger.m143447b("OTData", "setting vendors to object if empty");
            oTPublishersHeadlessSDK.reInitVendorArray();
        }
        String e0 = mo103684e0();
        this.f85075b.mo103965b().edit().putString("OTT_BANNER_DATA", e0).apply();
        C35067a.m143884o().mo104363i(e0);
        fVar.mo103725f(str, oTPublishersHeadlessSDK);
        JSONObject optJSONObject = this.f85076c.mo104014z().optJSONObject("LegIntSettings");
        if (optJSONObject != null && optJSONObject.has("PAllowLI")) {
            this.f85081h = optJSONObject.optBoolean("PAllowLI");
        }
        boolean K = mo103664K(str, oTCallback, oTResponse);
        String j0 = mo103690j0();
        C35069c.m143925y().mo104416p(j0);
        this.f85075b.mo103965b().edit().putString("OTT_PC_DATA", j0).apply();
        String b = fVar.mo103722b(str);
        C35068b.m143905i().mo104378c(b);
        this.f85075b.mo103965b().edit().putString("OT_OTT_DATA", b).apply();
        mo103687g0(j0, this.f85076c.mo104013y());
        mo103680c0(str, new C34991v(this.f85074a).mo103895j(this.f85082i.mo103745b(this.f85075b)));
        if (new C35015e(this.f85075b).mo103980O() != 0) {
            z = false;
        }
        mo103666M(str, z);
        JSONObject z2 = this.f85076c.mo104014z();
        new C34972e().mo103720e(z2, this.f85076c);
        new C34976h().mo103746c(this.f85075b.mo103965b(), this.f85078e, this.f85079f, this.f85080g, this.f85082i.mo103750j(z2));
        new C34979k().mo103772d(j0, this.f85082i.mo103745b(this.f85075b).equals("IAB2"), z2.optJSONObject("LegIntSettings"), this.f85075b, this.f85074a);
        mo103702r0(this.f85076c.mo103982Q());
        mo103693l0();
        return K;
    }

    @C0344h1
    /* renamed from: M */
    public boolean mo103666M(@C0359n0 String str, boolean z) {
        String H;
        if (z) {
            try {
                if (mo103695m0(new JSONObject(str)) && (H = new C35015e(this.f85074a).mo103973H()) != null) {
                    if (!C35020d.m143605J(H)) {
                        new C34970d(this.f85074a).mo103699p(new JSONObject(H).getJSONArray("Groups"), false, new JSONObject());
                        return true;
                    }
                }
                return false;
            } catch (JSONException e) {
                OTLogger.m143457l("OTData", "Error on cleanUpIabIfPurposeIfConsentExpired, error: " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo103667O(@C0359n0 JSONObject jSONObject, @C0363p0 OTCallback oTCallback, @C0359n0 OTResponse oTResponse) {
        boolean z;
        if (!jSONObject.getJSONObject("culture").has("DomainData")) {
            return false;
        }
        boolean z2 = this.f85075b.mo103965b().getBoolean("IS_IAB2_TEMPLATE", false);
        if (this.f85082i.mo103750j(jSONObject.getJSONObject("culture").getJSONObject("DomainData"))) {
            String string = jSONObject.getJSONObject("domain").getJSONObject("IabV2Data").getString("globalVendorListUrl");
            if (!C35020d.m143605J(string)) {
                new C35006f(this.f85074a).mo103947o(string, oTCallback, oTResponse);
                z = true;
            } else {
                z = false;
            }
            this.f85075b.mo103965b().edit().putBoolean("IS_IAB2_TEMPLATE", true).apply();
        } else {
            this.f85075b.mo103965b().edit().putBoolean("IS_IAB2_TEMPLATE", false).apply();
            z = false;
        }
        JSONArray b = mo103678b(jSONObject);
        new C34967b0(this.f85074a).mo103641i(jSONObject);
        mo103704t0(jSONObject);
        if (!jSONObject.getJSONObject("culture").getJSONObject("DomainData").optBoolean("IsConsentLoggingEnabled")) {
            OTLogger.m143461p("OTData", "Consent Logging not enabled");
            this.f85076c.mo104004p(false);
        } else {
            this.f85076c.mo104004p(true);
            mo103661H(jSONObject, z2, b);
        }
        this.f85075b.mo103965b().edit().putString("OTT_FORMATTED_DATA_TO_RETURN", new C34974f(this.f85075b).mo103723d(jSONObject, this.f85081h).toString()).apply();
        return z;
    }

    @C0344h1
    @C0359n0
    /* renamed from: P */
    public JSONObject mo103668P(@C0359n0 JSONObject jSONObject) {
        return (!jSONObject.has("culture") || !jSONObject.getJSONObject("culture").has("DomainData")) ? new JSONObject() : jSONObject.getJSONObject("culture").getJSONObject("DomainData");
    }

    /* renamed from: Q */
    public void mo103669Q() {
        String string = this.f85075b.mo103965b().getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
        if (!C35020d.m143605J(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("purposes")) {
                    m143095g("purposes", jSONObject);
                }
                if (jSONObject.has("purposeLegitimateInterests")) {
                    m143095g("purposeLegitimateInterests", jSONObject);
                }
                if (jSONObject.has("special_feature_opt_ins")) {
                    m143095g("special_feature_opt_ins", jSONObject);
                }
                this.f85075b.mo103965b().edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", jSONObject.toString()).apply();
                OTLogger.m143447b("OTData", "iab related values cleared on auto re-consent");
            } catch (JSONException e) {
                OTLogger.m143457l("OTData", "Error when setting IAB default values on auto reconsent," + e.toString());
            }
        }
    }

    /* renamed from: R */
    public final void mo103670R(@C0359n0 String str) {
        if (str.equals("1")) {
            this.f85075b.mo103965b().edit().putInt("OT_IAB_PURPOSEONETREATMENT", 0).apply();
        }
    }

    /* renamed from: S */
    public final void mo103671S(@C0363p0 String str, boolean z) {
        try {
            SharedPreferences b = this.f85075b.mo103965b();
            C34974f fVar = new C34974f(this.f85075b);
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("culture")) {
                    fVar.mo103732q(z, "parsing and saving OTT data", "");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("culture");
                    b.edit().putString("OT_CULTURE_DATA", jSONObject2.toString()).apply();
                    fVar.mo103731p(z, b, jSONObject2, this.f85077d);
                    fVar.mo103728l(z, b, jSONObject2);
                    fVar.mo103729m(z, b, jSONObject2, this.f85074a, this.f85076c);
                }
                fVar.mo103730n(z, b, jSONObject, this.f85074a, this.f85076c, this.f85082i.mo103750j(mo103668P(jSONObject)));
                fVar.mo103733s(b, jSONObject);
                fVar.mo103724e(b, jSONObject);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OTData", "error while parsing ott data " + e.getMessage());
        }
    }

    /* renamed from: T */
    public final void mo103672T(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, int i) {
        JSONObject jSONObject = jSONArray2.getJSONObject(i);
        if (!jSONObject.getString("Type").equals("COOKIE") || !jSONObject.getString("Parent").isEmpty()) {
            if (!jSONObject.getBoolean("IsIabPurpose") || !jSONObject.getString("Parent").isEmpty() || !jSONObject.getBoolean("ShowInPopup") || !C34976h.m143224k(jSONObject, this.f85081h)) {
                return;
            }
        } else if (jSONObject.getJSONArray("FirstPartyCookies").length() <= 0) {
            return;
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: U */
    public final void mo103673U(@C0359n0 JSONArray jSONArray, boolean z, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < jSONArray.length(); i++) {
            mo103694m(jSONArray, jSONObject, i);
        }
        if (!z) {
            this.f85075b.mo103965b().edit().putString("OTT_CONSENT_STATUS", jSONObject.toString()).apply();
            String string = this.f85075b.mo103965b().getString("OT_IAB_DEFAULT_AVL", "");
            if (!C35020d.m143605J(string)) {
                this.f85075b.mo103965b().edit().putString("OT_IAB_ACTIVE_VENDORLIST", string).apply();
            }
        }
    }

    /* renamed from: Y */
    public JSONObject mo103674Y() {
        String string = this.f85075b.mo103965b().getString("OT_OTT_DATA", (String) null);
        if (!C35020d.m143605J(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    @C0344h1
    @C0359n0
    /* renamed from: Z */
    public JSONObject mo103675Z(@C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (!jSONObject.has(C40928r.f104100a)) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(C40928r.f104100a);
        if (!jSONObject3.has("sync")) {
            return jSONObject2;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("sync");
        return jSONObject4.has("parentToggleState") ? jSONObject4.getJSONObject("parentToggleState") : jSONObject2;
    }

    @C0359n0
    /* renamed from: a */
    public JSONArray mo103676a(@C0359n0 List<String> list, @C0359n0 JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray b = new C35262g().mo105605b(jSONArray);
            for (int i = 0; i < b.length(); i++) {
                arrayList.add(b.getJSONObject(i).getString("CustomGroupId"));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "error while computing all categories e:" + e.toString());
        }
        if (list.isEmpty()) {
            list = arrayList;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                mo103689j(jSONArray, jSONArray2, list.get(i2).trim());
            } catch (JSONException e2) {
                OTLogger.m143457l("OTData", "Error on parsing SDK list. Error msg = " + e2.getMessage());
            }
        }
        OTLogger.m143447b("ContentValues", "getSDKList Final: " + jSONArray2);
        return jSONArray2;
    }

    /* renamed from: a0 */
    public final void mo103677a0(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, int i) {
        JSONObject jSONObject = jSONArray2.getJSONObject(i);
        if (!jSONObject.has("SubGroups")) {
            mo103672T(jSONArray, jSONArray2, i);
        } else if (jSONObject.getBoolean("ShowInPopup")) {
            jSONArray.put(jSONObject);
        }
    }

    @C0359n0
    /* renamed from: b */
    public final JSONArray mo103678b(@C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject z = this.f85076c.mo104014z();
        int i = 0;
        boolean z2 = (!z.has("LegIntSettings") || z.isNull("LegIntSettings")) ? false : z.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        if (jSONObject2.getJSONObject("culture").getJSONObject("DomainData").has("Groups")) {
            JSONArray jSONArray3 = jSONObject2.getJSONObject("culture").getJSONObject("DomainData").getJSONArray("Groups");
            if (jSONArray3.length() > 0) {
                this.f85076c.mo103999k(jSONArray3);
                String str = "OTT_INTERNAL_PURPOSE_GROUP_MAP";
                String string = this.f85075b.mo103965b().getString(str, (String) null);
                String str2 = "ContentValues";
                OTLogger.m143447b(str2, "saved Purpose - Group map:" + string);
                JSONObject e = mo103683e(string);
                OTPublishersHeadlessSDK oTPublishersHeadlessSDK = new OTPublishersHeadlessSDK(this.f85074a);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = new JSONObject();
                JSONObject jSONObject7 = new JSONObject();
                JSONObject jSONObject8 = new JSONObject();
                this.f85079f = new JSONArray();
                this.f85080g = new JSONArray();
                while (i < jSONArray3.length()) {
                    JSONObject jSONObject9 = new JSONObject();
                    JSONObject jSONObject10 = jSONArray3.getJSONObject(i);
                    JSONObject jSONObject11 = jSONObject9;
                    JSONObject jSONObject12 = jSONObject7;
                    int i2 = i;
                    JSONObject jSONObject13 = jSONObject5;
                    JSONObject jSONObject14 = jSONObject4;
                    JSONObject jSONObject15 = jSONObject3;
                    mo103662I(z2, jSONArray, jSONArray2, jSONArray3, e, oTPublishersHeadlessSDK, jSONObject3, jSONObject14, jSONObject13, jSONObject12, jSONObject8, i2, jSONObject11, jSONObject10);
                    JSONArray jSONArray4 = jSONArray2;
                    JSONArray jSONArray5 = jSONArray;
                    mo103692l(jSONArray5, jSONArray4, jSONObject11, jSONObject10);
                    i = i2 + 1;
                    jSONArray = jSONArray5;
                    jSONArray2 = jSONArray4;
                    jSONObject7 = jSONObject12;
                    jSONObject6 = jSONObject6;
                    jSONObject5 = jSONObject13;
                    jSONObject4 = jSONObject14;
                    oTPublishersHeadlessSDK = oTPublishersHeadlessSDK;
                    str2 = str2;
                    str = str;
                    jSONArray3 = jSONArray3;
                }
                String str3 = str2;
                String str4 = str;
                JSONArray jSONArray6 = jSONArray2;
                JSONArray jSONArray7 = jSONArray;
                JSONObject jSONObject16 = jSONObject6;
                jSONObject16.put("purposes", jSONObject3);
                jSONObject16.put("purposeLegitimateInterests", jSONObject7);
                jSONObject16.put("special_feature_opt_ins", jSONObject4);
                jSONObject16.put("stacks", jSONObject5);
                if (new C35020d().mo104023S(this.f85074a)) {
                    this.f85075b.mo103965b().edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", jSONObject16.toString()).apply();
                }
                String str5 = str4;
                this.f85075b.mo103965b().edit().putString(str5, e.toString()).apply();
                OTLogger.m143447b(str3, "new Purpose - Group map : " + this.f85075b.mo103965b().getString(str5, (String) null));
                this.f85075b.mo103965b().edit().putString("OT_IAB_PURPOSE_TYPES", jSONObject8.toString()).apply();
                this.f85075b.mo103965b().edit().putString("OT_CL_DEFAULT_TRANSACTION_VALUES", jSONArray6.toString()).apply();
                return jSONArray7;
            }
        }
        return jSONArray;
    }

    @C0344h1
    @C0359n0
    /* renamed from: c */
    public JSONArray mo103679c(@C0359n0 JSONObject jSONObject, boolean z) {
        JSONArray jSONArray = new JSONArray();
        if (!jSONObject.has(C40928r.f104100a)) {
            return jSONArray;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(C40928r.f104100a);
        if (!jSONObject2.has("sync")) {
            return jSONArray;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("sync");
        if (z) {
            mo103701q0(jSONObject3);
            mo103700p0(jSONObject3);
        }
        return jSONObject3.has(PreferenceDataDatabase.f87249s) ? jSONObject3.getJSONArray(PreferenceDataDatabase.f87249s) : jSONArray;
    }

    @C0344h1
    /* renamed from: c0 */
    public boolean mo103680c0(@C0359n0 String str, boolean z) {
        if (!z) {
            return false;
        }
        try {
            if (mo103695m0(new JSONObject(str))) {
                return false;
            }
            new C34991v(this.f85074a).mo103899q();
            return true;
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "Error while parsing ottWholeData, error = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public JSONObject mo103681d() {
        String string = this.f85075b.mo103965b().getString("OTT_BANNER_DATA", (String) null);
        if (!C35020d.m143605J(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    /* renamed from: d0 */
    public final boolean mo103682d0(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        return C34976h.m143224k(jSONObject, this.f85081h) && !jSONObject2.has(jSONObject.optString("CustomGroupId")) && jSONObject.getBoolean("IsIabPurpose") && jSONObject.getBoolean("ShowInPopup") && jSONObject.getBoolean("HasConsentOptOut");
    }

    /* renamed from: e */
    public final JSONObject mo103683e(String str) {
        if (C35020d.m143605J(str)) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject(str);
        this.f85078e = true;
        return jSONObject;
    }

    @C0359n0
    /* renamed from: e0 */
    public String mo103684e0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject z = this.f85076c.mo104014z();
            JSONObject r = this.f85076c.mo104006r();
            m143094b0(jSONObject, z, "AlertNoticeText");
            m143094b0(jSONObject, z, "AlertCloseText");
            m143094b0(jSONObject, z, "AlertMoreInfoText");
            m143094b0(jSONObject, z, "CookieSettingButtonText");
            m143094b0(jSONObject, z, "AlertAllowCookiesText");
            m143094b0(jSONObject, z, "BannerTitle");
            m143088A(jSONObject, z, "ForceConsent");
            m143094b0(jSONObject, z, "BannerPosition");
            m143094b0(jSONObject, z, "BannerCloseButtonText");
            m143088A(jSONObject, z, "showBannerCloseButton");
            m143094b0(jSONObject, z, "AlertLayout");
            m143088A(jSONObject, z, "Flat");
            m143088A(jSONObject, z, "FloatingFlat");
            m143088A(jSONObject, z, "FloatingRoundedCorner");
            m143088A(jSONObject, z, "FloatingRoundedIcon");
            m143088A(jSONObject, z, "FloatingRounded");
            m143088A(jSONObject, z, "CenterRounded");
            m143094b0(jSONObject, z, "BannerIABPartnersLink");
            m143094b0(jSONObject, z, "BannerPurposeTitle");
            m143094b0(jSONObject, z, "BannerPurposeDescription");
            m143094b0(jSONObject, z, "BannerFeatureTitle");
            m143094b0(jSONObject, z, "BannerFeatureDescription");
            m143094b0(jSONObject, z, "BannerLink");
            m143094b0(jSONObject, z, "BannerLinkText");
            m143088A(jSONObject, z, "BannerShowRejectAllButton");
            m143094b0(jSONObject, z, "BannerRejectAllButtonText");
            m143088A(jSONObject, z, "BannerSettingsButtonDisplayLink");
            m143094b0(jSONObject, r, "BannerCustomCSS");
            m143094b0(jSONObject, r, "BannerMPButtonColor");
            m143094b0(jSONObject, r, "BannerMPButtonTextColor");
            m143094b0(jSONObject, r, "TextColor");
            m143094b0(jSONObject, r, "ButtonColor");
            m143094b0(jSONObject, r, "ButtonTextColor");
            m143094b0(jSONObject, r, "BackgroundColor");
            m143094b0(jSONObject, r, "OptanonLogo");
            m143094b0(jSONObject, r, "BannerLinksTextColor");
            m143088A(jSONObject, r, "ShowBannerAcceptButton");
            m143088A(jSONObject, r, "ShowBannerCookieSettings");
            m143109z(jSONObject, z);
            m143094b0(jSONObject, z, "BannerAdditionalDescription");
            m143094b0(jSONObject, z, "BannerAdditionalDescPlacement");
            if (z.has("ReconsentFrequencyDays")) {
                jSONObject.put("ReconsentFrequencyDays", z.getInt("ReconsentFrequencyDays"));
            }
            m143091V(jSONObject, z, "IABReconsentFrequencyDays");
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "Error on parsing preference center data. Error msg = " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: f */
    public final void mo103685f(@C0359n0 String str, int i, @C0359n0 JSONObject jSONObject) {
        boolean t = this.f85076c.mo104008t(str);
        if (!C35020d.m143605J(str) && i == 0 && !t) {
            jSONObject.put(str, i);
        }
    }

    @C0359n0
    /* renamed from: f0 */
    public final String mo103686f0(@C0359n0 JSONObject jSONObject) {
        return jSONObject.optString(PersistedInstallation.f80251i).contains("always") ? "NO_CHOICE" : new OTPublishersHeadlessSDK(this.f85074a).getConsentStatusForGroupId(jSONObject.optString("CustomGroupId"), jSONObject.optString(PersistedInstallation.f80251i)) == 0 ? "NOTGIVEN" : "CONFIRMED";
    }

    /* renamed from: g0 */
    public final void mo103687g0(@C0359n0 String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject5 = new JSONObject();
        try {
            String string = this.f85075b.mo103965b().getString("OTT_CONSENT_LOG_DATA", "");
            String string2 = this.f85075b.mo103965b().getString("OT_CL_DEFAULT_PAYLOAD", "");
            String string3 = this.f85075b.mo103965b().getString("OTT_INTERNAL_PURPOSE_GROUP_MAP", "");
            if (!C35020d.m143605J(string)) {
                jSONObject2 = new JSONObject(string);
            }
            JSONObject jSONObject6 = jSONObject2;
            if (!C35020d.m143605J(string2)) {
                jSONObject3 = new JSONObject(string2);
            }
            JSONObject jSONObject7 = jSONObject3;
            if (!C35020d.m143605J(string3)) {
                jSONObject4 = new JSONObject(string3);
            }
            JSONObject jSONObject8 = jSONObject4;
            if (jSONObject6.has("consentPayload")) {
                jSONArray = jSONObject6.getJSONObject("consentPayload").getJSONArray("purposes");
            }
            JSONArray jSONArray3 = jSONArray;
            if (jSONObject7.has("consentPayload")) {
                jSONArray2 = jSONObject7.getJSONObject("consentPayload").getJSONArray("purposes");
            }
            JSONArray jSONArray4 = jSONArray2;
            int i = 0;
            for (JSONArray jSONArray5 = new JSONObject(str).getJSONArray("Groups"); i < jSONArray5.length(); jSONArray5 = jSONArray5) {
                mo103657C(jSONObject, jSONObject8, jSONArray3, jSONArray4, jSONArray5.getJSONObject(i), z, jSONObject5);
                i++;
                jSONArray3 = jSONArray3;
            }
            JSONArray jSONArray6 = jSONArray3;
            if (z) {
                mo103659F(jSONObject6, jSONObject7, jSONObject8, jSONArray6);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "Error in saveValidUIGroups , message = " + e.getMessage());
        }
        this.f85075b.mo103965b().edit().putString("OT_UI_VALID_GROUP_IDS", jSONObject.toString()).apply();
        this.f85075b.mo103965b().edit().putString("OTT_ALWAYS_ACTIVE_GROUPS", jSONObject5.toString()).apply();
        OTLogger.m143447b("OTData", "Always Active categories = " + jSONObject5);
    }

    @C0344h1
    /* renamed from: h0 */
    public void mo103688h0(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        String string = this.f85075b.mo103965b().getString("OTT_INTERNAL_PURPOSE_GROUP_MAP", (String) null);
        JSONObject jSONObject3 = !C35020d.m143605J(string) ? new JSONObject(string) : new JSONObject();
        JSONArray c = mo103679c(jSONObject, true);
        for (int i = 0; i < c.length(); i++) {
            JSONObject jSONObject4 = c.getJSONObject(i);
            String string2 = jSONObject4.getString("id");
            String string3 = jSONObject4.getString("status");
            if (C35020d.m143625t(jSONObject4.getString("updatedAfterSync"), false)) {
                Locale locale = Locale.ENGLISH;
                if (jSONObject3.has(string2.toUpperCase(locale))) {
                    String string4 = jSONObject3.getString(string2.toUpperCase(locale));
                    if (jSONObject2.has(string4)) {
                        m143105u(jSONObject2, string2, string3, string4);
                    }
                }
            }
        }
        JSONObject Z = mo103675Z(jSONObject);
        JSONArray names = Z.names();
        if (names != null) {
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string5 = names.getString(i2);
                m143104t(jSONObject2, string5, Z.getString(string5));
            }
        }
    }

    /* renamed from: j */
    public void mo103689j(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray3 = jSONArray.getJSONObject(i).getJSONArray("FirstPartyCookies");
            String string = jSONArray.getJSONObject(i).getString("CustomGroupId");
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (string.equals(str)) {
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    m143097i(jSONArray2, jSONArray3, i2);
                }
                if (jSONObject.has("SubGroups")) {
                    m143096h(jSONArray2, str, jSONObject);
                    return;
                }
                return;
            }
            if (jSONObject.has("SubGroups")) {
                m143096h(jSONArray2, str, jSONObject);
            }
        }
    }

    @C0359n0
    /* renamed from: j0 */
    public String mo103690j0() {
        String str = "BFeaturesText";
        String str2 = "BSpecialPurposesText";
        String str3 = "BSpecialFeaturesText";
        String str4 = "BLegitimateInterestPurposesText";
        String str5 = "BConsentPurposesText";
        String str6 = "LegIntSettings";
        String str7 = "useGoogleVendors";
        String str8 = "PCenterVendorListStoragePurposes";
        JSONObject jSONObject = new JSONObject();
        String str9 = "PCenterVendorListStorageDomain";
        try {
            JSONObject z = this.f85076c.mo104014z();
            String str10 = "PCenterVendorListStorageType";
            JSONObject r = this.f85076c.mo104006r();
            try {
                m143094b0(jSONObject, z, "MainText");
                m143094b0(jSONObject, z, "MainInfoText");
                m143094b0(jSONObject, z, "AboutText");
                m143094b0(jSONObject, z, "AboutLink");
                m143094b0(jSONObject, z, "AlwaysActiveText");
                m143094b0(jSONObject, z, "VendorLevelOptOut");
                m143094b0(jSONObject, z, "PreferenceCenterPosition");
                m143094b0(jSONObject, z, "PreferenceCenterConfirmText");
                m143094b0(jSONObject, z, "VendorListText");
                m143094b0(jSONObject, z, "PCGrpDescLinkPosition");
                m143094b0(jSONObject, z, "ThirdPartyCookieListText");
                m143094b0(jSONObject, z, "PreferenceCenterManagePreferencesText");
                m143088A(jSONObject, z, "ShowPreferenceCenterCloseButton");
                m143094b0(jSONObject, z, "CloseText");
                m143094b0(jSONObject, z, "AddLinksToCookiepedia");
                m143094b0(jSONObject, z, "CookieListEnabled");
                m143094b0(jSONObject, z, "Center");
                m143094b0(jSONObject, z, "Panel");
                m143094b0(jSONObject, z, "Popup");
                m143094b0(jSONObject, z, "List");
                m143094b0(jSONObject, z, "Tab");
                m143094b0(jSONObject, z, "PCFirstPartyCookieListText");
                m143094b0(jSONObject, z, "PCViewCookiesText");
                m143094b0(jSONObject, z, "PCenterBackText");
                m143094b0(jSONObject, z, "PCenterVendorsListText");
                m143094b0(jSONObject, z, "PCIABVendorsText");
                m143094b0(jSONObject, z, "PCenterViewPrivacyPolicyText");
                m143094b0(jSONObject, z, "PCenterClearFiltersText");
                m143094b0(jSONObject, z, "PCenterApplyFiltersText");
                m143094b0(jSONObject, z, "PCenterAllowAllConsentText");
                m143094b0(jSONObject, z, "PCenterRejectAllButtonText");
                m143088A(jSONObject, z, "PCenterShowRejectAllButton");
                m143094b0(jSONObject, z, "ConfirmText");
                m143094b0(jSONObject, z, "PCenterCookiesListText");
                m143094b0(jSONObject, z, "PCenterCancelFiltersText");
                m143094b0(jSONObject, r, "PcTextColor");
                m143094b0(jSONObject, r, "PcButtonColor");
                m143094b0(jSONObject, r, "PcButtonColor");
                m143088A(jSONObject, z, "PCenterEnableAccordion");
                m143094b0(jSONObject, r, "PcButtonTextColor");
                m143094b0(jSONObject, r, "PcBackgroundColor");
                m143094b0(jSONObject, r, "PcMenuColor");
                m143094b0(jSONObject, r, "PcMenuHighLightColor");
                m143094b0(jSONObject, r, "PcLinksTextColor");
                m143094b0(jSONObject, r, "OptanonLogo");
                m143088A(jSONObject, r, "ShowCookieList");
                m143088A(jSONObject, r, "PCShowCookieHost");
                m143088A(jSONObject, r, "PCShowCookieDuration");
                m143088A(jSONObject, r, "PCShowCookieType");
                m143088A(jSONObject, r, "PCShowCookieCategory");
                m143094b0(jSONObject, r, "BConsentText");
                m143094b0(jSONObject, r, "BLegitInterestText");
                if (r.has("PCShowCookieDescription") && !r.isNull("PCShowCookieDescription")) {
                    jSONObject.put("PCShowCookieDescription", r.get("PCShowCookieDescription").toString());
                }
                m143094b0(jSONObject, r, "AllowHostOptOut");
                m143094b0(jSONObject, r, "IabLegalTextUrl");
                m143088A(jSONObject, z, "IsIabEnabled");
                m143094b0(jSONObject, z, "IabType");
                m143094b0(jSONObject, z, "PCGrpDescType");
                m143094b0(jSONObject, z, "PCVendorFullLegalText");
                jSONObject.put("PCenterViewPrivacyPolicyText", z.optString("PCenterViewPrivacyPolicyText", ""));
                jSONObject.put("PCenterVendorListLifespan", z.optString("PCenterVendorListLifespan", ""));
                jSONObject.put("PCenterVendorListDisclosure", z.optString("PCenterVendorListDisclosure", ""));
                jSONObject.put("PCenterVendorListNonCookieUsage", z.optString("PCenterVendorListNonCookieUsage", ""));
                jSONObject.put("PCenterVendorListLifespanDay", z.optString("PCenterVendorListLifespanDay", ""));
                jSONObject.put("PCenterVendorListLifespanDays", z.optString("PCenterVendorListLifespanDays", ""));
                jSONObject.put("PCenterVendorListLifespanMonth", z.optString("PCenterVendorListLifespanMonth", ""));
                jSONObject.put("PCenterVendorListLifespanMonths", z.optString("PCenterVendorListLifespanMonths", ""));
                jSONObject.put("PCenterVendorListStorageIdentifier", z.optString("PCenterVendorListStorageIdentifier", ""));
                String str11 = str10;
                jSONObject.put(str11, z.optString(str11, ""));
                String str12 = str9;
                jSONObject.put(str12, z.optString(str12, ""));
                String str13 = str8;
                jSONObject.put(str13, z.optString(str13, ""));
                String str14 = str7;
                jSONObject.put(str14, z.optString(str14, ""));
                String str15 = str5;
                jSONObject.put(str15, r.optString(str15, ""));
                String str16 = str4;
                jSONObject.put(str16, r.optString(str16, ""));
                String str17 = str3;
                jSONObject.put(str17, r.optString(str17, ""));
                String str18 = str2;
                jSONObject.put(str18, r.optString(str18, ""));
                String str19 = str;
                jSONObject.put(str19, r.optString(str19, ""));
                JSONObject jSONObject2 = new JSONObject(this.f85075b.mo103965b().getString("OTT_FORMATTED_DATA_TO_RETURN", (String) null));
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = jSONObject2.getJSONObject("culture").getJSONObject("DomainData").getJSONArray("Groups");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    mo103677a0(jSONArray, jSONArray2, i);
                    jSONObject.put("Groups", jSONArray);
                }
                C34995z.m143444a(jSONArray, this.f85075b.mo103965b());
                String str20 = str6;
                if (z.has(str20) && !z.isNull(str20)) {
                    jSONObject.put(str20, z.getJSONObject(str20));
                }
            } catch (JSONException e) {
                e = e;
                OTLogger.m143457l("OTData", "Error on parsing preference center data. Error msg = " + e.getMessage());
                return jSONObject.toString();
            }
        } catch (JSONException e2) {
            e = e2;
            OTLogger.m143457l("OTData", "Error on parsing preference center data. Error msg = " + e.getMessage());
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    @C0344h1
    @C0359n0
    /* renamed from: k0 */
    public JSONArray mo103691k0(@C0359n0 JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        if (!jSONObject.has(C40928r.f104100a)) {
            return jSONArray;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(C40928r.f104100a);
        if (!jSONObject2.has("sync")) {
            return jSONArray;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("sync");
        return jSONObject3.has("ucpreferences") ? jSONObject3.getJSONArray("ucpreferences") : jSONArray;
    }

    /* renamed from: l */
    public final void mo103692l(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject2.getString(PersistedInstallation.f80251i).contains("always")) {
            if (jSONObject2.getJSONArray("FirstPartyCookies").length() > 0 && !C35020d.m143605J(jSONObject2.optString("PurposeId"))) {
                jSONObject.put("Id", jSONObject2.optString("PurposeId"));
                jSONObject.put("TransactionType", "NO_CHOICE");
                jSONArray.put(jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Id", jSONObject2.optString("PurposeId"));
                jSONObject3.put("TransactionType", "NO_CHOICE");
                jSONArray2.put(jSONObject3);
            }
            if (jSONObject2.getBoolean("IsIabPurpose") && jSONObject2.getBoolean("ShowInPopup") && C34976h.m143224k(jSONObject2, this.f85081h) && !C35020d.m143605J(jSONObject2.optString("PurposeId"))) {
                jSONObject.put("Id", jSONObject2.optString("PurposeId"));
                jSONObject.put("TransactionType", "NO_CHOICE");
                jSONArray.put(jSONObject);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("Id", jSONObject2.optString("PurposeId"));
                jSONObject4.put("TransactionType", "NO_CHOICE");
                jSONArray2.put(jSONObject4);
            }
        }
    }

    /* renamed from: l0 */
    public final void mo103693l0() {
        String string = this.f85075b.mo103965b().getString("OTT_CONSENT_STATUS", "");
        String string2 = this.f85075b.mo103965b().getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        try {
            new C34977i(this.f85074a).mo103756e(new JSONObject(string));
            new C34977i(this.f85074a).mo103754c(new JSONObject(string2));
        } catch (JSONException e) {
            OTLogger.m143457l("OTData", "error while broadcasting default consent values : " + e.getMessage());
        }
    }

    /* renamed from: m */
    public void mo103694m(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        boolean z = !jSONObject2.getString(PersistedInstallation.f80251i).equals("inactive");
        String optString = jSONObject2.optString("Parent");
        if (jSONObject2.getBoolean("IsIabPurpose") && jSONObject2.getBoolean("ShowInPopup") && C34976h.m143224k(jSONObject2, this.f85081h)) {
            jSONObject.put(jSONObject2.optString("CustomGroupId"), z ? 1 : 0);
            mo103685f(optString, z, jSONObject);
        }
    }

    @C0344h1
    /* renamed from: m0 */
    public boolean mo103695m0(@C0359n0 JSONObject jSONObject) {
        if (!jSONObject.has(C40928r.f104100a)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(C40928r.f104100a);
        if (!jSONObject2.has("sync")) {
            return false;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("sync");
        if (jSONObject3.has("shouldShowBannerAsConsentExpired")) {
            return jSONObject3.getBoolean("shouldShowBannerAsConsentExpired");
        }
        return false;
    }

    /* renamed from: n */
    public final void mo103696n(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray2) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (m143093X(jSONObject2, jSONObject) || mo103682d0(jSONObject2, jSONObject)) {
                m143098i0(jSONObject, jSONObject2, jSONObject2.optString("CustomGroupId"));
            }
            m143100o(jSONArray, jSONObject, jSONArray2, i);
        }
    }

    @C0344h1
    /* renamed from: n0 */
    public boolean mo103697n0(@C0359n0 JSONObject jSONObject) {
        return jSONObject.has("enableConsent") && jSONObject.getBoolean("enableConsent") && C35020d.m143609Q(this.f85074a);
    }

    /* renamed from: o0 */
    public final void mo103698o0(@C0359n0 JSONObject jSONObject) {
        try {
            if (this.f85076c.mo103981P() < 3) {
                new C34993x(this.f85074a).mo103907e(jSONObject);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OTData", "Migration Handler exception, error message = " + e.getMessage());
        }
    }

    /* renamed from: p */
    public void mo103699p(@C0359n0 JSONArray jSONArray, boolean z, @C0359n0 JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(this.f85075b.mo103965b().getString("OTT_CONSENT_STATUS", C28819e.f70617a));
            if (!z) {
                mo103669Q();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() > 0) {
                mo103673U(jSONArray, z, jSONObject);
            }
        } catch (Exception e) {
            OTLogger.m143457l("OTData", "error while clearing IAB values on re-consent, err : " + e.getMessage());
        }
        new C34988t(this.f85074a).mo103865r();
    }

    /* renamed from: p0 */
    public final void mo103700p0(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("eTag")) {
            String string = jSONObject.getString("eTag");
            OTLogger.m143458m("OTData", "Storing ETag = " + string);
            this.f85075b.mo103965b().edit().putString("OT_ProfileSyncETag", string).apply();
        }
    }

    /* renamed from: q0 */
    public final void mo103701q0(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("allPurposesUpdatedAfterSync")) {
            String string = jSONObject.getString("allPurposesUpdatedAfterSync");
            OTLogger.m143458m("OTData", "Storing allPurposesUpdatedAfterSync = " + string);
            this.f85075b.mo103965b().edit().putString("OTT_PROFILE_ALL_PURPOSES_UPDATED_AFTER_SYNC", string).apply();
            C35020d dVar = new C35020d();
            if (C35019c.m143598c(string, false) && dVar.mo104026a(this.f85074a) < 1) {
                dVar.mo104028i(this.f85074a, 2);
            }
        }
    }

    @C0344h1
    /* renamed from: r0 */
    public void mo103702r0(@C0359n0 JSONObject jSONObject) {
        JSONObject r = C34974f.m143194r(jSONObject);
        if (r != null) {
            try {
                if (mo103697n0(r)) {
                    new C34987s().mo103851g(this.f85074a, r);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleAdInfo", "Error on checking google add consent logging state. Error = " + e.getMessage());
            }
        }
    }

    @C0344h1
    /* renamed from: s0 */
    public void mo103703s0(@C0359n0 JSONObject jSONObject) {
        String str = "";
        String string = this.f85075b.mo103965b().getString("OT_UC_PURPOSES_UI_SERVER_DATA", str);
        JSONObject jSONObject2 = new JSONObject(this.f85075b.mo103965b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", str));
        JSONObject jSONObject3 = new JSONObject(this.f85075b.mo103965b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", str));
        JSONObject jSONObject4 = new JSONObject(this.f85075b.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", str));
        JSONObject jSONObject5 = new JSONObject(string);
        if (jSONObject5.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject6 = jSONObject5.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject6.has(C9874a.f27048E)) {
                str = jSONObject6.optString(C9874a.f27048E);
            }
        }
        if (C35019c.m143598c(str, false)) {
            JSONArray k0 = mo103691k0(jSONObject);
            for (int i = 0; i < k0.length(); i++) {
                JSONObject jSONObject7 = k0.getJSONObject(i);
                mo103658E(jSONObject2, jSONObject3, jSONObject4, jSONObject7.getString("id"), jSONObject7.getString("status"), jSONObject7.getJSONArray("topics"), jSONObject7.getJSONObject("customPreferences"));
            }
            return;
        }
        OTLogger.m143447b("OTData", "UCP is not enabled from Admin UI for this app id!");
    }

    /* renamed from: t0 */
    public final void mo103704t0(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.getJSONObject("culture").getJSONObject("DomainData").has("Groups")) {
            JSONArray jSONArray = jSONObject.getJSONObject("culture").getJSONObject("DomainData").getJSONArray("Groups");
            if (jSONArray.length() > 0) {
                String string = this.f85075b.mo103965b().getString("OTT_CONSENT_STATUS", (String) null);
                Iterator<String> keys = new JSONObject(this.f85075b.mo103965b().getString("OTT_PARENT_GROUPS", (String) null)).keys();
                JSONArray jSONArray2 = new JSONArray();
                while (keys.hasNext()) {
                    jSONArray2.put(keys.next());
                }
                this.f85075b.mo103965b().edit().putString("OTT_CONSENTABLE_PARENT_GROUPS", jSONArray2.toString()).apply();
                JSONObject jSONObject2 = !C35020d.m143605J(string) ? new JSONObject(string) : new JSONObject();
                mo103696n(jSONArray, jSONObject2, jSONArray2);
                if (new C35000d(this.f85074a).mo103932c(this.f85076c.mo104014z())) {
                    mo103699p(jSONArray, true, jSONObject2);
                }
                OTLogger.m143447b("OTData", "valid groups : " + jSONObject2);
                this.f85076c.mo104000l(mo103695m0(jSONObject));
                mo103660G(jSONObject, jSONObject2, this.f85076c.mo103994e());
                mo103698o0(jSONObject2);
                this.f85075b.mo103965b().edit().putString("OTT_CONSENT_STATUS", jSONObject2.toString()).apply();
            }
        }
    }

    /* renamed from: y */
    public void mo103705y(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        if (jSONObject2.optString("Parent").isEmpty() && jSONObject2.getJSONArray("FirstPartyCookies").length() == 0 && !C35020d.m143605J(jSONObject2.optString("PurposeId"))) {
            JSONObject jSONObject3 = new JSONObject();
            String optString = jSONObject2.optString("PurposeId");
            String f0 = mo103686f0(jSONObject2);
            if (!C35020d.m143605J(optString) && !m143090N(jSONArray, optString) && C34976h.m143224k(jSONObject2, this.f85081h)) {
                jSONObject3.put("Id", optString);
                jSONObject3.put("TransactionType", f0);
                m143107w(jSONObject, str, jSONObject2);
                jSONArray.put(jSONObject3);
                jSONArray2.put(jSONObject3);
            }
        }
    }
}
