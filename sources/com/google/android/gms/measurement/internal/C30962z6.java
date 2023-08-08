package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
public final class C30962z6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f74137a;

    /* renamed from: b */
    public final /* synthetic */ String f74138b;

    /* renamed from: c */
    public final /* synthetic */ String f74139c;

    /* renamed from: d */
    public final /* synthetic */ boolean f74140d;

    /* renamed from: e */
    public final /* synthetic */ C30819n7 f74141e;

    public C30962z6(C30819n7 n7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f74141e = n7Var;
        this.f74137a = atomicReference;
        this.f74138b = str2;
        this.f74139c = str3;
        this.f74140d = z;
    }

    public final void run() {
        this.f74141e.f74136a.mo87108L().mo87036X(this.f74137a, (String) null, this.f74138b, this.f74139c, this.f74140d);
    }
}
