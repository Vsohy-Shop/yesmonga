package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34725c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.decoder.d */
public final class C34870d {

    /* renamed from: a */
    public final C34725c f84736a = new C34725c(C34723a.f84117l);

    /* renamed from: a */
    public final void mo103168a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f84736a.mo102735a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m141224a();
        }
    }

    /* renamed from: b */
    public C34712d mo103169b(C34710b bVar) throws ChecksumException, FormatException {
        return mo103170c(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: c */
    public C34712d mo103170c(C34710b bVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        ChecksumException e;
        C34866a aVar = new C34866a(bVar);
        FormatException formatException = null;
        try {
            return mo103171d(aVar, map);
        } catch (FormatException e2) {
            FormatException formatException2 = e2;
            e = null;
            formatException = formatException2;
            try {
                aVar.mo103164f();
                aVar.mo103165g(true);
                aVar.mo103163e();
                aVar.mo103162d();
                aVar.mo103160b();
                C34712d d = mo103171d(aVar, map);
                d.mo102697o(new C34872f(true));
                return d;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (ChecksumException e3) {
            e = e3;
            aVar.mo103164f();
            aVar.mo103165g(true);
            aVar.mo103163e();
            aVar.mo103162d();
            aVar.mo103160b();
            C34712d d2 = mo103171d(aVar, map);
            d2.mo102697o(new C34872f(true));
            return d2;
        }
    }

    /* renamed from: d */
    public final C34712d mo103171d(C34866a aVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        C34873g e = aVar.mo103163e();
        ErrorCorrectionLevel d = aVar.mo103162d().mo103175d();
        C34867b[] b = C34867b.m142447b(aVar.mo103161c(), e, d);
        int i = 0;
        for (C34867b c : b) {
            i += c.mo103167c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C34867b bVar : b) {
            byte[] a = bVar.mo103166a();
            int c2 = bVar.mo103167c();
            mo103168a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C34868c.m142450a(bArr, e, d, map);
    }

    /* renamed from: e */
    public C34712d mo103172e(boolean[][] zArr) throws ChecksumException, FormatException {
        return mo103173f(zArr, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: f */
    public C34712d mo103173f(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return mo103170c(C34710b.m141590t(zArr), map);
    }
}
