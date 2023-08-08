package com.google.zxing.client.result;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.urbanairship.AirshipConfigOptions;
import com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.h0 */
public final class C34688h0 extends C34702t {

    /* renamed from: g */
    public static final Pattern f83971g = Pattern.compile("[IOQ]");

    /* renamed from: h */
    public static final Pattern f83972h = Pattern.compile("[A-Z0-9]{17}");

    /* renamed from: q */
    public static char m141465q(int i) {
        if (i < 10) {
            return (char) (i + 48);
        }
        if (i == 10) {
            return MaskModel.f27490e;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public static boolean m141466r(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i + 1;
            i2 += m141470w(i3) * m141469v(charSequence.charAt(i));
            i = i3;
        }
        if (charSequence.charAt(8) == m141465q(i2 % 11)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static String m141467s(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt != '9') {
            if (charAt != 'S') {
                if (charAt != 'Z') {
                    switch (charAt) {
                        case '1':
                        case '4':
                        case '5':
                            return AirshipConfigOptions.f87117e0;
                        case '2':
                            return "CA";
                        case '3':
                            if (charAt2 < 'A' || charAt2 > 'W') {
                                return null;
                            }
                            return "MX";
                        default:
                            switch (charAt) {
                                case 'J':
                                    if (charAt2 < 'A' || charAt2 > 'T') {
                                        return null;
                                    }
                                    return "JP";
                                case 'K':
                                    if (charAt2 < 'L' || charAt2 > 'R') {
                                        return null;
                                    }
                                    return "KO";
                                case 'L':
                                    return "CN";
                                case 'M':
                                    if (charAt2 < 'A' || charAt2 > 'E') {
                                        return null;
                                    }
                                    return "IN";
                                default:
                                    switch (charAt) {
                                        case 'V':
                                            if (charAt2 >= 'F' && charAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (charAt2 < 'S' || charAt2 > 'W') {
                                                return null;
                                            }
                                            return "ES";
                                        case 'W':
                                            return "DE";
                                        case 'X':
                                            if (charAt2 == '0') {
                                                return "RU";
                                            }
                                            if (charAt2 < '3' || charAt2 > '9') {
                                                return null;
                                            }
                                            return "RU";
                                        default:
                                            return null;
                                    }
                            }
                    }
                } else if (charAt2 < 'A' || charAt2 > 'R') {
                    return null;
                } else {
                    return "IT";
                }
            } else if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            } else {
                if (charAt2 < 'N' || charAt2 > 'T') {
                    return null;
                }
                return "DE";
            }
        } else if (charAt2 >= 'A' && charAt2 <= 'E') {
            return "BR";
        } else {
            if (charAt2 < '3' || charAt2 > '9') {
                return null;
            }
            return "BR";
        }
    }

    /* renamed from: t */
    public static int m141468t(char c) {
        if (c >= 'E' && c <= 'H') {
            return (c - 'E') + 1984;
        }
        if (c >= 'J' && c <= 'N') {
            return (c - 'J') + 1988;
        }
        if (c == 'P') {
            return 1993;
        }
        if (c >= 'R' && c <= 'T') {
            return (c - 'R') + 1994;
        }
        if (c >= 'V' && c <= 'Y') {
            return (c - C15369g.f37984j) + 1997;
        }
        if (c >= '1' && c <= '9') {
            return (c - '1') + 2001;
        }
        if (c >= 'A' && c <= 'D') {
            return (c - C15369g.f37994t) + 2010;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public static int m141469v(char c) {
        if (c >= 'A' && c <= 'I') {
            return (c - C15369g.f37994t) + 1;
        }
        if (c >= 'J' && c <= 'R') {
            return (c - 'J') + 1;
        }
        if (c >= 'S' && c <= 'Z') {
            return (c - C15369g.f37988n) + 2;
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public static int m141470w(int i) {
        if (i > 0 && i <= 7) {
            return 9 - i;
        }
        if (i == 8) {
            return 10;
        }
        if (i == 9) {
            return 0;
        }
        if (i >= 10 && i <= 17) {
            return 19 - i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    public C34686g0 mo102518k(C34761k kVar) {
        if (kVar.mo102873b() != BarcodeFormat.CODE_39) {
            return null;
        }
        String trim = f83971g.matcher(kVar.mo102878g()).replaceAll("").trim();
        if (!f83972h.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!m141466r(trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            return new C34686g0(trim, substring, trim.substring(3, 9), trim.substring(9, 17), m141467s(substring), trim.substring(3, 8), m141468t(trim.charAt(9)), trim.charAt(10), trim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
