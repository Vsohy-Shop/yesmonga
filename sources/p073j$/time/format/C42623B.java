package p073j$.time.format;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p073j$.time.C42586c;
import p073j$.time.C42619d;
import p073j$.time.C42658l;
import p073j$.time.Instant;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.ChronoZonedDateTime;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.B */
final class C42623B implements TemporalAccessor {

    /* renamed from: a */
    final Map f107813a = new HashMap();

    /* renamed from: b */
    ZoneId f107814b;

    /* renamed from: c */
    Chronology f107815c;

    /* renamed from: d */
    private C42624C f107816d;

    /* renamed from: e */
    private C42594b f107817e;

    /* renamed from: f */
    private LocalTime f107818f;

    /* renamed from: g */
    C42658l f107819g = C42658l.f107930d;

    C42623B() {
    }

    /* renamed from: n */
    private void m172292n(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f107813a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C42675n nVar = (C42675n) entry.getKey();
            if (temporalAccessor.mo137885f(nVar)) {
                try {
                    long g = temporalAccessor.mo137886g(nVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (g == longValue) {
                        it.remove();
                    } else {
                        throw new C42586c("Conflict found: Field " + nVar + " " + g + " differs from " + nVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* renamed from: p */
    private void m172293p() {
        Map map = this.f107813a;
        if (((HashMap) map).containsKey(C42662a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f107814b;
            if (zoneId != null) {
                m172294q(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) map).get(C42662a.OFFSET_SECONDS);
            if (l != null) {
                m172294q(ZoneOffset.m171937L(l.intValue()));
            }
        }
    }

    /* renamed from: q */
    private void m172294q(ZoneId zoneId) {
        Map map = this.f107813a;
        C42662a aVar = C42662a.INSTANT_SECONDS;
        ChronoZonedDateTime z = this.f107815c.mo138042z(Instant.m171791K(((Long) ((HashMap) map).remove(aVar)).longValue()), zoneId);
        m172298x(z.mo138017m());
        m172299y(aVar, C42662a.SECOND_OF_DAY, Long.valueOf((long) z.mo138016l().mo137982g0()));
    }

    /* renamed from: r */
    private void m172295r(long j, long j2, long j3, long j4) {
        LocalTime Y;
        C42658l lVar;
        if (this.f107816d == C42624C.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000)), j4);
            Y = LocalTime.m171886a0(Math.floorMod(addExact, 86400000000000L));
            lVar = C42658l.m172435c((int) Math.floorDiv(addExact, 86400000000000L));
        } else {
            int a0 = C42662a.MINUTE_OF_HOUR.mo138214a0(j2);
            int a02 = C42662a.NANO_OF_SECOND.mo138214a0(j4);
            if (this.f107816d == C42624C.SMART && j == 24 && a0 == 0 && j3 == 0 && a02 == 0) {
                Y = LocalTime.MIDNIGHT;
                lVar = C42658l.m172435c(1);
            } else {
                Y = LocalTime.m171885Y(C42662a.HOUR_OF_DAY.mo138214a0(j), a0, C42662a.SECOND_OF_MINUTE.mo138214a0(j3), a02);
                lVar = C42658l.f107930d;
            }
        }
        m172297t(Y, lVar);
    }

    /* renamed from: s */
    private void m172296s() {
        long j;
        C42662a aVar;
        Map map = this.f107813a;
        C42662a aVar2 = C42662a.CLOCK_HOUR_OF_DAY;
        HashMap hashMap = (HashMap) map;
        long j2 = 0;
        if (hashMap.containsKey(aVar2)) {
            long longValue = ((Long) hashMap.remove(aVar2)).longValue();
            C42624C c = this.f107816d;
            if (c == C42624C.STRICT || (c == C42624C.SMART && longValue != 0)) {
                aVar2.mo138215b0(longValue);
            }
            C42662a aVar3 = C42662a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            m172299y(aVar2, aVar3, Long.valueOf(longValue));
        }
        C42662a aVar4 = C42662a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar4)) {
            long longValue2 = ((Long) hashMap.remove(aVar4)).longValue();
            C42624C c2 = this.f107816d;
            if (c2 == C42624C.STRICT || (c2 == C42624C.SMART && longValue2 != 0)) {
                aVar4.mo138215b0(longValue2);
            }
            C42662a aVar5 = C42662a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j2 = longValue2;
            }
            m172299y(aVar4, aVar5, Long.valueOf(j2));
        }
        C42662a aVar6 = C42662a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar6)) {
            C42662a aVar7 = C42662a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar7)) {
                long longValue3 = ((Long) hashMap.remove(aVar6)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar7)).longValue();
                if (this.f107816d == C42624C.LENIENT) {
                    aVar = C42662a.HOUR_OF_DAY;
                    j = Math.addExact(Math.multiplyExact(longValue3, 12), longValue4);
                } else {
                    aVar6.mo138215b0(longValue3);
                    aVar7.mo138215b0(longValue3);
                    aVar = C42662a.HOUR_OF_DAY;
                    j = (longValue3 * 12) + longValue4;
                }
                m172299y(aVar6, aVar, Long.valueOf(j));
            }
        }
        C42662a aVar8 = C42662a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue5 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f107816d != C42624C.LENIENT) {
                aVar8.mo138215b0(longValue5);
            }
            m172299y(aVar8, C42662a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            m172299y(aVar8, C42662a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            m172299y(aVar8, C42662a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            m172299y(aVar8, C42662a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        C42662a aVar9 = C42662a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue6 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f107816d != C42624C.LENIENT) {
                aVar9.mo138215b0(longValue6);
            }
            m172299y(aVar9, C42662a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            m172299y(aVar9, C42662a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        C42662a aVar10 = C42662a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue7 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f107816d != C42624C.LENIENT) {
                aVar10.mo138215b0(longValue7);
            }
            m172299y(aVar10, C42662a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            m172299y(aVar10, C42662a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        C42662a aVar11 = C42662a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar11)) {
            long longValue8 = ((Long) hashMap.remove(aVar11)).longValue();
            if (this.f107816d != C42624C.LENIENT) {
                aVar11.mo138215b0(longValue8);
            }
            m172299y(aVar11, C42662a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            m172299y(aVar11, C42662a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            m172299y(aVar11, C42662a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        C42662a aVar12 = C42662a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar12)) {
            long longValue9 = ((Long) hashMap.remove(aVar12)).longValue();
            if (this.f107816d != C42624C.LENIENT) {
                aVar12.mo138215b0(longValue9);
            }
            m172299y(aVar12, C42662a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            m172299y(aVar12, C42662a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        C42662a aVar13 = C42662a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar13)) {
            long longValue10 = ((Long) hashMap.get(aVar13)).longValue();
            C42624C c3 = this.f107816d;
            C42624C c4 = C42624C.LENIENT;
            if (c3 != c4) {
                aVar13.mo138215b0(longValue10);
            }
            C42662a aVar14 = C42662a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar14)) {
                long longValue11 = ((Long) hashMap.remove(aVar14)).longValue();
                if (this.f107816d != c4) {
                    aVar14.mo138215b0(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                m172299y(aVar14, aVar13, Long.valueOf(longValue10));
            }
            C42662a aVar15 = C42662a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar15)) {
                long longValue12 = ((Long) hashMap.remove(aVar15)).longValue();
                if (this.f107816d != c4) {
                    aVar15.mo138215b0(longValue12);
                }
                m172299y(aVar15, aVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        C42662a aVar16 = C42662a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar16)) {
            C42662a aVar17 = C42662a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar17)) {
                C42662a aVar18 = C42662a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar18) && hashMap.containsKey(aVar13)) {
                    m172295r(((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar17)).longValue(), ((Long) hashMap.remove(aVar18)).longValue(), ((Long) hashMap.remove(aVar13)).longValue());
                }
            }
        }
    }

    /* renamed from: t */
    private void m172297t(LocalTime localTime, C42658l lVar) {
        LocalTime localTime2 = this.f107818f;
        if (localTime2 == null) {
            this.f107818f = localTime;
        } else if (localTime2.equals(localTime)) {
            C42658l lVar2 = this.f107819g;
            lVar2.getClass();
            C42658l lVar3 = C42658l.f107930d;
            boolean z = true;
            if (!(lVar2 == lVar3)) {
                if (lVar != lVar3) {
                    z = false;
                }
                if (!z && !this.f107819g.equals(lVar)) {
                    throw new C42586c("Conflict found: Fields resolved to different excess periods: " + this.f107819g + " " + lVar);
                }
            }
        } else {
            throw new C42586c("Conflict found: Fields resolved to different times: " + this.f107818f + " " + localTime);
        }
        this.f107819g = lVar;
    }

    /* renamed from: x */
    private void m172298x(C42594b bVar) {
        C42594b bVar2 = this.f107817e;
        if (bVar2 != null) {
            if (bVar != null && !bVar2.equals(bVar)) {
                throw new C42586c("Conflict found: Fields resolved to two different dates: " + this.f107817e + " " + bVar);
            }
        } else if (bVar == null) {
        } else {
            if (this.f107815c.equals(bVar.mo137937h())) {
                this.f107817e = bVar;
                return;
            }
            throw new C42586c("ChronoLocalDate must use the effective parsed chronology: " + this.f107815c);
        }
    }

    /* renamed from: y */
    private void m172299y(C42662a aVar, C42662a aVar2, Long l) {
        Long l2 = (Long) ((HashMap) this.f107813a).put(aVar2, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            throw new C42586c("Conflict found: " + aVar2 + " " + l2 + " differs from " + aVar2 + " " + l + " while resolving  " + aVar);
        }
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172522g()) {
            return this.f107814b;
        }
        if (temporalQuery == C42676o.m172516a()) {
            return this.f107815c;
        }
        if (temporalQuery == C42676o.m172517b()) {
            C42594b bVar = this.f107817e;
            if (bVar != null) {
                return LocalDate.m171812o(bVar);
            }
            return null;
        } else if (temporalQuery == C42676o.m172518c()) {
            return this.f107818f;
        } else {
            if (temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172519d()) {
                return temporalQuery.queryFrom(this);
            }
            if (temporalQuery == C42676o.m172520e()) {
                return null;
            }
            return temporalQuery.queryFrom(this);
        }
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        if (((HashMap) this.f107813a).containsKey(nVar)) {
            return true;
        }
        C42594b bVar = this.f107817e;
        if (bVar != null && bVar.mo137885f(nVar)) {
            return true;
        }
        LocalTime localTime = this.f107818f;
        if (localTime == null || !localTime.mo137885f(nVar)) {
            return nVar != null && !(nVar instanceof C42662a) && nVar.mo138213Y(this);
        }
        return true;
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        Objects.requireNonNull(nVar, "field");
        Long l = (Long) ((HashMap) this.f107813a).get(nVar);
        if (l != null) {
            return l.longValue();
        }
        C42594b bVar = this.f107817e;
        if (bVar != null && bVar.mo137885f(nVar)) {
            return this.f107817e.mo137886g(nVar);
        }
        LocalTime localTime = this.f107818f;
        if (localTime != null && localTime.mo137885f(nVar)) {
            return this.f107818f.mo137886g(nVar);
        }
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138093o(p073j$.time.format.C42624C r25, java.util.Set r26) {
        /*
            r24 = this;
            r9 = r24
            r0 = r26
            java.util.Map r1 = r9.f107813a
            if (r0 == 0) goto L_0x0012
            r2 = r1
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Set r2 = r2.keySet()
            r2.retainAll(r0)
        L_0x0012:
            r0 = r25
            r9.f107816d = r0
            r24.m172293p()
            j$.time.chrono.Chronology r0 = r9.f107815c
            j$.time.format.C r2 = r9.f107816d
            j$.time.chrono.b r0 = r0.mo138034T(r1, r2)
            r9.m172298x(r0)
            r24.m172296s()
            r10 = r1
            java.util.HashMap r10 = (java.util.HashMap) r10
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00ea
            r0 = 0
        L_0x0031:
            r2 = 50
            if (r0 >= r2) goto L_0x00cc
            java.util.Set r3 = r10.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00cc
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            j$.time.temporal.n r4 = (p073j$.time.temporal.C42675n) r4
            j$.time.format.C r5 = r9.f107816d
            j$.time.temporal.TemporalAccessor r5 = r4.mo138220R(r1, r9, r5)
            if (r5 == 0) goto L_0x00c2
            boolean r2 = r5 instanceof p073j$.time.chrono.ChronoZonedDateTime
            if (r2 == 0) goto L_0x008d
            j$.time.chrono.ChronoZonedDateTime r5 = (p073j$.time.chrono.ChronoZonedDateTime) r5
            j$.time.ZoneId r2 = r9.f107814b
            if (r2 != 0) goto L_0x0068
            j$.time.ZoneId r2 = r5.mo138010U()
            r9.f107814b = r2
            goto L_0x0072
        L_0x0068:
            j$.time.ZoneId r3 = r5.mo138010U()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0077
        L_0x0072:
            j$.time.chrono.ChronoLocalDateTime r5 = r5.mo138006C()
            goto L_0x008d
        L_0x0077:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ChronoZonedDateTime must use the effective parsed zone: "
            r1.<init>(r2)
            j$.time.ZoneId r2 = r9.f107814b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            boolean r2 = r5 instanceof p073j$.time.chrono.ChronoLocalDateTime
            if (r2 == 0) goto L_0x00a4
            j$.time.chrono.ChronoLocalDateTime r5 = (p073j$.time.chrono.ChronoLocalDateTime) r5
            j$.time.LocalTime r2 = r5.mo137967l()
            j$.time.l r3 = p073j$.time.C42658l.f107930d
            r9.m172297t(r2, r3)
            j$.time.chrono.b r2 = r5.mo137969m()
            r9.m172298x(r2)
            goto L_0x00c8
        L_0x00a4:
            boolean r2 = r5 instanceof p073j$.time.chrono.C42594b
            if (r2 == 0) goto L_0x00ae
            j$.time.chrono.b r5 = (p073j$.time.chrono.C42594b) r5
            r9.m172298x(r5)
            goto L_0x00c8
        L_0x00ae:
            boolean r2 = r5 instanceof p073j$.time.LocalTime
            if (r2 == 0) goto L_0x00ba
            j$.time.LocalTime r5 = (p073j$.time.LocalTime) r5
            j$.time.l r2 = p073j$.time.C42658l.f107930d
            r9.m172297t(r5, r2)
            goto L_0x00c8
        L_0x00ba:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            boolean r4 = r10.containsKey(r4)
            if (r4 != 0) goto L_0x003d
        L_0x00c8:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x00cc:
            if (r0 == r2) goto L_0x00e2
            if (r0 <= 0) goto L_0x00ea
            r24.m172293p()
            j$.time.chrono.Chronology r0 = r9.f107815c
            j$.time.format.C r2 = r9.f107816d
            j$.time.chrono.b r0 = r0.mo138034T(r1, r2)
            r9.m172298x(r0)
            r24.m172296s()
            goto L_0x00ea
        L_0x00e2:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            j$.time.LocalTime r0 = r9.f107818f
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = 0
            if (r0 != 0) goto L_0x01c3
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.MILLI_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0139
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            j$.time.temporal.a r3 = p073j$.time.temporal.C42662a.MICRO_OF_SECOND
            boolean r4 = r10.containsKey(r3)
            if (r4 == 0) goto L_0x012e
            long r1 = r1 * r12
            java.lang.Object r4 = r10.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r4 % r12
            long r4 = r4 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r9.m172299y(r0, r3, r1)
            r10.remove(r3)
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            long r4 = r4 * r12
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            goto L_0x0135
        L_0x012e:
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            long r1 = r1 * r14
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0135:
            r10.put(r0, r1)
            goto L_0x0155
        L_0x0139:
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.MICRO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x0155
            java.lang.Object r0 = r10.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            long r0 = r0 * r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r2, r0)
        L_0x0155:
            j$.time.temporal.a r7 = p073j$.time.temporal.C42662a.HOUR_OF_DAY
            java.lang.Object r0 = r10.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01c3
            j$.time.temporal.a r8 = p073j$.time.temporal.C42662a.MINUTE_OF_HOUR
            java.lang.Object r1 = r10.get(r8)
            java.lang.Long r1 = (java.lang.Long) r1
            j$.time.temporal.a r5 = p073j$.time.temporal.C42662a.SECOND_OF_MINUTE
            java.lang.Object r2 = r10.get(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            j$.time.temporal.a r6 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            java.lang.Object r3 = r10.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x017d
            if (r2 != 0) goto L_0x0203
            if (r3 != 0) goto L_0x0203
        L_0x017d:
            if (r1 == 0) goto L_0x0185
            if (r2 != 0) goto L_0x0185
            if (r3 == 0) goto L_0x0185
            goto L_0x0203
        L_0x0185:
            if (r1 == 0) goto L_0x018c
            long r18 = r1.longValue()
            goto L_0x018e
        L_0x018c:
            r18 = r16
        L_0x018e:
            if (r2 == 0) goto L_0x0197
            long r1 = r2.longValue()
            r20 = r1
            goto L_0x0199
        L_0x0197:
            r20 = r16
        L_0x0199:
            if (r3 == 0) goto L_0x01a2
            long r1 = r3.longValue()
            r22 = r1
            goto L_0x01a4
        L_0x01a2:
            r22 = r16
        L_0x01a4:
            long r1 = r0.longValue()
            r0 = r24
            r3 = r18
            r11 = r5
            r14 = r6
            r5 = r20
            r15 = r7
            r12 = r8
            r7 = r22
            r0.m172295r(r1, r3, r5, r7)
            r10.remove(r15)
            r10.remove(r12)
            r10.remove(r11)
            r10.remove(r14)
        L_0x01c3:
            j$.time.format.C r0 = r9.f107816d
            j$.time.format.C r1 = p073j$.time.format.C42624C.LENIENT
            if (r0 == r1) goto L_0x0203
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0203
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01d7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0203
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.n r2 = (p073j$.time.temporal.C42675n) r2
            boolean r3 = r2 instanceof p073j$.time.temporal.C42662a
            if (r3 == 0) goto L_0x01d7
            boolean r3 = r2.mo138211K()
            if (r3 == 0) goto L_0x01d7
            j$.time.temporal.a r2 = (p073j$.time.temporal.C42662a) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.mo138215b0(r3)
            goto L_0x01d7
        L_0x0203:
            j$.time.chrono.b r0 = r9.f107817e
            if (r0 == 0) goto L_0x020a
            r9.m172292n(r0)
        L_0x020a:
            j$.time.LocalTime r0 = r9.f107818f
            if (r0 == 0) goto L_0x0226
            r9.m172292n(r0)
            j$.time.chrono.b r0 = r9.f107817e
            if (r0 == 0) goto L_0x0226
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0226
            j$.time.chrono.b r0 = r9.f107817e
            j$.time.LocalTime r1 = r9.f107818f
            j$.time.chrono.ChronoLocalDateTime r0 = r0.mo137918N(r1)
            r9.m172292n(r0)
        L_0x0226:
            j$.time.chrono.b r0 = r9.f107817e
            if (r0 == 0) goto L_0x0248
            j$.time.LocalTime r0 = r9.f107818f
            if (r0 == 0) goto L_0x0248
            j$.time.l r0 = r9.f107819g
            r0.getClass()
            j$.time.l r1 = p073j$.time.C42658l.f107930d
            if (r0 != r1) goto L_0x0239
            r11 = 1
            goto L_0x023a
        L_0x0239:
            r11 = 0
        L_0x023a:
            if (r11 != 0) goto L_0x0248
            j$.time.chrono.b r0 = r9.f107817e
            j$.time.l r2 = r9.f107819g
            j$.time.chrono.b r0 = r0.mo137914D(r2)
            r9.f107817e = r0
            r9.f107819g = r1
        L_0x0248:
            j$.time.LocalTime r0 = r9.f107818f
            if (r0 != 0) goto L_0x02a4
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.INSTANT_SECONDS
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0264
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.SECOND_OF_DAY
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0264
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.SECOND_OF_MINUTE
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x02a4
        L_0x0264:
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.NANO_OF_SECOND
            boolean r1 = r10.containsKey(r0)
            if (r1 == 0) goto L_0x028b
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.MICRO_OF_SECOND
            r3 = 1000(0x3e8, double:4.94E-321)
            long r3 = r0 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.put(r2, r3)
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.MILLI_OF_SECOND
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = r0 / r3
            goto L_0x029d
        L_0x028b:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r10.put(r0, r1)
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.MICRO_OF_SECOND
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r10.put(r0, r1)
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.MILLI_OF_SECOND
        L_0x029d:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r10.put(r2, r0)
        L_0x02a4:
            j$.time.chrono.b r0 = r9.f107817e
            if (r0 == 0) goto L_0x02e6
            j$.time.LocalTime r1 = r9.f107818f
            if (r1 == 0) goto L_0x02e6
            j$.time.ZoneId r2 = r9.f107814b
            if (r2 == 0) goto L_0x02bb
            j$.time.chrono.ChronoLocalDateTime r0 = r0.mo137918N(r1)
            j$.time.ZoneId r1 = r9.f107814b
            j$.time.chrono.ChronoZonedDateTime r0 = r0.mo137951J(r1)
            goto L_0x02d9
        L_0x02bb:
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            java.lang.Object r0 = r10.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x02e6
            int r0 = r0.intValue()
            j$.time.ZoneOffset r0 = p073j$.time.ZoneOffset.m171937L(r0)
            j$.time.chrono.b r1 = r9.f107817e
            j$.time.LocalTime r2 = r9.f107818f
            j$.time.chrono.ChronoLocalDateTime r1 = r1.mo137918N(r2)
            j$.time.chrono.ChronoZonedDateTime r0 = r1.mo137951J(r0)
        L_0x02d9:
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.INSTANT_SECONDS
            long r2 = r0.mo137886g(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r10.put(r1, r0)
        L_0x02e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42623B.mo138093o(j$.time.format.C, java.util.Set):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f107813a);
        sb.append(',');
        sb.append(this.f107815c);
        if (this.f107814b != null) {
            sb.append(',');
            sb.append(this.f107814b);
        }
        if (!(this.f107817e == null && this.f107818f == null)) {
            sb.append(" resolved to ");
            C42594b bVar = this.f107817e;
            if (bVar != null) {
                sb.append(bVar);
                if (this.f107818f != null) {
                    sb.append(C15369g.f37992r);
                }
            }
            sb.append(this.f107818f);
        }
        return sb.toString();
    }
}
