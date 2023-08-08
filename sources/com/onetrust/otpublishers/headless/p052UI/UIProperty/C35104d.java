package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.d */
public class C35104d {

    /* renamed from: a */
    public Context f85646a;

    public C35104d(@C0359n0 Context context) {
        this.f85646a = context;
    }

    @C0363p0
    /* renamed from: a */
    public C35115o mo104698a() {
        JSONObject o = new C35103c(this.f85646a).mo104689o();
        if (o == null) {
            return null;
        }
        C35115o oVar = new C35115o();
        if (o.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            oVar.mo104817d(o.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (o.has(OTUXParamsKeys.OT_UX_CONSENT_SUMMARY_THEME)) {
            JSONObject jSONObject = o.getJSONObject(OTUXParamsKeys.OT_UX_CONSENT_SUMMARY_THEME);
            if (jSONObject.has("title")) {
                oVar.mo104821h(new C35103c(this.f85646a).mo104691r(jSONObject.getJSONObject("title")));
            }
            if (jSONObject.has("description")) {
                oVar.mo104816c(new C35103c(this.f85646a).mo104691r(jSONObject.getJSONObject("description")));
            }
        }
        if (!o.has("buttons")) {
            return oVar;
        }
        JSONObject jSONObject2 = o.getJSONObject("buttons");
        if (jSONObject2.has(OTUXParamsKeys.OT_UX_GIVE_CONSENT_BUTTON)) {
            oVar.mo104815b(new C35103c(this.f85646a).mo104678a(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_GIVE_CONSENT_BUTTON)));
        }
        if (!jSONObject2.has(OTUXParamsKeys.OT_UX_CANCEL_CONSENT_BUTTON)) {
            return oVar;
        }
        oVar.mo104820g(new C35103c(this.f85646a).mo104678a(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_CANCEL_CONSENT_BUTTON)));
        return oVar;
    }
}
