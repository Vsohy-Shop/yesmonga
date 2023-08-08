package kotlin.ranges;

import kotlin.collections.C10953k0;
import kotlin.internal.C11126n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.j */
public class C11463j implements Iterable<Integer>, C11345a {
    @C12579k

    /* renamed from: d */
    public static final C11464a f28594d = new C11464a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f28595a;

    /* renamed from: b */
    public final int f28596b;

    /* renamed from: c */
    public final int f28597c;

    /* renamed from: kotlin.ranges.j$a */
    public static final class C11464a {
        public /* synthetic */ C11464a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11463j mo23053a(int i, int i2, int i3) {
            return new C11463j(i, i2, i3);
        }

        public C11464a() {
        }
    }

    public C11463j(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f28595a = i;
            this.f28596b = C11126n.m42834c(i, i2, i3);
            this.f28597c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @C12579k
    /* renamed from: H */
    public C10953k0 iterator() {
        return new C11465k(this.f28595a, this.f28596b, this.f28597c);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11463j) {
            if (!isEmpty() || !((C11463j) obj).isEmpty()) {
                C11463j jVar = (C11463j) obj;
                if (!(this.f28595a == jVar.f28595a && this.f28596b == jVar.f28596b && this.f28597c == jVar.f28597c)) {
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
        return (((this.f28595a * 31) + this.f28596b) * 31) + this.f28597c;
    }

    public boolean isEmpty() {
        if (this.f28597c > 0) {
            if (this.f28595a > this.f28596b) {
                return true;
            }
        } else if (this.f28595a < this.f28596b) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final int mo23049r() {
        return this.f28595a;
    }

    @C12579k
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f28597c > 0) {
            sb = new StringBuilder();
            sb.append(this.f28595a);
            sb.append("..");
            sb.append(this.f28596b);
            sb.append(" step ");
            i = this.f28597c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f28595a);
            sb.append(" downTo ");
            sb.append(this.f28596b);
            sb.append(" step ");
            i = -this.f28597c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: w */
    public final int mo23051w() {
        return this.f28596b;
    }

    /* renamed from: y */
    public final int mo23052y() {
        return this.f28597c;
    }
}
