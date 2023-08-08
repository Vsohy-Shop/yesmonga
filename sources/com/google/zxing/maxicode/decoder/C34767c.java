package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34725c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.zxing.maxicode.decoder.c */
public final class C34767c {

    /* renamed from: b */
    public static final int f84303b = 0;

    /* renamed from: c */
    public static final int f84304c = 1;

    /* renamed from: d */
    public static final int f84305d = 2;

    /* renamed from: a */
    public final C34725c f84306a = new C34725c(C34723a.f84120o);

    /* renamed from: a */
    public final void mo102890a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[(i6 / i5)];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f84306a.mo102735a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m141224a();
        }
    }

    /* renamed from: b */
    public C34712d mo102891b(C34710b bVar) throws ChecksumException, FormatException {
        return mo102892c(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: c */
    public C34712d mo102892c(C34710b bVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] a = new C34765a(bVar).mo102889a();
        mo102890a(a, 0, 10, 10, 0);
        byte b = a[0] & DateTimeFieldType.f30626Z;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr2 = a;
            mo102890a(bArr2, 20, 84, 40, 1);
            mo102890a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b == 5) {
            byte[] bArr3 = a;
            mo102890a(bArr3, 20, 68, 56, 1);
            mo102890a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.m141227a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C34766b.m141941a(bArr, b);
    }
}
