package dagger.internal;

import dagger.C10156e;
import dagger.internal.C10316a;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: dagger.internal.n */
public final class C10332n<K, V> extends C10316a<K, V, Provider<V>> implements C10156e<Map<K, Provider<V>>> {

    /* renamed from: dagger.internal.n$b */
    public static final class C10334b<K, V> extends C10316a.C10317a<K, V, Provider<V>> {
        /* renamed from: c */
        public C10332n<K, V> mo21734c() {
            return new C10332n<>(this.f27960a);
        }

        /* renamed from: d */
        public C10334b<K, V> mo21720a(K k, Provider<V> provider) {
            super.mo21720a(k, provider);
            return this;
        }

        /* renamed from: e */
        public C10334b<K, V> mo21721b(Provider<Map<K, Provider<V>>> provider) {
            super.mo21721b(provider);
            return this;
        }

        public C10334b(int i) {
            super(i);
        }
    }

    /* renamed from: c */
    public static <K, V> C10334b<K, V> m38542c(int i) {
        return new C10334b<>(i);
    }

    /* renamed from: d */
    public Map<K, Provider<V>> get() {
        return mo21719b();
    }

    public C10332n(Map<K, Provider<V>> map) {
        super(map);
    }
}
