package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.pk */
public final class C41507pk {
    /* renamed from: a */
    public static final int m168193a(int i, Object obj, Object obj2) {
        zzwe zzwe = (zzwe) obj;
        C41483ok okVar = (C41483ok) obj2;
        if (zzwe.isEmpty()) {
            return 0;
        }
        Iterator it = zzwe.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m168194b(Object obj) {
        return !((zzwe) obj).mo136169h();
    }

    /* renamed from: c */
    public static final Object m168195c(Object obj, Object obj2) {
        zzwe zzwe = (zzwe) obj;
        zzwe zzwe2 = (zzwe) obj2;
        if (!zzwe2.isEmpty()) {
            if (!zzwe.mo136169h()) {
                zzwe = zzwe.mo136163c();
            }
            zzwe.mo136168f(zzwe2);
        }
        return zzwe;
    }
}
