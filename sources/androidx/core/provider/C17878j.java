package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.provider.j */
public class C17878j {

    /* renamed from: i */
    public static final int f46291i = 1;

    /* renamed from: j */
    public static final int f46292j = 0;

    /* renamed from: a */
    public final Object f46293a = new Object();
    @C0323b0("mLock")

    /* renamed from: b */
    public HandlerThread f46294b;
    @C0323b0("mLock")

    /* renamed from: c */
    public Handler f46295c;
    @C0323b0("mLock")

    /* renamed from: d */
    public int f46296d;

    /* renamed from: e */
    public Handler.Callback f46297e = new C17879a();

    /* renamed from: f */
    public final int f46298f;

    /* renamed from: g */
    public final int f46299g;

    /* renamed from: h */
    public final String f46300h;

    /* renamed from: androidx.core.provider.j$a */
    public class C17879a implements Handler.Callback {
        public C17879a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C17878j.this.mo52295c();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C17878j.this.mo52296d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: androidx.core.provider.j$b */
    public class C17880b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f46302a;

        /* renamed from: b */
        public final /* synthetic */ Handler f46303b;

        /* renamed from: c */
        public final /* synthetic */ C17883d f46304c;

        /* renamed from: androidx.core.provider.j$b$a */
        public class C17881a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f46306a;

            public C17881a(Object obj) {
                this.f46306a = obj;
            }

            public void run() {
                C17880b.this.f46304c.mo52304a(this.f46306a);
            }
        }

        public C17880b(Callable callable, Handler handler, C17883d dVar) {
            this.f46302a = callable;
            this.f46303b = handler;
            this.f46304c = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f46302a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f46303b.post(new C17881a(obj));
        }
    }

    /* renamed from: androidx.core.provider.j$c */
    public class C17882c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f46308a;

        /* renamed from: b */
        public final /* synthetic */ Callable f46309b;

        /* renamed from: c */
        public final /* synthetic */ ReentrantLock f46310c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f46311d;

        /* renamed from: e */
        public final /* synthetic */ Condition f46312e;

        public C17882c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f46308a = atomicReference;
            this.f46309b = callable;
            this.f46310c = reentrantLock;
            this.f46311d = atomicBoolean;
            this.f46312e = condition;
        }

        public void run() {
            try {
                this.f46308a.set(this.f46309b.call());
            } catch (Exception unused) {
            }
            this.f46310c.lock();
            try {
                this.f46311d.set(false);
                this.f46312e.signal();
            } finally {
                this.f46310c.unlock();
            }
        }
    }

    /* renamed from: androidx.core.provider.j$d */
    public interface C17883d<T> {
        /* renamed from: a */
        void mo52304a(T t);
    }

    public C17878j(String str, int i, int i2) {
        this.f46300h = str;
        this.f46299g = i;
        this.f46298f = i2;
        this.f46296d = 0;
    }

    @C0344h1
    /* renamed from: a */
    public int mo52293a() {
        int i;
        synchronized (this.f46293a) {
            i = this.f46296d;
        }
        return i;
    }

    @C0344h1
    /* renamed from: b */
    public boolean mo52294b() {
        boolean z;
        synchronized (this.f46293a) {
            if (this.f46294b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo52295c() {
        synchronized (this.f46293a) {
            if (!this.f46295c.hasMessages(1)) {
                this.f46294b.quit();
                this.f46294b = null;
                this.f46295c = null;
            }
        }
    }

    /* renamed from: d */
    public void mo52296d(Runnable runnable) {
        runnable.run();
        synchronized (this.f46293a) {
            this.f46295c.removeMessages(0);
            Handler handler = this.f46295c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f46298f);
        }
    }

    /* renamed from: e */
    public final void mo52297e(Runnable runnable) {
        synchronized (this.f46293a) {
            if (this.f46294b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f46300h, this.f46299g);
                this.f46294b = handlerThread;
                handlerThread.start();
                this.f46295c = new Handler(this.f46294b.getLooper(), this.f46297e);
                this.f46296d++;
            }
            this.f46295c.removeMessages(0);
            Handler handler = this.f46295c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: f */
    public <T> void mo52298f(Callable<T> callable, C17883d<T> dVar) {
        mo52297e(new C17880b(callable, C17850b.m81317a(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo52299g(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            androidx.core.provider.j$c r11 = new androidx.core.provider.j$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.mo52297e(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C17878j.mo52299g(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
