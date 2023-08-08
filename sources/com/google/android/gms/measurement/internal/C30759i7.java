package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41955ff;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
public final class C30759i7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30738h f73601a;

    /* renamed from: b */
    public final /* synthetic */ long f73602b;

    /* renamed from: c */
    public final /* synthetic */ int f73603c;

    /* renamed from: d */
    public final /* synthetic */ long f73604d;

    /* renamed from: e */
    public final /* synthetic */ boolean f73605e;

    /* renamed from: f */
    public final /* synthetic */ C30738h f73606f;

    /* renamed from: g */
    public final /* synthetic */ C30819n7 f73607g;

    public C30759i7(C30819n7 n7Var, C30738h hVar, long j, int i, long j2, boolean z, C30738h hVar2) {
        this.f73607g = n7Var;
        this.f73601a = hVar;
        this.f73602b = j;
        this.f73603c = i;
        this.f73604d = j2;
        this.f73605e = z;
        this.f73606f = hVar2;
    }

    public final void run() {
        this.f73607g.mo87308J(this.f73601a);
        this.f73607g.mo87339z(this.f73602b, false);
        C30819n7.m123963d0(this.f73607g, this.f73601a, this.f73603c, this.f73604d, true, this.f73605e);
        C41955ff.m169896b();
        if (this.f73607g.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73552p0)) {
            C30819n7.m123962c0(this.f73607g, this.f73601a, this.f73606f);
        }
    }
}
