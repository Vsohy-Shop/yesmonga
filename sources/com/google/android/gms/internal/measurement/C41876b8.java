package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.b8 */
public final class C41876b8 {
    /* renamed from: a */
    public static Object m169711a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m169712b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m169711a(objArr[i2], i2);
        }
        return objArr;
    }
}
