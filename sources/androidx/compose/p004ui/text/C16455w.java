package androidx.compose.p004ui.text;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.w */
public final class C16455w {
    @C12579k

    /* renamed from: b */
    public static final C16456a f40785b = new C16456a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40786c = m74315i(1);

    /* renamed from: d */
    public static final int f40787d = m74315i(2);

    /* renamed from: e */
    public static final int f40788e = m74315i(3);

    /* renamed from: f */
    public static final int f40789f = m74315i(4);

    /* renamed from: g */
    public static final int f40790g = m74315i(5);

    /* renamed from: h */
    public static final int f40791h = m74315i(6);

    /* renamed from: i */
    public static final int f40792i = m74315i(7);

    /* renamed from: a */
    public final int f40793a;

    /* renamed from: androidx.compose.ui.text.w$a */
    public static final class C16456a {
        public /* synthetic */ C16456a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47766a() {
            return C16455w.f40786c;
        }

        /* renamed from: b */
        public final int mo47767b() {
            return C16455w.f40788e;
        }

        /* renamed from: c */
        public final int mo47768c() {
            return C16455w.f40789f;
        }

        /* renamed from: d */
        public final int mo47769d() {
            return C16455w.f40791h;
        }

        /* renamed from: e */
        public final int mo47770e() {
            return C16455w.f40792i;
        }

        /* renamed from: f */
        public final int mo47771f() {
            return C16455w.f40790g;
        }

        /* renamed from: g */
        public final int mo47772g() {
            return C16455w.f40787d;
        }

        public C16456a() {
        }
    }

    public /* synthetic */ C16455w(int i) {
        this.f40793a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ C16455w m74314h(int i) {
        return new C16455w(i);
    }

    /* renamed from: i */
    public static int m74315i(int i) {
        return i;
    }

    /* renamed from: j */
    public static boolean m74316j(int i, Object obj) {
        return (obj instanceof C16455w) && i == ((C16455w) obj).mo47764n();
    }

    /* renamed from: k */
    public static final boolean m74317k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m74318l(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: m */
    public static String m74319m(int i) {
        if (m74317k(i, f40786c)) {
            return "AboveBaseline";
        }
        if (m74317k(i, f40787d)) {
            return "Top";
        }
        if (m74317k(i, f40788e)) {
            return "Bottom";
        }
        if (m74317k(i, f40789f)) {
            return "Center";
        }
        if (m74317k(i, f40790g)) {
            return "TextTop";
        }
        if (m74317k(i, f40791h)) {
            return "TextBottom";
        }
        if (m74317k(i, f40792i)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74316j(this.f40793a, obj);
    }

    public int hashCode() {
        return m74318l(this.f40793a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo47764n() {
        return this.f40793a;
    }

    @C12579k
    public String toString() {
        return m74319m(this.f40793a);
    }
}
