package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
public abstract class C42192t7 extends C41912d8 {

    /* renamed from: a */
    public final int f106425a;

    /* renamed from: b */
    public int f106426b;

    public C42192t7(int i, int i2) {
        C42090n7.m170598b(i2, i, "index");
        this.f106425a = i;
        this.f106426b = i2;
    }

    /* renamed from: b */
    public abstract Object mo137306b(int i);

    public final boolean hasNext() {
        return this.f106426b < this.f106425a;
    }

    public final boolean hasPrevious() {
        return this.f106426b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f106426b;
            this.f106426b = i + 1;
            return mo137306b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f106426b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f106426b - 1;
            this.f106426b = i;
            return mo137306b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f106426b - 1;
    }
}
