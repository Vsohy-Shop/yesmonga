package kotlin.ranges;

import com.google.firebase.perf.metrics.C33381i;
import kotlin.collections.C10972q;
import kotlin.internal.C11126n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.a */
public class C11446a implements Iterable<Character>, C11345a {
    @C12579k

    /* renamed from: d */
    public static final C11447a f28574d = new C11447a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final char f28575a;

    /* renamed from: b */
    public final char f28576b;

    /* renamed from: c */
    public final int f28577c;

    /* renamed from: kotlin.ranges.a$a */
    public static final class C11447a {
        public /* synthetic */ C11447a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11446a mo23002a(char c, char c2, int i) {
            return new C11446a(c, c2, i);
        }

        public C11447a() {
        }
    }

    public C11446a(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f28575a = c;
            this.f28576b = (char) C11126n.m42834c(c, c2, i);
            this.f28577c = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @C12579k
    /* renamed from: H */
    public C10972q iterator() {
        return new C11450b(this.f28575a, this.f28576b, this.f28577c);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11446a) {
            if (!isEmpty() || !((C11446a) obj).isEmpty()) {
                C11446a aVar = (C11446a) obj;
                if (!(this.f28575a == aVar.f28575a && this.f28576b == aVar.f28576b && this.f28577c == aVar.f28577c)) {
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
        return (((this.f28575a * C33381i.f81115x) + this.f28576b) * 31) + this.f28577c;
    }

    public boolean isEmpty() {
        if (this.f28577c > 0) {
            if (Intrinsics.compare((int) this.f28575a, (int) this.f28576b) > 0) {
                return true;
            }
        } else if (Intrinsics.compare((int) this.f28575a, (int) this.f28576b) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final char mo22998r() {
        return this.f28575a;
    }

    @C12579k
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f28577c > 0) {
            sb = new StringBuilder();
            sb.append(this.f28575a);
            sb.append("..");
            sb.append(this.f28576b);
            sb.append(" step ");
            i = this.f28577c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f28575a);
            sb.append(" downTo ");
            sb.append(this.f28576b);
            sb.append(" step ");
            i = -this.f28577c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: w */
    public final char mo23000w() {
        return this.f28576b;
    }

    /* renamed from: y */
    public final int mo23001y() {
        return this.f28577c;
    }
}
