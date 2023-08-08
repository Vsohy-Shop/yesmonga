package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34709a;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34726d;
import com.google.zxing.qrcode.decoder.C34873g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.encoder.c */
public final class C34884c {

    /* renamed from: a */
    public static final int[] f84783a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b */
    public static final String f84784b = "ISO-8859-1";

    /* renamed from: com.google.zxing.qrcode.encoder.c$a */
    public static /* synthetic */ class C34885a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84785a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84785a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f84785a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f84785a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.C34884c.C34885a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m142543a(String str, C34709a aVar, String str2) throws WriterException {
        try {
            for (byte e : str.getBytes(str2)) {
                aVar.mo102638e(e, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException((Throwable) e2);
        }
    }

    /* renamed from: b */
    public static void m142544b(CharSequence charSequence, C34709a aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int r = m142560r(charSequence.charAt(i));
            if (r != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int r2 = m142560r(charSequence.charAt(i2));
                    if (r2 != -1) {
                        aVar.mo102638e((r * 45) + r2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo102638e(r, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    public static void m142545c(String str, Mode mode, C34709a aVar, String str2) throws WriterException {
        int i = C34885a.f84785a[mode.ordinal()];
        if (i == 1) {
            m142550h(str, aVar);
        } else if (i == 2) {
            m142544b(str, aVar);
        } else if (i == 3) {
            m142543a(str, aVar, str2);
        } else if (i == 4) {
            m142547e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
    }

    /* renamed from: d */
    public static void m142546d(CharacterSetECI characterSetECI, C34709a aVar) {
        aVar.mo102638e(Mode.ECI.mo103157g(), 4);
        aVar.mo102638e(characterSetECI.mo102630q(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m142547e(java.lang.String r6, com.google.zxing.common.C34709a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = r4
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo102638e(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.C34884c.m142547e(java.lang.String, com.google.zxing.common.a):void");
    }

    /* renamed from: f */
    public static void m142548f(int i, C34873g gVar, Mode mode, C34709a aVar) throws WriterException {
        int q = mode.mo103158q(gVar);
        int i2 = 1 << q;
        if (i < i2) {
            aVar.mo102638e(i, q);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    public static void m142549g(Mode mode, C34709a aVar) {
        aVar.mo102638e(mode.mo103157g(), 4);
    }

    /* renamed from: h */
    public static void m142550h(CharSequence charSequence, C34709a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo102638e((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo102638e((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo102638e(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    public static int m142551i(Mode mode, C34709a aVar, C34709a aVar2, C34873g gVar) {
        return aVar.mo102649o() + mode.mo103158q(gVar) + aVar2.mo102649o();
    }

    /* renamed from: j */
    public static int m142552j(C34883b bVar) {
        return C34886d.m142567a(bVar) + C34886d.m142569c(bVar) + C34886d.m142570d(bVar) + C34886d.m142571e(bVar);
    }

    /* renamed from: k */
    public static int m142553k(C34709a aVar, ErrorCorrectionLevel errorCorrectionLevel, C34873g gVar, C34883b bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C34887e.m142575a(aVar, errorCorrectionLevel, gVar, i3, bVar);
            int j = m142552j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static Mode m142554l(String str) {
        return m142555m(str, (String) null);
    }

    /* renamed from: m */
    public static Mode m142555m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m142563u(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m142560r(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    /* renamed from: n */
    public static C34873g m142556n(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C34873g i3 = C34873g.m142474i(i2);
            if (m142566x(i, i3, errorCorrectionLevel)) {
                return i3;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: o */
    public static C34888f m142557o(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return m142558p(str, errorCorrectionLevel, (Map<EncodeHintType, ?>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.qrcode.encoder.C34888f m142558p(java.lang.String r7, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r8, java.util.Map<com.google.zxing.EncodeHintType, ?> r9) throws com.google.zxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            com.google.zxing.qrcode.decoder.Mode r4 = m142555m(r7, r3)
            com.google.zxing.common.a r5 = new com.google.zxing.common.a
            r5.<init>()
            com.google.zxing.qrcode.decoder.Mode r6 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            com.google.zxing.common.CharacterSetECI r2 = com.google.zxing.common.CharacterSetECI.m141565b(r3)
            if (r2 == 0) goto L_0x0036
            m142546d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x005d
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005d
            com.google.zxing.qrcode.decoder.Mode r0 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            m142549g(r0, r5)
        L_0x005d:
            m142549g(r4, r5)
            com.google.zxing.common.a r0 = new com.google.zxing.common.a
            r0.<init>()
            m142545c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0095
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0095
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.qrcode.decoder.g r9 = com.google.zxing.qrcode.decoder.C34873g.m142474i(r9)
            int r1 = m142551i(r4, r5, r0, r9)
            boolean r1 = m142566x(r1, r9, r8)
            if (r1 == 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0095:
            com.google.zxing.qrcode.decoder.g r9 = m142564v(r8, r4, r5, r0)
        L_0x0099:
            com.google.zxing.common.a r1 = new com.google.zxing.common.a
            r1.<init>()
            r1.mo102636c(r5)
            if (r4 != r6) goto L_0x00a8
            int r7 = r0.mo102650s()
            goto L_0x00ac
        L_0x00a8:
            int r7 = r7.length()
        L_0x00ac:
            m142548f(r7, r9, r4, r1)
            r1.mo102636c(r0)
            com.google.zxing.qrcode.decoder.g$b r7 = r9.mo103183f(r8)
            int r0 = r9.mo103184h()
            int r2 = r7.mo103192d()
            int r0 = r0 - r2
            m142565w(r0, r1)
            int r2 = r9.mo103184h()
            int r7 = r7.mo103191c()
            com.google.zxing.common.a r7 = m142562t(r1, r2, r0, r7)
            com.google.zxing.qrcode.encoder.f r0 = new com.google.zxing.qrcode.encoder.f
            r0.<init>()
            r0.mo103248g(r8)
            r0.mo103251j(r4)
            r0.mo103252k(r9)
            int r1 = r9.mo103182e()
            com.google.zxing.qrcode.encoder.b r2 = new com.google.zxing.qrcode.encoder.b
            r2.<init>(r1, r1)
            int r1 = m142553k(r7, r8, r9, r2)
            r0.mo103249h(r1)
            com.google.zxing.qrcode.encoder.C34887e.m142575a(r7, r8, r9, r1, r2)
            r0.mo103250i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.C34884c.m142558p(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.qrcode.encoder.f");
    }

    /* renamed from: q */
    public static byte[] m142559q(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C34726d(C34723a.f84117l).mo102740b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: r */
    public static int m142560r(int i) {
        int[] iArr = f84783a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: s */
    public static void m142561s(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: t */
    public static C34709a m142562t(C34709a aVar, int i, int i2, int i3) throws WriterException {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo102650s() == i5) {
            ArrayList<C34882a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m142561s(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo102633C(i7 << 3, bArr, 0, i11);
                byte[] q = m142559q(bArr, iArr2[0]);
                arrayList.add(new C34882a(bArr, q));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, q.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C34709a aVar2 = new C34709a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C34882a a : arrayList) {
                        byte[] a2 = a.mo103232a();
                        if (i12 < a2.length) {
                            aVar2.mo102638e(a2[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C34882a b : arrayList) {
                        byte[] b2 = b.mo103233b();
                        if (i13 < b2.length) {
                            aVar2.mo102638e(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo102650s()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i4 + " and " + aVar2.mo102650s() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: u */
    public static boolean m142563u(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static C34873g m142564v(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C34709a aVar, C34709a aVar2) throws WriterException {
        return m142556n(m142551i(mode, aVar, aVar2, m142556n(m142551i(mode, aVar, aVar2, C34873g.m142474i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: w */
    public static void m142565w(int i, C34709a aVar) throws WriterException {
        int i2;
        int i3 = i << 3;
        if (aVar.mo102649o() <= i3) {
            for (int i4 = 0; i4 < 4 && aVar.mo102649o() < i3; i4++) {
                aVar.mo102635b(false);
            }
            int o = aVar.mo102649o() & 7;
            if (o > 0) {
                while (o < 8) {
                    aVar.mo102635b(false);
                    o++;
                }
            }
            int s = i - aVar.mo102650s();
            for (int i5 = 0; i5 < s; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                aVar.mo102638e(i2, 8);
            }
            if (aVar.mo102649o() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.mo102649o() + " > " + i3);
    }

    /* renamed from: x */
    public static boolean m142566x(int i, C34873g gVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (gVar.mo103184h() - gVar.mo103183f(errorCorrectionLevel).mo103192d() >= (i + 7) / 8) {
            return true;
        }
        return false;
    }
}
