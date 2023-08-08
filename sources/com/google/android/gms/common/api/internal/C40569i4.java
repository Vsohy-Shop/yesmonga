package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.i4 */
public final class C40569i4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f103424a;

    /* renamed from: b */
    public final /* synthetic */ String f103425b;

    /* renamed from: c */
    public final /* synthetic */ C40575j4 f103426c;

    public C40569i4(C40575j4 j4Var, LifecycleCallback lifecycleCallback, String str) {
        this.f103426c = j4Var;
        this.f103424a = lifecycleCallback;
        this.f103425b = str;
    }

    public final void run() {
        Bundle bundle;
        C40575j4 j4Var = this.f103426c;
        if (j4Var.f103469b > 0) {
            LifecycleCallback lifecycleCallback = this.f103424a;
            if (j4Var.f103470c != null) {
                bundle = j4Var.f103470c.getBundle(this.f103425b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo133804g(bundle);
        }
        if (this.f103426c.f103469b >= 2) {
            this.f103424a.mo133808k();
        }
        if (this.f103426c.f103469b >= 3) {
            this.f103424a.mo133806i();
        }
        if (this.f103426c.f103469b >= 4) {
            this.f103424a.mo87750l();
        }
        if (this.f103426c.f103469b >= 5) {
            this.f103424a.mo133805h();
        }
    }
}
