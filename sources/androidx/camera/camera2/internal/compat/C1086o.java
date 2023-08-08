package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.C1048a;
import androidx.camera.camera2.internal.compat.C1074i;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.C1417i2;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.List;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.o */
public class C1086o implements C1074i.C1075a {

    /* renamed from: a */
    public final CameraDevice f3301a;

    /* renamed from: b */
    public final Object f3302b;

    /* renamed from: androidx.camera.camera2.internal.compat.o$a */
    public static class C1087a {

        /* renamed from: a */
        public final Handler f3303a;

        public C1087a(@C0359n0 Handler handler) {
            this.f3303a = handler;
        }
    }

    public C1086o(@C0359n0 CameraDevice cameraDevice, @C0363p0 Object obj) {
        this.f3301a = (CameraDevice) C18001r.m81775l(cameraDevice);
        this.f3302b = obj;
    }

    /* renamed from: c */
    public static void m4673c(CameraDevice cameraDevice, @C0359n0 List<C1096d> list) {
        String id = cameraDevice.getId();
        for (C1096d d : list) {
            String d2 = d.mo4358d();
            if (d2 != null && !d2.isEmpty()) {
                C1417i2.m5924n("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + d2 + ". Ignoring.");
            }
        }
    }

    /* renamed from: d */
    public static void m4674d(CameraDevice cameraDevice, C1122z zVar) {
        C18001r.m81775l(cameraDevice);
        C18001r.m81775l(zVar);
        C18001r.m81775l(zVar.mo4392f());
        List<C1096d> c = zVar.mo4388c();
        if (c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (zVar.mo4386a() != null) {
            m4673c(cameraDevice, c);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    /* renamed from: e */
    public static C1086o m4675e(@C0359n0 CameraDevice cameraDevice, @C0359n0 Handler handler) {
        return new C1086o(cameraDevice, new C1087a(handler));
    }

    /* renamed from: g */
    public static List<Surface> m4676g(@C0359n0 List<C1096d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1096d e : list) {
            arrayList.add(e.mo4359e());
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: a */
    public CameraDevice mo4327a() {
        return this.f3301a;
    }

    /* renamed from: b */
    public void mo4328b(@C0359n0 C1122z zVar) throws CameraAccessException {
        m4674d(this.f3301a, zVar);
        if (zVar.mo4387b() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (zVar.mo4390e() != 1) {
            C1048a.C1058c cVar = new C1048a.C1058c(zVar.mo4386a(), zVar.mo4392f());
            mo4337f(this.f3301a, m4676g(zVar.mo4388c()), cVar, ((C1087a) this.f3302b).f3303a);
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }

    /* renamed from: f */
    public void mo4337f(@C0359n0 CameraDevice cameraDevice, @C0359n0 List<Surface> list, @C0359n0 CameraCaptureSession.StateCallback stateCallback, @C0359n0 Handler handler) throws CameraAccessException {
        cameraDevice.createCaptureSession(list, stateCallback, handler);
    }
}
