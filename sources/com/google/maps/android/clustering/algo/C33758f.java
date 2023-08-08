package com.google.maps.android.clustering.algo;

import androidx.collection.C1879j;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.maps.android.clustering.algo.f */
public class C33758f<T extends C33763b> extends C33751a<T> {

    /* renamed from: b */
    public final C33752b<T> f81905b;

    /* renamed from: c */
    public final C1879j<Integer, Set<? extends C33750a<T>>> f81906c = new C1879j<>(5);

    /* renamed from: d */
    public final ReadWriteLock f81907d = new ReentrantReadWriteLock();

    /* renamed from: e */
    public final Executor f81908e = Executors.newCachedThreadPool();

    /* renamed from: com.google.maps.android.clustering.algo.f$a */
    public class C33759a implements Runnable {

        /* renamed from: a */
        public final int f81909a;

        public C33759a(int i) {
            this.f81909a = i;
        }

        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            Set unused2 = C33758f.this.mo98059o(this.f81909a);
        }
    }

    public C33758f(C33752b<T> bVar) {
        this.f81905b = bVar;
    }

    /* renamed from: b */
    public Collection<T> mo98037b() {
        return this.f81905b.mo98037b();
    }

    /* renamed from: c */
    public boolean mo98038c(Collection<T> collection) {
        boolean c = this.f81905b.mo98038c(collection);
        if (c) {
            mo98058n();
        }
        return c;
    }

    /* renamed from: d */
    public void mo98039d() {
        this.f81905b.mo98039d();
        mo98058n();
    }

    /* renamed from: e */
    public boolean mo98040e(T t) {
        boolean e = this.f81905b.mo98040e(t);
        if (e) {
            mo98058n();
        }
        return e;
    }

    /* renamed from: g */
    public void mo98041g(int i) {
        this.f81905b.mo98041g(i);
        mo98058n();
    }

    /* renamed from: h */
    public Set<? extends C33750a<T>> mo98042h(float f) {
        int i = (int) f;
        Set<? extends C33750a<T>> o = mo98059o(i);
        int i2 = i + 1;
        if (this.f81906c.mo6246f(Integer.valueOf(i2)) == null) {
            this.f81908e.execute(new C33759a(i2));
        }
        int i3 = i - 1;
        if (this.f81906c.mo6246f(Integer.valueOf(i3)) == null) {
            this.f81908e.execute(new C33759a(i3));
        }
        return o;
    }

    /* renamed from: i */
    public boolean mo98043i(T t) {
        boolean i = this.f81905b.mo98043i(t);
        if (i) {
            mo98058n();
        }
        return i;
    }

    /* renamed from: j */
    public boolean mo98044j(Collection<T> collection) {
        boolean j = this.f81905b.mo98044j(collection);
        if (j) {
            mo98058n();
        }
        return j;
    }

    /* renamed from: k */
    public int mo98045k() {
        return this.f81905b.mo98045k();
    }

    /* renamed from: l */
    public boolean mo98046l(T t) {
        boolean l = this.f81905b.mo98046l(t);
        if (l) {
            mo98058n();
        }
        return l;
    }

    /* renamed from: n */
    public final void mo98058n() {
        this.f81906c.mo6244d();
    }

    /* renamed from: o */
    public final Set<? extends C33750a<T>> mo98059o(int i) {
        this.f81907d.readLock().lock();
        Set<? extends C33750a<T>> f = this.f81906c.mo6246f(Integer.valueOf(i));
        this.f81907d.readLock().unlock();
        if (f == null) {
            this.f81907d.writeLock().lock();
            f = this.f81906c.mo6246f(Integer.valueOf(i));
            if (f == null) {
                f = this.f81905b.mo98042h((float) i);
                this.f81906c.mo6250j(Integer.valueOf(i), f);
            }
            this.f81907d.writeLock().unlock();
        }
        return f;
    }
}
