package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.C34709a;
import java.util.List;

/* renamed from: com.google.zxing.oned.rss.expanded.a */
public final class C34799a {
    /* renamed from: a */
    public static C34709a m142077a(List<C34800b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo102947c() == null) {
            size--;
        }
        C34709a aVar = new C34709a(size * 12);
        int i = 0;
        int b = list.get(0).mo102947c().mo102928b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo102654x(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C34800b bVar = list.get(i3);
            int b2 = bVar.mo102946b().mo102928b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo102654x(i);
                }
                i++;
            }
            if (bVar.mo102947c() != null) {
                int b3 = bVar.mo102947c().mo102928b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo102654x(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
