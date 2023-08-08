package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.q0 */
public final class C31060q0<TResult> extends C31047k<TResult> {

    /* renamed from: a */
    public final Object f74320a = new Object();

    /* renamed from: b */
    public final C31050l0 f74321b = new C31050l0();
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f74322c;

    /* renamed from: d */
    public volatile boolean f74323d;
    @C0363p0
    @GuardedBy("mLock")

    /* renamed from: e */
    public Object f74324e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public Exception f74325f;

    /* renamed from: A */
    public final boolean mo87752A() {
        synchronized (this.f74320a) {
            if (this.f74322c) {
                return false;
            }
            this.f74322c = true;
            this.f74323d = true;
            this.f74321b.mo87747b(this);
            return true;
        }
    }

    /* renamed from: B */
    public final boolean mo87753B(@C0359n0 Exception exc) {
        C40843u.m166203m(exc, "Exception must not be null");
        synchronized (this.f74320a) {
            if (this.f74322c) {
                return false;
            }
            this.f74322c = true;
            this.f74325f = exc;
            this.f74321b.mo87747b(this);
            return true;
        }
    }

    /* renamed from: C */
    public final boolean mo87754C(@C0363p0 Object obj) {
        synchronized (this.f74320a) {
            if (this.f74322c) {
                return false;
            }
            this.f74322c = true;
            this.f74324e = obj;
            this.f74321b.mo87747b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: D */
    public final void mo87755D() {
        C40843u.m166209s(this.f74322c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: E */
    public final void mo87756E() {
        if (this.f74323d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    /* renamed from: F */
    public final void mo87757F() {
        if (this.f74322c) {
            throw DuplicateTaskCompletionException.m124456a(this);
        }
    }

    /* renamed from: G */
    public final void mo87758G() {
        synchronized (this.f74320a) {
            if (this.f74322c) {
                this.f74321b.mo87747b(this);
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public final C31047k<TResult> mo87717a(@C0359n0 Activity activity, @C0359n0 C31033d dVar) {
        C31030b0 b0Var = new C31030b0(C31051m.f74312a, dVar);
        this.f74321b.mo87746a(b0Var);
        C31058p0.m124537m(activity).mo87751n(b0Var);
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final C31047k<TResult> mo87718b(@C0359n0 C31033d dVar) {
        mo87719c(C31051m.f74312a, dVar);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public final C31047k<TResult> mo87719c(@C0359n0 Executor executor, @C0359n0 C31033d dVar) {
        this.f74321b.mo87746a(new C31030b0(executor, dVar));
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public final C31047k<TResult> mo87720d(@C0359n0 Activity activity, @C0359n0 C31035e<TResult> eVar) {
        C31034d0 d0Var = new C31034d0(C31051m.f74312a, eVar);
        this.f74321b.mo87746a(d0Var);
        C31058p0.m124537m(activity).mo87751n(d0Var);
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public final C31047k<TResult> mo87721e(@C0359n0 C31035e<TResult> eVar) {
        this.f74321b.mo87746a(new C31034d0(C31051m.f74312a, eVar));
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public final C31047k<TResult> mo87722f(@C0359n0 Executor executor, @C0359n0 C31035e<TResult> eVar) {
        this.f74321b.mo87746a(new C31034d0(executor, eVar));
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public final C31047k<TResult> mo87723g(@C0359n0 Activity activity, @C0359n0 C31037f fVar) {
        C31038f0 f0Var = new C31038f0(C31051m.f74312a, fVar);
        this.f74321b.mo87746a(f0Var);
        C31058p0.m124537m(activity).mo87751n(f0Var);
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public final C31047k<TResult> mo87724h(@C0359n0 C31037f fVar) {
        mo87725i(C31051m.f74312a, fVar);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public final C31047k<TResult> mo87725i(@C0359n0 Executor executor, @C0359n0 C31037f fVar) {
        this.f74321b.mo87746a(new C31038f0(executor, fVar));
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public final C31047k<TResult> mo87726j(@C0359n0 Activity activity, @C0359n0 C31039g<? super TResult> gVar) {
        C31042h0 h0Var = new C31042h0(C31051m.f74312a, gVar);
        this.f74321b.mo87746a(h0Var);
        C31058p0.m124537m(activity).mo87751n(h0Var);
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public final C31047k<TResult> mo87727k(@C0359n0 C31039g<? super TResult> gVar) {
        mo87728l(C31051m.f74312a, gVar);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public final C31047k<TResult> mo87728l(@C0359n0 Executor executor, @C0359n0 C31039g<? super TResult> gVar) {
        this.f74321b.mo87746a(new C31042h0(executor, gVar));
        mo87758G();
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87729m(@C0359n0 C31031c<TResult, TContinuationResult> cVar) {
        return mo87730n(C31051m.f74312a, cVar);
    }

    @C0359n0
    /* renamed from: n */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87730n(@C0359n0 Executor executor, @C0359n0 C31031c<TResult, TContinuationResult> cVar) {
        C31060q0 q0Var = new C31060q0();
        this.f74321b.mo87746a(new C31070x(executor, cVar, q0Var));
        mo87758G();
        return q0Var;
    }

    @C0359n0
    /* renamed from: o */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87731o(@C0359n0 C31031c<TResult, C31047k<TContinuationResult>> cVar) {
        return mo87732p(C31051m.f74312a, cVar);
    }

    @C0359n0
    /* renamed from: p */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87732p(@C0359n0 Executor executor, @C0359n0 C31031c<TResult, C31047k<TContinuationResult>> cVar) {
        C31060q0 q0Var = new C31060q0();
        this.f74321b.mo87746a(new C31072z(executor, cVar, q0Var));
        mo87758G();
        return q0Var;
    }

    @C0363p0
    /* renamed from: q */
    public final Exception mo87733q() {
        Exception exc;
        synchronized (this.f74320a) {
            exc = this.f74325f;
        }
        return exc;
    }

    /* renamed from: r */
    public final TResult mo87734r() {
        TResult tresult;
        synchronized (this.f74320a) {
            mo87755D();
            mo87756E();
            Exception exc = this.f74325f;
            if (exc == null) {
                tresult = this.f74324e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: s */
    public final <X extends Throwable> TResult mo87735s(@C0359n0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f74320a) {
            mo87755D();
            mo87756E();
            if (!cls.isInstance(this.f74325f)) {
                Exception exc = this.f74325f;
                if (exc == null) {
                    tresult = this.f74324e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f74325f));
            }
        }
        return tresult;
    }

    /* renamed from: t */
    public final boolean mo87736t() {
        return this.f74323d;
    }

    /* renamed from: u */
    public final boolean mo87737u() {
        boolean z;
        synchronized (this.f74320a) {
            z = this.f74322c;
        }
        return z;
    }

    /* renamed from: v */
    public final boolean mo87738v() {
        boolean z;
        synchronized (this.f74320a) {
            z = false;
            if (this.f74322c && !this.f74323d && this.f74325f == null) {
                z = true;
            }
        }
        return z;
    }

    @C0359n0
    /* renamed from: w */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87739w(@C0359n0 C31045j<TResult, TContinuationResult> jVar) {
        Executor executor = C31051m.f74312a;
        C31060q0 q0Var = new C31060q0();
        this.f74321b.mo87746a(new C31046j0(executor, jVar, q0Var));
        mo87758G();
        return q0Var;
    }

    @C0359n0
    /* renamed from: x */
    public final <TContinuationResult> C31047k<TContinuationResult> mo87740x(Executor executor, C31045j<TResult, TContinuationResult> jVar) {
        C31060q0 q0Var = new C31060q0();
        this.f74321b.mo87746a(new C31046j0(executor, jVar, q0Var));
        mo87758G();
        return q0Var;
    }

    /* renamed from: y */
    public final void mo87759y(@C0359n0 Exception exc) {
        C40843u.m166203m(exc, "Exception must not be null");
        synchronized (this.f74320a) {
            mo87757F();
            this.f74322c = true;
            this.f74325f = exc;
        }
        this.f74321b.mo87747b(this);
    }

    /* renamed from: z */
    public final void mo87760z(@C0363p0 Object obj) {
        synchronized (this.f74320a) {
            mo87757F();
            this.f74322c = true;
            this.f74324e = obj;
        }
        this.f74321b.mo87747b(this);
    }
}
