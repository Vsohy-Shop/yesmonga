package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32028a0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.s */
public final class C32242s<ResultT> extends C32227d<ResultT> {

    /* renamed from: a */
    public final Object f78594a = new Object();

    /* renamed from: b */
    public final C32238o<ResultT> f78595b = new C32238o<>();

    /* renamed from: c */
    public boolean f78596c;

    /* renamed from: d */
    public ResultT f78597d;

    /* renamed from: e */
    public Exception f78598e;

    /* renamed from: a */
    public final C32227d<ResultT> mo93013a(C32224a<ResultT> aVar) {
        this.f78595b.mo93028a(new C32231h(C32228e.f78572a, aVar));
        mo93043r();
        return this;
    }

    /* renamed from: b */
    public final C32227d<ResultT> mo93014b(Executor executor, C32224a<ResultT> aVar) {
        this.f78595b.mo93028a(new C32231h(executor, aVar));
        mo93043r();
        return this;
    }

    /* renamed from: c */
    public final C32227d<ResultT> mo93015c(C32225b bVar) {
        mo93016d(C32228e.f78572a, bVar);
        return this;
    }

    /* renamed from: d */
    public final C32227d<ResultT> mo93016d(Executor executor, C32225b bVar) {
        this.f78595b.mo93028a(new C32234k(executor, bVar));
        mo93043r();
        return this;
    }

    /* renamed from: e */
    public final C32227d<ResultT> mo93017e(C32226c<? super ResultT> cVar) {
        mo93018f(C32228e.f78572a, cVar);
        return this;
    }

    /* renamed from: f */
    public final C32227d<ResultT> mo93018f(Executor executor, C32226c<? super ResultT> cVar) {
        this.f78595b.mo93028a(new C32236m(executor, cVar));
        mo93043r();
        return this;
    }

    @Nullable
    /* renamed from: g */
    public final Exception mo93019g() {
        Exception exc;
        synchronized (this.f78594a) {
            exc = this.f78598e;
        }
        return exc;
    }

    /* renamed from: h */
    public final ResultT mo93020h() {
        ResultT resultt;
        synchronized (this.f78594a) {
            mo93041p();
            Exception exc = this.f78598e;
            if (exc == null) {
                resultt = this.f78597d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    /* renamed from: i */
    public final <X extends Throwable> ResultT mo93021i(Class<X> cls) throws Throwable {
        ResultT resultt;
        synchronized (this.f78594a) {
            mo93041p();
            if (!cls.isInstance(this.f78598e)) {
                Exception exc = this.f78598e;
                if (exc == null) {
                    resultt = this.f78597d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f78598e));
            }
        }
        return resultt;
    }

    /* renamed from: j */
    public final boolean mo93022j() {
        boolean z;
        synchronized (this.f78594a) {
            z = this.f78596c;
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo93023k() {
        boolean z;
        synchronized (this.f78594a) {
            z = false;
            if (this.f78596c && this.f78598e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: l */
    public final void mo93037l(ResultT resultt) {
        synchronized (this.f78594a) {
            mo93042q();
            this.f78596c = true;
            this.f78597d = resultt;
        }
        this.f78595b.mo93029b(this);
    }

    /* renamed from: m */
    public final boolean mo93038m(ResultT resultt) {
        synchronized (this.f78594a) {
            if (this.f78596c) {
                return false;
            }
            this.f78596c = true;
            this.f78597d = resultt;
            this.f78595b.mo93029b(this);
            return true;
        }
    }

    /* renamed from: n */
    public final void mo93039n(Exception exc) {
        synchronized (this.f78594a) {
            mo93042q();
            this.f78596c = true;
            this.f78598e = exc;
        }
        this.f78595b.mo93029b(this);
    }

    /* renamed from: o */
    public final boolean mo93040o(Exception exc) {
        synchronized (this.f78594a) {
            if (this.f78596c) {
                return false;
            }
            this.f78596c = true;
            this.f78598e = exc;
            this.f78595b.mo93029b(this);
            return true;
        }
    }

    /* renamed from: p */
    public final void mo93041p() {
        C32028a0.m129763c(this.f78596c, "Task is not yet complete");
    }

    /* renamed from: q */
    public final void mo93042q() {
        C32028a0.m129763c(!this.f78596c, "Task is already complete");
    }

    /* renamed from: r */
    public final void mo93043r() {
        synchronized (this.f78594a) {
            if (this.f78596c) {
                this.f78595b.mo93029b(this);
            }
        }
    }
}
