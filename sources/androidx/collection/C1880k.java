package androidx.collection;

import androidx.annotation.C0363p0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: androidx.collection.k */
public abstract class C1880k<K, V> {
    @C0363p0

    /* renamed from: a */
    public C1880k<K, V>.b f5140a;
    @C0363p0

    /* renamed from: b */
    public C1880k<K, V>.c f5141b;
    @C0363p0

    /* renamed from: c */
    public C1880k<K, V>.e f5142c;

    /* renamed from: androidx.collection.k$a */
    public final class C1881a<T> implements Iterator<T> {

        /* renamed from: a */
        public final int f5143a;

        /* renamed from: b */
        public int f5144b;

        /* renamed from: c */
        public int f5145c;

        /* renamed from: d */
        public boolean f5146d = false;

        public C1881a(int i) {
            this.f5143a = i;
            this.f5144b = C1880k.this.mo6150d();
        }

        public boolean hasNext() {
            return this.f5145c < this.f5144b;
        }

        public T next() {
            if (hasNext()) {
                T b = C1880k.this.mo6148b(this.f5145c, this.f5143a);
                this.f5145c++;
                this.f5146d = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f5146d) {
                int i = this.f5145c - 1;
                this.f5145c = i;
                this.f5144b--;
                this.f5146d = false;
                C1880k.this.mo6154h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.collection.k$b */
    public final class C1882b implements Set<Map.Entry<K, V>> {
        public C1882b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C1880k.this.mo6150d();
            for (Map.Entry entry : collection) {
                C1880k.this.mo6153g(entry.getKey(), entry.getValue());
            }
            if (d != C1880k.this.mo6150d()) {
                return true;
            }
            return false;
        }

        public void clear() {
            C1880k.this.mo6147a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C1880k.this.mo6151e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C1874g.m7495c(C1880k.this.mo6148b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C1880k.m7558k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = C1880k.this.mo6150d() - 1; d >= 0; d--) {
                Object b = C1880k.this.mo6148b(d, 0);
                Object b2 = C1880k.this.mo6148b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C1880k.this.mo6150d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1884d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C1880k.this.mo6150d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.k$c */
    public final class C1883c implements Set<K> {
        public C1883c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1880k.this.mo6147a();
        }

        public boolean contains(Object obj) {
            return C1880k.this.mo6151e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C1880k.m7557j(C1880k.this.mo6149c(), collection);
        }

        public boolean equals(Object obj) {
            return C1880k.m7558k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = C1880k.this.mo6150d() - 1; d >= 0; d--) {
                Object b = C1880k.this.mo6148b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C1880k.this.mo6150d() == 0;
        }

        public Iterator<K> iterator() {
            return new C1881a(0);
        }

        public boolean remove(Object obj) {
            int e = C1880k.this.mo6151e(obj);
            if (e < 0) {
                return false;
            }
            C1880k.this.mo6154h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C1880k.m7559o(C1880k.this.mo6149c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C1880k.m7560p(C1880k.this.mo6149c(), collection);
        }

        public int size() {
            return C1880k.this.mo6150d();
        }

        public Object[] toArray() {
            return C1880k.this.mo6262q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1880k.this.mo6263r(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.k$d */
    public final class C1884d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        public int f5150a;

        /* renamed from: b */
        public int f5151b;

        /* renamed from: c */
        public boolean f5152c = false;

        public C1884d() {
            this.f5150a = C1880k.this.mo6150d() - 1;
            this.f5151b = -1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f5151b++;
                this.f5152c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f5152c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C1874g.m7495c(entry.getKey(), C1880k.this.mo6148b(this.f5151b, 0)) || !C1874g.m7495c(entry.getValue(), C1880k.this.mo6148b(this.f5151b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f5152c) {
                return C1880k.this.mo6148b(this.f5151b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f5152c) {
                return C1880k.this.mo6148b(this.f5151b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f5151b < this.f5150a;
        }

        public int hashCode() {
            int i;
            if (this.f5152c) {
                int i2 = 0;
                Object b = C1880k.this.mo6148b(this.f5151b, 0);
                Object b2 = C1880k.this.mo6148b(this.f5151b, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f5152c) {
                C1880k.this.mo6154h(this.f5151b);
                this.f5151b--;
                this.f5150a--;
                this.f5152c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f5152c) {
                return C1880k.this.mo6155i(this.f5151b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.k$e */
    public final class C1885e implements Collection<V> {
        public C1885e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1880k.this.mo6147a();
        }

        public boolean contains(Object obj) {
            return C1880k.this.mo6152f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1880k.this.mo6150d() == 0;
        }

        public Iterator<V> iterator() {
            return new C1881a(1);
        }

        public boolean remove(Object obj) {
            int f = C1880k.this.mo6152f(obj);
            if (f < 0) {
                return false;
            }
            C1880k.this.mo6154h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C1880k.this.mo6150d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C1880k.this.mo6148b(i, 1))) {
                    C1880k.this.mo6154h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C1880k.this.mo6150d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C1880k.this.mo6148b(i, 1))) {
                    C1880k.this.mo6154h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C1880k.this.mo6150d();
        }

        public Object[] toArray() {
            return C1880k.this.mo6262q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1880k.this.mo6263r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m7557j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m7558k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m7559o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static <K, V> boolean m7560p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo6147a();

    /* renamed from: b */
    public abstract Object mo6148b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo6149c();

    /* renamed from: d */
    public abstract int mo6150d();

    /* renamed from: e */
    public abstract int mo6151e(Object obj);

    /* renamed from: f */
    public abstract int mo6152f(Object obj);

    /* renamed from: g */
    public abstract void mo6153g(K k, V v);

    /* renamed from: h */
    public abstract void mo6154h(int i);

    /* renamed from: i */
    public abstract V mo6155i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo6259l() {
        if (this.f5140a == null) {
            this.f5140a = new C1882b();
        }
        return this.f5140a;
    }

    /* renamed from: m */
    public Set<K> mo6260m() {
        if (this.f5141b == null) {
            this.f5141b = new C1883c();
        }
        return this.f5141b;
    }

    /* renamed from: n */
    public Collection<V> mo6261n() {
        if (this.f5142c == null) {
            this.f5142c = new C1885e();
        }
        return this.f5142c;
    }

    /* renamed from: q */
    public Object[] mo6262q(int i) {
        int d = mo6150d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo6148b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo6263r(T[] tArr, int i) {
        int d = mo6150d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo6148b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
