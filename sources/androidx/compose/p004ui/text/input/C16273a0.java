package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.input.a0 */
public final class C16273a0 {
    @C12579k

    /* renamed from: b */
    public static final C16274a f40446b = new C16274a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40447c = m73364k(1);

    /* renamed from: d */
    public static final int f40448d = m73364k(2);

    /* renamed from: e */
    public static final int f40449e = m73364k(3);

    /* renamed from: f */
    public static final int f40450f = m73364k(4);

    /* renamed from: g */
    public static final int f40451g = m73364k(5);

    /* renamed from: h */
    public static final int f40452h = m73364k(6);

    /* renamed from: i */
    public static final int f40453i = m73364k(7);

    /* renamed from: j */
    public static final int f40454j = m73364k(8);

    /* renamed from: k */
    public static final int f40455k = m73364k(9);

    /* renamed from: a */
    public final int f40456a;

    /* renamed from: androidx.compose.ui.text.input.a0$a */
    public static final class C16274a {
        public /* synthetic */ C16274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m73370b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m73371d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m73372f() {
        }

        @C8547h2
        /* renamed from: h */
        public static /* synthetic */ void m73373h() {
        }

        @C8547h2
        /* renamed from: j */
        public static /* synthetic */ void m73374j() {
        }

        @C8547h2
        /* renamed from: l */
        public static /* synthetic */ void m73375l() {
        }

        @C8547h2
        /* renamed from: n */
        public static /* synthetic */ void m73376n() {
        }

        @C8547h2
        /* renamed from: p */
        public static /* synthetic */ void m73377p() {
        }

        @C8547h2
        /* renamed from: r */
        public static /* synthetic */ void m73378r() {
        }

        /* renamed from: a */
        public final int mo47152a() {
            return C16273a0.f40448d;
        }

        /* renamed from: c */
        public final int mo47153c() {
            return C16273a0.f40455k;
        }

        /* renamed from: e */
        public final int mo47154e() {
            return C16273a0.f40452h;
        }

        /* renamed from: g */
        public final int mo47155g() {
            return C16273a0.f40449e;
        }

        /* renamed from: i */
        public final int mo47156i() {
            return C16273a0.f40454j;
        }

        /* renamed from: k */
        public final int mo47157k() {
            return C16273a0.f40453i;
        }

        /* renamed from: m */
        public final int mo47158m() {
            return C16273a0.f40450f;
        }

        /* renamed from: o */
        public final int mo47159o() {
            return C16273a0.f40447c;
        }

        /* renamed from: q */
        public final int mo47160q() {
            return C16273a0.f40451g;
        }

        public C16274a() {
        }
    }

    public /* synthetic */ C16273a0(int i) {
        this.f40456a = i;
    }

    /* renamed from: j */
    public static final /* synthetic */ C16273a0 m73363j(int i) {
        return new C16273a0(i);
    }

    /* renamed from: k */
    public static int m73364k(int i) {
        return i;
    }

    /* renamed from: l */
    public static boolean m73365l(int i, Object obj) {
        return (obj instanceof C16273a0) && i == ((C16273a0) obj).mo47150p();
    }

    /* renamed from: m */
    public static final boolean m73366m(int i, int i2) {
        return i == i2;
    }

    /* renamed from: n */
    public static int m73367n(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: o */
    public static String m73368o(int i) {
        if (m73366m(i, f40447c)) {
            return "Text";
        }
        if (m73366m(i, f40448d)) {
            return "Ascii";
        }
        if (m73366m(i, f40449e)) {
            return "Number";
        }
        if (m73366m(i, f40450f)) {
            return "Phone";
        }
        if (m73366m(i, f40451g)) {
            return "Uri";
        }
        if (m73366m(i, f40452h)) {
            return "Email";
        }
        if (m73366m(i, f40453i)) {
            return "Password";
        }
        if (m73366m(i, f40454j)) {
            return "NumberPassword";
        }
        if (m73366m(i, f40455k)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73365l(this.f40456a, obj);
    }

    public int hashCode() {
        return m73367n(this.f40456a);
    }

    /* renamed from: p */
    public final /* synthetic */ int mo47150p() {
        return this.f40456a;
    }

    @C12579k
    public String toString() {
        return m73368o(this.f40456a);
    }
}
