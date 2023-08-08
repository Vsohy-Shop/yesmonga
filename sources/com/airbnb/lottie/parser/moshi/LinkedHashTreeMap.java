package com.airbnb.lottie.parser.moshi;

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
    public static final Comparator<Comparable> f55957a = new C21629a();

    /* renamed from: b */
    public static final /* synthetic */ boolean f55958b = false;
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final C21637g<K, V> header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    C21637g<K, V>[] table;
    int threshold;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$a */
    public class C21629a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$b */
    public static final class C21630b<K, V> {

        /* renamed from: a */
        public C21637g<K, V> f55959a;

        /* renamed from: b */
        public int f55960b;

        /* renamed from: c */
        public int f55961c;

        /* renamed from: d */
        public int f55962d;

        /* renamed from: a */
        public void mo64589a(C21637g<K, V> gVar) {
            gVar.f55974c = null;
            gVar.f55972a = null;
            gVar.f55973b = null;
            gVar.f55980w = 1;
            int i = this.f55960b;
            if (i > 0) {
                int i2 = this.f55962d;
                if ((i2 & 1) == 0) {
                    this.f55962d = i2 + 1;
                    this.f55960b = i - 1;
                    this.f55961c++;
                }
            }
            gVar.f55972a = this.f55959a;
            this.f55959a = gVar;
            int i3 = this.f55962d + 1;
            this.f55962d = i3;
            int i4 = this.f55960b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f55962d = i3 + 1;
                this.f55960b = i4 - 1;
                this.f55961c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f55962d & i6) == i6) {
                    int i7 = this.f55961c;
                    if (i7 == 0) {
                        C21637g<K, V> gVar2 = this.f55959a;
                        C21637g<K, V> gVar3 = gVar2.f55972a;
                        C21637g<K, V> gVar4 = gVar3.f55972a;
                        gVar3.f55972a = gVar4.f55972a;
                        this.f55959a = gVar3;
                        gVar3.f55973b = gVar4;
                        gVar3.f55974c = gVar2;
                        gVar3.f55980w = gVar2.f55980w + 1;
                        gVar4.f55972a = gVar3;
                        gVar2.f55972a = gVar3;
                    } else if (i7 == 1) {
                        C21637g<K, V> gVar5 = this.f55959a;
                        C21637g<K, V> gVar6 = gVar5.f55972a;
                        this.f55959a = gVar6;
                        gVar6.f55974c = gVar5;
                        gVar6.f55980w = gVar5.f55980w + 1;
                        gVar5.f55972a = gVar6;
                        this.f55961c = 0;
                    } else if (i7 == 2) {
                        this.f55961c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo64590b(int i) {
            this.f55960b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f55962d = 0;
            this.f55961c = 0;
            this.f55959a = null;
        }

        /* renamed from: c */
        public C21637g<K, V> mo64591c() {
            C21637g<K, V> gVar = this.f55959a;
            if (gVar.f55972a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$c */
    public static class C21631c<K, V> {

        /* renamed from: a */
        public C21637g<K, V> f55963a;

        /* renamed from: a */
        public C21637g<K, V> mo64592a() {
            C21637g<K, V> gVar = this.f55963a;
            if (gVar == null) {
                return null;
            }
            C21637g<K, V> gVar2 = gVar.f55972a;
            gVar.f55972a = null;
            C21637g<K, V> gVar3 = gVar.f55974c;
            while (true) {
                C21637g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C21637g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f55972a = gVar5;
                    gVar3 = gVar2.f55973b;
                } else {
                    this.f55963a = gVar5;
                    return gVar;
                }
            }
        }

        /* renamed from: b */
        public void mo64593b(C21637g<K, V> gVar) {
            C21637g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f55972a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f55973b;
            }
            this.f55963a = gVar2;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d */
    public final class C21632d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d$a */
        public class C21633a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            public C21633a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return mo64607b();
            }
        }

        public C21632d() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.mo64573e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C21633a();
        }

        public boolean remove(Object obj) {
            C21637g e;
            if (!(obj instanceof Map.Entry) || (e = LinkedHashTreeMap.this.mo64573e((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.mo64578i(e, true);
            return true;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e */
    public final class C21634e extends AbstractSet<K> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e$a */
        public class C21635a extends LinkedHashTreeMap<K, V>.f<K> {
            public C21635a() {
                super();
            }

            public K next() {
                return mo64607b().f55977f;
            }
        }

        public C21634e() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C21635a();
        }

        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.mo64579j(obj) != null;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$f */
    public abstract class C21636f<T> implements Iterator<T> {

        /* renamed from: a */
        public C21637g<K, V> f55968a;

        /* renamed from: b */
        public C21637g<K, V> f55969b = null;

        /* renamed from: c */
        public int f55970c;

        public C21636f() {
            this.f55968a = LinkedHashTreeMap.this.header.f55975d;
            this.f55970c = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: b */
        public final C21637g<K, V> mo64607b() {
            C21637g<K, V> gVar = this.f55968a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f55970c) {
                this.f55968a = gVar.f55975d;
                this.f55969b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f55968a != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C21637g<K, V> gVar = this.f55969b;
            if (gVar != null) {
                LinkedHashTreeMap.this.mo64578i(gVar, true);
                this.f55969b = null;
                this.f55970c = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this((Comparator) null);
    }

    /* renamed from: b */
    public static <K, V> C21637g<K, V>[] m99629b(C21637g<K, V>[] gVarArr) {
        C21637g<K, V> gVar;
        int length = gVarArr.length;
        C21637g<K, V>[] gVarArr2 = new C21637g[(length * 2)];
        C21631c cVar = new C21631c();
        C21630b bVar = new C21630b();
        C21630b bVar2 = new C21630b();
        for (int i = 0; i < length; i++) {
            C21637g<K, V> gVar2 = gVarArr[i];
            if (gVar2 != null) {
                cVar.mo64593b(gVar2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C21637g a = cVar.mo64592a();
                    if (a == null) {
                        break;
                    } else if ((a.f55978g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo64590b(i2);
                bVar2.mo64590b(i3);
                cVar.mo64593b(gVar2);
                while (true) {
                    C21637g a2 = cVar.mo64592a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f55978g & length) == 0) {
                        bVar.mo64589a(a2);
                    } else {
                        bVar2.mo64589a(a2);
                    }
                }
                C21637g<K, V> gVar3 = null;
                if (i2 > 0) {
                    gVar = bVar.mo64591c();
                } else {
                    gVar = null;
                }
                gVarArr2[i] = gVar;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar3 = bVar2.mo64591c();
                }
                gVarArr2[i4] = gVar3;
            }
        }
        return gVarArr2;
    }

    /* renamed from: o */
    public static int m99630o(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void mo64568a() {
        C21637g<K, V>[] b = m99629b(this.table);
        this.table = b;
        this.threshold = (b.length / 2) + (b.length / 4);
    }

    /* renamed from: c */
    public final boolean mo64569c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C21637g<K, V> gVar = this.header;
        C21637g<K, V> gVar2 = gVar.f55975d;
        while (gVar2 != gVar) {
            C21637g<K, V> gVar3 = gVar2.f55975d;
            gVar2.f55976e = null;
            gVar2.f55975d = null;
            gVar2 = gVar3;
        }
        gVar.f55976e = gVar;
        gVar.f55975d = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo64575f(obj) != null;
    }

    /* renamed from: d */
    public C21637g<K, V> mo64572d(K k, boolean z) {
        int i;
        C21637g<K, V> gVar;
        Comparable comparable;
        C21637g<K, V> gVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C21637g<K, V>[] gVarArr = this.table;
        int o = m99630o(k.hashCode());
        int length = (gVarArr.length - 1) & o;
        C21637g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator2 == f55957a) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(gVar3.f55977f);
                } else {
                    i = comparator2.compare(k, gVar3.f55977f);
                }
                if (i == 0) {
                    return gVar3;
                }
                if (i < 0) {
                    gVar2 = gVar3.f55973b;
                } else {
                    gVar2 = gVar3.f55974c;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i = 0;
        }
        C21637g<K, V> gVar4 = gVar3;
        int i2 = i;
        if (!z) {
            return null;
        }
        C21637g<K, V> gVar5 = this.header;
        if (gVar4 != null) {
            gVar = new C21637g<>(gVar4, k, o, gVar5, gVar5.f55976e);
            if (i2 < 0) {
                gVar4.f55973b = gVar;
            } else {
                gVar4.f55974c = gVar;
            }
            mo64577h(gVar4, true);
        } else if (comparator2 != f55957a || (k instanceof Comparable)) {
            gVar = new C21637g<>(gVar4, k, o, gVar5, gVar5.f55976e);
            gVarArr[length] = gVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            mo64568a();
        }
        this.modCount++;
        return gVar;
    }

    /* renamed from: e */
    public C21637g<K, V> mo64573e(Map.Entry<?, ?> entry) {
        boolean z;
        C21637g<K, V> f = mo64575f(entry.getKey());
        if (f == null || !mo64569c(f.f55979v, entry.getValue())) {
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
        LinkedHashTreeMap<K, V>.d dVar2 = new C21632d();
        this.entrySet = dVar2;
        return dVar2;
    }

    /* renamed from: f */
    public C21637g<K, V> mo64575f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo64572d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C21637g f = mo64575f(obj);
        if (f != null) {
            return f.f55979v;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo64577h(C21637g<K, V> gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (gVar != null) {
            C21637g<K, V> gVar2 = gVar.f55973b;
            C21637g<K, V> gVar3 = gVar.f55974c;
            int i5 = 0;
            if (gVar2 != null) {
                i = gVar2.f55980w;
            } else {
                i = 0;
            }
            if (gVar3 != null) {
                i2 = gVar3.f55980w;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C21637g<K, V> gVar4 = gVar3.f55973b;
                C21637g<K, V> gVar5 = gVar3.f55974c;
                if (gVar5 != null) {
                    i4 = gVar5.f55980w;
                } else {
                    i4 = 0;
                }
                if (gVar4 != null) {
                    i5 = gVar4.f55980w;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    mo64582m(gVar);
                } else {
                    mo64583n(gVar3);
                    mo64582m(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C21637g<K, V> gVar6 = gVar2.f55973b;
                C21637g<K, V> gVar7 = gVar2.f55974c;
                if (gVar7 != null) {
                    i3 = gVar7.f55980w;
                } else {
                    i3 = 0;
                }
                if (gVar6 != null) {
                    i5 = gVar6.f55980w;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo64583n(gVar);
                } else {
                    mo64582m(gVar2);
                    mo64583n(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.f55980w = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f55980w = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f55972a;
        }
    }

    /* renamed from: i */
    public void mo64578i(C21637g<K, V> gVar, boolean z) {
        C21637g<K, V> gVar2;
        int i;
        if (z) {
            C21637g<K, V> gVar3 = gVar.f55976e;
            gVar3.f55975d = gVar.f55975d;
            gVar.f55975d.f55976e = gVar3;
            gVar.f55976e = null;
            gVar.f55975d = null;
        }
        C21637g<K, V> gVar4 = gVar.f55973b;
        C21637g<K, V> gVar5 = gVar.f55974c;
        C21637g<K, V> gVar6 = gVar.f55972a;
        int i2 = 0;
        if (gVar4 == null || gVar5 == null) {
            if (gVar4 != null) {
                mo64581l(gVar, gVar4);
                gVar.f55973b = null;
            } else if (gVar5 != null) {
                mo64581l(gVar, gVar5);
                gVar.f55974c = null;
            } else {
                mo64581l(gVar, (C21637g<K, V>) null);
            }
            mo64577h(gVar6, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (gVar4.f55980w > gVar5.f55980w) {
            gVar2 = gVar4.mo64611b();
        } else {
            gVar2 = gVar5.mo64610a();
        }
        mo64578i(gVar2, false);
        C21637g<K, V> gVar7 = gVar.f55973b;
        if (gVar7 != null) {
            i = gVar7.f55980w;
            gVar2.f55973b = gVar7;
            gVar7.f55972a = gVar2;
            gVar.f55973b = null;
        } else {
            i = 0;
        }
        C21637g<K, V> gVar8 = gVar.f55974c;
        if (gVar8 != null) {
            i2 = gVar8.f55980w;
            gVar2.f55974c = gVar8;
            gVar8.f55972a = gVar2;
            gVar.f55974c = null;
        }
        gVar2.f55980w = Math.max(i, i2) + 1;
        mo64581l(gVar, gVar2);
    }

    /* renamed from: j */
    public C21637g<K, V> mo64579j(Object obj) {
        C21637g<K, V> f = mo64575f(obj);
        if (f != null) {
            mo64578i(f, true);
        }
        return f;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new C21634e();
        this.keySet = eVar2;
        return eVar2;
    }

    /* renamed from: l */
    public final void mo64581l(C21637g<K, V> gVar, C21637g<K, V> gVar2) {
        C21637g<K, V> gVar3 = gVar.f55972a;
        gVar.f55972a = null;
        if (gVar2 != null) {
            gVar2.f55972a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f55978g;
            C21637g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f55973b == gVar) {
            gVar3.f55973b = gVar2;
        } else {
            gVar3.f55974c = gVar2;
        }
    }

    /* renamed from: m */
    public final void mo64582m(C21637g<K, V> gVar) {
        int i;
        int i2;
        C21637g<K, V> gVar2 = gVar.f55973b;
        C21637g<K, V> gVar3 = gVar.f55974c;
        C21637g<K, V> gVar4 = gVar3.f55973b;
        C21637g<K, V> gVar5 = gVar3.f55974c;
        gVar.f55974c = gVar4;
        if (gVar4 != null) {
            gVar4.f55972a = gVar;
        }
        mo64581l(gVar, gVar3);
        gVar3.f55973b = gVar;
        gVar.f55972a = gVar3;
        int i3 = 0;
        if (gVar2 != null) {
            i = gVar2.f55980w;
        } else {
            i = 0;
        }
        if (gVar4 != null) {
            i2 = gVar4.f55980w;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f55980w = max;
        if (gVar5 != null) {
            i3 = gVar5.f55980w;
        }
        gVar3.f55980w = Math.max(max, i3) + 1;
    }

    /* renamed from: n */
    public final void mo64583n(C21637g<K, V> gVar) {
        int i;
        int i2;
        C21637g<K, V> gVar2 = gVar.f55973b;
        C21637g<K, V> gVar3 = gVar.f55974c;
        C21637g<K, V> gVar4 = gVar2.f55973b;
        C21637g<K, V> gVar5 = gVar2.f55974c;
        gVar.f55973b = gVar5;
        if (gVar5 != null) {
            gVar5.f55972a = gVar;
        }
        mo64581l(gVar, gVar2);
        gVar2.f55974c = gVar;
        gVar.f55972a = gVar2;
        int i3 = 0;
        if (gVar3 != null) {
            i = gVar3.f55980w;
        } else {
            i = 0;
        }
        if (gVar5 != null) {
            i2 = gVar5.f55980w;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f55980w = max;
        if (gVar4 != null) {
            i3 = gVar4.f55980w;
        }
        gVar2.f55980w = Math.max(max, i3) + 1;
    }

    public V put(K k, V v) {
        if (k != null) {
            C21637g d = mo64572d(k, true);
            V v2 = d.f55979v;
            d.f55979v = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C21637g j = mo64579j(obj);
        if (j != null) {
            return j.f55979v;
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f55957a : comparator2;
        this.header = new C21637g<>();
        C21637g<K, V>[] gVarArr = new C21637g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$g */
    public static final class C21637g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C21637g<K, V> f55972a;

        /* renamed from: b */
        public C21637g<K, V> f55973b;

        /* renamed from: c */
        public C21637g<K, V> f55974c;

        /* renamed from: d */
        public C21637g<K, V> f55975d;

        /* renamed from: e */
        public C21637g<K, V> f55976e;

        /* renamed from: f */
        public final K f55977f;

        /* renamed from: g */
        public final int f55978g;

        /* renamed from: v */
        public V f55979v;

        /* renamed from: w */
        public int f55980w;

        public C21637g() {
            this.f55977f = null;
            this.f55978g = -1;
            this.f55976e = this;
            this.f55975d = this;
        }

        /* renamed from: a */
        public C21637g<K, V> mo64610a() {
            C21637g<K, V> gVar = this;
            for (C21637g<K, V> gVar2 = this.f55973b; gVar2 != null; gVar2 = gVar2.f55973b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C21637g<K, V> mo64611b() {
            C21637g<K, V> gVar = this;
            for (C21637g<K, V> gVar2 = this.f55974c; gVar2 != null; gVar2 = gVar2.f55974c) {
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
                K r0 = r3.f55977f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f55979v
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
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.C21637g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f55977f;
        }

        public V getValue() {
            return this.f55979v;
        }

        public int hashCode() {
            int i;
            K k = this.f55977f;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f55979v;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f55979v;
            this.f55979v = v;
            return v2;
        }

        public String toString() {
            return this.f55977f + "=" + this.f55979v;
        }

        public C21637g(C21637g<K, V> gVar, K k, int i, C21637g<K, V> gVar2, C21637g<K, V> gVar3) {
            this.f55972a = gVar;
            this.f55977f = k;
            this.f55978g = i;
            this.f55980w = 1;
            this.f55975d = gVar2;
            this.f55976e = gVar3;
            gVar3.f55975d = this;
            gVar2.f55976e = this;
        }
    }
}
