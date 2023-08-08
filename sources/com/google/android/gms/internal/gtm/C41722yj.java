package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.yj */
public final class C41722yj<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    public final Iterator<Map.Entry<K, Object>> f105310a;

    public C41722yj(Iterator<Map.Entry<K, Object>> it) {
        this.f105310a = it;
    }

    public final boolean hasNext() {
        return this.f105310a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f105310a.next();
        if (next.getValue() instanceof C41746zj) {
            return new C41698xj(next, (C41674wj) null);
        }
        return next;
    }

    public final void remove() {
        this.f105310a.remove();
    }
}
