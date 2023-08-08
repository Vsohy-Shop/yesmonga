package org.jsoup.nodes;

import com.urbanairship.actions.C35491d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.Nullable;
import kotlin.text.C11626x;
import org.jsoup.helper.C12750d;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.internal.C12756c;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12893f;
import org.jsoup.select.C12912a;
import org.jsoup.select.C12918c;
import org.jsoup.select.C12956d;
import org.jsoup.select.C12957e;
import org.jsoup.select.C12958f;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.Selector;

@C12756c
public class Element extends C12779j {

    /* renamed from: w */
    public static final List<Element> f31565w = Collections.emptyList();

    /* renamed from: x */
    public static final Pattern f31566x = Pattern.compile("\\s+");

    /* renamed from: y */
    public static final String f31567y = C12767b.m55363G0("baseUri");

    /* renamed from: e */
    public C12893f f31568e;
    @Nullable

    /* renamed from: f */
    public WeakReference<List<Element>> f31569f;

    /* renamed from: g */
    public List<C12779j> f31570g;
    @Nullable

    /* renamed from: v */
    public C12767b f31571v;

    public static final class NodeList extends ChangeNotifyingArrayList<C12779j> {
        private final Element owner;

        public NodeList(Element element, int i) {
            super(i);
            this.owner = element;
        }

        /* renamed from: e */
        public void mo29596e() {
            this.owner.mo29737T();
        }
    }

    /* renamed from: org.jsoup.nodes.Element$a */
    public class C12763a implements C12957e {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f31572a;

        public C12763a(StringBuilder sb) {
            this.f31572a = sb;
        }

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
            if ((jVar instanceof Element) && ((Element) jVar).mo29780i2() && (jVar.mo29922R() instanceof C12783m) && !C12783m.m55551L0(this.f31572a)) {
                this.f31572a.append(' ');
            }
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            if (jVar instanceof C12783m) {
                Element.m55177O0(this.f31572a, (C12783m) jVar);
            } else if (jVar instanceof Element) {
                Element element = (Element) jVar;
                if (this.f31572a.length() <= 0) {
                    return;
                }
                if ((element.mo29780i2() || element.f31568e.mo30199o().equals("br")) && !C12783m.m55551L0(this.f31572a)) {
                    this.f31572a.append(' ');
                }
            }
        }
    }

    /* renamed from: org.jsoup.nodes.Element$b */
    public class C12764b implements C12957e {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f31574a;

        public C12764b(StringBuilder sb) {
            this.f31574a = sb;
        }

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            if (jVar instanceof C12783m) {
                this.f31574a.append(((C12783m) jVar).mo29947I0());
            }
        }
    }

    public Element(String str) {
        this(C12893f.m55949v(str), "", (C12767b) null);
    }

    /* renamed from: C2 */
    public static boolean m55173C2(@Nullable C12779j jVar) {
        if (jVar instanceof Element) {
            Element element = (Element) jVar;
            int i = 0;
            while (!element.f31568e.mo30200s()) {
                element = element.mo29760b0();
                i++;
                if (i < 6) {
                    if (element == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    public static void m55175E0(Element element, Elements elements) {
        Element u2 = element.mo29760b0();
        if (u2 != null && !u2.mo29745V2().equals("#root")) {
            elements.add(u2);
            m55175E0(u2, elements);
        }
    }

    /* renamed from: J2 */
    public static String m55176J2(Element element, String str) {
        while (element != null) {
            C12767b bVar = element.f31571v;
            if (bVar != null && bVar.mo29869v0(str)) {
                return element.f31571v.mo29863o0(str);
            }
            element = element.mo29760b0();
        }
        return "";
    }

    /* renamed from: O0 */
    public static void m55177O0(StringBuilder sb, C12783m mVar) {
        String I0 = mVar.mo29947I0();
        if (m55173C2(mVar.f31628a) || (mVar instanceof C12772c)) {
            sb.append(I0);
        } else {
            C12759f.m55101a(sb, I0, C12783m.m55551L0(sb));
        }
    }

    /* renamed from: R0 */
    public static void m55178R0(Element element, StringBuilder sb) {
        if (element.f31568e.mo30199o().equals("br") && !C12783m.m55551L0(sb)) {
            sb.append(" ");
        }
    }

    /* renamed from: b2 */
    public static <E extends Element> int m55179b2(Element element, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: A2 */
    public Element mo29689A2(String str) {
        Element element = new Element(C12893f.m55950x(str, C12781k.m55546b(this).mo30184q()), mo29787n());
        mo29815x2(element);
        return element;
    }

    /* renamed from: B1 */
    public Elements mo29691B1(String str, Pattern pattern) {
        return C12912a.m56172a(new C12918c.C12933h(str, pattern), this);
    }

    /* renamed from: B2 */
    public Element mo29692B2(String str) {
        C12750d.m55073j(str);
        mo29815x2(new C12783m(str));
        return this;
    }

    /* renamed from: C1 */
    public Elements mo29693C1(String str, String str2) {
        return C12912a.m56172a(new C12918c.C12935i(str, str2), this);
    }

    /* renamed from: D1 */
    public Elements mo29695D1(String str, String str2) {
        return C12912a.m56172a(new C12918c.C12937j(str, str2), this);
    }

    /* renamed from: E */
    public void mo29696E(String str) {
        mo29784l().mo29846J0(f31567y, str);
    }

    /* renamed from: E1 */
    public Elements mo29697E1(String str) {
        C12750d.m55071h(str);
        return C12912a.m56172a(new C12918c.C12939k(str), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = mo29808u2().mo29749X0();
     */
    @javax.annotation.Nullable
    /* renamed from: E2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.nodes.Element mo29698E2() {
        /*
            r3 = this;
            org.jsoup.nodes.j r0 = r3.f31628a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            org.jsoup.nodes.Element r0 = r3.mo29760b0()
            java.util.List r0 = r0.mo29749X0()
            int r2 = m55179b2(r3, r0)
            if (r2 <= 0) goto L_0x001d
            int r2 = r2 + -1
            java.lang.Object r0 = r0.get(r2)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            return r0
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.mo29698E2():org.jsoup.nodes.Element");
    }

    /* renamed from: F0 */
    public Element mo29700F0(String str) {
        C12750d.m55073j(str);
        Set<String> b1 = mo29761b1();
        b1.add(str);
        mo29763c1(b1);
        return this;
    }

    /* renamed from: F1 */
    public Elements mo29701F1(int i) {
        return C12912a.m56172a(new C12918c.C12946q(i), this);
    }

    /* renamed from: F2 */
    public Elements mo29702F2() {
        return mo29797q2(false);
    }

    /* renamed from: G */
    public List<C12779j> mo29703G() {
        if (this.f31570g == C12779j.f31626c) {
            this.f31570g = new NodeList(this, 4);
        }
        return this.f31570g;
    }

    /* renamed from: G0 */
    public Element mo29774h(String str) {
        return (Element) super.mo29774h(str);
    }

    /* renamed from: G2 */
    public Element mo29778i0(String str) {
        return (Element) super.mo29778i0(str);
    }

    /* renamed from: H0 */
    public Element mo29777i(C12779j jVar) {
        return (Element) super.mo29777i(jVar);
    }

    /* renamed from: H1 */
    public Elements mo29708H1(int i) {
        return C12912a.m56172a(new C12918c.C12948s(i), this);
    }

    /* renamed from: H2 */
    public Element mo29709H2(String str) {
        C12750d.m55073j(str);
        Set<String> b1 = mo29761b1();
        b1.remove(str);
        mo29763c1(b1);
        return this;
    }

    /* renamed from: I0 */
    public Element mo29710I0(String str) {
        C12750d.m55073j(str);
        mo29928e((C12779j[]) C12781k.m55546b(this).mo30179k(str, this, mo29787n()).toArray(new C12779j[0]));
        return this;
    }

    /* renamed from: I1 */
    public Elements mo29711I1(int i) {
        return C12912a.m56172a(new C12918c.C12949t(i), this);
    }

    /* renamed from: I2 */
    public Element mo29791o0() {
        return (Element) super.mo29791o0();
    }

    /* renamed from: J0 */
    public Element mo29713J0(C12779j jVar) {
        C12750d.m55073j(jVar);
        mo29934k0(jVar);
        mo29703G();
        this.f31570g.add(jVar);
        jVar.mo29940s0(this.f31570g.size() - 1);
        return this;
    }

    /* renamed from: J1 */
    public Elements mo29714J1(String str) {
        C12750d.m55071h(str);
        return C12912a.m56172a(new C12918c.C12938j0(C12757d.m55099b(str)), this);
    }

    /* renamed from: K */
    public boolean mo29715K() {
        return this.f31571v != null;
    }

    /* renamed from: K1 */
    public Elements mo29716K1(String str) {
        return C12912a.m56172a(new C12918c.C12942m(str), this);
    }

    /* renamed from: K2 */
    public Elements mo29717K2(String str) {
        return Selector.m56169c(str, this);
    }

    /* renamed from: L0 */
    public Element mo29718L0(Collection<? extends C12779j> collection) {
        mo29766d2(-1, collection);
        return this;
    }

    /* renamed from: L2 */
    public Elements mo29719L2(C12918c cVar) {
        return Selector.m56170d(cVar, this);
    }

    /* renamed from: M0 */
    public Element mo29720M0(String str) {
        Element element = new Element(C12893f.m55950x(str, C12781k.m55546b(this).mo30184q()), mo29787n());
        mo29713J0(element);
        return element;
    }

    /* renamed from: N1 */
    public Elements mo29721N1(String str) {
        return C12912a.m56172a(new C12918c.C12943n(str), this);
    }

    @Nullable
    /* renamed from: N2 */
    public Element mo29722N2(String str) {
        return Selector.m56171e(str, this);
    }

    /* renamed from: O */
    public <T extends Appendable> T mo29723O(T t) {
        int size = this.f31570g.size();
        for (int i = 0; i < size; i++) {
            this.f31570g.get(i).mo29923V(t);
        }
        return t;
    }

    /* renamed from: O1 */
    public Elements mo29724O1(String str) {
        try {
            return mo29727P1(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    @Nullable
    /* renamed from: O2 */
    public Element mo29725O2(C12918c cVar) {
        return C12912a.m56173b(cVar, this);
    }

    /* renamed from: P0 */
    public Element mo29726P0(String str) {
        C12750d.m55073j(str);
        mo29713J0(new C12783m(str));
        return this;
    }

    /* renamed from: P1 */
    public Elements mo29727P1(Pattern pattern) {
        return C12912a.m56172a(new C12918c.C12936i0(pattern), this);
    }

    /* renamed from: P2 */
    public <T extends C12779j> List<T> mo29728P2(String str, Class<T> cls) {
        return C12781k.m55547c(str, this, cls);
    }

    /* renamed from: Q0 */
    public Element mo29729Q0(Element element) {
        C12750d.m55073j(element);
        element.mo29713J0(this);
        return this;
    }

    /* renamed from: Q1 */
    public Elements mo29730Q1(String str) {
        try {
            return mo29732R1(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    /* renamed from: Q2 */
    public Elements mo29731Q2(String str) {
        return new Elements(C12781k.m55547c(str, this, Element.class));
    }

    /* renamed from: R1 */
    public Elements mo29732R1(Pattern pattern) {
        return C12912a.m56172a(new C12918c.C12934h0(pattern), this);
    }

    /* renamed from: R2 */
    public Element mo29806u0() {
        C12893f fVar = this.f31568e;
        String n = mo29787n();
        C12767b bVar = this.f31571v;
        return new Element(fVar, n, bVar == null ? null : bVar.clone());
    }

    /* renamed from: S */
    public String mo29651S() {
        return this.f31568e.mo30189e();
    }

    /* renamed from: S0 */
    public Element mo29782k(String str, String str2) {
        super.mo29782k(str, str2);
        return this;
    }

    /* renamed from: S1 */
    public boolean mo29735S1() {
        return this.f31570g != C12779j.f31626c;
    }

    /* renamed from: S2 */
    public Elements mo29736S2() {
        if (this.f31628a == null) {
            return new Elements(0);
        }
        List<Element> X0 = mo29760b0().mo29749X0();
        Elements elements = new Elements(X0.size() - 1);
        for (Element next : X0) {
            if (next != this) {
                elements.add(next);
            }
        }
        return elements;
    }

    /* renamed from: T */
    public void mo29737T() {
        super.mo29737T();
        this.f31569f = null;
    }

    /* renamed from: T0 */
    public Element mo29738T0(String str, boolean z) {
        mo29784l().mo29847L0(str, z);
        return this;
    }

    /* renamed from: T1 */
    public boolean mo29739T1(String str) {
        C12767b bVar = this.f31571v;
        if (bVar == null) {
            return false;
        }
        String r0 = bVar.mo29864r0(C35491d.f87525c);
        int length = r0.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(r0);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(r0.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && r0.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return r0.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* renamed from: U0 */
    public Element mo29790o(String str) {
        return (Element) super.mo29790o(str);
    }

    /* renamed from: U1 */
    public boolean mo29741U1() {
        for (C12779j next : this.f31570g) {
            if (next instanceof C12783m) {
                if (!((C12783m) next).mo29948J0()) {
                    return true;
                }
            } else if ((next instanceof Element) && ((Element) next).mo29741U1()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U2 */
    public C12893f mo29742U2() {
        return this.f31568e;
    }

    /* renamed from: V0 */
    public Element mo29800s(C12779j jVar) {
        return (Element) super.mo29800s(jVar);
    }

    /* renamed from: V1 */
    public String mo29744V1() {
        StringBuilder b = C12759f.m55102b();
        mo29723O(b);
        String p = C12759f.m55116p(b);
        if (C12781k.m55545a(this).mo29686t()) {
            return p.trim();
        }
        return p;
    }

    /* renamed from: V2 */
    public String mo29745V2() {
        return this.f31568e.mo30189e();
    }

    /* renamed from: W0 */
    public Element mo29746W0(int i) {
        return mo29749X0().get(i);
    }

    /* renamed from: W1 */
    public Element mo29747W1(String str) {
        mo29699F();
        mo29710I0(str);
        return this;
    }

    /* renamed from: W2 */
    public Element mo29748W2(String str) {
        C12750d.m55072i(str, "Tag name must not be empty.");
        this.f31568e = C12893f.m55950x(str, C12781k.m55546b(this).mo30184q());
        return this;
    }

    /* renamed from: X0 */
    public List<Element> mo29749X0() {
        List<Element> list;
        if (mo29805u() == 0) {
            return f31565w;
        }
        WeakReference<List<Element>> weakReference = this.f31569f;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f31570g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C12779j jVar = this.f31570g.get(i);
            if (jVar instanceof Element) {
                arrayList.add((Element) jVar);
            }
        }
        this.f31569f = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: X2 */
    public String mo29750X2() {
        StringBuilder b = C12759f.m55102b();
        C12956d.m56227c(new C12763a(b), this);
        return C12759f.m55116p(b).trim();
    }

    /* renamed from: Y */
    public void mo29751Y(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.mo29686t() && mo29781j2(outputSettings) && !mo29783k2(outputSettings)) {
            if (!(appendable instanceof StringBuilder)) {
                mo29921P(appendable, i, outputSettings);
            } else if (((StringBuilder) appendable).length() > 0) {
                mo29921P(appendable, i, outputSettings);
            }
        }
        appendable.append(C11626x.f28914e).append(mo29745V2());
        C12767b bVar = this.f31571v;
        if (bVar != null) {
            bVar.mo29872z0(appendable, outputSettings);
        }
        if (!this.f31570g.isEmpty() || !this.f31568e.mo30198n()) {
            appendable.append(C11626x.f28915f);
        } else if (outputSettings.mo29687u() != Document.OutputSettings.Syntax.html || !this.f31568e.mo30192h()) {
            appendable.append(" />");
        } else {
            appendable.append(C11626x.f28915f);
        }
    }

    /* renamed from: Y0 */
    public Elements mo29752Y0() {
        return new Elements(mo29749X0());
    }

    /* renamed from: Y2 */
    public Element mo29653Y2(String str) {
        C12750d.m55073j(str);
        mo29699F();
        Document a0 = mo29924a0();
        if (a0 == null || !a0.mo29644C3().mo30176d(mo29799r2())) {
            mo29713J0(new C12783m(str));
        } else {
            mo29713J0(new C12774e(str));
        }
        return this;
    }

    /* renamed from: Z */
    public void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (!this.f31570g.isEmpty() || !this.f31568e.mo30198n()) {
            if (outputSettings.mo29686t() && !this.f31570g.isEmpty() && (this.f31568e.mo30187c() || (outputSettings.mo29683n() && (this.f31570g.size() > 1 || (this.f31570g.size() == 1 && !(this.f31570g.get(0) instanceof C12783m)))))) {
                mo29921P(appendable, i, outputSettings);
            }
            appendable.append("</").append(mo29745V2()).append(C11626x.f28915f);
        }
    }

    /* renamed from: Z0 */
    public int mo29754Z0() {
        return mo29749X0().size();
    }

    /* renamed from: Z1 */
    public String mo29755Z1() {
        C12767b bVar = this.f31571v;
        return bVar != null ? bVar.mo29864r0("id") : "";
    }

    /* renamed from: Z2 */
    public List<C12783m> mo29756Z2() {
        ArrayList arrayList = new ArrayList();
        for (C12779j next : this.f31570g) {
            if (next instanceof C12783m) {
                arrayList.add((C12783m) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a1 */
    public String mo29757a1() {
        return mo29896j(C35491d.f87525c).trim();
    }

    /* renamed from: a2 */
    public Element mo29758a2(String str) {
        C12750d.m55073j(str);
        mo29782k("id", str);
        return this;
    }

    /* renamed from: a3 */
    public Element mo29759a3(String str) {
        C12750d.m55073j(str);
        Set<String> b1 = mo29761b1();
        if (b1.contains(str)) {
            b1.remove(str);
        } else {
            b1.add(str);
        }
        mo29763c1(b1);
        return this;
    }

    /* renamed from: b1 */
    public Set<String> mo29761b1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f31566x.split(mo29757a1())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    /* renamed from: b3 */
    public Element mo29813x0(C12957e eVar) {
        return (Element) super.mo29813x0(eVar);
    }

    /* renamed from: c1 */
    public Element mo29763c1(Set<String> set) {
        C12750d.m55073j(set);
        if (set.isEmpty()) {
            mo29784l().mo29851R0(C35491d.f87525c);
        } else {
            mo29784l().mo29846J0(C35491d.f87525c, C12759f.m55111k(set, " "));
        }
        return this;
    }

    /* renamed from: c3 */
    public String mo29764c3() {
        if (mo29799r2().equals("textarea")) {
            return mo29750X2();
        }
        return mo29896j("value");
    }

    /* renamed from: d1 */
    public Element mo29690B() {
        if (this.f31571v != null) {
            super.mo29690B();
            this.f31571v = null;
        }
        return this;
    }

    /* renamed from: d2 */
    public Element mo29766d2(int i, Collection<? extends C12779j> collection) {
        boolean z;
        C12750d.m55074k(collection, "Children collection to be inserted must not be null.");
        int u = mo29805u();
        if (i < 0) {
            i += u + 1;
        }
        if (i < 0 || i > u) {
            z = false;
        } else {
            z = true;
        }
        C12750d.m55068e(z, "Insert position out of bounds.");
        mo29925c(i, (C12779j[]) new ArrayList(collection).toArray(new C12779j[0]));
        return this;
    }

    /* renamed from: d3 */
    public Element mo29767d3(String str) {
        if (mo29799r2().equals("textarea")) {
            mo29653Y2(str);
        } else {
            mo29782k("value", str);
        }
        return this;
    }

    /* renamed from: e1 */
    public Element clone() {
        return (Element) super.clone();
    }

    /* renamed from: e3 */
    public String mo29768e3() {
        StringBuilder b = C12759f.m55102b();
        C12956d.m56227c(new C12764b(b), this);
        return C12759f.m55116p(b);
    }

    @Nullable
    /* renamed from: f1 */
    public Element mo29769f1(String str) {
        return mo29772g1(C12958f.m56231t(str));
    }

    /* renamed from: f2 */
    public Element mo29770f2(int i, C12779j... jVarArr) {
        boolean z;
        C12750d.m55074k(jVarArr, "Children collection to be inserted must not be null.");
        int u = mo29805u();
        if (i < 0) {
            i += u + 1;
        }
        if (i < 0 || i > u) {
            z = false;
        } else {
            z = true;
        }
        C12750d.m55068e(z, "Insert position out of bounds.");
        mo29925c(i, jVarArr);
        return this;
    }

    /* renamed from: f3 */
    public Element mo29817z0(String str) {
        return (Element) super.mo29817z0(str);
    }

    @Nullable
    /* renamed from: g1 */
    public Element mo29772g1(C12918c cVar) {
        C12750d.m55073j(cVar);
        Element I2 = mo29791o0();
        Element element = this;
        while (!cVar.mo30370a(I2, element)) {
            element = element.mo29760b0();
            if (element == null) {
                return null;
            }
        }
        return element;
    }

    /* renamed from: g2 */
    public boolean mo29773g2(String str) {
        return mo29776h2(C12958f.m56231t(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.get(0) == r5) goto L_0x0037;
     */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo29775h1() {
        /*
            r5 = this;
            java.lang.String r0 = r5.mo29755Z1()
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "#"
            r0.append(r3)
            java.lang.String r3 = r5.mo29755Z1()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            org.jsoup.nodes.Document r3 = r5.mo29924a0()
            if (r3 == 0) goto L_0x0037
            org.jsoup.select.Elements r3 = r3.mo29717K2(r0)
            int r4 = r3.size()
            if (r4 != r2) goto L_0x0038
            java.lang.Object r3 = r3.get(r1)
            if (r3 != r5) goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            java.lang.String r0 = r5.mo29745V2()
            r3 = 58
            r4 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.util.Set r0 = r5.mo29761b1()
            java.lang.String r4 = "."
            java.lang.String r0 = org.jsoup.internal.C12759f.m55111k(r0, r4)
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x0061
            r4 = 46
            r3.append(r4)
            r3.append(r0)
        L_0x0061:
            org.jsoup.nodes.Element r0 = r5.mo29760b0()
            if (r0 == 0) goto L_0x00b9
            org.jsoup.nodes.Element r0 = r5.mo29760b0()
            boolean r0 = r0 instanceof org.jsoup.nodes.Document
            if (r0 == 0) goto L_0x0070
            goto L_0x00b9
        L_0x0070:
            java.lang.String r0 = " > "
            r3.insert(r1, r0)
            org.jsoup.nodes.Element r0 = r5.mo29760b0()
            java.lang.String r4 = r3.toString()
            org.jsoup.select.Elements r0 = r0.mo29717K2(r4)
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r5.mo29792o1()
            int r4 = r4 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r1] = r2
            java.lang.String r1 = ":nth-child(%d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.append(r0)
        L_0x009d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.jsoup.nodes.Element r1 = r5.mo29760b0()
            java.lang.String r1 = r1.mo29775h1()
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00b9:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.mo29775h1():java.lang.String");
    }

    /* renamed from: h2 */
    public boolean mo29776h2(C12918c cVar) {
        return cVar.mo30370a(mo29791o0(), this);
    }

    /* renamed from: i1 */
    public String mo29779i1() {
        StringBuilder b = C12759f.m55102b();
        for (C12779j next : this.f31570g) {
            if (next instanceof C12774e) {
                b.append(((C12774e) next).mo29899I0());
            } else if (next instanceof C12773d) {
                b.append(((C12773d) next).mo29891I0());
            } else if (next instanceof Element) {
                b.append(((Element) next).mo29779i1());
            } else if (next instanceof C12772c) {
                b.append(((C12772c) next).mo29947I0());
            }
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: i2 */
    public boolean mo29780i2() {
        return this.f31568e.mo30191f();
    }

    /* renamed from: j2 */
    public final boolean mo29781j2(Document.OutputSettings outputSettings) {
        return this.f31568e.mo30187c() || (mo29760b0() != null && mo29760b0().mo29742U2().mo30187c()) || outputSettings.mo29683n();
    }

    /* renamed from: k2 */
    public final boolean mo29783k2(Document.OutputSettings outputSettings) {
        if (!mo29742U2().mo30196k() || mo29742U2().mo30192h() || ((mo29760b0() != null && !mo29760b0().mo29780i2()) || mo29927d0() == null || outputSettings.mo29683n())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public C12767b mo29784l() {
        if (this.f31571v == null) {
            this.f31571v = new C12767b();
        }
        return this.f31571v;
    }

    /* renamed from: l1 */
    public List<C12774e> mo29785l1() {
        ArrayList arrayList = new ArrayList();
        for (C12779j next : this.f31570g) {
            if (next instanceof C12774e) {
                arrayList.add((C12774e) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: m1 */
    public Map<String, String> mo29786m1() {
        return mo29784l().mo29861l0();
    }

    /* renamed from: n */
    public String mo29787n() {
        return m55176J2(this, f31567y);
    }

    /* renamed from: n1 */
    public Element mo29694D(@Nullable C12779j jVar) {
        C12767b bVar;
        Element element = (Element) super.mo29694D(jVar);
        C12767b bVar2 = this.f31571v;
        if (bVar2 != null) {
            bVar = bVar2.clone();
        } else {
            bVar = null;
        }
        element.f31571v = bVar;
        NodeList nodeList = new NodeList(element, this.f31570g.size());
        element.f31570g = nodeList;
        nodeList.addAll(this.f31570g);
        return element;
    }

    /* renamed from: n2 */
    public Element mo29789n2() {
        if (mo29760b0() == null) {
            return this;
        }
        List<Element> X0 = mo29760b0().mo29749X0();
        if (X0.size() > 1) {
            return X0.get(X0.size() - 1);
        }
        return this;
    }

    /* renamed from: o1 */
    public int mo29792o1() {
        if (mo29760b0() == null) {
            return 0;
        }
        return m55179b2(this, mo29760b0().mo29749X0());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = mo29808u2().mo29749X0();
     */
    @javax.annotation.Nullable
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.nodes.Element mo29793o2() {
        /*
            r4 = this;
            org.jsoup.nodes.j r0 = r4.f31628a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            org.jsoup.nodes.Element r0 = r4.mo29760b0()
            java.util.List r0 = r0.mo29749X0()
            int r2 = m55179b2(r4, r0)
            int r3 = r0.size()
            int r2 = r2 + 1
            if (r3 <= r2) goto L_0x0021
            java.lang.Object r0 = r0.get(r2)
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.mo29793o2():org.jsoup.nodes.Element");
    }

    /* renamed from: p1 */
    public Element mo29699F() {
        this.f31570g.clear();
        return this;
    }

    /* renamed from: p2 */
    public Elements mo29795p2() {
        return mo29797q2(true);
    }

    /* renamed from: q1 */
    public Element mo29706H(NodeFilter nodeFilter) {
        return (Element) super.mo29706H(nodeFilter);
    }

    /* renamed from: q2 */
    public final Elements mo29797q2(boolean z) {
        Elements elements = new Elements();
        if (this.f31628a == null) {
            return elements;
        }
        elements.add(this);
        if (z) {
            return elements.mo30322O0();
        }
        return elements.mo30330X0();
    }

    /* renamed from: r1 */
    public Element mo29798r1() {
        if (mo29760b0() == null) {
            return this;
        }
        List<Element> X0 = mo29760b0().mo29749X0();
        if (X0.size() > 1) {
            return X0.get(0);
        }
        return this;
    }

    /* renamed from: r2 */
    public String mo29799r2() {
        return this.f31568e.mo30199o();
    }

    /* renamed from: s1 */
    public Elements mo29801s1() {
        return C12912a.m56172a(new C12918c.C12919a(), this);
    }

    /* renamed from: s2 */
    public String mo29802s2() {
        StringBuilder b = C12759f.m55102b();
        mo29804t2(b);
        return C12759f.m55116p(b).trim();
    }

    @Nullable
    /* renamed from: t1 */
    public Element mo29803t1(String str) {
        C12750d.m55071h(str);
        Elements a = C12912a.m56172a(new C12918c.C12945p(str), this);
        if (a.size() > 0) {
            return (Element) a.get(0);
        }
        return null;
    }

    /* renamed from: t2 */
    public final void mo29804t2(StringBuilder sb) {
        for (int i = 0; i < mo29805u(); i++) {
            C12779j jVar = this.f31570g.get(i);
            if (jVar instanceof C12783m) {
                m55177O0(sb, (C12783m) jVar);
            } else if (jVar instanceof Element) {
                m55178R0((Element) jVar, sb);
            }
        }
    }

    /* renamed from: u */
    public int mo29805u() {
        return this.f31570g.size();
    }

    /* renamed from: u1 */
    public Elements mo29807u1(String str) {
        C12750d.m55071h(str);
        return C12912a.m56172a(new C12918c.C12921b(str.trim()), this);
    }

    @Nullable
    /* renamed from: u2 */
    public final Element mo29760b0() {
        return (Element) this.f31628a;
    }

    /* renamed from: v1 */
    public Elements mo29809v1(String str) {
        C12750d.m55071h(str);
        return C12912a.m56172a(new C12918c.C12925d(str.trim()), this);
    }

    /* renamed from: v2 */
    public Elements mo29810v2() {
        Elements elements = new Elements();
        m55175E0(this, elements);
        return elements;
    }

    /* renamed from: w1 */
    public Elements mo29811w1(String str, String str2) {
        return C12912a.m56172a(new C12918c.C12927e(str, str2), this);
    }

    /* renamed from: w2 */
    public Element mo29812w2(String str) {
        C12750d.m55073j(str);
        mo29925c(0, (C12779j[]) C12781k.m55546b(this).mo30179k(str, this, mo29787n()).toArray(new C12779j[0]));
        return this;
    }

    /* renamed from: x1 */
    public Elements mo29814x1(String str, String str2) {
        return C12912a.m56172a(new C12918c.C12929f(str, str2), this);
    }

    /* renamed from: x2 */
    public Element mo29815x2(C12779j jVar) {
        C12750d.m55073j(jVar);
        mo29925c(0, jVar);
        return this;
    }

    /* renamed from: y1 */
    public Elements mo29816y1(String str, String str2) {
        return C12912a.m56172a(new C12918c.C12931g(str, str2), this);
    }

    /* renamed from: z1 */
    public Elements mo29818z1(String str, String str2) {
        try {
            return mo29691B1(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e);
        }
    }

    /* renamed from: z2 */
    public Element mo29819z2(Collection<? extends C12779j> collection) {
        mo29766d2(0, collection);
        return this;
    }

    public Element(C12893f fVar, @Nullable String str, @Nullable C12767b bVar) {
        C12750d.m55073j(fVar);
        this.f31570g = C12779j.f31626c;
        this.f31571v = bVar;
        this.f31568e = fVar;
        if (str != null) {
            mo29938q0(str);
        }
    }

    public Element(C12893f fVar, @Nullable String str) {
        this(fVar, str, (C12767b) null);
    }
}
