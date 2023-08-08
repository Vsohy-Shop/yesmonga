package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.w */
public final class C34705w extends C34702t {
    /* renamed from: q */
    public C34704v mo102518k(C34761k kVar) {
        String str;
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("smsto:") && !c.startsWith("SMSTO:") && !c.startsWith("mmsto:") && !c.startsWith("MMSTO:")) {
            return null;
        }
        String substring = c.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C34704v(substring, (String) null, (String) null, str);
    }
}
