package com.google.zxing;

/* renamed from: com.google.zxing.h */
public final class C34756h extends C34752e {

    /* renamed from: h */
    public static final int f84228h = 2;

    /* renamed from: c */
    public final byte[] f84229c;

    /* renamed from: d */
    public final int f84230d;

    /* renamed from: e */
    public final int f84231e;

    /* renamed from: f */
    public final int f84232f;

    /* renamed from: g */
    public final int f84233g;

    public C34756h(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f84229c = bArr;
        this.f84230d = i;
        this.f84231e = i2;
        this.f84232f = i3;
        this.f84233g = i4;
        if (z) {
            mo102842n(i5, i6);
        }
    }

    /* renamed from: a */
    public C34752e mo102741a(int i, int i2, int i3, int i4) {
        return new C34756h(this.f84229c, this.f84230d, this.f84231e, this.f84232f + i, this.f84233g + i2, i3, i4, false);
    }

    /* renamed from: c */
    public byte[] mo102742c() {
        int e = mo102834e();
        int b = mo102833b();
        int i = this.f84230d;
        if (e == i && b == this.f84231e) {
            return this.f84229c;
        }
        int i2 = e * b;
        byte[] bArr = new byte[i2];
        int i3 = (this.f84233g * i) + this.f84232f;
        if (e == i) {
            System.arraycopy(this.f84229c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < b; i4++) {
            System.arraycopy(this.f84229c, i3, bArr, i4 * e, e);
            i3 += this.f84230d;
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
        System.arraycopy(this.f84229c, ((i + this.f84233g) * this.f84230d) + this.f84232f, bArr, 0, e);
        return bArr;
    }

    /* renamed from: g */
    public boolean mo102745g() {
        return true;
    }

    /* renamed from: k */
    public int mo102839k() {
        return mo102833b() / 2;
    }

    /* renamed from: l */
    public int mo102840l() {
        return mo102834e() / 2;
    }

    /* renamed from: m */
    public int[] mo102841m() {
        int e = mo102834e() / 2;
        int b = mo102833b() / 2;
        int[] iArr = new int[(e * b)];
        byte[] bArr = this.f84229c;
        int i = (this.f84233g * this.f84230d) + this.f84232f;
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * e;
            for (int i4 = 0; i4 < e; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | -16777216;
            }
            i += this.f84230d << 1;
        }
        return iArr;
    }

    /* renamed from: n */
    public final void mo102842n(int i, int i2) {
        byte[] bArr = this.f84229c;
        int i3 = (this.f84233g * this.f84230d) + this.f84232f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f84230d;
        }
    }
}
