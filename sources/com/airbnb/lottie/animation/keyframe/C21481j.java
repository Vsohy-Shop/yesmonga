package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.j */
public class C21481j extends C21477f<PointF> {

    /* renamed from: i */
    public final PointF f55405i = new PointF();

    public C21481j(List<C21693a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo64065i(C21693a<PointF> aVar, float f) {
        return mo64066j(aVar, f, f, f);
    }

    /* renamed from: q */
    public PointF mo64066j(C21693a<PointF> aVar, float f, float f2, float f3) {
        T t;
        T t2 = aVar.f56095b;
        if (t2 == null || (t = aVar.f56096c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            PointF pointF3 = (PointF) jVar.mo64748b(aVar.f56100g, aVar.f56101h.floatValue(), pointF, pointF2, f, mo64061e(), mo64062f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f55405i;
        float f4 = pointF.x;
        float f5 = f4 + (f2 * (pointF2.x - f4));
        float f6 = pointF.y;
        pointF4.set(f5, f6 + (f3 * (pointF2.y - f6)));
        return this.f55405i;
    }
}
