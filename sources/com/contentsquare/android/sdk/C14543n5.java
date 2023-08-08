package com.contentsquare.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.widget.C0696c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.n5 */
public final class C14543n5 implements C14552nd, Runnable, C14502lc, Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final List<C14374ga> f35988a = new ArrayList();

    /* renamed from: b */
    public List<? extends C14374ga> f35989b;

    /* renamed from: c */
    public final Application f35990c;

    /* renamed from: d */
    public final C14772u7 f35991d;

    /* renamed from: e */
    public final C14531mc f35992e;

    /* renamed from: f */
    public final C14534me f35993f;

    /* renamed from: g */
    public final C14850x6 f35994g;

    public C14543n5(Application application, C14772u7 u7Var, C14531mc mcVar, C14534me meVar, C14850x6 x6Var) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(u7Var, "systemInstantiable");
        Intrinsics.checkNotNullParameter(mcVar, "throttleDebounceOperator");
        Intrinsics.checkNotNullParameter(meVar, "captureTouchEvent");
        Intrinsics.checkNotNullParameter(x6Var, "gestureProcessor");
        this.f35990c = application;
        this.f35991d = u7Var;
        this.f35992e = mcVar;
        this.f35993f = meVar;
        this.f35994g = x6Var;
        application.registerActivityLifecycleCallbacks(this);
        meVar.mo35926b(this);
    }

    /* renamed from: a */
    public void mo35238a() {
        this.f35990c.unregisterActivityLifecycleCallbacks(this);
        this.f35993f.mo35928d(this);
    }

    /* renamed from: b */
    public synchronized void mo35958b(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        List<C14374ga> a = this.f35994g.mo36811a(motionEvent, this.f35991d.mo36566b());
        Intrinsics.checkNotNullExpressionValue(a, "gestureProcessor.compute…s(motionEvent, timestamp)");
        if (motionEvent.getActionMasked() != 1) {
            if (motionEvent.getActionMasked() != 3) {
                this.f35989b = a;
                this.f35992e.mo35922b(this);
            }
        }
        this.f35988a.addAll(a);
    }

    /* renamed from: c */
    public synchronized List<C14374ga> mo35239c(C14507le leVar, long j) {
        List<C14374ga> T5;
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        T5 = CollectionsKt___CollectionsKt.m40572T5(this.f35988a);
        this.f35988a.clear();
        return T5;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        this.f35993f.mo35928d(this);
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        this.f35993f.mo35926b(this);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
    }

    public synchronized void run() {
        List<? extends C14374ga> list = this.f35989b;
        if (list != null) {
            List<C14374ga> list2 = this.f35988a;
            Intrinsics.checkNotNull(list);
            list2.addAll(list);
        }
    }

    /* renamed from: c */
    public void mo35240c() {
    }
}
