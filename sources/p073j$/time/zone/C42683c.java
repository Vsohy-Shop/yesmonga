package p073j$.time.zone;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p073j$.time.Instant;
import p073j$.time.LocalDate;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneOffset;

/* renamed from: j$.time.zone.c */
public final class C42683c implements Serializable {

    /* renamed from: i */
    private static final long[] f107986i = new long[0];

    /* renamed from: j */
    private static final C42682b[] f107987j = new C42682b[0];

    /* renamed from: k */
    private static final LocalDateTime[] f107988k = new LocalDateTime[0];

    /* renamed from: l */
    private static final C42681a[] f107989l = new C42681a[0];

    /* renamed from: a */
    private final long[] f107990a;

    /* renamed from: b */
    private final ZoneOffset[] f107991b;

    /* renamed from: c */
    private final long[] f107992c;

    /* renamed from: d */
    private final LocalDateTime[] f107993d;

    /* renamed from: e */
    private final ZoneOffset[] f107994e;

    /* renamed from: f */
    private final C42682b[] f107995f;

    /* renamed from: g */
    private final TimeZone f107996g;

    /* renamed from: h */
    private final transient ConcurrentMap f107997h = new ConcurrentHashMap();

    private C42683c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f107991b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f107986i;
        this.f107990a = jArr;
        this.f107992c = jArr;
        this.f107993d = f107988k;
        this.f107994e = zoneOffsetArr;
        this.f107995f = f107987j;
        this.f107996g = null;
    }

    C42683c(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f107991b = zoneOffsetArr;
        zoneOffsetArr[0] = m172572k(timeZone.getRawOffset());
        long[] jArr = f107986i;
        this.f107990a = jArr;
        this.f107992c = jArr;
        this.f107993d = f107988k;
        this.f107994e = zoneOffsetArr;
        this.f107995f = f107987j;
        this.f107996g = timeZone;
    }

    /* renamed from: a */
    private static Object m172567a(LocalDateTime localDateTime, C42681a aVar) {
        LocalDateTime o = aVar.mo138247o();
        boolean R = aVar.mo138241R();
        boolean R2 = localDateTime.mo137954R(o);
        return R ? R2 ? aVar.mo138239K() : localDateTime.mo137954R(aVar.mo138246n()) ? aVar : aVar.mo138238E() : !R2 ? aVar.mo138238E() : localDateTime.mo137954R(aVar.mo138246n()) ? aVar.mo138239K() : aVar;
    }

    /* renamed from: b */
    private C42681a[] m172568b(int i) {
        long j;
        long j2;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i);
        C42681a[] aVarArr = (C42681a[]) ((ConcurrentHashMap) this.f107997h).get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f107996g != null) {
            C42681a[] aVarArr2 = f107989l;
            if (i2 < 1800) {
                return aVarArr2;
            }
            long epochSecond = LocalDateTime.m171847Y(i2 - 1).toEpochSecond(this.f107991b[0]);
            long j3 = 1000;
            int offset = this.f107996g.getOffset(epochSecond * 1000);
            long j4 = 31968000 + epochSecond;
            while (epochSecond < j4) {
                long j5 = 7776000 + epochSecond;
                long j6 = epochSecond;
                if (offset != this.f107996g.getOffset(j5 * j3)) {
                    epochSecond = j6;
                    while (j5 - epochSecond > 1) {
                        long j7 = j4;
                        long floorDiv = Math.floorDiv(j5 + epochSecond, 2);
                        long j8 = j5;
                        if (this.f107996g.getOffset(floorDiv * 1000) == offset) {
                            epochSecond = floorDiv;
                            j5 = j8;
                        } else {
                            j5 = floorDiv;
                        }
                        j3 = 1000;
                        j4 = j7;
                    }
                    j = j4;
                    long j9 = j5;
                    j2 = j3;
                    if (this.f107996g.getOffset(epochSecond * j2) == offset) {
                        epochSecond = j9;
                    }
                    ZoneOffset k = m172572k(offset);
                    offset = this.f107996g.getOffset(epochSecond * j2);
                    ZoneOffset k2 = m172572k(offset);
                    if (m172569c(epochSecond, k2) == i2) {
                        aVarArr2 = (C42681a[]) Arrays.copyOf(aVarArr2, aVarArr2.length + 1);
                        aVarArr2[aVarArr2.length - 1] = new C42681a(epochSecond, k, k2);
                    }
                } else {
                    j = j4;
                    j2 = j3;
                    epochSecond = j5;
                }
                j3 = j2;
                j4 = j;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.f107997h).putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        C42682b[] bVarArr = this.f107995f;
        C42681a[] aVarArr3 = new C42681a[bVarArr.length];
        if (bVarArr.length <= 0) {
            if (i2 < 2100) {
                ((ConcurrentHashMap) this.f107997h).putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
        C42682b bVar = bVarArr[0];
        throw null;
    }

    /* renamed from: c */
    private static int m172569c(long j, ZoneOffset zoneOffset) {
        return LocalDate.m171809R(Math.floorDiv(j + ((long) zoneOffset.mo138005q()), 86400)).getYear();
    }

    /* renamed from: e */
    private Object m172570e(LocalDateTime localDateTime) {
        Object obj = null;
        int i = 0;
        if (this.f107996g != null) {
            C42681a[] b = m172568b(localDateTime.mo137952K());
            if (b.length == 0) {
                return m172572k(this.f107996g.getOffset(localDateTime.toEpochSecond(this.f107991b[0]) * 1000));
            }
            int length = b.length;
            while (i < length) {
                C42681a aVar = b[i];
                Object a = m172567a(localDateTime, aVar);
                if ((a instanceof C42681a) || a.equals(aVar.mo138239K())) {
                    return a;
                }
                i++;
                obj = a;
            }
            return obj;
        } else if (this.f107992c.length == 0) {
            return this.f107991b[0];
        } else {
            if (this.f107995f.length > 0) {
                LocalDateTime[] localDateTimeArr = this.f107993d;
                if (localDateTime.mo137953L(localDateTimeArr[localDateTimeArr.length - 1])) {
                    C42681a[] b2 = m172568b(localDateTime.mo137952K());
                    int length2 = b2.length;
                    while (i < length2) {
                        C42681a aVar2 = b2[i];
                        Object a2 = m172567a(localDateTime, aVar2);
                        if ((a2 instanceof C42681a) || a2.equals(aVar2.mo138239K())) {
                            return a2;
                        }
                        i++;
                        obj = a2;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f107993d, localDateTime);
            if (binarySearch == -1) {
                return this.f107994e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f107993d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i2])) {
                        binarySearch = i2;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.f107994e[(binarySearch / 2) + 1];
            }
            LocalDateTime[] localDateTimeArr3 = this.f107993d;
            LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f107994e;
            int i3 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i3];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
            return zoneOffset2.mo138005q() > zoneOffset.mo138005q() ? new C42681a(localDateTime2, zoneOffset, zoneOffset2) : new C42681a(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    /* renamed from: j */
    public static C42683c m172571j(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        return new C42683c(zoneOffset);
    }

    /* renamed from: k */
    private static ZoneOffset m172572k(int i) {
        return ZoneOffset.m171937L(i / 1000);
    }

    /* renamed from: d */
    public final ZoneOffset mo138250d(Instant instant) {
        TimeZone timeZone = this.f107996g;
        if (timeZone != null) {
            return m172572k(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f107992c.length == 0) {
            return this.f107991b[0];
        }
        long q = instant.mo137911q();
        if (this.f107995f.length > 0) {
            long[] jArr = this.f107992c;
            if (q > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f107994e;
                C42681a[] b = m172568b(m172569c(q, zoneOffsetArr[zoneOffsetArr.length - 1]));
                C42681a aVar = null;
                for (int i = 0; i < b.length; i++) {
                    aVar = b[i];
                    if (q < aVar.mo138242S()) {
                        return aVar.mo138239K();
                    }
                }
                return aVar.mo138238E();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f107992c, q);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f107994e[binarySearch + 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42683c)) {
            return false;
        }
        C42683c cVar = (C42683c) obj;
        return Objects.equals(this.f107996g, cVar.f107996g) && Arrays.equals(this.f107990a, cVar.f107990a) && Arrays.equals(this.f107991b, cVar.f107991b) && Arrays.equals(this.f107992c, cVar.f107992c) && Arrays.equals(this.f107994e, cVar.f107994e) && Arrays.equals(this.f107995f, cVar.f107995f);
    }

    /* renamed from: f */
    public final C42681a mo138252f(LocalDateTime localDateTime) {
        Object e = m172570e(localDateTime);
        if (e instanceof C42681a) {
            return (C42681a) e;
        }
        return null;
    }

    /* renamed from: g */
    public final List mo138253g(LocalDateTime localDateTime) {
        Object e = m172570e(localDateTime);
        return e instanceof C42681a ? ((C42681a) e).mo138240L() : Collections.singletonList((ZoneOffset) e);
    }

    /* renamed from: h */
    public final boolean mo138254h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f107996g;
        if (timeZone != null) {
            zoneOffset = m172572k(timeZone.getRawOffset());
        } else if (this.f107992c.length == 0) {
            zoneOffset = this.f107991b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f107990a, instant.mo137911q());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f107991b[binarySearch + 1];
        }
        return !zoneOffset.equals(mo138250d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f107996g) ^ Arrays.hashCode(this.f107990a)) ^ Arrays.hashCode(this.f107991b)) ^ Arrays.hashCode(this.f107992c)) ^ Arrays.hashCode(this.f107994e)) ^ Arrays.hashCode(this.f107995f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo138256i() {
        /*
            r17 = this;
            r0 = r17
            java.util.TimeZone r1 = r0.f107996g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0163
            boolean r1 = r1.useDaylightTime()
            if (r1 != 0) goto L_0x0162
            java.util.TimeZone r1 = r0.f107996g
            int r1 = r1.getDSTSavings()
            if (r1 == 0) goto L_0x0018
            goto L_0x0162
        L_0x0018:
            j$.time.Instant r1 = p073j$.time.Instant.f107716c
            j$.time.b r1 = p073j$.time.C42585b.m171975e()
            j$.time.Instant r1 = r1.mo138022b()
            java.util.TimeZone r4 = r0.f107996g
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 1
            if (r4 == 0) goto L_0x00e8
            long r9 = r1.mo137911q()
            int r4 = r1.mo137900E()
            if (r4 <= 0) goto L_0x003c
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x003c
            long r9 = r9 + r7
        L_0x003c:
            j$.time.ZoneOffset r1 = r0.mo138250d(r1)
            int r1 = m172569c(r9, r1)
            j$.time.zone.a[] r4 = r0.m172568b(r1)
            int r5 = r4.length
            int r5 = r5 - r3
        L_0x004a:
            if (r5 < 0) goto L_0x005d
            r6 = r4[r5]
            long r11 = r6.mo138242S()
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x005a
            r1 = r4[r5]
            goto L_0x015f
        L_0x005a:
            int r5 = r5 + -1
            goto L_0x004a
        L_0x005d:
            r4 = 1800(0x708, float:2.522E-42)
            if (r1 <= r4) goto L_0x014b
            int r1 = r1 - r3
            j$.time.zone.a[] r1 = r0.m172568b(r1)
            int r5 = r1.length
            int r5 = r5 - r3
        L_0x0068:
            if (r5 < 0) goto L_0x007b
            r6 = r1[r5]
            long r11 = r6.mo138242S()
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            r1 = r1[r5]
            goto L_0x015f
        L_0x0078:
            int r5 = r5 + -1
            goto L_0x0068
        L_0x007b:
            r5 = 31104000(0x1da9c00, double:1.5367418E-316)
            long r5 = r9 - r5
            j$.time.b r1 = p073j$.time.C42585b.m171975e()
            long r11 = r1.mo138023c()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            r15 = 31968000(0x1e7cb00, double:1.57942906E-316)
            long r11 = r11 + r15
            long r5 = java.lang.Math.min(r5, r11)
            java.util.TimeZone r1 = r0.f107996g
            long r7 = r9 - r7
            long r7 = r7 * r13
            int r1 = r1.getOffset(r7)
            j$.time.LocalDate r4 = p073j$.time.LocalDate.m171813of(r4, r3, r3)
            long r7 = r4.mo137949w()
            r11 = 86400(0x15180, double:4.26873E-319)
            long r7 = r7 * r11
        L_0x00a8:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x014b
            java.util.TimeZone r4 = r0.f107996g
            long r11 = r5 * r13
            int r4 = r4.getOffset(r11)
            if (r1 == r4) goto L_0x00e3
            j$.time.ZoneOffset r1 = m172572k(r4)
            int r1 = m172569c(r5, r1)
            int r4 = r1 + 1
            j$.time.zone.a[] r4 = r0.m172568b(r4)
            int r5 = r4.length
            int r5 = r5 - r3
        L_0x00c6:
            if (r5 < 0) goto L_0x00d9
            r6 = r4[r5]
            long r6 = r6.mo138242S()
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            r1 = r4[r5]
            goto L_0x015f
        L_0x00d6:
            int r5 = r5 + -1
            goto L_0x00c6
        L_0x00d9:
            j$.time.zone.a[] r1 = r0.m172568b(r1)
            int r4 = r1.length
            int r4 = r4 - r3
            r1 = r1[r4]
            goto L_0x015f
        L_0x00e3:
            r11 = 7776000(0x76a700, double:3.8418545E-317)
            long r5 = r5 - r11
            goto L_0x00a8
        L_0x00e8:
            long[] r4 = r0.f107992c
            int r4 = r4.length
            if (r4 != 0) goto L_0x00ee
            goto L_0x014b
        L_0x00ee:
            long r9 = r1.mo137911q()
            int r1 = r1.mo137900E()
            if (r1 <= 0) goto L_0x00fd
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fd
            long r9 = r9 + r7
        L_0x00fd:
            long[] r1 = r0.f107992c
            int r4 = r1.length
            int r4 = r4 - r3
            r4 = r1[r4]
            j$.time.zone.b[] r1 = r0.f107995f
            int r1 = r1.length
            if (r1 <= 0) goto L_0x013f
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            j$.time.ZoneOffset[] r1 = r0.f107994e
            int r6 = r1.length
            int r6 = r6 - r3
            r1 = r1[r6]
            int r6 = m172569c(r9, r1)
            j$.time.zone.a[] r7 = r0.m172568b(r6)
            int r8 = r7.length
            int r8 = r8 - r3
        L_0x011c:
            if (r8 < 0) goto L_0x012e
            r11 = r7[r8]
            long r11 = r11.mo138242S()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x012b
            r1 = r7[r8]
            goto L_0x015f
        L_0x012b:
            int r8 = r8 + -1
            goto L_0x011c
        L_0x012e:
            int r1 = m172569c(r4, r1)
            int r6 = r6 + -1
            if (r6 <= r1) goto L_0x013f
            j$.time.zone.a[] r1 = r0.m172568b(r6)
            int r4 = r1.length
            int r4 = r4 - r3
            r1 = r1[r4]
            goto L_0x015f
        L_0x013f:
            long[] r1 = r0.f107992c
            int r1 = java.util.Arrays.binarySearch(r1, r9)
            if (r1 >= 0) goto L_0x0149
            int r1 = -r1
            int r1 = r1 - r3
        L_0x0149:
            if (r1 > 0) goto L_0x014d
        L_0x014b:
            r1 = 0
            goto L_0x015f
        L_0x014d:
            j$.time.zone.a r4 = new j$.time.zone.a
            long[] r5 = r0.f107992c
            int r6 = r1 + -1
            r7 = r5[r6]
            j$.time.ZoneOffset[] r5 = r0.f107994e
            r6 = r5[r6]
            r1 = r5[r1]
            r4.<init>((long) r7, (p073j$.time.ZoneOffset) r6, (p073j$.time.ZoneOffset) r1)
            r1 = r4
        L_0x015f:
            if (r1 != 0) goto L_0x0162
            r2 = r3
        L_0x0162:
            return r2
        L_0x0163:
            long[] r1 = r0.f107992c
            int r1 = r1.length
            if (r1 != 0) goto L_0x0169
            r2 = r3
        L_0x0169:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.zone.C42683c.mo138256i():boolean");
    }

    public final String toString() {
        StringBuilder sb;
        if (this.f107996g != null) {
            sb = new StringBuilder("ZoneRules[timeZone=");
            sb.append(this.f107996g.getID());
        } else {
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f107991b;
            sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
