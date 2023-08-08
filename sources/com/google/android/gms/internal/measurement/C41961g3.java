package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
public final class C41961g3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C41979h3 f106147a;

    public C41961g3(C41979h3 h3Var) {
        this.f106147a = h3Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f106147a.mo136929v(new C42272y2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f106147a.mo136929v(new C41943f3(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f106147a.mo136929v(new C41889c3(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f106147a.mo136929v(new C41853a3(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C41851a1 a1Var = new C41851a1();
        this.f106147a.mo136929v(new C41925e3(this, activity, a1Var));
        Bundle H0 = a1Var.mo136496H0(50);
        if (H0 != null) {
            bundle.putAll(H0);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f106147a.mo136929v(new C42289z2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f106147a.mo136929v(new C41907d3(this, activity));
    }
}
