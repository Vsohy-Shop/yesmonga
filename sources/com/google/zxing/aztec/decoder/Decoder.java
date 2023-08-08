package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.C19135a;
import com.bumptech.glide.gifdecoder.C22075f;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.android.datatransport.cct.C40042a;
import com.google.android.material.badge.C31132a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.C33093b;
import com.google.firebase.messaging.C33168b1;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.C34630a;
import com.google.zxing.client.android.C34651e;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34725c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34932q;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Arrays;
import java.util.List;

public final class Decoder {

    /* renamed from: b */
    public static final String[] f83759b = {"CTRL_PS", " ", "A", EnergyLabelKt.f67707e, EnergyLabelKt.f67708f, EnergyLabelKt.f67709g, "E", EnergyLabelKt.f67711i, EnergyLabelKt.f67712j, "H", "I", "J", "K", C37106a.f92899d, "M", "N", "O", "P", "Q", "R", C19135a.f48823R4, C19135a.f48928d5, C37106a.f92903h, C19135a.f48877X4, C19135a.f48841T4, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f83760c = {"CTRL_PS", " ", "a", "b", "c", "d", C34651e.f83829d, C22075f.f56695A, "g", "h", "i", "j", "k", "l", "m", "n", C34930o.f84983b, "p", C34932q.f84985b, C28515a1.f68703k, C34935s.f84988a, C10108c.f27801d, "u", C9851c.f26937h, "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f83761d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", C40042a.f102078h, "^", C32920e.f79928l, "`", C33093b.f80279g, "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f83762e = {"", "\r", "\r\n", ". ", ", ", ": ", C33168b1.f80509d, "\"", "#", "$", "%", "&", "'", "(", ")", "*", C31132a.f74628J0, ",", "-", ".", "/", C33124s.f80355c, ";", "<", "=", ">", "?", "[", "]", C33093b.f80281i, "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f83763f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    public C34630a f83764a;

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$a */
    public static /* synthetic */ class C34633a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83772a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.aztec.decoder.Decoder$Table[] r0 = com.google.zxing.aztec.decoder.Decoder.Table.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83772a = r0
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83772a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83772a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83772a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83772a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.decoder.Decoder.C34633a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static byte[] m141245a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m141250i(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: e */
    public static String m141246e(Table table, int i) {
        int i2 = C34633a.f83772a[table.ordinal()];
        if (i2 == 1) {
            return f83759b[i];
        }
        if (i2 == 2) {
            return f83760c[i];
        }
        if (i2 == 3) {
            return f83761d[i];
        }
        if (i2 == 4) {
            return f83762e[i];
        }
        if (i2 == 5) {
            return f83763f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    public static String m141247f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i2 = 0;
        while (i2 < length) {
            if (table == Table.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int j = m141251j(zArr, i2, 5);
                i2 += 5;
                if (j == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    j = m141251j(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= j) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb.append((char) m141251j(zArr, i2, 8));
                        i2 += 8;
                        i3++;
                    }
                }
            } else {
                if (table == Table.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int j2 = m141251j(zArr, i2, i);
                i2 += i;
                String e = m141246e(table, j2);
                if (e.startsWith("CTRL_")) {
                    table2 = m141248g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        Table table3 = table2;
                        table2 = table;
                        table = table3;
                    }
                } else {
                    sb.append(e);
                }
            }
            table = table2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static Table m141248g(char c) {
        if (c == 'B') {
            return Table.BINARY;
        }
        if (c == 'D') {
            return Table.DIGIT;
        }
        if (c == 'P') {
            return Table.PUNCT;
        }
        if (c == 'L') {
            return Table.LOWER;
        }
        if (c != 'M') {
            return Table.UPPER;
        }
        return Table.MIXED;
    }

    /* renamed from: h */
    public static String m141249h(boolean[] zArr) {
        return m141247f(zArr);
    }

    /* renamed from: i */
    public static byte m141250i(boolean[] zArr, int i) {
        int j;
        int length = zArr.length - i;
        if (length >= 8) {
            j = m141251j(zArr, i, 8);
        } else {
            j = m141251j(zArr, i, length) << (8 - length);
        }
        return (byte) j;
    }

    /* renamed from: j */
    public static int m141251j(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: k */
    public static int m141252k(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: b */
    public final boolean[] mo102424b(boolean[] zArr) throws FormatException {
        int i;
        C34723a aVar;
        boolean z;
        boolean z2;
        if (this.f83764a.mo102417d() <= 2) {
            aVar = C34723a.f84115j;
            i = 6;
        } else {
            i = 8;
            if (this.f83764a.mo102417d() <= 8) {
                aVar = C34723a.f84119n;
            } else if (this.f83764a.mo102417d() <= 22) {
                aVar = C34723a.f84114i;
                i = 10;
            } else {
                aVar = C34723a.f84113h;
                i = 12;
            }
        }
        int c = this.f83764a.mo102416c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m141251j(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C34725c(aVar).mo102735a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.m141227a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        int i10 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i10, z);
                        i7 += i - 1;
                    } else {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i7 + 1;
                            if (((1 << i11) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i11--;
                            i7 = i12;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.m141228b(e);
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: c */
    public C34712d mo102425c(C34630a aVar) throws FormatException {
        this.f83764a = aVar;
        boolean[] b = mo102424b(mo102426d(aVar.mo102707a()));
        C34712d dVar = new C34712d(m141245a(b), m141247f(b), (List<byte[]>) null, (String) null);
        dVar.mo102696n(b.length);
        return dVar;
    }

    /* renamed from: d */
    public final boolean[] mo102426d(C34710b bVar) {
        int i;
        int i2;
        C34710b bVar2 = bVar;
        boolean e = this.f83764a.mo102418e();
        int d = this.f83764a.mo102417d();
        if (e) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (d << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m141252k(d, e)];
        int i4 = 2;
        if (e) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < d) {
            int i12 = (d - i10) << i4;
            if (e) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = bVar2.mo102666h(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = e;
                    zArr[(i13 * 2) + i11 + i17 + i18] = bVar2.mo102666h(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = bVar2.mo102666h(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = bVar2.mo102666h(iArr[i24], iArr[i19]);
                    i18++;
                    d = d;
                    e = z;
                    i4 = 2;
                }
                boolean z2 = e;
                int i25 = d;
                i16++;
                i4 = 2;
            }
            boolean z3 = e;
            int i26 = d;
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }
}
