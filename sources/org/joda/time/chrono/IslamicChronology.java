package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

public final class IslamicChronology extends BasicChronology {

    /* renamed from: A1 */
    public static final int f31010A1 = -292269337;

    /* renamed from: B1 */
    public static final int f31011B1 = 292271022;

    /* renamed from: C1 */
    public static final int f31012C1 = 59;

    /* renamed from: D1 */
    public static final int f31013D1 = 30;

    /* renamed from: E1 */
    public static final int f31014E1 = 29;

    /* renamed from: F1 */
    public static final long f31015F1 = 5097600000L;

    /* renamed from: G1 */
    public static final long f31016G1 = 2551440384L;

    /* renamed from: H1 */
    public static final long f31017H1 = 2592000000L;

    /* renamed from: I1 */
    public static final long f31018I1 = 30617280288L;

    /* renamed from: J1 */
    public static final long f31019J1 = 30585600000L;

    /* renamed from: K1 */
    public static final long f31020K1 = 30672000000L;

    /* renamed from: L1 */
    public static final long f31021L1 = -42521587200000L;

    /* renamed from: M1 */
    public static final int f31022M1 = 30;

    /* renamed from: N1 */
    public static final long f31023N1 = 918518400000L;

    /* renamed from: O1 */
    public static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> f31024O1 = new ConcurrentHashMap<>();

    /* renamed from: P1 */
    public static final IslamicChronology f31025P1 = m52940X0(DateTimeZone.f30651a);
    private static final long serialVersionUID = -3663823829888L;

    /* renamed from: u1 */
    public static final int f31026u1 = 1;

    /* renamed from: v1 */
    public static final C12599c f31027v1 = new C12610d("AH");

    /* renamed from: w1 */
    public static final LeapYearPatternType f31028w1 = new LeapYearPatternType(0, 623158436);

    /* renamed from: x1 */
    public static final LeapYearPatternType f31029x1 = new LeapYearPatternType(1, 623191204);

    /* renamed from: y1 */
    public static final LeapYearPatternType f31030y1 = new LeapYearPatternType(2, 690562340);

    /* renamed from: z1 */
    public static final LeapYearPatternType f31031z1 = new LeapYearPatternType(3, 153692453);
    private final LeapYearPatternType iLeapYears;

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        public LeapYearPatternType(int i, int i2) {
            this.index = (byte) i;
            this.pattern = i2;
        }

        private Object readResolve() {
            byte b = this.index;
            if (b == 0) {
                return IslamicChronology.f31028w1;
            }
            if (b == 1) {
                return IslamicChronology.f31029x1;
            }
            if (b == 2) {
                return IslamicChronology.f31030y1;
            }
            if (b != 3) {
                return this;
            }
            return IslamicChronology.f31031z1;
        }

        /* renamed from: a */
        public boolean mo28918a(int i) {
            if (((1 << (i % 30)) & this.pattern) > 0) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LeapYearPatternType) || this.index != ((LeapYearPatternType) obj).index) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.index;
        }
    }

    public IslamicChronology(C12589a aVar, Object obj, LeapYearPatternType leapYearPatternType) {
        super(aVar, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    /* renamed from: W0 */
    public static IslamicChronology m52939W0() {
        return m52941Y0(DateTimeZone.m51374n(), f31029x1);
    }

    /* renamed from: X0 */
    public static IslamicChronology m52940X0(DateTimeZone dateTimeZone) {
        return m52941Y0(dateTimeZone, f31029x1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = new org.joda.time.chrono.IslamicChronology[4];
     */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.chrono.IslamicChronology m52941Y0(org.joda.time.DateTimeZone r12, org.joda.time.chrono.IslamicChronology.LeapYearPatternType r13) {
        /*
            if (r12 != 0) goto L_0x0006
            org.joda.time.DateTimeZone r12 = org.joda.time.DateTimeZone.m51374n()
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.IslamicChronology[]> r0 = f31024O1
            java.lang.Object r1 = r0.get(r12)
            org.joda.time.chrono.IslamicChronology[] r1 = (org.joda.time.chrono.IslamicChronology[]) r1
            if (r1 != 0) goto L_0x001c
            r1 = 4
            org.joda.time.chrono.IslamicChronology[] r1 = new org.joda.time.chrono.IslamicChronology[r1]
            java.lang.Object r0 = r0.putIfAbsent(r12, r1)
            org.joda.time.chrono.IslamicChronology[] r0 = (org.joda.time.chrono.IslamicChronology[]) r0
            if (r0 == 0) goto L_0x001c
            r1 = r0
        L_0x001c:
            byte r0 = r13.index
            r0 = r1[r0]
            if (r0 != 0) goto L_0x0062
            monitor-enter(r1)
            byte r0 = r13.index     // Catch:{ all -> 0x005f }
            r0 = r1[r0]     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005d
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.f30651a     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r12 != r0) goto L_0x004b
            org.joda.time.chrono.IslamicChronology r12 = new org.joda.time.chrono.IslamicChronology     // Catch:{ all -> 0x005f }
            r12.<init>(r2, r2, r13)     // Catch:{ all -> 0x005f }
            org.joda.time.DateTime r0 = new org.joda.time.DateTime     // Catch:{ all -> 0x005f }
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r0
            r11 = r12
            r3.<init>((int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (int) r10, (org.joda.time.C12589a) r11)     // Catch:{ all -> 0x005f }
            org.joda.time.chrono.IslamicChronology r3 = new org.joda.time.chrono.IslamicChronology     // Catch:{ all -> 0x005f }
            org.joda.time.chrono.LimitChronology r12 = org.joda.time.chrono.LimitChronology.m52997d0(r12, r0, r2)     // Catch:{ all -> 0x005f }
            r3.<init>(r12, r2, r13)     // Catch:{ all -> 0x005f }
            goto L_0x0058
        L_0x004b:
            org.joda.time.chrono.IslamicChronology r0 = m52941Y0(r0, r13)     // Catch:{ all -> 0x005f }
            org.joda.time.chrono.IslamicChronology r3 = new org.joda.time.chrono.IslamicChronology     // Catch:{ all -> 0x005f }
            org.joda.time.chrono.ZonedChronology r12 = org.joda.time.chrono.ZonedChronology.m53047c0(r0, r12)     // Catch:{ all -> 0x005f }
            r3.<init>(r12, r2, r13)     // Catch:{ all -> 0x005f }
        L_0x0058:
            byte r12 = r13.index     // Catch:{ all -> 0x005f }
            r1[r12] = r3     // Catch:{ all -> 0x005f }
            r0 = r3
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0062
        L_0x005f:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            throw r12
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.m52941Y0(org.joda.time.DateTimeZone, org.joda.time.chrono.IslamicChronology$LeapYearPatternType):org.joda.time.chrono.IslamicChronology");
    }

    /* renamed from: Z0 */
    public static IslamicChronology m52942Z0() {
        return f31025P1;
    }

    private Object readResolve() {
        C12589a X = mo28850X();
        if (X == null) {
            return m52942Z0();
        }
        return m52940X0(X.mo27836s());
    }

    /* renamed from: C0 */
    public int mo28856C0() {
        return f31011B1;
    }

    /* renamed from: E0 */
    public int mo28858E0() {
        return 1;
    }

    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ int mo28859F0() {
        return super.mo28859F0();
    }

    /* renamed from: H0 */
    public int mo28861H0(long j, int i) {
        int Q0 = (int) ((j - mo28870Q0(i)) / 86400000);
        if (Q0 == 354) {
            return 12;
        }
        return ((Q0 * 2) / 59) + 1;
    }

    /* renamed from: I0 */
    public long mo28862I0(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 % 2 == 1) {
            return (((long) (i3 / 2)) * 5097600000L) + 2592000000L;
        }
        return ((long) (i3 / 2)) * 5097600000L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0023, code lost:
        if (mo28874U0(r0) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r6 = 30672000000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        r6 = 30585600000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r9 < r6) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r9 = r9 - r6;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (mo28874U0(r0) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        return r0;
     */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo28867N0(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.mo28874U0(r0)
            r2 = 30672000000(0x724319400, double:1.5153981489E-313)
            r4 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            if (r1 == 0) goto L_0x0027
        L_0x0025:
            r6 = r2
            goto L_0x0028
        L_0x0027:
            r6 = r4
        L_0x0028:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0036
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.mo28874U0(r0)
            if (r1 == 0) goto L_0x0027
            goto L_0x0025
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.mo28867N0(long):int");
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

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return f31025P1;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52940X0(dateTimeZone);
    }

    /* renamed from: U0 */
    public boolean mo28874U0(int i) {
        return this.iLeapYears.mo28918a(i);
    }

    /* renamed from: V0 */
    public long mo28875V0(long j, int i) {
        int r0 = mo28890r0(j, mo28867N0(j));
        int D0 = mo28857D0(j);
        if (r0 > 354 && !mo28874U0(i)) {
            r0--;
        }
        return mo28871R0(i, 1, r0) + ((long) D0);
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        if (mo28850X() == null) {
            super.mo28849W(aVar);
            aVar.f30912I = f31027v1;
            C12609c cVar = new C12609c(this, 12);
            aVar.f30907D = cVar;
            aVar.f30921i = cVar.mo28841t();
        }
    }

    /* renamed from: a1 */
    public LeapYearPatternType mo28917a1() {
        return this.iLeapYears;
    }

    /* renamed from: c0 */
    public long mo28876c0(int i) {
        long j;
        if (i > 292271022) {
            throw new ArithmeticException("Year is too large: " + i + " > " + f31011B1);
        } else if (i >= -292269337) {
            int i2 = i - 1;
            long j2 = (((long) (i2 / 30)) * f31023N1) + f31021L1;
            int i3 = (i2 % 30) + 1;
            for (int i4 = 1; i4 < i3; i4++) {
                if (mo28874U0(i4)) {
                    j = f31020K1;
                } else {
                    j = f31019J1;
                }
                j2 += j;
            }
            return j2;
        } else {
            throw new ArithmeticException("Year is too small: " + i + " < " + -292269337);
        }
    }

    /* renamed from: d0 */
    public long mo28877d0() {
        return 21260793600000L;
    }

    /* renamed from: e0 */
    public long mo28878e0() {
        return f31016G1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IslamicChronology)) {
            return false;
        }
        if (mo28917a1().index != ((IslamicChronology) obj).mo28917a1().index || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public long mo28880f0() {
        return f31018I1;
    }

    /* renamed from: g0 */
    public long mo28881g0() {
        return 15308640144L;
    }

    public int hashCode() {
        return (super.hashCode() * 13) + mo28917a1().hashCode();
    }

    /* renamed from: m0 */
    public int mo28885m0(long j) {
        int q0 = mo28889q0(j) - 1;
        if (q0 == 354) {
            return 30;
        }
        return ((q0 % 59) % 30) + 1;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return super.mo28650p(i, i2, i3, i4);
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.mo28651q(i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: s */
    public /* bridge */ /* synthetic */ DateTimeZone mo27836s() {
        return super.mo27836s();
    }

    /* renamed from: s0 */
    public int mo28891s0() {
        return 30;
    }

    /* renamed from: t0 */
    public int mo28892t0(int i) {
        return (i == 12 || (i + -1) % 2 == 0) ? 30 : 29;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: w0 */
    public int mo28895w0(int i) {
        return mo28874U0(i) ? 355 : 354;
    }

    /* renamed from: x0 */
    public int mo28896x0() {
        return 355;
    }

    /* renamed from: y0 */
    public int mo28897y0(int i, int i2) {
        if ((i2 != 12 || !mo28874U0(i)) && (i2 - 1) % 2 != 0) {
            return 29;
        }
        return 30;
    }
}
