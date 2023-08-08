package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.Nullable;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12773d;
import org.jsoup.nodes.C12774e;
import org.jsoup.nodes.C12777h;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.Element;

public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    /* renamed from: A */
    public Elements mo30312A(String str, String str2) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29782k(str, str2);
        }
        return this;
    }

    /* renamed from: B0 */
    public boolean mo30313B0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).mo29739T1(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F0 */
    public boolean mo30314F0() {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).mo29741U1()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G0 */
    public String mo30315G0() {
        StringBuilder b = C12759f.m55102b();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (b.length() != 0) {
                b.append("\n");
            }
            b.append(element.mo29744V1());
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: H */
    public Elements mo30316H(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29790o(str);
        }
        return this;
    }

    /* renamed from: H0 */
    public Elements mo30317H0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29747W1(str);
        }
        return this;
    }

    /* renamed from: I0 */
    public boolean mo30318I0(String str) {
        C12918c t = C12958f.m56231t(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).mo29776h2(t)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: J0 */
    public Element mo30319J0() {
        if (isEmpty()) {
            return null;
        }
        return (Element) get(size() - 1);
    }

    /* renamed from: L0 */
    public Elements mo30320L0() {
        return mo30339f1((String) null, true, false);
    }

    /* renamed from: M0 */
    public Elements mo30321M0(String str) {
        return mo30339f1(str, true, false);
    }

    /* renamed from: O0 */
    public Elements mo30322O0() {
        return mo30339f1((String) null, true, true);
    }

    /* renamed from: P0 */
    public Elements mo30323P0(String str) {
        return mo30339f1(str, true, true);
    }

    /* renamed from: R0 */
    public Elements mo30324R0(String str) {
        return Selector.m56167a(this, Selector.m56168b(str, this));
    }

    /* renamed from: S0 */
    public String mo30325S0() {
        StringBuilder b = C12759f.m55102b();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (b.length() != 0) {
                b.append("\n");
            }
            b.append(element.mo29652U());
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: T0 */
    public Elements mo30326T0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((Element) it.next()).mo29810v2());
        }
        return new Elements((Collection<Element>) linkedHashSet);
    }

    /* renamed from: U0 */
    public Elements mo30327U0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29812w2(str);
        }
        return this;
    }

    /* renamed from: V0 */
    public Elements mo30328V0() {
        return mo30339f1((String) null, false, false);
    }

    /* renamed from: W0 */
    public Elements mo30329W0(String str) {
        return mo30339f1(str, false, false);
    }

    /* renamed from: X0 */
    public Elements mo30330X0() {
        return mo30339f1((String) null, false, true);
    }

    /* renamed from: Y */
    public final <T extends C12779j> List<T> mo30331Y(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            for (int i = 0; i < element.mo29805u(); i++) {
                C12779j t = element.mo29941t(i);
                if (cls.isInstance(t)) {
                    arrayList.add((C12779j) cls.cast(t));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Y0 */
    public Elements mo30332Y0(String str) {
        return mo30339f1(str, false, true);
    }

    /* renamed from: b1 */
    public Elements mo30333b1() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29932h0();
        }
        return this;
    }

    /* renamed from: c1 */
    public Elements mo30334c1(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29778i0(str);
        }
        return this;
    }

    /* renamed from: d1 */
    public Elements mo30336d1(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29709H2(str);
        }
        return this;
    }

    /* renamed from: e */
    public Elements mo30337e(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29700F0(str);
        }
        return this;
    }

    /* renamed from: e1 */
    public Elements mo30338e1(String str) {
        return Selector.m56168b(str, this);
    }

    /* renamed from: f1 */
    public final Elements mo30339f1(@Nullable String str, boolean z, boolean z2) {
        C12918c cVar;
        Elements elements = new Elements();
        if (str != null) {
            cVar = C12958f.m56231t(str);
        } else {
            cVar = null;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            do {
                if (z) {
                    element = element.mo29793o2();
                } else {
                    element = element.mo29698E2();
                }
                if (element == null) {
                    break;
                } else if (cVar == null) {
                    elements.add(element);
                    continue;
                } else if (element.mo29776h2(cVar)) {
                    elements.add(element);
                    continue;
                } else {
                    continue;
                }
            } while (z2);
        }
        return elements;
    }

    /* renamed from: h */
    public Elements mo30340h(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29774h(str);
        }
        return this;
    }

    /* renamed from: h1 */
    public Elements mo30341h1(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29748W2(str);
        }
        return this;
    }

    /* renamed from: i */
    public Elements mo30342i(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29710I0(str);
        }
        return this;
    }

    /* renamed from: i1 */
    public String mo30343i1() {
        StringBuilder b = C12759f.m55102b();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (b.length() != 0) {
                b.append(" ");
            }
            b.append(element.mo29750X2());
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: k */
    public String mo30344k(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.mo29892J(str)) {
                return element.mo29896j(str);
            }
        }
        return "";
    }

    /* renamed from: k0 */
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            elements.add(((Element) it.next()).clone());
        }
        return elements;
    }

    /* renamed from: l0 */
    public List<C12773d> mo30346l0() {
        return mo30331Y(C12773d.class);
    }

    /* renamed from: m0 */
    public List<C12774e> mo30347m0() {
        return mo30331Y(C12774e.class);
    }

    /* renamed from: m1 */
    public List<C12783m> mo30348m1() {
        return mo30331Y(C12783m.class);
    }

    /* renamed from: n1 */
    public Elements mo30349n1(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29759a3(str);
        }
        return this;
    }

    /* renamed from: o0 */
    public List<String> mo30350o0(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.mo29892J(str)) {
                arrayList.add(element.mo29896j(str));
            }
        }
        return arrayList;
    }

    /* renamed from: o1 */
    public Elements mo30351o1(C12957e eVar) {
        C12956d.m56228d(eVar, this);
        return this;
    }

    /* renamed from: p1 */
    public Elements mo30352p1() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29946y0();
        }
        return this;
    }

    /* renamed from: q1 */
    public String mo30353q1() {
        if (size() > 0) {
            return mo30361w0().mo29764c3();
        }
        return "";
    }

    /* renamed from: r0 */
    public List<String> mo30354r0() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.mo29741U1()) {
                arrayList.add(element.mo29750X2());
            }
        }
        return arrayList;
    }

    /* renamed from: r1 */
    public Elements mo30355r1(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29767d3(str);
        }
        return this;
    }

    /* renamed from: s0 */
    public Elements mo30356s0() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29699F();
        }
        return this;
    }

    /* renamed from: s1 */
    public Elements mo30357s1(String str) {
        C12750d.m55071h(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).mo29817z0(str);
        }
        return this;
    }

    public String toString() {
        return mo30325S0();
    }

    /* renamed from: u0 */
    public Elements mo30359u0(int i) {
        if (size() <= i) {
            return new Elements();
        }
        return new Elements((Element) get(i));
    }

    /* renamed from: v0 */
    public Elements mo30360v0(NodeFilter nodeFilter) {
        C12956d.m56226b(nodeFilter, this);
        return this;
    }

    @Nullable
    /* renamed from: w0 */
    public Element mo30361w0() {
        if (isEmpty()) {
            return null;
        }
        return (Element) get(0);
    }

    /* renamed from: y0 */
    public List<C12777h> mo30362y0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element instanceof C12777h) {
                arrayList.add((C12777h) element);
            }
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public boolean mo30363z0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).mo29892J(str)) {
                return true;
            }
        }
        return false;
    }

    public Elements(int i) {
        super(i);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }
}
