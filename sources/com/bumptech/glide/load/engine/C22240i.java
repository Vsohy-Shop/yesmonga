package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import com.bumptech.glide.C22048d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C22256n;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.cache.C22185a;
import com.bumptech.glide.load.engine.cache.C22188b;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.bumptech.glide.request.C22562i;
import com.bumptech.glide.util.C22621f;
import com.bumptech.glide.util.C22628i;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.pool.C22639a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.load.engine.i */
public class C22240i implements C22253k, C22205j.C22206a, C22256n.C22257a {

    /* renamed from: i */
    public static final String f57128i = "Engine";

    /* renamed from: j */
    public static final int f57129j = 150;

    /* renamed from: k */
    public static final boolean f57130k = Log.isLoggable(f57128i, 2);

    /* renamed from: a */
    public final C22259p f57131a;

    /* renamed from: b */
    public final C22255m f57132b;

    /* renamed from: c */
    public final C22205j f57133c;

    /* renamed from: d */
    public final C22243b f57134d;

    /* renamed from: e */
    public final C22273v f57135e;

    /* renamed from: f */
    public final C22245c f57136f;

    /* renamed from: g */
    public final C22241a f57137g;

    /* renamed from: h */
    public final C22149a f57138h;

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.i$a */
    public static class C22241a {

        /* renamed from: a */
        public final DecodeJob.C22146e f57139a;

        /* renamed from: b */
        public final C17997q.C17998a<DecodeJob<?>> f57140b = C22639a.m102662e(150, new C22242a());

        /* renamed from: c */
        public int f57141c;

        /* renamed from: com.bumptech.glide.load.engine.i$a$a */
        public class C22242a implements C22639a.C22643d<DecodeJob<?>> {
            public C22242a() {
            }

            /* renamed from: b */
            public DecodeJob<?> mo66065a() {
                C22241a aVar = C22241a.this;
                return new DecodeJob<>(aVar.f57139a, aVar.f57140b);
            }
        }

        public C22241a(DecodeJob.C22146e eVar) {
            this.f57139a = eVar;
        }

        /* renamed from: a */
        public <R> DecodeJob<R> mo66137a(C22048d dVar, Object obj, C22254l lVar, C22108c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C22234h hVar, Map<Class<?>, C22280i<?>> map, boolean z, boolean z2, boolean z3, C22277f fVar, DecodeJob.C22143b<R> bVar) {
            DecodeJob decodeJob = (DecodeJob) C22633m.m102624d(this.f57140b.mo52469b());
            int i3 = this.f57141c;
            int i4 = i3;
            this.f57141c = i3 + 1;
            return decodeJob.mo65860f0(dVar, obj, lVar, cVar, i, i2, cls, cls2, priority, hVar, map, z, z2, z3, fVar, bVar, i4);
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.i$b */
    public static class C22243b {

        /* renamed from: a */
        public final C22218a f57143a;

        /* renamed from: b */
        public final C22218a f57144b;

        /* renamed from: c */
        public final C22218a f57145c;

        /* renamed from: d */
        public final C22218a f57146d;

        /* renamed from: e */
        public final C22253k f57147e;

        /* renamed from: f */
        public final C22256n.C22257a f57148f;

        /* renamed from: g */
        public final C17997q.C17998a<C22247j<?>> f57149g = C22639a.m102662e(150, new C22244a());

        /* renamed from: com.bumptech.glide.load.engine.i$b$a */
        public class C22244a implements C22639a.C22643d<C22247j<?>> {
            public C22244a() {
            }

            /* renamed from: b */
            public C22247j<?> mo66065a() {
                C22243b bVar = C22243b.this;
                return new C22247j(bVar.f57143a, bVar.f57144b, bVar.f57145c, bVar.f57146d, bVar.f57147e, bVar.f57148f, bVar.f57149g);
            }
        }

        public C22243b(C22218a aVar, C22218a aVar2, C22218a aVar3, C22218a aVar4, C22253k kVar, C22256n.C22257a aVar5) {
            this.f57143a = aVar;
            this.f57144b = aVar2;
            this.f57145c = aVar3;
            this.f57146d = aVar4;
            this.f57147e = kVar;
            this.f57148f = aVar5;
        }

        /* renamed from: a */
        public <R> C22247j<R> mo66139a(C22108c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C22247j) C22633m.m102624d(this.f57149g.mo52469b())).mo66151l(cVar, z, z2, z3, z4);
        }

        @C0344h1
        /* renamed from: b */
        public void mo66140b() {
            C22621f.m102599c(this.f57143a);
            C22621f.m102599c(this.f57144b);
            C22621f.m102599c(this.f57145c);
            C22621f.m102599c(this.f57146d);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$c */
    public static class C22245c implements DecodeJob.C22146e {

        /* renamed from: a */
        public final C22185a.C22186a f57151a;

        /* renamed from: b */
        public volatile C22185a f57152b;

        public C22245c(C22185a.C22186a aVar) {
            this.f57151a = aVar;
        }

        /* renamed from: a */
        public C22185a mo65885a() {
            if (this.f57152b == null) {
                synchronized (this) {
                    if (this.f57152b == null) {
                        this.f57152b = this.f57151a.mo66026g();
                    }
                    if (this.f57152b == null) {
                        this.f57152b = new C22188b();
                    }
                }
            }
            return this.f57152b;
        }

        @C0344h1
        /* renamed from: b */
        public synchronized void mo66142b() {
            if (this.f57152b != null) {
                this.f57152b.clear();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$d */
    public class C22246d {

        /* renamed from: a */
        public final C22247j<?> f57153a;

        /* renamed from: b */
        public final C22562i f57154b;

        public C22246d(C22562i iVar, C22247j<?> jVar) {
            this.f57154b = iVar;
            this.f57153a = jVar;
        }

        /* renamed from: a */
        public void mo66143a() {
            synchronized (C22240i.this) {
                this.f57153a.mo66158s(this.f57154b);
            }
        }
    }

    public C22240i(C22205j jVar, C22185a.C22186a aVar, C22218a aVar2, C22218a aVar3, C22218a aVar4, C22218a aVar5, boolean z) {
        this(jVar, aVar, aVar2, aVar3, aVar4, aVar5, (C22259p) null, (C22255m) null, (C22149a) null, (C22243b) null, (C22241a) null, (C22273v) null, z);
    }

    /* renamed from: k */
    public static void m101219k(String str, long j, C22108c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C22628i.m102602a(j));
        sb.append("ms, key: ");
        sb.append(cVar);
    }

    /* renamed from: a */
    public void mo66048a(@C0359n0 C22270s<?> sVar) {
        this.f57135e.mo66224a(sVar, true);
    }

    /* renamed from: b */
    public synchronized void mo66125b(C22247j<?> jVar, C22108c cVar, C22256n<?> nVar) {
        if (nVar != null) {
            if (nVar.mo66179e()) {
                this.f57138h.mo65909a(cVar, nVar);
            }
        }
        this.f57131a.mo66189e(cVar, jVar);
    }

    /* renamed from: c */
    public synchronized void mo66126c(C22247j<?> jVar, C22108c cVar) {
        this.f57131a.mo66189e(cVar, jVar);
    }

    /* renamed from: d */
    public void mo66127d(C22108c cVar, C22256n<?> nVar) {
        this.f57138h.mo65912d(cVar);
        if (nVar.mo66179e()) {
            this.f57133c.mo66037f(cVar, nVar);
        } else {
            this.f57135e.mo66224a(nVar, false);
        }
    }

    /* renamed from: e */
    public void mo66128e() {
        this.f57136f.mo65885a().clear();
    }

    /* renamed from: f */
    public final C22256n<?> mo66129f(C22108c cVar) {
        C22270s<?> g = this.f57133c.mo66038g(cVar);
        if (g == null) {
            return null;
        }
        if (g instanceof C22256n) {
            return (C22256n) g;
        }
        return new C22256n<>(g, true, true, cVar, this);
    }

    /* renamed from: g */
    public <R> C22246d mo66130g(C22048d dVar, Object obj, C22108c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C22234h hVar, Map<Class<?>, C22280i<?>> map, boolean z, boolean z2, C22277f fVar, boolean z3, boolean z4, boolean z5, boolean z6, C22562i iVar, Executor executor) {
        long b = f57130k ? C22628i.m102603b() : 0;
        C22254l a = this.f57132b.mo66174a(obj, cVar, i, i2, map, cls, cls2, fVar);
        synchronized (this) {
            C22256n<?> j = mo66133j(a, z3, b);
            if (j == null) {
                C22246d n = mo66136n(dVar, obj, cVar, i, i2, cls, cls2, priority, hVar, map, z, z2, fVar, z3, z4, z5, z6, iVar, executor, a, b);
                return n;
            }
            iVar.mo66707c(j, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    @C0363p0
    /* renamed from: h */
    public final C22256n<?> mo66131h(C22108c cVar) {
        C22256n<?> e = this.f57138h.mo65913e(cVar);
        if (e != null) {
            e.mo66176b();
        }
        return e;
    }

    /* renamed from: i */
    public final C22256n<?> mo66132i(C22108c cVar) {
        C22256n<?> f = mo66129f(cVar);
        if (f != null) {
            f.mo66176b();
            this.f57138h.mo65909a(cVar, f);
        }
        return f;
    }

    @C0363p0
    /* renamed from: j */
    public final C22256n<?> mo66133j(C22254l lVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C22256n<?> h = mo66131h(lVar);
        if (h != null) {
            if (f57130k) {
                m101219k("Loaded resource from active resources", j, lVar);
            }
            return h;
        }
        C22256n<?> i = mo66132i(lVar);
        if (i == null) {
            return null;
        }
        if (f57130k) {
            m101219k("Loaded resource from cache", j, lVar);
        }
        return i;
    }

    /* renamed from: l */
    public void mo66134l(C22270s<?> sVar) {
        if (sVar instanceof C22256n) {
            ((C22256n) sVar).mo66180f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @C0344h1
    /* renamed from: m */
    public void mo66135m() {
        this.f57134d.mo66140b();
        this.f57136f.mo66142b();
        this.f57138h.mo65916h();
    }

    /* renamed from: n */
    public final <R> C22246d mo66136n(C22048d dVar, Object obj, C22108c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C22234h hVar, Map<Class<?>, C22280i<?>> map, boolean z, boolean z2, C22277f fVar, boolean z3, boolean z4, boolean z5, boolean z6, C22562i iVar, Executor executor, C22254l lVar, long j) {
        C22562i iVar2 = iVar;
        Executor executor2 = executor;
        C22254l lVar2 = lVar;
        long j2 = j;
        C22247j<?> a = this.f57131a.mo66185a(lVar2, z6);
        if (a != null) {
            a.mo66144a(iVar2, executor2);
            if (f57130k) {
                m101219k("Added to existing load", j2, lVar2);
            }
            return new C22246d(iVar2, a);
        }
        C22247j a2 = this.f57134d.mo66139a(lVar, z3, z4, z5, z6);
        C22247j jVar = a2;
        C22254l lVar3 = lVar2;
        DecodeJob<R> a3 = this.f57137g.mo66137a(dVar, obj, lVar, cVar, i, i2, cls, cls2, priority, hVar, map, z, z2, z6, fVar, a2);
        this.f57131a.mo66188d(lVar3, jVar);
        C22247j jVar2 = jVar;
        C22254l lVar4 = lVar3;
        C22562i iVar3 = iVar;
        jVar2.mo66144a(iVar3, executor);
        jVar2.mo66159t(a3);
        if (f57130k) {
            m101219k("Started new load", j, lVar4);
        }
        return new C22246d(iVar3, jVar2);
    }

    @C0344h1
    public C22240i(C22205j jVar, C22185a.C22186a aVar, C22218a aVar2, C22218a aVar3, C22218a aVar4, C22218a aVar5, C22259p pVar, C22255m mVar, C22149a aVar6, C22243b bVar, C22241a aVar7, C22273v vVar, boolean z) {
        this.f57133c = jVar;
        C22185a.C22186a aVar8 = aVar;
        C22245c cVar = new C22245c(aVar);
        this.f57136f = cVar;
        C22149a aVar9 = aVar6 == null ? new C22149a(z) : aVar6;
        this.f57138h = aVar9;
        aVar9.mo65915g(this);
        this.f57132b = mVar == null ? new C22255m() : mVar;
        this.f57131a = pVar == null ? new C22259p() : pVar;
        this.f57134d = bVar == null ? new C22243b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f57137g = aVar7 == null ? new C22241a(cVar) : aVar7;
        this.f57135e = vVar == null ? new C22273v() : vVar;
        jVar.mo66039h(this);
    }
}
