package p073j$.time;

import java.io.Serializable;
import java.util.Objects;
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

/* renamed from: j$.time.Instant */
public final class Instant implements C42671j, C42672k, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f107716c = new Instant(0, 0);

    /* renamed from: a */
    private final long f107717a;

    /* renamed from: b */
    private final int f107718b;

    static {
        m171792L(-31557014167219200L, 0);
        m171792L(31556889864403199L, 999999999);
    }

    private Instant(long j, int i) {
        this.f107717a = j;
        this.f107718b = i;
    }

    /* renamed from: K */
    public static Instant m171791K(long j) {
        return m171794o(j, 0);
    }

    /* renamed from: L */
    public static Instant m171792L(long j, long j2) {
        return m171794o(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    /* renamed from: R */
    private Instant m171793R(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m171792L(Math.addExact(Math.addExact(this.f107717a, j), j2 / 1000000000), ((long) this.f107718b) + (j2 % 1000000000));
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return m171792L(temporalAccessor.mo137886g(C42662a.INSTANT_SECONDS), (long) temporalAccessor.mo137890j(C42662a.NANO_OF_SECOND));
        } catch (C42586c e) {
            throw new C42586c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    /* renamed from: o */
    private static Instant m171794o(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f107716c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new C42586c("Instant exceeds minimum or maximum instant");
    }

    public static Instant ofEpochMilli(long j) {
        return m171794o(Math.floorDiv(j, 1000), ((int) Math.floorMod(j, 1000)) * 1000000);
    }

    /* renamed from: E */
    public final int mo137900E() {
        return this.f107718b;
    }

    /* renamed from: Y */
    public final Instant mo137901Y(long j) {
        return m171793R(j, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r3 != r2.f107718b) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r3 != r2.f107718b) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073j$.time.temporal.C42671j mo137902a(long r3, p073j$.time.temporal.C42675n r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p073j$.time.temporal.C42662a
            if (r0 == 0) goto L_0x0060
            r0 = r5
            j$.time.temporal.a r0 = (p073j$.time.temporal.C42662a) r0
            r0.mo138215b0(r3)
            int[] r1 = p073j$.time.C42620e.f107808a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x004f
            r1 = 2
            if (r0 == r1) goto L_0x0041
            r1 = 3
            if (r0 == r1) goto L_0x0037
            r1 = 4
            if (r0 != r1) goto L_0x002b
            long r0 = r2.f107717a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x005e
            int r5 = r2.f107718b
            j$.time.Instant r3 = m171794o(r3, r5)
            goto L_0x0066
        L_0x002b:
            j$.time.temporal.q r3 = new j$.time.temporal.q
            java.lang.String r4 = "Unsupported field: "
            java.lang.String r4 = p073j$.time.C42619d.m172286a(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x0037:
            int r3 = (int) r3
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f107718b
            if (r3 == r4) goto L_0x005e
            goto L_0x0048
        L_0x0041:
            int r3 = (int) r3
            int r3 = r3 * 1000
            int r4 = r2.f107718b
            if (r3 == r4) goto L_0x005e
        L_0x0048:
            long r4 = r2.f107717a
            j$.time.Instant r3 = m171794o(r4, r3)
            goto L_0x0066
        L_0x004f:
            int r5 = r2.f107718b
            long r0 = (long) r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x005e
            long r0 = r2.f107717a
            int r3 = (int) r3
            j$.time.Instant r3 = m171794o(r0, r3)
            goto L_0x0066
        L_0x005e:
            r3 = r2
            goto L_0x0066
        L_0x0060:
            j$.time.temporal.j r3 = r5.mo138217o(r2, r3)
            j$.time.Instant r3 = (p073j$.time.Instant) r3
        L_0x0066:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.Instant.mo137902a(long, j$.time.temporal.n):j$.time.temporal.j");
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m171920o(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.m171950o(this, zoneId);
    }

    /* renamed from: b */
    public final C42671j mo137905b(long j, C42677p pVar) {
        long j2;
        if (!(pVar instanceof ChronoUnit)) {
            return (Instant) pVar.mo138199o(this, j);
        }
        switch (C42620e.f107809b[((ChronoUnit) pVar).ordinal()]) {
            case 1:
                return m171793R(0, j);
            case 2:
                return m171793R(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m171793R(j / 1000, (j % 1000) * 1000000);
            case 4:
                return mo137901Y(j);
            case 5:
                j2 = 60;
                break;
            case 6:
                j2 = 3600;
                break;
            case 7:
                j2 = 43200;
                break;
            case 8:
                j2 = 86400;
                break;
            default:
                throw new C42678q("Unsupported unit: " + pVar);
        }
        j = Math.multiplyExact(j, j2);
        return mo137901Y(j);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172520e()) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == C42676o.m172516a() || temporalQuery == C42676o.m172522g() || temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172519d() || temporalQuery == C42676o.m172517b() || temporalQuery == C42676o.m172518c()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a(this.f107717a, C42662a.INSTANT_SECONDS).mo137902a((long) this.f107718b, C42662a.NANO_OF_SECOND);
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        return (Instant) localDate.mo137884d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f107717a == instant.f107717a && this.f107718b == instant.f107718b;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.INSTANT_SECONDS || nVar == C42662a.NANO_OF_SECOND || nVar == C42662a.MICRO_OF_SECOND || nVar == C42662a.MILLI_OF_SECOND : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        int i;
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        int i2 = C42620e.f107808a[((C42662a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.f107718b;
        } else if (i2 == 2) {
            i = this.f107718b / 1000;
        } else if (i2 == 3) {
            i = this.f107718b / 1000000;
        } else if (i2 == 4) {
            return this.f107717a;
        } else {
            throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
        return (long) i;
    }

    public final int hashCode() {
        long j = this.f107717a;
        return (this.f107718b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return super.mo137889i(nVar);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return super.mo137889i(nVar).mo138226a(nVar.mo138218q(this), nVar);
        }
        int i = C42620e.f107808a[((C42662a) nVar).ordinal()];
        if (i == 1) {
            return this.f107718b;
        }
        if (i == 2) {
            return this.f107718b / 1000;
        }
        if (i == 3) {
            return this.f107718b / 1000000;
        }
        if (i == 4) {
            C42662a.INSTANT_SECONDS.mo138214a0(this.f107717a);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: n */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f107717a, instant.f107717a);
        return compare != 0 ? compare : this.f107718b - instant.f107718b;
    }

    /* renamed from: q */
    public final long mo137911q() {
        return this.f107717a;
    }

    public long toEpochMilli() {
        long multiplyExact;
        int i;
        long j = this.f107717a;
        if (j >= 0 || this.f107718b <= 0) {
            multiplyExact = Math.multiplyExact(j, 1000);
            i = this.f107718b / 1000000;
        } else {
            multiplyExact = Math.multiplyExact(j + 1, 1000);
            i = (this.f107718b / 1000000) - 1000;
        }
        return Math.addExact(multiplyExact, (long) i);
    }

    public final String toString() {
        return DateTimeFormatter.f107822h.mo138095a(this);
    }
}
