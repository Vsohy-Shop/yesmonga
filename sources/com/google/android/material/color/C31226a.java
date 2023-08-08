package com.google.android.material.color;

/* renamed from: com.google.android.material.color.a */
public final class C31226a {

    /* renamed from: a */
    public static final float f75139a = 15.0f;

    /* renamed from: b */
    public static final float f75140b = 0.5f;

    /* renamed from: a */
    public static int m125793a(int i, int i2, float f) {
        C31227b b = C31227b.m125797b(i);
        C31227b b2 = C31227b.m125797b(i2);
        float n = b.mo89177n();
        float h = b.mo89171h();
        float i3 = b.mo89172i();
        return C31227b.m125801f(n + ((b2.mo89177n() - n) * f), h + ((b2.mo89171h() - h) * f), i3 + ((b2.mo89172i() - i3) * f)).mo89175l();
    }

    /* renamed from: b */
    public static int m125794b(int i, int i2, float f) {
        return C31265r.m125938b(C31227b.m125797b(m125793a(i, i2, f)).mo89174k(), C31227b.m125797b(i).mo89173j(), C31247k.m125875l(i)).mo89240m();
    }

    /* renamed from: c */
    public static int m125795c(int i, int i2) {
        C31265r c = C31265r.m125939c(i);
        C31265r c2 = C31265r.m125939c(i2);
        return C31265r.m125938b(C31267t.m125968d(c.mo89234g() + (Math.min(C31267t.m125966b(c.mo89234g(), c2.mo89234g()) * 0.5f, 15.0f) * m125796d(c.mo89234g(), c2.mo89234g()))), c.mo89233f(), c.mo89235h()).mo89240m();
    }

    /* renamed from: d */
    public static float m125796d(float f, float f2) {
        float f3 = f2 - f;
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        float abs3 = Math.abs(f5);
        if (abs > abs2 || abs > abs3) {
            if (abs2 > abs || abs2 > abs3) {
                if (((double) f5) >= 0.0d) {
                    return 1.0f;
                }
                return -1.0f;
            } else if (((double) f4) >= 0.0d) {
                return 1.0f;
            } else {
                return -1.0f;
            }
        } else if (((double) f3) >= 0.0d) {
            return 1.0f;
        } else {
            return -1.0f;
        }
    }
}
