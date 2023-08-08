package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import androidx.annotation.C0380x0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.gtm.C41467o4;
import com.google.android.gms.stats.C30993d;

/* renamed from: com.google.android.gms.internal.gtm.p4 */
public final class C41491p4<T extends Context & C41467o4> {

    /* renamed from: c */
    public static Boolean f104853c;

    /* renamed from: a */
    public final Handler f104854a = new C41203d5();

    /* renamed from: b */
    public final T f104855b;

    public C41491p4(T t) {
        C40843u.m166202l(t);
        this.f104855b = t;
    }

    /* renamed from: h */
    public static boolean m168141h(Context context) {
        C40843u.m166202l(context);
        Boolean bool = f104853c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        f104853c = Boolean.valueOf(z);
        return z;
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public final int mo135702a(Intent intent, int i, int i2) {
        try {
            synchronized (C41371k4.f104741a) {
                C30993d dVar = C41371k4.f104742b;
                if (dVar != null && dVar.mo87681b()) {
                    dVar.mo87682c();
                }
            }
        } catch (SecurityException unused) {
        }
        C41607u0 g = C41607u0.m168444g(this.f104855b);
        C41202d4 m = g.mo135902m();
        if (intent == null) {
            m.mo135762y("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        g.mo135899j();
        m.mo135761x("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            mo135707g(new C41395l4(this, i2, m));
        }
        return 2;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo135703c(int i, C41202d4 d4Var) {
        if (((C41467o4) this.f104855b).mo135679a(i)) {
            d4Var.mo135759v("Local AnalyticsService processed last dispatch request");
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo135704d(C41202d4 d4Var, JobParameters jobParameters) {
        d4Var.mo135759v("AnalyticsJobService processed last dispatch request");
        ((C41467o4) this.f104855b).mo135680b(jobParameters, false);
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: e */
    public final void mo135705e() {
        C41607u0 g = C41607u0.m168444g(this.f104855b);
        C41202d4 m = g.mo135902m();
        g.mo135899j();
        m.mo135759v("Local AnalyticsService is starting up");
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: f */
    public final void mo135706f() {
        C41607u0 g = C41607u0.m168444g(this.f104855b);
        C41202d4 m = g.mo135902m();
        g.mo135899j();
        m.mo135759v("Local AnalyticsService is shutting down");
    }

    /* renamed from: g */
    public final void mo135707g(Runnable runnable) {
        C41607u0.m168444g(this.f104855b).mo135896f().mo135692b0(new C41443n4(this, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean mo135708i(JobParameters jobParameters) {
        C41607u0 g = C41607u0.m168444g(this.f104855b);
        C41202d4 m = g.mo135902m();
        String string = jobParameters.getExtras().getString("action");
        g.mo135899j();
        m.mo135760w("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        mo135707g(new C41419m4(this, m, jobParameters));
        return true;
    }
}
