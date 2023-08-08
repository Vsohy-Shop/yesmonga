package org.joda.time;

import com.urbanairship.AirshipConfigOptions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
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

public final class LocalDateTime extends C12598g implements C12714n, Serializable {

    /* renamed from: a */
    public static final int f30716a = 0;

    /* renamed from: b */
    public static final int f30717b = 1;

    /* renamed from: c */
    public static final int f30718c = 2;

    /* renamed from: d */
    public static final int f30719d = 3;
    private static final long serialVersionUID = -268716875315837168L;
    private final C12589a iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -358138762846288L;

        /* renamed from: a */
        public transient LocalDateTime f30720a;

        /* renamed from: b */
        public transient C12599c f30721b;

        public Property(LocalDateTime localDateTime, C12599c cVar) {
            this.f30720a = localDateTime;
            this.f30721b = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f30720a = (LocalDateTime) objectInputStream.readObject();
            this.f30721b = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.f30720a.mo27982m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f30720a);
            objectOutputStream.writeObject(this.f30721b.mo28806I());
        }

        /* renamed from: C */
        public LocalDateTime mo28111C(int i) {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28822a(localDateTime.mo27971f0(), i));
        }

        /* renamed from: D */
        public LocalDateTime mo28112D(long j) {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28823b(localDateTime.mo27971f0(), j));
        }

        /* renamed from: E */
        public LocalDateTime mo28113E(int i) {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28825d(localDateTime.mo27971f0(), i));
        }

        /* renamed from: F */
        public LocalDateTime mo28114F() {
            return this.f30720a;
        }

        /* renamed from: G */
        public LocalDateTime mo28115G() {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28811N(localDateTime.mo27971f0()));
        }

        /* renamed from: H */
        public LocalDateTime mo28116H() {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28812O(localDateTime.mo27971f0()));
        }

        /* renamed from: I */
        public LocalDateTime mo28117I() {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28813P(localDateTime.mo27971f0()));
        }

        /* renamed from: J */
        public LocalDateTime mo28118J() {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28814Q(localDateTime.mo27971f0()));
        }

        /* renamed from: K */
        public LocalDateTime mo28119K() {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28815R(localDateTime.mo27971f0()));
        }

        /* renamed from: L */
        public LocalDateTime mo28120L(int i) {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28816S(localDateTime.mo27971f0(), i));
        }

        /* renamed from: M */
        public LocalDateTime mo28121M(String str) {
            return mo28122N(str, (Locale) null);
        }

        /* renamed from: N */
        public LocalDateTime mo28122N(String str, Locale locale) {
            LocalDateTime localDateTime = this.f30720a;
            return localDateTime.mo28033G2(this.f30721b.mo28818U(localDateTime.mo27971f0(), str, locale));
        }

        /* renamed from: O */
        public LocalDateTime mo28123O() {
            return mo28120L(mo29063s());
        }

        /* renamed from: P */
        public LocalDateTime mo28124P() {
            return mo28120L(mo29066v());
        }

        /* renamed from: i */
        public C12589a mo27694i() {
            return this.f30720a.mo27982m();
        }

        /* renamed from: m */
        public C12599c mo27695m() {
            return this.f30721b;
        }

        /* renamed from: u */
        public long mo27696u() {
            return this.f30720a.mo27971f0();
        }
    }

    public LocalDateTime() {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52933a0());
    }

    /* renamed from: A0 */
    public static LocalDateTime m51635A0(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new LocalDateTime(i2, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: B1 */
    public static LocalDateTime m51636B1() {
        return new LocalDateTime();
    }

    /* renamed from: C0 */
    public static LocalDateTime m51637C0(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return m51635A0(gregorianCalendar);
        }
    }

    /* renamed from: F1 */
    public static LocalDateTime m51638F1(C12589a aVar) {
        if (aVar != null) {
            return new LocalDateTime(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: G1 */
    public static LocalDateTime m51639G1(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: H1 */
    public static LocalDateTime m51640H1(String str) {
        return m51641L1(str, C12683i.m54181K());
    }

    /* renamed from: L1 */
    public static LocalDateTime m51641L1(String str, C12674b bVar) {
        return bVar.mo29254q(str);
    }

    private Object readResolve() {
        C12589a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalDateTime(this.iLocalMillis, (C12589a) ISOChronology.m52935c0());
        }
        if (!DateTimeZone.f30651a.equals(aVar.mo27836s())) {
            return new LocalDateTime(this.iLocalMillis, this.iChronology.mo27834Q());
        }
        return this;
    }

    /* renamed from: A1 */
    public Property mo28024A1() {
        return new Property(this, mo27982m().mo28619E());
    }

    /* renamed from: A2 */
    public LocalDateTime mo28025A2(C12711k kVar, int i) {
        if (kVar == null || i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28635a(mo27971f0(), kVar.mo28667k(), i));
    }

    /* renamed from: B0 */
    public int mo28026B0() {
        return mo27982m().mo28619E().mo28828g(mo27971f0());
    }

    /* renamed from: B2 */
    public LocalDateTime mo28027B2(int i) {
        return mo28033G2(mo27982m().mo28645k().mo28816S(mo27971f0(), i));
    }

    /* renamed from: C2 */
    public LocalDateTime mo28028C2(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return mo28033G2(dateTimeFieldType.mo27802F(mo27982m()).mo28816S(mo27971f0(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    /* renamed from: D2 */
    public LocalDateTime mo28029D2(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            return mo28033G2(durationFieldType.mo27877d(mo27982m()).mo28909b(mo27971f0(), i));
        }
    }

    /* renamed from: E2 */
    public LocalDateTime mo28030E2(C12714n nVar) {
        return nVar == null ? this : mo28033G2(mo27982m().mo28624J(nVar, mo27971f0()));
    }

    /* renamed from: F0 */
    public Property mo28031F0() {
        return new Property(this, mo27982m().mo28655v());
    }

    /* renamed from: F2 */
    public LocalDateTime mo28032F2(int i) {
        return mo28033G2(mo27982m().mo28655v().mo28816S(mo27971f0(), i));
    }

    /* renamed from: G2 */
    public LocalDateTime mo28033G2(long j) {
        return j == mo27971f0() ? this : new LocalDateTime(j, mo27982m());
    }

    /* renamed from: H0 */
    public boolean mo28034H0(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        return durationFieldType.mo27877d(mo27982m()).mo29037o0();
    }

    /* renamed from: H2 */
    public LocalDateTime mo28035H2(int i) {
        return mo28033G2(mo27982m().mo28659z().mo28816S(mo27971f0(), i));
    }

    /* renamed from: I2 */
    public LocalDateTime mo28036I2(int i) {
        return mo28033G2(mo27982m().mo28615A().mo28816S(mo27971f0(), i));
    }

    /* renamed from: J2 */
    public LocalDateTime mo28037J2(int i) {
        return mo28033G2(mo27982m().mo28617C().mo28816S(mo27971f0(), i));
    }

    /* renamed from: K */
    public boolean mo27949K(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.mo27802F(mo27982m()).mo28809L();
    }

    /* renamed from: K0 */
    public Property mo28038K0() {
        return new Property(this, mo27982m().mo28659z());
    }

    /* renamed from: K2 */
    public LocalDateTime mo28039K2(int i) {
        return mo28033G2(mo27982m().mo28619E().mo28816S(mo27971f0(), i));
    }

    /* renamed from: L0 */
    public Property mo28040L0() {
        return new Property(this, mo27982m().mo28615A());
    }

    /* renamed from: L2 */
    public LocalDateTime mo28041L2(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28636b(oVar, mo27971f0(), i));
    }

    /* renamed from: M1 */
    public LocalDateTime mo28042M1(C12711k kVar) {
        return mo28025A2(kVar, 1);
    }

    /* renamed from: M2 */
    public LocalDateTime mo28043M2(int i) {
        return mo28033G2(mo27982m().mo28622H().mo28816S(mo27971f0(), i));
    }

    /* renamed from: N0 */
    public LocalDateTime mo28044N0(C12711k kVar) {
        return mo28025A2(kVar, -1);
    }

    /* renamed from: N2 */
    public LocalDateTime mo28045N2(int i, int i2, int i3, int i4) {
        C12589a m = mo27982m();
        return mo28033G2(m.mo28615A().mo28816S(m.mo28622H().mo28816S(m.mo28617C().mo28816S(m.mo28655v().mo28816S(mo27971f0(), i), i2), i3), i4));
    }

    /* renamed from: O0 */
    public LocalDateTime mo28046O0(C12715o oVar) {
        return mo28041L2(oVar, -1);
    }

    /* renamed from: O2 */
    public LocalDateTime mo28047O2(int i) {
        return mo28033G2(mo27982m().mo28626L().mo28816S(mo27971f0(), i));
    }

    /* renamed from: P1 */
    public int mo28048P1() {
        return mo27982m().mo28643i().mo28828g(mo27971f0());
    }

    /* renamed from: P2 */
    public LocalDateTime mo28049P2(int i) {
        return mo28033G2(mo27982m().mo28628N().mo28816S(mo27971f0(), i));
    }

    /* renamed from: Q2 */
    public LocalDateTime mo28050Q2(int i) {
        return mo28033G2(mo27982m().mo28631S().mo28816S(mo27971f0(), i));
    }

    /* renamed from: R0 */
    public LocalDateTime mo28051R0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28644j().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: R1 */
    public int mo28052R1() {
        return mo27982m().mo28641g().mo28828g(mo27971f0());
    }

    /* renamed from: R2 */
    public LocalDateTime mo28053R2(int i) {
        return mo28033G2(mo27982m().mo28632T().mo28816S(mo27971f0(), i));
    }

    /* renamed from: S1 */
    public String mo28054S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: S2 */
    public LocalDateTime mo28055S2(int i) {
        return mo28033G2(mo27982m().mo28633U().mo28816S(mo27971f0(), i));
    }

    /* renamed from: T */
    public int mo27959T(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.mo27802F(mo27982m()).mo28828g(mo27971f0());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: T0 */
    public int mo28056T0() {
        return mo27982m().mo28645k().mo28828g(mo27971f0());
    }

    /* renamed from: T1 */
    public LocalDateTime mo28057T1(C12715o oVar) {
        return mo28041L2(oVar, 1);
    }

    /* renamed from: T2 */
    public Property mo28058T2() {
        return new Property(this, mo27982m().mo28631S());
    }

    /* renamed from: U0 */
    public LocalDateTime mo28059U0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28657x().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: U2 */
    public Property mo28060U2() {
        return new Property(this, mo27982m().mo28632T());
    }

    /* renamed from: V */
    public DateTime mo28061V() {
        return mo28094q2((DateTimeZone) null);
    }

    /* renamed from: V1 */
    public int mo28062V1() {
        return mo27982m().mo28655v().mo28828g(mo27971f0());
    }

    /* renamed from: V2 */
    public Property mo28063V2() {
        return new Property(this, mo27982m().mo28633U());
    }

    /* renamed from: X1 */
    public LocalDateTime mo28064X1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28644j().mo28909b(mo27971f0(), i));
    }

    /* renamed from: Y1 */
    public LocalDateTime mo28065Y1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28657x().mo28909b(mo27971f0(), i));
    }

    /* renamed from: Z0 */
    public int mo28066Z0() {
        return mo27982m().mo28628N().mo28828g(mo27971f0());
    }

    /* renamed from: b */
    public int compareTo(C12714n nVar) {
        if (this == nVar) {
            return 0;
        }
        if (nVar instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) nVar;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDateTime.iLocalMillis;
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

    /* renamed from: c1 */
    public LocalDateTime mo28067c1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28658y().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: c2 */
    public LocalDateTime mo28068c2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28658y().mo28909b(mo27971f0(), i));
    }

    /* renamed from: d2 */
    public int mo28069d2() {
        return mo27982m().mo28633U().mo28828g(mo27971f0());
    }

    /* renamed from: e1 */
    public int mo28070e1() {
        return mo27982m().mo28617C().mo28828g(mo27971f0());
    }

    /* renamed from: e2 */
    public LocalDateTime mo28071e2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28618D().mo28909b(mo27971f0(), i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                if (this.iLocalMillis == localDateTime.iLocalMillis) {
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
    public int mo28072f2() {
        return mo27982m().mo28622H().mo28828g(mo27971f0());
    }

    /* renamed from: g */
    public C12599c mo27972g(int i, C12589a aVar) {
        if (i == 0) {
            return aVar.mo28631S();
        }
        if (i == 1) {
            return aVar.mo28619E();
        }
        if (i == 2) {
            return aVar.mo28641g();
        }
        if (i == 3) {
            return aVar.mo28659z();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getValue(int i) {
        if (i == 0) {
            return mo27982m().mo28631S().mo28828g(mo27971f0());
        }
        if (i == 1) {
            return mo27982m().mo28619E().mo28828g(mo27971f0());
        }
        if (i == 2) {
            return mo27982m().mo28641g().mo28828g(mo27971f0());
        }
        if (i == 3) {
            return mo27982m().mo28659z().mo28828g(mo27971f0());
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getYear() {
        return mo27982m().mo28631S().mo28828g(mo27971f0());
    }

    /* renamed from: h1 */
    public int mo28074h1() {
        return mo27982m().mo28615A().mo28828g(mo27971f0());
    }

    /* renamed from: h2 */
    public int mo28075h2() {
        return mo27982m().mo28632T().mo28828g(mo27971f0());
    }

    /* renamed from: i1 */
    public int mo28076i1() {
        return mo27982m().mo28638d().mo28828g(mo27971f0());
    }

    /* renamed from: i2 */
    public LocalDateTime mo28077i2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28620F().mo28909b(mo27971f0(), i));
    }

    /* renamed from: j1 */
    public LocalDateTime mo28078j1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28618D().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: j2 */
    public LocalDateTime mo28079j2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28623I().mo28909b(mo27971f0(), i));
    }

    /* renamed from: k1 */
    public LocalDateTime mo28080k1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28620F().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: k2 */
    public LocalDateTime mo28081k2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28627M().mo28909b(mo27971f0(), i));
    }

    /* renamed from: l2 */
    public LocalDateTime mo28082l2(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28634V().mo28909b(mo27971f0(), i));
    }

    /* renamed from: m */
    public C12589a mo27982m() {
        return this.iChronology;
    }

    /* renamed from: m0 */
    public Property mo28083m0() {
        return new Property(this, mo27982m().mo28638d());
    }

    /* renamed from: m2 */
    public Property mo28084m2(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.mo27802F(mo27982m()));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    /* renamed from: n0 */
    public final Date mo28085n0(Date date, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTime(date);
        LocalDateTime A0 = m51635A0(instance);
        if (A0.mo28786X(this)) {
            while (A0.mo28786X(this)) {
                instance.setTimeInMillis(instance.getTimeInMillis() + AirshipConfigOptions.f87111Y);
                A0 = m51635A0(instance);
            }
            while (!A0.mo28786X(this)) {
                instance.setTimeInMillis(instance.getTimeInMillis() - 1000);
                A0 = m51635A0(instance);
            }
            instance.setTimeInMillis(instance.getTimeInMillis() + 1000);
        } else if (A0.equals(this)) {
            Calendar instance2 = Calendar.getInstance(timeZone);
            instance2.setTimeInMillis(instance.getTimeInMillis() - ((long) timeZone.getDSTSavings()));
            if (m51635A0(instance2).equals(this)) {
                instance = instance2;
            }
        }
        return instance.getTime();
    }

    /* renamed from: n1 */
    public LocalDateTime mo28086n1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28623I().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: n2 */
    public Property mo28087n2() {
        return new Property(this, mo27982m().mo28622H());
    }

    /* renamed from: o0 */
    public Property mo28088o0() {
        return new Property(this, mo27982m().mo28641g());
    }

    /* renamed from: o2 */
    public Date mo28089o2() {
        Date date = new Date(getYear() - 1900, mo28026B0() - 1, mo28052R1(), mo28062V1(), mo28070e1(), mo28072f2());
        date.setTime(date.getTime() + ((long) mo28074h1()));
        return mo28085n0(date, TimeZone.getDefault());
    }

    /* renamed from: p0 */
    public Property mo28090p0() {
        return new Property(this, mo27982m().mo28642h());
    }

    /* renamed from: p1 */
    public int mo28091p1() {
        return mo27982m().mo28659z().mo28828g(mo27971f0());
    }

    /* renamed from: p2 */
    public Date mo28092p2(TimeZone timeZone) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.clear();
        instance.set(getYear(), mo28026B0() - 1, mo28052R1(), mo28062V1(), mo28070e1(), mo28072f2());
        Date time = instance.getTime();
        time.setTime(time.getTime() + ((long) mo28074h1()));
        return mo28085n0(time, timeZone);
    }

    /* renamed from: q1 */
    public LocalDateTime mo28093q1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28627M().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: q2 */
    public DateTime mo28094q2(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), mo28026B0(), mo28052R1(), mo28062V1(), mo28070e1(), mo28072f2(), mo28074h1(), this.iChronology.mo27835R(C12641d.m53380o(dateTimeZone)));
    }

    /* renamed from: r2 */
    public LocalDate mo28095r2() {
        return new LocalDate(mo27971f0(), mo27982m());
    }

    /* renamed from: s0 */
    public int mo28096s0() {
        return mo27982m().mo28642h().mo28828g(mo27971f0());
    }

    /* renamed from: s2 */
    public LocalTime mo28097s2() {
        return new LocalTime(mo27971f0(), mo27982m());
    }

    public int size() {
        return 4;
    }

    /* renamed from: t0 */
    public Property mo28098t0() {
        return new Property(this, mo27982m().mo28643i());
    }

    /* renamed from: t2 */
    public Property mo28099t2() {
        return new Property(this, mo27982m().mo28626L());
    }

    @ToString
    public String toString() {
        return C12683i.m54172B().mo29260w(this);
    }

    /* renamed from: u0 */
    public Property mo28100u0() {
        return new Property(this, mo27982m().mo28645k());
    }

    /* renamed from: u2 */
    public Property mo28101u2() {
        return new Property(this, mo27982m().mo28628N());
    }

    /* renamed from: v2 */
    public LocalDateTime mo28102v2(int i) {
        return mo28033G2(mo27982m().mo28638d().mo28816S(mo27971f0(), i));
    }

    /* renamed from: w0 */
    public String mo28103w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    /* renamed from: w1 */
    public LocalDateTime mo28104w1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28033G2(mo27982m().mo28634V().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: w2 */
    public LocalDateTime mo28105w2(int i, int i2, int i3) {
        C12589a m = mo27982m();
        return mo28033G2(m.mo28641g().mo28816S(m.mo28619E().mo28816S(m.mo28631S().mo28816S(mo27971f0(), i), i2), i3));
    }

    /* renamed from: x2 */
    public LocalDateTime mo28106x2(int i) {
        return mo28033G2(mo27982m().mo28641g().mo28816S(mo27971f0(), i));
    }

    /* renamed from: y2 */
    public LocalDateTime mo28107y2(int i) {
        return mo28033G2(mo27982m().mo28642h().mo28816S(mo27971f0(), i));
    }

    /* renamed from: z0 */
    public int mo28108z0() {
        return mo27982m().mo28626L().mo28828g(mo27971f0());
    }

    /* renamed from: z1 */
    public Property mo28109z1() {
        return new Property(this, mo27982m().mo28617C());
    }

    /* renamed from: z2 */
    public LocalDateTime mo28110z2(int i) {
        return mo28033G2(mo27982m().mo28643i().mo28816S(mo27971f0(), i));
    }

    public LocalDateTime(DateTimeZone dateTimeZone) {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalDateTime(C12589a aVar) {
        this(C12641d.m53368c(), aVar);
    }

    public LocalDateTime(long j) {
        this(j, (C12589a) ISOChronology.m52933a0());
    }

    public LocalDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalDateTime(long j, C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        this.iLocalMillis = e.mo27836s().mo27825r(DateTimeZone.f30651a, j);
        this.iChronology = e.mo27834Q();
    }

    public LocalDateTime(Object obj) {
        this(obj, (C12589a) null);
    }

    public LocalDateTime(Object obj, DateTimeZone dateTimeZone) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28985b(obj, dateTimeZone));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54181K());
        this.iLocalMillis = Q.mo28650p(k[0], k[1], k[2], k[3]);
    }

    public LocalDateTime(Object obj, C12589a aVar) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28984a(obj, aVar));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54181K());
        this.iLocalMillis = Q.mo28650p(k[0], k[1], k[2], k[3]);
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, 0, ISOChronology.m52935c0());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, 0, ISOChronology.m52935c0());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.m52935c0());
    }

    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        long q = Q.mo28651q(i, i2, i3, i4, i5, i6, i7);
        this.iChronology = Q;
        this.iLocalMillis = q;
    }
}
