package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
public final class C30797l9 {

    /* renamed from: a */
    public final Context f73737a;

    public C30797l9(Context context) {
        C40843u.m166202l(context);
        this.f73737a = context;
    }

    @C0353k0
    /* renamed from: a */
    public final int mo87256a(Intent intent, int i, int i2) {
        C30731g5 H = C30731g5.m123740H(this.f73737a, (zzcl) null, (Long) null);
        C30899u3 d = H.mo86903d();
        if (intent == null) {
            d.mo87494w().mo87463a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo86901b();
        d.mo87493v().mo87465c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo87263h(new C30761i9(this, i2, d, intent));
        }
        return 2;
    }

    @C0353k0
    /* renamed from: b */
    public final IBinder mo87257b(Intent intent) {
        if (intent == null) {
            mo87266k().mo87489r().mo87463a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C30949y5(C30822na.m124014f0(this.f73737a), (String) null);
        }
        mo87266k().mo87494w().mo87464b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo87258c(int i, C30899u3 u3Var, Intent intent) {
        if (((C30785k9) this.f73737a).mo86740a(i)) {
            u3Var.mo87493v().mo87464b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            mo87266k().mo87493v().mo87463a("Completed wakeful intent.");
            ((C30785k9) this.f73737a).mo86741b(intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo87259d(C30899u3 u3Var, JobParameters jobParameters) {
        u3Var.mo87493v().mo87463a("AppMeasurementJobService processed last upload request.");
        ((C30785k9) this.f73737a).mo86742c(jobParameters, false);
    }

    @C0353k0
    /* renamed from: e */
    public final void mo87260e() {
        C30731g5 H = C30731g5.m123740H(this.f73737a, (zzcl) null, (Long) null);
        C30899u3 d = H.mo86903d();
        H.mo86901b();
        d.mo87493v().mo87463a("Local AppMeasurementService is starting up");
    }

    @C0353k0
    /* renamed from: f */
    public final void mo87261f() {
        C30731g5 H = C30731g5.m123740H(this.f73737a, (zzcl) null, (Long) null);
        C30899u3 d = H.mo86903d();
        H.mo86901b();
        d.mo87493v().mo87463a("Local AppMeasurementService is shutting down");
    }

    @C0353k0
    /* renamed from: g */
    public final void mo87262g(Intent intent) {
        if (intent == null) {
            mo87266k().mo87489r().mo87463a("onRebind called with null intent");
            return;
        }
        mo87266k().mo87493v().mo87464b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo87263h(Runnable runnable) {
        C30822na f0 = C30822na.m124014f0(this.f73737a);
        f0.mo86904f().mo86950z(new C30773j9(this, f0, runnable));
    }

    @C0353k0
    @TargetApi(24)
    /* renamed from: i */
    public final boolean mo87264i(JobParameters jobParameters) {
        C30731g5 H = C30731g5.m123740H(this.f73737a, (zzcl) null, (Long) null);
        C30899u3 d = H.mo86903d();
        String string = jobParameters.getExtras().getString("action");
        H.mo86901b();
        d.mo87493v().mo87464b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo87263h(new C30748h9(this, d, jobParameters));
        return true;
    }

    @C0353k0
    /* renamed from: j */
    public final boolean mo87265j(Intent intent) {
        if (intent == null) {
            mo87266k().mo87489r().mo87463a("onUnbind called with null intent");
            return true;
        }
        mo87266k().mo87493v().mo87464b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final C30899u3 mo87266k() {
        return C30731g5.m123740H(this.f73737a, (zzcl) null, (Long) null).mo86903d();
    }
}
