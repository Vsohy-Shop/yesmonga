package com.google.android.gms.internal.gtm;

import androidx.exifinterface.media.C19135a;
import com.google.android.gms.common.internal.C40843u;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C11354n;

/* renamed from: com.google.android.gms.internal.gtm.ic */
public final class C41330ic extends C41159b9 {
    /* renamed from: c */
    public static String m167704c(String str, String str2) throws UnsupportedEncodingException {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                sb.append(charAt);
                i++;
            } else {
                byte d = m167705d(str, i);
                int i2 = i + 3;
                if ((d & C11354n.f28471b) != 0) {
                    int i3 = 0;
                    while (((d << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = d;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte d2 = m167705d(str, i2);
                        i2 += 3;
                        if ((d2 & C19135a.f49026p7) == 128) {
                            bArr[i4] = d2;
                            i4++;
                        } else {
                            throw new UnsupportedEncodingException();
                        }
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        sb.append(decode);
                    } else {
                        sb.append(str.substring(i, i2));
                    }
                } else if (str2.indexOf(d) == -1) {
                    sb.append((char) d);
                } else {
                    sb.append(str.substring(i2 - 3, i2));
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte m167705d(String str, int i) throws UnsupportedEncodingException {
        int i2 = i + 3;
        if (i2 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i2);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
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
            return new C41599tg(m167704c(C41135a9.m167070d(hgVar), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return C41431mg.f104800h;
        }
    }
}
