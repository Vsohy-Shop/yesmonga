package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import com.airbnb.lottie.value.C21703k;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.o */
public class C21486o {

    /* renamed from: a */
    public final Matrix f55415a = new Matrix();

    /* renamed from: b */
    public final Matrix f55416b;

    /* renamed from: c */
    public final Matrix f55417c;

    /* renamed from: d */
    public final Matrix f55418d;

    /* renamed from: e */
    public final float[] f55419e;
    @C0359n0

    /* renamed from: f */
    public C21466a<PointF, PointF> f55420f;
    @C0359n0

    /* renamed from: g */
    public C21466a<?, PointF> f55421g;
    @C0359n0

    /* renamed from: h */
    public C21466a<C21703k, C21703k> f55422h;
    @C0359n0

    /* renamed from: i */
    public C21466a<Float, Float> f55423i;
    @C0359n0

    /* renamed from: j */
    public C21466a<Integer, Integer> f55424j;
    @C0363p0

    /* renamed from: k */
    public C21474c f55425k;
    @C0363p0

    /* renamed from: l */
    public C21474c f55426l;
    @C0363p0

    /* renamed from: m */
    public C21466a<?, Float> f55427m;
    @C0363p0

    /* renamed from: n */
    public C21466a<?, Float> f55428n;

    public C21486o(C21554l lVar) {
        C21466a<PointF, PointF> aVar;
        C21466a<PointF, PointF> aVar2;
        C21466a<C21703k, C21703k> aVar3;
        C21466a<Float, Float> aVar4;
        C21474c cVar;
        C21474c cVar2;
        if (lVar.mo64307c() == null) {
            aVar = null;
        } else {
            aVar = lVar.mo64307c().mo64300a();
        }
        this.f55420f = aVar;
        if (lVar.mo64310f() == null) {
            aVar2 = null;
        } else {
            aVar2 = lVar.mo64310f().mo64300a();
        }
        this.f55421g = aVar2;
        if (lVar.mo64312h() == null) {
            aVar3 = null;
        } else {
            aVar3 = lVar.mo64312h().mo64300a();
        }
        this.f55422h = aVar3;
        if (lVar.mo64311g() == null) {
            aVar4 = null;
        } else {
            aVar4 = lVar.mo64311g().mo64300a();
        }
        this.f55423i = aVar4;
        if (lVar.mo64313i() == null) {
            cVar = null;
        } else {
            cVar = (C21474c) lVar.mo64313i().mo64300a();
        }
        this.f55425k = cVar;
        if (cVar != null) {
            this.f55416b = new Matrix();
            this.f55417c = new Matrix();
            this.f55418d = new Matrix();
            this.f55419e = new float[9];
        } else {
            this.f55416b = null;
            this.f55417c = null;
            this.f55418d = null;
            this.f55419e = null;
        }
        if (lVar.mo64314j() == null) {
            cVar2 = null;
        } else {
            cVar2 = (C21474c) lVar.mo64314j().mo64300a();
        }
        this.f55426l = cVar2;
        if (lVar.mo64309e() != null) {
            this.f55424j = lVar.mo64309e().mo64300a();
        }
        if (lVar.mo64315k() != null) {
            this.f55427m = lVar.mo64315k().mo64300a();
        } else {
            this.f55427m = null;
        }
        if (lVar.mo64308d() != null) {
            this.f55428n = lVar.mo64308d().mo64300a();
        } else {
            this.f55428n = null;
        }
    }

    /* renamed from: a */
    public void mo64103a(C21578a aVar) {
        aVar.mo64481i(this.f55424j);
        aVar.mo64481i(this.f55427m);
        aVar.mo64481i(this.f55428n);
        aVar.mo64481i(this.f55420f);
        aVar.mo64481i(this.f55421g);
        aVar.mo64481i(this.f55422h);
        aVar.mo64481i(this.f55423i);
        aVar.mo64481i(this.f55425k);
        aVar.mo64481i(this.f55426l);
    }

    /* renamed from: b */
    public void mo64104b(C21466a.C21468b bVar) {
        C21466a<Integer, Integer> aVar = this.f55424j;
        if (aVar != null) {
            aVar.mo64057a(bVar);
        }
        C21466a<?, Float> aVar2 = this.f55427m;
        if (aVar2 != null) {
            aVar2.mo64057a(bVar);
        }
        C21466a<?, Float> aVar3 = this.f55428n;
        if (aVar3 != null) {
            aVar3.mo64057a(bVar);
        }
        C21466a<PointF, PointF> aVar4 = this.f55420f;
        if (aVar4 != null) {
            aVar4.mo64057a(bVar);
        }
        C21466a<?, PointF> aVar5 = this.f55421g;
        if (aVar5 != null) {
            aVar5.mo64057a(bVar);
        }
        C21466a<C21703k, C21703k> aVar6 = this.f55422h;
        if (aVar6 != null) {
            aVar6.mo64057a(bVar);
        }
        C21466a<Float, Float> aVar7 = this.f55423i;
        if (aVar7 != null) {
            aVar7.mo64057a(bVar);
        }
        C21474c cVar = this.f55425k;
        if (cVar != null) {
            cVar.mo64057a(bVar);
        }
        C21474c cVar2 = this.f55426l;
        if (cVar2 != null) {
            cVar2.mo64057a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean mo64105c(T t, @C0363p0 C21702j<T> jVar) {
        C21474c cVar;
        C21474c cVar2;
        C21466a<?, Float> aVar;
        C21466a<?, Float> aVar2;
        if (t == C21601o.f55884e) {
            C21466a<PointF, PointF> aVar3 = this.f55420f;
            if (aVar3 == null) {
                this.f55420f = new C21487p(jVar, new PointF());
                return true;
            }
            aVar3.mo64070n(jVar);
            return true;
        } else if (t == C21601o.f55885f) {
            C21466a<?, PointF> aVar4 = this.f55421g;
            if (aVar4 == null) {
                this.f55421g = new C21487p(jVar, new PointF());
                return true;
            }
            aVar4.mo64070n(jVar);
            return true;
        } else {
            if (t == C21601o.f55886g) {
                C21466a<?, PointF> aVar5 = this.f55421g;
                if (aVar5 instanceof C21484m) {
                    ((C21484m) aVar5).mo64100r(jVar);
                    return true;
                }
            }
            if (t == C21601o.f55887h) {
                C21466a<?, PointF> aVar6 = this.f55421g;
                if (aVar6 instanceof C21484m) {
                    ((C21484m) aVar6).mo64101s(jVar);
                    return true;
                }
            }
            if (t == C21601o.f55892m) {
                C21466a<C21703k, C21703k> aVar7 = this.f55422h;
                if (aVar7 == null) {
                    this.f55422h = new C21487p(jVar, new C21703k());
                    return true;
                }
                aVar7.mo64070n(jVar);
                return true;
            } else if (t == C21601o.f55893n) {
                C21466a<Float, Float> aVar8 = this.f55423i;
                if (aVar8 == null) {
                    this.f55423i = new C21487p(jVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar8.mo64070n(jVar);
                return true;
            } else if (t == C21601o.f55882c) {
                C21466a<Integer, Integer> aVar9 = this.f55424j;
                if (aVar9 == null) {
                    this.f55424j = new C21487p(jVar, 100);
                    return true;
                }
                aVar9.mo64070n(jVar);
                return true;
            } else if (t != C21601o.f55872A || (aVar2 = this.f55427m) == null) {
                if (t != C21601o.f55873B || (aVar = this.f55428n) == null) {
                    if (t == C21601o.f55894o && (cVar2 = this.f55425k) != null) {
                        if (cVar2 == null) {
                            this.f55425k = new C21474c(Collections.singletonList(new C21693a(Float.valueOf(0.0f))));
                        }
                        this.f55425k.mo64070n(jVar);
                        return true;
                    } else if (t != C21601o.f55895p || (cVar = this.f55426l) == null) {
                        return false;
                    } else {
                        if (cVar == null) {
                            this.f55426l = new C21474c(Collections.singletonList(new C21693a(Float.valueOf(0.0f))));
                        }
                        this.f55426l.mo64070n(jVar);
                        return true;
                    }
                } else if (aVar == null) {
                    this.f55428n = new C21487p(jVar, 100);
                    return true;
                } else {
                    aVar.mo64070n(jVar);
                    return true;
                }
            } else if (aVar2 == null) {
                this.f55427m = new C21487p(jVar, 100);
                return true;
            } else {
                aVar2.mo64070n(jVar);
                return true;
            }
        }
    }

    /* renamed from: d */
    public final void mo64106d() {
        for (int i = 0; i < 9; i++) {
            this.f55419e[i] = 0.0f;
        }
    }

    @C0363p0
    /* renamed from: e */
    public C21466a<?, Float> mo64107e() {
        return this.f55428n;
    }

    /* renamed from: f */
    public Matrix mo64108f() {
        float f;
        float f2;
        float f3;
        this.f55415a.reset();
        C21466a<?, PointF> aVar = this.f55421g;
        if (aVar != null) {
            PointF h = aVar.mo64064h();
            float f4 = h.x;
            if (!(f4 == 0.0f && h.y == 0.0f)) {
                this.f55415a.preTranslate(f4, h.y);
            }
        }
        C21466a<Float, Float> aVar2 = this.f55423i;
        if (aVar2 != null) {
            if (aVar2 instanceof C21487p) {
                f3 = aVar2.mo64064h().floatValue();
            } else {
                f3 = ((C21474c) aVar2).mo64081p();
            }
            if (f3 != 0.0f) {
                this.f55415a.preRotate(f3);
            }
        }
        if (this.f55425k != null) {
            C21474c cVar = this.f55426l;
            if (cVar == null) {
                f = 0.0f;
            } else {
                f = (float) Math.cos(Math.toRadians((double) ((-cVar.mo64081p()) + 90.0f)));
            }
            C21474c cVar2 = this.f55426l;
            if (cVar2 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((double) ((-cVar2.mo64081p()) + 90.0f)));
            }
            mo64106d();
            float[] fArr = this.f55419e;
            fArr[0] = f;
            fArr[1] = f2;
            float f5 = -f2;
            fArr[3] = f5;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f55416b.setValues(fArr);
            mo64106d();
            float[] fArr2 = this.f55419e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f55425k.mo64081p()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f55417c.setValues(fArr2);
            mo64106d();
            float[] fArr3 = this.f55419e;
            fArr3[0] = f;
            fArr3[1] = f5;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f55418d.setValues(fArr3);
            this.f55417c.preConcat(this.f55416b);
            this.f55418d.preConcat(this.f55417c);
            this.f55415a.preConcat(this.f55418d);
        }
        C21466a<C21703k, C21703k> aVar3 = this.f55422h;
        if (aVar3 != null) {
            C21703k h2 = aVar3.mo64064h();
            if (!(h2.mo64752b() == 1.0f && h2.mo64753c() == 1.0f)) {
                this.f55415a.preScale(h2.mo64752b(), h2.mo64753c());
            }
        }
        C21466a<PointF, PointF> aVar4 = this.f55420f;
        if (aVar4 != null) {
            PointF h3 = aVar4.mo64064h();
            float f6 = h3.x;
            if (!(f6 == 0.0f && h3.y == 0.0f)) {
                this.f55415a.preTranslate(-f6, -h3.y);
            }
        }
        return this.f55415a;
    }

    /* renamed from: g */
    public Matrix mo64109g(float f) {
        PointF pointF;
        C21703k kVar;
        float f2;
        C21466a<?, PointF> aVar = this.f55421g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.mo64064h();
        }
        C21466a<C21703k, C21703k> aVar2 = this.f55422h;
        if (aVar2 == null) {
            kVar = null;
        } else {
            kVar = aVar2.mo64064h();
        }
        this.f55415a.reset();
        if (pointF != null) {
            this.f55415a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (kVar != null) {
            double d = (double) f;
            this.f55415a.preScale((float) Math.pow((double) kVar.mo64752b(), d), (float) Math.pow((double) kVar.mo64753c(), d));
        }
        C21466a<Float, Float> aVar3 = this.f55423i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo64064h().floatValue();
            C21466a<PointF, PointF> aVar4 = this.f55420f;
            if (aVar4 != null) {
                pointF2 = aVar4.mo64064h();
            }
            Matrix matrix = this.f55415a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f55415a;
    }

    @C0363p0
    /* renamed from: h */
    public C21466a<?, Integer> mo64110h() {
        return this.f55424j;
    }

    @C0363p0
    /* renamed from: i */
    public C21466a<?, Float> mo64111i() {
        return this.f55427m;
    }

    /* renamed from: j */
    public void mo64112j(float f) {
        C21466a<Integer, Integer> aVar = this.f55424j;
        if (aVar != null) {
            aVar.mo64069m(f);
        }
        C21466a<?, Float> aVar2 = this.f55427m;
        if (aVar2 != null) {
            aVar2.mo64069m(f);
        }
        C21466a<?, Float> aVar3 = this.f55428n;
        if (aVar3 != null) {
            aVar3.mo64069m(f);
        }
        C21466a<PointF, PointF> aVar4 = this.f55420f;
        if (aVar4 != null) {
            aVar4.mo64069m(f);
        }
        C21466a<?, PointF> aVar5 = this.f55421g;
        if (aVar5 != null) {
            aVar5.mo64069m(f);
        }
        C21466a<C21703k, C21703k> aVar6 = this.f55422h;
        if (aVar6 != null) {
            aVar6.mo64069m(f);
        }
        C21466a<Float, Float> aVar7 = this.f55423i;
        if (aVar7 != null) {
            aVar7.mo64069m(f);
        }
        C21474c cVar = this.f55425k;
        if (cVar != null) {
            cVar.mo64069m(f);
        }
        C21474c cVar2 = this.f55426l;
        if (cVar2 != null) {
            cVar2.mo64069m(f);
        }
    }
}
