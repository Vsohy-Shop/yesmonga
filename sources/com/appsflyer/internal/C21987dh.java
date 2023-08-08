package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.dh */
public final class C21987dh {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFKeystoreWrapper;
    public static int valueOf;
    public static int values;

    public static void AFInAppEventType(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        int[][] iArr = C21976cx.AFInAppEventType.AFInAppEventParameterName;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
