package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.datamatrix.decoder.a */
public final class C34731a {

    /* renamed from: a */
    public final C34710b f84150a;

    /* renamed from: b */
    public final C34710b f84151b;

    /* renamed from: c */
    public final C34734d f84152c;

    public C34731a(C34710b bVar) throws FormatException {
        int k = bVar.mo102670k();
        if (k < 8 || k > 144 || (k & 1) != 0) {
            throw FormatException.m141227a();
        }
        this.f84152c = m141720j(bVar);
        C34710b a = mo102749a(bVar);
        this.f84150a = a;
        this.f84151b = new C34710b(a.mo102674o(), a.mo102670k());
    }

    /* renamed from: j */
    public static C34734d m141720j(C34710b bVar) throws FormatException {
        return C34734d.m141737h(bVar.mo102670k(), bVar.mo102674o());
    }

    /* renamed from: a */
    public final C34710b mo102749a(C34710b bVar) {
        int f = this.f84152c.mo102767f();
        int e = this.f84152c.mo102766e();
        if (bVar.mo102670k() == f) {
            int c = this.f84152c.mo102764c();
            int b = this.f84152c.mo102763b();
            int i = f / c;
            int i2 = e / b;
            C34710b bVar2 = new C34710b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo102666h(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo102677v(i6 + i10, i9);
                            }
                        }
                        C34710b bVar3 = bVar;
                    }
                    C34710b bVar4 = bVar;
                }
                C34710b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: b */
    public C34734d mo102750b() {
        return this.f84152c;
    }

    /* renamed from: c */
    public byte[] mo102751c() throws FormatException {
        byte[] bArr = new byte[this.f84152c.mo102768g()];
        int k = this.f84150a.mo102670k();
        int o = this.f84150a.mo102674o();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == k && i == 0 && !z) {
                bArr[i2] = (byte) mo102752d(k, o);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = k - 2;
                if (i3 == i4 && i == 0 && (o & 3) != 0 && !z2) {
                    bArr[i2] = (byte) mo102753e(k, o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == k + 4 && i == 2 && (o & 7) == 0 && !z3) {
                    bArr[i2] = (byte) mo102754f(k, o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (o & 7) == 4 && !z4) {
                    bArr[i2] = (byte) mo102755g(k, o);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < k && i >= 0 && !this.f84151b.mo102666h(i, i3)) {
                            bArr[i2] = (byte) mo102757i(i3, i, k, o);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < o);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < o && !this.f84151b.mo102666h(i6, i5)) {
                            bArr[i2] = (byte) mo102757i(i5, i6, k, o);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= k) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= k && i >= o) {
                break;
            }
        }
        if (i2 == this.f84152c.mo102768g()) {
            return bArr;
        }
        throw FormatException.m141227a();
    }

    /* renamed from: d */
    public final int mo102752d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo102756h(i3, 0, i, i2) ? 1 : 0) << true;
        if (mo102756h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo102756h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo102756h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (mo102756h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (mo102756h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo102756h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo102756h(3, i8, i, i2)) {
            return i11 | 1;
        }
        return i11;
    }

    /* renamed from: e */
    public final int mo102753e(int i, int i2) {
        int i3 = (mo102756h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo102756h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo102756h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo102756h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo102756h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (mo102756h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (mo102756h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo102756h(1, i9, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: f */
    public final int mo102754f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo102756h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (mo102756h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (mo102756h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (mo102756h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo102756h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo102756h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo102756h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo102756h(1, i5, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    /* renamed from: g */
    public final int mo102755g(int i, int i2) {
        int i3 = (mo102756h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo102756h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo102756h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo102756h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (mo102756h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (mo102756h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (mo102756h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo102756h(3, i7, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: h */
    public final boolean mo102756h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f84151b.mo102677v(i2, i);
        return this.f84150a.mo102666h(i2, i);
    }

    /* renamed from: i */
    public final int mo102757i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo102756h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (mo102756h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo102756h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo102756h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo102756h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo102756h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo102756h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (mo102756h(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }
}
