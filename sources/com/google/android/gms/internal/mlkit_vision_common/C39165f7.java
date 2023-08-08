package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.f7 */
public class C39165f7<E> extends C39282s7<E> {

    /* renamed from: a */
    public Object[] f100024a = new Object[4];

    /* renamed from: b */
    public int f100025b = 0;

    /* renamed from: c */
    public boolean f100026c;

    public C39165f7(int i) {
    }

    /* renamed from: a */
    public final C39165f7<E> mo123266a(E e) {
        e.getClass();
        mo123267b(this.f100025b + 1);
        Object[] objArr = this.f100024a;
        int i = this.f100025b;
        this.f100025b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* renamed from: b */
    public final void mo123267b(int i) {
        Object[] objArr = this.f100024a;
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
            this.f100024a = Arrays.copyOf(objArr, i2);
            this.f100026c = false;
        } else if (this.f100026c) {
            this.f100024a = (Object[]) objArr.clone();
            this.f100026c = false;
        }
    }
}
