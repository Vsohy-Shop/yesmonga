package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import com.airbnb.lottie.value.C21703k;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.k */
public class C21482k extends C21477f<C21703k> {

    /* renamed from: i */
    public final C21703k f55406i = new C21703k();

    public C21482k(List<C21693a<C21703k>> list) {
        super(list);
    }

    /* renamed from: p */
    public C21703k mo64065i(C21693a<C21703k> aVar, float f) {
        T t;
        T t2 = aVar.f56095b;
        if (t2 == null || (t = aVar.f56096c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C21703k kVar = (C21703k) t2;
        C21703k kVar2 = (C21703k) t;
        C21702j<A> jVar = this.f55385e;
        if (jVar != null) {
            C21703k kVar3 = (C21703k) jVar.mo64748b(aVar.f56100g, aVar.f56101h.floatValue(), kVar, kVar2, f, mo64061e(), mo64062f());
            if (kVar3 != null) {
                return kVar3;
            }
        }
        this.f55406i.mo64754d(C21685i.m99797k(kVar.mo64752b(), kVar2.mo64752b(), f), C21685i.m99797k(kVar.mo64753c(), kVar2.mo64753c(), f));
        return this.f55406i;
    }
}
