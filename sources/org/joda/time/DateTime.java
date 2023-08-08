package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class DateTime extends BaseDateTime implements C12710j, Serializable {
    private static final long serialVersionUID = -5171125899451703815L;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -6983323811635733510L;
        private C12599c iField;
        private DateTime iInstant;

        public Property(DateTime dateTime, C12599c cVar) {
            this.iInstant = dateTime;
            this.iField = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (DateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.iInstant.mo27913m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.mo28806I());
        }

        /* renamed from: C */
        public DateTime mo27781C(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28822a(dateTime.mo27912k(), i));
        }

        /* renamed from: D */
        public DateTime mo27782D(long j) {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28823b(dateTime.mo27912k(), j));
        }

        /* renamed from: E */
        public DateTime mo27783E(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28825d(dateTime.mo27912k(), i));
        }

        /* renamed from: F */
        public DateTime mo27784F() {
            return this.iInstant;
        }

        /* renamed from: G */
        public DateTime mo27785G() {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28811N(dateTime.mo27912k()));
        }

        /* renamed from: H */
        public DateTime mo27786H() {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28812O(dateTime.mo27912k()));
        }

        /* renamed from: I */
        public DateTime mo27787I() {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28813P(dateTime.mo27912k()));
        }

        /* renamed from: J */
        public DateTime mo27788J() {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28814Q(dateTime.mo27912k()));
        }

        /* renamed from: K */
        public DateTime mo27789K() {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28815R(dateTime.mo27912k()));
        }

        /* renamed from: L */
        public DateTime mo27790L(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28816S(dateTime.mo27912k(), i));
        }

        /* renamed from: M */
        public DateTime mo27791M(String str) {
            return mo27792N(str, (Locale) null);
        }

        /* renamed from: N */
        public DateTime mo27792N(String str, Locale locale) {
            DateTime dateTime = this.iInstant;
            return dateTime.mo27707F3(this.iField.mo28818U(dateTime.mo27912k(), str, locale));
        }

        /* renamed from: O */
        public DateTime mo27793O() {
            try {
                return mo27790L(mo29063s());
            } catch (RuntimeException e) {
                if (IllegalInstantException.m51506b(e)) {
                    return new DateTime(mo27694i().mo27836s().mo27816I(mo27696u() + 86400000), mo27694i());
                }
                throw e;
            }
        }

        /* renamed from: P */
        public DateTime mo27794P() {
            try {
                return mo27790L(mo29066v());
            } catch (RuntimeException e) {
                if (IllegalInstantException.m51506b(e)) {
                    return new DateTime(mo27694i().mo27836s().mo27815G(mo27696u() - 86400000), mo27694i());
                }
                throw e;
            }
        }

        /* renamed from: i */
        public C12589a mo27694i() {
            return this.iInstant.mo27913m();
        }

        /* renamed from: m */
        public C12599c mo27695m() {
            return this.iField;
        }

        /* renamed from: u */
        public long mo27696u() {
            return this.iInstant.mo27912k();
        }
    }

    public DateTime() {
    }

    /* renamed from: J2 */
    public static DateTime m51192J2() {
        return new DateTime();
    }

    /* renamed from: K2 */
    public static DateTime m51193K2(C12589a aVar) {
        if (aVar != null) {
            return new DateTime(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: L2 */
    public static DateTime m51194L2(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: N2 */
    public static DateTime m51195N2(String str) {
        return m51196O2(str, C12683i.m54174D().mo29233Q());
    }

    /* renamed from: O2 */
    public static DateTime m51196O2(String str, C12674b bVar) {
        return bVar.mo29251n(str);
    }

    /* renamed from: A2 */
    public DateTime mo27697A2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28618D().mo29038p0(mo27912k(), i));
    }

    /* renamed from: A3 */
    public DateTime mo27698A3(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return mo27707F3(dateTimeFieldType.mo27802F(mo27913m()).mo28816S(mo27912k(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    /* renamed from: B2 */
    public DateTime mo27699B2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28620F().mo29038p0(mo27912k(), i));
    }

    /* renamed from: B3 */
    public DateTime mo27700B3(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            return mo27707F3(durationFieldType.mo27877d(mo27913m()).mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: C2 */
    public DateTime mo27701C2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28623I().mo29038p0(mo27912k(), i));
    }

    /* renamed from: C3 */
    public DateTime mo27702C3(C12714n nVar) {
        return nVar == null ? this : mo27707F3(mo27913m().mo28624J(nVar, mo27912k()));
    }

    /* renamed from: D3 */
    public DateTime mo27703D3(int i) {
        return mo27707F3(mo27913m().mo28655v().mo28816S(mo27912k(), i));
    }

    /* renamed from: E2 */
    public DateTime mo27704E2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28627M().mo29038p0(mo27912k(), i));
    }

    /* renamed from: E3 */
    public DateTime mo27705E3() {
        return mo27707F3(mo28742K1().mo27818a(mo27912k(), true));
    }

    /* renamed from: F2 */
    public DateTime mo27706F2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28634V().mo29038p0(mo27912k(), i));
    }

    /* renamed from: F3 */
    public DateTime mo27707F3(long j) {
        return j == mo27912k() ? this : new DateTime(j, mo27913m());
    }

    /* renamed from: G2 */
    public Property mo27708G2() {
        return new Property(this, mo27913m().mo28616B());
    }

    /* renamed from: G3 */
    public DateTime mo27709G3(int i) {
        return mo27707F3(mo27913m().mo28659z().mo28816S(mo27912k(), i));
    }

    /* renamed from: H2 */
    public Property mo27710H2() {
        return new Property(this, mo27913m().mo28617C());
    }

    /* renamed from: H3 */
    public DateTime mo27711H3(int i) {
        return mo27707F3(mo27913m().mo28615A().mo28816S(mo27912k(), i));
    }

    /* renamed from: I2 */
    public Property mo27712I2() {
        return new Property(this, mo27913m().mo28619E());
    }

    /* renamed from: I3 */
    public DateTime mo27713I3(int i) {
        return mo27707F3(mo27913m().mo28617C().mo28816S(mo27912k(), i));
    }

    /* renamed from: K3 */
    public DateTime mo27714K3(int i) {
        return mo27707F3(mo27913m().mo28619E().mo28816S(mo27912k(), i));
    }

    /* renamed from: L3 */
    public DateTime mo27715L3(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28636b(oVar, mo27912k(), i));
    }

    /* renamed from: M3 */
    public DateTime mo27716M3(int i) {
        return mo27707F3(mo27913m().mo28622H().mo28816S(mo27912k(), i));
    }

    /* renamed from: N3 */
    public DateTime mo27717N3(int i, int i2, int i3, int i4) {
        C12589a m = mo27913m();
        return mo27707F3(m.mo27836s().mo27820c(m.mo27834Q().mo28651q(getYear(), mo28705B0(), mo28709R1(), i, i2, i3, i4), false, mo27912k()));
    }

    /* renamed from: O3 */
    public DateTime mo27718O3(LocalTime localTime) {
        return mo27717N3(localTime.mo28142V1(), localTime.mo28146e1(), localTime.mo28148f2(), localTime.mo28149h1());
    }

    /* renamed from: P2 */
    public DateTime mo27719P2(long j) {
        return mo27774v3(j, 1);
    }

    /* renamed from: P3 */
    public DateTime mo27720P3() {
        return mo27749f3().mo27978i2(mo28742K1());
    }

    /* renamed from: Q2 */
    public DateTime mo27721Q2(C12711k kVar) {
        return mo27777x3(kVar, 1);
    }

    /* renamed from: Q3 */
    public DateTime mo27722Q3(int i) {
        return mo27707F3(mo27913m().mo28626L().mo28816S(mo27912k(), i));
    }

    /* renamed from: R0 */
    public DateTime mo27723R0(C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        if (mo27913m() == e) {
            return this;
        }
        return super.mo27723R0(e);
    }

    /* renamed from: R2 */
    public DateTime mo27724R2(C12715o oVar) {
        return mo27715L3(oVar, 1);
    }

    /* renamed from: R3 */
    public DateTime mo27725R3(int i) {
        return mo27707F3(mo27913m().mo28628N().mo28816S(mo27912k(), i));
    }

    /* renamed from: S2 */
    public DateTime mo27726S2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28644j().mo28909b(mo27912k(), i));
    }

    /* renamed from: S3 */
    public DateTime mo27727S3(int i) {
        return mo27707F3(mo27913m().mo28631S().mo28816S(mo27912k(), i));
    }

    /* renamed from: T3 */
    public DateTime mo27728T3(int i) {
        return mo27707F3(mo27913m().mo28632T().mo28816S(mo27912k(), i));
    }

    /* renamed from: U0 */
    public DateTime mo27729U0(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        if (mo28742K1() == o) {
            return this;
        }
        return super.mo27729U0(o);
    }

    /* renamed from: U2 */
    public DateTime mo27730U2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28657x().mo28909b(mo27912k(), i));
    }

    /* renamed from: U3 */
    public DateTime mo27731U3(int i) {
        return mo27707F3(mo27913m().mo28633U().mo28816S(mo27912k(), i));
    }

    /* renamed from: V */
    public DateTime mo27732V() {
        return this;
    }

    /* renamed from: V2 */
    public DateTime mo27733V2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28658y().mo28909b(mo27912k(), i));
    }

    /* renamed from: V3 */
    public DateTime mo27734V3(DateTimeZone dateTimeZone) {
        return mo27760n3(mo27913m().mo27835R(dateTimeZone));
    }

    /* renamed from: W2 */
    public DateTime mo27735W2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28618D().mo28909b(mo27912k(), i));
    }

    /* renamed from: W3 */
    public DateTime mo27736W3(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        DateTimeZone o2 = C12641d.m53380o(mo28742K1());
        if (o == o2) {
            return this;
        }
        return new DateTime(o2.mo27825r(o, mo27912k()), mo27913m().mo27835R(o));
    }

    /* renamed from: X2 */
    public DateTime mo27737X2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28620F().mo28909b(mo27912k(), i));
    }

    /* renamed from: X3 */
    public Property mo27738X3() {
        return new Property(this, mo27913m().mo28631S());
    }

    /* renamed from: Y2 */
    public DateTime mo27739Y2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28623I().mo28909b(mo27912k(), i));
    }

    /* renamed from: Y3 */
    public Property mo27740Y3() {
        return new Property(this, mo27913m().mo28632T());
    }

    /* renamed from: Z2 */
    public DateTime mo27741Z2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28627M().mo28909b(mo27912k(), i));
    }

    /* renamed from: Z3 */
    public Property mo27742Z3() {
        return new Property(this, mo27913m().mo28633U());
    }

    /* renamed from: a3 */
    public DateTime mo27743a3(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28634V().mo28909b(mo27912k(), i));
    }

    /* renamed from: b3 */
    public Property mo27744b3(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            C12599c F = dateTimeFieldType.mo27802F(mo27913m());
            if (F.mo28809L()) {
                return new Property(this, F);
            }
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: c1 */
    public DateTime mo27745c1() {
        if (mo27913m() == ISOChronology.m52933a0()) {
            return this;
        }
        return super.mo27745c1();
    }

    /* renamed from: c3 */
    public Property mo27746c3() {
        return new Property(this, mo27913m().mo28621G());
    }

    /* renamed from: d3 */
    public Property mo27747d3() {
        return new Property(this, mo27913m().mo28622H());
    }

    @Deprecated
    /* renamed from: e3 */
    public DateMidnight mo27748e3() {
        return new DateMidnight(mo27912k(), mo27913m());
    }

    /* renamed from: f3 */
    public LocalDate mo27749f3() {
        return new LocalDate(mo27912k(), mo27913m());
    }

    /* renamed from: g3 */
    public LocalDateTime mo27750g3() {
        return new LocalDateTime(mo27912k(), mo27913m());
    }

    /* renamed from: h3 */
    public LocalTime mo27751h3() {
        return new LocalTime(mo27912k(), mo27913m());
    }

    @Deprecated
    /* renamed from: i3 */
    public TimeOfDay mo27752i3() {
        return new TimeOfDay(mo27912k(), mo27913m());
    }

    /* renamed from: j2 */
    public Property mo27753j2() {
        return new Property(this, mo27913m().mo28638d());
    }

    @Deprecated
    /* renamed from: j3 */
    public YearMonthDay mo27754j3() {
        return new YearMonthDay(mo27912k(), mo27913m());
    }

    /* renamed from: k2 */
    public Property mo27755k2() {
        return new Property(this, mo27913m().mo28641g());
    }

    /* renamed from: k3 */
    public Property mo27756k3() {
        return new Property(this, mo27913m().mo28626L());
    }

    /* renamed from: l3 */
    public Property mo27757l3() {
        return new Property(this, mo27913m().mo28628N());
    }

    /* renamed from: m3 */
    public DateTime mo27758m3(int i) {
        return mo27707F3(mo27913m().mo28638d().mo28816S(mo27912k(), i));
    }

    /* renamed from: n2 */
    public Property mo27759n2() {
        return new Property(this, mo27913m().mo28642h());
    }

    /* renamed from: n3 */
    public DateTime mo27760n3(C12589a aVar) {
        C12589a e = C12641d.m53370e(aVar);
        if (e == mo27913m()) {
            return this;
        }
        return new DateTime(mo27912k(), e);
    }

    /* renamed from: o2 */
    public Property mo27761o2() {
        return new Property(this, mo27913m().mo28643i());
    }

    /* renamed from: o3 */
    public DateTime mo27762o3(int i, int i2, int i3) {
        C12589a m = mo27913m();
        return mo27707F3(m.mo27836s().mo27820c(m.mo27834Q().mo28650p(i, i2, i3, mo28722p1()), false, mo27912k()));
    }

    /* renamed from: p2 */
    public Property mo27763p2() {
        return new Property(this, mo27913m().mo28645k());
    }

    /* renamed from: p3 */
    public DateTime mo27764p3(LocalDate localDate) {
        return mo27762o3(localDate.getYear(), localDate.mo27935B0(), localDate.mo27957R1());
    }

    /* renamed from: q2 */
    public Property mo27765q2() {
        return new Property(this, mo27913m().mo28655v());
    }

    /* renamed from: q3 */
    public DateTime mo27766q3(int i) {
        return mo27707F3(mo27913m().mo28641g().mo28816S(mo27912k(), i));
    }

    /* renamed from: r2 */
    public Property mo27767r2() {
        return new Property(this, mo27913m().mo28659z());
    }

    /* renamed from: s2 */
    public Property mo27768s2() {
        return new Property(this, mo27913m().mo28615A());
    }

    /* renamed from: s3 */
    public DateTime mo27769s3(int i) {
        return mo27707F3(mo27913m().mo28642h().mo28816S(mo27912k(), i));
    }

    /* renamed from: t2 */
    public DateTime mo27770t2(long j) {
        return mo27774v3(j, -1);
    }

    /* renamed from: u2 */
    public DateTime mo27771u2(C12711k kVar) {
        return mo27777x3(kVar, -1);
    }

    /* renamed from: u3 */
    public DateTime mo27772u3(int i) {
        return mo27707F3(mo27913m().mo28643i().mo28816S(mo27912k(), i));
    }

    /* renamed from: v2 */
    public DateTime mo27773v2(C12715o oVar) {
        return mo27715L3(oVar, -1);
    }

    /* renamed from: v3 */
    public DateTime mo27774v3(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28635a(mo27912k(), j, i));
    }

    /* renamed from: w2 */
    public DateTime mo27775w2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28644j().mo29038p0(mo27912k(), i));
    }

    /* renamed from: x2 */
    public DateTime mo27776x2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28657x().mo29038p0(mo27912k(), i));
    }

    /* renamed from: x3 */
    public DateTime mo27777x3(C12711k kVar, int i) {
        return (kVar == null || i == 0) ? this : mo27774v3(kVar.mo28667k(), i);
    }

    /* renamed from: y3 */
    public DateTime mo27778y3() {
        return mo27707F3(mo28742K1().mo27818a(mo27912k(), false));
    }

    /* renamed from: z2 */
    public DateTime mo27779z2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27707F3(mo27913m().mo28658y().mo29038p0(mo27912k(), i));
    }

    /* renamed from: z3 */
    public DateTime mo27780z3(int i) {
        return mo27707F3(mo27913m().mo28645k().mo28816S(mo27912k(), i));
    }

    public DateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public DateTime(C12589a aVar) {
        super(aVar);
    }

    public DateTime(long j) {
        super(j);
    }

    public DateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateTime(long j, C12589a aVar) {
        super(j, aVar);
    }

    public DateTime(Object obj) {
        super(obj, (C12589a) null);
    }

    public DateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateTime(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar));
    }

    public DateTime(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5, 0, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, 0, 0, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, C12589a aVar) {
        super(i, i2, i3, i4, i5, 0, 0, aVar);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, 0, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, C12589a aVar) {
        super(i, i2, i3, i4, i5, i6, 0, aVar);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C12589a aVar) {
        super(i, i2, i3, i4, i5, i6, i7, aVar);
    }
}
