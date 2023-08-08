package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40858y;
import java.util.Locale;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.i5 */
public final class C41323i5 {
    /* renamed from: a */
    public static String m167694a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if ((b & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: b */
    public static byte[] m167695b(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 16);
                int digit2 = Character.digit(str.charAt(i + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("purported base16 string has illegal char");
                }
                bArr[i / 2] = (byte) ((digit << 4) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("purported base16 string has odd number of characters");
    }
}
