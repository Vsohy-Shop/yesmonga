package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
public final /* synthetic */ class C30852q4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C30936x4 f73871a;

    /* renamed from: b */
    public final /* synthetic */ String f73872b;

    public /* synthetic */ C30852q4(C30936x4 x4Var, String str) {
        this.f73871a = x4Var;
        this.f73872b = str;
    }

    public final Object call() {
        C30936x4 x4Var = this.f73871a;
        String str = this.f73872b;
        C30693d6 R = x4Var.f74119b.mo87360W().mo87214R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        x4Var.f74136a.mo87130z().mo87084q();
        hashMap.put("gmp_version", 76003L);
        if (R != null) {
            String l0 = R.mo87000l0();
            if (l0 != null) {
                hashMap.put("app_version", l0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo86966P()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo86975Y()));
        }
        return hashMap;
    }
}
