package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14466k4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.oe */
public class C14600oe {

    /* renamed from: E */
    public static C14453jf f36118E = new C14453jf("CsApplicationModule");

    /* renamed from: F */
    public static C14600oe f36119F;

    /* renamed from: A */
    public final C14872y0 f36120A;

    /* renamed from: B */
    public final C14215b8 f36121B;

    /* renamed from: C */
    public final C14870xf f36122C;

    /* renamed from: D */
    public final C14784v f36123D;

    /* renamed from: a */
    public final Application f36124a;

    /* renamed from: b */
    public final C14643q7 f36125b;

    /* renamed from: c */
    public final C14627q0 f36126c;

    /* renamed from: d */
    public final C14849x5 f36127d;

    /* renamed from: e */
    public final C14772u7 f36128e = new C14772u7();

    /* renamed from: f */
    public final C14413i3 f36129f = new C14413i3();

    /* renamed from: g */
    public final C14476k7 f36130g;

    /* renamed from: h */
    public final C14705sb f36131h;

    /* renamed from: i */
    public final C14410i0 f36132i;

    /* renamed from: j */
    public final C14404hd f36133j;

    /* renamed from: k */
    public final C14400ha f36134k;

    /* renamed from: l */
    public final C14854x8 f36135l;

    /* renamed from: m */
    public final C14247c6 f36136m;

    /* renamed from: n */
    public final C14562o0 f36137n;

    /* renamed from: o */
    public final C14616pa f36138o;

    /* renamed from: p */
    public final C14427ib f36139p;

    /* renamed from: q */
    public final C14334f8 f36140q;

    /* renamed from: r */
    public final C14334f8 f36141r;

    /* renamed from: s */
    public final ExecutorService f36142s;

    /* renamed from: t */
    public final C14533md<C14210b5<MotionEvent>> f36143t;

    /* renamed from: u */
    public final C14280de<C14210b5<JSONObject>> f36144u;

    /* renamed from: v */
    public final C14280de<C14210b5<C14466k4.C14471e>> f36145v;

    /* renamed from: w */
    public final C14352g0 f36146w;

    /* renamed from: x */
    public final C14642q6 f36147x;

    /* renamed from: y */
    public final C14795v7 f36148y;

    /* renamed from: z */
    public final C14265d3<C14439j3.C14440a> f36149z;

    public C14600oe(Application application) {
        Application application2 = application;
        this.f36124a = application2;
        C14643q7 q7Var = new C14643q7(application2);
        this.f36125b = q7Var;
        C14627q0 q0Var = new C14627q0(q7Var, new C14453jf("InSampleIntervalValidator"));
        this.f36126c = q0Var;
        C14849x5 x5Var = new C14849x5(q7Var, (Context) application2);
        this.f36127d = x5Var;
        C14476k7 k7Var = new C14476k7(application2, new DisplayMetrics());
        this.f36130g = k7Var;
        C14705sb sbVar = new C14705sb(application2);
        this.f36131h = sbVar;
        C14410i0 i0Var = new C14410i0(application2);
        this.f36132i = i0Var;
        C14404hd hdVar = new C14404hd(application2);
        this.f36133j = hdVar;
        this.f36134k = new C14400ha();
        C14854x8 x8Var = new C14854x8((Context) application2, q7Var);
        this.f36135l = x8Var;
        C14247c6 c6Var = new C14247c6(hdVar);
        this.f36136m = c6Var;
        C14562o0 o0Var = new C14562o0(sbVar);
        this.f36137n = o0Var;
        C14697s5 s5Var = new C14697s5(application.getBaseContext());
        this.f36138o = s5Var;
        this.f36139p = new C14664r4(s5Var);
        C14334f8 f8Var = new C14334f8(application2, "cs");
        this.f36140q = f8Var;
        this.f36141r = new C14334f8(application2, "cs_app");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f36142s = newSingleThreadExecutor;
        C14280de deVar = new C14280de(C14210b5.m60986a());
        this.f36143t = deVar;
        C14280de deVar2 = deVar;
        C14280de<C14210b5<JSONObject>> deVar3 = new C14280de<>(C14210b5.m60986a());
        this.f36144u = deVar3;
        C14280de<C14210b5<C14466k4.C14471e>> deVar4 = new C14280de<>(C14210b5.m60986a());
        this.f36145v = deVar4;
        C14549na a = C14549na.m62703a(application.getApplicationContext());
        C14280de<C14210b5<JSONObject>> deVar5 = deVar3;
        C14352g0 g0Var = r2;
        C14280de<C14210b5<C14466k4.C14471e>> deVar6 = deVar4;
        C14280de deVar7 = deVar2;
        ExecutorService executorService = newSingleThreadExecutor;
        C14476k7 k7Var2 = k7Var;
        C14334f8 f8Var2 = f8Var;
        C14352g0 g0Var2 = new C14352g0(a.mo35983c(), c6Var, deVar6, sbVar, s5Var, q0Var, a.mo35986g());
        C14352g0 g0Var3 = g0Var;
        this.f36146w = g0Var3;
        C14642q6 q6Var = new C14642q6(q7Var, a.mo35986g());
        this.f36147x = q6Var;
        C14795v7 v7Var = new C14795v7(q6Var, executorService, i0Var, f8Var2);
        this.f36148y = v7Var;
        C14265d3<C14439j3.C14440a> a2 = C14734t3.m63488a();
        this.f36149z = a2;
        C14562o0 o0Var2 = o0Var;
        ExecutorService executorService2 = executorService;
        C14872y0 y0Var = r1;
        C14334f8 f8Var3 = f8Var2;
        C14872y0 y0Var2 = new C14872y0(application, x5Var, v7Var, a2, deVar6, o0Var2, deVar5, g0Var3, f8Var3, x8Var);
        this.f36120A = y0Var;
        C14870xf xfVar = new C14870xf(application.getApplicationContext(), y0Var, v7Var, k7Var2);
        this.f36122C = xfVar;
        C14779ud udVar = new C14779ud();
        Application application3 = application;
        C14280de deVar8 = deVar7;
        C14215b8 b8Var = new C14215b8(C14932zd.m64244a(), deVar8, new C14326f6(application3, udVar, new C14322f4(application, udVar, new C14772u7()), xfVar, a2), C14549na.m62703a(application).mo35982b());
        this.f36121B = b8Var;
        xfVar.mo36864c(b8Var);
        C14347ff ffVar = new C14347ff(application.getApplicationContext(), y0Var);
        this.f36123D = new C14784v(ffVar, xfVar, executorService2, deVar5, deVar6, a.mo35986g());
    }

    /* renamed from: b */
    public static C14600oe m62881b(Application application) {
        if (f36119F == null) {
            f36119F = new C14600oe(application);
        } else {
            f36118E.mo35676e("CsApplicationModule was already initialized.");
        }
        return f36119F;
    }

    /* renamed from: k */
    public static C14600oe m62882k() {
        return f36119F;
    }

    /* renamed from: a */
    public Application mo36108a() {
        return this.f36124a;
    }

    /* renamed from: c */
    public C14476k7 mo36109c() {
        return this.f36130g;
    }

    /* renamed from: d */
    public C14870xf mo36110d() {
        return this.f36122C;
    }

    /* renamed from: e */
    public C14265d3<C14439j3.C14440a> mo36111e() {
        return this.f36149z;
    }

    /* renamed from: f */
    public C14784v mo36112f() {
        return this.f36123D;
    }

    /* renamed from: g */
    public C14562o0 mo36113g() {
        return this.f36137n;
    }

    /* renamed from: h */
    public C14616pa mo36114h() {
        return this.f36138o;
    }

    /* renamed from: i */
    public C14803vc mo36115i() {
        return this.f36121B;
    }

    /* renamed from: j */
    public C14427ib mo36116j() {
        return this.f36139p;
    }

    /* renamed from: l */
    public C14280de<C14210b5<JSONObject>> mo36117l() {
        return this.f36144u;
    }

    /* renamed from: m */
    public C14533md<C14210b5<MotionEvent>> mo36118m() {
        return this.f36143t;
    }

    /* renamed from: n */
    public C14280de<C14210b5<C14466k4.C14471e>> mo36119n() {
        return this.f36145v;
    }

    /* renamed from: o */
    public C14352g0 mo36120o() {
        return this.f36146w;
    }

    /* renamed from: p */
    public C14410i0 mo36121p() {
        return this.f36132i;
    }

    /* renamed from: q */
    public C14400ha mo36122q() {
        return this.f36134k;
    }

    /* renamed from: r */
    public C14642q6 mo36123r() {
        return this.f36147x;
    }

    /* renamed from: s */
    public C14795v7 mo36124s() {
        return this.f36148y;
    }

    /* renamed from: t */
    public C14413i3 mo36125t() {
        return this.f36129f;
    }
}
