package org.jsoup.parser;

import androidx.appcompat.view.C0543g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.design.components.widgets.C37254k1;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.events.C9175a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.C12361b;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12767b;
import org.jsoup.nodes.C12772c;
import org.jsoup.nodes.C12773d;
import org.jsoup.nodes.C12774e;
import org.jsoup.nodes.C12777h;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;

/* renamed from: org.jsoup.parser.b */
public class C12889b extends C12896i {

    /* renamed from: A */
    public static final String[] f31824A = {"ol", "ul"};

    /* renamed from: B */
    public static final String[] f31825B = {C9175a.f24945j0};

    /* renamed from: C */
    public static final String[] f31826C = {"html", "table"};

    /* renamed from: D */
    public static final String[] f31827D = {"optgroup", "option"};

    /* renamed from: E */
    public static final String[] f31828E = {C37254k1.f93426c, "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: F */
    public static final String[] f31829F = {"caption", "colgroup", C37254k1.f93426c, "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: G */
    public static final String[] f31830G = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", C9175a.f24945j0, "caption", C9168d0.f24881F0, "col", "colgroup", "command", C37254k1.f93426c, C23948c.f60118a, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", C9166d.f24877r0, "form", C16717v.C16718a.f42148L, "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", C28549i0.f69374H, "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", C0543g.f1415f, "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: H */
    public static final int f31831H = 100;

    /* renamed from: I */
    public static final int f31832I = 256;

    /* renamed from: J */
    public static final int f31833J = 12;

    /* renamed from: K */
    public static final /* synthetic */ boolean f31834K = false;

    /* renamed from: z */
    public static final String[] f31835z = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: l */
    public HtmlTreeBuilderState f31836l;

    /* renamed from: m */
    public HtmlTreeBuilderState f31837m;

    /* renamed from: n */
    public boolean f31838n;
    @Nullable

    /* renamed from: o */
    public Element f31839o;
    @Nullable

    /* renamed from: p */
    public C12777h f31840p;
    @Nullable

    /* renamed from: q */
    public Element f31841q;

    /* renamed from: r */
    public ArrayList<Element> f31842r;

    /* renamed from: s */
    public ArrayList<HtmlTreeBuilderState> f31843s;

    /* renamed from: t */
    public List<String> f31844t;

    /* renamed from: u */
    public Token.C12818g f31845u;

    /* renamed from: v */
    public boolean f31846v;

    /* renamed from: w */
    public boolean f31847w;

    /* renamed from: x */
    public boolean f31848x;

    /* renamed from: y */
    public String[] f31849y = {null};

    /* renamed from: s0 */
    public static boolean m55829s0(ArrayList<Element> arrayList, Element element) {
        int i;
        int size = arrayList.size() - 1;
        if (size >= 256) {
            i = size - 256;
        } else {
            i = 0;
        }
        while (size >= i) {
            if (arrayList.get(size) == element) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* renamed from: A */
    public void mo30076A(boolean z) {
        this.f31846v = z;
    }

    /* renamed from: A0 */
    public int mo30077A0(Element element) {
        for (int i = 0; i < this.f31842r.size(); i++) {
            if (element == this.f31842r.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public boolean mo30078B() {
        return this.f31846v;
    }

    /* renamed from: B0 */
    public boolean mo30079B0(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f31908g = token;
        return htmlTreeBuilderState.mo29955Z(token, this);
    }

    /* renamed from: C */
    public void mo30080C() {
        mo30084E(false);
    }

    /* renamed from: C0 */
    public void mo30081C0(Element element) {
        this.f31906e.add(element);
    }

    /* renamed from: D */
    public void mo30082D(String str) {
        while (C12759f.m55104d(mo30262a().mo29799r2(), f31828E)) {
            if (str == null || !mo30263b(str)) {
                mo30156v0();
            } else {
                return;
            }
        }
    }

    /* renamed from: D0 */
    public void mo30083D0(Element element) {
        mo30147r(element);
        this.f31842r.add(element);
    }

    /* renamed from: E */
    public void mo30084E(boolean z) {
        String[] strArr;
        if (z) {
            strArr = f31829F;
        } else {
            strArr = f31828E;
        }
        while (C12759f.m55104d(mo30262a().mo29799r2(), strArr)) {
            mo30156v0();
        }
    }

    /* renamed from: E0 */
    public void mo30085E0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f31843s.add(htmlTreeBuilderState);
    }

    /* renamed from: F */
    public Element mo30086F(String str) {
        for (int size = this.f31842r.size() - 1; size >= 0; size--) {
            Element element = this.f31842r.get(size);
            if (element == null) {
                return null;
            }
            if (element.mo29799r2().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* renamed from: F0 */
    public void mo30087F0(Element element, int i) {
        mo30147r(element);
        try {
            this.f31842r.add(i, element);
        } catch (IndexOutOfBoundsException unused) {
            this.f31842r.add(element);
        }
    }

    /* renamed from: G */
    public String mo30088G() {
        return this.f31907f;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: G0 */
    public void mo30089G0() {
        /*
            r7 = this;
            org.jsoup.nodes.Element r0 = r7.mo30140m0()
            if (r0 == 0) goto L_0x0061
            boolean r1 = r7.mo30151t0(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0061
        L_0x000d:
            java.util.ArrayList<org.jsoup.nodes.Element> r1 = r7.f31842r
            int r1 = r1.size()
            int r2 = r1 + -12
            r3 = 0
            if (r2 >= 0) goto L_0x0019
            r2 = r3
        L_0x0019:
            r4 = 1
            int r1 = r1 - r4
            r5 = r1
        L_0x001c:
            if (r5 != r2) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r7.f31842r
            int r5 = r5 + -1
            java.lang.Object r0 = r0.get(r5)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            if (r0 == 0) goto L_0x0031
            boolean r6 = r7.mo30151t0(r0)
            if (r6 == 0) goto L_0x001c
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003e
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r7.f31842r
            int r5 = r5 + 1
            java.lang.Object r0 = r0.get(r5)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
        L_0x003e:
            org.jsoup.helper.C12750d.m55073j(r0)
            java.lang.String r2 = r0.mo29799r2()
            org.jsoup.nodes.Element r2 = r7.mo30131g0(r2)
            int r4 = r0.mo29936m()
            if (r4 <= 0) goto L_0x005a
            org.jsoup.nodes.b r4 = r2.mo29784l()
            org.jsoup.nodes.b r6 = r0.mo29784l()
            r4.mo29843H(r6)
        L_0x005a:
            java.util.ArrayList<org.jsoup.nodes.Element> r4 = r7.f31842r
            r4.set(r5, r2)
            if (r5 != r1) goto L_0x0031
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12889b.mo30089G0():void");
    }

    /* renamed from: H */
    public Document mo30090H() {
        return this.f31905d;
    }

    /* renamed from: H0 */
    public void mo30091H0(Element element) {
        for (int size = this.f31842r.size() - 1; size >= 0; size--) {
            if (this.f31842r.get(size) == element) {
                this.f31842r.remove(size);
                return;
            }
        }
    }

    @Nullable
    /* renamed from: I */
    public C12777h mo30092I() {
        return this.f31840p;
    }

    /* renamed from: I0 */
    public boolean mo30093I0(Element element) {
        for (int size = this.f31906e.size() - 1; size >= 0; size--) {
            if (this.f31906e.get(size) == element) {
                this.f31906e.remove(size);
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: J */
    public Element mo30094J(String str) {
        int i;
        int size = this.f31906e.size() - 1;
        if (size >= 256) {
            i = size - 256;
        } else {
            i = 0;
        }
        while (size >= i) {
            Element element = this.f31906e.get(size);
            if (element.mo29799r2().equals(str)) {
                return element;
            }
            size--;
        }
        return null;
    }

    /* renamed from: J0 */
    public Element mo30095J0() {
        int size = this.f31842r.size();
        if (size > 0) {
            return this.f31842r.remove(size - 1);
        }
        return null;
    }

    /* renamed from: K */
    public Element mo30096K() {
        return this.f31839o;
    }

    /* renamed from: K0 */
    public void mo30097K0(Element element, Element element2) {
        mo30099L0(this.f31842r, element, element2);
    }

    /* renamed from: L */
    public List<String> mo30098L() {
        return this.f31844t;
    }

    /* renamed from: L0 */
    public final void mo30099L0(ArrayList<Element> arrayList, Element element, Element element2) {
        boolean z;
        int lastIndexOf = arrayList.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        arrayList.set(lastIndexOf, element2);
    }

    /* renamed from: M */
    public ArrayList<Element> mo30100M() {
        return this.f31906e;
    }

    /* renamed from: M0 */
    public void mo30101M0(Element element, Element element2) {
        mo30099L0(this.f31906e, element, element2);
    }

    /* renamed from: N */
    public boolean mo30102N(String str) {
        return mo30108Q(str, f31825B);
    }

    /* renamed from: N0 */
    public void mo30103N0() {
        int i;
        String str;
        HtmlTreeBuilderState htmlTreeBuilderState;
        int size = this.f31906e.size() - 1;
        if (size >= 256) {
            i = size - 256;
        } else {
            i = 0;
        }
        if (this.f31906e.size() == 0) {
            mo30115T0(HtmlTreeBuilderState.InBody);
        }
        boolean z = false;
        while (size >= i) {
            Element element = this.f31906e.get(size);
            if (size == i) {
                if (this.f31848x) {
                    element = this.f31841q;
                }
                z = true;
            }
            if (element != null) {
                str = element.mo29799r2();
            } else {
                str = "";
            }
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1644953643:
                    if (str.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1321546630:
                    if (str.equals(C9166d.f24876q0)) {
                        c = 1;
                        break;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        c = 2;
                        break;
                    }
                    break;
                case -636197633:
                    if (str.equals("colgroup")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3696:
                    if (str.equals("td")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3700:
                    if (str.equals("th")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3710:
                    if (str.equals("tr")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3029410:
                    if (str.equals("body")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3198432:
                    if (str.equals("head")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        c = 9;
                        break;
                    }
                    break;
                case 110115790:
                    if (str.equals("table")) {
                        c = 10;
                        break;
                    }
                    break;
                case 110157846:
                    if (str.equals("tbody")) {
                        c = 11;
                        break;
                    }
                    break;
                case 110277346:
                    if (str.equals("tfoot")) {
                        c = 12;
                        break;
                    }
                    break;
                case 110326868:
                    if (str.equals("thead")) {
                        c = 13;
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo30115T0(HtmlTreeBuilderState.InFrameset);
                    return;
                case 1:
                    HtmlTreeBuilderState y = mo30161y();
                    C12750d.m55074k(y, "Bug: no template insertion mode on stack!");
                    mo30115T0(y);
                    return;
                case 2:
                    mo30115T0(HtmlTreeBuilderState.InSelect);
                    return;
                case 3:
                    mo30115T0(HtmlTreeBuilderState.InColumnGroup);
                    return;
                case 4:
                case 5:
                    if (!z) {
                        mo30115T0(HtmlTreeBuilderState.InCell);
                        return;
                    }
                    break;
                case 6:
                    mo30115T0(HtmlTreeBuilderState.InRow);
                    return;
                case 7:
                    mo30115T0(HtmlTreeBuilderState.InBody);
                    return;
                case 8:
                    if (!z) {
                        mo30115T0(HtmlTreeBuilderState.InHead);
                        return;
                    }
                    break;
                case 9:
                    if (this.f31839o == null) {
                        htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHead;
                    } else {
                        htmlTreeBuilderState = HtmlTreeBuilderState.AfterHead;
                    }
                    mo30115T0(htmlTreeBuilderState);
                    return;
                case 10:
                    mo30115T0(HtmlTreeBuilderState.InTable);
                    return;
                case 11:
                case 12:
                case 13:
                    mo30115T0(HtmlTreeBuilderState.InTableBody);
                    return;
                case 14:
                    mo30115T0(HtmlTreeBuilderState.InCaption);
                    return;
            }
            if (z) {
                mo30115T0(HtmlTreeBuilderState.InBody);
                return;
            }
            size--;
        }
    }

    /* renamed from: O */
    public boolean mo30104O(String str) {
        return mo30108Q(str, f31824A);
    }

    /* renamed from: O0 */
    public void mo30105O0(C12777h hVar) {
        this.f31840p = hVar;
    }

    /* renamed from: P */
    public boolean mo30106P(String str) {
        return mo30108Q(str, (String[]) null);
    }

    /* renamed from: P0 */
    public void mo30107P0(boolean z) {
        this.f31847w = z;
    }

    /* renamed from: Q */
    public boolean mo30108Q(String str, String[] strArr) {
        return mo30114T(str, f31835z, strArr);
    }

    /* renamed from: Q0 */
    public void mo30109Q0(Element element) {
        this.f31839o = element;
    }

    /* renamed from: R */
    public boolean mo30110R(String[] strArr) {
        return mo30116U(strArr, f31835z, (String[]) null);
    }

    /* renamed from: R0 */
    public HtmlTreeBuilderState mo30111R0() {
        return this.f31836l;
    }

    /* renamed from: S */
    public boolean mo30112S(String str) {
        for (int size = this.f31906e.size() - 1; size >= 0; size--) {
            String r2 = this.f31906e.get(size).mo29799r2();
            if (r2.equals(str)) {
                return true;
            }
            if (!C12759f.m55104d(r2, f31827D)) {
                return false;
            }
        }
        C12750d.m55064a("Should not be reachable");
        return false;
    }

    /* renamed from: S0 */
    public int mo30113S0() {
        return this.f31843s.size();
    }

    /* renamed from: T */
    public final boolean mo30114T(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f31849y;
        strArr3[0] = str;
        return mo30116U(strArr3, strArr, strArr2);
    }

    /* renamed from: T0 */
    public void mo30115T0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f31836l = htmlTreeBuilderState;
    }

    /* renamed from: U */
    public final boolean mo30116U(String[] strArr, String[] strArr2, String[] strArr3) {
        int i;
        int size = this.f31906e.size() - 1;
        if (size > 100) {
            i = size - 100;
        } else {
            i = 0;
        }
        while (size >= i) {
            String r2 = this.f31906e.get(size).mo29799r2();
            if (C12759f.m55104d(r2, strArr)) {
                return true;
            }
            if (C12759f.m55104d(r2, strArr2)) {
                return false;
            }
            if (strArr3 != null && C12759f.m55104d(r2, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: V */
    public boolean mo30117V(String str) {
        return mo30114T(str, f31826C, (String[]) null);
    }

    /* renamed from: W */
    public Element mo30118W(Token.C12819h hVar) {
        if (hVar.mo30008B() && !hVar.f31730l.isEmpty() && hVar.f31730l.mo29862m0(this.f31909h) > 0) {
            mo30265e("Dropped duplicate attribute(s) in tag [%s]", hVar.f31721c);
        }
        if (hVar.mo30009C()) {
            Element a0 = mo30122a0(hVar);
            this.f31906e.add(a0);
            this.f31904c.mo30234B(TokeniserState.Data);
            this.f31904c.mo30250o(this.f31845u.mo29987m().mo30011E(a0.mo29745V2()));
            return a0;
        }
        Element element = new Element(mo30270p(hVar.mo30010D(), this.f31909h), (String) null, this.f31909h.mo30170c(hVar.f31730l));
        mo30119X(element);
        return element;
    }

    /* renamed from: X */
    public void mo30119X(Element element) {
        mo30127e0(element);
        this.f31906e.add(element);
    }

    /* renamed from: Y */
    public void mo30120Y(Token.C12814c cVar) {
        C12779j jVar;
        Element a = mo30262a();
        String r2 = a.mo29799r2();
        String q = cVar.mo29991q();
        if (cVar.mo29980f()) {
            jVar = new C12772c(q);
        } else if (mo30130g(r2)) {
            jVar = new C12774e(q);
        } else {
            jVar = new C12783m(q);
        }
        a.mo29713J0(jVar);
    }

    /* renamed from: Z */
    public void mo30121Z(Token.C12815d dVar) {
        mo30127e0(new C12773d(dVar.mo29995s()));
    }

    /* renamed from: a0 */
    public Element mo30122a0(Token.C12819h hVar) {
        C12893f p = mo30270p(hVar.mo30010D(), this.f31909h);
        Element element = new Element(p, (String) null, this.f31909h.mo30170c(hVar.f31730l));
        mo30127e0(element);
        if (hVar.mo30009C()) {
            if (!p.mo30197l()) {
                p.mo30202u();
            } else if (!p.mo30192h()) {
                this.f31904c.mo30258w("Tag [%s] cannot be self closing; not a void tag", p.mo30199o());
            }
        }
        return element;
    }

    /* renamed from: b0 */
    public C12777h mo30123b0(Token.C12819h hVar, boolean z, boolean z2) {
        C12777h hVar2 = new C12777h(mo30270p(hVar.mo30010D(), this.f31909h), (String) null, this.f31909h.mo30170c(hVar.f31730l));
        if (!z2) {
            mo30105O0(hVar2);
        } else if (!mo30148r0(C9166d.f24876q0)) {
            mo30105O0(hVar2);
        }
        mo30127e0(hVar2);
        if (z) {
            this.f31906e.add(hVar2);
        }
        return hVar2;
    }

    /* renamed from: c */
    public C12891d mo30124c() {
        return C12891d.f31853c;
    }

    /* renamed from: c0 */
    public void mo30125c0(C12779j jVar) {
        Element element;
        Element J = mo30094J("table");
        boolean z = false;
        if (J == null) {
            element = this.f31906e.get(0);
        } else if (J.mo29760b0() != null) {
            element = J.mo29760b0();
            z = true;
        } else {
            element = mo30145q(J);
        }
        if (z) {
            C12750d.m55073j(J);
            J.mo29800s(jVar);
            return;
        }
        element.mo29713J0(jVar);
    }

    /* renamed from: d0 */
    public void mo30126d0() {
        this.f31842r.add((Object) null);
    }

    /* renamed from: e0 */
    public final void mo30127e0(C12779j jVar) {
        C12777h hVar;
        if (this.f31906e.isEmpty()) {
            this.f31905d.mo29713J0(jVar);
        } else if (!mo30133h0() || !C12759f.m55104d(mo30262a().mo29799r2(), HtmlTreeBuilderState.C12811b.f31663C)) {
            mo30262a().mo29713J0(jVar);
        } else {
            mo30125c0(jVar);
        }
        if (jVar instanceof Element) {
            Element element = (Element) jVar;
            if (element.mo29742U2().mo30194i() && (hVar = this.f31840p) != null) {
                hVar.mo29907g3(element);
            }
        }
    }

    @ParametersAreNonnullByDefault
    /* renamed from: f */
    public void mo30128f(Reader reader, String str, C12892e eVar) {
        super.mo30128f(reader, str, eVar);
        this.f31836l = HtmlTreeBuilderState.Initial;
        this.f31837m = null;
        this.f31838n = false;
        this.f31839o = null;
        this.f31840p = null;
        this.f31841q = null;
        this.f31842r = new ArrayList<>();
        this.f31843s = new ArrayList<>();
        this.f31844t = new ArrayList();
        this.f31845u = new Token.C12818g();
        this.f31846v = true;
        this.f31847w = false;
        this.f31848x = false;
    }

    /* renamed from: f0 */
    public void mo30129f0(Element element, Element element2) {
        boolean z;
        int lastIndexOf = this.f31906e.lastIndexOf(element);
        if (lastIndexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        this.f31906e.add(lastIndexOf + 1, element2);
    }

    /* renamed from: g */
    public boolean mo30130g(String str) {
        if (str.equals("script") || str.equals("style")) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public Element mo30131g0(String str) {
        Element element = new Element(mo30270p(str, this.f31909h), (String) null);
        mo30119X(element);
        return element;
    }

    /* renamed from: h0 */
    public boolean mo30133h0() {
        return this.f31847w;
    }

    /* renamed from: i0 */
    public boolean mo30134i0() {
        return this.f31848x;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r0.equals("iframe") == false) goto L_0x0035;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<org.jsoup.nodes.C12779j> mo30135j(java.lang.String r3, @javax.annotation.Nullable org.jsoup.nodes.Element r4, java.lang.String r5, org.jsoup.parser.C12892e r6) {
        /*
            r2 = this;
            org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.Initial
            r2.f31836l = r0
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r3)
            r2.mo30128f(r0, r5, r6)
            r2.f31841q = r4
            r3 = 1
            r2.f31848x = r3
            r6 = -1
            if (r4 == 0) goto L_0x011b
            org.jsoup.nodes.Document r0 = r4.mo29924a0()
            if (r0 == 0) goto L_0x0027
            org.jsoup.nodes.Document r0 = r2.f31905d
            org.jsoup.nodes.Document r1 = r4.mo29924a0()
            org.jsoup.nodes.Document$QuirksMode r1 = r1.mo29645D3()
            r0.mo29646E3(r1)
        L_0x0027:
            java.lang.String r0 = r4.mo29799r2()
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1321546630: goto L_0x00a9;
                case -1191214428: goto L_0x00a0;
                case -1003243718: goto L_0x0095;
                case -907685685: goto L_0x008a;
                case 118807: goto L_0x007f;
                case 109780401: goto L_0x0074;
                case 110371416: goto L_0x0069;
                case 1192721831: goto L_0x005e;
                case 1551550924: goto L_0x0052;
                case 1973234167: goto L_0x0045;
                case 2115613112: goto L_0x0038;
                default: goto L_0x0035;
            }
        L_0x0035:
            r3 = r6
            goto L_0x00b3
        L_0x0038:
            java.lang.String r3 = "noembed"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0041
            goto L_0x0035
        L_0x0041:
            r3 = 10
            goto L_0x00b3
        L_0x0045:
            java.lang.String r3 = "plaintext"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x004e
            goto L_0x0035
        L_0x004e:
            r3 = 9
            goto L_0x00b3
        L_0x0052:
            java.lang.String r3 = "noscript"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x005b
            goto L_0x0035
        L_0x005b:
            r3 = 8
            goto L_0x00b3
        L_0x005e:
            java.lang.String r3 = "noframes"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0067
            goto L_0x0035
        L_0x0067:
            r3 = 7
            goto L_0x00b3
        L_0x0069:
            java.lang.String r3 = "title"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0072
            goto L_0x0035
        L_0x0072:
            r3 = 6
            goto L_0x00b3
        L_0x0074:
            java.lang.String r3 = "style"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x007d
            goto L_0x0035
        L_0x007d:
            r3 = 5
            goto L_0x00b3
        L_0x007f:
            java.lang.String r3 = "xml"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0088
            goto L_0x0035
        L_0x0088:
            r3 = 4
            goto L_0x00b3
        L_0x008a:
            java.lang.String r3 = "script"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0093
            goto L_0x0035
        L_0x0093:
            r3 = 3
            goto L_0x00b3
        L_0x0095:
            java.lang.String r3 = "textarea"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x009e
            goto L_0x0035
        L_0x009e:
            r3 = 2
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r1 = "iframe"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00b3
            goto L_0x0035
        L_0x00a9:
            java.lang.String r3 = "template"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00b2
            goto L_0x0035
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            switch(r3) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00de;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00de;
                case 5: goto L_0x00de;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00de;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00be;
                case 10: goto L_0x00de;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.Data
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00be:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.PLAINTEXT
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00c6:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.Data
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00ce:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.ScriptData
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00d6:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.Rcdata
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00de:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.Rawtext
            r3.mo30234B(r1)
            goto L_0x00f2
        L_0x00e6:
            org.jsoup.parser.h r3 = r2.f31904c
            org.jsoup.parser.TokeniserState r1 = org.jsoup.parser.TokeniserState.Data
            r3.mo30234B(r1)
            org.jsoup.parser.HtmlTreeBuilderState r3 = org.jsoup.parser.HtmlTreeBuilderState.InTemplate
            r2.mo30085E0(r3)
        L_0x00f2:
            org.jsoup.nodes.Element r3 = new org.jsoup.nodes.Element
            org.jsoup.parser.d r1 = r2.f31909h
            org.jsoup.parser.f r0 = r2.mo30270p(r0, r1)
            r3.<init>(r0, r5)
            org.jsoup.nodes.Document r5 = r2.f31905d
            r5.mo29713J0(r3)
            java.util.ArrayList<org.jsoup.nodes.Element> r5 = r2.f31906e
            r5.add(r3)
            r2.mo30103N0()
            r5 = r4
        L_0x010b:
            if (r5 == 0) goto L_0x011c
            boolean r0 = r5 instanceof org.jsoup.nodes.C12777h
            if (r0 == 0) goto L_0x0116
            org.jsoup.nodes.h r5 = (org.jsoup.nodes.C12777h) r5
            r2.f31840p = r5
            goto L_0x011c
        L_0x0116:
            org.jsoup.nodes.Element r5 = r5.mo29760b0()
            goto L_0x010b
        L_0x011b:
            r3 = 0
        L_0x011c:
            r2.mo30269o()
            if (r4 == 0) goto L_0x0133
            java.util.List r4 = r3.mo29944w0()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x012e
            r3.mo29766d2(r6, r4)
        L_0x012e:
            java.util.List r3 = r3.mo29942v()
            return r3
        L_0x0133:
            org.jsoup.nodes.Document r3 = r2.f31905d
            java.util.List r3 = r3.mo29942v()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12889b.mo30135j(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.e):java.util.List");
    }

    /* renamed from: j0 */
    public boolean mo30136j0(Element element) {
        return m55829s0(this.f31842r, element);
    }

    /* renamed from: k */
    public boolean mo30137k(Token token) {
        this.f31908g = token;
        return this.f31836l.mo29955Z(token, this);
    }

    /* renamed from: k0 */
    public final boolean mo30138k0(Element element, Element element2) {
        if (!element.mo29799r2().equals(element2.mo29799r2()) || !element.mo29784l().equals(element2.mo29784l())) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public boolean mo30139l0(Element element) {
        return C12759f.m55104d(element.mo29799r2(), f31830G);
    }

    /* renamed from: m0 */
    public Element mo30140m0() {
        if (this.f31842r.size() <= 0) {
            return null;
        }
        ArrayList<Element> arrayList = this.f31842r;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo30141n(String str, C12767b bVar) {
        return super.mo30141n(str, bVar);
    }

    /* renamed from: n0 */
    public void mo30142n0() {
        this.f31837m = this.f31836l;
    }

    /* renamed from: o0 */
    public void mo30143o0(Element element) {
        if (!this.f31838n) {
            String b = element.mo29895b("href");
            if (b.length() != 0) {
                this.f31907f = b;
                this.f31838n = true;
                this.f31905d.mo29938q0(b);
            }
        }
    }

    /* renamed from: p0 */
    public C12889b mo30132h() {
        return new C12889b();
    }

    @Nullable
    /* renamed from: q */
    public Element mo30145q(Element element) {
        for (int size = this.f31906e.size() - 1; size >= 0; size--) {
            if (this.f31906e.get(size) == element) {
                return this.f31906e.get(size - 1);
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public void mo30146q0() {
        this.f31844t = new ArrayList();
    }

    /* renamed from: r */
    public void mo30147r(Element element) {
        int size = this.f31842r.size() - 1;
        int i = 0;
        while (size >= 0) {
            Element element2 = this.f31842r.get(size);
            if (element2 != null) {
                if (mo30138k0(element, element2)) {
                    i++;
                }
                if (i == 3) {
                    this.f31842r.remove(size);
                    return;
                }
                size--;
            } else {
                return;
            }
        }
    }

    /* renamed from: r0 */
    public boolean mo30148r0(String str) {
        return mo30094J(str) != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30149s() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r1.f31842r
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.Element r0 = r1.mo30095J0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12889b.mo30149s():void");
    }

    /* renamed from: t */
    public final void mo30150t(String... strArr) {
        int size = this.f31906e.size() - 1;
        while (size >= 0) {
            Element element = this.f31906e.get(size);
            if (!C12759f.m55103c(element.mo29799r2(), strArr) && !element.mo29799r2().equals("html")) {
                this.f31906e.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    /* renamed from: t0 */
    public boolean mo30151t0(Element element) {
        return m55829s0(this.f31906e, element);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f31908g + ", state=" + this.f31836l + ", currentElement=" + mo30262a() + C12361b.f30259j;
    }

    /* renamed from: u */
    public void mo30153u() {
        mo30150t("tbody", "tfoot", "thead", C9166d.f24876q0);
    }

    /* renamed from: u0 */
    public HtmlTreeBuilderState mo30154u0() {
        return this.f31837m;
    }

    /* renamed from: v */
    public void mo30155v() {
        mo30150t("table", C9166d.f24876q0);
    }

    /* renamed from: v0 */
    public Element mo30156v0() {
        return this.f31906e.remove(this.f31906e.size() - 1);
    }

    /* renamed from: w */
    public void mo30157w() {
        mo30150t("tr", C9166d.f24876q0);
    }

    /* renamed from: w0 */
    public void mo30158w0(String str) {
        int size = this.f31906e.size() - 1;
        while (size >= 0 && !this.f31906e.get(size).mo29799r2().equals(str)) {
            this.f31906e.remove(size);
            size--;
        }
    }

    /* renamed from: x */
    public void mo30159x(String str) {
        mo30082D(str);
        if (!str.equals(mo30262a().mo29799r2())) {
            mo30163z(mo30111R0());
        }
        mo30160x0(str);
    }

    @Nullable
    /* renamed from: x0 */
    public Element mo30160x0(String str) {
        for (int size = this.f31906e.size() - 1; size >= 0; size--) {
            Element element = this.f31906e.get(size);
            this.f31906e.remove(size);
            if (element.mo29799r2().equals(str)) {
                return element;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: y */
    public HtmlTreeBuilderState mo30161y() {
        if (this.f31843s.size() <= 0) {
            return null;
        }
        ArrayList<HtmlTreeBuilderState> arrayList = this.f31843s;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: y0 */
    public void mo30162y0(String... strArr) {
        int size = this.f31906e.size() - 1;
        while (size >= 0) {
            this.f31906e.remove(size);
            if (!C12759f.m55104d(this.f31906e.get(size).mo29799r2(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public void mo30163z(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.f31902a.mo30174a().mo29973e()) {
            this.f31902a.mo30174a().add(new C12890c(this.f31903b, "Unexpected %s token [%s] when in state [%s]", this.f31908g.mo29988o(), this.f31908g, htmlTreeBuilderState));
        }
    }

    @Nullable
    /* renamed from: z0 */
    public HtmlTreeBuilderState mo30164z0() {
        if (this.f31843s.size() <= 0) {
            return null;
        }
        ArrayList<HtmlTreeBuilderState> arrayList = this.f31843s;
        return arrayList.remove(arrayList.size() - 1);
    }
}
