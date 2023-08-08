package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.t */
public final class C34823t implements C34774n {

    /* renamed from: a */
    public final C34784i f84506a = new C34784i();

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f84506a.mo102422a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
