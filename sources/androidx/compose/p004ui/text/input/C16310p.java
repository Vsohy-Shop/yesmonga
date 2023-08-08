package androidx.compose.p004ui.text.input;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.input.p */
public final class C16310p {
    @C12579k

    /* renamed from: b */
    public static final C16311a f40516b = new C16311a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40517c = m73493j(1);

    /* renamed from: d */
    public static final int f40518d = m73493j(0);

    /* renamed from: e */
    public static final int f40519e = m73493j(2);

    /* renamed from: f */
    public static final int f40520f = m73493j(3);

    /* renamed from: g */
    public static final int f40521g = m73493j(4);

    /* renamed from: h */
    public static final int f40522h = m73493j(5);

    /* renamed from: i */
    public static final int f40523i = m73493j(6);

    /* renamed from: j */
    public static final int f40524j = m73493j(7);

    /* renamed from: a */
    public final int f40525a;

    /* renamed from: androidx.compose.ui.text.input.p$a */
    public static final class C16311a {
        public /* synthetic */ C16311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m73499b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m73500d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m73501f() {
        }

        @C8547h2
        /* renamed from: h */
        public static /* synthetic */ void m73502h() {
        }

        @C8547h2
        /* renamed from: j */
        public static /* synthetic */ void m73503j() {
        }

        @C8547h2
        /* renamed from: l */
        public static /* synthetic */ void m73504l() {
        }

        @C8547h2
        /* renamed from: n */
        public static /* synthetic */ void m73505n() {
        }

        @C8547h2
        /* renamed from: p */
        public static /* synthetic */ void m73506p() {
        }

        /* renamed from: a */
        public final int mo47279a() {
            return C16310p.f40517c;
        }

        /* renamed from: c */
        public final int mo47280c() {
            return C16310p.f40524j;
        }

        /* renamed from: e */
        public final int mo47281e() {
            return C16310p.f40519e;
        }

        /* renamed from: g */
        public final int mo47282g() {
            return C16310p.f40523i;
        }

        /* renamed from: i */
        public final int mo47283i() {
            return C16310p.f40518d;
        }

        /* renamed from: k */
        public final int mo47284k() {
            return C16310p.f40522h;
        }

        /* renamed from: m */
        public final int mo47285m() {
            return C16310p.f40520f;
        }

        /* renamed from: o */
        public final int mo47286o() {
            return C16310p.f40521g;
        }

        public C16311a() {
        }
    }

    public /* synthetic */ C16310p(int i) {
        this.f40525a = i;
    }

    /* renamed from: i */
    public static final /* synthetic */ C16310p m73492i(int i) {
        return new C16310p(i);
    }

    /* renamed from: j */
    public static int m73493j(int i) {
        return i;
    }

    /* renamed from: k */
    public static boolean m73494k(int i, Object obj) {
        return (obj instanceof C16310p) && i == ((C16310p) obj).mo47277o();
    }

    /* renamed from: l */
    public static final boolean m73495l(int i, int i2) {
        return i == i2;
    }

    /* renamed from: m */
    public static int m73496m(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: n */
    public static String m73497n(int i) {
        if (m73495l(i, f40518d)) {
            return "None";
        }
        if (m73495l(i, f40517c)) {
            return "Default";
        }
        if (m73495l(i, f40519e)) {
            return "Go";
        }
        if (m73495l(i, f40520f)) {
            return "Search";
        }
        if (m73495l(i, f40521g)) {
            return "Send";
        }
        if (m73495l(i, f40522h)) {
            return "Previous";
        }
        if (m73495l(i, f40523i)) {
            return "Next";
        }
        if (m73495l(i, f40524j)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m73494k(this.f40525a, obj);
    }

    public int hashCode() {
        return m73496m(this.f40525a);
    }

    /* renamed from: o */
    public final /* synthetic */ int mo47277o() {
        return this.f40525a;
    }

    @C12579k
    public String toString() {
        return m73497n(this.f40525a);
    }
}
