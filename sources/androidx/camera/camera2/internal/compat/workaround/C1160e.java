package androidx.camera.camera2.internal.compat.workaround;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.compat.quirk.C1138f;
import androidx.camera.camera2.internal.compat.quirk.C1141i;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.e */
public class C1160e {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo4443a(int i, @C0359n0 C1004b.C1005a aVar) {
        if (((C1141i) C1138f.m4835a(C1141i.class)) != null) {
            if (i == 0) {
                aVar.mo4096e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i == 1) {
                aVar.mo4096e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
