package com.google.zxing.oned;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.ArrayList;
import java.util.Map;

public final class Code128Writer extends C34793r {

    /* renamed from: b */
    public static final int f84322b = 103;

    /* renamed from: c */
    public static final int f84323c = 104;

    /* renamed from: d */
    public static final int f84324d = 105;

    /* renamed from: e */
    public static final int f84325e = 101;

    /* renamed from: f */
    public static final int f84326f = 100;

    /* renamed from: g */
    public static final int f84327g = 99;

    /* renamed from: h */
    public static final int f84328h = 106;

    /* renamed from: i */
    public static final char f84329i = 'ñ';

    /* renamed from: j */
    public static final char f84330j = 'ò';

    /* renamed from: k */
    public static final char f84331k = 'ó';

    /* renamed from: l */
    public static final char f84332l = 'ô';

    /* renamed from: m */
    public static final int f84333m = 102;

    /* renamed from: n */
    public static final int f84334n = 97;

    /* renamed from: o */
    public static final int f84335o = 96;

    /* renamed from: p */
    public static final int f84336p = 101;

    /* renamed from: q */
    public static final int f84337q = 100;

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: h */
    public static int m141972h(CharSequence charSequence, int i, int i2) {
        CType i3;
        CType i4;
        char charAt;
        CType i5 = m141973i(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (i5 != cType) {
            CType cType2 = CType.UNCODABLE;
            if (i5 == cType2) {
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                    return 100;
                }
                return 101;
            } else if (i2 == 101 && i5 == CType.FNC_1) {
                return 101;
            } else {
                if (i2 == 99) {
                    return 99;
                }
                if (i2 == 100) {
                    CType cType3 = CType.FNC_1;
                    if (i5 == cType3 || (i3 = m141973i(charSequence, i + 2)) == cType2 || i3 == cType) {
                        return 100;
                    }
                    if (i3 != cType3) {
                        int i6 = i + 4;
                        while (true) {
                            i4 = m141973i(charSequence, i6);
                            if (i4 != CType.TWO_DIGITS) {
                                break;
                            }
                            i6 += 2;
                        }
                        if (i4 == CType.ONE_DIGIT) {
                            return 100;
                        }
                        return 99;
                    } else if (m141973i(charSequence, i + 3) == CType.TWO_DIGITS) {
                        return 99;
                    } else {
                        return 100;
                    }
                } else {
                    if (i5 == CType.FNC_1) {
                        i5 = m141973i(charSequence, i + 1);
                    }
                    if (i5 == CType.TWO_DIGITS) {
                        return 99;
                    }
                    return 100;
                }
            }
        } else if (i2 == 101) {
            return 101;
        } else {
            return 100;
        }
    }

    /* renamed from: i */
    public static CType m141973i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo102422a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: e */
    public boolean[] mo102903e(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case C14092c.f34607h0:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int h = m141972h(str, i3, i5);
                int i8 = 100;
                if (h == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case C14092c.f34607h0:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = h;
                    } else if (h == 100) {
                        i7 = 104;
                    } else if (h != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = h;
                }
                arrayList.add(C34778c.f84358a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                int[][] iArr = C34778c.f84358a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i9 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i10 : (int[]) r13.next()) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] c : arrayList) {
                    i += C34793r.m142042c(zArr, i, c, true);
                }
                return zArr;
            }
        }
    }
}
