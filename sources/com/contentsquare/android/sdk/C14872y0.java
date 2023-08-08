package com.contentsquare.android.sdk;

import android.app.Application;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14466k4;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.y0 */
public class C14872y0 implements C14325f5 {

    /* renamed from: a */
    public final C14453jf f36897a;

    /* renamed from: b */
    public final C14849x5 f36898b;

    /* renamed from: c */
    public final C14841we<C14210b5<C14466k4.C14471e>> f36899c;

    /* renamed from: d */
    public final C14841we<C14210b5<C14439j3>> f36900d;

    /* renamed from: e */
    public final C14562o0 f36901e;

    /* renamed from: f */
    public final C14795v7 f36902f;

    /* renamed from: g */
    public final C14280de<C14210b5<JSONObject>> f36903g;

    /* renamed from: v */
    public final C14937zf f36904v;

    /* renamed from: w */
    public final C14841we<List<C14918z4>> f36905w;

    /* renamed from: x */
    public final C14213b7 f36906x;

    /* renamed from: y */
    public int f36907y;

    /* renamed from: z */
    public int f36908z;

    /* renamed from: com.contentsquare.android.sdk.y0$a */
    public class C14873a implements C14603p0<C14439j3.C14440a, C14210b5<C14439j3>> {
        public C14873a() {
        }

        /* renamed from: a */
        public C14210b5<C14439j3> mo34472d(C14439j3.C14440a aVar) {
            aVar.mo35609o(C14872y0.this.f36907y);
            aVar.mo35607m(C14872y0.this.f36908z);
            return C14210b5.m60989d(aVar.mo34709e());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.y0$b */
    public class C14874b implements C14603p0<C14439j3.C14440a, C14439j3.C14440a> {
        public C14874b() {
        }

        /* renamed from: a */
        public C14439j3.C14440a mo34472d(C14439j3.C14440a aVar) {
            if (C14872y0.m64087j(aVar)) {
                C14872y0.this.mo36888i();
            }
            return aVar;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.y0$c */
    public class C14875c implements C14603p0<C14439j3.C14440a, C14439j3.C14440a> {

        /* renamed from: a */
        public boolean f36911a;

        public C14875c() {
        }

        /* renamed from: a */
        public C14439j3.C14440a mo34472d(C14439j3.C14440a aVar) {
            if (mo36899b(aVar).booleanValue() && C14872y0.this.mo36890l(aVar).booleanValue()) {
                C14872y0.this.mo36895q();
            }
            return aVar;
        }

        /* renamed from: b */
        public final Boolean mo36899b(C14439j3.C14440a aVar) {
            boolean z = this.f36911a || C14872y0.m64084c(aVar);
            this.f36911a = true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.y0$d */
    public class C14876d implements C14441j4<C14439j3.C14440a> {
        public C14876d() {
        }

        /* renamed from: a */
        public boolean mo34476d(C14439j3.C14440a aVar) {
            return C14872y0.this.f36904v.mo35289b();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.y0$e */
    public class C14877e implements C14441j4<C14439j3.C14440a> {

        /* renamed from: a */
        public boolean f36914a = true;

        public C14877e() {
        }

        /* renamed from: a */
        public boolean mo34476d(C14439j3.C14440a aVar) {
            if (aVar.mo35606l() != 0) {
                return true;
            }
            boolean z = this.f36914a;
            this.f36914a = false;
            return z;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.y0$f */
    public class C14878f implements C14325f5 {

        /* renamed from: a */
        public final /* synthetic */ C14841we f36916a;

        public C14878f(C14841we weVar) {
            this.f36916a = weVar;
        }

        /* renamed from: a */
        public void mo34402a() {
            if (C14872y0.this.mo36886f(this.f36916a)) {
                C14872y0 y0Var = C14872y0.this;
                y0Var.f36907y = y0Var.f36898b.mo36808c();
                C14872y0 y0Var2 = C14872y0.this;
                y0Var2.f36908z = y0Var2.f36898b.mo36806a();
                C14872y0 y0Var3 = C14872y0.this;
                y0Var3.f36897a.mo35679i("Starting session number: %d", Integer.valueOf(y0Var3.f36907y));
            }
        }
    }

    public C14872y0(Application application, C14849x5 x5Var, C14795v7 v7Var, C14265d3<C14439j3.C14440a> d3Var, C14841we<C14210b5<C14466k4.C14471e>> weVar, C14562o0 o0Var, C14280de<C14210b5<JSONObject>> deVar, C14937zf zfVar, C14334f8 f8Var, C14854x8 x8Var) {
        C14453jf jfVar = new C14453jf("Session");
        this.f36897a = jfVar;
        this.f36906x = C14549na.m62703a(application).mo35986g();
        this.f36898b = x5Var;
        this.f36902f = v7Var;
        this.f36899c = weVar;
        this.f36901e = o0Var;
        this.f36903g = deVar;
        this.f36907y = x5Var.mo36808c();
        this.f36908z = x5Var.mo36806a();
        this.f36904v = zfVar;
        C14841we<TVal> a = ((C14262d0) ((C14262d0) C14380ge.m61920b(C14210b5.m60986a()).mo35882f(d3Var).mo35929c().mo34899c(d3Var).mo35888b().mo35931g(mo36887g()).mo35888b()).mo35931g(mo36885d()).mo35888b()).mo34900e(mo36892n()).mo34900e(mo36891m()).mo35930d(mo36889k()).mo34981a();
        this.f36900d = a;
        a.mo34979d(this);
        C14841we<List<C14918z4>> j = f8Var.mo34469j(new String[]{"sid"});
        this.f36905w = j;
        mo36884b(j);
        jfVar.mo35679i("Starting with user id: %s session number: %d", v7Var.mo36632c(), Integer.valueOf(this.f36907y));
        x8Var.mo36815b(x5Var, v7Var);
    }

    /* renamed from: c */
    public static boolean m64084c(C14439j3.C14440a aVar) {
        return aVar.mo35606l() != 2;
    }

    /* renamed from: e */
    public static boolean m64085e(C14439j3.C14440a aVar) {
        return aVar.mo35606l() != 1;
    }

    /* renamed from: h */
    public static boolean m64086h(C14439j3.C14440a aVar) {
        return aVar.mo35606l() != 0;
    }

    /* renamed from: j */
    public static boolean m64087j(C14439j3.C14440a aVar) {
        return aVar.mo35606l() == 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = (com.contentsquare.android.sdk.C14439j3) r4.f36900d.mo34977c().mo34655g();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34402a() {
        /*
            r4 = this;
            com.contentsquare.android.sdk.we<com.contentsquare.android.sdk.b5<com.contentsquare.android.sdk.j3>> r0 = r4.f36900d
            java.lang.Object r0 = r0.mo34977c()
            com.contentsquare.android.sdk.b5 r0 = (com.contentsquare.android.sdk.C14210b5) r0
            boolean r0 = r0.mo34659j()
            if (r0 == 0) goto L_0x003b
            com.contentsquare.android.sdk.we<com.contentsquare.android.sdk.b5<com.contentsquare.android.sdk.j3>> r0 = r4.f36900d
            java.lang.Object r0 = r0.mo34977c()
            com.contentsquare.android.sdk.b5 r0 = (com.contentsquare.android.sdk.C14210b5) r0
            java.lang.Object r0 = r0.mo34655g()
            com.contentsquare.android.sdk.j3 r0 = (com.contentsquare.android.sdk.C14439j3) r0
            org.json.JSONObject r1 = com.contentsquare.android.sdk.C14886y6.m64152p(r0)
            if (r1 == 0) goto L_0x003b
            r0.mo34706l()
            com.contentsquare.android.sdk.jf r0 = r4.f36897a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r3 = "Pushing event: [ %s ] through the stream"
            r0.mo35674c(r3, r2)
            com.contentsquare.android.sdk.de<com.contentsquare.android.sdk.b5<org.json.JSONObject>> r0 = r4.f36903g
            com.contentsquare.android.sdk.b5 r1 = com.contentsquare.android.sdk.C14210b5.m60989d(r1)
            r0.mo34827b(r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14872y0.mo34402a():void");
    }

    /* renamed from: b */
    public final void mo36884b(C14841we<List<C14918z4>> weVar) {
        weVar.mo34979d(new C14878f(weVar));
    }

    /* renamed from: d */
    public final C14441j4<C14439j3.C14440a> mo36885d() {
        return new C14877e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = ((com.contentsquare.android.sdk.C14918z4) r3.get(0)).mo36944b();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36886f(com.contentsquare.android.sdk.C14841we<java.util.List<com.contentsquare.android.sdk.C14918z4>> r3) {
        /*
            r2 = this;
            java.lang.Object r3 = r3.mo34977c()
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r3 = r3.get(r1)
            com.contentsquare.android.sdk.z4 r3 = (com.contentsquare.android.sdk.C14918z4) r3
            com.contentsquare.android.sdk.z4$a r3 = r3.mo36944b()
            if (r3 == 0) goto L_0x0025
            int r3 = r3.f36988b
            r0 = 1
            if (r3 != r0) goto L_0x0025
            r1 = r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14872y0.mo36886f(com.contentsquare.android.sdk.we):boolean");
    }

    /* renamed from: g */
    public final C14441j4<C14439j3.C14440a> mo36887g() {
        return new C14876d();
    }

    /* renamed from: i */
    public final void mo36888i() {
        this.f36897a.mo35676e("incrementScreenCount");
        C14849x5 x5Var = this.f36898b;
        int i = this.f36908z + 1;
        this.f36908z = i;
        x5Var.mo36807b(i);
    }

    /* renamed from: k */
    public final C14603p0<C14439j3.C14440a, C14210b5<C14439j3>> mo36889k() {
        return new C14873a();
    }

    /* renamed from: l */
    public final Boolean mo36890l(C14439j3.C14440a aVar) {
        long e = this.f36901e.mo36009e();
        this.f36901e.mo36005a(aVar.mo35613s());
        C14210b5 c = this.f36899c.mo34977c();
        long j = 0;
        if (e == 0 || c.mo34658i() || (m64085e(aVar) && m64086h(aVar))) {
            return Boolean.FALSE;
        }
        long s = aVar.mo35613s() - e;
        boolean z = false;
        if (!this.f36906x.mo34676h(C14477k8.DEVELOPER_SESSION_TIMEOUT_TO_0, false)) {
            j = ((C14466k4.C14471e) c.mo34655g()).mo35731i();
        }
        if (s >= j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: m */
    public final C14603p0<C14439j3.C14440a, C14439j3.C14440a> mo36891m() {
        return new C14874b();
    }

    /* renamed from: n */
    public final C14603p0<C14439j3.C14440a, C14439j3.C14440a> mo36892n() {
        return new C14875c();
    }

    /* renamed from: o */
    public int mo36893o() {
        return this.f36908z;
    }

    /* renamed from: p */
    public int mo36894p() {
        return this.f36907y;
    }

    /* renamed from: q */
    public final void mo36895q() {
        C14849x5 x5Var = this.f36898b;
        int i = this.f36907y + 1;
        this.f36907y = i;
        x5Var.mo36809d(i);
        this.f36908z = 0;
        this.f36898b.mo36807b(0);
        this.f36906x.mo34683o(C14477k8.FORGET_ME, false);
        this.f36897a.mo35679i("Starting session number: %d", Integer.valueOf(this.f36907y));
    }
}
