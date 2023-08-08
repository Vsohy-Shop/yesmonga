package com.google.api;

import com.google.protobuf.C34471v0;

public enum FieldBehavior implements C34471v0.C34474c {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: X */
    public static final int f78648X = 5;

    /* renamed from: Y */
    public static final C34471v0.C34475d<FieldBehavior> f78649Y = null;

    /* renamed from: v */
    public static final int f78658v = 0;

    /* renamed from: w */
    public static final int f78659w = 1;

    /* renamed from: x */
    public static final int f78660x = 2;

    /* renamed from: y */
    public static final int f78661y = 3;

    /* renamed from: z */
    public static final int f78662z = 4;
    private final int value;

    /* renamed from: com.google.api.FieldBehavior$a */
    public class C32296a implements C34471v0.C34475d<FieldBehavior> {
        /* renamed from: b */
        public FieldBehavior mo93187a(int i) {
            return FieldBehavior.m130731b(i);
        }
    }

    /* renamed from: com.google.api.FieldBehavior$b */
    public static final class C32297b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f78663a = null;

        static {
            f78663a = new C32297b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return FieldBehavior.m130731b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f78649Y = new C32296a();
    }

    /* access modifiers changed from: public */
    FieldBehavior(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static FieldBehavior m130731b(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<FieldBehavior> m130732g() {
        return f78649Y;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m130733q() {
        return C32297b.f78663a;
    }

    @Deprecated
    /* renamed from: r */
    public static FieldBehavior m130734r(int i) {
        return m130731b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
