package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.c */
public class C21474c extends C21477f<Float> {
    public C21474c(List<C21693a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float mo64081p() {
        return mo64082q(mo64058b(), mo64060d());
    }

    /* renamed from: q */
    public float mo64082q(C21693a<Float> aVar, float f) {
        if (aVar.f56095b == null || aVar.f56096c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            Float f2 = (Float) jVar.mo64748b(aVar.f56100g, aVar.f56101h.floatValue(), aVar.f56095b, aVar.f56096c, f, mo64061e(), mo64062f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C21685i.m99797k(aVar.mo64726f(), aVar.mo64723c(), f);
    }

    /* renamed from: r */
    public Float mo64065i(C21693a<Float> aVar, float f) {
        return Float.valueOf(mo64082q(aVar, f));
    }
}
