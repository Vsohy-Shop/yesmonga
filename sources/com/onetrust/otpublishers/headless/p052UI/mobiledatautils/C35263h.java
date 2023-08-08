package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34988t;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35100a0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35121u;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.h */
public class C35263h {

    /* renamed from: a */
    public JSONObject f86634a;

    /* renamed from: b */
    public C35126z f86635b;

    /* renamed from: c */
    public C35121u f86636c;

    /* renamed from: d */
    public C35102b0 f86637d;

    /* renamed from: e */
    public C35102b0 f86638e;

    /* renamed from: f */
    public C35100a0 f86639f;

    /* renamed from: g */
    public C35105e f86640g;

    /* renamed from: h */
    public String f86641h;

    /* renamed from: i */
    public String f86642i;

    /* renamed from: j */
    public String f86643j;

    /* renamed from: k */
    public String f86644k;

    /* renamed from: l */
    public String f86645l;

    /* renamed from: m */
    public String f86646m;

    /* renamed from: n */
    public String f86647n;

    /* renamed from: o */
    public String f86648o;

    /* renamed from: p */
    public String f86649p;

    /* renamed from: q */
    public Context f86650q;

    /* renamed from: r */
    public String f86651r = "";

    @C0359n0
    /* renamed from: h */
    public static String m145443h(@C0359n0 JSONObject jSONObject, @C0363p0 String str, @C0359n0 String str2) {
        if (!C35020d.m143605J(str) && str != null) {
            return str;
        }
        try {
            return jSONObject.getString(str2);
        } catch (JSONException e) {
            OTLogger.m143457l("VLDataConfig", "error while applying header text color" + e.getMessage());
            return "";
        }
    }

    @C0359n0
    /* renamed from: a */
    public C35105e mo105608a(@C0359n0 C35105e eVar, @C0359n0 String str) {
        C35105e eVar2 = new C35105e();
        C35110j o = eVar.mo104712o();
        eVar2.mo104700c(o);
        eVar2.mo104716t(mo105613f(str, eVar.mo104295s(), this.f86634a));
        if (!C35020d.m143605J(o.mo104757f())) {
            eVar2.mo104712o().mo104758g(o.mo104757f());
        }
        eVar2.mo104718v(m145443h(this.f86634a, eVar.mo104296u(), "PcButtonTextColor"));
        eVar2.mo104701d(m145443h(this.f86634a, eVar.mo104699a(), "PcButtonColor"));
        if (!C35020d.m143605J(eVar.mo104702e())) {
            eVar2.mo104703f(eVar.mo104702e());
        }
        if (!C35020d.m143605J(eVar.mo104704g())) {
            eVar2.mo104705h(eVar.mo104704g());
        }
        if (!C35020d.m143605J(eVar.mo104706i())) {
            eVar2.mo104707j(eVar.mo104706i());
        }
        return eVar2;
    }

    @C0359n0
    /* renamed from: b */
    public C35100a0 mo105609b(@C0359n0 C35100a0 a0Var, String str) {
        C35100a0 a0Var2 = new C35100a0();
        if (!C35020d.m143605J(a0Var.mo104652o())) {
            a0Var2.mo104653p(a0Var.mo104652o());
        }
        if (!C35020d.m143605J(a0Var.mo104650m())) {
            a0Var2.mo104651n(a0Var.mo104650m());
        }
        if (!C35020d.m143605J(a0Var.mo104648k())) {
            a0Var2.mo104649l(a0Var.mo104648k());
        }
        if (!C35020d.m143605J(a0Var.mo104646i())) {
            a0Var2.mo104647j(a0Var.mo104646i());
        }
        a0Var2.mo104645h(C35020d.m143605J(a0Var.mo104644g()) ? "0" : a0Var.mo104644g());
        if (!C35020d.m143605J(a0Var.mo104640c())) {
            str = a0Var.mo104640c();
        }
        if (!C35020d.m143605J(str)) {
            a0Var2.mo104641d(str);
        }
        a0Var2.mo104639b(C35020d.m143605J(a0Var.mo104638a()) ? "#2D6B6767" : a0Var.mo104638a());
        a0Var2.mo104643f(C35020d.m143605J(a0Var.mo104642e()) ? "20" : a0Var.mo104642e());
        return a0Var2;
    }

    @C0359n0
    /* renamed from: c */
    public C35102b0 mo105610c() {
        return this.f86638e;
    }

    @C0359n0
    /* renamed from: d */
    public C35102b0 mo105611d(@C0359n0 JSONObject jSONObject, @C0359n0 C35102b0 b0Var, @C0359n0 String str, boolean z) {
        C35102b0 b0Var2 = new C35102b0();
        C35110j a = b0Var.mo104657a();
        b0Var2.mo104659c(a);
        b0Var2.mo104666j(m145443h(jSONObject, b0Var.mo104667k(), "PcTextColor"));
        if (!C35020d.m143605J(a.mo104757f())) {
            b0Var2.mo104657a().mo104758g(a.mo104757f());
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            b0Var2.mo104664h(b0Var.mo104665i());
        }
        if (!z) {
            b0Var2.mo104662f(mo105613f(str, b0Var.mo104663g(), jSONObject));
        }
        return b0Var2;
    }

    @C0363p0
    /* renamed from: e */
    public String mo105612e(@C0363p0 String str, @C0359n0 String str2) {
        if (!C35020d.m143605J(str)) {
            return str;
        }
        JSONObject jSONObject = this.f86634a;
        if (jSONObject != null) {
            return jSONObject.getString(str2);
        }
        return null;
    }

    @C0359n0
    /* renamed from: f */
    public final String mo105613f(@C0359n0 String str, @C0363p0 String str2, JSONObject jSONObject) {
        return (C35020d.m143605J(str2) || str2 == null) ? !C35020d.m143605J(str) ? jSONObject.optString(str) : "" : str2;
    }

    @C0359n0
    /* renamed from: g */
    public String mo105614g(@C0359n0 JSONObject jSONObject) {
        return new C34988t(this.f86650q).mo103864q(jSONObject);
    }

    /* renamed from: i */
    public void mo105615i(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 Context context, int i) {
        try {
            this.f86650q = context;
            this.f86634a = oTPublishersHeadlessSDK.getPreferenceCenterData();
            C35256b bVar = new C35256b(i);
            C35126z h = new C35124x(this.f86650q).mo105017h(i);
            this.f86635b = h;
            if (h != null) {
                this.f86636c = h.mo105045E();
            }
            C35102b0 a = this.f86636c.mo104966a();
            a.mo104666j(m145443h(this.f86634a, a.mo104667k(), "PcTextColor"));
            a.mo104662f(mo105613f("PCenterVendorsListText", a.mo104663g(), this.f86634a));
            this.f86636c.mo104967b(a);
            this.f86637d = mo105611d(this.f86634a, this.f86635b.mo105049I(), "PCenterVendorsListText", false);
            this.f86638e = mo105611d(this.f86634a, this.f86635b.mo105053a(), "PCenterAllowAllConsentText", false);
            this.f86639f = mo105609b(this.f86635b.mo105048H(), this.f86635b.mo105066n());
            this.f86640g = mo105608a(this.f86635b.mo105069q(), "PreferenceCenterConfirmText");
            if (!C35020d.m143605J(this.f86635b.mo105066n())) {
                this.f86641h = bVar.mo105526b(this.f86635b.mo105066n(), this.f86634a.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F");
            }
            this.f86647n = !C35020d.m143605J(this.f86635b.mo105047G()) ? this.f86635b.mo105047G() : this.f86634a.optString("PcTextColor");
            this.f86648o = bVar.mo105527c(this.f86635b.mo105043C(), "PcTextColor", (JSONObject) null);
            this.f86649p = !C35020d.m143605J(this.f86635b.mo105063k()) ? this.f86635b.mo105063k() : this.f86634a.optString("PcTextColor");
            this.f86644k = this.f86635b.mo105052L();
            this.f86642i = this.f86635b.mo105051K();
            this.f86643j = this.f86635b.mo105050J();
            this.f86645l = !C35020d.m143605J(this.f86635b.mo105078y()) ? this.f86635b.mo105078y() : this.f86634a.getString("PcButtonColor");
            this.f86646m = this.f86635b.mo105076w();
            this.f86651r = this.f86634a.optString("BConsentText");
        } catch (JSONException e) {
            OTLogger.m143457l("VLDataConfig", "Error in ui property object, error message = " + e.getMessage());
        }
    }

    @C0359n0
    /* renamed from: j */
    public String mo105616j() {
        return this.f86649p;
    }

    @C0359n0
    /* renamed from: k */
    public C35105e mo105617k() {
        return this.f86640g;
    }

    @C0359n0
    /* renamed from: l */
    public String mo105618l() {
        return this.f86651r;
    }

    @C0359n0
    /* renamed from: m */
    public String mo105619m() {
        return this.f86648o;
    }

    @C0363p0
    /* renamed from: n */
    public String mo105620n() {
        return this.f86646m;
    }

    @C0359n0
    /* renamed from: o */
    public String mo105621o() {
        return this.f86645l;
    }

    @C0359n0
    /* renamed from: p */
    public String mo105622p() {
        Context context = this.f86650q;
        return new C34988t(context).mo103853b(context);
    }

    @C0359n0
    /* renamed from: q */
    public String mo105623q() {
        return this.f86641h;
    }

    @C0359n0
    /* renamed from: r */
    public String mo105624r() {
        return this.f86647n;
    }

    @C0359n0
    /* renamed from: s */
    public C35100a0 mo105625s() {
        return this.f86639f;
    }

    @C0363p0
    /* renamed from: t */
    public String mo105626t() {
        return this.f86643j;
    }

    @C0363p0
    /* renamed from: u */
    public String mo105627u() {
        return this.f86642i;
    }

    @C0363p0
    /* renamed from: v */
    public String mo105628v() {
        return this.f86644k;
    }

    @C0359n0
    /* renamed from: w */
    public C35121u mo105629w() {
        return this.f86636c;
    }

    @C0359n0
    /* renamed from: x */
    public C35102b0 mo105630x() {
        return this.f86637d;
    }
}
