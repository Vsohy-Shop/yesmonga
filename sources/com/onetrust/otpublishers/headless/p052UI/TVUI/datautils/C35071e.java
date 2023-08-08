package com.onetrust.otpublishers.headless.p052UI.TVUI.datautils;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.datautils.e */
public class C35071e {

    /* renamed from: t */
    public static C35071e f85414t;

    /* renamed from: a */
    public JSONObject f85415a;

    /* renamed from: b */
    public JSONObject f85416b;

    /* renamed from: c */
    public String f85417c = "";

    /* renamed from: d */
    public String f85418d = "";

    /* renamed from: e */
    public String f85419e = "";

    /* renamed from: f */
    public String f85420f = "";

    /* renamed from: g */
    public String f85421g = "";

    /* renamed from: h */
    public String f85422h = "";

    /* renamed from: i */
    public String f85423i = "";

    /* renamed from: j */
    public String f85424j = "";

    /* renamed from: k */
    public String f85425k = "";

    /* renamed from: l */
    public String f85426l = "";

    /* renamed from: m */
    public String f85427m = "";

    /* renamed from: n */
    public String f85428n = "";

    /* renamed from: o */
    public String f85429o = "";

    /* renamed from: p */
    public String f85430p = "";

    /* renamed from: q */
    public String f85431q = "";

    /* renamed from: r */
    public String f85432r = "";

    /* renamed from: s */
    public String f85433s = "";

    /* renamed from: m */
    public static synchronized C35071e m143968m() {
        C35071e eVar;
        synchronized (C35071e.class) {
            if (f85414t == null) {
                f85414t = new C35071e();
            }
            eVar = f85414t;
        }
        return eVar;
    }

    @C0359n0
    /* renamed from: a */
    public String mo104434a() {
        return this.f85432r;
    }

    @C0359n0
    /* renamed from: b */
    public String mo104435b(@C0359n0 JSONObject jSONObject) {
        return (jSONObject.has("identifier") || jSONObject.has("name")) ? jSONObject.optString("identifier").isEmpty() ? jSONObject.optString("name") : jSONObject.optString("identifier") : "";
    }

    @C0359n0
    /* renamed from: c */
    public String mo104436c() {
        return this.f85429o;
    }

    @C0359n0
    /* renamed from: d */
    public String mo104437d(@C0359n0 JSONObject jSONObject) {
        return (jSONObject.optJSONArray("purposes") == null || jSONObject.optJSONArray("purposes").length() <= 0) ? "" : jSONObject.optJSONArray("purposes").toString().replace("[", "").replace("]", "");
    }

    @C0359n0
    /* renamed from: e */
    public String mo104438e() {
        return this.f85431q;
    }

    /* renamed from: f */
    public void mo104439f(@C0363p0 JSONObject jSONObject) {
        this.f85415a = jSONObject;
    }

    @C0359n0
    /* renamed from: g */
    public String mo104440g() {
        return this.f85433s;
    }

    /* renamed from: h */
    public void mo104441h(@C0359n0 JSONObject jSONObject) {
        this.f85416b = jSONObject;
        mo104455w();
    }

    @C0359n0
    /* renamed from: i */
    public String mo104442i() {
        return this.f85421g;
    }

    @C0359n0
    /* renamed from: j */
    public String mo104443j() {
        return this.f85430p;
    }

    @C0359n0
    /* renamed from: k */
    public String mo104444k() {
        return this.f85428n;
    }

    @C0359n0
    /* renamed from: l */
    public String mo104445l() {
        return this.f85424j;
    }

    @C0359n0
    /* renamed from: n */
    public String mo104446n() {
        return this.f85423i;
    }

    @C0359n0
    /* renamed from: o */
    public String mo104447o() {
        return this.f85427m;
    }

    @C0359n0
    /* renamed from: p */
    public String mo104448p() {
        return this.f85419e;
    }

    @C0359n0
    /* renamed from: q */
    public String mo104449q() {
        return this.f85420f;
    }

    @C0359n0
    /* renamed from: r */
    public String mo104450r() {
        return this.f85422h;
    }

    @C0359n0
    /* renamed from: s */
    public String mo104451s() {
        return this.f85426l;
    }

    @C0359n0
    /* renamed from: t */
    public String mo104452t() {
        return this.f85425k;
    }

    @C0359n0
    /* renamed from: u */
    public String mo104453u() {
        return this.f85417c;
    }

    @C0359n0
    /* renamed from: v */
    public String mo104454v() {
        return this.f85418d;
    }

    /* renamed from: w */
    public void mo104455w() {
        JSONObject jSONObject;
        if (this.f85415a != null && (jSONObject = this.f85416b) != null) {
            this.f85417c = jSONObject.optString("name");
            this.f85419e = this.f85415a.optString("PCenterVendorListLifespan") + " : ";
            this.f85421g = this.f85415a.optString("PCenterVendorListDisclosure");
            this.f85422h = this.f85415a.optString("BConsentPurposesText");
            this.f85423i = this.f85415a.optString("BLegitimateInterestPurposesText");
            this.f85426l = this.f85415a.optString("BSpecialFeaturesText");
            this.f85425k = this.f85415a.optString("BSpecialPurposesText");
            this.f85424j = this.f85415a.optString("BFeaturesText");
            this.f85418d = this.f85415a.optString("PCenterViewPrivacyPolicyText") + " : \n" + this.f85416b.optString("policyUrl");
            this.f85420f = new UIUtils().mo104272g(this.f85416b.optLong("cookieMaxAgeSeconds"), this.f85415a);
            this.f85427m = this.f85415a.optString("PCenterVendorListNonCookieUsage");
            this.f85428n = this.f85416b.optString("deviceStorageDisclosureUrl");
            this.f85429o = this.f85415a.optString("PCenterVendorListStorageIdentifier") + " : ";
            this.f85430p = this.f85415a.optString("PCenterVendorListStorageType") + " : ";
            this.f85431q = this.f85415a.optString("PCenterVendorListLifespan") + " : ";
            this.f85432r = this.f85415a.optString("PCenterVendorListStorageDomain") + " : ";
            this.f85433s = this.f85415a.optString("PCenterVendorListStoragePurposes") + " : ";
        }
    }
}
