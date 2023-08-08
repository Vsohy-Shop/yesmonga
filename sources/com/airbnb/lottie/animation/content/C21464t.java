package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.t */
public class C21464t implements C21445c, C21466a.C21468b {

    /* renamed from: a */
    public final String f55374a;

    /* renamed from: b */
    public final boolean f55375b;

    /* renamed from: c */
    public final List<C21466a.C21468b> f55376c = new ArrayList();

    /* renamed from: d */
    public final ShapeTrimPath.Type f55377d;

    /* renamed from: e */
    public final C21466a<?, Float> f55378e;

    /* renamed from: f */
    public final C21466a<?, Float> f55379f;

    /* renamed from: g */
    public final C21466a<?, Float> f55380g;

    public C21464t(C21578a aVar, ShapeTrimPath shapeTrimPath) {
        this.f55374a = shapeTrimPath.mo64358c();
        this.f55375b = shapeTrimPath.mo64362g();
        this.f55377d = shapeTrimPath.mo64361f();
        C21466a<Float, Float> a = shapeTrimPath.mo64360e().mo64300a();
        this.f55378e = a;
        C21466a<Float, Float> a2 = shapeTrimPath.mo64357b().mo64300a();
        this.f55379f = a2;
        C21466a<Float, Float> a3 = shapeTrimPath.mo64359d().mo64300a();
        this.f55380g = a3;
        aVar.mo64481i(a);
        aVar.mo64481i(a2);
        aVar.mo64481i(a3);
        a.mo64057a(this);
        a2.mo64057a(this);
        a3.mo64057a(this);
    }

    /* renamed from: a */
    public void mo64019a() {
        for (int i = 0; i < this.f55376c.size(); i++) {
            this.f55376c.get(i).mo64019a();
        }
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
    }

    /* renamed from: c */
    public void mo64051c(C21466a.C21468b bVar) {
        this.f55376c.add(bVar);
    }

    /* renamed from: d */
    public C21466a<?, Float> mo64052d() {
        return this.f55379f;
    }

    /* renamed from: f */
    public C21466a<?, Float> mo64053f() {
        return this.f55380g;
    }

    public String getName() {
        return this.f55374a;
    }

    /* renamed from: h */
    public C21466a<?, Float> mo64054h() {
        return this.f55378e;
    }

    /* renamed from: i */
    public ShapeTrimPath.Type mo64055i() {
        return this.f55377d;
    }

    /* renamed from: j */
    public boolean mo64056j() {
        return this.f55375b;
    }
}
