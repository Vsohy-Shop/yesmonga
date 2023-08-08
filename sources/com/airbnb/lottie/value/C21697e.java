package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.C21685i;

/* renamed from: com.airbnb.lottie.value.e */
public class C21697e extends C21698f<PointF> {

    /* renamed from: g */
    public final PointF f56117g = new PointF();

    public C21697e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo64017a(C21694b bVar) {
        return super.mo64017a(bVar);
    }

    /* renamed from: f */
    public PointF mo64738e(PointF pointF, PointF pointF2, float f) {
        this.f56117g.set(C21685i.m99797k(pointF.x, pointF2.x, f), C21685i.m99797k(pointF.y, pointF2.y, f));
        return this.f56117g;
    }

    public C21697e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
    }
}
