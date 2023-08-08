package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

@Deprecated
public final class DateMidnight extends BaseDateTime implements C12710j, Serializable {
    private static final long serialVersionUID = 156371964018738L;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = 257629620;
        private C12599c iField;
        private DateMidnight iInstant;

        public Property(DateMidnight dateMidnight, C12599c cVar) {
            this.iInstant = dateMidnight;
            this.iField = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (DateMidnight) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.iInstant.mo27913m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.mo28806I());
        }

        /* renamed from: C */
        public DateMidnight mo27680C(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28822a(dateMidnight.mo27912k(), i));
        }

        /* renamed from: D */
        public DateMidnight mo27681D(long j) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28823b(dateMidnight.mo27912k(), j));
        }

        /* renamed from: E */
        public DateMidnight mo27682E(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28825d(dateMidnight.mo27912k(), i));
        }

        /* renamed from: F */
        public DateMidnight mo27683F() {
            return this.iInstant;
        }

        /* renamed from: G */
        public DateMidnight mo27684G() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28811N(dateMidnight.mo27912k()));
        }

        /* renamed from: H */
        public DateMidnight mo27685H() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28812O(dateMidnight.mo27912k()));
        }

        /* renamed from: I */
        public DateMidnight mo27686I() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28813P(dateMidnight.mo27912k()));
        }

        /* renamed from: J */
        public DateMidnight mo27687J() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28814Q(dateMidnight.mo27912k()));
        }

        /* renamed from: K */
        public DateMidnight mo27688K() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28815R(dateMidnight.mo27912k()));
        }

        /* renamed from: L */
        public DateMidnight mo27689L(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28816S(dateMidnight.mo27912k(), i));
        }

        /* renamed from: M */
        public DateMidnight mo27690M(String str) {
            return mo27691N(str, (Locale) null);
        }

        /* renamed from: N */
        public DateMidnight mo27691N(String str, Locale locale) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.mo27654f3(this.iField.mo28818U(dateMidnight.mo27912k(), str, locale));
        }

        /* renamed from: O */
        public DateMidnight mo27692O() {
            return mo27689L(mo29063s());
        }

        /* renamed from: P */
        public DateMidnight mo27693P() {
            return mo27689L(mo29066v());
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

    public DateMidnight() {
    }

    /* renamed from: A2 */
    public static DateMidnight m51120A2(C12589a aVar) {
        if (aVar != null) {
            return new DateMidnight(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: B2 */
    public static DateMidnight m51121B2(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new DateMidnight(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: C2 */
    public static DateMidnight m51122C2(String str) {
        return m51123E2(str, C12683i.m54174D().mo29233Q());
    }

    /* renamed from: E2 */
    public static DateMidnight m51123E2(String str, C12674b bVar) {
        return bVar.mo29251n(str).mo27748e3();
    }

    /* renamed from: z2 */
    public static DateMidnight m51124z2() {
        return new DateMidnight();
    }

    /* renamed from: F2 */
    public DateMidnight mo27630F2(long j) {
        return mo27648Z2(j, 1);
    }

    /* renamed from: G2 */
    public DateMidnight mo27631G2(C12711k kVar) {
        return mo27649a3(kVar, 1);
    }

    /* renamed from: H2 */
    public DateMidnight mo27632H2(C12715o oVar) {
        return mo27656h3(oVar, 1);
    }

    /* renamed from: I2 */
    public DateMidnight mo27633I2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28644j().mo28909b(mo27912k(), i));
    }

    /* renamed from: J2 */
    public DateMidnight mo27634J2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28620F().mo28909b(mo27912k(), i));
    }

    /* renamed from: K2 */
    public DateMidnight mo27635K2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28627M().mo28909b(mo27912k(), i));
    }

    /* renamed from: L2 */
    public DateMidnight mo27636L2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28634V().mo28909b(mo27912k(), i));
    }

    /* renamed from: N2 */
    public Property mo27637N2(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            C12599c F = dateTimeFieldType.mo27802F(mo27913m());
            if (F.mo28809L()) {
                return new Property(this, F);
            }
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: O2 */
    public Interval mo27638O2() {
        C12589a m = mo27913m();
        long k = mo27912k();
        return new Interval(k, DurationFieldType.m51456b().mo27877d(m).mo28909b(k, 1), m);
    }

    /* renamed from: P2 */
    public LocalDate mo27639P2() {
        return new LocalDate(mo27912k(), mo27913m());
    }

    @Deprecated
    /* renamed from: Q2 */
    public YearMonthDay mo27640Q2() {
        return new YearMonthDay(mo27912k(), mo27913m());
    }

    /* renamed from: R2 */
    public Property mo27641R2() {
        return new Property(this, mo27913m().mo28626L());
    }

    /* renamed from: S2 */
    public Property mo27642S2() {
        return new Property(this, mo27913m().mo28628N());
    }

    /* renamed from: U2 */
    public DateMidnight mo27643U2(int i) {
        return mo27654f3(mo27913m().mo28638d().mo28816S(mo27912k(), i));
    }

    /* renamed from: V2 */
    public DateMidnight mo27644V2(C12589a aVar) {
        return aVar == mo27913m() ? this : new DateMidnight(mo27912k(), aVar);
    }

    /* renamed from: W2 */
    public DateMidnight mo27645W2(int i) {
        return mo27654f3(mo27913m().mo28641g().mo28816S(mo27912k(), i));
    }

    /* renamed from: X2 */
    public DateMidnight mo27646X2(int i) {
        return mo27654f3(mo27913m().mo28642h().mo28816S(mo27912k(), i));
    }

    /* renamed from: Y2 */
    public DateMidnight mo27647Y2(int i) {
        return mo27654f3(mo27913m().mo28643i().mo28816S(mo27912k(), i));
    }

    /* renamed from: Z2 */
    public DateMidnight mo27648Z2(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28635a(mo27912k(), j, i));
    }

    /* renamed from: a3 */
    public DateMidnight mo27649a3(C12711k kVar, int i) {
        return (kVar == null || i == 0) ? this : mo27648Z2(kVar.mo28667k(), i);
    }

    /* renamed from: b3 */
    public DateMidnight mo27650b3(int i) {
        return mo27654f3(mo27913m().mo28645k().mo28816S(mo27912k(), i));
    }

    /* renamed from: c3 */
    public DateMidnight mo27651c3(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return mo27654f3(dateTimeFieldType.mo27802F(mo27913m()).mo28816S(mo27912k(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    /* renamed from: d3 */
    public DateMidnight mo27652d3(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            return mo27654f3(durationFieldType.mo27877d(mo27913m()).mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: e3 */
    public DateMidnight mo27653e3(C12714n nVar) {
        return nVar == null ? this : mo27654f3(mo27913m().mo28624J(nVar, mo27912k()));
    }

    /* renamed from: f3 */
    public DateMidnight mo27654f3(long j) {
        C12589a m = mo27913m();
        long i2 = mo27657i2(j, m);
        if (i2 == mo27912k()) {
            return this;
        }
        return new DateMidnight(i2, m);
    }

    /* renamed from: g3 */
    public DateMidnight mo27655g3(int i) {
        return mo27654f3(mo27913m().mo28619E().mo28816S(mo27912k(), i));
    }

    /* renamed from: h3 */
    public DateMidnight mo27656h3(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28636b(oVar, mo27912k(), i));
    }

    /* renamed from: i2 */
    public long mo27657i2(long j, C12589a aVar) {
        return aVar.mo28641g().mo28812O(j);
    }

    /* renamed from: i3 */
    public DateMidnight mo27658i3(int i) {
        return mo27654f3(mo27913m().mo28626L().mo28816S(mo27912k(), i));
    }

    /* renamed from: j2 */
    public Property mo27659j2() {
        return new Property(this, mo27913m().mo28638d());
    }

    /* renamed from: j3 */
    public DateMidnight mo27660j3(int i) {
        return mo27654f3(mo27913m().mo28628N().mo28816S(mo27912k(), i));
    }

    /* renamed from: k2 */
    public Property mo27661k2() {
        return new Property(this, mo27913m().mo28641g());
    }

    /* renamed from: k3 */
    public DateMidnight mo27662k3(int i) {
        return mo27654f3(mo27913m().mo28631S().mo28816S(mo27912k(), i));
    }

    /* renamed from: l3 */
    public DateMidnight mo27663l3(int i) {
        return mo27654f3(mo27913m().mo28632T().mo28816S(mo27912k(), i));
    }

    /* renamed from: m3 */
    public DateMidnight mo27664m3(int i) {
        return mo27654f3(mo27913m().mo28633U().mo28816S(mo27912k(), i));
    }

    /* renamed from: n2 */
    public Property mo27665n2() {
        return new Property(this, mo27913m().mo28642h());
    }

    /* renamed from: n3 */
    public DateMidnight mo27666n3(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        DateTimeZone o2 = C12641d.m53380o(mo28742K1());
        if (o == o2) {
            return this;
        }
        return new DateMidnight(o2.mo27825r(o, mo27912k()), mo27913m().mo27835R(o));
    }

    /* renamed from: o2 */
    public Property mo27667o2() {
        return new Property(this, mo27913m().mo28643i());
    }

    /* renamed from: o3 */
    public Property mo27668o3() {
        return new Property(this, mo27913m().mo28631S());
    }

    /* renamed from: p2 */
    public Property mo27669p2() {
        return new Property(this, mo27913m().mo28645k());
    }

    /* renamed from: p3 */
    public Property mo27670p3() {
        return new Property(this, mo27913m().mo28632T());
    }

    /* renamed from: q2 */
    public DateMidnight mo27671q2(long j) {
        return mo27648Z2(j, -1);
    }

    /* renamed from: q3 */
    public Property mo27672q3() {
        return new Property(this, mo27913m().mo28633U());
    }

    /* renamed from: r2 */
    public DateMidnight mo27673r2(C12711k kVar) {
        return mo27649a3(kVar, -1);
    }

    /* renamed from: s2 */
    public DateMidnight mo27674s2(C12715o oVar) {
        return mo27656h3(oVar, -1);
    }

    /* renamed from: t2 */
    public DateMidnight mo27675t2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28644j().mo29038p0(mo27912k(), i));
    }

    /* renamed from: u2 */
    public DateMidnight mo27676u2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28620F().mo29038p0(mo27912k(), i));
    }

    /* renamed from: v2 */
    public DateMidnight mo27677v2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28627M().mo29038p0(mo27912k(), i));
    }

    /* renamed from: w2 */
    public DateMidnight mo27678w2(int i) {
        if (i == 0) {
            return this;
        }
        return mo27654f3(mo27913m().mo28634V().mo29038p0(mo27912k(), i));
    }

    /* renamed from: x2 */
    public Property mo27679x2() {
        return new Property(this, mo27913m().mo28619E());
    }

    public DateMidnight(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public DateMidnight(C12589a aVar) {
        super(aVar);
    }

    public DateMidnight(long j) {
        super(j);
    }

    public DateMidnight(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateMidnight(long j, C12589a aVar) {
        super(j, aVar);
    }

    public DateMidnight(Object obj) {
        super(obj, (C12589a) null);
    }

    public DateMidnight(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateMidnight(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar));
    }

    public DateMidnight(int i, int i2, int i3) {
        super(i, i2, i3, 0, 0, 0, 0);
    }

    public DateMidnight(int i, int i2, int i3, DateTimeZone dateTimeZone) {
        super(i, i2, i3, 0, 0, 0, 0, dateTimeZone);
    }

    public DateMidnight(int i, int i2, int i3, C12589a aVar) {
        super(i, i2, i3, 0, 0, 0, 0, aVar);
    }
}
