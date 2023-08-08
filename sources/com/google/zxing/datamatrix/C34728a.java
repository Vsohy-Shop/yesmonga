package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.C34717f;
import com.google.zxing.datamatrix.decoder.C34733c;
import com.google.zxing.datamatrix.detector.C34738a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.datamatrix.a */
public final class C34728a implements C34760j {

    /* renamed from: b */
    public static final C34762l[] f84134b = new C34762l[0];

    /* renamed from: a */
    public final C34733c f84135a = new C34733c();

    /* renamed from: b */
    public static C34710b m141703b(C34710b bVar) throws NotFoundException {
        int[] n = bVar.mo102673n();
        int[] i = bVar.mo102668i();
        if (n == null || i == null) {
            throw NotFoundException.m141229a();
        }
        int d = m141704d(n, bVar);
        int i2 = n[1];
        int i3 = i[1];
        int i4 = n[0];
        int i5 = ((i[0] - i4) + 1) / d;
        int i6 = ((i3 - i2) + 1) / d;
        if (i5 <= 0 || i6 <= 0) {
            throw NotFoundException.m141229a();
        }
        int i7 = d / 2;
        int i8 = i2 + i7;
        int i9 = i4 + i7;
        C34710b bVar2 = new C34710b(i5, i6);
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i10 * d) + i8;
            for (int i12 = 0; i12 < i5; i12++) {
                if (bVar.mo102666h((i12 * d) + i9, i11)) {
                    bVar2.mo102677v(i12, i10);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: d */
    public static int m141704d(int[] iArr, C34710b bVar) throws NotFoundException {
        int o = bVar.mo102674o();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < o && bVar.mo102666h(i, i2)) {
            i++;
        }
        if (i != o) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.m141229a();
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C34762l[] lVarArr;
        C34712d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C34717f b = new C34738a(bVar.mo102478b()).mo102776b();
            C34712d b2 = this.f84135a.mo102761b(b.mo102707a());
            lVarArr = b.mo102708b();
            dVar = b2;
        } else {
            dVar = this.f84135a.mo102761b(m141703b(bVar.mo102478b()));
            lVarArr = f84134b;
        }
        C34761k kVar = new C34761k(dVar.mo102692j(), dVar.mo102689g(), lVarArr, BarcodeFormat.DATA_MATRIX);
        List<byte[]> a = dVar.mo102683a();
        if (a != null) {
            kVar.mo102881j(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b3 = dVar.mo102684b();
        if (b3 != null) {
            kVar.mo102881j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b3);
        }
        return kVar;
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, ChecksumException, FormatException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    public void reset() {
    }
}
