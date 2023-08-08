package com.google.zxing.pdf417.decoder;

import com.google.firebase.installations.local.C33093b;

/* renamed from: com.google.zxing.pdf417.decoder.d */
public final class C34838d {

    /* renamed from: f */
    public static final int f84605f = -1;

    /* renamed from: a */
    public final int f84606a;

    /* renamed from: b */
    public final int f84607b;

    /* renamed from: c */
    public final int f84608c;

    /* renamed from: d */
    public final int f84609d;

    /* renamed from: e */
    public int f84610e = -1;

    public C34838d(int i, int i2, int i3, int i4) {
        this.f84606a = i;
        this.f84607b = i2;
        this.f84608c = i3;
        this.f84609d = i4;
    }

    /* renamed from: a */
    public int mo103063a() {
        return this.f84608c;
    }

    /* renamed from: b */
    public int mo103064b() {
        return this.f84607b;
    }

    /* renamed from: c */
    public int mo103065c() {
        return this.f84610e;
    }

    /* renamed from: d */
    public int mo103066d() {
        return this.f84606a;
    }

    /* renamed from: e */
    public int mo103067e() {
        return this.f84609d;
    }

    /* renamed from: f */
    public int mo103068f() {
        return this.f84607b - this.f84606a;
    }

    /* renamed from: g */
    public boolean mo103069g() {
        return mo103070h(this.f84610e);
    }

    /* renamed from: h */
    public boolean mo103070h(int i) {
        return i != -1 && this.f84608c == (i % 3) * 3;
    }

    /* renamed from: i */
    public void mo103071i(int i) {
        this.f84610e = i;
    }

    /* renamed from: j */
    public void mo103072j() {
        this.f84610e = ((this.f84609d / 30) * 3) + (this.f84608c / 3);
    }

    public String toString() {
        return this.f84610e + C33093b.f80279g + this.f84609d;
    }
}
