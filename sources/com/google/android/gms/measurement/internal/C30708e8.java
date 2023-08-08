package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
public final class C30708e8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73364a;

    /* renamed from: b */
    public final /* synthetic */ zzq f73365b;

    /* renamed from: c */
    public final /* synthetic */ boolean f73366c;

    /* renamed from: d */
    public final /* synthetic */ C30696d9 f73367d;

    public C30708e8(C30696d9 d9Var, AtomicReference atomicReference, zzq zzq, boolean z) {
        this.f73367d = d9Var;
        this.f73364a = atomicReference;
        this.f73365b = zzq;
        this.f73366c = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f73364a) {
            try {
                C30696d9 d9Var = this.f73367d;
                C30779k3 H = d9Var.f73339d;
                if (H == null) {
                    d9Var.f74136a.mo86903d().mo87489r().mo87463a("Failed to get all user properties; not connected to service");
                    this.f73364a.notify();
                    return;
                }
                C40843u.m166202l(this.f73365b);
                this.f73364a.set(H.mo87169z1(this.f73365b, this.f73366c));
                this.f73367d.mo87023E();
                atomicReference = this.f73364a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f73367d.f74136a.mo86903d().mo87489r().mo87464b("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f73364a;
                } catch (Throwable th) {
                    this.f73364a.notify();
                    throw th;
                }
            }
        }
    }
}
