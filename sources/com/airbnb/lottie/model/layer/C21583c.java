package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;

/* renamed from: com.airbnb.lottie.model.layer.c */
public class C21583c extends C21578a {

    /* renamed from: D */
    public final Paint f55829D = new C21439a(3);

    /* renamed from: E */
    public final Rect f55830E = new Rect();

    /* renamed from: F */
    public final Rect f55831F = new Rect();
    @C0363p0

    /* renamed from: G */
    public C21466a<ColorFilter, ColorFilter> f55832G;
    @C0363p0

    /* renamed from: H */
    public C21466a<Bitmap, Bitmap> f55833H;

    public C21583c(C21516j jVar, Layer layer) {
        super(jVar, layer);
    }

    @C0363p0
    /* renamed from: K */
    public final Bitmap mo64500K() {
        Bitmap h;
        C21466a<Bitmap, Bitmap> aVar = this.f55833H;
        if (aVar != null && (h = aVar.mo64064h()) != null) {
            return h;
        }
        return this.f55806n.mo64175C(this.f55807o.mo64457k());
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t == C21601o.f55876E) {
            if (jVar == null) {
                this.f55832G = null;
            } else {
                this.f55832G = new C21487p(jVar);
            }
        } else if (t != C21601o.f55879H) {
        } else {
            if (jVar == null) {
                this.f55833H = null;
            } else {
                this.f55833H = new C21487p(jVar);
            }
        }
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        super.mo64023e(rectF, matrix, z);
        Bitmap K = mo64500K();
        if (K != null) {
            rectF.set(0.0f, 0.0f, ((float) K.getWidth()) * C21686j.m99804e(), ((float) K.getHeight()) * C21686j.m99804e());
            this.f55805m.mapRect(rectF);
        }
    }

    /* renamed from: t */
    public void mo64492t(@C0359n0 Canvas canvas, Matrix matrix, int i) {
        Bitmap K = mo64500K();
        if (K != null && !K.isRecycled()) {
            float e = C21686j.m99804e();
            this.f55829D.setAlpha(i);
            C21466a<ColorFilter, ColorFilter> aVar = this.f55832G;
            if (aVar != null) {
                this.f55829D.setColorFilter(aVar.mo64064h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f55830E.set(0, 0, K.getWidth(), K.getHeight());
            this.f55831F.set(0, 0, (int) (((float) K.getWidth()) * e), (int) (((float) K.getHeight()) * e));
            canvas.drawBitmap(K, this.f55830E, this.f55831F, this.f55829D);
            canvas.restore();
        }
    }
}
