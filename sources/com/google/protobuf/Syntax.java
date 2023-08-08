package com.google.protobuf;

import com.google.protobuf.C34471v0;

public enum Syntax implements C34471v0.C34474c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public static final int f83115d = 0;

    /* renamed from: e */
    public static final int f83116e = 1;

    /* renamed from: f */
    public static final C34471v0.C34475d<Syntax> f83117f = null;
    private final int value;

    /* renamed from: com.google.protobuf.Syntax$a */
    public static class C34295a implements C34471v0.C34475d<Syntax> {
        /* renamed from: b */
        public Syntax mo93187a(int i) {
            return Syntax.m138570b(i);
        }
    }

    /* renamed from: com.google.protobuf.Syntax$b */
    public static final class C34296b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f83119a = null;

        static {
            f83119a = new C34296b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return Syntax.m138570b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f83117f = new C34295a();
    }

    /* access modifiers changed from: public */
    Syntax(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static Syntax m138570b(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    /* renamed from: g */
    public static C34471v0.C34475d<Syntax> m138571g() {
        return f83117f;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m138572q() {
        return C34296b.f83119a;
    }

    @Deprecated
    /* renamed from: r */
    public static Syntax m138573r(int i) {
        return m138570b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
