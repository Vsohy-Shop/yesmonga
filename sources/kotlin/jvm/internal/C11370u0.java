package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.C11660u;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11290b;
import kotlin.jvm.functions.C11291c;
import kotlin.jvm.functions.C11292d;
import kotlin.jvm.functions.C11293e;
import kotlin.jvm.functions.C11294f;
import kotlin.jvm.functions.C11295g;
import kotlin.jvm.functions.C11296h;
import kotlin.jvm.functions.C11297i;
import kotlin.jvm.functions.C11298j;
import kotlin.jvm.functions.C11299k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11301m;
import kotlin.jvm.functions.C11302n;
import kotlin.jvm.functions.C11303o;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.functions.C11308t;
import kotlin.jvm.functions.C11309u;
import kotlin.jvm.functions.C11310v;
import kotlin.jvm.functions.C11311w;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.jvm.internal.markers.C11346b;
import kotlin.jvm.internal.markers.C11347c;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.jvm.internal.markers.C11349e;
import kotlin.jvm.internal.markers.C11350f;
import kotlin.jvm.internal.markers.C11351g;
import kotlin.jvm.internal.markers.C11353h;

/* renamed from: kotlin.jvm.internal.u0 */
public class C11370u0 {
    /* renamed from: A */
    public static int m43671A(Object obj) {
        if (obj instanceof C11320a0) {
            return ((C11320a0) obj).getArity();
        }
        if (obj instanceof C11289a) {
            return 0;
        }
        if (obj instanceof C11300l) {
            return 1;
        }
        if (obj instanceof C11304p) {
            return 2;
        }
        if (obj instanceof C11305q) {
            return 3;
        }
        if (obj instanceof C11306r) {
            return 4;
        }
        if (obj instanceof C11307s) {
            return 5;
        }
        if (obj instanceof C11308t) {
            return 6;
        }
        if (obj instanceof C11309u) {
            return 7;
        }
        if (obj instanceof C11310v) {
            return 8;
        }
        if (obj instanceof C11311w) {
            return 9;
        }
        if (obj instanceof C11290b) {
            return 10;
        }
        if (obj instanceof C11291c) {
            return 11;
        }
        if (obj instanceof C11292d) {
            return 12;
        }
        if (obj instanceof C11293e) {
            return 13;
        }
        if (obj instanceof C11294f) {
            return 14;
        }
        if (obj instanceof C11295g) {
            return 15;
        }
        if (obj instanceof C11296h) {
            return 16;
        }
        if (obj instanceof C11297i) {
            return 17;
        }
        if (obj instanceof C11298j) {
            return 18;
        }
        if (obj instanceof C11299k) {
            return 19;
        }
        if (obj instanceof C11301m) {
            return 20;
        }
        if (obj instanceof C11302n) {
            return 21;
        }
        if (obj instanceof C11303o) {
            return 22;
        }
        return -1;
    }

    /* renamed from: B */
    public static boolean m43672B(Object obj, int i) {
        return (obj instanceof C11660u) && m43671A(obj) == i;
    }

    /* renamed from: C */
    public static boolean m43673C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof C11345a) || (obj instanceof C11346b));
    }

    /* renamed from: D */
    public static boolean m43674D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof C11345a) || (obj instanceof C11347c));
    }

    /* renamed from: E */
    public static boolean m43675E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof C11345a) || (obj instanceof C11348d));
    }

    /* renamed from: F */
    public static boolean m43676F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof C11345a) || (obj instanceof C11349e));
    }

    /* renamed from: G */
    public static boolean m43677G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof C11345a) || (obj instanceof C11350f));
    }

    /* renamed from: H */
    public static boolean m43678H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof C11345a) || (obj instanceof C11351g));
    }

    /* renamed from: I */
    public static boolean m43679I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof C11345a) || (obj instanceof C11351g.C11352a));
    }

    /* renamed from: J */
    public static boolean m43680J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof C11345a) || (obj instanceof C11353h));
    }

    /* renamed from: K */
    public static <T extends Throwable> T m43681K(T t) {
        return Intrinsics.sanitizeStackTrace(t, C11370u0.class.getName());
    }

    /* renamed from: L */
    public static ClassCastException m43682L(ClassCastException classCastException) {
        throw ((ClassCastException) m43681K(classCastException));
    }

    /* renamed from: M */
    public static void m43683M(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m43684N(str2 + " cannot be cast to " + str);
    }

    /* renamed from: N */
    public static void m43684N(String str) {
        throw m43682L(new ClassCastException(str));
    }

    /* renamed from: a */
    public static Collection m43685a(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11346b)) {
            m43683M(obj, "kotlin.collections.MutableCollection");
        }
        return m43703s(obj);
    }

    /* renamed from: b */
    public static Collection m43686b(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11346b)) {
            m43684N(str);
        }
        return m43703s(obj);
    }

    /* renamed from: c */
    public static Iterable m43687c(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11347c)) {
            m43683M(obj, "kotlin.collections.MutableIterable");
        }
        return m43704t(obj);
    }

    /* renamed from: d */
    public static Iterable m43688d(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11347c)) {
            m43684N(str);
        }
        return m43704t(obj);
    }

    /* renamed from: e */
    public static Iterator m43689e(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11348d)) {
            m43683M(obj, "kotlin.collections.MutableIterator");
        }
        return m43705u(obj);
    }

    /* renamed from: f */
    public static Iterator m43690f(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11348d)) {
            m43684N(str);
        }
        return m43705u(obj);
    }

    /* renamed from: g */
    public static List m43691g(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11349e)) {
            m43683M(obj, "kotlin.collections.MutableList");
        }
        return m43706v(obj);
    }

    /* renamed from: h */
    public static List m43692h(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11349e)) {
            m43684N(str);
        }
        return m43706v(obj);
    }

    /* renamed from: i */
    public static ListIterator m43693i(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11350f)) {
            m43683M(obj, "kotlin.collections.MutableListIterator");
        }
        return m43707w(obj);
    }

    /* renamed from: j */
    public static ListIterator m43694j(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11350f)) {
            m43684N(str);
        }
        return m43707w(obj);
    }

    /* renamed from: k */
    public static Map m43695k(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11351g)) {
            m43683M(obj, "kotlin.collections.MutableMap");
        }
        return m43708x(obj);
    }

    /* renamed from: l */
    public static Map m43696l(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11351g)) {
            m43684N(str);
        }
        return m43708x(obj);
    }

    /* renamed from: m */
    public static Map.Entry m43697m(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11351g.C11352a)) {
            m43683M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m43709y(obj);
    }

    /* renamed from: n */
    public static Map.Entry m43698n(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11351g.C11352a)) {
            m43684N(str);
        }
        return m43709y(obj);
    }

    /* renamed from: o */
    public static Set m43699o(Object obj) {
        if ((obj instanceof C11345a) && !(obj instanceof C11353h)) {
            m43683M(obj, "kotlin.collections.MutableSet");
        }
        return m43710z(obj);
    }

    /* renamed from: p */
    public static Set m43700p(Object obj, String str) {
        if ((obj instanceof C11345a) && !(obj instanceof C11353h)) {
            m43684N(str);
        }
        return m43710z(obj);
    }

    /* renamed from: q */
    public static Object m43701q(Object obj, int i) {
        if (obj != null && !m43672B(obj, i)) {
            m43683M(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: r */
    public static Object m43702r(Object obj, int i, String str) {
        if (obj != null && !m43672B(obj, i)) {
            m43684N(str);
        }
        return obj;
    }

    /* renamed from: s */
    public static Collection m43703s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: t */
    public static Iterable m43704t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: u */
    public static Iterator m43705u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: v */
    public static List m43706v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: w */
    public static ListIterator m43707w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: x */
    public static Map m43708x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: y */
    public static Map.Entry m43709y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }

    /* renamed from: z */
    public static Set m43710z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m43682L(e);
        }
    }
}
