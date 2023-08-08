package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21486o;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.C21574e;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.content.C21562b;
import com.airbnb.lottie.model.content.C21570j;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.d */
public class C21446d implements C21447e, C21457n, C21466a.C21468b, C21574e {

    /* renamed from: a */
    public Paint f55257a;

    /* renamed from: b */
    public RectF f55258b;

    /* renamed from: c */
    public final Matrix f55259c;

    /* renamed from: d */
    public final Path f55260d;

    /* renamed from: e */
    public final RectF f55261e;

    /* renamed from: f */
    public final String f55262f;

    /* renamed from: g */
    public final boolean f55263g;

    /* renamed from: h */
    public final List<C21445c> f55264h;

    /* renamed from: i */
    public final C21516j f55265i;
    @C0363p0

    /* renamed from: j */
    public List<C21457n> f55266j;
    @C0363p0

    /* renamed from: k */
    public C21486o f55267k;

    public C21446d(C21516j jVar, C21578a aVar, C21570j jVar2) {
        this(jVar, aVar, jVar2.mo64420c(), jVar2.mo64421d(), m98847f(jVar, aVar, jVar2.mo64419b()), m98848h(jVar2.mo64419b()));
    }

    /* renamed from: f */
    public static List<C21445c> m98847f(C21516j jVar, C21578a aVar, List<C21562b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C21445c a = list.get(i).mo64305a(jVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: h */
    public static C21554l m98848h(List<C21562b> list) {
        for (int i = 0; i < list.size(); i++) {
            C21562b bVar = list.get(i);
            if (bVar instanceof C21554l) {
                return (C21554l) bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo64019a() {
        this.f55265i.invalidateSelf();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f55264h.size());
        arrayList.addAll(list);
        for (int size = this.f55264h.size() - 1; size >= 0; size--) {
            C21445c cVar = this.f55264h.get(size);
            cVar.mo64020b(arrayList, this.f55264h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        C21486o oVar = this.f55267k;
        if (oVar != null) {
            oVar.mo64105c(t, jVar);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        if (dVar.mo64434h(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.mo64427a(getName());
                if (dVar.mo64429c(getName(), i)) {
                    list.add(dVar2.mo64436j(this));
                }
            }
            if (dVar.mo64435i(getName(), i)) {
                int e = i + dVar.mo64431e(getName(), i);
                for (int i2 = 0; i2 < this.f55264h.size(); i2++) {
                    C21445c cVar = this.f55264h.get(i2);
                    if (cVar instanceof C21574e) {
                        ((C21574e) cVar).mo64022d(dVar, e, list, dVar2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        this.f55259c.set(matrix);
        C21486o oVar = this.f55267k;
        if (oVar != null) {
            this.f55259c.preConcat(oVar.mo64108f());
        }
        this.f55261e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f55264h.size() - 1; size >= 0; size--) {
            C21445c cVar = this.f55264h.get(size);
            if (cVar instanceof C21447e) {
                ((C21447e) cVar).mo64023e(this.f55261e, this.f55259c, z);
                rectF.union(this.f55261e);
            }
        }
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.f55263g) {
            this.f55259c.set(matrix);
            C21486o oVar = this.f55267k;
            if (oVar != null) {
                this.f55259c.preConcat(oVar.mo64108f());
                if (this.f55267k.mo64110h() == null) {
                    i2 = 100;
                } else {
                    i2 = this.f55267k.mo64110h().mo64064h().intValue();
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            if (!this.f55265i.mo64200T() || !mo64033k() || i == 255) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f55258b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo64023e(this.f55258b, this.f55259c, true);
                this.f55257a.setAlpha(i);
                C21686j.m99813n(canvas, this.f55258b, this.f55257a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f55264h.size() - 1; size >= 0; size--) {
                C21445c cVar = this.f55264h.get(size);
                if (cVar instanceof C21447e) {
                    ((C21447e) cVar).mo64025g(canvas, this.f55259c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public String getName() {
        return this.f55262f;
    }

    public Path getPath() {
        this.f55259c.reset();
        C21486o oVar = this.f55267k;
        if (oVar != null) {
            this.f55259c.set(oVar.mo64108f());
        }
        this.f55260d.reset();
        if (this.f55263g) {
            return this.f55260d;
        }
        for (int size = this.f55264h.size() - 1; size >= 0; size--) {
            C21445c cVar = this.f55264h.get(size);
            if (cVar instanceof C21457n) {
                this.f55260d.addPath(((C21457n) cVar).getPath(), this.f55259c);
            }
        }
        return this.f55260d;
    }

    /* renamed from: i */
    public List<C21457n> mo64031i() {
        if (this.f55266j == null) {
            this.f55266j = new ArrayList();
            for (int i = 0; i < this.f55264h.size(); i++) {
                C21445c cVar = this.f55264h.get(i);
                if (cVar instanceof C21457n) {
                    this.f55266j.add((C21457n) cVar);
                }
            }
        }
        return this.f55266j;
    }

    /* renamed from: j */
    public Matrix mo64032j() {
        C21486o oVar = this.f55267k;
        if (oVar != null) {
            return oVar.mo64108f();
        }
        this.f55259c.reset();
        return this.f55259c;
    }

    /* renamed from: k */
    public final boolean mo64033k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f55264h.size(); i2++) {
            if ((this.f55264h.get(i2) instanceof C21447e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public C21446d(C21516j jVar, C21578a aVar, String str, boolean z, List<C21445c> list, @C0363p0 C21554l lVar) {
        this.f55257a = new C21439a();
        this.f55258b = new RectF();
        this.f55259c = new Matrix();
        this.f55260d = new Path();
        this.f55261e = new RectF();
        this.f55262f = str;
        this.f55265i = jVar;
        this.f55263g = z;
        this.f55264h = list;
        if (lVar != null) {
            C21486o b = lVar.mo64306b();
            this.f55267k = b;
            b.mo64103a(aVar);
            this.f55267k.mo64104b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C21445c cVar = list.get(size);
            if (cVar instanceof C21452j) {
                arrayList.add((C21452j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C21452j) arrayList.get(size2)).mo64043f(list.listIterator(list.size()));
        }
    }
}
