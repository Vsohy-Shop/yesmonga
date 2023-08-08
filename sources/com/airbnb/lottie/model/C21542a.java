package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.model.a */
public class C21542a {

    /* renamed from: a */
    public final PointF f55591a;

    /* renamed from: b */
    public final PointF f55592b;

    /* renamed from: c */
    public final PointF f55593c;

    public C21542a() {
        this.f55591a = new PointF();
        this.f55592b = new PointF();
        this.f55593c = new PointF();
    }

    /* renamed from: a */
    public PointF mo64294a() {
        return this.f55591a;
    }

    /* renamed from: b */
    public PointF mo64295b() {
        return this.f55592b;
    }

    /* renamed from: c */
    public PointF mo64296c() {
        return this.f55593c;
    }

    /* renamed from: d */
    public void mo64297d(float f, float f2) {
        this.f55591a.set(f, f2);
    }

    /* renamed from: e */
    public void mo64298e(float f, float f2) {
        this.f55592b.set(f, f2);
    }

    /* renamed from: f */
    public void mo64299f(float f, float f2) {
        this.f55593c.set(f, f2);
    }

    public C21542a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f55591a = pointF;
        this.f55592b = pointF2;
        this.f55593c = pointF3;
    }
}
