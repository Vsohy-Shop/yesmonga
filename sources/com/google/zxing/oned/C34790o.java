package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C34709a;
import com.google.zxing.oned.rss.C34798e;
import com.google.zxing.oned.rss.expanded.C34802d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.oned.o */
public final class C34790o extends C34792q {

    /* renamed from: b */
    public static final C34792q[] f84409b = new C34792q[0];

    /* renamed from: a */
    public final C34792q[] f84410a;

    public C34790o(Map<DecodeHintType, ?> map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C34791p(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new C34779d(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new C34781f());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new C34778c());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new C34788m());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new C34775a());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new C34798e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new C34802d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C34791p(map));
            arrayList.add(new C34779d());
            arrayList.add(new C34775a());
            arrayList.add(new C34781f());
            arrayList.add(new C34778c());
            arrayList.add(new C34788m());
            arrayList.add(new C34798e());
            arrayList.add(new C34802d());
        }
        this.f84410a = (C34792q[]) arrayList.toArray(f84409b);
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        C34792q[] qVarArr = this.f84410a;
        int i2 = 0;
        while (i2 < qVarArr.length) {
            try {
                return qVarArr[i2].mo102904b(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.m141229a();
    }

    public void reset() {
        for (C34792q reset : this.f84410a) {
            reset.reset();
        }
    }
}
