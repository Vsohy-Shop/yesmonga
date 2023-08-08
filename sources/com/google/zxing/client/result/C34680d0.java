package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.d0 */
public final class C34680d0 extends C34702t {
    /* renamed from: q */
    public C34676b0 mo102518k(C34761k kVar) {
        int indexOf;
        String c = C34702t.m141532c(kVar);
        String str = null;
        if ((!c.startsWith("urlto:") && !c.startsWith("URLTO:")) || (indexOf = c.indexOf(58, 6)) < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = c.substring(6, indexOf);
        }
        return new C34676b0(c.substring(indexOf + 1), str);
    }
}
