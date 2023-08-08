package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.C1138f;
import androidx.camera.camera2.internal.compat.quirk.C1147o;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.g */
public class C1162g {

    /* renamed from: a */
    public final boolean f3368a;

    public C1162g() {
        boolean z;
        if (((C1147o) C1138f.m4835a(C1147o.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f3368a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4444a(@androidx.annotation.C0359n0 java.util.List<android.hardware.camera2.CaptureRequest> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f3368a
            r1 = 0
            if (r0 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x0008
            goto L_0x002c
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r3.next()
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 == r0) goto L_0x002a
            r0 = 3
            if (r4 != r0) goto L_0x000c
        L_0x002a:
            r3 = 1
            return r3
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.workaround.C1162g.mo4444a(java.util.List, boolean):boolean");
    }
}
