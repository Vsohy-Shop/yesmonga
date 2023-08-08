package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
public final class C30938x6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f74084a;

    /* renamed from: b */
    public final /* synthetic */ String f74085b;

    /* renamed from: c */
    public final /* synthetic */ String f74086c;

    /* renamed from: d */
    public final /* synthetic */ C30819n7 f74087d;

    public C30938x6(C30819n7 n7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f74087d = n7Var;
        this.f74084a = atomicReference;
        this.f74085b = str2;
        this.f74086c = str3;
    }

    public final void run() {
        this.f74087d.f74136a.mo87108L().mo87033U(this.f74084a, (String) null, this.f74085b, this.f74086c);
    }
}
