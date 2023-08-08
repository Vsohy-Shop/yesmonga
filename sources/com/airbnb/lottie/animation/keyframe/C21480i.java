package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.i */
public class C21480i extends C21477f<PointF> {

    /* renamed from: i */
    public final PointF f55401i = new PointF();

    /* renamed from: j */
    public final float[] f55402j = new float[2];

    /* renamed from: k */
    public final PathMeasure f55403k = new PathMeasure();

    /* renamed from: l */
    public C21479h f55404l;

    public C21480i(List<? extends C21693a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo64065i(C21693a<PointF> aVar, float f) {
        C21479h hVar = (C21479h) aVar;
        Path j = hVar.mo64092j();
        if (j == null) {
            return (PointF) aVar.f56095b;
        }
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            PointF pointF = (PointF) jVar.mo64748b(hVar.f56100g, hVar.f56101h.floatValue(), hVar.f56095b, hVar.f56096c, mo64061e(), f, mo64062f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f55404l != hVar) {
            this.f55403k.setPath(j, false);
            this.f55404l = hVar;
        }
        PathMeasure pathMeasure = this.f55403k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f55402j, (float[]) null);
        PointF pointF2 = this.f55401i;
        float[] fArr = this.f55402j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f55401i;
    }
}
