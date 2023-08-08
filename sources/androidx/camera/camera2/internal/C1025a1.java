package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.a1 */
public final class C1025a1 {

    /* renamed from: androidx.camera.camera2.internal.a1$a */
    public static final class C1026a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final List<CameraCaptureSession.StateCallback> f3166a = new ArrayList();

        public C1026a(@C0359n0 List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback next : list) {
                if (!(next instanceof C1027b)) {
                    this.f3166a.add(next);
                }
            }
        }

        public void onActive(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onActive : this.f3166a) {
                onActive.onActive(cameraCaptureSession);
            }
        }

        @C0376v0(api = 26)
        public void onCaptureQueueEmpty(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback a : this.f3166a) {
                a.onCaptureQueueEmpty(cameraCaptureSession);
            }
        }

        public void onClosed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onClosed : this.f3166a) {
                onClosed.onClosed(cameraCaptureSession);
            }
        }

        public void onConfigureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigureFailed : this.f3166a) {
                onConfigureFailed.onConfigureFailed(cameraCaptureSession);
            }
        }

        public void onConfigured(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigured : this.f3166a) {
                onConfigured.onConfigured(cameraCaptureSession);
            }
        }

        public void onReady(@C0359n0 CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onReady : this.f3166a) {
                onReady.onReady(cameraCaptureSession);
            }
        }

        @C0376v0(api = 23)
        public void onSurfacePrepared(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Surface surface) {
            for (CameraCaptureSession.StateCallback onSurfacePrepared : this.f3166a) {
                onSurfacePrepared.onSurfacePrepared(cameraCaptureSession, surface);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.a1$b */
    public static final class C1027b extends CameraCaptureSession.StateCallback {
        public void onActive(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onCaptureQueueEmpty(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onClosed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigured(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onReady(@C0359n0 CameraCaptureSession cameraCaptureSession) {
        }

        public void onSurfacePrepared(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 Surface surface) {
        }
    }

    @C0359n0
    /* renamed from: a */
    public static CameraCaptureSession.StateCallback m4522a(@C0359n0 List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return m4524c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C1026a(list);
    }

    @C0359n0
    /* renamed from: b */
    public static CameraCaptureSession.StateCallback m4523b(@C0359n0 CameraCaptureSession.StateCallback... stateCallbackArr) {
        return m4522a(Arrays.asList(stateCallbackArr));
    }

    @C0359n0
    /* renamed from: c */
    public static CameraCaptureSession.StateCallback m4524c() {
        return new C1027b();
    }
}
