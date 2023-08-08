package com.google.zxing.datamatrix.decoder;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.contentsquare.android.api.C14092c;
import com.google.firebase.perf.metrics.C33381i;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34711c;
import com.google.zxing.common.C34722k;
import com.google.zxing.datamatrix.encoder.C34748j;
import com.google.zxing.maxicode.decoder.C34766b;
import com.urbanairship.push.notifications.C9527p;
import com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import kotlin.text.C11626x;
import kotlinx.serialization.json.internal.C12361b;

public final class DecodedBitStreamParser {

    /* renamed from: a */
    public static final char[] f84136a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37994t, 'B', C15369g.f37986l, 'D', 'E', 'F', 'G', C15369g.f37982h, 'I', 'J', 'K', C15369g.f37980f, C15369g.f37978d, 'N', 'O', 'P', C15369g.f37990p, 'R', C15369g.f37988n, C15369g.f37992r, 'U', C15369g.f37984j, 'W', MaskModel.f27490e, 'Y', C15369g.f37976b};

    /* renamed from: b */
    public static final char[] f84137b;

    /* renamed from: c */
    public static final char[] f84138c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37993s, 'b', C15369g.f37985k, 'd', 'e', 'f', 'g', C15369g.f37981g, 'i', 'j', 'k', C15369g.f37979e, C15369g.f37977c, 'n', 'o', 'p', C15369g.f37989o, 'r', C15369g.f37987m, C15369g.f37991q, C12361b.f30265p, C15369g.f37983i, 'w', 'x', 'y', C15369g.f37975a};

    /* renamed from: d */
    public static final char[] f84139d;

    /* renamed from: e */
    public static final char[] f84140e = {'`', C15369g.f37994t, 'B', C15369g.f37986l, 'D', 'E', 'F', 'G', C15369g.f37982h, 'I', 'J', 'K', C15369g.f37980f, C15369g.f37978d, 'N', 'O', 'P', C15369g.f37990p, 'R', C15369g.f37988n, C15369g.f37992r, 'U', C15369g.f37984j, 'W', MaskModel.f27490e, 'Y', C15369g.f37976b, C12361b.f30258i, '|', C12361b.f30259j, '~', C33381i.f81116y};

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$a */
    public static /* synthetic */ class C34730a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84149a;

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
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode[] r0 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84149a = r0
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84149a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f84149a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f84149a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f84149a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.C34730a.<clinit>():void");
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', C11626x.f28913d, '\'', '(', ')', '*', '+', ',', '-', '.', '/', C12361b.f30257h, ';', C11626x.f28914e, '=', C11626x.f28915f, '?', '@', C12361b.f30260k, '\\', C12361b.f30261l, '^', '_'};
        f84137b = cArr;
        f84139d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.common.C34712d m141711a(byte[] r8) throws com.google.zxing.FormatException {
        /*
            com.google.zxing.common.c r0 = new com.google.zxing.common.c
            r0.<init>(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
        L_0x001a:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r6 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r5 = m141713c(r0, r1, r2)
            goto L_0x0052
        L_0x0023:
            int[] r7 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.C34730a.f84149a
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r4) goto L_0x004e
            r7 = 2
            if (r5 == r7) goto L_0x004a
            r7 = 3
            if (r5 == r7) goto L_0x0046
            r7 = 4
            if (r5 == r7) goto L_0x0042
            r7 = 5
            if (r5 != r7) goto L_0x003d
            m141714d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            com.google.zxing.FormatException r8 = com.google.zxing.FormatException.m141227a()
            throw r8
        L_0x0042:
            m141716f(r0, r1)
            goto L_0x0051
        L_0x0046:
            m141712b(r0, r1)
            goto L_0x0051
        L_0x004a:
            m141717g(r0, r1)
            goto L_0x0051
        L_0x004e:
            m141715e(r0, r1)
        L_0x0051:
            r5 = r6
        L_0x0052:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r6 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE
            if (r5 == r6) goto L_0x005c
            int r6 = r0.mo102679a()
            if (r6 > 0) goto L_0x001a
        L_0x005c:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0065
            r1.append(r2)
        L_0x0065:
            com.google.zxing.common.d r0 = new com.google.zxing.common.d
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            r0.<init>(r8, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.m141711a(byte[]):com.google.zxing.common.d");
    }

    /* renamed from: b */
    public static void m141712b(C34711c cVar, StringBuilder sb) throws FormatException {
        int d;
        int[] iArr = new int[3];
        while (cVar.mo102679a() != 8 && (d = cVar.mo102682d(8)) != 254) {
            m141718h(d, cVar.mo102682d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(13);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append(C11626x.f28915f);
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw FormatException.m141227a();
                }
            }
            if (cVar.mo102679a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static Mode m141713c(C34711c cVar, StringBuilder sb, StringBuilder sb2) throws FormatException {
        boolean z = false;
        do {
            int d = cVar.mo102682d(8);
            if (d == 0) {
                throw FormatException.m141227a();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return Mode.ASCII_ENCODE;
            } else if (d == 129) {
                return Mode.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else {
                    switch (d) {
                        case C14092c.f34599f0:
                            return Mode.C40_ENCODE;
                        case 231:
                            return Mode.BASE256_ENCODE;
                        case C14092c.f34591d0:
                            sb.append(C34766b.f84300o);
                            break;
                        case 233:
                        case 234:
                        case 241:
                            break;
                        case 235:
                            z = true;
                            break;
                        case 236:
                            sb.append(C34748j.f84203l);
                            sb2.insert(0, C34748j.f84205n);
                            break;
                        case 237:
                            sb.append(C34748j.f84204m);
                            sb2.insert(0, C34748j.f84205n);
                            break;
                        case C14092c.f34603g0:
                            return Mode.ANSIX12_ENCODE;
                        case 239:
                            return Mode.TEXT_ENCODE;
                        case C9527p.f26031b:
                            return Mode.EDIFACT_ENCODE;
                        default:
                            if (!(d == 254 && cVar.mo102679a() == 0)) {
                                throw FormatException.m141227a();
                            }
                    }
                }
            }
        } while (cVar.mo102679a() > 0);
        return Mode.ASCII_ENCODE;
    }

    /* renamed from: d */
    public static void m141714d(C34711c cVar, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int c = cVar.mo102681c() + 1;
        int i = c + 1;
        int i2 = m141719i(cVar.mo102682d(8), c);
        if (i2 == 0) {
            i2 = cVar.mo102679a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + m141719i(cVar.mo102682d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.mo102679a() >= 8) {
                    bArr[i3] = (byte) m141719i(cVar.mo102682d(8), i);
                    i3++;
                    i++;
                } else {
                    throw FormatException.m141227a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, C34722k.f84111f));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        } else {
            throw FormatException.m141227a();
        }
    }

    /* renamed from: e */
    public static void m141715e(C34711c cVar, StringBuilder sb) throws FormatException {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo102679a() != 8 && (d = cVar.mo102682d(8)) != 254) {
            m141718h(d, cVar.mo102682d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f84137b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(C34766b.f84300o);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.m141227a();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw FormatException.m141227a();
                        } else if (z) {
                            sb.append((char) (i3 + 224));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f84136a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw FormatException.m141227a();
                    }
                }
            }
            if (cVar.mo102679a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m141716f(C34711c cVar, StringBuilder sb) {
        while (cVar.mo102679a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.mo102682d(6);
                if (d == 31) {
                    int b = 8 - cVar.mo102680b();
                    if (b != 8) {
                        cVar.mo102682d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (cVar.mo102679a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m141717g(C34711c cVar, StringBuilder sb) throws FormatException {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo102679a() != 8 && (d = cVar.mo102682d(8)) != 254) {
            m141718h(d, cVar.mo102682d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f84139d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(C34766b.f84300o);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.m141227a();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f84140e;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw FormatException.m141227a();
                            }
                        } else {
                            throw FormatException.m141227a();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f84138c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.m141227a();
                    }
                }
            }
            if (cVar.mo102679a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m141718h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    public static int m141719i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
