package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.common.e */
public final class C34716e extends C34719h {
    /* renamed from: c */
    public C34710b mo102705c(C34710b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        C34710b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo102706d(bVar, i, i2, C34721j.m141661b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C34710b mo102706d(C34710b bVar, int i, int i2, C34721j jVar) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.m141229a();
        }
        C34710b bVar2 = new C34710b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            jVar.mo102712f(fArr);
            C34719h.m141650a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo102666h((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo102677v(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.m141229a();
                }
            }
        }
        return bVar2;
    }
}
