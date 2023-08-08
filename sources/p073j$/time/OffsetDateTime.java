package p073j$.time;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.Serializable;
import java.util.Objects;
import p073j$.time.chrono.C42608p;
import p073j$.time.format.DateTimeFormatter;
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

/* renamed from: j$.time.OffsetDateTime */
public final class OffsetDateTime implements C42671j, C42672k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f107737a;

    /* renamed from: b */
    private final ZoneOffset f107738b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f107724c;
        ZoneOffset zoneOffset = ZoneOffset.f107743g;
        localDateTime.getClass();
        m171919n(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f107725d;
        ZoneOffset zoneOffset2 = ZoneOffset.f107742f;
        localDateTime2.getClass();
        m171919n(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        LocalDateTime localDateTime2 = localDateTime;
        this.f107737a = localDateTime;
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        ZoneOffset zoneOffset2 = zoneOffset;
        this.f107738b = zoneOffset;
    }

    /* renamed from: n */
    public static OffsetDateTime m171919n(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime now() {
        C42585b d = C42585b.m171974d();
        Instant b = d.mo138022b();
        return m171920o(b, d.mo138021a().mo138001n().mo138250d(b));
    }

    /* renamed from: o */
    public static OffsetDateTime m171920o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d = zoneId.mo138001n().mo138250d(instant);
        return new OffsetDateTime(LocalDateTime.m171850c0(instant.mo137911q(), instant.mo137900E(), d), d);
    }

    /* renamed from: q */
    private OffsetDateTime m171921q(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f107737a != localDateTime || !this.f107738b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    /* renamed from: a */
    public final C42671j mo137902a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (OffsetDateTime) nVar.mo138217o(this, j);
        }
        C42662a aVar = (C42662a) nVar;
        int i = C42657k.f107929a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m171921q(this.f107737a.m171862a(j, nVar), this.f107738b) : m171921q(this.f107737a, ZoneOffset.m171937L(aVar.mo138214a0(j))) : m171920o(Instant.m171792L(j, (long) this.f107737a.mo137971q()), this.f107738b);
    }

    /* renamed from: b */
    public final C42671j mo137905b(long j, C42677p pVar) {
        return pVar instanceof ChronoUnit ? m171921q(this.f107737a.m171864b(j, pVar), this.f107738b) : (OffsetDateTime) pVar.mo138199o(this, j);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172519d() || temporalQuery == C42676o.m172521f()) {
            return getOffset();
        }
        if (temporalQuery == C42676o.m172522g()) {
            return null;
        }
        return temporalQuery == C42676o.m172517b() ? this.f107737a.mo137963h0() : temporalQuery == C42676o.m172518c() ? this.f107737a.mo137967l() : temporalQuery == C42676o.m172516a() ? C42608p.f107789d : temporalQuery == C42676o.m172520e() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    public final int compareTo(Object obj) {
        int i;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (getOffset().equals(offsetDateTime.getOffset())) {
            i = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            i = Long.compare(this.f107737a.toEpochSecond(this.f107738b), offsetDateTime.f107737a.toEpochSecond(offsetDateTime.f107738b));
            if (i == 0) {
                i = this.f107737a.mo137967l().mo137973K() - offsetDateTime.f107737a.mo137967l().mo137973K();
            }
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : i;
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a(this.f107737a.mo137963h0().mo137949w(), C42662a.EPOCH_DAY).mo137902a(this.f107737a.mo137967l().mo137981f0(), C42662a.NANO_OF_DAY).mo137902a((long) getOffset().mo138005q(), C42662a.OFFSET_SECONDS);
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        return m171921q(this.f107737a.m171869e(localDate), this.f107738b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f107737a.equals(offsetDateTime.f107737a) && this.f107738b.equals(offsetDateTime.f107738b);
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return (nVar instanceof C42662a) || (nVar != null && nVar.mo138213Y(this));
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.mo138095a(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        int i = C42657k.f107929a[((C42662a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.f107737a.mo137886g(nVar) : (long) getOffset().mo138005q() : this.f107737a.toEpochSecond(this.f107738b);
    }

    public ZoneOffset getOffset() {
        return this.f107738b;
    }

    public final int hashCode() {
        return this.f107737a.hashCode() ^ this.f107738b.hashCode();
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar instanceof C42662a ? (nVar == C42662a.INSTANT_SECONDS || nVar == C42662a.OFFSET_SECONDS) ? nVar.mo138210E() : this.f107737a.mo137889i(nVar) : nVar.mo138212L(this);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return super.mo137890j(nVar);
        }
        int i = C42657k.f107929a[((C42662a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f107737a.mo137890j(nVar) : getOffset().mo138005q();
        }
        throw new C42678q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public LocalDateTime toLocalDateTime() {
        return this.f107737a;
    }

    public final String toString() {
        return this.f107737a.toString() + this.f107738b.toString();
    }
}
