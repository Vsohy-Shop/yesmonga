package androidx.camera.core.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.arch.core.util.C0843a;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1554g;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: androidx.camera.core.impl.utils.futures.f */
public final class C1548f {

    /* renamed from: a */
    public static final C0843a<?, ?> f4440a = new C1550b();

    /* renamed from: androidx.camera.core.impl.utils.futures.f$a */
    public class C1549a implements C1541a<I, O> {

        /* renamed from: a */
        public final /* synthetic */ C0843a f4441a;

        public C1549a(C0843a aVar) {
            this.f4441a = aVar;
        }

        public C32487a<O> apply(I i) {
            return C1548f.m6479h(this.f4441a.apply(i));
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.f$b */
    public class C1550b implements C0843a<Object, Object> {
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.f$c */
    public class C1551c implements C1544c<I> {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f4442a;

        /* renamed from: b */
        public final /* synthetic */ C0843a f4443b;

        public C1551c(CallbackToFutureAdapter.C16559a aVar, C0843a aVar2) {
            this.f4442a = aVar;
            this.f4443b = aVar2;
        }

        /* renamed from: a */
        public void mo4160a(@C0363p0 I i) {
            try {
                this.f4442a.mo48125c(this.f4443b.apply(i));
            } catch (Throwable th) {
                this.f4442a.mo48128f(th);
            }
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            this.f4442a.mo48128f(th);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.f$d */
    public class C1552d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C32487a f4444a;

        public C1552d(C32487a aVar) {
            this.f4444a = aVar;
        }

        public void run() {
            this.f4444a.cancel(true);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.f$e */
    public static final class C1553e<V> implements Runnable {

        /* renamed from: a */
        public final Future<V> f4445a;

        /* renamed from: b */
        public final C1544c<? super V> f4446b;

        public C1553e(Future<V> future, C1544c<? super V> cVar) {
            this.f4445a = future;
            this.f4446b = cVar;
        }

        public void run() {
            try {
                this.f4446b.mo4160a(C1548f.m6475d(this.f4445a));
            } catch (ExecutionException e) {
                this.f4446b.mo4161b(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f4446b.mo4161b(e2);
            }
        }

        public String toString() {
            return C1553e.class.getSimpleName() + "," + this.f4446b;
        }
    }

    /* renamed from: b */
    public static <V> void m6473b(@C0359n0 C32487a<V> aVar, @C0359n0 C1544c<? super V> cVar, @C0359n0 Executor executor) {
        C18001r.m81775l(cVar);
        aVar.mo5489q(new C1553e(aVar, cVar), executor);
    }

    @C0359n0
    /* renamed from: c */
    public static <V> C32487a<List<V>> m6474c(@C0359n0 Collection<? extends C32487a<? extends V>> collection) {
        return new C1558h(new ArrayList(collection), true, C1525a.m6437a());
    }

    @C0363p0
    /* renamed from: d */
    public static <V> V m6475d(@C0359n0 Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        C18001r.m81778o(isDone, "Future was expected to be done, " + future);
        return m6476e(future);
    }

    @C0363p0
    /* renamed from: e */
    public static <V> V m6476e(@C0359n0 Future<V> future) throws ExecutionException {
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

    @C0359n0
    /* renamed from: f */
    public static <V> C32487a<V> m6477f(@C0359n0 Throwable th) {
        return new C1554g.C1555a(th);
    }

    @C0359n0
    /* renamed from: g */
    public static <V> ScheduledFuture<V> m6478g(@C0359n0 Throwable th) {
        return new C1554g.C1556b(th);
    }

    @C0359n0
    /* renamed from: h */
    public static <V> C32487a<V> m6479h(@C0363p0 V v) {
        if (v == null) {
            return C1554g.m6490g();
        }
        return new C1554g.C1557c(v);
    }

    @C0359n0
    /* renamed from: j */
    public static <V> C32487a<V> m6481j(@C0359n0 C32487a<V> aVar) {
        C18001r.m81775l(aVar);
        if (aVar.isDone()) {
            return aVar;
        }
        return CallbackToFutureAdapter.m74987a(new C1547e(aVar));
    }

    /* renamed from: k */
    public static <V> void m6482k(@C0359n0 C32487a<V> aVar, @C0359n0 CallbackToFutureAdapter.C16559a<V> aVar2) {
        m6483l(aVar, f4440a, aVar2, C1525a.m6437a());
    }

    /* renamed from: l */
    public static <I, O> void m6483l(@C0359n0 C32487a<I> aVar, @C0359n0 C0843a<? super I, ? extends O> aVar2, @C0359n0 CallbackToFutureAdapter.C16559a<O> aVar3, @C0359n0 Executor executor) {
        m6484m(true, aVar, aVar2, aVar3, executor);
    }

    /* renamed from: m */
    public static <I, O> void m6484m(boolean z, @C0359n0 C32487a<I> aVar, @C0359n0 C0843a<? super I, ? extends O> aVar2, @C0359n0 CallbackToFutureAdapter.C16559a<O> aVar3, @C0359n0 Executor executor) {
        C18001r.m81775l(aVar);
        C18001r.m81775l(aVar2);
        C18001r.m81775l(aVar3);
        C18001r.m81775l(executor);
        m6473b(aVar, new C1551c(aVar3, aVar2), executor);
        if (z) {
            aVar3.mo48123a(new C1552d(aVar), C1525a.m6437a());
        }
    }

    @C0359n0
    /* renamed from: n */
    public static <V> C32487a<List<V>> m6485n(@C0359n0 Collection<? extends C32487a<? extends V>> collection) {
        return new C1558h(new ArrayList(collection), false, C1525a.m6437a());
    }

    @C0359n0
    /* renamed from: o */
    public static <I, O> C32487a<O> m6486o(@C0359n0 C32487a<I> aVar, @C0359n0 C0843a<? super I, ? extends O> aVar2, @C0359n0 Executor executor) {
        C18001r.m81775l(aVar2);
        return m6487p(aVar, new C1549a(aVar2), executor);
    }

    @C0359n0
    /* renamed from: p */
    public static <I, O> C32487a<O> m6487p(@C0359n0 C32487a<I> aVar, @C0359n0 C1541a<? super I, ? extends O> aVar2, @C0359n0 Executor executor) {
        C1542b bVar = new C1542b(aVar2, aVar);
        aVar.mo5489q(bVar, executor);
        return bVar;
    }
}
