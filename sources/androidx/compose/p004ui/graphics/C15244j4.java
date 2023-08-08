package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.j4 */
public final class C15244j4 {
    @C12579k

    /* renamed from: b */
    public static final C15245a f37564b = new C15245a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37565c = m66127e(0);

    /* renamed from: d */
    public static final int f37566d = m66127e(1);

    /* renamed from: e */
    public static final int f37567e = m66127e(2);

    /* renamed from: a */
    public final int f37568a;

    /* renamed from: androidx.compose.ui.graphics.j4$a */
    public static final class C15245a {
        public /* synthetic */ C15245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42862a() {
            return C15244j4.f37565c;
        }

        /* renamed from: b */
        public final int mo42863b() {
            return C15244j4.f37566d;
        }

        /* renamed from: c */
        public final int mo42864c() {
            return C15244j4.f37567e;
        }

        public C15245a() {
        }
    }

    public /* synthetic */ C15244j4(int i) {
        this.f37568a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15244j4 m66126d(int i) {
        return new C15244j4(i);
    }

    /* renamed from: e */
    public static int m66127e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66128f(int i, Object obj) {
        return (obj instanceof C15244j4) && i == ((C15244j4) obj).mo42860j();
    }

    /* renamed from: g */
    public static final boolean m66129g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66130h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m66131i(int i) {
        if (m66129g(i, f37565c)) {
            return "Butt";
        }
        if (m66129g(i, f37566d)) {
            return "Round";
        }
        if (m66129g(i, f37567e)) {
            return "Square";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66128f(this.f37568a, obj);
    }

    public int hashCode() {
        return m66130h(this.f37568a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42860j() {
        return this.f37568a;
    }

    @C12579k
    public String toString() {
        return m66131i(this.f37568a);
    }
}
