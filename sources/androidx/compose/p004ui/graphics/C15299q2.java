package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.q2 */
public final class C15299q2 {
    @C12579k

    /* renamed from: b */
    public static final C15300a f37647b = new C15300a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37648c = m66446f(0);

    /* renamed from: d */
    public static final int f37649d = m66446f(1);

    /* renamed from: e */
    public static final int f37650e = m66446f(2);

    /* renamed from: f */
    public static final int f37651f = m66446f(3);

    /* renamed from: a */
    public final int f37652a;

    /* renamed from: androidx.compose.ui.graphics.q2$a */
    public static final class C15300a {
        public /* synthetic */ C15300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42972a() {
            return C15299q2.f37651f;
        }

        /* renamed from: b */
        public final int mo42973b() {
            return C15299q2.f37649d;
        }

        /* renamed from: c */
        public final int mo42974c() {
            return C15299q2.f37650e;
        }

        /* renamed from: d */
        public final int mo42975d() {
            return C15299q2.f37648c;
        }

        public C15300a() {
        }
    }

    public /* synthetic */ C15299q2(int i) {
        this.f37652a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C15299q2 m66445e(int i) {
        return new C15299q2(i);
    }

    /* renamed from: f */
    public static int m66446f(int i) {
        return i;
    }

    /* renamed from: g */
    public static boolean m66447g(int i, Object obj) {
        return (obj instanceof C15299q2) && i == ((C15299q2) obj).mo42970l();
    }

    /* renamed from: h */
    public static final boolean m66448h(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m66449j(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: k */
    public static String m66450k(int i) {
        if (m66448h(i, f37648c)) {
            return "None";
        }
        if (m66448h(i, f37649d)) {
            return "Low";
        }
        if (m66448h(i, f37650e)) {
            return "Medium";
        }
        if (m66448h(i, f37651f)) {
            return "High";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66447g(this.f37652a, obj);
    }

    public int hashCode() {
        return m66449j(this.f37652a);
    }

    /* renamed from: i */
    public final int mo42969i() {
        return this.f37652a;
    }

    /* renamed from: l */
    public final /* synthetic */ int mo42970l() {
        return this.f37652a;
    }

    @C12579k
    public String toString() {
        return m66450k(this.f37652a);
    }
}
