package com.contentsquare.android.sdk;

import java.util.Arrays;

/* renamed from: com.contentsquare.android.sdk.h */
public final class C14384h<K, V> {

    /* renamed from: b */
    public static final Object[] f35574b = new Object[0];

    /* renamed from: a */
    public Object[] f35575a = f35574b;

    /* renamed from: a */
    public synchronized boolean mo35408a(K k) {
        boolean z;
        int i = 0;
        z = false;
        while (true) {
            K[] kArr = this.f35575a;
            if (i < kArr.length) {
                if (kArr[i] == k) {
                    kArr[i] = null;
                    kArr[i + 1] = null;
                    z = true;
                }
                i += 2;
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized boolean mo35409b(K k, V v) {
        boolean z;
        z = false;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            V[] vArr = this.f35575a;
            if (i2 < vArr.length) {
                V v2 = vArr[i2];
                if (v2 == null) {
                    i = i2;
                }
                if (v2 == k) {
                    i3++;
                    if (vArr[i2 + 1] == v) {
                        i = i2;
                        z2 = true;
                    }
                }
                i2 += 2;
            } else {
                if (i == -1) {
                    i = vArr.length;
                    int i4 = 2;
                    if (i >= 2) {
                        i4 = i * 2;
                    }
                    this.f35575a = Arrays.copyOf(vArr, i4);
                }
                if (!z2) {
                    Object[] objArr = this.f35575a;
                    objArr[i] = k;
                    objArr[i + 1] = v;
                }
                if (i3 == 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public synchronized void mo35410c(K k, V v) {
        int i = 0;
        while (true) {
            V[] vArr = this.f35575a;
            if (i < vArr.length) {
                if (vArr[i] == k) {
                    int i2 = i + 1;
                    if (vArr[i2] == v) {
                        vArr[i] = null;
                        vArr[i2] = null;
                    }
                }
                i += 2;
            }
        }
    }
}
