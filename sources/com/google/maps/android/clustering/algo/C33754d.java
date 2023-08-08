package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.geometry.C33871a;
import com.google.maps.android.geometry.C33872b;
import com.google.maps.android.projection.C33881b;
import com.google.maps.android.quadtree.C33882a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.maps.android.clustering.algo.d */
public class C33754d<T extends C33763b> extends C33751a<T> {

    /* renamed from: e */
    public static final int f81892e = 100;

    /* renamed from: f */
    public static final C33881b f81893f = new C33881b(1.0d);

    /* renamed from: b */
    public int f81894b = 100;

    /* renamed from: c */
    public final Collection<C33756b<T>> f81895c = new LinkedHashSet();

    /* renamed from: d */
    public final C33882a<C33756b<T>> f81896d = new C33882a(0.0d, 1.0d, 0.0d, 1.0d);

    /* renamed from: com.google.maps.android.clustering.algo.d$b */
    public static class C33756b<T extends C33763b> implements C33882a.C33883a, C33750a<T> {

        /* renamed from: a */
        public final T f81897a;

        /* renamed from: b */
        public final C33872b f81898b;

        /* renamed from: c */
        public final LatLng f81899c;

        /* renamed from: d */
        public Set<T> f81900d;

        /* renamed from: a */
        public C33872b mo98050a() {
            return this.f81898b;
        }

        /* renamed from: d */
        public Set<T> mo98032b() {
            return this.f81900d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C33756b)) {
                return false;
            }
            return ((C33756b) obj).f81897a.equals(this.f81897a);
        }

        public LatLng getPosition() {
            return this.f81899c;
        }

        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f81897a.hashCode();
        }

        public C33756b(T t) {
            this.f81897a = t;
            LatLng position = t.getPosition();
            this.f81899c = position;
            this.f81898b = C33754d.f81893f.mo98584b(position);
            this.f81900d = Collections.singleton(t);
        }
    }

    /* renamed from: b */
    public Collection<T> mo98037b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f81896d) {
            for (C33756b<T> c : this.f81895c) {
                linkedHashSet.add(c.f81897a);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public boolean mo98038c(Collection<T> collection) {
        boolean z = false;
        for (T l : collection) {
            if (mo98046l(l)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    public void mo98039d() {
        synchronized (this.f81896d) {
            this.f81895c.clear();
            this.f81896d.mo98586b();
        }
    }

    /* renamed from: e */
    public boolean mo98040e(T t) {
        boolean i;
        synchronized (this.f81896d) {
            i = mo98043i(t);
            if (i) {
                i = mo98046l(t);
            }
        }
        return i;
    }

    /* renamed from: g */
    public void mo98041g(int i) {
        this.f81894b = i;
    }

    /* renamed from: h */
    public Set<? extends C33750a<T>> mo98042h(float f) {
        float f2 = f;
        double pow = (((double) this.f81894b) / Math.pow(2.0d, (double) ((int) f2))) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f81896d) {
            Iterator<C33756b<C33756b<T>>> it = mo98049p(this.f81896d, f2).iterator();
            while (it.hasNext()) {
                C33756b next = it.next();
                if (!hashSet.contains(next)) {
                    Collection<C33756b<T>> f3 = this.f81896d.mo98590f(mo98047n(next.mo98050a(), pow));
                    if (f3.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        C33762i iVar = new C33762i(next.f81897a.getPosition());
                        hashSet2.add(iVar);
                        for (C33756b next2 : f3) {
                            Double d = (Double) hashMap.get(next2);
                            Iterator<C33756b<C33756b<T>>> it2 = it;
                            double o = mo98048o(next2.mo98050a(), next.mo98050a());
                            if (d != null) {
                                if (d.doubleValue() < o) {
                                    it = it2;
                                } else {
                                    ((C33762i) hashMap2.get(next2)).mo98062c(next2.f81897a);
                                }
                            }
                            hashMap.put(next2, Double.valueOf(o));
                            iVar.mo98061a(next2.f81897a);
                            hashMap2.put(next2, iVar);
                            it = it2;
                        }
                        hashSet.addAll(f3);
                        it = it;
                    }
                }
            }
        }
        return hashSet2;
    }

    /* renamed from: i */
    public boolean mo98043i(T t) {
        boolean remove;
        C33756b bVar = new C33756b(t);
        synchronized (this.f81896d) {
            remove = this.f81895c.remove(bVar);
            if (remove) {
                this.f81896d.mo98589e(bVar);
            }
        }
        return remove;
    }

    /* renamed from: j */
    public boolean mo98044j(Collection<T> collection) {
        boolean z;
        synchronized (this.f81896d) {
            z = false;
            for (T bVar : collection) {
                C33756b bVar2 = new C33756b(bVar);
                if (this.f81895c.remove(bVar2)) {
                    this.f81896d.mo98589e(bVar2);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    public int mo98045k() {
        return this.f81894b;
    }

    /* renamed from: l */
    public boolean mo98046l(T t) {
        boolean add;
        C33756b bVar = new C33756b(t);
        synchronized (this.f81896d) {
            add = this.f81895c.add(bVar);
            if (add) {
                this.f81896d.mo98585a(bVar);
            }
        }
        return add;
    }

    /* renamed from: n */
    public final C33871a mo98047n(C33872b bVar, double d) {
        double d2 = d / 2.0d;
        double d3 = bVar.f82172a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = bVar.f82173b;
        return new C33871a(d4, d5, d6 - d2, d6 + d2);
    }

    /* renamed from: o */
    public final double mo98048o(C33872b bVar, C33872b bVar2) {
        double d = bVar.f82172a;
        double d2 = bVar2.f82172a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f82173b;
        double d5 = bVar2.f82173b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* renamed from: p */
    public Collection<C33756b<T>> mo98049p(C33882a<C33756b<T>> aVar, float f) {
        return this.f81895c;
    }
}
