package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12766a;
import org.jsoup.nodes.C12773d;
import org.jsoup.nodes.C12775f;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12782l;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.C12784n;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C12893f;

/* renamed from: org.jsoup.select.c */
public abstract class C12918c {

    /* renamed from: org.jsoup.select.c$a */
    public static final class C12919a extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* renamed from: org.jsoup.select.c$a0 */
    public static final class C12920a0 extends C12944o {
        public C12920a0(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: b */
        public int mo30375b(Element element, Element element2) {
            if (element2.mo29760b0() == null) {
                return 0;
            }
            return element2.mo29760b0().mo29752Y0().size() - element2.mo29792o1();
        }

        /* renamed from: c */
        public String mo30376c() {
            return "nth-last-child";
        }
    }

    /* renamed from: org.jsoup.select.c$b */
    public static final class C12921b extends C12918c {

        /* renamed from: a */
        public final String f31942a;

        public C12921b(String str) {
            this.f31942a = str;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31942a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.f31942a});
        }
    }

    /* renamed from: org.jsoup.select.c$b0 */
    public static class C12922b0 extends C12944o {
        public C12922b0(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: b */
        public int mo30375b(Element element, Element element2) {
            int i = 0;
            if (element2.mo29760b0() == null) {
                return 0;
            }
            Elements Y0 = element2.mo29760b0().mo29752Y0();
            for (int o1 = element2.mo29792o1(); o1 < Y0.size(); o1++) {
                if (((Element) Y0.get(o1)).mo29742U2().equals(element2.mo29742U2())) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: c */
        public String mo30376c() {
            return "nth-last-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$c */
    public static abstract class C12923c extends C12918c {

        /* renamed from: a */
        public String f31943a;

        /* renamed from: b */
        public String f31944b;

        public C12923c(String str, String str2) {
            this(str, str2, true);
        }

        public C12923c(String str, String str2, boolean z) {
            C12750d.m55071h(str);
            C12750d.m55071h(str2);
            this.f31943a = C12757d.m55099b(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.f31944b = z ? C12757d.m55099b(str2) : C12757d.m55100c(str2, z2);
        }
    }

    /* renamed from: org.jsoup.select.c$c0 */
    public static class C12924c0 extends C12944o {
        public C12924c0(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: b */
        public int mo30375b(Element element, Element element2) {
            int i = 0;
            if (element2.mo29760b0() == null) {
                return 0;
            }
            Iterator it = element2.mo29760b0().mo29752Y0().iterator();
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3.mo29742U2().equals(element2.mo29742U2())) {
                    i++;
                    continue;
                }
                if (element3 == element2) {
                    break;
                }
            }
            return i;
        }

        /* renamed from: c */
        public String mo30376c() {
            return "nth-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$d */
    public static final class C12925d extends C12918c {

        /* renamed from: a */
        public final String f31945a;

        public C12925d(String str) {
            C12750d.m55071h(str);
            this.f31945a = C12757d.m55098a(str);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            for (C12766a e : element2.mo29784l().mo29853Y()) {
                if (C12757d.m55098a(e.getKey()).startsWith(this.f31945a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.f31945a});
        }
    }

    /* renamed from: org.jsoup.select.c$d0 */
    public static final class C12926d0 extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2 = element2.mo29760b0();
            if (u2 == null || (u2 instanceof Document) || !element2.mo29736S2().isEmpty()) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* renamed from: org.jsoup.select.c$e */
    public static final class C12927e extends C12923c {
        public C12927e(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31943a) && this.f31944b.equalsIgnoreCase(element2.mo29896j(this.f31943a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.f31943a, this.f31944b});
        }
    }

    /* renamed from: org.jsoup.select.c$e0 */
    public static final class C12928e0 extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2 = element2.mo29760b0();
            if (u2 == null || (u2 instanceof Document)) {
                return false;
            }
            Iterator it = u2.mo29752Y0().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((Element) it.next()).mo29742U2().equals(element2.mo29742U2())) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$f */
    public static final class C12929f extends C12923c {
        public C12929f(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31943a) && C12757d.m55098a(element2.mo29896j(this.f31943a)).contains(this.f31944b);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.f31943a, this.f31944b});
        }
    }

    /* renamed from: org.jsoup.select.c$f0 */
    public static final class C12930f0 extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.mo29746W0(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    /* renamed from: org.jsoup.select.c$g */
    public static final class C12931g extends C12923c {
        public C12931g(String str, String str2) {
            super(str, str2, false);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31943a) && C12757d.m55098a(element2.mo29896j(this.f31943a)).endsWith(this.f31944b);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.f31943a, this.f31944b});
        }
    }

    /* renamed from: org.jsoup.select.c$g0 */
    public static final class C12932g0 extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            if (element2 instanceof C12782l) {
                return true;
            }
            for (C12783m next : element2.mo29756Z2()) {
                C12782l lVar = new C12782l(C12893f.m55949v(element2.mo29745V2()), element2.mo29787n(), element2.mo29784l());
                next.mo29937m0(lVar);
                lVar.mo29713J0(next);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* renamed from: org.jsoup.select.c$h */
    public static final class C12933h extends C12918c {

        /* renamed from: a */
        public String f31946a;

        /* renamed from: b */
        public Pattern f31947b;

        public C12933h(String str, Pattern pattern) {
            this.f31946a = C12757d.m55099b(str);
            this.f31947b = pattern;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31946a) && this.f31947b.matcher(element2.mo29896j(this.f31946a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.f31946a, this.f31947b.toString()});
        }
    }

    /* renamed from: org.jsoup.select.c$h0 */
    public static final class C12934h0 extends C12918c {

        /* renamed from: a */
        public final Pattern f31948a;

        public C12934h0(Pattern pattern) {
            this.f31948a = pattern;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return this.f31948a.matcher(element2.mo29750X2()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", new Object[]{this.f31948a});
        }
    }

    /* renamed from: org.jsoup.select.c$i */
    public static final class C12935i extends C12923c {
        public C12935i(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return !this.f31944b.equalsIgnoreCase(element2.mo29896j(this.f31943a));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.f31943a, this.f31944b});
        }
    }

    /* renamed from: org.jsoup.select.c$i0 */
    public static final class C12936i0 extends C12918c {

        /* renamed from: a */
        public final Pattern f31949a;

        public C12936i0(Pattern pattern) {
            this.f31949a = pattern;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return this.f31949a.matcher(element2.mo29802s2()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.f31949a});
        }
    }

    /* renamed from: org.jsoup.select.c$j */
    public static final class C12937j extends C12923c {
        public C12937j(String str, String str2) {
            super(str, str2, false);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29892J(this.f31943a) && C12757d.m55098a(element2.mo29896j(this.f31943a)).startsWith(this.f31944b);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.f31943a, this.f31944b});
        }
    }

    /* renamed from: org.jsoup.select.c$j0 */
    public static final class C12938j0 extends C12918c {

        /* renamed from: a */
        public final String f31950a;

        public C12938j0(String str) {
            this.f31950a = str;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29799r2().equals(this.f31950a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f31950a});
        }
    }

    /* renamed from: org.jsoup.select.c$k */
    public static final class C12939k extends C12918c {

        /* renamed from: a */
        public final String f31951a;

        public C12939k(String str) {
            this.f31951a = str;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29739T1(this.f31951a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.f31951a});
        }
    }

    /* renamed from: org.jsoup.select.c$k0 */
    public static final class C12940k0 extends C12918c {

        /* renamed from: a */
        public final String f31952a;

        public C12940k0(String str) {
            this.f31952a = str;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29799r2().endsWith(this.f31952a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f31952a});
        }
    }

    /* renamed from: org.jsoup.select.c$l */
    public static final class C12941l extends C12918c {

        /* renamed from: a */
        public final String f31953a;

        public C12941l(String str) {
            this.f31953a = C12757d.m55098a(str);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return C12757d.m55098a(element2.mo29779i1()).contains(this.f31953a);
        }

        public String toString() {
            return String.format(":containsData(%s)", new Object[]{this.f31953a});
        }
    }

    /* renamed from: org.jsoup.select.c$m */
    public static final class C12942m extends C12918c {

        /* renamed from: a */
        public final String f31954a;

        public C12942m(String str) {
            this.f31954a = C12757d.m55098a(C12759f.m55114n(str));
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return C12757d.m55098a(element2.mo29802s2()).contains(this.f31954a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.f31954a});
        }
    }

    /* renamed from: org.jsoup.select.c$n */
    public static final class C12943n extends C12918c {

        /* renamed from: a */
        public final String f31955a;

        public C12943n(String str) {
            this.f31955a = C12757d.m55098a(C12759f.m55114n(str));
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return C12757d.m55098a(element2.mo29750X2()).contains(this.f31955a);
        }

        public String toString() {
            return String.format(":contains(%s)", new Object[]{this.f31955a});
        }
    }

    /* renamed from: org.jsoup.select.c$p */
    public static final class C12945p extends C12918c {

        /* renamed from: a */
        public final String f31958a;

        public C12945p(String str) {
            this.f31958a = str;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return this.f31958a.equals(element2.mo29755Z1());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f31958a});
        }
    }

    /* renamed from: org.jsoup.select.c$q */
    public static final class C12946q extends C12947r {
        public C12946q(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29792o1() == this.f31959a;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.f31959a)});
        }
    }

    /* renamed from: org.jsoup.select.c$r */
    public static abstract class C12947r extends C12918c {

        /* renamed from: a */
        public int f31959a;

        public C12947r(int i) {
            this.f31959a = i;
        }
    }

    /* renamed from: org.jsoup.select.c$s */
    public static final class C12948s extends C12947r {
        public C12948s(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element2.mo29792o1() > this.f31959a;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.f31959a)});
        }
    }

    /* renamed from: org.jsoup.select.c$t */
    public static final class C12949t extends C12947r {
        public C12949t(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            return element != element2 && element2.mo29792o1() < this.f31959a;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.f31959a)});
        }
    }

    /* renamed from: org.jsoup.select.c$u */
    public static final class C12950u extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            for (C12779j next : element2.mo29942v()) {
                if (!(next instanceof C12773d) && !(next instanceof C12784n) && !(next instanceof C12775f)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* renamed from: org.jsoup.select.c$v */
    public static final class C12951v extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2 = element2.mo29760b0();
            if (u2 == null || (u2 instanceof Document) || element2.mo29792o1() != 0) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* renamed from: org.jsoup.select.c$w */
    public static final class C12952w extends C12924c0 {
        public C12952w() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$x */
    public static final class C12953x extends C12918c {
        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2 = element2.mo29760b0();
            if (u2 == null || (u2 instanceof Document) || element2.mo29792o1() != u2.mo29752Y0().size() - 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* renamed from: org.jsoup.select.c$y */
    public static final class C12954y extends C12922b0 {
        public C12954y() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    /* renamed from: org.jsoup.select.c$z */
    public static final class C12955z extends C12944o {
        public C12955z(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: b */
        public int mo30375b(Element element, Element element2) {
            return element2.mo29792o1() + 1;
        }

        /* renamed from: c */
        public String mo30376c() {
            return "nth-child";
        }
    }

    /* renamed from: a */
    public abstract boolean mo30370a(Element element, Element element2);

    /* renamed from: org.jsoup.select.c$o */
    public static abstract class C12944o extends C12918c {

        /* renamed from: a */
        public final int f31956a;

        /* renamed from: b */
        public final int f31957b;

        public C12944o(int i, int i2) {
            this.f31956a = i;
            this.f31957b = i2;
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            Element u2 = element2.mo29760b0();
            if (u2 == null || (u2 instanceof Document)) {
                return false;
            }
            int b = mo30375b(element, element2);
            int i = this.f31956a;
            if (i != 0) {
                int i2 = this.f31957b;
                if ((b - i2) * i < 0 || (b - i2) % i != 0) {
                    return false;
                }
                return true;
            } else if (b == this.f31957b) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public abstract int mo30375b(Element element, Element element2);

        /* renamed from: c */
        public abstract String mo30376c();

        public String toString() {
            if (this.f31956a == 0) {
                return String.format(":%s(%d)", new Object[]{mo30376c(), Integer.valueOf(this.f31957b)});
            } else if (this.f31957b == 0) {
                return String.format(":%s(%dn)", new Object[]{mo30376c(), Integer.valueOf(this.f31956a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{mo30376c(), Integer.valueOf(this.f31956a), Integer.valueOf(this.f31957b)});
            }
        }

        public C12944o(int i) {
            this(0, i);
        }
    }
}
