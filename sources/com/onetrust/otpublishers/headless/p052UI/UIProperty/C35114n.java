package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34981m;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.n */
public class C35114n {

    /* renamed from: a */
    public final int f85683a;

    /* renamed from: b */
    public JSONObject f85684b;

    /* renamed from: c */
    public Context f85685c;

    public C35114n(@C0359n0 Context context) {
        this.f85685c = context;
        this.f85684b = new C35015e(context).mo103982Q();
        this.f85683a = 22;
    }

    /* renamed from: A */
    public static void m144392A(@C0359n0 C35126z zVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject2.has("pageHeaderTitle")) {
                zVar.mo105077x(jSONObject2.getString("pageHeaderTitle"));
            }
            if (jSONObject2.has("allowAllConsentText")) {
                zVar.mo105058f(jSONObject2.getString("allowAllConsentText"));
            }
            if (jSONObject2.has("filter")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("filter");
                if (jSONObject3.has("onColor")) {
                    zVar.mo105070r(new C35109i().mo104752a(i, jSONObject3.optString("onColor"), jSONObject2.optString("onColorDark")));
                }
                if (jSONObject3.has("color")) {
                    zVar.mo105068p(new C35109i().mo104752a(i, jSONObject3.optString("color"), jSONObject2.optString("colorDark")));
                }
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_SEARCH_BAR)) {
                zVar.mo105056d(m144399S(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_SEARCH_BAR), i));
            }
        }
    }

    @C0359n0
    /* renamed from: B */
    public static C35102b0 m144393B(@C0359n0 JSONObject jSONObject, int i) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("titleTextAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("titleTextAlign")));
        }
        if (jSONObject.has("titleText")) {
            b0Var.mo104662f(jSONObject.getString("titleText"));
        }
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString("titleTextColor"), jSONObject.optString("titleTextColorDark")));
        b0Var.mo104659c(m144400a(jSONObject, "titleFontSize"));
        return b0Var;
    }

    /* renamed from: D */
    public static void m144394D(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("logo")) {
            qVar.mo104847e(m144410p(jSONObject.getJSONObject("logo")));
        }
    }

    /* renamed from: J */
    public static void m144395J(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has("summary")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("summary");
            if (jSONObject2.has("title")) {
                tVar.mo104916K(new C35107g().mo104735c(jSONObject2.getJSONObject("title"), i, true));
            }
            if (jSONObject2.has("description")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("description");
                tVar.mo104913H(new C35107g().mo104735c(jSONObject3, i, true));
                C35111k kVar = new C35111k();
                kVar.mo104765c(new C35107g().mo104735c(jSONObject3, i, false));
                tVar.mo104952n(kVar);
            }
        }
    }

    @C0359n0
    /* renamed from: L */
    public static C35102b0 m144396L(@C0359n0 JSONObject jSONObject, int i) {
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString("titleTextColor"), jSONObject.optString("titleTextColorDark")));
        return b0Var;
    }

    /* renamed from: N */
    public static void m144397N(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_REJECT_ALL)) {
            tVar.mo104956r(new C35107g().mo104734b(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_REJECT_ALL), i));
        }
    }

    @C0359n0
    /* renamed from: P */
    public static C35102b0 m144398P(@C0359n0 JSONObject jSONObject, int i) {
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString("titleTextColor"), jSONObject.optString("titleTextColorDark")));
        if (jSONObject.has("titleShow")) {
            b0Var.mo104660d(jSONObject.getString("titleShow"));
        }
        b0Var.mo104659c(m144400a(jSONObject, "titleFontSize"));
        return b0Var;
    }

    @C0359n0
    /* renamed from: S */
    public static C35100a0 m144399S(@C0359n0 JSONObject jSONObject, int i) {
        C35100a0 a0Var = new C35100a0();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            String a = new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark"));
            a0Var.mo104653p(a);
            a0Var.mo104651n(a);
            a0Var.mo104649l(a);
            a0Var.mo104647j(a);
        }
        if (jSONObject.has("backgroundColorDark")) {
            a0Var.mo104639b(new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject.optString("backgroundColorDark")));
        }
        return a0Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C35110j m144400a(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        C35110j jVar = new C35110j();
        if (jSONObject.has(str)) {
            jVar.mo104758g(jSONObject.getString(str));
        }
        return jVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C35102b0 m144401c(@C0359n0 JSONObject jSONObject, int i) {
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString("alwaysActiveLabelColor"), jSONObject.optString("alwaysActiveLabelColorDark")));
        if (jSONObject.has("alwaysActiveLabelText")) {
            b0Var.mo104662f(jSONObject.getString("alwaysActiveLabelText"));
        }
        b0Var.mo104659c(m144400a(jSONObject, "alwaysActiveLabelFontSize"));
        return b0Var;
    }

    @C0359n0
    /* renamed from: d */
    public static C35102b0 m144402d(@C0359n0 JSONObject jSONObject, int i, @C0359n0 String str) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("titleTextAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("titleTextAlign")));
        }
        b0Var.mo104662f(str);
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark")));
        b0Var.mo104659c(m144400a(jSONObject, "titleFontSize"));
        return b0Var;
    }

    @C0359n0
    /* renamed from: e */
    public static C35102b0 m144403e(@C0359n0 JSONObject jSONObject, int i, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        C35109i iVar = new C35109i();
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104666j(iVar.mo104752a(i, jSONObject.optString(str), jSONObject.optString(str2)));
        b0Var.mo104659c(m144400a(jSONObject, str3));
        return b0Var;
    }

    @C0359n0
    /* renamed from: f */
    public static C35102b0 m144404f(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, int i, @C0359n0 String str) {
        C35102b0 b0Var = new C35102b0();
        if (jSONObject.has("titleTextAlign")) {
            b0Var.mo104664h(UIUtils.m143752i(jSONObject.getString("titleTextAlign")));
        }
        if (jSONObject2.has(str)) {
            b0Var.mo104662f(jSONObject2.getString(str));
        }
        b0Var.mo104666j(new C35109i().mo104752a(i, jSONObject.optString("titleTextColor"), jSONObject.optString("titleTextColorDark")));
        b0Var.mo104659c(m144400a(jSONObject, "titleFontSize"));
        return b0Var;
    }

    /* renamed from: k */
    public static void m144405k(@C0359n0 C35119s sVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            C35109i iVar = new C35109i();
            sVar.mo104886h(iVar.mo104752a(i, jSONObject2.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject2.optString("backgroundColorDark")));
            sVar.mo104896r(iVar.mo104752a(i, jSONObject2.optString("toggleActiveColor"), jSONObject2.optString("toggleActiveColorDark")));
            sVar.mo104893o(iVar.mo104752a(i, jSONObject2.optString("toggleInactiveColor"), jSONObject2.optString("toggleInactiveColorDark")));
        }
    }

    /* renamed from: l */
    public static void m144406l(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_ACCEPT_ALL)) {
            tVar.mo104940e(new C35107g().mo104734b(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_ACCEPT_ALL), i));
        }
    }

    /* renamed from: m */
    public static void m144407m(@C0359n0 C35126z zVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has("savePreferencesButton")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("savePreferencesButton");
            zVar.mo105060h(new C35107g().mo104734b(jSONObject2, i));
            zVar.mo105054b(new C35107g().mo104734b(jSONObject2, i));
            zVar.mo105072t(new C35109i().mo104752a(i, jSONObject2.optString("color"), jSONObject2.optString("colorDark")));
        }
    }

    /* renamed from: n */
    public static void m144408n(@C0359n0 C35102b0 b0Var, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("title")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("title");
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_FONT_SIZE)) {
                String string = jSONObject2.getString(OTUXParamsKeys.OT_UX_FONT_SIZE);
                if (!C35020d.m143605J(string)) {
                    C35110j a = b0Var.mo104657a();
                    a.mo104758g(string);
                    b0Var.mo104659c(a);
                }
            }
        }
    }

    /* renamed from: o */
    public static C35106f m144409o(@C0359n0 JSONObject jSONObject, int i) {
        C35106f fVar = new C35106f();
        if (jSONObject.has("text")) {
            fVar.mo104728i(jSONObject.getString("text"));
        }
        if (jSONObject.has(C9874a.f27048E)) {
            fVar.mo104724e(jSONObject.getString(C9874a.f27048E));
        }
        if (jSONObject.has("showText")) {
            fVar.mo104726g(jSONObject.getString("showText"));
        }
        String a = new C35109i().mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject.optString("textColorDark"));
        fVar.mo104730k(a);
        fVar.mo104722c(a);
        C35105e eVar = new C35105e();
        eVar.mo104701d(new C35109i().mo104752a(i, jSONObject.optString("color"), jSONObject.optString("colorDark")));
        eVar.mo104700c(m144400a(jSONObject, OTUXParamsKeys.OT_UX_FONT_SIZE));
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_RADIUS)) {
            eVar.mo104705h(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_RADIUS));
        }
        if (jSONObject.has("showAsLink")) {
            eVar.mo104713p(String.valueOf(!jSONObject.getBoolean("showAsLink")));
        }
        fVar.mo104721b(eVar);
        return fVar;
    }

    @C0359n0
    /* renamed from: p */
    public static C35112l m144410p(@C0359n0 JSONObject jSONObject) {
        C35112l lVar = new C35112l();
        if (jSONObject.has(C9874a.f27048E)) {
            lVar.mo104773b(jSONObject.getString(C9874a.f27048E));
        }
        if (jSONObject.has("url")) {
            lVar.mo104775d(jSONObject.getString("url"));
        }
        return lVar;
    }

    /* renamed from: t */
    public static void m144411t(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has("savePreferencesButton")) {
            tVar.mo104951m(new C35107g().mo104734b(jSONObject.getJSONObject("savePreferencesButton"), i));
        }
    }

    @C0359n0
    /* renamed from: v */
    public static C35111k m144412v(JSONObject jSONObject, int i) {
        C35111k kVar = new C35111k();
        if (jSONObject.has("url")) {
            kVar.mo104768f(jSONObject.getString("url"));
        }
        if (jSONObject.has(C9874a.f27048E)) {
            kVar.mo104766d(String.valueOf(jSONObject.getBoolean(C9874a.f27048E)));
        }
        kVar.mo104765c(new C35107g().mo104735c(jSONObject, i, false));
        return kVar;
    }

    /* renamed from: z */
    public static void m144413z(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            C35109i iVar = new C35109i();
            tVar.mo104954p(iVar.mo104752a(i, jSONObject2.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject2.optString("backgroundColorDark")));
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_SHOW_LOGO_ON_PC)) {
                tVar.mo104949k(jSONObject2.getBoolean(OTUXParamsKeys.OT_UX_SHOW_LOGO_ON_PC));
            }
            if (jSONObject2.has("sdkLevelOptOutShow")) {
                tVar.mo104911F(jSONObject2.getBoolean("sdkLevelOptOutShow") ? C13758b.f33436b : C13758b.f33438c);
            }
            tVar.mo104920O(iVar.mo104752a(i, jSONObject2.optString("toggleActiveColor"), jSONObject2.optString("toggleActiveColorDark")));
            tVar.mo104917L(iVar.mo104752a(i, jSONObject2.optString("toggleInactiveColor"), jSONObject2.optString("toggleInactiveColorDark")));
        }
    }

    @C0359n0
    /* renamed from: C */
    public JSONObject mo104791C() {
        return this.f85684b.has("preferenceCenterData") ? this.f85684b.getJSONObject("preferenceCenterData") : new JSONObject();
    }

    /* renamed from: E */
    public final void mo104792E(@C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON)) {
            tVar.mo104942f(m144409o(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_CLOSE_BUTTON), i));
        }
    }

    /* renamed from: F */
    public final void mo104793F(@C0363p0 C35126z zVar, JSONObject jSONObject, int i) {
        C35121u G = mo104794G(jSONObject, i);
        if (G != null) {
            if (zVar == null) {
                zVar = new C35126z();
            }
            zVar.mo105055c(G);
        }
    }

    @C0363p0
    /* renamed from: G */
    public C35121u mo104794G(JSONObject jSONObject, int i) {
        C35121u uVar = new C35121u();
        uVar.mo104967b(m144396L(jSONObject.getJSONObject("purposeListItem"), i));
        return uVar;
    }

    @C0359n0
    /* renamed from: H */
    public final String mo104795H() {
        return new C35015e(this.f85685c).mo103980O() != 0 ? new C35020d().mo104027e(new C35015e(this.f85685c).mo103980O(), true, TimeZone.getDefault()) : "";
    }

    /* renamed from: I */
    public final void mo104796I(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("title")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("title");
            qVar.mo104862t(new C35107g().mo104735c(jSONObject2, this.f85683a, true));
            qVar.mo104854l(new C35107g().mo104736e(jSONObject2, this.f85683a));
        }
        if (jSONObject.has("description")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("description");
            qVar.mo104860r(new C35107g().mo104735c(jSONObject3, this.f85683a, true));
            qVar.mo104848f(new C35107g().mo104736e(jSONObject3, this.f85683a));
        }
        if (jSONObject.has("additionalDescription")) {
            qVar.mo104858p(new C35107g().mo104735c(jSONObject.getJSONObject("additionalDescription"), this.f85683a, true));
        }
        if (jSONObject.has("dpdTitle")) {
            qVar.mo104854l(new C35107g().mo104735c(jSONObject.getJSONObject("dpdTitle"), this.f85683a, true));
        }
        if (jSONObject.has("dpdDescription")) {
            qVar.mo104848f(new C35107g().mo104735c(jSONObject.getJSONObject("dpdDescription"), this.f85683a, true));
        }
    }

    @C0363p0
    /* renamed from: K */
    public C35117q mo104797K() {
        JSONObject r = mo104808r();
        if (r == null) {
            return null;
        }
        C35117q qVar = new C35117q();
        mo104809s(qVar, r);
        m144394D(qVar, r);
        if (r.has("summary")) {
            mo104796I(qVar, r.getJSONObject("summary"));
        }
        if (r.has("buttons")) {
            JSONObject jSONObject = r.getJSONObject("buttons");
            mo104806j(qVar, jSONObject);
            mo104798M(qVar, jSONObject);
            mo104800Q(qVar, jSONObject);
        }
        mo104813y(qVar, r);
        return qVar;
    }

    /* renamed from: M */
    public final void mo104798M(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON)) {
            qVar.mo104845c(m144409o(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_CLOSE_BUTTON), this.f85683a));
        }
    }

    @C0359n0
    /* renamed from: O */
    public C35119s mo104799O() {
        C35119s sVar = new C35119s();
        JSONObject C = mo104791C();
        m144405k(sVar, C, this.f85683a);
        if (C.has("purposeListItem")) {
            C35102b0 e = m144403e(C.getJSONObject("purposeListItem"), this.f85683a, "titleTextColor", "titleTextColorDark", "titleFontSize");
            if (C.has("summary")) {
                m144408n(e, C.getJSONObject("summary"));
            }
            sVar.mo104898t(e);
        }
        if (C.has("purposeListItem")) {
            JSONObject jSONObject = C.getJSONObject("purposeListItem");
            sVar.mo104892n(m144403e(jSONObject, this.f85683a, "titleTextColor", "titleTextColorDark", "titleFontSize"));
            sVar.mo104881c(m144401c(jSONObject, this.f85683a));
        }
        if (C.has("summary")) {
            JSONObject jSONObject2 = C.getJSONObject("summary");
            if (jSONObject2.has("description")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("description");
                C35102b0 e2 = m144403e(jSONObject3, this.f85683a, OTUXParamsKeys.OT_UX_TEXT_COLOR, "textColorDark", OTUXParamsKeys.OT_UX_FONT_SIZE);
                C35102b0 e3 = m144403e(jSONObject3, this.f85683a, OTUXParamsKeys.OT_UX_TEXT_COLOR, "textColorDark", OTUXParamsKeys.OT_UX_FONT_SIZE);
                C35102b0 e4 = m144403e(jSONObject3, this.f85683a, OTUXParamsKeys.OT_UX_TEXT_COLOR, "textColorDark", OTUXParamsKeys.OT_UX_FONT_SIZE);
                sVar.mo104895q(e2);
                sVar.mo104885g(e3);
                sVar.mo104889k(e4);
                sVar.mo104882d(e2.mo104667k());
            }
        }
        if (C.has(OTUXParamsKeys.OT_UX_LINKS)) {
            JSONObject jSONObject4 = C.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)) {
                JSONObject jSONObject5 = jSONObject4.getJSONObject(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK);
                C35111k v = m144412v(jSONObject5, this.f85683a);
                C35111k v2 = m144412v(jSONObject5, this.f85683a);
                C35111k v3 = m144412v(jSONObject5, this.f85683a);
                sVar.mo104884f(v);
                sVar.mo104888j(v2);
                sVar.mo104880b(v3);
            }
        }
        return sVar;
    }

    /* renamed from: Q */
    public final void mo104800Q(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST);
            C35111k v = m144412v(jSONObject2, this.f85683a);
            String optString = jSONObject2.optString("textNonIAB", "");
            String optString2 = jSONObject2.optString("text", "");
            if (C35020d.m143605J(optString)) {
                optString = optString2;
            }
            v.mo104763a().mo104662f(optString);
            qVar.mo104853k(v);
        }
    }

    @C0359n0
    /* renamed from: R */
    public C35125y mo104801R() {
        C35109i iVar = new C35109i();
        C35125y yVar = new C35125y();
        JSONObject C = mo104791C();
        if (C.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject = C.getJSONObject(OTVendorListMode.GENERAL);
            yVar.mo105025g(iVar.mo104752a(this.f85683a, jSONObject.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject.optString("backgroundColorDark")));
            String a = iVar.mo104752a(this.f85683a, jSONObject.optString("toggleActiveColor"), jSONObject.optString("toggleActiveColorDark"));
            String a2 = iVar.mo104752a(this.f85683a, jSONObject.optString("toggleInactiveColor"), jSONObject.optString("toggleInactiveColorDark"));
            yVar.mo105031m(a);
            yVar.mo105028j(a2);
        }
        if (C.has("summary")) {
            JSONObject jSONObject2 = C.getJSONObject("summary");
            if (jSONObject2.has("description")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("description");
                C35102b0 e = m144403e(jSONObject3, this.f85683a, OTUXParamsKeys.OT_UX_TEXT_COLOR, "textColorDark", OTUXParamsKeys.OT_UX_FONT_SIZE);
                yVar.mo105024f(e);
                yVar.mo105027i(e);
                yVar.mo105021c(e);
                yVar.mo105030l(e);
                yVar.mo105022d(iVar.mo104752a(this.f85683a, jSONObject3.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject3.optString("textColorDark")));
            }
        }
        JSONObject b = iVar.mo104753b(C, OTUXParamsKeys.OT_UX_LINKS, OTUXParamsKeys.OT_UX_LINK_POLICY_LINK);
        if (b != null) {
            yVar.mo105020b(m144412v(b, this.f85683a));
        }
        JSONObject b2 = iVar.mo104753b(C, "summary", "title");
        C35102b0 b0Var = new C35102b0();
        if (b2 != null) {
            b0Var.mo104659c(m144400a(b2, OTUXParamsKeys.OT_UX_FONT_SIZE));
        }
        if (C.has("purposeListItem")) {
            JSONObject jSONObject4 = C.getJSONObject("purposeListItem");
            b0Var.mo104666j(iVar.mo104752a(this.f85683a, jSONObject4.optString("titleTextColor"), jSONObject4.optString("titleTextColorDark")));
        }
        yVar.mo105033o(b0Var);
        return yVar;
    }

    @C0363p0
    /* renamed from: b */
    public C35120t mo104802b(int i) {
        JSONObject C = mo104791C();
        if (C == null) {
            return null;
        }
        C35120t tVar = new C35120t();
        m144413z(tVar, C, i);
        if (C.has("logo")) {
            tVar.mo104946h(m144410p(C.getJSONObject("logo")));
        }
        m144395J(tVar, C, i);
        if (C.has("buttons")) {
            JSONObject jSONObject = C.getJSONObject("buttons");
            m144406l(tVar, jSONObject, i);
            m144397N(tVar, jSONObject, i);
            m144411t(tVar, jSONObject, i);
            mo104792E(tVar, jSONObject, i);
        }
        if (C.has(OTUXParamsKeys.OT_UX_LINKS)) {
            JSONObject jSONObject2 = C.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)) {
                tVar.mo104944g(m144412v(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK), i));
            }
        }
        if (C.has("purposeListItem")) {
            JSONObject jSONObject3 = C.getJSONObject("purposeListItem");
            tVar.mo104947i(m144401c(jSONObject3, i));
            tVar.mo104907B(m144398P(jSONObject3, i));
        }
        if (C.has("purposeList")) {
            tVar.mo104910E(m144393B(C.getJSONObject("purposeList"), i));
        }
        if (!C.has("dsIdDetails")) {
            return tVar;
        }
        mo104805i(i, tVar, C, C.optJSONObject("dsIdDetails"));
        return tVar;
    }

    @C0363p0
    /* renamed from: g */
    public JSONObject mo104803g() {
        if (!this.f85684b.has("prompts")) {
            return null;
        }
        JSONObject jSONObject = this.f85684b.getJSONObject("prompts");
        if (jSONObject.has("ageGate")) {
            return jSONObject.optJSONObject("ageGate");
        }
        return null;
    }

    @C0363p0
    /* renamed from: h */
    public JSONObject mo104804h(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)) {
            return jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST);
        }
        return null;
    }

    /* renamed from: i */
    public final void mo104805i(int i, @C0359n0 C35120t tVar, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        if (jSONObject2.has(C9874a.f27048E) && jSONObject2.optBoolean(C9874a.f27048E)) {
            tVar.mo104962w(C35019c.m143596a(jSONObject2.optBoolean(C9874a.f27048E)));
            tVar.mo104961v(m144404f(jSONObject.getJSONObject("purposeList"), jSONObject2, i, "titleText"));
            if (jSONObject2.has("showDescription") && jSONObject2.optBoolean("showDescription")) {
                tVar.mo104958t(C35019c.m143596a(jSONObject2.optBoolean("showDescription")));
                tVar.mo104953o(m144404f(jSONObject.getJSONObject("purposeListItem"), jSONObject2, i, "descriptionText"));
            }
            if (jSONObject2.has("showTimestamp") && jSONObject2.optBoolean("showTimestamp")) {
                tVar.mo104914I(C35019c.m143596a(jSONObject2.optBoolean("showTimestamp")));
                tVar.mo104914I(jSONObject2.optString("showTimestamp"));
                if (jSONObject2.has("notYetConsentedText")) {
                    tVar.mo104964y(m144404f(jSONObject.getJSONObject("purposeList"), jSONObject2, i, "notYetConsentedText"));
                }
                if (jSONObject2.has("timestampTitleText")) {
                    tVar.mo104922Q(m144404f(jSONObject.getJSONObject("purposeList"), jSONObject2, i, "timestampTitleText"));
                }
                tVar.mo104919N(m144402d(jSONObject.getJSONObject("summary").getJSONObject("description"), i, mo104795H()));
            }
            tVar.mo104957s(m144402d(jSONObject.getJSONObject("summary").getJSONObject("description"), i, mo104812x()));
        }
    }

    /* renamed from: j */
    public final void mo104806j(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_ACCEPT_ALL)) {
            qVar.mo104844b(new C35107g().mo104734b(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_ACCEPT_ALL), this.f85683a));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_REJECT_ALL)) {
            qVar.mo104852j(new C35107g().mo104734b(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_REJECT_ALL), this.f85683a));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_SHOW_PREFERENCES)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_SHOW_PREFERENCES);
            C35105e b = new C35107g().mo104734b(jSONObject2, this.f85683a);
            if (jSONObject2.has("showAsLink")) {
                b.mo104715r(String.valueOf(jSONObject2.getBoolean("showAsLink")));
            }
            b.mo104703f(new C35109i().mo104752a(this.f85683a, jSONObject2.optString(OTUXParamsKeys.OT_UX_TEXT_COLOR), jSONObject2.optString("textColorDark")));
            qVar.mo104857o(b);
        }
    }

    @C0359n0
    /* renamed from: q */
    public C35122v mo104807q(int i) {
        C35109i iVar = new C35109i();
        C35122v vVar = new C35122v();
        JSONObject C = mo104791C();
        JSONObject h = mo104804h(C);
        if (C.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject = C.getJSONObject(OTVendorListMode.GENERAL);
            vVar.mo104975h(iVar.mo104752a(i, jSONObject.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject.optString("backgroundColorDark")));
        }
        if (C.has("summary")) {
            JSONObject jSONObject2 = C.getJSONObject("summary");
            if (jSONObject2.has("description")) {
                vVar.mo104980m(m144403e(jSONObject2.getJSONObject("description"), i, OTUXParamsKeys.OT_UX_TEXT_COLOR, "textColorDark", OTUXParamsKeys.OT_UX_FONT_SIZE));
            }
        }
        if (C.has("purposeListItem")) {
            JSONObject jSONObject3 = C.getJSONObject("purposeListItem");
            C35102b0 e = m144403e(jSONObject3, i, "titleTextColor", "titleTextColorDark", "titleFontSize");
            vVar.mo104983p(e);
            String a = iVar.mo104752a(i, jSONObject3.optString("titleTextColor"), jSONObject3.optString("titleTextColorDark"));
            vVar.mo104972e(a);
            vVar.mo104974g(e);
            vVar.mo104978k(a);
            vVar.mo104977j(e);
        }
        if (C.has("buttons")) {
            JSONObject jSONObject4 = C.getJSONObject("buttons");
            if (jSONObject4.has("savePreferencesButton")) {
                vVar.mo104969b(new C35107g().mo104734b(jSONObject4.getJSONObject("savePreferencesButton"), i));
            }
        }
        if (h != null && h.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject5 = h.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject5 != null && jSONObject5.has("filter")) {
                JSONObject jSONObject6 = jSONObject5.getJSONObject("filter");
                vVar.mo104981n(iVar.mo104752a(i, jSONObject6.optString("color"), jSONObject6.optString("colorDark")));
                vVar.mo104984q(iVar.mo104752a(i, jSONObject6.optString("onColor"), jSONObject6.optString("onColorDark")));
            }
            if (jSONObject5 != null && jSONObject5.has(OTUXParamsKeys.OT_UX_SEARCH_BAR)) {
                vVar.mo104970c(m144399S(jSONObject5.getJSONObject(OTUXParamsKeys.OT_UX_SEARCH_BAR), i));
            }
            if (C.has("purposeListItem")) {
                vVar.mo104971d(m144398P(C.getJSONObject("purposeListItem"), i));
            }
        }
        return vVar;
    }

    @C0363p0
    /* renamed from: r */
    public JSONObject mo104808r() {
        if (this.f85684b.has("bannerData")) {
            return this.f85684b.getJSONObject("bannerData");
        }
        return null;
    }

    /* renamed from: s */
    public final void mo104809s(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject2.has("layoutHeight")) {
                qVar.mo104855m(jSONObject2.getString("layoutHeight"));
            }
            qVar.mo104849g(new C35109i().mo104752a(this.f85683a, jSONObject2.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject2.optString("backgroundColorDark")));
        }
    }

    /* renamed from: u */
    public final void mo104810u(@C0359n0 C35126z zVar, @C0359n0 JSONObject jSONObject, int i) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject2.has("toggleActiveColor")) {
                zVar.mo105044D(new C35109i().mo104752a(i, jSONObject2.optString("toggleActiveColor"), jSONObject2.optString("toggleActiveColorDark")));
            }
            if (jSONObject2.has("toggleInactiveColor")) {
                zVar.mo105042B(new C35109i().mo104752a(i, jSONObject2.optString("toggleInactiveColor"), jSONObject2.optString("toggleInactiveColorDark")));
            }
            zVar.mo105065m(new C35109i().mo104752a(i, jSONObject2.optString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR), jSONObject2.optString("backgroundColorDark")));
            if (jSONObject.has("purposeListItem")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("purposeListItem");
                zVar.mo105067o(m144398P(jSONObject3, i));
                zVar.mo105057e(m144398P(jSONObject3, i));
                mo104793F(zVar, jSONObject, i);
                zVar.mo105062j(new C35109i().mo104752a(i, jSONObject3.optString("titleTextColor"), jSONObject3.optString("titleTextColorDark")));
            }
        }
    }

    @C0363p0
    /* renamed from: w */
    public C35126z mo104811w(int i) {
        C35126z zVar = new C35126z();
        JSONObject C = mo104791C();
        JSONObject h = C != null ? mo104804h(C) : null;
        if (h == null) {
            return null;
        }
        m144392A(zVar, h, i);
        mo104810u(zVar, C, i);
        if (C.has("buttons")) {
            JSONObject jSONObject = C.getJSONObject("buttons");
            if (jSONObject.has("savePreferencesButton")) {
                m144407m(zVar, jSONObject, i);
            }
        }
        if (C.has("purposeListItem")) {
            JSONObject jSONObject2 = C.getJSONObject("purposeListItem");
            zVar.mo105072t(new C35109i().mo104752a(i, jSONObject2.optString("titleTextColor"), jSONObject2.optString("titleTextColorDark")));
            zVar.mo105067o(m144398P(jSONObject2, i));
            zVar.mo105061i(m144398P(jSONObject2, i));
            zVar.mo105064l(m144398P(jSONObject2, i));
        }
        C35109i iVar = new C35109i();
        if (h.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject3 = h.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject3.has("filter")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("filter");
                zVar.mo105068p(iVar.mo104752a(i, jSONObject4.optString("color"), jSONObject4.optString("colorDark")));
                zVar.mo105070r(iVar.mo104752a(i, jSONObject4.optString("onColor"), jSONObject4.optString("onColorDark")));
            }
        }
        return zVar;
    }

    @C0359n0
    /* renamed from: x */
    public final String mo104812x() {
        if (!C35020d.m143605J(new C35015e(this.f85685c).mo103967B())) {
            return new C35015e(this.f85685c).mo103967B();
        }
        String uuid = UUID.randomUUID().toString();
        C34981m mVar = new C34981m(this.f85685c);
        mVar.mo103788h(uuid);
        mVar.mo103782b(1);
        return uuid;
    }

    /* renamed from: y */
    public final void mo104813y(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINKS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)) {
                C35111k v = m144412v(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK), this.f85683a);
                qVar.mo104846d(v);
                qVar.mo104842C().mo104763a().mo104664h(v.mo104763a().mo104665i());
            }
        }
    }

    public C35114n(@C0359n0 Context context, int i) {
        this.f85685c = context;
        this.f85684b = new C35015e(context).mo103982Q();
        this.f85683a = i;
    }
}
