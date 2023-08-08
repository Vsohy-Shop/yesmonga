package org.jsoup.nodes;

import com.google.firebase.messaging.C33168b1;
import javax.annotation.Nullable;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12891d;
import org.jsoup.parser.C12892e;

/* renamed from: org.jsoup.nodes.d */
public class C12773d extends C12778i {
    public C12773d(String str) {
        this.f31625e = str;
    }

    /* renamed from: L0 */
    public static boolean m55407L0(String str) {
        return str.length() > 1 && (str.startsWith(C33168b1.f80509d) || str.startsWith("?"));
    }

    /* renamed from: F */
    public /* bridge */ /* synthetic */ C12779j mo29699F() {
        return super.mo29699F();
    }

    @Nullable
    /* renamed from: G0 */
    public C12784n mo29889G0() {
        String I0 = mo29891I0();
        String substring = I0.substring(1, I0.length() - 1);
        if (m55407L0(substring)) {
            return null;
        }
        Document m = C12892e.m55927c().mo30185r(C12891d.f31854d).mo30181m("<" + substring + ">", mo29787n());
        if (m.mo29656g3().mo29752Y0().size() <= 0) {
            return null;
        }
        Element W0 = m.mo29656g3().mo29746W0(0);
        C12784n nVar = new C12784n(C12781k.m55546b(m).mo30184q().mo30171d(W0.mo29745V2()), I0.startsWith(C33168b1.f80509d));
        nVar.mo29784l().mo29843H(W0.mo29784l());
        return nVar;
    }

    /* renamed from: H0 */
    public C12773d clone() {
        return (C12773d) super.clone();
    }

    /* renamed from: I0 */
    public String mo29891I0() {
        return mo29913B0();
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ boolean mo29892J(String str) {
        return super.mo29892J(str);
    }

    /* renamed from: J0 */
    public boolean mo29893J0() {
        return m55407L0(mo29891I0());
    }

    /* renamed from: M0 */
    public C12773d mo29894M0(String str) {
        mo29914D0(str);
        return this;
    }

    /* renamed from: S */
    public String mo29651S() {
        return "#comment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        mo29921P(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (((org.jsoup.nodes.Element) r0).mo29742U2().mo30187c() != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5.mo29683n() != false) goto L_0x0024;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29751Y(java.lang.Appendable r3, int r4, org.jsoup.nodes.Document.OutputSettings r5) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r5.mo29686t()
            if (r0 == 0) goto L_0x0027
            int r0 = r2.mo29943v0()
            if (r0 != 0) goto L_0x001e
            org.jsoup.nodes.j r0 = r2.f31628a
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L_0x001e
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.f r0 = r0.mo29742U2()
            boolean r0 = r0.mo30187c()
            if (r0 != 0) goto L_0x0024
        L_0x001e:
            boolean r0 = r5.mo29683n()
            if (r0 == 0) goto L_0x0027
        L_0x0024:
            r2.mo29921P(r3, r4, r5)
        L_0x0027:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.mo29891I0()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.C12773d.mo29751Y(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
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
