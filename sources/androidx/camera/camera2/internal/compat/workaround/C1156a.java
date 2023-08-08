package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.camera2.internal.compat.quirk.C1133a;
import androidx.camera.core.impl.C1450f1;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.a */
public class C1156a {
    @C0363p0

    /* renamed from: a */
    public final Range<Integer> f3366a;

    public C1156a(@C0359n0 C1450f1 f1Var) {
        C1133a aVar = (C1133a) f1Var.mo5220b(C1133a.class);
        if (aVar == null) {
            this.f3366a = null;
        } else {
            this.f3366a = aVar.mo4430b();
        }
    }

    /* renamed from: a */
    public void mo4440a(@C0359n0 C1004b.C1005a aVar) {
        Range<Integer> range = this.f3366a;
        if (range != null) {
            aVar.mo4096e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
