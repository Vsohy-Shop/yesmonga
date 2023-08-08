package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.fr */
public abstract class C29236fr<T> implements Iterator<T> {
    @CheckForNull

    /* renamed from: a */
    public T f71244a;

    /* renamed from: b */
    public int f71245b = 2;

    @CheckForNull
    /* renamed from: b */
    public abstract T mo84607b();

    @CheckForNull
    /* renamed from: c */
    public final T mo84608c() {
        this.f71245b = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f71245b;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f71245b = 4;
                    this.f71244a = mo84607b();
                    if (this.f71245b != 3) {
                        this.f71245b = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f71245b = 2;
            T t = this.f71244a;
            this.f71244a = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
