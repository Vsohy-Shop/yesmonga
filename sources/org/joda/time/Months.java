package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Months extends BaseSingleFieldPeriod {

    /* renamed from: E0 */
    public static final Months f30741E0 = new Months(Integer.MIN_VALUE);

    /* renamed from: F0 */
    public static final C12692p f30742F0 = C12685j.m54341e().mo29327q(PeriodType.m52154m());

    /* renamed from: X */
    public static final Months f30743X = new Months(11);

    /* renamed from: Y */
    public static final Months f30744Y = new Months(12);

    /* renamed from: Z */
    public static final Months f30745Z = new Months(Integer.MAX_VALUE);

    /* renamed from: b */
    public static final Months f30746b = new Months(0);

    /* renamed from: c */
    public static final Months f30747c = new Months(1);

    /* renamed from: d */
    public static final Months f30748d = new Months(2);

    /* renamed from: e */
    public static final Months f30749e = new Months(3);

    /* renamed from: f */
    public static final Months f30750f = new Months(4);

    /* renamed from: g */
    public static final Months f30751g = new Months(5);
    private static final long serialVersionUID = 87525275727380867L;

    /* renamed from: v */
    public static final Months f30752v = new Months(6);

    /* renamed from: w */
    public static final Months f30753w = new Months(7);

    /* renamed from: x */
    public static final Months f30754x = new Months(8);

    /* renamed from: y */
    public static final Months f30755y = new Months(9);

    /* renamed from: z */
    public static final Months f30756z = new Months(10);

    public Months(int i) {
        super(i);
    }

    /* renamed from: A0 */
    public static Months m51882A0(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalDate) || !(nVar2 instanceof LocalDate)) {
            return m51885p0(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30746b));
        }
        return m51885p0(C12641d.m53370e(nVar.mo27982m()).mo28620F().mo28911q(((LocalDate) nVar2).mo27971f0(), ((LocalDate) nVar).mo27971f0()));
    }

    /* renamed from: C0 */
    public static Months m51883C0(C12713m mVar) {
        if (mVar == null) {
            return f30746b;
        }
        return m51885p0(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51462k()));
    }

    @FromString
    /* renamed from: j1 */
    public static Months m51884j1(String str) {
        if (str == null) {
            return f30746b;
        }
        return m51885p0(f30742F0.mo29322l(str).mo28421b0());
    }

    /* renamed from: p0 */
    public static Months m51885p0(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30741E0;
        }
        if (i == Integer.MAX_VALUE) {
            return f30745Z;
        }
        switch (i) {
            case 0:
                return f30746b;
            case 1:
                return f30747c;
            case 2:
                return f30748d;
            case 3:
                return f30749e;
            case 4:
                return f30750f;
            case 5:
                return f30751g;
            case 6:
                return f30752v;
            case 7:
                return f30753w;
            case 8:
                return f30754x;
            case 9:
                return f30755y;
            case 10:
                return f30756z;
            case 11:
                return f30743X;
            case 12:
                return f30744Y;
            default:
                return new Months(i);
        }
    }

    private Object readResolve() {
        return m51885p0(mo28703y());
    }

    /* renamed from: t0 */
    public static Months m51886t0(C12712l lVar, C12712l lVar2) {
        return m51885p0(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51462k()));
    }

    /* renamed from: A1 */
    public Months mo28222A1(Months months) {
        return months == null ? this : mo28230k1(months.mo28703y());
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52154m();
    }

    /* renamed from: K0 */
    public Months mo28223K0(int i) {
        return m51885p0(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: N0 */
    public Months mo28224N0() {
        return m51885p0(C12652e.m53802l(mo28703y()));
    }

    /* renamed from: Q */
    public Months mo28225Q(int i) {
        return i == 1 ? this : m51885p0(mo28703y() / i);
    }

    /* renamed from: W */
    public int mo28226W() {
        return mo28703y();
    }

    /* renamed from: X */
    public boolean mo28227X(Months months) {
        if (months == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > months.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public boolean mo28228e0(Months months) {
        if (months == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < months.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public Months mo28229f0(int i) {
        return mo28230k1(C12652e.m53802l(i));
    }

    /* renamed from: k1 */
    public Months mo28230k1(int i) {
        return i == 0 ? this : m51885p0(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: n0 */
    public Months mo28231n0(Months months) {
        return months == null ? this : mo28229f0(months.mo28703y());
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(mo28703y()) + "M";
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51462k();
    }
}
