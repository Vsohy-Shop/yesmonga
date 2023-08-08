package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public class MutablePeriod extends BasePeriod implements C12709i, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0, (PeriodType) null, (C12589a) null);
    }

    @FromString
    /* renamed from: l0 */
    public static MutablePeriod m52001l0(String str) {
        return m52002q0(str, C12685j.m54341e());
    }

    /* renamed from: q0 */
    public static MutablePeriod m52002q0(String str, C12692p pVar) {
        return pVar.mo29322l(str).mo28696O0();
    }

    /* renamed from: C */
    public void mo28327C(int i) {
        super.mo28688j(DurationFieldType.m51461j(), i);
    }

    /* renamed from: F */
    public void mo28328F(C12715o oVar) {
        super.mo28690m(oVar);
    }

    /* renamed from: F0 */
    public void mo28329F0(C12713m mVar) {
        if (mVar != null) {
            mo28328F(mVar.mo28778k(mo27841F1()));
        }
    }

    /* renamed from: H1 */
    public void mo28330H1(int i) {
        super.mo28680B(DurationFieldType.m51462k(), i);
    }

    /* renamed from: J */
    public void mo28331J(int i) {
        super.mo28688j(DurationFieldType.m51464m(), i);
    }

    /* renamed from: L */
    public void mo28332L(int i) {
        super.mo28688j(DurationFieldType.m51466o(), i);
    }

    /* renamed from: L0 */
    public void mo28333L0(int i) {
        super.mo28680B(DurationFieldType.m51460i(), i);
    }

    /* renamed from: N */
    public void mo28334N(long j) {
        mo28328F(new Period(j, mo27841F1()));
    }

    /* renamed from: O */
    public void mo28335O(int i) {
        super.mo28688j(DurationFieldType.m51463l(), i);
    }

    /* renamed from: P */
    public void mo28336P(int i) {
        super.mo28688j(DurationFieldType.m51456b(), i);
    }

    /* renamed from: R */
    public void mo28337R(long j, C12589a aVar) {
        mo28328F(new Period(j, mo27841F1(), aVar));
    }

    /* renamed from: R0 */
    public void mo28338R0(C12713m mVar) {
        if (mVar == null) {
            mo28361r0(0);
            return;
        }
        mo28366v0(mVar.mo28676v(), mVar.mo28673K(), C12641d.m53370e(mVar.mo28675m()));
    }

    /* renamed from: S */
    public void mo28339S(C12711k kVar) {
        if (kVar != null) {
            mo28328F(new Period(kVar.mo28667k(), mo27841F1()));
        }
    }

    /* renamed from: T */
    public MutablePeriod mo28340T() {
        return (MutablePeriod) clone();
    }

    /* renamed from: U */
    public void mo28341U(int i) {
        super.mo28688j(DurationFieldType.m51460i(), i);
    }

    /* renamed from: U0 */
    public void mo28342U0(int i) {
        super.mo28680B(DurationFieldType.m51461j(), i);
    }

    /* renamed from: V */
    public int mo28343V() {
        return mo27841F1().mo28454f(this, PeriodType.f30783e);
    }

    /* renamed from: Y */
    public int mo28344Y() {
        return mo27841F1().mo28454f(this, PeriodType.f30784f);
    }

    /* renamed from: Z */
    public void mo28345Z(C12715o oVar) {
        super.mo28345Z(oVar);
    }

    /* renamed from: a0 */
    public int mo28346a0() {
        return mo27841F1().mo28454f(this, PeriodType.f30787w);
    }

    /* renamed from: b */
    public void mo28347b(int i, int i2) {
        super.mo28347b(i, i2);
    }

    /* renamed from: b0 */
    public int mo28348b0() {
        return mo27841F1().mo28454f(this, PeriodType.f30785g);
    }

    /* renamed from: c */
    public void mo28349c(DurationFieldType durationFieldType, int i) {
        super.mo28688j(durationFieldType, i);
    }

    /* renamed from: c0 */
    public int mo28350c0() {
        return mo27841F1().mo28454f(this, PeriodType.f30781c);
    }

    /* renamed from: c1 */
    public void mo28351c1(int i) {
        super.mo28680B(DurationFieldType.m51464m(), i);
    }

    public void clear() {
        super.mo28684H(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    /* renamed from: d0 */
    public int mo28354d0() {
        return mo27841F1().mo28454f(this, PeriodType.f30786v);
    }

    /* renamed from: g0 */
    public int mo28355g0() {
        return mo27841F1().mo28454f(this, PeriodType.f30782d);
    }

    /* renamed from: k0 */
    public int mo28356k0() {
        return mo27841F1().mo28454f(this, PeriodType.f30780b);
    }

    /* renamed from: m0 */
    public void mo28357m0(int i) {
        super.mo28680B(DurationFieldType.m51466o(), i);
    }

    /* renamed from: n1 */
    public void mo28358n1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.mo28358n1(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: o0 */
    public void mo28359o0(int i) {
        super.mo28680B(DurationFieldType.m51459g(), i);
    }

    /* renamed from: q1 */
    public void mo28360q1(DurationFieldType durationFieldType, int i) {
        super.mo28680B(durationFieldType, i);
    }

    /* renamed from: r0 */
    public void mo28361r0(long j) {
        mo28367w0(j, (C12589a) null);
    }

    /* renamed from: s0 */
    public void mo28362s0(long j, long j2) {
        mo28366v0(j, j2, (C12589a) null);
    }

    /* renamed from: u */
    public void mo28363u(int i) {
        super.mo28688j(DurationFieldType.m51459g(), i);
    }

    /* renamed from: u0 */
    public void mo28364u0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        mo28358n1(C12652e.m53794d(mo28356k0(), i), C12652e.m53794d(mo28350c0(), i2), C12652e.m53794d(mo28355g0(), i3), C12652e.m53794d(mo28343V(), i4), C12652e.m53794d(mo28344Y(), i5), C12652e.m53794d(mo28348b0(), i6), C12652e.m53794d(mo28354d0(), i7), C12652e.m53794d(mo28346a0(), i8));
    }

    /* renamed from: v */
    public void mo28365v(int i) {
        super.mo28688j(DurationFieldType.m51462k(), i);
    }

    /* renamed from: v0 */
    public void mo28366v0(long j, long j2, C12589a aVar) {
        mo28684H(C12641d.m53370e(aVar).mo28649o(this, j, j2));
    }

    /* renamed from: w0 */
    public void mo28367w0(long j, C12589a aVar) {
        mo28684H(C12641d.m53370e(aVar).mo28648n(this, j));
    }

    /* renamed from: w1 */
    public void mo28368w1(int i) {
        super.mo28680B(DurationFieldType.m51456b(), i);
    }

    /* renamed from: x */
    public void mo28369x(C12715o oVar) {
        super.mo28369x(oVar);
    }

    /* renamed from: x0 */
    public void mo28370x0(C12711k kVar) {
        mo28371y0(kVar, (C12589a) null);
    }

    /* renamed from: y0 */
    public void mo28371y0(C12711k kVar, C12589a aVar) {
        mo28367w0(C12641d.m53373h(kVar), aVar);
    }

    /* renamed from: z0 */
    public void mo28372z0(C12712l lVar, C12712l lVar2) {
        if (lVar == lVar2) {
            mo28361r0(0);
            return;
        }
        mo28366v0(C12641d.m53375j(lVar), C12641d.m53375j(lVar2), C12641d.m53376k(lVar, lVar2));
    }

    /* renamed from: z1 */
    public void mo28373z1(int i) {
        super.mo28680B(DurationFieldType.m51463l(), i);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0, periodType, (C12589a) null);
    }

    public MutablePeriod(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.m52156q());
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.m52156q());
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public MutablePeriod(long j) {
        super(j);
    }

    public MutablePeriod(long j, PeriodType periodType) {
        super(j, periodType, (C12589a) null);
    }

    public MutablePeriod(long j, C12589a aVar) {
        super(j, (PeriodType) null, aVar);
    }

    public MutablePeriod(long j, PeriodType periodType, C12589a aVar) {
        super(j, periodType, aVar);
    }

    public MutablePeriod(long j, long j2) {
        super(j, j2, (PeriodType) null, (C12589a) null);
    }

    public MutablePeriod(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, (C12589a) null);
    }

    public MutablePeriod(long j, long j2, C12589a aVar) {
        super(j, j2, (PeriodType) null, aVar);
    }

    public MutablePeriod(long j, long j2, PeriodType periodType, C12589a aVar) {
        super(j, j2, periodType, aVar);
    }

    public MutablePeriod(C12712l lVar, C12712l lVar2) {
        super(lVar, lVar2, (PeriodType) null);
    }

    public MutablePeriod(C12712l lVar, C12712l lVar2, PeriodType periodType) {
        super(lVar, lVar2, periodType);
    }

    public MutablePeriod(C12712l lVar, C12711k kVar) {
        super(lVar, kVar, (PeriodType) null);
    }

    public MutablePeriod(C12712l lVar, C12711k kVar, PeriodType periodType) {
        super(lVar, kVar, periodType);
    }

    public MutablePeriod(C12711k kVar, C12712l lVar) {
        super(kVar, lVar, (PeriodType) null);
    }

    public MutablePeriod(C12711k kVar, C12712l lVar, PeriodType periodType) {
        super(kVar, lVar, periodType);
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (C12589a) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (C12589a) null);
    }

    public MutablePeriod(Object obj, C12589a aVar) {
        super(obj, (PeriodType) null, aVar);
    }

    public MutablePeriod(Object obj, PeriodType periodType, C12589a aVar) {
        super(obj, periodType, aVar);
    }
}
