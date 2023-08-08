package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1448f;

/* renamed from: androidx.camera.camera2.internal.g1 */
public final class C1184g1 extends C1448f {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f3425a;

    public C1184g1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f3425a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    /* renamed from: d */
    public static C1184g1 m4952d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C1184g1(captureCallback);
    }

    @C0359n0
    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback mo4510e() {
        return this.f3425a;
    }
}
