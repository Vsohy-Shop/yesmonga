package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21495g;

/* renamed from: com.airbnb.lottie.utils.g */
public class C21683g extends C21679c implements Choreographer.FrameCallback {

    /* renamed from: c */
    public float f56069c = 1.0f;

    /* renamed from: d */
    public boolean f56070d = false;

    /* renamed from: e */
    public long f56071e = 0;

    /* renamed from: f */
    public float f56072f = 0.0f;

    /* renamed from: g */
    public int f56073g = 0;

    /* renamed from: v */
    public float f56074v = -2.14748365E9f;

    /* renamed from: w */
    public float f56075w = 2.14748365E9f;
    @C0363p0

    /* renamed from: x */
    public C21495g f56076x;
    @C0344h1

    /* renamed from: y */
    public boolean f56077y = false;

    @C0353k0
    /* renamed from: A */
    public void mo64674A() {
        mo64675B(true);
    }

    @C0353k0
    /* renamed from: B */
    public void mo64675B(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f56077y = false;
        }
    }

    @C0353k0
    /* renamed from: C */
    public void mo64676C() {
        this.f56077y = true;
        mo64703x();
        this.f56071e = 0;
        if (mo64700t() && mo64694l() == mo64697o()) {
            this.f56072f = mo64696n();
        } else if (!mo64700t() && mo64694l() == mo64696n()) {
            this.f56072f = mo64697o();
        }
    }

    /* renamed from: D */
    public void mo64677D() {
        mo64683J(-mo64698s());
    }

    /* renamed from: E */
    public void mo64678E(C21495g gVar) {
        boolean z;
        if (this.f56076x == null) {
            z = true;
        } else {
            z = false;
        }
        this.f56076x = gVar;
        if (z) {
            mo64681H((float) ((int) Math.max(this.f56074v, gVar.mo64135r())), (float) ((int) Math.min(this.f56075w, gVar.mo64123f())));
        } else {
            mo64681H((float) ((int) gVar.mo64135r()), (float) ((int) gVar.mo64123f()));
        }
        float f = this.f56072f;
        this.f56072f = 0.0f;
        mo64679F((float) ((int) f));
        mo64666h();
    }

    /* renamed from: F */
    public void mo64679F(float f) {
        if (this.f56072f != f) {
            this.f56072f = C21685i.m99789c(f, mo64697o(), mo64696n());
            this.f56071e = 0;
            mo64666h();
        }
    }

    /* renamed from: G */
    public void mo64680G(float f) {
        mo64681H(this.f56074v, f);
    }

    /* renamed from: H */
    public void mo64681H(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C21495g gVar = this.f56076x;
            if (gVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = gVar.mo64135r();
            }
            C21495g gVar2 = this.f56076x;
            if (gVar2 == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = gVar2.mo64123f();
            }
            float c = C21685i.m99789c(f, f3, f4);
            float c2 = C21685i.m99789c(f2, f3, f4);
            if (c != this.f56074v || c2 != this.f56075w) {
                this.f56074v = c;
                this.f56075w = c2;
                mo64679F((float) ((int) C21685i.m99789c(this.f56072f, c, c2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: I */
    public void mo64682I(int i) {
        mo64681H((float) i, (float) ((int) this.f56075w));
    }

    /* renamed from: J */
    public void mo64683J(float f) {
        this.f56069c = f;
    }

    /* renamed from: K */
    public final void mo64684K() {
        if (this.f56076x != null) {
            float f = this.f56072f;
            if (f < this.f56074v || f > this.f56075w) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f56074v), Float.valueOf(this.f56075w), Float.valueOf(this.f56072f)}));
            }
        }
    }

    @C0353k0
    public void cancel() {
        mo64661b();
        mo64674A();
    }

    public void doFrame(long j) {
        float f;
        float f2;
        mo64703x();
        if (this.f56076x != null && isRunning()) {
            C21492e.m99017a("LottieValueAnimator#doFrame");
            long j2 = this.f56071e;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m = ((float) j3) / mo64695m();
            float f3 = this.f56072f;
            if (mo64700t()) {
                m = -m;
            }
            float f4 = f3 + m;
            this.f56072f = f4;
            boolean z = !C21685i.m99791e(f4, mo64697o(), mo64696n());
            this.f56072f = C21685i.m99789c(this.f56072f, mo64697o(), mo64696n());
            this.f56071e = j;
            mo64666h();
            if (z) {
                if (getRepeatCount() == -1 || this.f56073g < getRepeatCount()) {
                    mo64663e();
                    this.f56073g++;
                    if (getRepeatMode() == 2) {
                        this.f56070d = !this.f56070d;
                        mo64677D();
                    } else {
                        if (mo64700t()) {
                            f = mo64696n();
                        } else {
                            f = mo64697o();
                        }
                        this.f56072f = f;
                    }
                    this.f56071e = j;
                } else {
                    if (this.f56069c < 0.0f) {
                        f2 = mo64697o();
                    } else {
                        f2 = mo64696n();
                    }
                    this.f56072f = f2;
                    mo64674A();
                    mo64662c(mo64700t());
                }
            }
            mo64684K();
            C21492e.m99018b("LottieValueAnimator#doFrame");
        }
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    public float getAnimatedFraction() {
        float o;
        float n;
        float o2;
        if (this.f56076x == null) {
            return 0.0f;
        }
        if (mo64700t()) {
            o = mo64696n() - this.f56072f;
            n = mo64696n();
            o2 = mo64697o();
        } else {
            o = this.f56072f - mo64697o();
            n = mo64696n();
            o2 = mo64697o();
        }
        return o / (n - o2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo64693k());
    }

    public long getDuration() {
        C21495g gVar = this.f56076x;
        if (gVar == null) {
            return 0;
        }
        return (long) gVar.mo64121d();
    }

    /* renamed from: i */
    public void mo64690i() {
        this.f56076x = null;
        this.f56074v = -2.14748365E9f;
        this.f56075w = 2.14748365E9f;
    }

    public boolean isRunning() {
        return this.f56077y;
    }

    @C0353k0
    /* renamed from: j */
    public void mo64692j() {
        mo64674A();
        mo64662c(mo64700t());
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: k */
    public float mo64693k() {
        C21495g gVar = this.f56076x;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f56072f - gVar.mo64135r()) / (this.f56076x.mo64123f() - this.f56076x.mo64135r());
    }

    /* renamed from: l */
    public float mo64694l() {
        return this.f56072f;
    }

    /* renamed from: m */
    public final float mo64695m() {
        C21495g gVar = this.f56076x;
        if (gVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / gVar.mo64126i()) / Math.abs(this.f56069c);
    }

    /* renamed from: n */
    public float mo64696n() {
        C21495g gVar = this.f56076x;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.f56075w;
        if (f == 2.14748365E9f) {
            return gVar.mo64123f();
        }
        return f;
    }

    /* renamed from: o */
    public float mo64697o() {
        C21495g gVar = this.f56076x;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.f56074v;
        if (f == -2.14748365E9f) {
            return gVar.mo64135r();
        }
        return f;
    }

    /* renamed from: s */
    public float mo64698s() {
        return this.f56069c;
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f56070d) {
            this.f56070d = false;
            mo64677D();
        }
    }

    /* renamed from: t */
    public final boolean mo64700t() {
        return mo64698s() < 0.0f;
    }

    @C0353k0
    /* renamed from: u */
    public void mo64701u() {
        mo64674A();
    }

    @C0353k0
    /* renamed from: v */
    public void mo64702v() {
        float f;
        this.f56077y = true;
        mo64664f(mo64700t());
        if (mo64700t()) {
            f = mo64696n();
        } else {
            f = mo64697o();
        }
        mo64679F((float) ((int) f));
        this.f56071e = 0;
        this.f56073g = 0;
        mo64703x();
    }

    /* renamed from: x */
    public void mo64703x() {
        if (isRunning()) {
            mo64675B(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
