package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34644b;
import com.google.zxing.C34761k;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import java.util.Map;

/* renamed from: com.google.zxing.oned.s */
public final class C34822s extends C34827x {

    /* renamed from: k */
    public final C34827x f84505k = new C34783h();

    /* renamed from: s */
    public static C34761k m142171s(C34761k kVar) throws FormatException {
        String g = kVar.mo102878g();
        if (g.charAt(0) == '0') {
            C34761k kVar2 = new C34761k(g.substring(1), (byte[]) null, kVar.mo102877f(), BarcodeFormat.UPC_A);
            if (kVar.mo102876e() != null) {
                kVar2.mo102880i(kVar.mo102876e());
            }
            return kVar2;
        }
        throw FormatException.m141227a();
    }

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return m142171s(this.f84505k.mo102419a(bVar, map));
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m142171s(this.f84505k.mo102904b(i, aVar, map));
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, FormatException {
        return m142171s(this.f84505k.mo102420c(bVar));
    }

    /* renamed from: l */
    public int mo102911l(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f84505k.mo102911l(aVar, iArr, sb);
    }

    /* renamed from: m */
    public C34761k mo103016m(int i, C34709a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m142171s(this.f84505k.mo103016m(i, aVar, iArr, map));
    }

    /* renamed from: q */
    public BarcodeFormat mo102912q() {
        return BarcodeFormat.UPC_A;
    }
}
