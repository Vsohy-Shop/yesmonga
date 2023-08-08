package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.measurement.api.C30638a;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
public final class C30914v6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f74025a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f74026b;

    public C30914v6(C30819n7 n7Var, Bundle bundle) {
        this.f74026b = n7Var;
        this.f74025a = bundle;
    }

    public final void run() {
        C30819n7 n7Var = this.f74026b;
        Bundle bundle = this.f74025a;
        n7Var.mo86866h();
        n7Var.mo86890i();
        C40843u.m166202l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C40843u.m166198h(string);
        C40843u.m166198h(string2);
        C40843u.m166202l(bundle.get("value"));
        if (!n7Var.f74136a.mo87123o()) {
            n7Var.f74136a.mo86903d().mo87493v().mo87463a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzli zzli = new zzli(string, bundle.getLong(C30638a.C30639a.f73206o), bundle.get("value"), string2);
        try {
            zzaw y0 = n7Var.f74136a.mo87110N().mo87549y0(bundle.getString("app_id"), bundle.getString(C30638a.C30639a.f73199h), bundle.getBundle(C30638a.C30639a.f73200i), string2, 0, true, true);
            zzaw y02 = n7Var.f74136a.mo87110N().mo87549y0(bundle.getString("app_id"), bundle.getString(C30638a.C30639a.f73197f), bundle.getBundle(C30638a.C30639a.f73198g), string2, 0, true, true);
            zzaw y03 = n7Var.f74136a.mo87110N().mo87549y0(bundle.getString("app_id"), bundle.getString(C30638a.C30639a.f73202k), bundle.getBundle(C30638a.C30639a.f73203l), string2, 0, true, true);
            n7Var.f74136a.mo87108L().mo87041s(new zzac(bundle.getString("app_id"), string2, zzli, bundle.getLong(C30638a.C30639a.f73204m), false, bundle.getString(C30638a.C30639a.f73195d), y02, bundle.getLong(C30638a.C30639a.f73196e), y0, bundle.getLong(C30638a.C30639a.f73201j), y03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
