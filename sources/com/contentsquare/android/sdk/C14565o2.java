package com.contentsquare.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.contentsquare.android.sdk.o2 */
public class C14565o2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f36054a;

    /* renamed from: b */
    public final C14930zc f36055b;

    public C14565o2(Application application, C14930zc zcVar) {
        this.f36054a = application;
        this.f36055b = zcVar;
    }

    /* renamed from: a */
    public void mo36026a() {
        this.f36054a.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: b */
    public void mo36027b() {
        this.f36054a.unregisterActivityLifecycleCallbacks(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f36055b.mo36983f();
    }

    public void onActivityResumed(Activity activity) {
        this.f36055b.mo36979b(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
