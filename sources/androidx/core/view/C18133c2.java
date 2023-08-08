package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.c2 */
public final class C18133c2 {

    @C0376v0(19)
    /* renamed from: androidx.core.view.c2$a */
    public static class C18134a {
        @C0373u
        /* renamed from: a */
        public static boolean m82304a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @C0373u
        /* renamed from: b */
        public static void m82305b(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    /* renamed from: a */
    public static boolean m82300a(@C0359n0 ScaleGestureDetector scaleGestureDetector) {
        return C18134a.m82304a(scaleGestureDetector);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m82301b(Object obj) {
        return m82300a((ScaleGestureDetector) obj);
    }

    /* renamed from: c */
    public static void m82302c(@C0359n0 ScaleGestureDetector scaleGestureDetector, boolean z) {
        C18134a.m82305b(scaleGestureDetector, z);
    }

    @Deprecated
    /* renamed from: d */
    public static void m82303d(Object obj, boolean z) {
        m82302c((ScaleGestureDetector) obj, z);
    }
}
