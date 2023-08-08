package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.e */
public class C34743e {

    /* renamed from: a */
    public final CharSequence f84174a;

    /* renamed from: b */
    public final int f84175b;

    /* renamed from: c */
    public final int f84176c;

    /* renamed from: d */
    public final byte[] f84177d;

    public C34743e(CharSequence charSequence, int i, int i2) {
        this.f84174a = charSequence;
        this.f84176c = i;
        this.f84175b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f84177d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void mo102789a(int i) {
        mo102797i(this.f84175b - 1, 0, i, 1);
        mo102797i(this.f84175b - 1, 1, i, 2);
        mo102797i(this.f84175b - 1, 2, i, 3);
        mo102797i(0, this.f84176c - 2, i, 4);
        mo102797i(0, this.f84176c - 1, i, 5);
        mo102797i(1, this.f84176c - 1, i, 6);
        mo102797i(2, this.f84176c - 1, i, 7);
        mo102797i(3, this.f84176c - 1, i, 8);
    }

    /* renamed from: b */
    public final void mo102790b(int i) {
        mo102797i(this.f84175b - 3, 0, i, 1);
        mo102797i(this.f84175b - 2, 0, i, 2);
        mo102797i(this.f84175b - 1, 0, i, 3);
        mo102797i(0, this.f84176c - 4, i, 4);
        mo102797i(0, this.f84176c - 3, i, 5);
        mo102797i(0, this.f84176c - 2, i, 6);
        mo102797i(0, this.f84176c - 1, i, 7);
        mo102797i(1, this.f84176c - 1, i, 8);
    }

    /* renamed from: c */
    public final void mo102791c(int i) {
        mo102797i(this.f84175b - 3, 0, i, 1);
        mo102797i(this.f84175b - 2, 0, i, 2);
        mo102797i(this.f84175b - 1, 0, i, 3);
        mo102797i(0, this.f84176c - 2, i, 4);
        mo102797i(0, this.f84176c - 1, i, 5);
        mo102797i(1, this.f84176c - 1, i, 6);
        mo102797i(2, this.f84176c - 1, i, 7);
        mo102797i(3, this.f84176c - 1, i, 8);
    }

    /* renamed from: d */
    public final void mo102792d(int i) {
        mo102797i(this.f84175b - 1, 0, i, 1);
        mo102797i(this.f84175b - 1, this.f84176c - 1, i, 2);
        mo102797i(0, this.f84176c - 3, i, 3);
        mo102797i(0, this.f84176c - 2, i, 4);
        mo102797i(0, this.f84176c - 1, i, 5);
        mo102797i(1, this.f84176c - 3, i, 6);
        mo102797i(1, this.f84176c - 2, i, 7);
        mo102797i(1, this.f84176c - 1, i, 8);
    }

    /* renamed from: e */
    public final boolean mo102793e(int i, int i2) {
        return this.f84177d[(i2 * this.f84176c) + i] == 1;
    }

    /* renamed from: f */
    public final byte[] mo102794f() {
        return this.f84177d;
    }

    /* renamed from: g */
    public final int mo102795g() {
        return this.f84176c;
    }

    /* renamed from: h */
    public final int mo102796h() {
        return this.f84175b;
    }

    /* renamed from: i */
    public final void mo102797i(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f84175b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f84176c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f84174a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        mo102800l(i2, i, z);
    }

    /* renamed from: j */
    public final boolean mo102798j(int i, int i2) {
        return this.f84177d[(i2 * this.f84176c) + i] < 0;
    }

    /* renamed from: k */
    public final void mo102799k() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f84175b && i3 == 0) {
                mo102789a(i4);
                i4++;
            }
            if (i5 == this.f84175b - 2 && i3 == 0 && this.f84176c % 4 != 0) {
                mo102790b(i4);
                i4++;
            }
            if (i5 == this.f84175b - 2 && i3 == 0 && this.f84176c % 8 == 4) {
                mo102791c(i4);
                i4++;
            }
            if (i5 == this.f84175b + 4 && i3 == 2 && this.f84176c % 8 == 0) {
                mo102792d(i4);
                i4++;
            }
            do {
                if (i5 < this.f84175b && i3 >= 0 && mo102798j(i3, i5)) {
                    mo102801m(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0 || i3 >= this.f84176c) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 3;
                }
                mo102801m(i5, i3, i4);
                i4++;
                i5 -= 2;
                i3 += 2;
                break;
            } while (i3 >= this.f84176c);
            int i62 = i5 + 1;
            int i72 = i3 + 3;
            do {
                if (i62 >= 0 && i72 < this.f84176c && mo102798j(i72, i62)) {
                    mo102801m(i62, i72, i4);
                    i4++;
                }
                i62 += 2;
                i72 -= 2;
                i = this.f84175b;
                if (i62 >= i) {
                    break;
                }
            } while (i72 >= 0);
            i5 = i62 + 3;
            i3 = i72 + 1;
            if (i5 >= i && i3 >= (i2 = this.f84176c)) {
                break;
            }
        }
        if (mo102798j(i2 - 1, i - 1)) {
            mo102800l(this.f84176c - 1, this.f84175b - 1, true);
            mo102800l(this.f84176c - 2, this.f84175b - 2, true);
        }
    }

    /* renamed from: l */
    public final void mo102800l(int i, int i2, boolean z) {
        this.f84177d[(i2 * this.f84176c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: m */
    public final void mo102801m(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        mo102797i(i4, i5, i3, 1);
        int i6 = i2 - 1;
        mo102797i(i4, i6, i3, 2);
        int i7 = i - 1;
        mo102797i(i7, i5, i3, 3);
        mo102797i(i7, i6, i3, 4);
        mo102797i(i7, i2, i3, 5);
        mo102797i(i, i5, i3, 6);
        mo102797i(i, i6, i3, 7);
        mo102797i(i, i2, i3, 8);
    }
}
