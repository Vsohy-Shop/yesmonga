package com.google.maps.android.clustering.algo;

import androidx.collection.C1875h;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.geometry.C33872b;
import com.google.maps.android.projection.C33880a;
import com.google.maps.android.projection.C33881b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.maps.android.clustering.algo.c */
public class C33753c<T extends C33763b> extends C33751a<T> {

    /* renamed from: d */
    public static final int f81889d = 100;

    /* renamed from: b */
    public int f81890b = 100;

    /* renamed from: c */
    public final Set<T> f81891c = Collections.synchronizedSet(new HashSet());

    /* renamed from: m */
    public static long m135715m(long j, double d, double d2) {
        return (long) ((((double) j) * Math.floor(d)) + Math.floor(d2));
    }

    /* renamed from: b */
    public Collection<T> mo98037b() {
        return this.f81891c;
    }

    /* renamed from: c */
    public boolean mo98038c(Collection<T> collection) {
        return this.f81891c.addAll(collection);
    }

    /* renamed from: d */
    public void mo98039d() {
        this.f81891c.clear();
    }

    /* renamed from: e */
    public boolean mo98040e(T t) {
        boolean i;
        synchronized (this.f81891c) {
            i = mo98043i(t);
            if (i) {
                i = mo98046l(t);
            }
        }
        return i;
    }

    /* renamed from: g */
    public void mo98041g(int i) {
        this.f81890b = i;
    }

    /* renamed from: h */
    public Set<? extends C33750a<T>> mo98042h(float f) {
        long j;
        long ceil = (long) Math.ceil((Math.pow(2.0d, (double) f) * 256.0d) / ((double) this.f81890b));
        C33881b bVar = new C33881b((double) ceil);
        HashSet hashSet = new HashSet();
        C1875h hVar = new C1875h();
        synchronized (this.f81891c) {
            for (T t : this.f81891c) {
                C33880a b = bVar.mo98584b(t.getPosition());
                long m = m135715m(ceil, b.f82172a, b.f82173b);
                C33762i iVar = (C33762i) hVar.mo6223k(m);
                if (iVar == null) {
                    j = ceil;
                    iVar = new C33762i(bVar.mo98583a(new C33872b(Math.floor(b.f82172a) + 0.5d, Math.floor(b.f82173b) + 0.5d)));
                    hVar.mo6229t(m, iVar);
                    hashSet.add(iVar);
                } else {
                    j = ceil;
                }
                iVar.mo98061a(t);
                ceil = j;
            }
        }
        return hashSet;
    }

    /* renamed from: i */
    public boolean mo98043i(T t) {
        return this.f81891c.remove(t);
    }

    /* renamed from: j */
    public boolean mo98044j(Collection<T> collection) {
        return this.f81891c.removeAll(collection);
    }

    /* renamed from: k */
    public int mo98045k() {
        return this.f81890b;
    }

    /* renamed from: l */
    public boolean mo98046l(T t) {
        return this.f81891c.add(t);
    }
}
