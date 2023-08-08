package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.text.C16259h;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.style.h */
public final class C16426h {
    @C12579k

    /* renamed from: c */
    public static final C16429b f40699c = new C16429b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40700d = 0;
    @C12579k

    /* renamed from: e */
    public static final C16426h f40701e = new C16426h(C16427a.f40704b.mo47652e(), C16430c.f40710b.mo47659a(), (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final float f40702a;

    /* renamed from: b */
    public final int f40703b;

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.h$a */
    public static final class C16427a {
        @C12579k

        /* renamed from: b */
        public static final C16428a f40704b = new C16428a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final float f40705c = m74134f(0.0f);

        /* renamed from: d */
        public static final float f40706d = m74134f(0.5f);

        /* renamed from: e */
        public static final float f40707e = m74134f(-1.0f);

        /* renamed from: f */
        public static final float f40708f = m74134f(1.0f);

        /* renamed from: a */
        public final float f40709a;

        /* renamed from: androidx.compose.ui.text.style.h$a$a */
        public static final class C16428a {
            public /* synthetic */ C16428a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: b */
            public static /* synthetic */ void m74140b() {
            }

            /* renamed from: d */
            public static /* synthetic */ void m74141d() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m74142f() {
            }

            /* renamed from: h */
            public static /* synthetic */ void m74143h() {
            }

            /* renamed from: a */
            public final float mo47650a() {
                return C16427a.f40708f;
            }

            /* renamed from: c */
            public final float mo47651c() {
                return C16427a.f40706d;
            }

            /* renamed from: e */
            public final float mo47652e() {
                return C16427a.f40707e;
            }

            /* renamed from: g */
            public final float mo47653g() {
                return C16427a.f40705c;
            }

            public C16428a() {
            }
        }

        @C16259h
        public /* synthetic */ C16427a(float f) {
            this.f40709a = f;
        }

        /* renamed from: e */
        public static final /* synthetic */ C16427a m74133e(float f) {
            return new C16427a(f);
        }

        @C16259h
        /* renamed from: f */
        public static float m74134f(float f) {
            boolean z = true;
            if (!(0.0f <= f && f <= 1.0f)) {
                if (!(f == -1.0f)) {
                    z = false;
                }
            }
            if (z) {
                return f;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: g */
        public static boolean m74135g(float f, Object obj) {
            return (obj instanceof C16427a) && Float.compare(f, ((C16427a) obj).mo47648k()) == 0;
        }

        /* renamed from: h */
        public static final boolean m74136h(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: i */
        public static int m74137i(float f) {
            return Float.hashCode(f);
        }

        @C12579k
        /* renamed from: j */
        public static String m74138j(float f) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (f == f40705c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == f40706d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == f40707e) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f != f40708f) {
                z4 = false;
            }
            if (z4) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public boolean equals(Object obj) {
            return m74135g(this.f40709a, obj);
        }

        public int hashCode() {
            return m74137i(this.f40709a);
        }

        /* renamed from: k */
        public final /* synthetic */ float mo47648k() {
            return this.f40709a;
        }

        @C12579k
        public String toString() {
            return m74138j(this.f40709a);
        }
    }

    /* renamed from: androidx.compose.ui.text.style.h$b */
    public static final class C16429b {
        public /* synthetic */ C16429b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16426h mo47654a() {
            return C16426h.f40701e;
        }

        public C16429b() {
        }
    }

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.h$c */
    public static final class C16430c {
        @C12579k

        /* renamed from: b */
        public static final C16431a f40710b = new C16431a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f40711c = 1;

        /* renamed from: d */
        public static final int f40712d = 16;

        /* renamed from: e */
        public static final int f40713e = m74154f(1);

        /* renamed from: f */
        public static final int f40714f = m74154f(16);

        /* renamed from: g */
        public static final int f40715g = m74154f(17);

        /* renamed from: h */
        public static final int f40716h = m74154f(0);

        /* renamed from: a */
        public final int f40717a;

        /* renamed from: androidx.compose.ui.text.style.h$c$a */
        public static final class C16431a {
            public /* synthetic */ C16431a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo47659a() {
                return C16430c.f40715g;
            }

            /* renamed from: b */
            public final int mo47660b() {
                return C16430c.f40713e;
            }

            /* renamed from: c */
            public final int mo47661c() {
                return C16430c.f40714f;
            }

            /* renamed from: d */
            public final int mo47662d() {
                return C16430c.f40716h;
            }

            public C16431a() {
            }
        }

        public /* synthetic */ C16430c(int i) {
            this.f40717a = i;
        }

        /* renamed from: e */
        public static final /* synthetic */ C16430c m74153e(int i) {
            return new C16430c(i);
        }

        /* renamed from: f */
        public static int m74154f(int i) {
            return i;
        }

        /* renamed from: g */
        public static boolean m74155g(int i, Object obj) {
            return (obj instanceof C16430c) && i == ((C16430c) obj).mo47657m();
        }

        /* renamed from: h */
        public static final boolean m74156h(int i, int i2) {
            return i == i2;
        }

        /* renamed from: i */
        public static int m74157i(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: j */
        public static final boolean m74158j(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: k */
        public static final boolean m74159k(int i) {
            return (i & 16) > 0;
        }

        @C12579k
        /* renamed from: l */
        public static String m74160l(int i) {
            if (i == f40713e) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == f40714f) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == f40715g) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i == f40716h) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m74155g(this.f40717a, obj);
        }

        public int hashCode() {
            return m74157i(this.f40717a);
        }

        /* renamed from: m */
        public final /* synthetic */ int mo47657m() {
            return this.f40717a;
        }

        @C12579k
        public String toString() {
            return m74160l(this.f40717a);
        }
    }

    public /* synthetic */ C16426h(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    /* renamed from: b */
    public final float mo47641b() {
        return this.f40702a;
    }

    /* renamed from: c */
    public final int mo47642c() {
        return this.f40703b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16426h)) {
            return false;
        }
        C16426h hVar = (C16426h) obj;
        if (C16427a.m74136h(this.f40702a, hVar.f40702a) && C16430c.m74156h(this.f40703b, hVar.f40703b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C16427a.m74137i(this.f40702a) * 31) + C16430c.m74157i(this.f40703b);
    }

    @C12579k
    public String toString() {
        return "LineHeightStyle(alignment=" + C16427a.m74138j(this.f40702a) + ", trim=" + C16430c.m74160l(this.f40703b) + ')';
    }

    public C16426h(float f, int i) {
        this.f40702a = f;
        this.f40703b = i;
    }
}
