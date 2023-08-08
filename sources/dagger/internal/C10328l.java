package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: dagger.internal.l */
public final class C10328l<K, V> {

    /* renamed from: a */
    public final Map<K, V> f27969a;

    public C10328l(int i) {
        this.f27969a = C10320d.m38519d(i);
    }

    /* renamed from: b */
    public static <K, V> C10328l<K, V> m38530b(int i) {
        return new C10328l<>(i);
    }

    /* renamed from: a */
    public Map<K, V> mo21726a() {
        if (this.f27969a.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.f27969a);
    }

    /* renamed from: c */
    public C10328l<K, V> mo21727c(K k, V v) {
        this.f27969a.put(k, v);
        return this;
    }

    /* renamed from: d */
    public C10328l<K, V> mo21728d(Map<K, V> map) {
        this.f27969a.putAll(map);
        return this;
    }
}
