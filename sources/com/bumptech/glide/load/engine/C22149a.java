package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.C22256n;
import com.bumptech.glide.util.C22621f;
import com.bumptech.glide.util.C22633m;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
public final class C22149a {

    /* renamed from: a */
    public final boolean f56920a;

    /* renamed from: b */
    public final Executor f56921b;
    @C0344h1

    /* renamed from: c */
    public final Map<C22108c, C22154d> f56922c;

    /* renamed from: d */
    public final ReferenceQueue<C22256n<?>> f56923d;

    /* renamed from: e */
    public C22256n.C22257a f56924e;

    /* renamed from: f */
    public volatile boolean f56925f;
    @C0363p0

    /* renamed from: g */
    public volatile C22153c f56926g;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class C22150a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        public class C22151a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f56927a;

            public C22151a(Runnable runnable) {
                this.f56927a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f56927a.run();
            }
        }

        public Thread newThread(@C0359n0 Runnable runnable) {
            return new Thread(new C22151a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    public class C22152b implements Runnable {
        public C22152b() {
        }

        public void run() {
            C22149a.this.mo65910b();
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    public interface C22153c {
        /* renamed from: a */
        void mo65920a();
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.engine.a$d */
    public static final class C22154d extends WeakReference<C22256n<?>> {

        /* renamed from: a */
        public final C22108c f56930a;

        /* renamed from: b */
        public final boolean f56931b;
        @C0363p0

        /* renamed from: c */
        public C22270s<?> f56932c;

        public C22154d(@C0359n0 C22108c cVar, @C0359n0 C22256n<?> nVar, @C0359n0 ReferenceQueue<? super C22256n<?>> referenceQueue, boolean z) {
            super(nVar, referenceQueue);
            C22270s<?> sVar;
            this.f56930a = (C22108c) C22633m.m102624d(cVar);
            if (!nVar.mo66179e() || !z) {
                sVar = null;
            } else {
                sVar = (C22270s) C22633m.m102624d(nVar.mo66178d());
            }
            this.f56932c = sVar;
            this.f56931b = nVar.mo66179e();
        }

        /* renamed from: a */
        public void mo65921a() {
            this.f56932c = null;
            clear();
        }
    }

    public C22149a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C22150a()));
    }

    /* renamed from: a */
    public synchronized void mo65909a(C22108c cVar, C22256n<?> nVar) {
        C22154d put = this.f56922c.put(cVar, new C22154d(cVar, nVar, this.f56923d, this.f56920a));
        if (put != null) {
            put.mo65921a();
        }
    }

    /* renamed from: b */
    public void mo65910b() {
        while (!this.f56925f) {
            try {
                mo65911c((C22154d) this.f56923d.remove());
                C22153c cVar = this.f56926g;
                if (cVar != null) {
                    cVar.mo65920a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void mo65911c(@C0359n0 C22154d dVar) {
        synchronized (this) {
            this.f56922c.remove(dVar.f56930a);
            if (dVar.f56931b) {
                C22270s<?> sVar = dVar.f56932c;
                if (sVar != null) {
                    this.f56924e.mo66127d(dVar.f56930a, new C22256n(sVar, true, false, dVar.f56930a, this.f56924e));
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo65912d(C22108c cVar) {
        C22154d remove = this.f56922c.remove(cVar);
        if (remove != null) {
            remove.mo65921a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r0;
     */
    @androidx.annotation.C0363p0
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C22256n<?> mo65913e(com.bumptech.glide.load.C22108c r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a$d> r0 = r1.f56922c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.C22149a.C22154d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.n r0 = (com.bumptech.glide.load.engine.C22256n) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo65911c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C22149a.mo65913e(com.bumptech.glide.load.c):com.bumptech.glide.load.engine.n");
    }

    @C0344h1
    /* renamed from: f */
    public void mo65914f(C22153c cVar) {
        this.f56926g = cVar;
    }

    /* renamed from: g */
    public void mo65915g(C22256n.C22257a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f56924e = aVar;
            }
        }
    }

    @C0344h1
    /* renamed from: h */
    public void mo65916h() {
        this.f56925f = true;
        Executor executor = this.f56921b;
        if (executor instanceof ExecutorService) {
            C22621f.m102599c((ExecutorService) executor);
        }
    }

    @C0344h1
    public C22149a(boolean z, Executor executor) {
        this.f56922c = new HashMap();
        this.f56923d = new ReferenceQueue<>();
        this.f56920a = z;
        this.f56921b = executor;
        executor.execute(new C22152b());
    }
}
