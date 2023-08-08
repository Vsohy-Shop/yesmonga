package androidx.camera.core.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.impl.utils.futures.b */
public class C1542b<I, O> extends C1545d<O> implements Runnable {
    @C0363p0

    /* renamed from: c */
    public C1541a<? super I, ? extends O> f4429c;

    /* renamed from: d */
    public final BlockingQueue<Boolean> f4430d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f4431e = new CountDownLatch(1);
    @C0363p0

    /* renamed from: f */
    public C32487a<? extends I> f4432f;
    @C0363p0

    /* renamed from: g */
    public volatile C32487a<? extends O> f4433g;

    /* renamed from: androidx.camera.core.impl.utils.futures.b$a */
    public class C1543a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C32487a f4434a;

        public C1543a(C32487a aVar) {
            this.f4434a = aVar;
        }

        public void run() {
            try {
                C1542b.this.mo5483c(C1548f.m6476e(this.f4434a));
            } catch (CancellationException unused) {
                C1542b.this.cancel(false);
                C1542b.this.f4433g = null;
                return;
            } catch (ExecutionException e) {
                C1542b.this.mo5484d(e.getCause());
            } catch (Throwable th) {
                C1542b.this.f4433g = null;
                throw th;
            }
            C1542b.this.f4433g = null;
        }
    }

    public C1542b(@C0359n0 C1541a<? super I, ? extends O> aVar, @C0359n0 C32487a<? extends I> aVar2) {
        this.f4429c = (C1541a) C18001r.m81775l(aVar);
        this.f4432f = (C32487a) C18001r.m81775l(aVar2);
    }

    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        mo5478h(this.f4430d, Boolean.valueOf(z));
        mo5475g(this.f4432f, z);
        mo5475g(this.f4433g, z);
        return true;
    }

    /* renamed from: g */
    public final void mo5475g(@C0363p0 Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @C0363p0
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            C32487a<? extends I> aVar = this.f4432f;
            if (aVar != null) {
                aVar.get();
            }
            this.f4431e.await();
            C32487a<? extends O> aVar2 = this.f4433g;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return super.get();
    }

    /* renamed from: h */
    public final <E> void mo5478h(@C0359n0 BlockingQueue<E> blockingQueue, @C0359n0 E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
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
    }

    /* renamed from: i */
    public final <E> E mo5479i(@C0359n0 BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    public void run() {
        try {
            try {
                C32487a<? extends O> apply = this.f4429c.apply(C1548f.m6476e(this.f4432f));
                this.f4433g = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) mo5479i(this.f4430d)).booleanValue());
                    this.f4433g = null;
                    this.f4429c = null;
                    this.f4432f = null;
                    this.f4431e.countDown();
                    return;
                }
                apply.mo5489q(new C1543a(apply), C1525a.m6437a());
                this.f4429c = null;
                this.f4432f = null;
                this.f4431e.countDown();
            } catch (UndeclaredThrowableException e) {
                mo5484d(e.getCause());
            } catch (Exception e2) {
                mo5484d(e2);
            } catch (Error e3) {
                mo5484d(e3);
            } catch (Throwable th) {
                this.f4429c = null;
                this.f4432f = null;
                this.f4431e.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            mo5484d(e4.getCause());
        }
    }

    @C0363p0
    public O get(long j, @C0359n0 TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            C32487a<? extends I> aVar = this.f4432f;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f4431e.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                C32487a<? extends O> aVar2 = this.f4433g;
                if (aVar2 != null) {
                    aVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
