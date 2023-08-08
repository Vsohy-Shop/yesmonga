package com.contentsquare.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.se */
public class C14709se implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public WeakReference<Activity> f36403a = new WeakReference<>((Object) null);

    public C14709se(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity mo36415a() {
        return this.f36403a.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f36403a = new WeakReference<>((Object) null);
    }

    public void onActivityResumed(Activity activity) {
        this.f36403a = new WeakReference<>(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
