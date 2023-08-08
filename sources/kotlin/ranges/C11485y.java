package kotlin.ranges;

import java.util.Iterator;
import kotlin.C11097g2;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.internal.C11130q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.ranges.y */
public class C11485y implements Iterable<C11588t1>, C11345a {
    @C12579k

    /* renamed from: d */
    public static final C11486a f28628d = new C11486a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f28629a;

    /* renamed from: b */
    public final long f28630b;

    /* renamed from: c */
    public final long f28631c;

    /* renamed from: kotlin.ranges.y$a */
    public static final class C11486a {
        public /* synthetic */ C11486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11485y mo23114a(long j, long j2, long j3) {
            return new C11485y(j, j2, j3, (DefaultConstructorMarker) null);
        }

        public C11486a() {
        }
    }

    public /* synthetic */ C11485y(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11485y) {
            if (!isEmpty() || !((C11485y) obj).isEmpty()) {
                C11485y yVar = (C11485y) obj;
                if (!(this.f28629a == yVar.f28629a && this.f28630b == yVar.f28630b && this.f28631c == yVar.f28631c)) {
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
        long j = this.f28629a;
        long j2 = this.f28630b;
        long j3 = this.f28631c;
        return (((((int) C11588t1.m44970M(j ^ C11588t1.m44970M(j >>> 32))) * 31) + ((int) C11588t1.m44970M(j2 ^ C11588t1.m44970M(j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        int i = (this.f28631c > 0 ? 1 : (this.f28631c == 0 ? 0 : -1));
        long j = this.f28629a;
        long j2 = this.f28630b;
        if (i > 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @C12579k
    public final Iterator<C11588t1> iterator() {
        return new C11487z(this.f28629a, this.f28630b, this.f28631c, (DefaultConstructorMarker) null);
    }

    /* renamed from: r */
    public final long mo23111r() {
        return this.f28629a;
    }

    @C12579k
    public String toString() {
        long j;
        StringBuilder sb;
        if (this.f28631c > 0) {
            sb = new StringBuilder();
            sb.append(C11588t1.m44983Y1(this.f28629a));
            sb.append("..");
            sb.append(C11588t1.m44983Y1(this.f28630b));
            sb.append(" step ");
            j = this.f28631c;
        } else {
            sb = new StringBuilder();
            sb.append(C11588t1.m44983Y1(this.f28629a));
            sb.append(" downTo ");
            sb.append(C11588t1.m44983Y1(this.f28630b));
            sb.append(" step ");
            j = -this.f28631c;
        }
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: w */
    public final long mo23112w() {
        return this.f28630b;
    }

    /* renamed from: y */
    public final long mo23113y() {
        return this.f28631c;
    }

    public C11485y(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f28629a = j;
            this.f28630b = C11130q.m42840c(j, j2, j3);
            this.f28631c = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
