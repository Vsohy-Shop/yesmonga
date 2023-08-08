package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
public final class C30747h8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73578a;

    /* renamed from: b */
    public final /* synthetic */ C30696d9 f73579b;

    public C30747h8(C30696d9 d9Var, zzq zzq) {
        this.f73579b = d9Var;
        this.f73578a = zzq;
    }

    public final void run() {
        C30696d9 d9Var = this.f73579b;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C40843u.m166202l(this.f73578a);
            H.mo87163h4(this.f73578a);
        } catch (RemoteException e) {
            this.f73579b.f74136a.mo86903d().mo87489r().mo87464b("Failed to reset data on the service: remote exception", e);
        }
        this.f73579b.mo87023E();
    }
}
