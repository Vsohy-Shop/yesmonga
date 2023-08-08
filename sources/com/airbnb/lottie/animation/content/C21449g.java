package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21473b;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21569i;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.g */
public class C21449g implements C21447e, C21466a.C21468b, C21453k {

    /* renamed from: a */
    public final Path f55277a;

    /* renamed from: b */
    public final Paint f55278b = new C21439a(1);

    /* renamed from: c */
    public final C21578a f55279c;

    /* renamed from: d */
    public final String f55280d;

    /* renamed from: e */
    public final boolean f55281e;

    /* renamed from: f */
    public final List<C21457n> f55282f = new ArrayList();

    /* renamed from: g */
    public final C21466a<Integer, Integer> f55283g;

    /* renamed from: h */
    public final C21466a<Integer, Integer> f55284h;
    @C0363p0

    /* renamed from: i */
    public C21466a<ColorFilter, ColorFilter> f55285i;

    /* renamed from: j */
    public final C21516j f55286j;

    public C21449g(C21516j jVar, C21578a aVar, C21569i iVar) {
        Path path = new Path();
        this.f55277a = path;
        this.f55279c = aVar;
        this.f55280d = iVar.mo64415d();
        this.f55281e = iVar.mo64417f();
        this.f55286j = jVar;
        if (iVar.mo64413b() == null || iVar.mo64416e() == null) {
            this.f55283g = null;
            this.f55284h = null;
            return;
        }
        path.setFillType(iVar.mo64414c());
        C21466a<Integer, Integer> a = iVar.mo64413b().mo64300a();
        this.f55283g = a;
        a.mo64057a(this);
        aVar.mo64481i(a);
        C21466a<Integer, Integer> a2 = iVar.mo64416e().mo64300a();
        this.f55284h = a2;
        a2.mo64057a(this);
        aVar.mo64481i(a2);
    }

    /* renamed from: a */
    public void mo64019a() {
        this.f55286j.invalidateSelf();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C21445c cVar = list2.get(i);
            if (cVar instanceof C21457n) {
                this.f55282f.add((C21457n) cVar);
            }
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (t == C21601o.f55880a) {
            this.f55283g.mo64070n(jVar);
        } else if (t == C21601o.f55883d) {
            this.f55284h.mo64070n(jVar);
        } else if (t == C21601o.f55876E) {
            C21466a<ColorFilter, ColorFilter> aVar = this.f55285i;
            if (aVar != null) {
                this.f55279c.mo64473C(aVar);
            }
            if (jVar == null) {
                this.f55285i = null;
                return;
            }
            C21487p pVar = new C21487p(jVar);
            this.f55285i = pVar;
            pVar.mo64057a(this);
            this.f55279c.mo64481i(this.f55285i);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        this.f55277a.reset();
        for (int i = 0; i < this.f55282f.size(); i++) {
            this.f55277a.addPath(this.f55282f.get(i).getPath(), matrix);
        }
        this.f55277a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f55281e) {
            C21492e.m99017a("FillContent#draw");
            this.f55278b.setColor(((C21473b) this.f55283g).mo64078p());
            this.f55278b.setAlpha(C21685i.m99790d((int) ((((((float) i) / 255.0f) * ((float) this.f55284h.mo64064h().intValue())) / 100.0f) * 255.0f), 0, 255));
            C21466a<ColorFilter, ColorFilter> aVar = this.f55285i;
            if (aVar != null) {
                this.f55278b.setColorFilter(aVar.mo64064h());
            }
            this.f55277a.reset();
            for (int i2 = 0; i2 < this.f55282f.size(); i2++) {
                this.f55277a.addPath(this.f55282f.get(i2).getPath(), matrix);
            }
            canvas.drawPath(this.f55277a, this.f55278b);
            C21492e.m99018b("FillContent#draw");
        }
    }

    public String getName() {
        return this.f55280d;
    }
}
