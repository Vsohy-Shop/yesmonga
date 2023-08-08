package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.firebase.perf.metrics.g */
public class C33378g {

    /* renamed from: com.google.firebase.perf.metrics.g$a */
    public static class C33379a {

        /* renamed from: a */
        public int f81105a;

        /* renamed from: b */
        public int f81106b;

        /* renamed from: c */
        public int f81107c;

        public C33379a(int i, int i2, int i3) {
            this.f81105a = i;
            this.f81106b = i2;
            this.f81107c = i3;
        }

        /* renamed from: a */
        public C33379a mo96520a(C33379a aVar) {
            return new C33379a(this.f81105a - aVar.mo96523d(), this.f81106b - aVar.mo96522c(), this.f81107c - aVar.mo96521b());
        }

        /* renamed from: b */
        public int mo96521b() {
            return this.f81107c;
        }

        /* renamed from: c */
        public int mo96522c() {
            return this.f81106b;
        }

        /* renamed from: d */
        public int mo96523d() {
            return this.f81105a;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C33379a m134530a(@C0363p0 SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i2 = 0;
            i = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            i = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i += valueAt;
                }
                if (keyAt > 16) {
                    i2 += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C33379a(i3, i2, i);
    }
}
