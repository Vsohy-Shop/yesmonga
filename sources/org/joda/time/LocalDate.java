package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.C12598g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C12624d;
import org.joda.time.convert.C12633l;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class LocalDate extends C12598g implements C12714n, Serializable {

    /* renamed from: b */
    public static final int f30709b = 0;

    /* renamed from: c */
    public static final int f30710c = 1;

    /* renamed from: d */
    public static final int f30711d = 2;

    /* renamed from: e */
    public static final Set<DurationFieldType> f30712e;
    private static final long serialVersionUID = -8775358157899L;

    /* renamed from: a */
    public transient int f30713a;
    private final C12589a iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;

        /* renamed from: a */
        public transient LocalDate f30714a;

        /* renamed from: b */
        public transient C12599c f30715b;

        public Property(LocalDate localDate, C12599c cVar) {
            this.f30714a = localDate;
            this.f30715b = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f30714a = (LocalDate) objectInputStream.readObject();
            this.f30715b = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.f30714a.mo27982m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f30714a);
            objectOutputStream.writeObject(this.f30715b.mo28806I());
        }

        /* renamed from: C */
        public LocalDate mo28011C(int i) {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28822a(localDate.mo27971f0(), i));
        }

        /* renamed from: D */
        public LocalDate mo28012D(int i) {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28825d(localDate.mo27971f0(), i));
        }

        /* renamed from: E */
        public LocalDate mo28013E() {
            return this.f30714a;
        }

        /* renamed from: F */
        public LocalDate mo28014F() {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28811N(localDate.mo27971f0()));
        }

        /* renamed from: G */
        public LocalDate mo28015G() {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28812O(localDate.mo27971f0()));
        }

        /* renamed from: H */
        public LocalDate mo28016H() {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28813P(localDate.mo27971f0()));
        }

        /* renamed from: I */
        public LocalDate mo28017I() {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28814Q(localDate.mo27971f0()));
        }

        /* renamed from: J */
        public LocalDate mo28018J() {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28815R(localDate.mo27971f0()));
        }

        /* renamed from: K */
        public LocalDate mo28019K(int i) {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28816S(localDate.mo27971f0(), i));
        }

        /* renamed from: L */
        public LocalDate mo28020L(String str) {
            return mo28021M(str, (Locale) null);
        }

        /* renamed from: M */
        public LocalDate mo28021M(String str, Locale locale) {
            LocalDate localDate = this.f30714a;
            return localDate.mo28005w2(this.f30715b.mo28818U(localDate.mo27971f0(), str, locale));
        }

        /* renamed from: N */
        public LocalDate mo28022N() {
            return mo28019K(mo29063s());
        }

        /* renamed from: O */
        public LocalDate mo28023O() {
            return mo28019K(mo29066v());
        }

        /* renamed from: i */
        public C12589a mo27694i() {
            return this.f30714a.mo27982m();
        }

        /* renamed from: m */
        public C12599c mo27695m() {
            return this.f30715b;
        }

        /* renamed from: u */
        public long mo27696u() {
            return this.f30714a.mo27971f0();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f30712e = hashSet;
        hashSet.add(DurationFieldType.m51456b());
        hashSet.add(DurationFieldType.m51464m());
        hashSet.add(DurationFieldType.m51462k());
        hashSet.add(DurationFieldType.m51465n());
        hashSet.add(DurationFieldType.m51466o());
        hashSet.add(DurationFieldType.m51455a());
        hashSet.add(DurationFieldType.m51457c());
    }

    public LocalDate() {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52933a0());
    }

    /* renamed from: A0 */
    public static LocalDate m51541A0(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return m51547u0(gregorianCalendar);
        }
    }

    /* renamed from: R0 */
    public static LocalDate m51542R0() {
        return new LocalDate();
    }

    /* renamed from: U0 */
    public static LocalDate m51543U0(C12589a aVar) {
        if (aVar != null) {
            return new LocalDate(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: c1 */
    public static LocalDate m51544c1(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: j1 */
    public static LocalDate m51545j1(String str) {
        return m51546k1(str, C12683i.m54182L());
    }

    /* renamed from: k1 */
    public static LocalDate m51546k1(String str, C12674b bVar) {
        return bVar.mo29253p(str);
    }

    private Object readResolve() {
        C12589a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalDate(this.iLocalMillis, (C12589a) ISOChronology.m52935c0());
        }
        if (!DateTimeZone.f30651a.equals(aVar.mo27836s())) {
            return new LocalDate(this.iLocalMillis, this.iChronology.mo27834Q());
        }
        return this;
    }

    /* renamed from: u0 */
    public static LocalDate m51547u0(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new LocalDate(i2, calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: A1 */
    public LocalDate mo27933A1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28634V().mo28909b(mo27971f0(), i));
    }

    /* renamed from: A2 */
    public LocalDate mo27934A2(int i) {
        return mo28005w2(mo27982m().mo28628N().mo28816S(mo27971f0(), i));
    }

    /* renamed from: B0 */
    public int mo27935B0() {
        return mo27982m().mo28619E().mo28828g(mo27971f0());
    }

    /* renamed from: B1 */
    public Property mo27936B1(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.mo27802F(mo27982m()));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    /* renamed from: B2 */
    public LocalDate mo27937B2(int i) {
        return mo28005w2(mo27982m().mo28631S().mo28816S(mo27971f0(), i));
    }

    /* renamed from: C0 */
    public boolean mo27938C0(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        C12646e d = durationFieldType.mo27877d(mo27982m());
        if (f30712e.contains(durationFieldType) || d.mo28947X() >= mo27982m().mo28644j().mo28947X()) {
            return d.mo29037o0();
        }
        return false;
    }

    /* renamed from: C2 */
    public LocalDate mo27939C2(int i) {
        return mo28005w2(mo27982m().mo28632T().mo28816S(mo27971f0(), i));
    }

    /* renamed from: D2 */
    public LocalDate mo27940D2(int i) {
        return mo28005w2(mo27982m().mo28633U().mo28816S(mo27971f0(), i));
    }

    /* renamed from: E2 */
    public Property mo27941E2() {
        return new Property(this, mo27982m().mo28631S());
    }

    /* renamed from: F0 */
    public LocalDate mo27942F0(C12715o oVar) {
        return mo28007y2(oVar, -1);
    }

    /* renamed from: F1 */
    public Date mo27943F1() {
        int R1 = mo27957R1();
        Date date = new Date(getYear() - 1900, mo27935B0() - 1, R1);
        LocalDate A0 = m51541A0(date);
        if (A0.mo28786X(this)) {
            while (!A0.equals(this)) {
                date.setTime(date.getTime() + 3600000);
                A0 = m51541A0(date);
            }
            while (date.getDate() == R1) {
                date.setTime(date.getTime() - 1000);
            }
            date.setTime(date.getTime() + 1000);
            return date;
        } else if (!A0.equals(this)) {
            return date;
        } else {
            Date date2 = new Date(date.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
            if (date2.getDate() == R1) {
                return date2;
            }
            return date;
        }
    }

    /* renamed from: F2 */
    public Property mo27944F2() {
        return new Property(this, mo27982m().mo28632T());
    }

    @Deprecated
    /* renamed from: G1 */
    public DateMidnight mo27945G1() {
        return mo27948H1((DateTimeZone) null);
    }

    /* renamed from: G2 */
    public Property mo27946G2() {
        return new Property(this, mo27982m().mo28633U());
    }

    /* renamed from: H0 */
    public LocalDate mo27947H0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28644j().mo29038p0(mo27971f0(), i));
    }

    @Deprecated
    /* renamed from: H1 */
    public DateMidnight mo27948H1(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), mo27935B0(), mo27957R1(), mo27982m().mo27835R(C12641d.m53380o(dateTimeZone)));
    }

    /* renamed from: K */
    public boolean mo27949K(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType E = dateTimeFieldType.mo27801E();
        if (f30712e.contains(E) || E.mo27877d(mo27982m()).mo28947X() >= mo27982m().mo28644j().mo28947X()) {
            return dateTimeFieldType.mo27802F(mo27982m()).mo28809L();
        }
        return false;
    }

    /* renamed from: K0 */
    public LocalDate mo27950K0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28620F().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: L0 */
    public LocalDate mo27951L0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28627M().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: L1 */
    public DateTime mo27952L1(LocalTime localTime) {
        return mo27953M1(localTime, (DateTimeZone) null);
    }

    /* renamed from: M1 */
    public DateTime mo27953M1(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return mo27962X1(dateTimeZone);
        }
        if (mo27982m() == localTime.mo27982m()) {
            return new DateTime(getYear(), mo27935B0(), mo27957R1(), localTime.mo28142V1(), localTime.mo28146e1(), localTime.mo28148f2(), localTime.mo28149h1(), mo27982m().mo27835R(dateTimeZone));
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    /* renamed from: N0 */
    public LocalDate mo27954N0(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28634V().mo29038p0(mo27971f0(), i));
    }

    /* renamed from: O0 */
    public Property mo27955O0() {
        return new Property(this, mo27982m().mo28619E());
    }

    /* renamed from: P1 */
    public int mo27956P1() {
        return mo27982m().mo28643i().mo28828g(mo27971f0());
    }

    /* renamed from: R1 */
    public int mo27957R1() {
        return mo27982m().mo28641g().mo28828g(mo27971f0());
    }

    /* renamed from: S1 */
    public String mo27958S1(String str) {
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

    /* renamed from: T0 */
    public int mo27960T0() {
        return mo27982m().mo28645k().mo28828g(mo27971f0());
    }

    /* renamed from: T1 */
    public DateTime mo27961T1() {
        return mo27962X1((DateTimeZone) null);
    }

    /* renamed from: X1 */
    public DateTime mo27962X1(DateTimeZone dateTimeZone) {
        C12589a R = mo27982m().mo27835R(C12641d.m53380o(dateTimeZone));
        return new DateTime(R.mo28624J(this, C12641d.m53368c()), R);
    }

    @Deprecated
    /* renamed from: Y1 */
    public DateTime mo27963Y1() {
        return mo27966c2((DateTimeZone) null);
    }

    /* renamed from: Z0 */
    public int mo27964Z0() {
        return mo27982m().mo28628N().mo28828g(mo27971f0());
    }

    /* renamed from: b */
    public int compareTo(C12714n nVar) {
        if (this == nVar) {
            return 0;
        }
        if (nVar instanceof LocalDate) {
            LocalDate localDate = (LocalDate) nVar;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDate.iLocalMillis;
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

    @Deprecated
    /* renamed from: c2 */
    public DateTime mo27966c2(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), mo27935B0(), mo27957R1(), 0, 0, 0, 0, mo27982m().mo27835R(C12641d.m53380o(dateTimeZone)));
    }

    /* renamed from: d2 */
    public int mo27968d2() {
        return mo27982m().mo28633U().mo28828g(mo27971f0());
    }

    /* renamed from: e2 */
    public DateTime mo27969e2() {
        return mo27978i2((DateTimeZone) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                if (this.iLocalMillis == localDate.iLocalMillis) {
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
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getYear() {
        return mo27982m().mo28631S().mo28828g(mo27971f0());
    }

    /* renamed from: h2 */
    public int mo27975h2() {
        return mo27982m().mo28632T().mo28828g(mo27971f0());
    }

    public int hashCode() {
        int i = this.f30713a;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.f30713a = hashCode;
        return hashCode;
    }

    /* renamed from: i1 */
    public int mo27977i1() {
        return mo27982m().mo28638d().mo28828g(mo27971f0());
    }

    /* renamed from: i2 */
    public DateTime mo27978i2(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        C12589a R = mo27982m().mo27835R(o);
        return new DateTime(R.mo28641g().mo28812O(o.mo27819b(mo27971f0() + 21600000, false)), R).mo27778y3();
    }

    /* renamed from: j2 */
    public Interval mo27979j2() {
        return mo27980k2((DateTimeZone) null);
    }

    /* renamed from: k2 */
    public Interval mo27980k2(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        return new Interval((C12712l) mo27978i2(o), (C12712l) mo27992q1(1).mo27978i2(o));
    }

    /* renamed from: l2 */
    public LocalDateTime mo27981l2(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        } else if (mo27982m() == localTime.mo27982m()) {
            return new LocalDateTime(mo27971f0() + localTime.mo27971f0(), mo27982m());
        } else {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
    }

    /* renamed from: m */
    public C12589a mo27982m() {
        return this.iChronology;
    }

    /* renamed from: m0 */
    public Property mo27983m0() {
        return new Property(this, mo27982m().mo28638d());
    }

    /* renamed from: m2 */
    public Property mo27984m2() {
        return new Property(this, mo27982m().mo28626L());
    }

    /* renamed from: n0 */
    public Property mo27985n0() {
        return new Property(this, mo27982m().mo28641g());
    }

    /* renamed from: n1 */
    public LocalDate mo27986n1(C12715o oVar) {
        return mo28007y2(oVar, 1);
    }

    /* renamed from: n2 */
    public Property mo27987n2() {
        return new Property(this, mo27982m().mo28628N());
    }

    /* renamed from: o0 */
    public Property mo27988o0() {
        return new Property(this, mo27982m().mo28642h());
    }

    /* renamed from: o2 */
    public LocalDate mo27989o2(int i) {
        return mo28005w2(mo27982m().mo28638d().mo28816S(mo27971f0(), i));
    }

    /* renamed from: p0 */
    public Property mo27990p0() {
        return new Property(this, mo27982m().mo28643i());
    }

    /* renamed from: p2 */
    public LocalDate mo27991p2(int i) {
        return mo28005w2(mo27982m().mo28641g().mo28816S(mo27971f0(), i));
    }

    /* renamed from: q1 */
    public LocalDate mo27992q1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28644j().mo28909b(mo27971f0(), i));
    }

    /* renamed from: q2 */
    public LocalDate mo27993q2(int i) {
        return mo28005w2(mo27982m().mo28642h().mo28816S(mo27971f0(), i));
    }

    /* renamed from: r2 */
    public LocalDate mo27994r2(int i) {
        return mo28005w2(mo27982m().mo28643i().mo28816S(mo27971f0(), i));
    }

    /* renamed from: s0 */
    public int mo27995s0() {
        return mo27982m().mo28642h().mo28828g(mo27971f0());
    }

    /* renamed from: s2 */
    public LocalDate mo27996s2(int i) {
        return mo28005w2(mo27982m().mo28645k().mo28816S(mo27971f0(), i));
    }

    public int size() {
        return 3;
    }

    /* renamed from: t0 */
    public Property mo27998t0() {
        return new Property(this, mo27982m().mo28645k());
    }

    /* renamed from: t2 */
    public LocalDate mo27999t2(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (mo27949K(dateTimeFieldType)) {
            return mo28005w2(dateTimeFieldType.mo27802F(mo27982m()).mo28816S(mo27971f0(), i));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    @ToString
    public String toString() {
        return C12683i.m54218p().mo29260w(this);
    }

    /* renamed from: u2 */
    public LocalDate mo28001u2(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (!mo27938C0(durationFieldType)) {
            throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
        } else if (i == 0) {
            return this;
        } else {
            return mo28005w2(durationFieldType.mo27877d(mo27982m()).mo28909b(mo27971f0(), i));
        }
    }

    /* renamed from: v2 */
    public LocalDate mo28002v2(C12714n nVar) {
        return nVar == null ? this : mo28005w2(mo27982m().mo28624J(nVar, mo27971f0()));
    }

    /* renamed from: w0 */
    public String mo28003w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    /* renamed from: w1 */
    public LocalDate mo28004w1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28620F().mo28909b(mo27971f0(), i));
    }

    /* renamed from: w2 */
    public LocalDate mo28005w2(long j) {
        long O = this.iChronology.mo28641g().mo28812O(j);
        if (O == mo27971f0()) {
            return this;
        }
        return new LocalDate(O, mo27982m());
    }

    /* renamed from: x2 */
    public LocalDate mo28006x2(int i) {
        return mo28005w2(mo27982m().mo28619E().mo28816S(mo27971f0(), i));
    }

    /* renamed from: y2 */
    public LocalDate mo28007y2(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        long f0 = mo27971f0();
        C12589a m = mo27982m();
        for (int i2 = 0; i2 < oVar.size(); i2++) {
            long h = (long) C12652e.m53798h(oVar.getValue(i2), i);
            DurationFieldType t = oVar.mo28702t(i2);
            if (mo27938C0(t)) {
                f0 = t.mo27877d(m).mo28910g(f0, h);
            }
        }
        return mo28005w2(f0);
    }

    /* renamed from: z0 */
    public int mo28008z0() {
        return mo27982m().mo28626L().mo28828g(mo27971f0());
    }

    /* renamed from: z1 */
    public LocalDate mo28009z1(int i) {
        if (i == 0) {
            return this;
        }
        return mo28005w2(mo27982m().mo28627M().mo28909b(mo27971f0(), i));
    }

    /* renamed from: z2 */
    public LocalDate mo28010z2(int i) {
        return mo28005w2(mo27982m().mo28626L().mo28816S(mo27971f0(), i));
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(C12641d.m53368c(), (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalDate(C12589a aVar) {
        this(C12641d.m53368c(), aVar);
    }

    public LocalDate(long j) {
        this(j, (C12589a) ISOChronology.m52933a0());
    }

    public LocalDate(long j, DateTimeZone dateTimeZone) {
        this(j, (C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public LocalDate(long j, C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        long r = e.mo27836s().mo27825r(DateTimeZone.f30651a, j);
        C12589a Q = e.mo27834Q();
        this.iLocalMillis = Q.mo28641g().mo28812O(r);
        this.iChronology = Q;
    }

    public LocalDate(Object obj) {
        this(obj, (C12589a) null);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28985b(obj, dateTimeZone));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54182L());
        this.iLocalMillis = Q.mo28650p(k[0], k[1], k[2], 0);
    }

    public LocalDate(Object obj, C12589a aVar) {
        C12633l r = C12624d.m53287m().mo29009r(obj);
        C12589a e = C12641d.m53370e(r.mo28984a(obj, aVar));
        C12589a Q = e.mo27834Q();
        this.iChronology = Q;
        int[] k = r.mo29030k(this, obj, e, C12683i.m54182L());
        this.iLocalMillis = Q.mo28650p(k[0], k[1], k[2], 0);
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.m52935c0());
    }

    public LocalDate(int i, int i2, int i3, C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        long p = Q.mo28650p(i, i2, i3, 0);
        this.iChronology = Q;
        this.iLocalMillis = p;
    }
}
