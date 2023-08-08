package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.C40843u;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.u */
public final class C40409u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40405q f102988a;

    /* renamed from: b */
    public final /* synthetic */ C40372a0 f102989b;

    public C40409u(C40372a0 a0Var, C40405q qVar) {
        this.f102989b = a0Var;
        this.f102988a = qVar;
    }

    public final void run() {
        this.f102988a.mo133433d().mo133416a(this.f102988a);
        for (C40374b0 zza : this.f102989b.f102902b) {
            zza.zza();
        }
        C40405q qVar = this.f102988a;
        C40843u.m166201k("deliver should be called from worker thread");
        C40843u.m166192b(qVar.mo133442m(), "Measurement must be submitted");
        List<C40376c0> f = qVar.mo133435f();
        if (!f.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C40376c0 next : f) {
                Uri zzb = next.zzb();
                if (!hashSet.contains(zzb)) {
                    hashSet.add(zzb);
                    next.mo133268d(qVar);
                }
            }
        }
    }
}
