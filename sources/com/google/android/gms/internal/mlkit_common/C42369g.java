package com.google.android.gms.internal.mlkit_common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_common.g */
public abstract class C42369g<E> extends C42457o<E> {

    /* renamed from: a */
    public final int f107040a;

    /* renamed from: b */
    public int f107041b;

    public C42369g(int i, int i2) {
        C42347e.m171460b(i2, i, "index");
        this.f107040a = i;
        this.f107041b = i2;
    }

    /* renamed from: b */
    public abstract E mo137682b(int i);

    public final boolean hasNext() {
        return this.f107041b < this.f107040a;
    }

    public final boolean hasPrevious() {
        return this.f107041b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f107041b;
            this.f107041b = i + 1;
            return mo137682b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f107041b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f107041b - 1;
            this.f107041b = i;
            return mo137682b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f107041b - 1;
    }
}
