package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.C34734d;

/* renamed from: com.google.zxing.datamatrix.decoder.b */
public final class C34732b {

    /* renamed from: a */
    public final int f84153a;

    /* renamed from: b */
    public final byte[] f84154b;

    public C34732b(int i, byte[] bArr) {
        this.f84153a = i;
        this.f84154b = bArr;
    }

    /* renamed from: b */
    public static C34732b[] m141730b(byte[] bArr, C34734d dVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        C34734d.C34737c d = dVar.mo102765d();
        C34734d.C34736b[] a = d.mo102773a();
        int i4 = 0;
        for (C34734d.C34736b a2 : a) {
            i4 += a2.mo102771a();
        }
        C34732b[] bVarArr = new C34732b[i4];
        int i5 = 0;
        for (C34734d.C34736b bVar : a) {
            int i6 = 0;
            while (i6 < bVar.mo102771a()) {
                int b = bVar.mo102772b();
                bVarArr[i5] = new C34732b(b, new byte[(d.mo102774b() + b)]);
                i6++;
                i5++;
            }
        }
        int length = bVarArr[0].f84154b.length - d.mo102774b();
        int i7 = length - 1;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = 0;
            while (i10 < i5) {
                bVarArr[i10].f84154b[i9] = bArr[i8];
                i10++;
                i8++;
            }
        }
        if (dVar.mo102769i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i5;
        }
        int i11 = 0;
        while (i11 < i) {
            bVarArr[i11].f84154b[i7] = bArr[i8];
            i11++;
            i8++;
        }
        int length2 = bVarArr[0].f84154b.length;
        while (length < length2) {
            int i12 = 0;
            while (i12 < i5) {
                if (z) {
                    i2 = (i12 + 8) % i5;
                } else {
                    i2 = i12;
                }
                if (!z || i2 <= 7) {
                    i3 = length;
                } else {
                    i3 = length - 1;
                }
                bVarArr[i2].f84154b[i3] = bArr[i8];
                i12++;
                i8++;
            }
            length++;
        }
        if (i8 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo102758a() {
        return this.f84154b;
    }

    /* renamed from: c */
    public int mo102759c() {
        return this.f84153a;
    }
}
