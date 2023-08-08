package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
public final class C30772j8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73637a;

    /* renamed from: b */
    public final /* synthetic */ C41977h1 f73638b;

    /* renamed from: c */
    public final /* synthetic */ C30696d9 f73639c;

    public C30772j8(C30696d9 d9Var, zzq zzq, C41977h1 h1Var) {
        this.f73639c = d9Var;
        this.f73637a = zzq;
        this.f73638b = h1Var;
    }

    public final void run() {
        C30731g5 g5Var;
        String str = null;
        try {
            if (!this.f73639c.f74136a.mo87103F().mo87193q().mo87142i(zzah.ANALYTICS_STORAGE)) {
                this.f73639c.f74136a.mo86903d().mo87495x().mo87463a("Analytics storage consent denied; will not get app instance id");
                this.f73639c.f74136a.mo87105I().mo87301C((String) null);
                this.f73639c.f74136a.mo87103F().f73651g.mo87180b((String) null);
                g5Var = this.f73639c.f74136a;
            } else {
                C30696d9 d9Var = this.f73639c;
                C30779k3 H = d9Var.f73339d;
                if (H == null) {
                    d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to get app instance id");
                    g5Var = this.f73639c.f74136a;
                } else {
                    C40843u.m166202l(this.f73637a);
                    str = H.mo87155M5(this.f73637a);
                    if (str != null) {
                        this.f73639c.f74136a.mo87105I().mo87301C(str);
                        this.f73639c.f74136a.mo87103F().f73651g.mo87180b(str);
                    }
                    this.f73639c.mo87023E();
                    g5Var = this.f73639c.f74136a;
                }
            }
        } catch (RemoteException e) {
            this.f73639c.f74136a.mo86903d().mo87489r().mo87464b("Failed to get app instance id", e);
            g5Var = this.f73639c.f74136a;
        } catch (Throwable th) {
            this.f73639c.f74136a.mo87110N().mo87511K(this.f73638b, (String) null);
            throw th;
        }
        g5Var.mo87110N().mo87511K(this.f73638b, str);
    }
}
