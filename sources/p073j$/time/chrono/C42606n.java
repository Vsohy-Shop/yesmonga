package p073j$.time.chrono;

import p073j$.time.C42586c;
import p073j$.time.C42619d;
import p073j$.time.C42658l;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.n */
public final class C42606n extends C42596d {

    /* renamed from: a */
    private final transient C42604l f107783a;

    /* renamed from: b */
    private final transient int f107784b;

    /* renamed from: c */
    private final transient int f107785c;

    /* renamed from: d */
    private final transient int f107786d;

    private C42606n(C42604l lVar, int i, int i2, int i3) {
        lVar.mo138073b0(i, i2, i3);
        this.f107783a = lVar;
        this.f107784b = i;
        this.f107785c = i2;
        this.f107786d = i3;
    }

    private C42606n(C42604l lVar, long j) {
        int[] c0 = lVar.mo138074c0((int) j);
        this.f107783a = lVar;
        this.f107784b = c0[0];
        this.f107785c = c0[1];
        this.f107786d = c0[2];
    }

    /* renamed from: K */
    private int m172155K() {
        return ((int) Math.floorMod(mo137949w() + 3, 7)) + 1;
    }

    /* renamed from: L */
    private int m172156L() {
        return this.f107783a.mo138072a0(this.f107784b, this.f107785c) + this.f107786d;
    }

    /* renamed from: R */
    static C42606n m172157R(C42604l lVar, int i, int i2, int i3) {
        return new C42606n(lVar, i, i2, i3);
    }

    /* renamed from: Y */
    static C42606n m172158Y(C42604l lVar, long j) {
        return new C42606n(lVar, j);
    }

    /* renamed from: d0 */
    private C42606n m172159d0(int i, int i2, int i3) {
        int f0 = this.f107783a.mo138077f0(i, i2);
        if (i3 > f0) {
            i3 = f0;
        }
        return new C42606n(this.f107783a, i, i2, i3);
    }

    /* renamed from: D */
    public final C42594b mo137914D(C42658l lVar) {
        return (C42606n) super.mo137914D(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C42594b mo138053E(long j) {
        return j == 0 ? this : m172159d0(Math.addExact(this.f107784b, (int) j), this.f107785c, this.f107786d);
    }

    /* renamed from: M */
    public final int mo137917M() {
        return this.f107783a.mo138078g0(this.f107784b);
    }

    /* renamed from: N */
    public final ChronoLocalDateTime mo137918N(LocalTime localTime) {
        return C42598f.m172096o(this, localTime);
    }

    /* renamed from: P */
    public final boolean mo137919P() {
        return this.f107783a.mo138030G((long) this.f107784b);
    }

    /* renamed from: a0 */
    public final C42606n m172169b(long j, C42677p pVar) {
        return (C42606n) super.mo137905b(j, pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final C42606n mo138055o(long j) {
        return new C42606n(this.f107783a, mo137949w() + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C42606n mo138056q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f107784b) * 12) + ((long) (this.f107785c - 1)) + j;
        C42604l lVar = this.f107783a;
        long floorDiv = Math.floorDiv(j2, 12);
        if (floorDiv >= ((long) lVar.mo138076e0()) && floorDiv <= ((long) lVar.mo138075d0())) {
            return m172159d0((int) floorDiv, ((int) Math.floorMod(j2, 12)) + 1, this.f107786d);
        }
        throw new C42586c("Invalid Hijrah year: " + floorDiv);
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        return (C42606n) super.mo137941k(localDate);
    }

    /* renamed from: e0 */
    public final C42606n m172166a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (C42606n) super.mo137902a(j, nVar);
        }
        C42662a aVar = (C42662a) nVar;
        this.f107783a.mo138036W(aVar).mo138227b(j, aVar);
        int i = (int) j;
        switch (C42605m.f107782a[aVar.ordinal()]) {
            case 1:
                return m172159d0(this.f107784b, this.f107785c, i);
            case 2:
                return mo138055o((long) (Math.min(i, mo137917M()) - m172156L()));
            case 3:
                return mo138055o((j - mo137886g(C42662a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo138055o(j - ((long) m172155K()));
            case 5:
                return mo138055o(j - mo137886g(C42662a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo138055o(j - mo137886g(C42662a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C42606n(this.f107783a, j);
            case 8:
                return mo138055o((j - mo137886g(C42662a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m172159d0(this.f107784b, i, this.f107786d);
            case 10:
                return mo138056q(j - (((((long) this.f107784b) * 12) + ((long) this.f107785c)) - 1));
            case 11:
                if (this.f107784b < 1) {
                    i = 1 - i;
                }
                return m172159d0(i, this.f107785c, this.f107786d);
            case 12:
                return m172159d0(i, this.f107785c, this.f107786d);
            case 13:
                return m172159d0(1 - this.f107784b, this.f107785c, this.f107786d);
            default:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42606n)) {
            return false;
        }
        C42606n nVar = (C42606n) obj;
        return this.f107784b == nVar.f107784b && this.f107785c == nVar.f107785c && this.f107786d == nVar.f107786d && this.f107783a.equals(nVar.f107783a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5 = (r5 - 1) % 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r5 = (r5 - 1) / 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        return (long) r5;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo137886g(p073j$.time.temporal.C42675n r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p073j$.time.temporal.C42662a
            if (r0 == 0) goto L_0x0067
            int[] r0 = p073j$.time.chrono.C42605m.f107782a
            r1 = r5
            j$.time.temporal.a r1 = (p073j$.time.temporal.C42662a) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L_0x0063;
                case 2: goto L_0x005e;
                case 3: goto L_0x0057;
                case 4: goto L_0x0052;
                case 5: goto L_0x004a;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x003b;
                case 9: goto L_0x0038;
                case 10: goto L_0x002a;
                case 11: goto L_0x0027;
                case 12: goto L_0x0027;
                case 13: goto L_0x001f;
                default: goto L_0x0013;
            }
        L_0x0013:
            j$.time.temporal.q r0 = new j$.time.temporal.q
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r5 = p073j$.time.C42619d.m172286a(r1, r5)
            r0.<init>(r5)
            throw r0
        L_0x001f:
            int r5 = r4.f107784b
            if (r5 <= r1) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            long r0 = (long) r1
            return r0
        L_0x0027:
            int r5 = r4.f107784b
            goto L_0x0065
        L_0x002a:
            int r5 = r4.f107784b
            long r0 = (long) r5
            r2 = 12
            long r0 = r0 * r2
            int r5 = r4.f107785c
            long r2 = (long) r5
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            return r0
        L_0x0038:
            int r5 = r4.f107785c
            goto L_0x0065
        L_0x003b:
            int r5 = r4.m172156L()
            goto L_0x0059
        L_0x0040:
            long r0 = r4.mo137949w()
            return r0
        L_0x0045:
            int r5 = r4.m172156L()
            goto L_0x004e
        L_0x004a:
            int r5 = r4.m172155K()
        L_0x004e:
            int r5 = r5 - r1
            int r5 = r5 % 7
            goto L_0x005c
        L_0x0052:
            int r5 = r4.m172155K()
            goto L_0x0065
        L_0x0057:
            int r5 = r4.f107786d
        L_0x0059:
            int r5 = r5 - r1
            int r5 = r5 / 7
        L_0x005c:
            int r5 = r5 + r1
            goto L_0x0065
        L_0x005e:
            int r5 = r4.m172156L()
            goto L_0x0065
        L_0x0063:
            int r5 = r4.f107786d
        L_0x0065:
            long r0 = (long) r5
            return r0
        L_0x0067:
            long r0 = r5.mo138218q(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.chrono.C42606n.mo137886g(j$.time.temporal.n):long");
    }

    /* renamed from: h */
    public final Chronology mo137937h() {
        return this.f107783a;
    }

    public final int hashCode() {
        int i = this.f107784b;
        int i2 = this.f107785c;
        return (((i << 11) + (i2 << 6)) + this.f107786d) ^ (this.f107783a.mo138038s().hashCode() ^ (i & -2048));
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        long j;
        int i;
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138212L(this);
        }
        if (mo137885f(nVar)) {
            C42662a aVar = (C42662a) nVar;
            int i2 = C42605m.f107782a[aVar.ordinal()];
            if (i2 == 1) {
                i = this.f107783a.mo138077f0(this.f107784b, this.f107785c);
            } else if (i2 == 2) {
                i = mo137917M();
            } else if (i2 != 3) {
                return this.f107783a.mo138036W(aVar);
            } else {
                j = 5;
                return C42679r.m172526j(1, j);
            }
            j = (long) i;
            return C42679r.m172526j(1, j);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: k */
    public final C42594b mo137941k(C42672k kVar) {
        return (C42606n) super.mo137941k(kVar);
    }

    /* renamed from: u */
    public final C42602j mo137947u() {
        return C42607o.f107787AH;
    }

    /* renamed from: v */
    public final C42594b mo137948v(long j, ChronoUnit chronoUnit) {
        return (C42606n) super.mo137948v(j, chronoUnit);
    }

    /* renamed from: w */
    public final long mo137949w() {
        return this.f107783a.mo138073b0(this.f107784b, this.f107785c, this.f107786d);
    }
}
