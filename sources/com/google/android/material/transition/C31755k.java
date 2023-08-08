package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0359n0;
import androidx.transition.C20684x;

/* renamed from: com.google.android.material.transition.k */
public final class C31755k extends C20684x {
    /* renamed from: b */
    public static PointF m128749b(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @C0359n0
    /* renamed from: a */
    public Path mo61606a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF b = m128749b(f, f2, f3, f4);
        path.quadTo(b.x, b.y, f3, f4);
        return path;
    }
}
