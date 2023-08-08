package p073j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.Duration;
import p073j$.time.Instant;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
public final class C42681a implements Comparable, Serializable {

    /* renamed from: a */
    private final LocalDateTime f107983a;

    /* renamed from: b */
    private final ZoneOffset f107984b;

    /* renamed from: c */
    private final ZoneOffset f107985c;

    C42681a(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f107983a = LocalDateTime.m171850c0(j, 0, zoneOffset);
        this.f107984b = zoneOffset;
        this.f107985c = zoneOffset2;
    }

    C42681a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f107983a = localDateTime;
        this.f107984b = zoneOffset;
        this.f107985c = zoneOffset2;
    }

    /* renamed from: E */
    public final ZoneOffset mo138238E() {
        return this.f107985c;
    }

    /* renamed from: K */
    public final ZoneOffset mo138239K() {
        return this.f107984b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final List mo138240L() {
        if (mo138241R()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{this.f107984b, this.f107985c});
    }

    /* renamed from: R */
    public final boolean mo138241R() {
        return this.f107985c.mo138005q() > this.f107984b.mo138005q();
    }

    /* renamed from: S */
    public final long mo138242S() {
        return this.f107983a.toEpochSecond(this.f107984b);
    }

    public final int compareTo(Object obj) {
        C42681a aVar = (C42681a) obj;
        LocalDateTime localDateTime = this.f107983a;
        Instant L = Instant.m171792L(localDateTime.toEpochSecond(this.f107984b), (long) localDateTime.mo137967l().mo137973K());
        LocalDateTime localDateTime2 = aVar.f107983a;
        return L.compareTo(Instant.m171792L(localDateTime2.toEpochSecond(aVar.f107984b), (long) localDateTime2.mo137967l().mo137973K()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C42681a)) {
            return false;
        }
        C42681a aVar = (C42681a) obj;
        return this.f107983a.equals(aVar.f107983a) && this.f107984b.equals(aVar.f107984b) && this.f107985c.equals(aVar.f107985c);
    }

    public final int hashCode() {
        return (this.f107983a.hashCode() ^ this.f107984b.hashCode()) ^ Integer.rotateLeft(this.f107985c.hashCode(), 16);
    }

    /* renamed from: n */
    public final LocalDateTime mo138246n() {
        return this.f107983a.mo137961f0((long) (this.f107985c.mo138005q() - this.f107984b.mo138005q()));
    }

    /* renamed from: o */
    public final LocalDateTime mo138247o() {
        return this.f107983a;
    }

    /* renamed from: q */
    public final Duration mo138248q() {
        return Duration.m171790q((long) (this.f107985c.mo138005q() - this.f107984b.mo138005q()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(mo138241R() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f107983a);
        sb.append(this.f107984b);
        sb.append(" to ");
        sb.append(this.f107985c);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }
}
