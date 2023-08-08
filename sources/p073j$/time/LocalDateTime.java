package p073j$.time;

import androidx.compose.p004ui.graphics.vector.C15369g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.Serializable;
import java.util.Objects;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.ChronoLocalDateTime;
import p073j$.time.format.DateTimeFormatter;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.LocalDateTime */
public final class LocalDateTime implements C42671j, C42672k, ChronoLocalDateTime<LocalDate>, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f107724c = m171849b0(LocalDate.f107719d, LocalTime.f107728e);

    /* renamed from: d */
    public static final LocalDateTime f107725d = m171849b0(LocalDate.f107720e, LocalTime.f107729f);

    /* renamed from: a */
    private final LocalDate f107726a;

    /* renamed from: b */
    private final LocalTime f107727b;

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f107726a = localDate;
        this.f107727b = localTime;
    }

    /* renamed from: Y */
    public static LocalDateTime m171847Y(int i) {
        return new LocalDateTime(LocalDate.m171813of(i, 12, 31), LocalTime.m171884R());
    }

    /* renamed from: a0 */
    public static LocalDateTime m171848a0(int i, int i2, int i3, int i4, int i5, int i6) {
        return new LocalDateTime(LocalDate.m171813of(i, i2, i3), LocalTime.m171885Y(i4, i5, i6, 0));
    }

    /* renamed from: b0 */
    public static LocalDateTime m171849b0(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    /* renamed from: c0 */
    public static LocalDateTime m171850c0(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        long j2 = (long) i;
        C42662a.NANO_OF_SECOND.mo138215b0(j2);
        long q = j + ((long) zoneOffset.mo138005q());
        return new LocalDateTime(LocalDate.m171809R(Math.floorDiv(q, 86400)), LocalTime.m171886a0((((long) ((int) Math.floorMod(q, 86400))) * 1000000000) + j2));
    }

    /* renamed from: g0 */
    private LocalDateTime m171851g0(LocalDate localDate, long j, long j2, long j3, long j4) {
        LocalDate localDate2;
        LocalTime localTime;
        if ((j | j2 | j3 | j4) == 0) {
            localTime = this.f107727b;
            localDate2 = localDate;
        } else {
            long j5 = j / 24;
            long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long j7 = (long) 1;
            long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long f0 = this.f107727b.mo137981f0();
            long j9 = (j8 * j7) + f0;
            long floorDiv = Math.floorDiv(j9, 86400000000000L) + (j6 * j7);
            long floorMod = Math.floorMod(j9, 86400000000000L);
            localTime = floorMod == f0 ? this.f107727b : LocalTime.m171886a0(floorMod);
            localDate2 = localDate.mo137924b0(floorDiv);
        }
        return m171852k0(localDate2, localTime);
    }

    /* renamed from: k0 */
    private LocalDateTime m171852k0(LocalDate localDate, LocalTime localTime) {
        return (this.f107726a == localDate && this.f107727b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    /* renamed from: n */
    private int m171853n(LocalDateTime localDateTime) {
        int n = this.f107726a.mo137944n(localDateTime.f107726a);
        return n == 0 ? this.f107727b.compareTo(localDateTime.f107727b) : n;
    }

    public static LocalDateTime now() {
        C42585b d = C42585b.m171974d();
        Instant b = d.mo138022b();
        return m171850c0(b.mo137911q(), b.mo137900E(), d.mo138021a().mo138001n().mo138250d(b));
    }

    /* renamed from: o */
    public static LocalDateTime m171854o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).mo138008L();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.m171812o(temporalAccessor), LocalTime.m171888q(temporalAccessor));
        } catch (C42586c e) {
            throw new C42586c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    /* renamed from: E */
    public final int mo137950E() {
        return this.f107727b.mo137974L();
    }

    /* renamed from: K */
    public final int mo137952K() {
        return this.f107726a.getYear();
    }

    /* renamed from: L */
    public final boolean mo137953L(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m171853n(localDateTime) > 0;
        }
        int i = (this.f107726a.mo137949w() > localDateTime.f107726a.mo137949w() ? 1 : (this.f107726a.mo137949w() == localDateTime.f107726a.mo137949w() ? 0 : -1));
        return i > 0 || (i == 0 && this.f107727b.mo137981f0() > localDateTime.f107727b.mo137981f0());
    }

    /* renamed from: R */
    public final boolean mo137954R(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m171853n(localDateTime) < 0;
        }
        int i = (this.f107726a.mo137949w() > localDateTime.f107726a.mo137949w() ? 1 : (this.f107726a.mo137949w() == localDateTime.f107726a.mo137949w() ? 0 : -1));
        return i < 0 || (i == 0 && this.f107727b.mo137981f0() < localDateTime.f107727b.mo137981f0());
    }

    /* renamed from: Z */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? m171853n((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    /* renamed from: atZone */
    public ZonedDateTime mo137951J(ZoneId zoneId) {
        return ZonedDateTime.m171951q(this, zoneId, (ZoneOffset) null);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172517b() ? this.f107726a : super.mo137883c(temporalQuery);
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return super.mo137884d(jVar);
    }

    /* renamed from: d0 */
    public final LocalDateTime m171864b(long j, C42677p pVar) {
        long j2 = j;
        C42677p pVar2 = pVar;
        if (!(pVar2 instanceof ChronoUnit)) {
            return (LocalDateTime) pVar2.mo138199o(this, j2);
        }
        switch (C42654h.f107925a[((ChronoUnit) pVar2).ordinal()]) {
            case 1:
                return m171851g0(this.f107726a, 0, 0, 0, j);
            case 2:
                LocalDateTime e0 = mo137959e0(j2 / 86400000000L);
                return e0.m171851g0(e0.f107726a, 0, 0, 0, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime e02 = mo137959e0(j2 / 86400000);
                return e02.m171851g0(e02.f107726a, 0, 0, 0, (j2 % 86400000) * 1000000);
            case 4:
                return mo137961f0(j);
            case 5:
                return m171851g0(this.f107726a, 0, j, 0, 0);
            case 6:
                return plusHours(j);
            case 7:
                return mo137959e0(j2 / 256).plusHours((j2 % 256) * 12);
            default:
                return m171852k0(this.f107726a.m171826b(j2, pVar2), this.f107727b);
        }
    }

    /* renamed from: e0 */
    public final LocalDateTime mo137959e0(long j) {
        return m171852k0(this.f107726a.mo137924b0(j), this.f107727b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f107726a.equals(localDateTime.f107726a) && this.f107727b.equals(localDateTime.f107727b);
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar != null && nVar.mo138213Y(this);
        }
        C42662a aVar = (C42662a) nVar;
        return aVar.mo138216n() || aVar.mo138211K();
    }

    /* renamed from: f0 */
    public final LocalDateTime mo137961f0(long j) {
        return m171851g0(this.f107726a, 0, 0, j, 0);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.mo138095a(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107727b.mo137886g(nVar) : this.f107726a.mo137886g(nVar) : nVar.mo138218q(this);
    }

    /* renamed from: h0 */
    public final LocalDate mo137963h0() {
        return this.f107726a;
    }

    public final int hashCode() {
        return this.f107726a.hashCode() ^ this.f107727b.hashCode();
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107727b.mo137889i(nVar) : this.f107726a.mo137889i(nVar) : nVar.mo138212L(this);
    }

    /* renamed from: i0 */
    public final LocalDateTime m171862a(long j, C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? m171852k0(this.f107726a, this.f107727b.mo137902a(j, nVar)) : m171852k0(this.f107726a.m171823a(j, nVar), this.f107727b) : (LocalDateTime) nVar.mo138217o(this, j);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107727b.mo137890j(nVar) : this.f107726a.mo137890j(nVar) : super.mo137890j(nVar);
    }

    /* renamed from: j0 */
    public final LocalDateTime m171869e(LocalDate localDate) {
        return m171852k0(localDate, this.f107727b);
    }

    /* renamed from: l */
    public final LocalTime mo137967l() {
        return this.f107727b;
    }

    /* renamed from: l0 */
    public final LocalDateTime mo137968l0(int i) {
        return m171852k0(this.f107726a.mo137931g0(i), this.f107727b);
    }

    /* renamed from: m */
    public final C42594b mo137969m() {
        return this.f107726a;
    }

    public LocalDateTime plusHours(long j) {
        return m171851g0(this.f107726a, j, 0, 0, 0);
    }

    /* renamed from: q */
    public final int mo137971q() {
        return this.f107727b.mo137973K();
    }

    public final String toString() {
        return this.f107726a.toString() + C15369g.f37992r + this.f107727b.toString();
    }
}
