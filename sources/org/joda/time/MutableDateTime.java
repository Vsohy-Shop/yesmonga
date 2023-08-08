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
import org.joda.time.field.C12652e;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public class MutableDateTime extends BaseDateTime implements C12647f, Cloneable, Serializable {

    /* renamed from: a */
    public static final int f30757a = 0;

    /* renamed from: b */
    public static final int f30758b = 1;

    /* renamed from: c */
    public static final int f30759c = 2;

    /* renamed from: d */
    public static final int f30760d = 3;

    /* renamed from: e */
    public static final int f30761e = 4;

    /* renamed from: f */
    public static final int f30762f = 5;
    private static final long serialVersionUID = 2852608688135209575L;
    private C12599c iRoundingField;
    private int iRoundingMode;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private C12599c iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, C12599c cVar) {
            this.iInstant = mutableDateTime;
            this.iField = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).mo27802F(this.iInstant.mo27913m());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.mo28806I());
        }

        /* renamed from: C */
        public MutableDateTime mo28299C(int i) {
            this.iInstant.mo28255Q0(mo27695m().mo28822a(this.iInstant.mo27912k(), i));
            return this.iInstant;
        }

        /* renamed from: D */
        public MutableDateTime mo28300D(long j) {
            this.iInstant.mo28255Q0(mo27695m().mo28823b(this.iInstant.mo27912k(), j));
            return this.iInstant;
        }

        /* renamed from: E */
        public MutableDateTime mo28301E(int i) {
            this.iInstant.mo28255Q0(mo27695m().mo28825d(this.iInstant.mo27912k(), i));
            return this.iInstant;
        }

        /* renamed from: F */
        public MutableDateTime mo28302F() {
            return this.iInstant;
        }

        /* renamed from: G */
        public MutableDateTime mo28303G() {
            this.iInstant.mo28255Q0(mo27695m().mo28811N(this.iInstant.mo27912k()));
            return this.iInstant;
        }

        /* renamed from: H */
        public MutableDateTime mo28304H() {
            this.iInstant.mo28255Q0(mo27695m().mo28812O(this.iInstant.mo27912k()));
            return this.iInstant;
        }

        /* renamed from: I */
        public MutableDateTime mo28305I() {
            this.iInstant.mo28255Q0(mo27695m().mo28813P(this.iInstant.mo27912k()));
            return this.iInstant;
        }

        /* renamed from: J */
        public MutableDateTime mo28306J() {
            this.iInstant.mo28255Q0(mo27695m().mo28814Q(this.iInstant.mo27912k()));
            return this.iInstant;
        }

        /* renamed from: K */
        public MutableDateTime mo28307K() {
            this.iInstant.mo28255Q0(mo27695m().mo28815R(this.iInstant.mo27912k()));
            return this.iInstant;
        }

        /* renamed from: L */
        public MutableDateTime mo28308L(int i) {
            this.iInstant.mo28255Q0(mo27695m().mo28816S(this.iInstant.mo27912k(), i));
            return this.iInstant;
        }

        /* renamed from: M */
        public MutableDateTime mo28309M(String str) {
            mo28310N(str, (Locale) null);
            return this.iInstant;
        }

        /* renamed from: N */
        public MutableDateTime mo28310N(String str, Locale locale) {
            this.iInstant.mo28255Q0(mo27695m().mo28818U(this.iInstant.mo27912k(), str, locale));
            return this.iInstant;
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

    public MutableDateTime() {
    }

    /* renamed from: A2 */
    public static MutableDateTime m51899A2() {
        return new MutableDateTime();
    }

    /* renamed from: B2 */
    public static MutableDateTime m51900B2(C12589a aVar) {
        if (aVar != null) {
            return new MutableDateTime(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: C2 */
    public static MutableDateTime m51901C2(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MutableDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: E2 */
    public static MutableDateTime m51902E2(String str) {
        return m51903F2(str, C12683i.m54174D().mo29233Q());
    }

    /* renamed from: F2 */
    public static MutableDateTime m51903F2(String str, C12674b bVar) {
        return bVar.mo29251n(str).mo27911P0();
    }

    /* renamed from: C */
    public void mo28232C(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28618D().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: C1 */
    public void mo28233C1(int i) {
        mo28255Q0(mo27913m().mo28643i().mo28816S(mo27912k(), i));
    }

    /* renamed from: D0 */
    public void mo28234D0(int i) {
        mo28255Q0(mo27913m().mo28616B().mo28816S(mo27912k(), i));
    }

    /* renamed from: D1 */
    public void mo28235D1(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28630P().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: E0 */
    public void mo28236E0(int i, int i2, int i3) {
        mo28245J2(mo27913m().mo28650p(i, i2, i3, 0));
    }

    /* renamed from: F */
    public void mo28237F(C12715o oVar) {
        mo28267b0(oVar, 1);
    }

    /* renamed from: G2 */
    public Property mo28238G2(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            C12599c F = dateTimeFieldType.mo27802F(mo27913m());
            if (F.mo28809L()) {
                return new Property(this, F);
            }
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: H */
    public void mo28239H(C12589a aVar) {
        super.mo28239H(aVar);
    }

    /* renamed from: H2 */
    public Property mo28240H2() {
        return new Property(this, mo27913m().mo28621G());
    }

    /* renamed from: I2 */
    public Property mo28241I2() {
        return new Property(this, mo27913m().mo28622H());
    }

    /* renamed from: J */
    public void mo28242J(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28627M().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: J0 */
    public void mo28243J0(int i) {
        mo28255Q0(mo27913m().mo28626L().mo28816S(mo27912k(), i));
    }

    /* renamed from: J1 */
    public void mo28244J1(int i) {
        mo28255Q0(mo27913m().mo28655v().mo28816S(mo27912k(), i));
    }

    /* renamed from: J2 */
    public void mo28245J2(long j) {
        mo28255Q0(mo27913m().mo28659z().mo28816S(j, mo28722p1()));
    }

    /* renamed from: K2 */
    public void mo28246K2(C12712l lVar) {
        DateTimeZone s;
        long j = C12641d.m53375j(lVar);
        if ((lVar instanceof C12710j) && (s = C12641d.m53370e(((C12710j) lVar).mo27913m()).mo27836s()) != null) {
            j = s.mo27825r(mo28742K1(), j);
        }
        mo28245J2(j);
    }

    /* renamed from: L */
    public void mo28247L(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28634V().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: L2 */
    public void mo28248L2(C12599c cVar) {
        mo28250N2(cVar, 1);
    }

    /* renamed from: N */
    public void mo28249N(long j) {
        mo28255Q0(C12652e.m53795e(mo27912k(), j));
    }

    /* renamed from: N2 */
    public void mo28250N2(C12599c cVar, int i) {
        C12599c cVar2;
        if (cVar == null || (i >= 0 && i <= 5)) {
            if (i == 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            this.iRoundingField = cVar2;
            if (cVar == null) {
                i = 0;
            }
            this.iRoundingMode = i;
            mo28255Q0(mo27912k());
            return;
        }
        throw new IllegalArgumentException("Illegal rounding mode: " + i);
    }

    /* renamed from: O */
    public void mo28251O(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28623I().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: O2 */
    public void mo28252O2(long j) {
        mo28255Q0(mo27913m().mo28659z().mo28816S(mo27912k(), ISOChronology.m52935c0().mo28659z().mo28828g(j)));
    }

    /* renamed from: P */
    public void mo28253P(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28644j().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: P2 */
    public void mo28254P2(C12712l lVar) {
        long j = C12641d.m53375j(lVar);
        DateTimeZone s = C12641d.m53374i(lVar).mo27836s();
        if (s != null) {
            j = s.mo27825r(DateTimeZone.f30651a, j);
        }
        mo28252O2(j);
    }

    /* renamed from: Q0 */
    public void mo28255Q0(long j) {
        int i = this.iRoundingMode;
        if (i == 1) {
            j = this.iRoundingField.mo28812O(j);
        } else if (i == 2) {
            j = this.iRoundingField.mo28811N(j);
        } else if (i == 3) {
            j = this.iRoundingField.mo28815R(j);
        } else if (i == 4) {
            j = this.iRoundingField.mo28813P(j);
        } else if (i == 5) {
            j = this.iRoundingField.mo28814Q(j);
        }
        super.mo28255Q0(j);
    }

    /* renamed from: Q2 */
    public Property mo28256Q2() {
        return new Property(this, mo27913m().mo28626L());
    }

    /* renamed from: R2 */
    public Property mo28257R2() {
        return new Property(this, mo27913m().mo28628N());
    }

    /* renamed from: S2 */
    public Property mo28258S2() {
        return new Property(this, mo27913m().mo28631S());
    }

    /* renamed from: U */
    public void mo28259U(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28658y().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: U1 */
    public void mo28260U1(int i, int i2, int i3, int i4) {
        mo28255Q0(mo27913m().mo28652r(mo27912k(), i, i2, i3, i4));
    }

    /* renamed from: U2 */
    public Property mo28261U2() {
        return new Property(this, mo27913m().mo28632T());
    }

    /* renamed from: V2 */
    public Property mo28262V2() {
        return new Property(this, mo27913m().mo28633U());
    }

    /* renamed from: X0 */
    public void mo28263X0(int i) {
        mo28255Q0(mo27913m().mo28615A().mo28816S(mo27912k(), i));
    }

    /* renamed from: Y */
    public void mo28264Y(int i) {
        mo28255Q0(mo27913m().mo28621G().mo28816S(mo27912k(), i));
    }

    /* renamed from: Y0 */
    public void mo28265Y0(int i) {
        mo28255Q0(mo27913m().mo28617C().mo28816S(mo27912k(), i));
    }

    /* renamed from: a0 */
    public void mo28266a0(C12711k kVar) {
        mo28272d1(kVar, 1);
    }

    /* renamed from: b0 */
    public void mo28267b0(C12715o oVar, int i) {
        if (oVar != null) {
            mo28255Q0(mo27913m().mo28636b(oVar, mo27912k(), i));
        }
    }

    /* renamed from: b2 */
    public void mo28268b2(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            mo28255Q0(dateTimeFieldType.mo27802F(mo27913m()).mo28816S(mo27912k(), i));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    /* renamed from: c */
    public void mo28269c(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i != 0) {
            mo28255Q0(durationFieldType.mo27877d(mo27913m()).mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: c0 */
    public void mo28270c0(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        C12589a m = mo27913m();
        if (m.mo27836s() != o) {
            mo28239H(m.mo27835R(o));
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    /* renamed from: d1 */
    public void mo28272d1(C12711k kVar, int i) {
        if (kVar != null) {
            mo28249N(C12652e.m53799i(kVar.mo28667k(), i));
        }
    }

    /* renamed from: f1 */
    public void mo28273f1(int i) {
        mo28255Q0(mo27913m().mo28628N().mo28816S(mo27912k(), i));
    }

    /* renamed from: j2 */
    public Property mo28274j2() {
        return new Property(this, mo27913m().mo28638d());
    }

    /* renamed from: k2 */
    public MutableDateTime mo28275k2() {
        return (MutableDateTime) clone();
    }

    /* renamed from: m1 */
    public void mo28276m1(int i) {
        mo28255Q0(mo27913m().mo28619E().mo28816S(mo27912k(), i));
    }

    /* renamed from: n2 */
    public Property mo28277n2() {
        return new Property(this, mo27913m().mo28641g());
    }

    /* renamed from: o1 */
    public void mo28278o1(int i) {
        mo28255Q0(mo27913m().mo28642h().mo28816S(mo27912k(), i));
    }

    /* renamed from: o2 */
    public Property mo28279o2() {
        return new Property(this, mo27913m().mo28642h());
    }

    /* renamed from: p2 */
    public Property mo28280p2() {
        return new Property(this, mo27913m().mo28643i());
    }

    /* renamed from: q0 */
    public void mo28281q0(int i) {
        mo28255Q0(mo27913m().mo28622H().mo28816S(mo27912k(), i));
    }

    /* renamed from: q2 */
    public Property mo28282q2() {
        return new Property(this, mo27913m().mo28645k());
    }

    /* renamed from: r0 */
    public void mo28283r0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        mo28255Q0(mo27913m().mo28651q(i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: r2 */
    public C12599c mo28284r2() {
        return this.iRoundingField;
    }

    /* renamed from: s1 */
    public void mo28285s1(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        DateTimeZone o2 = C12641d.m53380o(mo28742K1());
        if (o != o2) {
            long r = o2.mo27825r(o, mo27912k());
            mo28239H(mo27913m().mo27835R(o));
            mo28255Q0(r);
        }
    }

    /* renamed from: s2 */
    public int mo28286s2() {
        return this.iRoundingMode;
    }

    /* renamed from: t2 */
    public Property mo28287t2() {
        return new Property(this, mo27913m().mo28655v());
    }

    /* renamed from: u */
    public void mo28288u(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28657x().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: u2 */
    public Property mo28289u2() {
        return new Property(this, mo27913m().mo28659z());
    }

    /* renamed from: v */
    public void mo28290v(int i) {
        if (i != 0) {
            mo28255Q0(mo27913m().mo28620F().mo28909b(mo27912k(), i));
        }
    }

    /* renamed from: v0 */
    public void mo28291v0(int i) {
        mo28255Q0(mo27913m().mo28659z().mo28816S(mo27912k(), i));
    }

    /* renamed from: v2 */
    public Property mo28292v2() {
        return new Property(this, mo27913m().mo28615A());
    }

    /* renamed from: w2 */
    public Property mo28293w2() {
        return new Property(this, mo27913m().mo28616B());
    }

    /* renamed from: x0 */
    public void mo28294x0(C12712l lVar) {
        mo28255Q0(C12641d.m53375j(lVar));
    }

    /* renamed from: x1 */
    public void mo28295x1(int i) {
        mo28255Q0(mo27913m().mo28641g().mo28816S(mo27912k(), i));
    }

    /* renamed from: x2 */
    public Property mo28296x2() {
        return new Property(this, mo27913m().mo28617C());
    }

    /* renamed from: y1 */
    public void mo28297y1(int i) {
        mo28255Q0(mo27913m().mo28631S().mo28816S(mo27912k(), i));
    }

    /* renamed from: z2 */
    public Property mo28298z2() {
        return new Property(this, mo27913m().mo28619E());
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public MutableDateTime(C12589a aVar) {
        super(aVar);
    }

    public MutableDateTime(long j) {
        super(j);
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public MutableDateTime(long j, C12589a aVar) {
        super(j, aVar);
    }

    public MutableDateTime(Object obj) {
        super(obj, (C12589a) null);
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public MutableDateTime(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar));
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C12589a aVar) {
        super(i, i2, i3, i4, i5, i6, i7, aVar);
    }
}
