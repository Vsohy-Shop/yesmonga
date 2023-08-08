package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

/* renamed from: com.google.android.material.shape.p */
public class C31538p {

    /* renamed from: a */
    public final C31542q[] f76443a = new C31542q[4];

    /* renamed from: b */
    public final Matrix[] f76444b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f76445c = new Matrix[4];

    /* renamed from: d */
    public final PointF f76446d = new PointF();

    /* renamed from: e */
    public final Path f76447e = new Path();

    /* renamed from: f */
    public final Path f76448f = new Path();

    /* renamed from: g */
    public final C31542q f76449g = new C31542q();

    /* renamed from: h */
    public final float[] f76450h = new float[2];

    /* renamed from: i */
    public final float[] f76451i = new float[2];

    /* renamed from: j */
    public final Path f76452j = new Path();

    /* renamed from: k */
    public final Path f76453k = new Path();

    /* renamed from: l */
    public boolean f76454l = true;

    /* renamed from: com.google.android.material.shape.p$a */
    public static class C31539a {

        /* renamed from: a */
        public static final C31538p f76455a = new C31538p();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.shape.p$b */
    public interface C31540b {
        /* renamed from: a */
        void mo90801a(C31542q qVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo90802b(C31542q qVar, Matrix matrix, int i);
    }

    /* renamed from: com.google.android.material.shape.p$c */
    public static final class C31541c {
        @C0359n0

        /* renamed from: a */
        public final C31534o f76456a;
        @C0359n0

        /* renamed from: b */
        public final Path f76457b;
        @C0359n0

        /* renamed from: c */
        public final RectF f76458c;
        @C0363p0

        /* renamed from: d */
        public final C31540b f76459d;

        /* renamed from: e */
        public final float f76460e;

        public C31541c(@C0359n0 C31534o oVar, float f, RectF rectF, @C0363p0 C31540b bVar, Path path) {
            this.f76459d = bVar;
            this.f76456a = oVar;
            this.f76460e = f;
            this.f76458c = rectF;
            this.f76457b = path;
        }
    }

    public C31538p() {
        for (int i = 0; i < 4; i++) {
            this.f76443a[i] = new C31542q();
            this.f76444b[i] = new Matrix();
            this.f76445c[i] = new Matrix();
        }
    }

    @C0341g1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public static C31538p m127630k() {
        return C31539a.f76455a;
    }

    /* renamed from: a */
    public final float mo90856a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    public final void mo90857b(@C0359n0 C31541c cVar, int i) {
        this.f76450h[0] = this.f76443a[i].mo90881l();
        this.f76450h[1] = this.f76443a[i].mo90882m();
        this.f76444b[i].mapPoints(this.f76450h);
        if (i == 0) {
            Path path = cVar.f76457b;
            float[] fArr = this.f76450h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f76457b;
            float[] fArr2 = this.f76450h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f76443a[i].mo90873d(this.f76444b[i], cVar.f76457b);
        C31540b bVar = cVar.f76459d;
        if (bVar != null) {
            bVar.mo90801a(this.f76443a[i], this.f76444b[i], i);
        }
    }

    /* renamed from: c */
    public final void mo90858c(@C0359n0 C31541c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f76450h[0] = this.f76443a[i].mo90879j();
        this.f76450h[1] = this.f76443a[i].mo90880k();
        this.f76444b[i].mapPoints(this.f76450h);
        this.f76451i[0] = this.f76443a[i2].mo90881l();
        this.f76451i[1] = this.f76443a[i2].mo90882m();
        this.f76444b[i2].mapPoints(this.f76451i);
        float[] fArr = this.f76450h;
        float f = fArr[0];
        float[] fArr2 = this.f76451i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = mo90864i(cVar.f76458c, i);
        this.f76449g.mo90885p(0.0f, 0.0f);
        C31521g j = mo90865j(i, cVar.f76456a);
        j.mo88365c(max, i3, cVar.f76460e, this.f76449g);
        this.f76452j.reset();
        this.f76449g.mo90873d(this.f76445c[i], this.f76452j);
        if (!this.f76454l || (!j.mo90702b() && !mo90866l(this.f76452j, i) && !mo90866l(this.f76452j, i2))) {
            this.f76449g.mo90873d(this.f76445c[i], cVar.f76457b);
        } else {
            Path path = this.f76452j;
            path.op(path, this.f76448f, Path.Op.DIFFERENCE);
            this.f76450h[0] = this.f76449g.mo90881l();
            this.f76450h[1] = this.f76449g.mo90882m();
            this.f76445c[i].mapPoints(this.f76450h);
            Path path2 = this.f76447e;
            float[] fArr3 = this.f76450h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f76449g.mo90873d(this.f76445c[i], this.f76447e);
        }
        C31540b bVar = cVar.f76459d;
        if (bVar != null) {
            bVar.mo90802b(this.f76449g, this.f76445c[i], i);
        }
    }

    /* renamed from: d */
    public void mo90859d(C31534o oVar, float f, RectF rectF, @C0359n0 Path path) {
        mo90860e(oVar, f, rectF, (C31540b) null, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo90860e(C31534o oVar, float f, RectF rectF, C31540b bVar, @C0359n0 Path path) {
        path.rewind();
        this.f76447e.rewind();
        this.f76448f.rewind();
        this.f76448f.addRect(rectF, Path.Direction.CW);
        C31541c cVar = new C31541c(oVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            mo90867m(cVar, i);
            mo90869o(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mo90857b(cVar, i2);
            mo90858c(cVar, i2);
        }
        path.close();
        this.f76447e.close();
        if (!this.f76447e.isEmpty()) {
            path.op(this.f76447e, Path.Op.UNION);
        }
    }

    /* renamed from: f */
    public final void mo90861f(int i, @C0359n0 RectF rectF, @C0359n0 PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    public final C31518d mo90862g(int i, @C0359n0 C31534o oVar) {
        if (i == 1) {
            return oVar.mo90813l();
        }
        if (i == 2) {
            return oVar.mo90811j();
        }
        if (i != 3) {
            return oVar.mo90820t();
        }
        return oVar.mo90818r();
    }

    /* renamed from: h */
    public final C31519e mo90863h(int i, @C0359n0 C31534o oVar) {
        if (i == 1) {
            return oVar.mo90812k();
        }
        if (i == 2) {
            return oVar.mo90810i();
        }
        if (i != 3) {
            return oVar.mo90819s();
        }
        return oVar.mo90817q();
    }

    /* renamed from: i */
    public final float mo90864i(@C0359n0 RectF rectF, int i) {
        float[] fArr = this.f76450h;
        C31542q qVar = this.f76443a[i];
        fArr[0] = qVar.f76465c;
        fArr[1] = qVar.f76466d;
        this.f76444b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f76450h[0]);
        }
        return Math.abs(rectF.centerY() - this.f76450h[1]);
    }

    /* renamed from: j */
    public final C31521g mo90865j(int i, @C0359n0 C31534o oVar) {
        if (i == 1) {
            return oVar.mo90809h();
        }
        if (i == 2) {
            return oVar.mo90814n();
        }
        if (i != 3) {
            return oVar.mo90815o();
        }
        return oVar.mo90816p();
    }

    @C0376v0(19)
    /* renamed from: l */
    public final boolean mo90866l(Path path, int i) {
        this.f76453k.reset();
        this.f76443a[i].mo90873d(this.f76444b[i], this.f76453k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f76453k.computeBounds(rectF, true);
        path.op(this.f76453k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo90867m(@C0359n0 C31541c cVar, int i) {
        mo90863h(i, cVar.f76456a).mo90701c(this.f76443a[i], 90.0f, cVar.f76460e, cVar.f76458c, mo90862g(i, cVar.f76456a));
        float a = mo90856a(i);
        this.f76444b[i].reset();
        mo90861f(i, cVar.f76458c, this.f76446d);
        Matrix matrix = this.f76444b[i];
        PointF pointF = this.f76446d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f76444b[i].preRotate(a);
    }

    /* renamed from: n */
    public void mo90868n(boolean z) {
        this.f76454l = z;
    }

    /* renamed from: o */
    public final void mo90869o(int i) {
        this.f76450h[0] = this.f76443a[i].mo90879j();
        this.f76450h[1] = this.f76443a[i].mo90880k();
        this.f76444b[i].mapPoints(this.f76450h);
        float a = mo90856a(i);
        this.f76445c[i].reset();
        Matrix matrix = this.f76445c[i];
        float[] fArr = this.f76450h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f76445c[i].preRotate(a);
    }
}
