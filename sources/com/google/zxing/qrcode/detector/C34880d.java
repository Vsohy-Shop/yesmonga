package com.google.zxing.qrcode.detector;

import com.google.zxing.C34762l;

/* renamed from: com.google.zxing.qrcode.detector.d */
public final class C34880d extends C34762l {

    /* renamed from: c */
    public final float f84773c;

    /* renamed from: d */
    public final int f84774d;

    public C34880d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: f */
    public boolean mo103225f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo102884d()) > f || Math.abs(f3 - mo102883c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f84773c);
        if (abs <= 1.0f || abs <= this.f84773c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C34880d mo103226g(float f, float f2, float f3) {
        int i = this.f84774d;
        int i2 = i + 1;
        float c = (((float) i) * mo102883c()) + f2;
        float f4 = (float) i2;
        return new C34880d(c / f4, ((((float) this.f84774d) * mo102884d()) + f) / f4, ((((float) this.f84774d) * this.f84773c) + f3) / f4, i2);
    }

    /* renamed from: h */
    public int mo103227h() {
        return this.f84774d;
    }

    /* renamed from: i */
    public float mo103228i() {
        return this.f84773c;
    }

    public C34880d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f84773c = f3;
        this.f84774d = i;
    }
}
