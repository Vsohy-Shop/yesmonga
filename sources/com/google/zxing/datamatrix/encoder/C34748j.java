package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C34645c;
import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.j */
public final class C34748j {

    /* renamed from: a */
    public static final char f84192a = '';

    /* renamed from: b */
    public static final char f84193b = 'æ';

    /* renamed from: c */
    public static final char f84194c = 'ç';

    /* renamed from: d */
    public static final char f84195d = 'ë';

    /* renamed from: e */
    public static final char f84196e = 'ì';

    /* renamed from: f */
    public static final char f84197f = 'í';

    /* renamed from: g */
    public static final char f84198g = 'î';

    /* renamed from: h */
    public static final char f84199h = 'ï';

    /* renamed from: i */
    public static final char f84200i = 'ð';

    /* renamed from: j */
    public static final char f84201j = 'þ';

    /* renamed from: k */
    public static final char f84202k = 'þ';

    /* renamed from: l */
    public static final String f84203l = "[)>\u001e05\u001d";

    /* renamed from: m */
    public static final String f84204m = "[)>\u001e06\u001d";

    /* renamed from: n */
    public static final String f84205n = "\u001e\u0004";

    /* renamed from: o */
    public static final int f84206o = 0;

    /* renamed from: p */
    public static final int f84207p = 1;

    /* renamed from: q */
    public static final int f84208q = 2;

    /* renamed from: r */
    public static final int f84209r = 3;

    /* renamed from: s */
    public static final int f84210s = 4;

    /* renamed from: t */
    public static final int f84211t = 5;

    /* renamed from: a */
    public static int m141817a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m141823g(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m141818b(String str) {
        return m141819c(str, SymbolShapeHint.FORCE_NONE, (C34645c) null, (C34645c) null);
    }

    /* renamed from: c */
    public static String m141819c(String str, SymbolShapeHint symbolShapeHint, C34645c cVar, C34645c cVar2) {
        int i = 0;
        C34745g[] gVarArr = {new C34739a(), new C34741c(), new C34750l(), new C34751m(), new C34744f(), new C34740b()};
        C34746h hVar = new C34746h(str);
        hVar.mo102816o(symbolShapeHint);
        hVar.mo102814m(cVar, cVar2);
        if (str.startsWith(f84203l) && str.endsWith(f84205n)) {
            hVar.mo102820s(f84196e);
            hVar.mo102815n(2);
            hVar.f84183f += 7;
        } else if (str.startsWith(f84204m) && str.endsWith(f84205n)) {
            hVar.mo102820s(f84197f);
            hVar.mo102815n(2);
            hVar.f84183f += 7;
        }
        while (hVar.mo102811j()) {
            gVarArr[i].mo102782a(hVar);
            if (hVar.mo102807f() >= 0) {
                i = hVar.mo102807f();
                hVar.mo102812k();
            }
        }
        int a = hVar.mo102802a();
        hVar.mo102818q();
        int b = hVar.mo102809h().mo102823b();
        if (!(a >= b || i == 0 || i == 5 || i == 4)) {
            hVar.mo102820s(254);
        }
        StringBuilder b2 = hVar.mo102803b();
        if (b2.length() < b) {
            b2.append(f84192a);
        }
        while (b2.length() < b) {
            b2.append(m141832p(f84192a, b2.length() + 1));
        }
        return hVar.mo102803b().toString();
    }

    /* renamed from: d */
    public static int m141820d(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil((double) fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m141821e(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: f */
    public static void m141822f(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: g */
    public static boolean m141823g(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: h */
    public static boolean m141824h(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: i */
    public static boolean m141825i(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m141826j(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: k */
    public static boolean m141827k(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m141828l(char c) {
        if (m141830n(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m141829m(char c) {
        return false;
    }

    /* renamed from: n */
    public static boolean m141830n(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: o */
    public static int m141831o(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        int i4 = 6;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i3 + i5;
            if (i6 == charSequence.length()) {
                byte[] bArr = new byte[i4];
                int[] iArr = new int[i4];
                int d = m141820d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e = m141821e(bArr);
                if (iArr[0] == d) {
                    return 0;
                }
                if (e == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (e == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (e != 1 || bArr[3] <= 0) {
                    return 1;
                }
                return 3;
            }
            char charAt = charSequence2.charAt(i6);
            i5++;
            if (m141823g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m141824h(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m141825i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m141824h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m141827k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m141824h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m141828l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m141824h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m141826j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m141824h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m141829m(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i5 >= 4) {
                int[] iArr2 = new int[i4];
                byte[] bArr2 = new byte[i4];
                m141820d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e2 = m141821e(bArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[c];
                if (i7 < i8 && i7 < iArr2[1] && i7 < iArr2[2] && i7 < iArr2[3] && i7 < iArr2[4]) {
                    return 0;
                }
                if (i8 < i7) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (e2 == 1 && b4 > 0) {
                    return 4;
                }
                if (e2 == 1 && b2 > 0) {
                    return 2;
                }
                if (e2 == 1 && b3 > 0) {
                    return 3;
                }
                int i9 = iArr2[1];
                if (i9 + 1 < i7 && i9 + 1 < i8 && i9 + 1 < iArr2[4] && i9 + 1 < iArr2[2]) {
                    int i10 = iArr2[3];
                    if (i9 < i10) {
                        return 1;
                    }
                    if (i9 == i10) {
                        int i11 = i3 + i5 + 1;
                        while (i11 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i11);
                            if (!m141830n(charAt2)) {
                                if (!m141828l(charAt2)) {
                                    break;
                                }
                                i11++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
            i4 = 6;
        }
    }

    /* renamed from: p */
    public static char m141832p(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
