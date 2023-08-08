package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.d1 */
public final class C32043d1<T> implements C32052g1<T> {

    /* renamed from: a */
    public C32052g1<T> f78252a;

    /* renamed from: b */
    public static <T> void m129779b(C32052g1<T> g1Var, C32052g1<T> g1Var2) {
        C32063k0.m129857j(g1Var2);
        C32043d1 d1Var = (C32043d1) g1Var;
        if (d1Var.f78252a == null) {
            d1Var.f78252a = g1Var2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo92416a() {
        C32052g1<T> g1Var = this.f78252a;
        if (g1Var != null) {
            return g1Var.mo92416a();
        }
        throw new IllegalStateException();
    }
}
