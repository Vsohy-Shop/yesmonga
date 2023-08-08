package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

public final class a00<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    public final Iterator<Map.Entry<K, Object>> f71123a;

    public a00(Iterator<Map.Entry<K, Object>> it) {
        this.f71123a = it;
    }

    public final boolean hasNext() {
        return this.f71123a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f71123a.next();
        if (next.getValue() instanceof b00) {
            return new C29983zz(next, (C29946yz) null);
        }
        return next;
    }

    public final void remove() {
        this.f71123a.remove();
    }
}
