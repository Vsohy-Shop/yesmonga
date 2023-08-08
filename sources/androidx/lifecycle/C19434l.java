package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.C0696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.l */
public class C19434l implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityDestroyed(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityPaused(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityResumed(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivitySaveInstanceState(@C12579k Activity activity, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public void onActivityStarted(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityStopped(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }
}
