package p073j$.time;

import java.io.Serializable;

/* renamed from: j$.time.a */
final class C42584a extends C42585b implements Serializable {

    /* renamed from: a */
    private final ZoneId f107749a;

    C42584a(ZoneId zoneId) {
        this.f107749a = zoneId;
    }

    /* renamed from: a */
    public final ZoneId mo138021a() {
        return this.f107749a;
    }

    /* renamed from: b */
    public final Instant mo138022b() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    /* renamed from: c */
    public final long mo138023c() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42584a) {
            return this.f107749a.equals(((C42584a) obj).f107749a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f107749a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f107749a + "]";
    }
}
