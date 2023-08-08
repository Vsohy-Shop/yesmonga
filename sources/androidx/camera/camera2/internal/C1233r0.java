package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.r0 */
public final class C1233r0 {

    /* renamed from: androidx.camera.camera2.internal.r0$a */
    public static final class C1234a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final List<CameraCaptureSession.CaptureCallback> f3539a = new ArrayList();

        public C1234a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback next : list) {
                if (!(next instanceof C1235b)) {
                    this.f3539a.add(next);
                }
            }
        }

        @C0376v0(api = 24)
        public void onCaptureBufferLost(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 Surface surface, long j) {
            for (CameraCaptureSession.CaptureCallback onCaptureBufferLost : this.f3539a) {
                onCaptureBufferLost.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            }
        }

        public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureCompleted : this.f3539a) {
                onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        public void onCaptureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureFailure captureFailure) {
            for (CameraCaptureSession.CaptureCallback onCaptureFailed : this.f3539a) {
                onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        public void onCaptureProgressed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureResult captureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureProgressed : this.f3539a) {
                onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        public void onCaptureSequenceAborted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : this.f3539a) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }

        public void onCaptureSequenceCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i, long j) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : this.f3539a) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }

        public void onCaptureStarted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, long j, long j2) {
            for (CameraCaptureSession.CaptureCallback onCaptureStarted : this.f3539a) {
                onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.r0$b */
    public static final class C1235b extends CameraCaptureSession.CaptureCallback {
        public void onCaptureBufferLost(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 Surface surface, long j) {
        }

        public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
        }

        public void onCaptureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureFailure captureFailure) {
        }

        public void onCaptureProgressed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureResult captureResult) {
        }

        public void onCaptureSequenceAborted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i) {
        }

        public void onCaptureSequenceCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i, long j) {
        }

        public void onCaptureStarted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, long j, long j2) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m5097a(List<CameraCaptureSession.CaptureCallback> list) {
        return new C1234a(list);
    }

    @C0359n0
    /* renamed from: b */
    public static CameraCaptureSession.CaptureCallback m5098b(@C0359n0 CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return m5097a(Arrays.asList(captureCallbackArr));
    }

    @C0359n0
    /* renamed from: c */
    public static CameraCaptureSession.CaptureCallback m5099c() {
        return new C1235b();
    }
}
