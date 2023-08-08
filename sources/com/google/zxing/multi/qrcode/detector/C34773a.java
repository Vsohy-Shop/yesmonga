package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.C34763m;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34717f;
import com.google.zxing.qrcode.detector.C34879c;
import com.google.zxing.qrcode.detector.C34881e;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.multi.qrcode.detector.a */
public final class C34773a extends C34879c {

    /* renamed from: c */
    public static final C34717f[] f84321c = new C34717f[0];

    public C34773a(C34710b bVar) {
        super(bVar);
    }

    /* renamed from: n */
    public C34717f[] mo102902n(Map<DecodeHintType, ?> map) throws NotFoundException {
        C34763m mVar;
        C34710b h = mo103220h();
        if (map == null) {
            mVar = null;
        } else {
            mVar = (C34763m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        C34881e[] s = new MultiFinderPatternFinder(h, mVar).mo102898s(map);
        if (s.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C34881e j : s) {
                try {
                    arrayList.add(mo103222j(j));
                } catch (ReaderException unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return f84321c;
            }
            return (C34717f[]) arrayList.toArray(f84321c);
        }
        throw NotFoundException.m141229a();
    }
}
