package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.C1048a;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.g2 */
public interface C1185g2 {

    /* renamed from: androidx.camera.camera2.internal.g2$a */
    public static abstract class C1186a {
        @C0376v0(api = 23)
        /* renamed from: A */
        public void mo4527A(@C0359n0 C1185g2 g2Var, @C0359n0 Surface surface) {
        }

        /* renamed from: t */
        public void mo4528t(@C0359n0 C1185g2 g2Var) {
        }

        @C0376v0(api = 26)
        /* renamed from: u */
        public void mo4529u(@C0359n0 C1185g2 g2Var) {
        }

        /* renamed from: v */
        public void mo4530v(@C0359n0 C1185g2 g2Var) {
        }

        /* renamed from: w */
        public void mo4201w(@C0359n0 C1185g2 g2Var) {
        }

        /* renamed from: x */
        public void mo4202x(@C0359n0 C1185g2 g2Var) {
        }

        /* renamed from: y */
        public void mo4203y(@C0359n0 C1185g2 g2Var) {
        }

        /* renamed from: z */
        public void mo4204z(@C0359n0 C1185g2 g2Var) {
        }
    }

    /* renamed from: b */
    int mo4511b(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: c */
    int mo4512c(@C0359n0 List<CaptureRequest> list, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    /* renamed from: d */
    int mo4514d(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: e */
    int mo4515e(@C0359n0 CaptureRequest captureRequest, @C0359n0 Executor executor, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    @C0359n0
    /* renamed from: f */
    C1186a mo4516f();

    /* renamed from: g */
    void mo4517g();

    /* renamed from: h */
    int mo4518h(@C0359n0 CaptureRequest captureRequest, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: i */
    void mo4519i() throws CameraAccessException;

    @C0359n0
    /* renamed from: j */
    CameraDevice mo4520j();

    /* renamed from: k */
    int mo4521k(@C0359n0 CaptureRequest captureRequest, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    @C0359n0
    /* renamed from: o */
    C32487a<Void> mo4522o(@C0359n0 String str);

    /* renamed from: p */
    int mo4523p(@C0359n0 List<CaptureRequest> list, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: q */
    int mo4524q(@C0359n0 List<CaptureRequest> list, @C0359n0 CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    @C0359n0
    /* renamed from: r */
    C1048a mo4525r();

    /* renamed from: s */
    void mo4526s() throws CameraAccessException;
}
