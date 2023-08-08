package kotlin.ranges;

import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.ranges.a0 */
public final class C11448a0 extends C11485y implements C11459g<C11588t1>, C11475r<C11588t1> {
    @C12579k

    /* renamed from: e */
    public static final C11449a f28578e = new C11449a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C11448a0 f28579f = new C11448a0(-1, 0, (DefaultConstructorMarker) null);

    /* renamed from: kotlin.ranges.a0$a */
    public static final class C11449a {
        public /* synthetic */ C11449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11448a0 mo23015a() {
            return C11448a0.f28579f;
        }

        public C11449a() {
        }
    }

    public /* synthetic */ C11448a0(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @C11395k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: W */
    public static /* synthetic */ void m44154W() {
    }

    /* renamed from: M */
    public boolean mo23003M(long j) {
        return Long.compare(mo23111r() ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0 && Long.compare(j ^ Long.MIN_VALUE, mo23112w() ^ Long.MIN_VALUE) <= 0;
    }

    /* renamed from: Q */
    public long mo23004Q() {
        if (mo23112w() != -1) {
            return C11588t1.m44970M(mo23112w() + C11588t1.m44970M(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* renamed from: X */
    public long mo23005X() {
        return mo23112w();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23003M(((C11588t1) comparable).mo23301j2());
    }

    /* renamed from: e0 */
    public long mo23007e0() {
        return mo23111r();
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11448a0) {
            if (!isEmpty() || !((C11448a0) obj).isEmpty()) {
                C11448a0 a0Var = (C11448a0) obj;
                if (!(mo23111r() == a0Var.mo23111r() && mo23112w() == a0Var.mo23112w())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable getStart() {
        return C11588t1.m44992g(mo23007e0());
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Comparable mo23010h() {
        return C11588t1.m44992g(mo23004Q());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) C11588t1.m44970M(mo23111r() ^ C11588t1.m44970M(mo23111r() >>> 32))) * 31) + ((int) C11588t1.m44970M(mo23112w() ^ C11588t1.m44970M(mo23112w() >>> 32)));
    }

    public boolean isEmpty() {
        return Long.compare(mo23111r() ^ Long.MIN_VALUE, mo23112w() ^ Long.MIN_VALUE) > 0;
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ Comparable mo23013q() {
        return C11588t1.m44992g(mo23005X());
    }

    @C12579k
    public String toString() {
        return C11588t1.m44983Y1(mo23111r()) + ".." + C11588t1.m44983Y1(mo23112w());
    }

    public C11448a0(long j, long j2) {
        super(j, j2, 1, (DefaultConstructorMarker) null);
    }
}
