package p073j$.time.chrono;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p073j$.time.C42586c;
import p073j$.time.Instant;
import p073j$.time.LocalDateTime;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.format.C42624C;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.chrono.Chronology */
public interface Chronology extends Comparable<Chronology> {
    /* renamed from: H */
    static Chronology m172024H(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.mo137883c(C42676o.m172516a());
        return chronology != null ? chronology : C42608p.f107789d;
    }

    static Chronology ofLocale(Locale locale) {
        return C42593a.ofLocale(locale);
    }

    /* renamed from: B */
    C42594b mo138028B(int i, int i2);

    /* renamed from: F */
    List mo138029F();

    /* renamed from: G */
    boolean mo138030G(long j);

    /* renamed from: I */
    C42594b mo138031I(int i, int i2, int i3);

    /* renamed from: O */
    C42594b mo138032O();

    /* renamed from: Q */
    C42602j mo138033Q(int i);

    /* renamed from: T */
    C42594b mo138034T(Map map, C42624C c);

    /* renamed from: V */
    String mo138035V();

    /* renamed from: W */
    C42679r mo138036W(C42662a aVar);

    boolean equals(Object obj);

    /* renamed from: p */
    C42594b mo138037p(long j);

    /* renamed from: r */
    int mo138051r(Chronology chronology);

    /* renamed from: s */
    String mo138038s();

    /* renamed from: t */
    C42594b mo138039t(TemporalAccessor temporalAccessor);

    String toString();

    /* renamed from: x */
    int mo138040x(C42602j jVar, int i);

    /* renamed from: y */
    ChronoLocalDateTime mo138041y(LocalDateTime localDateTime) {
        try {
            return mo138039t(localDateTime).mo137918N(LocalTime.m171888q(localDateTime));
        } catch (C42586c e) {
            throw new C42586c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    /* renamed from: z */
    ChronoZonedDateTime mo138042z(Instant instant, ZoneId zoneId) {
        return C42601i.m172116q(this, instant, zoneId);
    }
}
