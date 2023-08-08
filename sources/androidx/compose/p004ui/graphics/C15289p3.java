package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.p3 */
public final class C15289p3 {
    @C12579k

    /* renamed from: b */
    public static final C15290a f37622b = new C15290a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37623c = m66392e(0);

    /* renamed from: d */
    public static final int f37624d = m66392e(1);

    /* renamed from: e */
    public static final int f37625e = m66392e(2);

    /* renamed from: a */
    public final int f37626a;

    /* renamed from: androidx.compose.ui.graphics.p3$a */
    public static final class C15290a {
        public /* synthetic */ C15290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42939a() {
            return C15289p3.f37624d;
        }

        /* renamed from: b */
        public final int mo42940b() {
            return C15289p3.f37623c;
        }

        /* renamed from: c */
        public final int mo42941c() {
            return C15289p3.f37625e;
        }

        public C15290a() {
        }
    }

    public /* synthetic */ C15289p3(int i) {
        this.f37626a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15289p3 m66391d(int i) {
        return new C15289p3(i);
    }

    /* renamed from: e */
    public static int m66392e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66393f(int i, Object obj) {
        return (obj instanceof C15289p3) && i == ((C15289p3) obj).mo42937j();
    }

    /* renamed from: g */
    public static final boolean m66394g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66395h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m66396i(int i) {
        if (m66394g(i, f37623c)) {
            return "Points";
        }
        if (m66394g(i, f37624d)) {
            return "Lines";
        }
        if (m66394g(i, f37625e)) {
            return "Polygon";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66393f(this.f37626a, obj);
    }

    public int hashCode() {
        return m66395h(this.f37626a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42937j() {
        return this.f37626a;
    }

    @C12579k
    public String toString() {
        return m66396i(this.f37626a);
    }
}
