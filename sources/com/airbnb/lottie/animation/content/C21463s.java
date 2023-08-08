package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21473b;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.value.C21702j;

/* renamed from: com.airbnb.lottie.animation.content.s */
public class C21463s extends C21441a {

    /* renamed from: o */
    public final C21578a f55369o;

    /* renamed from: p */
    public final String f55370p;

    /* renamed from: q */
    public final boolean f55371q;

    /* renamed from: r */
    public final C21466a<Integer, Integer> f55372r;
    @C0363p0

    /* renamed from: s */
    public C21466a<ColorFilter, ColorFilter> f55373s;

    public C21463s(C21516j jVar, C21578a aVar, ShapeStroke shapeStroke) {
        super(jVar, aVar, shapeStroke.mo64345b().mo64355g(), shapeStroke.mo64348e().mo64356g(), shapeStroke.mo64350g(), shapeStroke.mo64352i(), shapeStroke.mo64353j(), shapeStroke.mo64349f(), shapeStroke.mo64347d());
        this.f55369o = aVar;
        this.f55370p = shapeStroke.mo64351h();
        this.f55371q = shapeStroke.mo64354k();
        C21466a<Integer, Integer> a = shapeStroke.mo64346c().mo64300a();
        this.f55372r = a;
        a.mo64057a(this);
        aVar.mo64481i(a);
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t == C21601o.f55881b) {
            this.f55372r.mo64070n(jVar);
        } else if (t == C21601o.f55876E) {
            C21466a<ColorFilter, ColorFilter> aVar = this.f55373s;
            if (aVar != null) {
                this.f55369o.mo64473C(aVar);
            }
            if (jVar == null) {
                this.f55373s = null;
                return;
            }
            C21487p pVar = new C21487p(jVar);
            this.f55373s = pVar;
            pVar.mo64057a(this);
            this.f55369o.mo64481i(this.f55372r);
        }
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f55371q) {
            this.f55248i.setColor(((C21473b) this.f55372r).mo64078p());
            C21466a<ColorFilter, ColorFilter> aVar = this.f55373s;
            if (aVar != null) {
                this.f55248i.setColorFilter(aVar.mo64064h());
            }
            super.mo64025g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f55370p;
    }
}
