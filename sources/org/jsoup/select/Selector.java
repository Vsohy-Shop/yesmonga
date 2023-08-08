package org.jsoup.select;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.Element;

public class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static Elements m56167a(Collection<Element> collection, Collection<Element> collection2) {
        boolean z;
        Elements elements = new Elements();
        for (Element next : collection) {
            Iterator<Element> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                elements.add(next);
            }
        }
        return elements;
    }

    /* renamed from: b */
    public static Elements m56168b(String str, Iterable<Element> iterable) {
        C12750d.m55071h(str);
        C12750d.m55073j(iterable);
        C12918c t = C12958f.m56231t(str);
        Elements elements = new Elements();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (Element d : iterable) {
            Iterator it = m56170d(t, d).iterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                if (identityHashMap.put(element, Boolean.TRUE) == null) {
                    elements.add(element);
                }
            }
        }
        return elements;
    }

    /* renamed from: c */
    public static Elements m56169c(String str, Element element) {
        C12750d.m55071h(str);
        return m56170d(C12958f.m56231t(str), element);
    }

    /* renamed from: d */
    public static Elements m56170d(C12918c cVar, Element element) {
        C12750d.m55073j(cVar);
        C12750d.m55073j(element);
        return C12912a.m56172a(cVar, element);
    }

    @Nullable
    /* renamed from: e */
    public static Element m56171e(String str, Element element) {
        C12750d.m55071h(str);
        return C12912a.m56173b(C12958f.m56231t(str), element);
    }
}
