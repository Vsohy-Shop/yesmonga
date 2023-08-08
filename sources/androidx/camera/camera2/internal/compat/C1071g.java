package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.C1048a;
import androidx.core.util.C18001r;
import java.util.List;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.g */
public class C1071g implements C1048a.C1049a {

    /* renamed from: a */
    public final CameraCaptureSession f3282a;

    /* renamed from: b */
    public final Object f3283b;

    /* renamed from: androidx.camera.camera2.internal.compat.g$a */
    public static class C1072a {

        /* renamed from: a */
        public final Handler f3284a;

        public C1072a(@C0359n0 Handler handler) {
            this.f3284a = handler;
        }
    }

    public C1071g(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0363p0 Object obj) {
        this.f3282a = (CameraCaptureSession) C18001r.m81775l(cameraCaptureSession);
        this.f3283b = obj;
    }

    /* renamed from: f */
    public static C1048a.C1049a m4651f(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Handler handler) {
        return new C1071g(cameraCaptureSession, new C1072a(handler));
    }

    @C0359n0
    /* renamed from: a */
    public CameraCaptureSession mo4290a() {
        return this.f3282a;
    }

    /* renamed from: b */
    public int mo4291b(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.captureBurst(list, new C1048a.C1050b(executor, captureCallback), ((C1072a) this.f3283b).f3284a);
    }

    /* renamed from: c */
    public int mo4292c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.setRepeatingBurst(list, new C1048a.C1050b(executor, captureCallback), ((C1072a) this.f3283b).f3284a);
    }

    /* renamed from: d */
    public int mo4293d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.setRepeatingRequest(captureRequest, new C1048a.C1050b(executor, captureCallback), ((C1072a) this.f3283b).f3284a);
    }

    /* renamed from: e */
    public int mo4294e(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f3282a.capture(captureRequest, new C1048a.C1050b(executor, captureCallback), ((C1072a) this.f3283b).f3284a);
    }
}
