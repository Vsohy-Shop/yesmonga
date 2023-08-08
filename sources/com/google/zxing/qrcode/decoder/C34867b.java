package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.C34873g;

/* renamed from: com.google.zxing.qrcode.decoder.b */
public final class C34867b {

    /* renamed from: a */
    public final int f84731a;

    /* renamed from: b */
    public final byte[] f84732b;

    public C34867b(int i, byte[] bArr) {
        this.f84731a = i;
        this.f84732b = bArr;
    }

    /* renamed from: b */
    public static C34867b[] m142447b(byte[] bArr, C34873g gVar, ErrorCorrectionLevel errorCorrectionLevel) {
        int i;
        if (bArr.length == gVar.mo103184h()) {
            C34873g.C34875b f = gVar.mo103183f(errorCorrectionLevel);
            C34873g.C34874a[] a = f.mo103189a();
            int i2 = 0;
            for (C34873g.C34874a a2 : a) {
                i2 += a2.mo103187a();
            }
            C34867b[] bVarArr = new C34867b[i2];
            int i3 = 0;
            for (C34873g.C34874a aVar : a) {
                int i4 = 0;
                while (i4 < aVar.mo103187a()) {
                    int b = aVar.mo103188b();
                    bVarArr[i3] = new C34867b(b, new byte[(f.mo103190b() + b)]);
                    i4++;
                    i3++;
                }
            }
            int length = bVarArr[0].f84732b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && bVarArr[i5].f84732b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int b2 = length - f.mo103190b();
            int i7 = 0;
            for (int i8 = 0; i8 < b2; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    bVarArr[i9].f84732b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                bVarArr[i10].f84732b[b2] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = bVarArr[0].f84732b.length;
            while (b2 < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = b2;
                    } else {
                        i = b2 + 1;
                    }
                    bVarArr[i11].f84732b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo103166a() {
        return this.f84732b;
    }

    /* renamed from: c */
    public int mo103167c() {
        return this.f84731a;
    }
}
