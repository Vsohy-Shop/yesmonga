package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.collection.C1875h;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.b */
public class C21581b extends C21578a {
    @C0363p0

    /* renamed from: D */
    public C21466a<Float, Float> f55821D;

    /* renamed from: E */
    public final List<C21578a> f55822E = new ArrayList();

    /* renamed from: F */
    public final RectF f55823F = new RectF();

    /* renamed from: G */
    public final RectF f55824G = new RectF();

    /* renamed from: H */
    public Paint f55825H = new Paint();
    @C0363p0

    /* renamed from: I */
    public Boolean f55826I;
    @C0363p0

    /* renamed from: J */
    public Boolean f55827J;

    /* renamed from: com.airbnb.lottie.model.layer.b$a */
    public static /* synthetic */ class C21582a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55828a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55828a = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55828a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C21581b.C21582a.<clinit>():void");
        }
    }

    public C21581b(C21516j jVar, Layer layer, List<Layer> list, C21495g gVar) {
        super(jVar, layer);
        int i;
        C21578a aVar;
        C21544b s = layer.mo64465s();
        if (s != null) {
            C21466a<Float, Float> a = s.mo64300a();
            this.f55821D = a;
            mo64481i(a);
            this.f55821D.mo64057a(this);
        } else {
            this.f55821D = null;
        }
        C1875h hVar = new C1875h(gVar.mo64128k().size());
        int size = list.size() - 1;
        C21578a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            C21578a u = C21578a.m99458u(layer2, jVar, gVar);
            if (u != null) {
                hVar.mo6229t(u.mo64493v().mo64448b(), u);
                if (aVar2 != null) {
                    aVar2.mo64475E(u);
                    aVar2 = null;
                } else {
                    this.f55822E.add(0, u);
                    int i2 = C21582a.f55828a[layer2.mo64452f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = u;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < hVar.mo6213F(); i++) {
            C21578a aVar3 = (C21578a) hVar.mo6223k(hVar.mo6228s(i));
            if (!(aVar3 == null || (aVar = (C21578a) hVar.mo6223k(aVar3.mo64493v().mo64454h())) == null)) {
                aVar3.mo64477G(aVar);
            }
        }
    }

    /* renamed from: D */
    public void mo64474D(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        for (int i2 = 0; i2 < this.f55822E.size(); i2++) {
            this.f55822E.get(i2).mo64022d(dVar, i, list, dVar2);
        }
    }

    /* renamed from: F */
    public void mo64476F(boolean z) {
        super.mo64476F(z);
        for (C21578a F : this.f55822E) {
            F.mo64476F(z);
        }
    }

    /* renamed from: H */
    public void mo64478H(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        super.mo64478H(f);
        if (this.f55821D != null) {
            f = ((this.f55821D.mo64064h().floatValue() * this.f55807o.mo64447a().mo64126i()) - this.f55807o.mo64447a().mo64135r()) / (this.f55806n.mo64264y().mo64122e() + 0.01f);
        }
        if (this.f55821D == null) {
            f -= this.f55807o.mo64462p();
        }
        if (this.f55807o.mo64466t() != 0.0f && !"__container".equals(this.f55807o.mo64453g())) {
            f /= this.f55807o.mo64466t();
        }
        for (int size = this.f55822E.size() - 1; size >= 0; size--) {
            this.f55822E.get(size).mo64478H(f);
        }
    }

    /* renamed from: K */
    public boolean mo64498K() {
        if (this.f55827J == null) {
            for (int size = this.f55822E.size() - 1; size >= 0; size--) {
                C21578a aVar = this.f55822E.get(size);
                if (aVar instanceof C21585e) {
                    if (aVar.mo64494w()) {
                        this.f55827J = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof C21581b) && ((C21581b) aVar).mo64498K()) {
                    this.f55827J = Boolean.TRUE;
                    return true;
                }
            }
            this.f55827J = Boolean.FALSE;
        }
        return this.f55827J.booleanValue();
    }

    /* renamed from: L */
    public boolean mo64499L() {
        if (this.f55826I == null) {
            if (mo64495x()) {
                this.f55826I = Boolean.TRUE;
                return true;
            }
            for (int size = this.f55822E.size() - 1; size >= 0; size--) {
                if (this.f55822E.get(size).mo64495x()) {
                    this.f55826I = Boolean.TRUE;
                    return true;
                }
            }
            this.f55826I = Boolean.FALSE;
        }
        return this.f55826I.booleanValue();
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t != C21601o.f55874C) {
            return;
        }
        if (jVar == null) {
            C21466a<Float, Float> aVar = this.f55821D;
            if (aVar != null) {
                aVar.mo64070n((C21702j<Float>) null);
                return;
            }
            return;
        }
        C21487p pVar = new C21487p(jVar);
        this.f55821D = pVar;
        pVar.mo64057a(this);
        mo64481i(this.f55821D);
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        super.mo64023e(rectF, matrix, z);
        for (int size = this.f55822E.size() - 1; size >= 0; size--) {
            this.f55823F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f55822E.get(size).mo64023e(this.f55823F, this.f55805m, true);
            rectF.union(this.f55823F);
        }
    }

    /* renamed from: t */
    public void mo64492t(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        C21492e.m99017a("CompositionLayer#draw");
        this.f55824G.set(0.0f, 0.0f, (float) this.f55807o.mo64456j(), (float) this.f55807o.mo64455i());
        matrix.mapRect(this.f55824G);
        if (!this.f55806n.mo64200T() || this.f55822E.size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f55825H.setAlpha(i);
            C21686j.m99813n(canvas, this.f55824G, this.f55825H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f55822E.size() - 1; size >= 0; size--) {
            if (!this.f55824G.isEmpty()) {
                z2 = canvas.clipRect(this.f55824G);
            } else {
                z2 = true;
            }
            if (z2) {
                this.f55822E.get(size).mo64025g(canvas, matrix, i);
            }
        }
        canvas.restore();
        C21492e.m99018b("CompositionLayer#draw");
    }
}
