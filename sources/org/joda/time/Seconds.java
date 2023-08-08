package org.joda.time;

import androidx.exifinterface.media.C19135a;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Seconds extends BaseSingleFieldPeriod {

    /* renamed from: b */
    public static final Seconds f30791b = new Seconds(0);

    /* renamed from: c */
    public static final Seconds f30792c = new Seconds(1);

    /* renamed from: d */
    public static final Seconds f30793d = new Seconds(2);

    /* renamed from: e */
    public static final Seconds f30794e = new Seconds(3);

    /* renamed from: f */
    public static final Seconds f30795f = new Seconds(Integer.MAX_VALUE);

    /* renamed from: g */
    public static final Seconds f30796g = new Seconds(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380862L;

    /* renamed from: v */
    public static final C12692p f30797v = C12685j.m54341e().mo29327q(PeriodType.m52155n());

    public Seconds(int i) {
        super(i);
    }

    @FromString
    /* renamed from: A0 */
    public static Seconds m52176A0(String str) {
        if (str == null) {
            return f30791b;
        }
        return m52179N0(f30797v.mo29322l(str).mo28423c0());
    }

    /* renamed from: A1 */
    public static Seconds m52177A1(C12713m mVar) {
        if (mVar == null) {
            return f30791b;
        }
        return m52179N0(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51463l()));
    }

    /* renamed from: G1 */
    public static Seconds m52178G1(C12715o oVar) {
        return m52179N0(BaseSingleFieldPeriod.m52480M(oVar, 1000));
    }

    /* renamed from: N0 */
    public static Seconds m52179N0(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30796g;
        }
        if (i == Integer.MAX_VALUE) {
            return f30795f;
        }
        if (i == 0) {
            return f30791b;
        }
        if (i == 1) {
            return f30792c;
        }
        if (i == 2) {
            return f30793d;
        }
        if (i != 3) {
            return new Seconds(i);
        }
        return f30794e;
    }

    /* renamed from: j1 */
    public static Seconds m52180j1(C12712l lVar, C12712l lVar2) {
        return m52179N0(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51463l()));
    }

    /* renamed from: k1 */
    public static Seconds m52181k1(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalTime) || !(nVar2 instanceof LocalTime)) {
            return m52179N0(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30791b));
        }
        return m52179N0(C12641d.m53370e(nVar.mo27982m()).mo28623I().mo28911q(((LocalTime) nVar2).mo27971f0(), ((LocalTime) nVar).mo27971f0()));
    }

    private Object readResolve() {
        return m52179N0(mo28703y());
    }

    /* renamed from: C0 */
    public Seconds mo28469C0(int i) {
        return i == 0 ? this : m52179N0(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52155n();
    }

    /* renamed from: K0 */
    public Seconds mo28470K0(Seconds seconds) {
        return seconds == null ? this : mo28469C0(seconds.mo28703y());
    }

    /* renamed from: L1 */
    public Days mo28471L1() {
        return Days.m51406Q(mo28703y() / 86400);
    }

    /* renamed from: M1 */
    public Duration mo28472M1() {
        return new Duration(((long) mo28703y()) * 1000);
    }

    /* renamed from: Q */
    public Seconds mo28473Q(int i) {
        return i == 1 ? this : m52179N0(mo28703y() / i);
    }

    /* renamed from: T1 */
    public Hours mo28474T1() {
        return Hours.m51472X(mo28703y() / 3600);
    }

    /* renamed from: W */
    public int mo28475W() {
        return mo28703y();
    }

    /* renamed from: X */
    public boolean mo28476X(Seconds seconds) {
        if (seconds == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > seconds.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: X1 */
    public Minutes mo28477X1() {
        return Minutes.m51824p0(mo28703y() / 60);
    }

    /* renamed from: Y1 */
    public Weeks mo28478Y1() {
        return Weeks.m52257M1(mo28703y() / C12590b.f30838M);
    }

    /* renamed from: e0 */
    public boolean mo28479e0(Seconds seconds) {
        if (seconds == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < seconds.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public Seconds mo28480f0(int i) {
        return mo28469C0(C12652e.m53802l(i));
    }

    /* renamed from: n0 */
    public Seconds mo28481n0(Seconds seconds) {
        return seconds == null ? this : mo28480f0(seconds.mo28703y());
    }

    /* renamed from: p0 */
    public Seconds mo28482p0(int i) {
        return m52179N0(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: t0 */
    public Seconds mo28483t0() {
        return m52179N0(C12652e.m53802l(mo28703y()));
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(mo28703y()) + C19135a.f48823R4;
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51463l();
    }
}
