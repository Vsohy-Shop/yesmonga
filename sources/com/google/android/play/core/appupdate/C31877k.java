package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.C32052g1;
import com.google.android.play.core.internal.C32063k0;
import com.google.android.play.core.splitinstall.C32199t0;

/* renamed from: com.google.android.play.core.appupdate.k */
public final class C31877k implements C32052g1<C31868c> {

    /* renamed from: a */
    public final C32052g1 f77728a;

    /* renamed from: b */
    public final /* synthetic */ int f77729b = 0;

    public C31877k(C32052g1<C31874h> g1Var) {
        this.f77728a = g1Var;
    }

    /* renamed from: b */
    public static C31877k m129299b(C32052g1<Context> g1Var) {
        return new C31877k(g1Var, (short[]) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        int i = this.f77729b;
        if (i != 0) {
            return i != 1 ? i != 2 ? new C32199t0((Context) this.f77728a.mo92416a()) : new C31888u(((C31878l) this.f77728a).mo92416a()) : new C31872f(((C31878l) this.f77728a).mo92416a());
        }
        C31874h hVar = (C31874h) this.f77728a.mo92416a();
        C32063k0.m129858k(hVar);
        return hVar;
    }

    public C31877k(C32052g1<Context> g1Var, byte[] bArr) {
        this.f77728a = g1Var;
    }

    public C31877k(C32052g1<Context> g1Var, char[] cArr) {
        this.f77728a = g1Var;
    }

    public C31877k(C32052g1<Context> g1Var, short[] sArr) {
        this.f77728a = g1Var;
    }
}
