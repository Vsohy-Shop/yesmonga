package org.joda.time.chrono;

import org.joda.time.C12641d;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12652e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.c */
public class C12609c extends ImpreciseDateTimeField {

    /* renamed from: v */
    public static final long f31058v = -8258715387168736L;

    /* renamed from: w */
    public static final int f31059w = 1;

    /* renamed from: e */
    public final BasicChronology f31060e;

    /* renamed from: f */
    public final int f31061f;

    /* renamed from: g */
    public final int f31062g;

    public C12609c(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.m51316Q(), basicChronology.mo28878e0());
        this.f31060e = basicChronology;
        this.f31061f = basicChronology.mo28854A0();
        this.f31062g = i;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31060e.mo28634V();
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        int N0 = this.f31060e.mo28867N0(j);
        if (!this.f31060e.mo28874U0(N0) || this.f31060e.mo28861H0(j, N0) != this.f31062g) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return j - mo28812O(j);
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        int N0 = this.f31060e.mo28867N0(j);
        return this.f31060e.mo28872S0(N0, this.f31060e.mo28861H0(j, N0));
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, 1, this.f31061f);
        int N0 = this.f31060e.mo28867N0(j);
        int n0 = this.f31060e.mo28886n0(j, N0);
        int y0 = this.f31060e.mo28897y0(N0, i);
        if (n0 > y0) {
            n0 = y0;
        }
        return this.f31060e.mo28871R0(N0, i, n0) + ((long) this.f31060e.mo28857D0(j));
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long D0 = (long) this.f31060e.mo28857D0(j);
        int N0 = this.f31060e.mo28867N0(j);
        int H0 = this.f31060e.mo28861H0(j, N0);
        int i7 = H0 - 1;
        int i8 = i7 + i;
        if (H0 <= 0 || i8 >= 0) {
            i2 = N0;
        } else {
            if (Math.signum((float) (this.f31061f + i)) == Math.signum((float) i)) {
                i6 = N0 - 1;
                i5 = i + this.f31061f;
            } else {
                i6 = N0 + 1;
                i5 = i - this.f31061f;
            }
            int i9 = i6;
            i8 = i5 + i7;
            i2 = i9;
        }
        if (i8 >= 0) {
            int i10 = this.f31061f;
            i3 = i2 + (i8 / i10);
            i4 = (i8 % i10) + 1;
        } else {
            i3 = (i2 + (i8 / this.f31061f)) - 1;
            int abs = Math.abs(i8);
            int i11 = this.f31061f;
            int i12 = abs % i11;
            if (i12 == 0) {
                i12 = i11;
            }
            i4 = (i11 - i12) + 1;
            if (i4 == 1) {
                i3++;
            }
        }
        int o0 = this.f31060e.mo28887o0(j, N0, H0);
        int y0 = this.f31060e.mo28897y0(i3, i4);
        if (o0 > y0) {
            o0 = y0;
        }
        return this.f31060e.mo28871R0(i3, i4, o0) + D0;
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        int i = (int) j6;
        if (((long) i) == j6) {
            return mo28822a(j5, i);
        }
        long D0 = (long) this.f31060e.mo28857D0(j5);
        int N0 = this.f31060e.mo28867N0(j5);
        int H0 = this.f31060e.mo28861H0(j5, N0);
        long j7 = ((long) (H0 - 1)) + j6;
        if (j7 >= 0) {
            int i2 = this.f31061f;
            j3 = ((long) N0) + (j7 / ((long) i2));
            j4 = (j7 % ((long) i2)) + 1;
        } else {
            j3 = (((long) N0) + (j7 / ((long) this.f31061f))) - 1;
            long abs = Math.abs(j7);
            int i3 = this.f31061f;
            int i4 = (int) (abs % ((long) i3));
            if (i4 == 0) {
                i4 = i3;
            }
            j4 = (long) ((i3 - i4) + 1);
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < ((long) this.f31060e.mo28858E0()) || j3 > ((long) this.f31060e.mo28856C0())) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j6);
        }
        int i5 = (int) j3;
        int i6 = (int) j4;
        int o0 = this.f31060e.mo28887o0(j5, N0, H0);
        int y0 = this.f31060e.mo28897y0(i5, i6);
        if (o0 > y0) {
            o0 = y0;
        }
        return this.f31060e.mo28871R0(i5, i6, o0) + D0;
    }

    /* renamed from: c */
    public int[] mo28824c(C12714n nVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (nVar.size() > 0 && nVar.mo28207t(0).equals(DateTimeFieldType.m51316Q()) && i == 0) {
            return mo28819V(nVar, 0, iArr, ((((iArr[0] - 1) + (i2 % 12)) + 12) % 12) + 1);
        }
        if (!C12641d.m53381p(nVar)) {
            return super.mo28824c(nVar, i, iArr, i2);
        }
        int size = nVar.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j = nVar.mo28207t(i3).mo27802F(this.f31060e).mo28816S(j, iArr[i3]);
        }
        return this.f31060e.mo28647m(nVar, mo28822a(j, i2));
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28816S(j, C12652e.m53793c(mo28828g(j), i, 1, this.f31061f));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31060e.mo28860G0(j);
    }

    public final Object readResolve() {
        return this.f31060e.mo28619E();
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        if (j < j2) {
            return (long) (-mo28839r(j2, j));
        }
        int N0 = this.f31060e.mo28867N0(j);
        int H0 = this.f31060e.mo28861H0(j, N0);
        int N02 = this.f31060e.mo28867N0(j2);
        int H02 = this.f31060e.mo28861H0(j2, N02);
        long j3 = ((((long) (N0 - N02)) * ((long) this.f31061f)) + ((long) H0)) - ((long) H02);
        int o0 = this.f31060e.mo28887o0(j, N0, H0);
        if (o0 == this.f31060e.mo28897y0(N0, H0) && this.f31060e.mo28887o0(j2, N02, H02) > o0) {
            j2 = this.f31060e.mo28641g().mo28816S(j2, o0);
        }
        if (j - this.f31060e.mo28872S0(N0, H0) < j2 - this.f31060e.mo28872S0(N02, H02)) {
            return j3 - 1;
        }
        return j3;
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        return mo28807J(j) ? 1 : 0;
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return this.f31060e.mo28644j();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31061f;
    }
}
