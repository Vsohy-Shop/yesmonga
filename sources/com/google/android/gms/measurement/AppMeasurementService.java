package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.legacy.content.C19327a;
import com.google.android.gms.measurement.internal.C30785k9;
import com.google.android.gms.measurement.internal.C30797l9;

public final class AppMeasurementService extends Service implements C30785k9 {

    /* renamed from: a */
    public C30797l9 f73190a;

    /* renamed from: a */
    public final boolean mo86740a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo86741b(@C0359n0 Intent intent) {
        C19327a.m90469b(intent);
    }

    /* renamed from: c */
    public final void mo86742c(@C0359n0 JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C30797l9 mo86753d() {
        if (this.f73190a == null) {
            this.f73190a = new C30797l9(this);
        }
        return this.f73190a;
    }

    @C0363p0
    @C0353k0
    public IBinder onBind(@C0359n0 Intent intent) {
        return mo86753d().mo87257b(intent);
    }

    @C0353k0
    public void onCreate() {
        super.onCreate();
        mo86753d().mo87260e();
    }

    @C0353k0
    public void onDestroy() {
        mo86753d().mo87261f();
        super.onDestroy();
    }

    @C0353k0
    public void onRebind(@C0359n0 Intent intent) {
        mo86753d().mo87262g(intent);
    }

    @C0353k0
    public int onStartCommand(@C0359n0 Intent intent, int i, int i2) {
        mo86753d().mo87256a(intent, i, i2);
        return 2;
    }

    @C0353k0
    public boolean onUnbind(@C0359n0 Intent intent) {
        mo86753d().mo87265j(intent);
        return true;
    }
}
