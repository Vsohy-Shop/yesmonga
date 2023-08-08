package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.j */
public final class C34785j extends C34827x {

    /* renamed from: k */
    public final int[] f84390k = new int[4];

    /* renamed from: l */
    public int mo102911l(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f84390k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o = aVar.mo102649o();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < o; i2++) {
            sb.append((char) (C34827x.m142191j(aVar, iArr2, i, C34827x.f84520i) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C34827x.m142192n(aVar, i, true, C34827x.f84518g)[1];
        for (int i5 = 0; i5 < 4 && i4 < o; i5++) {
            sb.append((char) (C34827x.m142191j(aVar, iArr2, i4, C34827x.f84520i) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* renamed from: q */
    public BarcodeFormat mo102912q() {
        return BarcodeFormat.EAN_8;
    }
}
