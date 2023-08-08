package androidx.camera.core;

import android.view.Display;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1496q;

/* renamed from: androidx.camera.core.d0 */
public final class C1382d0 extends C1654n2 {

    /* renamed from: b */
    public final float f4014b;

    /* renamed from: c */
    public final float f4015c;
    @C0359n0

    /* renamed from: d */
    public final Display f4016d;
    @C0359n0

    /* renamed from: e */
    public final C1641m f4017e;

    public C1382d0(@C0359n0 Display display, @C0359n0 C1641m mVar, float f, float f2) {
        this.f4014b = f;
        this.f4015c = f2;
        this.f4016d = display;
        this.f4017e = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    @androidx.annotation.C0359n0
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF mo5078a(float r9, float r10) {
        /*
            r8 = this;
            float r0 = r8.f4014b
            float r1 = r8.f4015c
            java.lang.Integer r2 = r8.mo5079e()
            if (r2 == 0) goto L_0x0012
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            int r3 = r8.mo5080f(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L_0x0026
            if (r3 != r4) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            r6 = r10
            r10 = r9
            r9 = r6
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0026:
            if (r3 == r5) goto L_0x0034
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L_0x0032
            if (r3 == r4) goto L_0x002f
            goto L_0x0036
        L_0x002f:
            float r10 = r1 - r10
            goto L_0x0036
        L_0x0032:
            float r10 = r1 - r10
        L_0x0034:
            float r9 = r0 - r9
        L_0x0036:
            if (r2 == 0) goto L_0x003a
            float r10 = r1 - r10
        L_0x003a:
            float r10 = r10 / r1
            float r9 = r9 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1382d0.mo5078a(float, float):android.graphics.PointF");
    }

    @C0363p0
    /* renamed from: e */
    public final Integer mo5079e() {
        C1641m mVar = this.f4017e;
        if (mVar instanceof C1496q) {
            return ((C1496q) mVar).mo4594d();
        }
        return null;
    }

    /* renamed from: f */
    public final int mo5080f(boolean z) {
        try {
            int k = this.f4017e.mo4601k(this.f4016d.getRotation());
            if (z) {
                return (360 - k) % 360;
            }
            return k;
        } catch (Exception unused) {
            return 0;
        }
    }
}
