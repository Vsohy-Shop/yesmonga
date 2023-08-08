package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C1866a;
import androidx.fragment.app.C19232h;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.contentsquare.android.sdk.a1 */
public class C14167a1 {

    /* renamed from: a */
    public final C1866a<Class<?>, C14278dc> f35033a = new C1866a<>();

    /* renamed from: b */
    public final C14453jf f35034b = new C14453jf("StrategiesCache");

    /* renamed from: c */
    public final C14605p2 f35035c;

    /* renamed from: d */
    public final C14885y5 f35036d;

    /* renamed from: e */
    public final C14808w f35037e;

    /* renamed from: f */
    public final C14263d1 f35038f;

    public C14167a1(C14687rd rdVar) {
        this.f35035c = rdVar.mo36355b();
        this.f35036d = rdVar.mo36356c();
        this.f35037e = rdVar.mo36354a();
        this.f35038f = rdVar.mo36357d();
    }

    /* renamed from: a */
    public final ViewGroup mo34482a(Activity activity) {
        View a = C14668r7.m63249a(activity);
        if (a instanceof ViewGroup) {
            return (ViewGroup) a;
        }
        return null;
    }

    /* renamed from: b */
    public final ViewPager mo34483b(Activity activity) {
        ViewGroup a = mo34482a(activity);
        if (a != null) {
            return this.f35038f.mo34901a(a);
        }
        return null;
    }

    /* renamed from: c */
    public final C14278dc mo34484c(Activity activity) {
        if (this.f35036d.mo36929a(activity)) {
            C19232h hVar = (C19232h) activity;
            if (mo34483b(activity) != null) {
                this.f35034b.mo35676e("[ DetermineAndProvideStrategy ]: Strategy created for the ViewPagerFragmentActivity type");
                return this.f35035c.mo36135c();
            } else if (this.f35037e.mo36656c(hVar)) {
                this.f35034b.mo35676e("[ DetermineAndProvideStrategy ]: Strategy created for the FragmentActivity type with the right Support API.");
                return this.f35035c.mo36134b();
            }
        }
        this.f35034b.mo35676e("[ DetermineAndProvideStrategy ]: Strategy created for the default Activity type");
        return this.f35035c.mo36133a();
    }

    /* renamed from: d */
    public final C14278dc mo34485d(Activity activity) {
        C14278dc dcVar = this.f35033a.get(activity.getClass());
        if (dcVar == null) {
            this.f35034b.mo35674c("[ DetermineAndProvideStrategy ]: Strategy not found in cache for %s", activity.getClass().getSimpleName());
            dcVar = mo34484c(activity);
        } else {
            this.f35034b.mo35674c("[ DetermineAndProvideStrategy ]: Strategy found in cache for %s", activity.getClass().getSimpleName());
        }
        this.f35033a.put(activity.getClass(), dcVar);
        return dcVar;
    }

    /* renamed from: e */
    public C14278dc mo34486e(Activity activity) {
        return mo34485d(activity);
    }

    /* renamed from: f */
    public C14278dc mo34487f(Activity activity) {
        return this.f35033a.get(activity.getClass());
    }
}
