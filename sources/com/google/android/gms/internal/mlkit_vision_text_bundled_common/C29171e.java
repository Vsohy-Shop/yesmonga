package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.e */
public final class C29171e extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ C29245g f71218a;

    public /* synthetic */ C29171e(C29245g gVar, C29134d dVar) {
        this.f71218a = gVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f71218a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f71218a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f71218a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(value)) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new C29097c(this.f71218a, (r10) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f71218a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f71218a.size();
    }
}
