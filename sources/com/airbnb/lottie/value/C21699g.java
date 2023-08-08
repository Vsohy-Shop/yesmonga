package com.airbnb.lottie.value;

import androidx.annotation.C0359n0;
import com.airbnb.lottie.utils.C21685i;

/* renamed from: com.airbnb.lottie.value.g */
public class C21699g extends C21702j<Float> {
    public C21699g() {
    }

    /* renamed from: e */
    public Float mo64742e(C21694b<Float> bVar) {
        T t = this.f56124c;
        if (t != null) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public Float mo64017a(C21694b<Float> bVar) {
        return Float.valueOf(C21685i.m99797k(bVar.mo64736g().floatValue(), bVar.mo64731b().floatValue(), bVar.mo64732c()) + mo64742e(bVar).floatValue());
    }

    public C21699g(@C0359n0 Float f) {
        super(f);
    }
}
