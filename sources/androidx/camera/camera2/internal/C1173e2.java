package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.C1417i2;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1503s0;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: androidx.camera.camera2.internal.e2 */
public class C1173e2 {

    /* renamed from: c */
    public static final String f3382c = "MeteringRepeating";

    /* renamed from: a */
    public DeferrableSurface f3383a;
    @C0359n0

    /* renamed from: b */
    public final SessionConfig f3384b;

    /* renamed from: androidx.camera.camera2.internal.e2$a */
    public class C1174a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ Surface f3385a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f3386b;

        public C1174a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f3385a = surface;
            this.f3386b = surfaceTexture;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            this.f3385a.release();
            this.f3386b.release();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.e2$b */
    public static class C1175b implements C1488o1<UseCase> {
        @C0359n0

        /* renamed from: v */
        public final Config f3388v;

        public C1175b() {
            C1586y0 d0 = C1586y0.m6573d0();
            d0.mo5545t(C1488o1.f4252m, new C1263w0());
            this.f3388v = d0;
        }

        @C0359n0
        /* renamed from: a */
        public Config mo4458a() {
            return this.f3388v;
        }
    }

    public C1173e2(@C0359n0 C1073h hVar) {
        C1175b bVar = new C1175b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size c = mo4454c(hVar);
        C1417i2.m5911a(f3382c, "MerteringSession SurfaceTexture size: " + c);
        surfaceTexture.setDefaultBufferSize(c.getWidth(), c.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.C1424b p = SessionConfig.C1424b.m6009p(bVar);
        p.mo5171t(1);
        C1503s0 s0Var = new C1503s0(surface);
        this.f3383a = s0Var;
        C1548f.m6473b(s0Var.mo5139f(), new C1174a(surface, surfaceTexture), C1525a.m6437a());
        p.mo5164l(this.f3383a);
        this.f3384b = p.mo5166n();
    }

    /* renamed from: b */
    public void mo4453b() {
        C1417i2.m5911a(f3382c, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f3383a;
        if (deferrableSurface != null) {
            deferrableSurface.mo5136c();
        }
        this.f3383a = null;
    }

    @C0359n0
    /* renamed from: c */
    public final Size mo4454c(@C0359n0 C1073h hVar) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) hVar.mo4323a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C1417i2.m5913c(f3382c, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes != null) {
            return (Size) Collections.min(Arrays.asList(outputSizes), new C1169d2());
        }
        C1417i2.m5913c(f3382c, "Can not get output size list.");
        return new Size(0, 0);
    }

    @C0359n0
    /* renamed from: d */
    public String mo4455d() {
        return f3382c;
    }

    @C0359n0
    /* renamed from: e */
    public SessionConfig mo4456e() {
        return this.f3384b;
    }
}
