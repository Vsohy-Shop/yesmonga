package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.x0 */
public abstract class C30262x0<F, T> implements Iterator<T> {

    /* renamed from: a */
    public final Iterator<? extends F> f72316a;

    public C30262x0(Iterator<? extends F> it) {
        it.getClass();
        this.f72316a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo85148b(F f);

    public final boolean hasNext() {
        return this.f72316a.hasNext();
    }

    public final T next() {
        return mo85148b(this.f72316a.next());
    }

    public final void remove() {
        this.f72316a.remove();
    }
}
