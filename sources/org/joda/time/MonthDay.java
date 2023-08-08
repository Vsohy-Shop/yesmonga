package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
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
import org.joda.time.format.DateTimeFormatterBuilder;

public final class MonthDay extends BasePartial implements C12714n, Serializable {

    /* renamed from: a */
    public static final DateTimeFieldType[] f30737a = {DateTimeFieldType.m51316Q(), DateTimeFieldType.m51305A()};

    /* renamed from: b */
    public static final C12674b f30738b = new DateTimeFormatterBuilder().mo29134K(C12683i.m54182L().mo29242e()).mo29134K(C12671a.m54028f("--MM-dd").mo29242e()).mo29188u0();

    /* renamed from: c */
    public static final int f30739c = 0;

    /* renamed from: d */
    public static final int f30740d = 1;
    private static final long serialVersionUID = 2954560699050434609L;

    public static class Property extends C12648a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i) {
            this.iBase = monthDay;
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
        public MonthDay mo28216u(int i) {
            return new MonthDay(this.iBase, mo28214j().mo28824c(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: v */
        public MonthDay mo28217v(int i) {
            return new MonthDay(this.iBase, mo28214j().mo28826e(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: w */
        public MonthDay mo28218w() {
            return this.iBase;
        }

        /* renamed from: x */
        public MonthDay mo28219x(int i) {
            return new MonthDay(this.iBase, mo28214j().mo28819V(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), i));
        }

        /* renamed from: y */
        public MonthDay mo28220y(String str) {
            return mo28221z(str, (Locale) null);
        }

        /* renamed from: z */
        public MonthDay mo28221z(String str, Locale locale) {
            return new MonthDay(this.iBase, mo28214j().mo28820W(this.iBase, this.iFieldIndex, this.iBase.mo28389w(), str, locale));
        }
    }

    public MonthDay() {
    }

    /* renamed from: F0 */
    public static MonthDay m51843F0() {
        return new MonthDay();
    }

    /* renamed from: H0 */
    public static MonthDay m51844H0(C12589a aVar) {
        if (aVar != null) {
            return new MonthDay(aVar);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    /* renamed from: K0 */
    public static MonthDay m51845K0(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    /* renamed from: L0 */
    public static MonthDay m51846L0(String str) {
        return m51847N0(str, f30738b);
    }

    /* renamed from: N0 */
    public static MonthDay m51847N0(String str, C12674b bVar) {
        LocalDate p = bVar.mo29253p(str);
        return new MonthDay(p.mo27935B0(), p.mo27957R1());
    }

    /* renamed from: o0 */
    public static MonthDay m51848o0(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    /* renamed from: p0 */
    public static MonthDay m51849p0(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    private Object readResolve() {
        if (!DateTimeZone.f30651a.equals(mo27982m().mo27836s())) {
            return new MonthDay(this, mo27982m().mo27834Q());
        }
        return this;
    }

    /* renamed from: A0 */
    public MonthDay mo28191A0(int i) {
        return mo28211w1(DurationFieldType.m51462k(), C12652e.m53802l(i));
    }

    /* renamed from: A1 */
    public MonthDay mo28192A1(C12715o oVar, int i) {
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
        return new MonthDay(this, w);
    }

    /* renamed from: B0 */
    public int mo28193B0() {
        return getValue(0);
    }

    /* renamed from: C0 */
    public Property mo28194C0() {
        return new Property(this, 0);
    }

    /* renamed from: O0 */
    public MonthDay mo28195O0(C12715o oVar) {
        return mo28192A1(oVar, 1);
    }

    /* renamed from: R0 */
    public MonthDay mo28196R0(int i) {
        return mo28211w1(DurationFieldType.m51456b(), i);
    }

    /* renamed from: R1 */
    public int mo28197R1() {
        return getValue(1);
    }

    /* renamed from: S1 */
    public String mo28198S1(String str) {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29260w(this);
    }

    /* renamed from: U0 */
    public MonthDay mo28199U0(int i) {
        return mo28211w1(DurationFieldType.m51462k(), i);
    }

    /* renamed from: c1 */
    public Property mo28200c1(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, mo28783M(dateTimeFieldType));
    }

    /* renamed from: g */
    public C12599c mo27972g(int i, C12589a aVar) {
        if (i == 0) {
            return aVar.mo28619E();
        }
        if (i == 1) {
            return aVar.mo28641g();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    /* renamed from: j1 */
    public LocalDate mo28201j1(int i) {
        return new LocalDate(i, mo28193B0(), mo28197R1(), mo27982m());
    }

    /* renamed from: k1 */
    public MonthDay mo28202k1(C12589a aVar) {
        C12589a Q = C12641d.m53370e(aVar).mo27834Q();
        if (Q == mo27982m()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, Q);
        Q.mo28625K(monthDay, mo28389w());
        return monthDay;
    }

    /* renamed from: n0 */
    public Property mo28203n0() {
        return new Property(this, 1);
    }

    /* renamed from: n1 */
    public MonthDay mo28204n1(int i) {
        return new MonthDay(this, mo27982m().mo28641g().mo28819V(this, 1, mo28389w(), i));
    }

    /* renamed from: q */
    public DateTimeFieldType[] mo28205q() {
        return (DateTimeFieldType[]) f30737a.clone();
    }

    /* renamed from: q1 */
    public MonthDay mo28206q1(DateTimeFieldType dateTimeFieldType, int i) {
        int M = mo28783M(dateTimeFieldType);
        if (i == getValue(M)) {
            return this;
        }
        return new MonthDay(this, getField(M).mo28819V(this, M, mo28389w(), i));
    }

    public int size() {
        return 2;
    }

    /* renamed from: t */
    public DateTimeFieldType mo28207t(int i) {
        return f30737a[i];
    }

    /* renamed from: t0 */
    public MonthDay mo28208t0(C12715o oVar) {
        return mo28192A1(oVar, -1);
    }

    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.m51316Q());
        arrayList.add(DateTimeFieldType.m51305A());
        return C12683i.m54175E(arrayList, true, true).mo29260w(this);
    }

    /* renamed from: u0 */
    public MonthDay mo28209u0(int i) {
        return mo28211w1(DurationFieldType.m51456b(), C12652e.m53802l(i));
    }

    /* renamed from: w0 */
    public String mo28210w0(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return C12671a.m54028f(str).mo29232P(locale).mo29260w(this);
    }

    /* renamed from: w1 */
    public MonthDay mo28211w1(DurationFieldType durationFieldType, int i) {
        int Q = mo28784Q(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new MonthDay(this, getField(Q).mo28824c(this, Q, mo28389w(), i));
    }

    /* renamed from: z1 */
    public MonthDay mo28212z1(int i) {
        return new MonthDay(this, mo27982m().mo28619E().mo28819V(this, 0, mo28389w(), i));
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super((C12589a) ISOChronology.m52934b0(dateTimeZone));
    }

    public MonthDay(C12589a aVar) {
        super(aVar);
    }

    public MonthDay(long j) {
        super(j);
    }

    public MonthDay(long j, C12589a aVar) {
        super(j, aVar);
    }

    public MonthDay(Object obj) {
        super(obj, (C12589a) null, C12683i.m54182L());
    }

    public MonthDay(Object obj, C12589a aVar) {
        super(obj, C12641d.m53370e(aVar), C12683i.m54182L());
    }

    public MonthDay(int i, int i2) {
        this(i, i2, (C12589a) null);
    }

    public MonthDay(int i, int i2, C12589a aVar) {
        super(new int[]{i, i2}, aVar);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super((BasePartial) monthDay, iArr);
    }

    public MonthDay(MonthDay monthDay, C12589a aVar) {
        super((BasePartial) monthDay, aVar);
    }
}
