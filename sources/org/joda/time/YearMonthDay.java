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
public final class YearMonthDay extends BasePartial implements C12714n, Serializable {

    /* renamed from: a */
    public static final DateTimeFieldType[] f30815a = {DateTimeFieldType.m51322W(), DateTimeFieldType.m51316Q(), DateTimeFieldType.m51305A()};

    /* renamed from: b */
    public static final int f30816b = 0;

    /* renamed from: c */
    public static final int f30817c = 1;

    /* renamed from: d */
    public static final int f30818d = 2;
    private static final long serialVersionUID = 797544782896179L;

    @Deprecated
    public static class Property extends C12648a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        public Property(YearMonthDay yearMonthDay, int i) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i;
        }

        /* renamed from: A */
        public YearMonthDay mo28597A() {
            return mo28602x(mo29109n());
        }

        /* renamed from: B */
        public YearMonthDay mo28598B() {
            return mo28602x(mo29111p());
        }

        /* renamed from: c */
        public int mo28213c() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        /* renamed from: j */
        public C12599c mo28214j() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        /* renamed from: t */
        public C12714n mo28215t() {
            return this.iYearMonthDay;
        }

        /* renamed from: u */
        public YearMonthDay mo28599u(int i) {
            return new YearMonthDay(this.iYearMonthDay, mo28214j().mo28824c(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.mo28389w(), i));
        }

        /* renamed from: v */
        public YearMonthDay mo28600v(int i) {
            return new YearMonthDay(this.iYearMonthDay, mo28214j().mo28826e(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.mo28389w(), i));
        }

        /* renamed from: w */
        public YearMonthDay mo28601w() {
            return this.iYearMonthDay;
        }

        /* renamed from: x */
        public YearMonthDay mo28602x(int i) {
            return new YearMonthDay(this.iYearMonthDay, mo28214j().mo28819V(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.mo28389w(), i));
        }

        /* renamed from: y */
        public YearMonthDay mo28603y(String str) {
            return mo28604z(str, (Locale) null);
        }

        /* renamed from: z */
        public YearMonthDay mo28604z(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, mo28214j().mo28820W(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.mo28389w(), str, locale));
        }
    }

    public YearMonthDay() {
    }

    /* renamed from: o0 */
    public static YearMonthDay m52319o0(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: p0 */
    public static YearMonthDay m52320p0(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* renamed from: A0 */
    public YearMonthDay mo28564A0(int i) {
        return mo28576L1(DurationFieldType.m51462k(), C12652e.m53802l(i));
    }

    /* renamed from: A1 */
    public Interval mo28565A1(DateTimeZone dateTimeZone) {
        return mo28583U0(C12641d.m53380o(dateTimeZone)).mo27638O2();
    }

    /* renamed from: B0 */
    public int mo28566B0() {
        return getValue(1);
    }

    /* renamed from: B1 */
    public LocalDate mo28567B1() {
        return new LocalDate(getYear(), mo28566B0(), mo28581R1(), mo27982m());
    }

    /* renamed from: C0 */
    public YearMonthDay mo28568C0(int i) {
        return mo28576L1(DurationFieldType.m51466o(), C12652e.m53802l(i));
    }

    /* renamed from: F0 */
    public Property mo28569F0() {
        return new Property(this, 1);
    }

    /* renamed from: F1 */
    public YearMonthDay mo28570F1(C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        if (Q == mo27982m()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, Q);
        Q.mo28625K(yearMonthDay, mo28389w());
        return yearMonthDay;
    }

    /* renamed from: G1 */
    public YearMonthDay mo28571G1(int i) {
        return new YearMonthDay(this, mo27982m().mo28641g().mo28819V(this, 2, mo28389w(), i));
    }

    /* renamed from: H0 */
    public YearMonthDay mo28572H0(C12715o oVar) {
        return mo28582T1(oVar, 1);
    }

    /* renamed from: H1 */
    public YearMonthDay mo28573H1(DateTimeFieldType dateTimeFieldType, int i) {
        int M = mo28783M(dateTimeFieldType);
        if (i == getValue(M)) {
            return this;
        }
        return new YearMonthDay(this, getField(M).mo28819V(this, M, mo28389w(), i));
    }

    /* renamed from: K0 */
    public YearMonthDay mo28574K0(int i) {
        return mo28576L1(DurationFieldType.m51456b(), i);
    }

    /* renamed from: L0 */
    public YearMonthDay mo28575L0(int i) {
        return mo28576L1(DurationFieldType.m51462k(), i);
    }

    /* renamed from: L1 */
    public YearMonthDay mo28576L1(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(Q).mo28824c(this, Q, mo28389w(), i));
    }

    /* renamed from: M1 */
    public YearMonthDay mo28577M1(int i) {
        return new YearMonthDay(this, mo27982m().mo28619E().mo28819V(this, 1, mo28389w(), i));
    }

    /* renamed from: N0 */
    public YearMonthDay mo28578N0(int i) {
        return mo28576L1(DurationFieldType.m51466o(), i);
    }

    /* renamed from: O0 */
    public Property mo28579O0(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, mo28783M(dateTimeFieldType));
    }

    /* renamed from: R0 */
    public DateMidnight mo28580R0() {
        return mo28583U0((DateTimeZone) null);
    }

    /* renamed from: R1 */
    public int mo28581R1() {
        return getValue(2);
    }

    /* renamed from: T1 */
    public YearMonthDay mo28582T1(C12715o oVar, int i) {
        if (oVar == null || i == 0) {
            return this;
        }
        int[] w = mo28389w();
        for (int i2 = 0; i2 < oVar.size(); i2++) {
            int z = mo28793z(oVar.mo28702t(i2));
            if (z >= 0) {
                w = getField(z).mo28824c(this, z, w, C12652e.m53798h(oVar.getValue(i2), i));
            }
        }
        return new YearMonthDay(this, w);
    }

    /* renamed from: U0 */
    public DateMidnight mo28583U0(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), mo28566B0(), mo28581R1(), mo27982m().mo27835R(dateTimeZone));
    }

    /* renamed from: X1 */
    public YearMonthDay mo28584X1(int i) {
        return new YearMonthDay(this, mo27982m().mo28631S().mo28819V(this, 0, mo28389w(), i));
    }

    /* renamed from: Y1 */
    public Property mo28585Y1() {
        return new Property(this, 0);
    }

    /* renamed from: c1 */
    public DateTime mo28586c1(TimeOfDay timeOfDay) {
        return mo28588j1(timeOfDay, (DateTimeZone) null);
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

    public int getYear() {
        return getValue(0);
    }

    /* renamed from: j1 */
    public DateTime mo28588j1(TimeOfDay timeOfDay, DateTimeZone dateTimeZone) {
        C12589a R = mo27982m().mo27835R(dateTimeZone);
        long J = R.mo28624J(this, C12641d.m53368c());
        if (timeOfDay != null) {
            J = R.mo28624J(timeOfDay, J);
        }
        return new DateTime(J, R);
    }

    /* renamed from: k1 */
    public DateTime mo28589k1() {
        return mo28591n1((DateTimeZone) null);
    }

    /* renamed from: n0 */
    public Property mo28590n0() {
        return new Property(this, 2);
    }

    /* renamed from: n1 */
    public DateTime mo28591n1(DateTimeZone dateTimeZone) {
        C12589a R = mo27982m().mo27835R(dateTimeZone);
        return new DateTime(R.mo28624J(this, C12641d.m53368c()), R);
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        return (DateTimeFieldType[]) f30815a.clone();
    }

    /* renamed from: q1 */
    public DateTime mo28592q1() {
        return mo28595w1((DateTimeZone) null);
    }

    public int size() {
        return 3;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return f30815a[i];
    }

    /* renamed from: t0 */
    public YearMonthDay mo28593t0(C12715o oVar) {
        return mo28582T1(oVar, -1);
    }

    public String toString() {
        return C12683i.m54208f0().mo29260w(this);
    }

    /* renamed from: u0 */
    public YearMonthDay mo28594u0(int i) {
        return mo28576L1(DurationFieldType.m51456b(), C12652e.m53802l(i));
    }

    /* renamed from: w1 */
    public DateTime mo28595w1(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), mo28566B0(), mo28581R1(), 0, 0, 0, 0, mo27982m().mo27835R(dateTimeZone));
    }

    /* renamed from: z1 */
    public Interval mo28596z1() {
        return mo28565A1((DateTimeZone) null);
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super((C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public YearMonthDay(C12589a aVar) {
        super(aVar);
    }

    public YearMonthDay(long j) {
        super(j);
    }

    public YearMonthDay(long j, C12589a aVar) {
        super(j, aVar);
    }

    public YearMonthDay(Object obj) {
        super(obj, (C12589a) null, C12683i.m54228z());
    }

    public YearMonthDay(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar), C12683i.m54228z());
    }

    public YearMonthDay(int i, int i2, int i3) {
        this(i, i2, i3, (C12589a) null);
    }

    public YearMonthDay(int i, int i2, int i3, C12589a aVar) {
        super(new int[]{i, i2, i3}, aVar);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super((BasePartial) yearMonthDay, iArr);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, C12589a aVar) {
        super((BasePartial) yearMonthDay, aVar);
    }
}
