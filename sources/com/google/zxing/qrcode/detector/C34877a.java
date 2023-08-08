package com.google.zxing.qrcode.detector;

import com.google.zxing.C34762l;

/* renamed from: com.google.zxing.qrcode.detector.a */
public final class C34877a extends C34762l {

    /* renamed from: c */
    public final float f84761c;

    public C34877a(float f, float f2, float f3) {
        super(f, f2);
        this.f84761c = f3;
    }

    /* renamed from: f */
    public boolean mo103209f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo102884d()) > f || Math.abs(f3 - mo102883c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f84761c);
        if (abs <= 1.0f || abs <= this.f84761c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C34877a mo103210g(float f, float f2, float f3) {
        return new C34877a((mo102883c() + f2) / 2.0f, (mo102884d() + f) / 2.0f, (this.f84761c + f3) / 2.0f);
    }
}
