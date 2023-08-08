package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.k */
public final class C34786k extends C34828y {

    /* renamed from: b */
    public static final int f84391b = 67;

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo102422a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: e */
    public boolean[] mo102903e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + C34827x.m142195r(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C34827x.m142190i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        C34793r.m142043d(str);
        boolean[] zArr = new boolean[67];
        int c = C34793r.m142042c(zArr, 0, C34827x.f84517f, true) + 0;
        for (int i = 0; i <= 3; i++) {
            c += C34793r.m142042c(zArr, c, C34827x.f84520i[Character.digit(str.charAt(i), 10)], false);
        }
        int c2 = c + C34793r.m142042c(zArr, c, C34827x.f84518g, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            c2 += C34793r.m142042c(zArr, c2, C34827x.f84520i[Character.digit(str.charAt(i2), 10)], true);
        }
        C34793r.m142042c(zArr, c2, C34827x.f84517f, true);
        return zArr;
    }
}
