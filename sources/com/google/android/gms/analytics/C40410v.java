package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.v */
public final class C40410v extends FutureTask {

    /* renamed from: a */
    public final /* synthetic */ C40411w f102990a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40410v(C40411w wVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f102990a = wVar;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler e = this.f102990a.f102991a.f102906f;
        if (e != null) {
            e.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
        }
        super.setException(th);
    }
}
