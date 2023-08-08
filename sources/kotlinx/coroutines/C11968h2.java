package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.C11559m;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,685:1\n13#2:686\n1295#3,2:687\n1295#3,2:689\n1295#3,2:691\n1295#3,2:693\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n494#1:686\n521#1:687,2\n535#1:689,2\n629#1:691,2\n653#1:693,2\n*E\n"})
/* renamed from: kotlinx.coroutines.h2 */
public final /* synthetic */ class C11968h2 {
    /* renamed from: A */
    public static final boolean m47679A(@C12579k CoroutineContext coroutineContext) {
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            return c2Var.mo23627d();
        }
        return true;
    }

    /* renamed from: B */
    public static final Throwable m47680B(Throwable th, C11723c2 c2Var) {
        return th == null ? new JobCancellationException("Job was cancelled", (Throwable) null, c2Var) : th;
    }

    @C12579k
    /* renamed from: a */
    public static final C11702a0 m47681a(@C12580l C11723c2 c2Var) {
        return new C11799e2(c2Var);
    }

    /* renamed from: c */
    public static /* synthetic */ C11702a0 m47683c(C11723c2 c2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            c2Var = null;
        }
        return C11804f2.m46953a(c2Var);
    }

    /* renamed from: d */
    public static /* synthetic */ C11723c2 m47684d(C11723c2 c2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            c2Var = null;
        }
        return C11804f2.m46953a(c2Var);
    }

    /* renamed from: f */
    public static final void m47686f(@C12579k CoroutineContext coroutineContext, @C12580l CancellationException cancellationException) {
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            c2Var.mo23621a(cancellationException);
        }
    }

    /* renamed from: g */
    public static final void m47687g(@C12579k C11723c2 c2Var, @C12579k String str, @C12580l Throwable th) {
        c2Var.mo23621a(C12080p1.m48273a(str, th));
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: h */
    public static final /* synthetic */ boolean m47688h(CoroutineContext coroutineContext, Throwable th) {
        JobSupport jobSupport;
        CoroutineContext.C11040a b = coroutineContext.mo7444b(C11723c2.f29067w0);
        if (b instanceof JobSupport) {
            jobSupport = (JobSupport) b;
        } else {
            jobSupport = null;
        }
        if (jobSupport == null) {
            return false;
        }
        jobSupport.mo23585B0(m47680B(th, jobSupport));
        return true;
    }

    /* renamed from: i */
    public static /* synthetic */ void m47689i(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C11804f2.m46958f(coroutineContext, cancellationException);
    }

    /* renamed from: j */
    public static /* synthetic */ void m47690j(C11723c2 c2Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        C11804f2.m46959g(c2Var, str, th);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m47691k(CoroutineContext coroutineContext, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return m47688h(coroutineContext, th);
    }

    @C12580l
    /* renamed from: l */
    public static final Object m47692l(@C12579k C11723c2 c2Var, @C12579k C11045c<? super C11079d2> cVar) {
        C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        Object S = c2Var.mo23614S(cVar);
        if (S == C11063b.m42612h()) {
            return S;
        }
        return C11079d2.f28267a;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: n */
    public static final /* synthetic */ void m47694n(CoroutineContext coroutineContext, Throwable th) {
        JobSupport jobSupport;
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            for (C11723c2 next : c2Var.mo23646r()) {
                if (next instanceof JobSupport) {
                    jobSupport = (JobSupport) next;
                } else {
                    jobSupport = null;
                }
                if (jobSupport != null) {
                    jobSupport.mo23585B0(m47680B(th, c2Var));
                }
            }
        }
    }

    /* renamed from: o */
    public static final void m47695o(@C12579k CoroutineContext coroutineContext, @C12580l CancellationException cancellationException) {
        C11559m<C11723c2> r;
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null && (r = c2Var.mo23646r()) != null) {
            for (C11723c2 a : r) {
                a.mo23621a(cancellationException);
            }
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: q */
    public static final /* synthetic */ void m47697q(C11723c2 c2Var, Throwable th) {
        JobSupport jobSupport;
        for (C11723c2 next : c2Var.mo23646r()) {
            if (next instanceof JobSupport) {
                jobSupport = (JobSupport) next;
            } else {
                jobSupport = null;
            }
            if (jobSupport != null) {
                jobSupport.mo23585B0(m47680B(th, c2Var));
            }
        }
    }

    /* renamed from: r */
    public static final void m47698r(@C12579k C11723c2 c2Var, @C12580l CancellationException cancellationException) {
        for (C11723c2 a : c2Var.mo23646r()) {
            a.mo23621a(cancellationException);
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m47699s(CoroutineContext coroutineContext, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        m47694n(coroutineContext, th);
    }

    /* renamed from: t */
    public static /* synthetic */ void m47700t(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C11804f2.m46967o(coroutineContext, cancellationException);
    }

    /* renamed from: u */
    public static /* synthetic */ void m47701u(C11723c2 c2Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        m47697q(c2Var, th);
    }

    /* renamed from: v */
    public static /* synthetic */ void m47702v(C11723c2 c2Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C11804f2.m46970r(c2Var, cancellationException);
    }

    @C12579k
    /* renamed from: w */
    public static final C11962g1 m47703w(@C12579k C11723c2 c2Var, @C12579k C11962g1 g1Var) {
        return c2Var.mo23589D(new C11973i1(g1Var));
    }

    /* renamed from: x */
    public static final void m47704x(@C12579k CoroutineContext coroutineContext) {
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            C11804f2.m46950A(c2Var);
        }
    }

    /* renamed from: y */
    public static final void m47705y(@C12579k C11723c2 c2Var) {
        if (!c2Var.mo23627d()) {
            throw c2Var.mo23653u();
        }
    }

    @C12579k
    /* renamed from: z */
    public static final C11723c2 m47706z(@C12579k CoroutineContext coroutineContext) {
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}
