package kotlin.ranges;

import kotlin.collections.C10955l0;
import kotlin.internal.C11126n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.m */
public class C11468m implements Iterable<Long>, C11345a {
    @C12579k

    /* renamed from: d */
    public static final C11469a f28604d = new C11469a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f28605a;

    /* renamed from: b */
    public final long f28606b;

    /* renamed from: c */
    public final long f28607c;

    /* renamed from: kotlin.ranges.m$a */
    public static final class C11469a {
        public /* synthetic */ C11469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11468m mo23070a(long j, long j2, long j3) {
            return new C11468m(j, j2, j3);
        }

        public C11469a() {
        }
    }

    public C11468m(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f28605a = j;
            this.f28606b = C11126n.m42835d(j, j2, j3);
            this.f28607c = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @C12579k
    /* renamed from: H */
    public C10955l0 iterator() {
        return new C11470n(this.f28605a, this.f28606b, this.f28607c);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11468m) {
            if (!isEmpty() || !((C11468m) obj).isEmpty()) {
                C11468m mVar = (C11468m) obj;
                if (!(this.f28605a == mVar.f28605a && this.f28606b == mVar.f28606b && this.f28607c == mVar.f28607c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = (long) 31;
        long j2 = this.f28605a;
        long j3 = this.f28606b;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f28607c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.f28607c > 0 ? 1 : (this.f28607c == 0 ? 0 : -1));
        long j = this.f28605a;
        long j2 = this.f28606b;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final long mo23066r() {
        return this.f28605a;
    }

    @C12579k
    public String toString() {
        long j;
        StringBuilder sb;
        if (this.f28607c > 0) {
            sb = new StringBuilder();
            sb.append(this.f28605a);
            sb.append("..");
            sb.append(this.f28606b);
            sb.append(" step ");
            j = this.f28607c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f28605a);
            sb.append(" downTo ");
            sb.append(this.f28606b);
            sb.append(" step ");
            j = -this.f28607c;
        }
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: w */
    public final long mo23068w() {
        return this.f28606b;
    }

    /* renamed from: y */
    public final long mo23069y() {
        return this.f28607c;
    }
}
