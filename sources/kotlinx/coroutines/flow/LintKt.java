package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LintKt {
    @C11395k(level = DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @C11587t0(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    /* renamed from: a */
    public static final void m47250a(@C12579k C11908f<?> fVar, @C12580l CancellationException cancellationException) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ void m47251b(C11908f fVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m47250a(fVar, cancellationException);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C12579k
    /* renamed from: c */
    public static final <T> C11907e<T> m47252c(@C12579k C11944n<? extends T> nVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C11110f
    /* renamed from: d */
    public static final <T> C11907e<T> m47253d(C11944n<? extends T> nVar, C11305q<? super C11908f<? super T>, ? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return C11909g.m47494u(nVar, qVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47254e(@C12579k C11952u<? extends T> uVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @C11110f
    /* renamed from: f */
    public static final <T> Object m47255f(C11944n<? extends T> nVar, C11045c<? super Integer> cVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        C11322b0.m43482e(0);
        Object Y = C11909g.m47420Y(nVar, cVar);
        C11322b0.m43482e(1);
        return Y;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47256g(@C12579k C11952u<? extends T> uVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47257h(@C12579k C11944n<? extends T> nVar, @C12579k CoroutineContext coroutineContext) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: i */
    public static final CoroutineContext m47258i(@C12579k C11908f<?> fVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @C11587t0(expression = "currentCoroutineContext()", imports = {}))
    /* renamed from: j */
    public static /* synthetic */ void m47259j(C11908f fVar) {
    }

    /* renamed from: k */
    public static final boolean m47260k(@C12579k C11908f<?> fVar) {
        C11909g.m47436c1();
        throw new KotlinNothingValueException();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @C11587t0(expression = "currentCoroutineContext().isActive", imports = {}))
    /* renamed from: l */
    public static /* synthetic */ void m47261l(C11908f fVar) {
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C11110f
    /* renamed from: m */
    public static final <T> C11907e<T> m47262m(C11944n<? extends T> nVar, long j, C11304p<? super Throwable, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return C11909g.m47502w1(nVar, j, pVar);
    }

    /* renamed from: n */
    public static /* synthetic */ C11907e m47263n(C11944n nVar, long j, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pVar = new LintKt$retry$1((C11045c<? super LintKt$retry$1>) null);
        }
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return C11909g.m47502w1(nVar, j, pVar);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @C11587t0(expression = "this", imports = {}))
    @C11110f
    /* renamed from: o */
    public static final <T> C11907e<T> m47264o(C11944n<? extends T> nVar, C11306r<? super C11908f<? super T>, ? super Throwable, ? super Long, ? super C11045c<? super Boolean>, ? extends Object> rVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return C11909g.m47508y1(nVar, rVar);
    }

    @C11110f
    /* renamed from: p */
    public static final <T> Object m47265p(C11944n<? extends T> nVar, List<T> list, C11045c<?> cVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        C11322b0.m43482e(0);
        C11909g.m47422Y1(nVar, list, cVar);
        C11322b0.m43482e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @C11110f
    /* renamed from: q */
    public static final <T> Object m47266q(C11944n<? extends T> nVar, C11045c<? super List<? extends T>> cVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        C11322b0.m43482e(0);
        Object Z1 = FlowKt__CollectionKt.m47019c(nVar, (List) null, cVar, 1, (Object) null);
        C11322b0.m43482e(1);
        return Z1;
    }

    @C11110f
    /* renamed from: r */
    public static final <T> Object m47267r(C11944n<? extends T> nVar, Set<T> set, C11045c<?> cVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        C11322b0.m43482e(0);
        C11909g.m47429a2(nVar, set, cVar);
        C11322b0.m43482e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @C11110f
    /* renamed from: s */
    public static final <T> Object m47268s(C11944n<? extends T> nVar, C11045c<? super Set<? extends T>> cVar) {
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        C11322b0.m43482e(0);
        Object b2 = FlowKt__CollectionKt.m47021e(nVar, (Set) null, cVar, 1, (Object) null);
        C11322b0.m43482e(1);
        return b2;
    }
}
