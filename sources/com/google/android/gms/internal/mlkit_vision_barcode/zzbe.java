package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class zzbe<K, V> extends C38586e0<K, V> implements Serializable {

    /* renamed from: c */
    public transient Map<K, Collection<V>> f98382c;

    /* renamed from: d */
    public transient int f98383d;

    public zzbe(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f98382c = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m160245l(zzbe zzbe, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = zzbe.f98382c;
        map.getClass();
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            zzbe.f98383d -= size;
        }
    }

    /* renamed from: a */
    public final boolean mo122292a(K k, V v) {
        Collection collection = this.f98382c.get(k);
        if (collection == null) {
            Collection e = mo122598e();
            if (e.add(v)) {
                this.f98383d++;
                this.f98382c.put(k, e);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f98383d++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> mo122293c() {
        return new C38790u(this, this.f98382c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<K> mo122294d() {
        return new C38814w(this, this.f98382c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Collection<V> mo122598e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<V> mo122599f(K k, Collection<V> collection) {
        throw null;
    }

    /* renamed from: h */
    public final Collection<V> mo122600h(K k) {
        Collection collection = this.f98382c.get(k);
        if (collection == null) {
            collection = mo122598e();
        }
        return mo122599f(k, collection);
    }

    /* renamed from: i */
    public final List<V> mo122601i(K k, List<V> list, @CheckForNull C38534a0 a0Var) {
        if (list instanceof RandomAccess) {
            return new C38826x(this, k, list, a0Var);
        }
        return new C38560c0(this, k, list, a0Var);
    }

    /* renamed from: m */
    public final void mo122602m() {
        for (Collection<V> clear : this.f98382c.values()) {
            clear.clear();
        }
        this.f98382c.clear();
        this.f98383d = 0;
    }
}
