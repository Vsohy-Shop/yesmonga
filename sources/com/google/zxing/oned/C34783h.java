package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.h */
public final class C34783h extends C34827x {

    /* renamed from: l */
    public static final int[] f84387l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k */
    public final int[] f84388k = new int[4];

    /* renamed from: s */
    public static void m142011s(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f84387l[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: l */
    public int mo102911l(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f84388k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o = aVar.mo102649o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < o; i3++) {
            int j = C34827x.m142191j(aVar, iArr2, i, C34827x.f84521j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m142011s(sb, i2);
        int i5 = C34827x.m142192n(aVar, i, true, C34827x.f84518g)[1];
        for (int i6 = 0; i6 < 6 && i5 < o; i6++) {
            sb.append((char) (C34827x.m142191j(aVar, iArr2, i5, C34827x.f84520i) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* renamed from: q */
    public BarcodeFormat mo102912q() {
        return BarcodeFormat.EAN_13;
    }
}
