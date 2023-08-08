package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1029a3;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;

@C0376v0(30)
/* renamed from: androidx.camera.camera2.internal.c */
public final class C1040c implements C1029a3.C1031b {

    /* renamed from: f */
    public static final float f3210f = 1.0f;

    /* renamed from: a */
    public final C1073h f3211a;

    /* renamed from: b */
    public final Range<Float> f3212b;

    /* renamed from: c */
    public float f3213c = 1.0f;

    /* renamed from: d */
    public CallbackToFutureAdapter.C16559a<Void> f3214d;

    /* renamed from: e */
    public float f3215e = 1.0f;

    public C1040c(@C0359n0 C1073h hVar) {
        this.f3211a = hVar;
        this.f3212b = (Range) hVar.mo4323a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    /* renamed from: a */
    public void mo4230a(@C0359n0 TotalCaptureResult totalCaptureResult) {
        Float f;
        if (this.f3214d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                f = (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            }
            if (f != null) {
                if (this.f3215e == f.floatValue()) {
                    this.f3214d.mo48125c(null);
                    this.f3214d = null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4231b(@C0359n0 C1004b.C1005a aVar) {
        aVar.mo4096e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f3213c));
    }

    /* renamed from: c */
    public void mo4232c(float f, @C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar) {
        this.f3213c = f;
        CallbackToFutureAdapter.C16559a<Void> aVar2 = this.f3214d;
        if (aVar2 != null) {
            aVar2.mo48128f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f3215e = this.f3213c;
        this.f3214d = aVar;
    }

    /* renamed from: d */
    public float mo4233d() {
        return this.f3212b.getLower().floatValue();
    }

    /* renamed from: e */
    public void mo4234e() {
        this.f3213c = 1.0f;
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3214d;
        if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f3214d = null;
        }
    }

    /* renamed from: f */
    public float mo4235f() {
        return this.f3212b.getUpper().floatValue();
    }

    @C0359n0
    /* renamed from: g */
    public Rect mo4236g() {
        return (Rect) C18001r.m81775l((Rect) this.f3211a.mo4323a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
