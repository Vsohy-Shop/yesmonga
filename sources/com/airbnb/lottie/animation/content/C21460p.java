package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21474c;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21566f;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.p */
public class C21460p implements C21466a.C21468b, C21453k, C21457n {

    /* renamed from: a */
    public final Path f55342a = new Path();

    /* renamed from: b */
    public final RectF f55343b = new RectF();

    /* renamed from: c */
    public final String f55344c;

    /* renamed from: d */
    public final boolean f55345d;

    /* renamed from: e */
    public final C21516j f55346e;

    /* renamed from: f */
    public final C21466a<?, PointF> f55347f;

    /* renamed from: g */
    public final C21466a<?, PointF> f55348g;

    /* renamed from: h */
    public final C21466a<?, Float> f55349h;

    /* renamed from: i */
    public C21444b f55350i = new C21444b();

    /* renamed from: j */
    public boolean f55351j;

    public C21460p(C21516j jVar, C21578a aVar, C21566f fVar) {
        this.f55344c = fVar.mo64397c();
        this.f55345d = fVar.mo64400f();
        this.f55346e = jVar;
        C21466a<PointF, PointF> a = fVar.mo64398d().mo64300a();
        this.f55347f = a;
        C21466a<PointF, PointF> a2 = fVar.mo64399e().mo64300a();
        this.f55348g = a2;
        C21466a<Float, Float> a3 = fVar.mo64396b().mo64300a();
        this.f55349h = a3;
        aVar.mo64481i(a);
        aVar.mo64481i(a2);
        aVar.mo64481i(a3);
        a.mo64057a(this);
        a2.mo64057a(this);
        a3.mo64057a(this);
    }

    /* renamed from: a */
    public void mo64019a() {
        mo64049f();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C21445c cVar = list.get(i);
            if (cVar instanceof C21464t) {
                C21464t tVar = (C21464t) cVar;
                if (tVar.mo64055i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f55350i.mo64027a(tVar);
                    tVar.mo64051c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (t == C21601o.f55889j) {
            this.f55348g.mo64070n(jVar);
        } else if (t == C21601o.f55891l) {
            this.f55347f.mo64070n(jVar);
        } else if (t == C21601o.f55890k) {
            this.f55349h.mo64070n(jVar);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: f */
    public final void mo64049f() {
        this.f55351j = false;
        this.f55346e.invalidateSelf();
    }

    public String getName() {
        return this.f55344c;
    }

    public Path getPath() {
        float f;
        if (this.f55351j) {
            return this.f55342a;
        }
        this.f55342a.reset();
        if (this.f55345d) {
            this.f55351j = true;
            return this.f55342a;
        }
        PointF h = this.f55348g.mo64064h();
        float f2 = h.x / 2.0f;
        float f3 = h.y / 2.0f;
        C21466a<?, Float> aVar = this.f55349h;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = ((C21474c) aVar).mo64081p();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF h2 = this.f55347f.mo64064h();
        this.f55342a.moveTo(h2.x + f2, (h2.y - f3) + f);
        this.f55342a.lineTo(h2.x + f2, (h2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f55343b;
            float f4 = h2.x;
            float f5 = f * 2.0f;
            float f6 = h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f55342a.arcTo(this.f55343b, 0.0f, 90.0f, false);
        }
        this.f55342a.lineTo((h2.x - f2) + f, h2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f55343b;
            float f7 = h2.x;
            float f8 = h2.y;
            float f9 = f * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f55342a.arcTo(this.f55343b, 90.0f, 90.0f, false);
        }
        this.f55342a.lineTo(h2.x - f2, (h2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f55343b;
            float f10 = h2.x;
            float f11 = h2.y;
            float f12 = f * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f55342a.arcTo(this.f55343b, 180.0f, 90.0f, false);
        }
        this.f55342a.lineTo((h2.x + f2) - f, h2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f55343b;
            float f13 = h2.x;
            float f14 = f * 2.0f;
            float f15 = h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f55342a.arcTo(this.f55343b, 270.0f, 90.0f, false);
        }
        this.f55342a.close();
        this.f55350i.mo64028b(this.f55342a);
        this.f55351j = true;
        return this.f55342a;
    }
}
