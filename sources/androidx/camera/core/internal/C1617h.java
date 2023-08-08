package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.C18001r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.internal.h */
public class C1617h {
    @C0359n0
    /* renamed from: a */
    public static Map<UseCase, Rect> m6648a(@C0359n0 Rect rect, boolean z, @C0359n0 Rational rational, @C0337f0(from = 0, mo995to = 359) int i, int i2, int i3, @C0359n0 Map<UseCase, Size> map) {
        boolean z2;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C18001r.m81765b(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry next : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) ((Size) next.getValue()).getWidth(), (float) ((Size) next.getValue()).getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put((UseCase) next.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g = m6654g(rectF2, ImageUtil.m6663c(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry : hashMap.entrySet()) {
            ((Matrix) entry.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((UseCase) entry.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static RectF m6649b(boolean z, @C0337f0(from = 0, mo995to = 359) int i, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (i != 0 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i != 90 || !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            return rectF2;
        }
        if (i != 0 || !z) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i != 270 || z) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 || z5) {
            return m6650c(rectF2, rectF.centerX());
        }
        if (i != 90 || z) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i != 180 || !z) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z6 || z7) {
            return m6651d(rectF2, rectF.centerY());
        }
        if (i != 180 || z) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (i != 270 || !z) {
            z9 = false;
        }
        if (z8 || z9) {
            return m6650c(m6651d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
    }

    /* renamed from: c */
    public static RectF m6650c(RectF rectF, float f) {
        return new RectF(m6652e(rectF.right, f), rectF.top, m6652e(rectF.left, f), rectF.bottom);
    }

    /* renamed from: d */
    public static RectF m6651d(RectF rectF, float f) {
        return new RectF(rectF.left, m6653f(rectF.bottom, f), rectF.right, m6653f(rectF.top, f));
    }

    /* renamed from: e */
    public static float m6652e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    public static float m6653f(float f, float f2) {
        return (f2 + f2) - f;
    }

    @SuppressLint({"SwitchIntDef"})
    @C0359n0
    /* renamed from: g */
    public static RectF m6654g(@C0359n0 RectF rectF, @C0359n0 Rational rational, int i, boolean z, int i2, @C0337f0(from = 0, mo995to = 359) int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) rational.getNumerator(), (float) rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else if (i == 2) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        } else {
            throw new IllegalStateException("Unexpected scale type: " + i);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m6649b(m6655h(z, i2), i3, rectF, rectF3);
    }

    /* renamed from: h */
    public static boolean m6655h(boolean z, int i) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        return z ^ z2;
    }
}
