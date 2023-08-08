package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: androidx.core.graphics.u0 */
public final class C17645u0 {

    @C0376v0(26)
    /* renamed from: androidx.core.graphics.u0$a */
    public static class C17646a {
        @C0373u
        /* renamed from: a */
        public static float[] m80764a(Path path, float f) {
            return path.approximate(f);
        }
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: a */
    public static Collection<C17639s0> m80762a(@C0359n0 Path path) {
        return m80763b(path, 0.5f);
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: b */
    public static Collection<C17639s0> m80763b(@C0359n0 Path path, @C0379x(from = 0.0d) float f) {
        float[] a = C17646a.m80764a(path, f);
        int length = a.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = a[i2];
            float f3 = a[i2 + 1];
            float f4 = a[i2 + 2];
            float f5 = a[i3];
            float f6 = a[i3 + 1];
            float f7 = a[i3 + 2];
            if (!(f2 == f5 || (f3 == f6 && f4 == f7))) {
                arrayList.add(new C17639s0(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
