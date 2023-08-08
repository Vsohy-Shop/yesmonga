package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.C1029a3;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;

/* renamed from: androidx.camera.camera2.internal.n1 */
public final class C1216n1 implements C1029a3.C1031b {

    /* renamed from: e */
    public static final float f3491e = 1.0f;

    /* renamed from: a */
    public final C1073h f3492a;

    /* renamed from: b */
    public Rect f3493b = null;

    /* renamed from: c */
    public CallbackToFutureAdapter.C16559a<Void> f3494c;

    /* renamed from: d */
    public Rect f3495d = null;

    public C1216n1(@C0359n0 C1073h hVar) {
        this.f3492a = hVar;
    }

    @C0359n0
    /* renamed from: h */
    public static Rect m5043h(@C0359n0 Rect rect, float f) {
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    /* renamed from: a */
    public void mo4230a(@C0359n0 TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.f3494c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.f3495d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f3494c.mo48125c(null);
                this.f3494c = null;
                this.f3495d = null;
            }
        }
    }

    /* renamed from: b */
    public void mo4231b(@C0359n0 C1004b.C1005a aVar) {
        Rect rect = this.f3493b;
        if (rect != null) {
            aVar.mo4096e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    /* renamed from: c */
    public void mo4232c(float f, @C0359n0 CallbackToFutureAdapter.C16559a<Void> aVar) {
        this.f3493b = m5043h(mo4584i(), f);
        CallbackToFutureAdapter.C16559a<Void> aVar2 = this.f3494c;
        if (aVar2 != null) {
            aVar2.mo48128f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f3495d = this.f3493b;
        this.f3494c = aVar;
    }

    /* renamed from: d */
    public float mo4233d() {
        return 1.0f;
    }

    /* renamed from: e */
    public void mo4234e() {
        this.f3495d = null;
        this.f3493b = null;
        CallbackToFutureAdapter.C16559a<Void> aVar = this.f3494c;
        if (aVar != null) {
            aVar.mo48128f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f3494c = null;
        }
    }

    /* renamed from: f */
    public float mo4235f() {
        Float f = (Float) this.f3492a.mo4323a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo4233d()) {
            return mo4233d();
        }
        return f.floatValue();
    }

    @C0359n0
    /* renamed from: g */
    public Rect mo4236g() {
        Rect rect = this.f3493b;
        return rect != null ? rect : mo4584i();
    }

    /* renamed from: i */
    public final Rect mo4584i() {
        return (Rect) C18001r.m81775l((Rect) this.f3492a.mo4323a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
