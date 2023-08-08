package androidx.compose.p004ui.unit;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.unit.v */
public final class C16507v {
    @C12579k

    /* renamed from: b */
    public static final C16508a f40911b = new C16508a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f40912c = m74730e(0);

    /* renamed from: d */
    public static final long f40913d = m74730e(4294967296L);

    /* renamed from: e */
    public static final long f40914e = m74730e(8589934592L);

    /* renamed from: a */
    public final long f40915a;

    /* renamed from: androidx.compose.ui.unit.v$a */
    public static final class C16508a {
        public /* synthetic */ C16508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo47908a() {
            return C16507v.f40914e;
        }

        /* renamed from: b */
        public final long mo47909b() {
            return C16507v.f40913d;
        }

        /* renamed from: c */
        public final long mo47910c() {
            return C16507v.f40912c;
        }

        public C16508a() {
        }
    }

    public /* synthetic */ C16507v(long j) {
        this.f40915a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ C16507v m74729d(long j) {
        return new C16507v(j);
    }

    /* renamed from: e */
    public static long m74730e(long j) {
        return j;
    }

    /* renamed from: f */
    public static boolean m74731f(long j, Object obj) {
        return (obj instanceof C16507v) && j == ((C16507v) obj).mo47906j();
    }

    /* renamed from: g */
    public static final boolean m74732g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static int m74733h(long j) {
        return Long.hashCode(j);
    }

    @C12579k
    /* renamed from: i */
    public static String m74734i(long j) {
        if (m74732g(j, f40912c)) {
            return "Unspecified";
        }
        if (m74732g(j, f40913d)) {
            return "Sp";
        }
        if (m74732g(j, f40914e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74731f(this.f40915a, obj);
    }

    public int hashCode() {
        return m74733h(this.f40915a);
    }

    /* renamed from: j */
    public final /* synthetic */ long mo47906j() {
        return this.f40915a;
    }

    @C12579k
    public String toString() {
        return m74734i(this.f40915a);
    }
}
