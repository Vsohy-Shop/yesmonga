package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.animation.g */
public class C31099g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f74435a = new float[9];

    /* renamed from: b */
    public final float[] f74436b = new float[9];

    /* renamed from: c */
    public final Matrix f74437c = new Matrix();

    @C0359n0
    /* renamed from: a */
    public Matrix evaluate(float f, @C0359n0 Matrix matrix, @C0359n0 Matrix matrix2) {
        matrix.getValues(this.f74435a);
        matrix2.getValues(this.f74436b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f74436b;
            float f2 = fArr[i];
            float f3 = this.f74435a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f74437c.setValues(this.f74436b);
        return this.f74437c;
    }
}
