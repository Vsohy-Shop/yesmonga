package com.google.type;

import com.google.protobuf.C34471v0;

public enum DayOfWeek implements C34471v0.C34474c {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: E0 */
    public static final int f83663E0 = 6;

    /* renamed from: F0 */
    public static final int f83664F0 = 7;

    /* renamed from: G0 */
    public static final C34471v0.C34475d<DayOfWeek> f83665G0 = null;

    /* renamed from: X */
    public static final int f83667X = 3;

    /* renamed from: Y */
    public static final int f83668Y = 4;

    /* renamed from: Z */
    public static final int f83669Z = 5;

    /* renamed from: x */
    public static final int f83679x = 0;

    /* renamed from: y */
    public static final int f83680y = 1;

    /* renamed from: z */
    public static final int f83681z = 2;
    private final int value;

    /* renamed from: com.google.type.DayOfWeek$a */
    public class C34588a implements C34471v0.C34475d<DayOfWeek> {
        /* renamed from: b */
        public DayOfWeek mo93187a(int i) {
            return DayOfWeek.m141120b(i);
        }
    }

    /* renamed from: com.google.type.DayOfWeek$b */
    public static final class C34589b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f83682a = null;

        static {
            f83682a = new C34589b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return DayOfWeek.m141120b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f83665G0 = new C34588a();
    }

    /* access modifiers changed from: public */
    DayOfWeek(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static DayOfWeek m141120b(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static C34471v0.C34475d<DayOfWeek> m141121g() {
        return f83665G0;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m141122q() {
        return C34589b.f83682a;
    }

    @Deprecated
    /* renamed from: r */
    public static DayOfWeek m141123r(int i) {
        return m141120b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
