package com.google.protobuf;

import com.google.protobuf.C34471v0;

public enum NullValue implements C34471v0.C34474c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    public static final int f83086c = 0;

    /* renamed from: d */
    public static final C34471v0.C34475d<NullValue> f83087d = null;
    private final int value;

    /* renamed from: com.google.protobuf.NullValue$a */
    public static class C34280a implements C34471v0.C34475d<NullValue> {
        /* renamed from: b */
        public NullValue mo93187a(int i) {
            return NullValue.m138505b(i);
        }
    }

    /* renamed from: com.google.protobuf.NullValue$b */
    public static final class C34281b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f83089a = null;

        static {
            f83089a = new C34281b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return NullValue.m138505b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f83087d = new C34280a();
    }

    /* access modifiers changed from: public */
    NullValue(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static NullValue m138505b(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<NullValue> m138506g() {
        return f83087d;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m138507q() {
        return C34281b.f83089a;
    }

    @Deprecated
    /* renamed from: r */
    public static NullValue m138508r(int i) {
        return m138505b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
