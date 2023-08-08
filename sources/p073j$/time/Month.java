package p073j$.time;

import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.Month */
public enum Month implements TemporalAccessor, C42672k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final Month[] f107735a = null;

    static {
        f107735a = values();
    }

    /* renamed from: q */
    public static Month m171909q(int i) {
        if (i >= 1 && i <= 12) {
            return f107735a[i - 1];
        }
        throw new C42586c("Invalid value for MonthOfYear: " + i);
    }

    /* renamed from: E */
    public final Month mo137988E() {
        int i = ((int) 1) + 12;
        return f107735a[(i + ordinal()) % 12];
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172516a() ? C42608p.f107789d : temporalQuery == C42676o.m172520e() ? ChronoUnit.MONTHS : super.mo137883c(temporalQuery);
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        if (Chronology.m172024H(jVar).equals(C42608p.f107789d)) {
            return jVar.mo137902a((long) getValue(), C42662a.MONTH_OF_YEAR);
        }
        throw new C42586c("Adjustment only supported on ISO date-time");
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.MONTH_OF_YEAR : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (nVar == C42662a.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar == C42662a.MONTH_OF_YEAR ? nVar.mo138210E() : super.mo137889i(nVar);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar == C42662a.MONTH_OF_YEAR ? getValue() : super.mo137890j(nVar);
    }

    /* renamed from: n */
    public final int mo137990n(boolean z) {
        switch (C42656j.f107928a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    /* renamed from: o */
    public final int mo137991o(boolean z) {
        int i = C42656j.f107928a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }
}
