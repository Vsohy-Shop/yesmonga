package dagger.internal;

import com.urbanairship.analytics.location.C35560b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: dagger.internal.a */
public abstract class C10316a<K, V, V2> implements C10324h<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, Provider<V>> f27959a;

    /* renamed from: dagger.internal.a$a */
    public static abstract class C10317a<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap<K, Provider<V>> f27960a;

        public C10317a(int i) {
            this.f27960a = C10320d.m38519d(i);
        }

        /* renamed from: a */
        public C10317a<K, V, V2> mo21720a(K k, Provider<V> provider) {
            this.f27960a.put(C10335o.m38551c(k, "key"), C10335o.m38551c(provider, C35560b.f87807Z0));
            return this;
        }

        /* renamed from: b */
        public C10317a<K, V, V2> mo21721b(Provider<Map<K, V2>> provider) {
            if (provider instanceof C10322f) {
                return mo21721b(((C10322f) provider).mo21723a());
            }
            this.f27960a.putAll(((C10316a) provider).f27959a);
            return this;
        }
    }

    public C10316a(Map<K, Provider<V>> map) {
        this.f27959a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, Provider<V>> mo21719b() {
        return this.f27959a;
    }
}
