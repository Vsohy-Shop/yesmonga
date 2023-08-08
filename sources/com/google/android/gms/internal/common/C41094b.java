package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.common.b */
public class C41094b extends C41096c {

    /* renamed from: a */
    public Object[] f104383a = new Object[4];

    /* renamed from: b */
    public int f104384b = 0;

    /* renamed from: c */
    public boolean f104385c;

    public C41094b(int i) {
    }

    @C32488a
    /* renamed from: a */
    public final C41094b mo134910a(Object obj) {
        obj.getClass();
        mo134911b(this.f104384b + 1);
        Object[] objArr = this.f104383a;
        int i = this.f104384b;
        this.f104384b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: b */
    public final void mo134911b(int i) {
        Object[] objArr = this.f104383a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f104383a = Arrays.copyOf(objArr, i2);
            this.f104385c = false;
        } else if (this.f104385c) {
            this.f104383a = (Object[]) objArr.clone();
            this.f104385c = false;
        }
    }
}
