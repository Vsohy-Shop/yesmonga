package com.google.zxing.qrcode.encoder;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34709a;
import com.google.zxing.qrcode.decoder.C34873g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* renamed from: com.google.zxing.qrcode.encoder.e */
public final class C34887e {

    /* renamed from: a */
    public static final int[][] f84790a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f84791b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f84792c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, C14092c.f34515F, 158}, new int[]{6, 32, 58, 84, 110, C14092c.f34527J, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f84793d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: e */
    public static final int f84794e = 7973;

    /* renamed from: f */
    public static final int f84795f = 1335;

    /* renamed from: g */
    public static final int f84796g = 21522;

    /* renamed from: a */
    public static void m142575a(C34709a aVar, ErrorCorrectionLevel errorCorrectionLevel, C34873g gVar, int i, C34883b bVar) throws WriterException {
        m142577c(bVar);
        m142578d(gVar, bVar);
        m142586l(errorCorrectionLevel, i, bVar);
        m142593s(gVar, bVar);
        m142580f(aVar, i, bVar);
    }

    /* renamed from: b */
    public static int m142576b(int i, int i2) {
        if (i2 != 0) {
            int n = m142588n(i2);
            int i3 = i << (n - 1);
            while (m142588n(i3) >= n) {
                i3 ^= i2 << (m142588n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    public static void m142577c(C34883b bVar) {
        bVar.mo103234a((byte) -1);
    }

    /* renamed from: d */
    public static void m142578d(C34873g gVar, C34883b bVar) throws WriterException {
        m142584j(bVar);
        m142579e(bVar);
        m142592r(gVar, bVar);
        m142585k(bVar);
    }

    /* renamed from: e */
    public static void m142579e(C34883b bVar) throws WriterException {
        if (bVar.mo103235b(8, bVar.mo103237d() - 8) != 0) {
            bVar.mo103240g(8, bVar.mo103237d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    public static void m142580f(C34709a aVar, int i, C34883b bVar) throws WriterException {
        boolean z;
        int e = bVar.mo103238e() - 1;
        int d = bVar.mo103237d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo103237d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m142589o(bVar.mo103235b(i5, d))) {
                        if (i2 < aVar.mo102649o()) {
                            z = aVar.mo102645k(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C34886d.m142572f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo103241h(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo102649o()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + aVar.mo102649o());
        }
    }

    /* renamed from: g */
    public static void m142581g(int i, int i2, C34883b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m142589o(bVar.mo103235b(i4, i2))) {
                bVar.mo103240g(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    public static void m142582h(int i, int i2, C34883b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f84791b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo103240g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    public static void m142583i(int i, int i2, C34883b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f84790a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo103240g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    public static void m142584j(C34883b bVar) throws WriterException {
        int length = f84790a[0].length;
        m142583i(0, 0, bVar);
        m142583i(bVar.mo103238e() - length, 0, bVar);
        m142583i(0, bVar.mo103238e() - length, bVar);
        m142581g(0, 7, bVar);
        m142581g(bVar.mo103238e() - 8, 7, bVar);
        m142581g(0, bVar.mo103238e() - 8, bVar);
        m142587m(7, 0, bVar);
        m142587m((bVar.mo103237d() - 7) - 1, 0, bVar);
        m142587m(7, bVar.mo103237d() - 7, bVar);
    }

    /* renamed from: k */
    public static void m142585k(C34883b bVar) {
        int i = 8;
        while (i < bVar.mo103238e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m142589o(bVar.mo103235b(i, 6))) {
                bVar.mo103240g(i, 6, i3);
            }
            if (m142589o(bVar.mo103235b(6, i))) {
                bVar.mo103240g(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    public static void m142586l(ErrorCorrectionLevel errorCorrectionLevel, int i, C34883b bVar) throws WriterException {
        C34709a aVar = new C34709a();
        m142590p(errorCorrectionLevel, i, aVar);
        for (int i2 = 0; i2 < aVar.mo102649o(); i2++) {
            boolean k = aVar.mo102645k((aVar.mo102649o() - 1) - i2);
            int[] iArr = f84793d[i2];
            bVar.mo103241h(iArr[0], iArr[1], k);
            if (i2 < 8) {
                bVar.mo103241h((bVar.mo103238e() - i2) - 1, 8, k);
            } else {
                bVar.mo103241h(8, (bVar.mo103237d() - 7) + (i2 - 8), k);
            }
        }
    }

    /* renamed from: m */
    public static void m142587m(int i, int i2, C34883b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m142589o(bVar.mo103235b(i, i4))) {
                bVar.mo103240g(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    public static int m142588n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    public static boolean m142589o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    public static void m142590p(ErrorCorrectionLevel errorCorrectionLevel, int i, C34709a aVar) throws WriterException {
        if (C34888f.m142594f(i)) {
            int g = (errorCorrectionLevel.mo103156g() << 3) | i;
            aVar.mo102638e(g, 5);
            aVar.mo102638e(m142576b(g, f84795f), 10);
            C34709a aVar2 = new C34709a();
            aVar2.mo102638e(21522, 15);
            aVar.mo102634D(aVar2);
            if (aVar.mo102649o() != 15) {
                throw new WriterException("should not happen but we got: " + aVar.mo102649o());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    public static void m142591q(C34873g gVar, C34709a aVar) throws WriterException {
        aVar.mo102638e(gVar.mo103185j(), 6);
        aVar.mo102638e(m142576b(gVar.mo103185j(), f84794e), 12);
        if (aVar.mo102649o() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.mo102649o());
        }
    }

    /* renamed from: r */
    public static void m142592r(C34873g gVar, C34883b bVar) {
        if (gVar.mo103185j() >= 2) {
            int[] iArr = f84792c[gVar.mo103185j() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m142589o(bVar.mo103235b(i2, i))) {
                            m142582h(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m142593s(C34873g gVar, C34883b bVar) throws WriterException {
        if (gVar.mo103185j() >= 7) {
            C34709a aVar = new C34709a();
            m142591q(gVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean k = aVar.mo102645k(i);
                    i--;
                    bVar.mo103241h(i2, (bVar.mo103237d() - 11) + i3, k);
                    bVar.mo103241h((bVar.mo103237d() - 11) + i3, i2, k);
                }
            }
        }
    }
}
