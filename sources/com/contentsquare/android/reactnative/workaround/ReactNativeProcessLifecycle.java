package com.contentsquare.android.reactnative.workaround;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.sdk.C14453jf;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReactNativeProcessLifecycle implements Application.ActivityLifecycleCallbacks, C19427i {

    /* renamed from: d */
    public static final C14453jf f35016d = new C14453jf("ReactNativeProcessLifecycle");

    /* renamed from: a */
    public final C14160c f35017a;

    /* renamed from: b */
    public final C14159b f35018b;

    /* renamed from: c */
    public List<Boolean> f35019c = Collections.emptyList();

    /* renamed from: com.contentsquare.android.reactnative.workaround.ReactNativeProcessLifecycle$a */
    public static class C14158a {

        /* renamed from: a */
        public final Application f35020a;

        public C14158a(Application application) {
            this.f35020a = application;
        }

        /* renamed from: a */
        public ReactNativeProcessLifecycle mo34457a(C14160c cVar, C19499w wVar) {
            return new ReactNativeProcessLifecycle(this.f35020a, wVar, cVar, new C14159b());
        }
    }

    /* renamed from: com.contentsquare.android.reactnative.workaround.ReactNativeProcessLifecycle$b */
    public static class C14159b {
        /* renamed from: a */
        public boolean mo34458a(Activity activity) {
            try {
                Type genericSuperclass = activity.getClass().getGenericSuperclass();
                if (genericSuperclass != null) {
                    return "class com.facebook.react.ReactActivity".equals(genericSuperclass.toString());
                }
                return false;
            } catch (Exception e) {
                ReactNativeProcessLifecycle.f35016d.mo35678g(e, "Cannot get generic super class", new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: com.contentsquare.android.reactnative.workaround.ReactNativeProcessLifecycle$c */
    public interface C14160c {
        /* renamed from: a */
        void mo34459a();
    }

    public ReactNativeProcessLifecycle(Application application, C19499w wVar, C14160c cVar, C14159b bVar) {
        this.f35017a = cVar;
        this.f35018b = bVar;
        application.registerActivityLifecycleCallbacks(this);
        wVar.getLifecycle().mo57464a(this);
    }

    /* renamed from: a */
    public final void mo34447a() {
        if (this.f35019c.size() == 2) {
            if (this.f35019c.get(0).booleanValue() && this.f35019c.get(1).booleanValue()) {
                this.f35017a.mo34459a();
            }
            this.f35019c = Collections.emptyList();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityResumed(Activity activity) {
        if (this.f35019c != Collections.emptyList()) {
            this.f35019c.add(Boolean.valueOf(this.f35018b.mo34458a(activity)));
            mo34447a();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: v */
    public void mo34383v(C19499w wVar) {
        if (this.f35019c != Collections.emptyList()) {
            this.f35019c.add(Boolean.TRUE);
            mo34447a();
        }
    }

    /* renamed from: y */
    public void mo34384y(C19499w wVar) {
        this.f35019c = new ArrayList(2);
    }
}
