package okio;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.k */
public class C12490k extends C12516r0 {
    @C12579k
    public static final C12491a Companion = new C12491a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS;
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static C12490k head;
    /* access modifiers changed from: private */
    public boolean inQueue;
    /* access modifiers changed from: private */
    public C12490k next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    /* renamed from: okio.k$a */
    public static final class C12491a {
        public C12491a() {
        }

        @C12580l
        /* renamed from: c */
        public final C12490k mo27260c() throws InterruptedException {
            C12490k access$getHead$cp = C12490k.head;
            Intrinsics.checkNotNull(access$getHead$cp);
            C12490k access$getNext$p = access$getHead$cp.next;
            Class<C12490k> cls = C12490k.class;
            if (access$getNext$p == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C12490k.IDLE_TIMEOUT_MILLIS);
                C12490k access$getHead$cp2 = C12490k.head;
                Intrinsics.checkNotNull(access$getHead$cp2);
                if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < C12490k.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C12490k.head;
            }
            long access$remainingNanos = access$getNext$p.mo27253a(System.nanoTime());
            if (access$remainingNanos > 0) {
                long j = access$remainingNanos / 1000000;
                cls.wait(j, (int) (access$remainingNanos - (1000000 * j)));
                return null;
            }
            C12490k access$getHead$cp3 = C12490k.head;
            Intrinsics.checkNotNull(access$getHead$cp3);
            access$getHead$cp3.next = access$getNext$p.next;
            access$getNext$p.next = null;
            return access$getNext$p;
        }

        /* renamed from: d */
        public final boolean mo27261d(C12490k kVar) {
            synchronized (C12490k.class) {
                if (!kVar.inQueue) {
                    return false;
                }
                kVar.inQueue = false;
                for (C12490k access$getHead$cp = C12490k.head; access$getHead$cp != null; access$getHead$cp = access$getHead$cp.next) {
                    if (access$getHead$cp.next == kVar) {
                        access$getHead$cp.next = kVar.next;
                        kVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: e */
        public final void mo27262e(C12490k kVar, long j, boolean z) {
            synchronized (C12490k.class) {
                if (!kVar.inQueue) {
                    kVar.inQueue = true;
                    if (C12490k.head == null) {
                        C12490k.head = new C12490k();
                        new C12492b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        kVar.timeoutAt = Math.min(j, kVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        kVar.timeoutAt = j + nanoTime;
                    } else if (z) {
                        kVar.timeoutAt = kVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long access$remainingNanos = kVar.mo27253a(nanoTime);
                    C12490k access$getHead$cp = C12490k.head;
                    Intrinsics.checkNotNull(access$getHead$cp);
                    while (true) {
                        if (access$getHead$cp.next == null) {
                            break;
                        }
                        C12490k access$getNext$p = access$getHead$cp.next;
                        Intrinsics.checkNotNull(access$getNext$p);
                        if (access$remainingNanos < access$getNext$p.mo27253a(nanoTime)) {
                            break;
                        }
                        access$getHead$cp = access$getHead$cp.next;
                        Intrinsics.checkNotNull(access$getHead$cp);
                    }
                    kVar.next = access$getHead$cp.next;
                    access$getHead$cp.next = kVar;
                    if (access$getHead$cp == C12490k.head) {
                        C12490k.class.notify();
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        public /* synthetic */ C12491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: okio.k$b */
    public static final class C12492b extends Thread {
        public C12492b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.timedOut();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.k> r0 = okio.C12490k.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.k$a r1 = okio.C12490k.Companion     // Catch:{ all -> 0x001e }
                okio.k r1 = r1.mo27260c()     // Catch:{ all -> 0x001e }
                okio.k r2 = okio.C12490k.head     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                okio.C12490k.head = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C12490k.C12492b.run():void");
        }
    }

    /* renamed from: okio.k$c */
    public static final class C12493c implements C12506n0 {

        /* renamed from: a */
        public final /* synthetic */ C12490k f30446a;

        /* renamed from: b */
        public final /* synthetic */ C12506n0 f30447b;

        public C12493c(C12490k kVar, C12506n0 n0Var) {
            this.f30446a = kVar;
            this.f30447b = n0Var;
        }

        @C12579k
        /* renamed from: a */
        public C12490k timeout() {
            return this.f30446a;
        }

        public void close() {
            C12490k kVar = this.f30446a;
            kVar.enter();
            try {
                this.f30447b.close();
                C11079d2 d2Var = C11079d2.f28267a;
                if (kVar.exit()) {
                    throw kVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (kVar.exit()) {
                    e = kVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = kVar.exit();
            }
        }

        public void flush() {
            C12490k kVar = this.f30446a;
            kVar.enter();
            try {
                this.f30447b.flush();
                C11079d2 d2Var = C11079d2.f28267a;
                if (kVar.exit()) {
                    throw kVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (kVar.exit()) {
                    e = kVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = kVar.exit();
            }
        }

        @C12579k
        public String toString() {
            return "AsyncTimeout.sink(" + this.f30447b + ')';
        }

        public void write(@C12579k C12500m mVar, long j) {
            Intrinsics.checkNotNullParameter(mVar, "source");
            C12487j.m50748e(mVar.mo27362c0(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C12498l0 l0Var = mVar.f30464a;
                    Intrinsics.checkNotNull(l0Var);
                    while (true) {
                        if (j2 >= ((long) 65536)) {
                            break;
                        }
                        j2 += (long) (l0Var.f30459c - l0Var.f30458b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            l0Var = l0Var.f30462f;
                            Intrinsics.checkNotNull(l0Var);
                        }
                    }
                    C12490k kVar = this.f30446a;
                    kVar.enter();
                    try {
                        this.f30447b.write(mVar, j2);
                        C11079d2 d2Var = C11079d2.f28267a;
                        if (!kVar.exit()) {
                            j -= j2;
                        } else {
                            throw kVar.access$newTimeoutException((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (kVar.exit()) {
                            e = kVar.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        boolean exit = kVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: okio.k$d */
    public static final class C12494d implements C12510p0 {

        /* renamed from: a */
        public final /* synthetic */ C12490k f30448a;

        /* renamed from: b */
        public final /* synthetic */ C12510p0 f30449b;

        public C12494d(C12490k kVar, C12510p0 p0Var) {
            this.f30448a = kVar;
            this.f30449b = p0Var;
        }

        @C12579k
        /* renamed from: a */
        public C12490k timeout() {
            return this.f30448a;
        }

        public void close() {
            C12490k kVar = this.f30448a;
            kVar.enter();
            try {
                this.f30449b.close();
                C11079d2 d2Var = C11079d2.f28267a;
                if (kVar.exit()) {
                    throw kVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (kVar.exit()) {
                    e = kVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = kVar.exit();
            }
        }

        public long read(@C12579k C12500m mVar, long j) {
            Intrinsics.checkNotNullParameter(mVar, "sink");
            C12490k kVar = this.f30448a;
            kVar.enter();
            try {
                long read = this.f30449b.read(mVar, j);
                if (!kVar.exit()) {
                    return read;
                }
                throw kVar.access$newTimeoutException((IOException) null);
            } catch (IOException e) {
                e = e;
                if (kVar.exit()) {
                    e = kVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = kVar.exit();
            }
        }

        @C12579k
        public String toString() {
            return "AsyncTimeout.source(" + this.f30449b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: a */
    public final long mo27253a(long j) {
        return this.timeoutAt - j;
    }

    @C12579k
    @C11532s0
    public final IOException access$newTimeoutException(@C12580l IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.mo27262e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.mo27261d(this);
    }

    @C12579k
    public IOException newTimeoutException(@C12580l IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @C12579k
    public final C12506n0 sink(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        return new C12493c(this, n0Var);
    }

    @C12579k
    public final C12510p0 source(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        return new C12494d(this, p0Var);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        enter();
        try {
            T invoke = aVar.invoke();
            C11322b0.m43481d(1);
            if (!exit()) {
                C11322b0.m43480c(1);
                return invoke;
            }
            throw access$newTimeoutException((IOException) null);
        } catch (IOException e) {
            e = e;
            if (exit()) {
                e = access$newTimeoutException(e);
            }
            throw e;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            boolean exit = exit();
            C11322b0.m43480c(1);
            throw th;
        }
    }
}
