package com.contentsquare.android.sdk;

import android.content.Context;

/* renamed from: com.contentsquare.android.sdk.x8 */
public class C14854x8 {

    /* renamed from: a */
    public final C14643q7 f36836a;

    /* renamed from: b */
    public final C14213b7 f36837b;

    public C14854x8(Context context, C14643q7 q7Var) {
        this(q7Var, C14549na.m62703a(context).mo35986g());
    }

    /* renamed from: a */
    public final void mo36814a(C14849x5 x5Var) {
        this.f36837b.mo34679k(C14477k8.SCREEN_NUMBER, x5Var.mo36806a());
    }

    /* renamed from: b */
    public void mo36815b(C14849x5 x5Var, C14795v7 v7Var) {
        mo36817d(x5Var);
        mo36814a(x5Var);
        mo36816c(v7Var);
    }

    /* renamed from: c */
    public final void mo36816c(C14795v7 v7Var) {
        v7Var.mo36632c();
        this.f36837b.mo34681m(C14477k8.USER_ID, this.f36836a.mo35997d("uid_config", (String) null));
    }

    /* renamed from: d */
    public final void mo36817d(C14849x5 x5Var) {
        this.f36837b.mo34679k(C14477k8.SESSION_ID, x5Var.mo36808c());
    }

    public C14854x8(C14643q7 q7Var, C14213b7 b7Var) {
        this.f36836a = q7Var;
        this.f36837b = b7Var;
    }
}
