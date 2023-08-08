package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.hs */
public abstract class C29311hs<F, T> extends C29274gs<F, T> implements ListIterator<T> {
    public C29311hs(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.ListIterator, java.util.Iterator<? extends F>] */
    public final boolean hasPrevious() {
        return this.f71266a.hasPrevious();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.ListIterator, java.util.Iterator<? extends F>] */
    public final int nextIndex() {
        return this.f71266a.nextIndex();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.ListIterator, java.util.Iterator<? extends F>] */
    public final T previous() {
        return mo84587b(this.f71266a.previous());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.ListIterator, java.util.Iterator<? extends F>] */
    public final int previousIndex() {
        return this.f71266a.previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
