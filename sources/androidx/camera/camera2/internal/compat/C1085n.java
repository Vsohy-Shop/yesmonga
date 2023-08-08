package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.core.util.C18001r;

@C0376v0(28)
/* renamed from: androidx.camera.camera2.internal.compat.n */
public class C1085n extends C1082k {
    public C1085n(@C0359n0 CameraDevice cameraDevice) {
        super((CameraDevice) C18001r.m81775l(cameraDevice), (Object) null);
    }

    /* renamed from: b */
    public void mo4328b(@C0359n0 C1122z zVar) throws CameraAccessException {
        SessionConfiguration a = C1083l.m4670a(zVar.mo4396k());
        C18001r.m81775l(a);
        this.f3301a.createCaptureSession(a);
    }
}
