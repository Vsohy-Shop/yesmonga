package androidx.concurrent.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
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

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractResolvableFuture<V> implements C32487a<V> {

    /* renamed from: d */
    public static final boolean f41043d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C13758b.f33438c));

    /* renamed from: e */
    public static final Logger f41044e;

    /* renamed from: f */
    public static final long f41045f = 1000;

    /* renamed from: g */
    public static final C16552b f41046g;

    /* renamed from: v */
    public static final Object f41047v = new Object();
    @C0363p0

    /* renamed from: a */
    public volatile Object f41048a;
    @C0363p0

    /* renamed from: b */
    public volatile C16554d f41049b;
    @C0363p0

    /* renamed from: c */
    public volatile C16558h f41050c;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f41051b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f41052a;

        public Failure(Throwable th) {
            this.f41052a = (Throwable) AbstractResolvableFuture.m74953w(th);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    public static abstract class C16552b {
        public C16552b() {
        }

        /* renamed from: a */
        public abstract boolean mo48114a(AbstractResolvableFuture<?> abstractResolvableFuture, C16554d dVar, C16554d dVar2);

        /* renamed from: b */
        public abstract boolean mo48115b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo48116c(AbstractResolvableFuture<?> abstractResolvableFuture, C16558h hVar, C16558h hVar2);

        /* renamed from: d */
        public abstract void mo48117d(C16558h hVar, C16558h hVar2);

        /* renamed from: e */
        public abstract void mo48118e(C16558h hVar, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    public static final class C16553c {

        /* renamed from: c */
        public static final C16553c f41053c;

        /* renamed from: d */
        public static final C16553c f41054d;

        /* renamed from: a */
        public final boolean f41055a;
        @C0363p0

        /* renamed from: b */
        public final Throwable f41056b;

        static {
            if (AbstractResolvableFuture.f41043d) {
                f41054d = null;
                f41053c = null;
                return;
            }
            f41054d = new C16553c(false, (Throwable) null);
            f41053c = new C16553c(true, (Throwable) null);
        }

        public C16553c(boolean z, @C0363p0 Throwable th) {
            this.f41055a = z;
            this.f41056b = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    public static final class C16554d {

        /* renamed from: d */
        public static final C16554d f41057d = new C16554d((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f41058a;

        /* renamed from: b */
        public final Executor f41059b;
        @C0363p0

        /* renamed from: c */
        public C16554d f41060c;

        public C16554d(Runnable runnable, Executor executor) {
            this.f41058a = runnable;
            this.f41059b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    public static final class C16555e extends C16552b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C16558h, Thread> f41061a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C16558h, C16558h> f41062b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C16558h> f41063c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C16554d> f41064d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f41065e;

        public C16555e(AtomicReferenceFieldUpdater<C16558h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C16558h, C16558h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C16558h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C16554d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f41061a = atomicReferenceFieldUpdater;
            this.f41062b = atomicReferenceFieldUpdater2;
            this.f41063c = atomicReferenceFieldUpdater3;
            this.f41064d = atomicReferenceFieldUpdater4;
            this.f41065e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo48114a(AbstractResolvableFuture<?> abstractResolvableFuture, C16554d dVar, C16554d dVar2) {
            return C16563a.m75000a(this.f41064d, abstractResolvableFuture, dVar, dVar2);
        }

        /* renamed from: b */
        public boolean mo48115b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            return C16563a.m75000a(this.f41065e, abstractResolvableFuture, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo48116c(AbstractResolvableFuture<?> abstractResolvableFuture, C16558h hVar, C16558h hVar2) {
            return C16563a.m75000a(this.f41063c, abstractResolvableFuture, hVar, hVar2);
        }

        /* renamed from: d */
        public void mo48117d(C16558h hVar, C16558h hVar2) {
            this.f41062b.lazySet(hVar, hVar2);
        }

        /* renamed from: e */
        public void mo48118e(C16558h hVar, Thread thread) {
            this.f41061a.lazySet(hVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    public static final class C16556f<V> implements Runnable {

        /* renamed from: a */
        public final AbstractResolvableFuture<V> f41066a;

        /* renamed from: b */
        public final C32487a<? extends V> f41067b;

        public C16556f(AbstractResolvableFuture<V> abstractResolvableFuture, C32487a<? extends V> aVar) {
            this.f41066a = abstractResolvableFuture;
            this.f41067b = aVar;
        }

        public void run() {
            if (this.f41066a.f41048a == this) {
                if (AbstractResolvableFuture.f41046g.mo48115b(this.f41066a, this, AbstractResolvableFuture.m74950W(this.f41067b))) {
                    AbstractResolvableFuture.m74954z(this.f41066a);
                }
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    public static final class C16557g extends C16552b {
        public C16557g() {
            super();
        }

        /* renamed from: a */
        public boolean mo48114a(AbstractResolvableFuture<?> abstractResolvableFuture, C16554d dVar, C16554d dVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f41049b != dVar) {
                    return false;
                }
                abstractResolvableFuture.f41049b = dVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo48115b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f41048a != obj) {
                    return false;
                }
                abstractResolvableFuture.f41048a = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo48116c(AbstractResolvableFuture<?> abstractResolvableFuture, C16558h hVar, C16558h hVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f41050c != hVar) {
                    return false;
                }
                abstractResolvableFuture.f41050c = hVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo48117d(C16558h hVar, C16558h hVar2) {
            hVar.f41070b = hVar2;
        }

        /* renamed from: e */
        public void mo48118e(C16558h hVar, Thread thread) {
            hVar.f41069a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$h */
    public static final class C16558h {

        /* renamed from: c */
        public static final C16558h f41068c = new C16558h(false);
        @C0363p0

        /* renamed from: a */
        public volatile Thread f41069a;
        @C0363p0

        /* renamed from: b */
        public volatile C16558h f41070b;

        public C16558h(boolean z) {
        }

        /* renamed from: a */
        public void mo48120a(C16558h hVar) {
            AbstractResolvableFuture.f41046g.mo48117d(this, hVar);
        }

        /* renamed from: b */
        public void mo48121b() {
            Thread thread = this.f41069a;
            if (thread != null) {
                this.f41069a = null;
                LockSupport.unpark(thread);
            }
        }

        public C16558h() {
            AbstractResolvableFuture.f41046g.mo48118e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$h> r0 = androidx.concurrent.futures.AbstractResolvableFuture.C16558h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f41043d = r1
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r1 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f41044e = r2
            androidx.concurrent.futures.AbstractResolvableFuture$e r2 = new androidx.concurrent.futures.AbstractResolvableFuture$e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$d> r0 = androidx.concurrent.futures.AbstractResolvableFuture.C16554d.class
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
            androidx.concurrent.futures.AbstractResolvableFuture$g r2 = new androidx.concurrent.futures.AbstractResolvableFuture$g
            r2.<init>()
        L_0x004e:
            f41046g = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f41044e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f41047v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.<clinit>():void");
    }

    /* renamed from: M */
    public static void m74949M(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f41044e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: W */
    static Object m74950W(C32487a<?> aVar) {
        if (aVar instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) aVar).f41048a;
            if (!(obj instanceof C16553c)) {
                return obj;
            }
            C16553c cVar = (C16553c) obj;
            if (!cVar.f41055a) {
                return obj;
            }
            if (cVar.f41056b != null) {
                return new C16553c(false, cVar.f41056b);
            }
            return C16553c.f41054d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f41043d) && isCancelled) {
            return C16553c.f41054d;
        }
        try {
            Object X = m74951X(aVar);
            if (X == null) {
                return f41047v;
            }
            return X;
        } catch (ExecutionException e) {
            return new Failure(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C16553c(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: X */
    static <V> V m74951X(Future<V> future) throws ExecutionException {
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

    /* renamed from: r */
    public static CancellationException m74952r(@C0363p0 String str, @C0363p0 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @C0359n0
    /* renamed from: w */
    static <T> T m74953w(@C0363p0 T t) {
        t.getClass();
        return t;
    }

    /* renamed from: z */
    public static void m74954z(AbstractResolvableFuture<?> abstractResolvableFuture) {
        C16554d dVar = null;
        AbstractResolvableFuture<V> abstractResolvableFuture2 = abstractResolvableFuture;
        while (true) {
            abstractResolvableFuture2.mo48102h0();
            abstractResolvableFuture2.mo48099g();
            C16554d y = abstractResolvableFuture2.mo48112y(dVar);
            while (true) {
                if (y != null) {
                    dVar = y.f41060c;
                    Runnable runnable = y.f41058a;
                    if (runnable instanceof C16556f) {
                        C16556f fVar = (C16556f) runnable;
                        AbstractResolvableFuture<V> abstractResolvableFuture3 = fVar.f41066a;
                        if (abstractResolvableFuture3.f41048a == fVar) {
                            if (f41046g.mo48115b(abstractResolvableFuture3, fVar, m74950W(fVar.f41067b))) {
                                abstractResolvableFuture2 = abstractResolvableFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m74949M(runnable, y.f41059b);
                    }
                    y = dVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: Q */
    public final V mo48093Q(Object obj) throws ExecutionException {
        if (obj instanceof C16553c) {
            throw m74952r("Task was cancelled.", ((C16553c) obj).f41056b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f41052a);
        } else if (obj == f41047v) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: Z */
    public void mo48094Z() {
    }

    /* renamed from: b */
    public final void mo48095b(StringBuilder sb) {
        try {
            Object X = m74951X(this);
            sb.append("SUCCESS, result=[");
            sb.append(mo48109o0(X));
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

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f41048a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.C16556f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f41043d
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.AbstractResolvableFuture$c r3 = new androidx.concurrent.futures.AbstractResolvableFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.AbstractResolvableFuture$c r3 = androidx.concurrent.futures.AbstractResolvableFuture.C16553c.f41053c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.AbstractResolvableFuture$c r3 = androidx.concurrent.futures.AbstractResolvableFuture.C16553c.f41054d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.concurrent.futures.AbstractResolvableFuture$b r6 = f41046g
            boolean r6 = r6.mo48115b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo48094Z()
        L_0x0035:
            m74954z(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.C16556f
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.AbstractResolvableFuture$f r0 = (androidx.concurrent.futures.AbstractResolvableFuture.C16556f) r0
            com.google.common.util.concurrent.a<? extends V> r0 = r0.f41067b
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.AbstractResolvableFuture r4 = (androidx.concurrent.futures.AbstractResolvableFuture) r4
            java.lang.Object r0 = r4.f41048a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.C16556f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f41048a
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.C16556f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.cancel(boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo48097e0(@C0363p0 Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isCancelled()) {
            future.cancel(mo48110p0());
        }
    }

    @C0363p0
    /* renamed from: f0 */
    public String mo48098f0() {
        Object obj = this.f41048a;
        if (obj instanceof C16556f) {
            return "setFuture=[" + mo48109o0(((C16556f) obj).f41067b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: g */
    public void mo48099g() {
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f41048a;
            if ((obj != null) && (!(obj instanceof C16556f))) {
                return mo48093Q(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C16558h hVar = this.f41050c;
                if (hVar != C16558h.f41068c) {
                    C16558h hVar2 = new C16558h();
                    do {
                        hVar2.mo48120a(hVar);
                        if (f41046g.mo48116c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f41048a;
                                    if ((obj2 != null) && (!(obj2 instanceof C16556f))) {
                                        return mo48093Q(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo48103i0(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo48103i0(hVar2);
                        } else {
                            hVar = this.f41050c;
                        }
                    } while (hVar != C16558h.f41068c);
                }
                return mo48093Q(this.f41048a);
            }
            while (nanos > 0) {
                Object obj3 = this.f41048a;
                if ((obj3 != null) && (!(obj3 instanceof C16556f))) {
                    return mo48093Q(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractResolvableFuture = toString();
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
            throw new TimeoutException(str + " for " + abstractResolvableFuture);
        }
        throw new InterruptedException();
    }

    /* renamed from: h0 */
    public final void mo48102h0() {
        C16558h hVar;
        do {
            hVar = this.f41050c;
        } while (!f41046g.mo48116c(this, hVar, C16558h.f41068c));
        while (hVar != null) {
            hVar.mo48121b();
            hVar = hVar.f41070b;
        }
    }

    /* renamed from: i0 */
    public final void mo48103i0(C16558h hVar) {
        hVar.f41069a = null;
        while (true) {
            C16558h hVar2 = this.f41050c;
            if (hVar2 != C16558h.f41068c) {
                C16558h hVar3 = null;
                while (hVar2 != null) {
                    C16558h hVar4 = hVar2.f41070b;
                    if (hVar2.f41069a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f41070b = hVar4;
                        if (hVar3.f41069a == null) {
                        }
                    } else if (!f41046g.mo48116c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f41048a instanceof C16553c;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f41048a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C16556f)) & z;
    }

    /* renamed from: j0 */
    public boolean mo48106j0(@C0363p0 V v) {
        if (v == null) {
            v = f41047v;
        }
        if (!f41046g.mo48115b(this, (Object) null, v)) {
            return false;
        }
        m74954z(this);
        return true;
    }

    /* renamed from: m0 */
    public boolean mo48107m0(Throwable th) {
        if (!f41046g.mo48115b(this, (Object) null, new Failure((Throwable) m74953w(th)))) {
            return false;
        }
        m74954z(this);
        return true;
    }

    /* renamed from: n0 */
    public boolean mo48108n0(C32487a<? extends V> aVar) {
        C16556f fVar;
        Failure failure;
        m74953w(aVar);
        Object obj = this.f41048a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f41046g.mo48115b(this, (Object) null, m74950W(aVar))) {
                    return false;
                }
                m74954z(this);
                return true;
            }
            fVar = new C16556f(this, aVar);
            if (f41046g.mo48115b(this, (Object) null, fVar)) {
                try {
                    aVar.mo5489q(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f41051b;
                }
                return true;
            }
            obj = this.f41048a;
        }
        if (obj instanceof C16553c) {
            aVar.cancel(((C16553c) obj).f41055a);
        }
        return false;
        f41046g.mo48115b(this, fVar, failure);
        return true;
    }

    /* renamed from: o0 */
    public final String mo48109o0(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: p0 */
    public final boolean mo48110p0() {
        Object obj = this.f41048a;
        if (!(obj instanceof C16553c) || !((C16553c) obj).f41055a) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final void mo5489q(Runnable runnable, Executor executor) {
        m74953w(runnable);
        m74953w(executor);
        C16554d dVar = this.f41049b;
        if (dVar != C16554d.f41057d) {
            C16554d dVar2 = new C16554d(runnable, executor);
            do {
                dVar2.f41060c = dVar;
                if (!f41046g.mo48114a(this, dVar, dVar2)) {
                    dVar = this.f41049b;
                } else {
                    return;
                }
            } while (dVar != C16554d.f41057d);
        }
        m74949M(runnable, executor);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo48095b(sb);
        } else {
            try {
                str = mo48098f0();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo48095b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: y */
    public final C16554d mo48112y(C16554d dVar) {
        C16554d dVar2;
        do {
            dVar2 = this.f41049b;
        } while (!f41046g.mo48114a(this, dVar2, C16554d.f41057d));
        C16554d dVar3 = dVar2;
        C16554d dVar4 = dVar;
        C16554d dVar5 = dVar3;
        while (dVar5 != null) {
            C16554d dVar6 = dVar5.f41060c;
            dVar5.f41060c = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41048a;
            if ((obj2 != null) && (!(obj2 instanceof C16556f))) {
                return mo48093Q(obj2);
            }
            C16558h hVar = this.f41050c;
            if (hVar != C16558h.f41068c) {
                C16558h hVar2 = new C16558h();
                do {
                    hVar2.mo48120a(hVar);
                    if (f41046g.mo48116c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41048a;
                            } else {
                                mo48103i0(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C16556f))));
                        return mo48093Q(obj);
                    }
                    hVar = this.f41050c;
                } while (hVar != C16558h.f41068c);
            }
            return mo48093Q(this.f41048a);
        }
        throw new InterruptedException();
    }
}
