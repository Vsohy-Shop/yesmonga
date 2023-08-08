package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21484m;
import com.airbnb.lottie.value.C21693a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.i */
public class C21551i implements C21555m<PointF, PointF> {

    /* renamed from: a */
    public final C21544b f55595a;

    /* renamed from: b */
    public final C21544b f55596b;

    public C21551i(C21544b bVar, C21544b bVar2) {
        this.f55595a = bVar;
        this.f55596b = bVar2;
    }

    /* renamed from: a */
    public C21466a<PointF, PointF> mo64300a() {
        return new C21484m(this.f55595a.mo64300a(), this.f55596b.mo64300a());
    }

    /* renamed from: b */
    public List<C21693a<PointF>> mo64301b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public boolean mo64302c() {
        return this.f55595a.mo64302c() && this.f55596b.mo64302c();
    }
}
