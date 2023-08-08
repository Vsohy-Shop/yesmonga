package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14335f9;
import com.contentsquare.android.sdk.C14466k4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.v */
public class C14784v implements C14325f5 {

    /* renamed from: a */
    public final C14453jf f36653a = new C14453jf("EventsProcessor");

    /* renamed from: b */
    public final C14347ff f36654b;

    /* renamed from: c */
    public final C14870xf f36655c;

    /* renamed from: d */
    public final ExecutorService f36656d;

    /* renamed from: e */
    public final C14280de<C14210b5<JSONObject>> f36657e;

    /* renamed from: f */
    public final C14280de<C14210b5<C14466k4.C14471e>> f36658f;

    /* renamed from: g */
    public final C14213b7 f36659g;

    /* renamed from: v */
    public int f36660v = 100;

    /* renamed from: w */
    public C14335f9 f36661w;

    public C14784v(C14347ff ffVar, C14870xf xfVar, ExecutorService executorService, C14280de<C14210b5<JSONObject>> deVar, C14280de<C14210b5<C14466k4.C14471e>> deVar2, C14213b7 b7Var) {
        this.f36654b = ffVar;
        this.f36655c = xfVar;
        this.f36656d = executorService;
        this.f36657e = deVar;
        this.f36658f = deVar2;
        this.f36659g = b7Var;
        deVar.mo34979d(this);
        deVar2.mo34979d(new C14756u(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m63706f(JSONObject jSONObject) {
        this.f36653a.mo35674c("processing event: %s", jSONObject.toString());
        this.f36654b.mo35252e(jSONObject);
        mo36592g();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m63707j() {
        C14210b5 c = this.f36658f.mo34977c();
        if (c.mo34659j()) {
            C14466k4.C14471e eVar = (C14466k4.C14471e) c.mo34655g();
            this.f36653a.mo35674c("Updating the configuration in EventsProcessor with collector endpoint: %s and maxBucketSize: %d", eVar.mo35726d(), Integer.valueOf(eVar.mo35724a()));
            mo36590d(eVar);
            this.f36660v = eVar.mo35724a();
        }
    }

    /* renamed from: a */
    public void mo34402a() {
        C14210b5 c = this.f36657e.mo34977c();
        if (c.mo34659j()) {
            mo36593h((JSONObject) c.mo34655g());
        }
    }

    /* renamed from: d */
    public final void mo36590d(C14466k4.C14471e eVar) {
        String a = C14920z5.m64191a(eVar.mo35726d());
        C14335f9 f9Var = this.f36661w;
        if (f9Var == null) {
            this.f36661w = new C14335f9(Executors.newSingleThreadExecutor(), this.f36654b, new C14925z9(), a, this.f36655c, this.f36659g);
        } else {
            f9Var.mo35172c(a);
        }
    }

    /* renamed from: e */
    public void mo36591e(C14335f9.C14340c cVar, C14335f9.C14339b bVar) {
        if (this.f36661w != null) {
            this.f36654b.mo35263p();
            this.f36661w.mo35171b(cVar, bVar);
        }
    }

    /* renamed from: g */
    public final void mo36592g() {
        boolean z = false;
        boolean h = this.f36659g.mo34676h(C14477k8.LOCAL_LOG_VISUALIZER_MODE, false);
        if (this.f36654b.mo35258k() >= this.f36660v) {
            z = true;
        }
        if (h || z) {
            mo36594i();
        }
    }

    /* renamed from: h */
    public final void mo36593h(JSONObject jSONObject) {
        this.f36656d.submit(new C14718t(this, jSONObject));
    }

    /* renamed from: i */
    public void mo36594i() {
        if (this.f36661w != null) {
            this.f36654b.mo35263p();
            this.f36661w.mo35170a();
        }
    }
}
