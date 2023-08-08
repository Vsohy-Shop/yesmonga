package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.s */
public class C16711s implements C16710r {

    /* renamed from: p */
    public static final float f42073p = 1.0E-5f;

    /* renamed from: a */
    public float f42074a;

    /* renamed from: b */
    public float f42075b;

    /* renamed from: c */
    public float f42076c;

    /* renamed from: d */
    public float f42077d;

    /* renamed from: e */
    public float f42078e;

    /* renamed from: f */
    public float f42079f;

    /* renamed from: g */
    public float f42080g;

    /* renamed from: h */
    public float f42081h;

    /* renamed from: i */
    public float f42082i;

    /* renamed from: j */
    public int f42083j;

    /* renamed from: k */
    public String f42084k;

    /* renamed from: l */
    public boolean f42085l = false;

    /* renamed from: m */
    public float f42086m;

    /* renamed from: n */
    public float f42087n;

    /* renamed from: o */
    public boolean f42088o = false;

    /* renamed from: a */
    public float mo49083a() {
        return this.f42085l ? -mo49084b(this.f42087n) : mo49084b(this.f42087n);
    }

    /* renamed from: b */
    public float mo49084b(float f) {
        float f2 = this.f42077d;
        if (f <= f2) {
            float f3 = this.f42074a;
            return f3 + (((this.f42075b - f3) * f) / f2);
        }
        int i = this.f42083j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f42078e;
        if (f4 < f5) {
            float f6 = this.f42075b;
            return f6 + (((this.f42076c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f42081h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f42079f;
            if (f7 >= f8) {
                return this.f42082i;
            }
            float f9 = this.f42076c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: c */
    public String mo49085c(String str, float f) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ===== " + this.f42084k + "\n");
        sb.append(str);
        if (this.f42085l) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        sb.append(str2);
        sb.append(" time = ");
        sb.append(f);
        sb.append("  stages ");
        sb.append(this.f42083j);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f42077d + " vel " + this.f42074a + " pos " + this.f42080g + "\n";
        if (this.f42083j > 1) {
            str3 = str3 + str + " dur " + this.f42078e + " vel " + this.f42075b + " pos " + this.f42081h + "\n";
        }
        if (this.f42083j > 2) {
            str3 = str3 + str + " dur " + this.f42079f + " vel " + this.f42076c + " pos " + this.f42082i + "\n";
        }
        float f2 = this.f42077d;
        if (f <= f2) {
            return str3 + str + "stage 0\n";
        }
        int i = this.f42083j;
        if (i == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f3 = f - f2;
        float f4 = this.f42078e;
        if (f3 < f4) {
            return str3 + str + " stage 1\n";
        } else if (i == 2) {
            return str3 + str + "end stage 1\n";
        } else if (f3 - f4 < this.f42079f) {
            return str3 + str + " stage 2\n";
        } else {
            return str3 + str + " end stage 2\n";
        }
    }

    /* renamed from: d */
    public boolean mo49086d() {
        return mo49083a() < 1.0E-5f && Math.abs(this.f42082i - this.f42087n) < 1.0E-5f;
    }

    /* renamed from: e */
    public final float mo49092e(float f) {
        this.f42088o = false;
        float f2 = this.f42077d;
        if (f <= f2) {
            float f3 = this.f42074a;
            return (f3 * f) + ((((this.f42075b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f42083j;
        if (i == 1) {
            return this.f42080g;
        }
        float f4 = f - f2;
        float f5 = this.f42078e;
        if (f4 < f5) {
            float f6 = this.f42080g;
            float f7 = this.f42075b;
            return f6 + (f7 * f4) + ((((this.f42076c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f42081h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f42079f;
            if (f8 <= f9) {
                float f10 = this.f42081h;
                float f11 = this.f42076c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f42088o = true;
            return this.f42082i;
        }
    }

    /* renamed from: f */
    public void mo49093f(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z = false;
        this.f42088o = false;
        this.f42086m = f;
        if (f > f2) {
            z = true;
        }
        this.f42085l = z;
        if (z) {
            mo49094g(-f3, f - f2, f5, f6, f4);
            return;
        }
        mo49094g(f3, f2 - f, f5, f6, f4);
    }

    /* renamed from: g */
    public final void mo49094g(float f, float f2, float f3, float f4, float f5) {
        this.f42088o = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f42074a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f42084k = "backward accelerate, decelerate";
                this.f42083j = 2;
                this.f42074a = f;
                this.f42075b = sqrt;
                this.f42076c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f42077d = f8;
                this.f42078e = sqrt / f3;
                this.f42080g = ((f + sqrt) * f8) / 2.0f;
                this.f42081h = f2;
                this.f42082i = f2;
                return;
            }
            this.f42084k = "backward accelerate cruse decelerate";
            this.f42083j = 3;
            this.f42074a = f;
            this.f42075b = f4;
            this.f42076c = f4;
            float f9 = (f4 - f) / f3;
            this.f42077d = f9;
            float f10 = f4 / f3;
            this.f42079f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f42078e = ((f2 - f11) - f12) / f4;
            this.f42080g = f11;
            this.f42081h = f2 - f12;
            this.f42082i = f2;
        } else if (f7 >= f2) {
            this.f42084k = "hard stop";
            this.f42083j = 1;
            this.f42074a = f;
            this.f42075b = 0.0f;
            this.f42080g = f2;
            this.f42077d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f42084k = "cruse decelerate";
                this.f42083j = 2;
                this.f42074a = f;
                this.f42075b = f;
                this.f42076c = 0.0f;
                this.f42080g = f13;
                this.f42081h = f2;
                this.f42077d = f14;
                this.f42078e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f42077d = f15;
            float f16 = sqrt2 / f3;
            this.f42078e = f16;
            if (sqrt2 < f4) {
                this.f42084k = "accelerate decelerate";
                this.f42083j = 2;
                this.f42074a = f;
                this.f42075b = sqrt2;
                this.f42076c = 0.0f;
                this.f42077d = f15;
                this.f42078e = f16;
                this.f42080g = ((f + sqrt2) * f15) / 2.0f;
                this.f42081h = f2;
                return;
            }
            this.f42084k = "accelerate cruse decelerate";
            this.f42083j = 3;
            this.f42074a = f;
            this.f42075b = f4;
            this.f42076c = f4;
            float f17 = (f4 - f) / f3;
            this.f42077d = f17;
            float f18 = f4 / f3;
            this.f42079f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f42078e = ((f2 - f19) - f20) / f4;
            this.f42080g = f19;
            this.f42081h = f2 - f20;
            this.f42082i = f2;
        }
    }

    public float getInterpolation(float f) {
        float e = mo49092e(f);
        this.f42087n = f;
        if (this.f42085l) {
            return this.f42086m - e;
        }
        return this.f42086m + e;
    }
}
