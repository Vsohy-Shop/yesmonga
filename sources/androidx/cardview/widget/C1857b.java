package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.cardview.widget.b */
public class C1857b implements C1861e {
    /* renamed from: a */
    public void mo6071a(C1860d dVar, float f) {
        mo6085p(dVar).mo6098h(f);
    }

    /* renamed from: b */
    public float mo6072b(C1860d dVar) {
        return mo6085p(dVar).mo6091d();
    }

    /* renamed from: c */
    public void mo6073c(C1860d dVar, float f) {
        dVar.mo6068g().setElevation(f);
    }

    /* renamed from: d */
    public float mo6074d(C1860d dVar) {
        return mo6085p(dVar).mo6090c();
    }

    /* renamed from: e */
    public ColorStateList mo6075e(C1860d dVar) {
        return mo6085p(dVar).mo6089b();
    }

    /* renamed from: f */
    public float mo6076f(C1860d dVar) {
        return mo6072b(dVar) * 2.0f;
    }

    /* renamed from: g */
    public void mo6077g(C1860d dVar) {
        mo6084o(dVar, mo6074d(dVar));
    }

    /* renamed from: h */
    public void mo6078h(C1860d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo6063b(new C1862f(colorStateList, f));
        View g = dVar.mo6068g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        mo6084o(dVar, f3);
    }

    /* renamed from: i */
    public float mo6079i(C1860d dVar) {
        return dVar.mo6068g().getElevation();
    }

    /* renamed from: j */
    public void mo6080j(C1860d dVar) {
        mo6084o(dVar, mo6074d(dVar));
    }

    /* renamed from: k */
    public void mo6081k(C1860d dVar) {
        if (!dVar.mo6064c()) {
            dVar.mo6062a(0, 0, 0, 0);
            return;
        }
        float d = mo6074d(dVar);
        float b = mo6072b(dVar);
        int ceil = (int) Math.ceil((double) C1863g.m7403c(d, b, dVar.mo6067f()));
        int ceil2 = (int) Math.ceil((double) C1863g.m7404d(d, b, dVar.mo6067f()));
        dVar.mo6062a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: l */
    public void mo6069l() {
    }

    /* renamed from: m */
    public float mo6082m(C1860d dVar) {
        return mo6072b(dVar) * 2.0f;
    }

    /* renamed from: n */
    public void mo6083n(C1860d dVar, @C0363p0 ColorStateList colorStateList) {
        mo6085p(dVar).mo6094f(colorStateList);
    }

    /* renamed from: o */
    public void mo6084o(C1860d dVar, float f) {
        mo6085p(dVar).mo6095g(f, dVar.mo6064c(), dVar.mo6067f());
        mo6081k(dVar);
    }

    /* renamed from: p */
    public final C1862f mo6085p(C1860d dVar) {
        return (C1862f) dVar.mo6065d();
    }
}
