package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.q4 */
public final class C15302q4 {
    @C12579k

    /* renamed from: b */
    public static final C15303a f37653b = new C15303a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37654c = m66461e(0);

    /* renamed from: d */
    public static final int f37655d = m66461e(1);

    /* renamed from: e */
    public static final int f37656e = m66461e(2);

    /* renamed from: a */
    public final int f37657a;

    /* renamed from: androidx.compose.ui.graphics.q4$a */
    public static final class C15303a {
        public /* synthetic */ C15303a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42980a() {
            return C15302q4.f37656e;
        }

        /* renamed from: b */
        public final int mo42981b() {
            return C15302q4.f37655d;
        }

        /* renamed from: c */
        public final int mo42982c() {
            return C15302q4.f37654c;
        }

        public C15303a() {
        }
    }

    public /* synthetic */ C15302q4(int i) {
        this.f37657a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15302q4 m66460d(int i) {
        return new C15302q4(i);
    }

    /* renamed from: e */
    public static int m66461e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66462f(int i, Object obj) {
        return (obj instanceof C15302q4) && i == ((C15302q4) obj).mo42978j();
    }

    /* renamed from: g */
    public static final boolean m66463g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66464h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m66465i(int i) {
        if (m66463g(i, f37654c)) {
            return "Triangles";
        }
        if (m66463g(i, f37655d)) {
            return "TriangleStrip";
        }
        if (m66463g(i, f37656e)) {
            return "TriangleFan";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66462f(this.f37657a, obj);
    }

    public int hashCode() {
        return m66464h(this.f37657a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42978j() {
        return this.f37657a;
    }

    @C12579k
    public String toString() {
        return m66465i(this.f37657a);
    }
}
