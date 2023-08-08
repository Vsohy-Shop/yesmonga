package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.C0359n0;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.crashlytics.internal.common.h */
public class C32681h {

    /* renamed from: a */
    public final Executor f79307a;

    /* renamed from: b */
    public C31047k<Void> f79308b = C31053n.m124525g(null);

    /* renamed from: c */
    public final Object f79309c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f79310d = new ThreadLocal<>();

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$a */
    public class C32682a implements Runnable {
        public C32682a() {
        }

        public void run() {
            C32681h.this.f79310d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$b */
    public class C32683b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f79312a;

        public C32683b(Runnable runnable) {
            this.f79312a = runnable;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            this.f79312a.run();
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$c */
    public class C32684c implements C31031c<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f79314a;

        public C32684c(Callable callable) {
            this.f79314a = callable;
        }

        /* renamed from: a */
        public T mo85756a(@C0359n0 C31047k<Void> kVar) throws Exception {
            return this.f79314a.call();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.h$d */
    public class C32685d implements C31031c<T, Void> {
        public C32685d() {
        }

        /* renamed from: b */
        public Void mo85756a(@C0359n0 C31047k<T> kVar) throws Exception {
            return null;
        }
    }

    public C32681h(Executor executor) {
        this.f79307a = executor;
        executor.execute(new C32682a());
    }

    /* renamed from: b */
    public void mo94877b() {
        if (!mo94880e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo94878c() {
        return this.f79307a;
    }

    /* renamed from: d */
    public final <T> C31047k<Void> mo94879d(C31047k<T> kVar) {
        return kVar.mo87730n(this.f79307a, new C32685d());
    }

    /* renamed from: e */
    public final boolean mo94880e() {
        return Boolean.TRUE.equals(this.f79310d.get());
    }

    /* renamed from: f */
    public final <T> C31031c<Void, T> mo94881f(Callable<T> callable) {
        return new C32684c(callable);
    }

    /* renamed from: g */
    public C31047k<Void> mo94882g(Runnable runnable) {
        return mo94883h(new C32683b(runnable));
    }

    /* renamed from: h */
    public <T> C31047k<T> mo94883h(Callable<T> callable) {
        C31047k<TContinuationResult> n;
        synchronized (this.f79309c) {
            n = this.f79308b.mo87730n(this.f79307a, mo94881f(callable));
            this.f79308b = mo94879d(n);
        }
        return n;
    }

    /* renamed from: i */
    public <T> C31047k<T> mo94884i(Callable<C31047k<T>> callable) {
        C31047k<TContinuationResult> p;
        synchronized (this.f79309c) {
            p = this.f79308b.mo87732p(this.f79307a, mo94881f(callable));
            this.f79308b = mo94879d(p);
        }
        return p;
    }
}
