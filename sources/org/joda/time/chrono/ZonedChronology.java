package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDurationField;
import org.joda.time.field.C12649b;

public final class ZonedChronology extends AssembledChronology {

    /* renamed from: Z0 */
    public static final long f31046Z0 = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final C12646e iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(C12646e eVar, DateTimeZone dateTimeZone) {
            super(eVar.mo29034W());
            if (eVar.mo29037o0()) {
                this.iField = eVar;
                this.iTimeField = ZonedChronology.m53048e0(eVar);
                this.iZone = dateTimeZone;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: A0 */
        public final long mo28944A0(long j) {
            return this.iZone.mo27821e(j);
        }

        /* renamed from: C0 */
        public final int mo28945C0(long j) {
            int y = this.iZone.mo27833y(j);
            long j2 = (long) y;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return y;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        /* renamed from: F0 */
        public final int mo28946F0(long j) {
            int w = this.iZone.mo27830w(j);
            long j2 = (long) w;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return w;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        /* renamed from: M */
        public long mo28931M(long j, long j2) {
            return this.iField.mo28931M(j, mo28944A0(j2));
        }

        /* renamed from: X */
        public long mo28947X() {
            return this.iField.mo28947X();
        }

        /* renamed from: b */
        public long mo28909b(long j, int i) {
            int F0 = mo28946F0(j);
            long b = this.iField.mo28909b(j + ((long) F0), i);
            if (!this.iTimeField) {
                F0 = mo28945C0(b);
            }
            return b - ((long) F0);
        }

        /* renamed from: e0 */
        public int mo28932e0(long j, long j2) {
            return this.iField.mo28932e0(j, mo28944A0(j2));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            if (!this.iField.equals(zonedDurationField.iField) || !this.iZone.equals(zonedDurationField.iZone)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public long mo28910g(long j, long j2) {
            int F0 = mo28946F0(j);
            long g = this.iField.mo28910g(j + ((long) F0), j2);
            if (!this.iTimeField) {
                F0 = mo28945C0(g);
            }
            return g - ((long) F0);
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        /* renamed from: m0 */
        public long mo28933m0(long j, long j2) {
            return this.iField.mo28933m0(j, mo28944A0(j2));
        }

        /* renamed from: n0 */
        public boolean mo28950n0() {
            return this.iTimeField ? this.iField.mo28950n0() : this.iField.mo28950n0() && this.iZone.mo27812D();
        }

        /* renamed from: q */
        public int mo28911q(long j, long j2) {
            int i;
            int F0 = mo28946F0(j2);
            C12646e eVar = this.iField;
            if (this.iTimeField) {
                i = F0;
            } else {
                i = mo28946F0(j);
            }
            return eVar.mo28911q(j + ((long) i), j2 + ((long) F0));
        }

        /* renamed from: r */
        public long mo28912r(long j, long j2) {
            int i;
            int F0 = mo28946F0(j2);
            C12646e eVar = this.iField;
            if (this.iTimeField) {
                i = F0;
            } else {
                i = mo28946F0(j);
            }
            return eVar.mo28912r(j + ((long) i), j2 + ((long) F0));
        }

        /* renamed from: y */
        public long mo28934y(int i, long j) {
            return this.iField.mo28934y(i, mo28944A0(j));
        }
    }

    /* renamed from: org.joda.time.chrono.ZonedChronology$a */
    public static final class C12606a extends C12649b {

        /* renamed from: v */
        public static final long f31047v = -3968986277775529794L;

        /* renamed from: b */
        public final C12599c f31048b;

        /* renamed from: c */
        public final DateTimeZone f31049c;

        /* renamed from: d */
        public final C12646e f31050d;

        /* renamed from: e */
        public final boolean f31051e;

        /* renamed from: f */
        public final C12646e f31052f;

        /* renamed from: g */
        public final C12646e f31053g;

        public C12606a(C12599c cVar, DateTimeZone dateTimeZone, C12646e eVar, C12646e eVar2, C12646e eVar3) {
            super(cVar.mo28806I());
            if (cVar.mo28809L()) {
                this.f31048b = cVar;
                this.f31049c = dateTimeZone;
                this.f31050d = eVar;
                this.f31051e = ZonedChronology.m53048e0(eVar);
                this.f31052f = eVar2;
                this.f31053g = eVar3;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: A */
        public int mo28798A(C12714n nVar) {
            return this.f31048b.mo28798A(nVar);
        }

        /* renamed from: B */
        public int mo28799B(C12714n nVar, int[] iArr) {
            return this.f31048b.mo28799B(nVar, iArr);
        }

        /* renamed from: C */
        public int mo28800C() {
            return this.f31048b.mo28800C();
        }

        /* renamed from: D */
        public int mo28801D(long j) {
            return this.f31048b.mo28801D(this.f31049c.mo27821e(j));
        }

        /* renamed from: E */
        public int mo28802E(C12714n nVar) {
            return this.f31048b.mo28802E(nVar);
        }

        /* renamed from: F */
        public int mo28803F(C12714n nVar, int[] iArr) {
            return this.f31048b.mo28803F(nVar, iArr);
        }

        /* renamed from: H */
        public final C12646e mo28805H() {
            return this.f31052f;
        }

        /* renamed from: J */
        public boolean mo28807J(long j) {
            return this.f31048b.mo28807J(this.f31049c.mo27821e(j));
        }

        /* renamed from: K */
        public boolean mo28808K() {
            return this.f31048b.mo28808K();
        }

        /* renamed from: M */
        public long mo28810M(long j) {
            return this.f31048b.mo28810M(this.f31049c.mo27821e(j));
        }

        /* renamed from: N */
        public long mo28811N(long j) {
            if (this.f31051e) {
                long Z = (long) mo28951Z(j);
                return this.f31048b.mo28811N(j + Z) - Z;
            }
            return this.f31049c.mo27820c(this.f31048b.mo28811N(this.f31049c.mo27821e(j)), false, j);
        }

        /* renamed from: O */
        public long mo28812O(long j) {
            if (this.f31051e) {
                long Z = (long) mo28951Z(j);
                return this.f31048b.mo28812O(j + Z) - Z;
            }
            return this.f31049c.mo27820c(this.f31048b.mo28812O(this.f31049c.mo27821e(j)), false, j);
        }

        /* renamed from: S */
        public long mo28816S(long j, int i) {
            long S = this.f31048b.mo28816S(this.f31049c.mo27821e(j), i);
            long c = this.f31049c.mo27820c(S, false, j);
            if (mo28828g(c) == i) {
                return c;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(S, this.f31049c.mo27824q());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.f31048b.mo28806I(), Integer.valueOf(i), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        /* renamed from: U */
        public long mo28818U(long j, String str, Locale locale) {
            return this.f31049c.mo27820c(this.f31048b.mo28818U(this.f31049c.mo27821e(j), str, locale), false, j);
        }

        /* renamed from: Z */
        public final int mo28951Z(long j) {
            int w = this.f31049c.mo27830w(j);
            long j2 = (long) w;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return w;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        /* renamed from: a */
        public long mo28822a(long j, int i) {
            if (this.f31051e) {
                long Z = (long) mo28951Z(j);
                return this.f31048b.mo28822a(j + Z, i) - Z;
            }
            return this.f31049c.mo27820c(this.f31048b.mo28822a(this.f31049c.mo27821e(j), i), false, j);
        }

        /* renamed from: b */
        public long mo28823b(long j, long j2) {
            if (this.f31051e) {
                long Z = (long) mo28951Z(j);
                return this.f31048b.mo28823b(j + Z, j2) - Z;
            }
            return this.f31049c.mo27820c(this.f31048b.mo28823b(this.f31049c.mo27821e(j), j2), false, j);
        }

        /* renamed from: d */
        public long mo28825d(long j, int i) {
            if (this.f31051e) {
                long Z = (long) mo28951Z(j);
                return this.f31048b.mo28825d(j + Z, i) - Z;
            }
            return this.f31049c.mo27820c(this.f31048b.mo28825d(this.f31049c.mo27821e(j), i), false, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12606a)) {
                return false;
            }
            C12606a aVar = (C12606a) obj;
            if (!this.f31048b.equals(aVar.f31048b) || !this.f31049c.equals(aVar.f31049c) || !this.f31050d.equals(aVar.f31050d) || !this.f31052f.equals(aVar.f31052f)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public int mo28828g(long j) {
            return this.f31048b.mo28828g(this.f31049c.mo27821e(j));
        }

        /* renamed from: h */
        public String mo28829h(int i, Locale locale) {
            return this.f31048b.mo28829h(i, locale);
        }

        public int hashCode() {
            return this.f31048b.hashCode() ^ this.f31049c.hashCode();
        }

        /* renamed from: j */
        public String mo28831j(long j, Locale locale) {
            return this.f31048b.mo28831j(this.f31049c.mo27821e(j), locale);
        }

        /* renamed from: m */
        public String mo28834m(int i, Locale locale) {
            return this.f31048b.mo28834m(i, locale);
        }

        /* renamed from: o */
        public String mo28836o(long j, Locale locale) {
            return this.f31048b.mo28836o(this.f31049c.mo27821e(j), locale);
        }

        /* renamed from: r */
        public int mo28839r(long j, long j2) {
            int i;
            int Z = mo28951Z(j2);
            C12599c cVar = this.f31048b;
            if (this.f31051e) {
                i = Z;
            } else {
                i = mo28951Z(j);
            }
            return cVar.mo28839r(j + ((long) i), j2 + ((long) Z));
        }

        /* renamed from: s */
        public long mo28840s(long j, long j2) {
            int i;
            int Z = mo28951Z(j2);
            C12599c cVar = this.f31048b;
            if (this.f31051e) {
                i = Z;
            } else {
                i = mo28951Z(j);
            }
            return cVar.mo28840s(j + ((long) i), j2 + ((long) Z));
        }

        /* renamed from: t */
        public final C12646e mo28841t() {
            return this.f31050d;
        }

        /* renamed from: u */
        public int mo28843u(long j) {
            return this.f31048b.mo28843u(this.f31049c.mo27821e(j));
        }

        /* renamed from: v */
        public final C12646e mo28844v() {
            return this.f31053g;
        }

        /* renamed from: w */
        public int mo28845w(Locale locale) {
            return this.f31048b.mo28845w(locale);
        }

        /* renamed from: x */
        public int mo28846x(Locale locale) {
            return this.f31048b.mo28846x(locale);
        }

        /* renamed from: y */
        public int mo28847y() {
            return this.f31048b.mo28847y();
        }

        /* renamed from: z */
        public int mo28848z(long j) {
            return this.f31048b.mo28848z(this.f31049c.mo27821e(j));
        }
    }

    public ZonedChronology(C12589a aVar, DateTimeZone dateTimeZone) {
        super(aVar, dateTimeZone);
    }

    /* renamed from: c0 */
    public static ZonedChronology m53047c0(C12589a aVar, DateTimeZone dateTimeZone) {
        if (aVar != null) {
            C12589a Q = aVar.mo27834Q();
            if (Q == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (dateTimeZone != null) {
                return new ZonedChronology(Q, dateTimeZone);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        } else {
            throw new IllegalArgumentException("Must supply a chronology");
        }
    }

    /* renamed from: e0 */
    public static boolean m53048e0(C12646e eVar) {
        return eVar != null && eVar.mo28947X() < 43200000;
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return mo28850X();
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo28851Y()) {
            return this;
        }
        if (dateTimeZone == DateTimeZone.f30651a) {
            return mo28850X();
        }
        return new ZonedChronology(mo28850X(), dateTimeZone);
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f30924l = mo28940b0(aVar.f30924l, hashMap);
        aVar.f30923k = mo28940b0(aVar.f30923k, hashMap);
        aVar.f30922j = mo28940b0(aVar.f30922j, hashMap);
        aVar.f30921i = mo28940b0(aVar.f30921i, hashMap);
        aVar.f30920h = mo28940b0(aVar.f30920h, hashMap);
        aVar.f30919g = mo28940b0(aVar.f30919g, hashMap);
        aVar.f30918f = mo28940b0(aVar.f30918f, hashMap);
        aVar.f30917e = mo28940b0(aVar.f30917e, hashMap);
        aVar.f30916d = mo28940b0(aVar.f30916d, hashMap);
        aVar.f30915c = mo28940b0(aVar.f30915c, hashMap);
        aVar.f30914b = mo28940b0(aVar.f30914b, hashMap);
        aVar.f30913a = mo28940b0(aVar.f30913a, hashMap);
        aVar.f30908E = mo28939a0(aVar.f30908E, hashMap);
        aVar.f30909F = mo28939a0(aVar.f30909F, hashMap);
        aVar.f30910G = mo28939a0(aVar.f30910G, hashMap);
        aVar.f30911H = mo28939a0(aVar.f30911H, hashMap);
        aVar.f30912I = mo28939a0(aVar.f30912I, hashMap);
        aVar.f30936x = mo28939a0(aVar.f30936x, hashMap);
        aVar.f30937y = mo28939a0(aVar.f30937y, hashMap);
        aVar.f30938z = mo28939a0(aVar.f30938z, hashMap);
        aVar.f30907D = mo28939a0(aVar.f30907D, hashMap);
        aVar.f30904A = mo28939a0(aVar.f30904A, hashMap);
        aVar.f30905B = mo28939a0(aVar.f30905B, hashMap);
        aVar.f30906C = mo28939a0(aVar.f30906C, hashMap);
        aVar.f30925m = mo28939a0(aVar.f30925m, hashMap);
        aVar.f30926n = mo28939a0(aVar.f30926n, hashMap);
        aVar.f30927o = mo28939a0(aVar.f30927o, hashMap);
        aVar.f30928p = mo28939a0(aVar.f30928p, hashMap);
        aVar.f30929q = mo28939a0(aVar.f30929q, hashMap);
        aVar.f30930r = mo28939a0(aVar.f30930r, hashMap);
        aVar.f30931s = mo28939a0(aVar.f30931s, hashMap);
        aVar.f30933u = mo28939a0(aVar.f30933u, hashMap);
        aVar.f30932t = mo28939a0(aVar.f30932t, hashMap);
        aVar.f30934v = mo28939a0(aVar.f30934v, hashMap);
        aVar.f30935w = mo28939a0(aVar.f30935w, hashMap);
    }

    /* renamed from: a0 */
    public final C12599c mo28939a0(C12599c cVar, HashMap<Object, Object> hashMap) {
        if (cVar == null || !cVar.mo28809L()) {
            return cVar;
        }
        if (hashMap.containsKey(cVar)) {
            return (C12599c) hashMap.get(cVar);
        }
        C12606a aVar = new C12606a(cVar, mo27836s(), mo28940b0(cVar.mo28841t(), hashMap), mo28940b0(cVar.mo28805H(), hashMap), mo28940b0(cVar.mo28844v(), hashMap));
        hashMap.put(cVar, aVar);
        return aVar;
    }

    /* renamed from: b0 */
    public final C12646e mo28940b0(C12646e eVar, HashMap<Object, Object> hashMap) {
        if (eVar == null || !eVar.mo29037o0()) {
            return eVar;
        }
        if (hashMap.containsKey(eVar)) {
            return (C12646e) hashMap.get(eVar);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(eVar, mo27836s());
        hashMap.put(eVar, zonedDurationField);
        return zonedDurationField;
    }

    /* renamed from: d0 */
    public final long mo28941d0(long j) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone s = mo27836s();
        int y = s.mo27833y(j);
        long j2 = j - ((long) y);
        if (j > 604800000 && j2 < 0) {
            return Long.MAX_VALUE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (y == s.mo27830w(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j, s.mo27824q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        if (!mo28850X().equals(zonedChronology.mo28850X()) || !mo27836s().equals(zonedChronology.mo27836s())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo27836s().hashCode() * 11) + 326565 + (mo28850X().hashCode() * 7);
    }

    /* renamed from: p */
    public long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo28941d0(mo28850X().mo28650p(i, i2, i3, i4));
    }

    /* renamed from: q */
    public long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return mo28941d0(mo28850X().mo28651q(i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: r */
    public long mo28652r(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return mo28941d0(mo28850X().mo28652r(((long) mo27836s().mo27830w(j)) + j, i, i2, i3, i4));
    }

    /* renamed from: s */
    public DateTimeZone mo27836s() {
        return (DateTimeZone) mo28851Y();
    }

    public String toString() {
        return "ZonedChronology[" + mo28850X() + ", " + mo27836s().mo27824q() + C12361b.f30261l;
    }
}
