package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.C0379x;
import com.airbnb.lottie.model.C21542a;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21685i;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.content.h */
public class C21568h {

    /* renamed from: a */
    public final List<C21542a> f55725a;

    /* renamed from: b */
    public PointF f55726b;

    /* renamed from: c */
    public boolean f55727c;

    public C21568h(PointF pointF, boolean z, List<C21542a> list) {
        this.f55726b = pointF;
        this.f55727c = z;
        this.f55725a = new ArrayList(list);
    }

    /* renamed from: a */
    public List<C21542a> mo64407a() {
        return this.f55725a;
    }

    /* renamed from: b */
    public PointF mo64408b() {
        return this.f55726b;
    }

    /* renamed from: c */
    public void mo64409c(C21568h hVar, C21568h hVar2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        boolean z;
        if (this.f55726b == null) {
            this.f55726b = new PointF();
        }
        if (hVar.mo64410d() || hVar2.mo64410d()) {
            z = true;
        } else {
            z = false;
        }
        this.f55727c = z;
        if (hVar.mo64407a().size() != hVar2.mo64407a().size()) {
            C21682f.m99760e("Curves must have the same number of control points. Shape 1: " + hVar.mo64407a().size() + "\tShape 2: " + hVar2.mo64407a().size());
        }
        int min = Math.min(hVar.mo64407a().size(), hVar2.mo64407a().size());
        if (this.f55725a.size() < min) {
            for (int size = this.f55725a.size(); size < min; size++) {
                this.f55725a.add(new C21542a());
            }
        } else if (this.f55725a.size() > min) {
            for (int size2 = this.f55725a.size() - 1; size2 >= min; size2--) {
                List<C21542a> list = this.f55725a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = hVar.mo64408b();
        PointF b2 = hVar2.mo64408b();
        mo64411e(C21685i.m99797k(b.x, b2.x, f), C21685i.m99797k(b.y, b2.y, f));
        for (int size3 = this.f55725a.size() - 1; size3 >= 0; size3--) {
            C21542a aVar = hVar.mo64407a().get(size3);
            C21542a aVar2 = hVar2.mo64407a().get(size3);
            PointF a = aVar.mo64294a();
            PointF b3 = aVar.mo64295b();
            PointF c = aVar.mo64296c();
            PointF a2 = aVar2.mo64294a();
            PointF b4 = aVar2.mo64295b();
            PointF c2 = aVar2.mo64296c();
            this.f55725a.get(size3).mo64297d(C21685i.m99797k(a.x, a2.x, f), C21685i.m99797k(a.y, a2.y, f));
            this.f55725a.get(size3).mo64298e(C21685i.m99797k(b3.x, b4.x, f), C21685i.m99797k(b3.y, b4.y, f));
            this.f55725a.get(size3).mo64299f(C21685i.m99797k(c.x, c2.x, f), C21685i.m99797k(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo64410d() {
        return this.f55727c;
    }

    /* renamed from: e */
    public final void mo64411e(float f, float f2) {
        if (this.f55726b == null) {
            this.f55726b = new PointF();
        }
        this.f55726b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f55725a.size() + "closed=" + this.f55727c + C12361b.f30259j;
    }

    public C21568h() {
        this.f55725a = new ArrayList();
    }
}
