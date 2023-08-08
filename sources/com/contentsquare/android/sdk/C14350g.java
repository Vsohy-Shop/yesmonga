package com.contentsquare.android.sdk;

import android.app.Activity;
import android.content.Context;
import androidx.collection.C1887m;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.contentsquare.android.sdk.g */
public class C14350g extends C14809w0<C14351a> {

    /* renamed from: e */
    public final C14550nb<C14765u4, C14688re> f35492e;

    /* renamed from: f */
    public final C14453jf f35493f;

    /* renamed from: com.contentsquare.android.sdk.g$a */
    public static class C14351a extends FragmentManager.C19180m implements C14688re {

        /* renamed from: a */
        public final C1887m<Long> f35494a = new C1887m<>();

        /* renamed from: b */
        public final C14772u7 f35495b;

        /* renamed from: c */
        public final C14765u4 f35496c;

        public C14351a(C14772u7 u7Var, C14765u4 u4Var) {
            this.f35495b = u7Var;
            this.f35496c = u4Var;
        }

        /* renamed from: a */
        public void mo34761a(Activity activity, String str, long j) {
        }

        /* renamed from: b */
        public void mo34762b(Activity activity, Fragment fragment, long j) {
            this.f35496c.mo34762b(activity, fragment, j);
        }

        /* renamed from: c */
        public void mo34763c(Activity activity, String str, long j) {
        }

        /* renamed from: g */
        public void mo34767g(Activity activity, long j) {
            this.f35496c.mo34767g(activity, j);
        }

        /* renamed from: k */
        public void mo35285k(FragmentManager fragmentManager, Fragment fragment, Context context) {
            super.mo35285k(fragmentManager, fragment, context);
            this.f35494a.mo6369t(fragment.hashCode(), Long.valueOf(this.f35495b.mo36566b()));
        }

        /* renamed from: m */
        public void mo35286m(FragmentManager fragmentManager, Fragment fragment) {
            super.mo35286m(fragmentManager, fragment);
            long b = this.f35495b.mo36566b();
            int hashCode = fragment.hashCode();
            long longValue = b - this.f35494a.mo6364l(hashCode, Long.valueOf(b)).longValue();
            this.f35494a.mo6373x(hashCode);
            C19232h activity = fragment.getActivity();
            if (activity != null) {
                mo34762b(activity, fragment, (long) C14921z6.m64198d(longValue));
            }
        }

        /* renamed from: o */
        public void mo35287o(FragmentManager fragmentManager, Fragment fragment) {
            if (this.f35494a.mo6365m(fragment.hashCode()) < 0) {
                this.f35494a.mo6369t(fragment.hashCode(), Long.valueOf(this.f35495b.mo36566b()));
            }
            super.mo35287o(fragmentManager, fragment);
        }

        /* renamed from: s */
        public void mo35288s() {
            this.f35494a.mo6356c();
            this.f35496c.mo36551d();
        }
    }

    public C14350g(C14772u7 u7Var, C14759u1 u1Var) {
        this(u7Var, (C14550nb<C14765u4, C14688re>) new C14315f(u7Var, u1Var));
    }

    /* renamed from: h */
    public static /* synthetic */ C14765u4 m61766h(C14772u7 u7Var, C14759u1 u1Var, C14688re reVar) {
        return new C14765u4(reVar, u7Var, u1Var.mo36545a());
    }

    /* renamed from: b */
    public void mo34905b(Activity activity) {
        C14351a aVar = (C14351a) mo36659e(activity);
        if (aVar != null) {
            ((C19232h) activity).mo57175g0().mo56875f2(aVar);
            this.f35493f.mo35674c("[detachCallback] detaching callback for %s activity", activity.getClass().getSimpleName());
            aVar.mo35288s();
        }
    }

    /* renamed from: c */
    public void mo34906c(Activity activity, C14688re reVar) {
        C14351a aVar = new C14351a(mo36657a(), this.f35492e.mo34909b(reVar));
        mo36660f(activity, aVar);
        ((C19232h) activity).mo57175g0().mo56787B1(aVar, true);
        this.f35493f.mo35674c("[attachCallback] attaching new callback for %s activity", activity.getClass().getSimpleName());
    }

    public /* bridge */ /* synthetic */ void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
    }

    public C14350g(C14772u7 u7Var, C14550nb<C14765u4, C14688re> nbVar) {
        super(u7Var);
        this.f35493f = new C14453jf("FragmentActivityMonitoringStrategy");
        this.f35492e = nbVar;
    }
}
