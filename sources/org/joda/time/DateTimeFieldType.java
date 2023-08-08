package org.joda.time;

import java.io.Serializable;

public abstract class DateTimeFieldType implements Serializable {

    /* renamed from: E0 */
    public static final byte f30603E0 = 16;

    /* renamed from: F0 */
    public static final byte f30604F0 = 17;

    /* renamed from: G0 */
    public static final byte f30605G0 = 18;

    /* renamed from: H0 */
    public static final byte f30606H0 = 19;

    /* renamed from: I0 */
    public static final byte f30607I0 = 20;

    /* renamed from: J0 */
    public static final byte f30608J0 = 21;

    /* renamed from: K0 */
    public static final byte f30609K0 = 22;

    /* renamed from: L0 */
    public static final byte f30610L0 = 23;

    /* renamed from: M0 */
    public static final DateTimeFieldType f30611M0 = new StandardDateTimeFieldType("era", (byte) 1, DurationFieldType.m51457c(), (DurationFieldType) null);

    /* renamed from: N0 */
    public static final DateTimeFieldType f30612N0 = new StandardDateTimeFieldType("yearOfEra", (byte) 2, DurationFieldType.m51466o(), DurationFieldType.m51457c());

    /* renamed from: O0 */
    public static final DateTimeFieldType f30613O0 = new StandardDateTimeFieldType("centuryOfEra", (byte) 3, DurationFieldType.m51455a(), DurationFieldType.m51457c());

    /* renamed from: P0 */
    public static final DateTimeFieldType f30614P0 = new StandardDateTimeFieldType("yearOfCentury", (byte) 4, DurationFieldType.m51466o(), DurationFieldType.m51455a());

    /* renamed from: Q0 */
    public static final DateTimeFieldType f30615Q0 = new StandardDateTimeFieldType("year", (byte) 5, DurationFieldType.m51466o(), (DurationFieldType) null);

    /* renamed from: R0 */
    public static final DateTimeFieldType f30616R0 = new StandardDateTimeFieldType("dayOfYear", (byte) 6, DurationFieldType.m51456b(), DurationFieldType.m51466o());

    /* renamed from: S0 */
    public static final DateTimeFieldType f30617S0 = new StandardDateTimeFieldType("monthOfYear", (byte) 7, DurationFieldType.m51462k(), DurationFieldType.m51466o());

    /* renamed from: T0 */
    public static final DateTimeFieldType f30618T0 = new StandardDateTimeFieldType("dayOfMonth", (byte) 8, DurationFieldType.m51456b(), DurationFieldType.m51462k());

    /* renamed from: U0 */
    public static final DateTimeFieldType f30619U0 = new StandardDateTimeFieldType("weekyearOfCentury", (byte) 9, DurationFieldType.m51465n(), DurationFieldType.m51455a());

    /* renamed from: V0 */
    public static final DateTimeFieldType f30620V0 = new StandardDateTimeFieldType("weekyear", (byte) 10, DurationFieldType.m51465n(), (DurationFieldType) null);

    /* renamed from: W0 */
    public static final DateTimeFieldType f30621W0 = new StandardDateTimeFieldType("weekOfWeekyear", (byte) 11, DurationFieldType.m51464m(), DurationFieldType.m51465n());

    /* renamed from: X */
    public static final byte f30622X = 13;

    /* renamed from: X0 */
    public static final DateTimeFieldType f30623X0 = new StandardDateTimeFieldType("dayOfWeek", (byte) 12, DurationFieldType.m51456b(), DurationFieldType.m51464m());

    /* renamed from: Y */
    public static final byte f30624Y = 14;

    /* renamed from: Y0 */
    public static final DateTimeFieldType f30625Y0 = new StandardDateTimeFieldType("halfdayOfDay", (byte) 13, DurationFieldType.m51458f(), DurationFieldType.m51456b());

    /* renamed from: Z */
    public static final byte f30626Z = 15;

    /* renamed from: Z0 */
    public static final DateTimeFieldType f30627Z0 = new StandardDateTimeFieldType("hourOfHalfday", f30624Y, DurationFieldType.m51459g(), DurationFieldType.m51458f());

    /* renamed from: a */
    public static final byte f30628a = 1;

    /* renamed from: a1 */
    public static final DateTimeFieldType f30629a1 = new StandardDateTimeFieldType("clockhourOfHalfday", f30626Z, DurationFieldType.m51459g(), DurationFieldType.m51458f());

    /* renamed from: b */
    public static final byte f30630b = 2;

    /* renamed from: b1 */
    public static final DateTimeFieldType f30631b1 = new StandardDateTimeFieldType("clockhourOfDay", f30603E0, DurationFieldType.m51459g(), DurationFieldType.m51456b());

    /* renamed from: c */
    public static final byte f30632c = 3;

    /* renamed from: c1 */
    public static final DateTimeFieldType f30633c1 = new StandardDateTimeFieldType("hourOfDay", f30604F0, DurationFieldType.m51459g(), DurationFieldType.m51456b());

    /* renamed from: d */
    public static final byte f30634d = 4;

    /* renamed from: d1 */
    public static final DateTimeFieldType f30635d1 = new StandardDateTimeFieldType("minuteOfDay", f30605G0, DurationFieldType.m51461j(), DurationFieldType.m51456b());

    /* renamed from: e */
    public static final byte f30636e = 5;

    /* renamed from: e1 */
    public static final DateTimeFieldType f30637e1 = new StandardDateTimeFieldType("minuteOfHour", f30606H0, DurationFieldType.m51461j(), DurationFieldType.m51459g());

    /* renamed from: f */
    public static final byte f30638f = 6;

    /* renamed from: f1 */
    public static final DateTimeFieldType f30639f1 = new StandardDateTimeFieldType("secondOfDay", f30607I0, DurationFieldType.m51463l(), DurationFieldType.m51456b());

    /* renamed from: g */
    public static final byte f30640g = 7;

    /* renamed from: g1 */
    public static final DateTimeFieldType f30641g1 = new StandardDateTimeFieldType("secondOfMinute", f30608J0, DurationFieldType.m51463l(), DurationFieldType.m51461j());

    /* renamed from: h1 */
    public static final DateTimeFieldType f30642h1 = new StandardDateTimeFieldType("millisOfDay", f30609K0, DurationFieldType.m51460i(), DurationFieldType.m51456b());

    /* renamed from: i1 */
    public static final DateTimeFieldType f30643i1 = new StandardDateTimeFieldType("millisOfSecond", f30610L0, DurationFieldType.m51460i(), DurationFieldType.m51463l());
    private static final long serialVersionUID = -42615285973990L;

    /* renamed from: v */
    public static final byte f30644v = 8;

    /* renamed from: w */
    public static final byte f30645w = 9;

    /* renamed from: x */
    public static final byte f30646x = 10;

    /* renamed from: y */
    public static final byte f30647y = 11;

    /* renamed from: z */
    public static final byte f30648z = 12;
    private final String iName;

    public static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;
        private final byte iOrdinal;

        /* renamed from: j1 */
        public final transient DurationFieldType f30649j1;

        /* renamed from: k1 */
        public final transient DurationFieldType f30650k1;

        public StandardDateTimeFieldType(String str, byte b, DurationFieldType durationFieldType, DurationFieldType durationFieldType2) {
            super(str);
            this.iOrdinal = b;
            this.f30649j1 = durationFieldType;
            this.f30650k1 = durationFieldType2;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DateTimeFieldType.f30611M0;
                case 2:
                    return DateTimeFieldType.f30612N0;
                case 3:
                    return DateTimeFieldType.f30613O0;
                case 4:
                    return DateTimeFieldType.f30614P0;
                case 5:
                    return DateTimeFieldType.f30615Q0;
                case 6:
                    return DateTimeFieldType.f30616R0;
                case 7:
                    return DateTimeFieldType.f30617S0;
                case 8:
                    return DateTimeFieldType.f30618T0;
                case 9:
                    return DateTimeFieldType.f30619U0;
                case 10:
                    return DateTimeFieldType.f30620V0;
                case 11:
                    return DateTimeFieldType.f30621W0;
                case 12:
                    return DateTimeFieldType.f30623X0;
                case 13:
                    return DateTimeFieldType.f30625Y0;
                case 14:
                    return DateTimeFieldType.f30627Z0;
                case 15:
                    return DateTimeFieldType.f30629a1;
                case 16:
                    return DateTimeFieldType.f30631b1;
                case 17:
                    return DateTimeFieldType.f30633c1;
                case 18:
                    return DateTimeFieldType.f30635d1;
                case 19:
                    return DateTimeFieldType.f30637e1;
                case 20:
                    return DateTimeFieldType.f30639f1;
                case 21:
                    return DateTimeFieldType.f30641g1;
                case 22:
                    return DateTimeFieldType.f30642h1;
                case 23:
                    return DateTimeFieldType.f30643i1;
                default:
                    return this;
            }
        }

        /* renamed from: E */
        public DurationFieldType mo27801E() {
            return this.f30649j1;
        }

        /* renamed from: F */
        public C12599c mo27802F(C12589a aVar) {
            C12589a e = C12641d.m53370e(aVar);
            switch (this.iOrdinal) {
                case 1:
                    return e.mo28645k();
                case 2:
                    return e.mo28633U();
                case 3:
                    return e.mo28638d();
                case 4:
                    return e.mo28632T();
                case 5:
                    return e.mo28631S();
                case 6:
                    return e.mo28643i();
                case 7:
                    return e.mo28619E();
                case 8:
                    return e.mo28641g();
                case 9:
                    return e.mo28629O();
                case 10:
                    return e.mo28628N();
                case 11:
                    return e.mo28626L();
                case 12:
                    return e.mo28642h();
                case 13:
                    return e.mo28653t();
                case 14:
                    return e.mo28656w();
                case 15:
                    return e.mo28640f();
                case 16:
                    return e.mo28639e();
                case 17:
                    return e.mo28655v();
                case 18:
                    return e.mo28616B();
                case 19:
                    return e.mo28617C();
                case 20:
                    return e.mo28621G();
                case 21:
                    return e.mo28622H();
                case 22:
                    return e.mo28659z();
                case 23:
                    return e.mo28615A();
                default:
                    throw new InternalError();
            }
        }

        /* renamed from: H */
        public DurationFieldType mo27804H() {
            return this.f30650k1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardDateTimeFieldType)) {
                return false;
            }
            if (this.iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    public DateTimeFieldType(String str) {
        this.iName = str;
    }

    /* renamed from: A */
    public static DateTimeFieldType m51305A() {
        return f30618T0;
    }

    /* renamed from: B */
    public static DateTimeFieldType m51306B() {
        return f30623X0;
    }

    /* renamed from: C */
    public static DateTimeFieldType m51307C() {
        return f30616R0;
    }

    /* renamed from: D */
    public static DateTimeFieldType m51308D() {
        return f30611M0;
    }

    /* renamed from: I */
    public static DateTimeFieldType m51309I() {
        return f30625Y0;
    }

    /* renamed from: J */
    public static DateTimeFieldType m51310J() {
        return f30633c1;
    }

    /* renamed from: K */
    public static DateTimeFieldType m51311K() {
        return f30627Z0;
    }

    /* renamed from: M */
    public static DateTimeFieldType m51312M() {
        return f30642h1;
    }

    /* renamed from: N */
    public static DateTimeFieldType m51313N() {
        return f30643i1;
    }

    /* renamed from: O */
    public static DateTimeFieldType m51314O() {
        return f30635d1;
    }

    /* renamed from: P */
    public static DateTimeFieldType m51315P() {
        return f30637e1;
    }

    /* renamed from: Q */
    public static DateTimeFieldType m51316Q() {
        return f30617S0;
    }

    /* renamed from: R */
    public static DateTimeFieldType m51317R() {
        return f30639f1;
    }

    /* renamed from: S */
    public static DateTimeFieldType m51318S() {
        return f30641g1;
    }

    /* renamed from: T */
    public static DateTimeFieldType m51319T() {
        return f30621W0;
    }

    /* renamed from: U */
    public static DateTimeFieldType m51320U() {
        return f30620V0;
    }

    /* renamed from: V */
    public static DateTimeFieldType m51321V() {
        return f30619U0;
    }

    /* renamed from: W */
    public static DateTimeFieldType m51322W() {
        return f30615Q0;
    }

    /* renamed from: X */
    public static DateTimeFieldType m51323X() {
        return f30614P0;
    }

    /* renamed from: Y */
    public static DateTimeFieldType m51324Y() {
        return f30612N0;
    }

    /* renamed from: x */
    public static DateTimeFieldType m51348x() {
        return f30613O0;
    }

    /* renamed from: y */
    public static DateTimeFieldType m51349y() {
        return f30631b1;
    }

    /* renamed from: z */
    public static DateTimeFieldType m51350z() {
        return f30629a1;
    }

    /* renamed from: E */
    public abstract DurationFieldType mo27801E();

    /* renamed from: F */
    public abstract C12599c mo27802F(C12589a aVar);

    /* renamed from: G */
    public String mo27803G() {
        return this.iName;
    }

    /* renamed from: H */
    public abstract DurationFieldType mo27804H();

    /* renamed from: L */
    public boolean mo27805L(C12589a aVar) {
        return mo27802F(aVar).mo28809L();
    }

    public String toString() {
        return mo27803G();
    }
}
