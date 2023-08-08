package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Years extends BaseSingleFieldPeriod {

    /* renamed from: b */
    public static final Years f30819b = new Years(0);

    /* renamed from: c */
    public static final Years f30820c = new Years(1);

    /* renamed from: d */
    public static final Years f30821d = new Years(2);

    /* renamed from: e */
    public static final Years f30822e = new Years(3);

    /* renamed from: f */
    public static final Years f30823f = new Years(Integer.MAX_VALUE);

    /* renamed from: g */
    public static final Years f30824g = new Years(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380868L;

    /* renamed from: v */
    public static final C12692p f30825v = C12685j.m54341e().mo29327q(PeriodType.m52147I());

    public Years(int i) {
        super(i);
    }

    @FromString
    /* renamed from: A0 */
    public static Years m52367A0(String str) {
        if (str == null) {
            return f30819b;
        }
        return m52369N0(f30825v.mo29322l(str).mo28427g0());
    }

    /* renamed from: A1 */
    public static Years m52368A1(C12713m mVar) {
        if (mVar == null) {
            return f30819b;
        }
        return m52369N0(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51466o()));
    }

    /* renamed from: N0 */
    public static Years m52369N0(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30824g;
        }
        if (i == Integer.MAX_VALUE) {
            return f30823f;
        }
        if (i == 0) {
            return f30819b;
        }
        if (i == 1) {
            return f30820c;
        }
        if (i == 2) {
            return f30821d;
        }
        if (i != 3) {
            return new Years(i);
        }
        return f30822e;
    }

    /* renamed from: j1 */
    public static Years m52370j1(C12712l lVar, C12712l lVar2) {
        return m52369N0(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51466o()));
    }

    /* renamed from: k1 */
    public static Years m52371k1(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalDate) || !(nVar2 instanceof LocalDate)) {
            return m52369N0(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30819b));
        }
        return m52369N0(C12641d.m53370e(nVar.mo27982m()).mo28634V().mo28911q(((LocalDate) nVar2).mo27971f0(), ((LocalDate) nVar).mo27971f0()));
    }

    private Object readResolve() {
        return m52369N0(mo28703y());
    }

    /* renamed from: C0 */
    public Years mo28605C0(int i) {
        return i == 0 ? this : m52369N0(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52147I();
    }

    /* renamed from: K0 */
    public Years mo28606K0(Years years) {
        return years == null ? this : mo28605C0(years.mo28703y());
    }

    /* renamed from: Q */
    public Years mo28607Q(int i) {
        return i == 1 ? this : m52369N0(mo28703y() / i);
    }

    /* renamed from: W */
    public int mo28608W() {
        return mo28703y();
    }

    /* renamed from: X */
    public boolean mo28609X(Years years) {
        if (years == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > years.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public boolean mo28610e0(Years years) {
        if (years == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < years.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public Years mo28611f0(int i) {
        return mo28605C0(C12652e.m53802l(i));
    }

    /* renamed from: n0 */
    public Years mo28612n0(Years years) {
        return years == null ? this : mo28611f0(years.mo28703y());
    }

    /* renamed from: p0 */
    public Years mo28613p0(int i) {
        return m52369N0(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: t0 */
    public Years mo28614t0() {
        return m52369N0(C12652e.m53802l(mo28703y()));
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(mo28703y()) + "Y";
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51466o();
    }
}
