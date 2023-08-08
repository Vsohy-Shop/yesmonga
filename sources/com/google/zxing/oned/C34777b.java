package com.google.zxing.oned;

import androidx.compose.p004ui.graphics.vector.C15369g;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.zxing.oned.b */
public final class C34777b extends C34793r {

    /* renamed from: b */
    public static final char[] f84354b;

    /* renamed from: c */
    public static final char[] f84355c = {C15369g.f37992r, 'N', '*', 'E'};

    /* renamed from: d */
    public static final char[] f84356d = {'/', C12361b.f30257h, '+', '.'};

    /* renamed from: e */
    public static final char f84357e;

    static {
        char[] cArr = {C15369g.f37994t, 'B', C15369g.f37986l, 'D'};
        f84354b = cArr;
        f84357e = cArr[0];
    }

    /* renamed from: e */
    public boolean[] mo102903e(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f84357e;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f84354b;
            boolean h = C34775a.m141976h(cArr, upperCase);
            boolean h2 = C34775a.m141976h(cArr, upperCase2);
            char[] cArr2 = f84355c;
            boolean h3 = C34775a.m141976h(cArr2, upperCase);
            boolean h4 = C34775a.m141976h(cArr2, upperCase2);
            if (h) {
                if (!h2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (h3) {
                if (!h4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (h2 || h4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f84357e;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (C34775a.m141976h(f84356d, str.charAt(i3))) {
                i2 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = C15369g.f37986l;
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = C15369g.f37994t;
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C34775a.f84346g;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = C34775a.f84347h[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
