package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import com.google.zxing.pdf417.encoder.C34851c;
import com.google.zxing.pdf417.encoder.C34852d;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.d */
public final class C34833d implements C34774n {

    /* renamed from: a */
    public static final int f84550a = 30;

    /* renamed from: b */
    public static final int f84551b = 2;

    /* renamed from: c */
    public static C34710b m142243c(byte[][] bArr, int i) {
        int i2 = i * 2;
        C34710b bVar = new C34710b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo102661c();
        int k = (bVar.mo102670k() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.mo102677v(i4 + i, k);
                }
            }
            i3++;
            k--;
        }
        return bVar;
    }

    /* renamed from: d */
    public static C34710b m142244d(C34852d dVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        boolean z2;
        boolean z3;
        dVar.mo103147e(str, i);
        byte[][] c = dVar.mo103148f().mo103134c(1, 4);
        if (i3 > i2) {
            z = true;
        } else {
            z = false;
        }
        if (c[0].length < c.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            c = m142245e(c);
            z3 = true;
        } else {
            z3 = false;
        }
        int length = i2 / c[0].length;
        int length2 = i3 / c.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m142243c(c, i4);
        }
        byte[][] c2 = dVar.mo103148f().mo103134c(length, length << 2);
        if (z3) {
            c2 = m142245e(c2);
        }
        return m142243c(c2, i4);
    }

    /* renamed from: e */
    public static byte[][] m142245e(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            C34852d dVar = new C34852d();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
                if (map.containsKey(encodeHintType)) {
                    dVar.mo103149h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
                }
                EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
                if (map.containsKey(encodeHintType2)) {
                    dVar.mo103150i(Compaction.valueOf(map.get(encodeHintType2).toString()));
                }
                EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
                if (map.containsKey(encodeHintType3)) {
                    C34851c cVar = (C34851c) map.get(encodeHintType3);
                    dVar.mo103151j(cVar.mo103141a(), cVar.mo103143c(), cVar.mo103142b(), cVar.mo103144d());
                }
                EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType4)) {
                    i3 = Integer.parseInt(map.get(encodeHintType4).toString());
                }
                EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(encodeHintType5)) {
                    i4 = Integer.parseInt(map.get(encodeHintType5).toString());
                }
                EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
                if (map.containsKey(encodeHintType6)) {
                    dVar.mo103152k(Charset.forName(map.get(encodeHintType6).toString()));
                }
            }
            return m142244d(dVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
