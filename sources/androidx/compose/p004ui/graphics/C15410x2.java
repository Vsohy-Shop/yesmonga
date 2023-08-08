package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.x2 */
public final class C15410x2 {
    @C12579k

    /* renamed from: b */
    public static final C15411a f38097b = new C15411a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38098c = m67285g(0);

    /* renamed from: d */
    public static final int f38099d = m67285g(1);

    /* renamed from: e */
    public static final int f38100e = m67285g(2);

    /* renamed from: f */
    public static final int f38101f = m67285g(3);

    /* renamed from: g */
    public static final int f38102g = m67285g(4);

    /* renamed from: a */
    public final int f38103a;

    /* renamed from: androidx.compose.ui.graphics.x2$a */
    public static final class C15411a {
        public /* synthetic */ C15411a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo43576a() {
            return C15410x2.f38099d;
        }

        /* renamed from: b */
        public final int mo43577b() {
            return C15410x2.f38098c;
        }

        /* renamed from: c */
        public final int mo43578c() {
            return C15410x2.f38101f;
        }

        /* renamed from: d */
        public final int mo43579d() {
            return C15410x2.f38102g;
        }

        /* renamed from: e */
        public final int mo43580e() {
            return C15410x2.f38100e;
        }

        public C15411a() {
        }
    }

    public /* synthetic */ C15410x2(int i) {
        this.f38103a = i;
    }

    /* renamed from: f */
    public static final /* synthetic */ C15410x2 m67284f(int i) {
        return new C15410x2(i);
    }

    /* renamed from: g */
    public static int m67285g(int i) {
        return i;
    }

    /* renamed from: h */
    public static boolean m67286h(int i, Object obj) {
        return (obj instanceof C15410x2) && i == ((C15410x2) obj).mo43574m();
    }

    /* renamed from: i */
    public static final boolean m67287i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static int m67288k(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: l */
    public static String m67289l(int i) {
        if (m67287i(i, f38098c)) {
            return "Argb8888";
        }
        if (m67287i(i, f38099d)) {
            return "Alpha8";
        }
        if (m67287i(i, f38100e)) {
            return "Rgb565";
        }
        if (m67287i(i, f38101f)) {
            return "F16";
        }
        if (m67287i(i, f38102g)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m67286h(this.f38103a, obj);
    }

    public int hashCode() {
        return m67288k(this.f38103a);
    }

    /* renamed from: j */
    public final int mo43573j() {
        return this.f38103a;
    }

    /* renamed from: m */
    public final /* synthetic */ int mo43574m() {
        return this.f38103a;
    }

    @C12579k
    public String toString() {
        return m67289l(this.f38103a);
    }
}
