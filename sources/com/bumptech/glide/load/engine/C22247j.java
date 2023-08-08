package com.bumptech.glide.load.engine;

import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C22256n;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.bumptech.glide.request.C22562i;
import com.bumptech.glide.util.C22621f;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.pool.C22639a;
import com.bumptech.glide.util.pool.C22648c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.engine.j */
public class C22247j<R> implements DecodeJob.C22143b<R>, C22639a.C22645f {

    /* renamed from: O0 */
    public static final C22250c f57156O0 = new C22250c();

    /* renamed from: E0 */
    public boolean f57157E0;

    /* renamed from: F0 */
    public C22270s<?> f57158F0;

    /* renamed from: G0 */
    public DataSource f57159G0;

    /* renamed from: H0 */
    public boolean f57160H0;

    /* renamed from: I0 */
    public GlideException f57161I0;

    /* renamed from: J0 */
    public boolean f57162J0;

    /* renamed from: K0 */
    public C22256n<?> f57163K0;

    /* renamed from: L0 */
    public DecodeJob<R> f57164L0;

    /* renamed from: M0 */
    public volatile boolean f57165M0;

    /* renamed from: N0 */
    public boolean f57166N0;

    /* renamed from: X */
    public boolean f57167X;

    /* renamed from: Y */
    public boolean f57168Y;

    /* renamed from: Z */
    public boolean f57169Z;

    /* renamed from: a */
    public final C22252e f57170a;

    /* renamed from: b */
    public final C22648c f57171b;

    /* renamed from: c */
    public final C22256n.C22257a f57172c;

    /* renamed from: d */
    public final C17997q.C17998a<C22247j<?>> f57173d;

    /* renamed from: e */
    public final C22250c f57174e;

    /* renamed from: f */
    public final C22253k f57175f;

    /* renamed from: g */
    public final C22218a f57176g;

    /* renamed from: v */
    public final C22218a f57177v;

    /* renamed from: w */
    public final C22218a f57178w;

    /* renamed from: x */
    public final C22218a f57179x;

    /* renamed from: y */
    public final AtomicInteger f57180y;

    /* renamed from: z */
    public C22108c f57181z;

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    public class C22248a implements Runnable {

        /* renamed from: a */
        public final C22562i f57182a;

        public C22248a(C22562i iVar) {
            this.f57182a = iVar;
        }

        public void run() {
            synchronized (this.f57182a.mo66712g()) {
                synchronized (C22247j.this) {
                    if (C22247j.this.f57170a.mo66167h(this.f57182a)) {
                        C22247j.this.mo66145b(this.f57182a);
                    }
                    C22247j.this.mo66148i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    public class C22249b implements Runnable {

        /* renamed from: a */
        public final C22562i f57184a;

        public C22249b(C22562i iVar) {
            this.f57184a = iVar;
        }

        public void run() {
            synchronized (this.f57184a.mo66712g()) {
                synchronized (C22247j.this) {
                    if (C22247j.this.f57170a.mo66167h(this.f57184a)) {
                        C22247j.this.f57163K0.mo66176b();
                        C22247j.this.mo66146f(this.f57184a);
                        C22247j.this.mo66158s(this.f57184a);
                    }
                    C22247j.this.mo66148i();
                }
            }
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.j$c */
    public static class C22250c {
        /* renamed from: a */
        public <R> C22256n<R> mo66162a(C22270s<R> sVar, boolean z, C22108c cVar, C22256n.C22257a aVar) {
            return new C22256n(sVar, z, true, cVar, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    public static final class C22251d {

        /* renamed from: a */
        public final C22562i f57186a;

        /* renamed from: b */
        public final Executor f57187b;

        public C22251d(C22562i iVar, Executor executor) {
            this.f57186a = iVar;
            this.f57187b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C22251d) {
                return this.f57186a.equals(((C22251d) obj).f57186a);
            }
            return false;
        }

        public int hashCode() {
            return this.f57186a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$e */
    public static final class C22252e implements Iterable<C22251d> {

        /* renamed from: a */
        public final List<C22251d> f57188a;

        public C22252e() {
            this(new ArrayList(2));
        }

        /* renamed from: k */
        public static C22251d m101264k(C22562i iVar) {
            return new C22251d(iVar, C22621f.m102597a());
        }

        public void clear() {
            this.f57188a.clear();
        }

        /* renamed from: e */
        public void mo66166e(C22562i iVar, Executor executor) {
            this.f57188a.add(new C22251d(iVar, executor));
        }

        /* renamed from: h */
        public boolean mo66167h(C22562i iVar) {
            return this.f57188a.contains(m101264k(iVar));
        }

        /* renamed from: i */
        public C22252e mo66168i() {
            return new C22252e(new ArrayList(this.f57188a));
        }

        public boolean isEmpty() {
            return this.f57188a.isEmpty();
        }

        @C0359n0
        public Iterator<C22251d> iterator() {
            return this.f57188a.iterator();
        }

        /* renamed from: q */
        public void mo66171q(C22562i iVar) {
            this.f57188a.remove(m101264k(iVar));
        }

        public int size() {
            return this.f57188a.size();
        }

        public C22252e(List<C22251d> list) {
            this.f57188a = list;
        }
    }

    public C22247j(C22218a aVar, C22218a aVar2, C22218a aVar3, C22218a aVar4, C22253k kVar, C22256n.C22257a aVar5, C17997q.C17998a<C22247j<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, kVar, aVar5, aVar6, f57156O0);
    }

    /* renamed from: a */
    public synchronized void mo66144a(C22562i iVar, Executor executor) {
        this.f57171b.mo67017c();
        this.f57170a.mo66166e(iVar, executor);
        boolean z = true;
        if (this.f57160H0) {
            mo66150k(1);
            executor.execute(new C22249b(iVar));
        } else if (this.f57162J0) {
            mo66150k(1);
            executor.execute(new C22248a(iVar));
        } else {
            if (this.f57165M0) {
                z = false;
            }
            C22633m.m102621a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @C0323b0("this")
    /* renamed from: b */
    public void mo66145b(C22562i iVar) {
        try {
            iVar.mo66709d(this.f57161I0);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: c */
    public void mo65877c(C22270s<R> sVar, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.f57158F0 = sVar;
            this.f57159G0 = dataSource;
            this.f57166N0 = z;
        }
        mo66155p();
    }

    /* renamed from: d */
    public void mo65878d(GlideException glideException) {
        synchronized (this) {
            this.f57161I0 = glideException;
        }
        mo66154o();
    }

    /* renamed from: e */
    public void mo65879e(DecodeJob<?> decodeJob) {
        mo66149j().execute(decodeJob);
    }

    @C0323b0("this")
    /* renamed from: f */
    public void mo66146f(C22562i iVar) {
        try {
            iVar.mo66707c(this.f57163K0, this.f57159G0, this.f57166N0);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @C0359n0
    /* renamed from: g */
    public C22648c mo65861g() {
        return this.f57171b;
    }

    /* renamed from: h */
    public void mo66147h() {
        if (!mo66153n()) {
            this.f57165M0 = true;
            this.f57164L0.mo65874w();
            this.f57175f.mo66126c(this, this.f57181z);
        }
    }

    /* renamed from: i */
    public void mo66148i() {
        boolean z;
        C22256n<?> nVar;
        synchronized (this) {
            this.f57171b.mo67017c();
            C22633m.m102621a(mo66153n(), "Not yet complete!");
            int decrementAndGet = this.f57180y.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C22633m.m102621a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                nVar = this.f57163K0;
                mo66157r();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            nVar.mo66180f();
        }
    }

    /* renamed from: j */
    public final C22218a mo66149j() {
        if (this.f57168Y) {
            return this.f57178w;
        }
        if (this.f57169Z) {
            return this.f57179x;
        }
        return this.f57177v;
    }

    /* renamed from: k */
    public synchronized void mo66150k(int i) {
        C22256n<?> nVar;
        C22633m.m102621a(mo66153n(), "Not yet complete!");
        if (this.f57180y.getAndAdd(i) == 0 && (nVar = this.f57163K0) != null) {
            nVar.mo66176b();
        }
    }

    @C0344h1
    /* renamed from: l */
    public synchronized C22247j<R> mo66151l(C22108c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f57181z = cVar;
        this.f57167X = z;
        this.f57168Y = z2;
        this.f57169Z = z3;
        this.f57157E0 = z4;
        return this;
    }

    /* renamed from: m */
    public synchronized boolean mo66152m() {
        return this.f57165M0;
    }

    /* renamed from: n */
    public final boolean mo66153n() {
        return this.f57162J0 || this.f57160H0 || this.f57165M0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f57175f.mo66125b(r4, r1, (com.bumptech.glide.load.engine.C22256n<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f57187b.execute(new com.bumptech.glide.load.engine.C22247j.C22248a(r4, r1.f57186a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo66148i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66154o() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.util.pool.c r0 = r4.f57171b     // Catch:{ all -> 0x0066 }
            r0.mo67017c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f57165M0     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.mo66157r()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.j$e r0 = r4.f57170a     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f57162J0     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f57162J0 = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.c r1 = r4.f57181z     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.j$e r2 = r4.f57170a     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.j$e r2 = r2.mo66168i()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo66150k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k r0 = r4.f57175f
            r3 = 0
            r0.mo66125b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.j$d r1 = (com.bumptech.glide.load.engine.C22247j.C22251d) r1
            java.util.concurrent.Executor r2 = r1.f57187b
            com.bumptech.glide.load.engine.j$a r3 = new com.bumptech.glide.load.engine.j$a
            com.bumptech.glide.request.i r1 = r1.f57186a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo66148i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C22247j.mo66154o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f57175f.mo66125b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f57187b.execute(new com.bumptech.glide.load.engine.C22247j.C22249b(r5, r1.f57186a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo66148i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66155p() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.pool.c r0 = r5.f57171b     // Catch:{ all -> 0x007c }
            r0.mo67017c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f57165M0     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.engine.s<?> r0 = r5.f57158F0     // Catch:{ all -> 0x007c }
            r0.mo66175a()     // Catch:{ all -> 0x007c }
            r5.mo66157r()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.j$e r0 = r5.f57170a     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f57160H0     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.j$c r0 = r5.f57174e     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.s<?> r1 = r5.f57158F0     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f57167X     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.c r3 = r5.f57181z     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.n$a r4 = r5.f57172c     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.n r0 = r0.mo66162a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f57163K0 = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f57160H0 = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.j$e r1 = r5.f57170a     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.j$e r1 = r1.mo66168i()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo66150k(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.c r0 = r5.f57181z     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.n<?> r2 = r5.f57163K0     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k r3 = r5.f57175f
            r3.mo66125b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.j$d r1 = (com.bumptech.glide.load.engine.C22247j.C22251d) r1
            java.util.concurrent.Executor r2 = r1.f57187b
            com.bumptech.glide.load.engine.j$b r3 = new com.bumptech.glide.load.engine.j$b
            com.bumptech.glide.request.i r1 = r1.f57186a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo66148i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C22247j.mo66155p():void");
    }

    /* renamed from: q */
    public boolean mo66156q() {
        return this.f57157E0;
    }

    /* renamed from: r */
    public final synchronized void mo66157r() {
        if (this.f57181z != null) {
            this.f57170a.clear();
            this.f57181z = null;
            this.f57163K0 = null;
            this.f57158F0 = null;
            this.f57162J0 = false;
            this.f57165M0 = false;
            this.f57160H0 = false;
            this.f57166N0 = false;
            this.f57164L0.mo65873u0(false);
            this.f57164L0 = null;
            this.f57161I0 = null;
            this.f57159G0 = null;
            this.f57173d.mo52468a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: s */
    public synchronized void mo66158s(C22562i iVar) {
        boolean z;
        this.f57171b.mo67017c();
        this.f57170a.mo66171q(iVar);
        if (this.f57170a.isEmpty()) {
            mo66147h();
            if (!this.f57160H0) {
                if (!this.f57162J0) {
                    z = false;
                    if (z && this.f57180y.get() == 0) {
                        mo66157r();
                    }
                }
            }
            z = true;
            mo66157r();
        }
    }

    /* renamed from: t */
    public synchronized void mo66159t(DecodeJob<R> decodeJob) {
        C22218a aVar;
        this.f57164L0 = decodeJob;
        if (decodeJob.mo65851L0()) {
            aVar = this.f57176g;
        } else {
            aVar = mo66149j();
        }
        aVar.execute(decodeJob);
    }

    @C0344h1
    public C22247j(C22218a aVar, C22218a aVar2, C22218a aVar3, C22218a aVar4, C22253k kVar, C22256n.C22257a aVar5, C17997q.C17998a<C22247j<?>> aVar6, C22250c cVar) {
        this.f57170a = new C22252e();
        this.f57171b = C22648c.m102683a();
        this.f57180y = new AtomicInteger();
        this.f57176g = aVar;
        this.f57177v = aVar2;
        this.f57178w = aVar3;
        this.f57179x = aVar4;
        this.f57175f = kVar;
        this.f57172c = aVar5;
        this.f57173d = aVar6;
        this.f57174e = cVar;
    }
}
