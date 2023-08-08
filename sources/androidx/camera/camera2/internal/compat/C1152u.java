package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import java.util.concurrent.Executor;

@C0376v0(29)
/* renamed from: androidx.camera.camera2.internal.compat.u */
public class C1152u extends C1151t {
    public C1152u(@C0359n0 Context context) {
        super(context);
    }

    @C0359n0
    /* renamed from: c */
    public CameraCharacteristics mo4425c(@C0359n0 String str) throws CameraAccessExceptionCompat {
        try {
            return this.f3362a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        }
    }

    @C0380x0("android.permission.CAMERA")
    /* renamed from: d */
    public void mo4426d(@C0359n0 String str, @C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f3362a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        }
    }
}
