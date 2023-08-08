package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.p0 */
public final class C30166p0<K, V> extends AbstractCollection<V> {

    /* renamed from: a */
    public final Map<K, V> f72078a;

    public C30166p0(Map<K, V> map) {
        this.f72078a = map;
    }

    public final void clear() {
        this.f72078a.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f72078a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f72078a.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new C30130m0(this.f72078a.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f72078a.entrySet()) {
                if (C30272xa.m121934a(obj, next.getValue())) {
                    this.f72078a.remove(next.getKey());
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
            for (Map.Entry next : this.f72078a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f72078a.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f72078a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f72078a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f72078a.size();
    }
}
