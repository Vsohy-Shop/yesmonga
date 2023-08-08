package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C12589a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

public final class JulianChronology extends BasicGJChronology {

    /* renamed from: A1 */
    public static final long f31032A1 = 2629800000L;

    /* renamed from: B1 */
    public static final int f31033B1 = -292269054;

    /* renamed from: C1 */
    public static final int f31034C1 = 292272992;

    /* renamed from: D1 */
    public static final JulianChronology f31035D1 = m52973Y0(DateTimeZone.f30651a);

    /* renamed from: E1 */
    public static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> f31036E1 = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -8731039522547897247L;

    /* renamed from: z1 */
    public static final long f31037z1 = 31557600000L;

    public JulianChronology(C12589a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* renamed from: W0 */
    public static int m52971W0(int i) {
        if (i > 0) {
            return i;
        }
        if (i != 0) {
            return i + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.m51322W(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
    }

    /* renamed from: X0 */
    public static JulianChronology m52972X0() {
        return m52974Z0(DateTimeZone.m51374n(), 4);
    }

    /* renamed from: Y0 */
    public static JulianChronology m52973Y0(DateTimeZone dateTimeZone) {
        return m52974Z0(dateTimeZone, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = new org.joda.time.chrono.JulianChronology[7];
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.chrono.JulianChronology m52974Z0(org.joda.time.DateTimeZone r5, int r6) {
        /*
            if (r5 != 0) goto L_0x0006
            org.joda.time.DateTimeZone r5 = org.joda.time.DateTimeZone.m51374n()
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.JulianChronology[]> r0 = f31036E1
            java.lang.Object r1 = r0.get(r5)
            org.joda.time.chrono.JulianChronology[] r1 = (org.joda.time.chrono.JulianChronology[]) r1
            if (r1 != 0) goto L_0x001c
            r1 = 7
            org.joda.time.chrono.JulianChronology[] r1 = new org.joda.time.chrono.JulianChronology[r1]
            java.lang.Object r0 = r0.putIfAbsent(r5, r1)
            org.joda.time.chrono.JulianChronology[] r0 = (org.joda.time.chrono.JulianChronology[]) r0
            if (r0 == 0) goto L_0x001c
            r1 = r0
        L_0x001c:
            int r0 = r6 + -1
            r2 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
            if (r2 != 0) goto L_0x0048
            monitor-enter(r1)
            r2 = r1[r0]     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0043
            org.joda.time.DateTimeZone r2 = org.joda.time.DateTimeZone.f30651a     // Catch:{ all -> 0x0045 }
            r3 = 0
            if (r5 != r2) goto L_0x0032
            org.joda.time.chrono.JulianChronology r5 = new org.joda.time.chrono.JulianChronology     // Catch:{ all -> 0x0045 }
            r5.<init>(r3, r3, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0040
        L_0x0032:
            org.joda.time.chrono.JulianChronology r2 = m52974Z0(r2, r6)     // Catch:{ all -> 0x0045 }
            org.joda.time.chrono.JulianChronology r4 = new org.joda.time.chrono.JulianChronology     // Catch:{ all -> 0x0045 }
            org.joda.time.chrono.ZonedChronology r5 = org.joda.time.chrono.ZonedChronology.m53047c0(r2, r5)     // Catch:{ all -> 0x0045 }
            r4.<init>(r5, r3, r6)     // Catch:{ all -> 0x0045 }
            r5 = r4
        L_0x0040:
            r1[r0] = r5     // Catch:{ all -> 0x0045 }
            r2 = r5
        L_0x0043:
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r5
        L_0x0048:
            return r2
        L_0x0049:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid min days in first week: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.JulianChronology.m52974Z0(org.joda.time.DateTimeZone, int):org.joda.time.chrono.JulianChronology");
    }

    /* renamed from: a1 */
    public static JulianChronology m52975a1() {
        return f31035D1;
    }

    private Object readResolve() {
        C12589a X = mo28850X();
        int F0 = mo28859F0();
        if (F0 == 0) {
            F0 = 4;
        }
        if (X == null) {
            return m52974Z0(DateTimeZone.f30651a, F0);
        }
        return m52974Z0(X.mo27836s(), F0);
    }

    /* renamed from: C0 */
    public int mo28856C0() {
        return f31034C1;
    }

    /* renamed from: E0 */
    public int mo28858E0() {
        return f31033B1;
    }

    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ int mo28859F0() {
        return super.mo28859F0();
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return f31035D1;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52973Y0(dateTimeZone);
    }

    /* renamed from: U0 */
    public boolean mo28874U0(int i) {
        return (i & 3) == 0;
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        if (mo28850X() == null) {
            super.mo28849W(aVar);
            aVar.f30908E = new SkipDateTimeField(this, aVar.f30908E);
            aVar.f30905B = new SkipDateTimeField(this, aVar.f30905B);
        }
    }

    /* renamed from: c0 */
    public long mo28876c0(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !mo28874U0(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    /* renamed from: d0 */
    public long mo28877d0() {
        return 31083663600000L;
    }

    /* renamed from: e0 */
    public long mo28878e0() {
        return f31032A1;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public long mo28880f0() {
        return 31557600000L;
    }

    /* renamed from: g0 */
    public long mo28881g0() {
        return 15778800000L;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k0 */
    public long mo28883k0(int i, int i2, int i3) throws IllegalArgumentException {
        return super.mo28883k0(m52971W0(i), i2, i3);
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
