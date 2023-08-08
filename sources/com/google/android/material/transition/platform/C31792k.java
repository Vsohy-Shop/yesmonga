package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.k */
public final class C31792k extends PathMotion {
    /* renamed from: a */
    public static PointF m128925a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @C0359n0
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF a = m128925a(f, f2, f3, f4);
        path.quadTo(a.x, a.y, f3, f4);
        return path;
    }
}
