package p073j$.time.temporal;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.DayOfWeek;

/* renamed from: j$.time.temporal.WeekFields */
public final class WeekFields implements Serializable {

    /* renamed from: g */
    private static final ConcurrentMap f107941g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final C42677p f107942h = C42670i.f107960d;

    /* renamed from: a */
    private final DayOfWeek f107943a;

    /* renamed from: b */
    private final int f107944b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient C42675n f107945c = C42680s.m172543g(this);

    /* renamed from: d */
    private final transient C42675n f107946d = C42680s.m172546j(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient C42675n f107947e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient C42675n f107948f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m172452f(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f107947e = C42680s.m172547k(this);
        this.f107948f = C42680s.m172545i(this);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f107943a = dayOfWeek;
        this.f107944b = i;
    }

    /* renamed from: f */
    public static WeekFields m172452f(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = f107941g;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentMap.get(str);
    }

    /* renamed from: of */
    public static WeekFields m172453of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return m172452f(DayOfWeek.SUNDAY.mo137891o((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
    }

    /* renamed from: d */
    public final C42675n mo138201d() {
        return this.f107945c;
    }

    /* renamed from: e */
    public final int mo138202e() {
        return this.f107944b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeekFields) {
            return hashCode() == obj.hashCode();
        }
        return false;
    }

    /* renamed from: g */
    public final C42675n mo138204g() {
        return this.f107948f;
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f107943a;
    }

    /* renamed from: h */
    public final C42675n mo138206h() {
        return this.f107946d;
    }

    public final int hashCode() {
        return (this.f107943a.ordinal() * 7) + this.f107944b;
    }

    /* renamed from: i */
    public final C42675n mo138208i() {
        return this.f107947e;
    }

    public final String toString() {
        return "WeekFields[" + this.f107943a + ',' + this.f107944b + C12361b.f30261l;
    }
}
