package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18909y0;
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

/* renamed from: androidx.datastore.preferences.protobuf.a3 */
public class C18676a3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f47777a;

    /* renamed from: b */
    public List<C18676a3<K, V>.e> f47778b;

    /* renamed from: c */
    public Map<K, V> f47779c;

    /* renamed from: d */
    public boolean f47780d;

    /* renamed from: e */
    public volatile C18676a3<K, V>.g f47781e;

    /* renamed from: f */
    public Map<K, V> f47782f;

    /* renamed from: g */
    public volatile C18676a3<K, V>.c f47783g;

    /* renamed from: androidx.datastore.preferences.protobuf.a3$a */
    public static class C18677a extends C18676a3<FieldDescriptorType, Object> {
        public C18677a(int i) {
            super(i, (C18677a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C18676a3.super.put((C18909y0.C18912c) obj, obj2);
        }

        /* renamed from: s */
        public void mo54311s() {
            if (!mo54309r()) {
                for (int i = 0; i < mo54303m(); i++) {
                    Map.Entry l = mo54302l(i);
                    if (((C18909y0.C18912c) l.getKey()).mo54063B()) {
                        l.setValue(Collections.unmodifiableList((List) l.getValue()));
                    }
                }
                for (Map.Entry entry : mo54305o()) {
                    if (((C18909y0.C18912c) entry.getKey()).mo54063B()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C18676a3.super.mo54311s();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$c */
    public class C18679c extends C18676a3<K, V>.g {
        public C18679c() {
            super(C18676a3.this, (C18677a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18678b(C18676a3.this, (C18677a) null);
        }

        public /* synthetic */ C18679c(C18676a3 a3Var, C18677a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$d */
    public static class C18680d {

        /* renamed from: a */
        public static final Iterator<Object> f47788a = new C18681a();

        /* renamed from: b */
        public static final Iterable<Object> f47789b = new C18682b();

        /* renamed from: androidx.datastore.preferences.protobuf.a3$d$a */
        public static class C18681a implements Iterator<Object> {
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

        /* renamed from: androidx.datastore.preferences.protobuf.a3$d$b */
        public static class C18682b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C18680d.f47788a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m85519b() {
            return f47789b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$e */
    public class C18683e implements Map.Entry<K, V>, Comparable<C18676a3<K, V>.e> {

        /* renamed from: a */
        public final K f47790a;

        /* renamed from: b */
        public V f47791b;

        public C18683e(C18676a3 a3Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public int compareTo(C18676a3<K, V>.e eVar) {
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
            if (!mo54328g(this.f47790a, entry.getKey()) || !mo54328g(this.f47791b, entry.getValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final boolean mo54328g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public V getValue() {
            return this.f47791b;
        }

        public int hashCode() {
            K k = this.f47790a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f47791b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        /* renamed from: q */
        public K getKey() {
            return this.f47790a;
        }

        public V setValue(V v) {
            C18676a3.this.mo54298h();
            V v2 = this.f47791b;
            this.f47791b = v;
            return v2;
        }

        public String toString() {
            return this.f47790a + "=" + this.f47791b;
        }

        public C18683e(K k, V v) {
            this.f47790a = k;
            this.f47791b = v;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$g */
    public class C18685g extends AbstractSet<Map.Entry<K, V>> {
        public C18685g() {
        }

        public void clear() {
            C18676a3.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C18676a3.this.get(entry.getKey());
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
            C18676a3.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C18684f(C18676a3.this, (C18677a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C18676a3.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C18676a3.this.size();
        }

        public /* synthetic */ C18685g(C18676a3 a3Var, C18677a aVar) {
            this();
        }
    }

    public /* synthetic */ C18676a3(int i, C18677a aVar) {
        this(i);
    }

    /* renamed from: t */
    public static <FieldDescriptorType extends C18909y0.C18912c<FieldDescriptorType>> C18676a3<FieldDescriptorType, Object> m85499t(int i) {
        return new C18677a(i);
    }

    /* renamed from: u */
    public static <K extends Comparable<K>, V> C18676a3<K, V> m85500u(int i) {
        return new C18676a3<>(i);
    }

    public void clear() {
        mo54298h();
        if (!this.f47778b.isEmpty()) {
            this.f47778b.clear();
        }
        if (!this.f47779c.isEmpty()) {
            this.f47779c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo54296f(comparable) >= 0 || this.f47779c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f47781e == null) {
            this.f47781e = new C18685g(this, (C18677a) null);
        }
        return this.f47781e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18676a3)) {
            return super.equals(obj);
        }
        C18676a3 a3Var = (C18676a3) obj;
        int size = size();
        if (size != a3Var.size()) {
            return false;
        }
        int m = mo54303m();
        if (m != a3Var.mo54303m()) {
            return entrySet().equals(a3Var.entrySet());
        }
        for (int i = 0; i < m; i++) {
            if (!mo54302l(i).equals(a3Var.mo54302l(i))) {
                return false;
            }
        }
        if (m != size) {
            return this.f47779c.equals(a3Var.f47779c);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo54296f(K k) {
        int size = this.f47778b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f47778b.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f47778b.get(i2).getKey());
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
        int f = mo54296f(comparable);
        if (f >= 0) {
            return this.f47778b.get(f).getValue();
        }
        return this.f47779c.get(comparable);
    }

    /* renamed from: h */
    public final void mo54298h() {
        if (this.f47780d) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int m = mo54303m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            i += this.f47778b.get(i2).hashCode();
        }
        if (mo54304n() > 0) {
            return i + this.f47779c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Set<Map.Entry<K, V>> mo54300i() {
        if (this.f47783g == null) {
            this.f47783g = new C18679c(this, (C18677a) null);
        }
        return this.f47783g;
    }

    /* renamed from: j */
    public final void mo54301j() {
        mo54298h();
        if (this.f47778b.isEmpty() && !(this.f47778b instanceof ArrayList)) {
            this.f47778b = new ArrayList(this.f47777a);
        }
    }

    /* renamed from: l */
    public Map.Entry<K, V> mo54302l(int i) {
        return this.f47778b.get(i);
    }

    /* renamed from: m */
    public int mo54303m() {
        return this.f47778b.size();
    }

    /* renamed from: n */
    public int mo54304n() {
        return this.f47779c.size();
    }

    /* renamed from: o */
    public Iterable<Map.Entry<K, V>> mo54305o() {
        if (this.f47779c.isEmpty()) {
            return C18680d.m85519b();
        }
        return this.f47779c.entrySet();
    }

    /* renamed from: p */
    public Iterable<Map.Entry<K, V>> mo54306p() {
        if (this.f47782f.isEmpty()) {
            return C18680d.m85519b();
        }
        return this.f47782f.entrySet();
    }

    /* renamed from: q */
    public final SortedMap<K, V> mo54308q() {
        mo54298h();
        if (this.f47779c.isEmpty() && !(this.f47779c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f47779c = treeMap;
            this.f47782f = treeMap.descendingMap();
        }
        return (SortedMap) this.f47779c;
    }

    /* renamed from: r */
    public boolean mo54309r() {
        return this.f47780d;
    }

    public V remove(Object obj) {
        mo54298h();
        Comparable comparable = (Comparable) obj;
        int f = mo54296f(comparable);
        if (f >= 0) {
            return mo54314w(f);
        }
        if (this.f47779c.isEmpty()) {
            return null;
        }
        return this.f47779c.remove(comparable);
    }

    /* renamed from: s */
    public void mo54311s() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f47780d) {
            if (this.f47779c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f47779c);
            }
            this.f47779c = map;
            if (this.f47782f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f47782f);
            }
            this.f47782f = map2;
            this.f47780d = true;
        }
    }

    public int size() {
        return this.f47778b.size() + this.f47779c.size();
    }

    /* renamed from: v */
    public V put(K k, V v) {
        mo54298h();
        int f = mo54296f(k);
        if (f >= 0) {
            return this.f47778b.get(f).setValue(v);
        }
        mo54301j();
        int i = -(f + 1);
        if (i >= this.f47777a) {
            return mo54308q().put(k, v);
        }
        int size = this.f47778b.size();
        int i2 = this.f47777a;
        if (size == i2) {
            C18683e remove = this.f47778b.remove(i2 - 1);
            mo54308q().put(remove.getKey(), remove.getValue());
        }
        this.f47778b.add(i, new C18683e(k, v));
        return null;
    }

    /* renamed from: w */
    public final V mo54314w(int i) {
        mo54298h();
        V value = this.f47778b.remove(i).getValue();
        if (!this.f47779c.isEmpty()) {
            Iterator it = mo54308q().entrySet().iterator();
            this.f47778b.add(new C18683e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$b */
    public class C18678b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f47784a;

        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> f47785b;

        public C18678b() {
            this.f47784a = C18676a3.this.f47778b.size();
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo54315b() {
            if (this.f47785b == null) {
                this.f47785b = C18676a3.this.f47782f.entrySet().iterator();
            }
            return this.f47785b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (mo54315b().hasNext()) {
                return (Map.Entry) mo54315b().next();
            }
            List b = C18676a3.this.f47778b;
            int i = this.f47784a - 1;
            this.f47784a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f47784a;
            return (i > 0 && i <= C18676a3.this.f47778b.size()) || mo54315b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C18678b(C18676a3 a3Var, C18677a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a3$f */
    public class C18684f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f47793a;

        /* renamed from: b */
        public boolean f47794b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f47795c;

        public C18684f() {
            this.f47793a = -1;
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo54335b() {
            if (this.f47795c == null) {
                this.f47795c = C18676a3.this.f47779c.entrySet().iterator();
            }
            return this.f47795c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f47794b = true;
            int i = this.f47793a + 1;
            this.f47793a = i;
            if (i < C18676a3.this.f47778b.size()) {
                return (Map.Entry) C18676a3.this.f47778b.get(this.f47793a);
            }
            return (Map.Entry) mo54335b().next();
        }

        public boolean hasNext() {
            if (this.f47793a + 1 < C18676a3.this.f47778b.size()) {
                return true;
            }
            if (C18676a3.this.f47779c.isEmpty() || !mo54335b().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f47794b) {
                this.f47794b = false;
                C18676a3.this.mo54298h();
                if (this.f47793a < C18676a3.this.f47778b.size()) {
                    C18676a3 a3Var = C18676a3.this;
                    int i = this.f47793a;
                    this.f47793a = i - 1;
                    Object unused = a3Var.mo54314w(i);
                    return;
                }
                mo54335b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C18684f(C18676a3 a3Var, C18677a aVar) {
            this();
        }
    }

    public C18676a3(int i) {
        this.f47777a = i;
        this.f47778b = Collections.emptyList();
        this.f47779c = Collections.emptyMap();
        this.f47782f = Collections.emptyMap();
    }
}
