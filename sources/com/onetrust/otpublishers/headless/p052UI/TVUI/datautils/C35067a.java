package com.onetrust.otpublishers.headless.p052UI.TVUI.datautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35033b;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35106f;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35111k;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35112l;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35114n;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35117q;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35256b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.datautils.a */
public class C35067a {

    /* renamed from: g */
    public static C35067a f85374g;

    /* renamed from: a */
    public JSONObject f85375a;

    /* renamed from: b */
    public String f85376b = "";

    /* renamed from: c */
    public boolean f85377c;

    /* renamed from: d */
    public String f85378d = "";

    /* renamed from: e */
    public C35033b f85379e;

    /* renamed from: f */
    public C35117q f85380f;

    /* renamed from: d */
    public static void m143883d(@C0359n0 C35105e eVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (C35020d.m143605J(eVar.mo104295s())) {
            eVar.mo104716t(str);
        }
        if (C35020d.m143605J(eVar.mo104699a())) {
            eVar.mo104701d(str2);
        }
        if (C35020d.m143605J(eVar.mo104296u())) {
            eVar.mo104718v(str3);
        }
        int i = 0;
        if (!C35019c.m143598c(eVar.mo104719x(), false) || C35020d.m143605J(eVar.mo104295s())) {
            i = 8;
        }
        eVar.mo104294b(i);
        eVar.mo104709l(C35068b.m143905i().mo104380e());
        eVar.mo104711n(C35068b.m143905i().mo104382g());
    }

    /* renamed from: o */
    public static synchronized C35067a m143884o() {
        C35067a aVar;
        synchronized (C35067a.class) {
            if (f85374g == null) {
                f85374g = new C35067a();
            }
            aVar = f85374g;
        }
        return aVar;
    }

    /* renamed from: a */
    public final int mo104356a(@C0363p0 String str) {
        return (str == null || C35020d.m143605J(str) || !mo104375v()) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: b */
    public C35105e mo104357b() {
        return this.f85380f.mo104843a();
    }

    @C0359n0
    /* renamed from: c */
    public JSONObject mo104358c(@C0359n0 Context context) {
        JSONObject jSONObject = this.f85375a;
        return jSONObject != null ? jSONObject : new C34970d(context).mo103681d();
    }

    /* renamed from: e */
    public final void mo104359e(@C0359n0 C35106f fVar) {
        this.f85379e = new C35033b();
        if (!C35019c.m143598c(fVar.mo104725f(), false)) {
            this.f85379e.mo104294b(8);
            this.f85379e.mo104286A(8);
        } else if (!C35019c.m143598c(fVar.mo104727h(), false) || C35020d.m143605J(fVar.mo104729j())) {
            C35105e eVar = new C35105e();
            eVar.mo104709l(C35068b.m143905i().mo104380e());
            eVar.mo104711n(C35068b.m143905i().mo104382g());
            this.f85379e.mo104298y(eVar);
            this.f85379e.mo104294b(0);
            this.f85379e.mo104286A(8);
        } else {
            this.f85379e.mo104716t(fVar.mo104729j());
            String c = new C35256b(22).mo105527c(fVar.mo104731l(), "BannerLinksTextColor", this.f85375a);
            if (!C35020d.m143605J(c)) {
                this.f85379e.mo104718v(c);
            }
            C35105e eVar2 = new C35105e();
            eVar2.mo104709l(C35068b.m143905i().mo104380e());
            eVar2.mo104711n(C35068b.m143905i().mo104382g());
            this.f85379e.mo104298y(eVar2);
            this.f85379e.mo104294b(8);
            this.f85379e.mo104286A(0);
        }
    }

    /* renamed from: f */
    public final void mo104360f(@C0359n0 C35102b0 b0Var, @C0359n0 String str) {
        if (C35020d.m143605J(b0Var.mo104667k())) {
            b0Var.mo104666j(this.f85376b);
        }
        if (C35020d.m143605J(b0Var.mo104663g())) {
            b0Var.mo104662f(str);
        }
        b0Var.mo104658b(C35020d.m143605J(b0Var.mo104663g()) ? 8 : 0);
    }

    @C0359n0
    /* renamed from: g */
    public C35102b0 mo104361g() {
        return this.f85380f.mo104869z();
    }

    /* renamed from: h */
    public void mo104362h(@C0359n0 Context context) {
        try {
            JSONObject c = mo104358c(context);
            this.f85375a = c;
            String optString = c.optString("BackgroundColor");
            this.f85376b = this.f85375a.optString("TextColor");
            String optString2 = this.f85375a.optString("BannerTitle");
            String optString3 = this.f85375a.optString("AlertNoticeText");
            String optString4 = this.f85375a.optString("AlertAllowCookiesText");
            String optString5 = this.f85375a.optString("BannerRejectAllButtonText");
            String optString6 = this.f85375a.optString("AlertMoreInfoText");
            String optString7 = this.f85375a.optString("ButtonColor");
            String optString8 = this.f85375a.optString("ButtonColor");
            String optString9 = this.f85375a.optString("BannerMPButtonColor");
            String optString10 = this.f85375a.optString("ButtonTextColor");
            String optString11 = this.f85375a.optString("BannerMPButtonTextColor");
            this.f85377c = this.f85375a.optBoolean("IsIabEnabled");
            String optString12 = this.f85375a.optString("BannerDPDTitle");
            String b = new C35036e().mo104302b(this.f85375a.optString("BannerDPDDescription"));
            String optString13 = this.f85375a.optString("OptanonLogo");
            String optString14 = this.f85375a.optString("BannerAdditionalDescription");
            this.f85378d = this.f85375a.optString("BannerAdditionalDescPlacement");
            String optString15 = this.f85375a.optString("BannerIABPartnersLink");
            String str = b;
            C35117q K = new C35114n(context).mo104797K();
            this.f85380f = K;
            if (K != null) {
                mo104359e(K.mo104856n());
                m143883d(this.f85380f.mo104843a(), optString4, optString7, optString10);
                m143883d(this.f85380f.mo104867x(), optString5, optString8, optString10);
                m143883d(this.f85380f.mo104868y(), optString6, optString9, optString11);
                C35111k C = this.f85380f.mo104842C();
                C35102b0 a = C.mo104763a();
                if (C35020d.m143605J(a.mo104663g())) {
                    a.mo104662f(optString15);
                }
                if (C35020d.m143605J(a.mo104667k())) {
                    a.mo104666j(this.f85375a.optString("BannerLinksTextColor"));
                }
                C.mo104765c(a);
                if (!C35019c.m143598c(C.mo104767e(), false) || !this.f85377c) {
                    C.mo104764b(8);
                } else {
                    C.mo104764b(0);
                }
                if (C35020d.m143605J(this.f85380f.mo104851i())) {
                    this.f85380f.mo104849g(optString);
                }
                mo104360f(this.f85380f.mo104841B(), optString2);
                mo104360f(this.f85380f.mo104840A(), optString3);
                C35102b0 s = this.f85380f.mo104861s();
                mo104360f(s, optString12);
                s.mo104658b(mo104356a(s.mo104663g()));
                C35102b0 q = this.f85380f.mo104859q();
                mo104360f(q, str);
                q.mo104658b(mo104356a(q.mo104663g()));
                mo104360f(this.f85380f.mo104869z(), optString14);
                C35112l v = this.f85380f.mo104865v();
                if (C35020d.m143605J(v.mo104774c())) {
                    v.mo104775d(optString13);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error while parsing Banner data, error: " + e.getMessage());
        }
    }

    /* renamed from: i */
    public void mo104363i(@C0363p0 String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    this.f85375a = new JSONObject(str);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "Banner Data not found on TV, err = " + e.getMessage());
            }
        }
    }

    @C0359n0
    /* renamed from: j */
    public String mo104364j() {
        return this.f85378d;
    }

    @C0359n0
    /* renamed from: k */
    public String mo104365k() {
        return this.f85380f.mo104851i() != null ? this.f85380f.mo104851i() : "#FFFFFF";
    }

    @C0359n0
    /* renamed from: l */
    public C35102b0 mo104366l() {
        return this.f85380f.mo104840A();
    }

    @C0359n0
    /* renamed from: m */
    public C35102b0 mo104367m() {
        return this.f85380f.mo104859q();
    }

    @C0359n0
    /* renamed from: n */
    public C35102b0 mo104368n() {
        return this.f85380f.mo104861s();
    }

    @C0359n0
    /* renamed from: p */
    public C35112l mo104369p() {
        return this.f85380f.mo104865v();
    }

    @C0359n0
    /* renamed from: q */
    public C35105e mo104370q() {
        return this.f85380f.mo104868y();
    }

    @C0359n0
    /* renamed from: r */
    public C35105e mo104371r() {
        return this.f85380f.mo104867x();
    }

    @C0359n0
    /* renamed from: s */
    public C35033b mo104372s() {
        return this.f85379e;
    }

    @C0359n0
    /* renamed from: t */
    public C35102b0 mo104373t() {
        return this.f85380f.mo104841B();
    }

    @C0359n0
    /* renamed from: u */
    public C35111k mo104374u() {
        return this.f85380f.mo104842C();
    }

    /* renamed from: v */
    public boolean mo104375v() {
        return this.f85377c;
    }
}
