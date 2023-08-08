package com.google.android.gms.internal.gtm;

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

/* renamed from: com.google.android.gms.internal.gtm.vl */
public class C41652vl<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f105174a;

    /* renamed from: b */
    public List<C41508pl> f105175b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f105176c = Collections.emptyMap();

    /* renamed from: d */
    public boolean f105177d;

    /* renamed from: e */
    public volatile C41604tl f105178e;

    /* renamed from: f */
    public Map<K, V> f105179f = Collections.emptyMap();

    public /* synthetic */ C41652vl(int i, C41628ul ulVar) {
        this.f105174a = i;
    }

    /* renamed from: a */
    public void mo135633a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f105177d) {
            if (this.f105176c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f105176c);
            }
            this.f105176c = map;
            if (this.f105179f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f105179f);
            }
            this.f105179f = map2;
            this.f105177d = true;
        }
    }

    /* renamed from: b */
    public final int mo135988b() {
        return this.f105175b.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo135989c() {
        if (this.f105176c.isEmpty()) {
            return C41484ol.m168123a();
        }
        return this.f105176c.entrySet();
    }

    public final void clear() {
        mo136002p();
        if (!this.f105175b.isEmpty()) {
            this.f105175b.clear();
        }
        if (!this.f105176c.isEmpty()) {
            this.f105176c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo135999m(comparable) >= 0 || this.f105176c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        mo136002p();
        int m = mo135999m(k);
        if (m >= 0) {
            return this.f105175b.get(m).setValue(v);
        }
        mo136002p();
        if (this.f105175b.isEmpty() && !(this.f105175b instanceof ArrayList)) {
            this.f105175b = new ArrayList(this.f105174a);
        }
        int i = -(m + 1);
        if (i >= this.f105174a) {
            return mo136001o().put(k, v);
        }
        int size = this.f105175b.size();
        int i2 = this.f105174a;
        if (size == i2) {
            C41508pl remove = this.f105175b.remove(i2 - 1);
            mo136001o().put(remove.mo135725g(), remove.getValue());
        }
        this.f105175b.add(i, new C41508pl(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f105178e == null) {
            this.f105178e = new C41604tl(this, (C41580sl) null);
        }
        return this.f105178e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41652vl)) {
            return super.equals(obj);
        }
        C41652vl vlVar = (C41652vl) obj;
        int size = size();
        if (size != vlVar.size()) {
            return false;
        }
        int b = mo135988b();
        if (b != vlVar.mo135988b()) {
            return entrySet().equals(vlVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo135996h(i).equals(vlVar.mo135996h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f105176c.equals(vlVar.f105176c);
        }
        return true;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = mo135999m(comparable);
        if (m >= 0) {
            return this.f105175b.get(m).getValue();
        }
        return this.f105176c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo135996h(int i) {
        return this.f105175b.get(i);
    }

    public final int hashCode() {
        int b = mo135988b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f105175b.get(i2).hashCode();
        }
        if (this.f105176c.size() > 0) {
            return i + this.f105176c.hashCode();
        }
        return i;
    }

    /* renamed from: l */
    public final boolean mo135998l() {
        return this.f105177d;
    }

    /* renamed from: m */
    public final int mo135999m(K k) {
        int size = this.f105175b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f105175b.get(size).mo135725g());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f105175b.get(i2).mo135725g());
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
    public final V mo136000n(int i) {
        mo136002p();
        V value = this.f105175b.remove(i).getValue();
        if (!this.f105176c.isEmpty()) {
            Iterator it = mo136001o().entrySet().iterator();
            List<C41508pl> list = this.f105175b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C41508pl(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    public final SortedMap<K, V> mo136001o() {
        mo136002p();
        if (this.f105176c.isEmpty() && !(this.f105176c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f105176c = treeMap;
            this.f105179f = treeMap.descendingMap();
        }
        return (SortedMap) this.f105176c;
    }

    /* renamed from: p */
    public final void mo136002p() {
        if (this.f105177d) {
            throw new UnsupportedOperationException();
        }
    }

    public final V remove(Object obj) {
        mo136002p();
        Comparable comparable = (Comparable) obj;
        int m = mo135999m(comparable);
        if (m >= 0) {
            return mo136000n(m);
        }
        if (this.f105176c.isEmpty()) {
            return null;
        }
        return this.f105176c.remove(comparable);
    }

    public final int size() {
        return this.f105175b.size() + this.f105176c.size();
    }
}
