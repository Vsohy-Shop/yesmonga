package com.google.zxing.qrcode.decoder;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34711c;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.C34722k;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.maxicode.decoder.C34766b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.decoder.c */
public final class C34868c {

    /* renamed from: a */
    public static final char[] f84733a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: b */
    public static final int f84734b = 1;

    /* renamed from: com.google.zxing.qrcode.decoder.c$a */
    public static /* synthetic */ class C34869a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84735a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f84735a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.C34868c.C34869a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C34712d m142450a(byte[] bArr, C34873g gVar, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        Mode b;
        Mode mode;
        ArrayList arrayList;
        String str;
        C34873g gVar2 = gVar;
        C34711c cVar = new C34711c(bArr);
        StringBuilder sb = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                if (cVar.mo102679a() < 4) {
                    b = Mode.TERMINATOR;
                } else {
                    b = Mode.m142437b(cVar.mo102682d(4));
                }
                Mode mode2 = b;
                int[] iArr = C34869a.f84735a;
                switch (iArr[mode2.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        break;
                    case 8:
                        if (cVar.mo102679a() >= 16) {
                            int d = cVar.mo102682d(8);
                            i2 = cVar.mo102682d(8);
                            i = d;
                            break;
                        } else {
                            throw FormatException.m141227a();
                        }
                    case 9:
                        characterSetECI = CharacterSetECI.m141566g(m142456g(cVar));
                        if (characterSetECI != null) {
                            break;
                        } else {
                            throw FormatException.m141227a();
                        }
                    case 10:
                        int d2 = cVar.mo102682d(4);
                        int d3 = cVar.mo102682d(mode2.mo103158q(gVar2));
                        if (d2 == z) {
                            m142453d(cVar, sb, d3);
                            break;
                        }
                        break;
                    default:
                        int d4 = cVar.mo102682d(mode2.mo103158q(gVar2));
                        int i3 = iArr[mode2.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    mode = mode2;
                                    m142452c(cVar, sb, d4, characterSetECI, arrayList2, map);
                                    break;
                                } else if (i3 == 4) {
                                    m142454e(cVar, sb, d4);
                                    break;
                                } else {
                                    throw FormatException.m141227a();
                                }
                            } else {
                                mode = mode2;
                                m142451b(cVar, sb, d4, z2);
                                break;
                            }
                        } else {
                            mode = mode2;
                            m142455f(cVar, sb, d4);
                            break;
                        }
                }
                mode = mode2;
                if (mode == Mode.TERMINATOR) {
                    String sb2 = sb.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (errorCorrectionLevel == null) {
                        str = null;
                    } else {
                        str = errorCorrectionLevel.toString();
                    }
                    return new C34712d(bArr, sb2, arrayList, str, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.m141227a();
            }
        }
    }

    /* renamed from: b */
    public static void m142451b(C34711c cVar, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (cVar.mo102679a() >= 11) {
                int d = cVar.mo102682d(11);
                sb.append(m142457h(d / 45));
                sb.append(m142457h(d % 45));
                i -= 2;
            } else {
                throw FormatException.m141227a();
            }
        }
        if (i == 1) {
            if (cVar.mo102679a() >= 6) {
                sb.append(m142457h(cVar.mo102682d(6)));
            } else {
                throw FormatException.m141227a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, C34766b.f84300o);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m142452c(C34711c cVar, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        String str;
        if ((i << 3) <= cVar.mo102679a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo102682d(8);
            }
            if (characterSetECI == null) {
                str = C34722k.m141668a(bArr, map);
            } else {
                str = characterSetECI.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m141227a();
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: d */
    public static void m142453d(C34711c cVar, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= cVar.mo102679a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.mo102682d(13);
                int i4 = (d % 96) | ((d / 96) << 8);
                if (i4 < 2560) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C34722k.f84108c));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m141227a();
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: e */
    public static void m142454e(C34711c cVar, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= cVar.mo102679a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.mo102682d(13);
                int i4 = (d % C14092c.f34560U) | ((d / C14092c.f34560U) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C34722k.f84107b));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m141227a();
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: f */
    public static void m142455f(C34711c cVar, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (cVar.mo102679a() >= 10) {
                int d = cVar.mo102682d(10);
                if (d < 1000) {
                    sb.append(m142457h(d / 100));
                    sb.append(m142457h((d / 10) % 10));
                    sb.append(m142457h(d % 10));
                    i -= 3;
                } else {
                    throw FormatException.m141227a();
                }
            } else {
                throw FormatException.m141227a();
            }
        }
        if (i == 2) {
            if (cVar.mo102679a() >= 7) {
                int d2 = cVar.mo102682d(7);
                if (d2 < 100) {
                    sb.append(m142457h(d2 / 10));
                    sb.append(m142457h(d2 % 10));
                    return;
                }
                throw FormatException.m141227a();
            }
            throw FormatException.m141227a();
        } else if (i != 1) {
        } else {
            if (cVar.mo102679a() >= 4) {
                int d3 = cVar.mo102682d(4);
                if (d3 < 10) {
                    sb.append(m142457h(d3));
                    return;
                }
                throw FormatException.m141227a();
            }
            throw FormatException.m141227a();
        }
    }

    /* renamed from: g */
    public static int m142456g(C34711c cVar) throws FormatException {
        int d = cVar.mo102682d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & C14092c.f34560U) == 128) {
            return cVar.mo102682d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo102682d(16) | ((d & 31) << 16);
        }
        throw FormatException.m141227a();
    }

    /* renamed from: h */
    public static char m142457h(int i) throws FormatException {
        char[] cArr = f84733a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m141227a();
    }
}
