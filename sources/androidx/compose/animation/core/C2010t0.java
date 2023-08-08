package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.t0 */
public final class C2010t0 {

    /* renamed from: a */
    public float f5614a;

    /* renamed from: b */
    public double f5615b = Math.sqrt(50.0d);

    /* renamed from: c */
    public boolean f5616c;

    /* renamed from: d */
    public double f5617d;

    /* renamed from: e */
    public double f5618e;

    /* renamed from: f */
    public double f5619f;

    /* renamed from: g */
    public float f5620g = 1.0f;

    public C2010t0(float f) {
        this.f5614a = f;
    }

    /* renamed from: a */
    public final float mo6979a(float f, float f2) {
        float f3 = f - this.f5614a;
        double d = this.f5615b;
        return (float) (((-(d * d)) * ((double) f3)) - (((d * 2.0d) * ((double) this.f5620g)) * ((double) f2)));
    }

    /* renamed from: b */
    public final float mo6980b() {
        return this.f5620g;
    }

    /* renamed from: c */
    public final float mo6981c() {
        return this.f5614a;
    }

    /* renamed from: d */
    public final float mo6982d() {
        double d = this.f5615b;
        return (float) (d * d);
    }

    /* renamed from: e */
    public final void mo6983e() {
        boolean z;
        if (!this.f5616c) {
            if (this.f5614a == C2012u0.m8634b()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                float f = this.f5620g;
                double d = ((double) f) * ((double) f);
                if (f > 1.0f) {
                    double d2 = this.f5615b;
                    double d3 = d - ((double) 1);
                    this.f5617d = (((double) (-f)) * d2) + (d2 * Math.sqrt(d3));
                    double d4 = this.f5615b;
                    this.f5618e = (((double) (-this.f5620g)) * d4) - (d4 * Math.sqrt(d3));
                } else if (f >= 0.0f && f < 1.0f) {
                    this.f5619f = this.f5615b * Math.sqrt(((double) 1) - d);
                }
                this.f5616c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: f */
    public final void mo6984f(float f) {
        if (f >= 0.0f) {
            this.f5620g = f;
            this.f5616c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: g */
    public final void mo6985g(float f) {
        this.f5614a = f;
    }

    /* renamed from: h */
    public final void mo6986h(float f) {
        if (mo6982d() > 0.0f) {
            this.f5615b = Math.sqrt((double) f);
            this.f5616c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: i */
    public final long mo6987i(float f, float f2, long j) {
        double d;
        double d2;
        boolean z;
        float f3 = f2;
        mo6983e();
        float f4 = f - this.f5614a;
        double d3 = ((double) j) / 1000.0d;
        float f5 = this.f5620g;
        if (f5 > 1.0f) {
            double d4 = (double) f4;
            double d5 = this.f5618e;
            double d6 = (double) f3;
            double d7 = this.f5617d;
            double d8 = d4 - (((d5 * d4) - d6) / (d5 - d7));
            double d9 = ((d4 * d5) - d6) / (d5 - d7);
            d2 = (Math.exp(d5 * d3) * d8) + (Math.exp(this.f5617d * d3) * d9);
            double d10 = this.f5618e;
            double exp = d8 * d10 * Math.exp(d10 * d3);
            double d11 = this.f5617d;
            d = exp + (d9 * d11 * Math.exp(d11 * d3));
        } else {
            if (f5 == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                double d12 = (double) f3;
                double d13 = this.f5615b;
                double d14 = (double) f4;
                double d15 = d12 + (d13 * d14);
                double d16 = d14 + (d15 * d3);
                double exp2 = Math.exp((-d13) * d3) * d16;
                double exp3 = d16 * Math.exp((-this.f5615b) * d3);
                double d17 = this.f5615b;
                d = (exp3 * (-d17)) + (d15 * Math.exp((-d17) * d3));
                d2 = exp2;
            } else {
                double d18 = this.f5615b;
                double d19 = (double) f4;
                double d20 = (((double) 1) / this.f5619f) * ((((double) f5) * d18 * d19) + ((double) f3));
                double exp4 = Math.exp(((double) (-f5)) * d18 * d3) * ((Math.cos(this.f5619f * d3) * d19) + (Math.sin(this.f5619f * d3) * d20));
                double d21 = this.f5615b;
                float f6 = this.f5620g;
                double d22 = (-d21) * exp4 * ((double) f6);
                double exp5 = Math.exp(((double) (-f6)) * d21 * d3);
                double d23 = this.f5619f;
                double d24 = exp4;
                double sin = (-d23) * d19 * Math.sin(d23 * d3);
                double d25 = this.f5619f;
                d = d22 + (exp5 * (sin + (d20 * d25 * Math.cos(d25 * d3))));
                d2 = d24;
            }
        }
        return C2012u0.m8633a((float) (d2 + ((double) this.f5614a)), (float) d);
    }
}
