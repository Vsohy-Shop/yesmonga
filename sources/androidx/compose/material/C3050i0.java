package androidx.compose.material;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.material.i0 */
public final class C3050i0 {
    @C12579k

    /* renamed from: b */
    public static final C3051a f8146b = new C3051a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f8147c = m14310d(0);

    /* renamed from: d */
    public static final int f8148d = m14310d(1);

    /* renamed from: a */
    public final int f8149a;

    /* renamed from: androidx.compose.material.i0$a */
    public static final class C3051a {
        public /* synthetic */ C3051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo10792a() {
            return C3050i0.f8147c;
        }

        /* renamed from: b */
        public final int mo10793b() {
            return C3050i0.f8148d;
        }

        public C3051a() {
        }
    }

    public /* synthetic */ C3050i0(int i) {
        this.f8149a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C3050i0 m14309c(int i) {
        return new C3050i0(i);
    }

    /* renamed from: d */
    public static int m14310d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m14311e(int i, Object obj) {
        return (obj instanceof C3050i0) && i == ((C3050i0) obj).mo10790i();
    }

    /* renamed from: f */
    public static final boolean m14312f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m14313g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m14314h(int i) {
        return m14312f(i, f8147c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m14311e(this.f8149a, obj);
    }

    public int hashCode() {
        return m14313g(this.f8149a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo10790i() {
        return this.f8149a;
    }

    @C12579k
    public String toString() {
        return m14314h(this.f8149a);
    }
}
