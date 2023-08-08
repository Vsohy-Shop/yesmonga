package org.joda.time.chrono;

import org.joda.time.C12589a;

abstract class BasicFixedMonthChronology extends BasicChronology {
    private static final long serialVersionUID = 261387371998L;

    /* renamed from: u1 */
    public static final int f30963u1 = 30;

    /* renamed from: v1 */
    public static final long f30964v1 = 31557600000L;

    /* renamed from: w1 */
    public static final long f30965w1 = 2592000000L;

    public BasicFixedMonthChronology(C12589a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* renamed from: A0 */
    public int mo28854A0() {
        return 13;
    }

    /* renamed from: G0 */
    public int mo28860G0(long j) {
        return ((mo28889q0(j) - 1) / 30) + 1;
    }

    /* renamed from: H0 */
    public int mo28861H0(long j, int i) {
        return ((int) ((j - mo28870Q0(i)) / 2592000000L)) + 1;
    }

    /* renamed from: I0 */
    public long mo28862I0(int i, int i2) {
        return ((long) (i2 - 1)) * 2592000000L;
    }

    /* renamed from: O0 */
    public long mo28868O0(long j, long j2) {
        int N0 = mo28867N0(j);
        int N02 = mo28867N0(j2);
        int i = N0 - N02;
        if (j - mo28870Q0(N0) < j2 - mo28870Q0(N02)) {
            i--;
        }
        return (long) i;
    }

    /* renamed from: U0 */
    public boolean mo28874U0(int i) {
        return (i & 3) == 3;
    }

    /* renamed from: V0 */
    public long mo28875V0(long j, int i) {
        int r0 = mo28890r0(j, mo28867N0(j));
        int D0 = mo28857D0(j);
        if (r0 > 365 && !mo28874U0(i)) {
            r0--;
        }
        return mo28871R0(i, 1, r0) + ((long) D0);
    }

    /* renamed from: e0 */
    public long mo28878e0() {
        return 2592000000L;
    }

    /* renamed from: f0 */
    public long mo28880f0() {
        return 31557600000L;
    }

    /* renamed from: g0 */
    public long mo28881g0() {
        return 15778800000L;
    }

    /* renamed from: m0 */
    public int mo28885m0(long j) {
        return ((mo28889q0(j) - 1) % 30) + 1;
    }

    /* renamed from: s0 */
    public int mo28891s0() {
        return 30;
    }

    /* renamed from: t0 */
    public int mo28892t0(int i) {
        return i != 13 ? 30 : 6;
    }

    /* renamed from: y0 */
    public int mo28897y0(int i, int i2) {
        if (i2 != 13) {
            return 30;
        }
        return mo28874U0(i) ? 6 : 5;
    }
}
