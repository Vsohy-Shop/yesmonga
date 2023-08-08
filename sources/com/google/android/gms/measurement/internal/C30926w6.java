package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.measurement.api.C30638a;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
public final class C30926w6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f74046a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f74047b;

    public C30926w6(C30819n7 n7Var, Bundle bundle) {
        this.f74047b = n7Var;
        this.f74046a = bundle;
    }

    public final void run() {
        C30819n7 n7Var = this.f74047b;
        Bundle bundle = this.f74046a;
        n7Var.mo86866h();
        n7Var.mo86890i();
        C40843u.m166202l(bundle);
        String h = C40843u.m166198h(bundle.getString("name"));
        if (!n7Var.f74136a.mo87123o()) {
            n7Var.f74136a.mo86903d().mo87493v().mo87463a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            n7Var.f74136a.mo87108L().mo87041s(new zzac(bundle.getString("app_id"), "", new zzli(h, 0, (Object) null, ""), bundle.getLong(C30638a.C30639a.f73204m), bundle.getBoolean(C30638a.C30639a.f73205n), bundle.getString(C30638a.C30639a.f73195d), (zzaw) null, bundle.getLong(C30638a.C30639a.f73196e), (zzaw) null, bundle.getLong(C30638a.C30639a.f73201j), n7Var.f74136a.mo87110N().mo87549y0(bundle.getString("app_id"), bundle.getString(C30638a.C30639a.f73202k), bundle.getBundle(C30638a.C30639a.f73203l), "", bundle.getLong(C30638a.C30639a.f73204m), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
