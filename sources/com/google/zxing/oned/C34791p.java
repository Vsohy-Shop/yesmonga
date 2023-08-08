package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C34709a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.oned.p */
public final class C34791p extends C34792q {

    /* renamed from: b */
    public static final C34827x[] f84411b = new C34827x[0];

    /* renamed from: a */
    public final C34827x[] f84412a;

    public C34791p(Map<DecodeHintType, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new C34783h());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new C34822s());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new C34785j());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C34829z());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C34783h());
            arrayList.add(new C34785j());
            arrayList.add(new C34829z());
        }
        this.f84412a = (C34827x[]) arrayList.toArray(f84411b);
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z;
        Collection collection;
        boolean z2;
        int[] p = C34827x.m142194p(aVar);
        C34827x[] xVarArr = this.f84412a;
        int i2 = 0;
        while (i2 < xVarArr.length) {
            try {
                C34761k m = xVarArr[i2].mo103016m(i, aVar, p, map);
                if (m.mo102873b() == BarcodeFormat.EAN_13 && m.mo102878g().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(BarcodeFormat.UPC_A)) {
                        z2 = false;
                        if (z || !z2) {
                            return m;
                        }
                        C34761k kVar = new C34761k(m.mo102878g().substring(1), m.mo102875d(), m.mo102877f(), BarcodeFormat.UPC_A);
                        kVar.mo102880i(m.mo102876e());
                        return kVar;
                    }
                }
                z2 = true;
                if (z) {
                }
                return m;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m141229a();
    }

    public void reset() {
        for (C34827x reset : this.f84412a) {
            reset.reset();
        }
    }
}
