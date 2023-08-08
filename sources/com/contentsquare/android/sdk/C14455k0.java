package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.C20784a;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.k0 */
public class C14455k0 extends C14809w0<C14457b> {

    /* renamed from: e */
    public final C14550nb<C14765u4, C14688re> f35707e;

    /* renamed from: f */
    public final WeakHashMap<Activity, ViewPager> f35708f;

    /* renamed from: g */
    public final C14263d1 f35709g;

    /* renamed from: h */
    public final C14453jf f35710h;

    /* renamed from: com.contentsquare.android.sdk.k0$a */
    public class C14456a implements C14550nb<C14765u4, C14688re> {

        /* renamed from: a */
        public final /* synthetic */ C14772u7 f35711a;

        /* renamed from: b */
        public final /* synthetic */ C14759u1 f35712b;

        public C14456a(C14772u7 u7Var, C14759u1 u1Var) {
            this.f35711a = u7Var;
            this.f35712b = u1Var;
        }

        /* renamed from: a */
        public C14765u4 mo34909b(C14688re reVar) {
            return new C14765u4(reVar, this.f35711a, this.f35712b.mo36545a());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k0$b */
    public static class C14457b implements C14688re, ViewPager.C20779j {

        /* renamed from: a */
        public final WeakReference<ViewPager> f35713a;

        /* renamed from: b */
        public final WeakReference<Activity> f35714b;

        /* renamed from: c */
        public final C14453jf f35715c = new C14453jf("FragmentViewPagerCallbackWrapper");

        /* renamed from: d */
        public final C14765u4 f35716d;

        public C14457b(C14765u4 u4Var, ViewPager viewPager, Activity activity) {
            this.f35716d = u4Var;
            this.f35713a = new WeakReference<>(viewPager);
            this.f35714b = new WeakReference<>(activity);
        }

        /* renamed from: a */
        public void mo34761a(Activity activity, String str, long j) {
        }

        /* renamed from: b */
        public void mo34762b(Activity activity, Fragment fragment, long j) {
        }

        /* renamed from: c */
        public void mo34763c(Activity activity, String str, long j) {
            this.f35716d.mo34763c(activity, str, j);
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
        }

        /* renamed from: e */
        public void mo30673e(int i) {
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            ViewPager viewPager = this.f35713a.get();
            Activity activity = this.f35714b.get();
            if (viewPager == null || activity == null) {
                this.f35715c.mo35677f("[onPageSelected] we intercepted the onPageSelected but either the activity or the viewPager inside was unreferenced", new Object[0]);
            } else {
                mo34763c(activity, mo35695h(viewPager, i), 0);
            }
        }

        /* renamed from: g */
        public void mo34767g(Activity activity, long j) {
            ViewPager viewPager = this.f35713a.get();
            if (viewPager != null) {
                this.f35716d.mo34763c(activity, mo35695h(viewPager, viewPager.getCurrentItem()), j);
                return;
            }
            this.f35716d.mo34767g(activity, j);
        }

        /* renamed from: h */
        public final String mo35695h(ViewPager viewPager, int i) {
            CharSequence g;
            C20784a adapter = viewPager.getAdapter();
            if (adapter != null && (g = adapter.mo62410g(i)) != null && g.length() > 0) {
                return g.toString();
            }
            return String.format(Locale.ENGLISH, "Page%d", new Object[]{Integer.valueOf(i)});
        }

        /* renamed from: i */
        public void mo35696i() {
            this.f35716d.mo36551d();
            this.f35713a.clear();
            this.f35714b.clear();
        }
    }

    public C14455k0(C14772u7 u7Var, C14759u1 u1Var) {
        this(u7Var, (C14550nb<C14765u4, C14688re>) new C14456a(u7Var, u1Var));
    }

    /* renamed from: b */
    public void mo34905b(Activity activity) {
        C14457b bVar = (C14457b) mo36659e(activity);
        if (bVar != null) {
            ViewPager remove = this.f35708f.remove(activity);
            if (remove != null) {
                remove.mo62314O(bVar);
                this.f35710h.mo35674c("[detachCallback] detaching the callback for %s activity", activity.getClass().getSimpleName());
            }
            bVar.mo35696i();
        }
    }

    /* renamed from: c */
    public void mo34906c(Activity activity, C14688re reVar) {
        ViewPager h = mo35693h(activity);
        if (h != null) {
            C14457b bVar = new C14457b(this.f35707e.mo34909b(reVar), h, activity);
            h.mo62329c(bVar);
            this.f35708f.put(activity, h);
            mo36660f(activity, bVar);
            this.f35710h.mo35674c("[attachCallback] attaching new callback for %s activity", activity.getClass().getSimpleName());
        }
    }

    /* renamed from: h */
    public final ViewPager mo35693h(Activity activity) {
        View a = C14668r7.m63249a(activity);
        if (a instanceof ViewGroup) {
            return this.f35709g.mo34901a((ViewGroup) a);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
    }

    public C14455k0(C14772u7 u7Var, C14550nb<C14765u4, C14688re> nbVar) {
        super(u7Var);
        this.f35708f = new WeakHashMap<>();
        this.f35709g = new C14263d1();
        this.f35710h = new C14453jf("ViewPagerActivityMonitoringStrategy");
        this.f35707e = nbVar;
    }
}
