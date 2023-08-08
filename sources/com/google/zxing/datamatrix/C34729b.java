package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34645c;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C34710b;
import com.google.zxing.datamatrix.encoder.C34743e;
import com.google.zxing.datamatrix.encoder.C34747i;
import com.google.zxing.datamatrix.encoder.C34748j;
import com.google.zxing.datamatrix.encoder.C34749k;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.C34883b;
import java.util.Map;

/* renamed from: com.google.zxing.datamatrix.b */
public final class C34729b implements C34774n {
    /* renamed from: c */
    public static C34710b m141707c(C34883b bVar, int i, int i2) {
        C34710b bVar2;
        int e = bVar.mo103238e();
        int d = bVar.mo103237d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 < d || i < e) {
            bVar2 = new C34710b(e, d);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new C34710b(i, i2);
        }
        bVar2.mo102661c();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (bVar.mo103235b(i7, i5) == 1) {
                    bVar2.mo102678x(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }

    /* renamed from: d */
    public static C34710b m141708d(C34743e eVar, C34749k kVar, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = kVar.mo102828i();
        int h = kVar.mo102827h();
        C34883b bVar = new C34883b(kVar.mo102830k(), kVar.mo102829j());
        int i4 = 0;
        for (int i5 = 0; i5 < h; i5++) {
            if (i5 % kVar.f84218e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < kVar.mo102830k(); i7++) {
                    if (i7 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.mo103241h(i6, i4, z2);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                if (i9 % kVar.f84217d == 0) {
                    bVar.mo103241h(i8, i4, true);
                    i8++;
                }
                bVar.mo103241h(i8, i4, eVar.mo102793e(i9, i5));
                i8++;
                int i10 = kVar.f84217d;
                if (i9 % i10 == i10 - 1) {
                    if (i5 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo103241h(i8, i4, z);
                    i8++;
                }
            }
            i4++;
            int i11 = kVar.f84218e;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < kVar.mo102830k(); i13++) {
                    bVar.mo103241h(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return m141707c(bVar, i, i2);
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        C34645c cVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            C34645c cVar2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                C34645c cVar3 = (C34645c) map.get(EncodeHintType.MIN_SIZE);
                if (cVar3 == null) {
                    cVar3 = null;
                }
                cVar = (C34645c) map.get(EncodeHintType.MAX_SIZE);
                if (cVar == null) {
                    cVar = null;
                }
                cVar2 = cVar3;
            } else {
                cVar = null;
            }
            String c = C34748j.m141819c(str, symbolShapeHint, cVar2, cVar);
            C34749k o = C34749k.m141835o(c.length(), symbolShapeHint, cVar2, cVar, true);
            C34743e eVar = new C34743e(C34747i.m141816c(c, o), o.mo102828i(), o.mo102827h());
            eVar.mo102799k();
            return m141708d(eVar, o, i, i2);
        }
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
