package org.joda.time.chrono;

import com.urbanairship.AirshipConfigOptions;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C12651d;
import org.joda.time.field.C12652e;
import org.joda.time.field.C12653f;
import org.joda.time.field.C12654g;
import org.joda.time.field.C12656i;
import org.joda.time.field.C12657j;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

abstract class BasicChronology extends AssembledChronology {

    /* renamed from: a1 */
    public static final C12646e f30939a1;

    /* renamed from: b1 */
    public static final C12646e f30940b1;

    /* renamed from: c1 */
    public static final C12646e f30941c1;

    /* renamed from: d1 */
    public static final C12646e f30942d1;

    /* renamed from: e1 */
    public static final C12646e f30943e1;

    /* renamed from: f1 */
    public static final C12646e f30944f1;

    /* renamed from: g1 */
    public static final C12646e f30945g1 = new PreciseDurationField(DurationFieldType.m51464m(), 604800000);

    /* renamed from: h1 */
    public static final C12599c f30946h1;

    /* renamed from: i1 */
    public static final C12599c f30947i1;

    /* renamed from: j1 */
    public static final C12599c f30948j1;

    /* renamed from: k1 */
    public static final C12599c f30949k1;

    /* renamed from: l1 */
    public static final C12599c f30950l1;

    /* renamed from: m1 */
    public static final C12599c f30951m1;

    /* renamed from: n1 */
    public static final C12599c f30952n1;

    /* renamed from: o1 */
    public static final C12599c f30953o1;

    /* renamed from: p1 */
    public static final C12599c f30954p1;

    /* renamed from: q1 */
    public static final C12599c f30955q1;

    /* renamed from: r1 */
    public static final C12599c f30956r1 = new C12601a();

    /* renamed from: s1 */
    public static final int f30957s1 = 1024;
    private static final long serialVersionUID = 8283225332206808863L;

    /* renamed from: t1 */
    public static final int f30958t1 = 1023;

    /* renamed from: Z0 */
    public final transient C12602b[] f30959Z0 = new C12602b[1024];
    private final int iMinDaysInFirstWeek;

    /* renamed from: org.joda.time.chrono.BasicChronology$a */
    public static class C12601a extends C12654g {

        /* renamed from: v */
        public static final long f30960v = 581601443656929254L;

        public C12601a() {
            super(DateTimeFieldType.m51309I(), BasicChronology.f30943e1, BasicChronology.f30944f1);
        }

        /* renamed from: U */
        public long mo28818U(long j, String str, Locale locale) {
            return mo28816S(j, C12617k.m53222h(locale).mo28977o(str));
        }

        /* renamed from: m */
        public String mo28834m(int i, Locale locale) {
            return C12617k.m53222h(locale).mo28978p(i);
        }

        /* renamed from: x */
        public int mo28846x(Locale locale) {
            return C12617k.m53222h(locale).mo28974l();
        }
    }

    /* renamed from: org.joda.time.chrono.BasicChronology$b */
    public static class C12602b {

        /* renamed from: a */
        public final int f30961a;

        /* renamed from: b */
        public final long f30962b;

        public C12602b(int i, long j) {
            this.f30961a = i;
            this.f30962b = j;
        }
    }

    static {
        C12646e eVar = MillisDurationField.f31128a;
        f30939a1 = eVar;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.m51463l(), 1000);
        f30940b1 = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.m51461j(), AirshipConfigOptions.f87111Y);
        f30941c1 = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.m51459g(), 3600000);
        f30942d1 = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.m51458f(), 43200000);
        f30943e1 = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.m51456b(), 86400000);
        f30944f1 = preciseDurationField5;
        f30946h1 = new C12654g(DateTimeFieldType.m51313N(), eVar, preciseDurationField);
        f30947i1 = new C12654g(DateTimeFieldType.m51312M(), eVar, preciseDurationField5);
        f30948j1 = new C12654g(DateTimeFieldType.m51318S(), preciseDurationField, preciseDurationField2);
        f30949k1 = new C12654g(DateTimeFieldType.m51317R(), preciseDurationField, preciseDurationField5);
        f30950l1 = new C12654g(DateTimeFieldType.m51315P(), preciseDurationField2, preciseDurationField3);
        f30951m1 = new C12654g(DateTimeFieldType.m51314O(), preciseDurationField2, preciseDurationField5);
        C12654g gVar = new C12654g(DateTimeFieldType.m51310J(), preciseDurationField3, preciseDurationField5);
        f30952n1 = gVar;
        C12654g gVar2 = new C12654g(DateTimeFieldType.m51311K(), preciseDurationField3, preciseDurationField4);
        f30953o1 = gVar2;
        f30954p1 = new C12657j(gVar, DateTimeFieldType.m51349y());
        f30955q1 = new C12657j(gVar2, DateTimeFieldType.m51350z());
    }

    public BasicChronology(C12589a aVar, Object obj, int i) {
        super(aVar, obj);
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
        this.iMinDaysInFirstWeek = i;
    }

    /* renamed from: A0 */
    public int mo28854A0() {
        return 12;
    }

    /* renamed from: B0 */
    public int mo28855B0(int i) {
        return mo28854A0();
    }

    /* renamed from: C0 */
    public abstract int mo28856C0();

    /* renamed from: D0 */
    public int mo28857D0(long j) {
        if (j >= 0) {
            return (int) (j % 86400000);
        }
        return ((int) ((j + 1) % 86400000)) + DateTimeZone.f30652b;
    }

    /* renamed from: E0 */
    public abstract int mo28858E0();

    /* renamed from: F0 */
    public int mo28859F0() {
        return this.iMinDaysInFirstWeek;
    }

    /* renamed from: G0 */
    public int mo28860G0(long j) {
        return mo28861H0(j, mo28867N0(j));
    }

    /* renamed from: H0 */
    public abstract int mo28861H0(long j, int i);

    /* renamed from: I0 */
    public abstract long mo28862I0(int i, int i2);

    /* renamed from: J0 */
    public int mo28863J0(long j) {
        return mo28864K0(j, mo28867N0(j));
    }

    /* renamed from: K0 */
    public int mo28864K0(long j, int i) {
        long z0 = mo28898z0(i);
        if (j < z0) {
            return mo28865L0(i - 1);
        }
        if (j >= mo28898z0(i + 1)) {
            return 1;
        }
        return ((int) ((j - z0) / 604800000)) + 1;
    }

    /* renamed from: L0 */
    public int mo28865L0(int i) {
        return (int) ((mo28898z0(i + 1) - mo28898z0(i)) / 604800000);
    }

    /* renamed from: M0 */
    public int mo28866M0(long j) {
        int N0 = mo28867N0(j);
        int K0 = mo28864K0(j, N0);
        if (K0 == 1) {
            return mo28867N0(j + 604800000);
        }
        if (K0 > 51) {
            return mo28867N0(j - 1209600000);
        }
        return N0;
    }

    /* renamed from: N0 */
    public int mo28867N0(long j) {
        long g0 = mo28881g0();
        long d0 = (j >> 1) + mo28877d0();
        if (d0 < 0) {
            d0 = (d0 - g0) + 1;
        }
        int i = (int) (d0 / g0);
        long Q0 = mo28870Q0(i);
        long j2 = j - Q0;
        if (j2 < 0) {
            return i - 1;
        }
        long j3 = 31536000000L;
        if (j2 < 31536000000L) {
            return i;
        }
        if (mo28874U0(i)) {
            j3 = 31622400000L;
        }
        if (Q0 + j3 <= j) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: O0 */
    public abstract long mo28868O0(long j, long j2);

    /* renamed from: P0 */
    public final C12602b mo28869P0(int i) {
        int i2 = i & 1023;
        C12602b bVar = this.f30959Z0[i2];
        if (bVar != null && bVar.f30961a == i) {
            return bVar;
        }
        C12602b bVar2 = new C12602b(i, mo28876c0(i));
        this.f30959Z0[i2] = bVar2;
        return bVar2;
    }

    /* renamed from: Q0 */
    public long mo28870Q0(int i) {
        return mo28869P0(i).f30962b;
    }

    /* renamed from: R0 */
    public long mo28871R0(int i, int i2, int i3) {
        return mo28870Q0(i) + mo28862I0(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    /* renamed from: S0 */
    public long mo28872S0(int i, int i2) {
        return mo28870Q0(i) + mo28862I0(i, i2);
    }

    /* renamed from: T0 */
    public boolean mo28873T0(long j) {
        return false;
    }

    /* renamed from: U0 */
    public abstract boolean mo28874U0(int i);

    /* renamed from: V0 */
    public abstract long mo28875V0(long j, int i);

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        aVar.f30913a = f30939a1;
        aVar.f30914b = f30940b1;
        aVar.f30915c = f30941c1;
        aVar.f30916d = f30942d1;
        aVar.f30917e = f30943e1;
        aVar.f30918f = f30944f1;
        aVar.f30919g = f30945g1;
        aVar.f30925m = f30946h1;
        aVar.f30926n = f30947i1;
        aVar.f30927o = f30948j1;
        aVar.f30928p = f30949k1;
        aVar.f30929q = f30950l1;
        aVar.f30930r = f30951m1;
        aVar.f30931s = f30952n1;
        aVar.f30933u = f30953o1;
        aVar.f30932t = f30954p1;
        aVar.f30934v = f30955q1;
        aVar.f30935w = f30956r1;
        C12613g gVar = new C12613g(this);
        aVar.f30908E = gVar;
        C12619m mVar = new C12619m(gVar, this);
        aVar.f30909F = mVar;
        C12651d dVar = new C12651d((C12599c) new C12653f(mVar, 99), DateTimeFieldType.m51348x(), 100);
        aVar.f30911H = dVar;
        aVar.f30923k = dVar.mo28841t();
        aVar.f30910G = new C12653f(new C12656i((C12651d) aVar.f30911H), DateTimeFieldType.m51323X(), 1);
        aVar.f30912I = new C12616j(this);
        aVar.f30936x = new C12615i(this, aVar.f30918f);
        aVar.f30937y = new C12607a(this, aVar.f30918f);
        aVar.f30938z = new C12608b(this, aVar.f30918f);
        aVar.f30907D = new C12618l(this);
        aVar.f30905B = new C12612f(this);
        aVar.f30904A = new C12611e(this, aVar.f30919g);
        aVar.f30906C = new C12653f(new C12656i(aVar.f30905B, aVar.f30923k, DateTimeFieldType.m51321V(), 100), DateTimeFieldType.m51321V(), 1);
        aVar.f30922j = aVar.f30908E.mo28841t();
        aVar.f30921i = aVar.f30907D.mo28841t();
        aVar.f30920h = aVar.f30905B.mo28841t();
    }

    /* renamed from: c0 */
    public abstract long mo28876c0(int i);

    /* renamed from: d0 */
    public abstract long mo28877d0();

    /* renamed from: e0 */
    public abstract long mo28878e0();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        if (mo28859F0() != basicChronology.mo28859F0() || !mo27836s().equals(basicChronology.mo27836s())) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public abstract long mo28880f0();

    /* renamed from: g0 */
    public abstract long mo28881g0();

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + mo27836s().hashCode() + mo28859F0();
    }

    /* renamed from: k0 */
    public long mo28883k0(int i, int i2, int i3) {
        C12652e.m53807q(DateTimeFieldType.m51322W(), i, mo28858E0() - 1, mo28856C0() + 1);
        C12652e.m53807q(DateTimeFieldType.m51316Q(), i2, 1, mo28855B0(i));
        int y0 = mo28897y0(i, i2);
        if (i3 < 1 || i3 > y0) {
            DateTimeFieldType A = DateTimeFieldType.m51305A();
            Integer valueOf = Integer.valueOf(i3);
            Integer valueOf2 = Integer.valueOf(y0);
            throw new IllegalFieldValueException(A, valueOf, 1, valueOf2, "year: " + i + " month: " + i2);
        }
        long R0 = mo28871R0(i, i2, i3);
        int i4 = (R0 > 0 ? 1 : (R0 == 0 ? 0 : -1));
        if (i4 < 0 && i == mo28856C0() + 1) {
            return Long.MAX_VALUE;
        }
        if (i4 <= 0 || i != mo28858E0() - 1) {
            return R0;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: l0 */
    public final long mo28884l0(int i, int i2, int i3, int i4) {
        long k0 = mo28883k0(i, i2, i3);
        if (k0 == Long.MIN_VALUE) {
            k0 = mo28883k0(i, i2, i3 + 1);
            i4 -= 86400000;
        }
        long j = ((long) i4) + k0;
        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i5 < 0 && k0 > 0) {
            return Long.MAX_VALUE;
        }
        if (i5 <= 0 || k0 >= 0) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: m0 */
    public int mo28885m0(long j) {
        int N0 = mo28867N0(j);
        return mo28887o0(j, N0, mo28861H0(j, N0));
    }

    /* renamed from: n0 */
    public int mo28886n0(long j, int i) {
        return mo28887o0(j, i, mo28861H0(j, i));
    }

    /* renamed from: o0 */
    public int mo28887o0(long j, int i, int i2) {
        return ((int) ((j - (mo28870Q0(i) + mo28862I0(i, i2))) / 86400000)) + 1;
    }

    /* renamed from: p */
    public long mo28650p(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo28650p(i, i2, i3, i4);
        }
        C12652e.m53807q(DateTimeFieldType.m51312M(), i4, 0, DateTimeZone.f30652b);
        return mo28884l0(i, i2, i3, i4);
    }

    /* renamed from: p0 */
    public int mo28888p0(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* renamed from: q */
    public long mo28651q(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo28651q(i, i2, i3, i4, i5, i6, i7);
        }
        C12652e.m53807q(DateTimeFieldType.m51310J(), i4, 0, 23);
        C12652e.m53807q(DateTimeFieldType.m51315P(), i5, 0, 59);
        C12652e.m53807q(DateTimeFieldType.m51318S(), i6, 0, 59);
        C12652e.m53807q(DateTimeFieldType.m51313N(), i7, 0, 999);
        return mo28884l0(i, i2, i3, (int) ((long) ((i4 * 3600000) + (i5 * 60000) + (i6 * 1000) + i7)));
    }

    /* renamed from: q0 */
    public int mo28889q0(long j) {
        return mo28890r0(j, mo28867N0(j));
    }

    /* renamed from: r0 */
    public int mo28890r0(long j, int i) {
        return ((int) ((j - mo28870Q0(i)) / 86400000)) + 1;
    }

    /* renamed from: s */
    public DateTimeZone mo27836s() {
        C12589a X = mo28850X();
        if (X != null) {
            return X.mo27836s();
        }
        return DateTimeZone.f30651a;
    }

    /* renamed from: s0 */
    public int mo28891s0() {
        return 31;
    }

    /* renamed from: t0 */
    public abstract int mo28892t0(int i);

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append(C12361b.f30260k);
        DateTimeZone s = mo27836s();
        if (s != null) {
            sb.append(s.mo27824q());
        }
        if (mo28859F0() != 4) {
            sb.append(",mdfw=");
            sb.append(mo28859F0());
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    /* renamed from: u0 */
    public int mo28893u0(long j) {
        int N0 = mo28867N0(j);
        return mo28897y0(N0, mo28861H0(j, N0));
    }

    /* renamed from: v0 */
    public int mo28894v0(long j, int i) {
        return mo28893u0(j);
    }

    /* renamed from: w0 */
    public int mo28895w0(int i) {
        return mo28874U0(i) ? 366 : 365;
    }

    /* renamed from: x0 */
    public int mo28896x0() {
        return 366;
    }

    /* renamed from: y0 */
    public abstract int mo28897y0(int i, int i2);

    /* renamed from: z0 */
    public long mo28898z0(int i) {
        long Q0 = mo28870Q0(i);
        int p0 = mo28888p0(Q0);
        if (p0 > 8 - this.iMinDaysInFirstWeek) {
            return Q0 + (((long) (8 - p0)) * 86400000);
        }
        return Q0 - (((long) (p0 - 1)) * 86400000);
    }
}
