package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.m */
public class C21484m extends C21466a<PointF, PointF> {

    /* renamed from: i */
    public final PointF f55409i = new PointF();

    /* renamed from: j */
    public final PointF f55410j = new PointF();

    /* renamed from: k */
    public final C21466a<Float, Float> f55411k;

    /* renamed from: l */
    public final C21466a<Float, Float> f55412l;
    @C0363p0

    /* renamed from: m */
    public C21702j<Float> f55413m;
    @C0363p0

    /* renamed from: n */
    public C21702j<Float> f55414n;

    public C21484m(C21466a<Float, Float> aVar, C21466a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f55411k = aVar;
        this.f55412l = aVar2;
        mo64069m(mo64062f());
    }

    /* renamed from: m */
    public void mo64069m(float f) {
        this.f55411k.mo64069m(f);
        this.f55412l.mo64069m(f);
        this.f55409i.set(this.f55411k.mo64064h().floatValue(), this.f55412l.mo64064h().floatValue());
        for (int i = 0; i < this.f55381a.size(); i++) {
            this.f55381a.get(i).mo64019a();
        }
    }

    /* renamed from: p */
    public PointF mo64064h() {
        return mo64065i((C21693a<PointF>) null, 0.0f);
    }

    /* renamed from: q */
    public PointF mo64065i(C21693a<PointF> aVar, float f) {
        Float f2;
        C21693a<Float> b;
        float f3;
        C21693a<Float> b2;
        float f4;
        Float f5 = null;
        if (this.f55413m == null || (b2 = this.f55411k.mo64058b()) == null) {
            f2 = null;
        } else {
            float d = this.f55411k.mo64060d();
            Float f6 = b2.f56101h;
            C21702j<Float> jVar = this.f55413m;
            float f7 = b2.f56100g;
            if (f6 == null) {
                f4 = f7;
            } else {
                f4 = f6.floatValue();
            }
            f2 = jVar.mo64748b(f7, f4, b2.f56095b, b2.f56096c, f, f, d);
        }
        if (!(this.f55414n == null || (b = this.f55412l.mo64058b()) == null)) {
            float d2 = this.f55412l.mo64060d();
            Float f8 = b.f56101h;
            C21702j<Float> jVar2 = this.f55414n;
            float f9 = b.f56100g;
            if (f8 == null) {
                f3 = f9;
            } else {
                f3 = f8.floatValue();
            }
            f5 = jVar2.mo64748b(f9, f3, b.f56095b, b.f56096c, f, f, d2);
        }
        if (f2 == null) {
            this.f55410j.set(this.f55409i.x, 0.0f);
        } else {
            this.f55410j.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.f55410j;
            pointF.set(pointF.x, this.f55409i.y);
        } else {
            PointF pointF2 = this.f55410j;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.f55410j;
    }

    /* renamed from: r */
    public void mo64100r(@C0363p0 C21702j<Float> jVar) {
        C21702j<Float> jVar2 = this.f55413m;
        if (jVar2 != null) {
            jVar2.mo64749c((C21466a<?, ?>) null);
        }
        this.f55413m = jVar;
        if (jVar != null) {
            jVar.mo64749c(this);
        }
    }

    /* renamed from: s */
    public void mo64101s(@C0363p0 C21702j<Float> jVar) {
        C21702j<Float> jVar2 = this.f55414n;
        if (jVar2 != null) {
            jVar2.mo64749c((C21466a<?, ?>) null);
        }
        this.f55414n = jVar;
        if (jVar != null) {
            jVar.mo64749c(this);
        }
    }
}
