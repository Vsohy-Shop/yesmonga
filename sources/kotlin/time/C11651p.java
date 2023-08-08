package kotlin.time;

import kotlin.C11665v0;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.p */
public final class C11651p extends C11631b {

    /* renamed from: c */
    public long f28967c;

    public C11651p() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public long mo23425c() {
        return this.f28967c;
    }

    /* renamed from: d */
    public final void mo23493d(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f28967c + C11643j.m45660h(mo23424b()) + " is advanced by " + C11636e.m45500t2(j) + '.');
    }

    /* renamed from: e */
    public final void mo23494e(long j) {
        long j2;
        long q2 = C11636e.m45495q2(j, mo23424b());
        if (q2 == Long.MIN_VALUE || q2 == Long.MAX_VALUE) {
            double n2 = ((double) this.f28967c) + C11636e.m45488n2(j, mo23424b());
            if (n2 > 9.223372036854776E18d || n2 < -9.223372036854776E18d) {
                mo23493d(j);
            }
            j2 = (long) n2;
        } else {
            long j3 = this.f28967c;
            j2 = j3 + q2;
            if ((q2 ^ j3) >= 0 && (j3 ^ j2) < 0) {
                mo23493d(j);
            }
        }
        this.f28967c = j2;
    }
}
