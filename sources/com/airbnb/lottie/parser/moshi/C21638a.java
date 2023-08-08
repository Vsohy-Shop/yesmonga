package com.airbnb.lottie.parser.moshi;

import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.parser.moshi.a */
public final class C21638a {

    /* renamed from: a */
    public static final int f55981a = 1;

    /* renamed from: b */
    public static final int f55982b = 2;

    /* renamed from: c */
    public static final int f55983c = 3;

    /* renamed from: d */
    public static final int f55984d = 4;

    /* renamed from: e */
    public static final int f55985e = 5;

    /* renamed from: f */
    public static final int f55986f = 6;

    /* renamed from: g */
    public static final int f55987g = 7;

    /* renamed from: h */
    public static final int f55988h = 8;

    /* renamed from: a */
    public static String m99652a(int i, int[] iArr, String[] strArr, int[] iArr2) {
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
