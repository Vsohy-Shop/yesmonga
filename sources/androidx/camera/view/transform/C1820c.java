package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1353a2;
import androidx.camera.view.C1803j0;
import androidx.camera.view.C1805k0;

@C1803j0
/* renamed from: androidx.camera.view.transform.c */
public final class C1820c {

    /* renamed from: a */
    public boolean f5004a;

    /* renamed from: b */
    public boolean f5005b;

    /* renamed from: c */
    public static RectF m7254c(RectF rectF, int i) {
        if (C1805k0.m7198e(i)) {
            return new RectF(0.0f, 0.0f, rectF.height(), rectF.width());
        }
        return new RectF(0.0f, 0.0f, rectF.width(), rectF.height());
    }

    /* renamed from: a */
    public final RectF mo5988a(@C0359n0 C1353a2 a2Var) {
        if (this.f5004a) {
            return new RectF(a2Var.mo4973I2());
        }
        return new RectF(0.0f, 0.0f, (float) a2Var.getWidth(), (float) a2Var.getHeight());
    }

    @C0359n0
    /* renamed from: b */
    public C1821d mo5989b(@C0359n0 C1353a2 a2Var) {
        int d = mo5990d(a2Var);
        RectF a = mo5988a(a2Var);
        Matrix d2 = C1805k0.m7197d(a, m7254c(a, d), d);
        d2.preConcat(C1805k0.m7195b(a2Var.mo4973I2()));
        return new C1821d(d2, C1805k0.m7202i(a2Var.mo4973I2()));
    }

    /* renamed from: d */
    public final int mo5990d(@C0359n0 C1353a2 a2Var) {
        if (this.f5005b) {
            return a2Var.mo4977q3().mo5102c();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo5991e() {
        return this.f5004a;
    }

    /* renamed from: f */
    public boolean mo5992f() {
        return this.f5005b;
    }

    /* renamed from: g */
    public void mo5993g(boolean z) {
        this.f5004a = z;
    }

    /* renamed from: h */
    public void mo5994h(boolean z) {
        this.f5005b = z;
    }
}
