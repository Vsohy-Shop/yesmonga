package com.google.zxing.pdf417.decoder.p051ec;

/* renamed from: com.google.zxing.pdf417.decoder.ec.b */
public final class C34841b {

    /* renamed from: f */
    public static final C34841b f84617f = new C34841b(929, 3);

    /* renamed from: a */
    public final int[] f84618a;

    /* renamed from: b */
    public final int[] f84619b;

    /* renamed from: c */
    public final C34842c f84620c;

    /* renamed from: d */
    public final C34842c f84621d;

    /* renamed from: e */
    public final int f84622e;

    public C34841b(int i, int i2) {
        this.f84622e = i;
        this.f84618a = new int[i];
        this.f84619b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f84618a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f84619b[this.f84618a[i5]] = i5;
        }
        this.f84620c = new C34842c(this, new int[]{0});
        this.f84621d = new C34842c(this, new int[]{1});
    }

    /* renamed from: a */
    public int mo103094a(int i, int i2) {
        return (i + i2) % this.f84622e;
    }

    /* renamed from: b */
    public C34842c mo103095b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f84620c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C34842c(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo103096c(int i) {
        return this.f84618a[i];
    }

    /* renamed from: d */
    public C34842c mo103097d() {
        return this.f84621d;
    }

    /* renamed from: e */
    public int mo103098e() {
        return this.f84622e;
    }

    /* renamed from: f */
    public C34842c mo103099f() {
        return this.f84620c;
    }

    /* renamed from: g */
    public int mo103100g(int i) {
        if (i != 0) {
            return this.f84618a[(this.f84622e - this.f84619b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int mo103101h(int i) {
        if (i != 0) {
            return this.f84619b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int mo103102i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f84618a;
        int[] iArr2 = this.f84619b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f84622e - 1)];
    }

    /* renamed from: j */
    public int mo103103j(int i, int i2) {
        int i3 = this.f84622e;
        return ((i + i3) - i2) % i3;
    }
}
