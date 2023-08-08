package dagger.internal;

import dagger.internal.C10316a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: dagger.internal.m */
public final class C10329m<K, V> extends C10316a<K, V, V> {

    /* renamed from: b */
    public static final Provider<Map<Object, Object>> f27970b = C10327k.m38527a(Collections.emptyMap());

    /* renamed from: dagger.internal.m$b */
    public static final class C10331b<K, V> extends C10316a.C10317a<K, V, V> {
        /* renamed from: c */
        public C10329m<K, V> mo21730c() {
            return new C10329m<>(this.f27960a);
        }

        /* renamed from: d */
        public C10331b<K, V> mo21720a(K k, Provider<V> provider) {
            super.mo21720a(k, provider);
            return this;
        }

        /* renamed from: e */
        public C10331b<K, V> mo21721b(Provider<Map<K, V>> provider) {
            super.mo21721b(provider);
            return this;
        }

        public C10331b(int i) {
            super(i);
        }
    }

    /* renamed from: c */
    public static <K, V> C10331b<K, V> m38534c(int i) {
        return new C10331b<>(i);
    }

    /* renamed from: d */
    public static <K, V> Provider<Map<K, V>> m38535d() {
        return f27970b;
    }

    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = C10320d.m38519d(mo21719b().size());
        for (Map.Entry entry : mo21719b().entrySet()) {
            d.put(entry.getKey(), ((Provider) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(d);
    }

    public C10329m(Map<K, Provider<V>> map) {
        super(map);
    }
}
