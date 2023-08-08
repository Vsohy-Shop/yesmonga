package org.jsoup.select;

import javax.annotation.Nullable;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeFilter;

/* renamed from: org.jsoup.select.a */
public class C12912a {

    /* renamed from: org.jsoup.select.a$a */
    public static class C12913a implements C12957e {

        /* renamed from: a */
        public final Element f31934a;

        /* renamed from: b */
        public final Elements f31935b;

        /* renamed from: c */
        public final C12918c f31936c;

        public C12913a(Element element, Elements elements, C12918c cVar) {
            this.f31934a = element;
            this.f31935b = elements;
            this.f31936c = cVar;
        }

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            if (jVar instanceof Element) {
                Element element = (Element) jVar;
                if (this.f31936c.mo30370a(this.f31934a, element)) {
                    this.f31935b.add(element);
                }
            }
        }
    }

    /* renamed from: org.jsoup.select.a$b */
    public static class C12914b implements NodeFilter {
        @Nullable

        /* renamed from: a */
        public Element f31937a = null;
        @Nullable

        /* renamed from: b */
        public Element f31938b = null;

        /* renamed from: c */
        public final C12918c f31939c;

        public C12914b(C12918c cVar) {
            this.f31939c = cVar;
        }

        /* renamed from: a */
        public NodeFilter.FilterResult mo30364a(C12779j jVar, int i) {
            return NodeFilter.FilterResult.CONTINUE;
        }

        /* renamed from: b */
        public NodeFilter.FilterResult mo30365b(C12779j jVar, int i) {
            if (jVar instanceof Element) {
                Element element = (Element) jVar;
                if (this.f31939c.mo30370a(this.f31937a, element)) {
                    this.f31938b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }

        @Nullable
        /* renamed from: c */
        public Element mo30366c(Element element, Element element2) {
            this.f31937a = element;
            this.f31938b = null;
            C12956d.m56225a(this, element2);
            return this.f31938b;
        }
    }

    /* renamed from: a */
    public static Elements m56172a(C12918c cVar, Element element) {
        Elements elements = new Elements();
        C12956d.m56227c(new C12913a(element, elements, cVar), element);
        return elements;
    }

    @Nullable
    /* renamed from: b */
    public static Element m56173b(C12918c cVar, Element element) {
        return new C12914b(cVar).mo30366c(element, element);
    }
}
