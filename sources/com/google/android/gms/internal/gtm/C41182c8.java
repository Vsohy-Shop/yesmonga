package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.google.android.gms.internal.gtm.c8 */
public final class C41182c8 implements ComponentCallbacks2 {

    /* renamed from: a */
    public final /* synthetic */ C41375k8 f104494a;

    public C41182c8(C41375k8 k8Var) {
        this.f104494a = k8Var;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f104494a.f104753e.execute(new C41158b8(this));
        }
    }
}
