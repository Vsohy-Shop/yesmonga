package androidx.camera.core.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.arch.core.util.C0843a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.impl.utils.futures.d */
public class C1545d<V> implements C32487a<V> {
    @C0359n0

    /* renamed from: a */
    public final C32487a<V> f4436a;
    @C0363p0

    /* renamed from: b */
    public CallbackToFutureAdapter.C16559a<V> f4437b;

    /* renamed from: androidx.camera.core.impl.utils.futures.d$a */
    public class C1546a implements CallbackToFutureAdapter.C16560b<V> {
        public C1546a() {
        }

        /* renamed from: a */
        public Object mo4001a(@C0359n0 CallbackToFutureAdapter.C16559a<V> aVar) {
            boolean z;
            if (C1545d.this.f4437b == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "The result can only set once!");
            C1545d.this.f4437b = aVar;
            return "FutureChain[" + C1545d.this + "]";
        }
    }

    public C1545d(@C0359n0 C32487a<V> aVar) {
        this.f4436a = (C32487a) C18001r.m81775l(aVar);
    }

    @C0359n0
    /* renamed from: b */
    public static <V> C1545d<V> m6463b(@C0359n0 C32487a<V> aVar) {
        if (aVar instanceof C1545d) {
            return (C1545d) aVar;
        }
        return new C1545d<>(aVar);
    }

    /* renamed from: a */
    public final void mo5482a(@C0359n0 C1544c<? super V> cVar, @C0359n0 Executor executor) {
        C1548f.m6473b(this, cVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5483c(@C0363p0 V v) {
        CallbackToFutureAdapter.C16559a<V> aVar = this.f4437b;
        if (aVar != null) {
            return aVar.mo48125c(v);
        }
        return false;
    }

    public boolean cancel(boolean z) {
        return this.f4436a.cancel(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo5484d(@C0359n0 Throwable th) {
        CallbackToFutureAdapter.C16559a<V> aVar = this.f4437b;
        if (aVar != null) {
            return aVar.mo48128f(th);
        }
        return false;
    }

    @C0359n0
    /* renamed from: e */
    public final <T> C1545d<T> mo5485e(@C0359n0 C0843a<? super V, T> aVar, @C0359n0 Executor executor) {
        return (C1545d) C1548f.m6486o(this, aVar, executor);
    }

    @C0359n0
    /* renamed from: f */
    public final <T> C1545d<T> mo5486f(@C0359n0 C1541a<? super V, T> aVar, @C0359n0 Executor executor) {
        return (C1545d) C1548f.m6487p(this, aVar, executor);
    }

    @C0363p0
    public V get() throws InterruptedException, ExecutionException {
        return this.f4436a.get();
    }

    public boolean isCancelled() {
        return this.f4436a.isCancelled();
    }

    public boolean isDone() {
        return this.f4436a.isDone();
    }

    /* renamed from: q */
    public void mo5489q(@C0359n0 Runnable runnable, @C0359n0 Executor executor) {
        this.f4436a.mo5489q(runnable, executor);
    }

    @C0363p0
    public V get(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f4436a.get(j, timeUnit);
    }

    public C1545d() {
        this.f4436a = CallbackToFutureAdapter.m74987a(new C1546a());
    }
}
