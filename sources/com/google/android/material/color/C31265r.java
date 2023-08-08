package com.google.android.material.color;

/* renamed from: com.google.android.material.color.r */
public final class C31265r {

    /* renamed from: d */
    public static final float f75257d = 0.4f;

    /* renamed from: e */
    public static final float f75258e = 1.0f;

    /* renamed from: f */
    public static final float f75259f = 0.2f;

    /* renamed from: g */
    public static final float f75260g = 1.0E-9f;

    /* renamed from: h */
    public static final float f75261h = 0.01f;

    /* renamed from: a */
    public float f75262a;

    /* renamed from: b */
    public float f75263b;

    /* renamed from: c */
    public float f75264c;

    public C31265r(float f, float f2, float f3) {
        mo89238k(m125940d(f, f2, f3));
    }

    /* renamed from: a */
    public static C31227b m125937a(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C31227b bVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int l = C31227b.m125799d(f8, f2, f).mo89175l();
            float l2 = C31247k.m125875l(l);
            float abs = Math.abs(f3 - l2);
            if (abs < 0.2f) {
                C31227b b = C31227b.m125797b(l);
                float a = b.mo89170a(C31227b.m125799d(b.mo89176m(), b.mo89173j(), f));
                if (a <= 1.0f && a <= f5) {
                    bVar = b;
                    f7 = abs;
                    f5 = a;
                }
            }
            if (f7 == 0.0f && f5 < 1.0E-9f) {
                break;
            } else if (l2 < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public static C31265r m125938b(float f, float f2, float f3) {
        return new C31265r(f, f2, f3);
    }

    /* renamed from: c */
    public static C31265r m125939c(int i) {
        C31227b b = C31227b.m125797b(i);
        return new C31265r(b.mo89174k(), b.mo89173j(), C31247k.m125875l(i));
    }

    /* renamed from: d */
    public static int m125940d(float f, float f2, float f3) {
        return m125941e(f, f2, f3, C31269v.f75278k);
    }

    /* renamed from: e */
    public static int m125941e(float f, float f2, float f3, C31269v vVar) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C31247k.m125869f(f3);
        }
        float d = C31267t.m125968d(f);
        C31227b bVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            C31227b a = m125937a(d, f5, f3);
            if (!z) {
                if (a == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    bVar = a;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else if (a != null) {
                return a.mo89181r(vVar);
            } else {
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        if (bVar == null) {
            return C31247k.m125869f(f3);
        }
        return bVar.mo89181r(vVar);
    }

    /* renamed from: f */
    public float mo89233f() {
        return this.f75263b;
    }

    /* renamed from: g */
    public float mo89234g() {
        return this.f75262a;
    }

    /* renamed from: h */
    public float mo89235h() {
        return this.f75264c;
    }

    /* renamed from: i */
    public void mo89236i(float f) {
        mo89238k(m125940d(this.f75262a, f, this.f75264c));
    }

    /* renamed from: j */
    public void mo89237j(float f) {
        mo89238k(m125940d(C31267t.m125968d(f), this.f75263b, this.f75264c));
    }

    /* renamed from: k */
    public final void mo89238k(int i) {
        C31227b b = C31227b.m125797b(i);
        float l = C31247k.m125875l(i);
        this.f75262a = b.mo89174k();
        this.f75263b = b.mo89173j();
        this.f75264c = l;
    }

    /* renamed from: l */
    public void mo89239l(float f) {
        mo89238k(m125940d(this.f75262a, this.f75263b, f));
    }

    /* renamed from: m */
    public int mo89240m() {
        return m125940d(this.f75262a, this.f75263b, this.f75264c);
    }
}
