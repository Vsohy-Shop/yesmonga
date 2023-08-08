package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1254v;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.C1410h0;
import androidx.camera.core.C1636l0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

@C0335b(markerClass = C1410h0.class)
/* renamed from: androidx.camera.camera2.internal.r1 */
public class C1236r1 {

    /* renamed from: g */
    public static final int f3540g = 0;
    @C0359n0

    /* renamed from: a */
    public final C1254v f3541a;
    @C0359n0

    /* renamed from: b */
    public final C1243s1 f3542b;
    @C0359n0

    /* renamed from: c */
    public final Executor f3543c;

    /* renamed from: d */
    public boolean f3544d = false;
    @C0363p0

    /* renamed from: e */
    public CallbackToFutureAdapter.C16559a<Integer> f3545e;
    @C0363p0

    /* renamed from: f */
    public C1254v.C1257c f3546f;

    public C1236r1(@C0359n0 C1254v vVar, @C0359n0 C1073h hVar, @C0359n0 Executor executor) {
        this.f3541a = vVar;
        this.f3542b = new C1243s1(hVar, 0);
        this.f3543c = executor;
    }

    /* renamed from: e */
    public static C1636l0 m5103e(C1073h hVar) {
        return new C1243s1(hVar, 0);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m5104g(int i, CallbackToFutureAdapter.C16559a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i) {
                return false;
            }
            aVar.mo48125c(Integer.valueOf(i));
            return true;
        } else if (num2 == null || num2.intValue() != i) {
            return false;
        } else {
            aVar.mo48125c(Integer.valueOf(i));
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m5105h(CallbackToFutureAdapter.C16559a aVar, int i) {
        boolean z;
        boolean z2 = false;
        if (!this.f3544d) {
            this.f3542b.mo4649e(0);
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        mo4633d();
        if (this.f3545e == null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81778o(z, "mRunningCompleter should be null when starting set a new exposure compensation value");
        if (this.f3546f == null) {
            z2 = true;
        }
        C18001r.m81778o(z2, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        C1229q1 q1Var = new C1229q1(i, aVar);
        this.f3546f = q1Var;
        this.f3545e = aVar;
        this.f3541a.mo4654B(q1Var);
        this.f3541a.mo4697o0();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m5106i(int i, CallbackToFutureAdapter.C16559a aVar) throws Exception {
        this.f3543c.execute(new C1220o1(this, aVar, i));
        return "setExposureCompensationIndex[" + i + "]";
    }

    /* renamed from: d */
    public final void mo4633d() {
        CallbackToFutureAdapter.C16559a<Integer> aVar = this.f3545e;
        if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f3545e = null;
        }
        C1254v.C1257c cVar = this.f3546f;
        if (cVar != null) {
            this.f3541a.mo4683h0(cVar);
            this.f3546f = null;
        }
    }

    @C0359n0
    /* renamed from: f */
    public C1636l0 mo4634f() {
        return this.f3542b;
    }

    /* renamed from: j */
    public void mo4635j(boolean z) {
        if (z != this.f3544d) {
            this.f3544d = z;
            if (!z) {
                this.f3542b.mo4649e(0);
                mo4633d();
            }
        }
    }

    /* renamed from: k */
    public void mo4636k(@C0359n0 C1004b.C1005a aVar) {
        aVar.mo4096e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f3542b.mo4645a()));
    }

    @C0359n0
    /* renamed from: l */
    public C32487a<Integer> mo4637l(int i) {
        if (!this.f3542b.mo4647c()) {
            return C1548f.m6477f(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> d = this.f3542b.mo4648d();
        if (!d.contains(Integer.valueOf(i))) {
            return C1548f.m6477f(new IllegalArgumentException("Requested ExposureCompensation " + i + " is not within valid range [" + d.getUpper() + ".." + d.getLower() + "]"));
        }
        this.f3542b.mo4649e(i);
        return C1548f.m6481j(CallbackToFutureAdapter.m74987a(new C1224p1(this, i)));
    }
}
