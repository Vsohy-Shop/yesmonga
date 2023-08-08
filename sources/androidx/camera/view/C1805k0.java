package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.camera.view.k0 */
public class C1805k0 {

    /* renamed from: a */
    public static final RectF f4963a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    @C0359n0
    /* renamed from: a */
    public static Matrix m7194a(int i, int i2, int i3) {
        Matrix matrix = new Matrix();
        float f = (float) i2;
        float f2 = (float) i3;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        RectF rectF2 = f4963a;
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        boolean z = true;
        switch (i) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
        }
        z = false;
        if (z) {
            rectF = new RectF(0.0f, 0.0f, f2, f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    @C0359n0
    /* renamed from: b */
    public static Matrix m7195b(@C0359n0 Rect rect) {
        return m7196c(new RectF(rect));
    }

    @C0359n0
    /* renamed from: c */
    public static Matrix m7196c(@C0359n0 RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f4963a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    @C0359n0
    /* renamed from: d */
    public static Matrix m7197d(@C0359n0 RectF rectF, @C0359n0 RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f4963a, Matrix.ScaleToFit.FILL);
        matrix.postRotate((float) i);
        matrix.postConcat(m7196c(rectF2));
        return matrix;
    }

    /* renamed from: e */
    public static boolean m7198e(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    /* renamed from: f */
    public static boolean m7199f(@C0359n0 Size size, boolean z, @C0359n0 Size size2, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z) {
            f = ((float) size.getWidth()) / ((float) size.getHeight());
            f2 = f;
        } else {
            f = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f2 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        if (z2) {
            f3 = ((float) size2.getWidth()) / ((float) size2.getHeight());
            f4 = f3;
        } else {
            float width = (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f);
            f3 = (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f);
            f4 = width;
        }
        if (f < f3 || f4 < f2) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static float m7200g(float f, float f2, float f3, float f4) {
        return Math.max(Math.max(f, f2), Math.max(f3, f4));
    }

    /* renamed from: h */
    public static float m7201h(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    @C0359n0
    /* renamed from: i */
    public static Size m7202i(@C0359n0 Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    @C0359n0
    /* renamed from: j */
    public static float[] m7203j(@C0359n0 RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    @C0359n0
    /* renamed from: k */
    public static float[] m7204k(@C0359n0 Size size) {
        return new float[]{0.0f, 0.0f, (float) size.getWidth(), 0.0f, (float) size.getWidth(), (float) size.getHeight(), 0.0f, (float) size.getHeight()};
    }

    /* renamed from: l */
    public static int m7205l(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i);
    }

    @C0359n0
    /* renamed from: m */
    public static RectF m7206m(@C0359n0 float[] fArr) {
        return new RectF(m7201h(fArr[0], fArr[2], fArr[4], fArr[6]), m7201h(fArr[1], fArr[3], fArr[5], fArr[7]), m7200g(fArr[0], fArr[2], fArr[4], fArr[6]), m7200g(fArr[1], fArr[3], fArr[5], fArr[7]));
    }
}
