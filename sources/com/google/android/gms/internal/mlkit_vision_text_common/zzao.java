package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class zzao<K, V> extends C30165p<K, V> implements Serializable {

    /* renamed from: c */
    public transient Map<K, Collection<V>> f72391c;

    /* renamed from: d */
    public transient int f72392d;

    public zzao(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f72391c = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m121951l(zzao zzao, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = zzao.f72391c;
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
            zzao.f72392d -= size;
        }
    }

    /* renamed from: a */
    public final boolean mo85280a(K k, V v) {
        Collection collection = this.f72391c.get(k);
        if (collection == null) {
            Collection e = mo85416e();
            if (e.add(v)) {
                this.f72392d++;
                this.f72391c.put(k, e);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f72392d++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> mo85281c() {
        return new C30057g(this, this.f72391c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<K> mo85282d() {
        return new C30081i(this, this.f72391c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Collection<V> mo85416e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Collection<V> mo85417f(K k, Collection<V> collection) {
        throw null;
    }

    /* renamed from: h */
    public final Collection<V> mo85418h(K k) {
        Collection collection = this.f72391c.get(k);
        if (collection == null) {
            collection = mo85416e();
        }
        return mo85417f(k, collection);
    }

    /* renamed from: i */
    public final List<V> mo85419i(K k, List<V> list, @CheckForNull C30117l lVar) {
        if (list instanceof RandomAccess) {
            return new C30093j(this, k, list, lVar);
        }
        return new C30141n(this, k, list, lVar);
    }

    /* renamed from: m */
    public final void mo85420m() {
        for (Collection<V> clear : this.f72391c.values()) {
            clear.clear();
        }
        this.f72391c.clear();
        this.f72392d = 0;
    }
}
