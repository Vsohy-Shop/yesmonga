package org.jsoup.nodes;

import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.nodes.m */
public class C12783m extends C12778i {
    public C12783m(String str) {
        this.f31625e = str;
    }

    /* renamed from: H0 */
    public static C12783m m55550H0(String str) {
        return new C12783m(Entities.m55331l(str));
    }

    /* renamed from: L0 */
    public static boolean m55551L0(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    /* renamed from: M0 */
    public static String m55552M0(String str) {
        return C12759f.m55114n(str);
    }

    /* renamed from: P0 */
    public static String m55553P0(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    /* renamed from: F */
    public /* bridge */ /* synthetic */ C12779j mo29699F() {
        return super.mo29699F();
    }

    /* renamed from: G0 */
    public C12783m clone() {
        return (C12783m) super.clone();
    }

    /* renamed from: I0 */
    public String mo29947I0() {
        return mo29913B0();
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ boolean mo29892J(String str) {
        return super.mo29892J(str);
    }

    /* renamed from: J0 */
    public boolean mo29948J0() {
        return C12759f.m55107g(mo29913B0());
    }

    /* renamed from: O0 */
    public C12783m mo29949O0(int i) {
        boolean z;
        boolean z2;
        String B0 = mo29913B0();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "Split offset must be not be negative");
        if (i < B0.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C12750d.m55068e(z2, "Split offset must not be greater than current text length");
        String substring = B0.substring(0, i);
        String substring2 = B0.substring(i);
        mo29950R0(substring);
        C12783m mVar = new C12783m(substring2);
        if (mo29760b0() != null) {
            mo29760b0().mo29925c(mo29943v0() + 1, mVar);
        }
        return mVar;
    }

    /* renamed from: Q0 */
    public String mo29887Q0() {
        return C12759f.m55114n(mo29947I0());
    }

    /* renamed from: R0 */
    public C12783m mo29950R0(String str) {
        mo29914D0(str);
        return this;
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#text";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (mo29948J0() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        mo29921P(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (mo29948J0() == false) goto L_0x003a;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29751Y(java.lang.Appendable r10, int r11, org.jsoup.nodes.Document.OutputSettings r12) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r12.mo29686t()
            if (r0 == 0) goto L_0x003d
            int r1 = r9.mo29943v0()
            if (r1 != 0) goto L_0x0024
            org.jsoup.nodes.j r1 = r9.f31628a
            boolean r2 = r1 instanceof org.jsoup.nodes.Element
            if (r2 == 0) goto L_0x0024
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            org.jsoup.parser.f r1 = r1.mo29742U2()
            boolean r1 = r1.mo30187c()
            if (r1 == 0) goto L_0x0024
            boolean r1 = r9.mo29948J0()
            if (r1 == 0) goto L_0x003a
        L_0x0024:
            boolean r1 = r12.mo29683n()
            if (r1 == 0) goto L_0x003d
            java.util.List r1 = r9.mo29944w0()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x003d
            boolean r1 = r9.mo29948J0()
            if (r1 != 0) goto L_0x003d
        L_0x003a:
            r9.mo29921P(r10, r11, r12)
        L_0x003d:
            r11 = 1
            r1 = 0
            if (r0 == 0) goto L_0x004b
            org.jsoup.nodes.j r2 = r9.f31628a
            boolean r2 = org.jsoup.nodes.Element.m55173C2(r2)
            if (r2 != 0) goto L_0x004b
            r7 = r11
            goto L_0x004c
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r0 == 0) goto L_0x0056
            org.jsoup.nodes.j r0 = r9.f31628a
            boolean r0 = r0 instanceof org.jsoup.nodes.Document
            if (r0 == 0) goto L_0x0056
            r8 = r11
            goto L_0x0057
        L_0x0056:
            r8 = r1
        L_0x0057:
            java.lang.String r4 = r9.mo29913B0()
            r6 = 0
            r3 = r10
            r5 = r12
            org.jsoup.nodes.Entities.m55326g(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.C12783m.mo29751Y(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    /* renamed from: Z */
    public void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo29895b(String str) {
        return super.mo29895b(str);
    }

    /* renamed from: i0 */
    public /* bridge */ /* synthetic */ C12779j mo29778i0(String str) {
        return super.mo29778i0(str);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ String mo29896j(String str) {
        return super.mo29896j(str);
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ C12779j mo29782k(String str, String str2) {
        return super.mo29782k(str, str2);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ String mo29787n() {
        return super.mo29787n();
    }

    public String toString() {
        return mo29652U();
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ int mo29805u() {
        return super.mo29805u();
    }
}
