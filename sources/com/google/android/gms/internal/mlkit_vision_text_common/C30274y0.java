package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.y0 */
public abstract class C30274y0<F, T> extends C30262x0<F, T> implements ListIterator<T> {
    public C30274y0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f72316a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f72316a).nextIndex();
    }

    public final T previous() {
        return mo85148b(((ListIterator) this.f72316a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f72316a).previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
