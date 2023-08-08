package com.google.zxing;

import com.google.zxing.aztec.C34631b;
import com.google.zxing.datamatrix.C34728a;
import com.google.zxing.maxicode.C34764a;
import com.google.zxing.oned.C34790o;
import com.google.zxing.pdf417.C34831b;
import com.google.zxing.qrcode.C34856a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.f */
public final class C34753f implements C34760j {

    /* renamed from: c */
    public static final C34760j[] f84224c = new C34760j[0];

    /* renamed from: a */
    public Map<DecodeHintType, ?> f84225a;

    /* renamed from: b */
    public C34760j[] f84226b;

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        mo102838e(map);
        return mo102836b(bVar);
    }

    /* renamed from: b */
    public final C34761k mo102836b(C34644b bVar) throws NotFoundException {
        C34760j[] jVarArr = this.f84226b;
        if (jVarArr != null) {
            int length = jVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return jVarArr[i].mo102419a(bVar, this.f84225a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException {
        mo102838e((Map<DecodeHintType, ?>) null);
        return mo102836b(bVar);
    }

    /* renamed from: d */
    public C34761k mo102837d(C34644b bVar) throws NotFoundException {
        if (this.f84226b == null) {
            mo102838e((Map<DecodeHintType, ?>) null);
        }
        return mo102836b(bVar);
    }

    /* renamed from: e */
    public void mo102838e(Map<DecodeHintType, ?> map) {
        boolean z;
        Collection collection;
        this.f84225a = map;
        boolean z2 = true;
        if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new C34790o(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new C34856a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new C34728a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new C34631b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new C34831b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new C34764a());
            }
            if (z2 && z) {
                arrayList.add(new C34790o(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C34790o(map));
            }
            arrayList.add(new C34856a());
            arrayList.add(new C34728a());
            arrayList.add(new C34631b());
            arrayList.add(new C34831b());
            arrayList.add(new C34764a());
            if (z) {
                arrayList.add(new C34790o(map));
            }
        }
        this.f84226b = (C34760j[]) arrayList.toArray(f84224c);
    }

    public void reset() {
        C34760j[] jVarArr = this.f84226b;
        if (jVarArr != null) {
            for (C34760j reset : jVarArr) {
                reset.reset();
            }
        }
    }
}
