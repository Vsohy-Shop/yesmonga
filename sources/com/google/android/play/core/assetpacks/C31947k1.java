package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
public final class C31947k1 implements C32052g1<C31942j1> {

    /* renamed from: a */
    public final C32052g1 f77945a;

    /* renamed from: b */
    public final C32052g1 f77946b;

    /* renamed from: c */
    public final C32052g1 f77947c;

    /* renamed from: d */
    public final C32052g1 f77948d;

    /* renamed from: e */
    public final /* synthetic */ int f77949e = 0;

    public C31947k1(C32052g1<C31906c0> g1Var, C32052g1<C31914d3> g1Var2, C32052g1<C31998w0> g1Var3, C32052g1<Executor> g1Var4) {
        this.f77945a = g1Var;
        this.f77946b = g1Var2;
        this.f77947c = g1Var3;
        this.f77948d = g1Var4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        int i = this.f77949e;
        if (i == 0) {
            Object a = this.f77945a.mo92416a();
            return new C31942j1((C31906c0) a, C32046e1.m129796c(this.f77946b), (C31998w0) this.f77947c.mo92416a(), C32046e1.m129796c(this.f77948d));
        } else if (i != 1) {
            Object a2 = this.f77947c.mo92416a();
            Object a3 = this.f77946b.mo92416a();
            return new C31955m1((C31942j1) a2, (C31906c0) a3, (C31950l0) this.f77945a.mo92416a(), (C32016c) this.f77948d.mo92416a());
        } else {
            return new C31982s0((C31906c0) this.f77945a.mo92416a(), C32046e1.m129796c(this.f77946b), C32046e1.m129796c(this.f77947c), (C31998w0) this.f77948d.mo92416a());
        }
    }

    public C31947k1(C32052g1<C31906c0> g1Var, C32052g1<C31914d3> g1Var2, C32052g1<C32009z> g1Var3, C32052g1<C31998w0> g1Var4, byte[] bArr) {
        this.f77945a = g1Var;
        this.f77946b = g1Var2;
        this.f77947c = g1Var3;
        this.f77948d = g1Var4;
    }

    public C31947k1(C32052g1<C31942j1> g1Var, C32052g1<C31906c0> g1Var2, C32052g1<C31950l0> g1Var3, C32052g1<C32016c> g1Var4, char[] cArr) {
        this.f77947c = g1Var;
        this.f77946b = g1Var2;
        this.f77945a = g1Var3;
        this.f77948d = g1Var4;
    }
}
