package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_common.i */
public class C42391i<E> extends C42402j<E> {

    /* renamed from: a */
    public Object[] f107096a = new Object[4];

    /* renamed from: b */
    public int f107097b = 0;

    /* renamed from: c */
    public boolean f107098c;

    public C42391i(int i) {
    }

    /* renamed from: a */
    public final C42391i<E> mo137709a(E e) {
        e.getClass();
        mo137710b(this.f107097b + 1);
        Object[] objArr = this.f107096a;
        int i = this.f107097b;
        this.f107097b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* renamed from: b */
    public final void mo137710b(int i) {
        Object[] objArr = this.f107096a;
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
            this.f107096a = Arrays.copyOf(objArr, i2);
            this.f107098c = false;
        } else if (this.f107098c) {
            this.f107096a = (Object[]) objArr.clone();
            this.f107098c = false;
        }
    }
}
