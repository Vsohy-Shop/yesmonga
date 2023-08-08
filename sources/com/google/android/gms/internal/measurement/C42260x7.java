package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
public final class C42260x7 extends C42226v7 {
    public C42260x7() {
        super(4);
    }

    /* renamed from: a */
    public final C42260x7 mo137453a(Object... objArr) {
        C41876b8.m169712b(objArr, 15);
        int i = this.f106464b + 15;
        Object[] objArr2 = this.f106463a;
        int length = objArr2.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f106463a = Arrays.copyOf(objArr2, i2);
            this.f106465c = false;
        } else if (this.f106465c) {
            this.f106463a = (Object[]) objArr2.clone();
            this.f106465c = false;
        }
        System.arraycopy(objArr, 0, this.f106463a, this.f106464b, 15);
        this.f106464b += 15;
        return this;
    }

    /* renamed from: b */
    public final zzja mo137454b() {
        this.f106465c = true;
        return zzja.m171321w(this.f106463a, this.f106464b);
    }
}
