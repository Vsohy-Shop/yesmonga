package androidx.concurrent.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.common.util.concurrent.C32487a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$a */
    public static final class C16559a<T> {

        /* renamed from: a */
        public Object f41071a;

        /* renamed from: b */
        public C16561c<T> f41072b;

        /* renamed from: c */
        public C16564b<Void> f41073c = C16564b.m75001t0();

        /* renamed from: d */
        public boolean f41074d;

        /* renamed from: a */
        public void mo48123a(@C0359n0 Runnable runnable, @C0359n0 Executor executor) {
            C16564b<Void> bVar = this.f41073c;
            if (bVar != null) {
                bVar.mo5489q(runnable, executor);
            }
        }

        /* renamed from: b */
        public void mo48124b() {
            this.f41071a = null;
            this.f41072b = null;
            this.f41073c.mo48106j0(null);
        }

        /* renamed from: c */
        public boolean mo48125c(T t) {
            boolean z = true;
            this.f41074d = true;
            C16561c<T> cVar = this.f41072b;
            if (cVar == null || !cVar.mo48131b(t)) {
                z = false;
            }
            if (z) {
                mo48127e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean mo48126d() {
            boolean z = true;
            this.f41074d = true;
            C16561c<T> cVar = this.f41072b;
            if (cVar == null || !cVar.mo48130a(true)) {
                z = false;
            }
            if (z) {
                mo48127e();
            }
            return z;
        }

        /* renamed from: e */
        public final void mo48127e() {
            this.f41071a = null;
            this.f41072b = null;
            this.f41073c = null;
        }

        /* renamed from: f */
        public boolean mo48128f(@C0359n0 Throwable th) {
            boolean z = true;
            this.f41074d = true;
            C16561c<T> cVar = this.f41072b;
            if (cVar == null || !cVar.mo48132c(th)) {
                z = false;
            }
            if (z) {
                mo48127e();
            }
            return z;
        }

        public void finalize() {
            C16564b<Void> bVar;
            C16561c<T> cVar = this.f41072b;
            if (cVar != null && !cVar.isDone()) {
                cVar.mo48132c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f41071a));
            }
            if (!this.f41074d && (bVar = this.f41073c) != null) {
                bVar.mo48106j0(null);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$b */
    public interface C16560b<T> {
        @C0363p0
        /* renamed from: a */
        Object mo4001a(@C0359n0 C16559a<T> aVar) throws Exception;
    }

    /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c */
    public static final class C16561c<T> implements C32487a<T> {

        /* renamed from: a */
        public final WeakReference<C16559a<T>> f41075a;

        /* renamed from: b */
        public final AbstractResolvableFuture<T> f41076b = new C16562a();

        /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$c$a */
        public class C16562a extends AbstractResolvableFuture<T> {
            public C16562a() {
            }

            /* renamed from: f0 */
            public String mo48098f0() {
                C16559a aVar = C16561c.this.f41075a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f41071a + "]";
            }
        }

        public C16561c(C16559a<T> aVar) {
            this.f41075a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public boolean mo48130a(boolean z) {
            return this.f41076b.cancel(z);
        }

        /* renamed from: b */
        public boolean mo48131b(T t) {
            return this.f41076b.mo48106j0(t);
        }

        /* renamed from: c */
        public boolean mo48132c(Throwable th) {
            return this.f41076b.mo48107m0(th);
        }

        public boolean cancel(boolean z) {
            C16559a aVar = this.f41075a.get();
            boolean cancel = this.f41076b.cancel(z);
            if (cancel && aVar != null) {
                aVar.mo48124b();
            }
            return cancel;
        }

        public T get() throws InterruptedException, ExecutionException {
            return this.f41076b.get();
        }

        public boolean isCancelled() {
            return this.f41076b.isCancelled();
        }

        public boolean isDone() {
            return this.f41076b.isDone();
        }

        /* renamed from: q */
        public void mo5489q(@C0359n0 Runnable runnable, @C0359n0 Executor executor) {
            this.f41076b.mo5489q(runnable, executor);
        }

        public String toString() {
            return this.f41076b.toString();
        }

        public T get(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f41076b.get(j, timeUnit);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static <T> C32487a<T> m74987a(@C0359n0 C16560b<T> bVar) {
        C16559a aVar = new C16559a();
        C16561c<T> cVar = new C16561c<>(aVar);
        aVar.f41072b = cVar;
        aVar.f41071a = bVar.getClass();
        try {
            Object a = bVar.mo4001a(aVar);
            if (a != null) {
                aVar.f41071a = a;
            }
        } catch (Exception e) {
            cVar.mo48132c(e);
        }
        return cVar;
    }
}
