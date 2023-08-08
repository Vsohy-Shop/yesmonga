package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
public final class C30904u8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73999a;

    /* renamed from: b */
    public final /* synthetic */ String f74000b;

    /* renamed from: c */
    public final /* synthetic */ String f74001c;

    /* renamed from: d */
    public final /* synthetic */ zzq f74002d;

    /* renamed from: e */
    public final /* synthetic */ C30696d9 f74003e;

    public C30904u8(C30696d9 d9Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq) {
        this.f74003e = d9Var;
        this.f73999a = atomicReference;
        this.f74000b = str2;
        this.f74001c = str3;
        this.f74002d = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f73999a) {
            try {
                C30696d9 d9Var = this.f74003e;
                C30779k3 H = d9Var.f73339d;
                if (H == null) {
                    d9Var.f74136a.mo86903d().mo87489r().mo87466d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f74000b, this.f74001c);
                    this.f73999a.set(Collections.emptyList());
                    this.f73999a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C40843u.m166202l(this.f74002d);
                    this.f73999a.set(H.mo87159a7(this.f74000b, this.f74001c, this.f74002d));
                } else {
                    this.f73999a.set(H.mo87168v0((String) null, this.f74000b, this.f74001c));
                }
                this.f74003e.mo87023E();
                atomicReference = this.f73999a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f74003e.f74136a.mo86903d().mo87489r().mo87466d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f74000b, e);
                    this.f73999a.set(Collections.emptyList());
                    atomicReference = this.f73999a;
                } catch (Throwable th) {
                    this.f73999a.notify();
                    throw th;
                }
            }
        }
    }
}
