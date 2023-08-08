package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.a */
public final class C34723a {

    /* renamed from: h */
    public static final C34723a f84113h = new C34723a(4201, 4096, 1);

    /* renamed from: i */
    public static final C34723a f84114i = new C34723a(1033, 1024, 1);

    /* renamed from: j */
    public static final C34723a f84115j;

    /* renamed from: k */
    public static final C34723a f84116k = new C34723a(19, 16, 1);

    /* renamed from: l */
    public static final C34723a f84117l = new C34723a(285, 256, 0);

    /* renamed from: m */
    public static final C34723a f84118m;

    /* renamed from: n */
    public static final C34723a f84119n;

    /* renamed from: o */
    public static final C34723a f84120o;

    /* renamed from: a */
    public final int[] f84121a;

    /* renamed from: b */
    public final int[] f84122b;

    /* renamed from: c */
    public final C34724b f84123c;

    /* renamed from: d */
    public final C34724b f84124d;

    /* renamed from: e */
    public final int f84125e;

    /* renamed from: f */
    public final int f84126f;

    /* renamed from: g */
    public final int f84127g;

    static {
        C34723a aVar = new C34723a(67, 64, 1);
        f84115j = aVar;
        C34723a aVar2 = new C34723a(301, 256, 1);
        f84118m = aVar2;
        f84119n = aVar2;
        f84120o = aVar;
    }

    public C34723a(int i, int i2, int i3) {
        this.f84126f = i;
        this.f84125e = i2;
        this.f84127g = i3;
        this.f84121a = new int[i2];
        this.f84122b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f84121a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f84122b[this.f84121a[i6]] = i6;
        }
        this.f84123c = new C34724b(this, new int[]{0});
        this.f84124d = new C34724b(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m141669a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public C34724b mo102714b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f84123c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C34724b(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo102715c(int i) {
        return this.f84121a[i];
    }

    /* renamed from: d */
    public int mo102716d() {
        return this.f84127g;
    }

    /* renamed from: e */
    public C34724b mo102717e() {
        return this.f84124d;
    }

    /* renamed from: f */
    public int mo102718f() {
        return this.f84125e;
    }

    /* renamed from: g */
    public C34724b mo102719g() {
        return this.f84123c;
    }

    /* renamed from: h */
    public int mo102720h(int i) {
        if (i != 0) {
            return this.f84121a[(this.f84125e - this.f84122b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int mo102721i(int i) {
        if (i != 0) {
            return this.f84122b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int mo102722j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f84121a;
        int[] iArr2 = this.f84122b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f84125e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f84126f) + ',' + this.f84125e + ')';
    }
}
