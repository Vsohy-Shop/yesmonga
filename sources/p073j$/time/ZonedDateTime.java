package p073j$.time;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.chrono.ChronoLocalDateTime;
import p073j$.time.chrono.ChronoZonedDateTime;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalQuery;
import p073j$.time.zone.C42681a;
import p073j$.time.zone.C42683c;

/* renamed from: j$.time.ZonedDateTime */
public final class ZonedDateTime implements C42671j, ChronoZonedDateTime<LocalDate>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f107746a;

    /* renamed from: b */
    private final ZoneOffset f107747b;

    /* renamed from: c */
    private final ZoneId f107748c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f107746a = localDateTime;
        this.f107747b = zoneOffset;
        this.f107748c = zoneId;
    }

    /* renamed from: K */
    private ZonedDateTime m171948K(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f107747b) || !this.f107748c.mo138001n().mo138253g(this.f107746a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f107746a, this.f107748c, zoneOffset);
    }

    /* renamed from: n */
    private static ZonedDateTime m171949n(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.mo138001n().mo138250d(Instant.m171792L(j, (long) i));
        return new ZonedDateTime(LocalDateTime.m171850c0(j, i, d), zoneId, d);
    }

    /* renamed from: o */
    public static ZonedDateTime m171950o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m171949n(instant.mo137911q(), instant.mo137900E(), zoneId);
    }

    /* renamed from: q */
    public static ZonedDateTime m171951q(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        C42683c n = zoneId.mo138001n();
        List g = n.mo138253g(localDateTime);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            C42681a f = n.mo138252f(localDateTime);
            localDateTime = localDateTime.mo137961f0(f.mo138248q().getSeconds());
            zoneOffset = f.mo138238E();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
            Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
            ZoneOffset zoneOffset2 = zoneOffset;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* renamed from: C */
    public final ChronoLocalDateTime mo138006C() {
        return this.f107746a;
    }

    /* renamed from: E */
    public final ZonedDateTime m171961b(long j, C42677p pVar) {
        if (!(pVar instanceof ChronoUnit)) {
            return (ZonedDateTime) pVar.mo138199o(this, j);
        }
        if (pVar.mo138198n()) {
            return m171951q(this.f107746a.m171864b(j, pVar), this.f107748c, this.f107747b);
        }
        LocalDateTime d0 = this.f107746a.m171864b(j, pVar);
        ZoneOffset zoneOffset = this.f107747b;
        ZoneId zoneId = this.f107748c;
        Objects.requireNonNull(d0, "localDateTime");
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.mo138001n().mo138253g(d0).contains(zoneOffset) ? new ZonedDateTime(d0, zoneId, zoneOffset) : m171949n(d0.toEpochSecond(zoneOffset), d0.mo137971q(), zoneId);
    }

    /* renamed from: L */
    public final LocalDateTime mo138008L() {
        return this.f107746a;
    }

    /* renamed from: R */
    public final ZonedDateTime m171959a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (ZonedDateTime) nVar.mo138217o(this, j);
        }
        C42662a aVar = (C42662a) nVar;
        int i = C42661o.f107937a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m171951q(this.f107746a.m171862a(j, nVar), this.f107748c, this.f107747b) : m171948K(ZoneOffset.m171937L(aVar.mo138214a0(j))) : m171949n(j, this.f107746a.mo137971q(), this.f107748c);
    }

    /* renamed from: U */
    public final ZoneId mo138010U() {
        return this.f107748c;
    }

    /* renamed from: Y */
    public final ZonedDateTime mo138015k(C42672k kVar) {
        if (kVar instanceof LocalDate) {
            return m171951q(LocalDateTime.m171849b0((LocalDate) kVar, this.f107746a.mo137967l()), this.f107748c, this.f107747b);
        }
        if (kVar instanceof LocalTime) {
            return m171951q(LocalDateTime.m171849b0(this.f107746a.mo137963h0(), (LocalTime) kVar), this.f107748c, this.f107747b);
        }
        if (kVar instanceof LocalDateTime) {
            return m171951q((LocalDateTime) kVar, this.f107748c, this.f107747b);
        }
        if (kVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) kVar;
            return m171951q(offsetDateTime.toLocalDateTime(), this.f107748c, offsetDateTime.getOffset());
        } else if (!(kVar instanceof Instant)) {
            return kVar instanceof ZoneOffset ? m171948K((ZoneOffset) kVar) : (ZonedDateTime) kVar.mo137884d(this);
        } else {
            Instant instant = (Instant) kVar;
            return m171949n(instant.mo137911q(), instant.mo137900E(), this.f107748c);
        }
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172517b() ? mo138017m() : super.mo137883c(temporalQuery);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f107746a.equals(zonedDateTime.f107746a) && this.f107747b.equals(zonedDateTime.f107747b) && this.f107748c.equals(zonedDateTime.f107748c);
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return (nVar instanceof C42662a) || (nVar != null && nVar.mo138213Y(this));
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        int i = C42661o.f107937a[((C42662a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.f107746a.mo137886g(nVar) : (long) this.f107747b.mo138005q() : mo138046S();
    }

    public final ZoneOffset getOffset() {
        return this.f107747b;
    }

    public final int hashCode() {
        return (this.f107746a.hashCode() ^ this.f107747b.hashCode()) ^ Integer.rotateLeft(this.f107748c.hashCode(), 3);
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar instanceof C42662a ? (nVar == C42662a.INSTANT_SECONDS || nVar == C42662a.OFFSET_SECONDS) ? nVar.mo138210E() : this.f107746a.mo137889i(nVar) : nVar.mo138212L(this);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return super.mo137890j(nVar);
        }
        int i = C42661o.f107937a[((C42662a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f107746a.mo137890j(nVar) : this.f107747b.mo138005q();
        }
        throw new C42678q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: l */
    public final LocalTime mo138016l() {
        return this.f107746a.mo137967l();
    }

    /* renamed from: toLocalDate */
    public LocalDate mo138017m() {
        return this.f107746a.mo137963h0();
    }

    public final String toString() {
        String str = this.f107746a.toString() + this.f107747b.toString();
        if (this.f107747b == this.f107748c) {
            return str;
        }
        return str + C12361b.f30260k + this.f107748c.toString() + C12361b.f30261l;
    }

    public ZonedDateTime withDayOfMonth(int i) {
        return m171951q(this.f107746a.mo137968l0(i), this.f107748c, this.f107747b);
    }
}
