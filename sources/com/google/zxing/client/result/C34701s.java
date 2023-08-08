package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.oned.C34829z;

/* renamed from: com.google.zxing.client.result.s */
public final class C34701s extends C34702t {
    /* renamed from: q */
    public C34700r mo102518k(C34761k kVar) {
        String str;
        BarcodeFormat b = kVar.mo102873b();
        if (b != BarcodeFormat.UPC_A && b != BarcodeFormat.UPC_E && b != BarcodeFormat.EAN_8 && b != BarcodeFormat.EAN_13) {
            return null;
        }
        String c = C34702t.m141532c(kVar);
        if (!C34702t.m141533d(c, c.length())) {
            return null;
        }
        if (b == BarcodeFormat.UPC_E && c.length() == 8) {
            str = C34829z.m142203s(c);
        } else {
            str = c;
        }
        return new C34700r(c, str);
    }
}
