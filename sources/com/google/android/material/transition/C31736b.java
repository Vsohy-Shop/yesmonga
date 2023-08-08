package com.google.android.material.transition;

/* renamed from: com.google.android.material.transition.b */
public class C31736b {

    /* renamed from: a */
    public static final C31735a f77287a = new C31737a();

    /* renamed from: b */
    public static final C31735a f77288b = new C31738b();

    /* renamed from: c */
    public static final C31735a f77289c = new C31739c();

    /* renamed from: d */
    public static final C31735a f77290d = new C31740d();

    /* renamed from: com.google.android.material.transition.b$a */
    public class C31737a implements C31735a {
        /* renamed from: a */
        public C31741c mo92079a(float f, float f2, float f3, float f4) {
            return C31741c.m128720a(255, C31837u.m129198n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.google.android.material.transition.b$b */
    public class C31738b implements C31735a {
        /* renamed from: a */
        public C31741c mo92079a(float f, float f2, float f3, float f4) {
            return C31741c.m128721b(C31837u.m129198n(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: com.google.android.material.transition.b$c */
    public class C31739c implements C31735a {
        /* renamed from: a */
        public C31741c mo92079a(float f, float f2, float f3, float f4) {
            return C31741c.m128721b(C31837u.m129198n(255, 0, f2, f3, f), C31837u.m129198n(0, 255, f2, f3, f));
        }
    }

    /* renamed from: com.google.android.material.transition.b$d */
    public class C31740d implements C31735a {
        /* renamed from: a */
        public C31741c mo92079a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C31741c.m128721b(C31837u.m129198n(255, 0, f2, f5, f), C31837u.m129198n(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static C31735a m128715a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f77289c;
                }
                if (i == 3) {
                    return f77290d;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return f77288b;
            } else {
                return f77287a;
            }
        } else if (z) {
            return f77287a;
        } else {
            return f77288b;
        }
    }
}
