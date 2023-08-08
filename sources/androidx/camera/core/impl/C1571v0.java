package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1432a1;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C32487a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.core.impl.v0 */
public final class C1571v0<T> implements C1432a1<T> {

    /* renamed from: a */
    public final C19423g0<C1578e<T>> f4478a = new C19423g0<>();
    @C0323b0("mObservers")

    /* renamed from: b */
    public final Map<C1432a1.C1433a<T>, C1576d<T>> f4479b = new HashMap();

    /* renamed from: androidx.camera.core.impl.v0$a */
    public class C1572a implements CallbackToFutureAdapter.C16560b<T> {

        /* renamed from: androidx.camera.core.impl.v0$a$a */
        public class C1573a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CallbackToFutureAdapter.C16559a f4481a;

            public C1573a(CallbackToFutureAdapter.C16559a aVar) {
                this.f4481a = aVar;
            }

            public void run() {
                C1578e f = C1571v0.this.f4478a.mo4610f();
                if (f == null) {
                    this.f4481a.mo48128f(new IllegalStateException("Observable has not yet been initialized with a value."));
                } else if (f.mo5538a()) {
                    this.f4481a.mo48125c(f.mo5540e());
                } else {
                    C18001r.m81775l(f.mo5539d());
                    this.f4481a.mo48128f(f.mo5539d());
                }
            }
        }

        public C1572a() {
        }

        @C0363p0
        /* renamed from: a */
        public Object mo4001a(@C0359n0 CallbackToFutureAdapter.C16559a<T> aVar) {
            C1525a.m6441e().execute(new C1573a(aVar));
            return C1571v0.this + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    /* renamed from: androidx.camera.core.impl.v0$b */
    public class C1574b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1576d f4483a;

        /* renamed from: b */
        public final /* synthetic */ C1576d f4484b;

        public C1574b(C1576d dVar, C1576d dVar2) {
            this.f4483a = dVar;
            this.f4484b = dVar2;
        }

        public void run() {
            C1571v0.this.f4478a.mo57494p(this.f4483a);
            C1571v0.this.f4478a.mo57492l(this.f4484b);
        }
    }

    /* renamed from: androidx.camera.core.impl.v0$c */
    public class C1575c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1576d f4486a;

        public C1575c(C1576d dVar) {
            this.f4486a = dVar;
        }

        public void run() {
            C1571v0.this.f4478a.mo57494p(this.f4486a);
        }
    }

    /* renamed from: androidx.camera.core.impl.v0$d */
    public static final class C1576d<T> implements C19426h0<C1578e<T>> {

        /* renamed from: a */
        public final AtomicBoolean f4488a = new AtomicBoolean(true);

        /* renamed from: b */
        public final C1432a1.C1433a<T> f4489b;

        /* renamed from: c */
        public final Executor f4490c;

        /* renamed from: androidx.camera.core.impl.v0$d$a */
        public class C1577a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C1578e f4491a;

            public C1577a(C1578e eVar) {
                this.f4491a = eVar;
            }

            public void run() {
                if (C1576d.this.f4488a.get()) {
                    if (this.f4491a.mo5538a()) {
                        C1576d.this.f4489b.mo5189a(this.f4491a.mo5540e());
                        return;
                    }
                    C18001r.m81775l(this.f4491a.mo5539d());
                    C1576d.this.f4489b.onError(this.f4491a.mo5539d());
                }
            }
        }

        public C1576d(@C0359n0 Executor executor, @C0359n0 C1432a1.C1433a<T> aVar) {
            this.f4490c = executor;
            this.f4489b = aVar;
        }

        /* renamed from: b */
        public void mo5535b() {
            this.f4488a.set(false);
        }

        /* renamed from: c */
        public void mo4590a(@C0359n0 C1578e<T> eVar) {
            this.f4490c.execute(new C1577a(eVar));
        }
    }

    /* renamed from: androidx.camera.core.impl.v0$e */
    public static final class C1578e<T> {
        @C0363p0

        /* renamed from: a */
        public T f4493a;
        @C0363p0

        /* renamed from: b */
        public Throwable f4494b;

        public C1578e(@C0363p0 T t, @C0363p0 Throwable th) {
            this.f4493a = t;
            this.f4494b = th;
        }

        /* renamed from: b */
        public static <T> C1578e<T> m6530b(@C0359n0 Throwable th) {
            return new C1578e<>((Object) null, (Throwable) C18001r.m81775l(th));
        }

        /* renamed from: c */
        public static <T> C1578e<T> m6531c(@C0363p0 T t) {
            return new C1578e<>(t, (Throwable) null);
        }

        /* renamed from: a */
        public boolean mo5538a() {
            return this.f4494b == null;
        }

        @C0363p0
        /* renamed from: d */
        public Throwable mo5539d() {
            return this.f4494b;
        }

        @C0363p0
        /* renamed from: e */
        public T mo5540e() {
            if (mo5538a()) {
                return this.f4493a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        @C0359n0
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (mo5538a()) {
                str = "Value: " + this.f4493a;
            } else {
                str = "Error: " + this.f4494b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    @C0359n0
    /* renamed from: a */
    public C32487a<T> mo5186a() {
        return CallbackToFutureAdapter.m74987a(new C1572a());
    }

    /* renamed from: b */
    public void mo5187b(@C0359n0 Executor executor, @C0359n0 C1432a1.C1433a<T> aVar) {
        synchronized (this.f4479b) {
            C1576d dVar = this.f4479b.get(aVar);
            if (dVar != null) {
                dVar.mo5535b();
            }
            C1576d dVar2 = new C1576d(executor, aVar);
            this.f4479b.put(aVar, dVar2);
            C1525a.m6441e().execute(new C1574b(dVar, dVar2));
        }
    }

    /* renamed from: c */
    public void mo5188c(@C0359n0 C1432a1.C1433a<T> aVar) {
        synchronized (this.f4479b) {
            C1576d remove = this.f4479b.remove(aVar);
            if (remove != null) {
                remove.mo5535b();
                C1525a.m6441e().execute(new C1575c(remove));
            }
        }
    }

    @C0359n0
    /* renamed from: d */
    public LiveData<C1578e<T>> mo5529d() {
        return this.f4478a;
    }

    /* renamed from: e */
    public void mo5530e(@C0359n0 Throwable th) {
        this.f4478a.mo57493o(C1578e.m6530b(th));
    }

    /* renamed from: f */
    public void mo5531f(@C0363p0 T t) {
        this.f4478a.mo57493o(C1578e.m6531c(t));
    }
}
