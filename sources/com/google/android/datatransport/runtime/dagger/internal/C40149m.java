package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.C40129e;
import com.google.android.datatransport.runtime.dagger.internal.C40134a;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.m */
public final class C40149m<K, V> extends C40134a<K, V, Provider<V>> implements C40129e<Map<K, Provider<V>>> {

    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.m$b */
    public static final class C40151b<K, V> extends C40134a.C40135a<K, V, Provider<V>> {
        /* renamed from: c */
        public C40149m<K, V> mo132768c() {
            return new C40149m<>(this.f102365a);
        }

        /* renamed from: d */
        public C40151b<K, V> mo132754a(K k, Provider<V> provider) {
            super.mo132754a(k, provider);
            return this;
        }

        /* renamed from: e */
        public C40151b<K, V> mo132755b(Provider<Map<K, Provider<V>>> provider) {
            super.mo132755b(provider);
            return this;
        }

        public C40151b(int i) {
            super(i);
        }
    }

    /* renamed from: c */
    public static <K, V> C40151b<K, V> m163375c(int i) {
        return new C40151b<>(i);
    }

    /* renamed from: d */
    public Map<K, Provider<V>> get() {
        return mo132753b();
    }

    public C40149m(Map<K, Provider<V>> map) {
        super(map);
    }
}
