package com.google.android.material.shape;

import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.shape.n */
public class C31533n extends C31519e {

    /* renamed from: a */
    public float f76417a;

    public C31533n() {
        this.f76417a = -1.0f;
    }

    /* renamed from: b */
    public void mo90700b(@C0359n0 C31542q qVar, float f, float f2, float f3) {
        qVar.mo90886q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        qVar.mo90870a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }

    @Deprecated
    public C31533n(float f) {
        this.f76417a = f;
    }
}
