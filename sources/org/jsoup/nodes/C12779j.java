package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;
import org.jsoup.select.C12956d;
import org.jsoup.select.C12957e;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;

/* renamed from: org.jsoup.nodes.j */
public abstract class C12779j implements Cloneable {

    /* renamed from: c */
    public static final List<C12779j> f31626c = Collections.emptyList();

    /* renamed from: d */
    public static final String f31627d = "";
    @Nullable

    /* renamed from: a */
    public C12779j f31628a;

    /* renamed from: b */
    public int f31629b;

    /* renamed from: org.jsoup.nodes.j$a */
    public static class C12780a implements C12957e {

        /* renamed from: a */
        public final Appendable f31630a;

        /* renamed from: b */
        public final Document.OutputSettings f31631b;

        public C12780a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f31630a = appendable;
            this.f31631b = outputSettings;
            outputSettings.mo29684o();
        }

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
            if (!jVar.mo29651S().equals("#text")) {
                try {
                    jVar.mo29753Z(this.f31630a, i, this.f31631b);
                } catch (IOException e) {
                    throw new SerializationException((Throwable) e);
                }
            }
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            try {
                jVar.mo29751Y(this.f31630a, i, this.f31631b);
            } catch (IOException e) {
                throw new SerializationException((Throwable) e);
            }
        }
    }

    /* renamed from: A */
    public List<C12779j> mo29917A() {
        List<C12779j> G = mo29703G();
        ArrayList arrayList = new ArrayList(G.size());
        for (C12779j C : G) {
            arrayList.add(C.clone());
        }
        return arrayList;
    }

    /* renamed from: B */
    public C12779j mo29690B() {
        if (mo29715K()) {
            Iterator<C12766a> it = mo29784l().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    /* renamed from: C */
    public C12779j clone() {
        C12779j D = mo29694D((C12779j) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(D);
        while (!linkedList.isEmpty()) {
            C12779j jVar = (C12779j) linkedList.remove();
            int u = jVar.mo29805u();
            for (int i = 0; i < u; i++) {
                List<C12779j> G = jVar.mo29703G();
                C12779j D2 = G.get(i).mo29694D(jVar);
                G.set(i, D2);
                linkedList.add(D2);
            }
        }
        return D;
    }

    /* renamed from: D */
    public C12779j mo29694D(@Nullable C12779j jVar) {
        int i;
        try {
            C12779j jVar2 = (C12779j) super.clone();
            jVar2.f31628a = jVar;
            if (jVar == null) {
                i = 0;
            } else {
                i = this.f31629b;
            }
            jVar2.f31629b = i;
            return jVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: E */
    public abstract void mo29696E(String str);

    /* renamed from: F */
    public abstract C12779j mo29699F();

    /* renamed from: G */
    public abstract List<C12779j> mo29703G();

    /* renamed from: H */
    public C12779j mo29706H(NodeFilter nodeFilter) {
        C12750d.m55073j(nodeFilter);
        C12956d.m56225a(nodeFilter, this);
        return this;
    }

    /* renamed from: I */
    public final Element mo29918I(Element element) {
        Elements Y0 = element.mo29752Y0();
        if (Y0.size() > 0) {
            return mo29918I((Element) Y0.get(0));
        }
        return element;
    }

    /* renamed from: J */
    public boolean mo29892J(String str) {
        C12750d.m55073j(str);
        if (!mo29715K()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (mo29784l().mo29870w0(substring) && !mo29895b(substring).isEmpty()) {
                return true;
            }
        }
        return mo29784l().mo29870w0(str);
    }

    /* renamed from: K */
    public abstract boolean mo29715K();

    /* renamed from: L */
    public boolean mo29919L() {
        return this.f31628a != null;
    }

    /* renamed from: N */
    public boolean mo29920N(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo29652U().equals(((C12779j) obj).mo29652U());
    }

    /* renamed from: O */
    public <T extends Appendable> T mo29723O(T t) {
        mo29923V(t);
        return t;
    }

    /* renamed from: P */
    public void mo29921P(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(10).append(C12759f.m55115o(i * outputSettings.mo29680k()));
    }

    @Nullable
    /* renamed from: R */
    public C12779j mo29922R() {
        C12779j jVar = this.f31628a;
        if (jVar == null) {
            return null;
        }
        List<C12779j> G = jVar.mo29703G();
        int i = this.f31629b + 1;
        if (G.size() > i) {
            return G.get(i);
        }
        return null;
    }

    /* renamed from: S */
    public abstract String mo29651S();

    /* renamed from: T */
    public void mo29737T() {
    }

    /* renamed from: U */
    public String mo29652U() {
        StringBuilder b = C12759f.m55102b();
        mo29923V(b);
        return C12759f.m55116p(b);
    }

    /* renamed from: V */
    public void mo29923V(Appendable appendable) {
        C12956d.m56227c(new C12780a(appendable, C12781k.m55545a(this)), this);
    }

    /* renamed from: Y */
    public abstract void mo29751Y(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    /* renamed from: Z */
    public abstract void mo29753Z(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException;

    @Nullable
    /* renamed from: a0 */
    public Document mo29924a0() {
        C12779j o0 = mo29791o0();
        if (o0 instanceof Document) {
            return (Document) o0;
        }
        return null;
    }

    /* renamed from: b */
    public String mo29895b(String str) {
        C12750d.m55071h(str);
        if (!mo29715K() || !mo29784l().mo29870w0(str)) {
            return "";
        }
        return C12759f.m55117q(mo29787n(), mo29784l().mo29864r0(str));
    }

    @Nullable
    /* renamed from: b0 */
    public C12779j mo29760b0() {
        return this.f31628a;
    }

    /* renamed from: c */
    public void mo29925c(int i, C12779j... jVarArr) {
        boolean z;
        boolean z2;
        C12750d.m55073j(jVarArr);
        if (jVarArr.length != 0) {
            List<C12779j> G = mo29703G();
            C12779j b0 = jVarArr[0].mo29760b0();
            if (b0 != null && b0.mo29805u() == jVarArr.length) {
                List<C12779j> G2 = b0.mo29703G();
                int length = jVarArr.length;
                while (true) {
                    int i2 = length - 1;
                    z = true;
                    if (length <= 0) {
                        z2 = true;
                        break;
                    } else if (jVarArr[i2] != G2.get(i2)) {
                        z2 = false;
                        break;
                    } else {
                        length = i2;
                    }
                }
                if (z2) {
                    if (mo29805u() != 0) {
                        z = false;
                    }
                    b0.mo29699F();
                    G.addAll(i, Arrays.asList(jVarArr));
                    int length2 = jVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        jVarArr[i3].f31628a = this;
                        length2 = i3;
                    }
                    if (!z || jVarArr[0].f31629b != 0) {
                        mo29931g0(i);
                        return;
                    }
                    return;
                }
            }
            C12750d.m55069f(jVarArr);
            for (C12779j k0 : jVarArr) {
                mo29934k0(k0);
            }
            G.addAll(i, Arrays.asList(jVarArr));
            mo29931g0(i);
        }
    }

    @Nullable
    /* renamed from: c0 */
    public final C12779j mo29926c0() {
        return this.f31628a;
    }

    @Nullable
    /* renamed from: d0 */
    public C12779j mo29927d0() {
        C12779j jVar = this.f31628a;
        if (jVar != null && this.f31629b > 0) {
            return jVar.mo29703G().get(this.f31629b - 1);
        }
        return null;
    }

    /* renamed from: e */
    public void mo29928e(C12779j... jVarArr) {
        List<C12779j> G = mo29703G();
        for (C12779j jVar : jVarArr) {
            mo29934k0(jVar);
            G.add(jVar);
            jVar.mo29940s0(G.size() - 1);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public final void mo29930f(int i, String str) {
        Element element;
        C12750d.m55073j(str);
        C12750d.m55073j(this.f31628a);
        if (mo29760b0() instanceof Element) {
            element = (Element) mo29760b0();
        } else {
            element = null;
        }
        this.f31628a.mo29925c(i, (C12779j[]) C12781k.m55546b(this).mo30179k(str, element, mo29787n()).toArray(new C12779j[0]));
    }

    /* renamed from: g0 */
    public final void mo29931g0(int i) {
        if (mo29805u() != 0) {
            List<C12779j> G = mo29703G();
            while (i < G.size()) {
                G.get(i).mo29940s0(i);
                i++;
            }
        }
    }

    /* renamed from: h */
    public C12779j mo29774h(String str) {
        mo29930f(this.f31629b + 1, str);
        return this;
    }

    /* renamed from: h0 */
    public void mo29932h0() {
        C12750d.m55073j(this.f31628a);
        this.f31628a.mo29910j0(this);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public C12779j mo29777i(C12779j jVar) {
        C12750d.m55073j(jVar);
        C12750d.m55073j(this.f31628a);
        this.f31628a.mo29925c(this.f31629b + 1, jVar);
        return this;
    }

    /* renamed from: i0 */
    public C12779j mo29778i0(String str) {
        C12750d.m55073j(str);
        if (mo29715K()) {
            mo29784l().mo29852S0(str);
        }
        return this;
    }

    /* renamed from: j */
    public String mo29896j(String str) {
        C12750d.m55073j(str);
        if (!mo29715K()) {
            return "";
        }
        String r0 = mo29784l().mo29864r0(str);
        if (r0.length() > 0) {
            return r0;
        }
        if (str.startsWith("abs:")) {
            return mo29895b(str.substring(4));
        }
        return "";
    }

    /* renamed from: j0 */
    public void mo29910j0(C12779j jVar) {
        boolean z;
        if (jVar.f31628a == this) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        int i = jVar.f31629b;
        mo29703G().remove(i);
        mo29931g0(i);
        jVar.f31628a = null;
    }

    /* renamed from: k */
    public C12779j mo29782k(String str, String str2) {
        mo29784l().mo29849O0(C12781k.m55546b(this).mo30184q().mo30169b(str), str2);
        return this;
    }

    /* renamed from: k0 */
    public void mo29934k0(C12779j jVar) {
        jVar.mo29939r0(this);
    }

    /* renamed from: l */
    public abstract C12767b mo29784l();

    /* renamed from: l0 */
    public void mo29935l0(C12779j jVar, C12779j jVar2) {
        boolean z;
        if (jVar.f31628a == this) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        C12750d.m55073j(jVar2);
        C12779j jVar3 = jVar2.f31628a;
        if (jVar3 != null) {
            jVar3.mo29910j0(jVar2);
        }
        int i = jVar.f31629b;
        mo29703G().set(i, jVar2);
        jVar2.f31628a = this;
        jVar2.mo29940s0(i);
        jVar.f31628a = null;
    }

    /* renamed from: m */
    public int mo29936m() {
        if (mo29715K()) {
            return mo29784l().size();
        }
        return 0;
    }

    /* renamed from: m0 */
    public void mo29937m0(C12779j jVar) {
        C12750d.m55073j(jVar);
        C12750d.m55073j(this.f31628a);
        this.f31628a.mo29935l0(this, jVar);
    }

    /* renamed from: n */
    public abstract String mo29787n();

    /* renamed from: o */
    public C12779j mo29790o(String str) {
        mo29930f(this.f31629b, str);
        return this;
    }

    /* renamed from: o0 */
    public C12779j mo29791o0() {
        C12779j jVar = this;
        while (true) {
            C12779j jVar2 = jVar.f31628a;
            if (jVar2 == null) {
                return jVar;
            }
            jVar = jVar2;
        }
    }

    /* renamed from: q0 */
    public void mo29938q0(String str) {
        C12750d.m55073j(str);
        mo29696E(str);
    }

    /* renamed from: r0 */
    public void mo29939r0(C12779j jVar) {
        C12750d.m55073j(jVar);
        C12779j jVar2 = this.f31628a;
        if (jVar2 != null) {
            jVar2.mo29910j0(this);
        }
        this.f31628a = jVar;
    }

    /* renamed from: s */
    public C12779j mo29800s(C12779j jVar) {
        C12750d.m55073j(jVar);
        C12750d.m55073j(this.f31628a);
        this.f31628a.mo29925c(this.f31629b, jVar);
        return this;
    }

    /* renamed from: s0 */
    public void mo29940s0(int i) {
        this.f31629b = i;
    }

    /* renamed from: t */
    public C12779j mo29941t(int i) {
        return mo29703G().get(i);
    }

    public String toString() {
        return mo29652U();
    }

    /* renamed from: u */
    public abstract int mo29805u();

    /* renamed from: u0 */
    public C12779j mo29806u0() {
        return mo29694D((C12779j) null);
    }

    /* renamed from: v */
    public List<C12779j> mo29942v() {
        if (mo29805u() == 0) {
            return f31626c;
        }
        List<C12779j> G = mo29703G();
        ArrayList arrayList = new ArrayList(G.size());
        arrayList.addAll(G);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: v0 */
    public int mo29943v0() {
        return this.f31629b;
    }

    /* renamed from: w0 */
    public List<C12779j> mo29944w0() {
        C12779j jVar = this.f31628a;
        if (jVar == null) {
            return Collections.emptyList();
        }
        List<C12779j> G = jVar.mo29703G();
        ArrayList arrayList = new ArrayList(G.size() - 1);
        for (C12779j next : G) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public C12779j[] mo29945x() {
        return (C12779j[]) mo29703G().toArray(new C12779j[0]);
    }

    /* renamed from: x0 */
    public C12779j mo29813x0(C12957e eVar) {
        C12750d.m55073j(eVar);
        C12956d.m56227c(eVar, this);
        return this;
    }

    @Nullable
    /* renamed from: y0 */
    public C12779j mo29946y0() {
        C12779j jVar;
        C12750d.m55073j(this.f31628a);
        List<C12779j> G = mo29703G();
        if (G.size() > 0) {
            jVar = G.get(0);
        } else {
            jVar = null;
        }
        this.f31628a.mo29925c(this.f31629b, mo29945x());
        mo29932h0();
        return jVar;
    }

    /* renamed from: z0 */
    public C12779j mo29817z0(String str) {
        Element element;
        C12750d.m55071h(str);
        C12779j jVar = this.f31628a;
        if (jVar != null && (jVar instanceof Element)) {
            element = (Element) jVar;
        } else if (this instanceof Element) {
            element = (Element) this;
        } else {
            element = null;
        }
        List<C12779j> k = C12781k.m55546b(this).mo30179k(str, element, mo29787n());
        C12779j jVar2 = k.get(0);
        if (!(jVar2 instanceof Element)) {
            return this;
        }
        Element element2 = (Element) jVar2;
        Element I = mo29918I(element2);
        C12779j jVar3 = this.f31628a;
        if (jVar3 != null) {
            jVar3.mo29935l0(this, element2);
        }
        I.mo29928e(this);
        if (k.size() > 0) {
            for (int i = 0; i < k.size(); i++) {
                C12779j jVar4 = k.get(i);
                if (element2 != jVar4) {
                    C12779j jVar5 = jVar4.f31628a;
                    if (jVar5 != null) {
                        jVar5.mo29910j0(jVar4);
                    }
                    element2.mo29777i(jVar4);
                }
            }
        }
        return this;
    }
}
