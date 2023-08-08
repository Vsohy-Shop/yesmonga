package com.google.zxing.oned;

import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34709a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.q */
public abstract class C34792q implements C34760j {
    /* renamed from: e */
    public static float m142035e(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i;
        float f4 = f3 / ((float) i2);
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f7 = ((float) iArr2[i4]) * f4;
            float f8 = (float) i5;
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    /* renamed from: f */
    public static void m142036f(C34709a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int o = aVar.mo102649o();
        if (i < o) {
            boolean z = !aVar.mo102645k(i);
            while (i < o) {
                if (aVar.mo102645k(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != o) {
                throw NotFoundException.m141229a();
            }
            return;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: g */
    public static void m142037g(C34709a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean k = aVar.mo102645k(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo102645k(i) != k) {
                length--;
                k = !k;
            }
        }
        if (length < 0) {
            m142036f(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        try {
            return mo102919d(bVar, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !bVar.mo102483g()) {
                throw e;
            }
            C34644b h = bVar.mo102484h();
            C34761k d = mo102919d(h, map);
            Map<ResultMetadataType, Object> e2 = d.mo102876e();
            int i = 270;
            if (e2 != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (e2.containsKey(resultMetadataType)) {
                    i = (((Integer) e2.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            d.mo102881j(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
            C34762l[] f = d.mo102877f();
            if (f != null) {
                int d2 = h.mo102480d();
                for (int i2 = 0; i2 < f.length; i2++) {
                    f[i2] = new C34762l((((float) d2) - f[i2].mo102884d()) - 1.0f, f[i2].mo102883c());
                }
            }
            return d;
        }
    }

    /* renamed from: b */
    public abstract C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, FormatException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[Catch:{ ReaderException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cb A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.zxing.C34761k mo102919d(com.google.zxing.C34644b r22, java.util.Map<com.google.zxing.DecodeHintType, ?> r23) throws com.google.zxing.NotFoundException {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo102481e()
            int r2 = r22.mo102480d()
            com.google.zxing.common.a r3 = new com.google.zxing.common.a
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            com.google.zxing.DecodeHintType r6 = com.google.zxing.DecodeHintType.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = r5
            goto L_0x001e
        L_0x001d:
            r6 = r4
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = r4
        L_0x0033:
            if (r9 >= r6) goto L_0x00e7
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = r5
            goto L_0x0040
        L_0x003f:
            r9 = r4
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e7
            if (r11 >= r2) goto L_0x00e7
            r9 = r22
            com.google.zxing.common.a r3 = r9.mo102479c(r11, r3)     // Catch:{ NotFoundException -> 0x00db }
            r12 = r4
        L_0x0051:
            r13 = 2
            if (r12 >= r13) goto L_0x00db
            if (r12 != r5) goto L_0x0074
            r3.mo102653v()
            if (r0 == 0) goto L_0x0074
            com.google.zxing.DecodeHintType r13 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0074
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<com.google.zxing.DecodeHintType> r15 = com.google.zxing.DecodeHintType.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0076
        L_0x0074:
            r13 = r21
        L_0x0076:
            com.google.zxing.k r14 = r13.mo102904b(r11, r3, r0)     // Catch:{ ReaderException -> 0x00cc }
            if (r12 != r5) goto L_0x00cb
            com.google.zxing.ResultMetadataType r15 = com.google.zxing.ResultMetadataType.ORIENTATION     // Catch:{ ReaderException -> 0x00cc }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ ReaderException -> 0x00c5 }
            r14.mo102881j(r15, r5)     // Catch:{ ReaderException -> 0x00c5 }
            com.google.zxing.l[] r5 = r14.mo102877f()     // Catch:{ ReaderException -> 0x00c5 }
            if (r5 == 0) goto L_0x00cb
            com.google.zxing.l r15 = new com.google.zxing.l     // Catch:{ ReaderException -> 0x00c5 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ ReaderException -> 0x00c7 }
            float r18 = r18.mo102883c()     // Catch:{ ReaderException -> 0x00c7 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ ReaderException -> 0x00c9 }
            float r4 = r18.mo102884d()     // Catch:{ ReaderException -> 0x00c9 }
            r15.<init>(r1, r4)     // Catch:{ ReaderException -> 0x00c9 }
            r1 = 0
            r5[r1] = r15     // Catch:{ ReaderException -> 0x00c9 }
            com.google.zxing.l r4 = new com.google.zxing.l     // Catch:{ ReaderException -> 0x00c9 }
            r15 = 1
            r17 = r5[r15]     // Catch:{ ReaderException -> 0x00d1 }
            float r17 = r17.mo102883c()     // Catch:{ ReaderException -> 0x00d1 }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ ReaderException -> 0x00d1 }
            float r1 = r17.mo102884d()     // Catch:{ ReaderException -> 0x00d1 }
            r4.<init>(r0, r1)     // Catch:{ ReaderException -> 0x00d1 }
            r5[r15] = r4     // Catch:{ ReaderException -> 0x00d1 }
            goto L_0x00cb
        L_0x00c5:
            r16 = r0
        L_0x00c7:
            r20 = r1
        L_0x00c9:
            r15 = 1
            goto L_0x00d1
        L_0x00cb:
            return r14
        L_0x00cc:
            r16 = r0
            r20 = r1
            r15 = r5
        L_0x00d1:
            int r12 = r12 + 1
            r5 = r15
            r0 = r16
            r1 = r20
            r4 = 0
            goto L_0x0051
        L_0x00db:
            r13 = r21
            r20 = r1
            r15 = r5
            r9 = r10
            r5 = r15
            r1 = r20
            r4 = 0
            goto L_0x0033
        L_0x00e7:
            r13 = r21
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.m141229a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C34792q.mo102919d(com.google.zxing.b, java.util.Map):com.google.zxing.k");
    }

    public void reset() {
    }
}
