package androidx.compose.p004ui.text.font;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.font.c0 */
public final class C16182c0 {
    @C12579k

    /* renamed from: b */
    public static final C16183a f40243b = new C16183a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40244c = m72917e(0);

    /* renamed from: d */
    public static final int f40245d = m72917e(1);

    /* renamed from: e */
    public static final int f40246e = m72917e(2);

    /* renamed from: a */
    public final int f40247a;

    /* renamed from: androidx.compose.ui.text.font.c0$a */
    public static final class C16183a {
        public /* synthetic */ C16183a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46865a() {
            return C16182c0.f40246e;
        }

        /* renamed from: b */
        public final int mo46866b() {
            return C16182c0.f40244c;
        }

        /* renamed from: c */
        public final int mo46867c() {
            return C16182c0.f40245d;
        }

        public C16183a() {
        }
    }

    public /* synthetic */ C16182c0(int i) {
        this.f40247a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C16182c0 m72916d(int i) {
        return new C16182c0(i);
    }

    /* renamed from: e */
    public static int m72917e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m72918f(int i, Object obj) {
        return (obj instanceof C16182c0) && i == ((C16182c0) obj).mo46863k();
    }

    /* renamed from: g */
    public static final boolean m72919g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m72920i(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: j */
    public static String m72921j(int i) {
        if (m72919g(i, f40244c)) {
            return "Blocking";
        }
        if (m72919g(i, f40245d)) {
            return "Optional";
        }
        if (m72919g(i, f40246e)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m72918f(this.f40247a, obj);
    }

    /* renamed from: h */
    public final int mo46861h() {
        return this.f40247a;
    }

    public int hashCode() {
        return m72920i(this.f40247a);
    }

    /* renamed from: k */
    public final /* synthetic */ int mo46863k() {
        return this.f40247a;
    }

    @C12579k
    public String toString() {
        return m72921j(this.f40247a);
    }
}
