package com.google.zxing.qrcode.decoder;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.qrcode.decoder.g */
public final class C34873g {

    /* renamed from: e */
    public static final int[] f84742e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C34873g[] f84743f = m142471b();

    /* renamed from: a */
    public final int f84744a;

    /* renamed from: b */
    public final int[] f84745b;

    /* renamed from: c */
    public final C34875b[] f84746c;

    /* renamed from: d */
    public final int f84747d;

    /* renamed from: com.google.zxing.qrcode.decoder.g$a */
    public static final class C34874a {

        /* renamed from: a */
        public final int f84748a;

        /* renamed from: b */
        public final int f84749b;

        public C34874a(int i, int i2) {
            this.f84748a = i;
            this.f84749b = i2;
        }

        /* renamed from: a */
        public int mo103187a() {
            return this.f84748a;
        }

        /* renamed from: b */
        public int mo103188b() {
            return this.f84749b;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.g$b */
    public static final class C34875b {

        /* renamed from: a */
        public final int f84750a;

        /* renamed from: b */
        public final C34874a[] f84751b;

        public C34875b(int i, C34874a... aVarArr) {
            this.f84750a = i;
            this.f84751b = aVarArr;
        }

        /* renamed from: a */
        public C34874a[] mo103189a() {
            return this.f84751b;
        }

        /* renamed from: b */
        public int mo103190b() {
            return this.f84750a;
        }

        /* renamed from: c */
        public int mo103191c() {
            int i = 0;
            for (C34874a a : this.f84751b) {
                i += a.mo103187a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo103192d() {
            return this.f84750a * mo103191c();
        }
    }

    public C34873g(int i, int[] iArr, C34875b... bVarArr) {
        this.f84744a = i;
        this.f84745b = iArr;
        this.f84746c = bVarArr;
        int b = bVarArr[0].mo103190b();
        int i2 = 0;
        for (C34874a aVar : bVarArr[0].mo103189a()) {
            i2 += aVar.mo103187a() * (aVar.mo103188b() + b);
        }
        this.f84747d = i2;
    }

    /* renamed from: b */
    public static C34873g[] m142471b() {
        return new C34873g[]{new C34873g(1, new int[0], new C34875b(7, new C34874a(1, 19)), new C34875b(10, new C34874a(1, 16)), new C34875b(13, new C34874a(1, 13)), new C34875b(17, new C34874a(1, 9))), new C34873g(2, new int[]{6, 18}, new C34875b(10, new C34874a(1, 34)), new C34875b(16, new C34874a(1, 28)), new C34875b(22, new C34874a(1, 22)), new C34875b(28, new C34874a(1, 16))), new C34873g(3, new int[]{6, 22}, new C34875b(15, new C34874a(1, 55)), new C34875b(26, new C34874a(1, 44)), new C34875b(18, new C34874a(2, 17)), new C34875b(22, new C34874a(2, 13))), new C34873g(4, new int[]{6, 26}, new C34875b(20, new C34874a(1, 80)), new C34875b(18, new C34874a(2, 32)), new C34875b(26, new C34874a(2, 24)), new C34875b(16, new C34874a(4, 9))), new C34873g(5, new int[]{6, 30}, new C34875b(26, new C34874a(1, 108)), new C34875b(24, new C34874a(2, 43)), new C34875b(18, new C34874a(2, 15), new C34874a(2, 16)), new C34875b(22, new C34874a(2, 11), new C34874a(2, 12))), new C34873g(6, new int[]{6, 34}, new C34875b(18, new C34874a(2, 68)), new C34875b(16, new C34874a(4, 27)), new C34875b(24, new C34874a(4, 19)), new C34875b(28, new C34874a(4, 15))), new C34873g(7, new int[]{6, 22, 38}, new C34875b(20, new C34874a(2, 78)), new C34875b(18, new C34874a(4, 31)), new C34875b(18, new C34874a(2, 14), new C34874a(4, 15)), new C34875b(26, new C34874a(4, 13), new C34874a(1, 14))), new C34873g(8, new int[]{6, 24, 42}, new C34875b(24, new C34874a(2, 97)), new C34875b(22, new C34874a(2, 38), new C34874a(2, 39)), new C34875b(22, new C34874a(4, 18), new C34874a(2, 19)), new C34875b(26, new C34874a(4, 14), new C34874a(2, 15))), new C34873g(9, new int[]{6, 26, 46}, new C34875b(30, new C34874a(2, 116)), new C34875b(22, new C34874a(3, 36), new C34874a(2, 37)), new C34875b(20, new C34874a(4, 16), new C34874a(4, 17)), new C34875b(24, new C34874a(4, 12), new C34874a(4, 13))), new C34873g(10, new int[]{6, 28, 50}, new C34875b(18, new C34874a(2, 68), new C34874a(2, 69)), new C34875b(26, new C34874a(4, 43), new C34874a(1, 44)), new C34875b(24, new C34874a(6, 19), new C34874a(2, 20)), new C34875b(28, new C34874a(6, 15), new C34874a(2, 16))), new C34873g(11, new int[]{6, 30, 54}, new C34875b(20, new C34874a(4, 81)), new C34875b(30, new C34874a(1, 50), new C34874a(4, 51)), new C34875b(28, new C34874a(4, 22), new C34874a(4, 23)), new C34875b(24, new C34874a(3, 12), new C34874a(8, 13))), new C34873g(12, new int[]{6, 32, 58}, new C34875b(24, new C34874a(2, 92), new C34874a(2, 93)), new C34875b(22, new C34874a(6, 36), new C34874a(2, 37)), new C34875b(26, new C34874a(4, 20), new C34874a(6, 21)), new C34875b(28, new C34874a(7, 14), new C34874a(4, 15))), new C34873g(13, new int[]{6, 34, 62}, new C34875b(26, new C34874a(4, 107)), new C34875b(22, new C34874a(8, 37), new C34874a(1, 38)), new C34875b(24, new C34874a(8, 20), new C34874a(4, 21)), new C34875b(22, new C34874a(12, 11), new C34874a(4, 12))), new C34873g(14, new int[]{6, 26, 46, 66}, new C34875b(30, new C34874a(3, 115), new C34874a(1, 116)), new C34875b(24, new C34874a(4, 40), new C34874a(5, 41)), new C34875b(20, new C34874a(11, 16), new C34874a(5, 17)), new C34875b(24, new C34874a(11, 12), new C34874a(5, 13))), new C34873g(15, new int[]{6, 26, 48, 70}, new C34875b(22, new C34874a(5, 87), new C34874a(1, 88)), new C34875b(24, new C34874a(5, 41), new C34874a(5, 42)), new C34875b(30, new C34874a(5, 24), new C34874a(7, 25)), new C34875b(24, new C34874a(11, 12), new C34874a(7, 13))), new C34873g(16, new int[]{6, 26, 50, 74}, new C34875b(24, new C34874a(5, 98), new C34874a(1, 99)), new C34875b(28, new C34874a(7, 45), new C34874a(3, 46)), new C34875b(24, new C34874a(15, 19), new C34874a(2, 20)), new C34875b(30, new C34874a(3, 15), new C34874a(13, 16))), new C34873g(17, new int[]{6, 30, 54, 78}, new C34875b(28, new C34874a(1, 107), new C34874a(5, 108)), new C34875b(28, new C34874a(10, 46), new C34874a(1, 47)), new C34875b(28, new C34874a(1, 22), new C34874a(15, 23)), new C34875b(28, new C34874a(2, 14), new C34874a(17, 15))), new C34873g(18, new int[]{6, 30, 56, 82}, new C34875b(30, new C34874a(5, 120), new C34874a(1, 121)), new C34875b(26, new C34874a(9, 43), new C34874a(4, 44)), new C34875b(28, new C34874a(17, 22), new C34874a(1, 23)), new C34875b(28, new C34874a(2, 14), new C34874a(19, 15))), new C34873g(19, new int[]{6, 30, 58, 86}, new C34875b(28, new C34874a(3, 113), new C34874a(4, 114)), new C34875b(26, new C34874a(3, 44), new C34874a(11, 45)), new C34875b(26, new C34874a(17, 21), new C34874a(4, 22)), new C34875b(26, new C34874a(9, 13), new C34874a(16, 14))), new C34873g(20, new int[]{6, 34, 62, 90}, new C34875b(28, new C34874a(3, 107), new C34874a(5, 108)), new C34875b(26, new C34874a(3, 41), new C34874a(13, 42)), new C34875b(30, new C34874a(15, 24), new C34874a(5, 25)), new C34875b(28, new C34874a(15, 15), new C34874a(10, 16))), new C34873g(21, new int[]{6, 28, 50, 72, 94}, new C34875b(28, new C34874a(4, 116), new C34874a(4, 117)), new C34875b(26, new C34874a(17, 42)), new C34875b(28, new C34874a(17, 22), new C34874a(6, 23)), new C34875b(30, new C34874a(19, 16), new C34874a(6, 17))), new C34873g(22, new int[]{6, 26, 50, 74, 98}, new C34875b(28, new C34874a(2, 111), new C34874a(7, 112)), new C34875b(28, new C34874a(17, 46)), new C34875b(30, new C34874a(7, 24), new C34874a(16, 25)), new C34875b(24, new C34874a(34, 13))), new C34873g(23, new int[]{6, 30, 54, 78, 102}, new C34875b(30, new C34874a(4, 121), new C34874a(5, 122)), new C34875b(28, new C34874a(4, 47), new C34874a(14, 48)), new C34875b(30, new C34874a(11, 24), new C34874a(14, 25)), new C34875b(30, new C34874a(16, 15), new C34874a(14, 16))), new C34873g(24, new int[]{6, 28, 54, 80, 106}, new C34875b(30, new C34874a(6, 117), new C34874a(4, 118)), new C34875b(28, new C34874a(6, 45), new C34874a(14, 46)), new C34875b(30, new C34874a(11, 24), new C34874a(16, 25)), new C34875b(30, new C34874a(30, 16), new C34874a(2, 17))), new C34873g(25, new int[]{6, 32, 58, 84, 110}, new C34875b(26, new C34874a(8, 106), new C34874a(4, 107)), new C34875b(28, new C34874a(8, 47), new C34874a(13, 48)), new C34875b(30, new C34874a(7, 24), new C34874a(22, 25)), new C34875b(30, new C34874a(22, 15), new C34874a(13, 16))), new C34873g(26, new int[]{6, 30, 58, 86, 114}, new C34875b(28, new C34874a(10, 114), new C34874a(2, 115)), new C34875b(28, new C34874a(19, 46), new C34874a(4, 47)), new C34875b(28, new C34874a(28, 22), new C34874a(6, 23)), new C34875b(30, new C34874a(33, 16), new C34874a(4, 17))), new C34873g(27, new int[]{6, 34, 62, 90, 118}, new C34875b(30, new C34874a(8, 122), new C34874a(4, 123)), new C34875b(28, new C34874a(22, 45), new C34874a(3, 46)), new C34875b(30, new C34874a(8, 23), new C34874a(26, 24)), new C34875b(30, new C34874a(12, 15), new C34874a(28, 16))), new C34873g(28, new int[]{6, 26, 50, 74, 98, 122}, new C34875b(30, new C34874a(3, 117), new C34874a(10, 118)), new C34875b(28, new C34874a(3, 45), new C34874a(23, 46)), new C34875b(30, new C34874a(4, 24), new C34874a(31, 25)), new C34875b(30, new C34874a(11, 15), new C34874a(31, 16))), new C34873g(29, new int[]{6, 30, 54, 78, 102, 126}, new C34875b(30, new C34874a(7, 116), new C34874a(7, 117)), new C34875b(28, new C34874a(21, 45), new C34874a(7, 46)), new C34875b(30, new C34874a(1, 23), new C34874a(37, 24)), new C34875b(30, new C34874a(19, 15), new C34874a(26, 16))), new C34873g(30, new int[]{6, 26, 52, 78, 104, 130}, new C34875b(30, new C34874a(5, 115), new C34874a(10, 116)), new C34875b(28, new C34874a(19, 47), new C34874a(10, 48)), new C34875b(30, new C34874a(15, 24), new C34874a(25, 25)), new C34875b(30, new C34874a(23, 15), new C34874a(25, 16))), new C34873g(31, new int[]{6, 30, 56, 82, 108, 134}, new C34875b(30, new C34874a(13, 115), new C34874a(3, 116)), new C34875b(28, new C34874a(2, 46), new C34874a(29, 47)), new C34875b(30, new C34874a(42, 24), new C34874a(1, 25)), new C34875b(30, new C34874a(23, 15), new C34874a(28, 16))), new C34873g(32, new int[]{6, 34, 60, 86, 112, 138}, new C34875b(30, new C34874a(17, 115)), new C34875b(28, new C34874a(10, 46), new C34874a(23, 47)), new C34875b(30, new C34874a(10, 24), new C34874a(35, 25)), new C34875b(30, new C34874a(19, 15), new C34874a(35, 16))), new C34873g(33, new int[]{6, 30, 58, 86, 114, 142}, new C34875b(30, new C34874a(17, 115), new C34874a(1, 116)), new C34875b(28, new C34874a(14, 46), new C34874a(21, 47)), new C34875b(30, new C34874a(29, 24), new C34874a(19, 25)), new C34875b(30, new C34874a(11, 15), new C34874a(46, 16))), new C34873g(34, new int[]{6, 34, 62, 90, 118, 146}, new C34875b(30, new C34874a(13, 115), new C34874a(6, 116)), new C34875b(28, new C34874a(14, 46), new C34874a(23, 47)), new C34875b(30, new C34874a(44, 24), new C34874a(7, 25)), new C34875b(30, new C34874a(59, 16), new C34874a(1, 17))), new C34873g(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C34875b(30, new C34874a(12, 121), new C34874a(7, 122)), new C34875b(28, new C34874a(12, 47), new C34874a(26, 48)), new C34875b(30, new C34874a(39, 24), new C34874a(14, 25)), new C34875b(30, new C34874a(22, 15), new C34874a(41, 16))), new C34873g(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C34875b(30, new C34874a(6, 121), new C34874a(14, 122)), new C34875b(28, new C34874a(6, 47), new C34874a(34, 48)), new C34875b(30, new C34874a(46, 24), new C34874a(10, 25)), new C34875b(30, new C34874a(2, 15), new C34874a(64, 16))), new C34873g(37, new int[]{6, 28, 54, 80, 106, C14092c.f34515F, 158}, new C34875b(30, new C34874a(17, 122), new C34874a(4, 123)), new C34875b(28, new C34874a(29, 46), new C34874a(14, 47)), new C34875b(30, new C34874a(49, 24), new C34874a(10, 25)), new C34875b(30, new C34874a(24, 15), new C34874a(46, 16))), new C34873g(38, new int[]{6, 32, 58, 84, 110, C14092c.f34527J, 162}, new C34875b(30, new C34874a(4, 122), new C34874a(18, 123)), new C34875b(28, new C34874a(13, 46), new C34874a(32, 47)), new C34875b(30, new C34874a(48, 24), new C34874a(14, 25)), new C34875b(30, new C34874a(42, 15), new C34874a(32, 16))), new C34873g(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C34875b(30, new C34874a(20, 117), new C34874a(4, 118)), new C34875b(28, new C34874a(40, 47), new C34874a(7, 48)), new C34875b(30, new C34874a(43, 24), new C34874a(22, 25)), new C34875b(30, new C34874a(10, 15), new C34874a(67, 16))), new C34873g(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C34875b(30, new C34874a(19, 118), new C34874a(6, 119)), new C34875b(28, new C34874a(18, 47), new C34874a(31, 48)), new C34875b(30, new C34874a(34, 24), new C34874a(34, 25)), new C34875b(30, new C34874a(20, 15), new C34874a(61, 16)))};
    }

    /* renamed from: c */
    public static C34873g m142472c(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f84742e;
            if (i3 < iArr.length) {
                int i5 = iArr[i3];
                if (i5 == i) {
                    return m142474i(i3 + 7);
                }
                int e = C34871e.m142466e(i, i5);
                if (e < i2) {
                    i4 = i3 + 7;
                    i2 = e;
                }
                i3++;
            } else if (i2 <= 3) {
                return m142474i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C34873g m142473g(int i) throws FormatException {
        if (i % 4 == 1) {
            try {
                return m142474i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.m141227a();
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: i */
    public static C34873g m142474i(int i) {
        if (i > 0 && i <= 40) {
            return f84743f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C34710b mo103180a() {
        int e = mo103182e();
        C34710b bVar = new C34710b(e);
        bVar.mo102678x(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo102678x(i, 0, 8, 9);
        bVar.mo102678x(0, i, 9, 8);
        int length = this.f84745b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f84745b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo102678x(this.f84745b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo102678x(6, 9, 1, i5);
        bVar.mo102678x(9, 6, i5, 1);
        if (this.f84744a > 6) {
            int i6 = e - 11;
            bVar.mo102678x(i6, 0, 3, 6);
            bVar.mo102678x(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo103181d() {
        return this.f84745b;
    }

    /* renamed from: e */
    public int mo103182e() {
        return (this.f84744a * 4) + 17;
    }

    /* renamed from: f */
    public C34875b mo103183f(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f84746c[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: h */
    public int mo103184h() {
        return this.f84747d;
    }

    /* renamed from: j */
    public int mo103185j() {
        return this.f84744a;
    }

    public String toString() {
        return String.valueOf(this.f84744a);
    }
}
