package com.google.zxing.common;

import com.google.android.material.color.C31234i;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.zxing.common.k */
public final class C34722k {

    /* renamed from: a */
    public static final String f84106a;

    /* renamed from: b */
    public static final String f84107b = "SJIS";

    /* renamed from: c */
    public static final String f84108c = "GB2312";

    /* renamed from: d */
    public static final String f84109d = "EUC_JP";

    /* renamed from: e */
    public static final String f84110e = "UTF8";

    /* renamed from: f */
    public static final String f84111f = "ISO8859_1";

    /* renamed from: g */
    public static final boolean f84112g;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f84106a = name;
        if (f84107b.equalsIgnoreCase(name) || f84109d.equalsIgnoreCase(name)) {
            z = true;
        } else {
            z = false;
        }
        f84112g = z;
    }

    /* renamed from: a */
    public static String m141668a(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z;
        byte[] bArr2 = bArr;
        Map<DecodeHintType, ?> map2 = map;
        if (map2 != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map2.containsKey(decodeHintType)) {
                return map2.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z2 = true;
        int i = 0;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            byte b = bArr2[i3] & 255;
            if (z4) {
                if (i4 > 0) {
                    if ((b & C11354n.f28471b) != 0) {
                        i4--;
                    }
                } else if ((b & C11354n.f28471b) != 0) {
                    if ((b & C31234i.C31244j.f75214h) != 0) {
                        i4++;
                        if ((b & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((b & DateTimeFieldType.f30603E0) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((b & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z4 = false;
            }
            if (z2) {
                if (b > Byte.MAX_VALUE && b < 160) {
                    z2 = false;
                } else if (b > 159 && (b < 192 || b == 215 || b == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (b >= 64 && b != Byte.MAX_VALUE && b <= 252) {
                        i5--;
                    }
                } else if (!(b == 128 || b == 160 || b > 239)) {
                    if (b <= 160 || b >= 224) {
                        if (b > Byte.MAX_VALUE) {
                            i5++;
                            int i13 = i11 + 1;
                            if (i13 > i) {
                                i = i13;
                                i11 = i;
                            } else {
                                i11 = i13;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i14 = i12 + 1;
                        if (i14 > i9) {
                            i9 = i14;
                            i12 = i9;
                        } else {
                            i12 = i14;
                        }
                        i11 = 0;
                    }
                }
                z3 = false;
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return f84110e;
        }
        if (z3 && (f84112g || i9 >= 3 || i >= 3)) {
            return f84107b;
        }
        if (!z2 || !z3) {
            if (z2) {
                return f84111f;
            }
            if (z3) {
                return f84107b;
            }
            if (z4) {
                return f84110e;
            }
            return f84106a;
        } else if ((i9 != 2 || i2 != 2) && i10 * 10 < length) {
            return f84111f;
        } else {
            return f84107b;
        }
    }
}
