package com.google.type;

import com.google.protobuf.C34471v0;

public enum CalendarPeriod implements C34471v0.C34474c {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: E0 */
    public static final int f83636E0 = 6;

    /* renamed from: F0 */
    public static final int f83637F0 = 7;

    /* renamed from: G0 */
    public static final C34471v0.C34475d<CalendarPeriod> f83638G0 = null;

    /* renamed from: X */
    public static final int f83640X = 3;

    /* renamed from: Y */
    public static final int f83641Y = 4;

    /* renamed from: Z */
    public static final int f83642Z = 5;

    /* renamed from: x */
    public static final int f83652x = 0;

    /* renamed from: y */
    public static final int f83653y = 1;

    /* renamed from: z */
    public static final int f83654z = 2;
    private final int value;

    /* renamed from: com.google.type.CalendarPeriod$a */
    public class C34580a implements C34471v0.C34475d<CalendarPeriod> {
        /* renamed from: b */
        public CalendarPeriod mo93187a(int i) {
            return CalendarPeriod.m141072b(i);
        }
    }

    /* renamed from: com.google.type.CalendarPeriod$b */
    public static final class C34581b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f83655a = null;

        static {
            f83655a = new C34581b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return CalendarPeriod.m141072b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f83638G0 = new C34580a();
    }

    /* access modifiers changed from: public */
    CalendarPeriod(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static CalendarPeriod m141072b(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static C34471v0.C34475d<CalendarPeriod> m141073g() {
        return f83638G0;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m141074q() {
        return C34581b.f83655a;
    }

    @Deprecated
    /* renamed from: r */
    public static CalendarPeriod m141075r(int i) {
        return m141072b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
