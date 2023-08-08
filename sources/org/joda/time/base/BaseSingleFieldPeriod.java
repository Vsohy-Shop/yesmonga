package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12646e;
import org.joda.time.C12712l;
import org.joda.time.C12714n;
import org.joda.time.C12715o;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C12652e;

public abstract class BaseSingleFieldPeriod implements C12715o, Comparable<BaseSingleFieldPeriod>, Serializable {

    /* renamed from: a */
    public static final long f30867a = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public BaseSingleFieldPeriod(int i) {
        this.iPeriod = i;
    }

    /* renamed from: M */
    public static int m52480M(C12715o oVar, long j) {
        if (oVar == null) {
            return 0;
        }
        ISOChronology c0 = ISOChronology.m52935c0();
        long j2 = 0;
        for (int i = 0; i < oVar.size(); i++) {
            int value = oVar.getValue(i);
            if (value != 0) {
                C12646e d = oVar.mo28702t(i).mo27877d(c0);
                if (d.mo28950n0()) {
                    j2 = C12652e.m53795e(j2, C12652e.m53799i(d.mo28947X(), value));
                } else {
                    throw new IllegalArgumentException("Cannot convert period to duration as " + d.mo29033Q() + " is not precise in the period " + oVar);
                }
            }
        }
        return C12652e.m53804n(j2 / j);
    }

    /* renamed from: g */
    public static int m52481g(C12712l lVar, C12712l lVar2, DurationFieldType durationFieldType) {
        if (lVar != null && lVar2 != null) {
            return durationFieldType.mo27877d(C12641d.m53374i(lVar)).mo28911q(lVar2.mo27912k(), lVar.mo27912k());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }

    /* renamed from: q */
    public static int m52482q(C12714n nVar, C12714n nVar2, C12715o oVar) {
        if (nVar == null || nVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
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
                C12589a Q = C12641d.m53370e(nVar.mo27982m()).mo27834Q();
                return Q.mo28649o(oVar, Q.mo28624J(nVar, f30867a), Q.mo28624J(nVar2, f30867a))[0];
            }
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    /* renamed from: B1 */
    public int mo28694B1(DurationFieldType durationFieldType) {
        if (durationFieldType == mo27855w()) {
            return mo28703y();
        }
        return 0;
    }

    /* renamed from: F1 */
    public abstract PeriodType mo27841F1();

    /* renamed from: H0 */
    public boolean mo28695H0(DurationFieldType durationFieldType) {
        return durationFieldType == mo27855w();
    }

    /* renamed from: O0 */
    public MutablePeriod mo28696O0() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.mo28328F(this);
        return mutablePeriod;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12715o)) {
            return false;
        }
        C12715o oVar = (C12715o) obj;
        if (oVar.mo27841F1() == mo27841F1() && oVar.getValue(0) == mo28703y()) {
            return true;
        }
        return false;
    }

    public int getValue(int i) {
        if (i == 0) {
            return mo28703y();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public int hashCode() {
        return ((459 + mo28703y()) * 27) + mo27855w().hashCode();
    }

    /* renamed from: l */
    public Period mo28431l() {
        return Period.f30764b.mo28439t1(this);
    }

    /* renamed from: r */
    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int y = baseSingleFieldPeriod.mo28703y();
            int y2 = mo28703y();
            if (y2 > y) {
                return 1;
            }
            if (y2 < y) {
                return -1;
            }
            return 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod.getClass());
    }

    public int size() {
        return 1;
    }

    /* renamed from: t */
    public DurationFieldType mo28702t(int i) {
        if (i == 0) {
            return mo27855w();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    /* renamed from: w */
    public abstract DurationFieldType mo27855w();

    /* renamed from: y */
    public int mo28703y() {
        return this.iPeriod;
    }

    /* renamed from: z */
    public void mo28704z(int i) {
        this.iPeriod = i;
    }
}
