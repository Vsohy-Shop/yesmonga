package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.List;
import java.util.concurrent.Executor;

@C0376v0(28)
/* renamed from: androidx.camera.camera2.internal.compat.f */
public class C1070f extends C1071g {
    public C1070f(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, (Object) null);
    }

    /* renamed from: b */
    public int mo4291b(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.captureBurstRequests(list, executor, captureCallback);
    }

    /* renamed from: c */
    public int mo4292c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    /* renamed from: d */
    public int mo4293d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    /* renamed from: e */
    public int mo4294e(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.captureSingleRequest(captureRequest, executor, captureCallback);
    }
}
