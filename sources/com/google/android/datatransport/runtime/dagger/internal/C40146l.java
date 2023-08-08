package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.C40134a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.l */
public final class C40146l<K, V> extends C40134a<K, V, V> {

    /* renamed from: b */
    public static final Provider<Map<Object, Object>> f102375b = C40144j.m163360a(Collections.emptyMap());

    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.l$b */
    public static final class C40148b<K, V> extends C40134a.C40135a<K, V, V> {
        /* renamed from: c */
        public C40146l<K, V> mo132764c() {
            return new C40146l<>(this.f102365a);
        }

        /* renamed from: d */
        public C40148b<K, V> mo132754a(K k, Provider<V> provider) {
            super.mo132754a(k, provider);
            return this;
        }

        /* renamed from: e */
        public C40148b<K, V> mo132755b(Provider<Map<K, V>> provider) {
            super.mo132755b(provider);
            return this;
        }

        public C40148b(int i) {
            super(i);
        }
    }

    /* renamed from: c */
    public static <K, V> C40148b<K, V> m163367c(int i) {
        return new C40148b<>(i);
    }

    /* renamed from: d */
    public static <K, V> Provider<Map<K, V>> m163368d() {
        return f102375b;
    }

    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = C40138d.m163352d(mo132753b().size());
        for (Map.Entry entry : mo132753b().entrySet()) {
            d.put(entry.getKey(), ((Provider) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(d);
    }

    public C40146l(Map<K, Provider<V>> map) {
        super(map);
    }
}
