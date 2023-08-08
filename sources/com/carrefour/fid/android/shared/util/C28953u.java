package com.carrefour.fid.android.shared.util;

/* renamed from: com.carrefour.fid.android.shared.util.u */
public final /* synthetic */ class C28953u {
    /* renamed from: a */
    public static /* synthetic */ int m119763a(String str, int i) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
