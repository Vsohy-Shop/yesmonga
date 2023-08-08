package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.gs */
public abstract class C29274gs<F, T> implements Iterator<T> {

    /* renamed from: a */
    public final Iterator<? extends F> f71266a;

    public C29274gs(Iterator<? extends F> it) {
        it.getClass();
        this.f71266a = it;
    }

    /* renamed from: b */
    public abstract T mo84587b(F f);

    public final boolean hasNext() {
        return this.f71266a.hasNext();
    }

    public final T next() {
        return mo84587b(this.f71266a.next());
    }

    public final void remove() {
        this.f71266a.remove();
    }
}
