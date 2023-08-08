package androidx.camera.camera2.interop;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1254v;
import androidx.camera.camera2.interop.C1296o;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

@C1298p
/* renamed from: androidx.camera.camera2.interop.i */
public final class C1288i {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: i */
    public static final String f3669i = "Camera2CameraControl";

    /* renamed from: a */
    public boolean f3670a = false;

    /* renamed from: b */
    public boolean f3671b = false;

    /* renamed from: c */
    public final C1254v f3672c;

    /* renamed from: d */
    public final Executor f3673d;

    /* renamed from: e */
    public final Object f3674e = new Object();
    @C0323b0("mLock")

    /* renamed from: f */
    public C1004b.C1005a f3675f = new C1004b.C1005a();

    /* renamed from: g */
    public CallbackToFutureAdapter.C16559a<Void> f3676g;

    /* renamed from: h */
    public final C1254v.C1257c f3677h = new C1284e(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C1288i(@C0359n0 C1254v vVar, @C0359n0 Executor executor) {
        this.f3672c = vVar;
        this.f3673d = executor;
    }

    @C0359n0
    /* renamed from: m */
    public static C1288i m5279m(@C0359n0 CameraControl cameraControl) {
        C18001r.m81765b(cameraControl instanceof C1254v, "CameraControl doesn't contain Camera2 implementation.");
        return ((C1254v) cameraControl).mo4658F();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m5281r(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3673d.execute(new C1280a(this, aVar));
        return "addCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Object m5283t(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3673d.execute(new C1286g(this, aVar));
        return "clearCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean m5284u(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r2.f3676g
            r1 = 0
            if (r0 == 0) goto L_0x0030
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.C1472k1
            if (r0 == 0) goto L_0x0030
            androidx.camera.core.impl.k1 r3 = (androidx.camera.core.impl.C1472k1) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Integer r3 = r3.mo5239d(r0)
            if (r3 == 0) goto L_0x0030
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r0 = r2.f3676g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0030
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r3 = r2.f3676g
            r2.f3676g = r1
            goto L_0x0031
        L_0x0030:
            r3 = r1
        L_0x0031:
            if (r3 == 0) goto L_0x0036
            r3.mo48125c(r1)
        L_0x0036:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.interop.C1288i.m5284u(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Object m5287x(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3673d.execute(new C1287h(this, aVar));
        return "setCaptureRequestOptions";
    }

    @C0359n0
    /* renamed from: A */
    public C32487a<Void> mo4742A(@C0359n0 C1296o oVar) {
        mo4748l();
        mo4746j(oVar);
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1285f(this)));
    }

    /* renamed from: B */
    public final void m5286w(CallbackToFutureAdapter.C16559a<Void> aVar) {
        this.f3671b = true;
        CallbackToFutureAdapter.C16559a<Void> aVar2 = this.f3676g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f3676g = aVar;
        if (this.f3670a) {
            mo4744C();
        }
        if (aVar2 != null) {
            aVar2.mo48128f(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: C */
    public final void mo4744C() {
        this.f3672c.mo4695n0();
        this.f3671b = false;
    }

    @C0359n0
    /* renamed from: i */
    public C32487a<Void> mo4745i(@C0359n0 C1296o oVar) {
        mo4746j(oVar);
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1283d(this)));
    }

    /* renamed from: j */
    public final void mo4746j(@C0359n0 C1296o oVar) {
        synchronized (this.f3674e) {
            for (Config.C1421a next : oVar.mo5129f()) {
                this.f3675f.mo4099h().mo5545t(next, oVar.mo5125b(next));
            }
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: k */
    public C32487a<Void> mo4747k() {
        mo4748l();
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1282c(this)));
    }

    /* renamed from: l */
    public final void mo4748l() {
        synchronized (this.f3674e) {
            this.f3675f = new C1004b.C1005a();
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: n */
    public C1004b mo4749n() {
        C1004b b;
        synchronized (this.f3674e) {
            if (this.f3676g != null) {
                this.f3675f.mo4099h().mo5545t(C1004b.f3070C, Integer.valueOf(this.f3676g.hashCode()));
            }
            b = this.f3675f.mo4098g();
        }
        return b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: o */
    public C1254v.C1257c mo4750o() {
        return this.f3677h;
    }

    @C0359n0
    /* renamed from: p */
    public C1296o mo4751p() {
        C1296o d;
        synchronized (this.f3674e) {
            d = C1296o.C1297a.m5319f(this.f3675f.mo4098g()).mo4098g();
        }
        return d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: y */
    public void mo4752y(boolean z) {
        this.f3673d.execute(new C1281b(this, z));
    }

    /* renamed from: z */
    public final void m5285v(boolean z) {
        if (this.f3670a != z) {
            this.f3670a = z;
            if (!z) {
                mo4748l();
                CallbackToFutureAdapter.C16559a<Void> aVar = this.f3676g;
                if (aVar != null) {
                    aVar.mo48128f(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                    this.f3676g = null;
                }
            } else if (this.f3671b) {
                mo4744C();
            }
        }
    }
}
