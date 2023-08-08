package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.C40042a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTBannerHeightRatio;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35116p;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35117q;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.a */
public class C35255a {

    /* renamed from: a */
    public JSONObject f86569a;

    /* renamed from: b */
    public C35117q f86570b;

    /* renamed from: c */
    public C35118r f86571c;

    /* renamed from: a */
    public double mo105506a(@C0359n0 String str) {
        if (C35020d.m143605J(str)) {
            return 1.0d;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 288473524:
                if (str.equals(OTBannerHeightRatio.TWO_THIRD)) {
                    c = 0;
                    break;
                }
                break;
            case 1945285198:
                if (str.equals(OTBannerHeightRatio.ONE_THIRD)) {
                    c = 1;
                    break;
                }
                break;
            case 2002049644:
                if (str.equals(OTBannerHeightRatio.ONE_HALF)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 0.66d;
            case 1:
                return 0.33d;
            case 2:
                return 0.5d;
            default:
                return 1.0d;
        }
    }

    /* renamed from: b */
    public int mo105507b(int i) {
        if (this.f86569a == null) {
            return 8;
        }
        return mo105511f(i);
    }

    @C0359n0
    /* renamed from: c */
    public String mo105508c() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("AlertAllowCookiesText") : "";
    }

    @C0363p0
    /* renamed from: d */
    public JSONObject mo105509d(@C0359n0 Context context, int i, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 String str) {
        try {
            JSONObject bannerData = oTPublishersHeadlessSDK.getBannerData();
            this.f86569a = bannerData;
            UIUtils.m143744I(bannerData, true);
            C35116p a = C35116p.m144453a(this.f86569a, str);
            C35124x xVar = new C35124x(context, i);
            this.f86570b = xVar.mo105011b(a);
            this.f86571c = xVar.mo105014e();
            int i2 = 0;
            if (!this.f86570b.mo104841B().mo104669m() || C35020d.m143605J(this.f86570b.mo104841B().mo104663g())) {
                this.f86570b.mo104841B().mo104658b(8);
            } else {
                this.f86570b.mo104841B().mo104658b(0);
            }
            if (this.f86569a == null) {
                return null;
            }
            C35102b0 a2 = this.f86570b.mo104842C().mo104763a();
            C35015e eVar = new C35015e(context);
            if (this.f86569a.optBoolean("IsIabEnabled")) {
                if (C35020d.m143605J(a2.mo104663g())) {
                    a2.mo104662f(this.f86569a.optString("BannerIABPartnersLink"));
                }
                if (!C35020d.m143605J(a2.mo104663g())) {
                    a2.mo104658b(i2);
                    this.f86570b.mo104842C().mo104765c(a2);
                    return this.f86569a;
                }
            } else if (eVar.f85172b.mo103962g() && !C35020d.m143605J(a2.mo104663g())) {
                a2.mo104658b(i2);
                this.f86570b.mo104842C().mo104765c(a2);
                return this.f86569a;
            }
            i2 = 8;
            a2.mo104658b(i2);
            this.f86570b.mo104842C().mo104765c(a2);
            return this.f86569a;
        } catch (JSONException e) {
            OTLogger.m143457l("Banner Config", "Error in banner data initialization. Error msg = " + e.getMessage());
        }
    }

    /* renamed from: e */
    public int mo105510e() {
        JSONObject jSONObject = this.f86569a;
        return (jSONObject == null || !jSONObject.optBoolean("ShowBannerAcceptButton") || "".equals(mo105508c())) ? 8 : 0;
    }

    /* renamed from: f */
    public final int mo105511f(int i) {
        if (1 == i) {
            return (!this.f86569a.optBoolean("ShowBannerCookieSettings") || this.f86569a.optBoolean("BannerSettingsButtonDisplayLink")) ? 8 : 0;
        }
        if (i == 0) {
            return (!this.f86569a.optBoolean("ShowBannerCookieSettings") || !this.f86569a.optBoolean("BannerSettingsButtonDisplayLink")) ? 8 : 0;
        }
        return 8;
    }

    @C0359n0
    /* renamed from: g */
    public String mo105512g(@C0359n0 String str) {
        return str.replace("[", "").replace("]", "").replace("\"", "").replace(C40042a.f102078h, "");
    }

    @C0359n0
    /* renamed from: h */
    public String mo105513h() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("BannerAdditionalDescPlacement", "AfterDescription") : "";
    }

    @C0359n0
    /* renamed from: i */
    public String mo105514i() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("BannerLinkText") : "";
    }

    /* renamed from: j */
    public int mo105515j() {
        JSONObject jSONObject = this.f86569a;
        return (jSONObject == null || !jSONObject.has("BannerLinkText") || mo105514i().isEmpty()) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: k */
    public String mo105516k() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("BannerDPDDescription", "") : "";
    }

    @C0359n0
    /* renamed from: l */
    public String mo105517l() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("BannerDPDTitle") : "";
    }

    /* renamed from: m */
    public int mo105518m() {
        return (this.f86569a == null || mo105519n() != 0 || mo105517l().isEmpty()) ? 8 : 0;
    }

    /* renamed from: n */
    public int mo105519n() {
        JSONObject jSONObject = this.f86569a;
        return (jSONObject == null || !jSONObject.optBoolean("IsIabEnabled") || "".equals(this.f86569a.optString("IabType"))) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: o */
    public String mo105520o() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("AlertMoreInfoText") : "";
    }

    /* renamed from: p */
    public C35117q mo105521p() {
        return this.f86570b;
    }

    /* renamed from: q */
    public C35118r mo105522q() {
        return this.f86571c;
    }

    @C0359n0
    /* renamed from: r */
    public String mo105523r() {
        JSONObject jSONObject = this.f86569a;
        return jSONObject != null ? jSONObject.optString("BannerRejectAllButtonText") : "";
    }

    /* renamed from: s */
    public int mo105524s() {
        JSONObject jSONObject = this.f86569a;
        return (jSONObject == null || !jSONObject.optBoolean("BannerShowRejectAllButton")) ? 8 : 0;
    }
}
