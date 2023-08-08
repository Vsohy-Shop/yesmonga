package org.jsoup.nodes;

import java.util.List;
import org.jsoup.helper.C12750d;
import org.jsoup.helper.C12751e;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12889b;
import org.jsoup.parser.C12892e;
import org.jsoup.parser.C12896i;

/* renamed from: org.jsoup.nodes.k */
public final class C12781k {
    /* renamed from: a */
    public static Document.OutputSettings m55545a(C12779j jVar) {
        Document a0 = jVar.mo29924a0();
        if (a0 == null) {
            a0 = new Document("");
        }
        return a0.mo29671z3();
    }

    /* renamed from: b */
    public static C12892e m55546b(C12779j jVar) {
        Document a0 = jVar.mo29924a0();
        if (a0 == null || a0.mo29644C3() == null) {
            return new C12892e((C12896i) new C12889b());
        }
        return a0.mo29644C3();
    }

    /* renamed from: c */
    public static <T extends C12779j> List<T> m55547c(String str, Element element, Class<T> cls) {
        C12750d.m55071h(str);
        C12750d.m55073j(element);
        C12750d.m55073j(cls);
        C12751e eVar = new C12751e();
        return eVar.mo29625m(eVar.mo29624l(str, eVar.mo29623i(element)), cls);
    }
}
