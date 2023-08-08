package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.b */
public class C1134b implements C1447e1 {
    /* renamed from: b */
    public static boolean m4830b(@C0359n0 C1073h hVar) {
        Integer num = (Integer) hVar.mo4323a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            return false;
        }
        num.intValue();
        return false;
    }

    /* renamed from: a */
    public int mo4432a() {
        return 2;
    }
}
