package org.jsoup.select;

import com.google.android.material.badge.C31132a;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.C12361b;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.parser.C12894g;
import org.jsoup.select.C12915b;
import org.jsoup.select.C12918c;
import org.jsoup.select.C12959g;
import org.jsoup.select.Selector;

/* renamed from: org.jsoup.select.f */
public class C12958f {

    /* renamed from: d */
    public static final String[] f31961d = {",", ">", C31132a.f74628J0, "~", " "};

    /* renamed from: e */
    public static final String[] f31962e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f */
    public static final Pattern f31963f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g */
    public static final Pattern f31964g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: h */
    public static final /* synthetic */ boolean f31965h = false;

    /* renamed from: a */
    public final C12894g f31966a;

    /* renamed from: b */
    public final String f31967b;

    /* renamed from: c */
    public final List<C12918c> f31968c = new ArrayList();

    public C12958f(String str) {
        C12750d.m55071h(str);
        String trim = str.trim();
        this.f31967b = trim;
        this.f31966a = new C12894g(trim);
    }

    /* renamed from: t */
    public static C12918c m56231t(String str) {
        try {
            return new C12958f(str).mo30423s();
        } catch (IllegalArgumentException e) {
            throw new Selector.SelectorParseException(e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo30405a() {
        this.f31968c.add(new C12918c.C12919a());
    }

    /* renamed from: b */
    public final void mo30406b() {
        C12894g gVar = new C12894g(this.f31966a.mo30209d(C12361b.f30260k, C12361b.f30261l));
        String n = gVar.mo30219n(f31962e);
        C12750d.m55071h(n);
        gVar.mo30221p();
        if (gVar.mo30223r()) {
            if (n.startsWith("^")) {
                this.f31968c.add(new C12918c.C12925d(n.substring(1)));
            } else {
                this.f31968c.add(new C12918c.C12921b(n));
            }
        } else if (gVar.mo30224s("=")) {
            this.f31968c.add(new C12918c.C12927e(n, gVar.mo30204B()));
        } else if (gVar.mo30224s("!=")) {
            this.f31968c.add(new C12918c.C12935i(n, gVar.mo30204B()));
        } else if (gVar.mo30224s("^=")) {
            this.f31968c.add(new C12918c.C12937j(n, gVar.mo30204B()));
        } else if (gVar.mo30224s("$=")) {
            this.f31968c.add(new C12918c.C12931g(n, gVar.mo30204B()));
        } else if (gVar.mo30224s("*=")) {
            this.f31968c.add(new C12918c.C12929f(n, gVar.mo30204B()));
        } else if (gVar.mo30224s("~=")) {
            this.f31968c.add(new C12918c.C12933h(n, Pattern.compile(gVar.mo30204B())));
        } else {
            throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f31967b, gVar.mo30204B());
        }
    }

    /* renamed from: c */
    public final void mo30407c() {
        String j = this.f31966a.mo30215j();
        C12750d.m55071h(j);
        this.f31968c.add(new C12918c.C12939k(j.trim()));
    }

    /* renamed from: d */
    public final void mo30408d() {
        String j = this.f31966a.mo30215j();
        C12750d.m55071h(j);
        this.f31968c.add(new C12918c.C12945p(j));
    }

    /* renamed from: e */
    public final void mo30409e() {
        String b = C12757d.m55099b(this.f31966a.mo30216k());
        C12750d.m55071h(b);
        if (b.startsWith("*|")) {
            String substring = b.substring(2);
            this.f31968c.add(new C12915b.C12917b(new C12918c.C12938j0(substring), new C12918c.C12940k0(b.replace("*|", C33124s.f80355c))));
            return;
        }
        if (b.contains(C33093b.f80279g)) {
            b = b.replace(C33093b.f80279g, C33124s.f80355c);
        }
        this.f31968c.add(new C12918c.C12938j0(b));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: org.jsoup.select.b$b} */
    /* JADX WARNING: type inference failed for: r11v5, types: [org.jsoup.select.b$a] */
    /* JADX WARNING: type inference failed for: r11v6, types: [org.jsoup.select.b$a] */
    /* JADX WARNING: type inference failed for: r11v7, types: [org.jsoup.select.b$a] */
    /* JADX WARNING: type inference failed for: r11v8, types: [org.jsoup.select.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30410f(char r11) {
        /*
            r10 = this;
            org.jsoup.parser.g r0 = r10.f31966a
            r0.mo30221p()
            java.lang.String r0 = r10.mo30412h()
            org.jsoup.select.c r0 = m56231t(r0)
            java.util.List<org.jsoup.select.c> r1 = r10.f31968c
            int r1 = r1.size()
            r2 = 44
            r3 = 0
            r4 = 1
            if (r1 != r4) goto L_0x0033
            java.util.List<org.jsoup.select.c> r1 = r10.f31968c
            java.lang.Object r1 = r1.get(r3)
            org.jsoup.select.c r1 = (org.jsoup.select.C12918c) r1
            boolean r5 = r1 instanceof org.jsoup.select.C12915b.C12917b
            if (r5 == 0) goto L_0x003a
            if (r11 == r2) goto L_0x003a
            r5 = r1
            org.jsoup.select.b$b r5 = (org.jsoup.select.C12915b.C12917b) r5
            org.jsoup.select.c r5 = r5.mo30368c()
            r6 = r4
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x003c
        L_0x0033:
            org.jsoup.select.b$a r1 = new org.jsoup.select.b$a
            java.util.List<org.jsoup.select.c> r5 = r10.f31968c
            r1.<init>((java.util.Collection<org.jsoup.select.C12918c>) r5)
        L_0x003a:
            r5 = r1
            r6 = r3
        L_0x003c:
            java.util.List<org.jsoup.select.c> r7 = r10.f31968c
            r7.clear()
            r7 = 32
            r8 = 2
            if (r11 == r7) goto L_0x00b4
            r7 = 62
            if (r11 == r7) goto L_0x00a3
            r7 = 126(0x7e, float:1.77E-43)
            if (r11 == r7) goto L_0x0092
            r7 = 43
            if (r11 == r7) goto L_0x0081
            if (r11 != r2) goto L_0x0068
            boolean r11 = r1 instanceof org.jsoup.select.C12915b.C12917b
            if (r11 == 0) goto L_0x005b
            org.jsoup.select.b$b r1 = (org.jsoup.select.C12915b.C12917b) r1
            goto L_0x0064
        L_0x005b:
            org.jsoup.select.b$b r11 = new org.jsoup.select.b$b
            r11.<init>()
            r11.mo30372e(r1)
            r1 = r11
        L_0x0064:
            r1.mo30372e(r0)
            goto L_0x00c5
        L_0x0068:
            org.jsoup.select.Selector$SelectorParseException r0 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0.<init>(r11, r1)
            throw r0
        L_0x0081:
            org.jsoup.select.b$a r11 = new org.jsoup.select.b$a
            org.jsoup.select.c[] r2 = new org.jsoup.select.C12918c[r8]
            org.jsoup.select.g$c r7 = new org.jsoup.select.g$c
            r7.<init>(r1)
            r2[r3] = r7
            r2[r4] = r0
            r11.<init>((org.jsoup.select.C12918c[]) r2)
            goto L_0x00c4
        L_0x0092:
            org.jsoup.select.b$a r11 = new org.jsoup.select.b$a
            org.jsoup.select.c[] r2 = new org.jsoup.select.C12918c[r8]
            org.jsoup.select.g$f r7 = new org.jsoup.select.g$f
            r7.<init>(r1)
            r2[r3] = r7
            r2[r4] = r0
            r11.<init>((org.jsoup.select.C12918c[]) r2)
            goto L_0x00c4
        L_0x00a3:
            org.jsoup.select.b$a r11 = new org.jsoup.select.b$a
            org.jsoup.select.c[] r2 = new org.jsoup.select.C12918c[r8]
            org.jsoup.select.g$b r7 = new org.jsoup.select.g$b
            r7.<init>(r1)
            r2[r3] = r7
            r2[r4] = r0
            r11.<init>((org.jsoup.select.C12918c[]) r2)
            goto L_0x00c4
        L_0x00b4:
            org.jsoup.select.b$a r11 = new org.jsoup.select.b$a
            org.jsoup.select.c[] r2 = new org.jsoup.select.C12918c[r8]
            org.jsoup.select.g$e r7 = new org.jsoup.select.g$e
            r7.<init>(r1)
            r2[r3] = r7
            r2[r4] = r0
            r11.<init>((org.jsoup.select.C12918c[]) r2)
        L_0x00c4:
            r1 = r11
        L_0x00c5:
            if (r6 == 0) goto L_0x00ce
            r11 = r5
            org.jsoup.select.b$b r11 = (org.jsoup.select.C12915b.C12917b) r11
            r11.mo30367b(r1)
            goto L_0x00cf
        L_0x00ce:
            r5 = r1
        L_0x00cf:
            java.util.List<org.jsoup.select.c> r11 = r10.f31968c
            r11.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.C12958f.mo30410f(char):void");
    }

    /* renamed from: g */
    public final int mo30411g() {
        String trim = this.f31966a.mo30210e(")").trim();
        C12750d.m55068e(C12759f.m55109i(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    /* renamed from: h */
    public final String mo30412h() {
        StringBuilder b = C12759f.m55102b();
        while (!this.f31966a.mo30223r()) {
            if (this.f31966a.mo30225t("(")) {
                b.append("(");
                b.append(this.f31966a.mo30209d('(', ')'));
                b.append(")");
            } else if (this.f31966a.mo30225t("[")) {
                b.append("[");
                b.append(this.f31966a.mo30209d(C12361b.f30260k, C12361b.f30261l));
                b.append("]");
            } else if (!this.f31966a.mo30228v(f31961d)) {
                b.append(this.f31966a.mo30212g());
            } else if (b.length() > 0) {
                break;
            } else {
                this.f31966a.mo30212g();
            }
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: i */
    public final void mo30413i(boolean z) {
        String str;
        C12894g gVar = this.f31966a;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        gVar.mo30213h(str);
        String D = C12894g.m55964D(this.f31966a.mo30209d('(', ')'));
        C12750d.m55072i(D, ":contains(text) query must not be empty");
        if (z) {
            this.f31968c.add(new C12918c.C12942m(D));
        } else {
            this.f31968c.add(new C12918c.C12943n(D));
        }
    }

    /* renamed from: j */
    public final void mo30414j() {
        this.f31966a.mo30213h(":containsData");
        String D = C12894g.m55964D(this.f31966a.mo30209d('(', ')'));
        C12750d.m55072i(D, ":containsData(text) query must not be empty");
        this.f31968c.add(new C12918c.C12941l(D));
    }

    /* renamed from: k */
    public final void mo30415k(boolean z, boolean z2) {
        int i;
        String b = C12757d.m55099b(this.f31966a.mo30210e(")"));
        Matcher matcher = f31963f.matcher(b);
        Matcher matcher2 = f31964g.matcher(b);
        int i2 = 2;
        int i3 = 1;
        if (!"odd".equals(b)) {
            if ("even".equals(b)) {
                i3 = 0;
            } else if (matcher.matches()) {
                if (matcher.group(3) != null) {
                    i = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                } else {
                    i = 1;
                }
                if (matcher.group(4) != null) {
                    i3 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                } else {
                    i3 = 0;
                }
                i2 = i;
            } else if (matcher2.matches()) {
                i3 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", b);
            }
        }
        if (z2) {
            if (z) {
                this.f31968c.add(new C12918c.C12922b0(i2, i3));
            } else {
                this.f31968c.add(new C12918c.C12924c0(i2, i3));
            }
        } else if (z) {
            this.f31968c.add(new C12918c.C12920a0(i2, i3));
        } else {
            this.f31968c.add(new C12918c.C12955z(i2, i3));
        }
    }

    /* renamed from: l */
    public final void mo30416l() {
        if (this.f31966a.mo30224s("#")) {
            mo30408d();
        } else if (this.f31966a.mo30224s(".")) {
            mo30407c();
        } else if (this.f31966a.mo30232z() || this.f31966a.mo30225t("*|")) {
            mo30409e();
        } else if (this.f31966a.mo30225t("[")) {
            mo30406b();
        } else if (this.f31966a.mo30224s("*")) {
            mo30405a();
        } else if (this.f31966a.mo30224s(":lt(")) {
            mo30420p();
        } else if (this.f31966a.mo30224s(":gt(")) {
            mo30419o();
        } else if (this.f31966a.mo30224s(":eq(")) {
            mo30418n();
        } else if (this.f31966a.mo30225t(":has(")) {
            mo30417m();
        } else if (this.f31966a.mo30225t(":contains(")) {
            mo30413i(false);
        } else if (this.f31966a.mo30225t(":containsOwn(")) {
            mo30413i(true);
        } else if (this.f31966a.mo30225t(":containsData(")) {
            mo30414j();
        } else if (this.f31966a.mo30225t(":matches(")) {
            mo30421q(false);
        } else if (this.f31966a.mo30225t(":matchesOwn(")) {
            mo30421q(true);
        } else if (this.f31966a.mo30225t(":not(")) {
            mo30422r();
        } else if (this.f31966a.mo30224s(":nth-child(")) {
            mo30415k(false, false);
        } else if (this.f31966a.mo30224s(":nth-last-child(")) {
            mo30415k(true, false);
        } else if (this.f31966a.mo30224s(":nth-of-type(")) {
            mo30415k(false, true);
        } else if (this.f31966a.mo30224s(":nth-last-of-type(")) {
            mo30415k(true, true);
        } else if (this.f31966a.mo30224s(":first-child")) {
            this.f31968c.add(new C12918c.C12951v());
        } else if (this.f31966a.mo30224s(":last-child")) {
            this.f31968c.add(new C12918c.C12953x());
        } else if (this.f31966a.mo30224s(":first-of-type")) {
            this.f31968c.add(new C12918c.C12952w());
        } else if (this.f31966a.mo30224s(":last-of-type")) {
            this.f31968c.add(new C12918c.C12954y());
        } else if (this.f31966a.mo30224s(":only-child")) {
            this.f31968c.add(new C12918c.C12926d0());
        } else if (this.f31966a.mo30224s(":only-of-type")) {
            this.f31968c.add(new C12918c.C12928e0());
        } else if (this.f31966a.mo30224s(":empty")) {
            this.f31968c.add(new C12918c.C12950u());
        } else if (this.f31966a.mo30224s(":root")) {
            this.f31968c.add(new C12918c.C12930f0());
        } else if (this.f31966a.mo30224s(":matchText")) {
            this.f31968c.add(new C12918c.C12932g0());
        } else {
            throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f31967b, this.f31966a.mo30204B());
        }
    }

    /* renamed from: m */
    public final void mo30417m() {
        this.f31966a.mo30213h(":has");
        String d = this.f31966a.mo30209d('(', ')');
        C12750d.m55072i(d, ":has(selector) subselect must not be empty");
        this.f31968c.add(new C12959g.C12960a(m56231t(d)));
    }

    /* renamed from: n */
    public final void mo30418n() {
        this.f31968c.add(new C12918c.C12946q(mo30411g()));
    }

    /* renamed from: o */
    public final void mo30419o() {
        this.f31968c.add(new C12918c.C12948s(mo30411g()));
    }

    /* renamed from: p */
    public final void mo30420p() {
        this.f31968c.add(new C12918c.C12949t(mo30411g()));
    }

    /* renamed from: q */
    public final void mo30421q(boolean z) {
        String str;
        C12894g gVar = this.f31966a;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        gVar.mo30213h(str);
        String d = this.f31966a.mo30209d('(', ')');
        C12750d.m55072i(d, ":matches(regex) query must not be empty");
        if (z) {
            this.f31968c.add(new C12918c.C12936i0(Pattern.compile(d)));
        } else {
            this.f31968c.add(new C12918c.C12934h0(Pattern.compile(d)));
        }
    }

    /* renamed from: r */
    public final void mo30422r() {
        this.f31966a.mo30213h(":not");
        String d = this.f31966a.mo30209d('(', ')');
        C12750d.m55072i(d, ":not(selector) subselect must not be empty");
        this.f31968c.add(new C12959g.C12963d(m56231t(d)));
    }

    /* renamed from: s */
    public C12918c mo30423s() {
        this.f31966a.mo30221p();
        if (this.f31966a.mo30228v(f31961d)) {
            this.f31968c.add(new C12959g.C12966g());
            mo30410f(this.f31966a.mo30212g());
        } else {
            mo30416l();
        }
        while (!this.f31966a.mo30223r()) {
            boolean p = this.f31966a.mo30221p();
            if (this.f31966a.mo30228v(f31961d)) {
                mo30410f(this.f31966a.mo30212g());
            } else if (p) {
                mo30410f(' ');
            } else {
                mo30416l();
            }
        }
        if (this.f31968c.size() == 1) {
            return this.f31968c.get(0);
        }
        return new C12915b.C12916a((Collection<C12918c>) this.f31968c);
    }

    public String toString() {
        return this.f31967b;
    }
}
