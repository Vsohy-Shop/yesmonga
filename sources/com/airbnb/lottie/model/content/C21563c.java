package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.C21680d;
import com.airbnb.lottie.utils.C21685i;

/* renamed from: com.airbnb.lottie.model.content.c */
public class C21563c {

    /* renamed from: a */
    public final float[] f55690a;

    /* renamed from: b */
    public final int[] f55691b;

    public C21563c(float[] fArr, int[] iArr) {
        this.f55690a = fArr;
        this.f55691b = iArr;
    }

    /* renamed from: a */
    public int[] mo64369a() {
        return this.f55691b;
    }

    /* renamed from: b */
    public float[] mo64370b() {
        return this.f55690a;
    }

    /* renamed from: c */
    public int mo64371c() {
        return this.f55691b.length;
    }

    /* renamed from: d */
    public void mo64372d(C21563c cVar, C21563c cVar2, float f) {
        if (cVar.f55691b.length == cVar2.f55691b.length) {
            for (int i = 0; i < cVar.f55691b.length; i++) {
                this.f55690a[i] = C21685i.m99797k(cVar.f55690a[i], cVar2.f55690a[i], f);
                this.f55691b[i] = C21680d.m99750c(f, cVar.f55691b[i], cVar2.f55691b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f55691b.length + " vs " + cVar2.f55691b.length + ")");
    }
}
