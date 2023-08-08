package com.google.android.gms.internal.mlkit_common;

/* renamed from: com.google.android.gms.internal.mlkit_common.m */
public final class C42435m {
    /* renamed from: a */
    public static Object[] m171568a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
