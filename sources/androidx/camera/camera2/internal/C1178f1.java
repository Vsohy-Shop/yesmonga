package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1472k1;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.core.util.C18001r;

/* renamed from: androidx.camera.camera2.internal.f1 */
public final class C1178f1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final C1448f f3393a;

    public C1178f1(C1448f fVar) {
        if (fVar != null) {
            this.f3393a = fVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
        C1472k1 k1Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C18001r.m81765b(tag instanceof C1472k1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            k1Var = (C1472k1) tag;
        } else {
            k1Var = C1472k1.m6168b();
        }
        this.f3393a.mo4263b(new C1176f(k1Var, totalCaptureResult));
    }

    public void onCaptureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f3393a.mo4264c(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}
