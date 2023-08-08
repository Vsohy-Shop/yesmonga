package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.z */
public final class C34708z extends C34702t {
    /* renamed from: q */
    public C34707y mo102518k(C34761k kVar) {
        String str;
        String str2;
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("tel:") && !c.startsWith("TEL:")) {
            return null;
        }
        if (c.startsWith("TEL:")) {
            str = "tel:" + c.substring(4);
        } else {
            str = c;
        }
        int indexOf = c.indexOf(63, 4);
        if (indexOf < 0) {
            str2 = c.substring(4);
        } else {
            str2 = c.substring(4, indexOf);
        }
        return new C34707y(str2, str, (String) null);
    }
}
