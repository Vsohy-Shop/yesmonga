package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;

/* renamed from: com.contentsquare.android.sdk.g0 */
public class C14352g0 implements C14325f5, C14937zf {

    /* renamed from: a */
    public final C14453jf f35497a = new C14453jf("SdkManager");

    /* renamed from: b */
    public final C14247c6 f35498b;

    /* renamed from: c */
    public final C14280de<C14210b5<C14466k4.C14471e>> f35499c;

    /* renamed from: d */
    public final C14705sb f35500d;

    /* renamed from: e */
    public final C14616pa f35501e;

    /* renamed from: f */
    public final C14771u6 f35502f;

    /* renamed from: g */
    public final C14627q0 f35503g;

    /* renamed from: v */
    public final C14213b7 f35504v;

    /* renamed from: w */
    public C14353a f35505w;

    /* renamed from: x */
    public boolean f35506x;

    /* renamed from: com.contentsquare.android.sdk.g0$a */
    public interface C14353a {
        /* renamed from: a */
        void mo35304a();

        /* renamed from: b */
        void mo35305b();
    }

    public C14352g0(C14771u6 u6Var, C14247c6 c6Var, C14280de<C14210b5<C14466k4.C14471e>> deVar, C14705sb sbVar, C14616pa paVar, C14627q0 q0Var, C14213b7 b7Var) {
        this.f35502f = u6Var;
        this.f35498b = c6Var;
        this.f35499c = deVar;
        this.f35500d = sbVar;
        this.f35501e = paVar;
        deVar.mo34979d(this);
        this.f35503g = q0Var;
        this.f35504v = b7Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m61778m() {
        if (this.f35502f.mo36561c() != null) {
            C14466k4.C14471e a = new C14922z7().mo36945a(this.f35502f.mo36561c(), this.f35504v.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false));
            this.f35499c.mo34827b(C14210b5.m60989d(a));
            this.f35501e.mo36159W(a.mo35727e());
        }
    }

    /* renamed from: a */
    public void mo34402a() {
        if (this.f35502f.mo36561c() != null) {
            mo35290c(this.f35502f.mo36561c().mo35711e());
        }
    }

    /* renamed from: c */
    public final void mo35290c(C14466k4.C14471e eVar) {
        boolean j = mo35297j(eVar);
        this.f35506x = j;
        mo35292e(j);
        this.f35504v.mo34683o(C14477k8.TRACKING_ENABLE, this.f35506x);
    }

    /* renamed from: d */
    public void mo35291d(String str, C14353a aVar) {
        this.f35505w = aVar;
        this.f35498b.mo34837a(this.f35502f, new C14316f0(this)).execute(new String[]{str});
    }

    /* renamed from: e */
    public final void mo35292e(boolean z) {
        C14353a aVar = this.f35505w;
        if (aVar != null) {
            if (z) {
                aVar.mo35305b();
            } else {
                aVar.mo35304a();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo35293f(C14466k4.C14471e eVar) {
        return this.f35503g.mo36185d(eVar.mo35729g());
    }

    /* renamed from: g */
    public final boolean mo35294g() {
        return !this.f35500d.mo35998e("optout_data_collection");
    }

    /* renamed from: h */
    public final boolean mo35295h(C14466k4.C14471e eVar) {
        return eVar.mo35733k();
    }

    /* renamed from: i */
    public void mo35296i() {
        mo34402a();
    }

    /* renamed from: j */
    public final boolean mo35297j(C14466k4.C14471e eVar) {
        if (mo35295h(eVar) && mo35294g()) {
            this.f35497a.mo35679i("User consent status: Waiting for opt-in", new Object[0]);
            return false;
        }
        if (!(!mo35299l())) {
            this.f35497a.mo35679i("User consent status: Opted-out", new Object[0]);
        } else if (eVar.mo35735m()) {
            if (mo35294g()) {
                this.f35497a.mo35679i("User consent status: Opted-in by default", new Object[0]);
            } else {
                this.f35497a.mo35679i("User consent status: Opted-in", new Object[0]);
            }
            if (this.f35504v.mo34676h(C14477k8.CLIENT_MODE_ACTIVATION_STATE, false)) {
                this.f35497a.mo35679i("User is drawn for tracking: true (forced because CS InApp enabled)", new Object[0]);
                return true;
            }
            boolean f = mo35293f(eVar);
            C14453jf.m62246k("User is drawn for tracking: %s", Boolean.valueOf(f));
            return f;
        }
        return false;
    }

    /* renamed from: k */
    public void mo35298k() {
        mo34402a();
    }

    /* renamed from: l */
    public final boolean mo35299l() {
        return this.f35500d.mo35999f("optout_data_collection", false);
    }

    /* renamed from: n */
    public void mo35300n() {
        mo35292e(false);
    }

    /* renamed from: o */
    public void mo35301o() {
        this.f35506x = false;
    }

    /* renamed from: p */
    public void mo35302p() {
        this.f35506x = true;
    }

    /* renamed from: q */
    public void mo35303q() {
        if (this.f35506x) {
            mo35292e(false);
            this.f35506x = false;
        }
    }

    /* renamed from: b */
    public boolean mo35289b() {
        return this.f35506x;
    }
}
