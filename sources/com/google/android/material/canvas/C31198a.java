package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.canvas.a */
public class C31198a {
    /* renamed from: a */
    public static int m125450a(@C0359n0 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    /* renamed from: b */
    public static int m125451b(@C0359n0 Canvas canvas, @C0363p0 RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }
}
