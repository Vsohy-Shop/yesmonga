package androidx.camera.core.impl.utils.futures;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.impl.utils.futures.h */
public class C1558h<V> implements C32487a<List<V>> {
    @C0363p0

    /* renamed from: a */
    public List<? extends C32487a<? extends V>> f4451a;
    @C0363p0

    /* renamed from: b */
    public List<V> f4452b;

    /* renamed from: c */
    public final boolean f4453c;
    @C0359n0

    /* renamed from: d */
    public final AtomicInteger f4454d;
    @C0359n0

    /* renamed from: e */
    public final C32487a<List<V>> f4455e = CallbackToFutureAdapter.m74987a(new C1559a());

    /* renamed from: f */
    public CallbackToFutureAdapter.C16559a<List<V>> f4456f;

    /* renamed from: androidx.camera.core.impl.utils.futures.h$a */
    public class C1559a implements CallbackToFutureAdapter.C16560b<List<V>> {
        public C1559a() {
        }

        /* renamed from: a */
        public Object mo4001a(@C0359n0 CallbackToFutureAdapter.C16559a<List<V>> aVar) {
            boolean z;
            if (C1558h.this.f4456f == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81778o(z, "The result can only set once!");
            C1558h.this.f4456f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.h$b */
    public class C1560b implements Runnable {
        public C1560b() {
        }

        public void run() {
            C1558h hVar = C1558h.this;
            hVar.f4452b = null;
            hVar.f4451a = null;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.h$c */
    public class C1561c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f4459a;

        /* renamed from: b */
        public final /* synthetic */ C32487a f4460b;

        public C1561c(int i, C32487a aVar) {
            this.f4459a = i;
            this.f4460b = aVar;
        }

        public void run() {
            C1558h.this.mo5508e(this.f4459a, this.f4460b);
        }
    }

    public C1558h(@C0359n0 List<? extends C32487a<? extends V>> list, boolean z, @C0359n0 Executor executor) {
        this.f4451a = (List) C18001r.m81775l(list);
        this.f4452b = new ArrayList(list.size());
        this.f4453c = z;
        this.f4454d = new AtomicInteger(list.size());
        mo5507d(executor);
    }

    /* renamed from: a */
    public final void mo5503a() throws InterruptedException {
        List<? extends C32487a<? extends V>> list = this.f4451a;
        if (list != null && !isDone()) {
            for (C32487a aVar : list) {
                while (true) {
                    if (!aVar.isDone()) {
                        try {
                            aVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.f4453c) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @C0363p0
    /* renamed from: b */
    public List<V> get() throws InterruptedException, ExecutionException {
        mo5503a();
        return this.f4455e.get();
    }

    /* renamed from: c */
    public List<V> get(long j, @C0359n0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f4455e.get(j, timeUnit);
    }

    public boolean cancel(boolean z) {
        List<? extends C32487a<? extends V>> list = this.f4451a;
        if (list != null) {
            for (C32487a cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.f4455e.cancel(z);
    }

    /* renamed from: d */
    public final void mo5507d(@C0359n0 Executor executor) {
        mo5489q(new C1560b(), C1525a.m6437a());
        if (this.f4451a.isEmpty()) {
            this.f4456f.mo48125c(new ArrayList(this.f4452b));
            return;
        }
        for (int i = 0; i < this.f4451a.size(); i++) {
            this.f4452b.add((Object) null);
        }
        List<? extends C32487a<? extends V>> list = this.f4451a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C32487a aVar = (C32487a) list.get(i2);
            aVar.mo5489q(new C1561c(i2, aVar), executor);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ba */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5508e(int r7, @androidx.annotation.C0359n0 java.util.concurrent.Future<? extends V> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r6.f4452b
            boolean r2 = r6.isDone()
            if (r2 != 0) goto L_0x0104
            if (r1 != 0) goto L_0x000e
            goto L_0x0104
        L_0x000e:
            r2 = 1
            r3 = 0
            boolean r4 = r8.isDone()     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.lang.String r5 = "Tried to set value from future which is not done"
            androidx.core.util.C18001r.m81778o(r4, r5)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.lang.Object r8 = androidx.camera.core.impl.utils.futures.C1548f.m6476e(r8)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            r1.set(r7, r8)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f4454d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f4452b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L_0x003a:
            r8.mo48125c(r0)
            goto L_0x00dd
        L_0x003f:
            boolean r7 = r6.isDone()
            androidx.core.util.C18001r.m81777n(r7)
            goto L_0x00dd
        L_0x0048:
            r7 = move-exception
            goto L_0x00de
        L_0x004b:
            r7 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f     // Catch:{ all -> 0x0048 }
            r8.mo48128f(r7)     // Catch:{ all -> 0x0048 }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f4454d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f4452b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x006c:
            r7 = move-exception
            boolean r8 = r6.f4453c     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0076
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f     // Catch:{ all -> 0x0048 }
            r8.mo48128f(r7)     // Catch:{ all -> 0x0048 }
        L_0x0076:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f4454d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r2 = r3
        L_0x0080:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f4452b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x0091:
            r7 = move-exception
            boolean r8 = r6.f4453c     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x009f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ all -> 0x0048 }
            r8.mo48128f(r7)     // Catch:{ all -> 0x0048 }
        L_0x009f:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f4454d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = r3
        L_0x00a9:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f4452b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00ba:
            boolean r7 = r6.f4453c     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x00c1
            r6.cancel(r3)     // Catch:{ all -> 0x0048 }
        L_0x00c1:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f4454d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r2 = r3
        L_0x00cb:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f4452b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r8 = r6.f4456f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00dd:
            return
        L_0x00de:
            java.util.concurrent.atomic.AtomicInteger r8 = r6.f4454d
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r2 = r3
        L_0x00e8:
            androidx.core.util.C18001r.m81778o(r2, r0)
            if (r8 != 0) goto L_0x0103
            java.util.List<V> r8 = r6.f4452b
            if (r8 == 0) goto L_0x00fc
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r6.f4456f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0.mo48125c(r1)
            goto L_0x0103
        L_0x00fc:
            boolean r8 = r6.isDone()
            androidx.core.util.C18001r.m81777n(r8)
        L_0x0103:
            throw r7
        L_0x0104:
            boolean r7 = r6.f4453c
            java.lang.String r8 = "Future was done before all dependencies completed"
            androidx.core.util.C18001r.m81778o(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.C1558h.mo5508e(int, java.util.concurrent.Future):void");
    }

    public boolean isCancelled() {
        return this.f4455e.isCancelled();
    }

    public boolean isDone() {
        return this.f4455e.isDone();
    }

    /* renamed from: q */
    public void mo5489q(@C0359n0 Runnable runnable, @C0359n0 Executor executor) {
        this.f4455e.mo5489q(runnable, executor);
    }
}
