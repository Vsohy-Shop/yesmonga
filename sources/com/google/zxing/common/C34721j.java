package com.google.zxing.common;

/* renamed from: com.google.zxing.common.j */
public final class C34721j {

    /* renamed from: a */
    public final float f84097a;

    /* renamed from: b */
    public final float f84098b;

    /* renamed from: c */
    public final float f84099c;

    /* renamed from: d */
    public final float f84100d;

    /* renamed from: e */
    public final float f84101e;

    /* renamed from: f */
    public final float f84102f;

    /* renamed from: g */
    public final float f84103g;

    /* renamed from: h */
    public final float f84104h;

    /* renamed from: i */
    public final float f84105i;

    public C34721j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f84097a = f;
        this.f84098b = f4;
        this.f84099c = f7;
        this.f84100d = f2;
        this.f84101e = f5;
        this.f84102f = f8;
        this.f84103g = f3;
        this.f84104h = f6;
        this.f84105i = f9;
    }

    /* renamed from: b */
    public static C34721j m141661b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m141663d(f9, f10, f11, f12, f13, f14, f15, f16).mo102711e(m141662c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C34721j m141662c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m141663d(f, f2, f3, f4, f5, f6, f7, f8).mo102710a();
    }

    /* renamed from: d */
    public static C34721j m141663d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C34721j(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C34721j((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    public C34721j mo102710a() {
        float f = this.f84101e;
        float f2 = this.f84105i;
        float f3 = this.f84102f;
        float f4 = this.f84104h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f84103g;
        float f7 = this.f84100d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f84099c;
        float f11 = this.f84098b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f84097a;
        return new C34721j(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    public C34721j mo102711e(C34721j jVar) {
        C34721j jVar2 = jVar;
        float f = this.f84097a;
        float f2 = jVar2.f84097a;
        float f3 = this.f84100d;
        float f4 = jVar2.f84098b;
        float f5 = this.f84103g;
        float f6 = jVar2.f84099c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = jVar2.f84100d;
        float f9 = jVar2.f84101e;
        float f10 = jVar2.f84102f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = jVar2.f84103g;
        float f13 = jVar2.f84104h;
        float f14 = jVar2.f84105i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f84098b;
        float f17 = f15;
        float f18 = this.f84101e;
        float f19 = f11;
        float f20 = this.f84104h;
        float f21 = (f16 * f2) + (f18 * f4) + (f20 * f6);
        float f22 = (f20 * f14) + (f16 * f12) + (f18 * f13);
        float f23 = this.f84099c;
        float f24 = this.f84102f;
        float f25 = (f2 * f23) + (f4 * f24);
        float f26 = this.f84105i;
        float f27 = (f23 * f12) + (f24 * f13) + (f26 * f14);
        return new C34721j(f7, f19, f17, f21, (f16 * f8) + (f18 * f9) + (f20 * f10), f22, (f6 * f26) + f25, (f8 * f23) + (f9 * f24) + (f10 * f26), f27);
    }

    /* renamed from: f */
    public void mo102712f(float[] fArr) {
        float[] fArr2 = fArr;
        float f = this.f84097a;
        float f2 = this.f84098b;
        float f3 = this.f84099c;
        float f4 = this.f84100d;
        float f5 = this.f84101e;
        float f6 = this.f84102f;
        float f7 = this.f84103g;
        float f8 = this.f84104h;
        float f9 = this.f84105i;
        int length = fArr2.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr2[i];
            int i2 = i + 1;
            float f11 = fArr2[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr2[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr2[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    /* renamed from: g */
    public void mo102713g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.f84099c * f) + (this.f84102f * f2) + this.f84105i;
            fArr[i] = (((this.f84097a * f) + (this.f84100d * f2)) + this.f84103g) / f3;
            fArr2[i] = (((this.f84098b * f) + (this.f84101e * f2)) + this.f84104h) / f3;
        }
    }
}
