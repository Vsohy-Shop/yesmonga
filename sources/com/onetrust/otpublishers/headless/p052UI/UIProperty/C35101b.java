package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.b */
public class C35101b {

    /* renamed from: a */
    public Context f85638a;

    public C35101b(@C0359n0 Context context) {
        this.f85638a = context;
    }

    /* renamed from: a */
    public C35105e mo104654a(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        C35105e eVar = new C35105e();
        try {
            if (jSONObject.has(str)) {
                eVar.mo104716t(jSONObject.getString(str));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in parsing button property :" + e.getMessage());
        }
        return eVar;
    }

    @C0359n0
    /* renamed from: b */
    public C35115o mo104655b() {
        JSONObject optJSONObject;
        JSONObject g = new C35114n(this.f85638a).mo104803g();
        C35115o oVar = new C35115o();
        if (!(g == null || !g.has("prePrompt") || (optJSONObject = g.optJSONObject("prePrompt")) == null)) {
            if (optJSONObject.has(C9874a.f27048E)) {
                oVar.mo104824k(optJSONObject.optString(C9874a.f27048E));
            }
            if (optJSONObject.has("showLogo")) {
                oVar.mo104818e(optJSONObject.optBoolean("showLogo"));
            }
            if (optJSONObject.has(OTUXParamsKeys.OT_UX_LOGO_URL)) {
                oVar.mo104822i(optJSONObject.optString(OTUXParamsKeys.OT_UX_LOGO_URL));
            }
            if (optJSONObject.has("titleText")) {
                oVar.mo104821h(mo104656c(optJSONObject, "titleText"));
            }
            if (optJSONObject.has("descriptionText")) {
                oVar.mo104816c(mo104656c(optJSONObject, "descriptionText"));
            }
            if (optJSONObject.has("primaryButtonText")) {
                oVar.mo104815b(mo104654a(optJSONObject, "primaryButtonText"));
            }
            if (optJSONObject.has("secondaryButtonText")) {
                oVar.mo104820g(mo104654a(optJSONObject, "secondaryButtonText"));
            }
        }
        return oVar;
    }

    @C0359n0
    /* renamed from: c */
    public C35102b0 mo104656c(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has(str)) {
            b0Var.mo104662f(jSONObject.getString(str));
        }
        return b0Var;
    }
}
