package p073j$.time.format;

import java.util.Locale;
import p073j$.time.C42586c;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.y */
final class C42651y {

    /* renamed from: a */
    private TemporalAccessor f107918a;

    /* renamed from: b */
    private DateTimeFormatter f107919b;

    /* renamed from: c */
    private int f107920c;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C42651y(p073j$.time.temporal.TemporalAccessor r10, p073j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.Chronology r0 = r11.mo138096b()
            j$.time.ZoneId r1 = r11.mo138099e()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x00fb
        L_0x0011:
            j$.time.temporal.m r2 = p073j$.time.temporal.C42676o.m172516a()
            java.lang.Object r2 = r10.mo137883c(r2)
            j$.time.chrono.Chronology r2 = (p073j$.time.chrono.Chronology) r2
            j$.time.temporal.m r3 = p073j$.time.temporal.C42676o.m172522g()
            java.lang.Object r3 = r10.mo137883c(r3)
            j$.time.ZoneId r3 = (p073j$.time.ZoneId) r3
            boolean r4 = java.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            r0 = r5
        L_0x002d:
            boolean r4 = java.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L_0x0034
            r1 = r5
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            goto L_0x00fb
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r4 = r0
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x00a7
            j$.time.temporal.a r6 = p073j$.time.temporal.C42662a.INSTANT_SECONDS
            boolean r6 = r10.mo137885f(r6)
            if (r6 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            j$.time.chrono.p r4 = p073j$.time.chrono.C42608p.f107789d
        L_0x004e:
            j$.time.Instant r10 = p073j$.time.Instant.from(r10)
            j$.time.chrono.ChronoZonedDateTime r10 = r4.mo138042z(r10, r1)
            goto L_0x00fb
        L_0x0058:
            j$.time.zone.c r6 = r1.mo138001n()     // Catch:{ d -> 0x0069 }
            boolean r7 = r6.mo138256i()     // Catch:{ d -> 0x0069 }
            if (r7 == 0) goto L_0x0069
            j$.time.Instant r7 = p073j$.time.Instant.f107716c     // Catch:{ d -> 0x0069 }
            j$.time.ZoneOffset r6 = r6.mo138250d(r7)     // Catch:{ d -> 0x0069 }
            goto L_0x006a
        L_0x0069:
            r6 = r1
        L_0x006a:
            boolean r6 = r6 instanceof p073j$.time.ZoneOffset
            if (r6 == 0) goto L_0x00a7
            j$.time.temporal.a r6 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            boolean r7 = r10.mo137885f(r6)
            if (r7 == 0) goto L_0x00a7
            int r6 = r10.mo137890j(r6)
            j$.time.zone.c r7 = r1.mo138001n()
            j$.time.Instant r8 = p073j$.time.Instant.f107716c
            j$.time.ZoneOffset r7 = r7.mo138250d(r8)
            int r7 = r7.mo138005q()
            if (r6 != r7) goto L_0x008b
            goto L_0x00a7
        L_0x008b:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override zone '"
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x00a7:
            if (r1 == 0) goto L_0x00aa
            r3 = r1
        L_0x00aa:
            if (r0 == 0) goto L_0x00f5
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.EPOCH_DAY
            boolean r1 = r10.mo137885f(r1)
            if (r1 == 0) goto L_0x00b9
            j$.time.chrono.b r5 = r4.mo138039t(r10)
            goto L_0x00f5
        L_0x00b9:
            j$.time.chrono.p r1 = p073j$.time.chrono.C42608p.f107789d
            if (r0 != r1) goto L_0x00bf
            if (r2 == 0) goto L_0x00f5
        L_0x00bf:
            j$.time.temporal.a[] r1 = p073j$.time.temporal.C42662a.values()
            int r2 = r1.length
            r6 = 0
        L_0x00c5:
            if (r6 >= r2) goto L_0x00f5
            r7 = r1[r6]
            boolean r8 = r7.mo138216n()
            if (r8 == 0) goto L_0x00f2
            boolean r7 = r10.mo137885f(r7)
            if (r7 != 0) goto L_0x00d6
            goto L_0x00f2
        L_0x00d6:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00f2:
            int r6 = r6 + 1
            goto L_0x00c5
        L_0x00f5:
            j$.time.format.x r0 = new j$.time.format.x
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x00fb:
            r9.f107918a = r10
            r9.f107919b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42651y.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo138181a() {
        this.f107920c--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final DecimalStyle mo138182b() {
        return this.f107919b.mo138097c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale mo138183c() {
        return this.f107919b.mo138098d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final TemporalAccessor mo138184d() {
        return this.f107918a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long mo138185e(C42675n nVar) {
        try {
            return Long.valueOf(this.f107918a.mo137886g(nVar));
        } catch (C42586c e) {
            if (this.f107920c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object mo138186f(TemporalQuery temporalQuery) {
        Object c = this.f107918a.mo137883c(temporalQuery);
        if (c != null || this.f107920c != 0) {
            return c;
        }
        throw new C42586c("Unable to extract value: " + this.f107918a.getClass());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo138187g() {
        this.f107920c++;
    }

    public final String toString() {
        return this.f107918a.toString();
    }
}
