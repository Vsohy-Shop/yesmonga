package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.e */
public class C21476e extends C21477f<Integer> {
    public C21476e(List<C21693a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo64085p() {
        return mo64086q(mo64058b(), mo64060d());
    }

    /* renamed from: q */
    public int mo64086q(C21693a<Integer> aVar, float f) {
        if (aVar.f56095b == null || aVar.f56096c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            Integer num = (Integer) jVar.mo64748b(aVar.f56100g, aVar.f56101h.floatValue(), aVar.f56095b, aVar.f56096c, f, mo64061e(), mo64062f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C21685i.m99798l(aVar.mo64727g(), aVar.mo64724d(), f);
    }

    /* renamed from: r */
    public Integer mo64065i(C21693a<Integer> aVar, float f) {
        return Integer.valueOf(mo64086q(aVar, f));
    }
}
