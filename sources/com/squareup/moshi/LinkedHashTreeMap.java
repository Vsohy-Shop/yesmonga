package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    public static final Comparator<Comparable> f86867a = new C35352a();

    /* renamed from: b */
    public static final /* synthetic */ boolean f86868b = false;
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final C35360g<K, V> header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    C35360g<K, V>[] table;
    int threshold;

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C35352a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C35353b<K, V> {

        /* renamed from: a */
        public C35360g<K, V> f86869a;

        /* renamed from: b */
        public int f86870b;

        /* renamed from: c */
        public int f86871c;

        /* renamed from: d */
        public int f86872d;

        /* renamed from: a */
        public void mo105918a(C35360g<K, V> gVar) {
            gVar.f86884c = null;
            gVar.f86882a = null;
            gVar.f86883b = null;
            gVar.f86890w = 1;
            int i = this.f86870b;
            if (i > 0) {
                int i2 = this.f86872d;
                if ((i2 & 1) == 0) {
                    this.f86872d = i2 + 1;
                    this.f86870b = i - 1;
                    this.f86871c++;
                }
            }
            gVar.f86882a = this.f86869a;
            this.f86869a = gVar;
            int i3 = this.f86872d + 1;
            this.f86872d = i3;
            int i4 = this.f86870b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f86872d = i3 + 1;
                this.f86870b = i4 - 1;
                this.f86871c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f86872d & i6) == i6) {
                    int i7 = this.f86871c;
                    if (i7 == 0) {
                        C35360g<K, V> gVar2 = this.f86869a;
                        C35360g<K, V> gVar3 = gVar2.f86882a;
                        C35360g<K, V> gVar4 = gVar3.f86882a;
                        gVar3.f86882a = gVar4.f86882a;
                        this.f86869a = gVar3;
                        gVar3.f86883b = gVar4;
                        gVar3.f86884c = gVar2;
                        gVar3.f86890w = gVar2.f86890w + 1;
                        gVar4.f86882a = gVar3;
                        gVar2.f86882a = gVar3;
                    } else if (i7 == 1) {
                        C35360g<K, V> gVar5 = this.f86869a;
                        C35360g<K, V> gVar6 = gVar5.f86882a;
                        this.f86869a = gVar6;
                        gVar6.f86884c = gVar5;
                        gVar6.f86890w = gVar5.f86890w + 1;
                        gVar5.f86882a = gVar6;
                        this.f86871c = 0;
                    } else if (i7 == 2) {
                        this.f86871c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo105919b(int i) {
            this.f86870b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f86872d = 0;
            this.f86871c = 0;
            this.f86869a = null;
        }

        /* renamed from: c */
        public C35360g<K, V> mo105920c() {
            C35360g<K, V> gVar = this.f86869a;
            if (gVar.f86882a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public static class C35354c<K, V> {

        /* renamed from: a */
        public C35360g<K, V> f86873a;

        /* renamed from: a */
        public C35360g<K, V> mo105921a() {
            C35360g<K, V> gVar = this.f86873a;
            if (gVar == null) {
                return null;
            }
            C35360g<K, V> gVar2 = gVar.f86882a;
            gVar.f86882a = null;
            C35360g<K, V> gVar3 = gVar.f86884c;
            while (true) {
                C35360g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C35360g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f86882a = gVar5;
                    gVar3 = gVar2.f86883b;
                } else {
                    this.f86873a = gVar5;
                    return gVar;
                }
            }
        }

        /* renamed from: b */
        public void mo105922b(C35360g<K, V> gVar) {
            C35360g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f86882a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f86883b;
            }
            this.f86873a = gVar2;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C35355d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class C35356a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            public C35356a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return mo105936b();
            }
        }

        public C35355d() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.mo105902e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C35356a();
        }

        public boolean remove(Object obj) {
            C35360g e;
            if (!(obj instanceof Map.Entry) || (e = LinkedHashTreeMap.this.mo105902e((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.mo105907i(e, true);
            return true;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public final class C35357e extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e$a */
        public class C35358a extends LinkedHashTreeMap<K, V>.f<K> {
            public C35358a() {
                super();
            }

            public K next() {
                return mo105936b().f86887f;
            }
        }

        public C35357e() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C35358a();
        }

        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.mo105908j(obj) != null;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public abstract class C35359f<T> implements Iterator<T> {

        /* renamed from: a */
        public C35360g<K, V> f86878a;

        /* renamed from: b */
        public C35360g<K, V> f86879b = null;

        /* renamed from: c */
        public int f86880c;

        public C35359f() {
            this.f86878a = LinkedHashTreeMap.this.header.f86885d;
            this.f86880c = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: b */
        public final C35360g<K, V> mo105936b() {
            C35360g<K, V> gVar = this.f86878a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f86880c) {
                this.f86878a = gVar.f86885d;
                this.f86879b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f86878a != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C35360g<K, V> gVar = this.f86879b;
            if (gVar != null) {
                LinkedHashTreeMap.this.mo105907i(gVar, true);
                this.f86879b = null;
                this.f86880c = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this((Comparator) null);
    }

    /* renamed from: b */
    public static <K, V> C35360g<K, V>[] m145737b(C35360g<K, V>[] gVarArr) {
        C35360g<K, V> gVar;
        int length = gVarArr.length;
        C35360g<K, V>[] gVarArr2 = new C35360g[(length * 2)];
        C35354c cVar = new C35354c();
        C35353b bVar = new C35353b();
        C35353b bVar2 = new C35353b();
        for (int i = 0; i < length; i++) {
            C35360g<K, V> gVar2 = gVarArr[i];
            if (gVar2 != null) {
                cVar.mo105922b(gVar2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C35360g a = cVar.mo105921a();
                    if (a == null) {
                        break;
                    } else if ((a.f86888g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo105919b(i2);
                bVar2.mo105919b(i3);
                cVar.mo105922b(gVar2);
                while (true) {
                    C35360g a2 = cVar.mo105921a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f86888g & length) == 0) {
                        bVar.mo105918a(a2);
                    } else {
                        bVar2.mo105918a(a2);
                    }
                }
                C35360g<K, V> gVar3 = null;
                if (i2 > 0) {
                    gVar = bVar.mo105920c();
                } else {
                    gVar = null;
                }
                gVarArr2[i] = gVar;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar3 = bVar2.mo105920c();
                }
                gVarArr2[i4] = gVar3;
            }
        }
        return gVarArr2;
    }

    /* renamed from: o */
    public static int m145738o(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void mo105897a() {
        C35360g<K, V>[] b = m145737b(this.table);
        this.table = b;
        this.threshold = (b.length / 2) + (b.length / 4);
    }

    /* renamed from: c */
    public final boolean mo105898c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C35360g<K, V> gVar = this.header;
        C35360g<K, V> gVar2 = gVar.f86885d;
        while (gVar2 != gVar) {
            C35360g<K, V> gVar3 = gVar2.f86885d;
            gVar2.f86886e = null;
            gVar2.f86885d = null;
            gVar2 = gVar3;
        }
        gVar.f86886e = gVar;
        gVar.f86885d = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo105904f(obj) != null;
    }

    /* renamed from: d */
    public C35360g<K, V> mo105901d(K k, boolean z) {
        int i;
        C35360g<K, V> gVar;
        Comparable comparable;
        C35360g<K, V> gVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C35360g<K, V>[] gVarArr = this.table;
        int o = m145738o(k.hashCode());
        int length = (gVarArr.length - 1) & o;
        C35360g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator2 == f86867a) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(gVar3.f86887f);
                } else {
                    i = comparator2.compare(k, gVar3.f86887f);
                }
                if (i == 0) {
                    return gVar3;
                }
                if (i < 0) {
                    gVar2 = gVar3.f86883b;
                } else {
                    gVar2 = gVar3.f86884c;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i = 0;
        }
        C35360g<K, V> gVar4 = gVar3;
        int i2 = i;
        if (!z) {
            return null;
        }
        C35360g<K, V> gVar5 = this.header;
        if (gVar4 != null) {
            gVar = new C35360g<>(gVar4, k, o, gVar5, gVar5.f86886e);
            if (i2 < 0) {
                gVar4.f86883b = gVar;
            } else {
                gVar4.f86884c = gVar;
            }
            mo105906h(gVar4, true);
        } else if (comparator2 != f86867a || (k instanceof Comparable)) {
            gVar = new C35360g<>(gVar4, k, o, gVar5, gVar5.f86886e);
            gVarArr[length] = gVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            mo105897a();
        }
        this.modCount++;
        return gVar;
    }

    /* renamed from: e */
    public C35360g<K, V> mo105902e(Map.Entry<?, ?> entry) {
        boolean z;
        C35360g<K, V> f = mo105904f(entry.getKey());
        if (f == null || !mo105898c(f.f86889v, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return f;
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new C35355d();
        this.entrySet = dVar2;
        return dVar2;
    }

    /* renamed from: f */
    public C35360g<K, V> mo105904f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo105901d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C35360g f = mo105904f(obj);
        if (f != null) {
            return f.f86889v;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo105906h(C35360g<K, V> gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (gVar != null) {
            C35360g<K, V> gVar2 = gVar.f86883b;
            C35360g<K, V> gVar3 = gVar.f86884c;
            int i5 = 0;
            if (gVar2 != null) {
                i = gVar2.f86890w;
            } else {
                i = 0;
            }
            if (gVar3 != null) {
                i2 = gVar3.f86890w;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C35360g<K, V> gVar4 = gVar3.f86883b;
                C35360g<K, V> gVar5 = gVar3.f86884c;
                if (gVar5 != null) {
                    i4 = gVar5.f86890w;
                } else {
                    i4 = 0;
                }
                if (gVar4 != null) {
                    i5 = gVar4.f86890w;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    mo105911m(gVar);
                } else {
                    mo105912n(gVar3);
                    mo105911m(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C35360g<K, V> gVar6 = gVar2.f86883b;
                C35360g<K, V> gVar7 = gVar2.f86884c;
                if (gVar7 != null) {
                    i3 = gVar7.f86890w;
                } else {
                    i3 = 0;
                }
                if (gVar6 != null) {
                    i5 = gVar6.f86890w;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo105912n(gVar);
                } else {
                    mo105911m(gVar2);
                    mo105912n(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.f86890w = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f86890w = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f86882a;
        }
    }

    /* renamed from: i */
    public void mo105907i(C35360g<K, V> gVar, boolean z) {
        C35360g<K, V> gVar2;
        int i;
        if (z) {
            C35360g<K, V> gVar3 = gVar.f86886e;
            gVar3.f86885d = gVar.f86885d;
            gVar.f86885d.f86886e = gVar3;
            gVar.f86886e = null;
            gVar.f86885d = null;
        }
        C35360g<K, V> gVar4 = gVar.f86883b;
        C35360g<K, V> gVar5 = gVar.f86884c;
        C35360g<K, V> gVar6 = gVar.f86882a;
        int i2 = 0;
        if (gVar4 == null || gVar5 == null) {
            if (gVar4 != null) {
                mo105910l(gVar, gVar4);
                gVar.f86883b = null;
            } else if (gVar5 != null) {
                mo105910l(gVar, gVar5);
                gVar.f86884c = null;
            } else {
                mo105910l(gVar, (C35360g<K, V>) null);
            }
            mo105906h(gVar6, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (gVar4.f86890w > gVar5.f86890w) {
            gVar2 = gVar4.mo105940b();
        } else {
            gVar2 = gVar5.mo105939a();
        }
        mo105907i(gVar2, false);
        C35360g<K, V> gVar7 = gVar.f86883b;
        if (gVar7 != null) {
            i = gVar7.f86890w;
            gVar2.f86883b = gVar7;
            gVar7.f86882a = gVar2;
            gVar.f86883b = null;
        } else {
            i = 0;
        }
        C35360g<K, V> gVar8 = gVar.f86884c;
        if (gVar8 != null) {
            i2 = gVar8.f86890w;
            gVar2.f86884c = gVar8;
            gVar8.f86882a = gVar2;
            gVar.f86884c = null;
        }
        gVar2.f86890w = Math.max(i, i2) + 1;
        mo105910l(gVar, gVar2);
    }

    /* renamed from: j */
    public C35360g<K, V> mo105908j(Object obj) {
        C35360g<K, V> f = mo105904f(obj);
        if (f != null) {
            mo105907i(f, true);
        }
        return f;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new C35357e();
        this.keySet = eVar2;
        return eVar2;
    }

    /* renamed from: l */
    public final void mo105910l(C35360g<K, V> gVar, C35360g<K, V> gVar2) {
        C35360g<K, V> gVar3 = gVar.f86882a;
        gVar.f86882a = null;
        if (gVar2 != null) {
            gVar2.f86882a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f86888g;
            C35360g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f86883b == gVar) {
            gVar3.f86883b = gVar2;
        } else {
            gVar3.f86884c = gVar2;
        }
    }

    /* renamed from: m */
    public final void mo105911m(C35360g<K, V> gVar) {
        int i;
        int i2;
        C35360g<K, V> gVar2 = gVar.f86883b;
        C35360g<K, V> gVar3 = gVar.f86884c;
        C35360g<K, V> gVar4 = gVar3.f86883b;
        C35360g<K, V> gVar5 = gVar3.f86884c;
        gVar.f86884c = gVar4;
        if (gVar4 != null) {
            gVar4.f86882a = gVar;
        }
        mo105910l(gVar, gVar3);
        gVar3.f86883b = gVar;
        gVar.f86882a = gVar3;
        int i3 = 0;
        if (gVar2 != null) {
            i = gVar2.f86890w;
        } else {
            i = 0;
        }
        if (gVar4 != null) {
            i2 = gVar4.f86890w;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f86890w = max;
        if (gVar5 != null) {
            i3 = gVar5.f86890w;
        }
        gVar3.f86890w = Math.max(max, i3) + 1;
    }

    /* renamed from: n */
    public final void mo105912n(C35360g<K, V> gVar) {
        int i;
        int i2;
        C35360g<K, V> gVar2 = gVar.f86883b;
        C35360g<K, V> gVar3 = gVar.f86884c;
        C35360g<K, V> gVar4 = gVar2.f86883b;
        C35360g<K, V> gVar5 = gVar2.f86884c;
        gVar.f86883b = gVar5;
        if (gVar5 != null) {
            gVar5.f86882a = gVar;
        }
        mo105910l(gVar, gVar2);
        gVar2.f86884c = gVar;
        gVar.f86882a = gVar2;
        int i3 = 0;
        if (gVar3 != null) {
            i = gVar3.f86890w;
        } else {
            i = 0;
        }
        if (gVar5 != null) {
            i2 = gVar5.f86890w;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f86890w = max;
        if (gVar4 != null) {
            i3 = gVar4.f86890w;
        }
        gVar2.f86890w = Math.max(max, i3) + 1;
    }

    public V put(K k, V v) {
        if (k != null) {
            C35360g d = mo105901d(k, true);
            V v2 = d.f86889v;
            d.f86889v = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C35360g j = mo105908j(obj);
        if (j != null) {
            return j.f86889v;
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f86867a : comparator2;
        this.header = new C35360g<>();
        C35360g<K, V>[] gVarArr = new C35360g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$g */
    public static final class C35360g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C35360g<K, V> f86882a;

        /* renamed from: b */
        public C35360g<K, V> f86883b;

        /* renamed from: c */
        public C35360g<K, V> f86884c;

        /* renamed from: d */
        public C35360g<K, V> f86885d;

        /* renamed from: e */
        public C35360g<K, V> f86886e;

        /* renamed from: f */
        public final K f86887f;

        /* renamed from: g */
        public final int f86888g;

        /* renamed from: v */
        public V f86889v;

        /* renamed from: w */
        public int f86890w;

        public C35360g() {
            this.f86887f = null;
            this.f86888g = -1;
            this.f86886e = this;
            this.f86885d = this;
        }

        /* renamed from: a */
        public C35360g<K, V> mo105939a() {
            C35360g<K, V> gVar = this;
            for (C35360g<K, V> gVar2 = this.f86883b; gVar2 != null; gVar2 = gVar2.f86883b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C35360g<K, V> mo105940b() {
            C35360g<K, V> gVar = this;
            for (C35360g<K, V> gVar2 = this.f86884c; gVar2 != null; gVar2 = gVar2.f86884c) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f86887f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f86889v
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.C35360g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f86887f;
        }

        public V getValue() {
            return this.f86889v;
        }

        public int hashCode() {
            K k = this.f86887f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f86889v;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f86889v;
            this.f86889v = v;
            return v2;
        }

        public String toString() {
            return this.f86887f + "=" + this.f86889v;
        }

        public C35360g(C35360g<K, V> gVar, K k, int i, C35360g<K, V> gVar2, C35360g<K, V> gVar3) {
            this.f86882a = gVar;
            this.f86887f = k;
            this.f86888g = i;
            this.f86890w = 1;
            this.f86885d = gVar2;
            this.f86886e = gVar3;
            gVar3.f86885d = this;
            gVar2.f86886e = this;
        }
    }
}
