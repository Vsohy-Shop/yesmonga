package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.C34959u;
import com.journeyapps.barcodescanner.C34961w;

/* renamed from: com.journeyapps.barcodescanner.camera.h */
public class C34918h {

    /* renamed from: n */
    public static final String f84934n = "h";

    /* renamed from: a */
    public C34927l f84935a;

    /* renamed from: b */
    public C34926k f84936b;

    /* renamed from: c */
    public C34923i f84937c;

    /* renamed from: d */
    public Handler f84938d;

    /* renamed from: e */
    public C34929n f84939e;

    /* renamed from: f */
    public boolean f84940f = false;

    /* renamed from: g */
    public boolean f84941g = true;

    /* renamed from: h */
    public Handler f84942h;

    /* renamed from: i */
    public CameraSettings f84943i = new CameraSettings();

    /* renamed from: j */
    public Runnable f84944j = new C34919a();

    /* renamed from: k */
    public Runnable f84945k = new C34920b();

    /* renamed from: l */
    public Runnable f84946l = new C34921c();

    /* renamed from: m */
    public Runnable f84947m = new C34922d();

    /* renamed from: com.journeyapps.barcodescanner.camera.h$a */
    public class C34919a implements Runnable {
        public C34919a() {
        }

        public void run() {
            try {
                String unused = C34918h.f84934n;
                C34918h.this.f84937c.mo103461r();
            } catch (Exception e) {
                C34918h.this.mo103417C(e);
                String unused2 = C34918h.f84934n;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.camera.h$b */
    public class C34920b implements Runnable {
        public C34920b() {
        }

        public void run() {
            try {
                String unused = C34918h.f84934n;
                C34918h.this.f84937c.mo103450f();
                if (C34918h.this.f84938d != null) {
                    C34918h.this.f84938d.obtainMessage(C34661l.C34666e.zxing_prewiew_size_ready, C34918h.this.mo103436u()).sendToTarget();
                }
            } catch (Exception e) {
                C34918h.this.mo103417C(e);
                String unused2 = C34918h.f84934n;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.camera.h$c */
    public class C34921c implements Runnable {
        public C34921c() {
        }

        public void run() {
            try {
                String unused = C34918h.f84934n;
                C34918h.this.f84937c.mo103469z(C34918h.this.f84936b);
                C34918h.this.f84937c.mo103445B();
            } catch (Exception e) {
                C34918h.this.mo103417C(e);
                String unused2 = C34918h.f84934n;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.camera.h$d */
    public class C34922d implements Runnable {
        public C34922d() {
        }

        public void run() {
            try {
                String unused = C34918h.f84934n;
                C34918h.this.f84937c.mo103446C();
                C34918h.this.f84937c.mo103449e();
            } catch (Exception unused2) {
                String unused3 = C34918h.f84934n;
            }
            boolean unused4 = C34918h.this.f84941g = true;
            C34918h.this.f84938d.sendEmptyMessage(C34661l.C34666e.zxing_camera_closed);
            C34918h.this.f84935a.mo103478b();
        }
    }

    public C34918h(Context context) {
        C34961w.m142988a();
        this.f84935a = C34927l.m142847e();
        C34923i iVar = new C34923i(context);
        this.f84937c = iVar;
        iVar.mo103464u(this.f84943i);
        this.f84942h = new Handler();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m142773A(C34934r rVar) {
        if (this.f84940f) {
            this.f84935a.mo103479c(new C34916f(this, rVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m142774B(boolean z) {
        this.f84937c.mo103444A(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m142787y(C34925j jVar) {
        this.f84937c.mo103448d(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m142788z(C34934r rVar) {
        this.f84937c.mo103462s(rVar);
    }

    /* renamed from: C */
    public final void mo103417C(Exception exc) {
        Handler handler = this.f84938d;
        if (handler != null) {
            handler.obtainMessage(C34661l.C34666e.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* renamed from: D */
    public void mo103418D() {
        C34961w.m142988a();
        this.f84940f = true;
        this.f84941g = false;
        this.f84935a.mo103481f(this.f84944j);
    }

    /* renamed from: E */
    public void mo103419E(C34934r rVar) {
        this.f84942h.post(new C34917g(this, rVar));
    }

    /* renamed from: F */
    public void mo103420F(CameraSettings cameraSettings) {
        if (!this.f84940f) {
            this.f84943i = cameraSettings;
            this.f84937c.mo103464u(cameraSettings);
        }
    }

    /* renamed from: G */
    public void mo103421G(C34929n nVar) {
        this.f84939e = nVar;
        this.f84937c.mo103466w(nVar);
    }

    /* renamed from: H */
    public void mo103422H(Handler handler) {
        this.f84938d = handler;
    }

    /* renamed from: I */
    public void mo103423I(C34926k kVar) {
        this.f84936b = kVar;
    }

    /* renamed from: J */
    public void mo103424J(SurfaceHolder surfaceHolder) {
        mo103423I(new C34926k(surfaceHolder));
    }

    /* renamed from: K */
    public void mo103425K(boolean z) {
        C34961w.m142988a();
        if (this.f84940f) {
            this.f84935a.mo103479c(new C34915e(this, z));
        }
    }

    /* renamed from: L */
    public void mo103426L() {
        C34961w.m142988a();
        mo103427M();
        this.f84935a.mo103479c(this.f84946l);
    }

    /* renamed from: M */
    public final void mo103427M() {
        if (!this.f84940f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: m */
    public void mo103428m(C34925j jVar) {
        C34961w.m142988a();
        if (this.f84940f) {
            this.f84935a.mo103479c(new C34914d(this, jVar));
        }
    }

    /* renamed from: n */
    public void mo103429n() {
        C34961w.m142988a();
        if (this.f84940f) {
            this.f84935a.mo103479c(this.f84947m);
        } else {
            this.f84941g = true;
        }
        this.f84940f = false;
    }

    /* renamed from: o */
    public void mo103430o() {
        C34961w.m142988a();
        mo103427M();
        this.f84935a.mo103479c(this.f84945k);
    }

    /* renamed from: p */
    public C34923i mo103431p() {
        return this.f84937c;
    }

    /* renamed from: q */
    public int mo103432q() {
        return this.f84937c.mo103452h();
    }

    /* renamed from: r */
    public CameraSettings mo103433r() {
        return this.f84943i;
    }

    /* renamed from: s */
    public C34927l mo103434s() {
        return this.f84935a;
    }

    /* renamed from: t */
    public C34929n mo103435t() {
        return this.f84939e;
    }

    /* renamed from: u */
    public final C34959u mo103436u() {
        return this.f84937c.mo103457m();
    }

    /* renamed from: v */
    public C34926k mo103437v() {
        return this.f84936b;
    }

    /* renamed from: w */
    public boolean mo103438w() {
        return this.f84941g;
    }

    /* renamed from: x */
    public boolean mo103439x() {
        return this.f84940f;
    }

    public C34918h(C34923i iVar) {
        C34961w.m142988a();
        this.f84937c = iVar;
    }
}
