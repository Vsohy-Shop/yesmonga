package com.contentsquare.android.sdk;

import java.security.MessageDigest;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.contentsquare.android.sdk.n1 */
public class C14539n1 {

    /* renamed from: a */
    public String f35985a = null;

    public C14539n1(String str) {
        if (!C14358g3.m61811e(str)) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes("iso-8859-1"), 0, str.length());
                this.f35985a = m62676b(instance.digest());
            } catch (Exception e) {
                new C14453jf("MD5").mo35678g(e, "error in calculating MD5 sum ", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static String m62676b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            byte b = (bArr[i] >>> 4) & DateTimeFieldType.f30626Z;
            int i2 = 0;
            while (true) {
                sb.append((char) ((b < 0 || b > 9) ? (b - 10) + 97 : b + 48));
                b = bArr[i] & DateTimeFieldType.f30626Z;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo35957a() {
        return this.f35985a;
    }
}
