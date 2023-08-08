package org.joda.time;

/* renamed from: org.joda.time.e */
public abstract class C12646e implements Comparable<C12646e> {
    /* renamed from: M */
    public abstract long mo28931M(long j, long j2);

    /* renamed from: Q */
    public abstract String mo29033Q();

    /* renamed from: W */
    public abstract DurationFieldType mo29034W();

    /* renamed from: X */
    public abstract long mo28947X();

    /* renamed from: Z */
    public abstract int mo29035Z(long j);

    /* renamed from: b */
    public abstract long mo28909b(long j, int i);

    /* renamed from: e0 */
    public abstract int mo28932e0(long j, long j2);

    /* renamed from: f0 */
    public abstract long mo29036f0(long j);

    /* renamed from: g */
    public abstract long mo28910g(long j, long j2);

    /* renamed from: m0 */
    public abstract long mo28933m0(long j, long j2);

    /* renamed from: n0 */
    public abstract boolean mo28950n0();

    /* renamed from: o0 */
    public abstract boolean mo29037o0();

    /* renamed from: p0 */
    public long mo29038p0(long j, int i) {
        if (i == Integer.MIN_VALUE) {
            return mo29039t0(j, (long) i);
        }
        return mo28909b(j, -i);
    }

    /* renamed from: q */
    public abstract int mo28911q(long j, long j2);

    /* renamed from: r */
    public abstract long mo28912r(long j, long j2);

    /* renamed from: t0 */
    public long mo29039t0(long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            return mo28910g(j, -j2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }

    public abstract String toString();

    /* renamed from: w */
    public abstract long mo29041w(int i);

    /* renamed from: y */
    public abstract long mo28934y(int i, long j);

    /* renamed from: z */
    public abstract long mo29042z(long j);
}
