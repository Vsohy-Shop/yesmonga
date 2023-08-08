package androidx.compose.foundation;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C2855v
/* renamed from: androidx.compose.foundation.f0 */
public final class C2120f0 {
    @C12579k

    /* renamed from: b */
    public static final C2121a f5809b = new C2121a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f5810c = m9147d(0);

    /* renamed from: d */
    public static final int f5811d = m9147d(1);

    /* renamed from: a */
    public final int f5812a;

    /* renamed from: androidx.compose.foundation.f0$a */
    public static final class C2121a {
        public /* synthetic */ C2121a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C2855v
        /* renamed from: b */
        public static /* synthetic */ void m9153b() {
        }

        @C2855v
        /* renamed from: d */
        public static /* synthetic */ void m9154d() {
        }

        @C2855v
        /* renamed from: a */
        public final int mo7307a() {
            return C2120f0.f5810c;
        }

        @C2855v
        /* renamed from: c */
        public final int mo7308c() {
            return C2120f0.f5811d;
        }

        public C2121a() {
        }
    }

    public /* synthetic */ C2120f0(int i) {
        this.f5812a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C2120f0 m9146c(int i) {
        return new C2120f0(i);
    }

    /* renamed from: d */
    public static int m9147d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m9148e(int i, Object obj) {
        return (obj instanceof C2120f0) && i == ((C2120f0) obj).mo7305i();
    }

    /* renamed from: f */
    public static final boolean m9149f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m9150g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m9151h(int i) {
        if (m9149f(i, f5810c)) {
            return "Immediately";
        }
        if (m9149f(i, f5811d)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i).toString());
    }

    public boolean equals(Object obj) {
        return m9148e(this.f5812a, obj);
    }

    public int hashCode() {
        return m9150g(this.f5812a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo7305i() {
        return this.f5812a;
    }

    @C12579k
    public String toString() {
        return m9151h(this.f5812a);
    }
}
