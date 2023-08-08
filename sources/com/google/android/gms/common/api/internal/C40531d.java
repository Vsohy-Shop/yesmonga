package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40996v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C40531d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    public static final C40531d f103333e = new C40531d();

    /* renamed from: a */
    public final AtomicBoolean f103334a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f103335b = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: c */
    public final ArrayList f103336c = new ArrayList();
    @GuardedBy("sInstance")

    /* renamed from: d */
    public boolean f103337d = false;

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public interface C40532a {
        @C40473a
        /* renamed from: a */
        void mo95728a(boolean z);
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static C40531d m164957b() {
        return f103333e;
    }

    @C40473a
    /* renamed from: c */
    public static void m164958c(@C0359n0 Application application) {
        C40531d dVar = f103333e;
        synchronized (dVar) {
            if (!dVar.f103337d) {
                application.registerActivityLifecycleCallbacks(dVar);
                application.registerComponentCallbacks(dVar);
                dVar.f103337d = true;
            }
        }
    }

    @C40473a
    /* renamed from: a */
    public void mo133850a(@C0359n0 C40532a aVar) {
        synchronized (f103333e) {
            this.f103336c.add(aVar);
        }
    }

    @C40473a
    /* renamed from: d */
    public boolean mo133851d() {
        return this.f103334a.get();
    }

    @C40473a
    @TargetApi(16)
    /* renamed from: e */
    public boolean mo133852e(boolean z) {
        if (!this.f103335b.get()) {
            if (!C40996v.m166680e()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f103335b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f103334a.set(true);
            }
        }
        return mo133851d();
    }

    /* renamed from: f */
    public final void mo133853f(boolean z) {
        synchronized (f103333e) {
            Iterator it = this.f103336c.iterator();
            while (it.hasNext()) {
                ((C40532a) it.next()).mo95728a(z);
            }
        }
    }

    public final void onActivityCreated(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
        boolean compareAndSet = this.f103334a.compareAndSet(true, false);
        this.f103335b.set(true);
        if (compareAndSet) {
            mo133853f(false);
        }
    }

    public final void onActivityDestroyed(@C0359n0 Activity activity) {
    }

    public final void onActivityPaused(@C0359n0 Activity activity) {
    }

    public final void onActivityResumed(@C0359n0 Activity activity) {
        boolean compareAndSet = this.f103334a.compareAndSet(true, false);
        this.f103335b.set(true);
        if (compareAndSet) {
            mo133853f(false);
        }
    }

    public final void onActivitySaveInstanceState(@C0359n0 Activity activity, @C0359n0 Bundle bundle) {
    }

    public final void onActivityStarted(@C0359n0 Activity activity) {
    }

    public final void onActivityStopped(@C0359n0 Activity activity) {
    }

    public final void onConfigurationChanged(@C0359n0 Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f103334a.compareAndSet(false, true)) {
            this.f103335b.set(true);
            mo133853f(true);
        }
    }
}
