package com.contentsquare.android.sdk;

import android.app.Activity;

/* renamed from: com.contentsquare.android.sdk.ie */
public class C14431ie implements C14432if {

    /* renamed from: a */
    public final C14167a1 f35655a;

    /* renamed from: b */
    public final C14687rd f35656b;

    public C14431ie(C14772u7 u7Var) {
        C14687rd rdVar = new C14687rd(u7Var, new C14759u1(200));
        this.f35656b = rdVar;
        this.f35655a = new C14167a1(rdVar);
    }

    /* renamed from: b */
    public void mo35555b(Activity activity) {
        C14278dc f = this.f35655a.mo34487f(activity);
        if (f != null) {
            f.mo34905b(activity);
        }
    }

    /* renamed from: c */
    public void mo35556c(Activity activity, C14688re reVar) {
        this.f35655a.mo34486e(activity).mo34906c(activity, reVar);
    }

    public void onActivityStarted(Activity activity) {
        this.f35655a.mo34486e(activity).onActivityStarted(activity);
    }
}
