package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.C0363p0;

@TargetApi(14)
/* renamed from: com.google.android.gms.analytics.n */
public final class C40402n implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C40379e f102971a;

    public C40402n(C40379e eVar) {
        this.f102971a = eVar;
    }

    public final void onActivityCreated(Activity activity, @C0363p0 Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f102971a.mo133291x(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.f102971a.mo133292y(activity);
    }
}
