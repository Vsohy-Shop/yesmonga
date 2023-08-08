package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.d */
public abstract class C30021d<E> extends C29986a1<E> {

    /* renamed from: a */
    public final int f71778a;

    /* renamed from: b */
    public int f71779b;

    public C30021d(int i, int i2) {
        C29997b.m121588b(i2, i, "index");
        this.f71778a = i;
        this.f71779b = i2;
    }

    /* renamed from: b */
    public abstract E mo85050b(int i);

    public final boolean hasNext() {
        return this.f71779b < this.f71778a;
    }

    public final boolean hasPrevious() {
        return this.f71779b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f71779b;
            this.f71779b = i + 1;
            return mo85050b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f71779b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f71779b - 1;
            this.f71779b = i;
            return mo85050b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f71779b - 1;
    }
}
