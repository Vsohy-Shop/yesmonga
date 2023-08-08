package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41955ff;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
public final class C30771j7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30738h f73631a;

    /* renamed from: b */
    public final /* synthetic */ int f73632b;

    /* renamed from: c */
    public final /* synthetic */ long f73633c;

    /* renamed from: d */
    public final /* synthetic */ boolean f73634d;

    /* renamed from: e */
    public final /* synthetic */ C30738h f73635e;

    /* renamed from: f */
    public final /* synthetic */ C30819n7 f73636f;

    public C30771j7(C30819n7 n7Var, C30738h hVar, int i, long j, boolean z, C30738h hVar2) {
        this.f73636f = n7Var;
        this.f73631a = hVar;
        this.f73632b = i;
        this.f73633c = j;
        this.f73634d = z;
        this.f73635e = hVar2;
    }

    public final void run() {
        this.f73636f.mo87308J(this.f73631a);
        C30819n7.m123963d0(this.f73636f, this.f73631a, this.f73632b, this.f73633c, false, this.f73634d);
        C41955ff.m169896b();
        if (this.f73636f.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73552p0)) {
            C30819n7.m123962c0(this.f73636f, this.f73631a, this.f73635e);
        }
    }
}
