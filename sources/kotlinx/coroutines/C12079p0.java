package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.internal.C11992g;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.intrinsics.C12037b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.p0 */
public final class C12079p0 {
    @C12579k
    /* renamed from: a */
    public static final C12074o0 m48260a(@C12579k CoroutineContext coroutineContext) {
        if (coroutineContext.mo7444b(C11723c2.f29067w0) == null) {
            coroutineContext = coroutineContext.mo7443Q(C11968h2.m47683c((C11723c2) null, 1, (Object) null));
        }
        return new C11992g(coroutineContext);
    }

    @C12579k
    /* renamed from: b */
    public static final C12074o0 m48261b() {
        return new C11992g(C11719b3.m46155c((C11723c2) null, 1, (Object) null).mo7443Q(C11768d1.m46783e()));
    }

    /* renamed from: c */
    public static final void m48262c(@C12579k C12074o0 o0Var, @C12579k String str, @C12580l Throwable th) {
        m48263d(o0Var, C12080p1.m48273a(str, th));
    }

    /* renamed from: d */
    public static final void m48263d(@C12579k C12074o0 o0Var, @C12580l CancellationException cancellationException) {
        C11723c2 c2Var = (C11723c2) o0Var.getCoroutineContext().mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            c2Var.mo23621a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o0Var).toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m48264e(C12074o0 o0Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m48262c(o0Var, str, th);
    }

    /* renamed from: f */
    public static /* synthetic */ void m48265f(C12074o0 o0Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m48263d(o0Var, cancellationException);
    }

    @C12580l
    /* renamed from: g */
    public static final <R> Object m48266g(@C12579k C11304p<? super C12074o0, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        C12001k0 k0Var = new C12001k0(cVar.getContext(), cVar);
        Object e = C12037b.m48053e(k0Var, k0Var, pVar);
        if (e == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return e;
    }

    @C12580l
    /* renamed from: h */
    public static final Object m48267h(@C12579k C11045c<? super CoroutineContext> cVar) {
        return cVar.getContext();
    }

    /* renamed from: i */
    public static final Object m48268i(C11045c<? super CoroutineContext> cVar) {
        C11322b0.m43482e(3);
        throw null;
    }

    /* renamed from: j */
    public static final void m48269j(@C12579k C12074o0 o0Var) {
        C11804f2.m46978z(o0Var.getCoroutineContext());
    }

    /* renamed from: k */
    public static final boolean m48270k(@C12579k C12074o0 o0Var) {
        C11723c2 c2Var = (C11723c2) o0Var.getCoroutineContext().mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            return c2Var.mo23627d();
        }
        return true;
    }

    /* renamed from: l */
    public static /* synthetic */ void m48271l(C12074o0 o0Var) {
    }

    @C12579k
    /* renamed from: m */
    public static final C12074o0 m48272m(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext) {
        return new C11992g(o0Var.getCoroutineContext().mo7443Q(coroutineContext));
    }
}
