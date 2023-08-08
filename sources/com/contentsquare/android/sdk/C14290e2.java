package com.contentsquare.android.sdk;

import android.app.Application;

/* renamed from: com.contentsquare.android.sdk.e2 */
public class C14290e2 {

    /* renamed from: f */
    public static final C14453jf f35283f = new C14453jf("GdprControllerImpl");

    /* renamed from: a */
    public final C14410i0 f35284a;

    /* renamed from: b */
    public final C14642q6 f35285b;

    /* renamed from: c */
    public final C14562o0 f35286c;

    /* renamed from: d */
    public final C14837wc f35287d;

    /* renamed from: e */
    public final C14213b7 f35288e;

    public C14290e2(Application application, C14410i0 i0Var, C14642q6 q6Var, C14562o0 o0Var, C14837wc wcVar) {
        this.f35284a = i0Var;
        this.f35285b = q6Var;
        this.f35286c = o0Var;
        this.f35287d = wcVar;
        this.f35288e = C14549na.m62703a(application).mo35986g();
    }

    /* renamed from: a */
    public final void mo35021a() {
        this.f35285b.mo36233c();
        this.f35288e.mo34677i();
        this.f35286c.mo36012h();
        f35283f.mo35679i("Wiped preferences.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo35022b() {
        this.f35284a.mo35513a();
        f35283f.mo35679i("Wiped storage.", new Object[0]);
    }

    /* renamed from: c */
    public void mo35023c() {
        f35283f.mo35676e("GdprController, clearAndFlushAll");
        mo35021a();
        this.f35287d.mo36759f(new C14239c2(this), new C14264d2(this));
    }

    /* renamed from: d */
    public String mo35024d() {
        return this.f35285b.mo36231a();
    }
}
