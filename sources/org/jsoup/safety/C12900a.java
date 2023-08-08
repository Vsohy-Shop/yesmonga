package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.C12766a;
import org.jsoup.nodes.C12767b;
import org.jsoup.nodes.C12774e;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C12892e;
import org.jsoup.parser.C12893f;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.select.C12956d;
import org.jsoup.select.C12957e;

/* renamed from: org.jsoup.safety.a */
public class C12900a {

    /* renamed from: a */
    public final C12904b f31915a;

    /* renamed from: org.jsoup.safety.a$b */
    public final class C12902b implements C12957e {

        /* renamed from: a */
        public int f31916a;

        /* renamed from: b */
        public final Element f31917b;

        /* renamed from: c */
        public Element f31918c;

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
            if ((jVar instanceof Element) && C12900a.this.f31915a.mo30292i(jVar.mo29651S())) {
                this.f31918c = this.f31918c.mo29760b0();
            }
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            if (jVar instanceof Element) {
                Element element = (Element) jVar;
                if (C12900a.this.f31915a.mo30292i(element.mo29799r2())) {
                    C12903c b = C12900a.this.mo30283e(element);
                    Element element2 = b.f31920a;
                    this.f31918c.mo29713J0(element2);
                    this.f31916a += b.f31921b;
                    this.f31918c = element2;
                } else if (jVar != this.f31917b) {
                    this.f31916a++;
                }
            } else if (jVar instanceof C12783m) {
                this.f31918c.mo29713J0(new C12783m(((C12783m) jVar).mo29947I0()));
            } else if (!(jVar instanceof C12774e) || !C12900a.this.f31915a.mo30292i(jVar.mo29760b0().mo29651S())) {
                this.f31916a++;
            } else {
                this.f31918c.mo29713J0(new C12774e(((C12774e) jVar).mo29899I0()));
            }
        }

        public C12902b(Element element, Element element2) {
            this.f31916a = 0;
            this.f31917b = element;
            this.f31918c = element2;
        }
    }

    /* renamed from: org.jsoup.safety.a$c */
    public static class C12903c {

        /* renamed from: a */
        public Element f31920a;

        /* renamed from: b */
        public int f31921b;

        public C12903c(Element element, int i) {
            this.f31920a = element;
            this.f31921b = i;
        }
    }

    public C12900a(C12904b bVar) {
        C12750d.m55073j(bVar);
        this.f31915a = bVar;
    }

    /* renamed from: c */
    public Document mo30281c(Document document) {
        C12750d.m55073j(document);
        Document n3 = Document.m55123n3(document.mo29787n());
        mo30282d(document.mo29656g3(), n3.mo29656g3());
        n3.mo29641A3(document.mo29671z3().clone());
        return n3;
    }

    /* renamed from: d */
    public final int mo30282d(Element element, Element element2) {
        C12902b bVar = new C12902b(element, element2);
        C12956d.m56227c(bVar, element);
        return bVar.f31916a;
    }

    /* renamed from: e */
    public final C12903c mo30283e(Element element) {
        String V2 = element.mo29745V2();
        C12767b bVar = new C12767b();
        Element element2 = new Element(C12893f.m55949v(V2), element.mo29787n(), bVar);
        Iterator<C12766a> it = element.mo29784l().iterator();
        int i = 0;
        while (it.hasNext()) {
            C12766a next = it.next();
            if (this.f31915a.mo30291h(V2, element, next)) {
                bVar.mo29848M0(next);
            } else {
                i++;
            }
        }
        bVar.mo29843H(this.f31915a.mo30290g(V2));
        return new C12903c(element2, i);
    }

    /* renamed from: f */
    public boolean mo30284f(Document document) {
        C12750d.m55073j(document);
        if (mo30282d(document.mo29656g3(), Document.m55123n3(document.mo29787n()).mo29656g3()) != 0 || !document.mo29665q3().mo29942v().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo30285g(String str) {
        Document n3 = Document.m55123n3("");
        Document n32 = Document.m55123n3("");
        ParseErrorList k = ParseErrorList.m55641k(1);
        n32.mo29656g3().mo29766d2(0, C12892e.m55931j(str, n32.mo29656g3(), "", k));
        if (mo30282d(n32.mo29656g3(), n3.mo29656g3()) != 0 || !k.isEmpty()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public C12900a(C12910c cVar) {
        C12750d.m55073j(cVar);
        this.f31915a = cVar;
    }
}
