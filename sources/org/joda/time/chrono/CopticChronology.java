package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

public final class CopticChronology extends BasicFixedMonthChronology {

    /* renamed from: A1 */
    public static final int f30976A1 = 292272708;

    /* renamed from: B1 */
    public static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> f30977B1 = new ConcurrentHashMap<>();

    /* renamed from: C1 */
    public static final CopticChronology f30978C1 = m52819X0(DateTimeZone.f30651a);
    private static final long serialVersionUID = -5972804258688333942L;

    /* renamed from: x1 */
    public static final int f30979x1 = 1;

    /* renamed from: y1 */
    public static final C12599c f30980y1 = new C12610d("AM");

    /* renamed from: z1 */
    public static final int f30981z1 = -292269337;

    public CopticChronology(C12589a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* renamed from: W0 */
    public static CopticChronology m52818W0() {
        return m52820Y0(DateTimeZone.m51374n(), 4);
    }

    /* renamed from: X0 */
    public static CopticChronology m52819X0(DateTimeZone dateTimeZone) {
        return m52820Y0(dateTimeZone, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = new org.joda.time.chrono.CopticChronology[7];
     */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.chrono.CopticChronology m52820Y0(org.joda.time.DateTimeZone r13, int r14) {
        /*
            if (r13 != 0) goto L_0x0006
            org.joda.time.DateTimeZone r13 = org.joda.time.DateTimeZone.m51374n()
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.CopticChronology[]> r0 = f30977B1
            java.lang.Object r1 = r0.get(r13)
            org.joda.time.chrono.CopticChronology[] r1 = (org.joda.time.chrono.CopticChronology[]) r1
            if (r1 != 0) goto L_0x001c
            r1 = 7
            org.joda.time.chrono.CopticChronology[] r1 = new org.joda.time.chrono.CopticChronology[r1]
            java.lang.Object r0 = r0.putIfAbsent(r13, r1)
            org.joda.time.chrono.CopticChronology[] r0 = (org.joda.time.chrono.CopticChronology[]) r0
            if (r0 == 0) goto L_0x001c
            r1 = r0
        L_0x001c:
            int r0 = r14 + -1
            r2 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x005f }
            if (r2 != 0) goto L_0x005e
            monitor-enter(r1)
            r2 = r1[r0]     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0059
            org.joda.time.DateTimeZone r2 = org.joda.time.DateTimeZone.f30651a     // Catch:{ all -> 0x005b }
            r3 = 0
            if (r13 != r2) goto L_0x0049
            org.joda.time.chrono.CopticChronology r13 = new org.joda.time.chrono.CopticChronology     // Catch:{ all -> 0x005b }
            r13.<init>(r3, r3, r14)     // Catch:{ all -> 0x005b }
            org.joda.time.DateTime r2 = new org.joda.time.DateTime     // Catch:{ all -> 0x005b }
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r2
            r12 = r13
            r4.<init>((int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (int) r10, (int) r11, (org.joda.time.C12589a) r12)     // Catch:{ all -> 0x005b }
            org.joda.time.chrono.CopticChronology r4 = new org.joda.time.chrono.CopticChronology     // Catch:{ all -> 0x005b }
            org.joda.time.chrono.LimitChronology r13 = org.joda.time.chrono.LimitChronology.m52997d0(r13, r2, r3)     // Catch:{ all -> 0x005b }
            r4.<init>(r13, r3, r14)     // Catch:{ all -> 0x005b }
            goto L_0x0056
        L_0x0049:
            org.joda.time.chrono.CopticChronology r2 = m52820Y0(r2, r14)     // Catch:{ all -> 0x005b }
            org.joda.time.chrono.CopticChronology r4 = new org.joda.time.chrono.CopticChronology     // Catch:{ all -> 0x005b }
            org.joda.time.chrono.ZonedChronology r13 = org.joda.time.chrono.ZonedChronology.m53047c0(r2, r13)     // Catch:{ all -> 0x005b }
            r4.<init>(r13, r3, r14)     // Catch:{ all -> 0x005b }
        L_0x0056:
            r1[r0] = r4     // Catch:{ all -> 0x005b }
            r2 = r4
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005b }
            throw r13
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid min days in first week: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.CopticChronology.m52820Y0(org.joda.time.DateTimeZone, int):org.joda.time.chrono.CopticChronology");
    }

    /* renamed from: Z0 */
    public static CopticChronology m52821Z0() {
        return f30978C1;
    }

    private Object readResolve() {
        C12589a X = mo28850X();
        int F0 = mo28859F0();
        if (F0 == 0) {
            F0 = 4;
        }
        if (X == null) {
            return m52820Y0(DateTimeZone.f30651a, F0);
        }
        return m52820Y0(X.mo27836s(), F0);
    }

    /* renamed from: C0 */
    public int mo28856C0() {
        return f30976A1;
    }

    /* renamed from: E0 */
    public int mo28858E0() {
        return -292269337;
    }

    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ int mo28859F0() {
        return super.mo28859F0();
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return f30978C1;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52819X0(dateTimeZone);
    }

    /* renamed from: T0 */
    public boolean mo28873T0(long j) {
        return mo28641g().mo28828g(j) == 6 && mo28619E().mo28807J(j);
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        if (mo28850X() == null) {
            super.mo28849W(aVar);
            aVar.f30908E = new SkipDateTimeField(this, aVar.f30908E);
            aVar.f30905B = new SkipDateTimeField(this, aVar.f30905B);
            aVar.f30912I = f30980y1;
            C12609c cVar = new C12609c(this, 13);
            aVar.f30907D = cVar;
            aVar.f30921i = cVar.mo28841t();
        }
    }

    /* renamed from: c0 */
    public long mo28876c0(int i) {
        int i2;
        int i3 = i - 1687;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !mo28874U0(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) + 21859200000L;
    }

    /* renamed from: d0 */
    public long mo28877d0() {
        return 26607895200000L;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return super.mo28650p(i, i2, i3, i4);
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.mo28651q(i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: s */
    public /* bridge */ /* synthetic */ DateTimeZone mo27836s() {
        return super.mo27836s();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
