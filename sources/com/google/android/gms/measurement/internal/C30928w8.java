package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
public final class C30928w8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f74053a;

    /* renamed from: b */
    public final /* synthetic */ String f74054b;

    /* renamed from: c */
    public final /* synthetic */ String f74055c;

    /* renamed from: d */
    public final /* synthetic */ zzq f74056d;

    /* renamed from: e */
    public final /* synthetic */ boolean f74057e;

    /* renamed from: f */
    public final /* synthetic */ C30696d9 f74058f;

    public C30928w8(C30696d9 d9Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzq, boolean z) {
        this.f74058f = d9Var;
        this.f74053a = atomicReference;
        this.f74054b = str2;
        this.f74055c = str3;
        this.f74056d = zzq;
        this.f74057e = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f74053a) {
            try {
                C30696d9 d9Var = this.f74058f;
                C30779k3 H = d9Var.f73339d;
                if (H == null) {
                    d9Var.f74136a.mo86903d().mo87489r().mo87466d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f74054b, this.f74055c);
                    this.f74053a.set(Collections.emptyList());
                    this.f74053a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C40843u.m166202l(this.f74056d);
                    this.f74053a.set(H.mo87156S3(this.f74054b, this.f74055c, this.f74057e, this.f74056d));
                } else {
                    this.f74053a.set(H.mo87166t5((String) null, this.f74054b, this.f74055c, this.f74057e));
                }
                this.f74058f.mo87023E();
                atomicReference = this.f74053a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f74058f.f74136a.mo86903d().mo87489r().mo87466d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f74054b, e);
                    this.f74053a.set(Collections.emptyList());
                    atomicReference = this.f74053a;
                } catch (Throwable th) {
                    this.f74053a.notify();
                    throw th;
                }
            }
        }
    }
}
