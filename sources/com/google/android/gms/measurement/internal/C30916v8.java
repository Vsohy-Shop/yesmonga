package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41977h1;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
public final class C30916v8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f74027a;

    /* renamed from: b */
    public final /* synthetic */ String f74028b;

    /* renamed from: c */
    public final /* synthetic */ zzq f74029c;

    /* renamed from: d */
    public final /* synthetic */ C41977h1 f74030d;

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f74031e;

    public C30916v8(C30696d9 d9Var, String str, String str2, zzq zzq, C41977h1 h1Var) {
        this.f74031e = d9Var;
        this.f74027a = str;
        this.f74028b = str2;
        this.f74029c = zzq;
        this.f74030d = h1Var;
    }

    public final void run() {
        C30731g5 g5Var;
        ArrayList arrayList = new ArrayList();
        try {
            C30696d9 d9Var = this.f74031e;
            C30779k3 H = d9Var.f73339d;
            if (H == null) {
                d9Var.f74136a.mo86903d().mo87489r().mo87465c("Failed to get conditional properties; not connected to service", this.f74027a, this.f74028b);
                g5Var = this.f74031e.f74136a;
            } else {
                C40843u.m166202l(this.f74029c);
                arrayList = C30906ua.m124217v(H.mo87159a7(this.f74027a, this.f74028b, this.f74029c));
                this.f74031e.mo87023E();
                g5Var = this.f74031e.f74136a;
            }
        } catch (RemoteException e) {
            this.f74031e.f74136a.mo86903d().mo87489r().mo87466d("Failed to get conditional properties; remote exception", this.f74027a, this.f74028b, e);
            g5Var = this.f74031e.f74136a;
        } catch (Throwable th) {
            this.f74031e.f74136a.mo87110N().mo87506F(this.f74030d, arrayList);
            throw th;
        }
        g5Var.mo87110N().mo87506F(this.f74030d, arrayList);
    }
}
