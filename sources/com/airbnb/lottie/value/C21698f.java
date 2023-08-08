package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.airbnb.lottie.value.f */
public abstract class C21698f<T> extends C21702j<T> {

    /* renamed from: d */
    public final T f56118d;

    /* renamed from: e */
    public final T f56119e;

    /* renamed from: f */
    public final Interpolator f56120f;

    public C21698f(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    /* renamed from: a */
    public T mo64017a(C21694b<T> bVar) {
        return mo64738e(this.f56118d, this.f56119e, this.f56120f.getInterpolation(bVar.mo64734e()));
    }

    /* renamed from: e */
    public abstract T mo64738e(T t, T t2, float f);

    public C21698f(T t, T t2, Interpolator interpolator) {
        this.f56118d = t;
        this.f56119e = t2;
        this.f56120f = interpolator;
    }
}
