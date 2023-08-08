package org.joda.time;

import androidx.exifinterface.media.C19135a;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Weeks extends BaseSingleFieldPeriod {

    /* renamed from: b */
    public static final Weeks f30805b = new Weeks(0);

    /* renamed from: c */
    public static final Weeks f30806c = new Weeks(1);

    /* renamed from: d */
    public static final Weeks f30807d = new Weeks(2);

    /* renamed from: e */
    public static final Weeks f30808e = new Weeks(3);

    /* renamed from: f */
    public static final Weeks f30809f = new Weeks(Integer.MAX_VALUE);

    /* renamed from: g */
    public static final Weeks f30810g = new Weeks(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380866L;

    /* renamed from: v */
    public static final C12692p f30811v = C12685j.m54341e().mo29327q(PeriodType.m52158s());

    public Weeks(int i) {
        super(i);
    }

    @FromString
    /* renamed from: A0 */
    public static Weeks m52256A0(String str) {
        if (str == null) {
            return f30805b;
        }
        return m52257M1(f30811v.mo29322l(str).mo28424d0());
    }

    /* renamed from: M1 */
    public static Weeks m52257M1(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30810g;
        }
        if (i == Integer.MAX_VALUE) {
            return f30809f;
        }
        if (i == 0) {
            return f30805b;
        }
        if (i == 1) {
            return f30806c;
        }
        if (i == 2) {
            return f30807d;
        }
        if (i != 3) {
            return new Weeks(i);
        }
        return f30808e;
    }

    /* renamed from: N0 */
    public static Weeks m52258N0(C12715o oVar) {
        return m52257M1(BaseSingleFieldPeriod.m52480M(oVar, 604800000));
    }

    /* renamed from: T1 */
    public static Weeks m52259T1(C12712l lVar, C12712l lVar2) {
        return m52257M1(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51464m()));
    }

    /* renamed from: X1 */
    public static Weeks m52260X1(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalDate) || !(nVar2 instanceof LocalDate)) {
            return m52257M1(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30805b));
        }
        return m52257M1(C12641d.m53370e(nVar.mo27982m()).mo28627M().mo28911q(((LocalDate) nVar2).mo27971f0(), ((LocalDate) nVar).mo27971f0()));
    }

    /* renamed from: Y1 */
    public static Weeks m52261Y1(C12713m mVar) {
        if (mVar == null) {
            return f30805b;
        }
        return m52257M1(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51464m()));
    }

    private Object readResolve() {
        return m52257M1(mo28703y());
    }

    /* renamed from: A1 */
    public Hours mo28523A1() {
        return Hours.m51472X(C12652e.m53798h(mo28703y(), C12590b.f30836K));
    }

    /* renamed from: C0 */
    public Weeks mo28524C0(int i) {
        return i == 0 ? this : m52257M1(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52158s();
    }

    /* renamed from: G1 */
    public Minutes mo28525G1() {
        return Minutes.m51824p0(C12652e.m53798h(mo28703y(), C12590b.f30837L));
    }

    /* renamed from: K0 */
    public Weeks mo28526K0(Weeks weeks) {
        return weeks == null ? this : mo28524C0(weeks.mo28703y());
    }

    /* renamed from: L1 */
    public Seconds mo28527L1() {
        return Seconds.m52179N0(C12652e.m53798h(mo28703y(), C12590b.f30838M));
    }

    /* renamed from: Q */
    public Weeks mo28528Q(int i) {
        return i == 1 ? this : m52257M1(mo28703y() / i);
    }

    /* renamed from: W */
    public int mo28529W() {
        return mo28703y();
    }

    /* renamed from: X */
    public boolean mo28530X(Weeks weeks) {
        if (weeks == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > weeks.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public boolean mo28531e0(Weeks weeks) {
        if (weeks == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < weeks.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public Weeks mo28532f0(int i) {
        return mo28524C0(C12652e.m53802l(i));
    }

    /* renamed from: j1 */
    public Days mo28533j1() {
        return Days.m51406Q(C12652e.m53798h(mo28703y(), 7));
    }

    /* renamed from: k1 */
    public Duration mo28534k1() {
        return new Duration(((long) mo28703y()) * 604800000);
    }

    /* renamed from: n0 */
    public Weeks mo28535n0(Weeks weeks) {
        return weeks == null ? this : mo28532f0(weeks.mo28703y());
    }

    /* renamed from: p0 */
    public Weeks mo28536p0(int i) {
        return m52257M1(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: t0 */
    public Weeks mo28537t0() {
        return m52257M1(C12652e.m53802l(mo28703y()));
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(mo28703y()) + C19135a.f48841T4;
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51464m();
    }
}
