package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
public final class C30927w7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f74048a;

    /* renamed from: b */
    public final /* synthetic */ C30903u7 f74049b;

    /* renamed from: c */
    public final /* synthetic */ C30903u7 f74050c;

    /* renamed from: d */
    public final /* synthetic */ long f74051d;

    /* renamed from: e */
    public final /* synthetic */ C30682c8 f74052e;

    public C30927w7(C30682c8 c8Var, Bundle bundle, C30903u7 u7Var, C30903u7 u7Var2, long j) {
        this.f74052e = c8Var;
        this.f74048a = bundle;
        this.f74049b = u7Var;
        this.f74050c = u7Var2;
        this.f74051d = j;
    }

    public final void run() {
        C30682c8.m123538w(this.f74052e, this.f74048a, this.f74049b, this.f74050c, this.f74051d);
    }
}
