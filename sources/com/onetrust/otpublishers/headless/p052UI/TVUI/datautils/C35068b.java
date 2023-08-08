package com.onetrust.otpublishers.headless.p052UI.TVUI.datautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.view.C0543g;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.datautils.b */
public class C35068b {

    /* renamed from: o */
    public static C35068b f85381o;

    /* renamed from: a */
    public JSONObject f85382a;

    /* renamed from: b */
    public String f85383b = "On";

    /* renamed from: c */
    public String f85384c = "Off";

    /* renamed from: d */
    public String f85385d = "SUB-CATEGORIES";

    /* renamed from: e */
    public String f85386e = "";

    /* renamed from: f */
    public String f85387f = "";

    /* renamed from: g */
    public String f85388g = "";

    /* renamed from: h */
    public String f85389h = "";

    /* renamed from: i */
    public String f85390i = "";

    /* renamed from: j */
    public String f85391j = "";

    /* renamed from: k */
    public String f85392k = "";

    /* renamed from: l */
    public String f85393l = "";

    /* renamed from: m */
    public String f85394m = "";

    /* renamed from: n */
    public String f85395n = "";

    /* renamed from: i */
    public static synchronized C35068b m143905i() {
        C35068b bVar;
        synchronized (C35068b.class) {
            if (f85381o == null) {
                f85381o = new C35068b();
            }
            bVar = f85381o;
        }
        return bVar;
    }

    @C0359n0
    /* renamed from: a */
    public String mo104376a() {
        return this.f85383b;
    }

    @C0359n0
    /* renamed from: b */
    public JSONObject mo104377b(@C0359n0 Context context) {
        JSONObject jSONObject = this.f85382a;
        return jSONObject != null ? jSONObject : new C34970d(context).mo103674Y();
    }

    /* renamed from: c */
    public void mo104378c(@C0363p0 String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    this.f85382a = new JSONObject(str);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "OTT Data not found on TV, err = " + e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public final void mo104379d(@C0359n0 JSONObject jSONObject, boolean z) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            if (z) {
                this.f85386e = jSONObject2.optString("buttonFocusColor");
                this.f85387f = jSONObject2.optString("buttonFocusTextColor");
                return;
            }
            this.f85388g = jSONObject2.optString("buttonFocusColor");
            this.f85389h = jSONObject2.optString("buttonFocusTextColor");
        }
    }

    @C0359n0
    /* renamed from: e */
    public String mo104380e() {
        return this.f85386e;
    }

    /* renamed from: f */
    public void mo104381f(@C0359n0 Context context) {
        JSONObject optJSONObject;
        try {
            JSONObject b = mo104377b(context);
            this.f85382a = b;
            if (!C35017a.m143593c(b)) {
                JSONObject optJSONObject2 = this.f85382a.optJSONObject("preferenceCenterData");
                if (!(optJSONObject2 == null || !optJSONObject2.has("purposeList") || (optJSONObject = optJSONObject2.optJSONObject("purposeList")) == null)) {
                    this.f85383b = optJSONObject.optString("ActiveText");
                    this.f85384c = optJSONObject.optString("InactiveText");
                    this.f85385d = optJSONObject.optString("SubCategoryHeaderText");
                }
                mo104379d(this.f85382a.getJSONObject("bannerData"), true);
                JSONObject jSONObject = this.f85382a.getJSONObject("preferenceCenterData");
                mo104379d(jSONObject, false);
                if (jSONObject.has(C0543g.f1415f)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C0543g.f1415f);
                    this.f85390i = jSONObject2.optString("color");
                    this.f85391j = jSONObject2.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR);
                    this.f85392k = jSONObject2.optString("focusColor");
                    this.f85393l = jSONObject2.optString("focusTextColor");
                    this.f85394m = jSONObject2.optString("activeColor");
                    this.f85395n = jSONObject2.optString("activeTextColor");
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error while parsing OTT data, error: " + e.getMessage());
        }
    }

    @C0359n0
    /* renamed from: g */
    public String mo104382g() {
        return this.f85387f;
    }

    @C0359n0
    /* renamed from: h */
    public String mo104383h() {
        return this.f85384c;
    }

    @C0359n0
    /* renamed from: j */
    public String mo104384j() {
        return this.f85388g;
    }

    @C0359n0
    /* renamed from: k */
    public String mo104385k() {
        return this.f85389h;
    }

    @C0359n0
    /* renamed from: l */
    public String mo104386l() {
        return this.f85394m;
    }

    @C0359n0
    /* renamed from: m */
    public String mo104387m() {
        return this.f85395n;
    }

    @C0359n0
    /* renamed from: n */
    public String mo104388n() {
        return this.f85390i;
    }

    @C0359n0
    /* renamed from: o */
    public String mo104389o() {
        return this.f85392k;
    }

    @C0359n0
    /* renamed from: p */
    public String mo104390p() {
        return this.f85393l;
    }

    @C0359n0
    /* renamed from: q */
    public String mo104391q() {
        return this.f85391j;
    }

    @C0359n0
    /* renamed from: r */
    public String mo104392r() {
        return this.f85385d;
    }
}
