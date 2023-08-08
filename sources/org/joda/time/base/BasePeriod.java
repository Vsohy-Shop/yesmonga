package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12709i;
import org.joda.time.C12711k;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.C12715o;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12634m;
import org.joda.time.field.C12652e;

public abstract class BasePeriod extends C12597f implements C12715o, Serializable {

    /* renamed from: a */
    public static final C12715o f30866a = new C12591a();
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    /* renamed from: org.joda.time.base.BasePeriod$a */
    public static class C12591a extends C12597f {
        /* renamed from: F1 */
        public PeriodType mo27841F1() {
            return PeriodType.m52157r();
        }

        public int getValue(int i) {
            return 0;
        }
    }

    public BasePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        this.iType = mo28693s(periodType);
        this.iValues = mo28683G(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: A */
    public int[] mo28679A(int[] iArr, C12715o oVar) {
        int size = oVar.size();
        for (int i = 0; i < size; i++) {
            mo28692o(oVar.mo28702t(i), iArr, oVar.getValue(i));
        }
        return iArr;
    }

    /* renamed from: B */
    public void mo28680B(DurationFieldType durationFieldType, int i) {
        mo28681D(this.iValues, durationFieldType, i);
    }

    /* renamed from: D */
    public void mo28681D(int[] iArr, DurationFieldType durationFieldType, int i) {
        int h = mo28796h(durationFieldType);
        if (h != -1) {
            iArr[h] = i;
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* renamed from: E */
    public final void mo28682E(C12715o oVar) {
        int[] iArr = new int[size()];
        int size = oVar.size();
        for (int i = 0; i < size; i++) {
            mo28692o(oVar.mo28702t(i), iArr, oVar.getValue(i));
        }
        mo28684H(iArr);
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return this.iType;
    }

    /* renamed from: G */
    public final int[] mo28683G(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        mo28692o(DurationFieldType.m51466o(), iArr, i);
        mo28692o(DurationFieldType.m51462k(), iArr, i2);
        mo28692o(DurationFieldType.m51464m(), iArr, i3);
        mo28692o(DurationFieldType.m51456b(), iArr, i4);
        mo28692o(DurationFieldType.m51459g(), iArr, i5);
        mo28692o(DurationFieldType.m51461j(), iArr, i6);
        mo28692o(DurationFieldType.m51463l(), iArr, i7);
        mo28692o(DurationFieldType.m51460i(), iArr, i8);
        return iArr;
    }

    /* renamed from: H */
    public void mo28684H(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    /* renamed from: I */
    public Duration mo28685I(C12712l lVar) {
        long j = C12641d.m53375j(lVar);
        return new Duration(j, C12641d.m53374i(lVar).mo28636b(this, j, 1));
    }

    /* renamed from: K */
    public Duration mo28686K(C12712l lVar) {
        long j = C12641d.m53375j(lVar);
        return new Duration(C12641d.m53374i(lVar).mo28636b(this, j, -1), j);
    }

    /* renamed from: Z */
    public void mo28345Z(C12715o oVar) {
        if (oVar == null) {
            mo28684H(new int[size()]);
        } else {
            mo28682E(oVar);
        }
    }

    /* renamed from: b */
    public void mo28347b(int i, int i2) {
        this.iValues[i] = i2;
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    /* renamed from: j */
    public void mo28688j(DurationFieldType durationFieldType, int i) {
        mo28689k(this.iValues, durationFieldType, i);
    }

    /* renamed from: k */
    public void mo28689k(int[] iArr, DurationFieldType durationFieldType, int i) {
        int h = mo28796h(durationFieldType);
        if (h != -1) {
            iArr[h] = C12652e.m53794d(iArr[h], i);
        } else if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    /* renamed from: m */
    public void mo28690m(C12715o oVar) {
        if (oVar != null) {
            mo28684H(mo28691n(mo28795f(), oVar));
        }
    }

    /* renamed from: n */
    public int[] mo28691n(int[] iArr, C12715o oVar) {
        int size = oVar.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType t = oVar.mo28702t(i);
            int value = oVar.getValue(i);
            if (value != 0) {
                int h = mo28796h(t);
                if (h != -1) {
                    iArr[h] = C12652e.m53794d(getValue(h), value);
                } else {
                    throw new IllegalArgumentException("Period does not support field '" + t.mo27878e() + "'");
                }
            }
        }
        return iArr;
    }

    /* renamed from: n1 */
    public void mo28358n1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo28684H(mo28683G(i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: o */
    public final void mo28692o(DurationFieldType durationFieldType, int[] iArr, int i) {
        int h = mo28796h(durationFieldType);
        if (h != -1) {
            iArr[h] = i;
        } else if (i != 0) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.mo27878e() + "'");
        }
    }

    /* renamed from: s */
    public PeriodType mo28693s(PeriodType periodType) {
        return C12641d.m53378m(periodType);
    }

    /* renamed from: x */
    public void mo28369x(C12715o oVar) {
        if (oVar != null) {
            mo28684H(mo28679A(mo28795f(), oVar));
        }
    }

    public BasePeriod(long j, long j2, PeriodType periodType, C12589a aVar) {
        PeriodType s = mo28693s(periodType);
        C12589a e = C12641d.m53370e(aVar);
        this.iType = s;
        this.iValues = e.mo28649o(this, j, j2);
    }

    public BasePeriod(C12712l lVar, C12712l lVar2, PeriodType periodType) {
        PeriodType s = mo28693s(periodType);
        if (lVar == null && lVar2 == null) {
            this.iType = s;
            this.iValues = new int[size()];
            return;
        }
        long j = C12641d.m53375j(lVar);
        long j2 = C12641d.m53375j(lVar2);
        C12589a k = C12641d.m53376k(lVar, lVar2);
        this.iType = s;
        this.iValues = k.mo28649o(this, j, j2);
    }

    public BasePeriod(C12714n nVar, C12714n nVar2, PeriodType periodType) {
        if (nVar == null || nVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if ((nVar instanceof C12598g) && (nVar2 instanceof C12598g) && nVar.getClass() == nVar2.getClass()) {
            PeriodType s = mo28693s(periodType);
            long f0 = ((C12598g) nVar).mo27971f0();
            long f02 = ((C12598g) nVar2).mo27971f0();
            C12589a e = C12641d.m53370e(nVar.mo27982m());
            this.iType = s;
            this.iValues = e.mo28649o(this, f0, f02);
        } else if (nVar.size() == nVar2.size()) {
            int size = nVar.size();
            int i = 0;
            while (i < size) {
                if (nVar.mo28207t(i) == nVar2.mo28207t(i)) {
                    i++;
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            if (C12641d.m53381p(nVar)) {
                this.iType = mo28693s(periodType);
                C12589a Q = C12641d.m53370e(nVar.mo27982m()).mo27834Q();
                this.iValues = Q.mo28649o(this, Q.mo28624J(nVar, 0), Q.mo28624J(nVar2, 0));
                return;
            }
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    public BasePeriod(C12712l lVar, C12711k kVar, PeriodType periodType) {
        PeriodType s = mo28693s(periodType);
        long j = C12641d.m53375j(lVar);
        long e = C12652e.m53795e(j, C12641d.m53373h(kVar));
        C12589a i = C12641d.m53374i(lVar);
        this.iType = s;
        this.iValues = i.mo28649o(this, j, e);
    }

    public BasePeriod(C12711k kVar, C12712l lVar, PeriodType periodType) {
        PeriodType s = mo28693s(periodType);
        long h = C12641d.m53373h(kVar);
        long j = C12641d.m53375j(lVar);
        long m = C12652e.m53803m(j, h);
        C12589a i = C12641d.m53374i(lVar);
        this.iType = s;
        this.iValues = i.mo28649o(this, m, j);
    }

    public BasePeriod(long j) {
        this.iType = PeriodType.m52156q();
        int[] n = ISOChronology.m52935c0().mo28648n(f30866a, j);
        int[] iArr = new int[8];
        this.iValues = iArr;
        System.arraycopy(n, 0, iArr, 4, 4);
    }

    public BasePeriod(long j, PeriodType periodType, C12589a aVar) {
        PeriodType s = mo28693s(periodType);
        C12589a e = C12641d.m53370e(aVar);
        this.iType = s;
        this.iValues = e.mo28648n(this, j);
    }

    public BasePeriod(Object obj, PeriodType periodType, C12589a aVar) {
        C12634m t = C12624d.m53287m().mo29011t(obj);
        PeriodType s = mo28693s(periodType == null ? t.mo29031d(obj) : periodType);
        this.iType = s;
        if (this instanceof C12709i) {
            this.iValues = new int[size()];
            t.mo29028i((C12709i) this, obj, C12641d.m53370e(aVar));
            return;
        }
        this.iValues = new MutablePeriod(obj, s, aVar).mo28795f();
    }

    public BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }
}
