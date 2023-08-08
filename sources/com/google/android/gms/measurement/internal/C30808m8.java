package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
public final class C30808m8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73751a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f73752b;

    /* renamed from: c */
    public final /* synthetic */ C30696d9 f73753c;

    public C30808m8(C30696d9 d9Var, zzq zzq, Bundle bundle) {
        this.f73753c = d9Var;
        this.f73751a = zzq;
        this.f73752b = bundle;
    }

    public final void run() {
        C30696d9 d9Var = this.f73753c;
        C30779k3 H = d9Var.f73339d;
        if (H == null) {
            d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to send default event parameters to service");
            return;
        }
        try {
            C40843u.m166202l(this.f73751a);
            H.mo87164o5(this.f73752b, this.f73751a);
        } catch (RemoteException e) {
            this.f73753c.f74136a.mo86903d().mo87489r().mo87464b("Failed to send default event parameters to service", e);
        }
    }
}
