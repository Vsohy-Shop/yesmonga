package com.google.android.gms.internal.gtm;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.tl */
public final class C41604tl extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ C41652vl f105023a;

    public /* synthetic */ C41604tl(C41652vl vlVar, C41580sl slVar) {
        this.f105023a = vlVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f105023a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f105023a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f105023a.get(entry.getKey());
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
        return new C41556rl(this.f105023a, (C41532ql) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f105023a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f105023a.size();
    }
}
