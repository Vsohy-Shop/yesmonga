package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1875h;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21563c;
import com.airbnb.lottie.model.content.C21564d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.h */
public class C21450h implements C21447e, C21466a.C21468b, C21453k {

    /* renamed from: s */
    public static final int f55287s = 32;
    @C0359n0

    /* renamed from: a */
    public final String f55288a;

    /* renamed from: b */
    public final boolean f55289b;

    /* renamed from: c */
    public final C21578a f55290c;

    /* renamed from: d */
    public final C1875h<LinearGradient> f55291d = new C1875h<>();

    /* renamed from: e */
    public final C1875h<RadialGradient> f55292e = new C1875h<>();

    /* renamed from: f */
    public final Path f55293f;

    /* renamed from: g */
    public final Paint f55294g;

    /* renamed from: h */
    public final RectF f55295h;

    /* renamed from: i */
    public final List<C21457n> f55296i;

    /* renamed from: j */
    public final GradientType f55297j;

    /* renamed from: k */
    public final C21466a<C21563c, C21563c> f55298k;

    /* renamed from: l */
    public final C21466a<Integer, Integer> f55299l;

    /* renamed from: m */
    public final C21466a<PointF, PointF> f55300m;

    /* renamed from: n */
    public final C21466a<PointF, PointF> f55301n;
    @C0363p0

    /* renamed from: o */
    public C21466a<ColorFilter, ColorFilter> f55302o;
    @C0363p0

    /* renamed from: p */
    public C21487p f55303p;

    /* renamed from: q */
    public final C21516j f55304q;

    /* renamed from: r */
    public final int f55305r;

    public C21450h(C21516j jVar, C21578a aVar, C21564d dVar) {
        Path path = new Path();
        this.f55293f = path;
        this.f55294g = new C21439a(1);
        this.f55295h = new RectF();
        this.f55296i = new ArrayList();
        this.f55290c = aVar;
        this.f55288a = dVar.mo64379h();
        this.f55289b = dVar.mo64382k();
        this.f55304q = jVar;
        this.f55297j = dVar.mo64376e();
        path.setFillType(dVar.mo64374c());
        this.f55305r = (int) (jVar.mo64264y().mo64121d() / 32.0f);
        C21466a<C21563c, C21563c> a = dVar.mo64375d().mo64300a();
        this.f55298k = a;
        a.mo64057a(this);
        aVar.mo64481i(a);
        C21466a<Integer, Integer> a2 = dVar.mo64380i().mo64300a();
        this.f55299l = a2;
        a2.mo64057a(this);
        aVar.mo64481i(a2);
        C21466a<PointF, PointF> a3 = dVar.mo64381j().mo64300a();
        this.f55300m = a3;
        a3.mo64057a(this);
        aVar.mo64481i(a3);
        C21466a<PointF, PointF> a4 = dVar.mo64373b().mo64300a();
        this.f55301n = a4;
        a4.mo64057a(this);
        aVar.mo64481i(a4);
    }

    /* renamed from: a */
    public void mo64019a() {
        this.f55304q.invalidateSelf();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C21445c cVar = list2.get(i);
            if (cVar instanceof C21457n) {
                this.f55296i.add((C21457n) cVar);
            }
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (t == C21601o.f55883d) {
            this.f55299l.mo64070n(jVar);
        } else if (t == C21601o.f55876E) {
            C21466a<ColorFilter, ColorFilter> aVar = this.f55302o;
            if (aVar != null) {
                this.f55290c.mo64473C(aVar);
            }
            if (jVar == null) {
                this.f55302o = null;
                return;
            }
            C21487p pVar = new C21487p(jVar);
            this.f55302o = pVar;
            pVar.mo64057a(this);
            this.f55290c.mo64481i(this.f55302o);
        } else if (t == C21601o.f55877F) {
            C21487p pVar2 = this.f55303p;
            if (pVar2 != null) {
                this.f55290c.mo64473C(pVar2);
            }
            if (jVar == null) {
                this.f55303p = null;
                return;
            }
            this.f55291d.mo6216c();
            this.f55292e.mo6216c();
            C21487p pVar3 = new C21487p(jVar);
            this.f55303p = pVar3;
            pVar3.mo64057a(this);
            this.f55290c.mo64481i(this.f55303p);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        this.f55293f.reset();
        for (int i = 0; i < this.f55296i.size(); i++) {
            this.f55293f.addPath(this.f55296i.get(i).getPath(), matrix);
        }
        this.f55293f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public final int[] mo64035f(int[] iArr) {
        C21487p pVar = this.f55303p;
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

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f55289b) {
            C21492e.m99017a("GradientFillContent#draw");
            this.f55293f.reset();
            for (int i2 = 0; i2 < this.f55296i.size(); i2++) {
                this.f55293f.addPath(this.f55296i.get(i2).getPath(), matrix);
            }
            this.f55293f.computeBounds(this.f55295h, false);
            if (this.f55297j == GradientType.LINEAR) {
                shader = mo64037i();
            } else {
                shader = mo64038j();
            }
            shader.setLocalMatrix(matrix);
            this.f55294g.setShader(shader);
            C21466a<ColorFilter, ColorFilter> aVar = this.f55302o;
            if (aVar != null) {
                this.f55294g.setColorFilter(aVar.mo64064h());
            }
            this.f55294g.setAlpha(C21685i.m99790d((int) ((((((float) i) / 255.0f) * ((float) this.f55299l.mo64064h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f55293f, this.f55294g);
            C21492e.m99018b("GradientFillContent#draw");
        }
    }

    public String getName() {
        return this.f55288a;
    }

    /* renamed from: h */
    public final int mo64036h() {
        int i;
        int round = Math.round(this.f55300m.mo64062f() * ((float) this.f55305r));
        int round2 = Math.round(this.f55301n.mo64062f() * ((float) this.f55305r));
        int round3 = Math.round(this.f55298k.mo64062f() * ((float) this.f55305r));
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

    /* renamed from: i */
    public final LinearGradient mo64037i() {
        long h = (long) mo64036h();
        LinearGradient k = this.f55291d.mo6223k(h);
        if (k != null) {
            return k;
        }
        PointF h2 = this.f55300m.mo64064h();
        PointF h3 = this.f55301n.mo64064h();
        C21563c h4 = this.f55298k.mo64064h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, mo64035f(h4.mo64369a()), h4.mo64370b(), Shader.TileMode.CLAMP);
        this.f55291d.mo6229t(h, linearGradient);
        return linearGradient;
    }

    /* renamed from: j */
    public final RadialGradient mo64038j() {
        long h = (long) mo64036h();
        RadialGradient k = this.f55292e.mo6223k(h);
        if (k != null) {
            return k;
        }
        PointF h2 = this.f55300m.mo64064h();
        PointF h3 = this.f55301n.mo64064h();
        C21563c h4 = this.f55298k.mo64064h();
        int[] f = mo64035f(h4.mo64369a());
        float[] b = h4.mo64370b();
        float f2 = h2.x;
        float f3 = h2.y;
        float hypot = (float) Math.hypot((double) (h3.x - f2), (double) (h3.y - f3));
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f2, f3, hypot, f, b, Shader.TileMode.CLAMP);
        this.f55292e.mo6229t(h, radialGradient);
        return radialGradient;
    }
}
