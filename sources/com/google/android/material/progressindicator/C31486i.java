package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.C0359n0;
import androidx.vectordrawable.graphics.drawable.C20715b;

/* renamed from: com.google.android.material.progressindicator.i */
public abstract class C31486i<T extends Animator> {

    /* renamed from: a */
    public C31487j f76221a;

    /* renamed from: b */
    public final float[] f76222b;

    /* renamed from: c */
    public final int[] f76223c;

    public C31486i(int i) {
        this.f76222b = new float[(i * 2)];
        this.f76223c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo90536a();

    /* renamed from: b */
    public float mo90607b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo90537c();

    /* renamed from: d */
    public abstract void mo90538d(@C0359n0 C20715b.C20716a aVar);

    /* renamed from: e */
    public void mo90608e(@C0359n0 C31487j jVar) {
        this.f76221a = jVar;
    }

    /* renamed from: f */
    public abstract void mo90539f();

    /* renamed from: g */
    public abstract void mo90540g();

    /* renamed from: h */
    public abstract void mo90541h();
}
