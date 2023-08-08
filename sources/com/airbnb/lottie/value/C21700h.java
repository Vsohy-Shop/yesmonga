package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.C21685i;

/* renamed from: com.airbnb.lottie.value.h */
public class C21700h extends C21702j<Integer> {
    /* renamed from: e */
    public Integer mo64744e(C21694b<Integer> bVar) {
        T t = this.f56124c;
        if (t != null) {
            return (Integer) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public Integer mo64017a(C21694b<Integer> bVar) {
        return Integer.valueOf(C21685i.m99798l(bVar.mo64736g().intValue(), bVar.mo64731b().intValue(), bVar.mo64732c()) + mo64744e(bVar).intValue());
    }
}
