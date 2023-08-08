package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21446d;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21570j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.e */
public class C21585e extends C21578a {

    /* renamed from: D */
    public final C21446d f55834D;

    public C21585e(C21516j jVar, Layer layer) {
        super(jVar, layer);
        C21446d dVar = new C21446d(jVar, this, new C21570j("__container", layer.mo64458l(), false));
        this.f55834D = dVar;
        dVar.mo64020b(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: D */
    public void mo64474D(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        this.f55834D.mo64022d(dVar, i, list, dVar2);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        super.mo64023e(rectF, matrix, z);
        this.f55834D.mo64023e(rectF, this.f55805m, z);
    }

    /* renamed from: t */
    public void mo64492t(@C0359n0 Canvas canvas, Matrix matrix, int i) {
        this.f55834D.mo64025g(canvas, matrix, i);
    }
}
