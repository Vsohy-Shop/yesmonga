package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.C10955l0;

/* renamed from: kotlin.ranges.n */
public final class C11470n extends C10955l0 {

    /* renamed from: a */
    public final long f28608a;

    /* renamed from: b */
    public final long f28609b;

    /* renamed from: c */
    public boolean f28610c;

    /* renamed from: d */
    public long f28611d;

    public C11470n(long j, long j2, long j3) {
        this.f28608a = j3;
        this.f28609b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f28610c = z;
        this.f28611d = !z ? j2 : j;
    }

    /* renamed from: c */
    public long mo6234c() {
        long j = this.f28611d;
        if (j != this.f28609b) {
            this.f28611d = this.f28608a + j;
        } else if (this.f28610c) {
            this.f28610c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    /* renamed from: d */
    public final long mo23071d() {
        return this.f28608a;
    }

    public boolean hasNext() {
        return this.f28610c;
    }
}
