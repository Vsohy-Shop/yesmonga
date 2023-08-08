package androidx.compose.p004ui.text.style;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.style.k */
public final class C16436k {
    @C12579k

    /* renamed from: b */
    public static final C16437a f40732b = new C16437a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40733c = m74205g(1);

    /* renamed from: d */
    public static final int f40734d = m74205g(2);

    /* renamed from: e */
    public static final int f40735e = m74205g(3);

    /* renamed from: f */
    public static final int f40736f = m74205g(4);

    /* renamed from: g */
    public static final int f40737g = m74205g(5);

    /* renamed from: a */
    public final int f40738a;

    /* renamed from: androidx.compose.ui.text.style.k$a */
    public static final class C16437a {
        public /* synthetic */ C16437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47688a() {
            return C16436k.f40735e;
        }

        /* renamed from: b */
        public final int mo47689b() {
            return C16436k.f40736f;
        }

        /* renamed from: c */
        public final int mo47690c() {
            return C16436k.f40737g;
        }

        /* renamed from: d */
        public final int mo47691d() {
            return C16436k.f40733c;
        }

        /* renamed from: e */
        public final int mo47692e() {
            return C16436k.f40734d;
        }

        public C16437a() {
        }
    }

    public /* synthetic */ C16436k(int i) {
        this.f40738a = i;
    }

    /* renamed from: f */
    public static final /* synthetic */ C16436k m74204f(int i) {
        return new C16436k(i);
    }

    /* renamed from: g */
    public static int m74205g(int i) {
        return i;
    }

    /* renamed from: h */
    public static boolean m74206h(int i, Object obj) {
        return (obj instanceof C16436k) && i == ((C16436k) obj).mo47686l();
    }

    /* renamed from: i */
    public static final boolean m74207i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m74208j(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: k */
    public static String m74209k(int i) {
        if (m74207i(i, f40733c)) {
            return "Ltr";
        }
        if (m74207i(i, f40734d)) {
            return "Rtl";
        }
        if (m74207i(i, f40735e)) {
            return "Content";
        }
        if (m74207i(i, f40736f)) {
            return "ContentOrLtr";
        }
        if (m74207i(i, f40737g)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74206h(this.f40738a, obj);
    }

    public int hashCode() {
        return m74208j(this.f40738a);
    }

    /* renamed from: l */
    public final /* synthetic */ int mo47686l() {
        return this.f40738a;
    }

    @C12579k
    public String toString() {
        return m74209k(this.f40738a);
    }
}
