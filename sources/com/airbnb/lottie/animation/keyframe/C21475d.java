package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.C21563c;
import com.airbnb.lottie.value.C21693a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.d */
public class C21475d extends C21477f<C21563c> {

    /* renamed from: i */
    public final C21563c f55395i;

    public C21475d(List<C21693a<C21563c>> list) {
        super(list);
        int i = 0;
        C21563c cVar = (C21563c) list.get(0).f56095b;
        i = cVar != null ? cVar.mo64371c() : i;
        this.f55395i = new C21563c(new float[i], new int[i]);
    }

    /* renamed from: p */
    public C21563c mo64065i(C21693a<C21563c> aVar, float f) {
        this.f55395i.mo64372d((C21563c) aVar.f56095b, (C21563c) aVar.f56096c, f);
        return this.f55395i;
    }
}
