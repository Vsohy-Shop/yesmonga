package com.google.android.material.transition;

import android.graphics.RectF;

/* renamed from: com.google.android.material.transition.g */
public class C31749g {

    /* renamed from: a */
    public static final C31748f f77311a = new C31750a();

    /* renamed from: b */
    public static final C31748f f77312b = new C31751b();

    /* renamed from: com.google.android.material.transition.g$a */
    public class C31750a implements C31748f {
        /* renamed from: a */
        public C31752h mo92090a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = C31837u.m129197m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new C31752h(f8, f9, m, f5 * f8, m, f7 * f9);
        }

        /* renamed from: b */
        public boolean mo92091b(C31752h hVar) {
            return hVar.f77316d > hVar.f77318f;
        }

        /* renamed from: c */
        public void mo92092c(RectF rectF, float f, C31752h hVar) {
            rectF.bottom -= Math.abs(hVar.f77318f - hVar.f77316d) * f;
        }
    }

    /* renamed from: com.google.android.material.transition.g$b */
    public class C31751b implements C31748f {
        /* renamed from: a */
        public C31752h mo92090a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = C31837u.m129197m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new C31752h(f8, f9, f4 * f8, m, f6 * f9, m);
        }

        /* renamed from: b */
        public boolean mo92091b(C31752h hVar) {
            return hVar.f77315c > hVar.f77317e;
        }

        /* renamed from: c */
        public void mo92092c(RectF rectF, float f, C31752h hVar) {
            float abs = (Math.abs(hVar.f77317e - hVar.f77315c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static C31748f m128735a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i == 1) {
                return f77311a;
            }
            if (i == 2) {
                return f77312b;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i);
        } else if (m128736b(z, rectF, rectF2)) {
            return f77311a;
        } else {
            return f77312b;
        }
    }

    /* renamed from: b */
    public static boolean m128736b(boolean z, RectF rectF, RectF rectF2) {
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
