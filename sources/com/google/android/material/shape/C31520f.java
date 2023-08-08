package com.google.android.material.shape;

import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.shape.f */
public class C31520f extends C31519e {

    /* renamed from: a */
    public float f76350a;

    public C31520f() {
        this.f76350a = -1.0f;
    }

    /* renamed from: b */
    public void mo90700b(@C0359n0 C31542q qVar, float f, float f2, float f3) {
        qVar.mo90886q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        qVar.mo90883n((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }

    @Deprecated
    public C31520f(float f) {
        this.f76350a = f;
    }
}
