package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
public final class C30878s6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73941a;

    /* renamed from: b */
    public final /* synthetic */ String f73942b;

    /* renamed from: c */
    public final /* synthetic */ Object f73943c;

    /* renamed from: d */
    public final /* synthetic */ long f73944d;

    /* renamed from: e */
    public final /* synthetic */ C30819n7 f73945e;

    public C30878s6(C30819n7 n7Var, String str, String str2, Object obj, long j) {
        this.f73945e = n7Var;
        this.f73941a = str;
        this.f73942b = str2;
        this.f73943c = obj;
        this.f73944d = j;
    }

    public final void run() {
        this.f73945e.mo87311M(this.f73941a, this.f73942b, this.f73943c, this.f73944d);
    }
}
