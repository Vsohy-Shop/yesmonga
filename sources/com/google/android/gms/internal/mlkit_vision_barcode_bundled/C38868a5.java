package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a5 */
public final class C38868a5 extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ C38888c5 f98806a;

    public /* synthetic */ C38868a5(C38888c5 c5Var, C39104z4 z4Var) {
        this.f98806a = c5Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f98806a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f98806a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f98806a.get(entry.getKey());
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
        return new C39095y4(this.f98806a, (C39086x4) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f98806a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f98806a.size();
    }
}
