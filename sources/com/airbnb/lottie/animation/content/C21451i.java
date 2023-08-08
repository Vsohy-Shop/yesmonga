package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.C0363p0;
import androidx.collection.C1875h;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.content.C21563c;
import com.airbnb.lottie.model.content.C21565e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.value.C21702j;

/* renamed from: com.airbnb.lottie.animation.content.i */
public class C21451i extends C21441a {

    /* renamed from: z */
    public static final int f55306z = 32;

    /* renamed from: o */
    public final String f55307o;

    /* renamed from: p */
    public final boolean f55308p;

    /* renamed from: q */
    public final C1875h<LinearGradient> f55309q = new C1875h<>();

    /* renamed from: r */
    public final C1875h<RadialGradient> f55310r = new C1875h<>();

    /* renamed from: s */
    public final RectF f55311s = new RectF();

    /* renamed from: t */
    public final GradientType f55312t;

    /* renamed from: u */
    public final int f55313u;

    /* renamed from: v */
    public final C21466a<C21563c, C21563c> f55314v;

    /* renamed from: w */
    public final C21466a<PointF, PointF> f55315w;

    /* renamed from: x */
    public final C21466a<PointF, PointF> f55316x;
    @C0363p0

    /* renamed from: y */
    public C21487p f55317y;

    public C21451i(C21516j jVar, C21578a aVar, C21565e eVar) {
        super(jVar, aVar, eVar.mo64383b().mo64355g(), eVar.mo64388g().mo64356g(), eVar.mo64390i(), eVar.mo64392k(), eVar.mo64394m(), eVar.mo64389h(), eVar.mo64384c());
        this.f55307o = eVar.mo64391j();
        this.f55312t = eVar.mo64387f();
        this.f55308p = eVar.mo64395n();
        this.f55313u = (int) (jVar.mo64264y().mo64121d() / 32.0f);
        C21466a<C21563c, C21563c> a = eVar.mo64386e().mo64300a();
        this.f55314v = a;
        a.mo64057a(this);
        aVar.mo64481i(a);
        C21466a<PointF, PointF> a2 = eVar.mo64393l().mo64300a();
        this.f55315w = a2;
        a2.mo64057a(this);
        aVar.mo64481i(a2);
        C21466a<PointF, PointF> a3 = eVar.mo64385d().mo64300a();
        this.f55316x = a3;
        a3.mo64057a(this);
        aVar.mo64481i(a3);
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t == C21601o.f55877F) {
            C21487p pVar = this.f55317y;
            if (pVar != null) {
                this.f55245f.mo64473C(pVar);
            }
            if (jVar == null) {
                this.f55317y = null;
                return;
            }
            C21487p pVar2 = new C21487p(jVar);
            this.f55317y = pVar2;
            pVar2.mo64057a(this);
            this.f55245f.mo64481i(this.f55317y);
        }
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f55308p) {
            mo64023e(this.f55311s, matrix, false);
            if (this.f55312t == GradientType.LINEAR) {
                shader = mo64041k();
            } else {
                shader = mo64042l();
            }
            shader.setLocalMatrix(matrix);
            this.f55248i.setShader(shader);
            super.mo64025g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f55307o;
    }

    /* renamed from: i */
    public final int[] mo64039i(int[] iArr) {
        C21487p pVar = this.f55317y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo64064h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: j */
    public final int mo64040j() {
        int i;
        int round = Math.round(this.f55315w.mo64062f() * ((float) this.f55313u));
        int round2 = Math.round(this.f55316x.mo64062f() * ((float) this.f55313u));
        int round3 = Math.round(this.f55314v.mo64062f() * ((float) this.f55313u));
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: k */
    public final LinearGradient mo64041k() {
        long j = (long) mo64040j();
        LinearGradient k = this.f55309q.mo6223k(j);
        if (k != null) {
            return k;
        }
        PointF h = this.f55315w.mo64064h();
        PointF h2 = this.f55316x.mo64064h();
        C21563c h3 = this.f55314v.mo64064h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, mo64039i(h3.mo64369a()), h3.mo64370b(), Shader.TileMode.CLAMP);
        this.f55309q.mo6229t(j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    public final RadialGradient mo64042l() {
        long j = (long) mo64040j();
        RadialGradient k = this.f55310r.mo6223k(j);
        if (k != null) {
            return k;
        }
        PointF h = this.f55315w.mo64064h();
        PointF h2 = this.f55316x.mo64064h();
        C21563c h3 = this.f55314v.mo64064h();
        int[] i = mo64039i(h3.mo64369a());
        float[] b = h3.mo64370b();
        float f = h.x;
        float f2 = h.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2)), i, b, Shader.TileMode.CLAMP);
        this.f55310r.mo6229t(j, radialGradient);
        return radialGradient;
    }
}
