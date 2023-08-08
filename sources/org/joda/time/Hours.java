package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Hours extends BaseSingleFieldPeriod {

    /* renamed from: X */
    public static final C12692p f30696X = C12685j.m54341e().mo29327q(PeriodType.m52151h());

    /* renamed from: b */
    public static final Hours f30697b = new Hours(0);

    /* renamed from: c */
    public static final Hours f30698c = new Hours(1);

    /* renamed from: d */
    public static final Hours f30699d = new Hours(2);

    /* renamed from: e */
    public static final Hours f30700e = new Hours(3);

    /* renamed from: f */
    public static final Hours f30701f = new Hours(4);

    /* renamed from: g */
    public static final Hours f30702g = new Hours(5);
    private static final long serialVersionUID = 87525275727380864L;

    /* renamed from: v */
    public static final Hours f30703v = new Hours(6);

    /* renamed from: w */
    public static final Hours f30704w = new Hours(7);

    /* renamed from: x */
    public static final Hours f30705x = new Hours(8);

    /* renamed from: y */
    public static final Hours f30706y = new Hours(Integer.MAX_VALUE);

    /* renamed from: z */
    public static final Hours f30707z = new Hours(Integer.MIN_VALUE);

    public Hours(int i) {
        super(i);
    }

    /* renamed from: G1 */
    public static Hours m51471G1(C12715o oVar) {
        return m51472X(BaseSingleFieldPeriod.m52480M(oVar, 3600000));
    }

    /* renamed from: X */
    public static Hours m51472X(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30707z;
        }
        if (i == Integer.MAX_VALUE) {
            return f30706y;
        }
        switch (i) {
            case 0:
                return f30697b;
            case 1:
                return f30698c;
            case 2:
                return f30699d;
            case 3:
                return f30700e;
            case 4:
                return f30701f;
            case 5:
                return f30702g;
            case 6:
                return f30703v;
            case 7:
                return f30704w;
            case 8:
                return f30705x;
            default:
                return new Hours(i);
        }
    }

    /* renamed from: e0 */
    public static Hours m51473e0(C12712l lVar, C12712l lVar2) {
        return m51472X(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51459g()));
    }

    /* renamed from: f0 */
    public static Hours m51474f0(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalTime) || !(nVar2 instanceof LocalTime)) {
            return m51472X(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30697b));
        }
        return m51472X(C12641d.m53370e(nVar.mo27982m()).mo28657x().mo28911q(((LocalTime) nVar2).mo27971f0(), ((LocalTime) nVar).mo27971f0()));
    }

    @FromString
    /* renamed from: j1 */
    public static Hours m51475j1(String str) {
        if (str == null) {
            return f30697b;
        }
        return m51472X(f30696X.mo29322l(str).mo28412V());
    }

    /* renamed from: n0 */
    public static Hours m51476n0(C12713m mVar) {
        if (mVar == null) {
            return f30697b;
        }
        return m51472X(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51459g()));
    }

    private Object readResolve() {
        return m51472X(mo28703y());
    }

    /* renamed from: A0 */
    public Hours mo27883A0(int i) {
        return mo27895k1(C12652e.m53802l(i));
    }

    /* renamed from: A1 */
    public Hours mo27884A1(Hours hours) {
        return hours == null ? this : mo27895k1(hours.mo28703y());
    }

    /* renamed from: C0 */
    public Hours mo27885C0(Hours hours) {
        return hours == null ? this : mo27883A0(hours.mo28703y());
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52151h();
    }

    /* renamed from: K0 */
    public Hours mo27886K0(int i) {
        return m51472X(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: L1 */
    public Days mo27887L1() {
        return Days.m51406Q(mo28703y() / 24);
    }

    /* renamed from: M1 */
    public Duration mo27888M1() {
        return new Duration(((long) mo28703y()) * 3600000);
    }

    /* renamed from: N0 */
    public Hours mo27889N0() {
        return m51472X(C12652e.m53802l(mo28703y()));
    }

    /* renamed from: Q */
    public Hours mo27890Q(int i) {
        return i == 1 ? this : m51472X(mo28703y() / i);
    }

    /* renamed from: T1 */
    public Minutes mo27891T1() {
        return Minutes.m51824p0(C12652e.m53798h(mo28703y(), 60));
    }

    /* renamed from: W */
    public int mo27892W() {
        return mo28703y();
    }

    /* renamed from: X1 */
    public Seconds mo27893X1() {
        return Seconds.m52179N0(C12652e.m53798h(mo28703y(), 3600));
    }

    /* renamed from: Y1 */
    public Weeks mo27894Y1() {
        return Weeks.m52257M1(mo28703y() / C12590b.f30836K);
    }

    /* renamed from: k1 */
    public Hours mo27895k1(int i) {
        return i == 0 ? this : m51472X(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: p0 */
    public boolean mo27896p0(Hours hours) {
        if (hours == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > hours.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t0 */
    public boolean mo27897t0(Hours hours) {
        if (hours == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < hours.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(mo28703y()) + "H";
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51459g();
    }
}
