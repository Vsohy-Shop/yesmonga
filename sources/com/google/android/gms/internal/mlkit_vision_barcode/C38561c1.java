package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.c1 */
public abstract class C38561c1<K, V> extends AbstractMap<K, V> {
    @CheckForNull

    /* renamed from: a */
    public transient Set<Map.Entry<K, V>> f97744a;
    @CheckForNull

    /* renamed from: b */
    public transient Set<K> f97745b;
    @CheckForNull

    /* renamed from: c */
    public transient Collection<V> f97746c;

    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo122257a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f97744a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo122257a();
        this.f97744a = a;
        return a;
    }

    public Set<K> keySet() {
        Set<K> set = this.f97745b;
        if (set != null) {
            return set;
        }
        C38535a1 a1Var = new C38535a1(this);
        this.f97745b = a1Var;
        return a1Var;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f97746c;
        if (collection != null) {
            return collection;
        }
        C38548b1 b1Var = new C38548b1(this);
        this.f97746c = b1Var;
        return b1Var;
    }
}
