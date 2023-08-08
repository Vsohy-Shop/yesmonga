package com.appsflyer.internal;

import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.appsflyer.internal.dc */
public final class C21982dc {
    static final int[] AFInAppEventParameterName = new int[256];
    static final byte[] AFInAppEventType = new byte[256];
    static final int[] AFKeystoreWrapper = new int[256];
    private static byte[] AFVersionDeclaration = new byte[256];
    private static int[] AppsFlyer2dXConversionCallback = new int[10];
    static final int[] valueOf = new int[256];
    static final int[] values = new int[256];

    static {
        byte b;
        byte b2;
        byte[] bArr;
        byte b3;
        byte b4 = 1;
        byte b5 = 1;
        do {
            byte b6 = (b4 << 1) ^ b4;
            if ((b4 & C11354n.f28471b) != 0) {
                b = 27;
            } else {
                b = 0;
            }
            b4 = (byte) (b ^ b6);
            byte b7 = (byte) (b5 ^ (b5 << 1));
            byte b8 = (byte) (b7 ^ (b7 << 2));
            byte b9 = (byte) (b8 ^ (b8 << 4));
            if ((b9 & C11354n.f28471b) != 0) {
                b2 = 9;
            } else {
                b2 = 0;
            }
            b5 = (byte) (b9 ^ b2);
            bArr = AFVersionDeclaration;
            b3 = b4 & 255;
            byte b10 = b5 & 255;
            bArr[b3] = (byte) (((((b5 ^ 99) ^ ((b10 << 1) | (b10 >> 7))) ^ ((b10 << 2) | (b10 >> 6))) ^ ((b10 << 3) | (b10 >> 5))) ^ ((b10 >> 4) | (b10 << 4)));
        } while (b3 != 1);
        bArr[0] = 99;
        for (int i = 0; i < 256; i++) {
            byte b11 = AFVersionDeclaration[i] & 255;
            AFInAppEventType[b11] = (byte) i;
            int i2 = i << 1;
            if (i2 >= 256) {
                i2 ^= 283;
            }
            int i3 = i2 << 1;
            if (i3 >= 256) {
                i3 ^= 283;
            }
            int i4 = i3 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 ^ i;
            int i6 = ((i2 ^ (i3 ^ i4)) << 24) | (i5 << 16) | ((i5 ^ i3) << 8) | (i5 ^ i2);
            valueOf[b11] = i6;
            AFKeystoreWrapper[b11] = (i6 >>> 8) | (i6 << 24);
            AFInAppEventParameterName[b11] = (i6 >>> 16) | (i6 << 16);
            values[b11] = (i6 << 8) | (i6 >>> 24);
        }
        AppsFlyer2dXConversionCallback[0] = 16777216;
        int i7 = 1;
        for (int i8 = 1; i8 < 10; i8++) {
            i7 <<= 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            AppsFlyer2dXConversionCallback[i8] = i7 << 24;
        }
    }

    private static int[] AFInAppEventParameterName(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = 4;
            int[] iArr2 = new int[((i + 1) * 4)];
            int i3 = i * 4;
            int i4 = i3 + 1;
            iArr2[0] = iArr[i3];
            int i5 = i4 + 1;
            int i6 = 1;
            iArr2[1] = iArr[i4];
            int i7 = i5 + 1;
            iArr2[2] = iArr[i5];
            iArr2[3] = iArr[i7];
            int i8 = i7 - 7;
            while (i6 < i) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i2 + 1;
                int[] iArr3 = valueOf;
                byte[] bArr2 = AFVersionDeclaration;
                int i12 = iArr3[bArr2[i10 >>> 24] & 255];
                int[] iArr4 = AFKeystoreWrapper;
                int i13 = i12 ^ iArr4[bArr2[(i10 >>> 16) & 255] & 255];
                int[] iArr5 = AFInAppEventParameterName;
                int i14 = i13 ^ iArr5[bArr2[(i10 >>> 8) & 255] & 255];
                int[] iArr6 = values;
                iArr2[i2] = iArr6[bArr2[i10 & 255] & 255] ^ i14;
                int i15 = i9 + 1;
                int i16 = iArr[i9];
                int i17 = i11 + 1;
                iArr2[i11] = iArr6[bArr2[i16 & 255] & 255] ^ ((iArr3[bArr2[i16 >>> 24] & 255] ^ iArr4[bArr2[(i16 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i16 >>> 8) & 255] & 255]);
                int i18 = i15 + 1;
                int i19 = iArr[i15];
                int i20 = i17 + 1;
                iArr2[i17] = iArr6[bArr2[i19 & 255] & 255] ^ ((iArr3[bArr2[i19 >>> 24] & 255] ^ iArr4[bArr2[(i19 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i19 >>> 8) & 255] & 255]);
                int i21 = iArr[i18];
                iArr2[i20] = iArr6[bArr2[i21 & 255] & 255] ^ ((iArr3[bArr2[i21 >>> 24] & 255] ^ iArr4[bArr2[(i21 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i21 >>> 8) & 255] & 255]);
                i6++;
                i8 = i18 - 7;
                i2 = i20 + 1;
            }
            int i22 = i2 + 1;
            int i23 = i8 + 1;
            iArr2[i2] = iArr[i8];
            int i24 = i22 + 1;
            int i25 = i23 + 1;
            iArr2[i22] = iArr[i23];
            iArr2[i24] = iArr[i25];
            iArr2[i24 + 1] = iArr[i25 + 1];
            return iArr2;
        }
        throw new IllegalArgumentException();
    }

    public static int[] valueOf(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = (i + 1) * 4;
            int[] iArr = new int[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < 4) {
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                byte b = (bArr[i5] << 24) | ((bArr[i6] & 255) << DateTimeFieldType.f30603E0);
                int i8 = i7 + 1;
                iArr[i4] = b | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
                i4++;
                i5 = i8 + 1;
            }
            int i9 = 4;
            int i10 = 0;
            while (i9 < i2) {
                int i11 = iArr[i9 - 1];
                if (i3 == 0) {
                    byte[] bArr2 = AFVersionDeclaration;
                    i11 = ((bArr2[i11 >>> 24] & 255) | (((bArr2[(i11 >>> 16) & 255] << 24) | ((bArr2[(i11 >>> 8) & 255] & 255) << DateTimeFieldType.f30603E0)) | ((bArr2[i11 & 255] & 255) << 8))) ^ AppsFlyer2dXConversionCallback[i10];
                    i3 = 4;
                    i10++;
                }
                iArr[i9] = i11 ^ iArr[i9 - 4];
                i9++;
                i3--;
            }
            return AFInAppEventParameterName(bArr, iArr, i);
        }
        throw new IllegalArgumentException();
    }

    public static byte[][] values(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }
}
