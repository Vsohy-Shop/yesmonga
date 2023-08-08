package p073j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.Instant;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.i */
final class C42601i implements ChronoZonedDateTime, Serializable {

    /* renamed from: a */
    private final transient C42598f f107766a;

    /* renamed from: b */
    private final transient ZoneOffset f107767b;

    /* renamed from: c */
    private final transient ZoneId f107768c;

    private C42601i(ZoneId zoneId, ZoneOffset zoneOffset, C42598f fVar) {
        Objects.requireNonNull(fVar, "dateTime");
        C42598f fVar2 = fVar;
        this.f107766a = fVar;
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        ZoneOffset zoneOffset2 = zoneOffset;
        this.f107767b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        ZoneId zoneId2 = zoneId;
        this.f107768c = zoneId;
    }

    /* renamed from: n */
    static C42601i m172114n(Chronology chronology, C42671j jVar) {
        C42601i iVar = (C42601i) jVar;
        if (chronology.equals(iVar.mo138048h())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.mo138038s() + ", actual: " + iVar.mo138048h().mo138038s());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2.contains(r7) != false) goto L_0x0055;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p073j$.time.chrono.ChronoZonedDateTime m172115o(p073j$.time.ZoneId r6, p073j$.time.ZoneOffset r7, p073j$.time.chrono.C42598f r8) {
        /*
            java.lang.String r0 = "localDateTime"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "zone"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r0 = r6 instanceof p073j$.time.ZoneOffset
            if (r0 == 0) goto L_0x0017
            j$.time.chrono.i r7 = new j$.time.chrono.i
            r0 = r6
            j$.time.ZoneOffset r0 = (p073j$.time.ZoneOffset) r0
            r7.<init>(r6, r0, r8)
            return r7
        L_0x0017:
            j$.time.zone.c r0 = r6.mo138001n()
            j$.time.LocalDateTime r1 = p073j$.time.LocalDateTime.m171854o(r8)
            java.util.List r2 = r0.mo138253g(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x0032
        L_0x002b:
            java.lang.Object r7 = r2.get(r5)
            j$.time.ZoneOffset r7 = (p073j$.time.ZoneOffset) r7
            goto L_0x0055
        L_0x0032:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x004d
            j$.time.zone.a r7 = r0.mo138252f(r1)
            j$.time.Duration r0 = r7.mo138248q()
            long r0 = r0.getSeconds()
            j$.time.chrono.f r8 = r8.mo138062E(r0)
            j$.time.ZoneOffset r7 = r7.mo138238E()
            goto L_0x0055
        L_0x004d:
            if (r7 == 0) goto L_0x002b
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L_0x002b
        L_0x0055:
            java.lang.String r0 = "offset"
            java.util.Objects.requireNonNull(r7, r0)
            j$.time.chrono.i r0 = new j$.time.chrono.i
            r0.<init>(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.chrono.C42601i.m172115o(j$.time.ZoneId, j$.time.ZoneOffset, j$.time.chrono.f):j$.time.chrono.ChronoZonedDateTime");
    }

    /* renamed from: q */
    static C42601i m172116q(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.mo138001n().mo138250d(instant);
        Objects.requireNonNull(d, C16717v.C16720c.f42211R);
        return new C42601i(zoneId, d, (C42598f) chronology.mo138041y(LocalDateTime.m171850c0(instant.mo137911q(), instant.mo137900E(), d)));
    }

    /* renamed from: C */
    public final ChronoLocalDateTime mo138006C() {
        return this.f107766a;
    }

    /* renamed from: U */
    public final ZoneId mo138010U() {
        return this.f107768c;
    }

    /* renamed from: a */
    public final ChronoZonedDateTime m172120a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return m172114n(mo138048h(), nVar.mo138217o(this, j));
        }
        C42662a aVar = (C42662a) nVar;
        int i = C42600h.f107765a[aVar.ordinal()];
        if (i == 1) {
            return m172122b(j - mo138046S(), (C42677p) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return m172115o(this.f107768c, this.f107767b, this.f107766a.m172102a(j, nVar));
        }
        ZoneOffset L = ZoneOffset.m171937L(aVar.mo138214a0(j));
        C42598f fVar = this.f107766a;
        return m172116q(mo138048h(), Instant.m171792L(fVar.toEpochSecond(L), (long) fVar.mo137967l().mo137973K()), this.f107768c);
    }

    /* renamed from: b */
    public final ChronoZonedDateTime m172122b(long j, C42677p pVar) {
        return pVar instanceof ChronoUnit ? mo137907e(this.f107766a.m172104b(j, pVar)) : m172114n(mo138048h(), pVar.mo138199o(this, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoZonedDateTime) {
            return compareTo((ChronoZonedDateTime) obj) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return (nVar instanceof C42662a) || (nVar != null && nVar.mo138213Y(this));
    }

    public final ZoneOffset getOffset() {
        return this.f107767b;
    }

    public final int hashCode() {
        return (this.f107766a.hashCode() ^ this.f107767b.hashCode()) ^ Integer.rotateLeft(this.f107768c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f107766a.toString() + this.f107767b.toString();
        if (this.f107767b == this.f107768c) {
            return str;
        }
        return str + C12361b.f30260k + this.f107768c.toString() + C12361b.f30261l;
    }
}
