package com.contentsquare.android.sdk;

import android.util.SparseIntArray;

/* renamed from: com.contentsquare.android.sdk.f1 */
public class C14317f1 {

    /* renamed from: a */
    public final SparseIntArray f35347a = new SparseIntArray();

    /* renamed from: b */
    public int f35348b;

    /* renamed from: c */
    public float f35349c = 0.0f;

    /* renamed from: b */
    public static void m61536b(SparseIntArray sparseIntArray, int i) {
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    /* renamed from: a */
    public int mo35102a() {
        return this.f35348b;
    }

    /* renamed from: c */
    public void mo35103c(int[] iArr) {
        this.f35347a.clear();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        for (int i6 : iArr) {
            int i7 = i6 >>> 24;
            i3 += ((i6 >> 16) & 255) * i7;
            i2 += ((i6 >> 8) & 255) * i7;
            i += (i6 & 255) * i7;
            i5 += i7;
            i4 += i7;
            if (i7 == 0) {
                f += 1.0f;
            }
            if (i7 == 255) {
                m61536b(this.f35347a, i6);
            }
        }
        int max = Math.max(i4, 1);
        int max2 = Math.max(iArr.length, 1);
        this.f35348b = ((i5 / max2) << 24) | ((i3 / max) << 16) | ((i2 / max) << 8) | (i / max);
        this.f35349c = f / ((float) max2);
    }

    /* renamed from: d */
    public float mo35104d() {
        return this.f35349c;
    }

    /* renamed from: e */
    public final SparseIntArray mo35105e() {
        return this.f35347a;
    }
}
