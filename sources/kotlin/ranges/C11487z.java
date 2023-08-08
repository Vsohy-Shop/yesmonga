package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;

@C11665v0(version = "1.3")
/* renamed from: kotlin.ranges.z */
public final class C11487z implements Iterator<C11588t1>, C11345a {

    /* renamed from: a */
    public final long f28632a;

    /* renamed from: b */
    public boolean f28633b;

    /* renamed from: c */
    public final long f28634c;

    /* renamed from: d */
    public long f28635d;

    public /* synthetic */ C11487z(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: b */
    public long mo23115b() {
        long j = this.f28635d;
        if (j != this.f28632a) {
            this.f28635d = C11588t1.m44970M(this.f28634c + j);
        } else if (this.f28633b) {
            this.f28633b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.f28633b;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return C11588t1.m44992g(mo23115b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C11487z(long j, long j2, long j3) {
        this.f28632a = j2;
        boolean z = true;
        if (j3 <= 0 ? Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 : Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
            z = false;
        }
        this.f28633b = z;
        this.f28634c = C11588t1.m44970M(j3);
        this.f28635d = !this.f28633b ? j2 : j;
    }
}
