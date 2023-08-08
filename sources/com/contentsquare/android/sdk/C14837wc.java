package com.contentsquare.android.sdk;

import android.app.Application;
import com.contentsquare.android.api.model.C14096a;
import com.contentsquare.android.api.model.C14098b;
import com.contentsquare.android.api.model.C14103e;
import com.contentsquare.android.error.C14117a;
import com.contentsquare.android.sdk.C14223bc;
import com.contentsquare.android.sdk.C14228bf;
import com.contentsquare.android.sdk.C14335f9;
import com.contentsquare.android.sdk.C14342fb;
import com.contentsquare.android.sdk.C14352g0;
import com.contentsquare.android.sdk.C14375gb;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14466k4;
import com.contentsquare.android.sdk.C14883y4;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.wc */
public class C14837wc implements C14352g0.C14353a {

    /* renamed from: a */
    public final Application f36803a;

    /* renamed from: b */
    public final C14453jf f36804b = new C14453jf("LegacyComponentsHolder");

    /* renamed from: c */
    public final C14562o0 f36805c;

    /* renamed from: d */
    public final C14280de<C14210b5<C14466k4.C14471e>> f36806d;

    /* renamed from: e */
    public final C14280de<C14210b5<JSONObject>> f36807e;

    /* renamed from: f */
    public final C14265d3<C14439j3.C14440a> f36808f;

    /* renamed from: g */
    public final C14784v f36809g;

    /* renamed from: h */
    public boolean f36810h = false;

    /* renamed from: i */
    public C14861xd f36811i = null;

    /* renamed from: j */
    public C14466k4.C14471e f36812j = null;

    /* renamed from: k */
    public final C14325f5 f36813k;

    /* renamed from: l */
    public final C14616pa f36814l;

    /* renamed from: m */
    public C14842wf f36815m;

    /* renamed from: n */
    public final C14600oe f36816n;

    /* renamed from: com.contentsquare.android.sdk.wc$a */
    public class C14838a implements C14325f5 {
        public C14838a() {
        }

        /* renamed from: a */
        public void mo34402a() {
            C14210b5 c = C14837wc.this.f36806d.mo34977c();
            if (c.mo34659j()) {
                C14837wc.this.f36812j = (C14466k4.C14471e) c.mo34655g();
            }
        }
    }

    public C14837wc(Application application, C14562o0 o0Var, C14616pa paVar, C14280de<C14210b5<JSONObject>> deVar, C14265d3<C14439j3.C14440a> d3Var, C14280de<C14210b5<C14466k4.C14471e>> deVar2, C14784v vVar) {
        C14838a aVar = new C14838a();
        this.f36813k = aVar;
        this.f36815m = null;
        this.f36803a = application;
        this.f36805c = o0Var;
        this.f36814l = paVar;
        this.f36806d = deVar2;
        this.f36807e = deVar;
        this.f36808f = d3Var;
        deVar2.mo34979d(aVar);
        this.f36809g = vVar;
        this.f36816n = C14600oe.m62881b(application);
    }

    /* renamed from: a */
    public void mo35304a() {
        if (this.f36810h) {
            mo36768o();
        } else {
            this.f36804b.mo35676e("SDK was already stopped, moving along...");
        }
        this.f36810h = false;
    }

    /* renamed from: b */
    public void mo36755b(C14096a aVar) {
        C14375gb.C14376a aVar2 = (C14375gb.C14376a) this.f36816n.mo36110d().mo36863b(19);
        aVar2.mo35373w(aVar.mo34344c()).mo35372v(Long.valueOf(aVar.mo34342d()));
        this.f36808f.mo34827b(aVar2);
    }

    /* renamed from: c */
    public void mo36756c(C14098b bVar) {
        C14223bc.C14224a aVar = (C14223bc.C14224a) this.f36816n.mo36110d().mo36863b(18);
        aVar.mo34710v(bVar.mo34344c()).mo34711w(bVar.mo34343d());
        this.f36808f.mo34827b(aVar);
    }

    /* renamed from: d */
    public void mo36757d(C14103e eVar) {
        C14228bf.C14229a aVar = (C14228bf.C14229a) this.f36816n.mo36110d().mo36863b(16);
        try {
            aVar.mo34720v(eVar);
            this.f36808f.mo34827b(aVar);
        } catch (IllegalArgumentException e) {
            this.f36804b.mo35677f("Transaction not registered: %s", e);
        }
    }

    /* renamed from: e */
    public void mo36758e(C14117a aVar) {
        C14883y4.C14884a aVar2 = (C14883y4.C14884a) this.f36816n.mo36110d().mo36863b(21);
        aVar2.mo36925w(aVar.mo34369i());
        aVar2.mo36927y(aVar.mo34374n());
        aVar2.mo36928z(aVar.mo34372l());
        aVar2.mo36924v(aVar.mo34370j());
        aVar2.mo36926x(aVar.mo34371k());
        this.f36808f.mo34827b(aVar2);
    }

    /* renamed from: f */
    public void mo36759f(C14335f9.C14340c cVar, C14335f9.C14339b bVar) {
        this.f36809g.mo36591e(cVar, bVar);
    }

    /* renamed from: g */
    public void mo36760g(String str, int i, boolean z) {
        C14342fb.C14343a aVar = (C14342fb.C14343a) this.f36816n.mo36110d().mo36863b(17);
        aVar.mo35187w(str).mo35188x(i).mo35186v(z);
        this.f36808f.mo34827b(aVar);
    }

    /* renamed from: h */
    public void mo36761h() {
        if (this.f36811i == null) {
            this.f36811i = C14538n0.m62671a(this.f36803a).mo35954b();
        }
        if (this.f36815m == null) {
            this.f36815m = new C14842wf(this.f36816n.mo36120o());
        }
        this.f36804b.mo35676e("the session was validated, attaching listeners");
        this.f36811i.mo36831e(this.f36803a);
        this.f36803a.registerComponentCallbacks(this.f36815m);
    }

    /* renamed from: i */
    public final void mo36762i() {
        if (this.f36805c.mo36008d()) {
            mo36766m();
        }
    }

    /* renamed from: j */
    public void mo36763j() {
        this.f36809g.mo36594i();
    }

    /* renamed from: k */
    public C14861xd mo36764k() {
        return this.f36811i;
    }

    /* renamed from: l */
    public final C14439j3.C14440a mo36765l() {
        return this.f36816n.mo36110d().mo36863b(0);
    }

    /* renamed from: m */
    public void mo36766m() {
        String i = this.f36805c.mo36013i();
        if (i != null) {
            try {
                this.f36804b.mo35676e("sending hide event");
                this.f36807e.mo34827b(C14210b5.m60989d(new JSONObject(i)));
                this.f36804b.mo35676e("hide event pending flag removed");
            } catch (JSONException e) {
                this.f36804b.mo35681l("The serialized hide event: [%s] failed to be parsed into JSON with parsing error message: [%s]", i, e.getMessage());
            }
        }
        this.f36805c.mo36010f();
        this.f36805c.mo36011g();
    }

    /* renamed from: n */
    public Boolean mo36767n() {
        C14466k4.C14471e eVar = this.f36812j;
        return Boolean.valueOf(eVar != null && eVar.mo35734l());
    }

    /* renamed from: o */
    public void mo36768o() {
        C14861xd xdVar = this.f36811i;
        if (xdVar != null) {
            xdVar.mo36835i(this.f36803a);
        }
        this.f36803a.unregisterComponentCallbacks(this.f36815m);
        this.f36811i = null;
        this.f36815m = null;
    }

    /* renamed from: p */
    public final void mo36769p() {
        this.f36808f.mo34827b(mo36765l());
    }

    /* renamed from: b */
    public void mo35305b() {
        this.f36804b.mo35676e("SDK started tracking...");
        if (!this.f36810h) {
            mo36762i();
            mo36769p();
            mo36761h();
        } else {
            this.f36804b.mo35676e("SDK was already tracking, moving along...");
        }
        this.f36810h = true;
    }
}
