package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C41977h1;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
public final class C30832o8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f73831a;

    /* renamed from: b */
    public final /* synthetic */ String f73832b;

    /* renamed from: c */
    public final /* synthetic */ C41977h1 f73833c;

    /* renamed from: d */
    public final /* synthetic */ C30696d9 f73834d;

    public C30832o8(C30696d9 d9Var, zzaw zzaw, String str, C41977h1 h1Var) {
        this.f73834d = d9Var;
        this.f73831a = zzaw;
        this.f73832b = str;
        this.f73833c = h1Var;
    }

    public final void run() {
        C30731g5 g5Var;
        byte[] bArr = null;
        try {
            C30696d9 d9Var = this.f73834d;
            C30779k3 H = d9Var.f73339d;
            if (H == null) {
                d9Var.f74136a.mo86903d().mo87489r().mo87463a("Discarding data. Failed to send event to service to bundle");
                g5Var = this.f73834d.f74136a;
            } else {
                bArr = H.mo87152H5(this.f73831a, this.f73832b);
                this.f73834d.mo87023E();
                g5Var = this.f73834d.f74136a;
            }
        } catch (RemoteException e) {
            this.f73834d.f74136a.mo86903d().mo87489r().mo87464b("Failed to send event to the service to bundle", e);
            g5Var = this.f73834d.f74136a;
        } catch (Throwable th) {
            this.f73834d.f74136a.mo87110N().mo87508H(this.f73833c, bArr);
            throw th;
        }
        g5Var.mo87110N().mo87508H(this.f73833c, bArr);
    }
}
