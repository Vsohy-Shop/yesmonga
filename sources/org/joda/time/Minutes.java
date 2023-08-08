package org.joda.time;

import com.urbanairship.AirshipConfigOptions;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Minutes extends BaseSingleFieldPeriod {

    /* renamed from: b */
    public static final Minutes f30730b = new Minutes(0);

    /* renamed from: c */
    public static final Minutes f30731c = new Minutes(1);

    /* renamed from: d */
    public static final Minutes f30732d = new Minutes(2);

    /* renamed from: e */
    public static final Minutes f30733e = new Minutes(3);

    /* renamed from: f */
    public static final Minutes f30734f = new Minutes(Integer.MAX_VALUE);

    /* renamed from: g */
    public static final Minutes f30735g = new Minutes(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380863L;

    /* renamed from: v */
    public static final C12692p f30736v = C12685j.m54341e().mo29327q(PeriodType.m52153l());

    public Minutes(int i) {
        super(i);
    }

    /* renamed from: A0 */
    public static Minutes m51820A0(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalTime) || !(nVar2 instanceof LocalTime)) {
            return m51824p0(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30730b));
        }
        return m51824p0(C12641d.m53370e(nVar.mo27982m()).mo28618D().mo28911q(((LocalTime) nVar2).mo27971f0(), ((LocalTime) nVar).mo27971f0()));
    }

    /* renamed from: C0 */
    public static Minutes m51821C0(C12713m mVar) {
        if (mVar == null) {
            return f30730b;
        }
        return m51824p0(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51461j()));
    }

    /* renamed from: G1 */
    public static Minutes m51822G1(C12715o oVar) {
        return m51824p0(BaseSingleFieldPeriod.m52480M(oVar, AirshipConfigOptions.f87111Y));
    }

    @FromString
    /* renamed from: j1 */
    public static Minutes m51823j1(String str) {
        if (str == null) {
            return f30730b;
        }
        return m51824p0(f30736v.mo29322l(str).mo28419a0());
    }

    /* renamed from: p0 */
    public static Minutes m51824p0(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30735g;
        }
        if (i == Integer.MAX_VALUE) {
            return f30734f;
        }
        if (i == 0) {
            return f30730b;
        }
        if (i == 1) {
            return f30731c;
        }
        if (i == 2) {
            return f30732d;
        }
        if (i != 3) {
            return new Minutes(i);
        }
        return f30733e;
    }

    private Object readResolve() {
        return m51824p0(mo28703y());
    }

    /* renamed from: t0 */
    public static Minutes m51825t0(C12712l lVar, C12712l lVar2) {
        return m51824p0(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51461j()));
    }

    /* renamed from: A1 */
    public Minutes mo28176A1(Minutes minutes) {
        return minutes == null ? this : mo28189k1(minutes.mo28703y());
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52153l();
    }

    /* renamed from: K0 */
    public Minutes mo28177K0(int i) {
        return m51824p0(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: L1 */
    public Days mo28178L1() {
        return Days.m51406Q(mo28703y() / C12590b.f30832G);
    }

    /* renamed from: M1 */
    public Duration mo28179M1() {
        return new Duration(((long) mo28703y()) * AirshipConfigOptions.f87111Y);
    }

    /* renamed from: N0 */
    public Minutes mo28180N0() {
        return m51824p0(C12652e.m53802l(mo28703y()));
    }

    /* renamed from: Q */
    public Minutes mo28181Q(int i) {
        return i == 1 ? this : m51824p0(mo28703y() / i);
    }

    /* renamed from: T1 */
    public Hours mo28182T1() {
        return Hours.m51472X(mo28703y() / 60);
    }

    /* renamed from: W */
    public int mo28183W() {
        return mo28703y();
    }

    /* renamed from: X */
    public boolean mo28184X(Minutes minutes) {
        if (minutes == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > minutes.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: X1 */
    public Seconds mo28185X1() {
        return Seconds.m52179N0(C12652e.m53798h(mo28703y(), 60));
    }

    /* renamed from: Y1 */
    public Weeks mo28186Y1() {
        return Weeks.m52257M1(mo28703y() / C12590b.f30837L);
    }

    /* renamed from: e0 */
    public boolean mo28187e0(Minutes minutes) {
        if (minutes == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < minutes.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public Minutes mo28188f0(int i) {
        return mo28189k1(C12652e.m53802l(i));
    }

    /* renamed from: k1 */
    public Minutes mo28189k1(int i) {
        return i == 0 ? this : m51824p0(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: n0 */
    public Minutes mo28190n0(Minutes minutes) {
        return minutes == null ? this : mo28188f0(minutes.mo28703y());
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(mo28703y()) + "M";
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51461j();
    }
}
