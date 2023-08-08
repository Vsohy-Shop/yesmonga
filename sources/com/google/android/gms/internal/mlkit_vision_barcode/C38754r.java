package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.r */
public abstract class C38754r<E> extends C38665k1<E> {

    /* renamed from: a */
    public final int f98128a;

    /* renamed from: b */
    public int f98129b;

    public C38754r(int i, int i2) {
        C38728p.m160095b(i2, i, "index");
        this.f98128a = i;
        this.f98129b = i2;
    }

    /* renamed from: b */
    public abstract E mo122483b(int i);

    public final boolean hasNext() {
        return this.f98129b < this.f98128a;
    }

    public final boolean hasPrevious() {
        return this.f98129b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f98129b;
            this.f98129b = i + 1;
            return mo122483b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f98129b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f98129b - 1;
            this.f98129b = i;
            return mo122483b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f98129b - 1;
    }
}
