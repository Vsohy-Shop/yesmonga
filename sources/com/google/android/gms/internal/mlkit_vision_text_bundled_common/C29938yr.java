package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.yr */
public class C29938yr<E> extends C29975zr<E> {

    /* renamed from: a */
    public Object[] f71557a = new Object[4];

    /* renamed from: b */
    public int f71558b = 0;

    /* renamed from: c */
    public boolean f71559c;

    public C29938yr(int i) {
    }

    /* renamed from: a */
    public final C29938yr<E> mo84915a(E e) {
        e.getClass();
        mo84916b(this.f71558b + 1);
        Object[] objArr = this.f71557a;
        int i = this.f71558b;
        this.f71558b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* renamed from: b */
    public final void mo84916b(int i) {
        Object[] objArr = this.f71557a;
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
            this.f71557a = Arrays.copyOf(objArr, i2);
            this.f71559c = false;
        } else if (this.f71559c) {
            this.f71557a = (Object[]) objArr.clone();
            this.f71559c = false;
        }
    }
}
