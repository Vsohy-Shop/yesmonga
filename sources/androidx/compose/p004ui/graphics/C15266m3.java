package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.m3 */
public final class C15266m3 {
    @C12579k

    /* renamed from: b */
    public static final C15267a f37589b = new C15267a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37590c = m66259g(0);

    /* renamed from: d */
    public static final int f37591d = m66259g(1);

    /* renamed from: e */
    public static final int f37592e = m66259g(2);

    /* renamed from: f */
    public static final int f37593f = m66259g(3);

    /* renamed from: g */
    public static final int f37594g = m66259g(4);

    /* renamed from: a */
    public final int f37595a;

    /* renamed from: androidx.compose.ui.graphics.m3$a */
    public static final class C15267a {
        public /* synthetic */ C15267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42899a() {
            return C15266m3.f37590c;
        }

        /* renamed from: b */
        public final int mo42900b() {
            return C15266m3.f37591d;
        }

        /* renamed from: c */
        public final int mo42901c() {
            return C15266m3.f37594g;
        }

        /* renamed from: d */
        public final int mo42902d() {
            return C15266m3.f37592e;
        }

        /* renamed from: e */
        public final int mo42903e() {
            return C15266m3.f37593f;
        }

        public C15267a() {
        }
    }

    public /* synthetic */ C15266m3(int i) {
        this.f37595a = i;
    }

    /* renamed from: f */
    public static final /* synthetic */ C15266m3 m66258f(int i) {
        return new C15266m3(i);
    }

    /* renamed from: g */
    public static int m66259g(int i) {
        return i;
    }

    /* renamed from: h */
    public static boolean m66260h(int i, Object obj) {
        return (obj instanceof C15266m3) && i == ((C15266m3) obj).mo42897l();
    }

    /* renamed from: i */
    public static final boolean m66261i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m66262j(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: k */
    public static String m66263k(int i) {
        if (m66261i(i, f37590c)) {
            return "Difference";
        }
        if (m66261i(i, f37591d)) {
            return "Intersect";
        }
        if (m66261i(i, f37592e)) {
            return "Union";
        }
        if (m66261i(i, f37593f)) {
            return "Xor";
        }
        if (m66261i(i, f37594g)) {
            return "ReverseDifference";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66260h(this.f37595a, obj);
    }

    public int hashCode() {
        return m66262j(this.f37595a);
    }

    /* renamed from: l */
    public final /* synthetic */ int mo42897l() {
        return this.f37595a;
    }

    @C12579k
    public String toString() {
        return m66263k(this.f37595a);
    }
}
