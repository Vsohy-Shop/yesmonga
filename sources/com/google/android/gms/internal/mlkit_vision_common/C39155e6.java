package com.google.android.gms.internal.mlkit_vision_common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.e6 */
public abstract class C39155e6<E> extends C39318w7<E> {

    /* renamed from: a */
    public final int f100001a;

    /* renamed from: b */
    public int f100002b;

    public C39155e6(int i, int i2) {
        C39162f4.m161214b(i2, i, "index");
        this.f100001a = i;
        this.f100002b = i2;
    }

    /* renamed from: b */
    public abstract E mo123259b(int i);

    public final boolean hasNext() {
        return this.f100002b < this.f100001a;
    }

    public final boolean hasPrevious() {
        return this.f100002b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f100002b;
            this.f100002b = i + 1;
            return mo123259b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f100002b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f100002b - 1;
            this.f100002b = i;
            return mo123259b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f100002b - 1;
    }
}
