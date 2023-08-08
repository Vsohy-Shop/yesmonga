package com.journeyapps.barcodescanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34753f;
import com.google.zxing.DecodeHintType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.journeyapps.barcodescanner.o */
public class C34952o implements C34947l {

    /* renamed from: a */
    public Collection<BarcodeFormat> f85033a;

    /* renamed from: b */
    public Map<DecodeHintType, ?> f85034b;

    /* renamed from: c */
    public String f85035c;

    /* renamed from: d */
    public int f85036d;

    public C34952o() {
    }

    /* renamed from: a */
    public C34946k mo103529a(Map<DecodeHintType, ?> map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map<DecodeHintType, ?> map2 = this.f85034b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<BarcodeFormat> collection = this.f85033a;
        if (collection != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        }
        String str = this.f85035c;
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        C34753f fVar = new C34753f();
        fVar.mo102838e(enumMap);
        int i = this.f85036d;
        if (i == 0) {
            return new C34946k(fVar);
        }
        if (i == 1) {
            return new C34953p(fVar);
        }
        if (i != 2) {
            return new C34946k(fVar);
        }
        return new C34954q(fVar);
    }

    public C34952o(Collection<BarcodeFormat> collection) {
        this.f85033a = collection;
    }

    public C34952o(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, int i) {
        this.f85033a = collection;
        this.f85034b = map;
        this.f85035c = str;
        this.f85036d = i;
    }
}
