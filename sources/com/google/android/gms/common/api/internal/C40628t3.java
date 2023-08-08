package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.t3 */
public final class C40628t3 extends C40522b2 {

    /* renamed from: a */
    public final /* synthetic */ Dialog f103570a;

    /* renamed from: b */
    public final /* synthetic */ C40634u3 f103571b;

    public C40628t3(C40634u3 u3Var, Dialog dialog) {
        this.f103571b = u3Var;
        this.f103570a = dialog;
    }

    /* renamed from: a */
    public final void mo133839a() {
        this.f103571b.f103587b.mo134077p();
        if (this.f103570a.isShowing()) {
            this.f103570a.dismiss();
        }
    }
}
