package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.i1 */
public abstract class C38639i1<F, T> implements Iterator<T> {

    /* renamed from: a */
    public final Iterator<? extends F> f97915a;

    public C38639i1(Iterator<? extends F> it) {
        it.getClass();
        this.f97915a = it;
    }

    /* renamed from: b */
    public abstract T mo122363b(F f);

    public final boolean hasNext() {
        return this.f97915a.hasNext();
    }

    public final T next() {
        return mo122363b(this.f97915a.next());
    }

    public final void remove() {
        this.f97915a.remove();
    }
}
