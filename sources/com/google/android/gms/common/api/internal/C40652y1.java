package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C40785m;

/* renamed from: com.google.android.gms.common.api.internal.y1 */
public final class C40652y1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConnectionResult f103614a;

    /* renamed from: b */
    public final /* synthetic */ C40657z1 f103615b;

    public C40652y1(C40657z1 z1Var, ConnectionResult connectionResult) {
        this.f103615b = z1Var;
        this.f103614a = connectionResult;
    }

    public final void run() {
        C40657z1 z1Var = this.f103615b;
        C40637v1 v1Var = (C40637v1) z1Var.f103623f.f103413n.get(z1Var.f103619b);
        if (v1Var != null) {
            if (this.f103614a.mo133595e0()) {
                this.f103615b.f103622e = true;
                if (this.f103615b.f103618a.mo87660m()) {
                    this.f103615b.mo134091h();
                    return;
                }
                try {
                    C40657z1 z1Var2 = this.f103615b;
                    z1Var2.f103618a.mo133681p((C40785m) null, z1Var2.f103618a.mo133680o());
                } catch (SecurityException unused) {
                    this.f103615b.f103618a.mo133672d("Failed to get service from broker.");
                    v1Var.mo134047E(new ConnectionResult(10), (Exception) null);
                }
            } else {
                v1Var.mo134047E(this.f103614a, (Exception) null);
            }
        }
    }
}
