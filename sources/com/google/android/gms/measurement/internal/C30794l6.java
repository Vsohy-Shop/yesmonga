package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
public final /* synthetic */ class C30794l6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30819n7 f73727a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f73728b;

    /* renamed from: c */
    public final /* synthetic */ long f73729c;

    public /* synthetic */ C30794l6(C30819n7 n7Var, Bundle bundle, long j) {
        this.f73727a = n7Var;
        this.f73728b = bundle;
        this.f73729c = j;
    }

    public final void run() {
        C30819n7 n7Var = this.f73727a;
        Bundle bundle = this.f73728b;
        long j = this.f73729c;
        if (TextUtils.isEmpty(n7Var.f74136a.mo87099B().mo87247t())) {
            n7Var.mo87304F(bundle, 0, j);
        } else {
            n7Var.f74136a.mo86903d().mo87495x().mo87463a("Using developer consent only; google app id found");
        }
    }
}
