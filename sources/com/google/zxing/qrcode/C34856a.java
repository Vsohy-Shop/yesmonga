package com.google.zxing.qrcode;

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
import com.google.zxing.qrcode.decoder.C34870d;
import com.google.zxing.qrcode.decoder.C34872f;
import com.google.zxing.qrcode.detector.C34879c;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a */
public class C34856a implements C34760j {

    /* renamed from: b */
    public static final C34762l[] f84698b = new C34762l[0];

    /* renamed from: a */
    public final C34870d f84699a = new C34870d();

    /* renamed from: e */
    public static C34710b m142417e(C34710b bVar) throws NotFoundException {
        int[] n = bVar.mo102673n();
        int[] i = bVar.mo102668i();
        if (n == null || i == null) {
            throw NotFoundException.m141229a();
        }
        float g = m142418g(n, bVar);
        int i2 = n[1];
        int i3 = i[1];
        int i4 = n[0];
        int i5 = i[0];
        if (i4 >= i5 || i2 >= i3) {
            throw NotFoundException.m141229a();
        }
        int i6 = i3 - i2;
        if (i6 == i5 - i4 || (i5 = i4 + i6) < bVar.mo102674o()) {
            int round = Math.round(((float) ((i5 - i4) + 1)) / g);
            int round2 = Math.round(((float) (i6 + 1)) / g);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.m141229a();
            } else if (round2 == round) {
                int i7 = (int) (g / 2.0f);
                int i8 = i2 + i7;
                int i9 = i4 + i7;
                int i10 = (((int) (((float) (round - 1)) * g)) + i9) - i5;
                if (i10 > 0) {
                    if (i10 <= i7) {
                        i9 -= i10;
                    } else {
                        throw NotFoundException.m141229a();
                    }
                }
                int i11 = (((int) (((float) (round2 - 1)) * g)) + i8) - i3;
                if (i11 > 0) {
                    if (i11 <= i7) {
                        i8 -= i11;
                    } else {
                        throw NotFoundException.m141229a();
                    }
                }
                C34710b bVar2 = new C34710b(round, round2);
                for (int i12 = 0; i12 < round2; i12++) {
                    int i13 = ((int) (((float) i12) * g)) + i8;
                    for (int i14 = 0; i14 < round; i14++) {
                        if (bVar.mo102666h(((int) (((float) i14) * g)) + i9, i13)) {
                            bVar2.mo102677v(i14, i12);
                        }
                    }
                }
                return bVar2;
            } else {
                throw NotFoundException.m141229a();
            }
        } else {
            throw NotFoundException.m141229a();
        }
    }

    /* renamed from: g */
    public static float m142418g(int[] iArr, C34710b bVar) throws NotFoundException {
        int k = bVar.mo102670k();
        int o = bVar.mo102674o();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < o && i2 < k) {
            if (z != bVar.mo102666h(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != o && i2 != k) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public final C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C34762l[] lVarArr;
        C34712d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C34717f f = new C34879c(bVar.mo102478b()).mo103218f(map);
            C34712d c = this.f84699a.mo103170c(f.mo102707a(), map);
            lVarArr = f.mo102708b();
            dVar = c;
        } else {
            dVar = this.f84699a.mo103170c(m142417e(bVar.mo102478b()), map);
            lVarArr = f84698b;
        }
        if (dVar.mo102688f() instanceof C34872f) {
            ((C34872f) dVar.mo102688f()).mo103178a(lVarArr);
        }
        C34761k kVar = new C34761k(dVar.mo102692j(), dVar.mo102689g(), lVarArr, BarcodeFormat.QR_CODE);
        List<byte[]> a = dVar.mo102683a();
        if (a != null) {
            kVar.mo102881j(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b = dVar.mo102684b();
        if (b != null) {
            kVar.mo102881j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b);
        }
        if (dVar.mo102693k()) {
            kVar.mo102881j(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.mo102691i()));
            kVar.mo102881j(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.mo102690h()));
        }
        return kVar;
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, ChecksumException, FormatException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: f */
    public final C34870d mo103153f() {
        return this.f84699a;
    }

    public void reset() {
    }
}
