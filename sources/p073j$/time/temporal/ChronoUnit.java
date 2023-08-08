package p073j$.time.temporal;

import org.joda.time.chrono.GregorianChronology;
import p073j$.time.Duration;

/* renamed from: j$.time.temporal.ChronoUnit */
public enum ChronoUnit implements C42677p {
    NANOS("Nanos", Duration.m171789o(1)),
    MICROS("Micros", Duration.m171789o(1000)),
    MILLIS("Millis", Duration.m171789o(1000000)),
    SECONDS("Seconds", Duration.m171790q(1)),
    MINUTES("Minutes", Duration.m171790q(60)),
    HOURS("Hours", Duration.m171790q(3600)),
    HALF_DAYS("HalfDays", Duration.m171790q(43200)),
    DAYS("Days", Duration.m171790q(86400)),
    WEEKS("Weeks", Duration.m171790q(604800)),
    MONTHS("Months", Duration.m171790q(2629746)),
    YEARS("Years", Duration.m171790q(31556952)),
    DECADES("Decades", Duration.m171790q(315569520)),
    CENTURIES("Centuries", Duration.m171790q(3155695200L)),
    MILLENNIA("Millennia", Duration.m171790q(GregorianChronology.f31006z1)),
    ERAS("Eras", Duration.m171790q(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a */
    private final String f107939a;

    /* renamed from: b */
    private final Duration f107940b;

    private ChronoUnit(String str, Duration duration) {
        this.f107939a = str;
        this.f107940b = duration;
    }

    public Duration getDuration() {
        return this.f107940b;
    }

    /* renamed from: n */
    public final boolean mo138198n() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    /* renamed from: o */
    public final C42671j mo138199o(C42671j jVar, long j) {
        return jVar.mo137905b(j, this);
    }

    public final String toString() {
        return this.f107939a;
    }
}
