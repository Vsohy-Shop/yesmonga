package com.google.android.material.transition.platform;

import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.b */
public class C31773b {

    /* renamed from: a */
    public static final C31772a f77442a = new C31774a();

    /* renamed from: b */
    public static final C31772a f77443b = new C31775b();

    /* renamed from: c */
    public static final C31772a f77444c = new C31776c();

    /* renamed from: d */
    public static final C31772a f77445d = new C31777d();

    /* renamed from: com.google.android.material.transition.platform.b$a */
    public class C31774a implements C31772a {
        /* renamed from: a */
        public C31778c mo92178a(float f, float f2, float f3, float f4) {
            return C31778c.m128898a(255, C31823v.m129122n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.b$b */
    public class C31775b implements C31772a {
        /* renamed from: a */
        public C31778c mo92178a(float f, float f2, float f3, float f4) {
            return C31778c.m128899b(C31823v.m129122n(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.b$c */
    public class C31776c implements C31772a {
        /* renamed from: a */
        public C31778c mo92178a(float f, float f2, float f3, float f4) {
            return C31778c.m128899b(C31823v.m129122n(255, 0, f2, f3, f), C31823v.m129122n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.b$d */
    public class C31777d implements C31772a {
        /* renamed from: a */
        public C31778c mo92178a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C31778c.m128899b(C31823v.m129122n(255, 0, f2, f5, f), C31823v.m129122n(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static C31772a m128893a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f77444c;
                }
                if (i == 3) {
                    return f77445d;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return f77443b;
            } else {
                return f77442a;
            }
        } else if (z) {
            return f77442a;
        } else {
            return f77443b;
        }
    }
}
