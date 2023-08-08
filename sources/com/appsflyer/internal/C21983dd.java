package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.dd */
public class C21983dd {
    public static void AFInAppEventType(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
