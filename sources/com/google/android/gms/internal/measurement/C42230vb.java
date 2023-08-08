package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.vb */
public class C42230vb extends AbstractMap {

    /* renamed from: a */
    public final int f106466a;

    /* renamed from: b */
    public List f106467b = Collections.emptyList();

    /* renamed from: c */
    public Map f106468c = Collections.emptyMap();

    /* renamed from: d */
    public boolean f106469d;

    /* renamed from: e */
    public volatile C42196tb f106470e;

    /* renamed from: f */
    public Map f106471f = Collections.emptyMap();

    public /* synthetic */ C42230vb(int i, C42213ub ubVar) {
        this.f106466a = i;
    }

    /* renamed from: a */
    public void mo137087a() {
        Map map;
        Map map2;
        if (!this.f106469d) {
            if (this.f106468c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f106468c);
            }
            this.f106468c = map;
            if (this.f106471f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f106471f);
            }
            this.f106471f = map2;
            this.f106469d = true;
        }
    }

    /* renamed from: b */
    public final int mo137373b() {
        return this.f106467b.size();
    }

    /* renamed from: c */
    public final Iterable mo137374c() {
        if (this.f106468c.isEmpty()) {
            return C42094nb.m170616a();
        }
        return this.f106468c.entrySet();
    }

    public final void clear() {
        mo137387p();
        if (!this.f106467b.isEmpty()) {
            this.f106467b.clear();
        }
        if (!this.f106468c.isEmpty()) {
            this.f106468c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo137384m(comparable) >= 0 || this.f106468c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        mo137387p();
        int m = mo137384m(comparable);
        if (m >= 0) {
            return ((C42128pb) this.f106467b.get(m)).setValue(obj);
        }
        mo137387p();
        if (this.f106467b.isEmpty() && !(this.f106467b instanceof ArrayList)) {
            this.f106467b = new ArrayList(this.f106466a);
        }
        int i = -(m + 1);
        if (i >= this.f106466a) {
            return mo137386o().put(comparable, obj);
        }
        int size = this.f106467b.size();
        int i2 = this.f106466a;
        if (size == i2) {
            C42128pb pbVar = (C42128pb) this.f106467b.remove(i2 - 1);
            mo137386o().put(pbVar.mo137219g(), pbVar.getValue());
        }
        this.f106467b.add(i, new C42128pb(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f106470e == null) {
            this.f106470e = new C42196tb(this, (C42179sb) null);
        }
        return this.f106470e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42230vb)) {
            return super.equals(obj);
        }
        C42230vb vbVar = (C42230vb) obj;
        int size = size();
        if (size != vbVar.size()) {
            return false;
        }
        int b = mo137373b();
        if (b != vbVar.mo137373b()) {
            return entrySet().equals(vbVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo137381h(i).equals(vbVar.mo137381h(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f106468c.equals(vbVar.f106468c);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = mo137384m(comparable);
        if (m >= 0) {
            return ((C42128pb) this.f106467b.get(m)).getValue();
        }
        return this.f106468c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo137381h(int i) {
        return (Map.Entry) this.f106467b.get(i);
    }

    public final int hashCode() {
        int b = mo137373b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C42128pb) this.f106467b.get(i2)).hashCode();
        }
        if (this.f106468c.size() > 0) {
            return i + this.f106468c.hashCode();
        }
        return i;
    }

    /* renamed from: l */
    public final boolean mo137383l() {
        return this.f106469d;
    }

    /* renamed from: m */
    public final int mo137384m(Comparable comparable) {
        int size = this.f106467b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C42128pb) this.f106467b.get(size)).mo137219g());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C42128pb) this.f106467b.get(i2)).mo137219g());
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
    public final Object mo137385n(int i) {
        mo137387p();
        Object value = ((C42128pb) this.f106467b.remove(i)).getValue();
        if (!this.f106468c.isEmpty()) {
            Iterator it = mo137386o().entrySet().iterator();
            List list = this.f106467b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C42128pb(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    public final SortedMap mo137386o() {
        mo137387p();
        if (this.f106468c.isEmpty() && !(this.f106468c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f106468c = treeMap;
            this.f106471f = treeMap.descendingMap();
        }
        return (SortedMap) this.f106468c;
    }

    /* renamed from: p */
    public final void mo137387p() {
        if (this.f106469d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        mo137387p();
        Comparable comparable = (Comparable) obj;
        int m = mo137384m(comparable);
        if (m >= 0) {
            return mo137385n(m);
        }
        if (this.f106468c.isEmpty()) {
            return null;
        }
        return this.f106468c.remove(comparable);
    }

    public final int size() {
        return this.f106467b.size() + this.f106468c.size();
    }
}
