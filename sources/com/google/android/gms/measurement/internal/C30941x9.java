package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.core.app.C17075f2;
import com.google.android.gms.internal.measurement.C42185t0;
import com.google.android.gms.internal.measurement.C42202u0;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
public final class C30941x9 extends C30965z9 {

    /* renamed from: d */
    public final AlarmManager f74095d = ((AlarmManager) this.f74136a.mo86902c().getSystemService(C17075f2.f45116w0));

    /* renamed from: e */
    public C30823o f74096e;

    /* renamed from: f */
    public Integer f74097f;

    public C30941x9(C30822na naVar) {
        super(naVar);
    }

    /* renamed from: l */
    public final boolean mo86867l() {
        AlarmManager alarmManager = this.f74095d;
        if (alarmManager != null) {
            alarmManager.cancel(mo87601p());
        }
        mo87603r();
        return false;
    }

    /* renamed from: m */
    public final void mo87598m() {
        mo87627i();
        this.f74136a.mo86903d().mo87493v().mo87463a("Unscheduling upload");
        AlarmManager alarmManager = this.f74095d;
        if (alarmManager != null) {
            alarmManager.cancel(mo87601p());
        }
        mo87602q().mo87394b();
        mo87603r();
    }

    /* renamed from: n */
    public final void mo87599n(long j) {
        mo87627i();
        this.f74136a.mo86901b();
        Context c = this.f74136a.mo86902c();
        if (!C30906ua.m124208a0(c)) {
            this.f74136a.mo86903d().mo87488q().mo87463a("Receiver not registered/enabled");
        }
        if (!C30906ua.m124209b0(c, false)) {
            this.f74136a.mo86903d().mo87488q().mo87463a("Service not registered/enabled");
        }
        mo87598m();
        this.f74136a.mo86903d().mo87493v().mo87464b("Scheduling upload, millis", Long.valueOf(j));
        this.f74136a.mo86900a().mo134770c();
        this.f74136a.mo87130z();
        if (j < Math.max(0, ((Long) C30742h3.f73571z.mo87094a((Object) null)).longValue()) && !mo87602q().mo87396e()) {
            mo87602q().mo87395d(j);
        }
        this.f74136a.mo86901b();
        Context c2 = this.f74136a.mo86902c();
        ComponentName componentName = new ComponentName(c2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int o = mo87600o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C42202u0.m170888a(c2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: o */
    public final int mo87600o() {
        if (this.f74097f == null) {
            this.f74097f = Integer.valueOf("measurement".concat(String.valueOf(this.f74136a.mo86902c().getPackageName())).hashCode());
        }
        return this.f74097f.intValue();
    }

    /* renamed from: p */
    public final PendingIntent mo87601p() {
        Context c = this.f74136a.mo86902c();
        return PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C42185t0.f106414a);
    }

    /* renamed from: q */
    public final C30823o mo87602q() {
        if (this.f74096e == null) {
            this.f74096e = new C30929w9(this, this.f74119b.mo87365c0());
        }
        return this.f74096e;
    }

    @TargetApi(24)
    /* renamed from: r */
    public final void mo87603r() {
        JobScheduler jobScheduler = (JobScheduler) this.f74136a.mo86902c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo87600o());
        }
    }
}
