package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21486o;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.C21567g;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.q */
public class C21461q implements C21447e, C21457n, C21452j, C21466a.C21468b, C21453k {

    /* renamed from: a */
    public final Matrix f55352a = new Matrix();

    /* renamed from: b */
    public final Path f55353b = new Path();

    /* renamed from: c */
    public final C21516j f55354c;

    /* renamed from: d */
    public final C21578a f55355d;

    /* renamed from: e */
    public final String f55356e;

    /* renamed from: f */
    public final boolean f55357f;

    /* renamed from: g */
    public final C21466a<Float, Float> f55358g;

    /* renamed from: h */
    public final C21466a<Float, Float> f55359h;

    /* renamed from: i */
    public final C21486o f55360i;

    /* renamed from: j */
    public C21446d f55361j;

    public C21461q(C21516j jVar, C21578a aVar, C21567g gVar) {
        this.f55354c = jVar;
        this.f55355d = aVar;
        this.f55356e = gVar.mo64403c();
        this.f55357f = gVar.mo64406f();
        C21466a<Float, Float> a = gVar.mo64402b().mo64300a();
        this.f55358g = a;
        aVar.mo64481i(a);
        a.mo64057a(this);
        C21466a<Float, Float> a2 = gVar.mo64404d().mo64300a();
        this.f55359h = a2;
        aVar.mo64481i(a2);
        a2.mo64057a(this);
        C21486o b = gVar.mo64405e().mo64306b();
        this.f55360i = b;
        b.mo64103a(aVar);
        b.mo64104b(this);
    }

    /* renamed from: a */
    public void mo64019a() {
        this.f55354c.invalidateSelf();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        this.f55361j.mo64020b(list, list2);
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        if (!this.f55360i.mo64105c(t, jVar)) {
            if (t == C21601o.f55898s) {
                this.f55358g.mo64070n(jVar);
            } else if (t == C21601o.f55899t) {
                this.f55359h.mo64070n(jVar);
            }
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        this.f55361j.mo64023e(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64043f(java.util.ListIterator<com.airbnb.lottie.animation.content.C21445c> r9) {
        /*
            r8 = this;
            com.airbnb.lottie.animation.content.d r0 = r8.f55361j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            com.airbnb.lottie.animation.content.d r9 = new com.airbnb.lottie.animation.content.d
            com.airbnb.lottie.j r2 = r8.f55354c
            com.airbnb.lottie.model.layer.a r3 = r8.f55355d
            java.lang.String r4 = "Repeater"
            boolean r5 = r8.f55357f
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f55361j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C21461q.mo64043f(java.util.ListIterator):void");
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f55358g.mo64064h().floatValue();
        float floatValue2 = this.f55359h.mo64064h().floatValue();
        float floatValue3 = this.f55360i.mo64111i().mo64064h().floatValue() / 100.0f;
        float floatValue4 = this.f55360i.mo64107e().mo64064h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f55352a.set(matrix);
            float f = (float) i2;
            this.f55352a.preConcat(this.f55360i.mo64109g(f + floatValue2));
            this.f55361j.mo64025g(canvas, this.f55352a, (int) (((float) i) * C21685i.m99797k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public String getName() {
        return this.f55356e;
    }

    public Path getPath() {
        Path path = this.f55361j.getPath();
        this.f55353b.reset();
        float floatValue = this.f55358g.mo64064h().floatValue();
        float floatValue2 = this.f55359h.mo64064h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f55352a.set(this.f55360i.mo64109g(((float) i) + floatValue2));
            this.f55353b.addPath(path, this.f55352a);
        }
        return this.f55353b;
    }
}
