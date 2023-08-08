package androidx.arch.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.internal.b */
public class C0836b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public C0839c<K, V> f2661a;

    /* renamed from: b */
    public C0839c<K, V> f2662b;

    /* renamed from: c */
    public final WeakHashMap<C0842f<K, V>, Boolean> f2663c = new WeakHashMap<>();

    /* renamed from: d */
    public int f2664d = 0;

    /* renamed from: androidx.arch.core.internal.b$a */
    public static class C0837a<K, V> extends C0841e<K, V> {
        public C0837a(C0839c<K, V> cVar, C0839c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: c */
        public C0839c<K, V> mo3816c(C0839c<K, V> cVar) {
            return cVar.f2668d;
        }

        /* renamed from: d */
        public C0839c<K, V> mo3817d(C0839c<K, V> cVar) {
            return cVar.f2667c;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$b */
    public static class C0838b<K, V> extends C0841e<K, V> {
        public C0838b(C0839c<K, V> cVar, C0839c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: c */
        public C0839c<K, V> mo3816c(C0839c<K, V> cVar) {
            return cVar.f2667c;
        }

        /* renamed from: d */
        public C0839c<K, V> mo3817d(C0839c<K, V> cVar) {
            return cVar.f2668d;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$c */
    public static class C0839c<K, V> implements Map.Entry<K, V> {
        @C0359n0

        /* renamed from: a */
        public final K f2665a;
        @C0359n0

        /* renamed from: b */
        public final V f2666b;

        /* renamed from: c */
        public C0839c<K, V> f2667c;

        /* renamed from: d */
        public C0839c<K, V> f2668d;

        public C0839c(@C0359n0 K k, @C0359n0 V v) {
            this.f2665a = k;
            this.f2666b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0839c)) {
                return false;
            }
            C0839c cVar = (C0839c) obj;
            if (!this.f2665a.equals(cVar.f2665a) || !this.f2666b.equals(cVar.f2666b)) {
                return false;
            }
            return true;
        }

        @C0359n0
        public K getKey() {
            return this.f2665a;
        }

        @C0359n0
        public V getValue() {
            return this.f2666b;
        }

        public int hashCode() {
            return this.f2665a.hashCode() ^ this.f2666b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2665a + "=" + this.f2666b;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.arch.core.internal.b$d */
    public class C0840d extends C0842f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C0839c<K, V> f2669a;

        /* renamed from: b */
        public boolean f2670b = true;

        public C0840d() {
        }

        /* renamed from: b */
        public void mo3824b(@C0359n0 C0839c<K, V> cVar) {
            boolean z;
            C0839c<K, V> cVar2 = this.f2669a;
            if (cVar == cVar2) {
                C0839c<K, V> cVar3 = cVar2.f2668d;
                this.f2669a = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f2670b = z;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            C0839c<K, V> cVar;
            if (this.f2670b) {
                this.f2670b = false;
                this.f2669a = C0836b.this.f2661a;
            } else {
                C0839c<K, V> cVar2 = this.f2669a;
                if (cVar2 != null) {
                    cVar = cVar2.f2667c;
                } else {
                    cVar = null;
                }
                this.f2669a = cVar;
            }
            return this.f2669a;
        }

        public boolean hasNext() {
            if (!this.f2670b) {
                C0839c<K, V> cVar = this.f2669a;
                if (cVar == null || cVar.f2667c == null) {
                    return false;
                }
                return true;
            } else if (C0836b.this.f2661a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.arch.core.internal.b$e */
    public static abstract class C0841e<K, V> extends C0842f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C0839c<K, V> f2672a;

        /* renamed from: b */
        public C0839c<K, V> f2673b;

        public C0841e(C0839c<K, V> cVar, C0839c<K, V> cVar2) {
            this.f2672a = cVar2;
            this.f2673b = cVar;
        }

        /* renamed from: b */
        public void mo3824b(@C0359n0 C0839c<K, V> cVar) {
            if (this.f2672a == cVar && cVar == this.f2673b) {
                this.f2673b = null;
                this.f2672a = null;
            }
            C0839c<K, V> cVar2 = this.f2672a;
            if (cVar2 == cVar) {
                this.f2672a = mo3816c(cVar2);
            }
            if (this.f2673b == cVar) {
                this.f2673b = mo3829f();
            }
        }

        /* renamed from: c */
        public abstract C0839c<K, V> mo3816c(C0839c<K, V> cVar);

        /* renamed from: d */
        public abstract C0839c<K, V> mo3817d(C0839c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C0839c<K, V> cVar = this.f2673b;
            this.f2673b = mo3829f();
            return cVar;
        }

        /* renamed from: f */
        public final C0839c<K, V> mo3829f() {
            C0839c<K, V> cVar = this.f2673b;
            C0839c<K, V> cVar2 = this.f2672a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo3817d(cVar);
        }

        public boolean hasNext() {
            return this.f2673b != null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.arch.core.internal.b$f */
    public static abstract class C0842f<K, V> {
        /* renamed from: b */
        public abstract void mo3824b(@C0359n0 C0839c<K, V> cVar);
    }

    @C0359n0
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0838b bVar = new C0838b(this.f2662b, this.f2661a);
        this.f2663c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    @C0363p0
    /* renamed from: e */
    public Map.Entry<K, V> mo3807e() {
        return this.f2661a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0836b)) {
            return false;
        }
        C0836b bVar = (C0836b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: h */
    public C0839c<K, V> mo3802h(K k) {
        C0839c<K, V> cVar = this.f2661a;
        while (cVar != null && !cVar.f2665a.equals(k)) {
            cVar = cVar.f2667c;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    @C0359n0
    /* renamed from: i */
    public C0836b<K, V>.d mo3810i() {
        C0836b<K, V>.d dVar = new C0840d();
        this.f2663c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @C0359n0
    public Iterator<Map.Entry<K, V>> iterator() {
        C0837a aVar = new C0837a(this.f2661a, this.f2662b);
        this.f2663c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    @C0363p0
    /* renamed from: k */
    public Map.Entry<K, V> mo3812k() {
        return this.f2662b;
    }

    /* renamed from: q */
    public C0839c<K, V> mo3813q(@C0359n0 K k, @C0359n0 V v) {
        C0839c<K, V> cVar = new C0839c<>(k, v);
        this.f2664d++;
        C0839c<K, V> cVar2 = this.f2662b;
        if (cVar2 == null) {
            this.f2661a = cVar;
            this.f2662b = cVar;
            return cVar;
        }
        cVar2.f2667c = cVar;
        cVar.f2668d = cVar2;
        this.f2662b = cVar;
        return cVar;
    }

    /* renamed from: r */
    public V mo3803r(@C0359n0 K k, @C0359n0 V v) {
        C0839c h = mo3802h(k);
        if (h != null) {
            return h.f2666b;
        }
        mo3813q(k, v);
        return null;
    }

    public int size() {
        return this.f2664d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: w */
    public V mo3804w(@C0359n0 K k) {
        C0839c h = mo3802h(k);
        if (h == null) {
            return null;
        }
        this.f2664d--;
        if (!this.f2663c.isEmpty()) {
            for (C0842f<K, V> b : this.f2663c.keySet()) {
                b.mo3824b(h);
            }
        }
        C0839c<K, V> cVar = h.f2668d;
        if (cVar != null) {
            cVar.f2667c = h.f2667c;
        } else {
            this.f2661a = h.f2667c;
        }
        C0839c<K, V> cVar2 = h.f2667c;
        if (cVar2 != null) {
            cVar2.f2668d = cVar;
        } else {
            this.f2662b = cVar;
        }
        h.f2667c = null;
        h.f2668d = null;
        return h.f2666b;
    }
}
