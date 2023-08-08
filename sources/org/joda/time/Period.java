package org.joda.time;

import com.urbanairship.AirshipConfigOptions;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Period extends BasePeriod implements C12715o, Serializable {

    /* renamed from: b */
    public static final Period f30764b = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period() {
        super(0, (PeriodType) null, (C12589a) null);
    }

    /* renamed from: D0 */
    public static Period m52080D0(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.m52156q());
    }

    /* renamed from: E0 */
    public static Period m52081E0(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.m52156q());
    }

    /* renamed from: O1 */
    public static Period m52082O1(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0}, PeriodType.m52156q());
    }

    @FromString
    /* renamed from: P0 */
    public static Period m52083P0(String str) {
        return m52084Q0(str, C12685j.m54341e());
    }

    /* renamed from: Q0 */
    public static Period m52084Q0(String str, C12692p pVar) {
        return pVar.mo29322l(str);
    }

    /* renamed from: R */
    public static Period m52085R(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.m52156q());
    }

    /* renamed from: S */
    public static Period m52086S(C12714n nVar, C12714n nVar2) {
        if (nVar == null || nVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (nVar.size() == nVar2.size()) {
            DurationFieldType[] durationFieldTypeArr = new DurationFieldType[nVar.size()];
            int[] iArr = new int[nVar.size()];
            int size = nVar.size();
            int i = 0;
            while (i < size) {
                if (nVar.mo28207t(i) == nVar2.mo28207t(i)) {
                    DurationFieldType E = nVar.mo28207t(i).mo27801E();
                    durationFieldTypeArr[i] = E;
                    if (i <= 0 || durationFieldTypeArr[i - 1] != E) {
                        iArr[i] = nVar2.getValue(i) - nVar.getValue(i);
                        i++;
                    } else {
                        throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
                    }
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            return new Period(iArr, PeriodType.m52150d(durationFieldTypeArr));
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    /* renamed from: d1 */
    public static Period m52087d1(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.m52156q());
    }

    /* renamed from: k0 */
    public static Period m52088k0(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.m52156q());
    }

    /* renamed from: l0 */
    public static Period m52089l0(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.m52156q());
    }

    /* renamed from: o1 */
    public static Period m52090o1(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.m52156q());
    }

    /* renamed from: B0 */
    public Period mo28399B0(int i) {
        return mo28422b1(-i);
    }

    /* renamed from: C1 */
    public Period mo28400C1(PeriodType periodType) {
        PeriodType m = C12641d.m53378m(periodType);
        if (m.equals(mo27841F1())) {
            return this;
        }
        return new Period((Object) this, m);
    }

    /* renamed from: D1 */
    public Period mo28401D1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30786v, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: G0 */
    public Period mo28402G0(int i) {
        if (this == f30764b || i == 1) {
            return this;
        }
        int[] f = mo28795f();
        for (int i2 = 0; i2 < f.length; i2++) {
            f[i2] = C12652e.m53798h(f[i2], i);
        }
        return new Period(f, mo27841F1());
    }

    /* renamed from: I0 */
    public Period mo28403I0() {
        return mo28402G0(-1);
    }

    /* renamed from: J0 */
    public Period mo28404J0() {
        return mo28407M0(PeriodType.m52156q());
    }

    /* renamed from: J1 */
    public Period mo28405J1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30782d, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: K1 */
    public Period mo28406K1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30780b, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: M0 */
    public Period mo28407M0(PeriodType periodType) {
        PeriodType m = C12641d.m53378m(periodType);
        Period period = new Period(((long) mo28416Y()) + (((long) mo28423c0()) * 1000) + (((long) mo28419a0()) * AirshipConfigOptions.f87111Y) + (((long) mo28412V()) * 3600000) + (((long) mo28410T()) * 86400000) + (((long) mo28424d0()) * 604800000), m, (C12589a) ISOChronology.m52935c0());
        int g0 = mo28427g0();
        int b0 = mo28421b0();
        if (!(g0 == 0 && b0 == 0)) {
            long j = (((long) g0) * 12) + ((long) b0);
            if (m.mo28458j(DurationFieldType.f30672E0)) {
                int n = C12652e.m53804n(j / 12);
                period = period.mo28406K1(n);
                j -= (long) (n * 12);
            }
            if (m.mo28458j(DurationFieldType.f30673F0)) {
                int n2 = C12652e.m53804n(j);
                j -= (long) n2;
                period = period.mo28447y1(n2);
            }
            if (j != 0) {
                throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
            }
        }
        return period;
    }

    /* renamed from: N */
    public final void mo28408N(String str) {
        if (mo28421b0() != 0) {
            throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains months and months vary in length");
        } else if (mo28427g0() != 0) {
            throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains years and years vary in length");
        }
    }

    /* renamed from: S0 */
    public Period mo28409S0(C12715o oVar) {
        if (oVar == null) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30780b, f, oVar.mo28694B1(DurationFieldType.f30672E0));
        mo27841F1().mo28451a(this, PeriodType.f30781c, f, oVar.mo28694B1(DurationFieldType.f30673F0));
        mo27841F1().mo28451a(this, PeriodType.f30782d, f, oVar.mo28694B1(DurationFieldType.f30674G0));
        mo27841F1().mo28451a(this, PeriodType.f30783e, f, oVar.mo28694B1(DurationFieldType.f30675H0));
        mo27841F1().mo28451a(this, PeriodType.f30784f, f, oVar.mo28694B1(DurationFieldType.f30677J0));
        mo27841F1().mo28451a(this, PeriodType.f30785g, f, oVar.mo28694B1(DurationFieldType.f30678K0));
        mo27841F1().mo28451a(this, PeriodType.f30786v, f, oVar.mo28694B1(DurationFieldType.f30679L0));
        mo27841F1().mo28451a(this, PeriodType.f30787w, f, oVar.mo28694B1(DurationFieldType.f30680M0));
        return new Period(f, mo27841F1());
    }

    /* renamed from: T */
    public int mo28410T() {
        return mo27841F1().mo28454f(this, PeriodType.f30783e);
    }

    /* renamed from: T0 */
    public Period mo28411T0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30783e, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: V */
    public int mo28412V() {
        return mo27841F1().mo28454f(this, PeriodType.f30784f);
    }

    /* renamed from: V0 */
    public Period mo28413V0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30784f, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: W0 */
    public Period mo28414W0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30787w, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: X0 */
    public Period mo28415X0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30785g, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: Y */
    public int mo28416Y() {
        return mo27841F1().mo28454f(this, PeriodType.f30787w);
    }

    /* renamed from: Y0 */
    public Period mo28417Y0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30781c, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: Z0 */
    public Period mo28418Z0(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30786v, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: a0 */
    public int mo28419a0() {
        return mo27841F1().mo28454f(this, PeriodType.f30785g);
    }

    /* renamed from: a1 */
    public Period mo28420a1(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30782d, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: b0 */
    public int mo28421b0() {
        return mo27841F1().mo28454f(this, PeriodType.f30781c);
    }

    /* renamed from: b1 */
    public Period mo28422b1(int i) {
        if (i == 0) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30780b, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: c0 */
    public int mo28423c0() {
        return mo27841F1().mo28454f(this, PeriodType.f30786v);
    }

    /* renamed from: d0 */
    public int mo28424d0() {
        return mo27841F1().mo28454f(this, PeriodType.f30782d);
    }

    /* renamed from: e1 */
    public Days mo28425e1() {
        mo28408N("Days");
        return Days.m51406Q(C12652e.m53804n(C12652e.m53795e(C12652e.m53795e((((((long) mo28416Y()) + (((long) mo28423c0()) * 1000)) + (((long) mo28419a0()) * AirshipConfigOptions.f87111Y)) + (((long) mo28412V()) * 3600000)) / 86400000, (long) mo28410T()), ((long) mo28424d0()) * 7)));
    }

    /* renamed from: f1 */
    public Duration mo28426f1() {
        mo28408N("Duration");
        return new Duration(((long) mo28416Y()) + (((long) mo28423c0()) * 1000) + (((long) mo28419a0()) * AirshipConfigOptions.f87111Y) + (((long) mo28412V()) * 3600000) + (((long) mo28410T()) * 86400000) + (((long) mo28424d0()) * 604800000));
    }

    /* renamed from: g0 */
    public int mo28427g0() {
        return mo27841F1().mo28454f(this, PeriodType.f30780b);
    }

    /* renamed from: g1 */
    public Hours mo28428g1() {
        mo28408N("Hours");
        return Hours.m51472X(C12652e.m53804n(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e(((((long) mo28416Y()) + (((long) mo28423c0()) * 1000)) + (((long) mo28419a0()) * AirshipConfigOptions.f87111Y)) / 3600000, (long) mo28412V()), ((long) mo28410T()) * 24), ((long) mo28424d0()) * 168)));
    }

    /* renamed from: h1 */
    public Minutes mo28429h1() {
        mo28408N("Minutes");
        return Minutes.m51824p0(C12652e.m53804n(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e((((long) mo28416Y()) + (((long) mo28423c0()) * 1000)) / AirshipConfigOptions.f87111Y, (long) mo28419a0()), ((long) mo28412V()) * 60), ((long) mo28410T()) * 1440), ((long) mo28424d0()) * 10080)));
    }

    /* renamed from: i1 */
    public Seconds mo28430i1() {
        mo28408N("Seconds");
        return Seconds.m52179N0(C12652e.m53804n(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e(C12652e.m53795e((long) (mo28416Y() / 1000), (long) mo28423c0()), ((long) mo28419a0()) * 60), ((long) mo28412V()) * 3600), ((long) mo28410T()) * 86400), ((long) mo28424d0()) * 604800)));
    }

    /* renamed from: l */
    public Period mo28431l() {
        return this;
    }

    /* renamed from: m1 */
    public Weeks mo28432m1() {
        mo28408N("Weeks");
        return Weeks.m52257M1(C12652e.m53804n(((long) mo28424d0()) + (((((((long) mo28416Y()) + (((long) mo28423c0()) * 1000)) + (((long) mo28419a0()) * AirshipConfigOptions.f87111Y)) + (((long) mo28412V()) * 3600000)) + (((long) mo28410T()) * 86400000)) / 604800000)));
    }

    /* renamed from: p1 */
    public Period mo28433p1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30783e, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: q0 */
    public Period mo28434q0(C12715o oVar) {
        if (oVar == null) {
            return this;
        }
        int[] f = mo28795f();
        mo27841F1().mo28451a(this, PeriodType.f30780b, f, -oVar.mo28694B1(DurationFieldType.f30672E0));
        mo27841F1().mo28451a(this, PeriodType.f30781c, f, -oVar.mo28694B1(DurationFieldType.f30673F0));
        mo27841F1().mo28451a(this, PeriodType.f30782d, f, -oVar.mo28694B1(DurationFieldType.f30674G0));
        mo27841F1().mo28451a(this, PeriodType.f30783e, f, -oVar.mo28694B1(DurationFieldType.f30675H0));
        mo27841F1().mo28451a(this, PeriodType.f30784f, f, -oVar.mo28694B1(DurationFieldType.f30677J0));
        mo27841F1().mo28451a(this, PeriodType.f30785g, f, -oVar.mo28694B1(DurationFieldType.f30678K0));
        mo27841F1().mo28451a(this, PeriodType.f30786v, f, -oVar.mo28694B1(DurationFieldType.f30679L0));
        mo27841F1().mo28451a(this, PeriodType.f30787w, f, -oVar.mo28694B1(DurationFieldType.f30680M0));
        return new Period(f, mo27841F1());
    }

    /* renamed from: r0 */
    public Period mo28435r0(int i) {
        return mo28411T0(-i);
    }

    /* renamed from: r1 */
    public Period mo28436r1(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            int[] f = mo28795f();
            super.mo28681D(f, durationFieldType, i);
            return new Period(f, mo27841F1());
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    /* renamed from: s0 */
    public Period mo28437s0(int i) {
        return mo28413V0(-i);
    }

    /* renamed from: s1 */
    public Period mo28438s1(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            int[] f = mo28795f();
            super.mo28689k(f, durationFieldType, i);
            return new Period(f, mo27841F1());
        }
    }

    /* renamed from: t1 */
    public Period mo28439t1(C12715o oVar) {
        if (oVar == null) {
            return this;
        }
        return new Period(super.mo28679A(mo28795f(), oVar), mo27841F1());
    }

    /* renamed from: u1 */
    public Period mo28440u1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30784f, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: v0 */
    public Period mo28441v0(int i) {
        return mo28414W0(-i);
    }

    /* renamed from: v1 */
    public Period mo28442v1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30787w, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: w0 */
    public Period mo28443w0(int i) {
        return mo28415X0(-i);
    }

    /* renamed from: x0 */
    public Period mo28444x0(int i) {
        return mo28417Y0(-i);
    }

    /* renamed from: x1 */
    public Period mo28445x1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30785g, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: y0 */
    public Period mo28446y0(int i) {
        return mo28418Z0(-i);
    }

    /* renamed from: y1 */
    public Period mo28447y1(int i) {
        int[] f = mo28795f();
        mo27841F1().mo28459o(this, PeriodType.f30781c, f, i);
        return new Period(f, mo27841F1());
    }

    /* renamed from: z0 */
    public Period mo28448z0(int i) {
        return mo28420a1(-i);
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.m52156q());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.m52156q());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (C12589a) null);
    }

    public Period(long j, C12589a aVar) {
        super(j, (PeriodType) null, aVar);
    }

    public Period(long j, PeriodType periodType, C12589a aVar) {
        super(j, periodType, aVar);
    }

    public Period(long j, long j2) {
        super(j, j2, (PeriodType) null, (C12589a) null);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, (C12589a) null);
    }

    public Period(long j, long j2, C12589a aVar) {
        super(j, j2, (PeriodType) null, aVar);
    }

    public Period(long j, long j2, PeriodType periodType, C12589a aVar) {
        super(j, j2, periodType, aVar);
    }

    public Period(C12712l lVar, C12712l lVar2) {
        super(lVar, lVar2, (PeriodType) null);
    }

    public Period(C12712l lVar, C12712l lVar2, PeriodType periodType) {
        super(lVar, lVar2, periodType);
    }

    public Period(C12714n nVar, C12714n nVar2) {
        super(nVar, nVar2, (PeriodType) null);
    }

    public Period(C12714n nVar, C12714n nVar2, PeriodType periodType) {
        super(nVar, nVar2, periodType);
    }

    public Period(C12712l lVar, C12711k kVar) {
        super(lVar, kVar, (PeriodType) null);
    }

    public Period(C12712l lVar, C12711k kVar, PeriodType periodType) {
        super(lVar, kVar, periodType);
    }

    public Period(C12711k kVar, C12712l lVar) {
        super(kVar, lVar, (PeriodType) null);
    }

    public Period(C12711k kVar, C12712l lVar, PeriodType periodType) {
        super(kVar, lVar, periodType);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (C12589a) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (C12589a) null);
    }

    public Period(Object obj, C12589a aVar) {
        super(obj, (PeriodType) null, aVar);
    }

    public Period(Object obj, PeriodType periodType, C12589a aVar) {
        super(obj, periodType, aVar);
    }

    public Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }
}
