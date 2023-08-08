package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12080p1;
import kotlinx.coroutines.C12154u0;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.C12179z;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,197:1\n1#2:198\n314#3,11:199\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n172#1:199,11\n*E\n"})
public final class FutureKt {
    @C12579k
    /* renamed from: c */
    public static final <T> CompletableFuture<T> m47646c(@C12579k C12154u0<? extends T> u0Var) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        m47653j(u0Var, completableFuture);
        u0Var.mo23589D(new FutureKt$asCompletableFuture$1(completableFuture, u0Var));
        return completableFuture;
    }

    @C12579k
    /* renamed from: d */
    public static final CompletableFuture<C11079d2> m47647d(@C12579k C11723c2 c2Var) {
        CompletableFuture<C11079d2> completableFuture = new CompletableFuture<>();
        m47653j(c2Var, completableFuture);
        c2Var.mo23589D(new FutureKt$asCompletableFuture$2(completableFuture));
        return completableFuture;
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C12154u0<T> m47648e(@C12579k CompletionStage<T> completionStage) {
        ExecutionException executionException;
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return C12179z.m48759a(completableFuture.get());
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    executionException = th;
                } else {
                    executionException = null;
                }
                if (!(executionException == null || (cause = executionException.getCause()) == null)) {
                    th = cause;
                }
                C12169x c = C12179z.m48761c((C11723c2) null, 1, (Object) null);
                c.mo24790i(th);
                return c;
            }
        } else {
            C12169x c2 = C12179z.m48761c((C11723c2) null, 1, (Object) null);
            completionStage.handle(new C11958c(new FutureKt$asDeferred$2(c2)));
            C11804f2.m46976x(c2, completableFuture);
            return c2;
        }
    }

    /* renamed from: f */
    public static final Object m47649f(C11304p pVar, Object obj, Throwable th) {
        return pVar.invoke(obj, th);
    }

    @C12580l
    /* renamed from: g */
    public static final <T> Object m47650g(@C12579k CompletionStage<T> completionStage, @C12579k C11045c<? super T> cVar) {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
            pVar.mo24537e0();
            C11957b bVar = new C11957b(pVar);
            completionStage.handle(bVar);
            pVar.mo24529C(new FutureKt$await$2$1(completableFuture, bVar));
            Object y = pVar.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return y;
        }
    }

    @C12579k
    /* renamed from: h */
    public static final <T> CompletableFuture<T> m47651h(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, @C12579k CoroutineStart coroutineStart, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar) {
        if (!coroutineStart.mo23572w()) {
            CoroutineContext e = CoroutineContextKt.m45901e(o0Var, coroutineContext);
            CompletableFuture<T> completableFuture = new CompletableFuture<>();
            C11956a aVar = new C11956a(e, completableFuture);
            completableFuture.handle(aVar);
            aVar.mo23695R1(coroutineStart, aVar, pVar);
            return completableFuture;
        }
        throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
    }

    /* renamed from: i */
    public static /* synthetic */ CompletableFuture m47652i(C12074o0 o0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m47651h(o0Var, coroutineContext, coroutineStart, pVar);
    }

    /* renamed from: j */
    public static final void m47653j(C11723c2 c2Var, CompletableFuture<?> completableFuture) {
        completableFuture.handle(new C11959d(c2Var));
    }

    /* renamed from: k */
    public static final C11079d2 m47654k(C11723c2 c2Var, Object obj, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C12080p1.m48273a("CompletableFuture was completed exceptionally", th);
            }
        }
        c2Var.mo23621a(cancellationException);
        return C11079d2.f28267a;
    }
}
