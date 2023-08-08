package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.value.C21702j;

/* renamed from: com.airbnb.lottie.model.layer.f */
public class C21586f extends C21578a {

    /* renamed from: D */
    public final RectF f55835D = new RectF();

    /* renamed from: E */
    public final Paint f55836E;

    /* renamed from: F */
    public final float[] f55837F;

    /* renamed from: G */
    public final Path f55838G;

    /* renamed from: H */
    public final Layer f55839H;
    @C0363p0

    /* renamed from: I */
    public C21466a<ColorFilter, ColorFilter> f55840I;

    public C21586f(C21516j jVar, Layer layer) {
        super(jVar, layer);
        C21439a aVar = new C21439a();
        this.f55836E = aVar;
        this.f55837F = new float[8];
        this.f55838G = new Path();
        this.f55839H = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.mo64459m());
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t != C21601o.f55876E) {
            return;
        }
        if (jVar == null) {
            this.f55840I = null;
        } else {
            this.f55840I = new C21487p(jVar);
        }
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        super.mo64023e(rectF, matrix, z);
        this.f55835D.set(0.0f, 0.0f, (float) this.f55839H.mo64461o(), (float) this.f55839H.mo64460n());
        this.f55805m.mapRect(this.f55835D);
        rectF.set(this.f55835D);
    }

    /* renamed from: t */
    public void mo64492t(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f55839H.mo64459m());
        if (alpha != 0) {
            if (this.f55814v.mo64110h() == null) {
                i2 = 100;
            } else {
                i2 = this.f55814v.mo64110h().mo64064h().intValue();
            }
            int i3 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
            this.f55836E.setAlpha(i3);
            C21466a<ColorFilter, ColorFilter> aVar = this.f55840I;
            if (aVar != null) {
                this.f55836E.setColorFilter(aVar.mo64064h());
            }
            if (i3 > 0) {
                float[] fArr = this.f55837F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f55839H.mo64461o();
                float[] fArr2 = this.f55837F;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f55839H.mo64461o();
                this.f55837F[5] = (float) this.f55839H.mo64460n();
                float[] fArr3 = this.f55837F;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f55839H.mo64460n();
                matrix.mapPoints(this.f55837F);
                this.f55838G.reset();
                Path path = this.f55838G;
                float[] fArr4 = this.f55837F;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f55838G;
                float[] fArr5 = this.f55837F;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f55838G;
                float[] fArr6 = this.f55837F;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f55838G;
                float[] fArr7 = this.f55837F;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f55838G;
                float[] fArr8 = this.f55837F;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f55838G.close();
                canvas.drawPath(this.f55838G, this.f55836E);
            }
        }
    }
}
