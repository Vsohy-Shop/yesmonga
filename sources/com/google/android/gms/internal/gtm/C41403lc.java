package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.gtm.lc */
public final class C41403lc extends C41159b9 {
    /* renamed from: c */
    public static String m168003c(String str, String str2) throws UnsupportedEncodingException {
        int i;
        StringBuilder sb = new StringBuilder();
        Charset forName = Charset.forName("UTF-8");
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (str2.indexOf(charAt) != -1) {
                sb.append(charAt);
                i2++;
            } else {
                if (Character.isHighSurrogate(charAt)) {
                    int i3 = i2 + 1;
                    if (i3 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    } else if (Character.isLowSurrogate(str.charAt(i3))) {
                        i = 2;
                    } else {
                        throw new UnsupportedEncodingException();
                    }
                } else {
                    i = 1;
                }
                int i4 = i + i2;
                byte[] bytes = str.substring(i2, i4).getBytes(forName);
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i5] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i5] & DateTimeFieldType.f30626Z, 16)));
                }
                i2 = i4;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C41310hg hgVar;
        C40843u.m166191a(true);
        if (hgVarArr.length > 0) {
            hgVar = (C41310hg) C40843u.m166202l(hgVarArr[0]);
        } else {
            hgVar = C41431mg.f104800h;
        }
        try {
            return new C41599tg(m168003c(C41135a9.m167070d(hgVar), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException unused) {
            return C41431mg.f104800h;
        }
    }
}
