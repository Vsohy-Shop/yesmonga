package com.urbanairship.app;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.app.e */
public class C36033e implements C36029a {

    /* renamed from: a */
    public final List<C36029a> f89019a = new ArrayList();

    /* renamed from: a */
    public void mo107767a(@C0359n0 C36029a aVar) {
        synchronized (this.f89019a) {
            this.f89019a.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo107768b(@C0359n0 C36029a aVar) {
        synchronized (this.f89019a) {
            this.f89019a.remove(aVar);
        }
    }

    public void onActivityCreated(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(@C0359n0 Activity activity) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(@C0359n0 Activity activity) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityPaused(activity);
        }
    }

    public void onActivityResumed(@C0359n0 Activity activity) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(@C0359n0 Activity activity) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityStarted(activity);
        }
    }

    public void onActivityStopped(@C0359n0 Activity activity) {
        Iterator it = new ArrayList(this.f89019a).iterator();
        while (it.hasNext()) {
            ((C36029a) it.next()).onActivityStopped(activity);
        }
    }
}
