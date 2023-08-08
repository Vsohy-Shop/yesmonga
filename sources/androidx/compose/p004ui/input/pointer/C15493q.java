package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.q */
public final class C15493q {
    @C12579k

    /* renamed from: b */
    public static final C15494a f38527b = new C15494a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38528c = m68706i(0);

    /* renamed from: d */
    public static final int f38529d = m68706i(1);

    /* renamed from: e */
    public static final int f38530e = m68706i(2);

    /* renamed from: f */
    public static final int f38531f = m68706i(3);

    /* renamed from: g */
    public static final int f38532g = m68706i(4);

    /* renamed from: h */
    public static final int f38533h = m68706i(5);

    /* renamed from: i */
    public static final int f38534i = m68706i(6);

    /* renamed from: a */
    public final int f38535a;

    /* renamed from: androidx.compose.ui.input.pointer.q$a */
    public static final class C15494a {
        public /* synthetic */ C15494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo44120a() {
            return C15493q.f38532g;
        }

        /* renamed from: b */
        public final int mo44121b() {
            return C15493q.f38533h;
        }

        /* renamed from: c */
        public final int mo44122c() {
            return C15493q.f38531f;
        }

        /* renamed from: d */
        public final int mo44123d() {
            return C15493q.f38529d;
        }

        /* renamed from: e */
        public final int mo44124e() {
            return C15493q.f38530e;
        }

        /* renamed from: f */
        public final int mo44125f() {
            return C15493q.f38534i;
        }

        /* renamed from: g */
        public final int mo44126g() {
            return C15493q.f38528c;
        }

        public C15494a() {
        }
    }

    public /* synthetic */ C15493q(int i) {
        this.f38535a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ C15493q m68705h(int i) {
        return new C15493q(i);
    }

    /* renamed from: i */
    public static int m68706i(int i) {
        return i;
    }

    /* renamed from: j */
    public static boolean m68707j(int i, Object obj) {
        return (obj instanceof C15493q) && i == ((C15493q) obj).mo44118n();
    }

    /* renamed from: k */
    public static final boolean m68708k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m68709l(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: m */
    public static String m68710m(int i) {
        if (m68708k(i, f38529d)) {
            return "Press";
        }
        if (m68708k(i, f38530e)) {
            return "Release";
        }
        if (m68708k(i, f38531f)) {
            return "Move";
        }
        if (m68708k(i, f38532g)) {
            return "Enter";
        }
        if (m68708k(i, f38533h)) {
            return "Exit";
        }
        if (m68708k(i, f38534i)) {
            return "Scroll";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m68707j(this.f38535a, obj);
    }

    public int hashCode() {
        return m68709l(this.f38535a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo44118n() {
        return this.f38535a;
    }

    @C12579k
    public String toString() {
        return m68710m(this.f38535a);
    }
}
