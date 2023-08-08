package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import androidx.core.app.C17075f2;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.x1 */
public final class C41680x1 extends C41535r0 {

    /* renamed from: c */
    public boolean f105224c;

    /* renamed from: d */
    public boolean f105225d;

    /* renamed from: e */
    public final AlarmManager f105226e = ((AlarmManager) mo135734G().getSystemService(C17075f2.f45116w0));

    /* renamed from: f */
    public Integer f105227f;

    public C41680x1(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: W */
    public final void mo133294W() {
        try {
            mo136029X();
            mo135742P();
            if (C41560s1.m168317d() > 0) {
                Context G = mo135734G();
                ActivityInfo receiverInfo = G.getPackageManager().getReceiverInfo(new ComponentName(G, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo135759v("Receiver registered for local dispatch.");
                    this.f105224c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: X */
    public final void mo136029X() {
        this.f105225d = false;
        try {
            this.f105226e.cancel(mo136034d0());
        } catch (NullPointerException unused) {
        }
        int c0 = mo136033c0();
        mo135760w("Cancelling job. JobID", Integer.valueOf(c0));
        ((JobScheduler) mo135734G().getSystemService("jobscheduler")).cancel(c0);
    }

    /* renamed from: Z */
    public final void mo136030Z() {
        mo135794T();
        C40843u.m166209s(this.f105224c, "Receiver not registered");
        mo135742P();
        long d = C41560s1.m168317d();
        if (d > 0) {
            mo136029X();
            mo135748j().mo134770c();
            this.f105225d = true;
            C41634v3.f105114S.mo135909b().booleanValue();
            mo135759v("Scheduling upload with JobScheduler");
            Context G = mo135734G();
            ComponentName componentName = new ComponentName(G, "com.google.android.gms.analytics.AnalyticsJobService");
            int c0 = mo136033c0();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo build = new JobInfo.Builder(c0, componentName).setMinimumLatency(d).setOverrideDeadline(d + d).setExtras(persistableBundle).build();
            mo135760w("Scheduling job. JobID", Integer.valueOf(c0));
            C41683x4.m168701a(G, build, "com.google.android.gms", "DispatchAlarm");
        }
    }

    /* renamed from: a0 */
    public final boolean mo136031a0() {
        return this.f105224c;
    }

    /* renamed from: b0 */
    public final boolean mo136032b0() {
        return this.f105225d;
    }

    /* renamed from: c0 */
    public final int mo136033c0() {
        String str;
        if (this.f105227f == null) {
            String valueOf = String.valueOf(mo135734G().getPackageName());
            if (valueOf.length() != 0) {
                str = "analytics".concat(valueOf);
            } else {
                str = new String("analytics");
            }
            this.f105227f = Integer.valueOf(str.hashCode());
        }
        return this.f105227f.intValue();
    }

    /* renamed from: d0 */
    public final PendingIntent mo136034d0() {
        Context G = mo135734G();
        return C41659w4.m168642a(G, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(G, "com.google.android.gms.analytics.AnalyticsReceiver")), C41659w4.f105189a);
    }
}
