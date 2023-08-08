package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.p */
public final class C34698p extends C34702t {
    /* renamed from: q */
    public C34697o mo102518k(C34761k kVar) {
        if (kVar.mo102873b() != BarcodeFormat.EAN_13) {
            return null;
        }
        String c = C34702t.m141532c(kVar);
        if (c.length() != 13) {
            return null;
        }
        if (c.startsWith("978") || c.startsWith("979")) {
            return new C34697o(c);
        }
        return null;
    }
}
