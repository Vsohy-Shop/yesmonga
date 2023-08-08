package org.joda.time;

import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12685j;
import org.joda.time.format.C12692p;

public final class Days extends BaseSingleFieldPeriod {

    /* renamed from: b */
    public static final Days f30660b = new Days(0);

    /* renamed from: c */
    public static final Days f30661c = new Days(1);

    /* renamed from: d */
    public static final Days f30662d = new Days(2);

    /* renamed from: e */
    public static final Days f30663e = new Days(3);

    /* renamed from: f */
    public static final Days f30664f = new Days(4);

    /* renamed from: g */
    public static final Days f30665g = new Days(5);
    private static final long serialVersionUID = 87525275727380865L;

    /* renamed from: v */
    public static final Days f30666v = new Days(6);

    /* renamed from: w */
    public static final Days f30667w = new Days(7);

    /* renamed from: x */
    public static final Days f30668x = new Days(Integer.MAX_VALUE);

    /* renamed from: y */
    public static final Days f30669y = new Days(Integer.MIN_VALUE);

    /* renamed from: z */
    public static final C12692p f30670z = C12685j.m54341e().mo29327q(PeriodType.m52149c());

    public Days(int i) {
        super(i);
    }

    /* renamed from: G1 */
    public static Days m51405G1(C12715o oVar) {
        return m51406Q(BaseSingleFieldPeriod.m52480M(oVar, 86400000));
    }

    /* renamed from: Q */
    public static Days m51406Q(int i) {
        if (i == Integer.MIN_VALUE) {
            return f30669y;
        }
        if (i == Integer.MAX_VALUE) {
            return f30668x;
        }
        switch (i) {
            case 0:
                return f30660b;
            case 1:
                return f30661c;
            case 2:
                return f30662d;
            case 3:
                return f30663e;
            case 4:
                return f30664f;
            case 5:
                return f30665g;
            case 6:
                return f30666v;
            case 7:
                return f30667w;
            default:
                return new Days(i);
        }
    }

    /* renamed from: W */
    public static Days m51407W(C12712l lVar, C12712l lVar2) {
        return m51406Q(BaseSingleFieldPeriod.m52481g(lVar, lVar2, DurationFieldType.m51456b()));
    }

    /* renamed from: X */
    public static Days m51408X(C12714n nVar, C12714n nVar2) {
        if (!(nVar instanceof LocalDate) || !(nVar2 instanceof LocalDate)) {
            return m51406Q(BaseSingleFieldPeriod.m52482q(nVar, nVar2, f30660b));
        }
        return m51406Q(C12641d.m53370e(nVar.mo27982m()).mo28644j().mo28911q(((LocalDate) nVar2).mo27971f0(), ((LocalDate) nVar).mo27971f0()));
    }

    /* renamed from: e0 */
    public static Days m51409e0(C12713m mVar) {
        if (mVar == null) {
            return f30660b;
        }
        return m51406Q(BaseSingleFieldPeriod.m52481g(mVar.getStart(), mVar.getEnd(), DurationFieldType.m51456b()));
    }

    @FromString
    /* renamed from: j1 */
    public static Days m51410j1(String str) {
        if (str == null) {
            return f30660b;
        }
        return m51406Q(f30670z.mo29322l(str).mo28410T());
    }

    private Object readResolve() {
        return m51406Q(mo28703y());
    }

    /* renamed from: A0 */
    public Days mo27838A0(int i) {
        return mo27850k1(C12652e.m53802l(i));
    }

    /* renamed from: A1 */
    public Days mo27839A1(Days days) {
        return days == null ? this : mo27850k1(days.mo28703y());
    }

    /* renamed from: C0 */
    public Days mo27840C0(Days days) {
        return days == null ? this : mo27838A0(days.mo28703y());
    }

    /* renamed from: F1 */
    public PeriodType mo27841F1() {
        return PeriodType.m52149c();
    }

    /* renamed from: K0 */
    public Days mo27842K0(int i) {
        return m51406Q(C12652e.m53798h(mo28703y(), i));
    }

    /* renamed from: L1 */
    public Duration mo27843L1() {
        return new Duration(((long) mo28703y()) * 86400000);
    }

    /* renamed from: M1 */
    public Hours mo27844M1() {
        return Hours.m51472X(C12652e.m53798h(mo28703y(), 24));
    }

    /* renamed from: N0 */
    public Days mo27845N0() {
        return m51406Q(C12652e.m53802l(mo28703y()));
    }

    /* renamed from: T1 */
    public Minutes mo27846T1() {
        return Minutes.m51824p0(C12652e.m53798h(mo28703y(), C12590b.f30832G));
    }

    /* renamed from: X1 */
    public Seconds mo27847X1() {
        return Seconds.m52179N0(C12652e.m53798h(mo28703y(), 86400));
    }

    /* renamed from: Y1 */
    public Weeks mo27848Y1() {
        return Weeks.m52257M1(mo28703y() / 7);
    }

    /* renamed from: f0 */
    public Days mo27849f0(int i) {
        return i == 1 ? this : m51406Q(mo28703y() / i);
    }

    /* renamed from: k1 */
    public Days mo27850k1(int i) {
        return i == 0 ? this : m51406Q(C12652e.m53794d(mo28703y(), i));
    }

    /* renamed from: n0 */
    public int mo27851n0() {
        return mo28703y();
    }

    /* renamed from: p0 */
    public boolean mo27852p0(Days days) {
        if (days == null) {
            if (mo28703y() > 0) {
                return true;
            }
            return false;
        } else if (mo28703y() > days.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t0 */
    public boolean mo27853t0(Days days) {
        if (days == null) {
            if (mo28703y() < 0) {
                return true;
            }
            return false;
        } else if (mo28703y() < days.mo28703y()) {
            return true;
        } else {
            return false;
        }
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(mo28703y()) + EnergyLabelKt.f67709g;
    }

    /* renamed from: w */
    public DurationFieldType mo27855w() {
        return DurationFieldType.m51456b();
    }
}
