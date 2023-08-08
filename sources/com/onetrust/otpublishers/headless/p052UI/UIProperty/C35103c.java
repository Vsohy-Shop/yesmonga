package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35013c;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.c */
public class C35103c {

    /* renamed from: a */
    public JSONObject f85645a = new JSONObject();

    public C35103c(@C0359n0 Context context) {
        String string = new C35013c(context).mo103965b().getString("OTT_UX_PARAMS_JSON", "");
        if (!C35020d.m143605J(string)) {
            this.f85645a = new JSONObject(string);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C35106f m144258b(@C0359n0 String str) {
        C35106f fVar = new C35106f();
        fVar.mo104722c(str);
        return fVar;
    }

    @C0359n0
    /* renamed from: h */
    public static C35110j m144259h(@C0359n0 JSONObject jSONObject) {
        C35110j jVar = new C35110j();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FONT_NAME)) {
            jVar.mo104756e(jSONObject.getString(OTUXParamsKeys.OT_UX_FONT_NAME));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FONT_SIZE)) {
            jVar.mo104758g(jSONObject.getString(OTUXParamsKeys.OT_UX_FONT_SIZE));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FONT_TEXT_STYLE)) {
            jVar.mo104755d(jSONObject.getInt(OTUXParamsKeys.OT_UX_FONT_TEXT_STYLE));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FONT_TYPE_FACE_KEY)) {
            jVar.mo104760i(jSONObject.getString(OTUXParamsKeys.OT_UX_FONT_TYPE_FACE_KEY));
        }
        return jVar;
    }

    @C0359n0
    /* renamed from: n */
    public static C35102b0 m144260n(@C0359n0 JSONObject jSONObject) {
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104659c(m144259h(jSONObject));
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            b0Var.mo104666j(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_COLOR));
        }
        return b0Var;
    }

    @C0359n0
    /* renamed from: p */
    public static C35100a0 m144261p(@C0359n0 JSONObject jSONObject) {
        C35100a0 a0Var = new C35100a0();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            a0Var.mo104639b(jSONObject.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            a0Var.mo104653p(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_PLACEHOLDER_TEXT_COLOR)) {
            a0Var.mo104651n(jSONObject.getString(OTUXParamsKeys.OT_UX_PLACEHOLDER_TEXT_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_ICON_COLOR)) {
            a0Var.mo104649l(jSONObject.getString(OTUXParamsKeys.OT_UX_ICON_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_CLEAR_BUTTON_COLOR)) {
            a0Var.mo104647j(jSONObject.getString(OTUXParamsKeys.OT_UX_CLEAR_BUTTON_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_COLOR)) {
            a0Var.mo104641d(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_WIDTH)) {
            a0Var.mo104645h(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_WIDTH));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_RADIUS)) {
            a0Var.mo104643f(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_RADIUS));
        }
        return a0Var;
    }

    /* renamed from: t */
    public static C35120t m144262t(JSONObject jSONObject) {
        C35120t tVar = new C35120t();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            tVar.mo104954p(jSONObject.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR)) {
            tVar.mo104965z(jSONObject.getString(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON)) {
            tVar.mo104920O(jSONObject.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF)) {
            tVar.mo104917L(jSONObject.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR)) {
            tVar.mo104923R(jSONObject.getString(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_RIGHT_CHEVRON_COLOR)) {
            tVar.mo104908C(jSONObject.getString(OTUXParamsKeys.OT_UX_RIGHT_CHEVRON_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_SHOW_LOGO_ON_PC)) {
            C35112l lVar = new C35112l();
            lVar.mo104773b(String.valueOf(jSONObject.getBoolean(OTUXParamsKeys.OT_UX_SHOW_LOGO_ON_PC)));
            tVar.mo104946h(lVar);
        }
        return tVar;
    }

    /* renamed from: v */
    public static C35122v m144263v(JSONObject jSONObject) {
        C35122v vVar = new C35122v();
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            vVar.mo104975h(jSONObject.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR)) {
            vVar.mo104986s(jSONObject.getString(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FILTER_COLOR_ON)) {
            vVar.mo104984q(jSONObject.getString(OTUXParamsKeys.OT_UX_FILTER_COLOR_ON));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FILTER_COLOR_OFF)) {
            vVar.mo104981n(jSONObject.getString(OTUXParamsKeys.OT_UX_FILTER_COLOR_OFF));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_SEARCH_BAR)) {
            vVar.mo104970c(m144261p(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_SEARCH_BAR)));
        }
        return vVar;
    }

    @C0363p0
    /* renamed from: A */
    public C35118r mo104671A() {
        JSONObject i = mo104684i();
        if (i == null) {
            return null;
        }
        C35118r rVar = new C35118r();
        if (i.has(OTUXParamsKeys.OT_UX_LINK_UNDERLINE)) {
            rVar.mo104872c(i.getBoolean(OTUXParamsKeys.OT_UX_LINK_UNDERLINE));
        }
        if (!i.has(OTUXParamsKeys.OT_UX_LINK_COLOR)) {
            return rVar;
        }
        rVar.mo104871b(i.getString(OTUXParamsKeys.OT_UX_LINK_COLOR));
        return rVar;
    }

    @C0363p0
    /* renamed from: B */
    public C35119s mo104672B() {
        JSONObject s = mo104692s();
        if (s == null) {
            return null;
        }
        C35119s sVar = new C35119s();
        if (s.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            sVar.mo104886h(s.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (s.has(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR)) {
            sVar.mo104890l(s.getString(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR));
        }
        if (s.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON)) {
            sVar.mo104896r(s.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON));
        }
        if (s.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF)) {
            sVar.mo104893o(s.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF));
        }
        if (s.has(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR)) {
            sVar.mo104900u(s.getString(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR));
        }
        if (s.has(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR)) {
            sVar.mo104882d(s.getString(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR));
        }
        if (s.has(OTUXParamsKeys.OT_UX_GROUP_SUMMARY)) {
            JSONObject jSONObject = s.getJSONObject(OTUXParamsKeys.OT_UX_GROUP_SUMMARY);
            if (jSONObject.has("title")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                sVar.mo104898t(mo104691r(jSONObject2));
                sVar.mo104892n(mo104691r(jSONObject2));
            }
            if (jSONObject.has("description")) {
                sVar.mo104895q(mo104691r(jSONObject.getJSONObject("description")));
            }
        }
        if (s.has(OTUXParamsKeys.OT_UX_CONSENT_TITLE)) {
            sVar.mo104885g(mo104691r(s.getJSONObject(OTUXParamsKeys.OT_UX_CONSENT_TITLE)));
        }
        if (s.has(OTUXParamsKeys.OT_UX_LEGITIMATE_INTEREST_TITLE)) {
            sVar.mo104889k(mo104691r(s.getJSONObject(OTUXParamsKeys.OT_UX_LEGITIMATE_INTEREST_TITLE)));
        }
        if (s.has(OTUXParamsKeys.OT_UX_TOGGLE_ALWAYS_ACTIVE_STATUS)) {
            sVar.mo104881c(mo104691r(s.getJSONObject(OTUXParamsKeys.OT_UX_TOGGLE_ALWAYS_ACTIVE_STATUS)));
        }
        if (!s.has(OTUXParamsKeys.OT_UX_LINKS)) {
            return sVar;
        }
        JSONObject jSONObject3 = s.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
        if (jSONObject3.has(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)) {
            sVar.mo104888j(mo104686k(jSONObject3.getJSONObject(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)));
        }
        if (jSONObject3.has(OTUXParamsKeys.OT_UX_LINK_SDK_LIST)) {
            sVar.mo104884f(mo104686k(jSONObject3.getJSONObject(OTUXParamsKeys.OT_UX_LINK_SDK_LIST)));
        }
        if (!jSONObject3.has(OTUXParamsKeys.OT_UX_LINK_FULL_LEGAL_TEXT)) {
            return sVar;
        }
        sVar.mo104880b(mo104686k(jSONObject3.getJSONObject(OTUXParamsKeys.OT_UX_LINK_FULL_LEGAL_TEXT)));
        return sVar;
    }

    @C0363p0
    /* renamed from: C */
    public C35120t mo104673C() {
        JSONObject q = mo104690q();
        if (q == null) {
            return null;
        }
        C35120t t = m144262t(q);
        mo104688m(t, q);
        mo104681e(t, q);
        mo104685j(t, q);
        return t;
    }

    @C0363p0
    /* renamed from: D */
    public C35121u mo104674D() {
        JSONObject l = mo104687l();
        if (l == null) {
            return null;
        }
        C35121u uVar = new C35121u();
        uVar.mo104967b(m144260n(l));
        return uVar;
    }

    @C0363p0
    /* renamed from: E */
    public C35122v mo104675E() {
        JSONObject u = mo104693u();
        JSONObject y = mo104696y();
        if (u == null) {
            return null;
        }
        C35122v v = m144263v(u);
        if (u.has("summary")) {
            JSONObject jSONObject = u.getJSONObject("summary");
            if (jSONObject.has("title")) {
                v.mo104983p(mo104691r(jSONObject.getJSONObject("title")));
            }
            if (jSONObject.has("description")) {
                v.mo104980m(mo104691r(jSONObject.getJSONObject("description")));
            }
        }
        if (y != null && y.has(OTUXParamsKeys.OT_UX_ALLOW_ALL_TOGGLE_TEXT)) {
            v.mo104971d(mo104691r(y.getJSONObject(OTUXParamsKeys.OT_UX_ALLOW_ALL_TOGGLE_TEXT)));
        }
        mo104682f(v, u);
        return v;
    }

    @C0363p0
    /* renamed from: F */
    public C35125y mo104676F() {
        JSONObject x = mo104695x();
        if (x == null) {
            return null;
        }
        C35125y yVar = new C35125y();
        if (x.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            yVar.mo105025g(x.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (x.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON)) {
            yVar.mo105031m(x.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON));
        }
        if (x.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF)) {
            yVar.mo105028j(x.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF));
        }
        if (x.has(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR)) {
            yVar.mo105034p(x.getString(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR));
        }
        if (x.has(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR)) {
            yVar.mo105022d(x.getString(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR));
        }
        if (x.has("title")) {
            yVar.mo105033o(mo104691r(x.getJSONObject("title")));
        }
        if (x.has(OTUXParamsKeys.OT_UX_DETAILS_SUMMARY)) {
            JSONObject jSONObject = x.getJSONObject(OTUXParamsKeys.OT_UX_DETAILS_SUMMARY);
            if (jSONObject.has("title")) {
                yVar.mo105027i(mo104691r(jSONObject.getJSONObject("title")));
            }
            if (jSONObject.has("description")) {
                yVar.mo105024f(mo104691r(jSONObject.getJSONObject("description")));
            }
        }
        if (x.has(OTUXParamsKeys.OT_UX_CONSENT_TITLE)) {
            yVar.mo105021c(mo104691r(x.getJSONObject(OTUXParamsKeys.OT_UX_CONSENT_TITLE)));
        }
        if (x.has(OTUXParamsKeys.OT_UX_LEGITIMATE_INTEREST_TITLE)) {
            yVar.mo105030l(mo104691r(x.getJSONObject(OTUXParamsKeys.OT_UX_LEGITIMATE_INTEREST_TITLE)));
        }
        if (!x.has(OTUXParamsKeys.OT_UX_LINKS)) {
            return yVar;
        }
        JSONObject jSONObject2 = x.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
        if (!jSONObject2.has(OTUXParamsKeys.OT_UX_PRIVACY_NOTICE_BUTTON)) {
            return yVar;
        }
        yVar.mo105020b(mo104686k(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_PRIVACY_NOTICE_BUTTON)));
        return yVar;
    }

    @C0363p0
    /* renamed from: G */
    public C35126z mo104677G() {
        C35126z zVar;
        JSONObject y = mo104696y();
        if (y != null) {
            zVar = new C35126z();
            if (y.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
                zVar.mo105065m(y.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
            }
            if (y.has(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR)) {
                zVar.mo105075v(y.getString(OTUXParamsKeys.OT_UX_LINE_BREAK_COLOR));
            }
            if (y.has(OTUXParamsKeys.OT_UX_FILTER_COLOR_ON)) {
                zVar.mo105070r(y.getString(OTUXParamsKeys.OT_UX_FILTER_COLOR_ON));
            }
            if (y.has(OTUXParamsKeys.OT_UX_FILTER_COLOR_OFF)) {
                zVar.mo105068p(y.getString(OTUXParamsKeys.OT_UX_FILTER_COLOR_OFF));
            }
            if (y.has(OTUXParamsKeys.OT_UX_FILTER_SELECTION_COLOR)) {
                zVar.mo105072t(y.getString(OTUXParamsKeys.OT_UX_FILTER_SELECTION_COLOR));
            }
            if (y.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON)) {
                zVar.mo105044D(y.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_ON));
            }
            if (y.has(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF)) {
                zVar.mo105042B(y.getString(OTUXParamsKeys.OT_UX_TOGGLE_THUMB_COLOR_OFF));
            }
            if (y.has(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR)) {
                zVar.mo105046F(y.getString(OTUXParamsKeys.OT_UX_TOGGLE_TRACK_COLOR));
            }
            if (y.has(OTUXParamsKeys.OT_UX_RIGHT_CHEVRON_COLOR)) {
                zVar.mo105079z(y.getString(OTUXParamsKeys.OT_UX_RIGHT_CHEVRON_COLOR));
            }
            if (y.has(OTUXParamsKeys.OT_UX_SEARCH_BAR)) {
                zVar.mo105056d(m144261p(y.getJSONObject(OTUXParamsKeys.OT_UX_SEARCH_BAR)));
            }
            if (y.has(OTUXParamsKeys.OT_UX_FILTER_NAVIGATION_TEXT)) {
                zVar.mo105064l(mo104691r(y.getJSONObject(OTUXParamsKeys.OT_UX_FILTER_NAVIGATION_TEXT)));
            }
            if (y.has("title")) {
                zVar.mo105067o(mo104691r(y.getJSONObject("title")));
            }
            if (y.has(OTUXParamsKeys.OT_UX_ALLOW_ALL_TOGGLE_TEXT)) {
                zVar.mo105057e(mo104691r(y.getJSONObject(OTUXParamsKeys.OT_UX_ALLOW_ALL_TOGGLE_TEXT)));
            }
            if (y.has(OTUXParamsKeys.OT_UX_FILTER_ITEM_TITLE_TEXT)) {
                zVar.mo105061i(mo104691r(y.getJSONObject(OTUXParamsKeys.OT_UX_FILTER_ITEM_TITLE_TEXT)));
            }
            if (y.has("buttons")) {
                JSONObject jSONObject = y.getJSONObject("buttons");
                if (jSONObject.has(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR)) {
                    zVar.mo105062j(jSONObject.getString(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR));
                }
                if (jSONObject.has(OTUXParamsKeys.OT_UX_VL_CONFIRM_CHOICE)) {
                    zVar.mo105060h(mo104678a(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_VL_CONFIRM_CHOICE)));
                }
                if (jSONObject.has(OTUXParamsKeys.OT_UX_APPLY_FILTER_BUTTON)) {
                    zVar.mo105054b(mo104678a(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_APPLY_FILTER_BUTTON)));
                }
            }
        } else {
            zVar = null;
        }
        mo104683g(zVar);
        return zVar;
    }

    @C0359n0
    /* renamed from: a */
    public C35105e mo104678a(@C0359n0 JSONObject jSONObject) {
        C35105e eVar = new C35105e();
        eVar.mo104700c(m144259h(jSONObject));
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            eVar.mo104701d(jSONObject.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            eVar.mo104718v(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_COLOR)) {
            eVar.mo104703f(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_COLOR));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_WIDTH)) {
            eVar.mo104707j(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_WIDTH));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_BORDER_RADIUS)) {
            eVar.mo104705h(jSONObject.getString(OTUXParamsKeys.OT_UX_BORDER_RADIUS));
        }
        return eVar;
    }

    @C0363p0
    /* renamed from: c */
    public JSONObject mo104679c() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_BANNER_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_BANNER_THEME);
    }

    /* renamed from: d */
    public final void mo104680d(@C0359n0 C35117q qVar, @C0359n0 JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_CLOSE_BUTTON);
        C35106f n = qVar.mo104856n();
        C35105e a = mo104678a(jSONObject2);
        if (!C35020d.m143605J(a.mo104699a())) {
            a.mo104713p(C13758b.f33436b);
            n.mo104721b(a);
            qVar.mo104845c(n);
        }
    }

    /* renamed from: e */
    public final void mo104681e(C35120t tVar, JSONObject jSONObject) {
        if (jSONObject.has("buttons")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("buttons");
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON_COLOR)) {
                tVar.mo104942f(m144258b(jSONObject2.getString(OTUXParamsKeys.OT_UX_CLOSE_BUTTON_COLOR)));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_CLOSE_BUTTON);
                C35106f u = tVar.mo104960u();
                C35105e a = mo104678a(jSONObject3);
                if (!C35020d.m143605J(a.mo104699a())) {
                    a.mo104713p(C13758b.f33436b);
                    u.mo104721b(a);
                    tVar.mo104942f(u);
                }
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR)) {
                tVar.mo104948j(jSONObject2.getString(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_ACCEPT_ALL)) {
                tVar.mo104940e(mo104678a(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_ACCEPT_ALL)));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_REJECT_ALL)) {
                tVar.mo104956r(mo104678a(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_REJECT_ALL)));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_CONFIRM_CHOICE)) {
                tVar.mo104951m(mo104678a(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_CONFIRM_CHOICE)));
            }
        }
    }

    /* renamed from: f */
    public final void mo104682f(C35122v vVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_FILTER_LIST)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_FILTER_LIST);
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_SELECTION_COLOR)) {
                vVar.mo104978k(jSONObject2.getString(OTUXParamsKeys.OT_UX_SELECTION_COLOR));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_NAV_ITEM)) {
                vVar.mo104974g(mo104691r(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_NAV_ITEM)));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_SDK_ITEM)) {
                vVar.mo104977j(mo104691r(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_SDK_ITEM)));
            }
            if (jSONObject2.has("buttons")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("buttons");
                if (jSONObject3.has(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR)) {
                    vVar.mo104972e(jSONObject3.getString(OTUXParamsKeys.OT_UX_BACK_BUTTON_COLOR));
                }
                if (jSONObject3.has(OTUXParamsKeys.OT_UX_APPLY_FILTER_BUTTON)) {
                    vVar.mo104969b(mo104678a(jSONObject3.getJSONObject(OTUXParamsKeys.OT_UX_APPLY_FILTER_BUTTON)));
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo104683g(@C0363p0 C35126z zVar) {
        C35121u D = mo104674D();
        if (D != null) {
            if (zVar == null) {
                zVar = new C35126z();
            }
            zVar.mo105055c(D);
        }
    }

    @C0363p0
    /* renamed from: i */
    public JSONObject mo104684i() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_GLOBAL_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_GLOBAL_THEME);
    }

    /* renamed from: j */
    public final void mo104685j(C35120t tVar, JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_LINKS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)) {
                tVar.mo104944g(mo104686k(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)));
            }
            if (jSONObject2.has(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)) {
                tVar.mo104952n(mo104686k(jSONObject2.getJSONObject(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)));
            }
        }
    }

    @C0359n0
    /* renamed from: k */
    public final C35111k mo104686k(@C0359n0 JSONObject jSONObject) {
        C35111k kVar = new C35111k();
        kVar.mo104765c(mo104691r(jSONObject));
        return kVar;
    }

    @C0363p0
    /* renamed from: l */
    public JSONObject mo104687l() {
        JSONObject w = mo104694w();
        if (w == null || !w.has("pageHeader")) {
            return null;
        }
        return w.getJSONObject("pageHeader");
    }

    /* renamed from: m */
    public final void mo104688m(C35120t tVar, JSONObject jSONObject) {
        if (jSONObject.has("summary")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("summary");
            if (jSONObject2.has("title")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("title");
                tVar.mo104916K(mo104691r(jSONObject3));
                tVar.mo104910E(mo104691r(jSONObject3));
                tVar.mo104961v(mo104691r(jSONObject3));
            }
            if (jSONObject2.has("description")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("description");
                tVar.mo104913H(mo104691r(jSONObject4));
                tVar.mo104953o(mo104691r(jSONObject4));
            }
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_PURPOSE_TITLE)) {
            JSONObject jSONObject5 = jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_PURPOSE_TITLE);
            tVar.mo104907B(mo104691r(jSONObject5));
            tVar.mo104957s(mo104691r(jSONObject5));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TOGGLE_ALWAYS_ACTIVE_STATUS)) {
            tVar.mo104947i(mo104691r(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_TOGGLE_ALWAYS_ACTIVE_STATUS)));
        }
    }

    @C0363p0
    /* renamed from: o */
    public JSONObject mo104689o() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_PERMISSION_CONSENT_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_PERMISSION_CONSENT_THEME);
    }

    @C0363p0
    /* renamed from: q */
    public JSONObject mo104690q() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_PREFERENCE_CENTER_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_PREFERENCE_CENTER_THEME);
    }

    @C0359n0
    /* renamed from: r */
    public C35102b0 mo104691r(@C0359n0 JSONObject jSONObject) {
        C35102b0 b0Var = new C35102b0();
        b0Var.mo104659c(m144259h(jSONObject));
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_ALIGNMENT)) {
            b0Var.mo104664h(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_ALIGNMENT));
        }
        if (jSONObject.has(OTUXParamsKeys.OT_UX_TEXT_COLOR)) {
            b0Var.mo104666j(jSONObject.getString(OTUXParamsKeys.OT_UX_TEXT_COLOR));
        }
        return b0Var;
    }

    @C0363p0
    /* renamed from: s */
    public JSONObject mo104692s() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_PURPOSE_DETAILS_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_PURPOSE_DETAILS_THEME);
    }

    @C0363p0
    /* renamed from: u */
    public JSONObject mo104693u() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_SDK_LIST_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_SDK_LIST_THEME);
    }

    @C0363p0
    /* renamed from: w */
    public JSONObject mo104694w() {
        if (this.f85645a.has(OTUXParamsKeys.OT_UI_CONFIG)) {
            return this.f85645a.getJSONObject(OTUXParamsKeys.OT_UI_CONFIG);
        }
        return null;
    }

    @C0363p0
    /* renamed from: x */
    public JSONObject mo104695x() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_VENDOR_DETAILS_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_VENDOR_DETAILS_THEME);
    }

    @C0363p0
    /* renamed from: y */
    public JSONObject mo104696y() {
        JSONObject w = mo104694w();
        if (w == null || !w.has(OTUXParamsKeys.OT_VENDOR_LIST_THEME)) {
            return null;
        }
        return w.getJSONObject(OTUXParamsKeys.OT_VENDOR_LIST_THEME);
    }

    @C0363p0
    /* renamed from: z */
    public C35117q mo104697z() {
        JSONObject c = mo104679c();
        if (c == null) {
            return null;
        }
        C35117q qVar = new C35117q();
        if (c.has(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR)) {
            qVar.mo104849g(c.getString(OTUXParamsKeys.OT_UX_BACKGROUND_COLOR));
        }
        if (c.has("summary")) {
            JSONObject jSONObject = c.getJSONObject("summary");
            if (jSONObject.has("title")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                qVar.mo104862t(mo104691r(jSONObject2));
                qVar.mo104854l(mo104691r(jSONObject2));
            }
            if (jSONObject.has("description")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("description");
                qVar.mo104860r(mo104691r(jSONObject3));
                qVar.mo104848f(mo104691r(jSONObject3));
                qVar.mo104858p(mo104691r(jSONObject3));
            }
        }
        if (c.has("buttons")) {
            JSONObject jSONObject4 = c.getJSONObject("buttons");
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON_COLOR)) {
                qVar.mo104845c(m144258b(jSONObject4.getString(OTUXParamsKeys.OT_UX_CLOSE_BUTTON_COLOR)));
            }
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_CLOSE_BUTTON)) {
                mo104680d(qVar, jSONObject4);
            }
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_ACCEPT_ALL)) {
                qVar.mo104844b(mo104678a(jSONObject4.getJSONObject(OTUXParamsKeys.OT_UX_ACCEPT_ALL)));
            }
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_REJECT_ALL)) {
                qVar.mo104852j(mo104678a(jSONObject4.getJSONObject(OTUXParamsKeys.OT_UX_REJECT_ALL)));
            }
            if (jSONObject4.has(OTUXParamsKeys.OT_UX_SHOW_PREFERENCES)) {
                qVar.mo104857o(mo104678a(jSONObject4.getJSONObject(OTUXParamsKeys.OT_UX_SHOW_PREFERENCES)));
            }
        }
        if (!c.has(OTUXParamsKeys.OT_UX_LINKS)) {
            return qVar;
        }
        JSONObject jSONObject5 = c.getJSONObject(OTUXParamsKeys.OT_UX_LINKS);
        if (jSONObject5.has(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)) {
            qVar.mo104846d(mo104686k(jSONObject5.getJSONObject(OTUXParamsKeys.OT_UX_LINK_POLICY_LINK)));
        }
        if (!jSONObject5.has(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)) {
            return qVar;
        }
        qVar.mo104853k(mo104686k(jSONObject5.getJSONObject(OTUXParamsKeys.OT_UX_LINK_VENDOR_LIST)));
        return qVar;
    }
}
