package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35018b;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35033b;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35106f;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35111k;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35112l;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35120t;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.d */
public class C35259d {

    /* renamed from: A */
    public C35102b0 f86573A;

    /* renamed from: B */
    public C35102b0 f86574B;

    /* renamed from: C */
    public C35102b0 f86575C;

    /* renamed from: D */
    public String f86576D;

    /* renamed from: E */
    public String f86577E;

    /* renamed from: F */
    public String f86578F = "";

    /* renamed from: a */
    public C35033b f86579a;

    /* renamed from: b */
    public C35033b f86580b;

    /* renamed from: c */
    public C35256b f86581c;

    /* renamed from: d */
    public JSONObject f86582d;

    /* renamed from: e */
    public C35033b f86583e;

    /* renamed from: f */
    public C35033b f86584f;

    /* renamed from: g */
    public C35033b f86585g;

    /* renamed from: h */
    public C35033b f86586h;

    /* renamed from: i */
    public C35033b f86587i;

    /* renamed from: j */
    public C35033b f86588j;

    /* renamed from: k */
    public C35033b f86589k;

    /* renamed from: l */
    public C35033b f86590l;

    /* renamed from: m */
    public boolean f86591m;

    /* renamed from: n */
    public JSONArray f86592n;

    /* renamed from: o */
    public String f86593o;

    /* renamed from: p */
    public String f86594p;

    /* renamed from: q */
    public String f86595q;

    /* renamed from: r */
    public String f86596r;

    /* renamed from: s */
    public C35120t f86597s;

    /* renamed from: t */
    public C35118r f86598t;

    /* renamed from: u */
    public C35033b f86599u;

    /* renamed from: v */
    public C35033b f86600v;

    /* renamed from: w */
    public String f86601w;

    /* renamed from: x */
    public String f86602x;

    /* renamed from: y */
    public C35102b0 f86603y;

    /* renamed from: z */
    public C35102b0 f86604z;

    /* renamed from: f */
    public static C35120t m145356f(@C0359n0 JSONObject jSONObject, @C0359n0 C35120t tVar) {
        C35102b0 d0 = tVar.mo104939d0();
        if (C35020d.m143605J(d0.mo104663g()) && !C35020d.m143605J(jSONObject.optString("MainText"))) {
            d0.mo104662f(jSONObject.optString("MainText"));
            d0.mo104660d(String.valueOf(true));
            tVar.mo104916K(d0);
        }
        C35102b0 c0 = tVar.mo104937c0();
        if (C35020d.m143605J(c0.mo104663g()) && !C35020d.m143605J(jSONObject.optString("MainInfoText"))) {
            c0.mo104662f(jSONObject.optString("MainInfoText"));
            c0.mo104660d(String.valueOf(true));
            tVar.mo104913H(c0);
        }
        C35112l S = tVar.mo104924S();
        if (C35020d.m143605J(S.mo104774c()) && !C35020d.m143605J(jSONObject.optString("OptanonLogo"))) {
            S.mo104775d(jSONObject.optString("OptanonLogo"));
            tVar.mo104946h(S);
        }
        C35111k V = tVar.mo104927V();
        if (!C35020d.m143605J(jSONObject.optString("AboutText")) && C35020d.m143605J(V.mo104763a().mo104663g())) {
            V.mo104763a().mo104662f(jSONObject.optString("AboutText"));
            V.mo104763a().mo104660d(String.valueOf(true));
            if (C35020d.m143605J(V.mo104769g())) {
                V.mo104768f(jSONObject.optString("AboutLink"));
            }
            tVar.mo104944g(V);
        }
        C35111k c = tVar.mo104936c();
        if (!C35020d.m143605J(jSONObject.optString("PCenterVendorsListText")) && C35020d.m143605J(c.mo104763a().mo104663g())) {
            c.mo104763a().mo104662f(jSONObject.optString("PCenterVendorsListText"));
            c.mo104763a().mo104660d(String.valueOf(true));
            tVar.mo104952n(c);
        }
        C35102b0 X = tVar.mo104929X();
        if (C35020d.m143605J(X.mo104663g()) && !C35020d.m143605J(jSONObject.optString("PreferenceCenterManagePreferencesText"))) {
            X.mo104662f(jSONObject.optString("PreferenceCenterManagePreferencesText"));
        }
        X.mo104660d(String.valueOf(true));
        tVar.mo104910E(X);
        C35105e d = tVar.mo104938d();
        if (C35020d.m143605J(d.mo104295s())) {
            d.mo104716t(jSONObject.optString("ConfirmText", ""));
            d.mo104713p(C35020d.m143605J(jSONObject.optString("ConfirmText", "")) ? String.valueOf(false) : String.valueOf(true));
            tVar.mo104940e(d);
        }
        C35105e Y = tVar.mo104930Y();
        if (C35020d.m143605J(Y.mo104295s())) {
            Y.mo104716t(jSONObject.optString("PCenterRejectAllButtonText", ""));
            Y.mo104713p((!jSONObject.optBoolean("PCenterShowRejectAllButton") || C35020d.m143605J(jSONObject.optString("PCenterRejectAllButtonText", ""))) ? String.valueOf(false) : String.valueOf(true));
            tVar.mo104956r(Y);
        }
        C35105e x = tVar.mo104963x();
        if (C35020d.m143605J(x.mo104295s())) {
            x.mo104716t(jSONObject.optString("PreferenceCenterConfirmText", ""));
        }
        x.mo104713p(String.valueOf(true));
        tVar.mo104951m(x);
        return tVar;
    }

    /* renamed from: m */
    public static void m145357m(@C0359n0 C35112l lVar, @C0359n0 C35033b bVar) {
        bVar.mo104716t((lVar.mo104774c() == null || lVar.mo104774c().equals("")) ? null : lVar.mo104774c());
        bVar.mo104294b(lVar.mo104776e() ? 0 : 8);
    }

    /* renamed from: A */
    public String mo105529A() {
        return this.f86601w;
    }

    /* renamed from: B */
    public C35102b0 mo105530B() {
        return this.f86603y;
    }

    /* renamed from: C */
    public C35033b mo105531C() {
        return this.f86600v;
    }

    /* renamed from: D */
    public C35033b mo105532D() {
        return this.f86585g;
    }

    /* renamed from: E */
    public C35118r mo105533E() {
        return this.f86598t;
    }

    /* renamed from: F */
    public C35120t mo105534F() {
        return this.f86597s;
    }

    /* renamed from: G */
    public String mo105535G() {
        return this.f86594p;
    }

    /* renamed from: H */
    public C35033b mo105536H() {
        return this.f86580b;
    }

    /* renamed from: I */
    public JSONArray mo105537I() {
        return this.f86592n;
    }

    /* renamed from: J */
    public String mo105538J() {
        return this.f86593o;
    }

    /* renamed from: K */
    public C35033b mo105539K() {
        return this.f86586h;
    }

    /* renamed from: L */
    public C35033b mo105540L() {
        return this.f86583e;
    }

    @C0359n0
    /* renamed from: M */
    public C35033b mo105541M() {
        return this.f86579a;
    }

    /* renamed from: N */
    public C35033b mo105542N() {
        return this.f86584f;
    }

    /* renamed from: O */
    public C35033b mo105543O() {
        return this.f86588j;
    }

    /* renamed from: P */
    public String mo105544P() {
        return this.f86595q;
    }

    @C0363p0
    /* renamed from: Q */
    public String mo105545Q() {
        return this.f86577E;
    }

    /* renamed from: a */
    public C35102b0 mo105546a() {
        return this.f86574B;
    }

    /* renamed from: b */
    public String mo105547b() {
        return this.f86576D;
    }

    /* renamed from: c */
    public C35102b0 mo105548c() {
        return this.f86575C;
    }

    /* renamed from: d */
    public boolean mo105549d() {
        return this.f86591m;
    }

    /* renamed from: e */
    public C35033b mo105550e() {
        return this.f86587i;
    }

    @C0376v0(api = 17)
    /* renamed from: g */
    public void mo105551g(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var, @C0363p0 OTConfiguration oTConfiguration) {
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            textView.setTextAlignment(Integer.parseInt(b0Var.mo104665i()));
        }
        if (!C35020d.m143605J(b0Var.mo104657a().mo104757f())) {
            textView.setTextSize(Float.parseFloat(b0Var.mo104657a().mo104757f()));
        }
        new UIUtils().mo104264A(textView, b0Var.mo104657a(), oTConfiguration);
    }

    /* renamed from: h */
    public void mo105552h(@C0359n0 TextView textView, @C0359n0 String str, String str2) {
        textView.setVisibility((C13758b.f33436b.equals(str) || !C35020d.m143605J(str2)) ? 0 : 8);
    }

    @C0376v0(api = 17)
    /* renamed from: i */
    public void mo105553i(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 Context context, int i) {
        try {
            this.f86581c = new C35256b(i);
            JSONObject preferenceCenterData = oTPublishersHeadlessSDK.getPreferenceCenterData();
            this.f86582d = preferenceCenterData;
            UIUtils.m143744I(preferenceCenterData, false);
            C35124x xVar = new C35124x(context);
            C35120t c = xVar.mo105012c(i);
            this.f86597s = c;
            this.f86597s = m145356f(this.f86582d, c);
            this.f86598t = xVar.mo105014e();
            this.f86579a = new C35033b();
            this.f86580b = new C35033b();
            this.f86583e = new C35033b();
            this.f86584f = new C35033b();
            this.f86585g = new C35033b();
            this.f86586h = new C35033b();
            this.f86587i = new C35033b();
            this.f86588j = new C35033b();
            this.f86589k = new C35033b();
            this.f86590l = new C35033b();
            this.f86599u = new C35033b();
            this.f86600v = new C35033b();
            this.f86578F = this.f86582d.optString("BConsentText");
            mo105562s(this.f86597s.mo104939d0(), this.f86579a, "PcTextColor");
            mo105562s(this.f86597s.mo104937c0(), this.f86580b, "PcTextColor");
            mo105556l(this.f86597s.mo104927V(), this.f86598t, this.f86582d.getString("PcLinksTextColor"), this.f86583e);
            mo105562s(this.f86597s.mo104936c().mo104763a(), this.f86584f, "PcTextColor");
            m145357m(this.f86597s.mo104924S(), this.f86585g);
            mo105562s(this.f86597s.mo104929X(), this.f86586h, "PcTextColor");
            mo105554j(this.f86597s.mo104938d(), this.f86587i);
            mo105554j(this.f86597s.mo104930Y(), this.f86588j);
            mo105554j(this.f86597s.mo104963x(), this.f86589k);
            if (this.f86582d.has("LegIntSettings") && !this.f86582d.isNull("LegIntSettings")) {
                this.f86591m = this.f86582d.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
            }
            this.f86592n = this.f86582d.getJSONArray("Groups");
            this.f86593o = this.f86597s.mo104927V().mo104769g();
            this.f86594p = this.f86581c.mo105526b(this.f86597s.mo104955q(), this.f86582d.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F");
            this.f86595q = this.f86581c.mo105527c(this.f86597s.mo104931Z(), "PcTextColor", this.f86582d);
            this.f86581c.mo105527c("", "PcTextColor", this.f86582d);
            this.f86596r = this.f86581c.mo105526b(this.f86597s.mo104921P(), "", "#E8E8E8", "#555555");
            this.f86577E = this.f86597s.mo104933a0();
            mo105555k(this.f86597s.mo104960u(), this.f86590l, this.f86598t);
            mo105558o(this.f86597s.mo104950l(), this.f86599u, "PcLinksTextColor");
            mo105558o(this.f86597s.mo104928W(), this.f86600v, "PcTextColor");
            if (!C35020d.m143605J(this.f86597s.mo104912G())) {
                if (C13758b.f33436b.equals(this.f86597s.mo104912G())) {
                    this.f86601w = this.f86597s.mo104912G();
                    if (!C35020d.m143605J(this.f86597s.mo104906A()) && C13758b.f33436b.equals(this.f86597s.mo104906A())) {
                        this.f86602x = this.f86597s.mo104906A();
                        this.f86604z = new C35263h().mo105611d(this.f86582d, this.f86597s.mo104909D(), "", false);
                    }
                    this.f86573A = new C35263h().mo105611d(this.f86582d, this.f86597s.mo104915J(), "", false);
                    this.f86603y = new C35263h().mo105611d(this.f86582d, this.f86597s.mo104918M(), "", false);
                }
            }
            if (!C35020d.m143605J(this.f86597s.mo104935b0()) && C13758b.f33436b.equals(this.f86597s.mo104935b0())) {
                this.f86576D = this.f86597s.mo104935b0();
                mo105557n(new C35015e(context).mo103980O() != 0 ? this.f86597s.mo104941e0() : this.f86597s.mo104926U());
            }
        } catch (JSONException e) {
            OTLogger.m143457l("PC Config", "Error in ui property object, error message = " + e.getMessage());
        }
    }

    /* renamed from: j */
    public final void mo105554j(@C0359n0 C35105e eVar, @C0359n0 C35033b bVar) {
        C35110j o = eVar.mo104712o();
        if (!C35020d.m143605J(o.mo104757f())) {
            bVar.mo104288C(o.mo104757f());
        }
        bVar.mo104700c(o);
        String b = this.f86581c.mo105526b(eVar.mo104296u(), this.f86582d.optString("PcButtonTextColor"), "#FFFFFF", "#FFFFFF");
        String b2 = this.f86581c.mo105526b(eVar.mo104699a(), this.f86582d.optString("PcButtonColor"), "#6CC04A", "#80BE5A");
        if (bVar == this.f86589k) {
            b = this.f86581c.mo105526b(eVar.mo104296u(), this.f86582d.optString("PcButtonTextColor"), "#FFFFFF", "#80BE5A");
            b2 = this.f86581c.mo105526b(eVar.mo104699a(), this.f86582d.optString("PcButtonColor"), "#6CC04A", "#FFFFFF");
        }
        bVar.mo104718v(b);
        bVar.mo104701d(b2);
        bVar.mo104298y(eVar);
        if (!C35020d.m143605J(eVar.mo104702e())) {
            bVar.mo104703f(eVar.mo104702e());
        }
        bVar.mo104716t(eVar.mo104295s());
        int i = 0;
        if (bVar != this.f86589k && !eVar.mo104719x().equals(String.valueOf(true))) {
            i = 8;
        }
        bVar.mo104294b(i);
    }

    /* renamed from: k */
    public final void mo105555k(@C0359n0 C35106f fVar, @C0359n0 C35033b bVar, @C0363p0 C35118r rVar) {
        if (!C35019c.m143598c(fVar.mo104725f(), false)) {
            bVar.mo104294b(8);
            bVar.mo104286A(8);
            bVar.mo104299z(8);
        } else if (!C35019c.m143598c(fVar.mo104727h(), false) || C35020d.m143605J(fVar.mo104729j())) {
            String b = this.f86581c.mo105526b(fVar.mo104723d(), this.f86582d.optString("PcTextColor"), "#FFFFFF", "#696969");
            bVar.mo104294b(0);
            bVar.mo104286A(8);
            bVar.mo104299z(8);
            bVar.mo104718v(b);
        } else {
            if (C35019c.m143598c(fVar.mo104720a().mo104719x(), false)) {
                bVar.mo104299z(0);
                bVar.mo104286A(8);
                bVar.mo104294b(8);
                mo105559p(fVar.mo104731l(), fVar.mo104720a(), bVar);
            } else {
                mo105561r(fVar, bVar, rVar);
                bVar.mo104286A(0);
                bVar.mo104299z(8);
                bVar.mo104294b(8);
            }
            bVar.mo104716t(fVar.mo104729j());
        }
    }

    @C0376v0(api = 17)
    /* renamed from: l */
    public final void mo105556l(@C0359n0 C35111k kVar, @C0363p0 C35118r rVar, @C0359n0 String str, @C0359n0 C35033b bVar) {
        C35102b0 a = kVar.mo104763a();
        mo105562s(a, bVar, "PcLinksTextColor");
        bVar.mo104718v(new UIUtils().mo104273h(rVar, a, str));
    }

    /* renamed from: n */
    public final void mo105557n(@C0359n0 C35102b0 b0Var) {
        this.f86574B = new C35263h().mo105611d(this.f86582d, b0Var, "", false);
        this.f86575C = new C35263h().mo105611d(this.f86582d, this.f86597s.mo104943f0(), "", false);
    }

    @C0376v0(api = 17)
    /* renamed from: o */
    public final void mo105558o(@C0359n0 C35102b0 b0Var, @C0359n0 C35033b bVar, @C0359n0 String str) {
        if (bVar == this.f86599u) {
            String optString = C35020d.m143605J(b0Var.mo104663g()) ? this.f86582d.optString("AlwaysActiveText", "") : b0Var.mo104663g();
            bVar.mo104718v(this.f86581c.mo105526b(b0Var.mo104667k(), this.f86582d.optString(str), "#3860BE", "#3860BE"));
            bVar.mo104716t(optString);
        } else {
            bVar.mo104718v(this.f86581c.mo105526b(b0Var.mo104667k(), this.f86582d.optString(str), "#696969", "#FFFFFF"));
            bVar.mo104294b(0);
        }
        bVar.mo104287B(this.f86581c.mo105525a(b0Var.mo104665i()));
        C35110j a = b0Var.mo104657a();
        if (!C35020d.m143605J(a.mo104757f())) {
            bVar.mo104288C(a.mo104757f());
        }
        bVar.mo104700c(a);
    }

    /* renamed from: p */
    public final void mo105559p(@C0359n0 String str, @C0359n0 C35105e eVar, @C0359n0 C35033b bVar) {
        C35110j o = eVar.mo104712o();
        if (!C35020d.m143605J(o.mo104757f())) {
            bVar.mo104288C(o.mo104757f());
        }
        bVar.mo104700c(o);
        String u = eVar.mo104296u();
        if (!C35020d.m143605J(u)) {
            str = u;
        }
        bVar.mo104718v(this.f86581c.mo105526b(str, this.f86582d.optString("PcTextColor"), "#696969", "#FFFFFF"));
        bVar.mo104701d(eVar.mo104699a());
        bVar.mo104298y(eVar);
        if (!C35020d.m143605J(eVar.mo104702e())) {
            bVar.mo104703f(eVar.mo104702e());
        }
    }

    /* renamed from: q */
    public C35033b mo105560q() {
        return this.f86599u;
    }

    /* renamed from: r */
    public final void mo105561r(@C0359n0 C35106f fVar, @C0359n0 C35033b bVar, @C0363p0 C35118r rVar) {
        String a = C35018b.m143595a(rVar, this.f86581c.mo105527c(fVar.mo104731l(), "PcTextColor", this.f86582d));
        if (!C35020d.m143605J(a)) {
            bVar.mo104718v(a);
        }
    }

    @C0376v0(api = 17)
    /* renamed from: s */
    public final void mo105562s(@C0359n0 C35102b0 b0Var, @C0359n0 C35033b bVar, @C0359n0 String str) {
        if (!b0Var.mo104669m() || C35020d.m143605J(b0Var.mo104663g())) {
            bVar.mo104294b(8);
            return;
        }
        bVar.mo104716t(b0Var.mo104663g());
        bVar.mo104294b(0);
        if (bVar == this.f86584f && !this.f86582d.optBoolean("IsIabEnabled") && "".equals(this.f86582d.optString("IabType"))) {
            bVar.mo104294b(8);
        }
        String b = this.f86581c.mo105526b(b0Var.mo104667k(), this.f86582d.optString(str), "#696969", "#FFFFFF");
        if (bVar == this.f86583e) {
            b = this.f86581c.mo105526b(b0Var.mo104667k(), this.f86582d.optString(str), "#3860BE", "#3860BE");
        }
        bVar.mo104718v(b);
        bVar.mo104287B(this.f86581c.mo105525a(b0Var.mo104665i()));
        C35110j a = b0Var.mo104657a();
        if (!C35020d.m143605J(a.mo104757f())) {
            bVar.mo104288C(a.mo104757f());
        }
        bVar.mo104700c(a);
    }

    /* renamed from: t */
    public C35033b mo105563t() {
        return this.f86590l;
    }

    /* renamed from: u */
    public C35033b mo105564u() {
        return this.f86589k;
    }

    @C0359n0
    /* renamed from: v */
    public String mo105565v() {
        return this.f86578F;
    }

    /* renamed from: w */
    public String mo105566w() {
        return this.f86596r;
    }

    /* renamed from: x */
    public C35102b0 mo105567x() {
        return this.f86573A;
    }

    /* renamed from: y */
    public String mo105568y() {
        return this.f86602x;
    }

    /* renamed from: z */
    public C35102b0 mo105569z() {
        return this.f86604z;
    }
}
