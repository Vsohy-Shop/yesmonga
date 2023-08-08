package com.contentsquare.android.sdk;

import android.content.Context;

/* renamed from: com.contentsquare.android.sdk.x5 */
public class C14849x5 {

    /* renamed from: a */
    public final C14643q7 f36830a;

    /* renamed from: b */
    public final C14213b7 f36831b;

    public C14849x5(C14643q7 q7Var, Context context) {
        this(q7Var, C14549na.m62703a(context).mo35986g());
    }

    /* renamed from: a */
    public int mo36806a() {
        return this.f36830a.mo35994a("screen_count", 0);
    }

    /* renamed from: b */
    public void mo36807b(int i) {
        this.f36830a.mo36000h("screen_count", i);
        this.f36831b.mo34679k(C14477k8.SCREEN_NUMBER, i);
    }

    /* renamed from: c */
    public int mo36808c() {
        mo36810e();
        return this.f36830a.mo35994a("sid", 1);
    }

    /* renamed from: d */
    public void mo36809d(int i) {
        this.f36830a.mo36000h("sid", i);
        this.f36831b.mo34679k(C14477k8.SESSION_ID, i);
    }

    /* renamed from: e */
    public final void mo36810e() {
        if (!this.f36830a.mo35998e("sid")) {
            this.f36830a.mo36000h("sid", 1);
        }
    }

    public C14849x5(C14643q7 q7Var, C14213b7 b7Var) {
        this.f36830a = q7Var;
        this.f36831b = b7Var;
    }
}
