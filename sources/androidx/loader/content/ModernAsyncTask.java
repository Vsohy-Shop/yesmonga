package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: E0 */
    public static volatile Executor f49929E0 = null;

    /* renamed from: X */
    public static final int f49930X = 1;

    /* renamed from: Y */
    public static final int f49931Y = 2;

    /* renamed from: Z */
    public static C19542f f49932Z = null;

    /* renamed from: f */
    public static final String f49933f = "AsyncTask";

    /* renamed from: g */
    public static final int f49934g = 5;

    /* renamed from: v */
    public static final int f49935v = 128;

    /* renamed from: w */
    public static final int f49936w = 1;

    /* renamed from: x */
    public static final ThreadFactory f49937x;

    /* renamed from: y */
    public static final BlockingQueue<Runnable> f49938y;

    /* renamed from: z */
    public static final Executor f49939z;

    /* renamed from: a */
    public final C19543g<Params, Result> f49940a;

    /* renamed from: b */
    public final FutureTask<Result> f49941b;

    /* renamed from: c */
    public volatile Status f49942c = Status.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f49943d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f49944e = new AtomicBoolean();

    public enum Status {
        PENDING,
        f49946b,
        FINISHED
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    public static class C19537a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f49949a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f49949a.getAndIncrement());
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    public class C19538b extends C19543g<Params, Result> {
        public C19538b() {
        }

        public Result call() throws Exception {
            ModernAsyncTask.this.f49944e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.mo57754b(this.f49955a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.mo57767q(result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.mo57767q(result);
                throw th;
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    public class C19539c extends FutureTask<Result> {
        public C19539c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                ModernAsyncTask.this.mo57768r(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.mo57768r(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$d */
    public static /* synthetic */ class C19540d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49952a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49952a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.f49946b     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49952a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.C19540d.<clinit>():void");
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$e */
    public static class C19541e<Data> {

        /* renamed from: a */
        public final ModernAsyncTask f49953a;

        /* renamed from: b */
        public final Data[] f49954b;

        public C19541e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f49953a = modernAsyncTask;
            this.f49954b = dataArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$f */
    public static class C19542f extends Handler {
        public C19542f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C19541e eVar = (C19541e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f49953a.mo57757f(eVar.f49954b[0]);
            } else if (i == 2) {
                eVar.f49953a.mo57766p(eVar.f49954b);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$g */
    public static abstract class C19543g<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        public Params[] f49955a;
    }

    static {
        C19537a aVar = new C19537a();
        f49937x = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f49938y = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f49939z = threadPoolExecutor;
        f49929E0 = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        C19538b bVar = new C19538b();
        this.f49940a = bVar;
        this.f49941b = new C19539c(bVar);
    }

    /* renamed from: d */
    public static void m90946d(Runnable runnable) {
        f49929E0.execute(runnable);
    }

    /* renamed from: i */
    public static Handler m90947i() {
        C19542f fVar;
        synchronized (ModernAsyncTask.class) {
            if (f49932Z == null) {
                f49932Z = new C19542f();
            }
            fVar = f49932Z;
        }
        return fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public static void m90948t(Executor executor) {
        f49929E0 = executor;
    }

    /* renamed from: a */
    public final boolean mo57753a(boolean z) {
        this.f49943d.set(true);
        return this.f49941b.cancel(z);
    }

    /* renamed from: b */
    public abstract Result mo57754b(Params... paramsArr);

    /* renamed from: c */
    public final ModernAsyncTask<Params, Progress, Result> mo57755c(Params... paramsArr) {
        return mo57756e(f49929E0, paramsArr);
    }

    /* renamed from: e */
    public final ModernAsyncTask<Params, Progress, Result> mo57756e(Executor executor, Params... paramsArr) {
        if (this.f49942c != Status.PENDING) {
            int i = C19540d.f49952a[this.f49942c.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f49942c = Status.f49946b;
            mo57765o();
            this.f49940a.f49955a = paramsArr;
            executor.execute(this.f49941b);
            return this;
        }
    }

    /* renamed from: f */
    public void mo57757f(Result result) {
        if (mo57761k()) {
            mo57763m(result);
        } else {
            mo57764n(result);
        }
        this.f49942c = Status.FINISHED;
    }

    /* renamed from: g */
    public final Result mo57758g() throws InterruptedException, ExecutionException {
        return this.f49941b.get();
    }

    /* renamed from: h */
    public final Result mo57759h(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f49941b.get(j, timeUnit);
    }

    /* renamed from: j */
    public final Status mo57760j() {
        return this.f49942c;
    }

    /* renamed from: k */
    public final boolean mo57761k() {
        return this.f49943d.get();
    }

    /* renamed from: l */
    public void mo57762l() {
    }

    /* renamed from: m */
    public void mo57763m(Result result) {
        mo57762l();
    }

    /* renamed from: n */
    public void mo57764n(Result result) {
    }

    /* renamed from: o */
    public void mo57765o() {
    }

    /* renamed from: p */
    public void mo57766p(Progress... progressArr) {
    }

    /* renamed from: q */
    public Result mo57767q(Result result) {
        m90947i().obtainMessage(1, new C19541e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: r */
    public void mo57768r(Result result) {
        if (!this.f49944e.get()) {
            mo57767q(result);
        }
    }

    /* renamed from: s */
    public final void mo57769s(Progress... progressArr) {
        if (!mo57761k()) {
            m90947i().obtainMessage(2, new C19541e(this, progressArr)).sendToTarget();
        }
    }
}
