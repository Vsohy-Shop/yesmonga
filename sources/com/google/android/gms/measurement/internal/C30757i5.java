package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
public final class C30757i5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzac f73598a;

    /* renamed from: b */
    public final /* synthetic */ zzq f73599b;

    /* renamed from: c */
    public final /* synthetic */ C30949y5 f73600c;

    public C30757i5(C30949y5 y5Var, zzac zzac, zzq zzq) {
        this.f73600c = y5Var;
        this.f73598a = zzac;
        this.f73599b = zzq;
    }

    public final void run() {
        this.f73600c.f74111n.mo87367e();
        if (this.f73598a.f74149c.mo87644M() == null) {
            this.f73600c.f74111n.mo87387t(this.f73598a, this.f73599b);
        } else {
            this.f73600c.f74111n.mo87393z(this.f73598a, this.f73599b);
        }
    }
}
