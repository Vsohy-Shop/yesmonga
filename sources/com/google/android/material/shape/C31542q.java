package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.google.android.material.shadow.C31513b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.shape.q */
public class C31542q {

    /* renamed from: j */
    public static final float f76461j = 270.0f;

    /* renamed from: k */
    public static final float f76462k = 180.0f;
    @Deprecated

    /* renamed from: a */
    public float f76463a;
    @Deprecated

    /* renamed from: b */
    public float f76464b;
    @Deprecated

    /* renamed from: c */
    public float f76465c;
    @Deprecated

    /* renamed from: d */
    public float f76466d;
    @Deprecated

    /* renamed from: e */
    public float f76467e;
    @Deprecated

    /* renamed from: f */
    public float f76468f;

    /* renamed from: g */
    public final List<C31549g> f76469g = new ArrayList();

    /* renamed from: h */
    public final List<C31551i> f76470h = new ArrayList();

    /* renamed from: i */
    public boolean f76471i;

    /* renamed from: com.google.android.material.shape.q$a */
    public class C31543a extends C31551i {

        /* renamed from: b */
        public final /* synthetic */ List f76472b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f76473c;

        public C31543a(List list, Matrix matrix) {
            this.f76472b = list;
            this.f76473c = matrix;
        }

        /* renamed from: a */
        public void mo90893a(Matrix matrix, C31513b bVar, int i, Canvas canvas) {
            for (C31551i a : this.f76472b) {
                a.mo90893a(this.f76473c, bVar, i, canvas);
            }
        }
    }

    /* renamed from: com.google.android.material.shape.q$b */
    public static class C31544b extends C31551i {

        /* renamed from: b */
        public final C31546d f76475b;

        public C31544b(C31546d dVar) {
            this.f76475b = dVar;
        }

        /* renamed from: a */
        public void mo90893a(Matrix matrix, @C0359n0 C31513b bVar, int i, @C0359n0 Canvas canvas) {
            float h = this.f76475b.mo90899m();
            float i2 = this.f76475b.mo90900n();
            bVar.mo90689a(canvas, matrix, new RectF(this.f76475b.mo90897k(), this.f76475b.mo90901o(), this.f76475b.mo90898l(), this.f76475b.mo90896j()), i, h, i2);
        }
    }

    /* renamed from: com.google.android.material.shape.q$c */
    public static class C31545c extends C31551i {

        /* renamed from: b */
        public final C31548f f76476b;

        /* renamed from: c */
        public final float f76477c;

        /* renamed from: d */
        public final float f76478d;

        public C31545c(C31548f fVar, float f, float f2) {
            this.f76476b = fVar;
            this.f76477c = f;
            this.f76478d = f2;
        }

        /* renamed from: a */
        public void mo90893a(Matrix matrix, @C0359n0 C31513b bVar, int i, @C0359n0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f76476b.f76493c - this.f76478d), (double) (this.f76476b.f76492b - this.f76477c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f76477c, this.f76478d);
            matrix2.preRotate(mo90894c());
            bVar.mo90690b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        public float mo90894c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f76476b.f76493c - this.f76478d) / (this.f76476b.f76492b - this.f76477c))));
        }
    }

    /* renamed from: com.google.android.material.shape.q$d */
    public static class C31546d extends C31549g {

        /* renamed from: h */
        public static final RectF f76479h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f76480b;
        @Deprecated

        /* renamed from: c */
        public float f76481c;
        @Deprecated

        /* renamed from: d */
        public float f76482d;
        @Deprecated

        /* renamed from: e */
        public float f76483e;
        @Deprecated

        /* renamed from: f */
        public float f76484f;
        @Deprecated

        /* renamed from: g */
        public float f76485g;

        public C31546d(float f, float f2, float f3, float f4) {
            mo90903q(f);
            mo90907u(f2);
            mo90904r(f3);
            mo90902p(f4);
        }

        /* renamed from: a */
        public void mo90895a(@C0359n0 Matrix matrix, @C0359n0 Path path) {
            Matrix matrix2 = this.f76494a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f76479h;
            rectF.set(mo90897k(), mo90901o(), mo90898l(), mo90896j());
            path.arcTo(rectF, mo90899m(), mo90900n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float mo90896j() {
            return this.f76483e;
        }

        /* renamed from: k */
        public final float mo90897k() {
            return this.f76480b;
        }

        /* renamed from: l */
        public final float mo90898l() {
            return this.f76482d;
        }

        /* renamed from: m */
        public final float mo90899m() {
            return this.f76484f;
        }

        /* renamed from: n */
        public final float mo90900n() {
            return this.f76485g;
        }

        /* renamed from: o */
        public final float mo90901o() {
            return this.f76481c;
        }

        /* renamed from: p */
        public final void mo90902p(float f) {
            this.f76483e = f;
        }

        /* renamed from: q */
        public final void mo90903q(float f) {
            this.f76480b = f;
        }

        /* renamed from: r */
        public final void mo90904r(float f) {
            this.f76482d = f;
        }

        /* renamed from: s */
        public final void mo90905s(float f) {
            this.f76484f = f;
        }

        /* renamed from: t */
        public final void mo90906t(float f) {
            this.f76485g = f;
        }

        /* renamed from: u */
        public final void mo90907u(float f) {
            this.f76481c = f;
        }
    }

    /* renamed from: com.google.android.material.shape.q$e */
    public static class C31547e extends C31549g {

        /* renamed from: b */
        public float f76486b;

        /* renamed from: c */
        public float f76487c;

        /* renamed from: d */
        public float f76488d;

        /* renamed from: e */
        public float f76489e;

        /* renamed from: f */
        public float f76490f;

        /* renamed from: g */
        public float f76491g;

        public C31547e(float f, float f2, float f3, float f4, float f5, float f6) {
            mo90914h(f);
            mo90916j(f2);
            mo90915i(f3);
            mo90917k(f4);
            mo90918l(f5);
            mo90919m(f6);
        }

        /* renamed from: a */
        public void mo90895a(@C0359n0 Matrix matrix, @C0359n0 Path path) {
            Matrix matrix2 = this.f76494a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f76486b, this.f76487c, this.f76488d, this.f76489e, this.f76490f, this.f76491g);
            path.transform(matrix);
        }

        /* renamed from: b */
        public final float mo90908b() {
            return this.f76486b;
        }

        /* renamed from: c */
        public final float mo90909c() {
            return this.f76488d;
        }

        /* renamed from: d */
        public final float mo90910d() {
            return this.f76487c;
        }

        /* renamed from: e */
        public final float mo90911e() {
            return this.f76487c;
        }

        /* renamed from: f */
        public final float mo90912f() {
            return this.f76490f;
        }

        /* renamed from: g */
        public final float mo90913g() {
            return this.f76491g;
        }

        /* renamed from: h */
        public final void mo90914h(float f) {
            this.f76486b = f;
        }

        /* renamed from: i */
        public final void mo90915i(float f) {
            this.f76488d = f;
        }

        /* renamed from: j */
        public final void mo90916j(float f) {
            this.f76487c = f;
        }

        /* renamed from: k */
        public final void mo90917k(float f) {
            this.f76489e = f;
        }

        /* renamed from: l */
        public final void mo90918l(float f) {
            this.f76490f = f;
        }

        /* renamed from: m */
        public final void mo90919m(float f) {
            this.f76491g = f;
        }
    }

    /* renamed from: com.google.android.material.shape.q$f */
    public static class C31548f extends C31549g {

        /* renamed from: b */
        public float f76492b;

        /* renamed from: c */
        public float f76493c;

        /* renamed from: a */
        public void mo90895a(@C0359n0 Matrix matrix, @C0359n0 Path path) {
            Matrix matrix2 = this.f76494a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f76492b, this.f76493c);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.q$g */
    public static abstract class C31549g {

        /* renamed from: a */
        public final Matrix f76494a = new Matrix();

        /* renamed from: a */
        public abstract void mo90895a(Matrix matrix, Path path);
    }

    /* renamed from: com.google.android.material.shape.q$h */
    public static class C31550h extends C31549g {
        @Deprecated

        /* renamed from: b */
        public float f76495b;
        @Deprecated

        /* renamed from: c */
        public float f76496c;
        @Deprecated

        /* renamed from: d */
        public float f76497d;
        @Deprecated

        /* renamed from: e */
        public float f76498e;

        /* renamed from: a */
        public void mo90895a(@C0359n0 Matrix matrix, @C0359n0 Path path) {
            Matrix matrix2 = this.f76494a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(mo90920f(), mo90921g(), mo90922h(), mo90923i());
            path.transform(matrix);
        }

        /* renamed from: f */
        public final float mo90920f() {
            return this.f76495b;
        }

        /* renamed from: g */
        public final float mo90921g() {
            return this.f76496c;
        }

        /* renamed from: h */
        public final float mo90922h() {
            return this.f76497d;
        }

        /* renamed from: i */
        public final float mo90923i() {
            return this.f76498e;
        }

        /* renamed from: j */
        public final void mo90924j(float f) {
            this.f76495b = f;
        }

        /* renamed from: k */
        public final void mo90925k(float f) {
            this.f76496c = f;
        }

        /* renamed from: l */
        public final void mo90926l(float f) {
            this.f76497d = f;
        }

        /* renamed from: m */
        public final void mo90927m(float f) {
            this.f76498e = f;
        }
    }

    /* renamed from: com.google.android.material.shape.q$i */
    public static abstract class C31551i {

        /* renamed from: a */
        public static final Matrix f76499a = new Matrix();

        /* renamed from: a */
        public abstract void mo90893a(Matrix matrix, C31513b bVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo90928b(C31513b bVar, int i, Canvas canvas) {
            mo90893a(f76499a, bVar, i, canvas);
        }
    }

    public C31542q() {
        mo90885p(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo90870a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C31546d dVar = new C31546d(f, f2, f3, f4);
        dVar.mo90905s(f5);
        dVar.mo90906t(f6);
        this.f76469g.add(dVar);
        C31544b bVar = new C31544b(dVar);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        mo90872c(bVar, f5, f7);
        double d = (double) f8;
        mo90889t(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        mo90890u(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void mo90871b(float f) {
        if (mo90877h() != f) {
            float h = ((f - mo90877h()) + 360.0f) % 360.0f;
            if (h <= 180.0f) {
                C31546d dVar = new C31546d(mo90879j(), mo90880k(), mo90879j(), mo90880k());
                dVar.mo90905s(mo90877h());
                dVar.mo90906t(h);
                this.f76470h.add(new C31544b(dVar));
                mo90887r(f);
            }
        }
    }

    /* renamed from: c */
    public final void mo90872c(C31551i iVar, float f, float f2) {
        mo90871b(f);
        this.f76470h.add(iVar);
        mo90887r(f2);
    }

    /* renamed from: d */
    public void mo90873d(Matrix matrix, Path path) {
        int size = this.f76469g.size();
        for (int i = 0; i < size; i++) {
            this.f76469g.get(i).mo90895a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean mo90874e() {
        return this.f76471i;
    }

    @C0359n0
    /* renamed from: f */
    public C31551i mo90875f(Matrix matrix) {
        mo90871b(mo90878i());
        return new C31543a(new ArrayList(this.f76470h), new Matrix(matrix));
    }

    @C0376v0(21)
    /* renamed from: g */
    public void mo90876g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f76469g.add(new C31547e(f, f2, f3, f4, f5, f6));
        this.f76471i = true;
        mo90889t(f5);
        mo90890u(f6);
    }

    /* renamed from: h */
    public final float mo90877h() {
        return this.f76467e;
    }

    /* renamed from: i */
    public final float mo90878i() {
        return this.f76468f;
    }

    /* renamed from: j */
    public float mo90879j() {
        return this.f76465c;
    }

    /* renamed from: k */
    public float mo90880k() {
        return this.f76466d;
    }

    /* renamed from: l */
    public float mo90881l() {
        return this.f76463a;
    }

    /* renamed from: m */
    public float mo90882m() {
        return this.f76464b;
    }

    /* renamed from: n */
    public void mo90883n(float f, float f2) {
        C31548f fVar = new C31548f();
        float unused = fVar.f76492b = f;
        float unused2 = fVar.f76493c = f2;
        this.f76469g.add(fVar);
        C31545c cVar = new C31545c(fVar, mo90879j(), mo90880k());
        mo90872c(cVar, cVar.mo90894c() + 270.0f, cVar.mo90894c() + 270.0f);
        mo90889t(f);
        mo90890u(f2);
    }

    @C0376v0(21)
    /* renamed from: o */
    public void mo90884o(float f, float f2, float f3, float f4) {
        C31550h hVar = new C31550h();
        hVar.mo90924j(f);
        hVar.mo90925k(f2);
        hVar.mo90926l(f3);
        hVar.mo90927m(f4);
        this.f76469g.add(hVar);
        this.f76471i = true;
        mo90889t(f3);
        mo90890u(f4);
    }

    /* renamed from: p */
    public void mo90885p(float f, float f2) {
        mo90886q(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: q */
    public void mo90886q(float f, float f2, float f3, float f4) {
        mo90891v(f);
        mo90892w(f2);
        mo90889t(f);
        mo90890u(f2);
        mo90887r(f3);
        mo90888s((f3 + f4) % 360.0f);
        this.f76469g.clear();
        this.f76470h.clear();
        this.f76471i = false;
    }

    /* renamed from: r */
    public final void mo90887r(float f) {
        this.f76467e = f;
    }

    /* renamed from: s */
    public final void mo90888s(float f) {
        this.f76468f = f;
    }

    /* renamed from: t */
    public final void mo90889t(float f) {
        this.f76465c = f;
    }

    /* renamed from: u */
    public final void mo90890u(float f) {
        this.f76466d = f;
    }

    /* renamed from: v */
    public final void mo90891v(float f) {
        this.f76463a = f;
    }

    /* renamed from: w */
    public final void mo90892w(float f) {
        this.f76464b = f;
    }

    public C31542q(float f, float f2) {
        mo90885p(f, f2);
    }
}
