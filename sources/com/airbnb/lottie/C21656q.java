package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.C21682f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.q */
public class C21656q<T> {

    /* renamed from: e */
    public static Executor f56052e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Set<C21537l<T>> f56053a;

    /* renamed from: b */
    public final Set<C21537l<Throwable>> f56054b;

    /* renamed from: c */
    public final Handler f56055c;
    @C0363p0

    /* renamed from: d */
    public volatile C21602p<T> f56056d;

    /* renamed from: com.airbnb.lottie.q$a */
    public class C21657a implements Runnable {
        public C21657a() {
        }

        public void run() {
            if (C21656q.this.f56056d != null) {
                C21602p a = C21656q.this.f56056d;
                if (a.mo64539b() != null) {
                    C21656q.this.mo64642i(a.mo64539b());
                } else {
                    C21656q.this.mo64640g(a.mo64538a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.q$b */
    public class C21658b extends FutureTask<C21602p<T>> {
        public C21658b(Callable<C21602p<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    C21656q.this.mo64645l((C21602p) get());
                } catch (InterruptedException | ExecutionException e) {
                    C21656q.this.mo64645l(new C21602p(e));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C21656q(Callable<C21602p<T>> callable) {
        this(callable, false);
    }

    /* renamed from: e */
    public synchronized C21656q<T> mo64638e(C21537l<Throwable> lVar) {
        if (!(this.f56056d == null || this.f56056d.mo64538a() == null)) {
            lVar.onResult(this.f56056d.mo64538a());
        }
        this.f56054b.add(lVar);
        return this;
    }

    /* renamed from: f */
    public synchronized C21656q<T> mo64639f(C21537l<T> lVar) {
        if (!(this.f56056d == null || this.f56056d.mo64539b() == null)) {
            lVar.onResult(this.f56056d.mo64539b());
        }
        this.f56053a.add(lVar);
        return this;
    }

    /* renamed from: g */
    public final synchronized void mo64640g(Throwable th) {
        ArrayList<C21537l> arrayList = new ArrayList<>(this.f56054b);
        if (arrayList.isEmpty()) {
            C21682f.m99761f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (C21537l onResult : arrayList) {
            onResult.onResult(th);
        }
    }

    /* renamed from: h */
    public final void mo64641h() {
        this.f56055c.post(new C21657a());
    }

    /* renamed from: i */
    public final synchronized void mo64642i(T t) {
        for (C21537l onResult : new ArrayList(this.f56053a)) {
            onResult.onResult(t);
        }
    }

    /* renamed from: j */
    public synchronized C21656q<T> mo64643j(C21537l<Throwable> lVar) {
        this.f56054b.remove(lVar);
        return this;
    }

    /* renamed from: k */
    public synchronized C21656q<T> mo64644k(C21537l<T> lVar) {
        this.f56053a.remove(lVar);
        return this;
    }

    /* renamed from: l */
    public final void mo64645l(@C0363p0 C21602p<T> pVar) {
        if (this.f56056d == null) {
            this.f56056d = pVar;
            mo64641h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C21656q(Callable<C21602p<T>> callable, boolean z) {
        this.f56053a = new LinkedHashSet(1);
        this.f56054b = new LinkedHashSet(1);
        this.f56055c = new Handler(Looper.getMainLooper());
        this.f56056d = null;
        if (z) {
            try {
                mo64645l(callable.call());
            } catch (Throwable th) {
                mo64645l(new C21602p(th));
            }
        } else {
            f56052e.execute(new C21658b(callable));
        }
    }
}
