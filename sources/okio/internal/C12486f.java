package okio.internal;

import com.contentsquare.android.api.C14092c;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.urbanairship.push.notifications.C9527p;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.C12520s0;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.internal.f */
public final class C12486f {
    @C12579k
    /* renamed from: a */
    public static final byte[] m50741a(@C12579k String str) {
        int i;
        int i2;
        int i3;
        char charAt;
        int i4;
        Intrinsics.checkNotNullParameter(str, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[(str.length() * 4)];
        int length = str.length();
        int i5 = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = str.length();
                int i6 = i;
                while (i < length2) {
                    char charAt3 = str.charAt(i);
                    if (Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) charAt3;
                        i++;
                        while (i < length2 && Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                            bArr[i7] = (byte) str.charAt(i);
                            i++;
                            i7++;
                        }
                        i6 = i7;
                    } else {
                        if (Intrinsics.compare((int) charAt3, 2048) < 0) {
                            int i8 = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 >> 6) | C14092c.f34560U);
                            i2 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i9 = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 >> 12) | 224);
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i2 = i10 + 1;
                            bArr[i10] = (byte) ((charAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) charAt3, (int) GeneratorBase.SURR1_LAST) > 0 || length2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || 57343 < charAt) {
                            i2 = i6 + 1;
                            bArr[i6] = C12520s0.f30502a;
                        } else {
                            int charAt4 = ((charAt3 << 10) + str.charAt(i3)) - 56613888;
                            int i11 = i6 + 1;
                            bArr[i6] = (byte) ((charAt4 >> 18) | C9527p.f26031b);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i2 = i13 + 1;
                            bArr[i13] = (byte) ((charAt4 & 63) | 128);
                            i4 = i + 2;
                            i6 = i2;
                        }
                        i4 = i + 1;
                        i6 = i2;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i6);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i] = (byte) charAt2;
            i5 = i + 1;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        if (r5 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0117, code lost:
        if (r12 == false) goto L_0x011d;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m50742b(@org.jetbrains.annotations.C12579k byte[] r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "$this$commonToUtf8String"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            if (r1 < 0) goto L_0x01b9
            int r3 = r0.length
            if (r2 > r3) goto L_0x01b9
            if (r1 > r2) goto L_0x01b9
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = r4
        L_0x0018:
            if (r1 >= r2) goto L_0x01b3
            byte r6 = r0[r1]
            if (r6 < 0) goto L_0x0036
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            int r1 = r1 + 1
        L_0x0025:
            if (r1 >= r2) goto L_0x0034
            byte r5 = r0[r1]
            if (r5 < 0) goto L_0x0034
            int r1 = r1 + 1
            char r5 = (char) r5
            int r6 = r7 + 1
            r3[r7] = r5
            r7 = r6
            goto L_0x0025
        L_0x0034:
            r5 = r7
            goto L_0x0018
        L_0x0036:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.794E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r8) goto L_0x0075
            int r7 = r1 + 1
            if (r2 > r7) goto L_0x004d
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L_0x0049:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
        L_0x004b:
            r9 = 1
            goto L_0x0073
        L_0x004d:
            byte r7 = r0[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x0055
            r8 = 1
            goto L_0x0056
        L_0x0055:
            r8 = r4
        L_0x0056:
            if (r8 != 0) goto L_0x005e
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L_0x0049
        L_0x005e:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L_0x006b
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L_0x0070
        L_0x006b:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
        L_0x0070:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
        L_0x0072:
            r9 = 2
        L_0x0073:
            int r1 = r1 + r9
            goto L_0x0034
        L_0x0075:
            int r7 = r6 >> 4
            r13 = 55296(0xd800, float:7.7486E-41)
            r14 = 57343(0xdfff, float:8.0355E-41)
            r15 = 3
            if (r7 != r8) goto L_0x00ec
            int r7 = r1 + 2
            if (r2 > r7) goto L_0x009b
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            int r5 = r1 + 1
            if (r2 <= r5) goto L_0x004b
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x0097
            r5 = 1
            goto L_0x0098
        L_0x0097:
            r5 = r4
        L_0x0098:
            if (r5 != 0) goto L_0x0072
            goto L_0x004b
        L_0x009b:
            int r8 = r1 + 1
            byte r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r9 != 0) goto L_0x00b0
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x004b
        L_0x00b0:
            byte r7 = r0[r7]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x00b8
            r12 = 1
            goto L_0x00b9
        L_0x00b8:
            r12 = r4
        L_0x00b9:
            if (r12 != 0) goto L_0x00c3
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x0072
        L_0x00c3:
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r9
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r6 = r6 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L_0x00d9
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L_0x00d6:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x00ea
        L_0x00d9:
            if (r13 <= r6) goto L_0x00dc
            goto L_0x00e4
        L_0x00dc:
            if (r14 < r6) goto L_0x00e4
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L_0x00d6
        L_0x00e4:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L_0x00d6
        L_0x00ea:
            r9 = r15
            goto L_0x0073
        L_0x00ec:
            int r7 = r6 >> 3
            if (r7 != r8) goto L_0x01aa
            int r7 = r1 + 3
            if (r2 > r7) goto L_0x0123
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            int r5 = r1 + 1
            if (r2 <= r5) goto L_0x0120
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x0106
            r5 = 1
            goto L_0x0107
        L_0x0106:
            r5 = r4
        L_0x0107:
            if (r5 != 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            int r5 = r1 + 2
            if (r2 <= r5) goto L_0x011d
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x0116
            r12 = 1
            goto L_0x0117
        L_0x0116:
            r12 = r4
        L_0x0117:
            if (r12 != 0) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r9 = r15
            goto L_0x01a8
        L_0x011d:
            r9 = 2
            goto L_0x01a8
        L_0x0120:
            r9 = 1
            goto L_0x01a8
        L_0x0123:
            int r8 = r1 + 1
            byte r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x012d
            r9 = 1
            goto L_0x012e
        L_0x012d:
            r9 = r4
        L_0x012e:
            if (r9 != 0) goto L_0x0137
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x0120
        L_0x0137:
            int r9 = r1 + 2
            byte r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L_0x0141
            r12 = 1
            goto L_0x0142
        L_0x0141:
            r12 = r4
        L_0x0142:
            if (r12 != 0) goto L_0x014b
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x011d
        L_0x014b:
            byte r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L_0x0153
            r12 = 1
            goto L_0x0154
        L_0x0153:
            r12 = r4
        L_0x0154:
            if (r12 != 0) goto L_0x015d
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x011a
        L_0x015d:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r10
            int r9 = r9 << 6
            r7 = r7 ^ r9
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L_0x0176
            int r6 = r5 + 1
            r3[r5] = r11
        L_0x0173:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            goto L_0x01a7
        L_0x0176:
            if (r13 <= r6) goto L_0x0179
            goto L_0x0180
        L_0x0179:
            if (r14 < r6) goto L_0x0180
            int r6 = r5 + 1
            r3[r5] = r11
            goto L_0x0173
        L_0x0180:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r7) goto L_0x0189
            int r6 = r5 + 1
            r3[r5] = r11
            goto L_0x0173
        L_0x0189:
            if (r6 == r11) goto L_0x01a2
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r5 = r6 & 1023(0x3ff, float:1.434E-42)
            r6 = 56320(0xdc00, float:7.8921E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            int r6 = r8 + 1
            r3[r8] = r5
            goto L_0x0173
        L_0x01a2:
            int r6 = r5 + 1
            r3[r5] = r11
            goto L_0x0173
        L_0x01a7:
            r9 = 4
        L_0x01a8:
            int r1 = r1 + r9
            goto L_0x01b0
        L_0x01aa:
            int r6 = r5 + 1
            r3[r5] = r11
            int r1 = r1 + 1
        L_0x01b0:
            r5 = r6
            goto L_0x0018
        L_0x01b3:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            return r0
        L_0x01b9:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "size="
            r4.append(r5)
            int r0 = r0.length
            r4.append(r0)
            java.lang.String r0 = " beginIndex="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " endIndex="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.C12486f.m50742b(byte[], int, int):java.lang.String");
    }

    /* renamed from: c */
    public static /* synthetic */ String m50743c(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return m50742b(bArr, i, i2);
    }
}
