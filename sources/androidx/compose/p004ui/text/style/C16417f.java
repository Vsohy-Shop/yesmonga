package androidx.compose.p004ui.text.style;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.text.style.f */
public final class C16417f {
    @C12579k

    /* renamed from: b */
    public static final C16418a f40679b = new C16418a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40680c;

    /* renamed from: d */
    public static final int f40681d;

    /* renamed from: e */
    public static final int f40682e;

    /* renamed from: a */
    public final int f40683a;

    /* renamed from: androidx.compose.ui.text.style.f$a */
    public static final class C16418a {
        public /* synthetic */ C16418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47617a() {
            return C16417f.f40681d;
        }

        /* renamed from: b */
        public final int mo47618b() {
            return C16417f.f40682e;
        }

        /* renamed from: c */
        public final int mo47619c() {
            return C16417f.f40680c;
        }

        public C16418a() {
        }
    }

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.f$b */
    public static final class C16419b {
        @C12579k

        /* renamed from: b */
        public static final C16420a f40684b = new C16420a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f40685c = m74083e(1);

        /* renamed from: d */
        public static final int f40686d = m74083e(2);

        /* renamed from: e */
        public static final int f40687e = m74083e(3);

        /* renamed from: a */
        public final int f40688a;

        /* renamed from: androidx.compose.ui.text.style.f$b$a */
        public static final class C16420a {
            public /* synthetic */ C16420a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo47624a() {
                return C16419b.f40687e;
            }

            /* renamed from: b */
            public final int mo47625b() {
                return C16419b.f40686d;
            }

            /* renamed from: c */
            public final int mo47626c() {
                return C16419b.f40685c;
            }

            public C16420a() {
            }
        }

        public /* synthetic */ C16419b(int i) {
            this.f40688a = i;
        }

        /* renamed from: d */
        public static final /* synthetic */ C16419b m74082d(int i) {
            return new C16419b(i);
        }

        /* renamed from: e */
        public static int m74083e(int i) {
            return i;
        }

        /* renamed from: f */
        public static boolean m74084f(int i, Object obj) {
            return (obj instanceof C16419b) && i == ((C16419b) obj).mo47622j();
        }

        /* renamed from: g */
        public static final boolean m74085g(int i, int i2) {
            return i == i2;
        }

        /* renamed from: h */
        public static int m74086h(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: i */
        public static String m74087i(int i) {
            if (m74085g(i, f40685c)) {
                return "Strategy.Simple";
            }
            if (m74085g(i, f40686d)) {
                return "Strategy.HighQuality";
            }
            if (m74085g(i, f40687e)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m74084f(this.f40688a, obj);
        }

        public int hashCode() {
            return m74086h(this.f40688a);
        }

        /* renamed from: j */
        public final /* synthetic */ int mo47622j() {
            return this.f40688a;
        }

        @C12579k
        public String toString() {
            return m74087i(this.f40688a);
        }
    }

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.f$c */
    public static final class C16421c {
        @C12579k

        /* renamed from: b */
        public static final C16422a f40689b = new C16422a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f40690c = m74097f(1);

        /* renamed from: d */
        public static final int f40691d = m74097f(2);

        /* renamed from: e */
        public static final int f40692e = m74097f(3);

        /* renamed from: f */
        public static final int f40693f = m74097f(4);

        /* renamed from: a */
        public final int f40694a;

        /* renamed from: androidx.compose.ui.text.style.f$c$a */
        public static final class C16422a {
            public /* synthetic */ C16422a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo47631a() {
                return C16421c.f40690c;
            }

            /* renamed from: b */
            public final int mo47632b() {
                return C16421c.f40691d;
            }

            /* renamed from: c */
            public final int mo47633c() {
                return C16421c.f40692e;
            }

            /* renamed from: d */
            public final int mo47634d() {
                return C16421c.f40693f;
            }

            public C16422a() {
            }
        }

        public /* synthetic */ C16421c(int i) {
            this.f40694a = i;
        }

        /* renamed from: e */
        public static final /* synthetic */ C16421c m74096e(int i) {
            return new C16421c(i);
        }

        /* renamed from: f */
        public static int m74097f(int i) {
            return i;
        }

        /* renamed from: g */
        public static boolean m74098g(int i, Object obj) {
            return (obj instanceof C16421c) && i == ((C16421c) obj).mo47629k();
        }

        /* renamed from: h */
        public static final boolean m74099h(int i, int i2) {
            return i == i2;
        }

        /* renamed from: i */
        public static int m74100i(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: j */
        public static String m74101j(int i) {
            if (m74099h(i, f40690c)) {
                return "Strictness.None";
            }
            if (m74099h(i, f40691d)) {
                return "Strictness.Loose";
            }
            if (m74099h(i, f40692e)) {
                return "Strictness.Normal";
            }
            if (m74099h(i, f40693f)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m74098g(this.f40694a, obj);
        }

        public int hashCode() {
            return m74100i(this.f40694a);
        }

        /* renamed from: k */
        public final /* synthetic */ int mo47629k() {
            return this.f40694a;
        }

        @C12579k
        public String toString() {
            return m74101j(this.f40694a);
        }
    }

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.f$d */
    public static final class C16423d {
        @C12579k

        /* renamed from: b */
        public static final C16424a f40695b = new C16424a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f40696c = m74110d(1);

        /* renamed from: d */
        public static final int f40697d = m74110d(2);

        /* renamed from: a */
        public final int f40698a;

        /* renamed from: androidx.compose.ui.text.style.f$d$a */
        public static final class C16424a {
            public /* synthetic */ C16424a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo47639a() {
                return C16423d.f40696c;
            }

            /* renamed from: b */
            public final int mo47640b() {
                return C16423d.f40697d;
            }

            public C16424a() {
            }
        }

        public /* synthetic */ C16423d(int i) {
            this.f40698a = i;
        }

        /* renamed from: c */
        public static final /* synthetic */ C16423d m74109c(int i) {
            return new C16423d(i);
        }

        /* renamed from: d */
        public static int m74110d(int i) {
            return i;
        }

        /* renamed from: e */
        public static boolean m74111e(int i, Object obj) {
            return (obj instanceof C16423d) && i == ((C16423d) obj).mo47637i();
        }

        /* renamed from: f */
        public static final boolean m74112f(int i, int i2) {
            return i == i2;
        }

        /* renamed from: g */
        public static int m74113g(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: h */
        public static String m74114h(int i) {
            if (m74112f(i, f40696c)) {
                return "WordBreak.None";
            }
            if (m74112f(i, f40697d)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m74111e(this.f40698a, obj);
        }

        public int hashCode() {
            return m74113g(this.f40698a);
        }

        /* renamed from: i */
        public final /* synthetic */ int mo47637i() {
            return this.f40698a;
        }

        @C12579k
        public String toString() {
            return m74114h(this.f40698a);
        }
    }

    static {
        C16419b.C16420a aVar = C16419b.f40684b;
        int c = aVar.mo47626c();
        C16421c.C16422a aVar2 = C16421c.f40689b;
        int c2 = aVar2.mo47633c();
        C16423d.C16424a aVar3 = C16423d.f40695b;
        f40680c = m74065f(c, c2, aVar3.mo47639a());
        f40681d = m74065f(aVar.mo47624a(), aVar2.mo47632b(), aVar3.mo47640b());
        f40682e = m74065f(aVar.mo47625b(), aVar2.mo47634d(), aVar3.mo47639a());
    }

    public /* synthetic */ C16417f(int i) {
        this.f40683a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C16417f m74063d(int i) {
        return new C16417f(i);
    }

    /* renamed from: e */
    public static int m74064e(int i) {
        return i;
    }

    /* renamed from: f */
    public static int m74065f(int i, int i2, int i3) {
        return m74064e(C16425g.m74122e(i, i2, i3));
    }

    /* renamed from: g */
    public static final int m74066g(int i, int i2, int i3, int i4) {
        return m74065f(i2, i3, i4);
    }

    /* renamed from: h */
    public static /* synthetic */ int m74067h(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m74070k(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m74071l(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m74072m(i);
        }
        return m74066g(i, i2, i3, i4);
    }

    /* renamed from: i */
    public static boolean m74068i(int i, Object obj) {
        return (obj instanceof C16417f) && i == ((C16417f) obj).mo47615p();
    }

    /* renamed from: j */
    public static final boolean m74069j(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static final int m74070k(int i) {
        return C16419b.m74083e(C16425g.m74123f(i));
    }

    /* renamed from: l */
    public static final int m74071l(int i) {
        return C16421c.m74097f(C16425g.m74124g(i));
    }

    /* renamed from: m */
    public static final int m74072m(int i) {
        return C16423d.m74110d(C16425g.m74125h(i));
    }

    /* renamed from: n */
    public static int m74073n(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: o */
    public static String m74074o(int i) {
        return "LineBreak(strategy=" + C16419b.m74087i(m74070k(i)) + ", strictness=" + C16421c.m74101j(m74071l(i)) + ", wordBreak=" + C16423d.m74114h(m74072m(i)) + ')';
    }

    public boolean equals(Object obj) {
        return m74068i(this.f40683a, obj);
    }

    public int hashCode() {
        return m74073n(this.f40683a);
    }

    /* renamed from: p */
    public final /* synthetic */ int mo47615p() {
        return this.f40683a;
    }

    @C12579k
    public String toString() {
        return m74074o(this.f40683a);
    }
}
