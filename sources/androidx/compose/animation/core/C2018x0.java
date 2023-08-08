package androidx.compose.animation.core;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.animation.core.x0 */
public final class C2018x0 {
    @C12579k

    /* renamed from: b */
    public static final C2019a f5639b = new C2019a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f5640c = m8662d(-1);

    /* renamed from: d */
    public static final int f5641d = m8662d(1);

    /* renamed from: a */
    public final int f5642a;

    /* renamed from: androidx.compose.animation.core.x0$a */
    public static final class C2019a {
        public /* synthetic */ C2019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo7005a() {
            return C2018x0.f5640c;
        }

        /* renamed from: b */
        public final int mo7006b() {
            return C2018x0.f5641d;
        }

        public C2019a() {
        }
    }

    public /* synthetic */ C2018x0(int i) {
        this.f5642a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C2018x0 m8661c(int i) {
        return new C2018x0(i);
    }

    /* renamed from: d */
    public static int m8662d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m8663e(int i, Object obj) {
        return (obj instanceof C2018x0) && i == ((C2018x0) obj).mo7003i();
    }

    /* renamed from: f */
    public static final boolean m8664f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m8665g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m8666h(int i) {
        return "StartOffsetType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m8663e(this.f5642a, obj);
    }

    public int hashCode() {
        return m8665g(this.f5642a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo7003i() {
        return this.f5642a;
    }

    public String toString() {
        return m8666h(this.f5642a);
    }
}
