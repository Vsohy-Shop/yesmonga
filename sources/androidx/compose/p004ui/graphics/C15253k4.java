package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.k4 */
public final class C15253k4 {
    @C12579k

    /* renamed from: b */
    public static final C15254a f37575b = new C15254a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37576c = m66163e(0);

    /* renamed from: d */
    public static final int f37577d = m66163e(1);

    /* renamed from: e */
    public static final int f37578e = m66163e(2);

    /* renamed from: a */
    public final int f37579a;

    /* renamed from: androidx.compose.ui.graphics.k4$a */
    public static final class C15254a {
        public /* synthetic */ C15254a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42879a() {
            return C15253k4.f37578e;
        }

        /* renamed from: b */
        public final int mo42880b() {
            return C15253k4.f37576c;
        }

        /* renamed from: c */
        public final int mo42881c() {
            return C15253k4.f37577d;
        }

        public C15254a() {
        }
    }

    public /* synthetic */ C15253k4(int i) {
        this.f37579a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15253k4 m66162d(int i) {
        return new C15253k4(i);
    }

    /* renamed from: e */
    public static int m66163e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66164f(int i, Object obj) {
        return (obj instanceof C15253k4) && i == ((C15253k4) obj).mo42877j();
    }

    /* renamed from: g */
    public static final boolean m66165g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66166h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m66167i(int i) {
        if (m66165g(i, f37576c)) {
            return "Miter";
        }
        if (m66165g(i, f37577d)) {
            return "Round";
        }
        if (m66165g(i, f37578e)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66164f(this.f37579a, obj);
    }

    public int hashCode() {
        return m66166h(this.f37579a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42877j() {
        return this.f37579a;
    }

    @C12579k
    public String toString() {
        return m66167i(this.f37579a);
    }
}
