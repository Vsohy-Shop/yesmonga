package kotlin.ranges;

import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.l */
public final class C11466l extends C11463j implements C11459g<Integer>, C11475r<Integer> {
    @C12579k

    /* renamed from: e */
    public static final C11467a f28602e = new C11467a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C11466l f28603f = new C11466l(1, 0);

    /* renamed from: kotlin.ranges.l$a */
    public static final class C11467a {
        public /* synthetic */ C11467a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11466l mo23060a() {
            return C11466l.f28603f;
        }

        public C11467a() {
        }
    }

    public C11466l(int i, int i2) {
        super(i, i2, 1);
    }

    @C11395k(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: X */
    public static /* synthetic */ void m44259X() {
    }

    /* renamed from: Q */
    public boolean mo23056Q(int i) {
        return mo23049r() <= i && i <= mo23051w();
    }

    @C12579k
    /* renamed from: W */
    public Integer mo23010h() {
        if (mo23051w() != Integer.MAX_VALUE) {
            return Integer.valueOf(mo23051w() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23056Q(((Number) comparable).intValue());
    }

    @C12579k
    /* renamed from: e0 */
    public Integer mo23013q() {
        return Integer.valueOf(mo23051w());
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11466l) {
            if (!isEmpty() || !((C11466l) obj).isEmpty()) {
                C11466l lVar = (C11466l) obj;
                if (!(mo23049r() == lVar.mo23049r() && mo23051w() == lVar.mo23051w())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f0 */
    public Integer getStart() {
        return Integer.valueOf(mo23049r());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo23049r() * 31) + mo23051w();
    }

    public boolean isEmpty() {
        return mo23049r() > mo23051w();
    }

    @C12579k
    public String toString() {
        return mo23049r() + ".." + mo23051w();
    }
}
