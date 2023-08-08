package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.c0 */
public class C30010c0<E> extends C30022d0<E> {

    /* renamed from: a */
    public Object[] f71759a = new Object[4];

    /* renamed from: b */
    public int f71760b = 0;

    /* renamed from: c */
    public boolean f71761c;

    public C30010c0(int i) {
    }

    /* renamed from: a */
    public final C30010c0<E> mo85043a(E e) {
        e.getClass();
        mo85044b(this.f71760b + 1);
        Object[] objArr = this.f71759a;
        int i = this.f71760b;
        this.f71760b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* renamed from: b */
    public final void mo85044b(int i) {
        Object[] objArr = this.f71759a;
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
            this.f71759a = Arrays.copyOf(objArr, i2);
            this.f71761c = false;
        } else if (this.f71761c) {
            this.f71759a = (Object[]) objArr.clone();
            this.f71761c = false;
        }
    }
}
