package com.google.zxing;

/* renamed from: com.google.zxing.e */
public abstract class C34752e {

    /* renamed from: a */
    public final int f84222a;

    /* renamed from: b */
    public final int f84223b;

    public C34752e(int i, int i2) {
        this.f84222a = i;
        this.f84223b = i2;
    }

    /* renamed from: a */
    public C34752e mo102741a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    /* renamed from: b */
    public final int mo102833b() {
        return this.f84223b;
    }

    /* renamed from: c */
    public abstract byte[] mo102742c();

    /* renamed from: d */
    public abstract byte[] mo102743d(int i, byte[] bArr);

    /* renamed from: e */
    public final int mo102834e() {
        return this.f84222a;
    }

    /* renamed from: f */
    public C34752e mo102744f() {
        return new C34727d(this);
    }

    /* renamed from: g */
    public boolean mo102745g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo102746h() {
        return false;
    }

    /* renamed from: i */
    public C34752e mo102747i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    /* renamed from: j */
    public C34752e mo102748j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f84222a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f84223b * (i + 1));
        for (int i2 = 0; i2 < this.f84223b; i2++) {
            bArr = mo102743d(i2, bArr);
            for (int i3 = 0; i3 < this.f84222a; i3++) {
                byte b = bArr[i3] & 255;
                if (b < 64) {
                    c = '#';
                } else if (b < 128) {
                    c = '+';
                } else if (b < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
