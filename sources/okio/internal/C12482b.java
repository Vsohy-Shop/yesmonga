package okio.internal;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.android.datatransport.cct.C40042a;
import java.util.Arrays;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.serialization.json.internal.C12361b;
import okio.ByteString;
import okio.C12460a;
import okio.C12477i;
import okio.C12487j;
import okio.C12500m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTimeFieldType;

/* renamed from: okio.internal.b */
public final class C12482b {
    @C12579k

    /* renamed from: a */
    public static final char[] f30441a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37993s, 'b', C15369g.f37985k, 'd', 'e', 'f'};

    @C12579k
    /* renamed from: A */
    public static final ByteString m50631A(@C12579k ByteString byteString) {
        byte b;
        Intrinsics.checkNotNullParameter(byteString, "$this$commonToAsciiLowercase");
        int i = 0;
        while (i < byteString.mo27135m0().length) {
            byte b2 = byteString.mo27135m0()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] m0 = byteString.mo27135m0();
                byte[] copyOf = Arrays.copyOf(m0, m0.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @C12579k
    /* renamed from: B */
    public static final ByteString m50632B(@C12579k ByteString byteString) {
        byte b;
        Intrinsics.checkNotNullParameter(byteString, "$this$commonToAsciiUppercase");
        int i = 0;
        while (i < byteString.mo27135m0().length) {
            byte b2 = byteString.mo27135m0()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] m0 = byteString.mo27135m0();
                byte[] copyOf = Arrays.copyOf(m0, m0.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    @C12579k
    /* renamed from: C */
    public static final byte[] m50633C(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonToByteArray");
        byte[] m0 = byteString.mo27135m0();
        byte[] copyOf = Arrays.copyOf(m0, m0.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: D */
    public static final ByteString m50634D(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$commonToByteString");
        C12487j.m50748e((long) bArr.length, (long) i, (long) i2);
        return new ByteString(C10956m.m41052G1(bArr, i, i2 + i));
    }

    @C12579k
    /* renamed from: E */
    public static final String m50635E(@C12579k ByteString byteString) {
        boolean z;
        ByteString byteString2 = byteString;
        Intrinsics.checkNotNullParameter(byteString2, "$this$commonToString");
        boolean z2 = true;
        if (byteString.mo27135m0().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "[size=0]";
        }
        int a = m50642c(byteString.mo27135m0(), 64);
        if (a != -1) {
            String s2 = byteString.mo27148s2();
            if (s2 != null) {
                String substring = s2.substring(0, a);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = C11622t.replace$default(C11622t.replace$default(C11622t.replace$default(substring, C40042a.f102078h, "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a < s2.length()) {
                    return "[size=" + byteString.mo27135m0().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + C12361b.f30261l;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (byteString.mo27135m0().length <= 64) {
            return "[hex=" + byteString.mo27150t0() + C12361b.f30261l;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(byteString.mo27135m0().length);
            sb.append(" hex=");
            if (64 > byteString.mo27135m0().length) {
                z2 = false;
            }
            if (z2) {
                if (64 != byteString.mo27135m0().length) {
                    byteString2 = new ByteString(C10956m.m41052G1(byteString.mo27135m0(), 0, 64));
                }
                sb.append(byteString2.mo27150t0());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + byteString.mo27135m0().length + ')').toString());
        }
    }

    @C12579k
    /* renamed from: F */
    public static final String m50636F(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonUtf8");
        String p0 = byteString.mo27141p0();
        if (p0 != null) {
            return p0;
        }
        String c = C12477i.m50548c(byteString.mo27115U0());
        byteString.mo27116X1(c);
        return c;
    }

    /* renamed from: G */
    public static final void m50637G(@C12579k ByteString byteString, @C12579k C12500m mVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(mVar, "buffer");
        mVar.mo27235k3(byteString.mo27135m0(), i, i2);
    }

    /* renamed from: H */
    public static final int m50638H(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = C15369g.f37993s;
        if ('a' > c || 'f' < c) {
            c2 = C15369g.f37994t;
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @C12579k
    /* renamed from: I */
    public static final char[] m50639I() {
        return f30441a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        return -1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m50642c(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01e5
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0072
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0039
            if (r7 == r11) goto L_0x0039
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            if (r9 < r7) goto L_0x0036
        L_0x0033:
            r6 = r17
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            if (r6 != 0) goto L_0x003b
        L_0x0039:
            if (r7 != r12) goto L_0x003c
        L_0x003b:
            return r16
        L_0x003c:
            if (r7 >= r14) goto L_0x0041
            r6 = r17
            goto L_0x0042
        L_0x0041:
            r6 = 2
        L_0x0042:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0045:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r4 = r4 + 1
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0054
            return r5
        L_0x0054:
            if (r7 == r13) goto L_0x0067
            if (r7 == r11) goto L_0x0067
            if (r7 < 0) goto L_0x005c
            if (r10 >= r7) goto L_0x0061
        L_0x005c:
            if (r8 <= r7) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            if (r9 < r7) goto L_0x0064
        L_0x0061:
            r6 = r17
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 != 0) goto L_0x0069
        L_0x0067:
            if (r7 != r12) goto L_0x006a
        L_0x0069:
            return r16
        L_0x006a:
            if (r7 >= r14) goto L_0x006f
            r6 = r17
            goto L_0x0070
        L_0x006f:
            r6 = 2
        L_0x0070:
            int r5 = r5 + r6
            goto L_0x0045
        L_0x0072:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00c7
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0081
            if (r6 != r1) goto L_0x0080
            return r5
        L_0x0080:
            return r16
        L_0x0081:
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x008a
            r15 = r17
            goto L_0x008b
        L_0x008a:
            r15 = 0
        L_0x008b:
            if (r15 != 0) goto L_0x0091
            if (r6 != r1) goto L_0x0090
            return r5
        L_0x0090:
            return r16
        L_0x0091:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x009c
            if (r6 != r1) goto L_0x009b
            return r5
        L_0x009b:
            return r16
        L_0x009c:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a1
            return r5
        L_0x00a1:
            if (r3 == r13) goto L_0x00b4
            if (r3 == r11) goto L_0x00b4
            if (r3 < 0) goto L_0x00a9
            if (r10 >= r3) goto L_0x00ae
        L_0x00a9:
            if (r8 <= r3) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            if (r9 < r3) goto L_0x00b1
        L_0x00ae:
            r6 = r17
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            if (r6 != 0) goto L_0x00b6
        L_0x00b4:
            if (r3 != r12) goto L_0x00b7
        L_0x00b6:
            return r16
        L_0x00b7:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00be
            r15 = r17
            goto L_0x00bf
        L_0x00be:
            r15 = 2
        L_0x00bf:
            int r5 = r5 + r15
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            int r4 = r4 + 2
        L_0x00c4:
            r6 = r7
            goto L_0x0008
        L_0x00c7:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L_0x0147
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d9
            if (r6 != r1) goto L_0x00d8
            return r5
        L_0x00d8:
            return r16
        L_0x00d9:
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00e4
            r8 = r17
            goto L_0x00e5
        L_0x00e4:
            r8 = 0
        L_0x00e5:
            if (r8 != 0) goto L_0x00eb
            if (r6 != r1) goto L_0x00ea
            return r5
        L_0x00ea:
            return r16
        L_0x00eb:
            byte r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00f4
            r8 = r17
            goto L_0x00f5
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            if (r8 != 0) goto L_0x00fb
            if (r6 != r1) goto L_0x00fa
            return r5
        L_0x00fa:
            return r16
        L_0x00fb:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x010d
            if (r6 != r1) goto L_0x010c
            return r5
        L_0x010c:
            return r16
        L_0x010d:
            if (r12 <= r3) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            if (r9 < r3) goto L_0x0116
            if (r6 != r1) goto L_0x0115
            return r5
        L_0x0115:
            return r16
        L_0x0116:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x011b
            return r5
        L_0x011b:
            if (r3 == r13) goto L_0x0132
            if (r3 == r11) goto L_0x0132
            if (r3 < 0) goto L_0x0123
            if (r10 >= r3) goto L_0x012c
        L_0x0123:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0128
            goto L_0x012f
        L_0x0128:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x012f
        L_0x012c:
            r6 = r17
            goto L_0x0130
        L_0x012f:
            r6 = 0
        L_0x0130:
            if (r6 != 0) goto L_0x0137
        L_0x0132:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0138
        L_0x0137:
            return r16
        L_0x0138:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x013f
            r15 = r17
            goto L_0x0140
        L_0x013f:
            r15 = 2
        L_0x0140:
            int r5 = r5 + r15
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            int r4 = r4 + 3
            goto L_0x00c4
        L_0x0147:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01e1
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0153
            if (r6 != r1) goto L_0x0152
            return r5
        L_0x0152:
            return r16
        L_0x0153:
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x015e
            r15 = r17
            goto L_0x015f
        L_0x015e:
            r15 = 0
        L_0x015f:
            if (r15 != 0) goto L_0x0165
            if (r6 != r1) goto L_0x0164
            return r5
        L_0x0164:
            return r16
        L_0x0165:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0170
            r10 = r17
            goto L_0x0171
        L_0x0170:
            r10 = 0
        L_0x0171:
            if (r10 != 0) goto L_0x0177
            if (r6 != r1) goto L_0x0176
            return r5
        L_0x0176:
            return r16
        L_0x0177:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x0180
            r10 = r17
            goto L_0x0181
        L_0x0180:
            r10 = 0
        L_0x0181:
            if (r10 != 0) goto L_0x0187
            if (r6 != r1) goto L_0x0186
            return r5
        L_0x0186:
            return r16
        L_0x0187:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x019d
            if (r6 != r1) goto L_0x019c
            return r5
        L_0x019c:
            return r16
        L_0x019d:
            if (r12 <= r3) goto L_0x01a0
            goto L_0x01a6
        L_0x01a0:
            if (r9 < r3) goto L_0x01a6
            if (r6 != r1) goto L_0x01a5
            return r5
        L_0x01a5:
            return r16
        L_0x01a6:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01ae
            if (r6 != r1) goto L_0x01ad
            return r5
        L_0x01ad:
            return r16
        L_0x01ae:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01b3
            return r5
        L_0x01b3:
            if (r3 == r13) goto L_0x01cc
            if (r3 == r11) goto L_0x01cc
            if (r3 < 0) goto L_0x01bd
            r6 = 31
            if (r6 >= r3) goto L_0x01c6
        L_0x01bd:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01c2
            goto L_0x01c9
        L_0x01c2:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01c9
        L_0x01c6:
            r6 = r17
            goto L_0x01ca
        L_0x01c9:
            r6 = 0
        L_0x01ca:
            if (r6 != 0) goto L_0x01d1
        L_0x01cc:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01d2
        L_0x01d1:
            return r16
        L_0x01d2:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01d9
            r15 = r17
            goto L_0x01da
        L_0x01d9:
            r15 = 2
        L_0x01da:
            int r5 = r5 + r15
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            int r4 = r4 + 4
            goto L_0x00c4
        L_0x01e1:
            if (r6 != r1) goto L_0x01e4
            return r5
        L_0x01e4:
            return r16
        L_0x01e5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12482b.m50642c(byte[], int):int");
    }

    @C12579k
    /* renamed from: d */
    public static final String m50643d(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonBase64");
        return C12460a.m50458c(byteString.mo27135m0(), (byte[]) null, 1, (Object) null);
    }

    @C12579k
    /* renamed from: e */
    public static final String m50644e(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonBase64Url");
        return C12460a.m50457b(byteString.mo27135m0(), C12460a.m50460e());
    }

    /* renamed from: f */
    public static final int m50645f(@C12579k ByteString byteString, @C12579k ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonCompareTo");
        Intrinsics.checkNotNullParameter(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            byte f0 = byteString.mo27126f0(i) & 255;
            byte f02 = byteString2.mo27126f0(i) & 255;
            if (f0 == f02) {
                i++;
            } else if (f0 < f02) {
                return -1;
            } else {
                return 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    @C12580l
    /* renamed from: g */
    public static final ByteString m50646g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$commonDecodeBase64");
        byte[] a = C12460a.m50456a(str);
        if (a != null) {
            return new ByteString(a);
        }
        return null;
    }

    @C12579k
    /* renamed from: h */
    public static final ByteString m50647h(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "$this$commonDecodeHex");
        if (str.length() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m50638H(str.charAt(i2)) << 4) + m50638H(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @C12579k
    /* renamed from: i */
    public static final ByteString m50648i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(C12477i.m50546a(str));
        byteString.mo27116X1(str);
        return byteString;
    }

    /* renamed from: j */
    public static final boolean m50649j(@C12579k ByteString byteString, @C12579k ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonEndsWith");
        Intrinsics.checkNotNullParameter(byteString2, "suffix");
        return byteString.mo27108H1(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    /* renamed from: k */
    public static final boolean m50650k(@C12579k ByteString byteString, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonEndsWith");
        Intrinsics.checkNotNullParameter(bArr, "suffix");
        return byteString.mo27111L1(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static final boolean m50651l(@C12579k ByteString byteString, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonEquals");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.mo27135m0().length && byteString2.mo27111L1(0, byteString.mo27135m0(), 0, byteString.mo27135m0().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final byte m50652m(@C12579k ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonGetByte");
        return byteString.mo27135m0()[i];
    }

    /* renamed from: n */
    public static final int m50653n(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonGetSize");
        return byteString.mo27135m0().length;
    }

    /* renamed from: o */
    public static final int m50654o(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonHashCode");
        int n0 = byteString.mo27137n0();
        if (n0 != 0) {
            return n0;
        }
        int hashCode = Arrays.hashCode(byteString.mo27135m0());
        byteString.mo27114T1(hashCode);
        return hashCode;
    }

    @C12579k
    /* renamed from: p */
    public static final String m50655p(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonHex");
        char[] cArr = new char[(byteString.mo27135m0().length * 2)];
        int i = 0;
        for (byte b : byteString.mo27135m0()) {
            int i2 = i + 1;
            cArr[i] = m50639I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = m50639I()[b & DateTimeFieldType.f30626Z];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    public static final int m50656q(@C12579k ByteString byteString, @C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(bArr, "other");
        int length = byteString.mo27135m0().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!C12487j.m50747d(byteString.mo27135m0(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @C12579k
    /* renamed from: r */
    public static final byte[] m50657r(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonInternalArray");
        return byteString.mo27135m0();
    }

    /* renamed from: s */
    public static final int m50658s(@C12579k ByteString byteString, @C12579k ByteString byteString2, int i) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonLastIndexOf");
        Intrinsics.checkNotNullParameter(byteString2, "other");
        return byteString.mo27144q1(byteString2.mo27115U0(), i);
    }

    /* renamed from: t */
    public static final int m50659t(@C12579k ByteString byteString, @C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonLastIndexOf");
        Intrinsics.checkNotNullParameter(bArr, "other");
        for (int min = Math.min(i, byteString.mo27135m0().length - bArr.length); min >= 0; min--) {
            if (C12487j.m50747d(byteString.mo27135m0(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @C12579k
    /* renamed from: u */
    public static final ByteString m50660u(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    /* renamed from: v */
    public static final boolean m50661v(@C12579k ByteString byteString, int i, @C12579k ByteString byteString2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(byteString2, "other");
        return byteString2.mo27111L1(i2, byteString.mo27135m0(), i, i3);
    }

    /* renamed from: w */
    public static final boolean m50662w(@C12579k ByteString byteString, int i, @C12579k byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(bArr, "other");
        if (i < 0 || i > byteString.mo27135m0().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C12487j.m50747d(byteString.mo27135m0(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static final boolean m50663x(@C12579k ByteString byteString, @C12579k ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonStartsWith");
        Intrinsics.checkNotNullParameter(byteString2, "prefix");
        return byteString.mo27108H1(0, byteString2, 0, byteString2.size());
    }

    /* renamed from: y */
    public static final boolean m50664y(@C12579k ByteString byteString, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(byteString, "$this$commonStartsWith");
        Intrinsics.checkNotNullParameter(bArr, "prefix");
        return byteString.mo27111L1(0, bArr, 0, bArr.length);
    }

    @C12579k
    /* renamed from: z */
    public static final ByteString m50665z(@C12579k ByteString byteString, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(byteString, "$this$commonSubstring");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= byteString.mo27135m0().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 - i < 0) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == byteString.mo27135m0().length) {
                    return byteString;
                } else {
                    return new ByteString(C10956m.m41052G1(byteString.mo27135m0(), i, i2));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.mo27135m0().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }
}
