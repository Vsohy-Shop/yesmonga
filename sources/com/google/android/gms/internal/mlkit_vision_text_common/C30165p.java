package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.p */
public abstract class C30165p<K, V> implements C30214t0<K, V> {
    @CheckForNull

    /* renamed from: a */
    public transient Set<K> f72076a;
    @CheckForNull

    /* renamed from: b */
    public transient Map<K, Collection<V>> f72077b;

    /* renamed from: a */
    public boolean mo85280a(K k, V v) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo85281c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo85282d();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30214t0)) {
            return false;
        }
        return mo85285s().equals(((C30214t0) obj).mo85285s());
    }

    public final int hashCode() {
        return mo85285s().hashCode();
    }

    /* renamed from: s */
    public final Map<K, Collection<V>> mo85285s() {
        Map<K, Collection<V>> map = this.f72077b;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo85281c();
        this.f72077b = c;
        return c;
    }

    public final String toString() {
        return ((C30057g) mo85285s()).f71868d.toString();
    }

    /* renamed from: u */
    public final Set<K> mo85287u() {
        Set<K> set = this.f72076a;
        if (set != null) {
            return set;
        }
        Set<K> d = mo85282d();
        this.f72076a = d;
        return d;
    }
}
