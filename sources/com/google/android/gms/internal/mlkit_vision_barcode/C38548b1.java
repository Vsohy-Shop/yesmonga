package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.b1 */
public final class C38548b1<K, V> extends AbstractCollection<V> {

    /* renamed from: a */
    public final Map<K, V> f97707a;

    public C38548b1(Map<K, V> map) {
        this.f97707a = map;
    }

    public final void clear() {
        this.f97707a.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f97707a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f97707a.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new C38839y0(this.f97707a.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f97707a.entrySet()) {
                if (C38676l.m160047a(obj, next.getValue())) {
                    this.f97707a.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f97707a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f97707a.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f97707a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f97707a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f97707a.size();
    }
}
