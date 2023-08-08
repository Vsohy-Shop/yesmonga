package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.i0 */
public final class C12478i0 {
    @C12579k

    /* renamed from: a */
    public final C12500m f30425a = new C12500m();

    /* renamed from: b */
    public boolean f30426b;

    /* renamed from: c */
    public boolean f30427c;

    /* renamed from: d */
    public boolean f30428d;
    @C12580l

    /* renamed from: e */
    public C12506n0 f30429e;
    @C12579k

    /* renamed from: f */
    public final C12506n0 f30430f;
    @C12579k

    /* renamed from: g */
    public final C12510p0 f30431g;

    /* renamed from: h */
    public final long f30432h;

    /* renamed from: okio.i0$a */
    public static final class C12479a implements C12506n0 {

        /* renamed from: a */
        public final C12516r0 f30433a = new C12516r0();

        /* renamed from: b */
        public final /* synthetic */ C12478i0 f30434b;

        public C12479a(C12478i0 i0Var) {
            this.f30434b = i0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            r0 = r12.f30434b;
            r2 = r1.timeout();
            r0 = r0.mo27218q().timeout();
            r3 = r2.timeoutNanos();
            r5 = okio.C12516r0.Companion.mo27441a(r0.timeoutNanos(), r2.timeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r2.timeout(r5, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
            if (r2.hasDeadline() == false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            r5 = r2.deadlineNanoTime();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
            if (r0.hasDeadline() == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
            r2.deadlineNanoTime(java.lang.Math.min(r2.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
            r2.timeout(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            if (r0.hasDeadline() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
            r2.deadlineNanoTime(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
            r2.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
            if (r0.hasDeadline() != false) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
            r2.deadlineNanoTime(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (r0.hasDeadline() == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            r2.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
            r2.timeout(r3, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
            if (r0.hasDeadline() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
            r2.clearDeadline();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
            r2.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
            if (r0.hasDeadline() != false) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
            r2.clearDeadline();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r12 = this;
                okio.i0 r0 = r12.f30434b
                okio.m r0 = r0.mo27208g()
                monitor-enter(r0)
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                boolean r1 = r1.mo27212k()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x0011
                monitor-exit(r0)
                return
            L_0x0011:
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                okio.n0 r1 = r1.mo27210i()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x001a
                goto L_0x004d
            L_0x001a:
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                boolean r1 = r1.mo27213l()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x003b
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                okio.m r1 = r1.mo27208g()     // Catch:{ all -> 0x00ec }
                long r1 = r1.mo27362c0()     // Catch:{ all -> 0x00ec }
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L_0x0033
                goto L_0x003b
            L_0x0033:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x00ec }
                throw r1     // Catch:{ all -> 0x00ec }
            L_0x003b:
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                r2 = 1
                r1.mo27216o(r2)     // Catch:{ all -> 0x00ec }
                okio.i0 r1 = r12.f30434b     // Catch:{ all -> 0x00ec }
                okio.m r1 = r1.mo27208g()     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x00e4
                r1.notifyAll()     // Catch:{ all -> 0x00ec }
                r1 = 0
            L_0x004d:
                kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00ec }
                monitor-exit(r0)
                if (r1 == 0) goto L_0x00e3
                okio.i0 r0 = r12.f30434b
                okio.r0 r2 = r1.timeout()
                okio.n0 r0 = r0.mo27218q()
                okio.r0 r0 = r0.timeout()
                long r3 = r2.timeoutNanos()
                okio.r0$b r5 = okio.C12516r0.Companion
                long r6 = r0.timeoutNanos()
                long r8 = r2.timeoutNanos()
                long r5 = r5.mo27441a(r6, r8)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.timeout(r5, r7)
                boolean r5 = r2.hasDeadline()
                if (r5 == 0) goto L_0x00b6
                long r5 = r2.deadlineNanoTime()
                boolean r8 = r0.hasDeadline()
                if (r8 == 0) goto L_0x0096
                long r8 = r2.deadlineNanoTime()
                long r10 = r0.deadlineNanoTime()
                long r8 = java.lang.Math.min(r8, r10)
                r2.deadlineNanoTime(r8)
            L_0x0096:
                r1.close()     // Catch:{ all -> 0x00a6 }
                r2.timeout(r3, r7)
                boolean r0 = r0.hasDeadline()
                if (r0 == 0) goto L_0x00e3
                r2.deadlineNanoTime(r5)
                goto L_0x00e3
            L_0x00a6:
                r1 = move-exception
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.timeout(r3, r7)
                boolean r0 = r0.hasDeadline()
                if (r0 == 0) goto L_0x00b5
                r2.deadlineNanoTime(r5)
            L_0x00b5:
                throw r1
            L_0x00b6:
                boolean r5 = r0.hasDeadline()
                if (r5 == 0) goto L_0x00c3
                long r5 = r0.deadlineNanoTime()
                r2.deadlineNanoTime(r5)
            L_0x00c3:
                r1.close()     // Catch:{ all -> 0x00d3 }
                r2.timeout(r3, r7)
                boolean r0 = r0.hasDeadline()
                if (r0 == 0) goto L_0x00e3
                r2.clearDeadline()
                goto L_0x00e3
            L_0x00d3:
                r1 = move-exception
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r2.timeout(r3, r5)
                boolean r0 = r0.hasDeadline()
                if (r0 == 0) goto L_0x00e2
                r2.clearDeadline()
            L_0x00e2:
                throw r1
            L_0x00e3:
                return
            L_0x00e4:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ec }
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r1.<init>(r2)     // Catch:{ all -> 0x00ec }
                throw r1     // Catch:{ all -> 0x00ec }
            L_0x00ec:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C12478i0.C12479a.close():void");
        }

        public void flush() {
            C12506n0 i;
            synchronized (this.f30434b.mo27208g()) {
                if (!(!this.f30434b.mo27212k())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f30434b.mo27209h()) {
                    i = this.f30434b.mo27210i();
                    if (i == null) {
                        if (this.f30434b.mo27213l()) {
                            if (this.f30434b.mo27208g().mo27362c0() > 0) {
                                throw new IOException("source is closed");
                            }
                        }
                        i = null;
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new IOException("canceled");
                }
            }
            if (i != null) {
                C12478i0 i0Var = this.f30434b;
                C12516r0 timeout = i.timeout();
                C12516r0 timeout2 = i0Var.mo27218q().timeout();
                long timeoutNanos = timeout.timeoutNanos();
                long a = C12516r0.Companion.mo27441a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.timeout(a, timeUnit);
                if (timeout.hasDeadline()) {
                    long deadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        i.flush();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                    } catch (Throwable th) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        i.flush();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
            }
        }

        @C12579k
        public C12516r0 timeout() {
            return this.f30433a;
        }

        public void write(@C12579k C12500m mVar, long j) {
            C12506n0 n0Var;
            Intrinsics.checkNotNullParameter(mVar, "source");
            synchronized (this.f30434b.mo27208g()) {
                if (!(!this.f30434b.mo27212k())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f30434b.mo27209h()) {
                    while (true) {
                        if (j <= 0) {
                            n0Var = null;
                            break;
                        }
                        n0Var = this.f30434b.mo27210i();
                        if (n0Var != null) {
                            break;
                        } else if (!this.f30434b.mo27213l()) {
                            long j2 = this.f30434b.mo27211j() - this.f30434b.mo27208g().mo27362c0();
                            if (j2 == 0) {
                                this.f30433a.waitUntilNotified(this.f30434b.mo27208g());
                                if (this.f30434b.mo27209h()) {
                                    throw new IOException("canceled");
                                }
                            } else {
                                long min = Math.min(j2, j);
                                this.f30434b.mo27208g().write(mVar, min);
                                j -= min;
                                C12500m g = this.f30434b.mo27208g();
                                if (g != null) {
                                    g.notifyAll();
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new IOException("canceled");
                }
            }
            if (n0Var != null) {
                C12478i0 i0Var = this.f30434b;
                C12516r0 timeout = n0Var.timeout();
                C12516r0 timeout2 = i0Var.mo27218q().timeout();
                long timeoutNanos = timeout.timeoutNanos();
                long a = C12516r0.Companion.mo27441a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.timeout(a, timeUnit);
                if (timeout.hasDeadline()) {
                    long deadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        n0Var.write(mVar, j);
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                    } catch (Throwable th) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        n0Var.write(mVar, j);
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: okio.i0$b */
    public static final class C12480b implements C12510p0 {

        /* renamed from: a */
        public final C12516r0 f30435a = new C12516r0();

        /* renamed from: b */
        public final /* synthetic */ C12478i0 f30436b;

        public C12480b(C12478i0 i0Var) {
            this.f30436b = i0Var;
        }

        public void close() {
            synchronized (this.f30436b.mo27208g()) {
                this.f30436b.mo27217p(true);
                C12500m g = this.f30436b.mo27208g();
                if (g != null) {
                    g.notifyAll();
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
        }

        public long read(@C12579k C12500m mVar, long j) {
            Intrinsics.checkNotNullParameter(mVar, "sink");
            synchronized (this.f30436b.mo27208g()) {
                if (!(!this.f30436b.mo27213l())) {
                    throw new IllegalStateException("closed".toString());
                } else if (!this.f30436b.mo27209h()) {
                    while (this.f30436b.mo27208g().mo27362c0() == 0) {
                        if (this.f30436b.mo27212k()) {
                            return -1;
                        }
                        this.f30435a.waitUntilNotified(this.f30436b.mo27208g());
                        if (this.f30436b.mo27209h()) {
                            throw new IOException("canceled");
                        }
                    }
                    long read = this.f30436b.mo27208g().read(mVar, j);
                    C12500m g = this.f30436b.mo27208g();
                    if (g != null) {
                        g.notifyAll();
                        return read;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                } else {
                    throw new IOException("canceled");
                }
            }
        }

        @C12579k
        public C12516r0 timeout() {
            return this.f30435a;
        }
    }

    public C12478i0(long j) {
        boolean z;
        this.f30432h = j;
        if (j >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f30430f = new C12479a(this);
            this.f30431g = new C12480b(this);
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "sink", imports = {}))
    @C11314h(name = "-deprecated_sink")
    @C12579k
    /* renamed from: a */
    public final C12506n0 mo27203a() {
        return this.f30430f;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "source", imports = {}))
    @C11314h(name = "-deprecated_source")
    @C12579k
    /* renamed from: b */
    public final C12510p0 mo27204b() {
        return this.f30431g;
    }

    /* renamed from: d */
    public final void mo27205d() {
        synchronized (this.f30425a) {
            this.f30426b = true;
            this.f30425a.mo27367f();
            C12500m mVar = this.f30425a;
            if (mVar != null) {
                mVar.notifyAll();
                C11079d2 d2Var = C11079d2.f28267a;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8.write(r3, r3.mo27362c0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r1 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r8.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        monitor-enter(r7.f30425a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.f30428d = true;
        r1 = r7.f30425a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r1 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        r1.notifyAll();
        r1 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        throw r8;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27206e(@org.jetbrains.annotations.C12579k okio.C12506n0 r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
        L_0x0005:
            okio.m r0 = r7.f30425a
            monitor-enter(r0)
            okio.n0 r1 = r7.f30429e     // Catch:{ all -> 0x0089 }
            r2 = 1
            if (r1 != 0) goto L_0x000f
            r1 = r2
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x007d
            boolean r1 = r7.f30426b     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0073
            okio.m r1 = r7.f30425a     // Catch:{ all -> 0x0089 }
            boolean r1 = r1.mo27275J2()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0024
            r7.f30428d = r2     // Catch:{ all -> 0x0089 }
            r7.f30429e = r8     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return
        L_0x0024:
            boolean r1 = r7.f30427c     // Catch:{ all -> 0x0089 }
            okio.m r3 = new okio.m     // Catch:{ all -> 0x0089 }
            r3.<init>()     // Catch:{ all -> 0x0089 }
            okio.m r4 = r7.f30425a     // Catch:{ all -> 0x0089 }
            long r5 = r4.mo27362c0()     // Catch:{ all -> 0x0089 }
            r3.write(r4, r5)     // Catch:{ all -> 0x0089 }
            okio.m r4 = r7.f30425a     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x006b
            r4.notifyAll()     // Catch:{ all -> 0x0089 }
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            long r4 = r3.mo27362c0()     // Catch:{ all -> 0x004f }
            r8.write(r3, r4)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            r8.close()     // Catch:{ all -> 0x004f }
            goto L_0x0005
        L_0x004b:
            r8.flush()     // Catch:{ all -> 0x004f }
            goto L_0x0005
        L_0x004f:
            r8 = move-exception
            okio.m r0 = r7.f30425a
            monitor-enter(r0)
            r7.f30428d = r2     // Catch:{ all -> 0x0068 }
            okio.m r1 = r7.f30425a     // Catch:{ all -> 0x0068 }
            if (r1 != 0) goto L_0x0061
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0068 }
            throw r8     // Catch:{ all -> 0x0068 }
        L_0x0061:
            r1.notifyAll()     // Catch:{ all -> 0x0068 }
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)
            throw r8
        L_0x0068:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x006b:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0073:
            r7.f30429e = r8     // Catch:{ all -> 0x0089 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x007d:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0089 }
            r1.<init>(r8)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C12478i0.mo27206e(okio.n0):void");
    }

    /* renamed from: f */
    public final void mo27207f(C12506n0 n0Var, C11300l<? super C12506n0, C11079d2> lVar) {
        C12516r0 timeout = n0Var.timeout();
        C12516r0 timeout2 = mo27218q().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long a = C12516r0.Companion.mo27441a(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(a, timeUnit);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                lVar.invoke(n0Var);
                C11322b0.m43481d(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                C11322b0.m43480c(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                C11322b0.m43480c(1);
                throw th;
            }
        } else {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(n0Var);
                C11322b0.m43481d(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                C11322b0.m43480c(1);
            } catch (Throwable th2) {
                C11322b0.m43481d(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                C11322b0.m43480c(1);
                throw th2;
            }
        }
    }

    @C12579k
    /* renamed from: g */
    public final C12500m mo27208g() {
        return this.f30425a;
    }

    /* renamed from: h */
    public final boolean mo27209h() {
        return this.f30426b;
    }

    @C12580l
    /* renamed from: i */
    public final C12506n0 mo27210i() {
        return this.f30429e;
    }

    /* renamed from: j */
    public final long mo27211j() {
        return this.f30432h;
    }

    /* renamed from: k */
    public final boolean mo27212k() {
        return this.f30427c;
    }

    /* renamed from: l */
    public final boolean mo27213l() {
        return this.f30428d;
    }

    /* renamed from: m */
    public final void mo27214m(boolean z) {
        this.f30426b = z;
    }

    /* renamed from: n */
    public final void mo27215n(@C12580l C12506n0 n0Var) {
        this.f30429e = n0Var;
    }

    /* renamed from: o */
    public final void mo27216o(boolean z) {
        this.f30427c = z;
    }

    /* renamed from: p */
    public final void mo27217p(boolean z) {
        this.f30428d = z;
    }

    @C11314h(name = "sink")
    @C12579k
    /* renamed from: q */
    public final C12506n0 mo27218q() {
        return this.f30430f;
    }

    @C11314h(name = "source")
    @C12579k
    /* renamed from: r */
    public final C12510p0 mo27219r() {
        return this.f30431g;
    }
}
