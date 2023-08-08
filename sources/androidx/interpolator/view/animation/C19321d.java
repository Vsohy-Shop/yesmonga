package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* renamed from: androidx.interpolator.view.animation.d */
public abstract class C19321d implements Interpolator {

    /* renamed from: a */
    public final float[] f49633a;

    /* renamed from: b */
    public final float f49634b;

    public C19321d(float[] fArr) {
        this.f49633a = fArr;
        this.f49634b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f49633a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f49634b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f49633a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
