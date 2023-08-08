package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r3 */
public final class C39031r3 {
    /* renamed from: a */
    public static final int m160750a(int i, Object obj, Object obj2) {
        zzfj zzfj = (zzfj) obj;
        C39022q3 q3Var = (C39022q3) obj2;
        if (zzfj.isEmpty()) {
            return 0;
        }
        Iterator it = zzfj.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m160751b(Object obj, Object obj2) {
        zzfj zzfj = (zzfj) obj;
        zzfj zzfj2 = (zzfj) obj2;
        if (!zzfj2.isEmpty()) {
            if (!zzfj.mo123215h()) {
                zzfj = zzfj.mo123209c();
            }
            zzfj.mo123214f(zzfj2);
        }
        return zzfj;
    }
}
