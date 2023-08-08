package p073j$.time;

import java.util.Locale;
import p073j$.time.format.DateTimeFormatterBuilder;
import p073j$.time.format.TextStyle;
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

/* renamed from: j$.time.DayOfWeek */
public enum DayOfWeek implements TemporalAccessor, C42672k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final DayOfWeek[] f107712a = null;

    static {
        f107712a = values();
    }

    /* renamed from: n */
    public static DayOfWeek m171780n(int i) {
        if (i >= 1 && i <= 7) {
            return f107712a[i - 1];
        }
        throw new C42586c("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172520e() ? ChronoUnit.DAYS : super.mo137883c(temporalQuery);
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a((long) getValue(), C42662a.DAY_OF_WEEK);
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.DAY_OF_WEEK : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (nVar == C42662a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo138113k(C42662a.DAY_OF_WEEK, textStyle);
        return dateTimeFormatterBuilder.mo138123v(locale).mo138095a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar == C42662a.DAY_OF_WEEK ? nVar.mo138210E() : super.mo137889i(nVar);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar == C42662a.DAY_OF_WEEK ? getValue() : super.mo137890j(nVar);
    }

    /* renamed from: o */
    public final DayOfWeek mo137891o(long j) {
        int i = ((int) (j % 7)) + 7;
        return f107712a[(i + ordinal()) % 7];
    }
}
