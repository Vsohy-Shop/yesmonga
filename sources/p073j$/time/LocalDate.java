package p073j$.time;

import java.io.Serializable;
import java.util.Objects;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.C42602j;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.C42609q;
import p073j$.time.chrono.Chronology;
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
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.LocalDate */
public final class LocalDate implements C42671j, C42672k, C42594b, Serializable {

    /* renamed from: d */
    public static final LocalDate f107719d = m171813of(-999999999, 1, 1);

    /* renamed from: e */
    public static final LocalDate f107720e = m171813of(999999999, 12, 31);

    /* renamed from: a */
    private final int f107721a;

    /* renamed from: b */
    private final short f107722b;

    /* renamed from: c */
    private final short f107723c;

    private LocalDate(int i, int i2, int i3) {
        this.f107721a = i;
        this.f107722b = (short) i2;
        this.f107723c = (short) i3;
    }

    /* renamed from: L */
    public static LocalDate m171808L(C42585b bVar) {
        Instant b = bVar.mo138022b();
        return m171809R(Math.floorDiv(b.mo137911q() + ((long) bVar.mo138021a().mo138001n().mo138250d(b).mo138005q()), 86400));
    }

    /* renamed from: R */
    public static LocalDate m171809R(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(C42662a.YEAR.mo138214a0(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: Y */
    public static LocalDate m171810Y(int i, int i2) {
        long j = (long) i;
        C42662a.YEAR.mo138215b0(j);
        C42662a.DAY_OF_YEAR.mo138215b0((long) i2);
        boolean G = C42608p.f107789d.mo138030G(j);
        if (i2 != 366 || G) {
            Month q = Month.m171909q(((i2 - 1) / 31) + 1);
            if (i2 > (q.mo137991o(G) + q.mo137990n(G)) - 1) {
                q = q.mo137988E();
            }
            return new LocalDate(i, q.getValue(), (i2 - q.mo137990n(G)) + 1);
        }
        throw new C42586c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    /* renamed from: e0 */
    private static LocalDate m171811e0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        i4 = C42608p.f107789d.mo138030G((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        return m171808L(C42585b.m171974d());
    }

    /* renamed from: o */
    public static LocalDate m171812o(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.mo137883c(C42676o.m172517b());
        if (localDate != null) {
            return localDate;
        }
        throw new C42586c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* renamed from: of */
    public static LocalDate m171813of(int i, int i2, int i3) {
        long j = (long) i;
        C42662a.YEAR.mo138215b0(j);
        C42662a.MONTH_OF_YEAR.mo138215b0((long) i2);
        C42662a.DAY_OF_MONTH.mo138215b0((long) i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C42608p.f107789d.mo138030G(j)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C42586c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C42586c("Invalid date '" + Month.m171909q(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new C42621f());
    }

    /* renamed from: q */
    private int m171814q(C42675n nVar) {
        switch (C42653g.f107923a[((C42662a) nVar).ordinal()]) {
            case 1:
                return this.f107723c;
            case 2:
                return mo137915E();
            case 3:
                return ((this.f107723c - 1) / 7) + 1;
            case 4:
                int i = this.f107721a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f107723c - 1) % 7) + 1;
            case 7:
                return ((mo137915E() - 1) % 7) + 1;
            case 8:
                throw new C42678q("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((mo137915E() - 1) / 7) + 1;
            case 10:
                return this.f107722b;
            case 11:
                throw new C42678q("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f107721a;
            case 13:
                return this.f107721a >= 1 ? 1 : 0;
            default:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    /* renamed from: D */
    public final C42594b mo137914D(C42658l lVar) {
        if (lVar instanceof C42658l) {
            return plusMonths(lVar.mo138193d()).mo137924b0((long) lVar.mo138192b());
        }
        Objects.requireNonNull(lVar, "amountToAdd");
        return (LocalDate) lVar.mo138191a(this);
    }

    /* renamed from: E */
    public final int mo137915E() {
        return (getMonth().mo137990n(mo137919P()) + this.f107723c) - 1;
    }

    /* renamed from: K */
    public final boolean mo137916K(LocalDate localDate) {
        return localDate instanceof LocalDate ? mo137944n(localDate) < 0 : mo137949w() < localDate.mo137949w();
    }

    /* renamed from: M */
    public final int mo137917M() {
        return mo137919P() ? 366 : 365;
    }

    /* renamed from: P */
    public final boolean mo137919P() {
        return C42608p.f107789d.mo138030G((long) this.f107721a);
    }

    /* renamed from: X */
    public final int compareTo(C42594b bVar) {
        return bVar instanceof LocalDate ? mo137944n((LocalDate) bVar) : super.compareTo(bVar);
    }

    /* renamed from: a0 */
    public final LocalDate m171826b(long j, C42677p pVar) {
        if (!(pVar instanceof ChronoUnit)) {
            return (LocalDate) pVar.mo138199o(this, j);
        }
        switch (C42653g.f107924b[((ChronoUnit) pVar).ordinal()]) {
            case 1:
                return mo137924b0(j);
            case 2:
                return mo137925c0(j);
            case 3:
                return plusMonths(j);
            case 4:
                return mo137927d0(j);
            case 5:
                return mo137927d0(Math.multiplyExact(j, 10));
            case 6:
                return mo137927d0(Math.multiplyExact(j, 100));
            case 7:
                return mo137927d0(Math.multiplyExact(j, 1000));
            case 8:
                C42662a aVar = C42662a.ERA;
                return m171823a(Math.addExact(mo137886g(aVar), j), aVar);
            default:
                throw new C42678q("Unsupported unit: " + pVar);
        }
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.m171849b0(this, LocalTime.MIDNIGHT);
    }

    /* renamed from: atTime */
    public LocalDateTime mo137918N(LocalTime localTime) {
        return LocalDateTime.m171849b0(this, localTime);
    }

    /* renamed from: b0 */
    public final LocalDate mo137924b0(long j) {
        return j == 0 ? this : m171809R(Math.addExact(mo137949w(), j));
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172517b() ? this : super.mo137883c(temporalQuery);
    }

    /* renamed from: c0 */
    public final LocalDate mo137925c0(long j) {
        return mo137924b0(Math.multiplyExact(j, 7));
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return super.mo137884d(jVar);
    }

    /* renamed from: d0 */
    public final LocalDate mo137927d0(long j) {
        return j == 0 ? this : m171811e0(C42662a.YEAR.mo138214a0(((long) this.f107721a) + j), this.f107722b, this.f107723c);
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        return localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            return mo137944n((LocalDate) obj) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return super.mo137885f(nVar);
    }

    /* renamed from: f0 */
    public final LocalDate m171823a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (LocalDate) nVar.mo138217o(this, j);
        }
        C42662a aVar = (C42662a) nVar;
        aVar.mo138215b0(j);
        switch (C42653g.f107923a[aVar.ordinal()]) {
            case 1:
                return mo137931g0((int) j);
            case 2:
                return mo137938h0((int) j);
            case 3:
                return mo137925c0(j - mo137886g(C42662a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f107721a < 1) {
                    j = 1 - j;
                }
                return mo137940i0((int) j);
            case 5:
                return mo137924b0(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return mo137924b0(j - mo137886g(C42662a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo137924b0(j - mo137886g(C42662a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m171809R(j);
            case 9:
                return mo137925c0(j - mo137886g(C42662a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i = (int) j;
                if (this.f107722b == i) {
                    return this;
                }
                C42662a.MONTH_OF_YEAR.mo138215b0((long) i);
                return m171811e0(this.f107721a, i, this.f107723c);
            case 11:
                return plusMonths(j - (((((long) this.f107721a) * 12) + ((long) this.f107722b)) - 1));
            case 12:
                return mo137940i0((int) j);
            case 13:
                return mo137886g(C42662a.ERA) == j ? this : mo137940i0(1 - this.f107721a);
            default:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.mo138095a(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.EPOCH_DAY ? mo137949w() : nVar == C42662a.PROLEPTIC_MONTH ? ((((long) this.f107721a) * 12) + ((long) this.f107722b)) - 1 : (long) m171814q(nVar) : nVar.mo138218q(this);
    }

    /* renamed from: g0 */
    public final LocalDate mo137931g0(int i) {
        return this.f107723c == i ? this : m171813of(this.f107721a, this.f107722b, i);
    }

    public int getDayOfMonth() {
        return this.f107723c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.m171780n(((int) Math.floorMod(mo137949w() + 3, 7)) + 1);
    }

    public Month getMonth() {
        return Month.m171909q(this.f107722b);
    }

    public int getMonthValue() {
        return this.f107722b;
    }

    public int getYear() {
        return this.f107721a;
    }

    /* renamed from: h */
    public final Chronology mo137937h() {
        return C42608p.f107789d;
    }

    /* renamed from: h0 */
    public final LocalDate mo137938h0(int i) {
        return mo137915E() == i ? this : m171810Y(this.f107721a, i);
    }

    public final int hashCode() {
        int i = this.f107721a;
        return (((i << 11) + (this.f107722b << 6)) + this.f107723c) ^ (i & -2048);
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        int i;
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138212L(this);
        }
        C42662a aVar = (C42662a) nVar;
        if (aVar.mo138216n()) {
            int i2 = C42653g.f107923a[aVar.ordinal()];
            if (i2 == 1) {
                i = lengthOfMonth();
            } else if (i2 == 2) {
                i = mo137917M();
            } else if (i2 == 3) {
                return C42679r.m172526j(1, (getMonth() != Month.FEBRUARY || mo137919P()) ? 5 : 4);
            } else if (i2 != 4) {
                return nVar.mo138210E();
            } else {
                return C42679r.m172526j(1, getYear() <= 0 ? 1000000000 : 999999999);
            }
            return C42679r.m172526j(1, (long) i);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: i0 */
    public final LocalDate mo137940i0(int i) {
        if (this.f107721a == i) {
            return this;
        }
        C42662a.YEAR.mo138215b0((long) i);
        return m171811e0(i, this.f107722b, this.f107723c);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar instanceof C42662a ? m171814q(nVar) : super.mo137890j(nVar);
    }

    /* renamed from: k */
    public final C42594b mo137941k(C42672k kVar) {
        boolean z = kVar instanceof LocalDate;
        Object obj = kVar;
        if (!z) {
            obj = kVar.mo137884d(this);
        }
        return (LocalDate) obj;
    }

    public int lengthOfMonth() {
        short s = this.f107722b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo137919P() ? 29 : 28;
    }

    public LocalDate minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo137944n(LocalDate localDate) {
        int i = this.f107721a - localDate.f107721a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f107722b - localDate.f107722b;
        return i2 == 0 ? this.f107723c - localDate.f107723c : i2;
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f107721a) * 12) + ((long) (this.f107722b - 1)) + j;
        return m171811e0(C42662a.YEAR.mo138214a0(Math.floorDiv(j2, 12)), ((int) Math.floorMod(j2, 12)) + 1, this.f107723c);
    }

    public final String toString() {
        int i;
        int i2 = this.f107721a;
        short s = this.f107722b;
        short s2 = this.f107723c;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: u */
    public final C42602j mo137947u() {
        return getYear() >= 1 ? C42609q.CE : C42609q.BCE;
    }

    /* renamed from: v */
    public final C42594b mo137948v(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? m171826b(Long.MAX_VALUE, chronoUnit).m171826b(1, chronoUnit) : m171826b(-j, chronoUnit);
    }

    /* renamed from: w */
    public final long mo137949w() {
        long j;
        long j2 = (long) this.f107721a;
        long j3 = (long) this.f107722b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f107723c - 1));
        if (j3 > 2) {
            j5--;
            if (!mo137919P()) {
                j5--;
            }
        }
        return j5 - 719528;
    }
}
