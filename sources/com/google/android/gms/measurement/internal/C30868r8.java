package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
public final class C30868r8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73919a;

    /* renamed from: b */
    public final /* synthetic */ C30696d9 f73920b;

    public C30868r8(C30696d9 d9Var, zzq zzq) {
        this.f73920b = d9Var;
        this.f73919a = zzq;
    }

    public final void run() {
        C30696d9 d9Var = this.f73920b;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to send consent settings to service");
            return;
        }
        try {
            C40843u.m166202l(this.f73919a);
            H.mo87153K3(this.f73919a);
            this.f73920b.mo87023E();
        } catch (RemoteException e) {
            this.f73920b.f74136a.mo86903d().mo87489r().mo87464b("Failed to send consent settings to the service", e);
        }
    }
}
