package com.urbanairship.iam.events;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.events.a */
public class C9175a {

    /* renamed from: A */
    public static final String f24908A = "page_index";

    /* renamed from: B */
    public static final String f24909B = "page_identifier";

    /* renamed from: C */
    public static final String f24910C = "page_count";

    /* renamed from: D */
    public static final String f24911D = "viewed_count";

    /* renamed from: E */
    public static final String f24912E = "viewed_pages";

    /* renamed from: F */
    public static final String f24913F = "completed";

    /* renamed from: G */
    public static final String f24914G = "to_page_index";

    /* renamed from: H */
    public static final String f24915H = "to_page_identifier";

    /* renamed from: I */
    public static final String f24916I = "from_page_index";

    /* renamed from: J */
    public static final String f24917J = "from_page_identifier";

    /* renamed from: K */
    public static final String f24918K = "display_time";

    /* renamed from: L */
    public static final String f24919L = "button_identifier";

    /* renamed from: M */
    public static final String f24920M = "resolution";

    /* renamed from: N */
    public static final String f24921N = "type";

    /* renamed from: O */
    public static final String f24922O = "replaced";

    /* renamed from: P */
    public static final String f24923P = "direct_open";

    /* renamed from: Q */
    public static final String f24924Q = "display_time";

    /* renamed from: R */
    public static final String f24925R = "button_id";

    /* renamed from: S */
    public static final String f24926S = "button_description";

    /* renamed from: T */
    public static final String f24927T = "replacement_id";

    /* renamed from: U */
    public static final String f24928U = "id";

    /* renamed from: V */
    public static final String f24929V = "conversion_send_id";

    /* renamed from: W */
    public static final String f24930W = "conversion_metadata";

    /* renamed from: X */
    public static final String f24931X = "source";

    /* renamed from: Y */
    public static final String f24932Y = "context";

    /* renamed from: Z */
    public static final String f24933Z = "locale";

    /* renamed from: a0 */
    public static final String f24934a0 = "reporting_context";

    /* renamed from: b0 */
    public static final String f24935b0 = "form";

    /* renamed from: c0 */
    public static final String f24936c0 = "identifier";

    /* renamed from: d0 */
    public static final String f24937d0 = "submitted";

    /* renamed from: e0 */
    public static final String f24938e0 = "type";

    /* renamed from: f0 */
    public static final String f24939f0 = "response_type";

    /* renamed from: g0 */
    public static final String f24940g0 = "pager";

    /* renamed from: h0 */
    public static final String f24941h0 = "identifier";
    @C0359n0

    /* renamed from: i */
    public static final String f24942i = "in_app_resolution";

    /* renamed from: i0 */
    public static final String f24943i0 = "count";
    @C0359n0

    /* renamed from: j */
    public static final String f24944j = "in_app_display";

    /* renamed from: j0 */
    public static final String f24945j0 = "button";
    @C0359n0

    /* renamed from: k */
    public static final String f24946k = "in_app_page_view";

    /* renamed from: k0 */
    public static final String f24947k0 = "identifier";
    @C0359n0

    /* renamed from: l */
    public static final String f24948l = "in_app_page_swipe";

    /* renamed from: l0 */
    public static final String f24949l0 = "message_id";
    @C0359n0

    /* renamed from: m */
    public static final String f24950m = "in_app_form_display";

    /* renamed from: m0 */
    public static final String f24951m0 = "campaigns";
    @C0359n0

    /* renamed from: n */
    public static final String f24952n = "in_app_form_result";

    /* renamed from: n0 */
    public static final String f24953n0 = "urban-airship";
    @C0359n0

    /* renamed from: o */
    public static final String f24954o = "in_app_pager_summary";

    /* renamed from: o0 */
    public static final String f24955o0 = "app-defined";
    @C0359n0

    /* renamed from: p */
    public static final String f24956p = "in_app_pager_completed";
    @C0359n0

    /* renamed from: q */
    public static final String f24957q = "in_app_button_tap";
    @C0359n0

    /* renamed from: r */
    public static final String f24958r = "in_app_permission_result";

    /* renamed from: s */
    public static final String f24959s = "permission";

    /* renamed from: t */
    public static final String f24960t = "starting_permission_status";

    /* renamed from: u */
    public static final String f24961u = "ending_permission_status";

    /* renamed from: v */
    public static final String f24962v = "form_identifier";

    /* renamed from: w */
    public static final String f24963w = "form_type";

    /* renamed from: x */
    public static final String f24964x = "form_response_type";

    /* renamed from: y */
    public static final String f24965y = "forms";

    /* renamed from: z */
    public static final String f24966z = "pager_identifier";

    /* renamed from: a */
    public final String f24967a;

    /* renamed from: b */
    public final String f24968b;

    /* renamed from: c */
    public final String f24969c;

    /* renamed from: d */
    public final Map<String, JsonValue> f24970d;

    /* renamed from: e */
    public JsonValue f24971e;

    /* renamed from: f */
    public JsonValue f24972f;

    /* renamed from: g */
    public C35868d f24973g;

    /* renamed from: h */
    public C9323b f24974h;

    /* renamed from: com.urbanairship.iam.events.a$b */
    public static class C9177b extends C35554i {

        /* renamed from: K0 */
        public final String f24975K0;

        /* renamed from: L0 */
        public final C9323b f24976L0;

        @C0359n0
        /* renamed from: e */
        public C9323b mo18411e() {
            return this.f24976L0;
        }

        @C0359n0
        /* renamed from: j */
        public String mo18412j() {
            return this.f24975K0;
        }

        @C0359n0
        public String toString() {
            return "AnalyticsEvent{type='" + this.f24975K0 + '\'' + ", data=" + this.f24976L0 + C12361b.f30259j;
        }

        public C9177b(@C0359n0 String str, @C0359n0 C9323b bVar) {
            this.f24975K0 = str;
            this.f24976L0 = bVar;
        }
    }

    /* renamed from: com.urbanairship.iam.events.a$c */
    public static class C9178c implements C9333e {

        /* renamed from: a */
        public final String f24977a;

        /* renamed from: b */
        public final int f24978b;

        /* renamed from: c */
        public final long f24979c;

        public C9178c(int i, @C0359n0 String str, long j) {
            this.f24978b = i;
            this.f24977a = str;
            this.f24979c = j;
        }

        @C0359n0
        /* renamed from: q */
        public JsonValue mo17264q() {
            return C9323b.m35017y().mo18823g(C9175a.f24909B, this.f24977a).mo18820d(C9175a.f24908A, this.f24978b).mo18823g("display_time", C35554i.m146722m(this.f24979c)).mo18817a().mo17264q();
        }
    }

    public C9175a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 InAppMessage inAppMessage) {
        this.f24967a = str;
        this.f24968b = str2;
        this.f24969c = inAppMessage.mo18186s();
        this.f24970d = inAppMessage.mo18185r();
    }

    /* renamed from: a */
    public static C9175a m34399a(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 String str2) {
        return new C9175a(f24957q, str, inAppMessage).mo18409t(C9323b.m35017y().mo18823g(f24919L, str2).mo18817a());
    }

    /* renamed from: b */
    public static C9323b m34400b(@C0363p0 C35868d dVar, @C0363p0 JsonValue jsonValue) {
        boolean z;
        C9323b.C9325b f = C9323b.m35017y().mo18822f("reporting_context", jsonValue);
        if (dVar != null) {
            C35867c e = dVar.mo107466e();
            if (e != null) {
                if (e.mo107461b() != null) {
                    z = e.mo107461b().booleanValue();
                } else {
                    z = false;
                }
                f.mo18822f("form", C9323b.m35017y().mo18823g("identifier", e.mo107463d()).mo18824h(f24937d0, z).mo18823g("response_type", e.mo107460a()).mo18823g("type", e.mo107462c()).mo18817a());
            }
            C35869e f2 = dVar.mo107467f();
            if (f2 != null) {
                f.mo18822f(f24940g0, C9323b.m35017y().mo18823g("identifier", f2.mo107470b()).mo18820d("count", f2.mo107469a()).mo18820d(f24908A, f2.mo107471c()).mo18823g(f24909B, f2.mo107472d()).mo18824h(f24913F, f2.mo107473e()).mo18817a());
            }
            String d = dVar.mo107465d();
            if (d != null) {
                f.mo18822f(f24945j0, C9323b.m35017y().mo18823g("identifier", d).mo18817a());
            }
        }
        C9323b a = f.mo18817a();
        if (a.isEmpty()) {
            return null;
        }
        return a;
    }

    @C0359n0
    /* renamed from: c */
    public static JsonValue m34401c(@C0359n0 String str, @C0359n0 String str2, @C0363p0 JsonValue jsonValue) {
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -2115218223:
                if (str2.equals(InAppMessage.f24674L0)) {
                    c = 0;
                    break;
                }
                break;
            case -949613987:
                if (str2.equals("app-defined")) {
                    c = 1;
                    break;
                }
                break;
            case 2072105630:
                if (str2.equals(InAppMessage.f24673K0)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C9323b.m35017y().mo18823g("message_id", str).mo18822f("campaigns", jsonValue).mo18817a().mo17264q();
            case 1:
                return C9323b.m35017y().mo18823g("message_id", str).mo18817a().mo17264q();
            case 2:
                return JsonValue.m34968N(str);
            default:
                return JsonValue.f25436b;
        }
    }

    /* renamed from: d */
    public static C9175a m34402d(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage) {
        return new C9175a(f24944j, str, inAppMessage);
    }

    /* renamed from: e */
    public static C9175a m34403e(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 C35867c cVar) {
        return new C9175a(f24950m, str, inAppMessage).mo18409t(C9323b.m35017y().mo18823g(f24962v, cVar.mo107463d()).mo18823g(f24964x, cVar.mo107460a()).mo18823g(f24963w, cVar.mo107462c()).mo18817a());
    }

    /* renamed from: f */
    public static C9175a m34404f(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 FormData.C35856a aVar) {
        return new C9175a(f24952n, str, inAppMessage).mo18409t(C9323b.m35017y().mo18822f("forms", aVar).mo18817a());
    }

    /* renamed from: g */
    public static C9175a m34405g(@C0359n0 String str, @C0359n0 String str2) {
        return new C9175a(f24942i, str, str2).mo18409t(C9323b.m35017y().mo18822f(f24920M, m34414q(C9163c0.m34349c(), 0)).mo18817a());
    }

    /* renamed from: h */
    public static C9175a m34406h(@C0359n0 String str) {
        return new C9175a(f24942i, str, InAppMessage.f24673K0).mo18409t(C9323b.m35017y().mo18822f(f24920M, C9323b.m35017y().mo18823g("type", f24923P).mo18817a()).mo18817a());
    }

    /* renamed from: i */
    public static C9175a m34407i(@C0359n0 String str, @C0359n0 String str2) {
        return new C9175a(f24942i, str, InAppMessage.f24673K0).mo18409t(C9323b.m35017y().mo18822f(f24920M, C9323b.m35017y().mo18823g("type", f24922O).mo18823g(f24927T, str2).mo18817a()).mo18817a());
    }

    /* renamed from: j */
    public static C9175a m34408j(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 C35869e eVar, int i, @C0359n0 String str2, int i2, @C0359n0 String str3) {
        return new C9175a(f24948l, str, inAppMessage).mo18409t(C9323b.m35017y().mo18823g(f24966z, eVar.mo107470b()).mo18820d(f24914G, i).mo18823g(f24915H, str2).mo18820d(f24916I, i2).mo18823g(f24917J, str3).mo18817a());
    }

    /* renamed from: k */
    public static C9175a m34409k(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 C35869e eVar, int i) {
        return new C9175a(f24946k, str, inAppMessage).mo18409t(C9323b.m35017y().mo18824h(f24913F, eVar.mo107473e()).mo18823g(f24966z, eVar.mo107470b()).mo18820d(f24910C, eVar.mo107469a()).mo18820d(f24908A, eVar.mo107471c()).mo18823g(f24909B, eVar.mo107472d()).mo18820d(f24911D, i).mo18817a());
    }

    /* renamed from: l */
    public static C9175a m34410l(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 C35869e eVar) {
        return new C9175a(f24956p, str, inAppMessage).mo18409t(C9323b.m35017y().mo18823g(f24966z, eVar.mo107470b()).mo18820d(f24908A, eVar.mo107471c()).mo18823g(f24909B, eVar.mo107472d()).mo18820d(f24910C, eVar.mo107469a()).mo18817a());
    }

    /* renamed from: m */
    public static C9175a m34411m(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 C35869e eVar, @C0359n0 List<C9178c> list) {
        return new C9175a(f24954o, str, inAppMessage).mo18409t(C9323b.m35017y().mo18823g(f24966z, eVar.mo107470b()).mo18820d(f24910C, eVar.mo107469a()).mo18824h(f24913F, eVar.mo107473e()).mo18826j(f24912E, list).mo18817a());
    }

    /* renamed from: n */
    public static C9175a m34412n(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, @C0359n0 Permission permission, @C0359n0 PermissionStatus permissionStatus, @C0359n0 PermissionStatus permissionStatus2) {
        return new C9175a(f24958r, str, inAppMessage).mo18409t(C9323b.m35017y().mo18822f("permission", permission).mo18822f(f24960t, permissionStatus).mo18822f(f24961u, permissionStatus2).mo18817a());
    }

    /* renamed from: p */
    public static C9175a m34413p(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage, long j, @C0359n0 C9163c0 c0Var) {
        return new C9175a(f24942i, str, inAppMessage).mo18409t(C9323b.m35017y().mo18822f(f24920M, m34414q(c0Var, j)).mo18817a());
    }

    /* renamed from: q */
    public static C9323b m34414q(C9163c0 c0Var, long j) {
        if (j <= 0) {
            j = 0;
        }
        C9323b.C9325b g = C9323b.m35017y().mo18823g("type", c0Var.mo18377f()).mo18823g("display_time", C35554i.m146722m(j));
        if (C9163c0.f24853c.equals(c0Var.mo18377f()) && c0Var.mo18375e() != null) {
            g.mo18823g("button_id", c0Var.mo18375e().mo18263o()).mo18823g("button_description", c0Var.mo18375e().mo18264p().mo18390o());
        }
        return g.mo18817a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9175a aVar = (C9175a) obj;
        if (!C17992m.m81740a(this.f24967a, aVar.f24967a) || !C17992m.m81740a(this.f24968b, aVar.f24968b) || !C17992m.m81740a(this.f24969c, aVar.f24969c) || !C17992m.m81740a(this.f24970d, aVar.f24970d) || !C17992m.m81740a(this.f24971e, aVar.f24971e) || !C17992m.m81740a(this.f24972f, aVar.f24972f) || !C17992m.m81740a(this.f24973g, aVar.f24973g) || !C17992m.m81740a(this.f24974h, aVar.f24974h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24967a, this.f24968b, this.f24969c, this.f24970d, this.f24971e, this.f24972f, this.f24973g, this.f24974h);
    }

    /* renamed from: o */
    public void mo18406o(C35518b bVar) {
        String str = "app-defined";
        boolean equals = str.equals(this.f24969c);
        C9323b.C9325b f = C9323b.m35017y().mo18822f("id", m34401c(this.f24968b, this.f24969c, this.f24971e));
        if (!equals) {
            str = f24953n0;
        }
        C9323b.C9325b f2 = f.mo18823g("source", str).mo18826j("conversion_send_id", bVar.mo106432S()).mo18826j("conversion_metadata", bVar.mo106431R()).mo18822f(f24932Y, m34400b(this.f24973g, this.f24972f));
        Map<String, JsonValue> map = this.f24970d;
        if (map != null) {
            f2.mo18826j("locale", map);
        }
        C9323b bVar2 = this.f24974h;
        if (bVar2 != null) {
            f2.mo18825i(bVar2);
        }
        bVar.mo106423J(new C9177b(this.f24967a, f2.mo18817a()));
    }

    /* renamed from: r */
    public C9175a mo18407r(@C0363p0 JsonValue jsonValue) {
        this.f24971e = jsonValue;
        return this;
    }

    /* renamed from: s */
    public C9175a mo18408s(@C0363p0 C35868d dVar) {
        this.f24973g = dVar;
        return this;
    }

    /* renamed from: t */
    public final C9175a mo18409t(C9323b bVar) {
        this.f24974h = bVar;
        return this;
    }

    /* renamed from: u */
    public C9175a mo18410u(@C0363p0 JsonValue jsonValue) {
        this.f24972f = jsonValue;
        return this;
    }

    public C9175a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        this.f24967a = str;
        this.f24968b = str2;
        this.f24969c = str3;
        this.f24970d = null;
    }
}
