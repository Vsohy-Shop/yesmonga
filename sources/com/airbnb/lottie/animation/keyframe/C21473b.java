package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.C21680d;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.b */
public class C21473b extends C21477f<Integer> {
    public C21473b(List<C21693a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo64078p() {
        return mo64079q(mo64058b(), mo64060d());
    }

    /* renamed from: q */
    public int mo64079q(C21693a<Integer> aVar, float f) {
        T t = aVar.f56095b;
        if (t == null || aVar.f56096c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f56096c).intValue();
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            Integer num = (Integer) jVar.mo64748b(aVar.f56100g, aVar.f56101h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo64061e(), mo64062f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C21680d.m99750c(C21685i.m99789c(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: r */
    public Integer mo64065i(C21693a<Integer> aVar, float f) {
        return Integer.valueOf(mo64079q(aVar, f));
    }
}
