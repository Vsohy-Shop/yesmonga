package com.google.android.datatransport.runtime.dagger.internal;

import com.urbanairship.analytics.location.C35560b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.a */
public abstract class C40134a<K, V, V2> implements C40141g<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, Provider<V>> f102364a;

    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.a$a */
    public static abstract class C40135a<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap<K, Provider<V>> f102365a;

        public C40135a(int i) {
            this.f102365a = C40138d.m163352d(i);
        }

        /* renamed from: a */
        public C40135a<K, V, V2> mo132754a(K k, Provider<V> provider) {
            this.f102365a.put(C40153o.m163384c(k, "key"), C40153o.m163384c(provider, C35560b.f87807Z0));
            return this;
        }

        /* renamed from: b */
        public C40135a<K, V, V2> mo132755b(Provider<Map<K, V2>> provider) {
            if (provider instanceof C40139e) {
                return mo132755b(((C40139e) provider).mo132757a());
            }
            this.f102365a.putAll(((C40134a) provider).f102364a);
            return this;
        }
    }

    public C40134a(Map<K, Provider<V>> map) {
        this.f102364a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, Provider<V>> mo132753b() {
        return this.f102364a;
    }
}
