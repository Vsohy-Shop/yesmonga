package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
public abstract class C42221v2 implements Runnable {

    /* renamed from: a */
    public final long f106458a;

    /* renamed from: b */
    public final long f106459b;

    /* renamed from: c */
    public final boolean f106460c;

    /* renamed from: d */
    public final /* synthetic */ C41979h3 f106461d;

    public C42221v2(C41979h3 h3Var, boolean z) {
        this.f106461d = h3Var;
        this.f106458a = h3Var.f106167b.mo134768a();
        this.f106459b = h3Var.f106167b.mo134770c();
        this.f106460c = z;
    }

    /* renamed from: a */
    public abstract void mo136500a() throws RemoteException;

    /* renamed from: c */
    public void mo136605c() {
    }

    public final void run() {
        if (this.f106461d.f106172g) {
            mo136605c();
            return;
        }
        try {
            mo136500a();
        } catch (Exception e) {
            this.f106461d.mo136927t(e, false, this.f106460c);
            mo136605c();
        }
    }
}
