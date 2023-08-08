package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import com.google.android.play.core.splitinstall.C32199t0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.t2 */
public final class C31988t2 implements C32052g1<C31984s2> {

    /* renamed from: a */
    public final C32052g1<C31906c0> f78117a;

    /* renamed from: b */
    public final C32052g1<C31914d3> f78118b;

    /* renamed from: c */
    public final C32052g1<C32009z> f78119c;

    /* renamed from: d */
    public final C32052g1<C32199t0> f78120d;

    /* renamed from: e */
    public final C32052g1<C31942j1> f78121e;

    /* renamed from: f */
    public final C32052g1<C31998w0> f78122f;

    /* renamed from: g */
    public final C32052g1<C31962n0> f78123g;

    /* renamed from: h */
    public final C32052g1<Executor> f78124h;

    /* renamed from: i */
    public final C32052g1<C32016c> f78125i;

    public C31988t2(C32052g1<C31906c0> g1Var, C32052g1<C31914d3> g1Var2, C32052g1<C32009z> g1Var3, C32052g1<C32199t0> g1Var4, C32052g1<C31942j1> g1Var5, C32052g1<C31998w0> g1Var6, C32052g1<C31962n0> g1Var7, C32052g1<Executor> g1Var8, C32052g1<C32016c> g1Var9) {
        this.f78117a = g1Var;
        this.f78118b = g1Var2;
        this.f78119c = g1Var3;
        this.f78120d = g1Var4;
        this.f78121e = g1Var5;
        this.f78122f = g1Var6;
        this.f78123g = g1Var7;
        this.f78124h = g1Var8;
        this.f78125i = g1Var9;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        C31906c0 a = this.f78117a.mo92416a();
        C32040c1<C31914d3> c = C32046e1.m129796c(this.f78118b);
        C32009z a2 = this.f78119c.mo92416a();
        C31942j1 a3 = this.f78121e.mo92416a();
        C31998w0 a4 = this.f78122f.mo92416a();
        C31998w0 w0Var = a4;
        return new C31984s2(a, c, a2, this.f78120d.mo92416a(), a3, w0Var, this.f78123g.mo92416a(), C32046e1.m129796c(this.f78124h), this.f78125i.mo92416a());
    }
}
