package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.k3 */
public final class C15251k3 {
    @C12579k

    /* renamed from: b */
    public static final C15252a f37571b = new C15252a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37572c = m66151d(0);

    /* renamed from: d */
    public static final int f37573d = m66151d(1);

    /* renamed from: a */
    public final int f37574a;

    /* renamed from: androidx.compose.ui.graphics.k3$a */
    public static final class C15252a {
        public /* synthetic */ C15252a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42873a() {
            return C15251k3.f37573d;
        }

        /* renamed from: b */
        public final int mo42874b() {
            return C15251k3.f37572c;
        }

        public C15252a() {
        }
    }

    public /* synthetic */ C15251k3(int i) {
        this.f37574a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C15251k3 m66150c(int i) {
        return new C15251k3(i);
    }

    /* renamed from: d */
    public static int m66151d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m66152e(int i, Object obj) {
        return (obj instanceof C15251k3) && i == ((C15251k3) obj).mo42871i();
    }

    /* renamed from: f */
    public static final boolean m66153f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m66154g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m66155h(int i) {
        if (m66153f(i, f37572c)) {
            return "NonZero";
        }
        if (m66153f(i, f37573d)) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66152e(this.f37574a, obj);
    }

    public int hashCode() {
        return m66154g(this.f37574a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo42871i() {
        return this.f37574a;
    }

    @C12579k
    public String toString() {
        return m66155h(this.f37574a);
    }
}
