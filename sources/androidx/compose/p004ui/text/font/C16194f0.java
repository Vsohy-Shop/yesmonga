package androidx.compose.p004ui.text.font;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.font.f0 */
public final class C16194f0 {
    @C12579k

    /* renamed from: b */
    public static final C16195a f40257b = new C16195a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40258c = m72969f(0);

    /* renamed from: d */
    public static final int f40259d = m72969f(1);

    /* renamed from: e */
    public static final int f40260e = m72969f(2);

    /* renamed from: f */
    public static final int f40261f = m72969f(3);

    /* renamed from: a */
    public final int f40262a;

    /* renamed from: androidx.compose.ui.text.font.f0$a */
    public static final class C16195a {
        public /* synthetic */ C16195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46895a() {
            return C16194f0.f40259d;
        }

        /* renamed from: b */
        public final int mo46896b() {
            return C16194f0.f40258c;
        }

        /* renamed from: c */
        public final int mo46897c() {
            return C16194f0.f40261f;
        }

        /* renamed from: d */
        public final int mo46898d() {
            return C16194f0.f40260e;
        }

        public C16195a() {
        }
    }

    public /* synthetic */ C16194f0(int i) {
        this.f40262a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C16194f0 m72968e(int i) {
        return new C16194f0(i);
    }

    /* renamed from: f */
    public static int m72969f(int i) {
        return i;
    }

    /* renamed from: g */
    public static boolean m72970g(int i, Object obj) {
        return (obj instanceof C16194f0) && i == ((C16194f0) obj).mo46893m();
    }

    /* renamed from: h */
    public static final boolean m72971h(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m72972i(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: j */
    public static final boolean m72973j(int i) {
        return m72971h(i, f40259d) || m72971h(i, f40261f);
    }

    /* renamed from: k */
    public static final boolean m72974k(int i) {
        return m72971h(i, f40259d) || m72971h(i, f40260e);
    }

    @C12579k
    /* renamed from: l */
    public static String m72975l(int i) {
        if (m72971h(i, f40258c)) {
            return "None";
        }
        if (m72971h(i, f40259d)) {
            return "All";
        }
        if (m72971h(i, f40260e)) {
            return "Weight";
        }
        if (m72971h(i, f40261f)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m72970g(this.f40262a, obj);
    }

    public int hashCode() {
        return m72972i(this.f40262a);
    }

    /* renamed from: m */
    public final /* synthetic */ int mo46893m() {
        return this.f40262a;
    }

    @C12579k
    public String toString() {
        return m72975l(this.f40262a);
    }
}
