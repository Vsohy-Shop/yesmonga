package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.annotation.C0323b0;
import androidx.annotation.C0328d;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1654n2;
import androidx.camera.core.impl.utils.C1566j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.camera.view.v */
public class C1824v extends C1654n2 {

    /* renamed from: d */
    public static final PointF f5012d = new PointF(2.0f, 2.0f);
    @C0359n0

    /* renamed from: b */
    public final C1811o f5013b;
    @C0363p0
    @C0323b0("this")

    /* renamed from: c */
    public Matrix f5014c;

    public C1824v(@C0359n0 C1811o oVar) {
        this.f5013b = oVar;
    }

    @C0328d
    @C0359n0
    /* renamed from: a */
    public PointF mo5078a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.f5014c;
            if (matrix == null) {
                PointF pointF = f5012d;
                return pointF;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    @C0341g1
    /* renamed from: e */
    public void mo6000e(@C0359n0 Size size, int i) {
        C1566j.m6506b();
        synchronized (this) {
            if (size.getWidth() != 0) {
                if (size.getHeight() != 0) {
                    this.f5014c = this.f5013b.mo5963d(size, i);
                    return;
                }
            }
            this.f5014c = null;
        }
    }
}
