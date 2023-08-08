package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.c */
public final class C34677c extends C34673a {
    /* renamed from: t */
    public static String m141380t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + ' ' + str.substring(0, indexOf);
    }

    /* renamed from: s */
    public C34679d mo102518k(C34761k kVar) {
        String[] q;
        String str;
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("MECARD:") || (q = C34673a.m141366q("N:", c, true)) == null) {
            return null;
        }
        String t = m141380t(q[0]);
        String r = C34673a.m141367r("SOUND:", c, true);
        String[] q2 = C34673a.m141366q("TEL:", c, true);
        String[] q3 = C34673a.m141366q("EMAIL:", c, true);
        String r2 = C34673a.m141367r("NOTE:", c, false);
        String[] q4 = C34673a.m141366q("ADR:", c, true);
        String r3 = C34673a.m141367r("BDAY:", c, true);
        if (!C34702t.m141533d(r3, 8)) {
            str = null;
        } else {
            str = r3;
        }
        return new C34679d(C34702t.m141539j(t), (String[]) null, r, q2, (String[]) null, q3, (String[]) null, (String) null, r2, q4, (String[]) null, C34673a.m141367r("ORG:", c, true), str, (String) null, C34673a.m141366q("URL:", c, true), (String[]) null);
    }
}
