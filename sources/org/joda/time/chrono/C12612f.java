package org.joda.time.chrono;

import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12652e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.f */
public final class C12612f extends ImpreciseDateTimeField {

    /* renamed from: f */
    public static final long f31067f = 6215066916806820644L;

    /* renamed from: g */
    public static final long f31068g = 31449600000L;

    /* renamed from: e */
    public final BasicChronology f31069e;

    public C12612f(BasicChronology basicChronology) {
        super(DateTimeFieldType.m51320U(), basicChronology.mo28880f0());
        this.f31069e = basicChronology;
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31069e.mo28858E0();
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return null;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        BasicChronology basicChronology = this.f31069e;
        return basicChronology.mo28865L0(basicChronology.mo28866M0(j)) > 52;
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
        long O = this.f31069e.mo28626L().mo28812O(j);
        int J0 = this.f31069e.mo28863J0(O);
        if (J0 > 1) {
            return O - (((long) (J0 - 1)) * 604800000);
        }
        return O;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, Math.abs(i), this.f31069e.mo28858E0(), this.f31069e.mo28856C0());
        int g = mo28828g(j);
        if (g == i) {
            return j;
        }
        int p0 = this.f31069e.mo28888p0(j);
        int L0 = this.f31069e.mo28865L0(g);
        int L02 = this.f31069e.mo28865L0(i);
        if (L02 < L0) {
            L0 = L02;
        }
        int J0 = this.f31069e.mo28863J0(j);
        if (J0 <= L0) {
            L0 = J0;
        }
        long V0 = this.f31069e.mo28875V0(j, i);
        int g2 = mo28828g(V0);
        if (g2 < i) {
            V0 += 604800000;
        } else if (g2 > i) {
            V0 -= 604800000;
        }
        return this.f31069e.mo28642h().mo28816S(V0 + (((long) (L0 - this.f31069e.mo28863J0(V0))) * 604800000), p0);
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return i == 0 ? j : mo28816S(j, mo28828g(j) + i);
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo28822a(j, C12652e.m53804n(j2));
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28822a(j, i);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31069e.mo28866M0(j);
    }

    public final Object readResolve() {
        return this.f31069e.mo28628N();
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        if (j < j2) {
            return (long) (-mo28839r(j2, j));
        }
        int g = mo28828g(j);
        int g2 = mo28828g(j2);
        long M = mo28810M(j);
        long M2 = mo28810M(j2);
        if (M2 >= f31068g && this.f31069e.mo28865L0(g) <= 52) {
            M2 -= 604800000;
        }
        int i = g - g2;
        if (M < M2) {
            i--;
        }
        return (long) i;
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        BasicChronology basicChronology = this.f31069e;
        return basicChronology.mo28865L0(basicChronology.mo28866M0(j)) - 52;
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return this.f31069e.mo28627M();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31069e.mo28856C0();
    }
}
