package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14253cc;
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

/* renamed from: com.contentsquare.android.sdk.r9 */
public class C14670r9<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f36330a;

    /* renamed from: b */
    public List<C14670r9<K, V>.e> f36331b;

    /* renamed from: c */
    public Map<K, V> f36332c;

    /* renamed from: d */
    public boolean f36333d;

    /* renamed from: e */
    public volatile C14670r9<K, V>.g f36334e;

    /* renamed from: f */
    public Map<K, V> f36335f;

    /* renamed from: g */
    public volatile C14670r9<K, V>.c f36336g;

    /* renamed from: com.contentsquare.android.sdk.r9$a */
    public static class C14671a extends C14670r9<FieldDescriptorType, Object> {
        public C14671a(int i) {
            super(i, (C14671a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C14670r9.super.put((C14253cc.C14255b) obj, obj2);
        }

        /* renamed from: u */
        public void mo36314u() {
            if (!mo36313t()) {
                for (int i = 0; i < mo36306o(); i++) {
                    Map.Entry d = mo36297d(i);
                    if (((C14253cc.C14255b) d.getKey()).mo34881p()) {
                        d.setValue(Collections.unmodifiableList((List) d.getValue()));
                    }
                }
                for (Map.Entry entry : mo36309r()) {
                    if (((C14253cc.C14255b) entry.getKey()).mo34881p()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C14670r9.super.mo36314u();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$b */
    public class C14672b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f36337a;

        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> f36338b;

        public C14672b() {
            this.f36337a = C14670r9.this.f36331b.size();
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo36315b() {
            if (this.f36338b == null) {
                this.f36338b = C14670r9.this.f36335f.entrySet().iterator();
            }
            return this.f36338b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Object obj;
            if (mo36315b().hasNext()) {
                obj = mo36315b().next();
            } else {
                List i = C14670r9.this.f36331b;
                int i2 = this.f36337a - 1;
                this.f36337a = i2;
                obj = i.get(i2);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i = this.f36337a;
            return (i > 0 && i <= C14670r9.this.f36331b.size()) || mo36315b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C14672b(C14670r9 r9Var, C14671a aVar) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$c */
    public class C14673c extends C14670r9<K, V>.g {
        public C14673c() {
            super(C14670r9.this, (C14671a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14672b(C14670r9.this, (C14671a) null);
        }

        public /* synthetic */ C14673c(C14670r9 r9Var, C14671a aVar) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$d */
    public static class C14674d {

        /* renamed from: a */
        public static final Iterator<Object> f36341a = new C14675a();

        /* renamed from: b */
        public static final Iterable<Object> f36342b = new C14676b();

        /* renamed from: com.contentsquare.android.sdk.r9$d$a */
        public static class C14675a implements Iterator<Object> {
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

        /* renamed from: com.contentsquare.android.sdk.r9$d$b */
        public static class C14676b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C14674d.f36341a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m63279b() {
            return f36342b;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$e */
    public class C14677e implements Map.Entry<K, V>, Comparable<C14670r9<K, V>.e> {

        /* renamed from: a */
        public final K f36343a;

        /* renamed from: b */
        public V f36344b;

        public C14677e(K k, V v) {
            this.f36343a = k;
            this.f36344b = v;
        }

        /* renamed from: b */
        public int compareTo(C14670r9<K, V>.e eVar) {
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
            return mo36328g(this.f36343a, entry.getKey()) && mo36328g(this.f36344b, entry.getValue());
        }

        /* renamed from: g */
        public final boolean mo36328g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public V getValue() {
            return this.f36344b;
        }

        public int hashCode() {
            K k = this.f36343a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f36344b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        /* renamed from: q */
        public K getKey() {
            return this.f36343a;
        }

        public V setValue(V v) {
            C14670r9.this.mo36298e();
            V v2 = this.f36344b;
            this.f36344b = v;
            return v2;
        }

        public String toString() {
            return this.f36343a + "=" + this.f36344b;
        }

        public C14677e(C14670r9 r9Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$f */
    public class C14678f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f36346a;

        /* renamed from: b */
        public boolean f36347b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f36348c;

        public C14678f() {
            this.f36346a = -1;
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo36335b() {
            if (this.f36348c == null) {
                this.f36348c = C14670r9.this.f36332c.entrySet().iterator();
            }
            return this.f36348c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f36347b = true;
            int i = this.f36346a + 1;
            this.f36346a = i;
            return (Map.Entry) (i < C14670r9.this.f36331b.size() ? C14670r9.this.f36331b.get(this.f36346a) : mo36335b().next());
        }

        public boolean hasNext() {
            if (this.f36346a + 1 >= C14670r9.this.f36331b.size()) {
                return !C14670r9.this.f36332c.isEmpty() && mo36335b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f36347b) {
                this.f36347b = false;
                C14670r9.this.mo36298e();
                if (this.f36346a < C14670r9.this.f36331b.size()) {
                    C14670r9 r9Var = C14670r9.this;
                    int i = this.f36346a;
                    this.f36346a = i - 1;
                    Object unused = r9Var.mo36304l(i);
                    return;
                }
                mo36335b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C14678f(C14670r9 r9Var, C14671a aVar) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.r9$g */
    public class C14679g extends AbstractSet<Map.Entry<K, V>> {
        public C14679g() {
        }

        public void clear() {
            C14670r9.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C14670r9.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: e */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C14670r9.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14678f(C14670r9.this, (C14671a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C14670r9.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C14670r9.this.size();
        }

        public /* synthetic */ C14679g(C14670r9 r9Var, C14671a aVar) {
            this();
        }
    }

    public C14670r9(int i) {
        this.f36330a = i;
        this.f36331b = Collections.emptyList();
        this.f36332c = Collections.emptyMap();
        this.f36335f = Collections.emptyMap();
    }

    /* renamed from: h */
    public static <FieldDescriptorType extends C14253cc.C14255b<FieldDescriptorType>> C14670r9<FieldDescriptorType, Object> m63258h(int i) {
        return new C14671a(i);
    }

    /* renamed from: a */
    public final int mo36293a(K k) {
        int size = this.f36331b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f36331b.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f36331b.get(i2).getKey());
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

    /* renamed from: c */
    public V put(K k, V v) {
        mo36298e();
        int a = mo36293a(k);
        if (a >= 0) {
            return this.f36331b.get(a).setValue(v);
        }
        mo36305n();
        int i = -(a + 1);
        if (i >= this.f36330a) {
            return mo36311s().put(k, v);
        }
        int size = this.f36331b.size();
        int i2 = this.f36330a;
        if (size == i2) {
            C14677e remove = this.f36331b.remove(i2 - 1);
            mo36311s().put(remove.getKey(), remove.getValue());
        }
        this.f36331b.add(i, new C14677e(k, v));
        return null;
    }

    public void clear() {
        mo36298e();
        if (!this.f36331b.isEmpty()) {
            this.f36331b.clear();
        }
        if (!this.f36332c.isEmpty()) {
            this.f36332c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo36293a(comparable) >= 0 || this.f36332c.containsKey(comparable);
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo36297d(int i) {
        return this.f36331b.get(i);
    }

    /* renamed from: e */
    public final void mo36298e() {
        if (this.f36333d) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f36334e == null) {
            this.f36334e = new C14679g(this, (C14671a) null);
        }
        return this.f36334e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14670r9)) {
            return super.equals(obj);
        }
        C14670r9 r9Var = (C14670r9) obj;
        int size = size();
        if (size != r9Var.size()) {
            return false;
        }
        int o = mo36306o();
        if (o != r9Var.mo36306o()) {
            return entrySet().equals(r9Var.entrySet());
        }
        for (int i = 0; i < o; i++) {
            if (!mo36297d(i).equals(r9Var.mo36297d(i))) {
                return false;
            }
        }
        if (o != size) {
            return this.f36332c.equals(r9Var.f36332c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo36293a(comparable);
        return a >= 0 ? this.f36331b.get(a).getValue() : this.f36332c.get(comparable);
    }

    public int hashCode() {
        int o = mo36306o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += this.f36331b.get(i2).hashCode();
        }
        return mo36308q() > 0 ? i + this.f36332c.hashCode() : i;
    }

    /* renamed from: j */
    public Set<Map.Entry<K, V>> mo36303j() {
        if (this.f36336g == null) {
            this.f36336g = new C14673c(this, (C14671a) null);
        }
        return this.f36336g;
    }

    /* renamed from: l */
    public final V mo36304l(int i) {
        mo36298e();
        V value = this.f36331b.remove(i).getValue();
        if (!this.f36332c.isEmpty()) {
            Iterator it = mo36311s().entrySet().iterator();
            this.f36331b.add(new C14677e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final void mo36305n() {
        mo36298e();
        if (this.f36331b.isEmpty() && !(this.f36331b instanceof ArrayList)) {
            this.f36331b = new ArrayList(this.f36330a);
        }
    }

    /* renamed from: o */
    public int mo36306o() {
        return this.f36331b.size();
    }

    /* renamed from: q */
    public int mo36308q() {
        return this.f36332c.size();
    }

    /* renamed from: r */
    public Iterable<Map.Entry<K, V>> mo36309r() {
        return this.f36332c.isEmpty() ? C14674d.m63279b() : this.f36332c.entrySet();
    }

    public V remove(Object obj) {
        mo36298e();
        Comparable comparable = (Comparable) obj;
        int a = mo36293a(comparable);
        if (a >= 0) {
            return mo36304l(a);
        }
        if (this.f36332c.isEmpty()) {
            return null;
        }
        return this.f36332c.remove(comparable);
    }

    /* renamed from: s */
    public final SortedMap<K, V> mo36311s() {
        mo36298e();
        if (this.f36332c.isEmpty() && !(this.f36332c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36332c = treeMap;
            this.f36335f = treeMap.descendingMap();
        }
        return (SortedMap) this.f36332c;
    }

    public int size() {
        return this.f36331b.size() + this.f36332c.size();
    }

    /* renamed from: t */
    public boolean mo36313t() {
        return this.f36333d;
    }

    /* renamed from: u */
    public void mo36314u() {
        if (!this.f36333d) {
            this.f36332c = this.f36332c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f36332c);
            this.f36335f = this.f36335f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f36335f);
            this.f36333d = true;
        }
    }

    public /* synthetic */ C14670r9(int i, C14671a aVar) {
        this(i);
    }
}
