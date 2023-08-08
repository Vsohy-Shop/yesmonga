package com.google.zxing.oned;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.Map;

/* renamed from: com.google.zxing.oned.g */
public class C34782g extends C34793r {
    @Deprecated
    /* renamed from: c */
    public static int m142005c(boolean[] zArr, int i, int[] iArr, boolean z) {
        boolean z2;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[i] = z2;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: h */
    public static int m142006h(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: i */
    public static int m142007i(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += C34781f.f84381c.indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: j */
    public static String m142008j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append(C15369g.f37993s);
                sb.append((char) ((charAt + C15369g.f37994t) - 1));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) ((charAt + C15369g.f37994t) - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append(C15369g.f37985k);
                sb.append((char) ((charAt + C15369g.f37994t) - 33));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) ((charAt + C15369g.f37994t) - 97));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo102422a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: e */
    public boolean[] mo102903e(String str) {
        String j = m142008j(str);
        int length = j.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((j.length() + 2 + 2) * 9) + 1)];
            int h = m142006h(zArr, 0, C34781f.f84384f);
            for (int i = 0; i < length; i++) {
                h += m142006h(zArr, h, C34781f.f84383e[C34781f.f84381c.indexOf(j.charAt(i))]);
            }
            int i2 = m142007i(j, 20);
            int[] iArr = C34781f.f84383e;
            int h2 = h + m142006h(zArr, h, iArr[i2]);
            int h3 = h2 + m142006h(zArr, h2, iArr[m142007i(j + C34781f.f84381c.charAt(i2), 15)]);
            zArr[h3 + m142006h(zArr, h3, C34781f.f84384f)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }
}
