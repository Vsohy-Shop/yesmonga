package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
public final class C30937x5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f74079a;

    /* renamed from: b */
    public final /* synthetic */ String f74080b;

    /* renamed from: c */
    public final /* synthetic */ String f74081c;

    /* renamed from: d */
    public final /* synthetic */ long f74082d;

    /* renamed from: e */
    public final /* synthetic */ C30949y5 f74083e;

    public C30937x5(C30949y5 y5Var, String str, String str2, String str3, long j) {
        this.f74083e = y5Var;
        this.f74079a = str;
        this.f74080b = str2;
        this.f74081c = str3;
        this.f74082d = j;
    }

    public final void run() {
        String str = this.f74079a;
        if (str == null) {
            this.f74083e.f74111n.mo87390w(this.f74080b, (C30903u7) null);
            return;
        }
        this.f74083e.f74111n.mo87390w(this.f74080b, new C30903u7(this.f74081c, str, this.f74082d));
    }
}
