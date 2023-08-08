package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.C1048a;
import androidx.camera.camera2.internal.compat.C1086o;
import androidx.camera.camera2.internal.compat.params.C1089a;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.core.util.C18001r;
import java.util.List;

@C0376v0(24)
/* renamed from: androidx.camera.camera2.internal.compat.k */
public class C1082k extends C1081j {
    public C1082k(@C0359n0 CameraDevice cameraDevice, @C0363p0 Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: i */
    public static C1082k m4668i(@C0359n0 CameraDevice cameraDevice, @C0359n0 Handler handler) {
        return new C1082k(cameraDevice, new C1086o.C1087a(handler));
    }

    /* renamed from: b */
    public void mo4328b(@C0359n0 C1122z zVar) throws CameraAccessException {
        C1086o.m4674d(this.f3301a, zVar);
        C1048a.C1058c cVar = new C1048a.C1058c(zVar.mo4386a(), zVar.mo4392f());
        List<C1096d> c = zVar.mo4388c();
        Handler handler = ((C1086o.C1087a) C18001r.m81775l((C1086o.C1087a) this.f3302b)).f3303a;
        C1089a b = zVar.mo4387b();
        if (b != null) {
            InputConfiguration inputConfiguration = (InputConfiguration) b.mo4341d();
            C18001r.m81775l(inputConfiguration);
            this.f3301a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C1122z.m4770i(c), cVar, handler);
        } else if (zVar.mo4390e() == 1) {
            this.f3301a.createConstrainedHighSpeedCaptureSession(C1086o.m4676g(c), cVar, handler);
        } else {
            this.f3301a.createCaptureSessionByOutputConfigurations(C1122z.m4770i(c), cVar, handler);
        }
    }
}
