package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.C0359n0;
import com.airbnb.lottie.utils.C21685i;

/* renamed from: com.airbnb.lottie.value.i */
public class C21701i extends C21702j<PointF> {

    /* renamed from: d */
    public final PointF f56121d = new PointF();

    public C21701i() {
    }

    /* renamed from: e */
    public PointF mo64746e(C21694b<PointF> bVar) {
        T t = this.f56124c;
        if (t != null) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public final PointF mo64017a(C21694b<PointF> bVar) {
        this.f56121d.set(C21685i.m99797k(bVar.mo64736g().x, bVar.mo64731b().x, bVar.mo64732c()), C21685i.m99797k(bVar.mo64736g().y, bVar.mo64731b().y, bVar.mo64732c()));
        PointF e = mo64746e(bVar);
        this.f56121d.offset(e.x, e.y);
        return this.f56121d;
    }

    public C21701i(@C0359n0 PointF pointF) {
        super(pointF);
    }
}
