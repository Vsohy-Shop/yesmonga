package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.C1451g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.h1 */
public final class C1189h1 {
    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m4977a(C1448f fVar) {
        if (fVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m4978b(fVar, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return C1233r0.m5097a(arrayList);
    }

    /* renamed from: b */
    public static void m4978b(C1448f fVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (fVar instanceof C1451g.C1452a) {
            for (C1448f b : ((C1451g.C1452a) fVar).mo5221d()) {
                m4978b(b, list);
            }
        } else if (fVar instanceof C1184g1) {
            list.add(((C1184g1) fVar).mo4510e());
        } else {
            list.add(new C1178f1(fVar));
        }
    }
}
