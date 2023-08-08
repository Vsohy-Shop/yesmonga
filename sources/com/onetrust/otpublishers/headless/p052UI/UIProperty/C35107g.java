package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.g */
public class C35107g {
    @C0359n0
    /* renamed from: d */
    public static C35110j m144328d(@C0359n0 JSONObject jSONObject) {
        C35110j jVar = new C35110j();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FONT_SIZE)) {
            jVar.mo104758g(jSONObject.getString(OTUXParamsKeys.OT_UX_FONT_SIZE));
        }
        return jVar;
    }

    @C0359n0
    /* renamed from: a */
    public C35105e mo104733a(@C0359n0 JSONObject jSONObject) {
        C35105e eVar = new C35105e();
        try {
            if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_RADIUS)) {
                eVar.mo104705h(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_RADIUS));
            }
            if (jSONObject.has("text")) {
                eVar.mo104716t(jSONObject.getString("text"));
            }
            eVar.mo104700c(m144328d(jSONObject));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in parsing button property :" + e.getMessage());
        }
        return eVar;
    }

    /* renamed from: b */
    public C35105e mo104734b(JSONObject jSONObject, int i) {
        C35105e eVar = new C35105e();
        try {
            if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_RADIUS)) {
                eVar.mo104705h(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_RADIUS));
            }
            if (jSONObject.has("text")) {
                eVar.mo104716t(jSONObject.getString("text"));
            }
            if (jSONObject.has(C9874a.f27048E)) {
                eVar.mo104713p(jSONObject.getString(C9874a.f27048E));
            }
            eVar.mo104701d(new C35109i().mo104752a(i, jSONObject.optString("color"), jSONObject.optString("colorDark")));
            eVar.mo104718v(new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark")));
            eVar.mo104700c(m144328d(jSONObject));
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in parsing button property :" + e.getMessage());
        }
        return eVar;
    }

    @C0359n0
    /* renamed from: c */
    public C35102b0 mo104735c(JSONObject jSONObject, int i, boolean z) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("text") && z) {
            b0Var.mo104662f(jSONObject.getString("text"));
        }
        if (jSONObject.has("textAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("textAlign")));
        }
        if (jSONObject.has(C9874a.f27048E)) {
            b0Var.mo104660d(jSONObject.getString(C9874a.f27048E));
        }
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark")));
        b0Var.mo104659c(m144328d(jSONObject));
        return b0Var;
    }

    @C0359n0
    /* renamed from: e */
    public C35102b0 mo104736e(@C0359n0 JSONObject jSONObject, int i) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("textAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("textAlign")));
        }
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark")));
        b0Var.mo104659c(m144328d(jSONObject));
        return b0Var;
    }

    @C0359n0
    /* renamed from: f */
    public C35102b0 mo104737f(@C0359n0 JSONObject jSONObject) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("text")) {
            b0Var.mo104662f(jSONObject.getString("text"));
        }
        if (jSONObject.has("textAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("textAlign")));
        }
        if (jSONObject.has(C9874a.f27048E)) {
            b0Var.mo104660d(jSONObject.getString(C9874a.f27048E));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            b0Var.mo104666j(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_COLOR));
        }
        b0Var.mo104659c(m144328d(jSONObject));
        return b0Var;
    }
}
