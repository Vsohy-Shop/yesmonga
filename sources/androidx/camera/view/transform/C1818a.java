package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.view.C1803j0;
import androidx.camera.view.C1805k0;
import androidx.core.util.C18001r;

@C1803j0
/* renamed from: androidx.camera.view.transform.a */
public final class C1818a {

    /* renamed from: b */
    public static final String f5000b = "CoordinateTransform";

    /* renamed from: c */
    public static final String f5001c = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.";

    /* renamed from: a */
    public final Matrix f5002a;

    public C1818a(@C0359n0 C1821d dVar, @C0359n0 C1821d dVar2) {
        if (!C1805k0.m7199f(dVar.mo5996b(), false, dVar2.mo5996b(), false)) {
            C1417i2.m5924n(f5000b, String.format(f5001c, new Object[]{dVar.mo5996b(), dVar2.mo5996b()}));
        }
        Matrix matrix = new Matrix();
        this.f5002a = matrix;
        C18001r.m81778o(dVar.mo5995a().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(dVar2.mo5995a());
    }

    /* renamed from: a */
    public void mo5979a(@C0359n0 PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        this.f5002a.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    /* renamed from: b */
    public void mo5980b(@C0359n0 float[] fArr) {
        this.f5002a.mapPoints(fArr);
    }

    /* renamed from: c */
    public void mo5981c(@C0359n0 RectF rectF) {
        this.f5002a.mapRect(rectF);
    }

    /* renamed from: d */
    public void mo5982d(@C0359n0 Matrix matrix) {
        matrix.set(this.f5002a);
    }
}
