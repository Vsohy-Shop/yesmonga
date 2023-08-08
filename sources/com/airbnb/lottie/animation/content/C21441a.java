package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.C0346i;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21474c;
import com.airbnb.lottie.animation.keyframe.C21476e;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.a */
public abstract class C21441a implements C21466a.C21468b, C21453k, C21447e {

    /* renamed from: a */
    public final PathMeasure f55240a = new PathMeasure();

    /* renamed from: b */
    public final Path f55241b = new Path();

    /* renamed from: c */
    public final Path f55242c = new Path();

    /* renamed from: d */
    public final RectF f55243d = new RectF();

    /* renamed from: e */
    public final C21516j f55244e;

    /* renamed from: f */
    public final C21578a f55245f;

    /* renamed from: g */
    public final List<C21443b> f55246g = new ArrayList();

    /* renamed from: h */
    public final float[] f55247h;

    /* renamed from: i */
    public final Paint f55248i;

    /* renamed from: j */
    public final C21466a<?, Float> f55249j;

    /* renamed from: k */
    public final C21466a<?, Integer> f55250k;

    /* renamed from: l */
    public final List<C21466a<?, Float>> f55251l;
    @C0363p0

    /* renamed from: m */
    public final C21466a<?, Float> f55252m;
    @C0363p0

    /* renamed from: n */
    public C21466a<ColorFilter, ColorFilter> f55253n;

    /* renamed from: com.airbnb.lottie.animation.content.a$b */
    public static final class C21443b {

        /* renamed from: a */
        public final List<C21457n> f55254a;
        @C0363p0

        /* renamed from: b */
        public final C21464t f55255b;

        public C21443b(@C0363p0 C21464t tVar) {
            this.f55254a = new ArrayList();
            this.f55255b = tVar;
        }
    }

    public C21441a(C21516j jVar, C21578a aVar, Paint.Cap cap, Paint.Join join, float f, C21546d dVar, C21544b bVar, List<C21544b> list, C21544b bVar2) {
        C21439a aVar2 = new C21439a(1);
        this.f55248i = aVar2;
        this.f55244e = jVar;
        this.f55245f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f55250k = dVar.mo64300a();
        this.f55249j = bVar.mo64300a();
        if (bVar2 == null) {
            this.f55252m = null;
        } else {
            this.f55252m = bVar2.mo64300a();
        }
        this.f55251l = new ArrayList(list.size());
        this.f55247h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f55251l.add(list.get(i).mo64300a());
        }
        aVar.mo64481i(this.f55250k);
        aVar.mo64481i(this.f55249j);
        for (int i2 = 0; i2 < this.f55251l.size(); i2++) {
            aVar.mo64481i(this.f55251l.get(i2));
        }
        C21466a<?, Float> aVar3 = this.f55252m;
        if (aVar3 != null) {
            aVar.mo64481i(aVar3);
        }
        this.f55250k.mo64057a(this);
        this.f55249j.mo64057a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f55251l.get(i3).mo64057a(this);
        }
        C21466a<?, Float> aVar4 = this.f55252m;
        if (aVar4 != null) {
            aVar4.mo64057a(this);
        }
    }

    /* renamed from: a */
    public void mo64019a() {
        this.f55244e.invalidateSelf();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        C21464t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C21445c cVar = list.get(size);
            if (cVar instanceof C21464t) {
                C21464t tVar2 = (C21464t) cVar;
                if (tVar2.mo64055i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.mo64051c(this);
        }
        C21443b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C21445c cVar2 = list2.get(size2);
            if (cVar2 instanceof C21464t) {
                C21464t tVar3 = (C21464t) cVar2;
                if (tVar3.mo64055i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f55246g.add(bVar);
                    }
                    bVar = new C21443b(tVar3);
                    tVar3.mo64051c(this);
                }
            }
            if (cVar2 instanceof C21457n) {
                if (bVar == null) {
                    bVar = new C21443b(tVar);
                }
                bVar.f55254a.add((C21457n) cVar2);
            }
        }
        if (bVar != null) {
            this.f55246g.add(bVar);
        }
    }

    @C0346i
    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (t == C21601o.f55883d) {
            this.f55250k.mo64070n(jVar);
        } else if (t == C21601o.f55896q) {
            this.f55249j.mo64070n(jVar);
        } else if (t == C21601o.f55876E) {
            C21466a<ColorFilter, ColorFilter> aVar = this.f55253n;
            if (aVar != null) {
                this.f55245f.mo64473C(aVar);
            }
            if (jVar == null) {
                this.f55253n = null;
                return;
            }
            C21487p pVar = new C21487p(jVar);
            this.f55253n = pVar;
            pVar.mo64057a(this);
            this.f55245f.mo64481i(this.f55253n);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        C21492e.m99017a("StrokeContent#getBounds");
        this.f55241b.reset();
        for (int i = 0; i < this.f55246g.size(); i++) {
            C21443b bVar = this.f55246g.get(i);
            for (int i2 = 0; i2 < bVar.f55254a.size(); i2++) {
                this.f55241b.addPath(((C21457n) bVar.f55254a.get(i2)).getPath(), matrix);
            }
        }
        this.f55241b.computeBounds(this.f55243d, false);
        float p = ((C21474c) this.f55249j).mo64081p();
        RectF rectF2 = this.f55243d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f55243d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C21492e.m99018b("StrokeContent#getBounds");
    }

    /* renamed from: f */
    public final void mo64024f(Matrix matrix) {
        float f;
        C21492e.m99017a("StrokeContent#applyDashPattern");
        if (this.f55251l.isEmpty()) {
            C21492e.m99018b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C21686j.m99806g(matrix);
        for (int i = 0; i < this.f55251l.size(); i++) {
            this.f55247h[i] = ((Float) this.f55251l.get(i).mo64064h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f55247h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f55247h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f55247h;
            fArr3[i] = fArr3[i] * g;
        }
        C21466a<?, Float> aVar = this.f55252m;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = g * aVar.mo64064h().floatValue();
        }
        this.f55248i.setPathEffect(new DashPathEffect(this.f55247h, f));
        C21492e.m99018b("StrokeContent#applyDashPattern");
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        C21492e.m99017a("StrokeContent#draw");
        if (C21686j.m99807h(matrix)) {
            C21492e.m99018b("StrokeContent#draw");
            return;
        }
        this.f55248i.setAlpha(C21685i.m99790d((int) ((((((float) i) / 255.0f) * ((float) ((C21476e) this.f55250k).mo64085p())) / 100.0f) * 255.0f), 0, 255));
        this.f55248i.setStrokeWidth(((C21474c) this.f55249j).mo64081p() * C21686j.m99806g(matrix));
        if (this.f55248i.getStrokeWidth() <= 0.0f) {
            C21492e.m99018b("StrokeContent#draw");
            return;
        }
        mo64024f(matrix);
        C21466a<ColorFilter, ColorFilter> aVar = this.f55253n;
        if (aVar != null) {
            this.f55248i.setColorFilter(aVar.mo64064h());
        }
        for (int i2 = 0; i2 < this.f55246g.size(); i2++) {
            C21443b bVar = this.f55246g.get(i2);
            if (bVar.f55255b != null) {
                mo64026h(canvas, bVar, matrix);
            } else {
                C21492e.m99017a("StrokeContent#buildPath");
                this.f55241b.reset();
                for (int size = bVar.f55254a.size() - 1; size >= 0; size--) {
                    this.f55241b.addPath(((C21457n) bVar.f55254a.get(size)).getPath(), matrix);
                }
                C21492e.m99018b("StrokeContent#buildPath");
                C21492e.m99017a("StrokeContent#drawPath");
                canvas.drawPath(this.f55241b, this.f55248i);
                C21492e.m99018b("StrokeContent#drawPath");
            }
        }
        C21492e.m99018b("StrokeContent#draw");
    }

    /* renamed from: h */
    public final void mo64026h(Canvas canvas, C21443b bVar, Matrix matrix) {
        float f;
        float f2;
        C21492e.m99017a("StrokeContent#applyTrimPath");
        if (bVar.f55255b == null) {
            C21492e.m99018b("StrokeContent#applyTrimPath");
            return;
        }
        this.f55241b.reset();
        for (int size = bVar.f55254a.size() - 1; size >= 0; size--) {
            this.f55241b.addPath(((C21457n) bVar.f55254a.get(size)).getPath(), matrix);
        }
        this.f55240a.setPath(this.f55241b, false);
        float length = this.f55240a.getLength();
        while (this.f55240a.nextContour()) {
            length += this.f55240a.getLength();
        }
        float floatValue = (bVar.f55255b.mo64053f().mo64064h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f55255b.mo64054h().mo64064h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f55255b.mo64052d().mo64064h().floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = bVar.f55254a.size() - 1; size2 >= 0; size2--) {
            this.f55242c.set(((C21457n) bVar.f55254a.get(size2)).getPath());
            this.f55242c.transform(matrix);
            this.f55240a.setPath(this.f55242c, false);
            float length2 = this.f55240a.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    if (floatValue2 > length) {
                        f2 = (floatValue2 - length) / length2;
                    } else {
                        f2 = 0.0f;
                    }
                    C21686j.m99800a(this.f55242c, f2, Math.min(f5 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f55242c, this.f55248i);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    if (floatValue2 < f3) {
                        f = 0.0f;
                    } else {
                        f = (floatValue2 - f3) / length2;
                    }
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    C21686j.m99800a(this.f55242c, f, f4, 0.0f);
                    canvas.drawPath(this.f55242c, this.f55248i);
                } else {
                    canvas.drawPath(this.f55242c, this.f55248i);
                }
            }
            f3 += length2;
        }
        C21492e.m99018b("StrokeContent#applyTrimPath");
    }
}
