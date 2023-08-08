package androidx.camera.camera2.internal;

import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* renamed from: androidx.camera.camera2.internal.e1 */
public final class C1172e1 {
    @C0359n0
    /* renamed from: a */
    public static CameraUnavailableException m4889a(@C0359n0 CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int d = cameraAccessExceptionCompat.mo4283d();
        int i = 1;
        if (d != 1) {
            i = 2;
            if (d != 2) {
                i = 3;
                if (d != 3) {
                    i = 4;
                    if (d != 4) {
                        i = 5;
                        if (d != 5) {
                            if (d != 10001) {
                                i = 0;
                            } else {
                                i = 6;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i, (Throwable) cameraAccessExceptionCompat);
    }
}
