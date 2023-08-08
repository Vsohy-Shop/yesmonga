package com.google.android.material.shape;

import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.shape.i */
public final class C31524i extends C31521g {

    /* renamed from: a */
    public final float f76358a;

    public C31524i(float f) {
        this.f76358a = f - 0.001f;
    }

    /* renamed from: b */
    public boolean mo90702b() {
        return true;
    }

    /* renamed from: c */
    public void mo88365c(float f, float f2, float f3, @C0359n0 C31542q qVar) {
        float sqrt = (float) ((((double) this.f76358a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f76358a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        qVar.mo90885p(f2 - sqrt, ((float) (-((((double) this.f76358a) * Math.sqrt(2.0d)) - ((double) this.f76358a)))) + sqrt2);
        qVar.mo90883n(f2, (float) (-((((double) this.f76358a) * Math.sqrt(2.0d)) - ((double) this.f76358a))));
        qVar.mo90883n(f2 + sqrt, ((float) (-((((double) this.f76358a) * Math.sqrt(2.0d)) - ((double) this.f76358a)))) + sqrt2);
    }
}
