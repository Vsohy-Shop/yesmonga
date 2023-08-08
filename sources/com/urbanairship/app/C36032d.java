package com.urbanairship.app;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36064q;

/* renamed from: com.urbanairship.app.d */
public class C36032d implements C36029a {

    /* renamed from: a */
    public final C36029a f89017a;

    /* renamed from: b */
    public final C36064q<Activity> f89018b;

    public C36032d(@C0359n0 C36029a aVar, @C0359n0 C36064q<Activity> qVar) {
        this.f89017a = aVar;
        this.f89018b = qVar;
    }

    public void onActivityCreated(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(@C0359n0 Activity activity) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(@C0359n0 Activity activity) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(@C0359n0 Activity activity) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(@C0359n0 Activity activity, @C0359n0 Bundle bundle) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(@C0359n0 Activity activity) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(@C0359n0 Activity activity) {
        if (this.f89018b.apply(activity)) {
            this.f89017a.onActivityStopped(activity);
        }
    }
}
