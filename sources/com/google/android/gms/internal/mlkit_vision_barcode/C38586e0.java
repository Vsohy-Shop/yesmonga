package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.e0 */
public abstract class C38586e0<K, V> implements C38587e1<K, V> {
    @CheckForNull

    /* renamed from: a */
    public transient Set<K> f97796a;
    @CheckForNull

    /* renamed from: b */
    public transient Map<K, Collection<V>> f97797b;

    /* renamed from: a */
    public boolean mo122292a(K k, V v) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo122293c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo122294d();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C38587e1)) {
            return false;
        }
        return mo122297s().equals(((C38587e1) obj).mo122297s());
    }

    public final int hashCode() {
        return mo122297s().hashCode();
    }

    /* renamed from: s */
    public final Map<K, Collection<V>> mo122297s() {
        Map<K, Collection<V>> map = this.f97797b;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo122293c();
        this.f97797b = c;
        return c;
    }

    public final String toString() {
        return ((C38790u) mo122297s()).f98186d.toString();
    }

    /* renamed from: u */
    public final Set<K> mo122299u() {
        Set<K> set = this.f97796a;
        if (set != null) {
            return set;
        }
        Set<K> d = mo122294d();
        this.f97796a = d;
        return d;
    }
}
