package androidx.compose.material3;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.material3.p0 */
public final class C8261p0 {
    @C12579k

    /* renamed from: b */
    public static final C8262a f20408b = new C8262a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20409c = m27439d(0);

    /* renamed from: d */
    public static final int f20410d = m27439d(1);

    /* renamed from: a */
    public final int f20411a;

    /* renamed from: androidx.compose.material3.p0$a */
    public static final class C8262a {
        public /* synthetic */ C8262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12900a() {
            return C8261p0.f20409c;
        }

        /* renamed from: b */
        public final int mo12901b() {
            return C8261p0.f20410d;
        }

        public C8262a() {
        }
    }

    public /* synthetic */ C8261p0(int i) {
        this.f20411a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8261p0 m27438c(int i) {
        return new C8261p0(i);
    }

    /* renamed from: d */
    public static int m27439d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m27440e(int i, Object obj) {
        return (obj instanceof C8261p0) && i == ((C8261p0) obj).mo12898i();
    }

    /* renamed from: f */
    public static final boolean m27441f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m27442g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m27443h(int i) {
        return m27441f(i, f20409c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m27440e(this.f20411a, obj);
    }

    public int hashCode() {
        return m27442g(this.f20411a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo12898i() {
        return this.f20411a;
    }

    @C12579k
    public String toString() {
        return m27443h(this.f20411a);
    }
}
