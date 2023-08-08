package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
public final class C30784k8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73685a;

    /* renamed from: b */
    public final /* synthetic */ C30696d9 f73686b;

    public C30784k8(C30696d9 d9Var, zzq zzq) {
        this.f73686b = d9Var;
        this.f73685a = zzq;
    }

    public final void run() {
        C30696d9 d9Var = this.f73686b;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C40843u.m166202l(this.f73685a);
            H.mo87157T2(this.f73685a);
            this.f73686b.f74136a.mo87100C().mo87291t();
            this.f73686b.mo87040r(H, (AbstractSafeParcelable) null, this.f73685a);
            this.f73686b.mo87023E();
        } catch (RemoteException e) {
            this.f73686b.f74136a.mo86903d().mo87489r().mo87464b("Failed to send app launch to the service", e);
        }
    }
}
