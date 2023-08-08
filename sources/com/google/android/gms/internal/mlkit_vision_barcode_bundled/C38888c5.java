package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c5 */
public class C38888c5<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f98818a;

    /* renamed from: b */
    public List<C39077w4> f98819b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f98820c = Collections.emptyMap();

    /* renamed from: d */
    public boolean f98821d;

    /* renamed from: e */
    public volatile C38868a5 f98822e;

    /* renamed from: f */
    public Map<K, V> f98823f = Collections.emptyMap();

    public /* synthetic */ C38888c5(int i, C38878b5 b5Var) {
        this.f98818a = i;
    }

    /* renamed from: a */
    public void mo122811a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f98821d) {
            if (this.f98820c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f98820c);
            }
            this.f98820c = map;
            if (this.f98823f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f98823f);
            }
            this.f98823f = map2;
            this.f98821d = true;
        }
    }

    /* renamed from: b */
    public final int mo122812b() {
        return this.f98819b.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo122813c() {
        if (this.f98820c.isEmpty()) {
            return C39068v4.m160936a();
        }
        return this.f98820c.entrySet();
    }

    public final void clear() {
        mo122826p();
        if (!this.f98819b.isEmpty()) {
            this.f98819b.clear();
        }
        if (!this.f98820c.isEmpty()) {
            this.f98820c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo122823m(comparable) >= 0 || this.f98820c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        mo122826p();
        int m = mo122823m(k);
        if (m >= 0) {
            return this.f98819b.get(m).setValue(v);
        }
        mo122826p();
        if (this.f98819b.isEmpty() && !(this.f98819b instanceof ArrayList)) {
            this.f98819b = new ArrayList(this.f98818a);
        }
        int i = -(m + 1);
        if (i >= this.f98818a) {
            return mo122825o().put(k, v);
        }
        int size = this.f98819b.size();
        int i2 = this.f98818a;
        if (size == i2) {
            C39077w4 remove = this.f98819b.remove(i2 - 1);
            mo122825o().put(remove.mo123117g(), remove.getValue());
        }
        this.f98819b.add(i, new C39077w4(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f98822e == null) {
            this.f98822e = new C38868a5(this, (C39104z4) null);
        }
        return this.f98822e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38888c5)) {
            return super.equals(obj);
        }
        C38888c5 c5Var = (C38888c5) obj;
        int size = size();
        if (size != c5Var.size()) {
            return false;
        }
        int b = mo122812b();
        if (b != c5Var.mo122812b()) {
            return entrySet().equals(c5Var.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo122820h(i).equals(c5Var.mo122820h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f98820c.equals(c5Var.f98820c);
        }
        return true;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = mo122823m(comparable);
        if (m >= 0) {
            return this.f98819b.get(m).getValue();
        }
        return this.f98820c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo122820h(int i) {
        return this.f98819b.get(i);
    }

    public final int hashCode() {
        int b = mo122812b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f98819b.get(i2).hashCode();
        }
        if (this.f98820c.size() > 0) {
            return i + this.f98820c.hashCode();
        }
        return i;
    }

    /* renamed from: l */
    public final boolean mo122822l() {
        return this.f98821d;
    }

    /* renamed from: m */
    public final int mo122823m(K k) {
        int size = this.f98819b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f98819b.get(size).mo123117g());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f98819b.get(i2).mo123117g());
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

    /* renamed from: n */
    public final V mo122824n(int i) {
        mo122826p();
        V value = this.f98819b.remove(i).getValue();
        if (!this.f98820c.isEmpty()) {
            Iterator it = mo122825o().entrySet().iterator();
            List<C39077w4> list = this.f98819b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C39077w4(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    public final SortedMap<K, V> mo122825o() {
        mo122826p();
        if (this.f98820c.isEmpty() && !(this.f98820c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f98820c = treeMap;
            this.f98823f = treeMap.descendingMap();
        }
        return (SortedMap) this.f98820c;
    }

    /* renamed from: p */
    public final void mo122826p() {
        if (this.f98821d) {
            throw new UnsupportedOperationException();
        }
    }

    public final V remove(Object obj) {
        mo122826p();
        Comparable comparable = (Comparable) obj;
        int m = mo122823m(comparable);
        if (m >= 0) {
            return mo122824n(m);
        }
        if (this.f98820c.isEmpty()) {
            return null;
        }
        return this.f98820c.remove(comparable);
    }

    public final int size() {
        return this.f98819b.size() + this.f98820c.size();
    }
}
