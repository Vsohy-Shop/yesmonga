package p073j$.time.chrono;

import androidx.exifinterface.media.C19135a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073j$.time.C42585b;
import p073j$.time.C42586c;
import p073j$.time.C42659m;
import p073j$.time.Instant;
import p073j$.time.LocalDate;
import p073j$.time.LocalDateTime;
import p073j$.time.Month;
import p073j$.time.ZoneId;
import p073j$.time.ZonedDateTime;
import p073j$.time.format.C42624C;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.chrono.p */
public final class C42608p extends C42593a implements Serializable {

    /* renamed from: d */
    public static final C42608p f107789d = new C42608p();

    private C42608p() {
    }

    /* renamed from: B */
    public final C42594b mo138028B(int i, int i2) {
        return LocalDate.m171810Y(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo138057E(Map map, C42624C c) {
        C42662a aVar = C42662a.PROLEPTIC_MONTH;
        HashMap hashMap = (HashMap) map;
        Long l = (Long) hashMap.remove(aVar);
        if (l != null) {
            if (c != C42624C.LENIENT) {
                aVar.mo138215b0(l.longValue());
            }
            C42593a.m172061n(hashMap, C42662a.MONTH_OF_YEAR, Math.floorMod(l.longValue(), 12) + 1);
            C42593a.m172061n(hashMap, C42662a.YEAR, Math.floorDiv(l.longValue(), 12));
        }
    }

    /* renamed from: F */
    public final List mo138029F() {
        return Arrays.asList(C42609q.values());
    }

    /* renamed from: G */
    public final boolean mo138030G(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* renamed from: I */
    public final C42594b mo138031I(int i, int i2, int i3) {
        return LocalDate.m171813of(i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final C42594b mo138058K(Map map, C42624C c) {
        int i;
        C42662a aVar = C42662a.YEAR;
        int a0 = aVar.mo138214a0(((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (c == C42624C.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(C42662a.MONTH_OF_YEAR)).longValue(), 1);
            return LocalDate.m171813of(a0, 1, 1).plusMonths(subtractExact).mo137924b0(Math.subtractExact(((Long) map.remove(C42662a.DAY_OF_MONTH)).longValue(), 1));
        }
        C42662a aVar2 = C42662a.MONTH_OF_YEAR;
        int a02 = aVar2.mo138214a0(((Long) map.remove(aVar2)).longValue());
        C42662a aVar3 = C42662a.DAY_OF_MONTH;
        int a03 = aVar3.mo138214a0(((Long) map.remove(aVar3)).longValue());
        if (c == C42624C.SMART) {
            if (a02 == 4 || a02 == 6 || a02 == 9 || a02 == 11) {
                i = 30;
            } else if (a02 == 2) {
                Month month = Month.FEBRUARY;
                long j = (long) a0;
                int i2 = C42659m.f107934a;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                i = month.mo137991o(z);
            }
            a03 = Math.min(a03, i);
        }
        return LocalDate.m171813of(a0, a02, a03);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r11 > 0) goto L_0x005c;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073j$.time.chrono.C42594b mo138059L(java.util.Map r10, p073j$.time.format.C42624C r11) {
        /*
            r9 = this;
            j$.time.temporal.a r0 = p073j$.time.temporal.C42662a.YEAR_OF_ERA
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0099
            j$.time.format.C r2 = p073j$.time.format.C42624C.LENIENT
            if (r11 == r2) goto L_0x0017
            long r2 = r1.longValue()
            r0.mo138215b0(r2)
        L_0x0017:
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.ERA
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0060
            j$.time.temporal.a r2 = p073j$.time.temporal.C42662a.YEAR
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.C r8 = p073j$.time.format.C42624C.STRICT
            if (r11 != r8) goto L_0x0044
            if (r7 == 0) goto L_0x0040
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            long r0 = r1.longValue()
            if (r11 <= 0) goto L_0x0053
            goto L_0x005c
        L_0x0040:
            r10.put(r0, r1)
            goto L_0x00ae
        L_0x0044:
            if (r7 == 0) goto L_0x0058
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x004f
            goto L_0x0058
        L_0x004f:
            long r0 = r1.longValue()
        L_0x0053:
            long r0 = java.lang.Math.subtractExact(r5, r0)
            goto L_0x005c
        L_0x0058:
            long r0 = r1.longValue()
        L_0x005c:
            p073j$.time.chrono.C42593a.m172061n(r10, r2, r0)
            goto L_0x00ae
        L_0x0060:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006f
            j$.time.temporal.a r11 = p073j$.time.temporal.C42662a.YEAR
            long r0 = r1.longValue()
            goto L_0x0081
        L_0x006f:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0085
            j$.time.temporal.a r11 = p073j$.time.temporal.C42662a.YEAR
            long r0 = r1.longValue()
            long r0 = java.lang.Math.subtractExact(r5, r0)
        L_0x0081:
            p073j$.time.chrono.C42593a.m172061n(r10, r11, r0)
            goto L_0x00ae
        L_0x0085:
            j$.time.c r10 = new j$.time.c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid value for era: "
            r11.<init>(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0099:
            j$.time.temporal.a r11 = p073j$.time.temporal.C42662a.ERA
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.mo138215b0(r0)
        L_0x00ae:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.chrono.C42608p.mo138059L(java.util.Map, j$.time.format.C):j$.time.chrono.b");
    }

    /* renamed from: O */
    public final C42594b mo138032O() {
        return LocalDate.m171812o(LocalDate.m171808L(C42585b.m171974d()));
    }

    /* renamed from: Q */
    public final C42602j mo138033Q(int i) {
        if (i == 0) {
            return C42609q.BCE;
        }
        if (i == 1) {
            return C42609q.CE;
        }
        throw new C42586c("Invalid era: " + i);
    }

    /* renamed from: T */
    public final C42594b mo138034T(Map map, C42624C c) {
        return (LocalDate) super.mo138034T(map, c);
    }

    /* renamed from: V */
    public final String mo138035V() {
        return "iso8601";
    }

    /* renamed from: W */
    public final C42679r mo138036W(C42662a aVar) {
        return aVar.mo138210E();
    }

    /* renamed from: p */
    public final C42594b mo138037p(long j) {
        return LocalDate.m171809R(j);
    }

    /* renamed from: s */
    public final String mo138038s() {
        return C19135a.f49037r2;
    }

    /* renamed from: t */
    public final C42594b mo138039t(TemporalAccessor temporalAccessor) {
        return LocalDate.m171812o(temporalAccessor);
    }

    /* renamed from: x */
    public final int mo138040x(C42602j jVar, int i) {
        if (jVar instanceof C42609q) {
            return jVar == C42609q.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    /* renamed from: y */
    public final ChronoLocalDateTime mo138041y(LocalDateTime localDateTime) {
        return LocalDateTime.m171854o(localDateTime);
    }

    /* renamed from: z */
    public final ChronoZonedDateTime mo138042z(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.m171950o(instant, zoneId);
    }
}
