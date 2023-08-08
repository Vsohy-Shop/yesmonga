package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.k */
public final class C40145k<K, V> {

    /* renamed from: a */
    public final Map<K, V> f102374a;

    public C40145k(int i) {
        this.f102374a = C40138d.m163352d(i);
    }

    /* renamed from: b */
    public static <K, V> C40145k<K, V> m163363b(int i) {
        return new C40145k<>(i);
    }

    /* renamed from: a */
    public Map<K, V> mo132760a() {
        if (this.f102374a.size() != 0) {
            return Collections.unmodifiableMap(this.f102374a);
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public C40145k<K, V> mo132761c(K k, V v) {
        this.f102374a.put(k, v);
        return this;
    }

    /* renamed from: d */
    public C40145k<K, V> mo132762d(Map<K, V> map) {
        this.f102374a.putAll(map);
        return this;
    }
}
