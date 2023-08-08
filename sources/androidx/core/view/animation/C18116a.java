package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: androidx.core.view.animation.a */
public class C18116a implements Interpolator {

    /* renamed from: c */
    public static final float f46716c = 0.002f;

    /* renamed from: a */
    public final float[] f46717a;

    /* renamed from: b */
    public final float[] f46718b;

    public C18116a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f46717a = new float[i];
        this.f46718b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f46717a[i2] = fArr[0];
            this.f46718b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    public static Path m82262a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    /* renamed from: b */
    public static Path m82263b(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f46717a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f46717a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f46717a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f46718b[i];
        }
        float[] fArr2 = this.f46718b;
        float f5 = fArr2[i];
        return f5 + (((f - f3) / f4) * (fArr2[length] - f5));
    }

    public C18116a(float f, float f2) {
        this(m82263b(f, f2));
    }

    public C18116a(float f, float f2, float f3, float f4) {
        this(m82262a(f, f2, f3, f4));
    }
}
