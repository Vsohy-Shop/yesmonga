package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.animation.b */
public final class C18117b {

    @C0376v0(21)
    /* renamed from: androidx.core.view.animation.b$a */
    public static class C18118a {
        @C0373u
        /* renamed from: a */
        public static PathInterpolator m82267a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @C0373u
        /* renamed from: b */
        public static PathInterpolator m82268b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @C0373u
        /* renamed from: c */
        public static PathInterpolator m82269c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Interpolator m82264a(float f, float f2) {
        return C18118a.m82267a(f, f2);
    }

    @C0359n0
    /* renamed from: b */
    public static Interpolator m82265b(float f, float f2, float f3, float f4) {
        return C18118a.m82268b(f, f2, f3, f4);
    }

    @C0359n0
    /* renamed from: c */
    public static Interpolator m82266c(@C0359n0 Path path) {
        return C18118a.m82269c(path);
    }
}
