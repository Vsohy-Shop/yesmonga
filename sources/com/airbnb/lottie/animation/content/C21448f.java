package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21561a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.f */
public class C21448f implements C21457n, C21466a.C21468b, C21453k {

    /* renamed from: i */
    public static final float f55268i = 0.55228f;

    /* renamed from: a */
    public final Path f55269a = new Path();

    /* renamed from: b */
    public final String f55270b;

    /* renamed from: c */
    public final C21516j f55271c;

    /* renamed from: d */
    public final C21466a<?, PointF> f55272d;

    /* renamed from: e */
    public final C21466a<?, PointF> f55273e;

    /* renamed from: f */
    public final C21561a f55274f;

    /* renamed from: g */
    public C21444b f55275g = new C21444b();

    /* renamed from: h */
    public boolean f55276h;

    public C21448f(C21516j jVar, C21578a aVar, C21561a aVar2) {
        this.f55270b = aVar2.mo64364b();
        this.f55271c = jVar;
        C21466a<PointF, PointF> a = aVar2.mo64366d().mo64300a();
        this.f55272d = a;
        C21466a<PointF, PointF> a2 = aVar2.mo64365c().mo64300a();
        this.f55273e = a2;
        this.f55274f = aVar2;
        aVar.mo64481i(a);
        aVar.mo64481i(a2);
        a.mo64057a(this);
        a2.mo64057a(this);
    }

    /* renamed from: a */
    public void mo64019a() {
        mo64034f();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C21445c cVar = list.get(i);
            if (cVar instanceof C21464t) {
                C21464t tVar = (C21464t) cVar;
                if (tVar.mo64055i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f55275g.mo64027a(tVar);
                    tVar.mo64051c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (t == C21601o.f55888i) {
            this.f55272d.mo64070n(jVar);
        } else if (t == C21601o.f55891l) {
            this.f55273e.mo64070n(jVar);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: f */
    public final void mo64034f() {
        this.f55276h = false;
        this.f55271c.invalidateSelf();
    }

    public String getName() {
        return this.f55270b;
    }

    public Path getPath() {
        if (this.f55276h) {
            return this.f55269a;
        }
        this.f55269a.reset();
        if (this.f55274f.mo64367e()) {
            this.f55276h = true;
            return this.f55269a;
        }
        PointF h = this.f55272d.mo64064h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f55269a.reset();
        if (this.f55274f.mo64368f()) {
            float f5 = -f2;
            this.f55269a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f55269a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f55269a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f55269a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f55269a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f55269a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f55269a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f55269a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f55269a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f55269a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF h2 = this.f55273e.mo64064h();
        this.f55269a.offset(h2.x, h2.y);
        this.f55269a.close();
        this.f55275g.mo64028b(this.f55269a);
        this.f55276h = true;
        return this.f55269a;
    }
}
