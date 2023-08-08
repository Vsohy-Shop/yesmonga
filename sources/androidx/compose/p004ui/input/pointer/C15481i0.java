package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.i0 */
public final class C15481i0 {
    @C12579k

    /* renamed from: b */
    public static final C15482a f38500b = new C15482a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38501c = m68618g(0);

    /* renamed from: d */
    public static final int f38502d = m68618g(1);

    /* renamed from: e */
    public static final int f38503e = m68618g(2);

    /* renamed from: f */
    public static final int f38504f = m68618g(3);

    /* renamed from: g */
    public static final int f38505g = m68618g(4);

    /* renamed from: a */
    public final int f38506a;

    /* renamed from: androidx.compose.ui.input.pointer.i0$a */
    public static final class C15482a {
        public /* synthetic */ C15482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo44072a() {
            return C15481i0.f38505g;
        }

        /* renamed from: b */
        public final int mo44073b() {
            return C15481i0.f38503e;
        }

        /* renamed from: c */
        public final int mo44074c() {
            return C15481i0.f38504f;
        }

        /* renamed from: d */
        public final int mo44075d() {
            return C15481i0.f38502d;
        }

        /* renamed from: e */
        public final int mo44076e() {
            return C15481i0.f38501c;
        }

        public C15482a() {
        }
    }

    public /* synthetic */ C15481i0(int i) {
        this.f38506a = i;
    }

    /* renamed from: f */
    public static final /* synthetic */ C15481i0 m68617f(int i) {
        return new C15481i0(i);
    }

    /* renamed from: g */
    public static int m68618g(int i) {
        return i;
    }

    /* renamed from: h */
    public static boolean m68619h(int i, Object obj) {
        return (obj instanceof C15481i0) && i == ((C15481i0) obj).mo44070l();
    }

    /* renamed from: i */
    public static final boolean m68620i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m68621j(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: k */
    public static String m68622k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m68619h(this.f38506a, obj);
    }

    public int hashCode() {
        return m68621j(this.f38506a);
    }

    /* renamed from: l */
    public final /* synthetic */ int mo44070l() {
        return this.f38506a;
    }

    @C12579k
    public String toString() {
        return m68622k(this.f38506a);
    }
}
