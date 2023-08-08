package com.google.android.material.shape;

import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.shape.t */
public class C31554t extends C31521g {

    /* renamed from: a */
    public final float f76500a;

    /* renamed from: b */
    public final boolean f76501b;

    public C31554t(float f, boolean z) {
        this.f76500a = f;
        this.f76501b = z;
    }

    /* renamed from: c */
    public void mo88365c(float f, float f2, float f3, @C0359n0 C31542q qVar) {
        float f4;
        qVar.mo90883n(f2 - (this.f76500a * f3), 0.0f);
        if (this.f76501b) {
            f4 = this.f76500a;
        } else {
            f4 = -this.f76500a;
        }
        qVar.mo90883n(f2, f4 * f3);
        qVar.mo90883n(f2 + (this.f76500a * f3), 0.0f);
        qVar.mo90883n(f, 0.0f);
    }
}
