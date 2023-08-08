package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.C12598g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12633l;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class LocalTime extends C12598g implements C12714n, Serializable {

    /* renamed from: a */
    public static final LocalTime f30722a = new LocalTime(0, 0, 0, 0);

    /* renamed from: b */
    public static final int f30723b = 0;

    /* renamed from: c */
    public static final int f30724c = 1;

    /* renamed from: d */
    public static final int f30725d = 2;

    /* renamed from: e */
    public static final int f30726e = 3;

    /* renamed from: f */
    public static final Set<DurationFieldType> f30727f;
    private static final long serialVersionUID = -12873158713873L;
    private final C12589a iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;

        /* renamed from: a */
        public transient LocalTime f30728a;

        /* renamed from: b */
        public transient C12599c f30729b;

        public Property(LocalTime localTime, C12599c cVar) {
            this.f30728a = localTime;
            this.f30729b = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f30728a = (LocalTime) objectInputStream.readObject();
            this.f30729b = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.f30728a.mo27982m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f30728a);
            objectOutputStream.writeObject(this.f30729b.mo28806I());
        }

        /* renamed from: C */
        public LocalTime mo28161C(int i) {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28822a(localTime.mo27971f0(), i));
        }

        /* renamed from: D */
        public LocalTime mo28162D(long j) {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28823b(localTime.mo27971f0(), j));
        }

        /* renamed from: E */
        public LocalTime mo28163E(int i) {
            long a = this.f30729b.mo28822a(this.f30728a.mo27971f0(), i);
            if (((long) this.f30728a.mo27982m().mo28659z().mo28828g(a)) == a) {
                return this.f30728a.mo28144Y1(a);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        /* renamed from: F */
        public LocalTime mo28164F(int i) {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28825d(localTime.mo27971f0(), i));
        }

        /* renamed from: G */
        public LocalTime mo28165G() {
            return this.f30728a;
        }

        /* renamed from: H */
        public LocalTime mo28166H() {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28811N(localTime.mo27971f0()));
        }

        /* renamed from: I */
        public LocalTime mo28167I() {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28812O(localTime.mo27971f0()));
        }

        /* renamed from: J */
        public LocalTime mo28168J() {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28813P(localTime.mo27971f0()));
        }

        /* renamed from: K */
        public LocalTime mo28169K() {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28814Q(localTime.mo27971f0()));
        }

        /* renamed from: L */
        public LocalTime mo28170L() {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28815R(localTime.mo27971f0()));
        }

        /* renamed from: M */
        public LocalTime mo28171M(int i) {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28816S(localTime.mo27971f0(), i));
        }

        /* renamed from: N */
        public LocalTime mo28172N(String str) {
            return mo28173O(str, (Locale) null);
        }

        /* renamed from: O */
        public LocalTime mo28173O(String str, Locale locale) {
            LocalTime localTime = this.f30728a;
            return localTime.mo28144Y1(this.f30729b.mo28818U(localTime.mo27971f0(), str, locale));
        }

        /* renamed from: P */
        public LocalTime mo28174P() {
            return mo28171M(mo29063s());
        }

        /* renamed from: Q */
        public LocalTime mo28175Q() {
            return mo28171M(mo29066v());
        }

        /* renamed from: i */
        public C12589a mo27694i() {
            return this.f30728a.mo27982m();
        }

        /* renamed from: m */
        public C12599c mo27695m() {
            return this.f30729b;
        }

        /* renamed from: u */
        public long mo27696u() {
            return this.f30728a.mo27971f0();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f30727f = hashSet;
        hashSet.add(DurationFieldType.m51460i());
        hashSet.add(DurationFieldType.m51463l());
        hashSet.add(DurationFieldType.m51461j());
        hashSet.add(DurationFieldType.m51459g());
    }

    public LocalTime() {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52933a0());
    }

    /* renamed from: R0 */
    public static LocalTime m51751R0() {
        return new LocalTime();
    }

    /* renamed from: U0 */
    public static LocalTime m51752U0(C12589a aVar) {
        if (aVar != null) {
            return new LocalTime(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: c1 */
    public static LocalTime m51753c1(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: j1 */
    public static LocalTime m51754j1(String str) {
        return m51755k1(str, C12683i.m54183M());
    }

    /* renamed from: k1 */
    public static LocalTime m51755k1(String str, C12674b bVar) {
        return bVar.mo29255r(str);
    }

    /* renamed from: m0 */
    public static LocalTime m51756m0(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: n0 */
    public static LocalTime m51757n0(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: o0 */
    public static LocalTime m51758o0(long j) {
        return m51759p0(j, (C12589a) null);
    }

    /* renamed from: p0 */
    public static LocalTime m51759p0(long j, C12589a aVar) {
        return new LocalTime(j, C12641d.m53370e(aVar).mo27834Q());
    }

    private Object readResolve() {
        C12589a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalTime(this.iLocalMillis, (C12589a) ISOChronology.m52935c0());
        }
        if (!DateTimeZone.f30651a.equals(aVar.mo27836s())) {
            return new LocalTime(this.iLocalMillis, this.iChronology.mo27834Q());
        }
        return this;
    }

    /* renamed from: A0 */
    public Property mo28125A0() {
        return new Property(this, mo27982m().mo28659z());
    }

    /* renamed from: A1 */
    public LocalTime mo28126A1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28623I().mo28909b(mo27971f0(), i));
    }

    /* renamed from: B1 */
    public Property mo28127B1(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.mo27802F(mo27982m()));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    /* renamed from: C0 */
    public Property mo28128C0() {
        return new Property(this, mo27982m().mo28615A());
    }

    /* renamed from: F0 */
    public LocalTime mo28129F0(C12715o oVar) {
        return mo28151j2(oVar, -1);
    }

    /* renamed from: F1 */
    public Property mo28130F1() {
        return new Property(this, mo27982m().mo28622H());
    }

    /* renamed from: G1 */
    public DateTime mo28131G1() {
        return mo28133H1((DateTimeZone) null);
    }

    /* renamed from: H0 */
    public LocalTime mo28132H0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28657x().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: H1 */
    public DateTime mo28133H1(DateTimeZone dateTimeZone) {
        C12589a R = mo27982m().mo27835R(dateTimeZone);
        return new DateTime(R.mo28624J(this, C12641d.m53368c()), R);
    }

    /* renamed from: K */
    public boolean mo27949K(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !mo28157u0(dateTimeFieldType.mo27801E())) {
            return false;
        }
        DurationFieldType H = dateTimeFieldType.mo27804H();
        if (mo28157u0(H) || H == DurationFieldType.m51456b()) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public LocalTime mo28134K0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28658y().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: L0 */
    public LocalTime mo28135L0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28618D().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: L1 */
    public LocalTime mo28136L1(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return mo28144Y1(dateTimeFieldType.mo27802F(mo27982m()).mo28816S(mo27971f0(), i));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    /* renamed from: M1 */
    public LocalTime mo28137M1(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (!mo28157u0(durationFieldType)) {
            throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
        } else if (i == 0) {
            return this;
        } else {
            return mo28144Y1(durationFieldType.mo27877d(mo27982m()).mo28909b(mo27971f0(), i));
        }
    }

    /* renamed from: N0 */
    public LocalTime mo28138N0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28623I().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: O0 */
    public Property mo28139O0() {
        return new Property(this, mo27982m().mo28617C());
    }

    /* renamed from: S1 */
    public String mo28140S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: T */
    public int mo27959T(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return dateTimeFieldType.mo27802F(mo27982m()).mo28828g(mo27971f0());
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    /* renamed from: T1 */
    public LocalTime mo28141T1(C12714n nVar) {
        return nVar == null ? this : mo28144Y1(mo27982m().mo28624J(nVar, mo27971f0()));
    }

    /* renamed from: V1 */
    public int mo28142V1() {
        return mo27982m().mo28655v().mo28828g(mo27971f0());
    }

    /* renamed from: X1 */
    public LocalTime mo28143X1(int i) {
        return mo28144Y1(mo27982m().mo28655v().mo28816S(mo27971f0(), i));
    }

    /* renamed from: Y1 */
    public LocalTime mo28144Y1(long j) {
        return j == mo27971f0() ? this : new LocalTime(j, mo27982m());
    }

    /* renamed from: b */
    public int compareTo(C12714n nVar) {
        if (this == nVar) {
            return 0;
        }
        if (nVar instanceof LocalTime) {
            LocalTime localTime = (LocalTime) nVar;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localTime.iLocalMillis;
                if (j < j2) {
                    return -1;
                }
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
        }
        return super.compareTo(nVar);
    }

    /* renamed from: c2 */
    public LocalTime mo28145c2(int i) {
        return mo28144Y1(mo27982m().mo28659z().mo28816S(mo27971f0(), i));
    }

    /* renamed from: e1 */
    public int mo28146e1() {
        return mo27982m().mo28617C().mo28828g(mo27971f0());
    }

    /* renamed from: e2 */
    public LocalTime mo28147e2(int i) {
        return mo28144Y1(mo27982m().mo28615A().mo28816S(mo27971f0(), i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                if (this.iLocalMillis == localTime.iLocalMillis) {
                    return true;
                }
                return false;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public long mo27971f0() {
        return this.iLocalMillis;
    }

    /* renamed from: f2 */
    public int mo28148f2() {
        return mo27982m().mo28622H().mo28828g(mo27971f0());
    }

    /* renamed from: g */
    public C12599c mo27972g(int i, C12589a aVar) {
        if (i == 0) {
            return aVar.mo28655v();
        }
        if (i == 1) {
            return aVar.mo28617C();
        }
        if (i == 2) {
            return aVar.mo28622H();
        }
        if (i == 3) {
            return aVar.mo28615A();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getValue(int i) {
        if (i == 0) {
            return mo27982m().mo28655v().mo28828g(mo27971f0());
        }
        if (i == 1) {
            return mo27982m().mo28617C().mo28828g(mo27971f0());
        }
        if (i == 2) {
            return mo27982m().mo28622H().mo28828g(mo27971f0());
        }
        if (i == 3) {
            return mo27982m().mo28615A().mo28828g(mo27971f0());
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    /* renamed from: h1 */
    public int mo28149h1() {
        return mo27982m().mo28615A().mo28828g(mo27971f0());
    }

    /* renamed from: i2 */
    public LocalTime mo28150i2(int i) {
        return mo28144Y1(mo27982m().mo28617C().mo28816S(mo27971f0(), i));
    }

    /* renamed from: j2 */
    public LocalTime mo28151j2(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28636b(oVar, mo27971f0(), i));
    }

    /* renamed from: k2 */
    public LocalTime mo28152k2(int i) {
        return mo28144Y1(mo27982m().mo28622H().mo28816S(mo27971f0(), i));
    }

    /* renamed from: m */
    public C12589a mo27982m() {
        return this.iChronology;
    }

    /* renamed from: n1 */
    public LocalTime mo28153n1(C12715o oVar) {
        return mo28151j2(oVar, 1);
    }

    /* renamed from: p1 */
    public int mo28154p1() {
        return mo27982m().mo28659z().mo28828g(mo27971f0());
    }

    /* renamed from: q1 */
    public LocalTime mo28155q1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28657x().mo28909b(mo27971f0(), i));
    }

    public int size() {
        return 4;
    }

    /* renamed from: t0 */
    public Property mo28156t0() {
        return new Property(this, mo27982m().mo28655v());
    }

    @ToString
    public String toString() {
        return C12683i.m54189S().mo29260w(this);
    }

    /* renamed from: u0 */
    public boolean mo28157u0(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        C12646e d = durationFieldType.mo27877d(mo27982m());
        if (f30727f.contains(durationFieldType) || d.mo28947X() < mo27982m().mo28644j().mo28947X()) {
            return d.mo29037o0();
        }
        return false;
    }

    /* renamed from: w0 */
    public String mo28158w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    /* renamed from: w1 */
    public LocalTime mo28159w1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28658y().mo28909b(mo27971f0(), i));
    }

    /* renamed from: z1 */
    public LocalTime mo28160z1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28144Y1(mo27982m().mo28618D().mo28909b(mo27971f0(), i));
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalTime(C12589a aVar) {
        this(C12641d.m53368c(), aVar);
    }

    public LocalTime(long j) {
        this(j, (C12589a) ISOChronology.m52933a0());
    }

    public LocalTime(long j, DateTimeZone dateTimeZone) {
        this(j, (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalTime(long j, C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        long r = e.mo27836s().mo27825r(DateTimeZone.f30651a, j);
        C12589a Q = e.mo27834Q();
        this.iLocalMillis = (long) Q.mo28659z().mo28828g(r);
        this.iChronology = Q;
    }

    public LocalTime(Object obj) {
        this(obj, (C12589a) null);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28985b(obj, dateTimeZone));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54183M());
        this.iLocalMillis = Q.mo28652r(0, k[0], k[1], k[2], k[3]);
    }

    public LocalTime(Object obj, C12589a aVar) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28984a(obj, aVar));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54183M());
        this.iLocalMillis = Q.mo28652r(0, k[0], k[1], k[2], k[3]);
    }

    public LocalTime(int i, int i2) {
        this(i, i2, 0, 0, ISOChronology.m52935c0());
    }

    public LocalTime(int i, int i2, int i3) {
        this(i, i2, i3, 0, ISOChronology.m52935c0());
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ISOChronology.m52935c0());
    }

    public LocalTime(int i, int i2, int i3, int i4, C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        long r = Q.mo28652r(0, i, i2, i3, i4);
        this.iChronology = Q;
        this.iLocalMillis = r;
    }
}
