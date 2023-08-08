package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.input.z */
public final class C16332z {
    @C12579k

    /* renamed from: b */
    public static final C16333a f40555b = new C16333a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40556c = m73586f(0);

    /* renamed from: d */
    public static final int f40557d = m73586f(1);

    /* renamed from: e */
    public static final int f40558e = m73586f(2);

    /* renamed from: f */
    public static final int f40559f = m73586f(3);

    /* renamed from: a */
    public final int f40560a;

    /* renamed from: androidx.compose.ui.text.input.z$a */
    public static final class C16333a {
        public /* synthetic */ C16333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m73592b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m73593d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m73594f() {
        }

        @C8547h2
        /* renamed from: h */
        public static /* synthetic */ void m73595h() {
        }

        /* renamed from: a */
        public final int mo47338a() {
            return C16332z.f40557d;
        }

        /* renamed from: c */
        public final int mo47339c() {
            return C16332z.f40556c;
        }

        /* renamed from: e */
        public final int mo47340e() {
            return C16332z.f40559f;
        }

        /* renamed from: g */
        public final int mo47341g() {
            return C16332z.f40558e;
        }

        public C16333a() {
        }
    }

    public /* synthetic */ C16332z(int i) {
        this.f40560a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C16332z m73585e(int i) {
        return new C16332z(i);
    }

    /* renamed from: f */
    public static int m73586f(int i) {
        return i;
    }

    /* renamed from: g */
    public static boolean m73587g(int i, Object obj) {
        return (obj instanceof C16332z) && i == ((C16332z) obj).mo47336k();
    }

    /* renamed from: h */
    public static final boolean m73588h(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m73589i(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: j */
    public static String m73590j(int i) {
        if (m73588h(i, f40556c)) {
            return "None";
        }
        if (m73588h(i, f40557d)) {
            return "Characters";
        }
        if (m73588h(i, f40558e)) {
            return "Words";
        }
        if (m73588h(i, f40559f)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73587g(this.f40560a, obj);
    }

    public int hashCode() {
        return m73589i(this.f40560a);
    }

    /* renamed from: k */
    public final /* synthetic */ int mo47336k() {
        return this.f40560a;
    }

    @C12579k
    public String toString() {
        return m73590j(this.f40560a);
    }
}
