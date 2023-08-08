package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.animation.f */
public class C31098f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f74434a = new Matrix();

    public C31098f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @C0359n0
    /* renamed from: a */
    public Matrix get(@C0359n0 ImageView imageView) {
        this.f74434a.set(imageView.getImageMatrix());
        return this.f74434a;
    }

    /* renamed from: b */
    public void set(@C0359n0 ImageView imageView, @C0359n0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
