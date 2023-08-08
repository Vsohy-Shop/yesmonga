package org.jsoup.select;

import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.Element;
import org.jsoup.select.C12912a;

/* renamed from: org.jsoup.select.g */
public abstract class C12959g extends C12918c {

    /* renamed from: a */
    public C12918c f31969a;

    /* renamed from: org.jsoup.select.g$a */
    public static class C12960a extends C12959g {

        /* renamed from: b */
        public final C12912a.C12914b f31970b;

        public C12960a(C12918c cVar) {
            this.f31969a = cVar;
            this.f31970b = new C12912a.C12914b(cVar);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            for (int i = 0; i < element2.mo29805u(); i++) {
                C12779j t = element2.mo29941t(i);
                if ((t instanceof Element) && this.f31970b.mo30366c(element2, (Element) t) != null) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$b */
    public static class C12961b extends C12959g {
        public C12961b(C12918c cVar) {
            this.f31969a = cVar;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2;
            if (element == element2 || (u2 = element2.mo29760b0()) == null || !this.f31969a.mo30370a(element, u2)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s > ", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$c */
    public static class C12962c extends C12959g {
        public C12962c(C12918c cVar) {
            this.f31969a = cVar;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element E2;
            if (element == element2 || (E2 = element2.mo29698E2()) == null || !this.f31969a.mo30370a(element, E2)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s + ", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$d */
    public static class C12963d extends C12959g {
        public C12963d(C12918c cVar) {
            this.f31969a = cVar;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return !this.f31969a.mo30370a(element, element2);
        }

        public String toString() {
            return String.format(":not(%s)", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$e */
    public static class C12964e extends C12959g {
        public C12964e(C12918c cVar) {
            this.f31969a = cVar;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element u2 = element2.mo29760b0(); u2 != null; u2 = u2.mo29760b0()) {
                if (this.f31969a.mo30370a(element, u2)) {
                    return true;
                }
                if (u2 == element) {
                    break;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$f */
    public static class C12965f extends C12959g {
        public C12965f(C12918c cVar) {
            this.f31969a = cVar;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element E2 = element2.mo29698E2(); E2 != null; E2 = E2.mo29698E2()) {
                if (this.f31969a.mo30370a(element, E2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", new Object[]{this.f31969a});
        }
    }

    /* renamed from: org.jsoup.select.g$g */
    public static class C12966g extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element == element2;
        }
    }
}
