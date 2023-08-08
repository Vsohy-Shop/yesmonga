package com.google.firebase.components;

import com.urbanairship.analytics.location.C35560b;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;

/* renamed from: com.google.firebase.components.v */
public final class C32608v {

    /* renamed from: a */
    public final C32578f0<?> f79106a;

    /* renamed from: b */
    public final int f79107b;

    /* renamed from: c */
    public final int f79108c;

    public C32608v(Class<?> cls, int i, int i2) {
        this(C32578f0.m131624b(cls), i, i2);
    }

    /* renamed from: a */
    public static C32608v m131740a(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 0, 2);
    }

    /* renamed from: b */
    public static C32608v m131741b(Class<?> cls) {
        return new C32608v(cls, 0, 2);
    }

    /* renamed from: c */
    public static String m131742c(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return C35560b.f87807Z0;
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: i */
    public static C32608v m131743i(Class<?> cls) {
        return new C32608v(cls, 0, 0);
    }

    /* renamed from: j */
    public static C32608v m131744j(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 0, 1);
    }

    /* renamed from: k */
    public static C32608v m131745k(Class<?> cls) {
        return new C32608v(cls, 0, 1);
    }

    /* renamed from: l */
    public static C32608v m131746l(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 1, 0);
    }

    /* renamed from: m */
    public static C32608v m131747m(Class<?> cls) {
        return new C32608v(cls, 1, 0);
    }

    /* renamed from: n */
    public static C32608v m131748n(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 1, 1);
    }

    /* renamed from: o */
    public static C32608v m131749o(Class<?> cls) {
        return new C32608v(cls, 1, 1);
    }

    /* renamed from: p */
    public static C32608v m131750p(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 2, 0);
    }

    /* renamed from: q */
    public static C32608v m131751q(Class<?> cls) {
        return new C32608v(cls, 2, 0);
    }

    /* renamed from: r */
    public static C32608v m131752r(C32578f0<?> f0Var) {
        return new C32608v(f0Var, 2, 1);
    }

    /* renamed from: s */
    public static C32608v m131753s(Class<?> cls) {
        return new C32608v(cls, 2, 1);
    }

    /* renamed from: d */
    public C32578f0<?> mo94746d() {
        return this.f79106a;
    }

    /* renamed from: e */
    public boolean mo94747e() {
        return this.f79108c == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C32608v)) {
            return false;
        }
        C32608v vVar = (C32608v) obj;
        if (this.f79106a.equals(vVar.f79106a) && this.f79107b == vVar.f79107b && this.f79108c == vVar.f79108c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo94749f() {
        return this.f79108c == 0;
    }

    /* renamed from: g */
    public boolean mo94750g() {
        return this.f79107b == 1;
    }

    /* renamed from: h */
    public boolean mo94751h() {
        return this.f79107b == 2;
    }

    public int hashCode() {
        return ((((this.f79106a.hashCode() ^ 1000003) * 1000003) ^ this.f79107b) * 1000003) ^ this.f79108c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f79106a);
        sb.append(", type=");
        int i = this.f79107b;
        if (i == 1) {
            str = FieldModel.f27475X;
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m131742c(this.f79108c));
        sb.append("}");
        return sb.toString();
    }

    public C32608v(C32578f0<?> f0Var, int i, int i2) {
        this.f79106a = (C32578f0) C32576e0.m131620c(f0Var, "Null dependency anInterface.");
        this.f79107b = i;
        this.f79108c = i2;
    }
}
