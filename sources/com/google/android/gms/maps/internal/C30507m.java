package com.google.android.gms.maps.internal;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.maps.internal.m */
public final class C30507m {
    /* renamed from: a */
    public static byte m122739a(@C0363p0 Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    @C0363p0
    /* renamed from: b */
    public static Boolean m122740b(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
