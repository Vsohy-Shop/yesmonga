package com.google.zxing.client.result;

import com.google.zxing.C34761k;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.zxing.client.result.b */
public final class C34675b extends C34702t {
    /* renamed from: q */
    public static String[] m141371q(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String g = C34702t.m141536g(str + i2 + C12361b.f30257h, str2, 13, z);
            if (g == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(g);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(C34702t.f84014f);
    }

    /* renamed from: r */
    public C34679d mo102518k(C34761k kVar) {
        String c = C34702t.m141532c(kVar);
        String[] strArr = null;
        if (!c.contains("MEMORY") || !c.contains("\r\n")) {
            return null;
        }
        String g = C34702t.m141536g("NAME1:", c, 13, true);
        String g2 = C34702t.m141536g("NAME2:", c, 13, true);
        String[] q = m141371q("TEL", 3, c, true);
        String[] q2 = m141371q("MAIL", 3, c, true);
        String g3 = C34702t.m141536g("MEMORY:", c, 13, false);
        String g4 = C34702t.m141536g("ADD:", c, 13, true);
        if (g4 != null) {
            strArr = new String[]{g4};
        }
        return new C34679d(C34702t.m141539j(g), (String[]) null, g2, q, (String[]) null, q2, (String[]) null, (String) null, g3, strArr, (String[]) null, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }
}
