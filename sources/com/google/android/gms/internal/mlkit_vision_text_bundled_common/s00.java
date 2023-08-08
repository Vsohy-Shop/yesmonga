package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

public final class s00 {
    /* renamed from: a */
    public static final int m121057a(int i, Object obj, Object obj2) {
        zbyz zbyz = (zbyz) obj;
        q00 q00 = (q00) obj2;
        int i2 = 0;
        if (!zbyz.isEmpty()) {
            for (Map.Entry entry : zbyz.entrySet()) {
                i2 += q00.mo84793a(i, entry.getKey(), entry.getValue());
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final Object m121058b(Object obj, Object obj2) {
        zbyz zbyz = (zbyz) obj;
        zbyz zbyz2 = (zbyz) obj2;
        if (!zbyz2.isEmpty()) {
            if (!zbyz.mo85012h()) {
                zbyz = zbyz.mo85006c();
            }
            zbyz.mo85011f(zbyz2);
        }
        return zbyz;
    }
}
