package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.u0 */
public final class C31990u0 implements C32052g1<C31986t0> {

    /* renamed from: a */
    public final C32052g1 f78128a;

    /* renamed from: b */
    public final C32052g1 f78129b;

    /* renamed from: c */
    public final C32052g1 f78130c;

    /* renamed from: d */
    public final C32052g1 f78131d;

    /* renamed from: e */
    public final C32052g1 f78132e;

    /* renamed from: f */
    public final C32052g1 f78133f;

    /* renamed from: g */
    public final C32052g1 f78134g;

    /* renamed from: h */
    public final C32052g1 f78135h;

    /* renamed from: i */
    public final /* synthetic */ int f78136i = 0;

    public C31990u0(C32052g1<C31942j1> g1Var, C32052g1<C31914d3> g1Var2, C32052g1<C31982s0> g1Var3, C32052g1<C31964n2> g1Var4, C32052g1<C32003x1> g1Var5, C32052g1<C31908c2> g1Var6, C32052g1<C31928g2> g1Var7, C32052g1<C31955m1> g1Var8) {
        this.f78128a = g1Var;
        this.f78129b = g1Var2;
        this.f78130c = g1Var3;
        this.f78131d = g1Var4;
        this.f78132e = g1Var5;
        this.f78133f = g1Var6;
        this.f78134g = g1Var7;
        this.f78135h = g1Var8;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        if (this.f78136i != 0) {
            Context b = ((C32012z2) this.f78128a).mo92416a();
            Object a = this.f78134g.mo92416a();
            Object a2 = this.f78135h.mo92416a();
            C32040c1 c = C32046e1.m129796c(this.f78129b);
            Object a3 = this.f78132e.mo92416a();
            Object a4 = this.f78133f.mo92416a();
            return new C32009z(b, (C31942j1) a, (C31986t0) a2, c, (C31998w0) a3, (C31962n0) a4, C32046e1.m129796c(this.f78130c), C32046e1.m129796c(this.f78131d));
        }
        Object a5 = this.f78128a.mo92416a();
        return new C31986t0((C31942j1) a5, C32046e1.m129796c(this.f78129b), (C31982s0) this.f78130c.mo92416a(), (C31964n2) this.f78131d.mo92416a(), (C32003x1) this.f78132e.mo92416a(), (C31908c2) this.f78133f.mo92416a(), (C31928g2) this.f78134g.mo92416a(), (C31955m1) this.f78135h.mo92416a());
    }

    public C31990u0(C32052g1<Context> g1Var, C32052g1<C31942j1> g1Var2, C32052g1<C31986t0> g1Var3, C32052g1<C31914d3> g1Var4, C32052g1<C31998w0> g1Var5, C32052g1<C31962n0> g1Var6, C32052g1<Executor> g1Var7, C32052g1<Executor> g1Var8, byte[] bArr) {
        this.f78128a = g1Var;
        this.f78134g = g1Var2;
        this.f78135h = g1Var3;
        this.f78129b = g1Var4;
        this.f78132e = g1Var5;
        this.f78133f = g1Var6;
        this.f78130c = g1Var7;
        this.f78131d = g1Var8;
    }
}
