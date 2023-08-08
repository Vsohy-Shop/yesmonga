package okio;

import androidx.exifinterface.media.C19135a;
import com.contentsquare.android.api.C14092c;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.urbanairship.push.notifications.C9527p;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTimeFieldType;

@C11314h(name = "Utf8")
/* renamed from: okio.s0 */
public final class C12520s0 {

    /* renamed from: a */
    public static final byte f30502a = 63;

    /* renamed from: b */
    public static final char f30503b = '�';

    /* renamed from: c */
    public static final int f30504c = 65533;

    /* renamed from: d */
    public static final int f30505d = 55232;

    /* renamed from: e */
    public static final int f30506e = 56320;

    /* renamed from: f */
    public static final int f30507f = 3968;

    /* renamed from: g */
    public static final int f30508g = -123008;

    /* renamed from: h */
    public static final int f30509h = 3678080;

    /* renamed from: a */
    public static final boolean m51054a(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    /* renamed from: b */
    public static final boolean m51055b(byte b) {
        return (b & C19135a.f49026p7) == 128;
    }

    /* renamed from: c */
    public static final int m51056c(@C12579k byte[] bArr, int i, int i2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$process2Utf8Bytes");
        Intrinsics.checkNotNullParameter(lVar, "yield");
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf(f30504c);
        if (i2 <= i3) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if ((b2 & C19135a.f49026p7) == 128) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b3 = (b2 ^ C11354n.f28471b) ^ (b << 6);
        if (b3 < 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        lVar.invoke(Integer.valueOf(b3));
        return 2;
    }

    /* renamed from: d */
    public static final int m51057d(@C12579k byte[] bArr, int i, int i2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "$this$process3Utf8Bytes");
        Intrinsics.checkNotNullParameter(lVar, "yield");
        int i3 = i + 2;
        boolean z2 = false;
        Integer valueOf = Integer.valueOf(f30504c);
        if (i2 <= i3) {
            lVar.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & C19135a.f49026p7) == 128) {
                    z2 = true;
                }
                if (!z2) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & C19135a.f49026p7) == 128) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & C19135a.f49026p7) == 128) {
            z2 = true;
        }
        if (!z2) {
            lVar.invoke(valueOf);
            return 2;
        }
        byte b4 = ((b3 ^ C11354n.f28471b) ^ (b2 << 6)) ^ (b << 12);
        if (b4 < 2048) {
            lVar.invoke(valueOf);
            return 3;
        } else if (55296 <= b4 && 57343 >= b4) {
            lVar.invoke(valueOf);
            return 3;
        } else {
            lVar.invoke(Integer.valueOf(b4));
            return 3;
        }
    }

    /* renamed from: e */
    public static final int m51058e(@C12579k byte[] bArr, int i, int i2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(bArr, "$this$process4Utf8Bytes");
        Intrinsics.checkNotNullParameter(lVar, "yield");
        int i3 = i + 3;
        boolean z4 = false;
        Integer valueOf = Integer.valueOf(f30504c);
        if (i2 <= i3) {
            lVar.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & C19135a.f49026p7) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & C19135a.f49026p7) == 128) {
                            z4 = true;
                        }
                        if (!z4) {
                            return 2;
                        }
                        return 3;
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & C19135a.f49026p7) == 128) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if ((b3 & C19135a.f49026p7) == 128) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            lVar.invoke(valueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & C19135a.f49026p7) == 128) {
            z4 = true;
        }
        if (!z4) {
            lVar.invoke(valueOf);
            return 3;
        }
        byte b5 = (((b4 ^ C11354n.f28471b) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << DateTimeFieldType.f30605G0);
        if (b5 > 1114111) {
            lVar.invoke(valueOf);
            return 4;
        } else if (55296 <= b5 && 57343 >= b5) {
            lVar.invoke(valueOf);
            return 4;
        } else if (b5 < 65536) {
            lVar.invoke(valueOf);
            return 4;
        } else {
            lVar.invoke(Integer.valueOf(b5));
            return 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r8 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0112, code lost:
        if (r8 == false) goto L_0x006c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m51059f(@org.jetbrains.annotations.C12579k byte[] r16, int r17, int r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Character, kotlin.C11079d2> r19) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf16Chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r17
        L_0x0012:
            if (r3 >= r1) goto L_0x01ad
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0033
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            int r3 = r3 + 1
        L_0x0022:
            if (r3 >= r1) goto L_0x0012
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0012
            int r3 = r3 + 1
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            goto L_0x0022
        L_0x0033:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L_0x006f
            int r5 = r3 + 1
            if (r1 > r5) goto L_0x004f
        L_0x0043:
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
        L_0x004d:
            r7 = r11
            goto L_0x006d
        L_0x004f:
            byte r5 = r0[r5]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L_0x0056
            r8 = r11
        L_0x0056:
            if (r8 != 0) goto L_0x0059
            goto L_0x0043
        L_0x0059:
            r5 = r5 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L_0x0062
            char r4 = (char) r10
            goto L_0x0063
        L_0x0062:
            char r4 = (char) r4
        L_0x0063:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
        L_0x006c:
            r7 = 2
        L_0x006d:
            int r3 = r3 + r7
            goto L_0x0012
        L_0x006f:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto L_0x00e5
            int r5 = r3 + 2
            if (r1 > r5) goto L_0x0096
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004d
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0093
            r8 = r11
        L_0x0093:
            if (r8 != 0) goto L_0x006c
            goto L_0x004d
        L_0x0096:
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00a0
            r15 = r11
            goto L_0x00a1
        L_0x00a0:
            r15 = r8
        L_0x00a1:
            if (r15 != 0) goto L_0x00ae
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x004d
        L_0x00ae:
            byte r5 = r0[r5]
            r15 = r5 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00b5
            r8 = r11
        L_0x00b5:
            if (r8 != 0) goto L_0x00c2
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x006c
        L_0x00c2:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r5 = r5 ^ r7
            int r6 = r6 << 6
            r5 = r5 ^ r6
            int r4 = r4 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L_0x00db
        L_0x00d0:
            char r4 = (char) r10
        L_0x00d1:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x00e3
        L_0x00db:
            if (r12 <= r4) goto L_0x00de
            goto L_0x00e1
        L_0x00de:
            if (r13 < r4) goto L_0x00e1
            goto L_0x00d0
        L_0x00e1:
            char r4 = (char) r4
            goto L_0x00d1
        L_0x00e3:
            r7 = r14
            goto L_0x006d
        L_0x00e5:
            int r5 = r4 >> 3
            if (r5 != r6) goto L_0x01a2
            int r5 = r3 + 3
            if (r1 > r5) goto L_0x0116
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004d
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0102
            r4 = r11
            goto L_0x0103
        L_0x0102:
            r4 = r8
        L_0x0103:
            if (r4 != 0) goto L_0x0107
            goto L_0x004d
        L_0x0107:
            int r4 = r3 + 2
            if (r1 <= r4) goto L_0x006c
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0112
            r8 = r11
        L_0x0112:
            if (r8 != 0) goto L_0x00e3
            goto L_0x006c
        L_0x0116:
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x0120
            r15 = r11
            goto L_0x0121
        L_0x0120:
            r15 = r8
        L_0x0121:
            if (r15 != 0) goto L_0x012e
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x004d
        L_0x012e:
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x0138
            r7 = r11
            goto L_0x0139
        L_0x0138:
            r7 = r8
        L_0x0139:
            if (r7 != 0) goto L_0x0146
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x006c
        L_0x0146:
            byte r5 = r0[r5]
            r7 = r5 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x014d
            r8 = r11
        L_0x014d:
            if (r8 != 0) goto L_0x0159
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x00e3
        L_0x0159:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r5 = r5 ^ r7
            int r7 = r15 << 6
            r5 = r5 ^ r7
            int r6 = r6 << 12
            r5 = r5 ^ r6
            int r4 = r4 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L_0x0175
        L_0x016b:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
        L_0x0172:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x019f
        L_0x0175:
            if (r12 <= r4) goto L_0x0178
            goto L_0x017b
        L_0x0178:
            if (r13 < r4) goto L_0x017b
            goto L_0x016b
        L_0x017b:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r5) goto L_0x0180
            goto L_0x016b
        L_0x0180:
            if (r4 == r10) goto L_0x016b
            int r5 = r4 >>> 10
            r6 = 55232(0xd7c0, float:7.7397E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r2.invoke(r5)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.invoke(r4)
            goto L_0x0172
        L_0x019f:
            r7 = 4
            goto L_0x006d
        L_0x01a2:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.invoke(r4)
            int r3 = r3 + 1
            goto L_0x0012
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12520s0.m51059f(byte[], int, int, kotlin.jvm.functions.l):void");
    }

    /* renamed from: g */
    public static final void m51060g(@C12579k String str, int i, int i2, @C12579k C11300l<? super Byte, C11079d2> lVar) {
        int i3;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "$this$processUtf8Bytes");
        Intrinsics.checkNotNullParameter(lVar, "yield");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (Intrinsics.compare((int) charAt2, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (Intrinsics.compare((int) charAt2, 2048) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | C14092c.f34560U)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> 12) | 224)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) charAt2, (int) GeneratorBase.SURR1_LAST) > 0 || i2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || 57343 < charAt) {
                    lVar.invoke(Byte.valueOf(f30502a));
                } else {
                    int charAt3 = ((charAt2 << 10) + str.charAt(i3)) - 56613888;
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | C9527p.f26031b)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r8 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0110, code lost:
        if (r8 == false) goto L_0x006b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m51061h(@org.jetbrains.annotations.C12579k byte[] r16, int r17, int r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Integer, kotlin.C11079d2> r19) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf8CodePoints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = r17
        L_0x0012:
            if (r3 >= r1) goto L_0x0191
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0031
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4)
            int r3 = r3 + 1
        L_0x0021:
            if (r3 >= r1) goto L_0x0012
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0012
            int r3 = r3 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4)
            goto L_0x0021
        L_0x0031:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L_0x006e
            int r5 = r3 + 1
            if (r1 > r5) goto L_0x004c
        L_0x0041:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
        L_0x004a:
            r7 = r11
            goto L_0x006c
        L_0x004c:
            byte r5 = r0[r5]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L_0x0053
            r8 = r11
        L_0x0053:
            if (r8 != 0) goto L_0x0056
            goto L_0x0041
        L_0x0056:
            r5 = r5 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            goto L_0x0066
        L_0x0062:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0066:
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
        L_0x006b:
            r7 = 2
        L_0x006c:
            int r3 = r3 + r7
            goto L_0x0012
        L_0x006e:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto L_0x00e3
            int r5 = r3 + 2
            if (r1 > r5) goto L_0x0094
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004a
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0091
            r8 = r11
        L_0x0091:
            if (r8 != 0) goto L_0x006b
            goto L_0x004a
        L_0x0094:
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x009e
            r15 = r11
            goto L_0x009f
        L_0x009e:
            r15 = r8
        L_0x009f:
            if (r15 != 0) goto L_0x00ab
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x004a
        L_0x00ab:
            byte r5 = r0[r5]
            r15 = r5 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00b2
            r8 = r11
        L_0x00b2:
            if (r8 != 0) goto L_0x00be
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x006b
        L_0x00be:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r5 = r5 ^ r7
            int r6 = r6 << 6
            r5 = r5 ^ r6
            int r4 = r4 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L_0x00d6
        L_0x00cc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L_0x00d0:
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x00e1
        L_0x00d6:
            if (r12 <= r4) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            if (r13 < r4) goto L_0x00dc
            goto L_0x00cc
        L_0x00dc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00d0
        L_0x00e1:
            r7 = r14
            goto L_0x006c
        L_0x00e3:
            int r5 = r4 >> 3
            if (r5 != r6) goto L_0x0186
            int r5 = r3 + 3
            if (r1 > r5) goto L_0x0114
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004a
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0100
            r4 = r11
            goto L_0x0101
        L_0x0100:
            r4 = r8
        L_0x0101:
            if (r4 != 0) goto L_0x0105
            goto L_0x004a
        L_0x0105:
            int r4 = r3 + 2
            if (r1 <= r4) goto L_0x006b
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0110
            r8 = r11
        L_0x0110:
            if (r8 != 0) goto L_0x00e1
            goto L_0x006b
        L_0x0114:
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x011e
            r15 = r11
            goto L_0x011f
        L_0x011e:
            r15 = r8
        L_0x011f:
            if (r15 != 0) goto L_0x012c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x004a
        L_0x012c:
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x0136
            r7 = r11
            goto L_0x0137
        L_0x0136:
            r7 = r8
        L_0x0137:
            if (r7 != 0) goto L_0x0144
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x006b
        L_0x0144:
            byte r5 = r0[r5]
            r7 = r5 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x014b
            r8 = r11
        L_0x014b:
            if (r8 != 0) goto L_0x0157
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x00e1
        L_0x0157:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r5 = r5 ^ r7
            int r7 = r15 << 6
            r5 = r5 ^ r7
            int r6 = r6 << 12
            r5 = r5 ^ r6
            int r4 = r4 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L_0x0173
        L_0x0169:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L_0x016d:
            r2.invoke(r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x0183
        L_0x0173:
            if (r12 <= r4) goto L_0x0176
            goto L_0x0179
        L_0x0176:
            if (r13 < r4) goto L_0x0179
            goto L_0x0169
        L_0x0179:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r5) goto L_0x017e
            goto L_0x0169
        L_0x017e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x016d
        L_0x0183:
            r7 = 4
            goto L_0x006c
        L_0x0186:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.invoke(r4)
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12520s0.m51061h(byte[], int, int, kotlin.jvm.functions.l):void");
    }

    @C11314h(name = "size")
    @C11315i
    /* renamed from: i */
    public static final long m51062i(@C12579k String str) {
        return m51065l(str, 0, 0, 3, (Object) null);
    }

    @C11314h(name = "size")
    @C11315i
    /* renamed from: j */
    public static final long m51063j(@C12579k String str, int i) {
        return m51065l(str, i, 0, 2, (Object) null);
    }

    @C11314h(name = "size")
    @C11315i
    /* renamed from: k */
    public static final long m51064k(@C12579k String str, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char c;
        Intrinsics.checkNotNullParameter(str, "$this$utf8Size");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                i3 = 3;
                            } else {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c = str.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt > 56319 || c < 56320 || c > 57343) {
                                    j++;
                                    i = i4;
                                } else {
                                    j += (long) 4;
                                    i += 2;
                                }
                            }
                            j += (long) i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: l */
    public static /* synthetic */ long m51065l(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m51064k(str, i, i2);
    }
}
