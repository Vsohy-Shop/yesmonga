package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ra */
public final class C42161ra {
    /* renamed from: a */
    public static final int m170784a(int i, Object obj, Object obj2) {
        zzmc zzmc = (zzmc) obj;
        C42144qa qaVar = (C42144qa) obj2;
        if (zzmc.isEmpty()) {
            return 0;
        }
        Iterator it = zzmc.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m170785b(Object obj, Object obj2) {
        zzmc zzmc = (zzmc) obj;
        zzmc zzmc2 = (zzmc) obj2;
        if (!zzmc2.isEmpty()) {
            if (!zzmc.mo137613h()) {
                zzmc = zzmc.mo137607c();
            }
            zzmc.mo137612f(zzmc2);
        }
        return zzmc;
    }
}
