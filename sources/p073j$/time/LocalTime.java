package p073j$.time;

import com.google.firebase.installations.C33124s;
import java.io.Serializable;
import java.util.Objects;
import org.joda.time.C12590b;
import org.joda.time.DateTimeFieldType;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.LocalTime */
public final class LocalTime implements C42671j, C42672k, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;

    /* renamed from: e */
    public static final LocalTime f107728e;

    /* renamed from: f */
    public static final LocalTime f107729f = new LocalTime(23, 59, 59, 999999999);

    /* renamed from: g */
    private static final LocalTime[] f107730g = new LocalTime[24];

    /* renamed from: a */
    private final byte f107731a;

    /* renamed from: b */
    private final byte f107732b;

    /* renamed from: c */
    private final byte f107733c;

    /* renamed from: d */
    private final int f107734d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f107730g;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                f107728e = localTime;
                return;
            }
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.f107731a = (byte) i;
        this.f107732b = (byte) i2;
        this.f107733c = (byte) i3;
        this.f107734d = i4;
    }

    /* renamed from: E */
    private int m171883E(C42675n nVar) {
        switch (C42655i.f107926a[((C42662a) nVar).ordinal()]) {
            case 1:
                return this.f107734d;
            case 2:
                throw new C42678q("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f107734d / 1000;
            case 4:
                throw new C42678q("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f107734d / 1000000;
            case 6:
                return (int) (mo137981f0() / 1000000);
            case 7:
                return this.f107733c;
            case 8:
                return mo137982g0();
            case 9:
                return this.f107732b;
            case 10:
                return (this.f107731a * 60) + this.f107732b;
            case 11:
                return this.f107731a % 12;
            case 12:
                int i = this.f107731a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f107731a;
            case 14:
                byte b = this.f107731a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f107731a / 12;
            default:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    /* renamed from: R */
    public static LocalTime m171884R() {
        C42662a.HOUR_OF_DAY.mo138215b0((long) 0);
        return f107730g[0];
    }

    /* renamed from: Y */
    public static LocalTime m171885Y(int i, int i2, int i3, int i4) {
        C42662a.HOUR_OF_DAY.mo138215b0((long) i);
        C42662a.MINUTE_OF_HOUR.mo138215b0((long) i2);
        C42662a.SECOND_OF_MINUTE.mo138215b0((long) i3);
        C42662a.NANO_OF_SECOND.mo138215b0((long) i4);
        return m171887o(i, i2, i3, i4);
    }

    /* renamed from: a0 */
    public static LocalTime m171886a0(long j) {
        C42662a.NANO_OF_DAY.mo138215b0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m171887o(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: o */
    private static LocalTime m171887o(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f107730g[i] : new LocalTime(i, i2, i3, i4);
    }

    /* renamed from: q */
    public static LocalTime m171888q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.mo137883c(C42676o.m172518c());
        if (localTime != null) {
            return localTime;
        }
        throw new C42586c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* renamed from: K */
    public final int mo137973K() {
        return this.f107734d;
    }

    /* renamed from: L */
    public final int mo137974L() {
        return this.f107733c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r3 = r3 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return mo137975b0(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073j$.time.temporal.C42671j mo137905b(long r3, p073j$.time.temporal.C42677p r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof p073j$.time.temporal.ChronoUnit
            if (r0 == 0) goto L_0x0051
            int[] r0 = p073j$.time.C42655i.f107927b
            r1 = r5
            j$.time.temporal.ChronoUnit r1 = (p073j$.time.temporal.ChronoUnit) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x0043;
                case 3: goto L_0x003b;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                case 7: goto L_0x0026;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.q r3 = new j$.time.temporal.q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported unit: "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0026:
            r0 = 2
            long r3 = r3 % r0
            r0 = 12
            long r3 = r3 * r0
        L_0x002c:
            j$.time.LocalTime r3 = r2.mo137975b0(r3)
            goto L_0x0057
        L_0x0031:
            j$.time.LocalTime r3 = r2.mo137976c0(r3)
            goto L_0x0057
        L_0x0036:
            j$.time.LocalTime r3 = r2.mo137979e0(r3)
            goto L_0x0057
        L_0x003b:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x004b
        L_0x0043:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r3 = r3 % r0
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x004b:
            long r3 = r3 * r0
        L_0x004c:
            j$.time.LocalTime r3 = r2.mo137978d0(r3)
            goto L_0x0057
        L_0x0051:
            j$.time.temporal.j r3 = r5.mo138199o(r2, r3)
            j$.time.LocalTime r3 = (p073j$.time.LocalTime) r3
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.LocalTime.mo137905b(long, j$.time.temporal.p):j$.time.temporal.j");
    }

    /* renamed from: b0 */
    public final LocalTime mo137975b0(long j) {
        return j == 0 ? this : m171887o(((((int) (j % 24)) + this.f107731a) + 24) % 24, this.f107732b, this.f107733c, this.f107734d);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172516a() || temporalQuery == C42676o.m172522g() || temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172519d()) {
            return null;
        }
        if (temporalQuery == C42676o.m172518c()) {
            return this;
        }
        if (temporalQuery == C42676o.m172517b()) {
            return null;
        }
        return temporalQuery == C42676o.m172520e() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    /* renamed from: c0 */
    public final LocalTime mo137976c0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f107731a * 60) + this.f107732b;
        int i2 = ((((int) (j % 1440)) + i) + C12590b.f30832G) % C12590b.f30832G;
        return i == i2 ? this : m171887o(i2 / 60, i2 % 60, this.f107733c, this.f107734d);
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a(mo137981f0(), C42662a.NANO_OF_DAY);
    }

    /* renamed from: d0 */
    public final LocalTime mo137978d0(long j) {
        if (j == 0) {
            return this;
        }
        long f0 = mo137981f0();
        long j2 = (((j % 86400000000000L) + f0) + 86400000000000L) % 86400000000000L;
        return f0 == j2 ? this : m171887o((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        boolean z = localDate instanceof LocalTime;
        C42671j jVar = localDate;
        if (!z) {
            jVar = localDate.mo137884d(this);
        }
        return (LocalTime) jVar;
    }

    /* renamed from: e0 */
    public final LocalTime mo137979e0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f107732b * 60) + (this.f107731a * DateTimeFieldType.f30603E0) + this.f107733c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m171887o(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f107734d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return this.f107731a == localTime.f107731a && this.f107732b == localTime.f107732b && this.f107733c == localTime.f107733c && this.f107734d == localTime.f107734d;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar.mo138211K() : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: f0 */
    public final long mo137981f0() {
        return (((long) this.f107733c) * 1000000000) + (((long) this.f107732b) * 60000000000L) + (((long) this.f107731a) * 3600000000000L) + ((long) this.f107734d);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.NANO_OF_DAY ? mo137981f0() : nVar == C42662a.MICRO_OF_DAY ? mo137981f0() / 1000 : (long) m171883E(nVar) : nVar.mo138218q(this);
    }

    /* renamed from: g0 */
    public final int mo137982g0() {
        return (this.f107732b * 60) + (this.f107731a * DateTimeFieldType.f30603E0) + this.f107733c;
    }

    /* renamed from: h0 */
    public final LocalTime mo137902a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (LocalTime) nVar.mo138217o(this, j);
        }
        C42662a aVar = (C42662a) nVar;
        aVar.mo138215b0(j);
        switch (C42655i.f107926a[aVar.ordinal()]) {
            case 1:
                return mo137985i0((int) j);
            case 2:
                return m171886a0(j);
            case 3:
                return mo137985i0(((int) j) * 1000);
            case 4:
                return m171886a0(j * 1000);
            case 5:
                return mo137985i0(((int) j) * 1000000);
            case 6:
                return m171886a0(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f107733c == i) {
                    return this;
                }
                C42662a.SECOND_OF_MINUTE.mo138215b0((long) i);
                return m171887o(this.f107731a, this.f107732b, i, this.f107734d);
            case 8:
                return mo137979e0(j - ((long) mo137982g0()));
            case 9:
                int i2 = (int) j;
                if (this.f107732b == i2) {
                    return this;
                }
                C42662a.MINUTE_OF_HOUR.mo138215b0((long) i2);
                return m171887o(this.f107731a, i2, this.f107733c, this.f107734d);
            case 10:
                return mo137976c0(j - ((long) ((this.f107731a * 60) + this.f107732b)));
            case 11:
                return mo137975b0(j - ((long) (this.f107731a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo137975b0(j - ((long) (this.f107731a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.f107731a == i3) {
                    return this;
                }
                C42662a.HOUR_OF_DAY.mo138215b0((long) i3);
                return m171887o(i3, this.f107732b, this.f107733c, this.f107734d);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.f107731a == i4) {
                    return this;
                }
                C42662a.HOUR_OF_DAY.mo138215b0((long) i4);
                return m171887o(i4, this.f107732b, this.f107733c, this.f107734d);
            case 15:
                return mo137975b0((j - ((long) (this.f107731a / 12))) * 12);
            default:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    public final int hashCode() {
        long f0 = mo137981f0();
        return (int) (f0 ^ (f0 >>> 32));
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return super.mo137889i(nVar);
    }

    /* renamed from: i0 */
    public final LocalTime mo137985i0(int i) {
        if (this.f107734d == i) {
            return this;
        }
        C42662a.NANO_OF_SECOND.mo138215b0((long) i);
        return m171887o(this.f107731a, this.f107732b, this.f107733c, i);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        return nVar instanceof C42662a ? m171883E(nVar) : super.mo137890j(nVar);
    }

    /* renamed from: n */
    public final int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.f107731a, localTime.f107731a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f107732b, localTime.f107732b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f107733c, localTime.f107733c);
        return compare3 == 0 ? Integer.compare(this.f107734d, localTime.f107734d) : compare3;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f107731a;
        byte b2 = this.f107732b;
        byte b3 = this.f107733c;
        int i2 = this.f107734d;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : C33124s.f80355c);
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = C33124s.f80355c;
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }
}
