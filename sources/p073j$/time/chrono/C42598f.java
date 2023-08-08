package p073j$.time.chrono;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.io.Serializable;
import java.util.Objects;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.f */
final class C42598f implements ChronoLocalDateTime, C42671j, C42672k, Serializable {

    /* renamed from: a */
    private final transient C42594b f107762a;

    /* renamed from: b */
    private final transient LocalTime f107763b;

    private C42598f(C42594b bVar, LocalTime localTime) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(localTime, "time");
        this.f107762a = bVar;
        this.f107763b = localTime;
    }

    /* renamed from: K */
    private C42598f m172093K(C42594b bVar, long j, long j2, long j3, long j4) {
        LocalTime a0;
        C42594b bVar2 = bVar;
        if ((j | j2 | j3 | j4) == 0) {
            a0 = this.f107763b;
        } else {
            long j5 = j / 24;
            long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long f0 = this.f107763b.mo137981f0();
            long j7 = j6 + f0;
            long floorDiv = Math.floorDiv(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long floorMod = Math.floorMod(j7, 86400000000000L);
            a0 = floorMod == f0 ? this.f107763b : LocalTime.m171886a0(floorMod);
            bVar2 = bVar2.mo137905b(floorDiv, ChronoUnit.DAYS);
        }
        return m172094Y(bVar2, a0);
    }

    /* renamed from: Y */
    private C42598f m172094Y(C42671j jVar, LocalTime localTime) {
        C42594b bVar = this.f107762a;
        return (bVar == jVar && this.f107763b == localTime) ? this : new C42598f(C42596d.m172084n(bVar.mo137937h(), jVar), localTime);
    }

    /* renamed from: n */
    static C42598f m172095n(Chronology chronology, C42671j jVar) {
        C42598f fVar = (C42598f) jVar;
        if (chronology.equals(fVar.mo138043h())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.mo138038s() + ", actual: " + fVar.mo138043h().mo138038s());
    }

    /* renamed from: o */
    static C42598f m172096o(C42594b bVar, LocalTime localTime) {
        return new C42598f(bVar, localTime);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C42598f mo138062E(long j) {
        return m172093K(this.f107762a, 0, 0, j, 0);
    }

    /* renamed from: J */
    public final ChronoZonedDateTime mo137951J(ZoneId zoneId) {
        return C42601i.m172115o(zoneId, (ZoneOffset) null, this);
    }

    /* renamed from: L */
    public final C42598f m172102a(long j, C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? m172094Y(this.f107762a, this.f107763b.mo137902a(j, nVar)) : m172094Y(this.f107762a.mo137902a(j, nVar), this.f107763b) : m172095n(this.f107762a.mo137937h(), nVar.mo138217o(this, j));
    }

    /* renamed from: R */
    public final C42598f m172106e(LocalDate localDate) {
        return m172094Y(localDate, this.f107763b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoLocalDateTime) {
            return compareTo((ChronoLocalDateTime) obj) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar != null && nVar.mo138213Y(this);
        }
        C42662a aVar = (C42662a) nVar;
        return aVar.mo138216n() || aVar.mo138211K();
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107763b.mo137886g(nVar) : this.f107762a.mo137886g(nVar) : nVar.mo138218q(this);
    }

    public final int hashCode() {
        return this.f107762a.hashCode() ^ this.f107763b.hashCode();
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107763b.mo137889i(nVar) : this.f107762a.mo137889i(nVar) : nVar.mo138212L(this);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar instanceof C42662a ? ((C42662a) nVar).mo138211K() ? this.f107763b.mo137890j(nVar) : this.f107762a.mo137890j(nVar) : mo137889i(nVar).mo138226a(mo137886g(nVar), nVar);
    }

    /* renamed from: l */
    public final LocalTime mo137967l() {
        return this.f107763b;
    }

    /* renamed from: m */
    public final C42594b mo137969m() {
        return this.f107762a;
    }

    /* renamed from: q */
    public final C42598f m172104b(long j, C42677p pVar) {
        long j2 = j;
        C42677p pVar2 = pVar;
        if (!(pVar2 instanceof ChronoUnit)) {
            return m172095n(this.f107762a.mo137937h(), pVar2.mo138199o(this, j2));
        }
        switch (C42597e.f107761a[((ChronoUnit) pVar2).ordinal()]) {
            case 1:
                return m172093K(this.f107762a, 0, 0, 0, j);
            case 2:
                C42598f Y = m172094Y(this.f107762a.mo137905b(j2 / 86400000000L, ChronoUnit.DAYS), this.f107763b);
                return Y.m172093K(Y.f107762a, 0, 0, 0, (j2 % 86400000000L) * 1000);
            case 3:
                C42598f Y2 = m172094Y(this.f107762a.mo137905b(j2 / 86400000, ChronoUnit.DAYS), this.f107763b);
                return Y2.m172093K(Y2.f107762a, 0, 0, 0, (j2 % 86400000) * 1000000);
            case 4:
                return mo138062E(j);
            case 5:
                return m172093K(this.f107762a, 0, j, 0, 0);
            case 6:
                return m172093K(this.f107762a, j, 0, 0, 0);
            case 7:
                C42598f Y3 = m172094Y(this.f107762a.mo137905b(j2 / 256, ChronoUnit.DAYS), this.f107763b);
                return Y3.m172093K(Y3.f107762a, (j2 % 256) * 12, 0, 0, 0);
            default:
                return m172094Y(this.f107762a.mo137905b(j2, pVar2), this.f107763b);
        }
    }

    public final String toString() {
        return this.f107762a.toString() + C15369g.f37992r + this.f107763b.toString();
    }
}
