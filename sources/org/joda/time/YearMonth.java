package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C12648a;
import org.joda.time.field.C12652e;
import org.joda.time.format.C12671a;
import org.joda.time.format.C12674b;
import org.joda.time.format.C12683i;

public final class YearMonth extends BasePartial implements C12714n, Serializable {

    /* renamed from: a */
    public static final DateTimeFieldType[] f30812a = {DateTimeFieldType.m51322W(), DateTimeFieldType.m51316Q()};

    /* renamed from: b */
    public static final int f30813b = 0;

    /* renamed from: c */
    public static final int f30814c = 1;
    private static final long serialVersionUID = 797544782896179L;

    public static class Property extends C12648a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public Property(YearMonth yearMonth, int i) {
            this.iBase = yearMonth;
            this.iFieldIndex = i;
        }

        /* renamed from: c */
        public int mo28213c() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        /* renamed from: j */
        public C12599c mo28214j() {
            return this.iBase.getField(this.iFieldIndex);
        }

        /* renamed from: t */
        public C12714n mo28215t() {
            return this.iBase;
        }

        /* renamed from: u */
        public YearMonth mo28558u(int i) {
            return new YearMonth(this.iBase, mo28214j().mo28824c(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: v */
        public YearMonth mo28559v(int i) {
            return new YearMonth(this.iBase, mo28214j().mo28826e(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: w */
        public YearMonth mo28560w() {
            return this.iBase;
        }

        /* renamed from: x */
        public YearMonth mo28561x(int i) {
            return new YearMonth(this.iBase, mo28214j().mo28819V(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: y */
        public YearMonth mo28562y(String str) {
            return mo28563z(str, (Locale) null);
        }

        /* renamed from: z */
        public YearMonth mo28563z(String str, Locale locale) {
            return new YearMonth(this.iBase, mo28214j().mo28820W(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), str, locale));
        }
    }

    public YearMonth() {
    }

    /* renamed from: C0 */
    public static YearMonth m52279C0() {
        return new YearMonth();
    }

    /* renamed from: F0 */
    public static YearMonth m52280F0(C12589a aVar) {
        if (aVar != null) {
            return new YearMonth(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: H0 */
    public static YearMonth m52281H0(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new YearMonth(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: K0 */
    public static YearMonth m52282K0(String str) {
        return m52283L0(str, C12683i.m54182L());
    }

    /* renamed from: L0 */
    public static YearMonth m52283L0(String str, C12674b bVar) {
        LocalDate p = bVar.mo29253p(str);
        return new YearMonth(p.getYear(), p.mo27935B0());
    }

    /* renamed from: n0 */
    public static YearMonth m52284n0(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: o0 */
    public static YearMonth m52285o0(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    private Object readResolve() {
        if (!DateTimeZone.f30651a.equals(mo27982m().mo27836s())) {
            return new YearMonth(this, mo27982m().mo27834Q());
        }
        return this;
    }

    /* renamed from: A0 */
    public Property mo28538A0() {
        return new Property(this, 1);
    }

    /* renamed from: A1 */
    public YearMonth mo28539A1(C12715o oVar, int i) {
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
        return new YearMonth(this, w);
    }

    /* renamed from: B0 */
    public int mo28540B0() {
        return getValue(1);
    }

    /* renamed from: B1 */
    public YearMonth mo28541B1(int i) {
        return new YearMonth(this, mo27982m().mo28631S().mo28819V(this, 0, mo28389w(), i));
    }

    /* renamed from: F1 */
    public Property mo28542F1() {
        return new Property(this, 0);
    }

    /* renamed from: N0 */
    public YearMonth mo28543N0(C12715o oVar) {
        return mo28539A1(oVar, 1);
    }

    /* renamed from: O0 */
    public YearMonth mo28544O0(int i) {
        return mo28556w1(DurationFieldType.m51462k(), i);
    }

    /* renamed from: R0 */
    public YearMonth mo28545R0(int i) {
        return mo28556w1(DurationFieldType.m51466o(), i);
    }

    /* renamed from: S1 */
    public String mo28198S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: U0 */
    public Property mo28546U0(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, mo28783M(dateTimeFieldType));
    }

    /* renamed from: c1 */
    public Interval mo28547c1() {
        return mo28549j1((DateTimeZone) null);
    }

    /* renamed from: g */
    public C12599c mo27972g(int i, C12589a aVar) {
        if (i == 0) {
            return aVar.mo28631S();
        }
        if (i == 1) {
            return aVar.mo28619E();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getYear() {
        return getValue(0);
    }

    /* renamed from: j1 */
    public Interval mo28549j1(DateTimeZone dateTimeZone) {
        DateTimeZone o = C12641d.m53380o(dateTimeZone);
        return new Interval((C12712l) mo28550k1(1).mo27978i2(o), (C12712l) mo28544O0(1).mo28550k1(1).mo27978i2(o));
    }

    /* renamed from: k1 */
    public LocalDate mo28550k1(int i) {
        return new LocalDate(getYear(), mo28540B0(), i, mo27982m());
    }

    /* renamed from: n1 */
    public YearMonth mo28551n1(C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        if (Q == mo27982m()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, Q);
        Q.mo28625K(yearMonth, mo28389w());
        return yearMonth;
    }

    /* renamed from: p0 */
    public YearMonth mo28552p0(C12715o oVar) {
        return mo28539A1(oVar, -1);
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        return (DateTimeFieldType[]) f30812a.clone();
    }

    /* renamed from: q1 */
    public YearMonth mo28553q1(DateTimeFieldType dateTimeFieldType, int i) {
        int M = mo28783M(dateTimeFieldType);
        if (i == getValue(M)) {
            return this;
        }
        return new YearMonth(this, getField(M).mo28819V(this, M, mo28389w(), i));
    }

    public int size() {
        return 2;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return f30812a[i];
    }

    /* renamed from: t0 */
    public YearMonth mo28554t0(int i) {
        return mo28556w1(DurationFieldType.m51462k(), C12652e.m53802l(i));
    }

    @ToString
    public String toString() {
        return C12683i.m54206e0().mo29260w(this);
    }

    /* renamed from: u0 */
    public YearMonth mo28555u0(int i) {
        return mo28556w1(DurationFieldType.m51466o(), C12652e.m53802l(i));
    }

    /* renamed from: w0 */
    public String mo28210w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    /* renamed from: w1 */
    public YearMonth mo28556w1(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonth(this, getField(Q).mo28824c(this, Q, mo28389w(), i));
    }

    /* renamed from: z1 */
    public YearMonth mo28557z1(int i) {
        return new YearMonth(this, mo27982m().mo28619E().mo28819V(this, 1, mo28389w(), i));
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super((C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public YearMonth(C12589a aVar) {
        super(aVar);
    }

    public YearMonth(long j) {
        super(j);
    }

    public YearMonth(long j, C12589a aVar) {
        super(j, aVar);
    }

    public YearMonth(Object obj) {
        super(obj, (C12589a) null, C12683i.m54182L());
    }

    public YearMonth(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar), C12683i.m54182L());
    }

    public YearMonth(int i, int i2) {
        this(i, i2, (C12589a) null);
    }

    public YearMonth(int i, int i2, C12589a aVar) {
        super(new int[]{i, i2}, aVar);
    }

    public YearMonth(YearMonth yearMonth, int[] iArr) {
        super((BasePartial) yearMonth, iArr);
    }

    public YearMonth(YearMonth yearMonth, C12589a aVar) {
        super((BasePartial) yearMonth, aVar);
    }
}
