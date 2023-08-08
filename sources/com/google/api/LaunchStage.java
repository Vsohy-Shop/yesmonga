package com.google.api;

import com.google.protobuf.C34471v0;

public enum LaunchStage implements C34471v0.C34474c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: X */
    public static final int f78691X = 5;

    /* renamed from: Y */
    public static final C34471v0.C34475d<LaunchStage> f78692Y = null;

    /* renamed from: v */
    public static final int f78701v = 0;

    /* renamed from: w */
    public static final int f78702w = 1;

    /* renamed from: x */
    public static final int f78703x = 2;

    /* renamed from: y */
    public static final int f78704y = 3;

    /* renamed from: z */
    public static final int f78705z = 4;
    private final int value;

    /* renamed from: com.google.api.LaunchStage$a */
    public class C32310a implements C34471v0.C34475d<LaunchStage> {
        /* renamed from: b */
        public LaunchStage mo93187a(int i) {
            return LaunchStage.m130831b(i);
        }
    }

    /* renamed from: com.google.api.LaunchStage$b */
    public static final class C32311b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f78706a = null;

        static {
            f78706a = new C32311b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return LaunchStage.m130831b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f78692Y = new C32310a();
    }

    /* access modifiers changed from: public */
    LaunchStage(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static LaunchStage m130831b(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<LaunchStage> m130832g() {
        return f78692Y;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m130833q() {
        return C32311b.f78706a;
    }

    @Deprecated
    /* renamed from: r */
    public static LaunchStage m130834r(int i) {
        return m130831b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
