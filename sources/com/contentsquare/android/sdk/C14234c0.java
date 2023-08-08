package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* renamed from: com.contentsquare.android.sdk.c0 */
public abstract class C14234c0 implements C14688re {

    /* renamed from: a */
    public final C14454k f35164a;

    /* renamed from: b */
    public final C14837wc f35165b;

    /* renamed from: c */
    public final C14453jf f35166c;

    /* renamed from: d */
    public final C14803vc f35167d;

    /* renamed from: e */
    public boolean f35168e = false;

    public C14234c0(C14454k kVar, C14837wc wcVar, C14453jf jfVar, C14803vc vcVar) {
        this.f35164a = kVar;
        this.f35165b = wcVar;
        this.f35166c = jfVar;
        this.f35167d = vcVar;
    }

    /* renamed from: a */
    public void mo34761a(Activity activity, String str, long j) {
        Activity activity2 = activity;
        mo34768h(activity2, new C14405he(this.f35168e, this.f35167d.mo34688c(), new C14770u5(activity, str, this.f35164a)), new C14409i(activity), j, str);
    }

    /* renamed from: b */
    public void mo34762b(Activity activity, Fragment fragment, long j) {
        Activity activity2 = activity;
        mo34768h(activity2, new C14405he(this.f35168e, this.f35167d.mo34688c(), new C14495l6(activity, fragment, this.f35164a)), new C14409i(activity, fragment), j, "");
    }

    /* renamed from: c */
    public void mo34763c(Activity activity, String str, long j) {
        Activity activity2 = activity;
        mo34768h(activity2, new C14405he(this.f35168e, this.f35167d.mo34688c(), new C14770u5(activity, str, this.f35164a)), new C14409i(activity, str), j, str);
    }

    /* renamed from: d */
    public void mo34764d() {
        this.f35168e = true;
    }

    /* renamed from: e */
    public final void mo34765e(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f35166c.mo35681l("[OnScreenChanged]: Was called for activity: [%s]  but the activity did not have a Window", simpleName);
    }

    /* renamed from: f */
    public abstract void mo34766f(Activity activity, int i, String str);

    /* renamed from: g */
    public void mo34767g(Activity activity, long j) {
        Activity activity2 = activity;
        mo34768h(activity2, new C14405he(this.f35168e, this.f35167d.mo34688c(), new C14269d7(activity, this.f35164a)), new C14409i(activity), j, "");
    }

    /* renamed from: h */
    public final void mo34768h(Activity activity, C14550nb<String, ViewGroup> nbVar, C14801va<String> vaVar, long j, String str) {
        Window window = activity.getWindow();
        if (window != null) {
            String b = nbVar.mo34909b((FrameLayout) window.findViewById(16908290));
            if (b != null) {
                this.f35167d.mo34690d(b);
                this.f35167d.mo34689c(str);
                mo34766f(activity, C14921z6.m64198d(j), str);
                this.f35166c.mo35676e(vaVar.mo35511a());
            }
        } else {
            mo34765e(activity);
        }
        this.f35168e = false;
    }

    /* renamed from: i */
    public void mo34769i(Activity activity, String str, long j) {
        Activity activity2 = activity;
        mo34768h(activity2, new C14492l3(this.f35168e, this.f35167d.mo34688c(), new C14770u5(activity, str, this.f35164a)), new C14409i(activity, str), j, str);
    }
}
