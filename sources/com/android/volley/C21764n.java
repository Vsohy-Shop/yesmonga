package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.volley.n */
public class C21764n {

    /* renamed from: l */
    public static final int f56303l = 4;

    /* renamed from: a */
    public final AtomicInteger f56304a;

    /* renamed from: b */
    public final Set<Request<?>> f56305b;

    /* renamed from: c */
    public final PriorityBlockingQueue<Request<?>> f56306c;

    /* renamed from: d */
    public final PriorityBlockingQueue<Request<?>> f56307d;

    /* renamed from: e */
    public final C21751e f56308e;

    /* renamed from: f */
    public final C21760j f56309f;

    /* renamed from: g */
    public final C21774q f56310g;

    /* renamed from: h */
    public final C21761k[] f56311h;

    /* renamed from: i */
    public C21753f f56312i;

    /* renamed from: j */
    public final List<C21769e> f56313j;

    /* renamed from: k */
    public final List<C21767c> f56314k;

    /* renamed from: com.android.volley.n$a */
    public class C21765a implements C21768d {

        /* renamed from: a */
        public final /* synthetic */ Object f56315a;

        public C21765a(Object obj) {
            this.f56315a = obj;
        }

        /* renamed from: a */
        public boolean mo64956a(Request<?> request) {
            return request.mo64781F0() == this.f56315a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.android.volley.n$b */
    public @interface C21766b {

        /* renamed from: K */
        public static final int f56317K = 0;

        /* renamed from: L */
        public static final int f56318L = 1;

        /* renamed from: M */
        public static final int f56319M = 2;

        /* renamed from: N */
        public static final int f56320N = 3;

        /* renamed from: O */
        public static final int f56321O = 4;

        /* renamed from: P */
        public static final int f56322P = 5;
    }

    /* renamed from: com.android.volley.n$c */
    public interface C21767c {
        /* renamed from: a */
        void mo64957a(Request<?> request, int i);
    }

    /* renamed from: com.android.volley.n$d */
    public interface C21768d {
        /* renamed from: a */
        boolean mo64956a(Request<?> request);
    }

    @Deprecated
    /* renamed from: com.android.volley.n$e */
    public interface C21769e<T> {
        /* renamed from: a */
        void mo64958a(Request<T> request);
    }

    public C21764n(C21751e eVar, C21760j jVar, int i, C21774q qVar) {
        this.f56304a = new AtomicInteger();
        this.f56305b = new HashSet();
        this.f56306c = new PriorityBlockingQueue<>();
        this.f56307d = new PriorityBlockingQueue<>();
        this.f56313j = new ArrayList();
        this.f56314k = new ArrayList();
        this.f56308e = eVar;
        this.f56309f = jVar;
        this.f56311h = new C21761k[i];
        this.f56310g = qVar;
    }

    /* renamed from: a */
    public <T> Request<T> mo64944a(Request<T> request) {
        request.mo64818w1(this);
        synchronized (this.f56305b) {
            this.f56305b.add(request);
        }
        request.mo64777A1(mo64952j());
        request.mo64801g("add-to-queue");
        mo64955m(request, 0);
        mo64846d(request);
        return request;
    }

    /* renamed from: b */
    public void mo64945b(C21767c cVar) {
        synchronized (this.f56314k) {
            this.f56314k.add(cVar);
        }
    }

    @Deprecated
    /* renamed from: c */
    public <T> void mo64946c(C21769e<T> eVar) {
        synchronized (this.f56313j) {
            this.f56313j.add(eVar);
        }
    }

    /* renamed from: d */
    public <T> void mo64846d(Request<T> request) {
        if (!request.mo64785H1()) {
            mo64847n(request);
        } else {
            this.f56306c.add(request);
        }
    }

    /* renamed from: e */
    public void mo64947e(C21768d dVar) {
        synchronized (this.f56305b) {
            for (Request next : this.f56305b) {
                if (dVar.mo64956a(next)) {
                    next.mo64811q();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo64948f(Object obj) {
        if (obj != null) {
            mo64947e(new C21765a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    /* renamed from: g */
    public <T> void mo64949g(Request<T> request) {
        synchronized (this.f56305b) {
            this.f56305b.remove(request);
        }
        synchronized (this.f56313j) {
            for (C21769e a : this.f56313j) {
                a.mo64958a(request);
            }
        }
        mo64955m(request, 5);
    }

    /* renamed from: h */
    public C21751e mo64950h() {
        return this.f56308e;
    }

    /* renamed from: i */
    public C21774q mo64951i() {
        return this.f56310g;
    }

    /* renamed from: j */
    public int mo64952j() {
        return this.f56304a.incrementAndGet();
    }

    /* renamed from: k */
    public void mo64953k(C21767c cVar) {
        synchronized (this.f56314k) {
            this.f56314k.remove(cVar);
        }
    }

    @Deprecated
    /* renamed from: l */
    public <T> void mo64954l(C21769e<T> eVar) {
        synchronized (this.f56313j) {
            this.f56313j.remove(eVar);
        }
    }

    /* renamed from: m */
    public void mo64955m(Request<?> request, int i) {
        synchronized (this.f56314k) {
            for (C21767c a : this.f56314k) {
                a.mo64957a(request, i);
            }
        }
    }

    /* renamed from: n */
    public <T> void mo64847n(Request<T> request) {
        this.f56307d.add(request);
    }

    /* renamed from: o */
    public void mo64848o() {
        mo64849p();
        C21753f fVar = new C21753f(this.f56306c, this.f56307d, this.f56308e, this.f56310g);
        this.f56312i = fVar;
        fVar.start();
        for (int i = 0; i < this.f56311h.length; i++) {
            C21761k kVar = new C21761k(this.f56307d, this.f56309f, this.f56308e, this.f56310g);
            this.f56311h[i] = kVar;
            kVar.start();
        }
    }

    /* renamed from: p */
    public void mo64849p() {
        C21753f fVar = this.f56312i;
        if (fVar != null) {
            fVar.mo64921e();
        }
        for (C21761k kVar : this.f56311h) {
            if (kVar != null) {
                kVar.mo64942e();
            }
        }
    }

    public C21764n(C21751e eVar, C21760j jVar, int i) {
        this(eVar, jVar, i, new C21756h(new Handler(Looper.getMainLooper())));
    }

    public C21764n(C21751e eVar, C21760j jVar) {
        this(eVar, jVar, 4);
    }
}
