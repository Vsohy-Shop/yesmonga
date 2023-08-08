package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
public final class C30796l8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30903u7 f73735a;

    /* renamed from: b */
    public final /* synthetic */ C30696d9 f73736b;

    public C30796l8(C30696d9 d9Var, C30903u7 u7Var) {
        this.f73736b = d9Var;
        this.f73735a = u7Var;
    }

    public final void run() {
        C30696d9 d9Var = this.f73736b;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to send current screen to service");
            return;
        }
        try {
            C30903u7 u7Var = this.f73735a;
            if (u7Var == null) {
                H.mo87161e3(0, (String) null, (String) null, d9Var.f74136a.mo86902c().getPackageName());
            } else {
                H.mo87161e3(u7Var.f73995c, u7Var.f73993a, u7Var.f73994b, d9Var.f74136a.mo86902c().getPackageName());
            }
            this.f73736b.mo87023E();
        } catch (RemoteException e) {
            this.f73736b.f74136a.mo86903d().mo87489r().mo87464b("Failed to send current screen to the service", e);
        }
    }
}
