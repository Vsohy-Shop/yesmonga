package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.semantics.e */
public final class C16027e {
    @C12579k

    /* renamed from: b */
    public static final C16028a f39783b = new C16028a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f39784c = m72073d(0);

    /* renamed from: d */
    public static final int f39785d = m72073d(1);

    /* renamed from: a */
    public final int f39786a;

    /* renamed from: androidx.compose.ui.semantics.e$a */
    public static final class C16028a {
        public /* synthetic */ C16028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46108a() {
            return C16027e.f39785d;
        }

        /* renamed from: b */
        public final int mo46109b() {
            return C16027e.f39784c;
        }

        public C16028a() {
        }
    }

    public /* synthetic */ C16027e(int i) {
        this.f39786a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16027e m72072c(int i) {
        return new C16027e(i);
    }

    /* renamed from: d */
    public static int m72073d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m72074e(int i, Object obj) {
        return (obj instanceof C16027e) && i == ((C16027e) obj).mo46106i();
    }

    /* renamed from: f */
    public static final boolean m72075f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m72076g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m72077h(int i) {
        if (m72075f(i, f39784c)) {
            return "Polite";
        }
        if (m72075f(i, f39785d)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m72074e(this.f39786a, obj);
    }

    public int hashCode() {
        return m72076g(this.f39786a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo46106i() {
        return this.f39786a;
    }

    @C12579k
    public String toString() {
        return m72077h(this.f39786a);
    }
}
