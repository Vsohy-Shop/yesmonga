package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.m */
public class C20638m implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f53229a;

    public C20638m(float[] fArr) {
        this.f53229a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f53229a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
