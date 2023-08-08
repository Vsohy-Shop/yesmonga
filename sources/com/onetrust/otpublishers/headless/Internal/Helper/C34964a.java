package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.a */
public class C34964a {

    /* renamed from: a */
    public C35014d f85060a;

    /* renamed from: b */
    public C35017a f85061b = new C35017a();

    /* renamed from: c */
    public Context f85062c;

    /* renamed from: d */
    public JSONObject f85063d;

    /* renamed from: e */
    public JSONObject f85064e;

    /* renamed from: f */
    public JSONObject f85065f;

    public C34964a(@C0359n0 Context context) {
        this.f85062c = context;
        this.f85060a = new C35014d(context, "OTT_DEFAULT_USER");
        mo103592E();
    }

    /* renamed from: r */
    public static void m143003r(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        String str2;
        if (jSONObject2.has(str)) {
            jSONObject.put("userConsentStatus", jSONObject2.optJSONObject(str).optString("userConsentStatus"));
            str2 = jSONObject2.optJSONObject(str).optString("transactionType");
        } else {
            str2 = "OPT_OUT";
            jSONObject.put("userConsentStatus", str2);
        }
        jSONObject.put("transactionType", str2);
    }

    /* renamed from: A */
    public void mo103588A(@C0359n0 JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject2 = this.f85064e;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                mo103628z(optJSONArray, jSONObject2, i);
            }
        }
    }

    /* renamed from: B */
    public final void mo103589B(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3) {
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "id");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "name");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "integrationKey");
        jSONObject2.put("purposeId", str);
        jSONObject2.put("purposeTopicId", jSONObject3.optString("id") + str);
        JSONObject jSONObject4 = this.f85065f;
        m143003r(jSONObject2, jSONObject4, jSONObject3.optString("id") + str);
        jSONObject.put(jSONObject3.optString("id") + str, jSONObject2);
    }

    /* renamed from: C */
    public final void mo103590C(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    mo103620q(optJSONArray.getJSONObject(i), jSONObject2);
                } catch (JSONException e) {
                    OTLogger.m143457l("UCPurposesDataHandler", "UCP: error while creating broadcasting object:" + e.toString());
                }
            }
        }
        this.f85060a.mo103965b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject2.toString()).apply();
    }

    /* renamed from: D */
    public JSONArray mo103591D(@C0359n0 String str) {
        String string = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("purposeId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in fetching topics data by purpose :" + e.getMessage());
        }
        OTLogger.m143447b("UCPurposesDataHandler", "Topics by PurposeId :" + jSONArray);
        return jSONArray;
    }

    /* renamed from: E */
    public final void mo103592E() {
        String string = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", C28819e.f70617a);
        String string2 = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", C28819e.f70617a);
        String string3 = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", C28819e.f70617a);
        try {
            this.f85063d = new JSONObject(string);
            this.f85064e = new JSONObject(string2);
            this.f85065f = new JSONObject(string3);
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in initializing user state object :" + e.getMessage());
        }
    }

    /* renamed from: F */
    public void mo103593F(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        try {
            if (this.f85065f.has(str)) {
                JSONObject optJSONObject = this.f85065f.optJSONObject(str);
                C34973e0.m143186d(z, optJSONObject, "OPT_IN", "OPT_OUT", str2, optJSONObject.optString("id"));
                OTLogger.m143447b("UCPurposesDataHandler", "Updated topic id: " + str2 + " with status: " + z);
                return;
            }
            OTLogger.m143461p("UCPurposesDataHandler", "Invalid id passed to update topics");
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for topics :" + e.getMessage());
        }
    }

    /* renamed from: G */
    public final void mo103594G(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("topics")) {
            mo103617n(jSONObject, optString, jSONObject2.getJSONObject("topics"));
        }
    }

    /* renamed from: H */
    public void mo103595H(@C0359n0 JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject2 = this.f85063d;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                mo103621s(jSONObject2, new JSONObject(), optJSONArray.getJSONObject(i));
            }
            this.f85060a.mo103965b().edit().putString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", String.valueOf(jSONObject2)).apply();
            OTLogger.m143447b("UCPurposesDataHandler", "Saved UC Purpose Server Data :" + this.f85060a.mo103965b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", ""));
        }
    }

    /* renamed from: I */
    public int mo103596I(@C0359n0 String str) {
        int b = C34973e0.m143184b(this.f85063d, str);
        OTLogger.m143458m("UCPurposesDataHandler", "UCP: Consent Status for Purpose id " + str + " : " + b);
        return b;
    }

    /* renamed from: J */
    public void mo103597J() {
        C34973e0.m143185c(this.f85060a, this.f85063d, this.f85065f, this.f85064e);
        JSONObject r = new C35015e(this.f85062c).mo104006r();
        C34971d0 d0Var = new C34971d0(this.f85062c);
        d0Var.mo103708c(r);
        String string = this.f85060a.mo103965b().getString("OT_UCP_PURPOSE_RELATION_DATA", C28819e.f70617a);
        C34968c cVar = new C34968c(this.f85062c);
        d0Var.mo103707b(string, cVar.mo103647a());
        mo103603P(this.f85063d);
        mo103603P(this.f85065f);
        mo103603P(this.f85064e);
        cVar.mo103648b(1);
    }

    /* renamed from: K */
    public void mo103598K(@C0359n0 JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
        JSONObject jSONObject2 = new JSONObject();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    mo103594G(optJSONArray, jSONObject2, i);
                } catch (JSONException e) {
                    OTLogger.m143457l("UCPurposesDataHandler", "Error in saving topics data :" + e.getMessage());
                }
                OTLogger.m143447b("UCPurposesDataHandler", "Saved server Topic Data :" + this.f85060a.mo103965b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", ""));
            }
        }
    }

    /* renamed from: L */
    public void mo103599L(@C0359n0 String str) {
        JSONArray t = mo103622t(str);
        for (int i = 0; i < t.length(); i++) {
            JSONObject jSONObject = t.getJSONObject(i);
            mo103608e(jSONObject.optString("customPreferenceId"), jSONObject.optString("purposeOptionsId"), false);
        }
    }

    /* renamed from: M */
    public void mo103600M(@C0359n0 JSONObject jSONObject) {
        mo103602O(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        mo103595H(jSONObject);
        mo103598K(jSONObject);
        mo103614k(jSONObject);
        mo103588A(jSONObject);
        mo103592E();
        mo103590C(jSONObject, jSONObject2);
        new C34977i(this.f85062c).mo103757f(jSONObject2);
    }

    /* renamed from: N */
    public void mo103601N(@C0359n0 String str) {
        JSONArray D = mo103591D(str);
        for (int i = 0; i < D.length(); i++) {
            JSONObject jSONObject = D.getJSONObject(i);
            mo103626x(jSONObject.optString("purposeTopicId"), jSONObject.optString("id"), false);
        }
    }

    /* renamed from: O */
    public void mo103602O(@C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            jSONObject2.put(OTVendorListMode.GENERAL, jSONObject.getJSONObject(OTVendorListMode.GENERAL));
        }
        if (jSONObject.has("description")) {
            jSONObject2.put("description", jSONObject.getJSONObject("description"));
        }
        if (jSONObject.has("title")) {
            jSONObject2.put("title", jSONObject.getJSONObject("title"));
        }
        if (jSONObject.has("buttons")) {
            jSONObject2.put("buttons", jSONObject.getJSONObject("buttons"));
        }
        this.f85060a.mo103965b().edit().putString("OT_UC_PURPOSES_UI_SERVER_DATA", String.valueOf(jSONObject2)).apply();
        OTLogger.m143447b("UCPurposesDataHandler", "Saved server UCPurpose UI Data :" + this.f85060a.mo103965b().getString("OT_UC_PURPOSES_UI_SERVER_DATA", ""));
    }

    /* renamed from: P */
    public void mo103603P(@C0359n0 JSONObject jSONObject) {
        SharedPreferences.Editor edit;
        String valueOf;
        String str;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
            if (optJSONObject != null) {
                try {
                    optJSONObject.put("transactionType", optJSONObject.optString("userConsentStatus"));
                } catch (JSONException e) {
                    OTLogger.m143457l("UCPurposesDataHandler", "Error while updating previous selection to latest selection :" + e.getMessage());
                }
            }
        }
        if (jSONObject.equals(this.f85063d)) {
            edit = this.f85060a.mo103965b().edit();
            valueOf = String.valueOf(this.f85063d);
            str = "OT_UC_PURPOSES_PURPOSE_SERVER_DATA";
        } else if (jSONObject.equals(this.f85065f)) {
            edit = this.f85060a.mo103965b().edit();
            valueOf = String.valueOf(this.f85065f);
            str = "OT_UC_PURPOSES_TOPIC_SERVER_DATA";
        } else if (jSONObject.equals(this.f85064e)) {
            edit = this.f85060a.mo103965b().edit();
            valueOf = String.valueOf(this.f85064e);
            str = "OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA";
        } else {
            return;
        }
        edit.putString(str, valueOf).apply();
    }

    /* renamed from: a */
    public int mo103604a(@C0359n0 String str, @C0359n0 String str2) {
        int b = C34973e0.m143184b(this.f85065f, str.trim() + str2.trim());
        OTLogger.m143458m("UCPurposesDataHandler", "UCP: Consent Status for Topic id " + str + " : " + b);
        return b;
    }

    /* renamed from: b */
    public int mo103605b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        int b = C34973e0.m143184b(this.f85064e, str.trim() + str2.trim() + str3.trim());
        OTLogger.m143458m("UCPurposesDataHandler", "UCP: Consent Status for Custom Preference Options id " + str + " : " + b);
        return b;
    }

    /* renamed from: c */
    public JSONArray mo103606c(@C0359n0 String str) {
        String string = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("purposeId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in fetching CP data by purpose  :" + e.getMessage());
        }
        OTLogger.m143447b("UCPurposesDataHandler", "Custom Prefs by PurposeId :" + jSONArray);
        return jSONArray;
    }

    /* renamed from: d */
    public JSONObject mo103607d() {
        String string = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_UI_SERVER_DATA", "");
        String string2 = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(string);
            try {
                String optString = jSONObject2.optJSONObject(OTVendorListMode.GENERAL).optString("topicsLabel", "topics");
                JSONObject jSONObject3 = new JSONObject(string2);
                JSONArray jSONArray2 = null;
                for (int i = 0; i < jSONObject3.length(); i++) {
                    jSONArray2 = mo103623u(jSONArray, optString, jSONObject3, jSONArray2, i);
                    OTLogger.m143447b("UCPurposesDataHandler", "UCP purpose array :" + jSONArray);
                }
                jSONObject2.put("purposes", jSONArray);
                OTLogger.m143447b("UCPurposesDataHandler", "UCP Object :" + jSONObject2);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                OTLogger.m143457l("UCPurposesDataHandler", "Error in constructing Purposes data :" + e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
            OTLogger.m143457l("UCPurposesDataHandler", "Error in constructing Purposes data :" + e.getMessage());
            return jSONObject;
        }
    }

    /* renamed from: e */
    public void mo103608e(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        JSONObject optJSONObject;
        try {
            if (this.f85064e.has(str2) && (optJSONObject = this.f85064e.optJSONObject(str2)) != null) {
                C34973e0.m143186d(z, optJSONObject, "OPT_IN", "OPT_OUT", str, optJSONObject.optString("customPreferenceId"));
            }
            OTLogger.m143447b("UCPurposesDataHandler", "Updated CustomPref options object : " + this.f85064e.optJSONObject(str2));
            C34973e0.m143185c(this.f85060a, this.f85063d, this.f85065f, this.f85064e);
            mo103603P(this.f85064e);
            mo103592E();
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for CP options :" + e.getMessage());
        }
    }

    /* renamed from: f */
    public void mo103609f(@C0359n0 String str, @C0359n0 String str2, boolean z, @C0359n0 String str3) {
        try {
            if (this.f85064e.has(str2)) {
                JSONObject optJSONObject = this.f85064e.optJSONObject(str2);
                if (C34973e0.m143186d(z, optJSONObject, "OPT_IN", "OPT_OUT", str, optJSONObject.optString("customPreferenceId"))) {
                    OTLogger.m143447b("UCPurposesDataHandler", "Updated Custom Preference options: " + str3 + " of Custom Preference Id: " + str + " with status: " + z);
                    return;
                }
            }
            OTLogger.m143461p("UCPurposesDataHandler", "Invalid id passed to update custom preference options");
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for CP options :" + e.getMessage());
        }
    }

    /* renamed from: g */
    public void mo103610g(@C0359n0 String str, boolean z) {
        try {
            C34973e0.m143187e(z, this.f85063d.optJSONObject(str), "ACTIVE", "OPT_OUT", this.f85063d, str);
            OTLogger.m143447b("UCPurposesDataHandler", "Updated purpose object : " + this.f85063d.optJSONObject(str));
            C34973e0.m143185c(this.f85060a, this.f85063d, this.f85065f, this.f85064e);
            mo103603P(this.f85063d);
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for purposes :" + e.getMessage());
        }
    }

    /* renamed from: h */
    public void mo103611h(@C0363p0 JSONArray jSONArray, @C0363p0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray2) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                mo103612i(jSONArray, str, jSONObject, jSONArray2, i);
            }
        }
    }

    /* renamed from: i */
    public void mo103612i(@C0359n0 JSONArray jSONArray, @C0363p0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray2, int i) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        if (str != null && str.equals(jSONObject2.optString("customPreferenceId"))) {
            jSONArray2.put(jSONObject2);
            jSONObject.put("customPreferenceOptions", jSONArray2);
        }
    }

    /* renamed from: j */
    public final void mo103613j(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("customPreferences")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferences");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                mo103618o(jSONObject, optString, new JSONObject(), jSONArray2.getJSONObject(i2));
            }
            OTLogger.m143447b("UCPurposesDataHandler", "customPrefObjectToSave :" + jSONObject);
            this.f85060a.mo103965b().edit().putString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", String.valueOf(jSONObject)).apply();
        }
    }

    /* renamed from: k */
    public void mo103614k(@C0359n0 JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("purposes");
            JSONObject jSONObject2 = new JSONObject();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    mo103613j(optJSONArray, jSONObject2, i);
                }
                OTLogger.m143447b("UCPurposesDataHandler", "Saved server Custom Pref Data :" + this.f85060a.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_SERVER_DATA", ""));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in saving custom pref data :" + e.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo103615l(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str3) {
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "id");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "label");
        jSONObject2.put("customPreferenceId", str2);
        jSONObject2.put("purposeOptionsId", str3);
        jSONObject2.put("purposeId", str);
        m143003r(jSONObject2, this.f85064e, str3);
        jSONObject.put(str3, jSONObject2);
    }

    /* renamed from: m */
    public void mo103616m(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONArray jSONArray, @C0359n0 String str2) {
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (str.equals(jSONObject3.optString("purposeId"))) {
                jSONObject2.put("name", str2);
                jSONArray3.put(jSONObject3);
                jSONObject2.put("options", jSONArray3);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArray4 = new JSONArray();
                jSONObject.put("topics", jSONArray4);
                JSONArray jSONArray5 = jSONArray4;
                jSONObject2 = jSONObject4;
                jSONArray2 = jSONArray5;
            }
        }
        if (jSONObject2.length() > 0) {
            jSONArray2.put(jSONObject2);
        }
        jSONObject.put("topics", jSONArray2);
    }

    /* renamed from: n */
    public final void mo103617n(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject2.has("options")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("options");
            for (int i = 0; i < jSONArray.length(); i++) {
                mo103589B(jSONObject, str, new JSONObject(), jSONArray.getJSONObject(i));
            }
            this.f85060a.mo103965b().edit().putString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", String.valueOf(jSONObject)).apply();
        }
    }

    /* renamed from: o */
    public final void mo103618o(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3) {
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "id");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "name");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "description");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "selectionType");
        jSONObject2.put("selectionType", "MULTI_CHOICE");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "displayAs");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, FieldModel.f27475X);
        jSONObject2.put("purposeId", str);
        jSONObject.put(jSONObject3.optString("id"), jSONObject2);
    }

    /* renamed from: p */
    public final void mo103619p(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, int i, @C0359n0 String str) {
        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
        String optString = jSONObject2.optString("id");
        if (jSONObject2.has("customPreferenceOptions")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferenceOptions");
            OTLogger.m143447b("UCPurposesDataHandler", "customPrefArraylength() optionsArray :" + jSONArray2.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                mo103615l(jSONObject, str, optString, jSONObject3, jSONObject4, jSONObject4.optString("id") + str + optString);
            }
            this.f85060a.mo103965b().edit().putString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", String.valueOf(jSONObject)).apply();
        }
    }

    /* renamed from: q */
    public final void mo103620q(@C0359n0 JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        String optString = jSONObject.optString("id");
        jSONObject3.put("status", mo103596I(optString));
        if (jSONObject.has("topics")) {
            JSONArray jSONArray = jSONObject.getJSONObject("topics").getJSONArray("options");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString("id");
                int a = mo103604a(string, optString);
                if (a == -1) {
                    a = 0;
                }
                jSONObject4.put(string, a);
            }
        }
        jSONObject3.put("topics", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject.has("customPreferences")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("customPreferences");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                String string2 = jSONObject6.getString("id");
                JSONArray jSONArray3 = jSONObject6.getJSONArray("customPreferenceOptions");
                JSONObject jSONObject7 = new JSONObject();
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    String string3 = jSONArray3.getJSONObject(i3).getString("id");
                    int b = mo103605b(string3, optString, string2);
                    if (b == -1) {
                        b = 0;
                    }
                    jSONObject7.put(string3, b);
                }
                jSONObject5.put(string2, jSONObject7);
            }
        }
        jSONObject3.put("custom_preferences", jSONObject5);
        jSONObject2.put(optString, jSONObject3);
    }

    /* renamed from: s */
    public final void mo103621s(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3) {
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "id");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "version");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "label");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "description");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "status");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "newVersionAvailable");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "purposeType");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "consentLifeSpan");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "externalReference");
        this.f85061b.mo104016a(jSONObject2, jSONObject3, "order");
        m143003r(jSONObject2, this.f85063d, jSONObject3.optString("id"));
        jSONObject2.put("defaultConsentStatus", "OPT_OUT");
        jSONObject.put(jSONObject3.optString("id"), jSONObject2);
    }

    /* renamed from: t */
    public JSONArray mo103622t(@C0359n0 String str) {
        String string = this.f85060a.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(string);
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
                if (str.equals(jSONObject2.optString("customPreferenceId"))) {
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in fetching CP options data by purposeCPId  :" + e.getMessage());
        }
        OTLogger.m143447b("UCPurposesDataHandler", "Options by Purpose and CustomPrefId :" + jSONArray);
        return jSONArray;
    }

    /* renamed from: u */
    public JSONArray mo103623u(@C0359n0 JSONArray jSONArray, @C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0363p0 JSONArray jSONArray2, int i) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(jSONObject.names().get(i).toString());
        OTLogger.m143447b("UCPurposesDataHandler", "purposeObject :" + jSONObject2);
        String obj = jSONObject.names().get(i).toString();
        mo103616m(jSONObject2, obj, mo103591D(obj), str);
        JSONArray c = mo103606c(obj);
        JSONArray jSONArray3 = new JSONArray();
        for (int i2 = 0; i2 < c.length(); i2++) {
            JSONObject jSONObject3 = c.getJSONObject(i2);
            String optString = jSONObject3.optString("id");
            JSONArray jSONArray4 = new JSONArray();
            if (obj.equals(jSONObject3.optString("purposeId"))) {
                if (!C35020d.m143605J(optString)) {
                    optString = jSONObject3.optString("id");
                    jSONArray2 = mo103622t(optString);
                }
                mo103611h(jSONArray2, optString, jSONObject3, jSONArray4);
                jSONArray3.put(jSONObject3);
                jSONObject2.put("customPreferences", jSONArray3);
            } else {
                jSONArray3 = new JSONArray();
            }
        }
        jSONObject2.put("customPreferences", jSONArray3);
        jSONArray.put(jSONObject2);
        return jSONArray2;
    }

    /* renamed from: v */
    public JSONObject mo103624v() {
        return mo103607d();
    }

    /* renamed from: w */
    public final void mo103625w(@C0359n0 String str, @C0359n0 String str2) {
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2.has("topics") && !C35017a.m143593c(jSONObject2.getJSONObject("topics"))) {
                JSONArray names = jSONObject2.getJSONObject("topics").names();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    mo103593F(string.trim() + str.trim(), string, false);
                }
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("custom_preferences");
            if (!C35017a.m143593c(jSONObject3)) {
                for (int i2 = 0; i2 < jSONObject3.length(); i2++) {
                    String string2 = jSONObject3.names().getString(i2);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(string2);
                    for (int i3 = 0; i3 < jSONObject4.length(); i3++) {
                        String string3 = jSONObject4.names().getString(i3);
                        mo103609f(string2, string3.trim() + str.trim() + string2.trim(), false, string3);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public void mo103626x(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        try {
            if (this.f85065f.has(str)) {
                JSONObject optJSONObject = this.f85065f.optJSONObject(str);
                C34973e0.m143186d(z, optJSONObject, "OPT_IN", "OPT_OUT", str2, optJSONObject.optString("id"));
            }
            OTLogger.m143447b("UCPurposesDataHandler", "Updated topic object : " + this.f85065f.optJSONObject(str));
            C34973e0.m143185c(this.f85060a, this.f85063d, this.f85065f, this.f85064e);
            mo103603P(this.f85065f);
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for topics :" + e.getMessage());
        }
    }

    /* renamed from: y */
    public void mo103627y(@C0359n0 String str, boolean z) {
        try {
            if (C34973e0.m143187e(z, this.f85063d.optJSONObject(str), "ACTIVE", "OPT_OUT", this.f85063d, str)) {
                OTLogger.m143447b("UCPurposesDataHandler", "Updated purpose id: " + str + " with status: " + z);
                if (!z) {
                    mo103625w(str, this.f85060a.mo103965b().getString("OT_UCP_PURPOSE_RELATION_DATA", C28819e.f70617a));
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in updating consent for purposes :" + e.getMessage());
        }
    }

    /* renamed from: z */
    public final void mo103628z(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, int i) {
        try {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String optString = jSONObject2.optString("id");
            if (jSONObject2.has("customPreferences")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("customPreferences");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    mo103619p(jSONObject, jSONArray2, i2, optString);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("UCPurposesDataHandler", "Error in saving CP options data :" + e.getMessage());
        }
        OTLogger.m143447b("UCPurposesDataHandler", "Saved server Custom Pref options Data :" + this.f85060a.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", ""));
    }
}
