package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.util.c */
public final class C40967c {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static byte[] m166593a(@C0359n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static byte[] m166594b(@C0359n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static byte[] m166595c(@C0359n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static String m166596d(@C0359n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static String m166597e(@C0359n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public static String m166598f(@C0359n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
