package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xr */
public abstract class C29901xr<E> extends C29384js<E> {

    /* renamed from: a */
    public final int f71532a;

    /* renamed from: b */
    public int f71533b;

    public C29901xr(int i, int i2) {
        C29679rr.m120994b(i2, i, "index");
        this.f71532a = i;
        this.f71533b = i2;
    }

    /* renamed from: b */
    public abstract E mo84560b(int i);

    public final boolean hasNext() {
        return this.f71533b < this.f71532a;
    }

    public final boolean hasPrevious() {
        return this.f71533b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f71533b;
            this.f71533b = i + 1;
            return mo84560b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f71533b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f71533b - 1;
            this.f71533b = i;
            return mo84560b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f71533b - 1;
    }
}
