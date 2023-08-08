package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21693a;

/* renamed from: com.airbnb.lottie.animation.keyframe.h */
public class C21479h extends C21693a<PointF> {
    @C0363p0

    /* renamed from: s */
    public Path f55399s;

    /* renamed from: t */
    public final C21693a<PointF> f55400t;

    public C21479h(C21495g gVar, C21693a<PointF> aVar) {
        super(gVar, aVar.f56095b, aVar.f56096c, aVar.f56097d, aVar.f56098e, aVar.f56099f, aVar.f56100g, aVar.f56101h);
        this.f55400t = aVar;
        mo64091i();
    }

    /* renamed from: i */
    public void mo64091i() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f56096c;
        if (t3 == null || (t2 = this.f56095b) == null || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = false;
        } else {
            z = true;
        }
        T t4 = this.f56095b;
        if (t4 != null && (t = this.f56096c) != null && !z) {
            C21693a<PointF> aVar = this.f55400t;
            this.f55399s = C21686j.m99803d((PointF) t4, (PointF) t, aVar.f56108o, aVar.f56109p);
        }
    }

    @C0363p0
    /* renamed from: j */
    public Path mo64092j() {
        return this.f55399s;
    }
}
