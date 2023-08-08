package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.C1048a;
import androidx.camera.camera2.internal.compat.C1086o;
import androidx.camera.camera2.internal.compat.params.C1089a;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.core.util.C18001r;
import java.util.List;

@C0376v0(23)
/* renamed from: androidx.camera.camera2.internal.compat.j */
public class C1081j extends C1086o {
    public C1081j(@C0359n0 CameraDevice cameraDevice, @C0363p0 Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: h */
    public static C1081j m4666h(@C0359n0 CameraDevice cameraDevice, @C0359n0 Handler handler) {
        return new C1081j(cameraDevice, new C1086o.C1087a(handler));
    }

    /* renamed from: b */
    public void mo4328b(@C0359n0 C1122z zVar) throws CameraAccessException {
        C1086o.m4674d(this.f3301a, zVar);
        C1048a.C1058c cVar = new C1048a.C1058c(zVar.mo4386a(), zVar.mo4392f());
        List<Surface> g = C1086o.m4676g(zVar.mo4388c());
        Handler handler = ((C1086o.C1087a) C18001r.m81775l((C1086o.C1087a) this.f3302b)).f3303a;
        C1089a b = zVar.mo4387b();
        if (b != null) {
            InputConfiguration inputConfiguration = (InputConfiguration) b.mo4341d();
            C18001r.m81775l(inputConfiguration);
            this.f3301a.createReprocessableCaptureSession(inputConfiguration, g, cVar, handler);
        } else if (zVar.mo4390e() == 1) {
            this.f3301a.createConstrainedHighSpeedCaptureSession(g, cVar, handler);
        } else {
            mo4337f(this.f3301a, g, cVar, handler);
        }
    }
}
