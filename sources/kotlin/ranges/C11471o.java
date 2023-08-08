package kotlin.ranges;

import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.o */
public final class C11471o extends C11468m implements C11459g<Long>, C11475r<Long> {
    @C12579k

    /* renamed from: e */
    public static final C11472a f28612e = new C11472a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C11471o f28613f = new C11471o(1, 0);

    /* renamed from: kotlin.ranges.o$a */
    public static final class C11472a {
        public /* synthetic */ C11472a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11471o mo23077a() {
            return C11471o.f28613f;
        }

        public C11472a() {
        }
    }

    public C11471o(long j, long j2) {
        super(j, j2, 1);
    }

    @C11395k(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: X */
    public static /* synthetic */ void m44276X() {
    }

    /* renamed from: Q */
    public boolean mo23073Q(long j) {
        return mo23066r() <= j && j <= mo23068w();
    }

    @C12579k
    /* renamed from: W */
    public Long mo23010h() {
        if (mo23068w() != Long.MAX_VALUE) {
            return Long.valueOf(mo23068w() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23073Q(((Number) comparable).longValue());
    }

    @C12579k
    /* renamed from: e0 */
    public Long mo23013q() {
        return Long.valueOf(mo23068w());
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11471o) {
            if (!isEmpty() || !((C11471o) obj).isEmpty()) {
                C11471o oVar = (C11471o) obj;
                if (!(mo23066r() == oVar.mo23066r() && mo23068w() == oVar.mo23068w())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f0 */
    public Long getStart() {
        return Long.valueOf(mo23066r());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (mo23066r() ^ (mo23066r() >>> 32))) + (mo23068w() ^ (mo23068w() >>> 32)));
    }

    public boolean isEmpty() {
        return mo23066r() > mo23068w();
    }

    @C12579k
    public String toString() {
        return mo23066r() + ".." + mo23068w();
    }
}
