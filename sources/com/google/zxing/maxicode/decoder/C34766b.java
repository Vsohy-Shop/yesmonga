package com.google.zxing.maxicode.decoder;

import androidx.exifinterface.media.C19135a;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.color.C31234i;
import com.google.zxing.common.C34712d;
import java.text.DecimalFormat;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.zxing.maxicode.decoder.b */
public final class C34766b {

    /* renamed from: a */
    public static final char f84286a = '￰';

    /* renamed from: b */
    public static final char f84287b = '￱';

    /* renamed from: c */
    public static final char f84288c = '￲';

    /* renamed from: d */
    public static final char f84289d = '￳';

    /* renamed from: e */
    public static final char f84290e = '￴';

    /* renamed from: f */
    public static final char f84291f = '￵';

    /* renamed from: g */
    public static final char f84292g = '￶';

    /* renamed from: h */
    public static final char f84293h = '￷';

    /* renamed from: i */
    public static final char f84294i = '￸';

    /* renamed from: j */
    public static final char f84295j = '￹';

    /* renamed from: k */
    public static final char f84296k = '￺';

    /* renamed from: l */
    public static final char f84297l = '￻';

    /* renamed from: m */
    public static final char f84298m = '￼';

    /* renamed from: n */
    public static final char f84299n = '\u001c';

    /* renamed from: o */
    public static final char f84300o = '\u001d';

    /* renamed from: p */
    public static final char f84301p = '\u001e';

    /* renamed from: q */
    public static final String[] f84302q = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    public static C34712d m141941a(byte[] bArr, int i) {
        String str;
        StringBuilder sb = new StringBuilder(C14092c.f34532K1);
        if (i == 2 || i == 3) {
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m141947g(bArr))).format((long) m141946f(bArr));
            } else {
                str = m141948h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) m141943c(bArr));
            String format2 = decimalFormat.format((long) m141949i(bArr));
            sb.append(m141945e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, str + f84300o + format + f84300o + format2 + f84300o);
            } else {
                sb.insert(0, str + f84300o + format + f84300o + format2 + f84300o);
            }
        } else if (i == 4) {
            sb.append(m141945e(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(m141945e(bArr, 1, 77));
        }
        return new C34712d(bArr, sb.toString(), (List<byte[]>) null, String.valueOf(i));
    }

    /* renamed from: b */
    public static int m141942b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    public static int m141943c(byte[] bArr) {
        return m141944d(bArr, new byte[]{53, 54, 43, 44, 45, 46, C19135a.f48929d6, 48, 37, 38});
    }

    /* renamed from: d */
    public static int m141944d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m141942b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (r5 != 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m141945e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            r2 = 0
            r3 = r13
            r5 = r1
            r4 = r2
            r6 = r4
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0069
            java.lang.String[] r7 = f84302q
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x005a;
                case 65521: goto L_0x005a;
                case 65522: goto L_0x005a;
                case 65523: goto L_0x005a;
                case 65524: goto L_0x005a;
                case 65525: goto L_0x0056;
                case 65526: goto L_0x0054;
                case 65527: goto L_0x0052;
                case 65528: goto L_0x004f;
                case 65529: goto L_0x004d;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x0061
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x0061
        L_0x004d:
            r5 = r1
            goto L_0x0061
        L_0x004f:
            r5 = r1
            r4 = r8
            goto L_0x0061
        L_0x0052:
            r5 = r1
            goto L_0x0058
        L_0x0054:
            r5 = 3
            goto L_0x0057
        L_0x0056:
            r5 = 2
        L_0x0057:
            r6 = r4
        L_0x0058:
            r4 = r2
            goto L_0x0061
        L_0x005a:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = r8
        L_0x0061:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0066
            r4 = r6
        L_0x0066:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0069:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0086
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0086
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0069
        L_0x0086:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.maxicode.decoder.C34766b.m141945e(byte[], int, int):java.lang.String");
    }

    /* renamed from: f */
    public static int m141946f(byte[] bArr) {
        return m141944d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, C31234i.C31240f.f75184f, 29, 30, DateTimeFieldType.f30606H0, DateTimeFieldType.f30607I0, DateTimeFieldType.f30608J0, DateTimeFieldType.f30609K0, DateTimeFieldType.f30610L0, 24, 13, DateTimeFieldType.f30624Y, DateTimeFieldType.f30626Z, DateTimeFieldType.f30603E0, DateTimeFieldType.f30604F0, DateTimeFieldType.f30605G0, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    public static int m141947g(byte[] bArr) {
        return m141944d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    public static String m141948h(byte[] bArr) {
        String[] strArr = f84302q;
        return String.valueOf(new char[]{strArr[0].charAt(m141944d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m141944d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m141944d(bArr, new byte[]{27, C31234i.C31240f.f75184f, 29, 30, DateTimeFieldType.f30606H0, DateTimeFieldType.f30607I0})), strArr[0].charAt(m141944d(bArr, new byte[]{DateTimeFieldType.f30608J0, DateTimeFieldType.f30609K0, DateTimeFieldType.f30610L0, 24, 13, DateTimeFieldType.f30624Y})), strArr[0].charAt(m141944d(bArr, new byte[]{DateTimeFieldType.f30626Z, DateTimeFieldType.f30603E0, DateTimeFieldType.f30604F0, DateTimeFieldType.f30605G0, 7, 8})), strArr[0].charAt(m141944d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    public static int m141949i(byte[] bArr) {
        return m141944d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
