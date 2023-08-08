package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C21568h;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21693a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.l */
public class C21483l extends C21466a<C21568h, Path> {

    /* renamed from: i */
    public final C21568h f55407i = new C21568h();

    /* renamed from: j */
    public final Path f55408j = new Path();

    public C21483l(List<C21693a<C21568h>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path mo64065i(C21693a<C21568h> aVar, float f) {
        this.f55407i.mo64409c((C21568h) aVar.f56095b, (C21568h) aVar.f56096c, f);
        C21685i.m99795i(this.f55407i, this.f55408j);
        return this.f55408j;
    }
}
