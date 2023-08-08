package androidx.work.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C16563a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.common.util.concurrent.C32487a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractFuture<V> implements C32487a<V> {

    /* renamed from: d */
    public static final boolean f54978d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C13758b.f33438c));

    /* renamed from: e */
    public static final Logger f54979e;

    /* renamed from: f */
    public static final long f54980f = 1000;

    /* renamed from: g */
    public static final C21310b f54981g;

    /* renamed from: v */
    public static final Object f54982v = new Object();
    @C0363p0

    /* renamed from: a */
    public volatile Object f54983a;
    @C0363p0

    /* renamed from: b */
    public volatile C21312d f54984b;
    @C0363p0

    /* renamed from: c */
    public volatile C21316h f54985c;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f54986b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f54987a;

        public Failure(Throwable th) {
            this.f54987a = (Throwable) AbstractFuture.m98387d(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    public static abstract class C21310b {
        public C21310b() {
        }

        /* renamed from: a */
        public abstract boolean mo63666a(AbstractFuture<?> abstractFuture, C21312d dVar, C21312d dVar2);

        /* renamed from: b */
        public abstract boolean mo63667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo63668c(AbstractFuture<?> abstractFuture, C21316h hVar, C21316h hVar2);

        /* renamed from: d */
        public abstract void mo63669d(C21316h hVar, C21316h hVar2);

        /* renamed from: e */
        public abstract void mo63670e(C21316h hVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    public static final class C21311c {

        /* renamed from: c */
        public static final C21311c f54988c;

        /* renamed from: d */
        public static final C21311c f54989d;

        /* renamed from: a */
        public final boolean f54990a;
        @C0363p0

        /* renamed from: b */
        public final Throwable f54991b;

        static {
            if (AbstractFuture.f54978d) {
                f54989d = null;
                f54988c = null;
                return;
            }
            f54989d = new C21311c(false, (Throwable) null);
            f54988c = new C21311c(true, (Throwable) null);
        }

        public C21311c(boolean z, @C0363p0 Throwable th) {
            this.f54990a = z;
            this.f54991b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    public static final class C21312d {

        /* renamed from: d */
        public static final C21312d f54992d = new C21312d((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f54993a;

        /* renamed from: b */
        public final Executor f54994b;
        @C0363p0

        /* renamed from: c */
        public C21312d f54995c;

        public C21312d(Runnable runnable, Executor executor) {
            this.f54993a = runnable;
            this.f54994b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    public static final class C21313e extends C21310b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C21316h, Thread> f54996a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C21316h, C21316h> f54997b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C21316h> f54998c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C21312d> f54999d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f55000e;

        public C21313e(AtomicReferenceFieldUpdater<C21316h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C21316h, C21316h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C21316h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C21312d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f54996a = atomicReferenceFieldUpdater;
            this.f54997b = atomicReferenceFieldUpdater2;
            this.f54998c = atomicReferenceFieldUpdater3;
            this.f54999d = atomicReferenceFieldUpdater4;
            this.f55000e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo63666a(AbstractFuture<?> abstractFuture, C21312d dVar, C21312d dVar2) {
            return C16563a.m75000a(this.f54999d, abstractFuture, dVar, dVar2);
        }

        /* renamed from: b */
        public boolean mo63667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C16563a.m75000a(this.f55000e, abstractFuture, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo63668c(AbstractFuture<?> abstractFuture, C21316h hVar, C21316h hVar2) {
            return C16563a.m75000a(this.f54998c, abstractFuture, hVar, hVar2);
        }

        /* renamed from: d */
        public void mo63669d(C21316h hVar, C21316h hVar2) {
            this.f54997b.lazySet(hVar, hVar2);
        }

        /* renamed from: e */
        public void mo63670e(C21316h hVar, Thread thread) {
            this.f54996a.lazySet(hVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    public static final class C21314f<V> implements Runnable {

        /* renamed from: a */
        public final AbstractFuture<V> f55001a;

        /* renamed from: b */
        public final C32487a<? extends V> f55002b;

        public C21314f(AbstractFuture<V> abstractFuture, C32487a<? extends V> aVar) {
            this.f55001a = abstractFuture;
            this.f55002b = aVar;
        }

        public void run() {
            if (this.f55001a.f54983a == this) {
                if (AbstractFuture.f54981g.mo63667b(this.f55001a, this, AbstractFuture.m98390i(this.f55002b))) {
                    AbstractFuture.m98388f(this.f55001a);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    public static final class C21315g extends C21310b {
        public C21315g() {
            super();
        }

        /* renamed from: a */
        public boolean mo63666a(AbstractFuture<?> abstractFuture, C21312d dVar, C21312d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f54984b != dVar) {
                    return false;
                }
                abstractFuture.f54984b = dVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo63667b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f54983a != obj) {
                    return false;
                }
                abstractFuture.f54983a = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo63668c(AbstractFuture<?> abstractFuture, C21316h hVar, C21316h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f54985c != hVar) {
                    return false;
                }
                abstractFuture.f54985c = hVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo63669d(C21316h hVar, C21316h hVar2) {
            hVar.f55005b = hVar2;
        }

        /* renamed from: e */
        public void mo63670e(C21316h hVar, Thread thread) {
            hVar.f55004a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$h */
    public static final class C21316h {

        /* renamed from: c */
        public static final C21316h f55003c = new C21316h(false);
        @C0363p0

        /* renamed from: a */
        public volatile Thread f55004a;
        @C0363p0

        /* renamed from: b */
        public volatile C21316h f55005b;

        public C21316h(boolean z) {
        }

        /* renamed from: a */
        public void mo63672a(C21316h hVar) {
            AbstractFuture.f54981g.mo63669d(this, hVar);
        }

        /* renamed from: b */
        public void mo63673b() {
            Thread thread = this.f55004a;
            if (thread != null) {
                this.f55004a = null;
                LockSupport.unpark(thread);
            }
        }

        public C21316h() {
            AbstractFuture.f54981g.mo63670e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.work.impl.utils.futures.AbstractFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$h> r0 = androidx.work.impl.utils.futures.AbstractFuture.C21316h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f54978d = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f54979e = r2
            androidx.work.impl.utils.futures.AbstractFuture$e r2 = new androidx.work.impl.utils.futures.AbstractFuture$e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$d> r0 = androidx.work.impl.utils.futures.AbstractFuture.C21312d.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$g r2 = new androidx.work.impl.utils.futures.AbstractFuture$g
            r2.<init>()
        L_0x004e:
            f54981g = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f54979e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f54982v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    /* renamed from: c */
    public static CancellationException m98386c(@C0363p0 String str, @C0363p0 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @C0359n0
    /* renamed from: d */
    public static <T> T m98387d(@C0363p0 T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static void m98388f(AbstractFuture<?> abstractFuture) {
        C21312d dVar = null;
        AbstractFuture<V> abstractFuture2 = abstractFuture;
        while (true) {
            abstractFuture2.mo63657n();
            abstractFuture2.mo63646b();
            C21312d e = abstractFuture2.mo63648e(dVar);
            while (true) {
                if (e != null) {
                    dVar = e.f54995c;
                    Runnable runnable = e.f54993a;
                    if (runnable instanceof C21314f) {
                        C21314f fVar = (C21314f) runnable;
                        AbstractFuture<V> abstractFuture3 = fVar.f55001a;
                        if (abstractFuture3.f54983a == fVar) {
                            if (f54981g.mo63667b(abstractFuture3, fVar, m98390i(fVar.f55002b))) {
                                abstractFuture2 = abstractFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m98389g(runnable, e.f54994b);
                    }
                    e = dVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public static void m98389g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f54979e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    public static Object m98390i(C32487a<?> aVar) {
        if (aVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) aVar).f54983a;
            if (!(obj instanceof C21311c)) {
                return obj;
            }
            C21311c cVar = (C21311c) obj;
            if (!cVar.f54990a) {
                return obj;
            }
            if (cVar.f54991b != null) {
                return new C21311c(false, cVar.f54991b);
            }
            return C21311c.f54989d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f54978d) && isCancelled) {
            return C21311c.f54989d;
        }
        try {
            Object j = m98391j(aVar);
            if (j == null) {
                return f54982v;
            }
            return j;
        } catch (ExecutionException e) {
            return new Failure(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C21311c(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* renamed from: j */
    public static <V> V m98391j(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public final void mo63645a(StringBuilder sb) {
        try {
            Object j = m98391j(this);
            sb.append("SUCCESS, result=[");
            sb.append(mo63662t(j));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: b */
    public void mo63646b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f54983a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C21314f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f54978d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.C21311c.f54988c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.C21311c.f54989d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = f54981g
            boolean r6 = r6.mo63667b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo63654k()
        L_0x0035:
            m98388f(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C21314f
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.C21314f) r0
            com.google.common.util.concurrent.a<? extends V> r0 = r0.f55002b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f54983a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C21314f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f54983a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C21314f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public final C21312d mo63648e(C21312d dVar) {
        C21312d dVar2;
        do {
            dVar2 = this.f54984b;
        } while (!f54981g.mo63666a(this, dVar2, C21312d.f54992d));
        C21312d dVar3 = dVar2;
        C21312d dVar4 = dVar;
        C21312d dVar5 = dVar3;
        while (dVar5 != null) {
            C21312d dVar6 = dVar5.f54995c;
            dVar5.f54995c = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f54983a;
            if ((obj != null) && (!(obj instanceof C21314f))) {
                return mo63651h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C21316h hVar = this.f54985c;
                if (hVar != C21316h.f55003c) {
                    C21316h hVar2 = new C21316h();
                    do {
                        hVar2.mo63672a(hVar);
                        if (f54981g.mo63668c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f54983a;
                                    if ((obj2 != null) && (!(obj2 instanceof C21314f))) {
                                        return mo63651h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo63658o(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo63658o(hVar2);
                        } else {
                            hVar = this.f54985c;
                        }
                    } while (hVar != C21316h.f55003c);
                }
                return mo63651h(this.f54983a);
            }
            while (nanos > 0) {
                Object obj3 = this.f54983a;
                if ((obj3 != null) && (!(obj3 instanceof C21314f))) {
                    return mo63651h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    /* renamed from: h */
    public final V mo63651h(Object obj) throws ExecutionException {
        if (obj instanceof C21311c) {
            throw m98386c("Task was cancelled.", ((C21311c) obj).f54991b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f54987a);
        } else if (obj == f54982v) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean isCancelled() {
        return this.f54983a instanceof C21311c;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f54983a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C21314f)) & z;
    }

    /* renamed from: k */
    public void mo63654k() {
    }

    /* renamed from: l */
    public final void mo63655l(@C0363p0 Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isCancelled()) {
            future.cancel(mo63664u());
        }
    }

    @C0363p0
    /* renamed from: m */
    public String mo63656m() {
        Object obj = this.f54983a;
        if (obj instanceof C21314f) {
            return "setFuture=[" + mo63662t(((C21314f) obj).f55002b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: n */
    public final void mo63657n() {
        C21316h hVar;
        do {
            hVar = this.f54985c;
        } while (!f54981g.mo63668c(this, hVar, C21316h.f55003c));
        while (hVar != null) {
            hVar.mo63673b();
            hVar = hVar.f55005b;
        }
    }

    /* renamed from: o */
    public final void mo63658o(C21316h hVar) {
        hVar.f55004a = null;
        while (true) {
            C21316h hVar2 = this.f54985c;
            if (hVar2 != C21316h.f55003c) {
                C21316h hVar3 = null;
                while (hVar2 != null) {
                    C21316h hVar4 = hVar2.f55005b;
                    if (hVar2.f55004a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f55005b = hVar4;
                        if (hVar3.f55004a == null) {
                        }
                    } else if (!f54981g.mo63668c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: p */
    public boolean mo63659p(@C0363p0 V v) {
        if (v == null) {
            v = f54982v;
        }
        if (!f54981g.mo63667b(this, (Object) null, v)) {
            return false;
        }
        m98388f(this);
        return true;
    }

    /* renamed from: q */
    public final void mo5489q(Runnable runnable, Executor executor) {
        m98387d(runnable);
        m98387d(executor);
        C21312d dVar = this.f54984b;
        if (dVar != C21312d.f54992d) {
            C21312d dVar2 = new C21312d(runnable, executor);
            do {
                dVar2.f54995c = dVar;
                if (!f54981g.mo63666a(this, dVar, dVar2)) {
                    dVar = this.f54984b;
                } else {
                    return;
                }
            } while (dVar != C21312d.f54992d);
        }
        m98389g(runnable, executor);
    }

    /* renamed from: r */
    public boolean mo63660r(Throwable th) {
        if (!f54981g.mo63667b(this, (Object) null, new Failure((Throwable) m98387d(th)))) {
            return false;
        }
        m98388f(this);
        return true;
    }

    /* renamed from: s */
    public boolean mo63661s(C32487a<? extends V> aVar) {
        C21314f fVar;
        Failure failure;
        m98387d(aVar);
        Object obj = this.f54983a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f54981g.mo63667b(this, (Object) null, m98390i(aVar))) {
                    return false;
                }
                m98388f(this);
                return true;
            }
            fVar = new C21314f(this, aVar);
            if (f54981g.mo63667b(this, (Object) null, fVar)) {
                try {
                    aVar.mo5489q(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f54986b;
                }
                return true;
            }
            obj = this.f54983a;
        }
        if (obj instanceof C21311c) {
            aVar.cancel(((C21311c) obj).f54990a);
        }
        return false;
        f54981g.mo63667b(this, fVar, failure);
        return true;
    }

    /* renamed from: t */
    public final String mo63662t(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo63645a(sb);
        } else {
            try {
                str = mo63656m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo63645a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo63664u() {
        Object obj = this.f54983a;
        if (!(obj instanceof C21311c) || !((C21311c) obj).f54990a) {
            return false;
        }
        return true;
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f54983a;
            if ((obj2 != null) && (!(obj2 instanceof C21314f))) {
                return mo63651h(obj2);
            }
            C21316h hVar = this.f54985c;
            if (hVar != C21316h.f55003c) {
                C21316h hVar2 = new C21316h();
                do {
                    hVar2.mo63672a(hVar);
                    if (f54981g.mo63668c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f54983a;
                            } else {
                                mo63658o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C21314f))));
                        return mo63651h(obj);
                    }
                    hVar = this.f54985c;
                } while (hVar != C21316h.f55003c);
            }
            return mo63651h(this.f54983a);
        }
        throw new InterruptedException();
    }
}
