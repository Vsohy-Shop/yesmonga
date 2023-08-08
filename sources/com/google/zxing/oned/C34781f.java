package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.f */
public final class C34781f extends C34792q {

    /* renamed from: c */
    public static final String f84381c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* renamed from: d */
    public static final char[] f84382d = f84381c.toCharArray();

    /* renamed from: e */
    public static final int[] f84383e;

    /* renamed from: f */
    public static final int f84384f;

    /* renamed from: a */
    public final StringBuilder f84385a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f84386b = new int[6];

    static {
        int[] iArr = {276, C14092c.f34643q0, C14092c.f34639p0, 322, 296, C14092c.f34627m0, 290, 336, DefaultImageHeaderParser.f57426n, 266, C16717v.C16720c.f42235v, 420, C14092c.f34531K0, 404, 402, 394, 360, C14092c.f34658u, 354, 308, 282, C14092c.f34655t0, C14092c.f34647r0, 326, 300, 278, 436, C14092c.f34546P0, 428, 422, 406, C14092c.f34522H0, C14092c.f34675y0, 358, 310, 314, 302, 468, 466, C14092c.f34564V0, 366, 374, C14092c.f34543O0, 294, 474, FloatingActionButton.f75592Q0, 306, 350};
        f84383e = iArr;
        f84384f = iArr[47];
    }

    /* renamed from: h */
    public static void m141998h(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m141999i(charSequence, length - 2, 20);
        m141999i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    public static void m141999i(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += f84381c.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f84382d[i3 % 47]) {
            throw ChecksumException.m141224a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a3, code lost:
        r1.append(r4);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m142000j(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r0) goto L_0x00b3
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00ac
            r5 = 100
            if (r4 > r5) goto L_0x00ac
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a7
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0096;
                case 98: goto L_0x004d;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = r2
            goto L_0x00a3
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009c
        L_0x0037:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m141227a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009c
        L_0x0043:
            if (r5 != r7) goto L_0x0048
            r4 = 58
            goto L_0x00a3
        L_0x0048:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m141227a()
            throw r9
        L_0x004d:
            if (r5 < r8) goto L_0x0056
            r4 = 69
            if (r5 > r4) goto L_0x0056
            int r5 = r5 + -38
            goto L_0x009c
        L_0x0056:
            r4 = 70
            if (r5 < r4) goto L_0x0061
            r4 = 74
            if (r5 > r4) goto L_0x0061
            int r5 = r5 + -11
            goto L_0x009c
        L_0x0061:
            r4 = 75
            if (r5 < r4) goto L_0x006a
            if (r5 > r6) goto L_0x006a
            int r5 = r5 + 16
            goto L_0x009c
        L_0x006a:
            r4 = 80
            if (r5 < r4) goto L_0x0075
            r4 = 84
            if (r5 > r4) goto L_0x0075
            int r5 = r5 + 43
            goto L_0x009c
        L_0x0075:
            r4 = 85
            if (r5 != r4) goto L_0x007a
            goto L_0x002c
        L_0x007a:
            r4 = 86
            if (r5 != r4) goto L_0x0081
            r4 = 64
            goto L_0x00a3
        L_0x0081:
            r4 = 87
            if (r5 != r4) goto L_0x0088
            r4 = 96
            goto L_0x00a3
        L_0x0088:
            r4 = 88
            if (r5 < r4) goto L_0x0091
            if (r5 > r7) goto L_0x0091
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a3
        L_0x0091:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m141227a()
            throw r9
        L_0x0096:
            if (r5 < r8) goto L_0x009e
            if (r5 > r7) goto L_0x009e
            int r5 = r5 + -64
        L_0x009c:
            char r4 = (char) r5
            goto L_0x00a3
        L_0x009e:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m141227a()
            throw r9
        L_0x00a3:
            r1.append(r4)
            goto L_0x00af
        L_0x00a7:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m141227a()
            throw r9
        L_0x00ac:
            r1.append(r4)
        L_0x00af:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b3:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C34781f.m142000j(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    public static char m142001l(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f84383e;
            if (i2 >= iArr.length) {
                throw NotFoundException.m141229a();
            } else if (iArr[i2] == i) {
                return f84382d[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static int m142002m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] k = mo102910k(aVar);
        int m = aVar.mo102647m(k[1]);
        int o = aVar.mo102649o();
        int[] iArr = this.f84386b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f84385a;
        sb.setLength(0);
        while (true) {
            C34792q.m142036f(aVar, m, iArr);
            int m2 = m142002m(iArr);
            if (m2 >= 0) {
                char l = m142001l(m2);
                sb.append(l);
                int i2 = m;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m3 = aVar.mo102647m(i2);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (m3 == o || !aVar.mo102645k(m3)) {
                        throw NotFoundException.m141229a();
                    } else if (sb.length() >= 2) {
                        m141998h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C34761k(m142000j(sb), (byte[]) null, new C34762l[]{new C34762l(((float) (k[1] + k[0])) / 2.0f, f), new C34762l(((float) m) + (((float) i4) / 2.0f), f)}, BarcodeFormat.CODE_93);
                    } else {
                        throw NotFoundException.m141229a();
                    }
                } else {
                    m = m3;
                }
            } else {
                throw NotFoundException.m141229a();
            }
        }
    }

    /* renamed from: k */
    public final int[] mo102910k(C34709a aVar) throws NotFoundException {
        int o = aVar.mo102649o();
        int m = aVar.mo102647m(0);
        Arrays.fill(this.f84386b, 0);
        int[] iArr = this.f84386b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m;
        while (m < o) {
            if (aVar.mo102645k(m) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else if (m142002m(iArr) == f84384f) {
                    return new int[]{i2, m};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            m++;
        }
        throw NotFoundException.m141229a();
    }
}
