package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.fa */
public final class C30723fa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzq f73401a;

    /* renamed from: b */
    public final /* synthetic */ C30822na f73402b;

    public C30723fa(C30822na naVar, zzq zzq) {
        this.f73402b = naVar;
        this.f73401a = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C30738h V = this.f73402b.mo87359V((String) C40843u.m166202l(this.f73401a.f74188a));
        zzah zzah = zzah.ANALYTICS_STORAGE;
        if (V.mo87142i(zzah) && C30738h.m123795b(this.f73401a.f74180K0).mo87142i(zzah)) {
            return this.f73402b.mo87356S(this.f73401a).mo86996j0();
        }
        this.f73402b.mo86903d().mo87493v().mo87463a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
