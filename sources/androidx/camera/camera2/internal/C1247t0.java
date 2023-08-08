package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.camera2.interop.C1296o;
import androidx.camera.camera2.interop.C1298p;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1583y;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.internal.t0 */
public class C1247t0 {

    /* renamed from: a */
    public static final String f3566a = "CaptureRequestBuilder";

    @C0335b(markerClass = C1298p.class)
    /* renamed from: a */
    public static void m5145a(CaptureRequest.Builder builder, Config config) {
        C1296o d = C1296o.C1297a.m5319f(config).mo4098g();
        for (Config.C1421a next : d.mo5129f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) next.mo5134d();
            try {
                builder.set(key, d.mo5125b(next));
            } catch (IllegalArgumentException unused) {
                C1417i2.m5913c(f3566a, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    @C0363p0
    /* renamed from: b */
    public static CaptureRequest m5146b(@C0359n0 C1583y yVar, @C0363p0 CameraDevice cameraDevice, @C0359n0 Map<DeferrableSurface, Surface> map) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d = m5148d(yVar.mo5549d(), map);
        if (d.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(yVar.mo5551f());
        m5145a(createCaptureRequest, yVar.mo5548c());
        Config c = yVar.mo5548c();
        Config.C1421a<Integer> aVar = C1583y.f4496g;
        if (c.mo5126c(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) yVar.mo5548c().mo5125b(aVar));
        }
        Config c2 = yVar.mo5548c();
        Config.C1421a<Integer> aVar2 = C1583y.f4497h;
        if (c2.mo5126c(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) yVar.mo5548c().mo5125b(aVar2)).byteValue()));
        }
        for (Surface addTarget : d) {
            createCaptureRequest.addTarget(addTarget);
        }
        createCaptureRequest.setTag(yVar.mo5550e());
        return createCaptureRequest.build();
    }

    @C0363p0
    /* renamed from: c */
    public static CaptureRequest m5147c(@C0359n0 C1583y yVar, @C0363p0 CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(yVar.mo5551f());
        m5145a(createCaptureRequest, yVar.mo5548c());
        return createCaptureRequest.build();
    }

    @C0359n0
    /* renamed from: d */
    public static List<Surface> m5148d(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Surface surface = map.get(deferrableSurface);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
