package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.C34883b;
import com.google.zxing.qrcode.encoder.C34884c;
import com.google.zxing.qrcode.encoder.C34888f;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.b */
public final class C34857b implements C34774n {

    /* renamed from: a */
    public static final int f84700a = 4;

    /* renamed from: c */
    public static C34710b m142422c(C34888f fVar, int i, int i2, int i3) {
        C34883b c = fVar.mo103245c();
        if (c != null) {
            int e = c.mo103238e();
            int d = c.mo103237d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C34710b bVar = new C34710b(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < e) {
                    if (c.mo103235b(i10, i9) == 1) {
                        bVar.mo102678x(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(encodeHintType)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
                }
                EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType2)) {
                    i3 = Integer.parseInt(map.get(encodeHintType2).toString());
                }
            }
            return m142422c(C34884c.m142558p(str, errorCorrectionLevel, map), i, i2, i3);
        }
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
