package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
public final class C30856q8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73881a;

    /* renamed from: b */
    public final /* synthetic */ C30696d9 f73882b;

    public C30856q8(C30696d9 d9Var, zzq zzq) {
        this.f73882b = d9Var;
        this.f73881a = zzq;
    }

    public final void run() {
        C30696d9 d9Var = this.f73882b;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C40843u.m166202l(this.f73881a);
            H.mo87162f5(this.f73881a);
            this.f73882b.mo87023E();
        } catch (RemoteException e) {
            this.f73882b.f74136a.mo86903d().mo87489r().mo87464b("Failed to send measurementEnabled to the service", e);
        }
    }
}
