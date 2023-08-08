package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.C41935ed;
import com.google.android.gms.internal.measurement.C41955ff;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
public final class C30893t9 {

    /* renamed from: a */
    public final /* synthetic */ C30905u9 f73971a;

    public C30893t9(C30905u9 u9Var) {
        this.f73971a = u9Var;
    }

    @C0348i1
    /* renamed from: a */
    public final void mo87481a() {
        this.f73971a.mo86866h();
        if (this.f73971a.f74136a.mo87103F().mo87198v(this.f73971a.f74136a.mo86900a().mo134768a())) {
            this.f73971a.f74136a.mo87103F().f73656l.mo87051a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f73971a.f74136a.mo86903d().mo87493v().mo87463a("Detected application was in foreground");
                mo87483c(this.f73971a.f74136a.mo86900a().mo134768a(), false);
            }
        }
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87482b(long j, boolean z) {
        this.f73971a.mo86866h();
        this.f73971a.mo87500s();
        if (this.f73971a.f74136a.mo87103F().mo87198v(j)) {
            this.f73971a.f74136a.mo87103F().f73656l.mo87051a(true);
            C41955ff.m169896b();
            if (this.f73971a.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73552p0)) {
                this.f73971a.f74136a.mo87099B().mo87249v();
            }
        }
        this.f73971a.f74136a.mo87103F().f73659o.mo87097b(j);
        if (this.f73971a.f74136a.mo87103F().f73656l.mo87052b()) {
            mo87483c(j, z);
        }
    }

    @C0348i1
    @C40974d0
    /* renamed from: c */
    public final void mo87483c(long j, boolean z) {
        this.f73971a.mo86866h();
        if (this.f73971a.f74136a.mo87123o()) {
            this.f73971a.f74136a.mo87103F().f73659o.mo87097b(j);
            this.f73971a.f74136a.mo86903d().mo87493v().mo87464b("Session started, time", Long.valueOf(this.f73971a.f74136a.mo86900a().mo134770c()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f73971a.f74136a.mo87105I().mo87311M("auto", "_sid", valueOf, j);
            this.f73971a.f74136a.mo87103F().f73660p.mo87097b(valueOf.longValue());
            this.f73971a.f74136a.mo87103F().f73656l.mo87051a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f73971a.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73528d0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f73971a.f74136a.mo87105I().mo87335v("auto", "_s", j, bundle);
            C41935ed.m169830b();
            if (this.f73971a.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73534g0)) {
                String a = this.f73971a.f74136a.mo87103F().f73665u.mo87179a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f73971a.f74136a.mo87105I().mo87335v("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
