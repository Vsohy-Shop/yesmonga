package kotlin.ranges;

import java.util.Iterator;
import kotlin.C11097g2;
import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11665v0;
import kotlin.internal.C11130q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.ranges.v */
public class C11480v implements Iterable<C11419p1>, C11345a {
    @C12579k

    /* renamed from: d */
    public static final C11481a f28618d = new C11481a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f28619a;

    /* renamed from: b */
    public final int f28620b;

    /* renamed from: c */
    public final int f28621c;

    /* renamed from: kotlin.ranges.v$a */
    public static final class C11481a {
        public /* synthetic */ C11481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11480v mo23100a(int i, int i2, int i3) {
            return new C11480v(i, i2, i3, (DefaultConstructorMarker) null);
        }

        public C11481a() {
        }
    }

    public /* synthetic */ C11480v(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11480v) {
            if (!isEmpty() || !((C11480v) obj).isEmpty()) {
                C11480v vVar = (C11480v) obj;
                if (!(this.f28619a == vVar.f28619a && this.f28620b == vVar.f28620b && this.f28621c == vVar.f28621c)) {
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
        return (((this.f28619a * 31) + this.f28620b) * 31) + this.f28621c;
    }

    public boolean isEmpty() {
        if (this.f28621c > 0) {
            if (Integer.compare(this.f28619a ^ Integer.MIN_VALUE, this.f28620b ^ Integer.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Integer.compare(this.f28619a ^ Integer.MIN_VALUE, this.f28620b ^ Integer.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @C12579k
    public final Iterator<C11419p1> iterator() {
        return new C11482w(this.f28619a, this.f28620b, this.f28621c, (DefaultConstructorMarker) null);
    }

    /* renamed from: r */
    public final int mo23096r() {
        return this.f28619a;
    }

    @C12579k
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f28621c > 0) {
            sb = new StringBuilder();
            sb.append(C11419p1.m43984Y1(this.f28619a));
            sb.append("..");
            sb.append(C11419p1.m43984Y1(this.f28620b));
            sb.append(" step ");
            i = this.f28621c;
        } else {
            sb = new StringBuilder();
            sb.append(C11419p1.m43984Y1(this.f28619a));
            sb.append(" downTo ");
            sb.append(C11419p1.m43984Y1(this.f28620b));
            sb.append(" step ");
            i = -this.f28621c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: w */
    public final int mo23098w() {
        return this.f28620b;
    }

    /* renamed from: y */
    public final int mo23099y() {
        return this.f28621c;
    }

    public C11480v(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f28619a = i;
            this.f28620b = C11130q.m42841d(i, i2, i3);
            this.f28621c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
