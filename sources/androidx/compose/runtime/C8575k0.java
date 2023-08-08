package androidx.compose.runtime;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.runtime.k0 */
public final class C8575k0 {
    @C12579k

    /* renamed from: b */
    public static final C8576a f23011b = new C8576a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f23012c = m31088e(0);

    /* renamed from: d */
    public static final int f23013d = m31088e(1);

    /* renamed from: e */
    public static final int f23014e = m31088e(2);

    /* renamed from: a */
    public final int f23015a;

    /* renamed from: androidx.compose.runtime.k0$a */
    public static final class C8576a {
        public /* synthetic */ C8576a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo16249a() {
            return C8575k0.f23012c;
        }

        /* renamed from: b */
        public final int mo16250b() {
            return C8575k0.f23013d;
        }

        /* renamed from: c */
        public final int mo16251c() {
            return C8575k0.f23014e;
        }

        public C8576a() {
        }
    }

    public /* synthetic */ C8575k0(int i) {
        this.f23015a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C8575k0 m31087d(int i) {
        return new C8575k0(i);
    }

    /* renamed from: e */
    public static int m31088e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m31089f(int i, Object obj) {
        return (obj instanceof C8575k0) && i == ((C8575k0) obj).mo16247m();
    }

    /* renamed from: g */
    public static final boolean m31090g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m31091i(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: j */
    public static final boolean m31092j(int i) {
        return i != f23011b.mo16249a();
    }

    /* renamed from: k */
    public static final boolean m31093k(int i) {
        return i != f23011b.mo16250b();
    }

    /* renamed from: l */
    public static String m31094l(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m31089f(this.f23015a, obj);
    }

    /* renamed from: h */
    public final int mo16245h() {
        return this.f23015a;
    }

    public int hashCode() {
        return m31091i(this.f23015a);
    }

    /* renamed from: m */
    public final /* synthetic */ int mo16247m() {
        return this.f23015a;
    }

    public String toString() {
        return m31094l(this.f23015a);
    }
}
