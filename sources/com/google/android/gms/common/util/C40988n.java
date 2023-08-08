package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import org.joda.time.DateTimeFieldType;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.common.util.n */
public class C40988n {

    /* renamed from: a */
    public static final char[] f104252a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37994t, 'B', C15369g.f37986l, 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f104253b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37993s, 'b', C15369g.f37985k, 'd', 'e', 'f'};

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static String m166656a(@C0359n0 byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f104253b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & DateTimeFieldType.f30626Z];
        }
        return new String(cArr);
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static String m166657b(@C0359n0 byte[] bArr) {
        return m166658c(bArr, false);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static String m166658c(@C0359n0 byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            char[] cArr = f104252a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & DateTimeFieldType.f30626Z]);
            i++;
        }
        return sb.toString();
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static byte[] m166659d(@C0359n0 String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
