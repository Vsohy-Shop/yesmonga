package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.z */
public final class C34829z extends C34827x {

    /* renamed from: l */
    public static final int[] f84525l = {1, 1, 1, 1, 1, 1};

    /* renamed from: m */
    public static final int[][] f84526m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k */
    public final int[] f84527k = new int[4];

    /* renamed from: s */
    public static String m142203s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static void m142204t(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f84526m[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: h */
    public boolean mo103022h(String str) throws FormatException {
        return super.mo103022h(m142203s(str));
    }

    /* renamed from: k */
    public int[] mo103023k(C34709a aVar, int i) throws NotFoundException {
        return C34827x.m142192n(aVar, i, true, f84525l);
    }

    /* renamed from: l */
    public int mo102911l(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f84527k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o = aVar.mo102649o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < o; i3++) {
            int j = C34827x.m142191j(aVar, iArr2, i, C34827x.f84521j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m142204t(sb, i2);
        return i;
    }

    /* renamed from: q */
    public BarcodeFormat mo102912q() {
        return BarcodeFormat.UPC_E;
    }
}
