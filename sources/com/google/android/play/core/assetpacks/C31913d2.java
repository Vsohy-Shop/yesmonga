package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C32016c;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.d2 */
public final class C31913d2 implements C32052g1<C31908c2> {

    /* renamed from: a */
    public final C32052g1 f77826a;

    /* renamed from: b */
    public final C32052g1 f77827b;

    /* renamed from: c */
    public final C32052g1 f77828c;

    /* renamed from: d */
    public final C32052g1 f77829d;

    /* renamed from: e */
    public final C32052g1 f77830e;

    /* renamed from: f */
    public final C32052g1 f77831f;

    /* renamed from: g */
    public final /* synthetic */ int f77832g = 0;

    public C31913d2(C32052g1<C31906c0> g1Var, C32052g1<C31914d3> g1Var2, C32052g1<C31942j1> g1Var3, C32052g1<Executor> g1Var4, C32052g1<C31998w0> g1Var5, C32052g1<C32016c> g1Var6) {
        this.f77826a = g1Var;
        this.f77827b = g1Var2;
        this.f77828c = g1Var3;
        this.f77829d = g1Var4;
        this.f77830e = g1Var5;
        this.f77831f = g1Var6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        if (this.f77832g != 0) {
            String str = (String) this.f77831f.mo92416a();
            Object a = this.f77827b.mo92416a();
            Object a2 = this.f77830e.mo92416a();
            Context b = ((C32012z2) this.f77829d).mo92416a();
            Object a3 = this.f77828c.mo92416a();
            return new C31983s1(str != null ? new File(b.getExternalFilesDir((String) null), str) : b.getExternalFilesDir((String) null), (C32009z) a, (C31998w0) a2, b, (C31918e2) a3, C32046e1.m129796c(this.f77826a));
        }
        Object a4 = this.f77826a.mo92416a();
        return new C31908c2((C31906c0) a4, C32046e1.m129796c(this.f77827b), (C31942j1) this.f77828c.mo92416a(), C32046e1.m129796c(this.f77829d), (C31998w0) this.f77830e.mo92416a(), (C32016c) this.f77831f.mo92416a());
    }

    public C31913d2(C32052g1<String> g1Var, C32052g1<C32009z> g1Var2, C32052g1<C31998w0> g1Var3, C32052g1<Context> g1Var4, C32052g1<C31918e2> g1Var5, C32052g1<Executor> g1Var6, byte[] bArr) {
        this.f77831f = g1Var;
        this.f77827b = g1Var2;
        this.f77830e = g1Var3;
        this.f77829d = g1Var4;
        this.f77828c = g1Var5;
        this.f77826a = g1Var6;
    }
}
