package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.q0 */
public abstract class C30178q0<K, V> extends AbstractMap<K, V> {
    @CheckForNull

    /* renamed from: a */
    public transient Set<Map.Entry<K, V>> f72155a;
    @CheckForNull

    /* renamed from: b */
    public transient Set<K> f72156b;
    @CheckForNull

    /* renamed from: c */
    public transient Collection<V> f72157c;

    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo85114a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f72155a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo85114a();
        this.f72155a = a;
        return a;
    }

    public Set<K> keySet() {
        Set<K> set = this.f72156b;
        if (set != null) {
            return set;
        }
        C30154o0 o0Var = new C30154o0(this);
        this.f72156b = o0Var;
        return o0Var;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f72157c;
        if (collection != null) {
            return collection;
        }
        C30166p0 p0Var = new C30166p0(this);
        this.f72157c = p0Var;
        return p0Var;
    }
}
