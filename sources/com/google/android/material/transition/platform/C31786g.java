package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.g */
public class C31786g {

    /* renamed from: a */
    public static final C31785f f77466a = new C31787a();

    /* renamed from: b */
    public static final C31785f f77467b = new C31788b();

    /* renamed from: com.google.android.material.transition.platform.g$a */
    public class C31787a implements C31785f {
        /* renamed from: a */
        public C31789h mo92189a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = C31823v.m129121m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new C31789h(f8, f9, m, f5 * f8, m, f7 * f9);
        }

        /* renamed from: b */
        public boolean mo92190b(C31789h hVar) {
            return hVar.f77471d > hVar.f77473f;
        }

        /* renamed from: c */
        public void mo92191c(RectF rectF, float f, C31789h hVar) {
            rectF.bottom -= Math.abs(hVar.f77473f - hVar.f77471d) * f;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.g$b */
    public class C31788b implements C31785f {
        /* renamed from: a */
        public C31789h mo92189a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = C31823v.m129121m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new C31789h(f8, f9, f4 * f8, m, f6 * f9, m);
        }

        /* renamed from: b */
        public boolean mo92190b(C31789h hVar) {
            return hVar.f77470c > hVar.f77472e;
        }

        /* renamed from: c */
        public void mo92191c(RectF rectF, float f, C31789h hVar) {
            float abs = (Math.abs(hVar.f77472e - hVar.f77470c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static C31785f m128913a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i == 1) {
                return f77466a;
            }
            if (i == 2) {
                return f77467b;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i);
        } else if (m128914b(z, rectF, rectF2)) {
            return f77466a;
        } else {
            return f77467b;
        }
    }

    /* renamed from: b */
    public static boolean m128914b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}
