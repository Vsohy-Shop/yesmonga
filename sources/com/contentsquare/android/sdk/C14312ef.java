package com.contentsquare.android.sdk;

import android.app.Application;
import android.view.WindowManager;
import androidx.lifecycle.C19441m0;
import com.contentsquare.android.internal.features.clientmode.manager.ClientModeManagerImpl;
import com.contentsquare.android.sdk.C14898ye;

/* renamed from: com.contentsquare.android.sdk.ef */
public class C14312ef {

    /* renamed from: g */
    public static C14453jf f35332g = new C14453jf("CsClientModeModule");

    /* renamed from: h */
    public static C14312ef f35333h;

    /* renamed from: a */
    public final C14533md<C14898ye.C14899a> f35334a;

    /* renamed from: b */
    public final C14817w6 f35335b;

    /* renamed from: c */
    public final C14563o1 f35336c;

    /* renamed from: d */
    public final C14281df f35337d;

    /* renamed from: e */
    public final C14898ye f35338e;

    /* renamed from: f */
    public final C14496l7 f35339f;

    public C14312ef(Application application) {
        C14549na a = C14549na.m62703a(application);
        C14533md<C14898ye.C14899a> a2 = C14380ge.m61919a(C14898ye.C14899a.C14906d.f36966a);
        this.f35334a = a2;
        C14817w6 w6Var = new C14817w6(application, (WindowManager) application.getSystemService("window"));
        this.f35335b = w6Var;
        C14563o1 o1Var = new C14563o1(application, w6Var, a.mo35986g(), new C14399h9());
        this.f35336c = o1Var;
        C14600oe b = C14600oe.m62881b(application);
        this.f35337d = new ClientModeManagerImpl(o1Var, application.getApplicationContext(), C19441m0.m90725l());
        C14898ye yeVar = new C14898ye(b.mo36109c(), new C14225bd(new C14296e6(new C14781ue(new C14510lf()), new C14419i7()), a2, new C14408hg(C14932zd.m64246c()), new C14252cb(application)), new C14856xa(b.mo36122q(), a2), a2, a.mo35986g(), a.mo35983c(), new C14922z7());
        this.f35338e = yeVar;
        this.f35339f = new C14496l7(yeVar, b.mo36115i(), o1Var);
    }

    /* renamed from: b */
    public static C14312ef m61521b(Application application) {
        if (f35333h == null) {
            f35333h = new C14312ef(application);
        } else {
            f35332g.mo35676e("CsClientModeModule was already initialized.");
        }
        return f35333h;
    }

    /* renamed from: a */
    public C14281df mo35091a() {
        return this.f35337d;
    }

    /* renamed from: c */
    public C14817w6 mo35092c() {
        return this.f35335b;
    }

    /* renamed from: d */
    public C14496l7 mo35093d() {
        return this.f35339f;
    }

    /* renamed from: e */
    public C14563o1 mo35094e() {
        return this.f35336c;
    }
}
