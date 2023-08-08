package com.google.maps.android.clustering;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.clustering.algo.C33752b;
import com.google.maps.android.clustering.algo.C33754d;
import com.google.maps.android.clustering.algo.C33758f;
import com.google.maps.android.clustering.algo.C33760g;
import com.google.maps.android.clustering.algo.C33761h;
import com.google.maps.android.clustering.view.C33773a;
import com.google.maps.android.clustering.view.C33778f;
import com.google.maps.android.collections.C33796d;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.maps.android.clustering.c */
public class C33764c<T extends C33763b> implements C30412c.C30416d, C30412c.C30429q, C30412c.C30423k {

    /* renamed from: X */
    public C33771g<T> f81914X;

    /* renamed from: Y */
    public C33772h<T> f81915Y;

    /* renamed from: Z */
    public C33767c<T> f81916Z;

    /* renamed from: a */
    public final C33796d f81917a;

    /* renamed from: b */
    public final C33796d.C33797a f81918b;

    /* renamed from: c */
    public final C33796d.C33797a f81919c;

    /* renamed from: d */
    public C33760g<T> f81920d;

    /* renamed from: e */
    public C33773a<T> f81921e;

    /* renamed from: f */
    public C30412c f81922f;

    /* renamed from: g */
    public CameraPosition f81923g;

    /* renamed from: v */
    public C33764c<T>.b f81924v;

    /* renamed from: w */
    public final ReadWriteLock f81925w;

    /* renamed from: x */
    public C33770f<T> f81926x;

    /* renamed from: y */
    public C33768d<T> f81927y;

    /* renamed from: z */
    public C33769e<T> f81928z;

    /* renamed from: com.google.maps.android.clustering.c$b */
    public class C33766b extends AsyncTask<Float, Void, Set<? extends C33750a<T>>> {
        public C33766b() {
        }

        /* renamed from: a */
        public Set<? extends C33750a<T>> doInBackground(Float... fArr) {
            C33752b g = C33764c.this.mo98070g();
            g.lock();
            try {
                return g.mo98042h(fArr[0].floatValue());
            } finally {
                g.unlock();
            }
        }

        /* renamed from: b */
        public void onPostExecute(Set<? extends C33750a<T>> set) {
            C33764c.this.f81921e.onClustersChanged(set);
        }
    }

    /* renamed from: com.google.maps.android.clustering.c$c */
    public interface C33767c<T extends C33763b> {
        boolean onClusterClick(C33750a<T> aVar);
    }

    /* renamed from: com.google.maps.android.clustering.c$d */
    public interface C33768d<T extends C33763b> {
        /* renamed from: a */
        void mo98092a(C33750a<T> aVar);
    }

    /* renamed from: com.google.maps.android.clustering.c$e */
    public interface C33769e<T extends C33763b> {
        /* renamed from: a */
        void mo98093a(C33750a<T> aVar);
    }

    /* renamed from: com.google.maps.android.clustering.c$f */
    public interface C33770f<T extends C33763b> {
        boolean onClusterItemClick(T t);
    }

    /* renamed from: com.google.maps.android.clustering.c$g */
    public interface C33771g<T extends C33763b> {
        /* renamed from: a */
        void mo98094a(T t);
    }

    /* renamed from: com.google.maps.android.clustering.c$h */
    public interface C33772h<T extends C33763b> {
        /* renamed from: a */
        void mo98095a(T t);
    }

    public C33764c(Context context, C30412c cVar) {
        this(context, cVar, new C33796d(cVar));
    }

    /* renamed from: a */
    public void mo85943a(@C0359n0 C30587h hVar) {
        mo98073j().mo85943a(hVar);
    }

    /* renamed from: c */
    public boolean mo98066c(T t) {
        C33752b g = mo98070g();
        g.lock();
        try {
            return g.mo98046l(t);
        } finally {
            g.unlock();
        }
    }

    /* renamed from: d */
    public boolean mo98067d(Collection<T> collection) {
        C33752b g = mo98070g();
        g.lock();
        try {
            return g.mo98038c(collection);
        } finally {
            g.unlock();
        }
    }

    /* renamed from: e */
    public void mo98068e() {
        C33752b g = mo98070g();
        g.lock();
        try {
            g.mo98039d();
        } finally {
            g.unlock();
        }
    }

    /* renamed from: f */
    public void mo98069f() {
        this.f81925w.writeLock().lock();
        try {
            this.f81924v.cancel(true);
            C33764c<T>.b bVar = new C33766b();
            this.f81924v = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[]{Float.valueOf(this.f81922f.mo85916k().f72991b)});
        } finally {
            this.f81925w.writeLock().unlock();
        }
    }

    /* renamed from: g */
    public C33752b<T> mo98070g() {
        return this.f81920d;
    }

    /* renamed from: h */
    public C33796d.C33797a mo98071h() {
        return this.f81919c;
    }

    /* renamed from: i */
    public C33796d.C33797a mo98072i() {
        return this.f81918b;
    }

    /* renamed from: j */
    public C33796d mo98073j() {
        return this.f81917a;
    }

    /* renamed from: k */
    public C33773a<T> mo98074k() {
        return this.f81921e;
    }

    /* renamed from: l */
    public boolean mo98075l(T t) {
        C33752b g = mo98070g();
        g.lock();
        try {
            return g.mo98043i(t);
        } finally {
            g.unlock();
        }
    }

    /* renamed from: m */
    public boolean mo98076m(Collection<T> collection) {
        C33752b g = mo98070g();
        g.lock();
        try {
            return g.mo98044j(collection);
        } finally {
            g.unlock();
        }
    }

    /* renamed from: n */
    public void mo98077n(C33752b<T> bVar) {
        if (bVar instanceof C33760g) {
            mo98078o((C33760g) bVar);
        } else {
            mo98078o(new C33761h(bVar));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.maps.android.clustering.algo.g<T>, code=com.google.maps.android.clustering.algo.b, for r3v0, types: [com.google.maps.android.clustering.algo.b, com.google.maps.android.clustering.algo.g<T>] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98078o(com.google.maps.android.clustering.algo.C33752b r3) {
        /*
            r2 = this;
            r3.lock()
            com.google.maps.android.clustering.algo.b r0 = r2.mo98070g()     // Catch:{ all -> 0x0038 }
            r2.f81920d = r3     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x001e
            r0.lock()     // Catch:{ all -> 0x0038 }
            java.util.Collection r1 = r0.mo98037b()     // Catch:{ all -> 0x0019 }
            r3.mo98038c(r1)     // Catch:{ all -> 0x0019 }
            r0.unlock()     // Catch:{ all -> 0x0038 }
            goto L_0x001e
        L_0x0019:
            r1 = move-exception
            r0.unlock()     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x001e:
            r3.unlock()
            com.google.maps.android.clustering.algo.g<T> r3 = r2.f81920d
            boolean r3 = r3.mo98055f()
            if (r3 == 0) goto L_0x0034
            com.google.maps.android.clustering.algo.g<T> r3 = r2.f81920d
            com.google.android.gms.maps.c r0 = r2.f81922f
            com.google.android.gms.maps.model.CameraPosition r0 = r0.mo85916k()
            r3.mo98054a(r0)
        L_0x0034:
            r2.mo98069f()
            return
        L_0x0038:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.C33764c.mo98078o(com.google.maps.android.clustering.algo.g):void");
    }

    public void onCameraIdle() {
        C33773a<T> aVar = this.f81921e;
        if (aVar instanceof C30412c.C30416d) {
            ((C30412c.C30416d) aVar).onCameraIdle();
        }
        this.f81920d.mo98054a(this.f81922f.mo85916k());
        if (this.f81920d.mo98055f()) {
            mo98069f();
            return;
        }
        CameraPosition cameraPosition = this.f81923g;
        if (cameraPosition == null || cameraPosition.f72991b != this.f81922f.mo85916k().f72991b) {
            this.f81923g = this.f81922f.mo85916k();
            mo98069f();
        }
    }

    /* renamed from: p */
    public void mo98079p(boolean z) {
        this.f81921e.setAnimation(z);
    }

    /* renamed from: p0 */
    public boolean mo69449p0(@C0359n0 C30587h hVar) {
        return mo98073j().mo69449p0(hVar);
    }

    /* renamed from: q */
    public void mo98080q(C33767c<T> cVar) {
        this.f81916Z = cVar;
        this.f81921e.setOnClusterClickListener(cVar);
    }

    /* renamed from: r */
    public void mo98081r(C33768d<T> dVar) {
        this.f81927y = dVar;
        this.f81921e.setOnClusterInfoWindowClickListener(dVar);
    }

    /* renamed from: s */
    public void mo98082s(C33769e<T> eVar) {
        this.f81928z = eVar;
        this.f81921e.setOnClusterInfoWindowLongClickListener(eVar);
    }

    /* renamed from: t */
    public void mo98083t(C33770f<T> fVar) {
        this.f81926x = fVar;
        this.f81921e.setOnClusterItemClickListener(fVar);
    }

    /* renamed from: u */
    public void mo98084u(C33771g<T> gVar) {
        this.f81914X = gVar;
        this.f81921e.setOnClusterItemInfoWindowClickListener(gVar);
    }

    /* renamed from: v */
    public void mo98085v(C33772h<T> hVar) {
        this.f81915Y = hVar;
        this.f81921e.setOnClusterItemInfoWindowLongClickListener(hVar);
    }

    /* renamed from: w */
    public void mo98086w(C33773a<T> aVar) {
        this.f81921e.setOnClusterClickListener((C33767c) null);
        this.f81921e.setOnClusterItemClickListener((C33770f) null);
        this.f81919c.mo98183b();
        this.f81918b.mo98183b();
        this.f81921e.onRemove();
        this.f81921e = aVar;
        aVar.onAdd();
        this.f81921e.setOnClusterClickListener(this.f81916Z);
        this.f81921e.setOnClusterInfoWindowClickListener(this.f81927y);
        this.f81921e.setOnClusterInfoWindowLongClickListener(this.f81928z);
        this.f81921e.setOnClusterItemClickListener(this.f81926x);
        this.f81921e.setOnClusterItemInfoWindowClickListener(this.f81914X);
        this.f81921e.setOnClusterItemInfoWindowLongClickListener(this.f81915Y);
        mo98069f();
    }

    /* renamed from: x */
    public boolean mo98087x(T t) {
        C33752b g = mo98070g();
        g.lock();
        try {
            return g.mo98040e(t);
        } finally {
            g.unlock();
        }
    }

    public C33764c(Context context, C30412c cVar, C33796d dVar) {
        this.f81925w = new ReentrantReadWriteLock();
        this.f81922f = cVar;
        this.f81917a = dVar;
        this.f81919c = dVar.mo98156m();
        this.f81918b = dVar.mo98156m();
        this.f81921e = new C33778f(context, cVar, this);
        this.f81920d = new C33761h(new C33758f(new C33754d()));
        this.f81924v = new C33766b();
        this.f81921e.onAdd();
    }
}
