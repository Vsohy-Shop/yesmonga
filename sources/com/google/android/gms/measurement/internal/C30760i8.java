package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
public final class C30760i8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73608a;

    /* renamed from: b */
    public final /* synthetic */ zzq f73609b;

    /* renamed from: c */
    public final /* synthetic */ C30696d9 f73610c;

    public C30760i8(C30696d9 d9Var, AtomicReference atomicReference, zzq zzq) {
        this.f73610c = d9Var;
        this.f73608a = atomicReference;
        this.f73609b = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f73608a) {
            try {
                if (!this.f73610c.f74136a.mo87103F().mo87193q().mo87142i(zzah.ANALYTICS_STORAGE)) {
                    this.f73610c.f74136a.mo86903d().mo87495x().mo87463a("Analytics storage consent denied; will not get app instance id");
                    this.f73610c.f74136a.mo87105I().mo87301C((String) null);
                    this.f73610c.f74136a.mo87103F().f73651g.mo87180b((String) null);
                    this.f73608a.set((Object) null);
                    this.f73608a.notify();
                    return;
                }
                C30696d9 d9Var = this.f73610c;
                C30779k3 H = d9Var.f73339d;
                if (H == null) {
                    d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to get app instance id");
                    this.f73608a.notify();
                    return;
                }
                C40843u.m166202l(this.f73609b);
                this.f73608a.set(H.mo87155M5(this.f73609b));
                String str = (String) this.f73608a.get();
                if (str != null) {
                    this.f73610c.f74136a.mo87105I().mo87301C(str);
                    this.f73610c.f74136a.mo87103F().f73651g.mo87180b(str);
                }
                this.f73610c.mo87023E();
                atomicReference = this.f73608a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f73610c.f74136a.mo86903d().mo87489r().mo87464b("Failed to get app instance id", e);
                    atomicReference = this.f73608a;
                } catch (Throwable th) {
                    this.f73608a.notify();
                    throw th;
                }
            }
        }
    }
}
