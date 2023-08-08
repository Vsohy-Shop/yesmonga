package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.c1 */
public final class C1042c1 {

    /* renamed from: androidx.camera.camera2.internal.c1$a */
    public static final class C1043a extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final List<CameraDevice.StateCallback> f3220a = new ArrayList();

        public C1043a(@C0359n0 List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback next : list) {
                if (!(next instanceof C1044b)) {
                    this.f3220a.add(next);
                }
            }
        }

        public void onClosed(@C0359n0 CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onClosed : this.f3220a) {
                onClosed.onClosed(cameraDevice);
            }
        }

        public void onDisconnected(@C0359n0 CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onDisconnected : this.f3220a) {
                onDisconnected.onDisconnected(cameraDevice);
            }
        }

        public void onError(@C0359n0 CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback onError : this.f3220a) {
                onError.onError(cameraDevice, i);
            }
        }

        public void onOpened(@C0359n0 CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onOpened : this.f3220a) {
                onOpened.onOpened(cameraDevice);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.c1$b */
    public static final class C1044b extends CameraDevice.StateCallback {
        public void onClosed(@C0359n0 CameraDevice cameraDevice) {
        }

        public void onDisconnected(@C0359n0 CameraDevice cameraDevice) {
        }

        public void onError(@C0359n0 CameraDevice cameraDevice, int i) {
        }

        public void onOpened(@C0359n0 CameraDevice cameraDevice) {
        }
    }

    @C0359n0
    /* renamed from: a */
    public static CameraDevice.StateCallback m4621a(@C0359n0 List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m4623c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C1043a(list);
    }

    @C0359n0
    /* renamed from: b */
    public static CameraDevice.StateCallback m4622b(@C0359n0 CameraDevice.StateCallback... stateCallbackArr) {
        return m4621a(Arrays.asList(stateCallbackArr));
    }

    @C0359n0
    /* renamed from: c */
    public static CameraDevice.StateCallback m4623c() {
        return new C1044b();
    }
}
