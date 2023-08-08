package com.google.api;

import com.google.protobuf.C34471v0;

public enum ChangeType implements C34471v0.C34474c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    public static final int f78627f = 0;

    /* renamed from: g */
    public static final int f78628g = 1;

    /* renamed from: v */
    public static final int f78629v = 2;

    /* renamed from: w */
    public static final int f78630w = 3;

    /* renamed from: x */
    public static final C34471v0.C34475d<ChangeType> f78631x = null;
    private final int value;

    /* renamed from: com.google.api.ChangeType$a */
    public class C32264a implements C34471v0.C34475d<ChangeType> {
        /* renamed from: b */
        public ChangeType mo93187a(int i) {
            return ChangeType.m130531b(i);
        }
    }

    /* renamed from: com.google.api.ChangeType$b */
    public static final class C32265b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f78633a = null;

        static {
            f78633a = new C32265b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return ChangeType.m130531b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f78631x = new C32264a();
    }

    /* access modifiers changed from: public */
    ChangeType(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static ChangeType m130531b(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<ChangeType> m130532g() {
        return f78631x;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m130533q() {
        return C32265b.f78633a;
    }

    @Deprecated
    /* renamed from: r */
    public static ChangeType m130534r(int i) {
        return m130531b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
