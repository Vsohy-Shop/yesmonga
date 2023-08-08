package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.g */
public class C29245g<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f71248a;

    /* renamed from: b */
    public List<q10> f71249b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f71250c = Collections.emptyMap();

    /* renamed from: d */
    public boolean f71251d;

    /* renamed from: e */
    public volatile C29171e f71252e;

    /* renamed from: f */
    public Map<K, V> f71253f = Collections.emptyMap();

    public /* synthetic */ C29245g(int i, C29208f fVar) {
        this.f71248a = i;
    }

    /* renamed from: a */
    public void mo84615a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f71251d) {
            if (this.f71250c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f71250c);
            }
            this.f71250c = map;
            if (this.f71253f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f71253f);
            }
            this.f71253f = map2;
            this.f71251d = true;
        }
    }

    /* renamed from: b */
    public final int mo84616b() {
        return this.f71249b.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo84617c() {
        if (this.f71250c.isEmpty()) {
            return p10.m120859a();
        }
        return this.f71250c.entrySet();
    }

    public final void clear() {
        mo84630p();
        if (!this.f71249b.isEmpty()) {
            this.f71249b.clear();
        }
        if (!this.f71250c.isEmpty()) {
            this.f71250c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo84627m(comparable) >= 0 || this.f71250c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        mo84630p();
        int m = mo84627m(k);
        if (m >= 0) {
            return this.f71249b.get(m).setValue(v);
        }
        mo84630p();
        if (this.f71249b.isEmpty() && !(this.f71249b instanceof ArrayList)) {
            this.f71249b = new ArrayList(this.f71248a);
        }
        int i = -(m + 1);
        if (i >= this.f71248a) {
            return mo84629o().put(k, v);
        }
        int size = this.f71249b.size();
        int i2 = this.f71248a;
        if (size == i2) {
            q10 remove = this.f71249b.remove(i2 - 1);
            mo84629o().put(remove.mo84797g(), remove.getValue());
        }
        this.f71249b.add(i, new q10(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f71252e == null) {
            this.f71252e = new C29171e(this, (C29134d) null);
        }
        return this.f71252e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29245g)) {
            return super.equals(obj);
        }
        C29245g gVar = (C29245g) obj;
        int size = size();
        if (size != gVar.size()) {
            return false;
        }
        int b = mo84616b();
        if (b != gVar.mo84616b()) {
            return entrySet().equals(gVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo84624h(i).equals(gVar.mo84624h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f71250c.equals(gVar.f71250c);
        }
        return true;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = mo84627m(comparable);
        if (m >= 0) {
            return this.f71249b.get(m).getValue();
        }
        return this.f71250c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo84624h(int i) {
        return this.f71249b.get(i);
    }

    public final int hashCode() {
        int b = mo84616b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f71249b.get(i2).hashCode();
        }
        if (this.f71250c.size() > 0) {
            return i + this.f71250c.hashCode();
        }
        return i;
    }

    /* renamed from: l */
    public final boolean mo84626l() {
        return this.f71251d;
    }

    /* renamed from: m */
    public final int mo84627m(K k) {
        int size = this.f71249b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f71249b.get(size).mo84797g());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f71249b.get(i2).mo84797g());
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
    public final V mo84628n(int i) {
        mo84630p();
        V value = this.f71249b.remove(i).getValue();
        if (!this.f71250c.isEmpty()) {
            Iterator it = mo84629o().entrySet().iterator();
            List<q10> list = this.f71249b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new q10(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    public final SortedMap<K, V> mo84629o() {
        mo84630p();
        if (this.f71250c.isEmpty() && !(this.f71250c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f71250c = treeMap;
            this.f71253f = treeMap.descendingMap();
        }
        return (SortedMap) this.f71250c;
    }

    /* renamed from: p */
    public final void mo84630p() {
        if (this.f71251d) {
            throw new UnsupportedOperationException();
        }
    }

    public final V remove(Object obj) {
        mo84630p();
        Comparable comparable = (Comparable) obj;
        int m = mo84627m(comparable);
        if (m >= 0) {
            return mo84628n(m);
        }
        if (this.f71250c.isEmpty()) {
            return null;
        }
        return this.f71250c.remove(comparable);
    }

    public final int size() {
        return this.f71249b.size() + this.f71250c.size();
    }
}
