package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.location.m0 */
public abstract class C41786m0<E> extends C41792p0<E> {

    /* renamed from: a */
    public final int f105909a;

    /* renamed from: b */
    public int f105910b;

    public C41786m0(int i, int i2) {
        C41780k0.m169055b(i2, i, "index");
        this.f105909a = i;
        this.f105910b = i2;
    }

    /* renamed from: b */
    public abstract E mo136214b(int i);

    public final boolean hasNext() {
        return this.f105910b < this.f105909a;
    }

    public final boolean hasPrevious() {
        return this.f105910b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f105910b;
            this.f105910b = i + 1;
            return mo136214b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f105910b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f105910b - 1;
            this.f105910b = i;
            return mo136214b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f105910b - 1;
    }
}
