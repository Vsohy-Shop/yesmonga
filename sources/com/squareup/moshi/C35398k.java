package com.squareup.moshi;

import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.squareup.moshi.k */
public final class C35398k {

    /* renamed from: a */
    public static final int f86961a = 1;

    /* renamed from: b */
    public static final int f86962b = 2;

    /* renamed from: c */
    public static final int f86963c = 3;

    /* renamed from: d */
    public static final int f86964d = 4;

    /* renamed from: e */
    public static final int f86965e = 5;

    /* renamed from: f */
    public static final int f86966f = 6;

    /* renamed from: g */
    public static final int f86967g = 7;

    /* renamed from: h */
    public static final int f86968h = 8;

    /* renamed from: i */
    public static final int f86969i = 9;

    /* renamed from: a */
    public static String m145828a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(C12361b.f30260k);
                sb.append(iArr2[i2]);
                sb.append(C12361b.f30261l);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
