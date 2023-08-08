package com.journeyapps.barcodescanner;

import android.graphics.Rect;

/* renamed from: com.journeyapps.barcodescanner.r */
public class C34955r {

    /* renamed from: a */
    public byte[] f85038a;

    /* renamed from: b */
    public int f85039b;

    /* renamed from: c */
    public int f85040c;

    public C34955r(byte[] bArr, int i, int i2) {
        this.f85038a = bArr;
        this.f85039b = i;
        this.f85040c = i2;
    }

    /* renamed from: e */
    public static byte[] m142951e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m142952f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m142953g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C34955r mo103542a(Rect rect, int i) {
        int width = rect.width() / i;
        int height = rect.height() / i;
        int i2 = rect.top;
        byte[] bArr = new byte[(width * height)];
        if (i == 1) {
            int i3 = (i2 * this.f85039b) + rect.left;
            for (int i4 = 0; i4 < height; i4++) {
                System.arraycopy(this.f85038a, i3, bArr, i4 * width, width);
                i3 += this.f85039b;
            }
        } else {
            int i5 = (i2 * this.f85039b) + rect.left;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = i6 * width;
                int i8 = i5;
                for (int i9 = 0; i9 < width; i9++) {
                    bArr[i7] = this.f85038a[i8];
                    i8 += i;
                    i7++;
                }
                i5 += this.f85039b * i;
            }
        }
        return new C34955r(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] mo103543b() {
        return this.f85038a;
    }

    /* renamed from: c */
    public int mo103544c() {
        return this.f85040c;
    }

    /* renamed from: d */
    public int mo103545d() {
        return this.f85039b;
    }

    /* renamed from: h */
    public C34955r mo103546h(int i) {
        if (i == 90) {
            return new C34955r(m142953g(this.f85038a, this.f85039b, this.f85040c), this.f85040c, this.f85039b);
        }
        if (i == 180) {
            return new C34955r(m142951e(this.f85038a, this.f85039b, this.f85040c), this.f85039b, this.f85040c);
        }
        if (i != 270) {
            return this;
        }
        return new C34955r(m142952f(this.f85038a, this.f85039b, this.f85040c), this.f85040c, this.f85039b);
    }
}
