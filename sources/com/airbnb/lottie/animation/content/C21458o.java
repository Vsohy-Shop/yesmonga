package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21702j;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.o */
public class C21458o implements C21457n, C21466a.C21468b, C21453k {

    /* renamed from: o */
    public static final float f55325o = 0.47829f;

    /* renamed from: p */
    public static final float f55326p = 0.25f;

    /* renamed from: a */
    public final Path f55327a = new Path();

    /* renamed from: b */
    public final String f55328b;

    /* renamed from: c */
    public final C21516j f55329c;

    /* renamed from: d */
    public final PolystarShape.Type f55330d;

    /* renamed from: e */
    public final boolean f55331e;

    /* renamed from: f */
    public final C21466a<?, Float> f55332f;

    /* renamed from: g */
    public final C21466a<?, PointF> f55333g;

    /* renamed from: h */
    public final C21466a<?, Float> f55334h;
    @C0363p0

    /* renamed from: i */
    public final C21466a<?, Float> f55335i;

    /* renamed from: j */
    public final C21466a<?, Float> f55336j;
    @C0363p0

    /* renamed from: k */
    public final C21466a<?, Float> f55337k;

    /* renamed from: l */
    public final C21466a<?, Float> f55338l;

    /* renamed from: m */
    public C21444b f55339m = new C21444b();

    /* renamed from: n */
    public boolean f55340n;

    /* renamed from: com.airbnb.lottie.animation.content.o$a */
    public static /* synthetic */ class C21459a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55341a = r0
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55341a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C21458o.C21459a.<clinit>():void");
        }
    }

    public C21458o(C21516j jVar, C21578a aVar, PolystarShape polystarShape) {
        this.f55329c = jVar;
        this.f55328b = polystarShape.mo64337d();
        PolystarShape.Type j = polystarShape.mo64343j();
        this.f55330d = j;
        this.f55331e = polystarShape.mo64344k();
        C21466a<Float, Float> a = polystarShape.mo64340g().mo64300a();
        this.f55332f = a;
        C21466a<PointF, PointF> a2 = polystarShape.mo64341h().mo64300a();
        this.f55333g = a2;
        C21466a<Float, Float> a3 = polystarShape.mo64342i().mo64300a();
        this.f55334h = a3;
        C21466a<Float, Float> a4 = polystarShape.mo64338e().mo64300a();
        this.f55336j = a4;
        C21466a<Float, Float> a5 = polystarShape.mo64339f().mo64300a();
        this.f55338l = a5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j == type) {
            this.f55335i = polystarShape.mo64335b().mo64300a();
            this.f55337k = polystarShape.mo64336c().mo64300a();
        } else {
            this.f55335i = null;
            this.f55337k = null;
        }
        aVar.mo64481i(a);
        aVar.mo64481i(a2);
        aVar.mo64481i(a3);
        aVar.mo64481i(a4);
        aVar.mo64481i(a5);
        if (j == type) {
            aVar.mo64481i(this.f55335i);
            aVar.mo64481i(this.f55337k);
        }
        a.mo64057a(this);
        a2.mo64057a(this);
        a3.mo64057a(this);
        a4.mo64057a(this);
        a5.mo64057a(this);
        if (j == type) {
            this.f55335i.mo64057a(this);
            this.f55337k.mo64057a(this);
        }
    }

    /* renamed from: a */
    public void mo64019a() {
        mo64048i();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C21445c cVar = list.get(i);
            if (cVar instanceof C21464t) {
                C21464t tVar = (C21464t) cVar;
                if (tVar.mo64055i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f55339m.mo64027a(tVar);
                    tVar.mo64051c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        C21466a<?, Float> aVar;
        C21466a<?, Float> aVar2;
        if (t == C21601o.f55900u) {
            this.f55332f.mo64070n(jVar);
        } else if (t == C21601o.f55901v) {
            this.f55334h.mo64070n(jVar);
        } else if (t == C21601o.f55891l) {
            this.f55333g.mo64070n(jVar);
        } else if (t == C21601o.f55902w && (aVar2 = this.f55335i) != null) {
            aVar2.mo64070n(jVar);
        } else if (t == C21601o.f55903x) {
            this.f55336j.mo64070n(jVar);
        } else if (t == C21601o.f55904y && (aVar = this.f55337k) != null) {
            aVar.mo64070n(jVar);
        } else if (t == C21601o.f55905z) {
            this.f55338l.mo64070n(jVar);
        }
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21685i.m99799m(dVar, i, list, dVar2, this);
    }

    /* renamed from: f */
    public final void mo64046f() {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        int floor = (int) Math.floor((double) this.f55332f.mo64064h().floatValue());
        C21466a<?, Float> aVar = this.f55334h;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = (double) aVar.mo64064h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floor;
        float floatValue = this.f55338l.mo64064h().floatValue() / 100.0f;
        float floatValue2 = this.f55336j.mo64064h().floatValue();
        double d6 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d6);
        float sin = (float) (Math.sin(radians) * d6);
        this.f55327a.moveTo(cos, sin);
        double d7 = (double) ((float) (6.283185307179586d / d5));
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d8) * d6);
            double d9 = ceil;
            float sin2 = (float) (d6 * Math.sin(d8));
            if (floatValue != 0.0f) {
                d4 = d6;
                i = i2;
                d3 = d8;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                float f2 = cos3 * f;
                float sin3 = ((float) Math.sin(atan2)) * f;
                float cos4 = ((float) Math.cos(atan22)) * f;
                float sin4 = f * ((float) Math.sin(atan22));
                this.f55327a.cubicTo(cos - f2, sin - sin3, cos2 + cos4, sin2 + sin4, cos2, sin2);
            } else {
                i = i2;
                d3 = d8;
                d4 = d6;
                d2 = d7;
                this.f55327a.lineTo(cos2, sin2);
            }
            d8 = d3 + d2;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d9;
            d6 = d4;
            d7 = d2;
        }
        PointF h = this.f55333g.mo64064h();
        this.f55327a.offset(h.x, h.y);
        this.f55327a.close();
    }

    public String getName() {
        return this.f55328b;
    }

    public Path getPath() {
        if (this.f55340n) {
            return this.f55327a;
        }
        this.f55327a.reset();
        if (this.f55331e) {
            this.f55340n = true;
            return this.f55327a;
        }
        int i = C21459a.f55341a[this.f55330d.ordinal()];
        if (i == 1) {
            mo64047h();
        } else if (i == 2) {
            mo64046f();
        }
        this.f55327a.close();
        this.f55339m.mo64028b(this.f55327a);
        this.f55340n = true;
        return this.f55327a;
    }

    /* renamed from: h */
    public final void mo64047h() {
        double d;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float f10;
        double d4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue = this.f55332f.mo64064h().floatValue();
        C21466a<?, Float> aVar = this.f55334h;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = (double) aVar.mo64064h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floatValue;
        float f17 = (float) (6.283185307179586d / d5);
        float f18 = f17 / 2.0f;
        float f19 = floatValue - ((float) ((int) floatValue));
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f19) * f18);
        }
        float floatValue2 = this.f55336j.mo64064h().floatValue();
        float floatValue3 = this.f55335i.mo64064h().floatValue();
        C21466a<?, Float> aVar2 = this.f55337k;
        if (aVar2 != null) {
            f = aVar2.mo64064h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        C21466a<?, Float> aVar3 = this.f55338l;
        if (aVar3 != null) {
            f2 = aVar3.mo64064h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f19) + floatValue3;
            i = i2;
            double d6 = (double) f3;
            float f20 = f18;
            float cos = (float) (d6 * Math.cos(radians));
            f5 = (float) (d6 * Math.sin(radians));
            this.f55327a.moveTo(cos, f5);
            d2 = radians + ((double) ((f17 * f19) / 2.0f));
            f4 = cos;
            f6 = f20;
        } else {
            float f21 = f18;
            i = i2;
            double d7 = (double) floatValue2;
            float cos2 = (float) (Math.cos(radians) * d7);
            float sin = (float) (d7 * Math.sin(radians));
            this.f55327a.moveTo(cos2, sin);
            f4 = cos2;
            f6 = f21;
            d2 = radians + ((double) f6);
            f5 = sin;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d5) * 2.0d;
        int i3 = 0;
        float f22 = f6;
        float f23 = f4;
        float f24 = floatValue2;
        float f25 = floatValue3;
        boolean z = false;
        while (true) {
            double d8 = (double) i3;
            if (d8 < ceil) {
                if (z) {
                    f7 = f24;
                } else {
                    f7 = f25;
                }
                int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i4 == 0 || d8 != ceil - 2.0d) {
                    f8 = f17;
                    f9 = f22;
                } else {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                }
                if (i4 == 0 || d8 != ceil - 1.0d) {
                    d3 = d8;
                    f10 = f3;
                    f3 = f7;
                } else {
                    d3 = d8;
                    f10 = f3;
                }
                double d9 = (double) f3;
                double d10 = ceil;
                float cos3 = (float) (d9 * Math.cos(d2));
                float sin2 = (float) (d9 * Math.sin(d2));
                if (f == 0.0f && f2 == 0.0f) {
                    this.f55327a.lineTo(cos3, sin2);
                    d4 = d2;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f23) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d4 = d2;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos3) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = f25;
                    } else {
                        f15 = f24;
                    }
                    if (z) {
                        f16 = f24;
                    } else {
                        f16 = f25;
                    }
                    float f26 = f15 * f13 * 0.47829f;
                    float f27 = cos4 * f26;
                    float f28 = f26 * sin3;
                    float f29 = f16 * f14 * 0.47829f;
                    float f30 = cos5 * f29;
                    float f31 = f29 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f27 *= f19;
                            f28 *= f19;
                        } else if (d3 == d10 - 1.0d) {
                            f30 *= f19;
                            f31 *= f19;
                        }
                    }
                    this.f55327a.cubicTo(f23 - f27, f5 - f28, cos3 + f30, sin2 + f31, cos3, sin2);
                }
                d2 = d4 + ((double) f9);
                z = !z;
                i3++;
                f23 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f3 = f10;
                f17 = f8;
                ceil = d10;
            } else {
                PointF h = this.f55333g.mo64064h();
                this.f55327a.offset(h.x, h.y);
                this.f55327a.close();
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo64048i() {
        this.f55340n = false;
        this.f55329c.invalidateSelf();
    }
}
