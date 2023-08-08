package androidx.compose.p004ui.text.style;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.style.r */
public final class C16449r {
    @C12579k

    /* renamed from: b */
    public static final C16450a f40760b = new C16450a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40761c = m74261e(1);

    /* renamed from: d */
    public static final int f40762d = m74261e(2);

    /* renamed from: e */
    public static final int f40763e = m74261e(3);

    /* renamed from: a */
    public final int f40764a;

    /* renamed from: androidx.compose.ui.text.style.r$a */
    public static final class C16450a {
        public /* synthetic */ C16450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74267b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m74268d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m74269f() {
        }

        /* renamed from: a */
        public final int mo47726a() {
            return C16449r.f40761c;
        }

        /* renamed from: c */
        public final int mo47727c() {
            return C16449r.f40762d;
        }

        /* renamed from: e */
        public final int mo47728e() {
            return C16449r.f40763e;
        }

        public C16450a() {
        }
    }

    public /* synthetic */ C16449r(int i) {
        this.f40764a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C16449r m74260d(int i) {
        return new C16449r(i);
    }

    /* renamed from: e */
    public static int m74261e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m74262f(int i, Object obj) {
        return (obj instanceof C16449r) && i == ((C16449r) obj).mo47724j();
    }

    /* renamed from: g */
    public static final boolean m74263g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m74264h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m74265i(int i) {
        if (m74263g(i, f40761c)) {
            return "Clip";
        }
        if (m74263g(i, f40762d)) {
            return "Ellipsis";
        }
        if (m74263g(i, f40763e)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74262f(this.f40764a, obj);
    }

    public int hashCode() {
        return m74264h(this.f40764a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo47724j() {
        return this.f40764a;
    }

    @C12579k
    public String toString() {
        return m74265i(this.f40764a);
    }
}
