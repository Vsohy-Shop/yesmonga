package org.joda.time;

import com.urbanairship.automation.ScheduleDelay;
import java.io.Serializable;

public abstract class DurationFieldType implements Serializable {

    /* renamed from: E0 */
    public static final DurationFieldType f30672E0 = new StandardDurationFieldType("years", (byte) 4);

    /* renamed from: F0 */
    public static final DurationFieldType f30673F0 = new StandardDurationFieldType("months", (byte) 5);

    /* renamed from: G0 */
    public static final DurationFieldType f30674G0 = new StandardDurationFieldType("weeks", (byte) 6);

    /* renamed from: H0 */
    public static final DurationFieldType f30675H0 = new StandardDurationFieldType("days", (byte) 7);

    /* renamed from: I0 */
    public static final DurationFieldType f30676I0 = new StandardDurationFieldType("halfdays", (byte) 8);

    /* renamed from: J0 */
    public static final DurationFieldType f30677J0 = new StandardDurationFieldType("hours", (byte) 9);

    /* renamed from: K0 */
    public static final DurationFieldType f30678K0 = new StandardDurationFieldType("minutes", (byte) 10);

    /* renamed from: L0 */
    public static final DurationFieldType f30679L0 = new StandardDurationFieldType(ScheduleDelay.f23498f, (byte) 11);

    /* renamed from: M0 */
    public static final DurationFieldType f30680M0 = new StandardDurationFieldType("millis", (byte) 12);

    /* renamed from: X */
    public static final DurationFieldType f30681X = new StandardDurationFieldType("eras", (byte) 1);

    /* renamed from: Y */
    public static final DurationFieldType f30682Y = new StandardDurationFieldType("centuries", (byte) 2);

    /* renamed from: Z */
    public static final DurationFieldType f30683Z = new StandardDurationFieldType("weekyears", (byte) 3);

    /* renamed from: a */
    public static final byte f30684a = 1;

    /* renamed from: b */
    public static final byte f30685b = 2;

    /* renamed from: c */
    public static final byte f30686c = 3;

    /* renamed from: d */
    public static final byte f30687d = 4;

    /* renamed from: e */
    public static final byte f30688e = 5;

    /* renamed from: f */
    public static final byte f30689f = 6;

    /* renamed from: g */
    public static final byte f30690g = 7;
    private static final long serialVersionUID = 8765135187319L;

    /* renamed from: v */
    public static final byte f30691v = 8;

    /* renamed from: w */
    public static final byte f30692w = 9;

    /* renamed from: x */
    public static final byte f30693x = 10;

    /* renamed from: y */
    public static final byte f30694y = 11;

    /* renamed from: z */
    public static final byte f30695z = 12;
    private final String iName;

    public static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        private final byte iOrdinal;

        public StandardDurationFieldType(String str, byte b) {
            super(str);
            this.iOrdinal = b;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DurationFieldType.f30681X;
                case 2:
                    return DurationFieldType.f30682Y;
                case 3:
                    return DurationFieldType.f30683Z;
                case 4:
                    return DurationFieldType.f30672E0;
                case 5:
                    return DurationFieldType.f30673F0;
                case 6:
                    return DurationFieldType.f30674G0;
                case 7:
                    return DurationFieldType.f30675H0;
                case 8:
                    return DurationFieldType.f30676I0;
                case 9:
                    return DurationFieldType.f30677J0;
                case 10:
                    return DurationFieldType.f30678K0;
                case 11:
                    return DurationFieldType.f30679L0;
                case 12:
                    return DurationFieldType.f30680M0;
                default:
                    return this;
            }
        }

        /* renamed from: d */
        public C12646e mo27877d(C12589a aVar) {
            C12589a e = C12641d.m53370e(aVar);
            switch (this.iOrdinal) {
                case 1:
                    return e.mo28646l();
                case 2:
                    return e.mo28637c();
                case 3:
                    return e.mo28630P();
                case 4:
                    return e.mo28634V();
                case 5:
                    return e.mo28620F();
                case 6:
                    return e.mo28627M();
                case 7:
                    return e.mo28644j();
                case 8:
                    return e.mo28654u();
                case 9:
                    return e.mo28657x();
                case 10:
                    return e.mo28618D();
                case 11:
                    return e.mo28623I();
                case 12:
                    return e.mo28658y();
                default:
                    throw new InternalError();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardDurationFieldType)) {
                return false;
            }
            if (this.iOrdinal == ((StandardDurationFieldType) obj).iOrdinal) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    public DurationFieldType(String str) {
        this.iName = str;
    }

    /* renamed from: a */
    public static DurationFieldType m51455a() {
        return f30682Y;
    }

    /* renamed from: b */
    public static DurationFieldType m51456b() {
        return f30675H0;
    }

    /* renamed from: c */
    public static DurationFieldType m51457c() {
        return f30681X;
    }

    /* renamed from: f */
    public static DurationFieldType m51458f() {
        return f30676I0;
    }

    /* renamed from: g */
    public static DurationFieldType m51459g() {
        return f30677J0;
    }

    /* renamed from: i */
    public static DurationFieldType m51460i() {
        return f30680M0;
    }

    /* renamed from: j */
    public static DurationFieldType m51461j() {
        return f30678K0;
    }

    /* renamed from: k */
    public static DurationFieldType m51462k() {
        return f30673F0;
    }

    /* renamed from: l */
    public static DurationFieldType m51463l() {
        return f30679L0;
    }

    /* renamed from: m */
    public static DurationFieldType m51464m() {
        return f30674G0;
    }

    /* renamed from: n */
    public static DurationFieldType m51465n() {
        return f30683Z;
    }

    /* renamed from: o */
    public static DurationFieldType m51466o() {
        return f30672E0;
    }

    /* renamed from: d */
    public abstract C12646e mo27877d(C12589a aVar);

    /* renamed from: e */
    public String mo27878e() {
        return this.iName;
    }

    /* renamed from: h */
    public boolean mo27879h(C12589a aVar) {
        return mo27877d(aVar).mo29037o0();
    }

    public String toString() {
        return mo27878e();
    }
}
