package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34725c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: com.google.zxing.datamatrix.decoder.c */
public final class C34733c {

    /* renamed from: a */
    public final C34725c f84155a = new C34725c(C34723a.f84118m);

    /* renamed from: a */
    public final void mo102760a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f84155a.mo102735a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m141224a();
        }
    }

    /* renamed from: b */
    public C34712d mo102761b(C34710b bVar) throws FormatException, ChecksumException {
        C34731a aVar = new C34731a(bVar);
        C34732b[] b = C34732b.m141730b(aVar.mo102751c(), aVar.mo102750b());
        int i = 0;
        for (C34732b c : b) {
            i += c.mo102759c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C34732b bVar2 = b[i2];
            byte[] a = bVar2.mo102758a();
            int c2 = bVar2.mo102759c();
            mo102760a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return DecodedBitStreamParser.m141711a(bArr);
    }

    /* renamed from: c */
    public C34712d mo102762c(boolean[][] zArr) throws FormatException, ChecksumException {
        return mo102761b(C34710b.m141590t(zArr));
    }
}
