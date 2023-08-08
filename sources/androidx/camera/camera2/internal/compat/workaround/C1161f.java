package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.compat.quirk.C1138f;
import androidx.camera.camera2.internal.compat.quirk.C1145m;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.f */
public class C1161f {
    /* renamed from: a */
    public static void m4879a(@C0359n0 SessionConfig.C1424b bVar) {
        if (((C1145m) C1138f.m4835a(C1145m.class)) != null) {
            C1004b.C1005a aVar = new C1004b.C1005a();
            aVar.mo4096e(CaptureRequest.TONEMAP_MODE, 2);
            bVar.mo5160h(aVar.mo4098g());
        }
    }
}
