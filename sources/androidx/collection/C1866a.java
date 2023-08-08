package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.a */
public class C1866a<K, V> extends C1886l<K, V> implements Map<K, V> {
    @C0363p0

    /* renamed from: X */
    public C1880k<K, V> f5095X;

    /* renamed from: androidx.collection.a$a */
    public class C1867a extends C1880k<K, V> {
        public C1867a() {
        }

        /* renamed from: a */
        public void mo6147a() {
            C1866a.this.clear();
        }

        /* renamed from: b */
        public Object mo6148b(int i, int i2) {
            return C1866a.this.f5165b[(i << 1) + i2];
        }

        /* renamed from: c */
        public Map<K, V> mo6149c() {
            return C1866a.this;
        }

        /* renamed from: d */
        public int mo6150d() {
            return C1866a.this.f5166c;
        }

        /* renamed from: e */
        public int mo6151e(Object obj) {
            return C1866a.this.mo6327f(obj);
        }

        /* renamed from: f */
        public int mo6152f(Object obj) {
            return C1866a.this.mo6332i(obj);
        }

        /* renamed from: g */
        public void mo6153g(K k, V v) {
            C1866a.this.put(k, v);
        }

        /* renamed from: h */
        public void mo6154h(int i) {
            C1866a.this.mo6336m(i);
        }

        /* renamed from: i */
        public V mo6155i(int i, V v) {
            return C1866a.this.mo6337n(i, v);
        }
    }

    public C1866a() {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo6143q().mo6259l();
    }

    public Set<K> keySet() {
        return mo6143q().mo6260m();
    }

    /* renamed from: p */
    public boolean mo6141p(@C0359n0 Collection<?> collection) {
        return C1880k.m7557j(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo6321c(this.f5166c + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: q */
    public final C1880k<K, V> mo6143q() {
        if (this.f5095X == null) {
            this.f5095X = new C1867a();
        }
        return this.f5095X;
    }

    /* renamed from: r */
    public boolean mo6144r(@C0359n0 Collection<?> collection) {
        return C1880k.m7559o(this, collection);
    }

    /* renamed from: s */
    public boolean mo6145s(@C0359n0 Collection<?> collection) {
        return C1880k.m7560p(this, collection);
    }

    public Collection<V> values() {
        return mo6143q().mo6261n();
    }

    public C1866a(int i) {
        super(i);
    }

    public C1866a(C1886l lVar) {
        super(lVar);
    }
}
