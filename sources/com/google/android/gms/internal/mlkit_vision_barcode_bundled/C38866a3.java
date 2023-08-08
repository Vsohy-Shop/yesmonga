package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3 */
public final class C38866a3<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    public final Iterator<Map.Entry<K, Object>> f98801a;

    public C38866a3(Iterator<Map.Entry<K, Object>> it) {
        this.f98801a = it;
    }

    public final boolean hasNext() {
        return this.f98801a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f98801a.next();
        if (next.getValue() instanceof C38876b3) {
            return new C39102z2(next, (C39093y2) null);
        }
        return next;
    }

    public final void remove() {
        this.f98801a.remove();
    }
}
