package com.google.protobuf;

import com.google.protobuf.C34425o0;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.j2 */
public class C34387j2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f83298a;

    /* renamed from: b */
    public List<C34387j2<K, V>.e> f83299b;

    /* renamed from: c */
    public Map<K, V> f83300c;

    /* renamed from: d */
    public boolean f83301d;

    /* renamed from: e */
    public volatile C34387j2<K, V>.g f83302e;

    /* renamed from: f */
    public Map<K, V> f83303f;

    /* renamed from: g */
    public volatile C34387j2<K, V>.c f83304g;

    /* renamed from: com.google.protobuf.j2$a */
    public static class C34388a extends C34387j2<FieldDescriptorType, Object> {
        public C34388a(int i) {
            super(i, (C34388a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C34387j2.super.put((C34425o0.C34428c) obj, obj2);
        }

        /* renamed from: s */
        public void mo101154s() {
            if (!mo101152r()) {
                for (int i = 0; i < mo101146m(); i++) {
                    Map.Entry l = mo101145l(i);
                    if (((C34425o0.C34428c) l.getKey()).mo100490B()) {
                        l.setValue(Collections.unmodifiableList((List) l.getValue()));
                    }
                }
                for (Map.Entry entry : mo101148o()) {
                    if (((C34425o0.C34428c) entry.getKey()).mo100490B()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C34387j2.super.mo101154s();
        }
    }

    /* renamed from: com.google.protobuf.j2$c */
    public class C34390c extends C34387j2<K, V>.g {
        public C34390c() {
            super(C34387j2.this, (C34388a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C34389b(C34387j2.this, (C34388a) null);
        }

        public /* synthetic */ C34390c(C34387j2 j2Var, C34388a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.j2$d */
    public static class C34391d {

        /* renamed from: a */
        public static final Iterator<Object> f83309a = new C34392a();

        /* renamed from: b */
        public static final Iterable<Object> f83310b = new C34393b();

        /* renamed from: com.google.protobuf.j2$d$a */
        public static class C34392a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.j2$d$b */
        public static class C34393b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C34391d.f83309a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m139460b() {
            return f83310b;
        }
    }

    /* renamed from: com.google.protobuf.j2$e */
    public class C34394e implements Map.Entry<K, V>, Comparable<C34387j2<K, V>.e> {

        /* renamed from: a */
        public final K f83311a;

        /* renamed from: b */
        public V f83312b;

        public C34394e(C34387j2 j2Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public int compareTo(C34387j2<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!mo101171g(this.f83311a, entry.getKey()) || !mo101171g(this.f83312b, entry.getValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final boolean mo101171g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public V getValue() {
            return this.f83312b;
        }

        public int hashCode() {
            K k = this.f83311a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f83312b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        /* renamed from: q */
        public K getKey() {
            return this.f83311a;
        }

        public V setValue(V v) {
            C34387j2.this.mo101141h();
            V v2 = this.f83312b;
            this.f83312b = v;
            return v2;
        }

        public String toString() {
            return this.f83311a + "=" + this.f83312b;
        }

        public C34394e(K k, V v) {
            this.f83311a = k;
            this.f83312b = v;
        }
    }

    /* renamed from: com.google.protobuf.j2$g */
    public class C34396g extends AbstractSet<Map.Entry<K, V>> {
        public C34396g() {
        }

        public void clear() {
            C34387j2.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C34387j2.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C34387j2.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C34395f(C34387j2.this, (C34388a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C34387j2.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C34387j2.this.size();
        }

        public /* synthetic */ C34396g(C34387j2 j2Var, C34388a aVar) {
            this();
        }
    }

    public /* synthetic */ C34387j2(int i, C34388a aVar) {
        this(i);
    }

    /* renamed from: t */
    public static <FieldDescriptorType extends C34425o0.C34428c<FieldDescriptorType>> C34387j2<FieldDescriptorType, Object> m139440t(int i) {
        return new C34388a(i);
    }

    /* renamed from: u */
    public static <K extends Comparable<K>, V> C34387j2<K, V> m139441u(int i) {
        return new C34387j2<>(i);
    }

    public void clear() {
        mo101141h();
        if (!this.f83299b.isEmpty()) {
            this.f83299b.clear();
        }
        if (!this.f83300c.isEmpty()) {
            this.f83300c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo101139f(comparable) >= 0 || this.f83300c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f83302e == null) {
            this.f83302e = new C34396g(this, (C34388a) null);
        }
        return this.f83302e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34387j2)) {
            return super.equals(obj);
        }
        C34387j2 j2Var = (C34387j2) obj;
        int size = size();
        if (size != j2Var.size()) {
            return false;
        }
        int m = mo101146m();
        if (m != j2Var.mo101146m()) {
            return entrySet().equals(j2Var.entrySet());
        }
        for (int i = 0; i < m; i++) {
            if (!mo101145l(i).equals(j2Var.mo101145l(i))) {
                return false;
            }
        }
        if (m != size) {
            return this.f83300c.equals(j2Var.f83300c);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo101139f(K k) {
        int size = this.f83299b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f83299b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f83299b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = mo101139f(comparable);
        if (f >= 0) {
            return this.f83299b.get(f).getValue();
        }
        return this.f83300c.get(comparable);
    }

    /* renamed from: h */
    public final void mo101141h() {
        if (this.f83301d) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int m = mo101146m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            i += this.f83299b.get(i2).hashCode();
        }
        if (mo101147n() > 0) {
            return i + this.f83300c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> mo101143i() {
        if (this.f83304g == null) {
            this.f83304g = new C34390c(this, (C34388a) null);
        }
        return this.f83304g;
    }

    /* renamed from: j */
    public final void mo101144j() {
        mo101141h();
        if (this.f83299b.isEmpty() && !(this.f83299b instanceof ArrayList)) {
            this.f83299b = new ArrayList(this.f83298a);
        }
    }

    /* renamed from: l */
    public Map.Entry<K, V> mo101145l(int i) {
        return this.f83299b.get(i);
    }

    /* renamed from: m */
    public int mo101146m() {
        return this.f83299b.size();
    }

    /* renamed from: n */
    public int mo101147n() {
        return this.f83300c.size();
    }

    /* renamed from: o */
    public Iterable<Map.Entry<K, V>> mo101148o() {
        if (this.f83300c.isEmpty()) {
            return C34391d.m139460b();
        }
        return this.f83300c.entrySet();
    }

    /* renamed from: p */
    public Iterable<Map.Entry<K, V>> mo101149p() {
        if (this.f83303f.isEmpty()) {
            return C34391d.m139460b();
        }
        return this.f83303f.entrySet();
    }

    /* renamed from: q */
    public final SortedMap<K, V> mo101151q() {
        mo101141h();
        if (this.f83300c.isEmpty() && !(this.f83300c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f83300c = treeMap;
            this.f83303f = treeMap.descendingMap();
        }
        return (SortedMap) this.f83300c;
    }

    /* renamed from: r */
    public boolean mo101152r() {
        return this.f83301d;
    }

    public V remove(Object obj) {
        mo101141h();
        Comparable comparable = (Comparable) obj;
        int f = mo101139f(comparable);
        if (f >= 0) {
            return mo101157w(f);
        }
        if (this.f83300c.isEmpty()) {
            return null;
        }
        return this.f83300c.remove(comparable);
    }

    /* renamed from: s */
    public void mo101154s() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f83301d) {
            if (this.f83300c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f83300c);
            }
            this.f83300c = map;
            if (this.f83303f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f83303f);
            }
            this.f83303f = map2;
            this.f83301d = true;
        }
    }

    public int size() {
        return this.f83299b.size() + this.f83300c.size();
    }

    /* renamed from: v */
    public V put(K k, V v) {
        mo101141h();
        int f = mo101139f(k);
        if (f >= 0) {
            return this.f83299b.get(f).setValue(v);
        }
        mo101144j();
        int i = -(f + 1);
        if (i >= this.f83298a) {
            return mo101151q().put(k, v);
        }
        int size = this.f83299b.size();
        int i2 = this.f83298a;
        if (size == i2) {
            C34394e remove = this.f83299b.remove(i2 - 1);
            mo101151q().put(remove.getKey(), remove.getValue());
        }
        this.f83299b.add(i, new C34394e(k, v));
        return null;
    }

    /* renamed from: w */
    public final V mo101157w(int i) {
        mo101141h();
        V value = this.f83299b.remove(i).getValue();
        if (!this.f83300c.isEmpty()) {
            Iterator it = mo101151q().entrySet().iterator();
            this.f83299b.add(new C34394e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: com.google.protobuf.j2$b */
    public class C34389b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f83305a;

        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> f83306b;

        public C34389b() {
            this.f83305a = C34387j2.this.f83299b.size();
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo101158b() {
            if (this.f83306b == null) {
                this.f83306b = C34387j2.this.f83303f.entrySet().iterator();
            }
            return this.f83306b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (mo101158b().hasNext()) {
                return (Map.Entry) mo101158b().next();
            }
            List b = C34387j2.this.f83299b;
            int i = this.f83305a - 1;
            this.f83305a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f83305a;
            return (i > 0 && i <= C34387j2.this.f83299b.size()) || mo101158b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C34389b(C34387j2 j2Var, C34388a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.j2$f */
    public class C34395f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f83314a;

        /* renamed from: b */
        public boolean f83315b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f83316c;

        public C34395f() {
            this.f83314a = -1;
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo101178b() {
            if (this.f83316c == null) {
                this.f83316c = C34387j2.this.f83300c.entrySet().iterator();
            }
            return this.f83316c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f83315b = true;
            int i = this.f83314a + 1;
            this.f83314a = i;
            if (i < C34387j2.this.f83299b.size()) {
                return (Map.Entry) C34387j2.this.f83299b.get(this.f83314a);
            }
            return (Map.Entry) mo101178b().next();
        }

        public boolean hasNext() {
            if (this.f83314a + 1 < C34387j2.this.f83299b.size()) {
                return true;
            }
            if (C34387j2.this.f83300c.isEmpty() || !mo101178b().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f83315b) {
                this.f83315b = false;
                C34387j2.this.mo101141h();
                if (this.f83314a < C34387j2.this.f83299b.size()) {
                    C34387j2 j2Var = C34387j2.this;
                    int i = this.f83314a;
                    this.f83314a = i - 1;
                    Object unused = j2Var.mo101157w(i);
                    return;
                }
                mo101178b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C34395f(C34387j2 j2Var, C34388a aVar) {
            this();
        }
    }

    public C34387j2(int i) {
        this.f83298a = i;
        this.f83299b = Collections.emptyList();
        this.f83300c = Collections.emptyMap();
        this.f83303f = Collections.emptyMap();
    }
}
