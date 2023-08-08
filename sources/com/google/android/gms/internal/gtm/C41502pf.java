package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.pf */
public final class C41502pf {

    /* renamed from: a */
    public final ScheduledExecutorService f104883a;

    /* renamed from: b */
    public ScheduledFuture<?> f104884b = null;

    public C41502pf() {
        ScheduledExecutorService m = C41155b5.m167147a().mo134996m(1, 2);
        this.f104883a = m;
    }

    /* renamed from: a */
    public final void mo135716a(Context context, C41165bf bfVar, long j, C41573se seVar) {
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.f104884b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f104884b = this.f104883a.schedule(new C41478of(context, bfVar, seVar), 0, TimeUnit.MILLISECONDS);
        }
    }
}
