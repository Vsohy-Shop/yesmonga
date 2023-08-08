package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.x */
public final class C34706x extends C34702t {
    /* renamed from: q */
    public C34687h mo102518k(C34761k kVar) {
        String str;
        String str2;
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("smtp:") && !c.startsWith("SMTP:")) {
            return null;
        }
        String substring = c.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str2 = substring2.substring(0, indexOf2);
                str = substring3;
            } else {
                str = null;
                str2 = substring2;
            }
        } else {
            str2 = null;
            str = null;
        }
        return new C34687h(new String[]{substring}, (String[]) null, (String[]) null, str2, str);
    }
}
