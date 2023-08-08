package p073j$.time;

import com.google.android.material.badge.C31132a;
import com.google.firebase.installations.C33124s;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;
import p073j$.time.zone.C42683c;

/* renamed from: j$.time.ZoneOffset */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, C42672k, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = m171937L(0);

    /* renamed from: d */
    private static final ConcurrentMap f107740d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    private static final ConcurrentMap f107741e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f */
    public static final ZoneOffset f107742f = m171937L(-64800);

    /* renamed from: g */
    public static final ZoneOffset f107743g = m171937L(64800);

    /* renamed from: b */
    private final int f107744b;

    /* renamed from: c */
    private final transient String f107745c;

    private ZoneOffset(int i) {
        String str;
        this.f107744b = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : C31132a.f74628J0);
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : C33124s.f80355c);
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? C33124s.f80355c : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.f107745c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p073j$.time.ZoneOffset m171935E(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = f107741e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (p073j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x0012
            return r0
        L_0x0012:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0065
            r1 = 3
            if (r0 == r1) goto L_0x0081
            r4 = 5
            if (r0 == r4) goto L_0x005b
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0052
            r5 = 7
            if (r0 == r5) goto L_0x0045
            r1 = 9
            if (r0 != r1) goto L_0x0039
            int r0 = m171938R(r7, r2, r3)
            int r1 = m171938R(r7, r6, r2)
            int r2 = m171938R(r7, r5, r2)
            goto L_0x0087
        L_0x0039:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0045:
            int r0 = m171938R(r7, r2, r3)
            int r1 = m171938R(r7, r1, r3)
            int r2 = m171938R(r7, r4, r3)
            goto L_0x0087
        L_0x0052:
            int r0 = m171938R(r7, r2, r3)
            int r1 = m171938R(r7, r6, r2)
            goto L_0x0063
        L_0x005b:
            int r0 = m171938R(r7, r2, r3)
            int r1 = m171938R(r7, r1, r3)
        L_0x0063:
            r2 = r3
            goto L_0x0087
        L_0x0065:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0081:
            int r0 = m171938R(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0087:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00a0
            if (r3 != r5) goto L_0x0094
            goto L_0x00a0
        L_0x0094:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x00a0:
            if (r3 != r5) goto L_0x00aa
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = m171936K(r7, r0, r1)
            return r7
        L_0x00aa:
            j$.time.ZoneOffset r7 = m171936K(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.ZoneOffset.m171935E(java.lang.String):j$.time.ZoneOffset");
    }

    /* renamed from: K */
    public static ZoneOffset m171936K(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C42586c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C42586c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C42586c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C42586c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C42586c("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 < -59 || i3 > 59) {
            throw new C42586c("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        } else if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m171937L((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new C42586c("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    /* renamed from: L */
    public static ZoneOffset m171937L(int i) {
        if (i < -64800 || i > 64800) {
            throw new C42586c("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = f107740d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
            f107741e.putIfAbsent(zoneOffset2.f107745c, zoneOffset2);
            return zoneOffset2;
        }
    }

    /* renamed from: R */
    private static int m171938R(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new C42586c("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C42586c("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return (temporalQuery == C42676o.m172519d() || temporalQuery == C42676o.m172521f()) ? this : super.mo137883c(temporalQuery);
    }

    public final int compareTo(Object obj) {
        return ((ZoneOffset) obj).f107744b - this.f107744b;
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a((long) this.f107744b, C42662a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f107744b == ((ZoneOffset) obj).f107744b;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.OFFSET_SECONDS : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (nVar == C42662a.OFFSET_SECONDS) {
            return (long) this.f107744b;
        }
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    public final int hashCode() {
        return this.f107744b;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        return super.mo137889i(nVar);
    }

    /* renamed from: j */
    public final int mo137890j(C42675n nVar) {
        if (nVar == C42662a.OFFSET_SECONDS) {
            return this.f107744b;
        }
        if (!(nVar instanceof C42662a)) {
            return super.mo137889i(nVar).mo138226a(mo137886g(nVar), nVar);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: n */
    public final C42683c mo138001n() {
        return C42683c.m172571j(this);
    }

    /* renamed from: q */
    public final int mo138005q() {
        return this.f107744b;
    }

    /* renamed from: s */
    public final String mo138002s() {
        return this.f107745c;
    }

    public final String toString() {
        return this.f107745c;
    }
}
