package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.C1185g2;
import androidx.camera.camera2.internal.C1237r2;
import androidx.camera.camera2.internal.compat.C1048a;
import androidx.camera.camera2.internal.compat.C1074i;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1461i0;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1545d;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.internal.m2 */
public class C1211m2 extends C1185g2.C1186a implements C1185g2, C1237r2.C1239b {

    /* renamed from: o */
    public static final String f3469o = "SyncCaptureSessionBase";

    /* renamed from: a */
    public final Object f3470a = new Object();
    @C0359n0

    /* renamed from: b */
    public final C1209m1 f3471b;
    @C0359n0

    /* renamed from: c */
    public final Handler f3472c;
    @C0359n0

    /* renamed from: d */
    public final Executor f3473d;
    @C0359n0

    /* renamed from: e */
    public final ScheduledExecutorService f3474e;
    @C0363p0

    /* renamed from: f */
    public C1185g2.C1186a f3475f;
    @C0363p0

    /* renamed from: g */
    public C1048a f3476g;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: h */
    public C32487a<Void> f3477h;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: i */
    public CallbackToFutureAdapter.C16559a<Void> f3478i;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: j */
    public C32487a<List<Surface>> f3479j;
    @C0363p0
    @C0323b0("mLock")

    /* renamed from: k */
    public List<DeferrableSurface> f3480k = null;
    @C0323b0("mLock")

    /* renamed from: l */
    public boolean f3481l = false;
    @C0323b0("mLock")

    /* renamed from: m */
    public boolean f3482m = false;
    @C0323b0("mLock")

    /* renamed from: n */
    public boolean f3483n = false;

    /* renamed from: androidx.camera.camera2.internal.m2$a */
    public class C1212a implements C1544c<Void> {
        public C1212a() {
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            C1211m2.this.mo4517g();
            C1211m2 m2Var = C1211m2.this;
            m2Var.f3471b.mo4556j(m2Var);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.m2$b */
    public class C1213b extends CameraCaptureSession.StateCallback {
        public C1213b() {
        }

        public void onActive(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            C1211m2.this.mo4565G(cameraCaptureSession);
            C1211m2 m2Var = C1211m2.this;
            m2Var.mo4528t(m2Var);
        }

        @C0376v0(api = 26)
        public void onCaptureQueueEmpty(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            C1211m2.this.mo4565G(cameraCaptureSession);
            C1211m2 m2Var = C1211m2.this;
            m2Var.mo4529u(m2Var);
        }

        public void onClosed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            C1211m2.this.mo4565G(cameraCaptureSession);
            C1211m2 m2Var = C1211m2.this;
            m2Var.mo4530v(m2Var);
        }

        public void onConfigureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.C16559a<Void> aVar;
            try {
                C1211m2.this.mo4565G(cameraCaptureSession);
                C1211m2 m2Var = C1211m2.this;
                m2Var.mo4201w(m2Var);
                synchronized (C1211m2.this.f3470a) {
                    C18001r.m81776m(C1211m2.this.f3478i, "OpenCaptureSession completer should not null");
                    C1211m2 m2Var2 = C1211m2.this;
                    aVar = m2Var2.f3478i;
                    m2Var2.f3478i = null;
                }
                aVar.mo48128f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (C1211m2.this.f3470a) {
                    C18001r.m81776m(C1211m2.this.f3478i, "OpenCaptureSession completer should not null");
                    C1211m2 m2Var3 = C1211m2.this;
                    CallbackToFutureAdapter.C16559a<Void> aVar2 = m2Var3.f3478i;
                    m2Var3.f3478i = null;
                    aVar2.mo48128f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        public void onConfigured(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.C16559a<Void> aVar;
            try {
                C1211m2.this.mo4565G(cameraCaptureSession);
                C1211m2 m2Var = C1211m2.this;
                m2Var.mo4202x(m2Var);
                synchronized (C1211m2.this.f3470a) {
                    C18001r.m81776m(C1211m2.this.f3478i, "OpenCaptureSession completer should not null");
                    C1211m2 m2Var2 = C1211m2.this;
                    aVar = m2Var2.f3478i;
                    m2Var2.f3478i = null;
                }
                aVar.mo48125c(null);
            } catch (Throwable th) {
                synchronized (C1211m2.this.f3470a) {
                    C18001r.m81776m(C1211m2.this.f3478i, "OpenCaptureSession completer should not null");
                    C1211m2 m2Var3 = C1211m2.this;
                    CallbackToFutureAdapter.C16559a<Void> aVar2 = m2Var3.f3478i;
                    m2Var3.f3478i = null;
                    aVar2.mo48125c(null);
                    throw th;
                }
            }
        }

        public void onReady(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            C1211m2.this.mo4565G(cameraCaptureSession);
            C1211m2 m2Var = C1211m2.this;
            m2Var.mo4203y(m2Var);
        }

        @C0376v0(api = 23)
        public void onSurfacePrepared(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Surface surface) {
            C1211m2.this.mo4565G(cameraCaptureSession);
            C1211m2 m2Var = C1211m2.this;
            m2Var.mo4527A(m2Var, surface);
        }
    }

    public C1211m2(@C0359n0 C1209m1 m1Var, @C0359n0 Executor executor, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Handler handler) {
        this.f3471b = m1Var;
        this.f3472c = handler;
        this.f3473d = executor;
        this.f3474e = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m5004J() {
        mo4204z(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m5005K(C1185g2 g2Var) {
        this.f3471b.mo4554h(this);
        mo4204z(g2Var);
        this.f3475f.mo4530v(g2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m5006L(C1185g2 g2Var) {
        this.f3475f.mo4204z(g2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ Object m5007M(List list, C1074i iVar, C1122z zVar, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        boolean z;
        String str;
        synchronized (this.f3470a) {
            mo4566H(list);
            if (this.f3478i == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "The openCaptureSessionCompleter can only set once!");
            this.f3478i = aVar;
            iVar.mo4325a(zVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ C32487a m5008N(List list, List list2) throws Exception {
        C1417i2.m5911a(f3469o, "[" + this + "] getSurface...done");
        if (list2.contains((Object) null)) {
            return C1548f.m6477f(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf((Object) null))));
        }
        if (list2.isEmpty()) {
            return C1548f.m6477f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C1548f.m6479h(list2);
    }

    @C0376v0(api = 23)
    /* renamed from: A */
    public void mo4527A(@C0359n0 C1185g2 g2Var, @C0359n0 Surface surface) {
        this.f3475f.mo4527A(g2Var, surface);
    }

    /* renamed from: G */
    public void mo4565G(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        if (this.f3476g == null) {
            this.f3476g = C1048a.m4632g(cameraCaptureSession, this.f3472c);
        }
    }

    /* renamed from: H */
    public void mo4566H(@C0359n0 List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f3470a) {
            mo4568O();
            C1461i0.m6127f(list);
            this.f3480k = list;
        }
    }

    /* renamed from: I */
    public boolean mo4567I() {
        boolean z;
        synchronized (this.f3470a) {
            if (this.f3477h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: O */
    public void mo4568O() {
        synchronized (this.f3470a) {
            List<DeferrableSurface> list = this.f3480k;
            if (list != null) {
                C1461i0.m6126e(list);
                this.f3480k = null;
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public Executor mo4569a() {
        return this.f3473d;
    }

    /* renamed from: b */
    public int mo4511b(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4285a(list, executor, captureCallback);
    }

    /* renamed from: c */
    public int mo4512c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4287c(list, executor, captureCallback);
    }

    public void close() {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        this.f3471b.mo4555i(this);
        this.f3476g.mo4289e().close();
        mo4569a().execute(new C1206l2(this));
    }

    /* renamed from: d */
    public int mo4514d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4288d(captureRequest, executor, captureCallback);
    }

    /* renamed from: e */
    public int mo4515e(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4286b(captureRequest, executor, captureCallback);
    }

    @C0359n0
    /* renamed from: f */
    public C1185g2.C1186a mo4516f() {
        return this;
    }

    /* renamed from: g */
    public void mo4517g() {
        mo4568O();
    }

    /* renamed from: h */
    public int mo4518h(@C0359n0 CaptureRequest captureRequest, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4286b(captureRequest, mo4569a(), captureCallback);
    }

    /* renamed from: i */
    public void mo4519i() throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        this.f3476g.mo4289e().abortCaptures();
    }

    @C0359n0
    /* renamed from: j */
    public CameraDevice mo4520j() {
        C18001r.m81775l(this.f3476g);
        return this.f3476g.mo4289e().getDevice();
    }

    /* renamed from: k */
    public int mo4521k(@C0359n0 CaptureRequest captureRequest, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4288d(captureRequest, mo4569a(), captureCallback);
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<Void> mo4570l(@C0359n0 CameraDevice cameraDevice, @C0359n0 C1122z zVar, @C0359n0 List<DeferrableSurface> list) {
        synchronized (this.f3470a) {
            if (this.f3482m) {
                C32487a<Void> f = C1548f.m6477f(new CancellationException("Opener is disabled"));
                return f;
            }
            this.f3471b.mo4558l(this);
            C32487a<Void> a = CallbackToFutureAdapter.m74987a(new C1198j2(this, list, C1074i.m4661d(cameraDevice, this.f3472c), zVar));
            this.f3477h = a;
            C1548f.m6473b(a, new C1212a(), C1525a.m6437a());
            C32487a<Void> j = C1548f.m6481j(this.f3477h);
            return j;
        }
    }

    @C0359n0
    /* renamed from: m */
    public C1122z mo4571m(int i, @C0359n0 List<C1096d> list, @C0359n0 C1185g2.C1186a aVar) {
        this.f3475f = aVar;
        return new C1122z(i, list, mo4569a(), new C1213b());
    }

    @C0359n0
    /* renamed from: n */
    public C32487a<List<Surface>> mo4572n(@C0359n0 List<DeferrableSurface> list, long j) {
        synchronized (this.f3470a) {
            if (this.f3482m) {
                C32487a<List<Surface>> f = C1548f.m6477f(new CancellationException("Opener is disabled"));
                return f;
            }
            C1545d<T> f2 = C1545d.m6463b(C1461i0.m6132k(list, false, j, mo4569a(), this.f3474e)).mo5486f(new C1194i2(this, list), mo4569a());
            this.f3479j = f2;
            C32487a<List<Surface>> j2 = C1548f.m6481j(f2);
            return j2;
        }
    }

    @C0359n0
    /* renamed from: o */
    public C32487a<Void> mo4522o(@C0359n0 String str) {
        return C1548f.m6479h(null);
    }

    /* renamed from: p */
    public int mo4523p(@C0359n0 List<CaptureRequest> list, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4287c(list, mo4569a(), captureCallback);
    }

    /* renamed from: q */
    public int mo4524q(@C0359n0 List<CaptureRequest> list, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        return this.f3476g.mo4285a(list, mo4569a(), captureCallback);
    }

    @C0359n0
    /* renamed from: r */
    public C1048a mo4525r() {
        C18001r.m81775l(this.f3476g);
        return this.f3476g;
    }

    /* renamed from: s */
    public void mo4526s() throws CameraAccessException {
        C18001r.m81776m(this.f3476g, "Need to call openCaptureSession before using this API.");
        this.f3476g.mo4289e().stopRepeating();
    }

    public boolean stop() {
        boolean z;
        C32487a<List<Surface>> aVar = null;
        try {
            synchronized (this.f3470a) {
                if (!this.f3482m) {
                    C32487a<List<Surface>> aVar2 = this.f3479j;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.f3482m = true;
                }
                if (!mo4567I()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.cancel(true);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public void mo4528t(@C0359n0 C1185g2 g2Var) {
        this.f3475f.mo4528t(g2Var);
    }

    @C0376v0(api = 26)
    /* renamed from: u */
    public void mo4529u(@C0359n0 C1185g2 g2Var) {
        this.f3475f.mo4529u(g2Var);
    }

    /* renamed from: v */
    public void mo4530v(@C0359n0 C1185g2 g2Var) {
        C32487a<Void> aVar;
        synchronized (this.f3470a) {
            if (!this.f3481l) {
                this.f3481l = true;
                C18001r.m81776m(this.f3477h, "Need to call openCaptureSession before using this API.");
                aVar = this.f3477h;
            } else {
                aVar = null;
            }
        }
        mo4517g();
        if (aVar != null) {
            aVar.mo5489q(new C1202k2(this, g2Var), C1525a.m6437a());
        }
    }

    /* renamed from: w */
    public void mo4201w(@C0359n0 C1185g2 g2Var) {
        mo4517g();
        this.f3471b.mo4556j(this);
        this.f3475f.mo4201w(g2Var);
    }

    /* renamed from: x */
    public void mo4202x(@C0359n0 C1185g2 g2Var) {
        this.f3471b.mo4557k(this);
        this.f3475f.mo4202x(g2Var);
    }

    /* renamed from: y */
    public void mo4203y(@C0359n0 C1185g2 g2Var) {
        this.f3475f.mo4203y(g2Var);
    }

    /* renamed from: z */
    public void mo4204z(@C0359n0 C1185g2 g2Var) {
        C32487a<Void> aVar;
        synchronized (this.f3470a) {
            if (!this.f3483n) {
                this.f3483n = true;
                C18001r.m81776m(this.f3477h, "Need to call openCaptureSession before using this API.");
                aVar = this.f3477h;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo5489q(new C1190h2(this, g2Var), C1525a.m6437a());
        }
    }
}
