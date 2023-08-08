package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21480i;
import com.airbnb.lottie.animation.keyframe.C21481j;
import com.airbnb.lottie.value.C21693a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.e */
public class C21547e implements C21555m<PointF, PointF> {

    /* renamed from: a */
    public final List<C21693a<PointF>> f55594a;

    public C21547e() {
        this.f55594a = Collections.singletonList(new C21693a(new PointF(0.0f, 0.0f)));
    }

    /* renamed from: a */
    public C21466a<PointF, PointF> mo64300a() {
        if (this.f55594a.get(0).mo64728h()) {
            return new C21481j(this.f55594a);
        }
        return new C21480i(this.f55594a);
    }

    /* renamed from: b */
    public List<C21693a<PointF>> mo64301b() {
        return this.f55594a;
    }

    /* renamed from: c */
    public boolean mo64302c() {
        return this.f55594a.size() == 1 && this.f55594a.get(0).mo64728h();
    }

    public C21547e(List<C21693a<PointF>> list) {
        this.f55594a = list;
    }
}
