package com.google.zxing.common;

/* renamed from: com.google.zxing.common.c */
public final class C34711c {

    /* renamed from: a */
    public final byte[] f84058a;

    /* renamed from: b */
    public int f84059b;

    /* renamed from: c */
    public int f84060c;

    public C34711c(byte[] bArr) {
        this.f84058a = bArr;
    }

    /* renamed from: a */
    public int mo102679a() {
        return ((this.f84058a.length - this.f84059b) * 8) - this.f84060c;
    }

    /* renamed from: b */
    public int mo102680b() {
        return this.f84060c;
    }

    /* renamed from: c */
    public int mo102681c() {
        return this.f84059b;
    }

    /* renamed from: d */
    public int mo102682d(int i) {
        int i2;
        if (i <= 0 || i > 32 || i > mo102679a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i3 = this.f84060c;
        byte b = 0;
        if (i3 > 0) {
            int i4 = 8 - i3;
            if (i < i4) {
                i2 = i;
            } else {
                i2 = i4;
            }
            int i5 = i4 - i2;
            byte[] bArr = this.f84058a;
            int i6 = this.f84059b;
            int i7 = (((255 >> (8 - i2)) << i5) & bArr[i6]) >> i5;
            i -= i2;
            int i8 = i3 + i2;
            this.f84060c = i8;
            if (i8 == 8) {
                this.f84060c = 0;
                this.f84059b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f84058a;
            int i10 = this.f84059b;
            b = (bArr2[i10] & 255) | i9;
            this.f84059b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f84058a[this.f84059b]) >> i11);
        this.f84060c += i;
        return i12;
    }
}
