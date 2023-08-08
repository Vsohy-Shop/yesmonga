package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.android.volley.C21712a;
import com.android.volley.C21715b;
import com.android.volley.C21751e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.android.volley.c */
public class C21718c extends C21764n {

    /* renamed from: w */
    public static final int f56181w = 4;
    @C0363p0

    /* renamed from: m */
    public final C21712a f56182m;

    /* renamed from: n */
    public final C21715b f56183n;

    /* renamed from: o */
    public ExecutorService f56184o;

    /* renamed from: p */
    public ScheduledExecutorService f56185p;

    /* renamed from: q */
    public ExecutorService f56186q;

    /* renamed from: r */
    public C21733h f56187r;

    /* renamed from: s */
    public final C21779t f56188s;

    /* renamed from: t */
    public final List<Request<?>> f56189t;

    /* renamed from: u */
    public volatile boolean f56190u;

    /* renamed from: v */
    public final Object f56191v;

    /* renamed from: com.android.volley.c$a */
    public class C21719a implements Runnable {

        /* renamed from: com.android.volley.c$a$a */
        public class C21720a implements C21712a.C21714b {
            public C21720a() {
            }

            /* renamed from: a */
            public void mo64833a() {
                C21718c.this.mo64845B();
            }
        }

        public C21719a() {
        }

        public void run() {
            C21718c.this.f56182m.mo64828c(new C21720a());
        }
    }

    /* renamed from: com.android.volley.c$b */
    public class C21721b implements Runnable {

        /* renamed from: com.android.volley.c$b$a */
        public class C21722a implements Runnable {
            public C21722a() {
            }

            public void run() {
                C21718c.this.mo64845B();
            }
        }

        public C21721b() {
        }

        public void run() {
            C21718c.this.mo64950h().mo64875b();
            C21718c.this.f56184o.execute(new C21722a());
        }
    }

    /* renamed from: com.android.volley.c$c */
    public class C21723c implements Comparator<Runnable> {
        /* renamed from: a */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (runnable instanceof C21770o) {
                if (runnable2 instanceof C21770o) {
                    return ((C21770o) runnable).mo64959a((C21770o) runnable2);
                }
                return 1;
            } else if (runnable2 instanceof C21770o) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    /* renamed from: com.android.volley.c$d */
    public static class C21724d {
        @C0363p0

        /* renamed from: a */
        public C21712a f56196a = null;

        /* renamed from: b */
        public final C21715b f56197b;
        @C0363p0

        /* renamed from: c */
        public C21751e f56198c = null;
        @C0363p0

        /* renamed from: d */
        public C21733h f56199d = null;
        @C0363p0

        /* renamed from: e */
        public C21774q f56200e = null;

        /* renamed from: com.android.volley.c$d$a */
        public class C21725a extends C21733h {

            /* renamed from: com.android.volley.c$d$a$a */
            public class C21726a implements ThreadFactory {

                /* renamed from: a */
                public final /* synthetic */ String f56202a;

                public C21726a(String str) {
                    this.f56202a = str;
                }

                public Thread newThread(@C0359n0 Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("Volley-" + this.f56202a);
                    return newThread;
                }
            }

            public C21725a() {
            }

            /* renamed from: a */
            public ExecutorService mo64862a(BlockingQueue<Runnable> blockingQueue) {
                return mo64865d(4, "BlockingExecutor", blockingQueue);
            }

            /* renamed from: b */
            public ExecutorService mo64863b(BlockingQueue<Runnable> blockingQueue) {
                return mo64865d(1, "Non-BlockingExecutor", blockingQueue);
            }

            /* renamed from: c */
            public ScheduledExecutorService mo64864c() {
                return new ScheduledThreadPoolExecutor(0, mo64866e("ScheduledExecutor"));
            }

            /* renamed from: d */
            public final ThreadPoolExecutor mo64865d(int i, String str, BlockingQueue<Runnable> blockingQueue) {
                return new ThreadPoolExecutor(0, i, 60, TimeUnit.SECONDS, blockingQueue, mo64866e(str));
            }

            /* renamed from: e */
            public final ThreadFactory mo64866e(String str) {
                return new C21726a(str);
            }
        }

        public C21724d(C21715b bVar) {
            if (bVar != null) {
                this.f56197b = bVar;
                return;
            }
            throw new IllegalArgumentException("Network cannot be null");
        }

        /* renamed from: a */
        public C21718c mo64856a() {
            C21751e eVar = this.f56198c;
            if (eVar == null && this.f56196a == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (eVar == null) {
                this.f56198c = new C21738l((C21719a) null);
            }
            if (this.f56200e == null) {
                this.f56200e = new C21756h(new Handler(Looper.getMainLooper()));
            }
            if (this.f56199d == null) {
                this.f56199d = mo64857b();
            }
            return new C21718c(this.f56198c, this.f56197b, this.f56196a, this.f56200e, this.f56199d, (C21719a) null);
        }

        /* renamed from: b */
        public final C21733h mo64857b() {
            return new C21725a();
        }

        /* renamed from: c */
        public C21724d mo64858c(C21712a aVar) {
            this.f56196a = aVar;
            return this;
        }

        /* renamed from: d */
        public C21724d mo64859d(C21751e eVar) {
            this.f56198c = eVar;
            return this;
        }

        /* renamed from: e */
        public C21724d mo64860e(C21733h hVar) {
            this.f56199d = hVar;
            return this;
        }

        /* renamed from: f */
        public C21724d mo64861f(C21774q qVar) {
            this.f56200e = qVar;
            return this;
        }
    }

    /* renamed from: com.android.volley.c$e */
    public class C21727e<T> extends C21770o<T> {

        /* renamed from: b */
        public C21751e.C21752a f56204b;

        /* renamed from: c */
        public long f56205c;

        /* renamed from: com.android.volley.c$e$a */
        public class C21728a implements Runnable {
            public C21728a() {
            }

            public void run() {
                C21727e eVar = C21727e.this;
                C21718c.this.mo64847n(eVar.f56323a);
            }
        }

        public C21727e(Request<T> request, C21751e.C21752a aVar, long j) {
            super(request);
            this.f56204b = aVar;
            this.f56205c = j;
        }

        public void run() {
            this.f56323a.mo64801g("cache-hit");
            Request<T> request = this.f56323a;
            C21751e.C21752a aVar = this.f56204b;
            C21771p<T> k1 = request.mo20305k1(new C21762l(200, aVar.f56260a, false, 0, aVar.f56267h));
            this.f56323a.mo64801g("cache-hit-parsed");
            if (!this.f56204b.mo64919d(this.f56205c)) {
                C21718c.this.mo64951i().mo64929a(this.f56323a, k1);
                return;
            }
            this.f56323a.mo64801g("cache-hit-refresh-needed");
            this.f56323a.mo64808n1(this.f56204b);
            k1.f56327d = true;
            if (!C21718c.this.f56188s.mo64965c(this.f56323a)) {
                C21718c.this.mo64951i().mo64930b(this.f56323a, k1, new C21728a());
            } else {
                C21718c.this.mo64951i().mo64929a(this.f56323a, k1);
            }
        }
    }

    /* renamed from: com.android.volley.c$f */
    public class C21729f<T> extends C21770o<T> {

        /* renamed from: b */
        public C21771p<?> f56208b;

        /* renamed from: com.android.volley.c$f$a */
        public class C21730a implements C21712a.C21714b {
            public C21730a() {
            }

            /* renamed from: a */
            public void mo64833a() {
                C21729f fVar = C21729f.this;
                C21718c.this.mo64850y(fVar.f56323a, fVar.f56208b, true);
            }
        }

        public C21729f(Request<T> request, C21771p<?> pVar) {
            super(request);
            this.f56208b = pVar;
        }

        public void run() {
            if (C21718c.this.f56182m != null) {
                C21718c.this.f56182m.mo64830e(this.f56323a.mo64799e0(), this.f56208b.f56325b, new C21730a());
                return;
            }
            C21718c.this.mo64950h().mo64878d(this.f56323a.mo64799e0(), this.f56208b.f56325b);
            C21718c.this.mo64850y(this.f56323a, this.f56208b, true);
        }
    }

    /* renamed from: com.android.volley.c$g */
    public class C21731g<T> extends C21770o<T> {

        /* renamed from: com.android.volley.c$g$a */
        public class C21732a implements C21712a.C21713a {
            public C21732a() {
            }

            /* renamed from: a */
            public void mo64832a(C21751e.C21752a aVar) {
                C21731g gVar = C21731g.this;
                C21718c.this.mo64844A(aVar, gVar.f56323a);
            }
        }

        public C21731g(Request<T> request) {
            super(request);
        }

        public void run() {
            if (this.f56323a.mo64791O0()) {
                this.f56323a.mo64792Q("cache-discard-canceled");
                return;
            }
            this.f56323a.mo64801g("cache-queue-take");
            if (C21718c.this.f56182m != null) {
                C21718c.this.f56182m.mo64827b(this.f56323a.mo64799e0(), new C21732a());
                return;
            }
            C21718c.this.mo64844A(C21718c.this.mo64950h().get(this.f56323a.mo64799e0()), this.f56323a);
        }
    }

    /* renamed from: com.android.volley.c$h */
    public static abstract class C21733h {
        /* renamed from: a */
        public abstract ExecutorService mo64862a(BlockingQueue<Runnable> blockingQueue);

        /* renamed from: b */
        public abstract ExecutorService mo64863b(BlockingQueue<Runnable> blockingQueue);

        /* renamed from: c */
        public abstract ScheduledExecutorService mo64864c();
    }

    /* renamed from: com.android.volley.c$i */
    public class C21734i<T> extends C21770o<T> {

        /* renamed from: b */
        public C21762l f56213b;

        public C21734i(Request<T> request, C21762l lVar) {
            super(request);
            this.f56213b = lVar;
        }

        public void run() {
            C21771p<T> k1 = this.f56323a.mo20305k1(this.f56213b);
            this.f56323a.mo64801g("network-parse-complete");
            if (!this.f56323a.mo64785H1() || k1.f56325b == null) {
                C21718c.this.mo64850y(this.f56323a, k1, false);
            } else if (C21718c.this.f56182m != null) {
                C21718c.this.f56184o.execute(new C21729f(this.f56323a, k1));
            } else {
                C21718c.this.f56186q.execute(new C21729f(this.f56323a, k1));
            }
        }
    }

    /* renamed from: com.android.volley.c$j */
    public class C21735j<T> extends C21770o<T> {

        /* renamed from: com.android.volley.c$j$a */
        public class C21736a implements C21715b.C21717b {

            /* renamed from: a */
            public final /* synthetic */ long f56216a;

            public C21736a(long j) {
                this.f56216a = j;
            }

            /* renamed from: a */
            public void mo64842a(VolleyError volleyError) {
                volleyError.mo64825b(SystemClock.elapsedRealtime() - this.f56216a);
                ExecutorService v = C21718c.this.f56186q;
                C21735j jVar = C21735j.this;
                v.execute(new C21737k(jVar.f56323a, volleyError));
            }

            /* renamed from: b */
            public void mo64843b(C21762l lVar) {
                C21735j.this.f56323a.mo64801g("network-http-complete");
                if (!lVar.f56301e || !C21735j.this.f56323a.mo64790N0()) {
                    ExecutorService v = C21718c.this.f56186q;
                    C21735j jVar = C21735j.this;
                    v.execute(new C21734i(jVar.f56323a, lVar));
                    return;
                }
                C21735j.this.f56323a.mo64792Q("not-modified");
                C21735j.this.f56323a.mo64794U0();
            }
        }

        public C21735j(Request<T> request) {
            super(request);
        }

        public void run() {
            if (this.f56323a.mo64791O0()) {
                this.f56323a.mo64792Q("network-discard-cancelled");
                this.f56323a.mo64794U0();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f56323a.mo64801g("network-queue-take");
            C21718c.this.f56183n.mo64838e(this.f56323a, new C21736a(elapsedRealtime));
        }
    }

    /* renamed from: com.android.volley.c$k */
    public class C21737k<T> extends C21770o<T> {

        /* renamed from: b */
        public VolleyError f56218b;

        public C21737k(Request<T> request, VolleyError volleyError) {
            super(request);
            this.f56218b = volleyError;
        }

        public void run() {
            C21718c.this.mo64951i().mo64931c(this.f56323a, this.f56323a.mo64804j1(this.f56218b));
            this.f56323a.mo64794U0();
        }
    }

    /* renamed from: com.android.volley.c$l */
    public static class C21738l implements C21751e {
        public C21738l() {
        }

        /* renamed from: b */
        public void mo64875b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo64876c(String str, boolean z) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo64878d(String str, C21751e.C21752a aVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public void mo64879e(String str) {
            throw new UnsupportedOperationException();
        }

        public C21751e.C21752a get(String str) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C21738l(C21719a aVar) {
            this();
        }
    }

    public /* synthetic */ C21718c(C21751e eVar, C21715b bVar, C21712a aVar, C21774q qVar, C21733h hVar, C21719a aVar2) {
        this(eVar, bVar, aVar, qVar, hVar);
    }

    /* renamed from: z */
    public static PriorityBlockingQueue<Runnable> m99956z() {
        return new PriorityBlockingQueue<>(11, new C21723c());
    }

    /* renamed from: A */
    public final void mo64844A(C21751e.C21752a aVar, Request<?> request) {
        if (aVar == null) {
            request.mo64801g("cache-miss");
            if (!this.f56188s.mo64965c(request)) {
                mo64847n(request);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.mo64917b(currentTimeMillis)) {
            request.mo64801g("cache-hit-expired");
            request.mo64808n1(aVar);
            if (!this.f56188s.mo64965c(request)) {
                mo64847n(request);
                return;
            }
            return;
        }
        this.f56186q.execute(new C21727e(request, aVar, currentTimeMillis));
    }

    /* renamed from: B */
    public final void mo64845B() {
        ArrayList<Request> arrayList;
        synchronized (this.f56191v) {
            arrayList = new ArrayList<>(this.f56189t);
            this.f56189t.clear();
            this.f56190u = true;
        }
        for (Request d : arrayList) {
            mo64846d(d);
        }
    }

    /* renamed from: d */
    public <T> void mo64846d(Request<T> request) {
        if (!this.f56190u) {
            synchronized (this.f56191v) {
                if (!this.f56190u) {
                    this.f56189t.add(request);
                    return;
                }
            }
        }
        if (!request.mo64785H1()) {
            mo64847n(request);
        } else if (this.f56182m != null) {
            this.f56184o.execute(new C21731g(request));
        } else {
            this.f56186q.execute(new C21731g(request));
        }
    }

    /* renamed from: n */
    public <T> void mo64847n(Request<T> request) {
        this.f56184o.execute(new C21735j(request));
    }

    /* renamed from: o */
    public void mo64848o() {
        mo64849p();
        this.f56184o = this.f56187r.mo64863b(m99956z());
        this.f56186q = this.f56187r.mo64862a(m99956z());
        this.f56185p = this.f56187r.mo64864c();
        this.f56183n.mo64839f(this.f56186q);
        this.f56183n.mo64840g(this.f56184o);
        this.f56183n.mo64841h(this.f56185p);
        if (this.f56182m != null) {
            this.f56184o.execute(new C21719a());
        } else {
            this.f56186q.execute(new C21721b());
        }
    }

    /* renamed from: p */
    public void mo64849p() {
        ExecutorService executorService = this.f56184o;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f56184o = null;
        }
        ExecutorService executorService2 = this.f56186q;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f56186q = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f56185p;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f56185p = null;
        }
    }

    /* renamed from: y */
    public final void mo64850y(Request<?> request, C21771p<?> pVar, boolean z) {
        if (z) {
            request.mo64801g("network-cache-written");
        }
        request.mo64793R0();
        mo64951i().mo64929a(request, pVar);
        request.mo64797c1(pVar);
    }

    public C21718c(C21751e eVar, C21715b bVar, @C0363p0 C21712a aVar, C21774q qVar, C21733h hVar) {
        super(eVar, bVar, 0, qVar);
        this.f56188s = new C21779t(this);
        this.f56189t = new ArrayList();
        this.f56190u = false;
        this.f56191v = new Object[0];
        this.f56182m = aVar;
        this.f56183n = bVar;
        this.f56187r = hVar;
    }
}
