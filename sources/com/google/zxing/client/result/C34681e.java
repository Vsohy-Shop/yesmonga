package com.google.zxing.client.result;

import com.google.zxing.C34761k;
import java.util.ArrayList;

/* renamed from: com.google.zxing.client.result.e */
public final class C34681e extends C34673a {
    /* renamed from: s */
    public static String m141406s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* renamed from: t */
    public static String[] m141407t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: u */
    public C34679d mo102518k(C34761k kVar) {
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("BIZCARD:")) {
            return null;
        }
        String s = m141406s(C34673a.m141367r("N:", c, true), C34673a.m141367r("X:", c, true));
        String r = C34673a.m141367r("T:", c, true);
        String r2 = C34673a.m141367r("C:", c, true);
        return new C34679d(C34702t.m141539j(s), (String[]) null, (String) null, m141407t(C34673a.m141367r("B:", c, true), C34673a.m141367r("M:", c, true), C34673a.m141367r("F:", c, true)), (String[]) null, C34702t.m141539j(C34673a.m141367r("E:", c, true)), (String[]) null, (String) null, (String) null, C34673a.m141366q("A:", c, true), (String[]) null, r2, (String) null, r, (String[]) null, (String[]) null);
    }
}
