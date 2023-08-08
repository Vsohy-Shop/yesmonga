package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.helper.C12750d;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeFilter;

/* renamed from: org.jsoup.select.d */
public class C12956d {

    /* renamed from: a */
    public static final /* synthetic */ boolean f31960a = false;

    /* renamed from: a */
    public static NodeFilter.FilterResult m56225a(NodeFilter nodeFilter, C12779j jVar) {
        C12779j jVar2 = jVar;
        int i = 0;
        while (jVar2 != null) {
            NodeFilter.FilterResult b = nodeFilter.mo30365b(jVar2, i);
            if (b == NodeFilter.FilterResult.STOP) {
                return b;
            }
            if (b != NodeFilter.FilterResult.CONTINUE || jVar2.mo29805u() <= 0) {
                while (jVar2.mo29922R() == null && i > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((b == filterResult || b == NodeFilter.FilterResult.SKIP_CHILDREN) && (b = nodeFilter.mo30364a(jVar2, i)) == NodeFilter.FilterResult.STOP) {
                        return b;
                    }
                    C12779j c0 = jVar2.mo29926c0();
                    i--;
                    if (b == NodeFilter.FilterResult.REMOVE) {
                        jVar2.mo29932h0();
                    }
                    b = filterResult;
                    jVar2 = c0;
                }
                if ((b == NodeFilter.FilterResult.CONTINUE || b == NodeFilter.FilterResult.SKIP_CHILDREN) && (b = nodeFilter.mo30364a(jVar2, i)) == NodeFilter.FilterResult.STOP) {
                    return b;
                }
                if (jVar2 == jVar) {
                    return b;
                }
                C12779j R = jVar2.mo29922R();
                if (b == NodeFilter.FilterResult.REMOVE) {
                    jVar2.mo29932h0();
                }
                jVar2 = R;
            } else {
                jVar2 = jVar2.mo29941t(0);
                i++;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000a A[LOOP:0: B:1:0x000a->B:4:0x001c, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m56226b(org.jsoup.select.NodeFilter r2, org.jsoup.select.Elements r3) {
        /*
            org.jsoup.helper.C12750d.m55073j(r2)
            org.jsoup.helper.C12750d.m55073j(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r3.next()
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.select.NodeFilter$FilterResult r0 = m56225a(r2, r0)
            org.jsoup.select.NodeFilter$FilterResult r1 = org.jsoup.select.NodeFilter.FilterResult.STOP
            if (r0 != r1) goto L_0x000a
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.C12956d.m56226b(org.jsoup.select.NodeFilter, org.jsoup.select.Elements):void");
    }

    /* renamed from: c */
    public static void m56227c(C12957e eVar, C12779j jVar) {
        C12750d.m55073j(eVar);
        C12750d.m55073j(jVar);
        C12779j jVar2 = jVar;
        int i = 0;
        while (jVar2 != null) {
            C12779j c0 = jVar2.mo29926c0();
            eVar.mo29627b(jVar2, i);
            if (c0 != null && !jVar2.mo29919L()) {
                jVar2 = c0.mo29941t(jVar2.mo29943v0());
            }
            if (jVar2.mo29805u() > 0) {
                jVar2 = jVar2.mo29941t(0);
                i++;
            } else {
                while (jVar2.mo29922R() == null && i > 0) {
                    eVar.mo29626a(jVar2, i);
                    jVar2 = jVar2.mo29926c0();
                    i--;
                }
                eVar.mo29626a(jVar2, i);
                if (jVar2 != jVar) {
                    jVar2 = jVar2.mo29922R();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m56228d(C12957e eVar, Elements elements) {
        C12750d.m55073j(eVar);
        C12750d.m55073j(elements);
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            m56227c(eVar, (Element) it.next());
        }
    }
}
