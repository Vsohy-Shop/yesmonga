package com.google.android.material.bottomappbar;

import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.C31521g;
import com.google.android.material.shape.C31542q;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C31161a extends C31521g implements Cloneable {

    /* renamed from: g */
    public static final int f74745g = 90;

    /* renamed from: v */
    public static final int f74746v = 180;

    /* renamed from: w */
    public static final int f74747w = 270;

    /* renamed from: x */
    public static final int f74748x = 180;

    /* renamed from: y */
    public static final float f74749y = 1.75f;

    /* renamed from: a */
    public float f74750a;

    /* renamed from: b */
    public float f74751b;

    /* renamed from: c */
    public float f74752c;

    /* renamed from: d */
    public float f74753d;

    /* renamed from: e */
    public float f74754e;

    /* renamed from: f */
    public float f74755f = -1.0f;

    public C31161a(float f, float f2, float f3) {
        this.f74751b = f;
        this.f74750a = f2;
        mo88372m(f3);
        this.f74754e = 0.0f;
    }

    /* renamed from: c */
    public void mo88365c(float f, float f2, float f3, @C0359n0 C31542q qVar) {
        boolean z;
        float f4;
        float f5;
        float f6 = f;
        C31542q qVar2 = qVar;
        float f7 = this.f74752c;
        if (f7 == 0.0f) {
            qVar2.mo90883n(f6, 0.0f);
            return;
        }
        float f8 = ((this.f74751b * 2.0f) + f7) / 2.0f;
        float f9 = f3 * this.f74750a;
        float f10 = f2 + this.f74754e;
        float f11 = (this.f74753d * f3) + ((1.0f - f3) * f8);
        if (f11 / f8 >= 1.0f) {
            qVar2.mo90883n(f6, 0.0f);
            return;
        }
        float f12 = this.f74755f;
        float f13 = f12 * f3;
        if (f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f11;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f4 + f9;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f10 - sqrt;
        float f17 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        qVar2.mo90883n(f16, 0.0f);
        float f19 = f9 * 2.0f;
        float f20 = degrees;
        qVar.mo90870a(f16 - f9, 0.0f, f16 + f9, f19, 270.0f, degrees);
        if (z2) {
            qVar.mo90870a(f10 - f8, (-f8) - f4, f10 + f8, f8 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f74751b;
            float f22 = f13 * 2.0f;
            float f23 = f10 - f8;
            qVar.mo90870a(f23, -(f13 + f21), f23 + f21 + f22, f21 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f10 + f8;
            float f25 = this.f74751b;
            qVar2.mo90883n(f24 - ((f25 / 2.0f) + f13), f25 + f13);
            float f26 = this.f74751b;
            qVar.mo90870a(f24 - (f22 + f26), -(f13 + f26), f24, f26 + f13, 90.0f, f18 - 0.049804688f);
        }
        qVar.mo90870a(f17 - f9, 0.0f, f17 + f9, f19, 270.0f - f20, f20);
        qVar2.mo90883n(f6, 0.0f);
    }

    /* renamed from: f */
    public float mo88366f() {
        return this.f74753d;
    }

    /* renamed from: h */
    public float mo88367h() {
        return this.f74755f;
    }

    /* renamed from: i */
    public float mo88368i() {
        return this.f74751b;
    }

    /* renamed from: j */
    public float mo88369j() {
        return this.f74750a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public float mo88370k() {
        return this.f74752c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public float mo88371l() {
        return this.f74754e;
    }

    /* renamed from: m */
    public void mo88372m(@C0379x(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f74753d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: n */
    public void mo88373n(float f) {
        this.f74755f = f;
    }

    /* renamed from: o */
    public void mo88374o(float f) {
        this.f74751b = f;
    }

    /* renamed from: s */
    public void mo88375s(float f) {
        this.f74750a = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public void mo88376t(float f) {
        this.f74752c = f;
    }

    /* renamed from: u */
    public void mo88377u(float f) {
        this.f74754e = f;
    }
}
