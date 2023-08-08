package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.g4 */
public final class C40557g4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f103375a;

    /* renamed from: b */
    public final /* synthetic */ String f103376b;

    /* renamed from: c */
    public final /* synthetic */ C40563h4 f103377c;

    public C40557g4(C40563h4 h4Var, LifecycleCallback lifecycleCallback, String str) {
        this.f103377c = h4Var;
        this.f103375a = lifecycleCallback;
        this.f103376b = str;
    }

    public final void run() {
        Bundle bundle;
        C40563h4 h4Var = this.f103377c;
        if (h4Var.f103396b > 0) {
            LifecycleCallback lifecycleCallback = this.f103375a;
            if (h4Var.f103397c != null) {
                bundle = h4Var.f103397c.getBundle(this.f103376b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo133804g(bundle);
        }
        if (this.f103377c.f103396b >= 2) {
            this.f103375a.mo133808k();
        }
        if (this.f103377c.f103396b >= 3) {
            this.f103375a.mo133806i();
        }
        if (this.f103377c.f103396b >= 4) {
            this.f103375a.mo87750l();
        }
        if (this.f103377c.f103396b >= 5) {
            this.f103375a.mo133805h();
        }
    }
}
