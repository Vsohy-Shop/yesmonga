package com.google.zxing;

import androidx.constraintlayout.core.motion.utils.C16717v;

/* renamed from: com.google.zxing.i */
public final class C34757i extends C34752e {

    /* renamed from: c */
    public final byte[] f84234c;

    /* renamed from: d */
    public final int f84235d;

    /* renamed from: e */
    public final int f84236e;

    /* renamed from: f */
    public final int f84237f;

    /* renamed from: g */
    public final int f84238g;

    public C34757i(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f84235d = i;
        this.f84236e = i2;
        this.f84237f = 0;
        this.f84238g = 0;
        int i3 = i * i2;
        this.f84234c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.f84234c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & C16717v.C16724g.f42314r)) + (i5 & 255)) / 4);
        }
    }

    /* renamed from: a */
    public C34752e mo102741a(int i, int i2, int i3, int i4) {
        return new C34757i(this.f84234c, this.f84235d, this.f84236e, this.f84237f + i, this.f84238g + i2, i3, i4);
    }

    /* renamed from: c */
    public byte[] mo102742c() {
        int e = mo102834e();
        int b = mo102833b();
        int i = this.f84235d;
        if (e == i && b == this.f84236e) {
            return this.f84234c;
        }
        int i2 = e * b;
        byte[] bArr = new byte[i2];
        int i3 = (this.f84238g * i) + this.f84237f;
        if (e == i) {
            System.arraycopy(this.f84234c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < b; i4++) {
            System.arraycopy(this.f84234c, i3, bArr, i4 * e, e);
            i3 += this.f84235d;
        }
        return bArr;
    }

    /* renamed from: d */
    public byte[] mo102743d(int i, byte[] bArr) {
        if (i < 0 || i >= mo102833b()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int e = mo102834e();
        if (bArr == null || bArr.length < e) {
            bArr = new byte[e];
        }
        System.arraycopy(this.f84234c, ((i + this.f84238g) * this.f84235d) + this.f84237f, bArr, 0, e);
        return bArr;
    }

    /* renamed from: g */
    public boolean mo102745g() {
        return true;
    }

    public C34757i(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f84234c = bArr;
        this.f84235d = i;
        this.f84236e = i2;
        this.f84237f = i3;
        this.f84238g = i4;
    }
}
