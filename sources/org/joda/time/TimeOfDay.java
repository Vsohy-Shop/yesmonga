package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C12648a;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12683i;

@Deprecated
public final class TimeOfDay extends BasePartial implements C12714n, Serializable {

    /* renamed from: a */
    public static final DateTimeFieldType[] f30798a = {DateTimeFieldType.m51310J(), DateTimeFieldType.m51315P(), DateTimeFieldType.m51318S(), DateTimeFieldType.m51313N()};

    /* renamed from: b */
    public static final TimeOfDay f30799b = new TimeOfDay(0, 0, 0, 0);

    /* renamed from: c */
    public static final int f30800c = 0;

    /* renamed from: d */
    public static final int f30801d = 1;

    /* renamed from: e */
    public static final int f30802e = 2;

    /* renamed from: f */
    public static final int f30803f = 3;
    private static final long serialVersionUID = 3633353405803318660L;

    @Deprecated
    public static class Property extends C12648a implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public Property(TimeOfDay timeOfDay, int i) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i;
        }

        /* renamed from: A */
        public TimeOfDay mo28514A(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, mo28214j().mo28820W(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.mo28389w(), str, locale));
        }

        /* renamed from: B */
        public TimeOfDay mo28515B() {
            return mo28521y(mo29109n());
        }

        /* renamed from: C */
        public TimeOfDay mo28516C() {
            return mo28521y(mo29111p());
        }

        /* renamed from: c */
        public int mo28213c() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        /* renamed from: j */
        public C12599c mo28214j() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        /* renamed from: t */
        public C12714n mo28215t() {
            return this.iTimeOfDay;
        }

        /* renamed from: u */
        public TimeOfDay mo28517u(int i) {
            return new TimeOfDay(this.iTimeOfDay, mo28214j().mo28824c(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.mo28389w(), i));
        }

        /* renamed from: v */
        public TimeOfDay mo28518v(int i) {
            return new TimeOfDay(this.iTimeOfDay, mo28214j().mo28827f(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.mo28389w(), i));
        }

        /* renamed from: w */
        public TimeOfDay mo28519w(int i) {
            return new TimeOfDay(this.iTimeOfDay, mo28214j().mo28826e(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.mo28389w(), i));
        }

        /* renamed from: x */
        public TimeOfDay mo28520x() {
            return this.iTimeOfDay;
        }

        /* renamed from: y */
        public TimeOfDay mo28521y(int i) {
            return new TimeOfDay(this.iTimeOfDay, mo28214j().mo28819V(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.mo28389w(), i));
        }

        /* renamed from: z */
        public TimeOfDay mo28522z(String str) {
            return mo28514A(str, (Locale) null);
        }
    }

    public TimeOfDay() {
    }

    /* renamed from: n0 */
    public static TimeOfDay m52199n0(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: o0 */
    public static TimeOfDay m52200o0(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: p0 */
    public static TimeOfDay m52201p0(long j) {
        return m52202t0(j, (C12589a) null);
    }

    /* renamed from: t0 */
    public static TimeOfDay m52202t0(long j, C12589a aVar) {
        return new TimeOfDay(j, C12641d.m53370e(aVar).mo27834Q());
    }

    /* renamed from: A0 */
    public Property mo28484A0() {
        return new Property(this, 3);
    }

    /* renamed from: A1 */
    public TimeOfDay mo28485A1(C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        if (Q == mo27982m()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, Q);
        Q.mo28625K(timeOfDay, mo28389w());
        return timeOfDay;
    }

    /* renamed from: B1 */
    public TimeOfDay mo28486B1(DateTimeFieldType dateTimeFieldType, int i) {
        int M = mo28783M(dateTimeFieldType);
        if (i == getValue(M)) {
            return this;
        }
        return new TimeOfDay(this, getField(M).mo28819V(this, M, mo28389w(), i));
    }

    /* renamed from: C0 */
    public TimeOfDay mo28487C0(C12715o oVar) {
        return mo28496M1(oVar, -1);
    }

    /* renamed from: F0 */
    public TimeOfDay mo28488F0(int i) {
        return mo28489F1(DurationFieldType.m51459g(), C12652e.m53802l(i));
    }

    /* renamed from: F1 */
    public TimeOfDay mo28489F1(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(Q).mo28827f(this, Q, mo28389w(), i));
    }

    /* renamed from: G1 */
    public TimeOfDay mo28490G1(int i) {
        return new TimeOfDay(this, mo27982m().mo28655v().mo28819V(this, 0, mo28389w(), i));
    }

    /* renamed from: H0 */
    public TimeOfDay mo28491H0(int i) {
        return mo28489F1(DurationFieldType.m51460i(), C12652e.m53802l(i));
    }

    /* renamed from: H1 */
    public TimeOfDay mo28492H1(int i) {
        return new TimeOfDay(this, mo27982m().mo28615A().mo28819V(this, 3, mo28389w(), i));
    }

    /* renamed from: K0 */
    public TimeOfDay mo28493K0(int i) {
        return mo28489F1(DurationFieldType.m51461j(), C12652e.m53802l(i));
    }

    /* renamed from: L0 */
    public TimeOfDay mo28494L0(int i) {
        return mo28489F1(DurationFieldType.m51463l(), C12652e.m53802l(i));
    }

    /* renamed from: L1 */
    public TimeOfDay mo28495L1(int i) {
        return new TimeOfDay(this, mo27982m().mo28617C().mo28819V(this, 1, mo28389w(), i));
    }

    /* renamed from: M1 */
    public TimeOfDay mo28496M1(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        int[] w = mo28389w();
        for (int i2 = 0; i2 < oVar.size(); i2++) {
            int z = mo28793z(oVar.mo28702t(i2));
            if (z >= 0) {
                w = getField(z).mo28827f(this, z, w, C12652e.m53798h(oVar.getValue(i2), i));
            }
        }
        return new TimeOfDay(this, w);
    }

    /* renamed from: N0 */
    public Property mo28497N0() {
        return new Property(this, 1);
    }

    /* renamed from: O0 */
    public TimeOfDay mo28498O0(C12715o oVar) {
        return mo28496M1(oVar, 1);
    }

    /* renamed from: R0 */
    public TimeOfDay mo28499R0(int i) {
        return mo28489F1(DurationFieldType.m51459g(), i);
    }

    /* renamed from: T1 */
    public TimeOfDay mo28500T1(int i) {
        return new TimeOfDay(this, mo27982m().mo28622H().mo28819V(this, 2, mo28389w(), i));
    }

    /* renamed from: U0 */
    public TimeOfDay mo28501U0(int i) {
        return mo28489F1(DurationFieldType.m51460i(), i);
    }

    /* renamed from: V1 */
    public int mo28502V1() {
        return getValue(0);
    }

    /* renamed from: c1 */
    public TimeOfDay mo28503c1(int i) {
        return mo28489F1(DurationFieldType.m51461j(), i);
    }

    /* renamed from: e1 */
    public int mo28504e1() {
        return getValue(1);
    }

    /* renamed from: f2 */
    public int mo28505f2() {
        return getValue(2);
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

    /* renamed from: h1 */
    public int mo28506h1() {
        return getValue(3);
    }

    /* renamed from: j1 */
    public TimeOfDay mo28507j1(int i) {
        return mo28489F1(DurationFieldType.m51463l(), i);
    }

    /* renamed from: k1 */
    public Property mo28508k1(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, mo28783M(dateTimeFieldType));
    }

    /* renamed from: n1 */
    public Property mo28509n1() {
        return new Property(this, 2);
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        return (DateTimeFieldType[]) f30798a.clone();
    }

    /* renamed from: q1 */
    public DateTime mo28510q1() {
        return mo28512w1((DateTimeZone) null);
    }

    public int size() {
        return 4;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return f30798a[i];
    }

    public String toString() {
        return C12683i.m54187Q().mo29260w(this);
    }

    /* renamed from: u0 */
    public Property mo28511u0() {
        return new Property(this, 0);
    }

    /* renamed from: w1 */
    public DateTime mo28512w1(DateTimeZone dateTimeZone) {
        C12589a R = mo27982m().mo27835R(dateTimeZone);
        return new DateTime(R.mo28624J(this, C12641d.m53368c()), R);
    }

    /* renamed from: z1 */
    public LocalTime mo28513z1() {
        return new LocalTime(mo28502V1(), mo28504e1(), mo28505f2(), mo28506h1(), mo27982m());
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super((C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public TimeOfDay(C12589a aVar) {
        super(aVar);
    }

    public TimeOfDay(long j) {
        super(j);
    }

    public TimeOfDay(long j, C12589a aVar) {
        super(j, aVar);
    }

    public TimeOfDay(Object obj) {
        super(obj, (C12589a) null, C12683i.m54193W());
    }

    public TimeOfDay(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar), C12683i.m54193W());
    }

    public TimeOfDay(int i, int i2) {
        this(i, i2, 0, 0, (C12589a) null);
    }

    public TimeOfDay(int i, int i2, C12589a aVar) {
        this(i, i2, 0, 0, aVar);
    }

    public TimeOfDay(int i, int i2, int i3) {
        this(i, i2, i3, 0, (C12589a) null);
    }

    public TimeOfDay(int i, int i2, int i3, C12589a aVar) {
        this(i, i2, i3, 0, aVar);
    }

    public TimeOfDay(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (C12589a) null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4, C12589a aVar) {
        super(new int[]{i, i2, i3, i4}, aVar);
    }

    public TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super((BasePartial) timeOfDay, iArr);
    }

    public TimeOfDay(TimeOfDay timeOfDay, C12589a aVar) {
        super((BasePartial) timeOfDay, aVar);
    }
}
