package androidx.dynamicanimation.animation;

import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.C18975b;

/* renamed from: androidx.dynamicanimation.animation.h */
public final class C19002h implements C19000f {

    /* renamed from: k */
    public static final float f48337k = 10000.0f;

    /* renamed from: l */
    public static final float f48338l = 1500.0f;

    /* renamed from: m */
    public static final float f48339m = 200.0f;

    /* renamed from: n */
    public static final float f48340n = 50.0f;

    /* renamed from: o */
    public static final float f48341o = 0.2f;

    /* renamed from: p */
    public static final float f48342p = 0.5f;

    /* renamed from: q */
    public static final float f48343q = 0.75f;

    /* renamed from: r */
    public static final float f48344r = 1.0f;

    /* renamed from: s */
    public static final double f48345s = 62.5d;

    /* renamed from: t */
    public static final double f48346t = Double.MAX_VALUE;

    /* renamed from: a */
    public double f48347a = Math.sqrt(1500.0d);

    /* renamed from: b */
    public double f48348b = 0.5d;

    /* renamed from: c */
    public boolean f48349c = false;

    /* renamed from: d */
    public double f48350d;

    /* renamed from: e */
    public double f48351e;

    /* renamed from: f */
    public double f48352f;

    /* renamed from: g */
    public double f48353g;

    /* renamed from: h */
    public double f48354h;

    /* renamed from: i */
    public double f48355i = Double.MAX_VALUE;

    /* renamed from: j */
    public final C18975b.C18991p f48356j = new C18975b.C18991p();

    public C19002h() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public boolean mo55910a(float f, float f2) {
        if (((double) Math.abs(f2)) >= this.f48351e || ((double) Math.abs(f - mo55925d())) >= this.f48350d) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public float mo55911b(float f, float f2) {
        float d = f - mo55925d();
        double d2 = this.f48347a;
        return (float) (((-(d2 * d2)) * ((double) d)) - (((d2 * 2.0d) * this.f48348b) * ((double) f2)));
    }

    /* renamed from: c */
    public float mo55924c() {
        return (float) this.f48348b;
    }

    /* renamed from: d */
    public float mo55925d() {
        return (float) this.f48355i;
    }

    /* renamed from: e */
    public float mo55926e() {
        double d = this.f48347a;
        return (float) (d * d);
    }

    /* renamed from: f */
    public final void mo55927f() {
        if (!this.f48349c) {
            if (this.f48355i != Double.MAX_VALUE) {
                double d = this.f48348b;
                if (d > 1.0d) {
                    double d2 = this.f48347a;
                    this.f48352f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f48348b;
                    double d4 = this.f48347a;
                    this.f48353g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f48354h = this.f48347a * Math.sqrt(1.0d - (d * d));
                }
                this.f48349c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: g */
    public C19002h mo55928g(@C0379x(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f48348b = (double) f;
            this.f48349c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: h */
    public C19002h mo55929h(float f) {
        this.f48355i = (double) f;
        return this;
    }

    /* renamed from: i */
    public C19002h mo55930i(@C0379x(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f48347a = Math.sqrt((double) f);
            this.f48349c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: j */
    public void mo55931j(double d) {
        double abs = Math.abs(d);
        this.f48350d = abs;
        this.f48351e = abs * 62.5d;
    }

    /* renamed from: k */
    public C18975b.C18991p mo55932k(double d, double d2, long j) {
        double d3;
        double d4;
        mo55927f();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f48355i;
        double d7 = this.f48348b;
        if (d7 > 1.0d) {
            double d8 = this.f48353g;
            double d9 = this.f48352f;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f48352f * d5) * d11);
            double d12 = this.f48353g;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f48352f;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f48347a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f48347a) * d5);
            double d17 = this.f48347a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f48354h;
            double d19 = this.f48347a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f48354h * d5) * d6) + (Math.sin(this.f48354h * d5) * d20));
            double d21 = this.f48347a;
            double d22 = this.f48348b;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f48354h;
            double d24 = pow3;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d25 = this.f48354h;
            d3 = ((-d21) * pow3 * d22) + (pow4 * (sin + (d20 * d25 * Math.cos(d25 * d5))));
            d4 = d24;
        }
        C18975b.C18991p pVar = this.f48356j;
        pVar.f48322a = (float) (d4 + this.f48355i);
        pVar.f48323b = (float) d3;
        return pVar;
    }

    public C19002h(float f) {
        this.f48355i = (double) f;
    }
}
